package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser$NumberType;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormatVisitor;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

public abstract class DateTimeSerializerBase extends StdScalarSerializer implements ContextualSerializer {
    public final DateFormat _customFormat;
    public final boolean _useTimestamp;

    public abstract long _timestamp(Object obj);

    public abstract void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    public abstract DateTimeSerializerBase withFormat(boolean z, DateFormat dateFormat);

    public DateTimeSerializerBase(Class cls, boolean z, DateFormat dateFormat) {
        super(cls);
        this._useTimestamp = z;
        this._customFormat = dateFormat;
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        boolean z = this._useTimestamp;
        if (!z && this._customFormat == null) {
            z = jsonFormatVisitorWrapper.getProvider().isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        JsonValueFormatVisitor expectIntegerFormat;
        if (z) {
            expectIntegerFormat = jsonFormatVisitorWrapper.expectIntegerFormat(javaType);
            if (expectIntegerFormat != null) {
                expectIntegerFormat.numberType(JsonParser$NumberType.LONG);
                expectIntegerFormat.format(JsonValueFormat.UTC_MILLISEC);
                return;
            }
            return;
        }
        expectIntegerFormat = jsonFormatVisitorWrapper.expectStringFormat(javaType);
        if (expectIntegerFormat != null) {
            expectIntegerFormat.format(JsonValueFormat.DATE_TIME);
        }
    }

    public JsonSerializer createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        if (beanProperty != null) {
            Value findFormat = serializerProvider.getAnnotationIntrospector().findFormat(beanProperty.getMember());
            if (findFormat != null) {
                if (findFormat.getShape().isNumeric()) {
                    return withFormat(true, null);
                }
                TimeZone timeZone = findFormat.getTimeZone();
                String pattern = findFormat.getPattern();
                DateFormat simpleDateFormat;
                if (pattern.length() > 0) {
                    Locale locale = findFormat.getLocale();
                    if (locale == null) {
                        locale = serializerProvider.getLocale();
                    }
                    simpleDateFormat = new SimpleDateFormat(pattern, locale);
                    if (timeZone == null) {
                        timeZone = serializerProvider.getTimeZone();
                    }
                    simpleDateFormat.setTimeZone(timeZone);
                    return withFormat(false, simpleDateFormat);
                } else if (timeZone != null) {
                    DateFormat dateFormat = serializerProvider.getConfig().getDateFormat();
                    if (dateFormat.getClass() == StdDateFormat.class) {
                        simpleDateFormat = StdDateFormat.getISO8601Format(timeZone);
                    } else {
                        simpleDateFormat = (DateFormat) dateFormat.clone();
                        simpleDateFormat.setTimeZone(timeZone);
                    }
                    return withFormat(false, simpleDateFormat);
                }
            }
        }
        return this;
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        boolean z = this._useTimestamp;
        if (!z && this._customFormat == null) {
            z = serializerProvider.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        return createSchemaNode(z ? "number" : "string", true);
    }

    public boolean isEmpty(Object obj) {
        if (obj != null) {
            if (_timestamp(obj) != 0) {
                return false;
            }
        }
        return true;
    }
}
