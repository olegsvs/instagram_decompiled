package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonMappingException.Reference;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class BeanAsArraySerializer extends BeanSerializerBase {
    public final BeanSerializerBase _defaultSerializer;

    public BeanSerializerBase asArraySerializer() {
        return this;
    }

    public boolean isUnwrappingSerializer() {
        return false;
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase) {
        super(beanSerializerBase, (ObjectIdWriter) null);
        this._defaultSerializer = beanSerializerBase;
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase, String[] strArr) {
        super(beanSerializerBase, strArr);
        this._defaultSerializer = beanSerializerBase;
    }

    private boolean hasSingleElement(SerializerProvider serializerProvider) {
        BeanPropertyWriter[] beanPropertyWriterArr;
        if (this._filteredProps == null || serializerProvider.getActiveView() == null) {
            beanPropertyWriterArr = this._props;
        } else {
            beanPropertyWriterArr = this._filteredProps;
        }
        return beanPropertyWriterArr.length == 1;
    }

    public final void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && hasSingleElement(serializerProvider)) {
            serializeAsArray(obj, jsonGenerator, serializerProvider);
            return;
        }
        jsonGenerator.writeStartArray();
        serializeAsArray(obj, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndArray();
    }

    public final void serializeAsArray(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        BeanPropertyWriter[] beanPropertyWriterArr;
        if (this._filteredProps == null || serializerProvider.getActiveView() == null) {
            beanPropertyWriterArr = this._props;
        } else {
            beanPropertyWriterArr = this._filteredProps;
        }
        int i = 0;
        try {
            int length = beanPropertyWriterArr.length;
            while (i < length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
                if (beanPropertyWriter == null) {
                    jsonGenerator.writeNull();
                } else {
                    beanPropertyWriter.serializeAsColumn(obj, jsonGenerator, serializerProvider);
                }
                i++;
            }
        } catch (Throwable e) {
            wrapAndThrow(serializerProvider, e, obj, 0 == beanPropertyWriterArr.length ? "[anySetter]" : beanPropertyWriterArr[0].getName());
        } catch (Throwable e2) {
            JsonMappingException jsonMappingException = new JsonMappingException("Infinite recursion (StackOverflowError)", e2);
            jsonMappingException.prependPath(new Reference(obj, 0 == beanPropertyWriterArr.length ? "[anySetter]" : beanPropertyWriterArr[0].getName()));
            throw jsonMappingException;
        }
    }

    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        this._defaultSerializer.serializeWithType(obj, jsonGenerator, serializerProvider, typeSerializer);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BeanAsArraySerializer for ");
        stringBuilder.append(handledType().getName());
        return stringBuilder.toString();
    }

    public JsonSerializer unwrappingSerializer(NameTransformer nameTransformer) {
        return this._defaultSerializer.unwrappingSerializer(nameTransformer);
    }

    public BeanAsArraySerializer withIgnorals(String[] strArr) {
        return new BeanAsArraySerializer(this, strArr);
    }

    public BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectIdWriter) {
        return this._defaultSerializer.withObjectIdWriter(objectIdWriter);
    }
}
