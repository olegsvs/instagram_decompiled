package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import java.util.TimeZone;

public class DateDeserializers$TimeZoneDeserializer extends FromStringDeserializer {
    public static final DateDeserializers$TimeZoneDeserializer instance = new DateDeserializers$TimeZoneDeserializer();

    public DateDeserializers$TimeZoneDeserializer() {
        super(TimeZone.class);
    }

    public TimeZone _deserialize(String str, DeserializationContext deserializationContext) {
        return TimeZone.getTimeZone(str);
    }
}
