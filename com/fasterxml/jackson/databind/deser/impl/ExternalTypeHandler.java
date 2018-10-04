package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.util.ArrayList;
import java.util.HashMap;

public class ExternalTypeHandler {
    private final HashMap _nameToPropertyIndex;
    private final ExtTypedProperty[] _properties;
    private final TokenBuffer[] _tokens;
    private final String[] _typeIds;

    public class Builder {
        private final HashMap _nameToPropertyIndex = new HashMap();
        private final ArrayList _properties = new ArrayList();

        public void addExternal(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            Integer valueOf = Integer.valueOf(this._properties.size());
            this._properties.add(new ExtTypedProperty(settableBeanProperty, typeDeserializer));
            this._nameToPropertyIndex.put(settableBeanProperty.getName(), valueOf);
            this._nameToPropertyIndex.put(typeDeserializer.getPropertyName(), valueOf);
        }

        public ExternalTypeHandler build() {
            ArrayList arrayList = this._properties;
            return new ExternalTypeHandler((ExtTypedProperty[]) arrayList.toArray(new ExtTypedProperty[arrayList.size()]), this._nameToPropertyIndex, null, null);
        }
    }

    public final class ExtTypedProperty {
        private final SettableBeanProperty _property;
        private final TypeDeserializer _typeDeserializer;
        private final String _typePropertyName;

        public ExtTypedProperty(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            this._property = settableBeanProperty;
            this._typeDeserializer = typeDeserializer;
            this._typePropertyName = typeDeserializer.getPropertyName();
        }

        public String getDefaultTypeId() {
            Class defaultImpl = this._typeDeserializer.getDefaultImpl();
            if (defaultImpl == null) {
                return null;
            }
            return this._typeDeserializer.getTypeIdResolver().idFromValueAndType(null, defaultImpl);
        }

        public SettableBeanProperty getProperty() {
            return this._property;
        }

        public String getTypePropertyName() {
            return this._typePropertyName;
        }

        public boolean hasDefaultType() {
            return this._typeDeserializer.getDefaultImpl() != null;
        }

        public boolean hasTypePropertyName(String str) {
            return str.equals(this._typePropertyName);
        }
    }

    public ExternalTypeHandler(ExternalTypeHandler externalTypeHandler) {
        this._properties = externalTypeHandler._properties;
        this._nameToPropertyIndex = externalTypeHandler._nameToPropertyIndex;
        int length = this._properties.length;
        this._typeIds = new String[length];
        this._tokens = new TokenBuffer[length];
    }

    public ExternalTypeHandler(ExtTypedProperty[] extTypedPropertyArr, HashMap hashMap, String[] strArr, TokenBuffer[] tokenBufferArr) {
        this._properties = extTypedPropertyArr;
        this._nameToPropertyIndex = hashMap;
        this._typeIds = strArr;
        this._tokens = tokenBufferArr;
    }

    public final Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, int i, String str) {
        JsonGenerator tokenBuffer = new TokenBuffer(jsonParser.getCodec());
        tokenBuffer.writeStartArray();
        tokenBuffer.writeString(str);
        JsonParser asParser = this._tokens[i].asParser(jsonParser);
        asParser.nextToken();
        tokenBuffer.copyCurrentStructure(asParser);
        tokenBuffer.writeEndArray();
        JsonParser asParser2 = tokenBuffer.asParser(jsonParser);
        asParser2.nextToken();
        return this._properties[i].getProperty().deserialize(asParser2, deserializationContext);
    }

    public final void _deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, int i, String str) {
        JsonGenerator tokenBuffer = new TokenBuffer(jsonParser.getCodec());
        tokenBuffer.writeStartArray();
        tokenBuffer.writeString(str);
        JsonParser asParser = this._tokens[i].asParser(jsonParser);
        asParser.nextToken();
        tokenBuffer.copyCurrentStructure(asParser);
        tokenBuffer.writeEndArray();
        JsonParser asParser2 = tokenBuffer.asParser(jsonParser);
        asParser2.nextToken();
        this._properties[i].getProperty().deserializeAndSet(asParser2, deserializationContext, obj);
    }

    public Object complete(JsonParser jsonParser, DeserializationContext deserializationContext, PropertyValueBuffer propertyValueBuffer, PropertyBasedCreator propertyBasedCreator) {
        int length = this._properties.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            String str = this._typeIds[i];
            StringBuilder stringBuilder;
            if (str == null) {
                if (this._tokens[i] == null) {
                } else if (this._properties[i].hasDefaultType()) {
                    str = this._properties[i].getDefaultTypeId();
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Missing external type id property '");
                    stringBuilder.append(this._properties[i].getTypePropertyName());
                    stringBuilder.append("'");
                    throw deserializationContext.mappingException(stringBuilder.toString());
                }
            } else if (this._tokens[i] == null) {
                SettableBeanProperty property = this._properties[i].getProperty();
                stringBuilder = new StringBuilder();
                stringBuilder.append("Missing property '");
                stringBuilder.append(property.getName());
                stringBuilder.append("' for external type id '");
                stringBuilder.append(this._properties[i].getTypePropertyName());
                throw deserializationContext.mappingException(stringBuilder.toString());
            }
            objArr[i] = _deserialize(jsonParser, deserializationContext, i, str);
        }
        for (int i2 = 0; i2 < length; i2++) {
            SettableBeanProperty property2 = this._properties[i2].getProperty();
            if (propertyBasedCreator.findCreatorProperty(property2.getName()) != null) {
                propertyValueBuffer.assignParameter(property2.getCreatorIndex(), objArr[i2]);
            }
        }
        Object build = propertyBasedCreator.build(deserializationContext, propertyValueBuffer);
        for (int i3 = 0; i3 < length; i3++) {
            property2 = this._properties[i3].getProperty();
            if (propertyBasedCreator.findCreatorProperty(property2.getName()) == null) {
                property2.set(build, objArr[i3]);
            }
        }
        return build;
    }

    public Object complete(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        ExternalTypeHandler externalTypeHandler = this;
        int length = this._properties.length;
        int i = 0;
        while (true) {
            Object obj2 = obj;
            if (i >= length) {
                return obj;
            }
            String str = externalTypeHandler._typeIds[i];
            JsonParser jsonParser2 = jsonParser;
            DeserializationContext deserializationContext2 = deserializationContext;
            SettableBeanProperty property;
            StringBuilder stringBuilder;
            if (str == null) {
                TokenBuffer tokenBuffer = externalTypeHandler._tokens[i];
                if (tokenBuffer != null) {
                    JsonToken firstToken = tokenBuffer.firstToken();
                    if (firstToken != null && firstToken.isScalarValue()) {
                        JsonParser asParser = tokenBuffer.asParser(jsonParser);
                        asParser.nextToken();
                        property = externalTypeHandler._properties[i].getProperty();
                        Object deserializeIfNatural = TypeDeserializer.deserializeIfNatural(asParser, deserializationContext, property.getType());
                        if (deserializeIfNatural != null) {
                            property.set(obj, deserializeIfNatural);
                        } else if (externalTypeHandler._properties[i].hasDefaultType()) {
                            str = externalTypeHandler._properties[i].getDefaultTypeId();
                        } else {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Missing external type id property '");
                            stringBuilder.append(externalTypeHandler._properties[i].getTypePropertyName());
                            stringBuilder.append("'");
                            throw deserializationContext.mappingException(stringBuilder.toString());
                        }
                    }
                }
                i++;
            } else if (externalTypeHandler._tokens[i] == null) {
                property = externalTypeHandler._properties[i].getProperty();
                stringBuilder = new StringBuilder();
                stringBuilder.append("Missing property '");
                stringBuilder.append(property.getName());
                stringBuilder.append("' for external type id '");
                stringBuilder.append(externalTypeHandler._properties[i].getTypePropertyName());
                throw deserializationContext.mappingException(stringBuilder.toString());
            }
            _deserializeAndSet(jsonParser2, deserializationContext2, obj2, i, str);
            i++;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handlePropertyValue(com.fasterxml.jackson.core.JsonParser r9, com.fasterxml.jackson.databind.DeserializationContext r10, java.lang.String r11, java.lang.Object r12) {
        /*
        r8 = this;
        r4 = r8;
        r0 = r8._nameToPropertyIndex;
        r0 = r0.get(r11);
        r0 = (java.lang.Integer) r0;
        r3 = 0;
        if (r0 != 0) goto L_0x000d;
    L_0x000c:
        return r3;
    L_0x000d:
        r8 = r0.intValue();
        r0 = r4._properties;
        r0 = r0[r8];
        r0 = r0.hasTypePropertyName(r11);
        r2 = 1;
        r5 = r9;
        r7 = r12;
        if (r0 == 0) goto L_0x0033;
    L_0x001e:
        r1 = r4._typeIds;
        r0 = r9.getText();
        r1[r8] = r0;
        r9.skipChildren();
        if (r12 == 0) goto L_0x004c;
    L_0x002b:
        r0 = r4._tokens;
        r0 = r0[r8];
        if (r0 == 0) goto L_0x004c;
    L_0x0031:
        r3 = 1;
        goto L_0x004c;
    L_0x0033:
        r1 = new com.fasterxml.jackson.databind.util.TokenBuffer;
        r0 = r9.getCodec();
        r1.<init>(r0);
        r1.copyCurrentStructure(r9);
        r0 = r4._tokens;
        r0[r8] = r1;
        if (r12 == 0) goto L_0x004c;
    L_0x0045:
        r0 = r4._typeIds;
        r0 = r0[r8];
        if (r0 == 0) goto L_0x004c;
    L_0x004b:
        goto L_0x0031;
    L_0x004c:
        if (r3 == 0) goto L_0x005d;
    L_0x004e:
        r0 = r4._typeIds;
        r9 = r0[r8];
        r1 = 0;
        r0[r8] = r1;
        r6 = r10;
        r4._deserializeAndSet(r5, r6, r7, r8, r9);
        r0 = r4._tokens;
        r0[r8] = r1;
    L_0x005d:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Object):boolean");
    }

    public boolean handleTypePropertyValue(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) {
        ExternalTypeHandler externalTypeHandler = this;
        Integer num = (Integer) this._nameToPropertyIndex.get(str);
        boolean z = false;
        if (num != null) {
            int intValue = num.intValue();
            if (externalTypeHandler._properties[intValue].hasTypePropertyName(str)) {
                JsonParser jsonParser2 = jsonParser;
                jsonParser = jsonParser.getText();
                Object obj2 = obj;
                if (!(obj == null || externalTypeHandler._tokens[intValue] == null)) {
                    z = true;
                }
                if (z) {
                    _deserializeAndSet(jsonParser2, deserializationContext, obj2, intValue, jsonParser);
                    externalTypeHandler._tokens[intValue] = null;
                } else {
                    externalTypeHandler._typeIds[intValue] = jsonParser;
                }
                return true;
            }
        }
        return false;
    }

    public ExternalTypeHandler start() {
        return new ExternalTypeHandler(this);
    }
}
