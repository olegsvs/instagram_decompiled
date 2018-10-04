package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.Deserializers$Base;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

public class CoreXMLDeserializers extends Deserializers$Base {
    public static final DatatypeFactory _dataTypeFactory;

    public class GregorianCalendarDeserializer extends StdScalarDeserializer {
        public static final GregorianCalendarDeserializer instance = new GregorianCalendarDeserializer();
        private static final long serialVersionUID = 1;

        public GregorianCalendarDeserializer() {
            super(XMLGregorianCalendar.class);
        }

        public XMLGregorianCalendar deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            Date _parseDate = _parseDate(jsonParser, deserializationContext);
            if (_parseDate == null) {
                return null;
            }
            jsonParser = new GregorianCalendar();
            jsonParser.setTime(_parseDate);
            TimeZone timeZone = deserializationContext.getTimeZone();
            if (timeZone != null) {
                jsonParser.setTimeZone(timeZone);
            }
            return CoreXMLDeserializers._dataTypeFactory.newXMLGregorianCalendar(jsonParser);
        }
    }

    public class DurationDeserializer extends FromStringDeserializer {
        public static final DurationDeserializer instance = new DurationDeserializer();
        private static final long serialVersionUID = 1;

        public DurationDeserializer() {
            super(Duration.class);
        }

        public Duration _deserialize(String str, DeserializationContext deserializationContext) {
            return CoreXMLDeserializers._dataTypeFactory.newDuration(str);
        }
    }

    public class QNameDeserializer extends FromStringDeserializer {
        public static final QNameDeserializer instance = new QNameDeserializer();
        private static final long serialVersionUID = 1;

        public QNameDeserializer() {
            super(QName.class);
        }

        public QName _deserialize(String str, DeserializationContext deserializationContext) {
            return QName.valueOf(str);
        }
    }

    static {
        try {
            _dataTypeFactory = DatatypeFactory.newInstance();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public JsonDeserializer findBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        javaType = javaType.getRawClass();
        if (javaType == QName.class) {
            return QNameDeserializer.instance;
        }
        if (javaType == XMLGregorianCalendar.class) {
            return GregorianCalendarDeserializer.instance;
        }
        return javaType == Duration.class ? DurationDeserializer.instance : null;
    }
}
