package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;

public class AsPropertyTypeSerializer extends AsArrayTypeSerializer {
    public final String _typePropertyName;

    public AsPropertyTypeSerializer(TypeIdResolver typeIdResolver, BeanProperty beanProperty, String str) {
        super(typeIdResolver, beanProperty);
        this._typePropertyName = str;
    }

    public AsPropertyTypeSerializer forProperty(BeanProperty beanProperty) {
        if (this._property == beanProperty) {
            return this;
        }
        return new AsPropertyTypeSerializer(this._idResolver, beanProperty, this._typePropertyName);
    }

    public String getPropertyName() {
        return this._typePropertyName;
    }

    public As getTypeInclusion() {
        return As.PROPERTY;
    }

    public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, String str) {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField(this._typePropertyName, str);
    }

    public void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator, String str) {
        jsonGenerator.writeEndObject();
    }

    public void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator) {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField(this._typePropertyName, idFromValue(obj));
    }

    public void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, Class cls) {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField(this._typePropertyName, idFromValueAndType(obj, cls));
    }

    public void writeTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator) {
        jsonGenerator.writeEndObject();
    }
}
