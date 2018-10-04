package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.TimeZone;

public class DateDeserializers {
    private static final HashSet _classNames = new HashSet();

    static {
        r4 = new Class[6];
        int i = 0;
        r4[0] = Calendar.class;
        r4[1] = GregorianCalendar.class;
        r4[2] = Date.class;
        r4[3] = java.util.Date.class;
        r4[4] = Timestamp.class;
        r4[5] = TimeZone.class;
        int length = r4.length;
        while (i < length) {
            _classNames.add(r4[i].getName());
            i++;
        }
    }

    public static StdDeserializer[] all() {
        return new StdDeserializer[]{DateDeserializers$CalendarDeserializer.instance, DateDeserializers$DateDeserializer.instance, DateDeserializers$CalendarDeserializer.gregorianInstance, DateDeserializers$SqlDateDeserializer.instance, DateDeserializers$TimestampDeserializer.instance, DateDeserializers$TimeZoneDeserializer.instance};
    }

    public static JsonDeserializer find(Class cls, String str) {
        if (!_classNames.contains(str)) {
            return null;
        }
        if (cls == Calendar.class) {
            return DateDeserializers$CalendarDeserializer.instance;
        }
        if (cls == java.util.Date.class) {
            return DateDeserializers$DateDeserializer.instance;
        }
        if (cls == Date.class) {
            return DateDeserializers$SqlDateDeserializer.instance;
        }
        if (cls == Timestamp.class) {
            return DateDeserializers$TimestampDeserializer.instance;
        }
        if (cls == TimeZone.class) {
            return DateDeserializers$TimeZoneDeserializer.instance;
        }
        if (cls == GregorianCalendar.class) {
            return DateDeserializers$CalendarDeserializer.gregorianInstance;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Internal error: can't find deserializer for ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
