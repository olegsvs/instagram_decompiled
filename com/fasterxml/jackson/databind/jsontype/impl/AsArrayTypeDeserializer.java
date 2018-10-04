package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;

public class AsArrayTypeDeserializer extends TypeDeserializerBase implements Serializable {
    private static final long serialVersionUID = 5345570420394408290L;

    public AsArrayTypeDeserializer(JavaType javaType, TypeIdResolver typeIdResolver, String str, boolean z, Class cls) {
        super(javaType, typeIdResolver, str, z, cls);
    }

    public AsArrayTypeDeserializer(AsArrayTypeDeserializer asArrayTypeDeserializer, BeanProperty beanProperty) {
        super(asArrayTypeDeserializer, beanProperty);
    }

    private final Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        boolean isExpectedStartArrayToken = jsonParser.isExpectedStartArrayToken();
        String _locateTypeId = _locateTypeId(jsonParser, deserializationContext);
        JsonDeserializer _findDeserializer = _findDeserializer(deserializationContext, _locateTypeId);
        if (this._typeIdVisible && jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
            JsonGenerator tokenBuffer = new TokenBuffer(null);
            tokenBuffer.writeStartObject();
            tokenBuffer.writeFieldName(this._typePropertyName);
            tokenBuffer.writeString(_locateTypeId);
            jsonParser = JsonParserSequence.createFlattened(tokenBuffer.asParser(jsonParser), jsonParser);
            jsonParser.nextToken();
        }
        Object deserialize = _findDeserializer.deserialize(jsonParser, deserializationContext);
        if (isExpectedStartArrayToken) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (nextToken != jsonToken) {
                throw deserializationContext.wrongTokenException(jsonParser, jsonToken, "expected closing END_ARRAY after type information and deserialized value");
            }
        }
        return deserialize;
    }

    public final String _locateTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken jsonToken;
        StringBuilder stringBuilder;
        if (jsonParser.isExpectedStartArrayToken()) {
            if (jsonParser.nextToken() == JsonToken.VALUE_STRING) {
                String text = jsonParser.getText();
                jsonParser.nextToken();
                return text;
            } else if (this._defaultImpl == null) {
                jsonToken = JsonToken.VALUE_STRING;
                stringBuilder = new StringBuilder();
                stringBuilder.append("need JSON String that contains type id (for subtype of ");
                stringBuilder.append(baseTypeName());
                stringBuilder.append(")");
                throw deserializationContext.wrongTokenException(jsonParser, jsonToken, stringBuilder.toString());
            }
        } else if (this._defaultImpl == null) {
            jsonToken = JsonToken.START_ARRAY;
            stringBuilder = new StringBuilder();
            stringBuilder.append("need JSON Array to contain As.WRAPPER_ARRAY type information for class ");
            stringBuilder.append(baseTypeName());
            throw deserializationContext.wrongTokenException(jsonParser, jsonToken, stringBuilder.toString());
        }
        return this._idResolver.idFromBaseType();
    }

    public Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _deserialize(jsonParser, deserializationContext);
    }

    public Object deserializeTypedFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _deserialize(jsonParser, deserializationContext);
    }

    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _deserialize(jsonParser, deserializationContext);
    }

    public Object deserializeTypedFromScalar(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _deserialize(jsonParser, deserializationContext);
    }

    public TypeDeserializer forProperty(BeanProperty beanProperty) {
        if (beanProperty == this._property) {
            return this;
        }
        return new AsArrayTypeDeserializer(this, beanProperty);
    }

    public As getTypeInclusion() {
        return As.WRAPPER_ARRAY;
    }
}
