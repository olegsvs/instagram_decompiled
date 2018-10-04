package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

public abstract class DateDeserializers$DateBasedDeserializer extends StdScalarDeserializer implements ContextualDeserializer {
    public final DateFormat _customFormat;
    public final String _formatString;

    public abstract DateDeserializers$DateBasedDeserializer withDateFormat(DateFormat dateFormat, String str);

    public DateDeserializers$DateBasedDeserializer(DateDeserializers$DateBasedDeserializer dateDeserializers$DateBasedDeserializer, DateFormat dateFormat, String str) {
        super(dateDeserializers$DateBasedDeserializer._valueClass);
        this._customFormat = dateFormat;
        this._formatString = str;
    }

    public DateDeserializers$DateBasedDeserializer(Class cls) {
        super(cls);
        this._customFormat = null;
        this._formatString = null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Date _parseDate(com.fasterxml.jackson.core.JsonParser r7, com.fasterxml.jackson.databind.DeserializationContext r8) {
        /*
        r6 = this;
        r0 = r6._customFormat;
        if (r0 == 0) goto L_0x005e;
    L_0x0004:
        r1 = r7.getCurrentToken();
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
        if (r1 != r0) goto L_0x005e;
    L_0x000c:
        r0 = r7.getText();
        r5 = r0.trim();
        r0 = r5.length();
        if (r0 != 0) goto L_0x0021;
    L_0x001a:
        r0 = r6.getEmptyValue();
        r0 = (java.util.Date) r0;
        return r0;
    L_0x0021:
        r4 = r6._customFormat;
        monitor-enter(r4);
        r0 = r6._customFormat;	 Catch:{ ParseException -> 0x002e }
        r0 = r0.parse(r5);	 Catch:{ ParseException -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002c }
        return r0;
    L_0x002c:
        r0 = move-exception;
        goto L_0x005c;
    L_0x002e:
        r3 = move-exception;
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x002c }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x002c }
        r1.<init>();	 Catch:{ all -> 0x002c }
        r0 = "Failed to parse Date value '";
        r1.append(r0);	 Catch:{ all -> 0x002c }
        r1.append(r5);	 Catch:{ all -> 0x002c }
        r0 = "' (format: \"";
        r1.append(r0);	 Catch:{ all -> 0x002c }
        r0 = r6._formatString;	 Catch:{ all -> 0x002c }
        r1.append(r0);	 Catch:{ all -> 0x002c }
        r0 = "\"): ";
        r1.append(r0);	 Catch:{ all -> 0x002c }
        r0 = r3.getMessage();	 Catch:{ all -> 0x002c }
        r1.append(r0);	 Catch:{ all -> 0x002c }
        r0 = r1.toString();	 Catch:{ all -> 0x002c }
        r2.<init>(r0);	 Catch:{ all -> 0x002c }
        throw r2;	 Catch:{ all -> 0x002c }
    L_0x005c:
        monitor-exit(r4);	 Catch:{ all -> 0x002c }
        throw r0;
    L_0x005e:
        r0 = super._parseDate(r7, r8);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateBasedDeserializer._parseDate(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):java.util.Date");
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        if (beanProperty != null) {
            Value findFormat = deserializationContext.getAnnotationIntrospector().findFormat(beanProperty.getMember());
            if (findFormat != null) {
                TimeZone timeZone = findFormat.getTimeZone();
                String pattern = findFormat.getPattern();
                DateFormat simpleDateFormat;
                if (pattern.length() > 0) {
                    Locale locale = findFormat.getLocale();
                    if (locale == null) {
                        locale = deserializationContext.getLocale();
                    }
                    simpleDateFormat = new SimpleDateFormat(pattern, locale);
                    if (timeZone == null) {
                        timeZone = deserializationContext.getTimeZone();
                    }
                    simpleDateFormat.setTimeZone(timeZone);
                    return withDateFormat(simpleDateFormat, pattern);
                } else if (timeZone != null) {
                    DateFormat dateFormat = deserializationContext.getConfig().getDateFormat();
                    if (dateFormat.getClass() == StdDateFormat.class) {
                        simpleDateFormat = ((StdDateFormat) dateFormat).withTimeZone(timeZone);
                    } else {
                        simpleDateFormat = (DateFormat) dateFormat.clone();
                        simpleDateFormat.setTimeZone(timeZone);
                    }
                    return withDateFormat(simpleDateFormat, pattern);
                }
            }
        }
        return this;
    }
}
