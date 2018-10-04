package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import java.util.Map;

public class AnyGetterWriter {
    public final AnnotatedMember _accessor;
    public final BeanProperty _property;
    public MapSerializer _serializer;

    public AnyGetterWriter(BeanProperty beanProperty, AnnotatedMember annotatedMember, MapSerializer mapSerializer) {
        this._accessor = annotatedMember;
        this._property = beanProperty;
        this._serializer = mapSerializer;
    }

    public void getAndSerialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Object value = this._accessor.getValue(obj);
        if (value != null) {
            if (value instanceof Map) {
                this._serializer.serializeFields((Map) value, jsonGenerator, serializerProvider);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Value returned by 'any-getter' (");
            stringBuilder.append(this._accessor.getName());
            stringBuilder.append("()) not java.util.Map but ");
            stringBuilder.append(value.getClass().getName());
            throw new JsonMappingException(stringBuilder.toString());
        }
    }

    public void resolve(SerializerProvider serializerProvider) {
        this._serializer = (MapSerializer) this._serializer.createContextual(serializerProvider, this._property);
    }
}
