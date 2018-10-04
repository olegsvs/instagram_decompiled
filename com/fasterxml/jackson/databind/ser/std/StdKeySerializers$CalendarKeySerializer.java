package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.util.Calendar;

public class StdKeySerializers$CalendarKeySerializer extends StdSerializer {
    public static final JsonSerializer instance = new StdKeySerializers$CalendarKeySerializer();

    public StdKeySerializers$CalendarKeySerializer() {
        super(Calendar.class);
    }

    public void serialize(Calendar calendar, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        serializerProvider.defaultSerializeDateKey(calendar.getTimeInMillis(), jsonGenerator);
    }
}
