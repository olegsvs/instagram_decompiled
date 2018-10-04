package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import java.nio.charset.Charset;

public class JdkDeserializers$CharsetDeserializer extends FromStringDeserializer {
    public static final JdkDeserializers$CharsetDeserializer instance = new JdkDeserializers$CharsetDeserializer();

    public JdkDeserializers$CharsetDeserializer() {
        super(Charset.class);
    }

    public Charset _deserialize(String str, DeserializationContext deserializationContext) {
        return Charset.forName(str);
    }
}
