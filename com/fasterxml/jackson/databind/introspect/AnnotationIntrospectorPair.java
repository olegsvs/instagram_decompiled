package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer$None;
import com.fasterxml.jackson.databind.JsonSerializer.None;
import com.fasterxml.jackson.databind.KeyDeserializer$None;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AnnotationIntrospectorPair extends AnnotationIntrospector implements Serializable {
    private static final long serialVersionUID = 1;
    public final AnnotationIntrospector _primary;
    public final AnnotationIntrospector _secondary;

    public AnnotationIntrospectorPair(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        this._primary = annotationIntrospector;
        this._secondary = annotationIntrospector2;
    }

    public Collection allIntrospectors() {
        return allIntrospectors(new ArrayList());
    }

    public Collection allIntrospectors(Collection collection) {
        this._primary.allIntrospectors(collection);
        this._secondary.allIntrospectors(collection);
        return collection;
    }

    public static AnnotationIntrospector create(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        if (annotationIntrospector == null) {
            return annotationIntrospector2;
        }
        return annotationIntrospector2 == null ? annotationIntrospector : new AnnotationIntrospectorPair(annotationIntrospector, annotationIntrospector2);
    }

    public VisibilityChecker findAutoDetectVisibility(AnnotatedClass annotatedClass, VisibilityChecker visibilityChecker) {
        return this._primary.findAutoDetectVisibility(annotatedClass, this._secondary.findAutoDetectVisibility(annotatedClass, visibilityChecker));
    }

    public Object findContentDeserializer(Annotated annotated) {
        Class findContentDeserializer = this._primary.findContentDeserializer(annotated);
        return (findContentDeserializer == null || findContentDeserializer == JsonDeserializer$None.class || findContentDeserializer == NoClass.class) ? this._secondary.findContentDeserializer(annotated) : findContentDeserializer;
    }

    public Object findContentSerializer(Annotated annotated) {
        Class findContentSerializer = this._primary.findContentSerializer(annotated);
        return (findContentSerializer == null || findContentSerializer == None.class || findContentSerializer == NoClass.class) ? this._secondary.findContentSerializer(annotated) : findContentSerializer;
    }

    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        Object findDeserializationContentConverter = this._primary.findDeserializationContentConverter(annotatedMember);
        return findDeserializationContentConverter == null ? this._secondary.findDeserializationContentConverter(annotatedMember) : findDeserializationContentConverter;
    }

    public Class findDeserializationContentType(Annotated annotated, JavaType javaType) {
        Class findDeserializationContentType = this._primary.findDeserializationContentType(annotated, javaType);
        return findDeserializationContentType == null ? this._secondary.findDeserializationContentType(annotated, javaType) : findDeserializationContentType;
    }

    public Object findDeserializationConverter(Annotated annotated) {
        Object findDeserializationConverter = this._primary.findDeserializationConverter(annotated);
        return findDeserializationConverter == null ? this._secondary.findDeserializationConverter(annotated) : findDeserializationConverter;
    }

    public Class findDeserializationKeyType(Annotated annotated, JavaType javaType) {
        Class findDeserializationKeyType = this._primary.findDeserializationKeyType(annotated, javaType);
        return findDeserializationKeyType == null ? this._secondary.findDeserializationKeyType(annotated, javaType) : findDeserializationKeyType;
    }

    public String findDeserializationName(AnnotatedField annotatedField) {
        String findDeserializationName = this._primary.findDeserializationName(annotatedField);
        if (findDeserializationName == null) {
            return this._secondary.findDeserializationName(annotatedField);
        }
        if (findDeserializationName.length() != 0) {
            return findDeserializationName;
        }
        String findDeserializationName2 = this._secondary.findDeserializationName(annotatedField);
        return findDeserializationName2 != null ? findDeserializationName2 : findDeserializationName;
    }

    public String findDeserializationName(AnnotatedMethod annotatedMethod) {
        String findDeserializationName = this._primary.findDeserializationName(annotatedMethod);
        if (findDeserializationName == null) {
            return this._secondary.findDeserializationName(annotatedMethod);
        }
        if (findDeserializationName.length() != 0) {
            return findDeserializationName;
        }
        String findDeserializationName2 = this._secondary.findDeserializationName(annotatedMethod);
        return findDeserializationName2 != null ? findDeserializationName2 : findDeserializationName;
    }

    public String findDeserializationName(AnnotatedParameter annotatedParameter) {
        String findDeserializationName = this._primary.findDeserializationName(annotatedParameter);
        return findDeserializationName == null ? this._secondary.findDeserializationName(annotatedParameter) : findDeserializationName;
    }

    public Class findDeserializationType(Annotated annotated, JavaType javaType) {
        Class findDeserializationType = this._primary.findDeserializationType(annotated, javaType);
        return findDeserializationType == null ? this._secondary.findDeserializationType(annotated, javaType) : findDeserializationType;
    }

    public Object findDeserializer(Annotated annotated) {
        Object findDeserializer = this._primary.findDeserializer(annotated);
        return findDeserializer == null ? this._secondary.findDeserializer(annotated) : findDeserializer;
    }

    public String findEnumValue(Enum enumR) {
        String findEnumValue = this._primary.findEnumValue(enumR);
        return findEnumValue == null ? this._secondary.findEnumValue(enumR) : findEnumValue;
    }

    public Object findFilterId(AnnotatedClass annotatedClass) {
        Object findFilterId = this._primary.findFilterId(annotatedClass);
        return findFilterId == null ? this._secondary.findFilterId(annotatedClass) : findFilterId;
    }

    public Value findFormat(Annotated annotated) {
        Value findFormat = this._primary.findFormat(annotated);
        return findFormat == null ? this._secondary.findFormat(annotated) : findFormat;
    }

    public Boolean findIgnoreUnknownProperties(AnnotatedClass annotatedClass) {
        Boolean findIgnoreUnknownProperties = this._primary.findIgnoreUnknownProperties(annotatedClass);
        return findIgnoreUnknownProperties == null ? this._secondary.findIgnoreUnknownProperties(annotatedClass) : findIgnoreUnknownProperties;
    }

    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        Object findInjectableValueId = this._primary.findInjectableValueId(annotatedMember);
        return findInjectableValueId == null ? this._secondary.findInjectableValueId(annotatedMember) : findInjectableValueId;
    }

    public Object findKeyDeserializer(Annotated annotated) {
        Class findKeyDeserializer = this._primary.findKeyDeserializer(annotated);
        return (findKeyDeserializer == null || findKeyDeserializer == KeyDeserializer$None.class || findKeyDeserializer == NoClass.class) ? this._secondary.findKeyDeserializer(annotated) : findKeyDeserializer;
    }

    public Object findKeySerializer(Annotated annotated) {
        Class findKeySerializer = this._primary.findKeySerializer(annotated);
        return (findKeySerializer == null || findKeySerializer == None.class || findKeySerializer == NoClass.class) ? this._secondary.findKeySerializer(annotated) : findKeySerializer;
    }

    public PropertyName findNameForDeserialization(Annotated annotated) {
        PropertyName findNameForDeserialization = this._primary.findNameForDeserialization(annotated);
        if (findNameForDeserialization == null) {
            return this._secondary.findNameForDeserialization(annotated);
        }
        if (findNameForDeserialization != PropertyName.USE_DEFAULT) {
            return findNameForDeserialization;
        }
        PropertyName findNameForDeserialization2 = this._secondary.findNameForDeserialization(annotated);
        return findNameForDeserialization2 != null ? findNameForDeserialization2 : findNameForDeserialization;
    }

    public PropertyName findNameForSerialization(Annotated annotated) {
        PropertyName findNameForSerialization = this._primary.findNameForSerialization(annotated);
        if (findNameForSerialization == null) {
            return this._secondary.findNameForSerialization(annotated);
        }
        if (findNameForSerialization != PropertyName.USE_DEFAULT) {
            return findNameForSerialization;
        }
        PropertyName findNameForSerialization2 = this._secondary.findNameForSerialization(annotated);
        return findNameForSerialization2 != null ? findNameForSerialization2 : findNameForSerialization;
    }

    public Object findNamingStrategy(AnnotatedClass annotatedClass) {
        Object findNamingStrategy = this._primary.findNamingStrategy(annotatedClass);
        return findNamingStrategy == null ? this._secondary.findNamingStrategy(annotatedClass) : findNamingStrategy;
    }

    public ObjectIdInfo findObjectIdInfo(Annotated annotated) {
        ObjectIdInfo findObjectIdInfo = this._primary.findObjectIdInfo(annotated);
        return findObjectIdInfo == null ? this._secondary.findObjectIdInfo(annotated) : findObjectIdInfo;
    }

    public ObjectIdInfo findObjectReferenceInfo(Annotated annotated, ObjectIdInfo objectIdInfo) {
        return this._primary.findObjectReferenceInfo(annotated, this._secondary.findObjectReferenceInfo(annotated, objectIdInfo));
    }

    public Class findPOJOBuilder(AnnotatedClass annotatedClass) {
        Class findPOJOBuilder = this._primary.findPOJOBuilder(annotatedClass);
        return findPOJOBuilder == null ? this._secondary.findPOJOBuilder(annotatedClass) : findPOJOBuilder;
    }

    public JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass annotatedClass) {
        JsonPOJOBuilder.Value findPOJOBuilderConfig = this._primary.findPOJOBuilderConfig(annotatedClass);
        return findPOJOBuilderConfig == null ? this._secondary.findPOJOBuilderConfig(annotatedClass) : findPOJOBuilderConfig;
    }

    public String[] findPropertiesToIgnore(Annotated annotated) {
        String[] findPropertiesToIgnore = this._primary.findPropertiesToIgnore(annotated);
        return findPropertiesToIgnore == null ? this._secondary.findPropertiesToIgnore(annotated) : findPropertiesToIgnore;
    }

    public TypeResolverBuilder findPropertyContentTypeResolver(MapperConfig mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        TypeResolverBuilder findPropertyContentTypeResolver = this._primary.findPropertyContentTypeResolver(mapperConfig, annotatedMember, javaType);
        return findPropertyContentTypeResolver == null ? this._secondary.findPropertyContentTypeResolver(mapperConfig, annotatedMember, javaType) : findPropertyContentTypeResolver;
    }

    public TypeResolverBuilder findPropertyTypeResolver(MapperConfig mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        TypeResolverBuilder findPropertyTypeResolver = this._primary.findPropertyTypeResolver(mapperConfig, annotatedMember, javaType);
        return findPropertyTypeResolver == null ? this._secondary.findPropertyTypeResolver(mapperConfig, annotatedMember, javaType) : findPropertyTypeResolver;
    }

    public ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        ReferenceProperty findReferenceType = this._primary.findReferenceType(annotatedMember);
        return findReferenceType == null ? this._secondary.findReferenceType(annotatedMember) : findReferenceType;
    }

    public PropertyName findRootName(AnnotatedClass annotatedClass) {
        PropertyName findRootName = this._primary.findRootName(annotatedClass);
        if (findRootName == null) {
            return this._secondary.findRootName(annotatedClass);
        }
        if (findRootName.hasSimpleName()) {
            return findRootName;
        }
        PropertyName findRootName2 = this._secondary.findRootName(annotatedClass);
        if (findRootName2 == null) {
            findRootName2 = findRootName;
        }
        return findRootName2;
    }

    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        Object findSerializationContentConverter = this._primary.findSerializationContentConverter(annotatedMember);
        return findSerializationContentConverter == null ? this._secondary.findSerializationContentConverter(annotatedMember) : findSerializationContentConverter;
    }

    public Class findSerializationContentType(Annotated annotated, JavaType javaType) {
        Class findSerializationContentType = this._primary.findSerializationContentType(annotated, javaType);
        return findSerializationContentType == null ? this._secondary.findSerializationContentType(annotated, javaType) : findSerializationContentType;
    }

    public Object findSerializationConverter(Annotated annotated) {
        Object findSerializationConverter = this._primary.findSerializationConverter(annotated);
        return findSerializationConverter == null ? this._secondary.findSerializationConverter(annotated) : findSerializationConverter;
    }

    public Include findSerializationInclusion(Annotated annotated, Include include) {
        return this._primary.findSerializationInclusion(annotated, this._secondary.findSerializationInclusion(annotated, include));
    }

    public Class findSerializationKeyType(Annotated annotated, JavaType javaType) {
        Class findSerializationKeyType = this._primary.findSerializationKeyType(annotated, javaType);
        return findSerializationKeyType == null ? this._secondary.findSerializationKeyType(annotated, javaType) : findSerializationKeyType;
    }

    public String findSerializationName(AnnotatedField annotatedField) {
        String findSerializationName = this._primary.findSerializationName(annotatedField);
        if (findSerializationName == null) {
            return this._secondary.findSerializationName(annotatedField);
        }
        if (findSerializationName.length() != 0) {
            return findSerializationName;
        }
        String findSerializationName2 = this._secondary.findSerializationName(annotatedField);
        return findSerializationName2 != null ? findSerializationName2 : findSerializationName;
    }

    public String findSerializationName(AnnotatedMethod annotatedMethod) {
        String findSerializationName = this._primary.findSerializationName(annotatedMethod);
        if (findSerializationName == null) {
            return this._secondary.findSerializationName(annotatedMethod);
        }
        if (findSerializationName.length() != 0) {
            return findSerializationName;
        }
        String findSerializationName2 = this._secondary.findSerializationName(annotatedMethod);
        return findSerializationName2 != null ? findSerializationName2 : findSerializationName;
    }

    public String[] findSerializationPropertyOrder(AnnotatedClass annotatedClass) {
        String[] findSerializationPropertyOrder = this._primary.findSerializationPropertyOrder(annotatedClass);
        return findSerializationPropertyOrder == null ? this._secondary.findSerializationPropertyOrder(annotatedClass) : findSerializationPropertyOrder;
    }

    public Boolean findSerializationSortAlphabetically(AnnotatedClass annotatedClass) {
        Boolean findSerializationSortAlphabetically = this._primary.findSerializationSortAlphabetically(annotatedClass);
        return findSerializationSortAlphabetically == null ? this._secondary.findSerializationSortAlphabetically(annotatedClass) : findSerializationSortAlphabetically;
    }

    public Class findSerializationType(Annotated annotated) {
        Class findSerializationType = this._primary.findSerializationType(annotated);
        return findSerializationType == null ? this._secondary.findSerializationType(annotated) : findSerializationType;
    }

    public Typing findSerializationTyping(Annotated annotated) {
        Typing findSerializationTyping = this._primary.findSerializationTyping(annotated);
        return findSerializationTyping == null ? this._secondary.findSerializationTyping(annotated) : findSerializationTyping;
    }

    public Object findSerializer(Annotated annotated) {
        Object findSerializer = this._primary.findSerializer(annotated);
        return findSerializer == null ? this._secondary.findSerializer(annotated) : findSerializer;
    }

    public List findSubtypes(Annotated annotated) {
        Object findSubtypes = this._primary.findSubtypes(annotated);
        Object findSubtypes2 = this._secondary.findSubtypes(annotated);
        if (findSubtypes != null) {
            if (!findSubtypes.isEmpty()) {
                if (findSubtypes2 != null) {
                    if (!findSubtypes2.isEmpty()) {
                        List arrayList = new ArrayList(findSubtypes.size() + findSubtypes2.size());
                        arrayList.addAll(findSubtypes);
                        arrayList.addAll(findSubtypes2);
                        return arrayList;
                    }
                }
                return findSubtypes;
            }
        }
        return findSubtypes2;
    }

    public String findTypeName(AnnotatedClass annotatedClass) {
        String findTypeName = this._primary.findTypeName(annotatedClass);
        return (findTypeName == null || findTypeName.length() == 0) ? this._secondary.findTypeName(annotatedClass) : findTypeName;
    }

    public TypeResolverBuilder findTypeResolver(MapperConfig mapperConfig, AnnotatedClass annotatedClass, JavaType javaType) {
        TypeResolverBuilder findTypeResolver = this._primary.findTypeResolver(mapperConfig, annotatedClass, javaType);
        return findTypeResolver == null ? this._secondary.findTypeResolver(mapperConfig, annotatedClass, javaType) : findTypeResolver;
    }

    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        NameTransformer findUnwrappingNameTransformer = this._primary.findUnwrappingNameTransformer(annotatedMember);
        return findUnwrappingNameTransformer == null ? this._secondary.findUnwrappingNameTransformer(annotatedMember) : findUnwrappingNameTransformer;
    }

    public Object findValueInstantiator(AnnotatedClass annotatedClass) {
        Object findValueInstantiator = this._primary.findValueInstantiator(annotatedClass);
        return findValueInstantiator == null ? this._secondary.findValueInstantiator(annotatedClass) : findValueInstantiator;
    }

    public Class[] findViews(Annotated annotated) {
        Class[] findViews = this._primary.findViews(annotated);
        return findViews == null ? this._secondary.findViews(annotated) : findViews;
    }

    public PropertyName findWrapperName(Annotated annotated) {
        PropertyName findWrapperName = this._primary.findWrapperName(annotated);
        if (findWrapperName == null) {
            return this._secondary.findWrapperName(annotated);
        }
        if (findWrapperName != PropertyName.USE_DEFAULT) {
            return findWrapperName;
        }
        PropertyName findWrapperName2 = this._secondary.findWrapperName(annotated);
        return findWrapperName2 != null ? findWrapperName2 : findWrapperName;
    }

    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        if (!this._primary.hasAnyGetterAnnotation(annotatedMethod)) {
            if (!this._secondary.hasAnyGetterAnnotation(annotatedMethod)) {
                return false;
            }
        }
        return true;
    }

    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedMethod) {
        if (!this._primary.hasAnySetterAnnotation(annotatedMethod)) {
            if (!this._secondary.hasAnySetterAnnotation(annotatedMethod)) {
                return false;
            }
        }
        return true;
    }

    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        if (!this._primary.hasAsValueAnnotation(annotatedMethod)) {
            if (!this._secondary.hasAsValueAnnotation(annotatedMethod)) {
                return false;
            }
        }
        return true;
    }

    public boolean hasCreatorAnnotation(Annotated annotated) {
        if (!this._primary.hasCreatorAnnotation(annotated)) {
            if (!this._secondary.hasCreatorAnnotation(annotated)) {
                return false;
            }
        }
        return true;
    }

    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        if (!this._primary.hasIgnoreMarker(annotatedMember)) {
            if (!this._secondary.hasIgnoreMarker(annotatedMember)) {
                return false;
            }
        }
        return true;
    }

    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        Boolean hasRequiredMarker = this._primary.hasRequiredMarker(annotatedMember);
        return hasRequiredMarker == null ? this._secondary.hasRequiredMarker(annotatedMember) : hasRequiredMarker;
    }

    public boolean isAnnotationBundle(Annotation annotation) {
        if (!this._primary.isAnnotationBundle(annotation)) {
            if (!this._secondary.isAnnotationBundle(annotation)) {
                return false;
            }
        }
        return true;
    }

    public boolean isHandled(Annotation annotation) {
        if (!this._primary.isHandled(annotation)) {
            if (!this._secondary.isHandled(annotation)) {
                return false;
            }
        }
        return true;
    }

    public Boolean isIgnorableType(AnnotatedClass annotatedClass) {
        Boolean isIgnorableType = this._primary.isIgnorableType(annotatedClass);
        return isIgnorableType == null ? this._secondary.isIgnorableType(annotatedClass) : isIgnorableType;
    }

    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        Boolean isTypeId = this._primary.isTypeId(annotatedMember);
        return isTypeId == null ? this._secondary.isTypeId(annotatedMember) : isTypeId;
    }

    public Version version() {
        return this._primary.version();
    }
}
