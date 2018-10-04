package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.text.DateFormat;
import java.util.Date;

public class DateDeserializers$DateDeserializer extends DateDeserializers$DateBasedDeserializer {
    public static final DateDeserializers$DateDeserializer instance = new DateDeserializers$DateDeserializer();

    public DateDeserializers$DateDeserializer() {
        super(Date.class);
    }

    public DateDeserializers$DateDeserializer(DateDeserializers$DateDeserializer dateDeserializers$DateDeserializer, DateFormat dateFormat, String str) {
        super(dateDeserializers$DateDeserializer, dateFormat, str);
    }

    public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _parseDate(jsonParser, deserializationContext);
    }

    public DateDeserializers$DateDeserializer withDateFormat(DateFormat dateFormat, String str) {
        return new DateDeserializers$DateDeserializer(this, dateFormat, str);
    }
}
