package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.Serializable;
import java.util.Map;

public class AbstractDeserializer extends JsonDeserializer implements Serializable {
    private static final long serialVersionUID = -3010349050434697698L;
    public final boolean _acceptBoolean;
    public final boolean _acceptDouble;
    public final boolean _acceptInt;
    public final boolean _acceptString;
    public final Map _backRefProperties;
    public final JavaType _baseType;
    public final ObjectIdReader _objectIdReader;

    public boolean isCachable() {
        return true;
    }

    public AbstractDeserializer(BeanDeserializerBuilder beanDeserializerBuilder, BeanDescription beanDescription, Map map) {
        boolean z;
        this._baseType = beanDescription.getType();
        this._objectIdReader = beanDeserializerBuilder.getObjectIdReader();
        this._backRefProperties = map;
        Class rawClass = this._baseType.getRawClass();
        this._acceptString = rawClass.isAssignableFrom(String.class);
        boolean z2 = false;
        if (rawClass != Boolean.TYPE) {
            if (!rawClass.isAssignableFrom(Boolean.class)) {
                z = false;
                this._acceptBoolean = z;
                if (rawClass != Integer.TYPE) {
                    if (rawClass.isAssignableFrom(Integer.class)) {
                        z = false;
                        this._acceptInt = z;
                        if (rawClass == Double.TYPE || rawClass.isAssignableFrom(Double.class)) {
                            z2 = true;
                        }
                        this._acceptDouble = z2;
                    }
                }
                z = true;
                this._acceptInt = z;
                z2 = true;
                this._acceptDouble = z2;
            }
        }
        z = true;
        this._acceptBoolean = z;
        if (rawClass != Integer.TYPE) {
            if (rawClass.isAssignableFrom(Integer.class)) {
                z = false;
                this._acceptInt = z;
                z2 = true;
                this._acceptDouble = z2;
            }
        }
        z = true;
        this._acceptInt = z;
        z2 = true;
        this._acceptDouble = z2;
    }

    public Object _deserializeFromObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) {
        jsonParser = this._objectIdReader.deserializer.deserialize(jsonParser, deserializationContext);
        Object obj = deserializationContext.findObjectId(jsonParser, this._objectIdReader.generator).item;
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not resolve Object Id [");
        stringBuilder.append(jsonParser);
        stringBuilder.append("] -- unresolved forward-reference?");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public Object _deserializeIfNatural(JsonParser jsonParser, DeserializationContext deserializationContext) {
        switch (AbstractDeserializer$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonParser.getCurrentToken().ordinal()]) {
            case 1:
                if (this._acceptString) {
                    return jsonParser.getText();
                }
                break;
            case 2:
                if (this._acceptInt) {
                    return Integer.valueOf(jsonParser.getIntValue());
                }
                break;
            case 3:
                if (this._acceptDouble) {
                    return Double.valueOf(jsonParser.getDoubleValue());
                }
                break;
            case 4:
                if (this._acceptBoolean) {
                    return Boolean.TRUE;
                }
                break;
            case 5:
                if (this._acceptBoolean) {
                    return Boolean.FALSE;
                }
                break;
            default:
                break;
        }
        return null;
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        throw deserializationContext.instantiationException(this._baseType.getRawClass(), "abstract types either need to be mapped to concrete types, have custom deserializer, or be instantiated with additional type information");
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        if (this._objectIdReader != null) {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken != null && currentToken.isScalarValue()) {
                return _deserializeFromObjectId(jsonParser, deserializationContext);
            }
        }
        Object _deserializeIfNatural = _deserializeIfNatural(jsonParser, deserializationContext);
        if (_deserializeIfNatural != null) {
            return _deserializeIfNatural;
        }
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    public SettableBeanProperty findBackReference(String str) {
        Map map = this._backRefProperties;
        return map == null ? null : (SettableBeanProperty) map.get(str);
    }

    public ObjectIdReader getObjectIdReader() {
        return this._objectIdReader;
    }
}
