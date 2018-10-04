package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.sql.Timestamp;
import java.text.DateFormat;

public class DateDeserializers$TimestampDeserializer extends DateDeserializers$DateBasedDeserializer {
    public static final DateDeserializers$TimestampDeserializer instance = new DateDeserializers$TimestampDeserializer();

    public DateDeserializers$TimestampDeserializer() {
        super(Timestamp.class);
    }

    public DateDeserializers$TimestampDeserializer(DateDeserializers$TimestampDeserializer dateDeserializers$TimestampDeserializer, DateFormat dateFormat, String str) {
        super(dateDeserializers$TimestampDeserializer, dateFormat, str);
    }

    public Timestamp deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return new Timestamp(_parseDate(jsonParser, deserializationContext).getTime());
    }

    public DateDeserializers$TimestampDeserializer withDateFormat(DateFormat dateFormat, String str) {
        return new DateDeserializers$TimestampDeserializer(this, dateFormat, str);
    }
}
