package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.File;

public class JdkDeserializers$FileDeserializer extends FromStringDeserializer {
    public static final JdkDeserializers$FileDeserializer instance = new JdkDeserializers$FileDeserializer();

    public JdkDeserializers$FileDeserializer() {
        super(File.class);
    }

    public File _deserialize(String str, DeserializationContext deserializationContext) {
        return new File(str);
    }
}
