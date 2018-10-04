package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

public abstract class StdSerializer extends JsonSerializer implements SchemaAware, JsonFormatVisitable {
    public final Class _handledType;

    public abstract void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    public StdSerializer(JavaType javaType) {
        this._handledType = javaType.getRawClass();
    }

    public StdSerializer(Class cls) {
        this._handledType = cls;
    }

    public StdSerializer(Class cls, boolean z) {
        this._handledType = cls;
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper.expectAnyFormat(javaType);
    }

    public ObjectNode createObjectNode() {
        return JsonNodeFactory.instance.objectNode();
    }

    public ObjectNode createSchemaNode(String str) {
        ObjectNode createObjectNode = createObjectNode();
        createObjectNode.put("type", str);
        return createObjectNode;
    }

    public ObjectNode createSchemaNode(String str, boolean z) {
        str = createSchemaNode(str);
        if (!z) {
            str.put("required", z ^ 1);
        }
        return str;
    }

    public JsonSerializer findConvertingContentSerializer(SerializerProvider serializerProvider, BeanProperty beanProperty, JsonSerializer jsonSerializer) {
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        if (!(annotationIntrospector == null || beanProperty == null)) {
            Object findSerializationContentConverter = annotationIntrospector.findSerializationContentConverter(beanProperty.getMember());
            if (findSerializationContentConverter != null) {
                Converter converterInstance = serializerProvider.converterInstance(beanProperty.getMember(), findSerializationContentConverter);
                JavaType outputType = converterInstance.getOutputType(serializerProvider.getTypeFactory());
                if (jsonSerializer == null) {
                    jsonSerializer = serializerProvider.findValueSerializer(outputType, beanProperty);
                }
                return new StdDelegatingSerializer(converterInstance, outputType, jsonSerializer);
            }
        }
        return jsonSerializer;
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("string");
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type, boolean z) {
        ObjectNode objectNode = (ObjectNode) getSchema(serializerProvider, type);
        if (!z) {
            objectNode.put("required", z ^ 1);
        }
        return objectNode;
    }

    public Class handledType() {
        return this._handledType;
    }

    public boolean isDefaultSerializer(JsonSerializer jsonSerializer) {
        return (jsonSerializer == null || jsonSerializer.getClass().getAnnotation(JacksonStdImpl.class) == null) ? false : true;
    }

    public void wrapAndThrow(SerializerProvider serializerProvider, Throwable th, Object obj, int i) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (serializerProvider != null) {
            if (!serializerProvider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS)) {
                serializerProvider = null;
                if (th instanceof IOException) {
                    if (serializerProvider == null && (th instanceof RuntimeException)) {
                        throw ((RuntimeException) th);
                    }
                } else if (serializerProvider == null || !(th instanceof JsonMappingException)) {
                    throw ((IOException) th);
                }
                throw JsonMappingException.wrapWithPath(th, obj, i);
            }
        }
        serializerProvider = true;
        if (th instanceof IOException) {
            throw ((RuntimeException) th);
        }
        throw ((IOException) th);
        throw JsonMappingException.wrapWithPath(th, obj, i);
    }

    public void wrapAndThrow(SerializerProvider serializerProvider, Throwable th, Object obj, String str) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (serializerProvider != null) {
            if (!serializerProvider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS)) {
                serializerProvider = null;
                if (th instanceof IOException) {
                    if (serializerProvider == null && (th instanceof RuntimeException)) {
                        throw ((RuntimeException) th);
                    }
                } else if (serializerProvider == null || !(th instanceof JsonMappingException)) {
                    throw ((IOException) th);
                }
                throw JsonMappingException.wrapWithPath(th, obj, str);
            }
        }
        serializerProvider = true;
        if (th instanceof IOException) {
            throw ((RuntimeException) th);
        }
        throw ((IOException) th);
        throw JsonMappingException.wrapWithPath(th, obj, str);
    }
}
