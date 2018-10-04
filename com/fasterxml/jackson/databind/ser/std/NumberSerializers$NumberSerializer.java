package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser$NumberType;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;

@JacksonStdImpl
public final class NumberSerializers$NumberSerializer extends StdScalarSerializer {
    public static final NumberSerializers$NumberSerializer instance = new NumberSerializers$NumberSerializer();

    public NumberSerializers$NumberSerializer() {
        super(Number.class);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper = jsonFormatVisitorWrapper.expectNumberFormat(javaType);
        if (jsonFormatVisitorWrapper != null) {
            jsonFormatVisitorWrapper.numberType(JsonParser$NumberType.BIG_DECIMAL);
        }
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("number", true);
    }

    public void serialize(Number number, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (number instanceof BigDecimal) {
            if (!serializerProvider.isEnabled(SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN) || (jsonGenerator instanceof TokenBuffer)) {
                jsonGenerator.writeNumber((BigDecimal) number);
            } else {
                jsonGenerator.writeNumber(((BigDecimal) number).toPlainString());
            }
        } else if (number instanceof BigInteger) {
            jsonGenerator.writeNumber((BigInteger) number);
        } else {
            if (!(number instanceof Integer)) {
                if (number instanceof Long) {
                    jsonGenerator.writeNumber(number.longValue());
                } else if (number instanceof Double) {
                    jsonGenerator.writeNumber(number.doubleValue());
                } else if (number instanceof Float) {
                    jsonGenerator.writeNumber(number.floatValue());
                } else if (!(number instanceof Byte)) {
                    if (!(number instanceof Short)) {
                        jsonGenerator.writeNumber(number.toString());
                    }
                }
            }
            jsonGenerator.writeNumber(number.intValue());
        }
    }
}
