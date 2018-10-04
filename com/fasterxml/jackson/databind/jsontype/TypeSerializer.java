package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;

public abstract class TypeSerializer {
    public abstract TypeSerializer forProperty(BeanProperty beanProperty);

    public abstract String getPropertyName();

    public abstract TypeIdResolver getTypeIdResolver();

    public abstract As getTypeInclusion();

    public abstract void writeCustomTypePrefixForArray(Object obj, JsonGenerator jsonGenerator, String str);

    public abstract void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, String str);

    public abstract void writeCustomTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator, String str);

    public abstract void writeCustomTypeSuffixForArray(Object obj, JsonGenerator jsonGenerator, String str);

    public abstract void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator, String str);

    public abstract void writeCustomTypeSuffixForScalar(Object obj, JsonGenerator jsonGenerator, String str);

    public abstract void writeTypePrefixForArray(Object obj, JsonGenerator jsonGenerator);

    public abstract void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator);

    public abstract void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator);

    public abstract void writeTypeSuffixForArray(Object obj, JsonGenerator jsonGenerator);

    public abstract void writeTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator);

    public abstract void writeTypeSuffixForScalar(Object obj, JsonGenerator jsonGenerator);

    public void writeTypePrefixForArray(Object obj, JsonGenerator jsonGenerator, Class cls) {
        writeTypePrefixForArray(obj, jsonGenerator);
    }

    public void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, Class cls) {
        writeTypePrefixForObject(obj, jsonGenerator);
    }

    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator, Class cls) {
        writeTypePrefixForScalar(obj, jsonGenerator);
    }
}
