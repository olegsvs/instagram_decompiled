package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonDeserializer$None;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public final class DeserializerCache implements Serializable {
    private static final long serialVersionUID = 1;
    public final ConcurrentHashMap _cachedDeserializers = new ConcurrentHashMap(64, 0.75f, 2);
    public final HashMap _incompleteDeserializers = new HashMap(8);

    public JsonDeserializer _createAndCache2(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) {
        try {
            JsonDeserializer _createDeserializer = _createDeserializer(deserializationContext, deserializerFactory, javaType);
            if (_createDeserializer == null) {
                return null;
            }
            boolean z = _createDeserializer instanceof ResolvableDeserializer;
            boolean isCachable = _createDeserializer.isCachable();
            if (z) {
                this._incompleteDeserializers.put(javaType, _createDeserializer);
                ((ResolvableDeserializer) _createDeserializer).resolve(deserializationContext);
                this._incompleteDeserializers.remove(javaType);
            }
            if (isCachable) {
                this._cachedDeserializers.put(javaType, _createDeserializer);
            }
            return _createDeserializer;
        } catch (Throwable e) {
            throw new JsonMappingException(e.getMessage(), null, e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonDeserializer _createAndCacheValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext r5, com.fasterxml.jackson.databind.deser.DeserializerFactory r6, com.fasterxml.jackson.databind.JavaType r7) {
        /*
        r4 = this;
        r2 = r4._incompleteDeserializers;
        monitor-enter(r2);
        r0 = r4._findCachedDeserializer(r7);	 Catch:{ all -> 0x0045 }
        if (r0 == 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r2);	 Catch:{ all -> 0x0045 }
    L_0x000a:
        return r0;
    L_0x000b:
        r0 = r4._incompleteDeserializers;	 Catch:{ all -> 0x0045 }
        r3 = r0.size();	 Catch:{ all -> 0x0045 }
        if (r3 <= 0) goto L_0x001f;
    L_0x0013:
        r0 = r4._incompleteDeserializers;	 Catch:{ all -> 0x0045 }
        r0 = r0.get(r7);	 Catch:{ all -> 0x0045 }
        r0 = (com.fasterxml.jackson.databind.JsonDeserializer) r0;	 Catch:{ all -> 0x0045 }
        if (r0 == 0) goto L_0x001f;
    L_0x001d:
        monitor-exit(r2);	 Catch:{ all -> 0x0045 }
        goto L_0x000a;
    L_0x001f:
        r1 = r4._createAndCache2(r5, r6, r7);	 Catch:{ all -> 0x0034 }
        if (r3 != 0) goto L_0x0032;
    L_0x0025:
        r0 = r4._incompleteDeserializers;	 Catch:{ all -> 0x0045 }
        r0 = r0.size();	 Catch:{ all -> 0x0045 }
        if (r0 <= 0) goto L_0x0032;
    L_0x002d:
        r0 = r4._incompleteDeserializers;	 Catch:{ all -> 0x0045 }
        r0.clear();	 Catch:{ all -> 0x0045 }
    L_0x0032:
        monitor-exit(r2);	 Catch:{ all -> 0x0045 }
        return r1;
    L_0x0034:
        r1 = move-exception;
        if (r3 != 0) goto L_0x0044;
    L_0x0037:
        r0 = r4._incompleteDeserializers;	 Catch:{ all -> 0x0045 }
        r0 = r0.size();	 Catch:{ all -> 0x0045 }
        if (r0 <= 0) goto L_0x0044;
    L_0x003f:
        r0 = r4._incompleteDeserializers;	 Catch:{ all -> 0x0045 }
        r0.clear();	 Catch:{ all -> 0x0045 }
    L_0x0044:
        throw r1;	 Catch:{ all -> 0x0045 }
    L_0x0045:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0045 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCacheValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    public JsonDeserializer _createDeserializer(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) {
        DeserializationConfig config = deserializationContext.getConfig();
        if (javaType.isAbstract() || javaType.isMapLikeType() || javaType.isCollectionLikeType()) {
            javaType = deserializerFactory.mapAbstractType(config, javaType);
        }
        BeanDescription introspect = config.introspect(javaType);
        JsonDeserializer findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, introspect.getClassInfo());
        if (findDeserializerFromAnnotation != null) {
            return findDeserializerFromAnnotation;
        }
        JavaType modifyTypeByAnnotation = modifyTypeByAnnotation(deserializationContext, introspect.getClassInfo(), javaType);
        if (modifyTypeByAnnotation != javaType) {
            introspect = config.introspect(modifyTypeByAnnotation);
            javaType = modifyTypeByAnnotation;
        }
        Class findPOJOBuilder = introspect.findPOJOBuilder();
        if (findPOJOBuilder != null) {
            return deserializerFactory.createBuilderBasedDeserializer(deserializationContext, javaType, introspect, findPOJOBuilder);
        }
        Converter findDeserializationConverter = introspect.findDeserializationConverter();
        if (findDeserializationConverter == null) {
            return _createDeserializer2(deserializationContext, deserializerFactory, javaType, introspect);
        }
        ResolvedType inputType = findDeserializationConverter.getInputType(deserializationContext.getTypeFactory());
        if (!inputType.hasRawClass(javaType.getRawClass())) {
            introspect = config.introspect(inputType);
        }
        return new StdDelegatingDeserializer(findDeserializationConverter, inputType, _createDeserializer2(deserializationContext, deserializerFactory, inputType, introspect));
    }

    public JsonDeserializer _createDeserializer2(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType, BeanDescription beanDescription) {
        DeserializationConfig config = deserializationContext.getConfig();
        if (javaType.isEnumType()) {
            return deserializerFactory.createEnumDeserializer(deserializationContext, javaType, beanDescription);
        }
        if (javaType.isContainerType()) {
            if (javaType.isArrayType()) {
                return deserializerFactory.createArrayDeserializer(deserializationContext, (ArrayType) javaType, beanDescription);
            }
            if (javaType.isMapLikeType()) {
                MapLikeType mapLikeType = (MapLikeType) javaType;
                if (mapLikeType.isTrueMapType()) {
                    return deserializerFactory.createMapDeserializer(deserializationContext, (MapType) mapLikeType, beanDescription);
                }
                return deserializerFactory.createMapLikeDeserializer(deserializationContext, mapLikeType, beanDescription);
            } else if (javaType.isCollectionLikeType()) {
                Value findExpectedFormat = beanDescription.findExpectedFormat(null);
                if (findExpectedFormat == null || findExpectedFormat.getShape() != Shape.OBJECT) {
                    CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
                    if (collectionLikeType.isTrueCollectionType()) {
                        return deserializerFactory.createCollectionDeserializer(deserializationContext, (CollectionType) collectionLikeType, beanDescription);
                    }
                    return deserializerFactory.createCollectionLikeDeserializer(deserializationContext, collectionLikeType, beanDescription);
                }
            }
        }
        if (JsonNode.class.isAssignableFrom(javaType.getRawClass())) {
            return deserializerFactory.createTreeDeserializer(config, javaType, beanDescription);
        }
        return deserializerFactory.createBeanDeserializer(deserializationContext, javaType, beanDescription);
    }

    public JsonDeserializer _findCachedDeserializer(JavaType javaType) {
        if (javaType != null) {
            return (JsonDeserializer) this._cachedDeserializers.get(javaType);
        }
        throw new IllegalArgumentException("Null JavaType passed");
    }

    public KeyDeserializer _handleUnknownKeyDeserializer(JavaType javaType) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not find a (Map) Key deserializer for type ");
        stringBuilder.append(javaType);
        throw new JsonMappingException(stringBuilder.toString());
    }

    public JsonDeserializer _handleUnknownValueDeserializer(JavaType javaType) {
        if (ClassUtil.isConcrete(javaType.getRawClass())) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can not find a Value deserializer for type ");
            stringBuilder.append(javaType);
            throw new JsonMappingException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Can not find a Value deserializer for abstract type ");
        stringBuilder.append(javaType);
        throw new JsonMappingException(stringBuilder.toString());
    }

    private Class _verifyAsClass(Object obj, String str, Class cls) {
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

    public int cachedDeserializersCount() {
        return this._cachedDeserializers.size();
    }

    public Converter findConverter(DeserializationContext deserializationContext, Annotated annotated) {
        Object findDeserializationConverter = deserializationContext.getAnnotationIntrospector().findDeserializationConverter(annotated);
        if (findDeserializationConverter == null) {
            return null;
        }
        return deserializationContext.converterInstance(annotated, findDeserializationConverter);
    }

    public JsonDeserializer findConvertingDeserializer(DeserializationContext deserializationContext, Annotated annotated, JsonDeserializer jsonDeserializer) {
        annotated = findConverter(deserializationContext, annotated);
        if (annotated == null) {
            return jsonDeserializer;
        }
        return new StdDelegatingDeserializer(annotated, annotated.getInputType(deserializationContext.getTypeFactory()), jsonDeserializer);
    }

    public JsonDeserializer findDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) {
        Object findDeserializer = deserializationContext.getAnnotationIntrospector().findDeserializer(annotated);
        if (findDeserializer == null) {
            return null;
        }
        return findConvertingDeserializer(deserializationContext, annotated, deserializationContext.deserializerInstance(annotated, findDeserializer));
    }

    public KeyDeserializer findKeyDeserializer(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) {
        KeyDeserializer createKeyDeserializer = deserializerFactory.createKeyDeserializer(deserializationContext, javaType);
        if (createKeyDeserializer == null) {
            return _handleUnknownKeyDeserializer(javaType);
        }
        if (createKeyDeserializer instanceof ResolvableDeserializer) {
            ((ResolvableDeserializer) createKeyDeserializer).resolve(deserializationContext);
        }
        return createKeyDeserializer;
    }

    public JsonDeserializer findValueDeserializer(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) {
        JsonDeserializer _findCachedDeserializer = _findCachedDeserializer(javaType);
        if (_findCachedDeserializer != null) {
            return _findCachedDeserializer;
        }
        _findCachedDeserializer = _createAndCacheValueDeserializer(deserializationContext, deserializerFactory, javaType);
        if (_findCachedDeserializer == null) {
            return _handleUnknownValueDeserializer(javaType);
        }
        return _findCachedDeserializer;
    }

    public void flushCachedDeserializers() {
        this._cachedDeserializers.clear();
    }

    public boolean hasValueDeserializerFor(com.fasterxml.jackson.databind.DeserializationContext r3, com.fasterxml.jackson.databind.deser.DeserializerFactory r4, com.fasterxml.jackson.databind.JavaType r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r1 = r2._findCachedDeserializer(r5);
        r0 = 0;
        if (r1 != 0) goto L_0x000d;
    L_0x0007:
        r1 = r2._createAndCacheValueDeserializer(r3, r4, r5);	 Catch:{ Exception -> 0x000c }
        goto L_0x000d;	 Catch:{ Exception -> 0x000c }
    L_0x000c:
        return r0;
    L_0x000d:
        if (r1 == 0) goto L_0x0010;
    L_0x000f:
        r0 = 1;
    L_0x0010:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.DeserializerCache.hasValueDeserializerFor(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType):boolean");
    }

    private JavaType modifyTypeByAnnotation(DeserializationContext deserializationContext, Annotated annotated, JavaType javaType) {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        Class findDeserializationType = annotationIntrospector.findDeserializationType(annotated, javaType);
        Object obj = null;
        if (findDeserializationType != null) {
            try {
                javaType = javaType.narrowBy(findDeserializationType);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to narrow type ");
                stringBuilder.append(javaType);
                stringBuilder.append(" with concrete-type annotation (value ");
                stringBuilder.append(findDeserializationType.getName());
                stringBuilder.append("), method '");
                stringBuilder.append(annotated.getName());
                stringBuilder.append("': ");
                stringBuilder.append(e.getMessage());
                throw new JsonMappingException(stringBuilder.toString(), null, e);
            }
        }
        if (!javaType.isContainerType()) {
            return javaType;
        }
        findDeserializationType = annotationIntrospector.findDeserializationKeyType(annotated, javaType.getKeyType());
        if (findDeserializationType != null) {
            if (javaType instanceof MapLikeType) {
                try {
                    javaType = ((MapLikeType) javaType).narrowKey(findDeserializationType);
                } catch (Throwable e2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed to narrow key type ");
                    stringBuilder.append(javaType);
                    stringBuilder.append(" with key-type annotation (");
                    stringBuilder.append(findDeserializationType.getName());
                    stringBuilder.append("): ");
                    stringBuilder.append(e2.getMessage());
                    throw new JsonMappingException(stringBuilder.toString(), null, e2);
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal key-type annotation: type ");
            stringBuilder.append(javaType);
            stringBuilder.append(" is not a Map(-like) type");
            throw new JsonMappingException(stringBuilder.toString());
        }
        JavaType keyType = javaType.getKeyType();
        if (keyType != null && keyType.getValueHandler() == null) {
            Object findKeyDeserializer = annotationIntrospector.findKeyDeserializer(annotated);
            if (findKeyDeserializer != null) {
                KeyDeserializer keyDeserializerInstance = deserializationContext.keyDeserializerInstance(annotated, findKeyDeserializer);
                if (keyDeserializerInstance != null) {
                    javaType = ((MapLikeType) javaType).withKeyValueHandler(keyDeserializerInstance);
                    javaType.getKeyType();
                }
            }
        }
        findDeserializationType = annotationIntrospector.findDeserializationContentType(annotated, javaType.getContentType());
        if (findDeserializationType != null) {
            try {
                javaType = javaType.narrowContentsBy(findDeserializationType);
            } catch (Throwable e22) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to narrow content type ");
                stringBuilder.append(javaType);
                stringBuilder.append(" with content-type annotation (");
                stringBuilder.append(findDeserializationType.getName());
                stringBuilder.append("): ");
                stringBuilder.append(e22.getMessage());
                throw new JsonMappingException(stringBuilder.toString(), null, e22);
            }
        }
        if (javaType.getContentType().getValueHandler() != null) {
            return javaType;
        }
        Object findContentDeserializer = annotationIntrospector.findContentDeserializer(annotated);
        if (findContentDeserializer == null) {
            return javaType;
        }
        if (findContentDeserializer instanceof JsonDeserializer) {
            JsonDeserializer jsonDeserializer = (JsonDeserializer) findContentDeserializer;
        } else {
            Class _verifyAsClass = _verifyAsClass(findContentDeserializer, "findContentDeserializer", JsonDeserializer$None.class);
            if (_verifyAsClass != null) {
                obj = deserializationContext.deserializerInstance(annotated, _verifyAsClass);
            }
        }
        return obj != null ? javaType.withContentValueHandler(obj) : javaType;
    }

    public Object writeReplace() {
        this._incompleteDeserializers.clear();
        return this;
    }
}
