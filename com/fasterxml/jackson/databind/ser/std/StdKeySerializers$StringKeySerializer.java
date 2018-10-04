package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;

public class StdKeySerializers$StringKeySerializer extends StdSerializer {
    public StdKeySerializers$StringKeySerializer() {
        super(String.class);
    }

    public void serialize(String str, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeFieldName(str);
    }
}
