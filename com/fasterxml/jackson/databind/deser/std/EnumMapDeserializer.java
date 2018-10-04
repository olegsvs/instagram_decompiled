package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.EnumMap;

public class EnumMapDeserializer extends StdDeserializer implements ContextualDeserializer {
    private static final long serialVersionUID = 1518773374647478964L;
    public final Class _enumClass;
    public JsonDeserializer _keyDeserializer;
    public final JavaType _mapType;
    public JsonDeserializer _valueDeserializer;
    public final TypeDeserializer _valueTypeDeserializer;

    public boolean isCachable() {
        return true;
    }

    public EnumMapDeserializer(JavaType javaType, JsonDeserializer jsonDeserializer, JsonDeserializer jsonDeserializer2) {
        this(javaType, jsonDeserializer, jsonDeserializer2, null);
    }

    public EnumMapDeserializer(JavaType javaType, JsonDeserializer jsonDeserializer, JsonDeserializer jsonDeserializer2, TypeDeserializer typeDeserializer) {
        super(EnumMap.class);
        this._mapType = javaType;
        this._enumClass = javaType.getKeyType().getRawClass();
        this._keyDeserializer = jsonDeserializer;
        this._valueDeserializer = jsonDeserializer2;
        this._valueTypeDeserializer = typeDeserializer;
    }

    private EnumMap constructMap() {
        return new EnumMap(this._enumClass);
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonDeserializer jsonDeserializer = this._keyDeserializer;
        if (jsonDeserializer == null) {
            jsonDeserializer = deserializationContext.findContextualValueDeserializer(this._mapType.getKeyType(), beanProperty);
        }
        JsonDeserializer jsonDeserializer2 = this._valueDeserializer;
        if (jsonDeserializer2 == null) {
            jsonDeserializer2 = deserializationContext.findContextualValueDeserializer(this._mapType.getContentType(), beanProperty);
        } else if (jsonDeserializer2 instanceof ContextualDeserializer) {
            jsonDeserializer2 = ((ContextualDeserializer) jsonDeserializer2).createContextual(deserializationContext, beanProperty);
        }
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (typeDeserializer != null) {
            typeDeserializer = typeDeserializer.forProperty(beanProperty);
        }
        return withResolved(jsonDeserializer, jsonDeserializer2, typeDeserializer);
    }

    public java.util.EnumMap deserialize(com.fasterxml.jackson.core.JsonParser r8, com.fasterxml.jackson.databind.DeserializationContext r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r1 = r8.getCurrentToken();
        r0 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
        if (r1 != r0) goto L_0x005e;
    L_0x0008:
        r6 = r7.constructMap();
        r5 = r7._valueDeserializer;
        r4 = r7._valueTypeDeserializer;
    L_0x0010:
        r1 = r8.nextToken();
        r0 = com.fasterxml.jackson.core.JsonToken.END_OBJECT;
        if (r1 == r0) goto L_0x005d;
    L_0x0018:
        r0 = r7._keyDeserializer;
        r3 = r0.deserialize(r8, r9);
        r3 = (java.lang.Enum) r3;
        r2 = 0;
        if (r3 != 0) goto L_0x0045;
    L_0x0023:
        r0 = com.fasterxml.jackson.databind.DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL;
        r0 = r9.isEnabled(r0);
        if (r0 != 0) goto L_0x003e;
    L_0x002b:
        r0 = r8.hasCurrentToken();	 Catch:{ Exception -> 0x0035 }
        if (r0 == 0) goto L_0x0035;	 Catch:{ Exception -> 0x0035 }
    L_0x0031:
        r2 = r8.getText();	 Catch:{ Exception -> 0x0035 }
    L_0x0035:
        r1 = r7._enumClass;
        r0 = "value not one of declared Enum instance names";
        r0 = r9.weirdStringException(r2, r1, r0);
        throw r0;
    L_0x003e:
        r8.nextToken();
        r8.skipChildren();
        goto L_0x0010;
    L_0x0045:
        r1 = r8.nextToken();
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
        if (r1 != r0) goto L_0x004e;
    L_0x004d:
        goto L_0x0059;
    L_0x004e:
        if (r4 != 0) goto L_0x0055;
    L_0x0050:
        r2 = r5.deserialize(r8, r9);
        goto L_0x0059;
    L_0x0055:
        r2 = r5.deserializeWithType(r8, r9, r4);
    L_0x0059:
        r6.put(r3, r2);
        goto L_0x0010;
    L_0x005d:
        return r6;
    L_0x005e:
        r0 = java.util.EnumMap.class;
        r0 = r9.mappingException(r0);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):java.util.EnumMap");
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    public EnumMapDeserializer withResolved(JsonDeserializer jsonDeserializer, JsonDeserializer jsonDeserializer2) {
        return withResolved(jsonDeserializer, jsonDeserializer2, null);
    }

    public EnumMapDeserializer withResolved(JsonDeserializer jsonDeserializer, JsonDeserializer jsonDeserializer2, TypeDeserializer typeDeserializer) {
        if (jsonDeserializer == this._keyDeserializer && jsonDeserializer2 == this._valueDeserializer && typeDeserializer == this._valueTypeDeserializer) {
            return this;
        }
        return new EnumMapDeserializer(this._mapType, jsonDeserializer, jsonDeserializer2, this._valueTypeDeserializer);
    }
}
