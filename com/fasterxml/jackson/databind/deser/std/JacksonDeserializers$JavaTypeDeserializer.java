package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;

public class JacksonDeserializers$JavaTypeDeserializer extends StdScalarDeserializer {
    public static final JacksonDeserializers$JavaTypeDeserializer instance = new JacksonDeserializers$JavaTypeDeserializer();

    public JacksonDeserializers$JavaTypeDeserializer() {
        super(JavaType.class);
    }

    public JavaType deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_STRING) {
            String trim = jsonParser.getText().trim();
            if (trim.length() == 0) {
                return (JavaType) getEmptyValue();
            }
            return deserializationContext.getTypeFactory().constructFromCanonical(trim);
        } else if (currentToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
            return (JavaType) jsonParser.getEmbeddedObject();
        } else {
            throw deserializationContext.mappingException(this._valueClass);
        }
    }
}
