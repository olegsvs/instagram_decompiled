package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.Serializers$Base;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.lang.reflect.Type;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

public class CoreXMLSerializers extends Serializers$Base {

    public class XMLGregorianCalendarSerializer extends StdSerializer {
        public static final XMLGregorianCalendarSerializer instance = new XMLGregorianCalendarSerializer();

        public XMLGregorianCalendarSerializer() {
            super(XMLGregorianCalendar.class);
        }

        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
            CalendarSerializer.instance.acceptJsonFormatVisitor(jsonFormatVisitorWrapper, null);
        }

        public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
            return CalendarSerializer.instance.getSchema(serializerProvider, type);
        }

        public void serialize(XMLGregorianCalendar xMLGregorianCalendar, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            CalendarSerializer.instance.serialize(xMLGregorianCalendar.toGregorianCalendar(), jsonGenerator, serializerProvider);
        }
    }

    public JsonSerializer findSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription) {
        serializationConfig = javaType.getRawClass();
        if (!Duration.class.isAssignableFrom(serializationConfig)) {
            if (!QName.class.isAssignableFrom(serializationConfig)) {
                return XMLGregorianCalendar.class.isAssignableFrom(serializationConfig) ? XMLGregorianCalendarSerializer.instance : null;
            }
        }
        return ToStringSerializer.instance;
    }
}
