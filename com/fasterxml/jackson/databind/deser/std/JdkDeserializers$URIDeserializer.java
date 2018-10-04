package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import java.net.URI;

public class JdkDeserializers$URIDeserializer extends FromStringDeserializer {
    public static final JdkDeserializers$URIDeserializer instance = new JdkDeserializers$URIDeserializer();

    public JdkDeserializers$URIDeserializer() {
        super(URI.class);
    }

    public URI _deserialize(String str, DeserializationContext deserializationContext) {
        return URI.create(str);
    }
}
