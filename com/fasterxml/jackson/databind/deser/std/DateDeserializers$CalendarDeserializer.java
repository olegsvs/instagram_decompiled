package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

@JacksonStdImpl
public class DateDeserializers$CalendarDeserializer extends DateDeserializers$DateBasedDeserializer {
    public static final DateDeserializers$CalendarDeserializer gregorianInstance = new DateDeserializers$CalendarDeserializer(GregorianCalendar.class);
    public static final DateDeserializers$CalendarDeserializer instance = new DateDeserializers$CalendarDeserializer();
    public final Class _calendarClass;

    public DateDeserializers$CalendarDeserializer() {
        super(Calendar.class);
        this._calendarClass = null;
    }

    public DateDeserializers$CalendarDeserializer(DateDeserializers$CalendarDeserializer dateDeserializers$CalendarDeserializer, DateFormat dateFormat, String str) {
        super(dateDeserializers$CalendarDeserializer, dateFormat, str);
        this._calendarClass = dateDeserializers$CalendarDeserializer._calendarClass;
    }

    public DateDeserializers$CalendarDeserializer(Class cls) {
        super(cls);
        this._calendarClass = cls;
    }

    public Calendar deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Date _parseDate = _parseDate(jsonParser, deserializationContext);
        if (_parseDate == null) {
            return null;
        }
        Class cls = this._calendarClass;
        if (cls == null) {
            return deserializationContext.constructCalendar(_parseDate);
        }
        try {
            Calendar calendar = (Calendar) cls.newInstance();
            calendar.setTimeInMillis(_parseDate.getTime());
            TimeZone timeZone = deserializationContext.getTimeZone();
            if (timeZone != null) {
                calendar.setTimeZone(timeZone);
            }
            return calendar;
        } catch (Throwable e) {
            throw deserializationContext.instantiationException(this._calendarClass, e);
        }
    }

    public DateDeserializers$CalendarDeserializer withDateFormat(DateFormat dateFormat, String str) {
        return new DateDeserializers$CalendarDeserializer(this, dateFormat, str);
    }
}
