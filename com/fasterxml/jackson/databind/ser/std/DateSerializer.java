package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.text.DateFormat;
import java.util.Date;

@JacksonStdImpl
public class DateSerializer extends DateTimeSerializerBase {
    public static final DateSerializer instance = new DateSerializer();

    public DateSerializer() {
        this(false, null);
    }

    public DateSerializer(boolean z, DateFormat dateFormat) {
        super(Date.class, z, dateFormat);
    }

    public long _timestamp(Date date) {
        return date == null ? 0 : date.getTime();
    }

    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (this._useTimestamp) {
            jsonGenerator.writeNumber(_timestamp(date));
        } else if (this._customFormat != null) {
            synchronized (this._customFormat) {
                jsonGenerator.writeString(this._customFormat.format(date));
            }
        } else {
            serializerProvider.defaultSerializeDateValue(date, jsonGenerator);
        }
    }

    public DateSerializer withFormat(boolean z, DateFormat dateFormat) {
        if (z) {
            return new DateSerializer(true, null);
        }
        return new DateSerializer(false, dateFormat);
    }
}
