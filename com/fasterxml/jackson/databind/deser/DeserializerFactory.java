package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;

public abstract class DeserializerFactory {
    public static final Deserializers[] NO_DESERIALIZERS = new Deserializers[0];

    public abstract JsonDeserializer createArrayDeserializer(DeserializationContext deserializationContext, ArrayType arrayType, BeanDescription beanDescription);

    public abstract JsonDeserializer createBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription);

    public abstract JsonDeserializer createBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription, Class cls);

    public abstract JsonDeserializer createCollectionDeserializer(DeserializationContext deserializationContext, CollectionType collectionType, BeanDescription beanDescription);

    public abstract JsonDeserializer createCollectionLikeDeserializer(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, BeanDescription beanDescription);

    public abstract JsonDeserializer createEnumDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription);

    public abstract KeyDeserializer createKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType);

    public abstract JsonDeserializer createMapDeserializer(DeserializationContext deserializationContext, MapType mapType, BeanDescription beanDescription);

    public abstract JsonDeserializer createMapLikeDeserializer(DeserializationContext deserializationContext, MapLikeType mapLikeType, BeanDescription beanDescription);

    public abstract JsonDeserializer createTreeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, BeanDescription beanDescription);

    public abstract TypeDeserializer findTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType);

    public abstract ValueInstantiator findValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription);

    public abstract JavaType mapAbstractType(DeserializationConfig deserializationConfig, JavaType javaType);

    public abstract DeserializerFactory withAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver);

    public abstract DeserializerFactory withAdditionalDeserializers(Deserializers deserializers);

    public abstract DeserializerFactory withAdditionalKeyDeserializers(KeyDeserializers keyDeserializers);

    public abstract DeserializerFactory withDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier);

    public abstract DeserializerFactory withValueInstantiators(ValueInstantiators valueInstantiators);
}
