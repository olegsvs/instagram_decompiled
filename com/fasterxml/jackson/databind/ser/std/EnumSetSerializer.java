package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetSerializer extends AsArraySerializerBase {
    public EnumSetSerializer _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return this;
    }

    public EnumSetSerializer(JavaType javaType, BeanProperty beanProperty) {
        super(EnumSet.class, javaType, true, null, beanProperty, null);
    }

    public EnumSetSerializer(EnumSetSerializer enumSetSerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        super(enumSetSerializer, beanProperty, typeSerializer, jsonSerializer);
    }

    public boolean hasSingleElement(EnumSet enumSet) {
        return enumSet.size() == 1;
    }

    public boolean isEmpty(EnumSet enumSet) {
        if (enumSet != null) {
            if (!enumSet.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public void serializeContents(EnumSet enumSet, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        JsonSerializer jsonSerializer = this._elementSerializer;
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            Enum enumR = (Enum) it.next();
            if (jsonSerializer == null) {
                jsonSerializer = serializerProvider.findValueSerializer(enumR.getDeclaringClass(), this._property);
            }
            jsonSerializer.serialize(enumR, jsonGenerator, serializerProvider);
        }
    }

    public EnumSetSerializer withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        return new EnumSetSerializer(this, beanProperty, typeSerializer, jsonSerializer);
    }
}
