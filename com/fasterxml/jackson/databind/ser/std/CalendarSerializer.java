package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.text.DateFormat;
import java.util.Calendar;

@JacksonStdImpl
public class CalendarSerializer extends DateTimeSerializerBase {
    public static final CalendarSerializer instance = new CalendarSerializer();

    public CalendarSerializer() {
        this(false, null);
    }

    public CalendarSerializer(boolean z, DateFormat dateFormat) {
        super(Calendar.class, z, dateFormat);
    }

    public long _timestamp(Calendar calendar) {
        return calendar == null ? 0 : calendar.getTimeInMillis();
    }

    public void serialize(Calendar calendar, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (this._useTimestamp) {
            jsonGenerator.writeNumber(_timestamp(calendar));
        } else if (this._customFormat != null) {
            synchronized (this._customFormat) {
                jsonGenerator.writeString(this._customFormat.format(calendar));
            }
        } else {
            serializerProvider.defaultSerializeDateValue(calendar.getTime(), jsonGenerator);
        }
    }

    public CalendarSerializer withFormat(boolean z, DateFormat dateFormat) {
        if (z) {
            return new CalendarSerializer(true, null);
        }
        return new CalendarSerializer(false, dateFormat);
    }
}
