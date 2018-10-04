package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.util.Converter;
import java.lang.reflect.Type;

public class StdDelegatingSerializer extends StdSerializer implements ContextualSerializer, SchemaAware, ResolvableSerializer, JsonFormatVisitable {
    public final Converter _converter;
    public final JsonSerializer _delegateSerializer;
    public final JavaType _delegateType;

    public StdDelegatingSerializer(Converter converter) {
        super(Object.class);
        this._converter = converter;
        this._delegateType = null;
        this._delegateSerializer = null;
    }

    public StdDelegatingSerializer(Converter converter, JavaType javaType, JsonSerializer jsonSerializer) {
        super(javaType);
        this._converter = converter;
        this._delegateType = javaType;
        this._delegateSerializer = jsonSerializer;
    }

    public StdDelegatingSerializer(Class cls, Converter converter) {
        super(cls, false);
        this._converter = converter;
        this._delegateType = null;
        this._delegateSerializer = null;
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        this._delegateSerializer.acceptJsonFormatVisitor(jsonFormatVisitorWrapper, javaType);
    }

    public Object convertValue(Object obj) {
        return this._converter.convert(obj);
    }

    public JsonSerializer createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonSerializer jsonSerializer = this._delegateSerializer;
        if (jsonSerializer != null) {
            if (jsonSerializer instanceof ContextualSerializer) {
                JsonSerializer createContextual = ((ContextualSerializer) jsonSerializer).createContextual(serializerProvider, beanProperty);
                if (createContextual != this._delegateSerializer) {
                    return withDelegate(this._converter, this._delegateType, createContextual);
                }
            }
            return this;
        }
        JavaType javaType = this._delegateType;
        if (javaType == null) {
            javaType = this._converter.getOutputType(serializerProvider.getTypeFactory());
        }
        return withDelegate(this._converter, javaType, serializerProvider.findValueSerializer(javaType, beanProperty));
    }

    public Converter getConverter() {
        return this._converter;
    }

    public JsonSerializer getDelegatee() {
        return this._delegateSerializer;
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        JsonSerializer jsonSerializer = this._delegateSerializer;
        if (jsonSerializer instanceof SchemaAware) {
            return ((SchemaAware) jsonSerializer).getSchema(serializerProvider, type);
        }
        return super.getSchema(serializerProvider, type);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type, boolean z) {
        JsonSerializer jsonSerializer = this._delegateSerializer;
        if (jsonSerializer instanceof SchemaAware) {
            return ((SchemaAware) jsonSerializer).getSchema(serializerProvider, type, z);
        }
        return super.getSchema(serializerProvider, type);
    }

    public boolean isEmpty(Object obj) {
        return this._delegateSerializer.isEmpty(convertValue(obj));
    }

    public void resolve(SerializerProvider serializerProvider) {
        JsonSerializer jsonSerializer = this._delegateSerializer;
        if (jsonSerializer != null && (jsonSerializer instanceof ResolvableSerializer)) {
            ((ResolvableSerializer) jsonSerializer).resolve(serializerProvider);
        }
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        obj = convertValue(obj);
        if (obj == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
        } else {
            this._delegateSerializer.serialize(obj, jsonGenerator, serializerProvider);
        }
    }

    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        this._delegateSerializer.serializeWithType(convertValue(obj), jsonGenerator, serializerProvider, typeSerializer);
    }

    public StdDelegatingSerializer withDelegate(Converter converter, JavaType javaType, JsonSerializer jsonSerializer) {
        if (getClass() == StdDelegatingSerializer.class) {
            return new StdDelegatingSerializer(converter, javaType, jsonSerializer);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sub-class ");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(" must override 'withDelegate'");
        throw new IllegalStateException(stringBuilder.toString());
    }
}
