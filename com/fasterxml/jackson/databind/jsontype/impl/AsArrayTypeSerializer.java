package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;

public class AsArrayTypeSerializer extends TypeSerializerBase {
    public AsArrayTypeSerializer(TypeIdResolver typeIdResolver, BeanProperty beanProperty) {
        super(typeIdResolver, beanProperty);
    }

    public AsArrayTypeSerializer forProperty(BeanProperty beanProperty) {
        if (this._property == beanProperty) {
            return this;
        }
        return new AsArrayTypeSerializer(this._idResolver, beanProperty);
    }

    public As getTypeInclusion() {
        return As.WRAPPER_ARRAY;
    }

    public void writeCustomTypePrefixForArray(Object obj, JsonGenerator jsonGenerator, String str) {
        jsonGenerator.writeStartArray();
        jsonGenerator.writeString(str);
        jsonGenerator.writeStartArray();
    }

    public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, String str) {
        jsonGenerator.writeStartArray();
        jsonGenerator.writeString(str);
        jsonGenerator.writeStartObject();
    }

    public void writeCustomTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator, String str) {
        jsonGenerator.writeStartArray();
        jsonGenerator.writeString(str);
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
        jsonGenerator.writeStartArray();
        jsonGenerator.writeString(idFromValue(obj));
        jsonGenerator.writeStartArray();
    }

    public void writeTypePrefixForArray(Object obj, JsonGenerator jsonGenerator, Class cls) {
        jsonGenerator.writeStartArray();
        jsonGenerator.writeString(idFromValueAndType(obj, cls));
        jsonGenerator.writeStartArray();
    }

    public void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator) {
        jsonGenerator.writeStartArray();
        jsonGenerator.writeString(idFromValue(obj));
        jsonGenerator.writeStartObject();
    }

    public void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, Class cls) {
        jsonGenerator.writeStartArray();
        jsonGenerator.writeString(idFromValueAndType(obj, cls));
        jsonGenerator.writeStartObject();
    }

    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator) {
        jsonGenerator.writeStartArray();
        jsonGenerator.writeString(idFromValue(obj));
    }

    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator, Class cls) {
        jsonGenerator.writeStartArray();
        jsonGenerator.writeString(idFromValueAndType(obj, cls));
    }

    public void writeTypeSuffixForArray(Object obj, JsonGenerator jsonGenerator) {
        jsonGenerator.writeEndArray();
        jsonGenerator.writeEndArray();
    }

    public void writeTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator) {
        jsonGenerator.writeEndObject();
        jsonGenerator.writeEndArray();
    }

    public void writeTypeSuffixForScalar(Object obj, JsonGenerator jsonGenerator) {
        jsonGenerator.writeEndArray();
    }
}
