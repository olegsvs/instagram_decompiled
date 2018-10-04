package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public abstract class ContainerSerializer extends StdSerializer {
    public abstract ContainerSerializer _withValueTypeSerializer(TypeSerializer typeSerializer);

    public abstract JsonSerializer getContentSerializer();

    public abstract JavaType getContentType();

    public abstract boolean hasSingleElement(Object obj);

    public abstract boolean isEmpty(Object obj);

    public ContainerSerializer(ContainerSerializer containerSerializer) {
        super(containerSerializer._handledType, false);
    }

    public ContainerSerializer(Class cls) {
        super(cls);
    }

    public ContainerSerializer(Class cls, boolean z) {
        super(cls, z);
    }

    public boolean hasContentTypeAnnotation(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        if (beanProperty != null) {
            serializerProvider = serializerProvider.getAnnotationIntrospector();
            if (!(serializerProvider == null || serializerProvider.findSerializationContentType(beanProperty.getMember(), beanProperty.getType()) == null)) {
                return true;
            }
        }
        return false;
    }

    public ContainerSerializer withValueTypeSerializer(TypeSerializer typeSerializer) {
        return typeSerializer == null ? this : _withValueTypeSerializer(typeSerializer);
    }
}
