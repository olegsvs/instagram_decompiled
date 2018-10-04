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

public class AsWrapperTypeDeserializer extends TypeDeserializerBase implements Serializable {
    private static final long serialVersionUID = 5345570420394408290L;

    public AsWrapperTypeDeserializer(JavaType javaType, TypeIdResolver typeIdResolver, String str, boolean z, Class cls) {
        super(javaType, typeIdResolver, str, z, null);
    }

    public AsWrapperTypeDeserializer(AsWrapperTypeDeserializer asWrapperTypeDeserializer, BeanProperty beanProperty) {
        super(asWrapperTypeDeserializer, beanProperty);
    }

    private final Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken jsonToken;
        StringBuilder stringBuilder;
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonToken = JsonToken.START_OBJECT;
            stringBuilder = new StringBuilder();
            stringBuilder.append("need JSON Object to contain As.WRAPPER_OBJECT type information for class ");
            stringBuilder.append(baseTypeName());
            throw deserializationContext.wrongTokenException(jsonParser, jsonToken, stringBuilder.toString());
        } else if (jsonParser.nextToken() == JsonToken.FIELD_NAME) {
            String text = jsonParser.getText();
            JsonDeserializer _findDeserializer = _findDeserializer(deserializationContext, text);
            jsonParser.nextToken();
            if (this._typeIdVisible && jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
                JsonGenerator tokenBuffer = new TokenBuffer(null);
                tokenBuffer.writeStartObject();
                tokenBuffer.writeFieldName(this._typePropertyName);
                tokenBuffer.writeString(text);
                jsonParser = JsonParserSequence.createFlattened(tokenBuffer.asParser(jsonParser), jsonParser);
                jsonParser.nextToken();
            }
            Object deserialize = _findDeserializer.deserialize(jsonParser, deserializationContext);
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken2 = JsonToken.END_OBJECT;
            if (nextToken == jsonToken2) {
                return deserialize;
            }
            throw deserializationContext.wrongTokenException(jsonParser, jsonToken2, "expected closing END_OBJECT after type information and deserialized value");
        } else {
            jsonToken = JsonToken.FIELD_NAME;
            stringBuilder = new StringBuilder();
            stringBuilder.append("need JSON String that contains type id (for subtype of ");
            stringBuilder.append(baseTypeName());
            stringBuilder.append(")");
            throw deserializationContext.wrongTokenException(jsonParser, jsonToken, stringBuilder.toString());
        }
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
        return new AsWrapperTypeDeserializer(this, beanProperty);
    }

    public As getTypeInclusion() {
        return As.WRAPPER_OBJECT;
    }
}
