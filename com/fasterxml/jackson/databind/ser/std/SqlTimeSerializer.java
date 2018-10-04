package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import java.lang.reflect.Type;
import java.sql.Time;

@JacksonStdImpl
public class SqlTimeSerializer extends StdScalarSerializer {
    public SqlTimeSerializer() {
        super(Time.class);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper = jsonFormatVisitorWrapper == null ? null : jsonFormatVisitorWrapper.expectStringFormat(javaType);
        if (jsonFormatVisitorWrapper != null) {
            jsonFormatVisitorWrapper.format(JsonValueFormat.DATE_TIME);
        }
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("string", true);
    }

    public void serialize(Time time, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeString(time.toString());
    }
}
