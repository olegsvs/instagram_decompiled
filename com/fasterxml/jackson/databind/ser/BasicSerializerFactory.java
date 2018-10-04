package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumMapSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSerializer;
import com.fasterxml.jackson.databind.ser.std.InetAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.SqlDateSerializer;
import com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;
import com.fasterxml.jackson.databind.ser.std.StdContainerSerializers;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.EnumValues;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.RandomAccess;
import java.util.TimeZone;

public abstract class BasicSerializerFactory extends SerializerFactory implements Serializable {
    public static final HashMap _concrete = new HashMap();
    public static final HashMap _concreteLazy = new HashMap();
    public final SerializerFactoryConfig _factoryConfig;

    public abstract JsonSerializer createSerializer(SerializerProvider serializerProvider, JavaType javaType);

    public abstract Iterable customSerializers();

    public abstract SerializerFactory withConfig(SerializerFactoryConfig serializerFactoryConfig);

    static {
        _concrete.put(String.class.getName(), new StringSerializer());
        ToStringSerializer toStringSerializer = ToStringSerializer.instance;
        Map map = _concrete;
        map.put(StringBuffer.class.getName(), toStringSerializer);
        map.put(StringBuilder.class.getName(), toStringSerializer);
        map.put(Character.class.getName(), toStringSerializer);
        map.put(Character.TYPE.getName(), toStringSerializer);
        HashMap hashMap = _concrete;
        NumberSerializers.addAll(map);
        hashMap.put(Boolean.TYPE.getName(), new BooleanSerializer(true));
        hashMap.put(Boolean.class.getName(), new BooleanSerializer(false));
        NumberSerializers$NumberSerializer numberSerializers$NumberSerializer = new NumberSerializers$NumberSerializer();
        hashMap.put(BigInteger.class.getName(), numberSerializers$NumberSerializer);
        hashMap.put(BigDecimal.class.getName(), numberSerializers$NumberSerializer);
        hashMap.put(Calendar.class.getName(), CalendarSerializer.instance);
        DateSerializer dateSerializer = DateSerializer.instance;
        hashMap.put(Date.class.getName(), dateSerializer);
        hashMap.put(Timestamp.class.getName(), dateSerializer);
        HashMap hashMap2 = _concreteLazy;
        hashMap2.put(java.sql.Date.class.getName(), SqlDateSerializer.class);
        hashMap2.put(Time.class.getName(), SqlTimeSerializer.class);
        for (Entry entry : StdJdkSerializers.all()) {
            Object value = entry.getValue();
            if (value instanceof JsonSerializer) {
                _concrete.put(((Class) entry.getKey()).getName(), (JsonSerializer) value);
            } else if (value instanceof Class) {
                _concreteLazy.put(((Class) entry.getKey()).getName(), (Class) value);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Internal error: unrecognized value of type ");
                stringBuilder.append(entry.getClass().getName());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        _concreteLazy.put(TokenBuffer.class.getName(), TokenBufferSerializer.class);
    }

    public BasicSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        if (serializerFactoryConfig == null) {
            serializerFactoryConfig = new SerializerFactoryConfig();
        }
        this._factoryConfig = serializerFactoryConfig;
    }

    public JsonSerializer _findContentSerializer(SerializerProvider serializerProvider, Annotated annotated) {
        Object findContentSerializer = serializerProvider.getAnnotationIntrospector().findContentSerializer(annotated);
        return findContentSerializer != null ? serializerProvider.serializerInstance(annotated, findContentSerializer) : null;
    }

    public JsonSerializer _findKeySerializer(SerializerProvider serializerProvider, Annotated annotated) {
        Object findKeySerializer = serializerProvider.getAnnotationIntrospector().findKeySerializer(annotated);
        return findKeySerializer != null ? serializerProvider.serializerInstance(annotated, findKeySerializer) : null;
    }

    public Class _verifyAsClass(Object obj, String str, Class cls) {
        if (obj != null) {
            if (obj instanceof Class) {
                Class cls2 = (Class) obj;
                if (cls2 != cls) {
                    if (cls2 != NoClass.class) {
                        return cls2;
                    }
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("AnnotationIntrospector.");
                stringBuilder.append(str);
                stringBuilder.append("() returned value of type ");
                stringBuilder.append(obj.getClass().getName());
                stringBuilder.append(": expected type JsonSerializer or Class<JsonSerializer> instead");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        return null;
    }

    public JsonSerializer buildArraySerializer(SerializationConfig serializationConfig, ArrayType arrayType, BeanDescription beanDescription, boolean z, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        Iterator it = customSerializers().iterator();
        JsonSerializer jsonSerializer2 = null;
        do {
            SerializationConfig serializationConfig2 = serializationConfig;
            ArrayType arrayType2 = arrayType;
            BeanDescription beanDescription2 = beanDescription;
            TypeSerializer typeSerializer2 = typeSerializer;
            JsonSerializer jsonSerializer3 = jsonSerializer;
            if (!it.hasNext()) {
                break;
            }
            jsonSerializer2 = ((Serializers) it.next()).findArraySerializer(serializationConfig2, arrayType2, beanDescription2, typeSerializer2, jsonSerializer3);
        } while (jsonSerializer2 == null);
        if (jsonSerializer2 == null) {
            Class rawClass = arrayType.getRawClass();
            if (jsonSerializer == null || ClassUtil.isJacksonStdImpl(jsonSerializer)) {
                if (String[].class == rawClass) {
                    jsonSerializer2 = StringArraySerializer.instance;
                } else {
                    jsonSerializer2 = StdArraySerializers.findStandardImpl(rawClass);
                }
            }
            if (jsonSerializer2 == null) {
                jsonSerializer2 = new ObjectArraySerializer(arrayType.getContentType(), z, typeSerializer, jsonSerializer);
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            for (BeanSerializerModifier modifyArraySerializer : this._factoryConfig.serializerModifiers()) {
                jsonSerializer2 = modifyArraySerializer.modifyArraySerializer(serializationConfig, arrayType, beanDescription, jsonSerializer2);
            }
        }
        return jsonSerializer2;
    }

    public final JsonSerializer buildCollectionSerializer(SerializationConfig serializationConfig, CollectionType collectionType, BeanDescription beanDescription, BeanProperty beanProperty, boolean z, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        return buildCollectionSerializer(serializationConfig, collectionType, beanDescription, z, typeSerializer, jsonSerializer);
    }

    public JsonSerializer buildCollectionSerializer(SerializationConfig serializationConfig, CollectionType collectionType, BeanDescription beanDescription, boolean z, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        Iterator it = customSerializers().iterator();
        JsonSerializer jsonSerializer2 = null;
        do {
            SerializationConfig serializationConfig2 = serializationConfig;
            CollectionType collectionType2 = collectionType;
            BeanDescription beanDescription2 = beanDescription;
            TypeSerializer typeSerializer2 = typeSerializer;
            JsonSerializer jsonSerializer3 = jsonSerializer;
            if (!it.hasNext()) {
                break;
            }
            jsonSerializer2 = ((Serializers) it.next()).findCollectionSerializer(serializationConfig2, collectionType2, beanDescription2, typeSerializer2, jsonSerializer3);
        } while (jsonSerializer2 == null);
        if (jsonSerializer2 == null) {
            Value findExpectedFormat = beanDescription.findExpectedFormat(null);
            if (findExpectedFormat != null && findExpectedFormat.getShape() == Shape.OBJECT) {
                return null;
            }
            Class rawClass = collectionType.getRawClass();
            if (EnumSet.class.isAssignableFrom(rawClass)) {
                JavaType contentType = collectionType.getContentType();
                if (!contentType.isEnumType()) {
                    contentType = null;
                }
                jsonSerializer2 = StdContainerSerializers.enumSetSerializer(contentType);
            } else {
                Class rawClass2 = collectionType.getContentType().getRawClass();
                if (isIndexedList(rawClass)) {
                    if (rawClass2 != String.class) {
                        jsonSerializer2 = StdContainerSerializers.indexedListSerializer(collectionType.getContentType(), z, typeSerializer2, jsonSerializer3);
                    } else if (jsonSerializer == null || ClassUtil.isJacksonStdImpl(jsonSerializer3)) {
                        jsonSerializer2 = IndexedStringListSerializer.instance;
                    }
                } else if (rawClass2 == String.class && (jsonSerializer == null || ClassUtil.isJacksonStdImpl(jsonSerializer3))) {
                    jsonSerializer2 = StringCollectionSerializer.instance;
                }
                if (jsonSerializer2 == null) {
                    jsonSerializer2 = StdContainerSerializers.collectionSerializer(collectionType.getContentType(), z, typeSerializer2, jsonSerializer3);
                }
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            for (BeanSerializerModifier modifyCollectionSerializer : this._factoryConfig.serializerModifiers()) {
                jsonSerializer2 = modifyCollectionSerializer.modifyCollectionSerializer(serializationConfig, collectionType, beanDescription, jsonSerializer2);
            }
        }
        return jsonSerializer2;
    }

    public final JsonSerializer buildContainerSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, BeanProperty beanProperty, boolean z) {
        return buildContainerSerializer(serializerProvider, javaType, beanDescription, z);
    }

    public JsonSerializer buildContainerSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) {
        JsonSerializer findMapLikeSerializer;
        ResolvedType resolvedType = javaType;
        boolean z2 = z;
        SerializationConfig config = serializerProvider.getConfig();
        if (!(z || !resolvedType.useStaticType() || (resolvedType.isContainerType() && resolvedType.getContentType().getRawClass() == Object.class))) {
            z2 = true;
        }
        BasicSerializerFactory basicSerializerFactory = this;
        TypeSerializer createTypeSerializer = createTypeSerializer(config, resolvedType.getContentType());
        if (createTypeSerializer != null) {
            z2 = false;
        }
        BeanDescription beanDescription2 = beanDescription;
        JsonSerializer _findContentSerializer = _findContentSerializer(serializerProvider, beanDescription2.getClassInfo());
        if (resolvedType.isMapLikeType()) {
            MapLikeType mapLikeType = (MapLikeType) resolvedType;
            JsonSerializer _findKeySerializer = _findKeySerializer(serializerProvider, beanDescription2.getClassInfo());
            if (mapLikeType.isTrueMapType()) {
                return buildMapSerializer(config, (MapType) mapLikeType, beanDescription2, z2, _findKeySerializer, createTypeSerializer, _findContentSerializer);
            }
            for (Serializers findMapLikeSerializer2 : customSerializers()) {
                findMapLikeSerializer = findMapLikeSerializer2.findMapLikeSerializer(config, mapLikeType, beanDescription2, _findKeySerializer, createTypeSerializer, _findContentSerializer);
                if (findMapLikeSerializer != null) {
                    if (basicSerializerFactory._factoryConfig.hasSerializerModifiers()) {
                        for (BeanSerializerModifier modifyMapLikeSerializer : basicSerializerFactory._factoryConfig.serializerModifiers()) {
                            findMapLikeSerializer = modifyMapLikeSerializer.modifyMapLikeSerializer(config, mapLikeType, beanDescription2, findMapLikeSerializer);
                        }
                    }
                }
            }
            return null;
        }
        if (resolvedType.isCollectionLikeType()) {
            CollectionLikeType collectionLikeType = (CollectionLikeType) resolvedType;
            if (collectionLikeType.isTrueCollectionType()) {
                return buildCollectionSerializer(config, (CollectionType) collectionLikeType, beanDescription2, z2, createTypeSerializer, _findContentSerializer);
            }
            for (Serializers findMapLikeSerializer22 : customSerializers()) {
                findMapLikeSerializer = findMapLikeSerializer22.findCollectionLikeSerializer(config, collectionLikeType, beanDescription2, createTypeSerializer, _findContentSerializer);
                if (findMapLikeSerializer != null) {
                    if (basicSerializerFactory._factoryConfig.hasSerializerModifiers()) {
                        for (BeanSerializerModifier modifyMapLikeSerializer2 : basicSerializerFactory._factoryConfig.serializerModifiers()) {
                            findMapLikeSerializer = modifyMapLikeSerializer2.modifyCollectionLikeSerializer(config, collectionLikeType, beanDescription2, findMapLikeSerializer);
                        }
                    }
                }
            }
        } else if (resolvedType.isArrayType()) {
            return buildArraySerializer(config, (ArrayType) resolvedType, beanDescription2, z2, createTypeSerializer, _findContentSerializer);
        }
        return null;
        return findMapLikeSerializer;
    }

    public JsonSerializer buildEnumSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription) {
        Value findExpectedFormat = beanDescription.findExpectedFormat(null);
        if (findExpectedFormat == null || findExpectedFormat.getShape() != Shape.OBJECT) {
            JsonSerializer construct = EnumSerializer.construct(javaType.getRawClass(), serializationConfig, beanDescription, findExpectedFormat);
            if (this._factoryConfig.hasSerializerModifiers()) {
                for (BeanSerializerModifier modifyEnumSerializer : this._factoryConfig.serializerModifiers()) {
                    construct = modifyEnumSerializer.modifyEnumSerializer(serializationConfig, javaType, beanDescription, construct);
                }
            }
            return construct;
        }
        ((BasicBeanDescription) beanDescription).removeProperty("declaringClass");
        return null;
    }

    public JsonSerializer buildIterableSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription, boolean z) {
        JavaType containedType = javaType.containedType(0);
        if (containedType == null) {
            containedType = TypeFactory.unknownType();
        }
        TypeSerializer createTypeSerializer = createTypeSerializer(serializationConfig, containedType);
        return StdContainerSerializers.iterableSerializer(containedType, usesStaticTyping(serializationConfig, beanDescription, createTypeSerializer), createTypeSerializer);
    }

    public JsonSerializer buildIteratorSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription, boolean z) {
        JavaType containedType = javaType.containedType(0);
        if (containedType == null) {
            containedType = TypeFactory.unknownType();
        }
        TypeSerializer createTypeSerializer = createTypeSerializer(serializationConfig, containedType);
        return StdContainerSerializers.iteratorSerializer(containedType, usesStaticTyping(serializationConfig, beanDescription, createTypeSerializer), createTypeSerializer);
    }

    public JsonSerializer buildMapSerializer(SerializationConfig serializationConfig, MapType mapType, BeanDescription beanDescription, boolean z, JsonSerializer jsonSerializer, TypeSerializer typeSerializer, JsonSerializer jsonSerializer2) {
        Iterator it = customSerializers().iterator();
        EnumValues enumValues = null;
        JsonSerializer jsonSerializer3 = null;
        do {
            MapperConfig mapperConfig = serializationConfig;
            ResolvedType resolvedType = mapType;
            BeanDescription beanDescription2 = beanDescription;
            JsonSerializer jsonSerializer4 = jsonSerializer;
            TypeSerializer typeSerializer2 = typeSerializer;
            JsonSerializer jsonSerializer5 = jsonSerializer2;
            if (!it.hasNext()) {
                break;
            }
            jsonSerializer3 = ((Serializers) it.next()).findMapSerializer(mapperConfig, resolvedType, beanDescription2, jsonSerializer4, typeSerializer2, jsonSerializer5);
        } while (jsonSerializer3 == null);
        if (jsonSerializer3 == null) {
            boolean z2 = z;
            if (EnumMap.class.isAssignableFrom(resolvedType.getRawClass())) {
                ResolvedType keyType = resolvedType.getKeyType();
                if (keyType.isEnumType()) {
                    enumValues = EnumValues.constructFromName(keyType.getRawClass(), mapperConfig.getAnnotationIntrospector());
                }
                jsonSerializer3 = new EnumMapSerializer(resolvedType.getContentType(), z2, enumValues, typeSerializer2, jsonSerializer5);
            } else {
                jsonSerializer3 = MapSerializer.construct(mapperConfig.getAnnotationIntrospector().findPropertiesToIgnore(beanDescription2.getClassInfo()), resolvedType, z2, typeSerializer2, jsonSerializer4, jsonSerializer5);
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            for (BeanSerializerModifier modifyMapSerializer : this._factoryConfig.serializerModifiers()) {
                jsonSerializer3 = modifyMapSerializer.modifyMapSerializer(mapperConfig, resolvedType, beanDescription2, jsonSerializer3);
            }
        }
        return jsonSerializer3;
    }

    public JsonSerializer createKeySerializer(SerializationConfig serializationConfig, JavaType javaType, JsonSerializer jsonSerializer) {
        BeanDescription introspectClassAnnotations = serializationConfig.introspectClassAnnotations(javaType.getRawClass());
        JsonSerializer jsonSerializer2 = null;
        if (this._factoryConfig.hasKeySerializers()) {
            for (Serializers findSerializer : this._factoryConfig.keySerializers()) {
                jsonSerializer2 = findSerializer.findSerializer(serializationConfig, javaType, introspectClassAnnotations);
                if (jsonSerializer2 != null) {
                    break;
                }
            }
        }
        if (jsonSerializer2 != null) {
            jsonSerializer = jsonSerializer2;
        } else if (jsonSerializer == null) {
            jsonSerializer = StdKeySerializers.getStdKeySerializer(javaType);
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            for (BeanSerializerModifier modifyKeySerializer : this._factoryConfig.serializerModifiers()) {
                jsonSerializer = modifyKeySerializer.modifyKeySerializer(serializationConfig, javaType, introspectClassAnnotations, jsonSerializer);
            }
        }
        return jsonSerializer;
    }

    public TypeSerializer createTypeSerializer(SerializationConfig serializationConfig, JavaType javaType) {
        Collection collection;
        AnnotatedClass classInfo = serializationConfig.introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        AnnotationIntrospector annotationIntrospector = serializationConfig.getAnnotationIntrospector();
        TypeResolverBuilder findTypeResolver = annotationIntrospector.findTypeResolver(serializationConfig, classInfo, javaType);
        if (findTypeResolver == null) {
            findTypeResolver = serializationConfig.getDefaultTyper(javaType);
            collection = null;
        } else {
            collection = serializationConfig.getSubtypeResolver().collectAndResolveSubtypes(classInfo, serializationConfig, annotationIntrospector);
        }
        if (findTypeResolver == null) {
            return null;
        }
        return findTypeResolver.buildTypeSerializer(serializationConfig, javaType, collection);
    }

    public Converter findConverter(SerializerProvider serializerProvider, Annotated annotated) {
        Object findSerializationConverter = serializerProvider.getAnnotationIntrospector().findSerializationConverter(annotated);
        if (findSerializationConverter == null) {
            return null;
        }
        return serializerProvider.converterInstance(annotated, findSerializationConverter);
    }

    public JsonSerializer findConvertingSerializer(SerializerProvider serializerProvider, Annotated annotated, JsonSerializer jsonSerializer) {
        annotated = findConverter(serializerProvider, annotated);
        if (annotated == null) {
            return jsonSerializer;
        }
        return new StdDelegatingSerializer(annotated, annotated.getOutputType(serializerProvider.getTypeFactory()), jsonSerializer);
    }

    public JsonSerializer findOptionalStdSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) {
        return OptionalHandlerFactory.instance.findSerializer(serializerProvider.getConfig(), javaType, beanDescription);
    }

    public final JsonSerializer findSerializerByAddonType(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription, boolean z) {
        Class rawClass = javaType.getRawClass();
        if (Iterator.class.isAssignableFrom(rawClass)) {
            return buildIteratorSerializer(serializationConfig, javaType, beanDescription, z);
        }
        if (Iterable.class.isAssignableFrom(rawClass)) {
            return buildIterableSerializer(serializationConfig, javaType, beanDescription, z);
        }
        return CharSequence.class.isAssignableFrom(rawClass) ? ToStringSerializer.instance : null;
    }

    public final JsonSerializer findSerializerByAnnotations(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription) {
        if (JsonSerializable.class.isAssignableFrom(javaType.getRawClass())) {
            return SerializableSerializer.instance;
        }
        Annotated findJsonValueMethod = beanDescription.findJsonValueMethod();
        if (findJsonValueMethod == null) {
            return null;
        }
        Object annotated = findJsonValueMethod.getAnnotated();
        if (serializerProvider.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotated);
        }
        return new JsonValueSerializer(annotated, findSerializerFromAnnotation(serializerProvider, findJsonValueMethod));
    }

    public final JsonSerializer findSerializerByLookup(JavaType javaType, SerializationConfig serializationConfig, BeanDescription beanDescription, boolean z) {
        serializationConfig = javaType.getRawClass().getName();
        JsonSerializer jsonSerializer = (JsonSerializer) _concrete.get(serializationConfig);
        if (jsonSerializer == null) {
            Class cls = (Class) _concreteLazy.get(serializationConfig);
            if (cls != null) {
                try {
                    return (JsonSerializer) cls.newInstance();
                } catch (BeanDescription beanDescription2) {
                    javaType = new StringBuilder();
                    javaType.append("Failed to instantiate standard serializer (of type ");
                    javaType.append(cls.getName());
                    javaType.append("): ");
                    javaType.append(beanDescription2.getMessage());
                    throw new IllegalStateException(javaType.toString(), beanDescription2);
                }
            }
        }
        return jsonSerializer;
    }

    public final JsonSerializer findSerializerByPrimaryType(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) {
        Class rawClass = javaType.getRawClass();
        if (InetAddress.class.isAssignableFrom(rawClass)) {
            return InetAddressSerializer.instance;
        }
        if (TimeZone.class.isAssignableFrom(rawClass)) {
            return TimeZoneSerializer.instance;
        }
        if (Charset.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        JsonSerializer findOptionalStdSerializer = findOptionalStdSerializer(serializerProvider, javaType, beanDescription, z);
        if (findOptionalStdSerializer != null) {
            return findOptionalStdSerializer;
        }
        if (Number.class.isAssignableFrom(rawClass)) {
            return NumberSerializers$NumberSerializer.instance;
        }
        if (Enum.class.isAssignableFrom(rawClass)) {
            return buildEnumSerializer(serializerProvider.getConfig(), javaType, beanDescription);
        }
        if (Calendar.class.isAssignableFrom(rawClass)) {
            return CalendarSerializer.instance;
        }
        return Date.class.isAssignableFrom(rawClass) ? DateSerializer.instance : null;
    }

    public JsonSerializer findSerializerFromAnnotation(SerializerProvider serializerProvider, Annotated annotated) {
        Object findSerializer = serializerProvider.getAnnotationIntrospector().findSerializer(annotated);
        if (findSerializer == null) {
            return null;
        }
        return findConvertingSerializer(serializerProvider, annotated, serializerProvider.serializerInstance(annotated, findSerializer));
    }

    public SerializerFactoryConfig getFactoryConfig() {
        return this._factoryConfig;
    }

    public final JsonSerializer getNullSerializer() {
        return NullSerializer.instance;
    }

    public boolean isIndexedList(Class cls) {
        return RandomAccess.class.isAssignableFrom(cls);
    }

    public static JavaType modifySecondaryTypesByAnnotation(SerializationConfig serializationConfig, Annotated annotated, JavaType javaType) {
        StringBuilder stringBuilder;
        AnnotationIntrospector annotationIntrospector = serializationConfig.getAnnotationIntrospector();
        if (!javaType.isContainerType()) {
            return javaType;
        }
        serializationConfig = annotationIntrospector.findSerializationKeyType(annotated, javaType.getKeyType());
        if (serializationConfig != null) {
            if (javaType instanceof MapType) {
                try {
                    javaType = ((MapType) javaType).widenKey(serializationConfig);
                } catch (IllegalArgumentException e) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed to narrow key type ");
                    stringBuilder.append(javaType);
                    stringBuilder.append(" with key-type annotation (");
                    stringBuilder.append(serializationConfig.getName());
                    stringBuilder.append("): ");
                    stringBuilder.append(e.getMessage());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal key-type annotation: type ");
            stringBuilder.append(javaType);
            stringBuilder.append(" is not a Map type");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        serializationConfig = annotationIntrospector.findSerializationContentType(annotated, javaType.getContentType());
        if (serializationConfig == null) {
            return javaType;
        }
        try {
            javaType = javaType.widenContentsBy(serializationConfig);
            return javaType;
        } catch (IllegalArgumentException e2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to narrow content type ");
            stringBuilder.append(javaType);
            stringBuilder.append(" with content-type annotation (");
            stringBuilder.append(serializationConfig.getName());
            stringBuilder.append("): ");
            stringBuilder.append(e2.getMessage());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public JavaType modifyTypeByAnnotation(SerializationConfig serializationConfig, Annotated annotated, JavaType javaType) {
        Class findSerializationType = serializationConfig.getAnnotationIntrospector().findSerializationType(annotated);
        if (findSerializationType != null) {
            try {
                javaType = javaType.widenBy(findSerializationType);
            } catch (IllegalArgumentException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to widen type ");
                stringBuilder.append(javaType);
                stringBuilder.append(" with concrete-type annotation (value ");
                stringBuilder.append(findSerializationType.getName());
                stringBuilder.append("), method '");
                stringBuilder.append(annotated.getName());
                stringBuilder.append("': ");
                stringBuilder.append(e.getMessage());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return modifySecondaryTypesByAnnotation(serializationConfig, annotated, javaType);
    }

    public boolean usesStaticTyping(SerializationConfig serializationConfig, BeanDescription beanDescription, TypeSerializer typeSerializer) {
        boolean z = false;
        if (typeSerializer == null) {
            Typing findSerializationTyping = serializationConfig.getAnnotationIntrospector().findSerializationTyping(beanDescription.getClassInfo());
            if (findSerializationTyping == null) {
                return serializationConfig.isEnabled(MapperFeature.USE_STATIC_TYPING);
            }
            if (findSerializationTyping == Typing.STATIC) {
                z = true;
            }
        }
        return z;
    }

    public final boolean usesStaticTyping(SerializationConfig serializationConfig, BeanDescription beanDescription, TypeSerializer typeSerializer, BeanProperty beanProperty) {
        return usesStaticTyping(serializationConfig, beanDescription, typeSerializer);
    }

    public final SerializerFactory withAdditionalKeySerializers(Serializers serializers) {
        return withConfig(this._factoryConfig.withAdditionalKeySerializers(serializers));
    }

    public final SerializerFactory withAdditionalSerializers(Serializers serializers) {
        return withConfig(this._factoryConfig.withAdditionalSerializers(serializers));
    }

    public final SerializerFactory withSerializerModifier(BeanSerializerModifier beanSerializerModifier) {
        return withConfig(this._factoryConfig.withSerializerModifier(beanSerializerModifier));
    }
}
