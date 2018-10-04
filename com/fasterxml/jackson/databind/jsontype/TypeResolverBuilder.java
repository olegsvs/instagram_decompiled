package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import java.util.Collection;

public interface TypeResolverBuilder {
    TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection collection);

    TypeSerializer buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection collection);

    TypeResolverBuilder defaultImpl(Class cls);

    Class getDefaultImpl();

    TypeResolverBuilder inclusion(As as);

    TypeResolverBuilder init(Id id, TypeIdResolver typeIdResolver);

    TypeResolverBuilder typeIdVisibility(boolean z);

    TypeResolverBuilder typeProperty(String str);
}
