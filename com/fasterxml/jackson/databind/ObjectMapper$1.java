package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory.Feature;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.Module.SetupContext;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeModifier;

public class ObjectMapper$1 implements SetupContext {
    public final /* synthetic */ ObjectMapper this$0;
    public final /* synthetic */ ObjectMapper val$mapper;

    public ObjectMapper$1(ObjectMapper objectMapper, ObjectMapper objectMapper2) {
        this.this$0 = objectMapper;
        this.val$mapper = objectMapper2;
    }

    public void addAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver) {
        abstractTypeResolver = this.val$mapper._deserializationContext._factory.withAbstractTypeResolver(abstractTypeResolver);
        ObjectMapper objectMapper = this.val$mapper;
        objectMapper._deserializationContext = objectMapper._deserializationContext.with(abstractTypeResolver);
    }

    public void addBeanDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier) {
        beanDeserializerModifier = this.val$mapper._deserializationContext._factory.withDeserializerModifier(beanDeserializerModifier);
        ObjectMapper objectMapper = this.val$mapper;
        objectMapper._deserializationContext = objectMapper._deserializationContext.with(beanDeserializerModifier);
    }

    public void addBeanSerializerModifier(BeanSerializerModifier beanSerializerModifier) {
        ObjectMapper objectMapper = this.val$mapper;
        objectMapper._serializerFactory = objectMapper._serializerFactory.withSerializerModifier(beanSerializerModifier);
    }

    public void addDeserializationProblemHandler(DeserializationProblemHandler deserializationProblemHandler) {
        this.val$mapper.addHandler(deserializationProblemHandler);
    }

    public void addDeserializers(Deserializers deserializers) {
        deserializers = this.val$mapper._deserializationContext._factory.withAdditionalDeserializers(deserializers);
        ObjectMapper objectMapper = this.val$mapper;
        objectMapper._deserializationContext = objectMapper._deserializationContext.with(deserializers);
    }

    public void addKeyDeserializers(KeyDeserializers keyDeserializers) {
        keyDeserializers = this.val$mapper._deserializationContext._factory.withAdditionalKeyDeserializers(keyDeserializers);
        ObjectMapper objectMapper = this.val$mapper;
        objectMapper._deserializationContext = objectMapper._deserializationContext.with(keyDeserializers);
    }

    public void addKeySerializers(Serializers serializers) {
        ObjectMapper objectMapper = this.val$mapper;
        objectMapper._serializerFactory = objectMapper._serializerFactory.withAdditionalKeySerializers(serializers);
    }

    public void addSerializers(Serializers serializers) {
        ObjectMapper objectMapper = this.val$mapper;
        objectMapper._serializerFactory = objectMapper._serializerFactory.withAdditionalSerializers(serializers);
    }

    public void addTypeModifier(TypeModifier typeModifier) {
        this.val$mapper.setTypeFactory(this.val$mapper._typeFactory.withModifier(typeModifier));
    }

    public void addValueInstantiators(ValueInstantiators valueInstantiators) {
        valueInstantiators = this.val$mapper._deserializationContext._factory.withValueInstantiators(valueInstantiators);
        ObjectMapper objectMapper = this.val$mapper;
        objectMapper._deserializationContext = objectMapper._deserializationContext.with(valueInstantiators);
    }

    public void appendAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        ObjectMapper objectMapper = this.val$mapper;
        objectMapper._deserializationConfig = objectMapper._deserializationConfig.withAppendedAnnotationIntrospector(annotationIntrospector);
        objectMapper = this.val$mapper;
        objectMapper._serializationConfig = objectMapper._serializationConfig.withAppendedAnnotationIntrospector(annotationIntrospector);
    }

    public Version getMapperVersion() {
        return this.this$0.version();
    }

    public ObjectCodec getOwner() {
        return this.val$mapper;
    }

    public TypeFactory getTypeFactory() {
        return this.this$0._typeFactory;
    }

    public void insertAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        ObjectMapper objectMapper = this.val$mapper;
        objectMapper._deserializationConfig = objectMapper._deserializationConfig.withInsertedAnnotationIntrospector(annotationIntrospector);
        objectMapper = this.val$mapper;
        objectMapper._serializationConfig = objectMapper._serializationConfig.withInsertedAnnotationIntrospector(annotationIntrospector);
    }

    public boolean isEnabled(Feature feature) {
        return this.val$mapper.isEnabled(feature);
    }

    public boolean isEnabled(JsonGenerator.Feature feature) {
        return this.val$mapper.isEnabled(feature);
    }

    public boolean isEnabled(JsonParser.Feature feature) {
        return this.val$mapper.isEnabled(feature);
    }

    public boolean isEnabled(DeserializationFeature deserializationFeature) {
        return this.val$mapper.isEnabled(deserializationFeature);
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this.val$mapper.isEnabled(mapperFeature);
    }

    public boolean isEnabled(SerializationFeature serializationFeature) {
        return this.val$mapper.isEnabled(serializationFeature);
    }

    public void registerSubtypes(NamedType... namedTypeArr) {
        this.val$mapper.registerSubtypes(namedTypeArr);
    }

    public void registerSubtypes(Class... clsArr) {
        this.val$mapper.registerSubtypes(clsArr);
    }

    public void setClassIntrospector(ClassIntrospector classIntrospector) {
        ObjectMapper objectMapper = this.val$mapper;
        objectMapper._deserializationConfig = objectMapper._deserializationConfig.with(classIntrospector);
        objectMapper = this.val$mapper;
        objectMapper._serializationConfig = objectMapper._serializationConfig.with(classIntrospector);
    }

    public void setMixInAnnotations(Class cls, Class cls2) {
        this.val$mapper.addMixInAnnotations(cls, cls2);
    }
}
