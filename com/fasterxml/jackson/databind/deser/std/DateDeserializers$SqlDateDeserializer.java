package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.sql.Date;
import java.text.DateFormat;

public class DateDeserializers$SqlDateDeserializer extends DateDeserializers$DateBasedDeserializer {
    public static final DateDeserializers$SqlDateDeserializer instance = new DateDeserializers$SqlDateDeserializer();

    public DateDeserializers$SqlDateDeserializer() {
        super(Date.class);
    }

    public DateDeserializers$SqlDateDeserializer(DateDeserializers$SqlDateDeserializer dateDeserializers$SqlDateDeserializer, DateFormat dateFormat, String str) {
        super(dateDeserializers$SqlDateDeserializer, dateFormat, str);
    }

    public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        java.util.Date _parseDate = _parseDate(jsonParser, deserializationContext);
        if (_parseDate == null) {
            return null;
        }
        return new Date(_parseDate.getTime());
    }

    public DateDeserializers$SqlDateDeserializer withDateFormat(DateFormat dateFormat, String str) {
        return new DateDeserializers$SqlDateDeserializer(this, dateFormat, str);
    }
}
