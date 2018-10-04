package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;

public class AsWrapperTypeSerializer extends TypeSerializerBase {
    public AsWrapperTypeSerializer(TypeIdResolver typeIdResolver, BeanProperty beanProperty) {
        super(typeIdResolver, beanProperty);
    }

    public AsWrapperTypeSerializer forProperty(BeanProperty beanProperty) {
        if (this._property == beanProperty) {
            return this;
        }
        return new AsWrapperTypeSerializer(this._idResolver, beanProperty);
    }

    public As getTypeInclusion() {
        return As.WRAPPER_OBJECT;
    }

    public void writeCustomTypePrefixForArray(Object obj, JsonGenerator jsonGenerator, String str) {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeArrayFieldStart(str);
    }

    public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, String str) {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeObjectFieldStart(str);
    }

    public void writeCustomTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator, String str) {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeFieldName(str);
    }

    public void writeCustomTypeSuffixForArray(Object obj, JsonGenerator jsonGenerator, String str) {
        writeTypeSuffixForArray(obj, jsonGenerator);
    }

    public void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator, String str) {
        writeTypeSuffixForObject(obj, jsonGenerator);
    }

    public void writeCustomTypeSuffixForScalar(Object obj, JsonGenerator jsonGenerator, String str) {
        writeTypeSuffixForScalar(obj, jsonGenerator);
    }

    public void writeTypePrefixForArray(Object obj, JsonGenerator jsonGenerator) {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeArrayFieldStart(idFromValue(obj));
    }

    public void writeTypePrefixForArray(Object obj, JsonGenerator jsonGenerator, Class cls) {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeArrayFieldStart(idFromValueAndType(obj, cls));
    }

    public void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator) {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeObjectFieldStart(idFromValue(obj));
    }

    public void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, Class cls) {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeObjectFieldStart(idFromValueAndType(obj, cls));
    }

    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator) {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeFieldName(idFromValue(obj));
    }

    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator, Class cls) {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeFieldName(idFromValueAndType(obj, cls));
    }

    public void writeTypeSuffixForArray(Object obj, JsonGenerator jsonGenerator) {
        jsonGenerator.writeEndArray();
        jsonGenerator.writeEndObject();
    }

    public void writeTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator) {
        jsonGenerator.writeEndObject();
        jsonGenerator.writeEndObject();
    }

    public void writeTypeSuffixForScalar(Object obj, JsonGenerator jsonGenerator) {
        jsonGenerator.writeEndObject();
    }
}
