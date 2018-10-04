package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import java.net.URL;

public class JdkDeserializers$URLDeserializer extends FromStringDeserializer {
    public static final JdkDeserializers$URLDeserializer instance = new JdkDeserializers$URLDeserializer();

    public JdkDeserializers$URLDeserializer() {
        super(URL.class);
    }

    public URL _deserialize(String str, DeserializationContext deserializationContext) {
        return new URL(str);
    }
}
