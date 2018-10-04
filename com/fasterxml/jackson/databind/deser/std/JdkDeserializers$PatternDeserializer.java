package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import java.util.regex.Pattern;

public class JdkDeserializers$PatternDeserializer extends FromStringDeserializer {
    public static final JdkDeserializers$PatternDeserializer instance = new JdkDeserializers$PatternDeserializer();

    public JdkDeserializers$PatternDeserializer() {
        super(Pattern.class);
    }

    public Pattern _deserialize(String str, DeserializationContext deserializationContext) {
        return Pattern.compile(str);
    }
}
