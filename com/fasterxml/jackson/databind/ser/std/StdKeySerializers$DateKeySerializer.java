package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.util.Date;

public class StdKeySerializers$DateKeySerializer extends StdSerializer {
    public static final JsonSerializer instance = new StdKeySerializers$DateKeySerializer();

    public StdKeySerializers$DateKeySerializer() {
        super(Date.class);
    }

    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        serializerProvider.defaultSerializeDateKey(date, jsonGenerator);
    }
}
