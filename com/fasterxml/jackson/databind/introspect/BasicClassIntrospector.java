package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver;
import com.fasterxml.jackson.databind.type.SimpleType;
import java.io.Serializable;

public class BasicClassIntrospector extends ClassIntrospector implements Serializable {
    public static final BasicBeanDescription BOOLEAN_DESC;
    public static final BasicBeanDescription INT_DESC;
    public static final BasicBeanDescription LONG_DESC;
    public static final BasicBeanDescription STRING_DESC;
    public static final BasicClassIntrospector instance = new BasicClassIntrospector();
    private static final long serialVersionUID = 1;

    static {
        Class cls = String.class;
        STRING_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(cls), AnnotatedClass.constructWithoutSuperTypes(cls, null, null));
        cls = Boolean.TYPE;
        BOOLEAN_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(cls), AnnotatedClass.constructWithoutSuperTypes(cls, null, null));
        cls = Integer.TYPE;
        INT_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(cls), AnnotatedClass.constructWithoutSuperTypes(cls, null, null));
        cls = Long.TYPE;
        LONG_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(cls), AnnotatedClass.constructWithoutSuperTypes(cls, null, null));
    }

    public BasicBeanDescription _findCachedDesc(JavaType javaType) {
        javaType = javaType.getRawClass();
        if (javaType == String.class) {
            return STRING_DESC;
        }
        if (javaType == Boolean.TYPE) {
            return BOOLEAN_DESC;
        }
        if (javaType == Integer.TYPE) {
            return INT_DESC;
        }
        return javaType == Long.TYPE ? LONG_DESC : null;
    }

    public POJOPropertiesCollector collectProperties(MapperConfig mapperConfig, JavaType javaType, MixInResolver mixInResolver, boolean z, String str) {
        return constructPropertyCollector(mapperConfig, AnnotatedClass.construct(javaType.getRawClass(), mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null, mixInResolver), javaType, z, str).collect();
    }

    public POJOPropertiesCollector collectPropertiesWithBuilder(MapperConfig mapperConfig, JavaType javaType, MixInResolver mixInResolver, boolean z) {
        MapperConfig mapperConfig2 = mapperConfig;
        Value value = null;
        AnnotationIntrospector annotationIntrospector = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
        JavaType javaType2 = javaType;
        AnnotatedClass construct = AnnotatedClass.construct(javaType.getRawClass(), annotationIntrospector, mixInResolver);
        if (annotationIntrospector != null) {
            value = annotationIntrospector.findPOJOBuilderConfig(construct);
        }
        if (value == null) {
            mapperConfig = "with";
        } else {
            mapperConfig = value.withPrefix;
        }
        return constructPropertyCollector(mapperConfig2, construct, javaType2, z, mapperConfig).collect();
    }

    public POJOPropertiesCollector constructPropertyCollector(MapperConfig mapperConfig, AnnotatedClass annotatedClass, JavaType javaType, boolean z, String str) {
        return new POJOPropertiesCollector(mapperConfig, z, javaType, annotatedClass, str);
    }

    public BasicBeanDescription forClassAnnotations(MapperConfig mapperConfig, JavaType javaType, MixInResolver mixInResolver) {
        return BasicBeanDescription.forOtherUse(mapperConfig, javaType, AnnotatedClass.construct(javaType.getRawClass(), mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null, mixInResolver));
    }

    public BasicBeanDescription forCreation(DeserializationConfig deserializationConfig, JavaType javaType, MixInResolver mixInResolver) {
        BasicClassIntrospector basicClassIntrospector = this;
        JavaType javaType2 = javaType;
        BasicBeanDescription _findCachedDesc = _findCachedDesc(javaType);
        if (_findCachedDesc != null) {
            return _findCachedDesc;
        }
        return BasicBeanDescription.forDeserialization(collectProperties(deserializationConfig, javaType2, mixInResolver, false, "set"));
    }

    public BasicBeanDescription forDeserialization(DeserializationConfig deserializationConfig, JavaType javaType, MixInResolver mixInResolver) {
        BasicClassIntrospector basicClassIntrospector = this;
        JavaType javaType2 = javaType;
        BasicBeanDescription _findCachedDesc = _findCachedDesc(javaType);
        if (_findCachedDesc != null) {
            return _findCachedDesc;
        }
        return BasicBeanDescription.forDeserialization(collectProperties(deserializationConfig, javaType2, mixInResolver, false, "set"));
    }

    public BasicBeanDescription forDeserializationWithBuilder(DeserializationConfig deserializationConfig, JavaType javaType, MixInResolver mixInResolver) {
        return BasicBeanDescription.forDeserialization(collectPropertiesWithBuilder(deserializationConfig, javaType, mixInResolver, false));
    }

    public BasicBeanDescription forDirectClassAnnotations(MapperConfig mapperConfig, JavaType javaType, MixInResolver mixInResolver) {
        boolean isAnnotationProcessingEnabled = mapperConfig.isAnnotationProcessingEnabled();
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        Class rawClass = javaType.getRawClass();
        if (!isAnnotationProcessingEnabled) {
            annotationIntrospector = null;
        }
        return BasicBeanDescription.forOtherUse(mapperConfig, javaType, AnnotatedClass.constructWithoutSuperTypes(rawClass, annotationIntrospector, mixInResolver));
    }

    public BasicBeanDescription forSerialization(SerializationConfig serializationConfig, JavaType javaType, MixInResolver mixInResolver) {
        BasicClassIntrospector basicClassIntrospector = this;
        JavaType javaType2 = javaType;
        BasicBeanDescription _findCachedDesc = _findCachedDesc(javaType);
        if (_findCachedDesc != null) {
            return _findCachedDesc;
        }
        return BasicBeanDescription.forSerialization(collectProperties(serializationConfig, javaType2, mixInResolver, true, "set"));
    }
}
