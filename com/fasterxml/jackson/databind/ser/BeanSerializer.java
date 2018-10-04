package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class BeanSerializer extends BeanSerializerBase {
    public BeanSerializer(JavaType javaType, BeanSerializerBuilder beanSerializerBuilder, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(javaType, beanSerializerBuilder, beanPropertyWriterArr, beanPropertyWriterArr2);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase) {
        super(beanSerializerBase);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, ObjectIdWriter objectIdWriter) {
        super(beanSerializerBase, objectIdWriter);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, String[] strArr) {
        super(beanSerializerBase, strArr);
    }

    public BeanSerializerBase asArraySerializer() {
        return (this._objectIdWriter == null && this._anyGetterWriter == null && this._propertyFilterId == null) ? new BeanAsArraySerializer(this) : this;
    }

    public static BeanSerializer createDummy(JavaType javaType) {
        return new BeanSerializer(javaType, null, BeanSerializerBase.NO_PROPS, null);
    }

    public final void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (this._objectIdWriter != null) {
            _serializeWithObjectId(obj, jsonGenerator, serializerProvider, true);
            return;
        }
        jsonGenerator.writeStartObject();
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, serializerProvider);
        } else {
            serializeFields(obj, jsonGenerator, serializerProvider);
        }
        jsonGenerator.writeEndObject();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BeanSerializer for ");
        stringBuilder.append(handledType().getName());
        return stringBuilder.toString();
    }

    public JsonSerializer unwrappingSerializer(NameTransformer nameTransformer) {
        return new UnwrappingBeanSerializer((BeanSerializerBase) this, nameTransformer);
    }

    public BeanSerializer withIgnorals(String[] strArr) {
        return new BeanSerializer((BeanSerializerBase) this, strArr);
    }

    public BeanSerializer withObjectIdWriter(ObjectIdWriter objectIdWriter) {
        return new BeanSerializer((BeanSerializerBase) this, objectIdWriter);
    }
}
