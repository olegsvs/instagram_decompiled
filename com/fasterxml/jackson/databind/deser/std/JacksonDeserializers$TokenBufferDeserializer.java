package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.util.TokenBuffer;

@JacksonStdImpl
public class JacksonDeserializers$TokenBufferDeserializer extends StdScalarDeserializer {
    public static final JacksonDeserializers$TokenBufferDeserializer instance = new JacksonDeserializers$TokenBufferDeserializer();

    public JacksonDeserializers$TokenBufferDeserializer() {
        super(TokenBuffer.class);
    }

    public TokenBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonGenerator tokenBuffer = new TokenBuffer(jsonParser.getCodec());
        tokenBuffer.copyCurrentStructure(jsonParser);
        return tokenBuffer;
    }
}
