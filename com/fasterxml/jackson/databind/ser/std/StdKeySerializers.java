package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Calendar;
import java.util.Date;

public class StdKeySerializers {
    public static final JsonSerializer DEFAULT_KEY_SERIALIZER = new StdKeySerializer();
    public static final JsonSerializer DEFAULT_STRING_SERIALIZER = new StdKeySerializers$StringKeySerializer();

    private StdKeySerializers() {
    }

    public static JsonSerializer getStdKeySerializer(JavaType javaType) {
        if (javaType != null) {
            javaType = javaType.getRawClass();
            if (javaType == String.class) {
                return DEFAULT_STRING_SERIALIZER;
            }
            if (javaType != Object.class) {
                if (Date.class.isAssignableFrom(javaType)) {
                    return StdKeySerializers$DateKeySerializer.instance;
                }
                if (Calendar.class.isAssignableFrom(javaType)) {
                    return StdKeySerializers$CalendarKeySerializer.instance;
                }
            }
        }
        return DEFAULT_KEY_SERIALIZER;
    }
}
