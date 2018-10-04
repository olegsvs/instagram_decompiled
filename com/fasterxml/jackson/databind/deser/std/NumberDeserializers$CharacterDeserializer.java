package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public final class NumberDeserializers$CharacterDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$CharacterDeserializer primitiveInstance = new NumberDeserializers$CharacterDeserializer(Character.class, Character.valueOf('\u0000'));
    private static final long serialVersionUID = 1;
    public static final NumberDeserializers$CharacterDeserializer wrapperInstance = new NumberDeserializers$CharacterDeserializer(Character.TYPE, null);

    public NumberDeserializers$CharacterDeserializer(Class cls, Character ch) {
        super(cls, ch);
    }

    public Character deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NUMBER_INT) {
            int intValue = jsonParser.getIntValue();
            if (intValue >= 0 && intValue <= 65535) {
                return Character.valueOf((char) intValue);
            }
        } else if (currentToken == JsonToken.VALUE_STRING) {
            String text = jsonParser.getText();
            if (text.length() == 1) {
                return Character.valueOf(text.charAt(0));
            }
            if (text.length() == 0) {
                return (Character) getEmptyValue();
            }
        }
        throw deserializationContext.mappingException(this._valueClass, currentToken);
    }
}
