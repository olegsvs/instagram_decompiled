package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class UnwrappingBeanSerializer extends BeanSerializerBase {
    public final NameTransformer _nameTransformer;

    public BeanSerializerBase asArraySerializer() {
        return this;
    }

    public boolean isUnwrappingSerializer() {
        return true;
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, ObjectIdWriter objectIdWriter) {
        super((BeanSerializerBase) unwrappingBeanSerializer, objectIdWriter);
        this._nameTransformer = unwrappingBeanSerializer._nameTransformer;
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, String[] strArr) {
        super((BeanSerializerBase) unwrappingBeanSerializer, strArr);
        this._nameTransformer = unwrappingBeanSerializer._nameTransformer;
    }

    public UnwrappingBeanSerializer(BeanSerializerBase beanSerializerBase, NameTransformer nameTransformer) {
        super(beanSerializerBase, nameTransformer);
        this._nameTransformer = nameTransformer;
    }

    public final void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (this._objectIdWriter != null) {
            _serializeWithObjectId(obj, jsonGenerator, serializerProvider, false);
            return;
        }
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, serializerProvider);
        } else {
            serializeFields(obj, jsonGenerator, serializerProvider);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UnwrappingBeanSerializer for ");
        stringBuilder.append(handledType().getName());
        return stringBuilder.toString();
    }

    public JsonSerializer unwrappingSerializer(NameTransformer nameTransformer) {
        return new UnwrappingBeanSerializer((BeanSerializerBase) this, nameTransformer);
    }

    public UnwrappingBeanSerializer withIgnorals(String[] strArr) {
        return new UnwrappingBeanSerializer(this, strArr);
    }

    public UnwrappingBeanSerializer withObjectIdWriter(ObjectIdWriter objectIdWriter) {
        return new UnwrappingBeanSerializer(this, objectIdWriter);
    }
}
