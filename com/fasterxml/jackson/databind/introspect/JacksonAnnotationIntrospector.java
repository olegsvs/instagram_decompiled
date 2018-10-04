package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeInfo.None;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$None;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer$None;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.KeyDeserializer$None;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.util.Converter$None;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

public class JacksonAnnotationIntrospector extends AnnotationIntrospector implements Serializable {
    private static final long serialVersionUID = 1;

    public StdTypeResolverBuilder _constructNoTypeResolverBuilder() {
        return StdTypeResolverBuilder.noTypeInfoBuilder();
    }

    public StdTypeResolverBuilder _constructStdTypeResolverBuilder() {
        return new StdTypeResolverBuilder();
    }

    public TypeResolverBuilder _findTypeResolver(MapperConfig mapperConfig, Annotated annotated, JavaType javaType) {
        JsonTypeInfo jsonTypeInfo = (JsonTypeInfo) annotated.getAnnotation(JsonTypeInfo.class);
        JsonTypeResolver jsonTypeResolver = (JsonTypeResolver) annotated.getAnnotation(JsonTypeResolver.class);
        TypeIdResolver typeIdResolver = null;
        TypeResolverBuilder typeResolverBuilderInstance;
        JsonTypeIdResolver jsonTypeIdResolver;
        TypeResolverBuilder init;
        As include;
        Class defaultImpl;
        if (jsonTypeResolver != null) {
            if (jsonTypeInfo != null) {
                typeResolverBuilderInstance = mapperConfig.typeResolverBuilderInstance(annotated, jsonTypeResolver.value());
                jsonTypeIdResolver = (JsonTypeIdResolver) annotated.getAnnotation(JsonTypeIdResolver.class);
                if (jsonTypeIdResolver == null) {
                    typeIdResolver = mapperConfig.typeIdResolverInstance(annotated, jsonTypeIdResolver.value());
                }
                if (typeIdResolver != null) {
                    typeIdResolver.init(javaType);
                }
                init = typeResolverBuilderInstance.init(jsonTypeInfo.use(), typeIdResolver);
                include = jsonTypeInfo.include();
                if (include == As.EXTERNAL_PROPERTY && (annotated instanceof AnnotatedClass)) {
                    include = As.PROPERTY;
                }
                init = init.inclusion(include).typeProperty(jsonTypeInfo.property());
                defaultImpl = jsonTypeInfo.defaultImpl();
                if (defaultImpl != None.class) {
                    init = init.defaultImpl(defaultImpl);
                }
                return init.typeIdVisibility(jsonTypeInfo.visible());
            }
        } else if (jsonTypeInfo != null) {
            if (jsonTypeInfo.use() == Id.NONE) {
                return _constructNoTypeResolverBuilder();
            }
            typeResolverBuilderInstance = _constructStdTypeResolverBuilder();
            jsonTypeIdResolver = (JsonTypeIdResolver) annotated.getAnnotation(JsonTypeIdResolver.class);
            if (jsonTypeIdResolver == null) {
                typeIdResolver = mapperConfig.typeIdResolverInstance(annotated, jsonTypeIdResolver.value());
            }
            if (typeIdResolver != null) {
                typeIdResolver.init(javaType);
            }
            init = typeResolverBuilderInstance.init(jsonTypeInfo.use(), typeIdResolver);
            include = jsonTypeInfo.include();
            include = As.PROPERTY;
            init = init.inclusion(include).typeProperty(jsonTypeInfo.property());
            defaultImpl = jsonTypeInfo.defaultImpl();
            if (defaultImpl != None.class) {
                init = init.defaultImpl(defaultImpl);
            }
            return init.typeIdVisibility(jsonTypeInfo.visible());
        }
        return null;
    }

    public boolean _isIgnorable(Annotated annotated) {
        JsonIgnore jsonIgnore = (JsonIgnore) annotated.getAnnotation(JsonIgnore.class);
        return jsonIgnore != null && jsonIgnore.value();
    }

    public VisibilityChecker findAutoDetectVisibility(AnnotatedClass annotatedClass, VisibilityChecker visibilityChecker) {
        JsonAutoDetect jsonAutoDetect = (JsonAutoDetect) annotatedClass.getAnnotation(JsonAutoDetect.class);
        return jsonAutoDetect == null ? visibilityChecker : visibilityChecker.with(jsonAutoDetect);
    }

    public Class findContentDeserializer(Annotated annotated) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) annotated.getAnnotation(JsonDeserialize.class);
        if (jsonDeserialize != null) {
            annotated = jsonDeserialize.contentUsing();
            if (annotated != JsonDeserializer$None.class) {
                return annotated;
            }
        }
        return null;
    }

    public Class findContentSerializer(Annotated annotated) {
        JsonSerialize jsonSerialize = (JsonSerialize) annotated.getAnnotation(JsonSerialize.class);
        if (jsonSerialize != null) {
            annotated = jsonSerialize.contentUsing();
            if (annotated != JsonSerializer.None.class) {
                return annotated;
            }
        }
        return null;
    }

    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) annotatedMember.getAnnotation(JsonDeserialize.class);
        if (jsonDeserialize != null) {
            annotatedMember = jsonDeserialize.contentConverter();
            if (annotatedMember != Converter$None.class) {
                return annotatedMember;
            }
        }
        return null;
    }

    public Class findDeserializationContentType(Annotated annotated, JavaType javaType) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) annotated.getAnnotation(JsonDeserialize.class);
        if (jsonDeserialize != null) {
            annotated = jsonDeserialize.contentAs();
            if (annotated != NoClass.class) {
                return annotated;
            }
        }
        return null;
    }

    public Object findDeserializationConverter(Annotated annotated) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) annotated.getAnnotation(JsonDeserialize.class);
        if (jsonDeserialize != null) {
            annotated = jsonDeserialize.converter();
            if (annotated != Converter$None.class) {
                return annotated;
            }
        }
        return null;
    }

    public Class findDeserializationKeyType(Annotated annotated, JavaType javaType) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) annotated.getAnnotation(JsonDeserialize.class);
        if (jsonDeserialize != null) {
            annotated = jsonDeserialize.keyAs();
            if (annotated != NoClass.class) {
                return annotated;
            }
        }
        return null;
    }

    public String findDeserializationName(AnnotatedField annotatedField) {
        JsonProperty jsonProperty = (JsonProperty) annotatedField.getAnnotation(JsonProperty.class);
        if (jsonProperty != null) {
            return jsonProperty.value();
        }
        if (!(annotatedField.hasAnnotation(JsonDeserialize.class) || annotatedField.hasAnnotation(JsonView.class) || annotatedField.hasAnnotation(JsonBackReference.class))) {
            if (!annotatedField.hasAnnotation(JsonManagedReference.class)) {
                return null;
            }
        }
        return JsonProperty.USE_DEFAULT_NAME;
    }

    public String findDeserializationName(AnnotatedMethod annotatedMethod) {
        JsonSetter jsonSetter = (JsonSetter) annotatedMethod.getAnnotation(JsonSetter.class);
        if (jsonSetter != null) {
            return jsonSetter.value();
        }
        JsonProperty jsonProperty = (JsonProperty) annotatedMethod.getAnnotation(JsonProperty.class);
        if (jsonProperty != null) {
            return jsonProperty.value();
        }
        if (!(annotatedMethod.hasAnnotation(JsonDeserialize.class) || annotatedMethod.hasAnnotation(JsonView.class) || annotatedMethod.hasAnnotation(JsonBackReference.class))) {
            if (!annotatedMethod.hasAnnotation(JsonManagedReference.class)) {
                return null;
            }
        }
        return JsonProperty.USE_DEFAULT_NAME;
    }

    public String findDeserializationName(AnnotatedParameter annotatedParameter) {
        if (annotatedParameter != null) {
            JsonProperty jsonProperty = (JsonProperty) annotatedParameter.getAnnotation(JsonProperty.class);
            if (jsonProperty != null) {
                return jsonProperty.value();
            }
        }
        return null;
    }

    public Class findDeserializationType(Annotated annotated, JavaType javaType) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) annotated.getAnnotation(JsonDeserialize.class);
        if (jsonDeserialize != null) {
            annotated = jsonDeserialize.as();
            if (annotated != NoClass.class) {
                return annotated;
            }
        }
        return null;
    }

    public Class findDeserializer(Annotated annotated) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) annotated.getAnnotation(JsonDeserialize.class);
        if (jsonDeserialize != null) {
            annotated = jsonDeserialize.using();
            if (annotated != JsonDeserializer$None.class) {
                return annotated;
            }
        }
        return null;
    }

    public Object findFilterId(AnnotatedClass annotatedClass) {
        JsonFilter jsonFilter = (JsonFilter) annotatedClass.getAnnotation(JsonFilter.class);
        if (jsonFilter != null) {
            annotatedClass = jsonFilter.value();
            if (annotatedClass.length() > 0) {
                return annotatedClass;
            }
        }
        return null;
    }

    public Value findFormat(Annotated annotated) {
        JsonFormat jsonFormat = (JsonFormat) annotated.getAnnotation(JsonFormat.class);
        if (jsonFormat == null) {
            return null;
        }
        return new Value(jsonFormat);
    }

    public Value findFormat(AnnotatedMember annotatedMember) {
        return findFormat(annotatedMember);
    }

    public Boolean findIgnoreUnknownProperties(AnnotatedClass annotatedClass) {
        JsonIgnoreProperties jsonIgnoreProperties = (JsonIgnoreProperties) annotatedClass.getAnnotation(JsonIgnoreProperties.class);
        if (jsonIgnoreProperties == null) {
            return null;
        }
        return Boolean.valueOf(jsonIgnoreProperties.ignoreUnknown());
    }

    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        JacksonInject jacksonInject = (JacksonInject) annotatedMember.getAnnotation(JacksonInject.class);
        if (jacksonInject == null) {
            return null;
        }
        String value = jacksonInject.value();
        if (value.length() != 0) {
            return value;
        }
        if (annotatedMember instanceof AnnotatedMethod) {
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
            if (annotatedMethod.getParameterCount() != 0) {
                return annotatedMethod.getRawParameterType(0).getName();
            }
        }
        return annotatedMember.getRawType().getName();
    }

    public Class findKeyDeserializer(Annotated annotated) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) annotated.getAnnotation(JsonDeserialize.class);
        if (jsonDeserialize != null) {
            annotated = jsonDeserialize.keyUsing();
            if (annotated != KeyDeserializer$None.class) {
                return annotated;
            }
        }
        return null;
    }

    public Class findKeySerializer(Annotated annotated) {
        JsonSerialize jsonSerialize = (JsonSerialize) annotated.getAnnotation(JsonSerialize.class);
        if (jsonSerialize != null) {
            annotated = jsonSerialize.keyUsing();
            if (annotated != JsonSerializer.None.class) {
                return annotated;
            }
        }
        return null;
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

    public Object findNamingStrategy(AnnotatedClass annotatedClass) {
        JsonNaming jsonNaming = (JsonNaming) annotatedClass.getAnnotation(JsonNaming.class);
        if (jsonNaming == null) {
            return null;
        }
        return jsonNaming.value();
    }

    public ObjectIdInfo findObjectIdInfo(Annotated annotated) {
        JsonIdentityInfo jsonIdentityInfo = (JsonIdentityInfo) annotated.getAnnotation(JsonIdentityInfo.class);
        if (jsonIdentityInfo != null) {
            if (jsonIdentityInfo.generator() != ObjectIdGenerators$None.class) {
                return new ObjectIdInfo(jsonIdentityInfo.property(), jsonIdentityInfo.scope(), jsonIdentityInfo.generator());
            }
        }
        return null;
    }

    public ObjectIdInfo findObjectReferenceInfo(Annotated annotated, ObjectIdInfo objectIdInfo) {
        JsonIdentityReference jsonIdentityReference = (JsonIdentityReference) annotated.getAnnotation(JsonIdentityReference.class);
        return jsonIdentityReference != null ? objectIdInfo.withAlwaysAsId(jsonIdentityReference.alwaysAsId()) : objectIdInfo;
    }

    public Class findPOJOBuilder(AnnotatedClass annotatedClass) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) annotatedClass.getAnnotation(JsonDeserialize.class);
        if (jsonDeserialize != null) {
            if (jsonDeserialize.builder() != NoClass.class) {
                return jsonDeserialize.builder();
            }
        }
        return null;
    }

    public JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass annotatedClass) {
        JsonPOJOBuilder jsonPOJOBuilder = (JsonPOJOBuilder) annotatedClass.getAnnotation(JsonPOJOBuilder.class);
        if (jsonPOJOBuilder == null) {
            return null;
        }
        return new JsonPOJOBuilder.Value(jsonPOJOBuilder);
    }

    public String[] findPropertiesToIgnore(Annotated annotated) {
        JsonIgnoreProperties jsonIgnoreProperties = (JsonIgnoreProperties) annotated.getAnnotation(JsonIgnoreProperties.class);
        if (jsonIgnoreProperties == null) {
            return null;
        }
        return jsonIgnoreProperties.value();
    }

    public TypeResolverBuilder findPropertyContentTypeResolver(MapperConfig mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.isContainerType()) {
            return _findTypeResolver(mapperConfig, annotatedMember, javaType);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Must call method with a container type (got ");
        stringBuilder.append(javaType);
        stringBuilder.append(")");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public TypeResolverBuilder findPropertyTypeResolver(MapperConfig mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.isContainerType()) {
            return null;
        }
        return _findTypeResolver(mapperConfig, annotatedMember, javaType);
    }

    public ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        JsonManagedReference jsonManagedReference = (JsonManagedReference) annotatedMember.getAnnotation(JsonManagedReference.class);
        if (jsonManagedReference != null) {
            return ReferenceProperty.managed(jsonManagedReference.value());
        }
        JsonBackReference jsonBackReference = (JsonBackReference) annotatedMember.getAnnotation(JsonBackReference.class);
        return jsonBackReference != null ? ReferenceProperty.back(jsonBackReference.value()) : null;
    }

    public PropertyName findRootName(AnnotatedClass annotatedClass) {
        JsonRootName jsonRootName = (JsonRootName) annotatedClass.getAnnotation(JsonRootName.class);
        if (jsonRootName == null) {
            return null;
        }
        return new PropertyName(jsonRootName.value());
    }

    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        JsonSerialize jsonSerialize = (JsonSerialize) annotatedMember.getAnnotation(JsonSerialize.class);
        if (jsonSerialize != null) {
            annotatedMember = jsonSerialize.contentConverter();
            if (annotatedMember != Converter$None.class) {
                return annotatedMember;
            }
        }
        return null;
    }

    public Class findSerializationContentType(Annotated annotated, JavaType javaType) {
        JsonSerialize jsonSerialize = (JsonSerialize) annotated.getAnnotation(JsonSerialize.class);
        if (jsonSerialize != null) {
            annotated = jsonSerialize.contentAs();
            if (annotated != NoClass.class) {
                return annotated;
            }
        }
        return null;
    }

    public Object findSerializationConverter(Annotated annotated) {
        JsonSerialize jsonSerialize = (JsonSerialize) annotated.getAnnotation(JsonSerialize.class);
        if (jsonSerialize != null) {
            annotated = jsonSerialize.converter();
            if (annotated != Converter$None.class) {
                return annotated;
            }
        }
        return null;
    }

    public Include findSerializationInclusion(Annotated annotated, Include include) {
        JsonInclude jsonInclude = (JsonInclude) annotated.getAnnotation(JsonInclude.class);
        if (jsonInclude != null) {
            return jsonInclude.value();
        }
        JsonSerialize jsonSerialize = (JsonSerialize) annotated.getAnnotation(JsonSerialize.class);
        if (jsonSerialize != null) {
            switch (jsonSerialize.include().ordinal()) {
                case 0:
                    return Include.ALWAYS;
                case 1:
                    return Include.NON_NULL;
                case 2:
                    return Include.NON_DEFAULT;
                case 3:
                    return Include.NON_EMPTY;
                default:
                    break;
            }
        }
        return include;
    }

    public Class findSerializationKeyType(Annotated annotated, JavaType javaType) {
        JsonSerialize jsonSerialize = (JsonSerialize) annotated.getAnnotation(JsonSerialize.class);
        if (jsonSerialize != null) {
            annotated = jsonSerialize.keyAs();
            if (annotated != NoClass.class) {
                return annotated;
            }
        }
        return null;
    }

    public String findSerializationName(AnnotatedField annotatedField) {
        JsonProperty jsonProperty = (JsonProperty) annotatedField.getAnnotation(JsonProperty.class);
        if (jsonProperty != null) {
            return jsonProperty.value();
        }
        if (!annotatedField.hasAnnotation(JsonSerialize.class)) {
            if (!annotatedField.hasAnnotation(JsonView.class)) {
                return null;
            }
        }
        return JsonProperty.USE_DEFAULT_NAME;
    }

    public String findSerializationName(AnnotatedMethod annotatedMethod) {
        JsonGetter jsonGetter = (JsonGetter) annotatedMethod.getAnnotation(JsonGetter.class);
        if (jsonGetter != null) {
            return jsonGetter.value();
        }
        JsonProperty jsonProperty = (JsonProperty) annotatedMethod.getAnnotation(JsonProperty.class);
        if (jsonProperty != null) {
            return jsonProperty.value();
        }
        if (!annotatedMethod.hasAnnotation(JsonSerialize.class)) {
            if (!annotatedMethod.hasAnnotation(JsonView.class)) {
                return null;
            }
        }
        return JsonProperty.USE_DEFAULT_NAME;
    }

    public String[] findSerializationPropertyOrder(AnnotatedClass annotatedClass) {
        JsonPropertyOrder jsonPropertyOrder = (JsonPropertyOrder) annotatedClass.getAnnotation(JsonPropertyOrder.class);
        if (jsonPropertyOrder == null) {
            return null;
        }
        return jsonPropertyOrder.value();
    }

    public Boolean findSerializationSortAlphabetically(AnnotatedClass annotatedClass) {
        JsonPropertyOrder jsonPropertyOrder = (JsonPropertyOrder) annotatedClass.getAnnotation(JsonPropertyOrder.class);
        if (jsonPropertyOrder == null) {
            return null;
        }
        return Boolean.valueOf(jsonPropertyOrder.alphabetic());
    }

    public Class findSerializationType(Annotated annotated) {
        JsonSerialize jsonSerialize = (JsonSerialize) annotated.getAnnotation(JsonSerialize.class);
        if (jsonSerialize != null) {
            annotated = jsonSerialize.as();
            if (annotated != NoClass.class) {
                return annotated;
            }
        }
        return null;
    }

    public Typing findSerializationTyping(Annotated annotated) {
        JsonSerialize jsonSerialize = (JsonSerialize) annotated.getAnnotation(JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return jsonSerialize.typing();
    }

    public Object findSerializer(Annotated annotated) {
        JsonSerialize jsonSerialize = (JsonSerialize) annotated.getAnnotation(JsonSerialize.class);
        if (jsonSerialize != null) {
            Class using = jsonSerialize.using();
            if (using != JsonSerializer.None.class) {
                return using;
            }
        }
        JsonRawValue jsonRawValue = (JsonRawValue) annotated.getAnnotation(JsonRawValue.class);
        return (jsonRawValue == null || !jsonRawValue.value()) ? null : new RawSerializer(annotated.getRawType());
    }

    public List findSubtypes(Annotated annotated) {
        JsonSubTypes jsonSubTypes = (JsonSubTypes) annotated.getAnnotation(JsonSubTypes.class);
        if (jsonSubTypes == null) {
            return null;
        }
        annotated = jsonSubTypes.value();
        List arrayList = new ArrayList(annotated.length);
        for (Type type : annotated) {
            arrayList.add(new NamedType(type.value(), type.name()));
        }
        return arrayList;
    }

    public String findTypeName(AnnotatedClass annotatedClass) {
        JsonTypeName jsonTypeName = (JsonTypeName) annotatedClass.getAnnotation(JsonTypeName.class);
        if (jsonTypeName == null) {
            return null;
        }
        return jsonTypeName.value();
    }

    public TypeResolverBuilder findTypeResolver(MapperConfig mapperConfig, AnnotatedClass annotatedClass, JavaType javaType) {
        return _findTypeResolver(mapperConfig, annotatedClass, javaType);
    }

    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        JsonUnwrapped jsonUnwrapped = (JsonUnwrapped) annotatedMember.getAnnotation(JsonUnwrapped.class);
        if (jsonUnwrapped != null) {
            if (jsonUnwrapped.enabled()) {
                return NameTransformer.simpleTransformer(jsonUnwrapped.prefix(), jsonUnwrapped.suffix());
            }
        }
        return null;
    }

    public Object findValueInstantiator(AnnotatedClass annotatedClass) {
        JsonValueInstantiator jsonValueInstantiator = (JsonValueInstantiator) annotatedClass.getAnnotation(JsonValueInstantiator.class);
        if (jsonValueInstantiator == null) {
            return null;
        }
        return jsonValueInstantiator.value();
    }

    public Class[] findViews(Annotated annotated) {
        JsonView jsonView = (JsonView) annotated.getAnnotation(JsonView.class);
        if (jsonView == null) {
            return null;
        }
        return jsonView.value();
    }

    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        return annotatedMethod.hasAnnotation(JsonAnyGetter.class);
    }

    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedMethod) {
        return annotatedMethod.hasAnnotation(JsonAnySetter.class);
    }

    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        JsonValue jsonValue = (JsonValue) annotatedMethod.getAnnotation(JsonValue.class);
        return jsonValue != null && jsonValue.value();
    }

    public boolean hasCreatorAnnotation(Annotated annotated) {
        return annotated.hasAnnotation(JsonCreator.class);
    }

    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return _isIgnorable(annotatedMember);
    }

    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        JsonProperty jsonProperty = (JsonProperty) annotatedMember.getAnnotation(JsonProperty.class);
        return jsonProperty != null ? Boolean.valueOf(jsonProperty.required()) : null;
    }

    public boolean isAnnotationBundle(Annotation annotation) {
        return annotation.annotationType().getAnnotation(JacksonAnnotationsInside.class) != null;
    }

    public boolean isHandled(Annotation annotation) {
        return annotation.annotationType().getAnnotation(JacksonAnnotation.class) != null;
    }

    public Boolean isIgnorableType(AnnotatedClass annotatedClass) {
        JsonIgnoreType jsonIgnoreType = (JsonIgnoreType) annotatedClass.getAnnotation(JsonIgnoreType.class);
        if (jsonIgnoreType == null) {
            return null;
        }
        return Boolean.valueOf(jsonIgnoreType.value());
    }

    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        return Boolean.valueOf(annotatedMember.hasAnnotation(JsonTypeId.class));
    }

    public Version version() {
        return PackageVersion.VERSION;
    }
}
