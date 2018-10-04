package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class AnnotationIntrospector implements Versioned, Serializable {

    public class ReferenceProperty {
        private final String _name;
        private final Type _type;

        public enum Type {
            MANAGED_REFERENCE,
            BACK_REFERENCE
        }

        public ReferenceProperty(Type type, String str) {
            this._type = type;
            this._name = str;
        }

        public static ReferenceProperty back(String str) {
            return new ReferenceProperty(Type.BACK_REFERENCE, str);
        }

        public String getName() {
            return this._name;
        }

        public Type getType() {
            return this._type;
        }

        public boolean isBackReference() {
            return this._type == Type.BACK_REFERENCE;
        }

        public boolean isManagedReference() {
            return this._type == Type.MANAGED_REFERENCE;
        }

        public static ReferenceProperty managed(String str) {
            return new ReferenceProperty(Type.MANAGED_REFERENCE, str);
        }
    }

    public VisibilityChecker findAutoDetectVisibility(AnnotatedClass annotatedClass, VisibilityChecker visibilityChecker) {
        return visibilityChecker;
    }

    public Object findContentDeserializer(Annotated annotated) {
        return null;
    }

    public Object findContentSerializer(Annotated annotated) {
        return null;
    }

    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        return null;
    }

    public Class findDeserializationContentType(Annotated annotated, JavaType javaType) {
        return null;
    }

    public Object findDeserializationConverter(Annotated annotated) {
        return null;
    }

    public Class findDeserializationKeyType(Annotated annotated, JavaType javaType) {
        return null;
    }

    public String findDeserializationName(AnnotatedField annotatedField) {
        return null;
    }

    public String findDeserializationName(AnnotatedMethod annotatedMethod) {
        return null;
    }

    public String findDeserializationName(AnnotatedParameter annotatedParameter) {
        return null;
    }

    public Class findDeserializationType(Annotated annotated, JavaType javaType) {
        return null;
    }

    public Object findDeserializer(Annotated annotated) {
        return null;
    }

    public Object findFilterId(AnnotatedClass annotatedClass) {
        return null;
    }

    public Value findFormat(AnnotatedMember annotatedMember) {
        return null;
    }

    public Boolean findIgnoreUnknownProperties(AnnotatedClass annotatedClass) {
        return null;
    }

    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object findKeyDeserializer(Annotated annotated) {
        return null;
    }

    public Object findKeySerializer(Annotated annotated) {
        return null;
    }

    public Object findNamingStrategy(AnnotatedClass annotatedClass) {
        return null;
    }

    public ObjectIdInfo findObjectIdInfo(Annotated annotated) {
        return null;
    }

    public ObjectIdInfo findObjectReferenceInfo(Annotated annotated, ObjectIdInfo objectIdInfo) {
        return objectIdInfo;
    }

    public Class findPOJOBuilder(AnnotatedClass annotatedClass) {
        return null;
    }

    public JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass annotatedClass) {
        return null;
    }

    public String[] findPropertiesToIgnore(Annotated annotated) {
        return null;
    }

    public TypeResolverBuilder findPropertyContentTypeResolver(MapperConfig mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public TypeResolverBuilder findPropertyTypeResolver(MapperConfig mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        return null;
    }

    public PropertyName findRootName(AnnotatedClass annotatedClass) {
        return null;
    }

    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        return null;
    }

    public Class findSerializationContentType(Annotated annotated, JavaType javaType) {
        return null;
    }

    public Object findSerializationConverter(Annotated annotated) {
        return null;
    }

    public Include findSerializationInclusion(Annotated annotated, Include include) {
        return include;
    }

    public Class findSerializationKeyType(Annotated annotated, JavaType javaType) {
        return null;
    }

    public String findSerializationName(AnnotatedField annotatedField) {
        return null;
    }

    public String findSerializationName(AnnotatedMethod annotatedMethod) {
        return null;
    }

    public String[] findSerializationPropertyOrder(AnnotatedClass annotatedClass) {
        return null;
    }

    public Boolean findSerializationSortAlphabetically(AnnotatedClass annotatedClass) {
        return null;
    }

    public Class findSerializationType(Annotated annotated) {
        return null;
    }

    public Typing findSerializationTyping(Annotated annotated) {
        return null;
    }

    public Object findSerializer(Annotated annotated) {
        return null;
    }

    public List findSubtypes(Annotated annotated) {
        return null;
    }

    public String findTypeName(AnnotatedClass annotatedClass) {
        return null;
    }

    public TypeResolverBuilder findTypeResolver(MapperConfig mapperConfig, AnnotatedClass annotatedClass, JavaType javaType) {
        return null;
    }

    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object findValueInstantiator(AnnotatedClass annotatedClass) {
        return null;
    }

    public Class[] findViews(Annotated annotated) {
        return null;
    }

    public PropertyName findWrapperName(Annotated annotated) {
        return null;
    }

    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public boolean hasCreatorAnnotation(Annotated annotated) {
        return false;
    }

    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return false;
    }

    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        return null;
    }

    public boolean isAnnotationBundle(Annotation annotation) {
        return false;
    }

    public boolean isHandled(Annotation annotation) {
        return false;
    }

    public Boolean isIgnorableType(AnnotatedClass annotatedClass) {
        return null;
    }

    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        return null;
    }

    public abstract Version version();

    public Collection allIntrospectors() {
        return Collections.singletonList(this);
    }

    public Collection allIntrospectors(Collection collection) {
        collection.add(this);
        return collection;
    }

    public String findEnumValue(Enum enumR) {
        return enumR.name();
    }

    public Value findFormat(Annotated annotated) {
        return annotated instanceof AnnotatedMember ? findFormat((AnnotatedMember) annotated) : null;
    }

    public PropertyName findNameForDeserialization(Annotated annotated) {
        String findDeserializationName = annotated instanceof AnnotatedField ? findDeserializationName((AnnotatedField) annotated) : annotated instanceof AnnotatedMethod ? findDeserializationName((AnnotatedMethod) annotated) : annotated instanceof AnnotatedParameter ? findDeserializationName((AnnotatedParameter) annotated) : null;
        if (findDeserializationName == null) {
            return null;
        }
        if (findDeserializationName.length() == 0) {
            return PropertyName.USE_DEFAULT;
        }
        return new PropertyName(findDeserializationName);
    }

    public PropertyName findNameForSerialization(Annotated annotated) {
        String findSerializationName = annotated instanceof AnnotatedField ? findSerializationName((AnnotatedField) annotated) : annotated instanceof AnnotatedMethod ? findSerializationName((AnnotatedMethod) annotated) : null;
        if (findSerializationName == null) {
            return null;
        }
        if (findSerializationName.length() == 0) {
            return PropertyName.USE_DEFAULT;
        }
        return new PropertyName(findSerializationName);
    }

    public static AnnotationIntrospector nopInstance() {
        return NopAnnotationIntrospector.instance;
    }

    public static AnnotationIntrospector pair(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        return new AnnotationIntrospectorPair(annotationIntrospector, annotationIntrospector2);
    }
}
