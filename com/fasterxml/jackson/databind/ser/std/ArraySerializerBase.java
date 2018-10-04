package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;

public abstract class ArraySerializerBase extends ContainerSerializer {
    public final BeanProperty _property;

    public abstract void serializeContents(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    public ArraySerializerBase(ArraySerializerBase arraySerializerBase) {
        super(arraySerializerBase._handledType, false);
        this._property = arraySerializerBase._property;
    }

    public ArraySerializerBase(ArraySerializerBase arraySerializerBase, BeanProperty beanProperty) {
        super(arraySerializerBase._handledType, false);
        this._property = beanProperty;
    }

    public ArraySerializerBase(Class cls) {
        super(cls);
        this._property = null;
    }

    public ArraySerializerBase(Class cls, BeanProperty beanProperty) {
        super(cls);
        this._property = beanProperty;
    }

    public final void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && hasSingleElement(obj)) {
            serializeContents(obj, jsonGenerator, serializerProvider);
            return;
        }
        jsonGenerator.writeStartArray();
        serializeContents(obj, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndArray();
    }

    public final void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        typeSerializer.writeTypePrefixForArray(obj, jsonGenerator);
        serializeContents(obj, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffixForArray(obj, jsonGenerator);
    }
}
