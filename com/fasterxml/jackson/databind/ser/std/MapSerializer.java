package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonMapFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

@JacksonStdImpl
public class MapSerializer extends ContainerSerializer implements ContextualSerializer {
    public static final JavaType UNSPECIFIED_TYPE = TypeFactory.unknownType();
    public PropertySerializerMap _dynamicValueSerializers;
    public final HashSet _ignoredEntries;
    public JsonSerializer _keySerializer;
    public final JavaType _keyType;
    public final BeanProperty _property;
    public JsonSerializer _valueSerializer;
    public final JavaType _valueType;
    public final boolean _valueTypeIsStatic;
    public final TypeSerializer _valueTypeSerializer;

    public MapSerializer(MapSerializer mapSerializer, BeanProperty beanProperty, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, HashSet hashSet) {
        super(Map.class, false);
        this._ignoredEntries = hashSet;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapSerializer._valueTypeSerializer;
        this._keySerializer = jsonSerializer;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = mapSerializer._dynamicValueSerializers;
        this._property = beanProperty;
    }

    public MapSerializer(MapSerializer mapSerializer, TypeSerializer typeSerializer) {
        super(Map.class, false);
        this._ignoredEntries = mapSerializer._ignoredEntries;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = typeSerializer;
        this._keySerializer = mapSerializer._keySerializer;
        this._valueSerializer = mapSerializer._valueSerializer;
        this._dynamicValueSerializers = mapSerializer._dynamicValueSerializers;
        this._property = mapSerializer._property;
    }

    public MapSerializer(HashSet hashSet, JavaType javaType, JavaType javaType2, boolean z, TypeSerializer typeSerializer, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2) {
        super(Map.class, false);
        this._ignoredEntries = hashSet;
        this._keyType = javaType;
        this._valueType = javaType2;
        this._valueTypeIsStatic = z;
        this._valueTypeSerializer = typeSerializer;
        this._keySerializer = jsonSerializer;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = PropertySerializerMap.emptyMap();
        this._property = null;
    }

    public final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertySerializerMap, JavaType javaType, SerializerProvider serializerProvider) {
        SerializerAndMapResult findAndAddSerializer = propertySerializerMap.findAndAddSerializer(javaType, serializerProvider, this._property);
        if (propertySerializerMap != findAndAddSerializer.map) {
            this._dynamicValueSerializers = findAndAddSerializer.map;
        }
        return findAndAddSerializer.serializer;
    }

    public final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class cls, SerializerProvider serializerProvider) {
        SerializerAndMapResult findAndAddSerializer = propertySerializerMap.findAndAddSerializer(cls, serializerProvider, this._property);
        if (propertySerializerMap != findAndAddSerializer.map) {
            this._dynamicValueSerializers = findAndAddSerializer.map;
        }
        return findAndAddSerializer.serializer;
    }

    public Map _orderEntries(Map map) {
        if (map instanceof SortedMap) {
            return map;
        }
        return new TreeMap(map);
    }

    public MapSerializer _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new MapSerializer(this, typeSerializer);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        JsonMapFormatVisitor expectMapFormat = jsonFormatVisitorWrapper == null ? null : jsonFormatVisitorWrapper.expectMapFormat(javaType);
        if (expectMapFormat != null) {
            expectMapFormat.keyFormat(this._keySerializer, this._keyType);
            JsonFormatVisitable jsonFormatVisitable = this._valueSerializer;
            if (jsonFormatVisitable == null) {
                jsonFormatVisitable = _findAndAddDynamic(this._dynamicValueSerializers, this._valueType, jsonFormatVisitorWrapper.getProvider());
            }
            expectMapFormat.valueFormat(jsonFormatVisitable, this._valueType);
        }
    }

    public static MapSerializer construct(String[] strArr, JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2) {
        HashSet toSet = toSet(strArr);
        if (javaType == null) {
            strArr = UNSPECIFIED_TYPE;
            javaType = strArr;
        } else {
            strArr = javaType.getKeyType();
            javaType = javaType.getContentType();
        }
        if (z) {
            if (javaType.getRawClass() == Object.class) {
            }
            return new MapSerializer(toSet, strArr, javaType, z, typeSerializer, jsonSerializer, jsonSerializer2);
        } else if (javaType != null && javaType.isFinal()) {
            z = true;
            return new MapSerializer(toSet, strArr, javaType, z, typeSerializer, jsonSerializer, jsonSerializer2);
        }
        z = false;
        return new MapSerializer(toSet, strArr, javaType, z, typeSerializer, jsonSerializer, jsonSerializer2);
    }

    public JsonSerializer createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        AnnotationIntrospector annotationIntrospector;
        Object findKeySerializer;
        JsonSerializer serializerInstance;
        JsonSerializer findConvertingContentSerializer;
        HashSet hashSet;
        String[] findPropertiesToIgnore;
        JsonSerializer jsonSerializer = null;
        if (beanProperty != null) {
            Annotated member = beanProperty.getMember();
            if (member != null) {
                annotationIntrospector = serializerProvider.getAnnotationIntrospector();
                findKeySerializer = annotationIntrospector.findKeySerializer(member);
                serializerInstance = findKeySerializer != null ? serializerProvider.serializerInstance(member, findKeySerializer) : null;
                findKeySerializer = annotationIntrospector.findContentSerializer(member);
                if (findKeySerializer != null) {
                    jsonSerializer = serializerProvider.serializerInstance(member, findKeySerializer);
                }
                if (jsonSerializer == null) {
                    jsonSerializer = this._valueSerializer;
                }
                findConvertingContentSerializer = findConvertingContentSerializer(serializerProvider, beanProperty, jsonSerializer);
                if (findConvertingContentSerializer == null) {
                    if ((this._valueTypeIsStatic && this._valueType.getRawClass() != Object.class) || hasContentTypeAnnotation(serializerProvider, beanProperty)) {
                        findConvertingContentSerializer = serializerProvider.findValueSerializer(this._valueType, beanProperty);
                    }
                } else if (findConvertingContentSerializer instanceof ContextualSerializer) {
                    findConvertingContentSerializer = ((ContextualSerializer) findConvertingContentSerializer).createContextual(serializerProvider, beanProperty);
                }
                if (serializerInstance == null) {
                    serializerInstance = this._keySerializer;
                }
                if (serializerInstance == null) {
                    serializerInstance = serializerProvider.findKeySerializer(this._keyType, beanProperty);
                } else if (serializerInstance instanceof ContextualSerializer) {
                    serializerInstance = ((ContextualSerializer) serializerInstance).createContextual(serializerProvider, beanProperty);
                }
                hashSet = this._ignoredEntries;
                annotationIntrospector = serializerProvider.getAnnotationIntrospector();
                if (!(annotationIntrospector == null || beanProperty == null)) {
                    findPropertiesToIgnore = annotationIntrospector.findPropertiesToIgnore(beanProperty.getMember());
                    if (findPropertiesToIgnore != null) {
                        hashSet = hashSet != null ? new HashSet() : new HashSet(hashSet);
                        for (Object findKeySerializer2 : findPropertiesToIgnore) {
                            hashSet.add(findKeySerializer2);
                        }
                    }
                }
                return withResolved(beanProperty, serializerInstance, findConvertingContentSerializer, hashSet);
            }
        }
        serializerInstance = null;
        if (jsonSerializer == null) {
            jsonSerializer = this._valueSerializer;
        }
        findConvertingContentSerializer = findConvertingContentSerializer(serializerProvider, beanProperty, jsonSerializer);
        if (findConvertingContentSerializer == null) {
            findConvertingContentSerializer = serializerProvider.findValueSerializer(this._valueType, beanProperty);
        } else if (findConvertingContentSerializer instanceof ContextualSerializer) {
            findConvertingContentSerializer = ((ContextualSerializer) findConvertingContentSerializer).createContextual(serializerProvider, beanProperty);
        }
        if (serializerInstance == null) {
            serializerInstance = this._keySerializer;
        }
        if (serializerInstance == null) {
            serializerInstance = serializerProvider.findKeySerializer(this._keyType, beanProperty);
        } else if (serializerInstance instanceof ContextualSerializer) {
            serializerInstance = ((ContextualSerializer) serializerInstance).createContextual(serializerProvider, beanProperty);
        }
        hashSet = this._ignoredEntries;
        annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        findPropertiesToIgnore = annotationIntrospector.findPropertiesToIgnore(beanProperty.getMember());
        if (findPropertiesToIgnore != null) {
            if (hashSet != null) {
            }
            while (r1 < r2) {
                hashSet.add(findKeySerializer2);
            }
        }
        return withResolved(beanProperty, serializerInstance, findConvertingContentSerializer, hashSet);
    }

    public JsonSerializer getContentSerializer() {
        return this._valueSerializer;
    }

    public JavaType getContentType() {
        return this._valueType;
    }

    public JsonSerializer getKeySerializer() {
        return this._keySerializer;
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("object", true);
    }

    public boolean hasSingleElement(Map map) {
        return map.size() == 1;
    }

    public boolean isEmpty(Map map) {
        if (map != null) {
            if (!map.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public void serialize(Map map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeStartObject();
        if (!map.isEmpty()) {
            if (serializerProvider.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS)) {
                map = _orderEntries(map);
            }
            JsonSerializer jsonSerializer = this._valueSerializer;
            if (jsonSerializer != null) {
                serializeFieldsUsing(map, jsonGenerator, serializerProvider, jsonSerializer);
            } else {
                serializeFields(map, jsonGenerator, serializerProvider);
            }
        }
        jsonGenerator.writeEndObject();
    }

    public void serializeFields(Map map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (this._valueTypeSerializer != null) {
            serializeTypedFields(map, jsonGenerator, serializerProvider);
            return;
        }
        JsonSerializer jsonSerializer = this._keySerializer;
        HashSet hashSet = this._ignoredEntries;
        int isEnabled = serializerProvider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES) ^ 1;
        PropertySerializerMap propertySerializerMap = this._dynamicValueSerializers;
        for (Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            Object key = entry.getKey();
            if (key == null) {
                serializerProvider.findNullKeySerializer(this._keyType, this._property).serialize(null, jsonGenerator, serializerProvider);
            } else if (isEnabled == 0 || value != null) {
                if (hashSet == null || !hashSet.contains(key)) {
                    jsonSerializer.serialize(key, jsonGenerator, serializerProvider);
                }
            }
            if (value == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
            } else {
                Class cls = value.getClass();
                JsonSerializer serializerFor = propertySerializerMap.serializerFor(cls);
                if (serializerFor == null) {
                    if (this._valueType.hasGenericTypes()) {
                        serializerFor = _findAndAddDynamic(propertySerializerMap, serializerProvider.constructSpecializedType(this._valueType, cls), serializerProvider);
                    } else {
                        serializerFor = _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
                    }
                    propertySerializerMap = this._dynamicValueSerializers;
                }
                try {
                    serializerFor.serialize(value, jsonGenerator, serializerProvider);
                } catch (Throwable e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(key);
                    wrapAndThrow(serializerProvider, e, (Object) map, stringBuilder.toString());
                }
            }
        }
    }

    public void serializeFieldsUsing(Map map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, JsonSerializer jsonSerializer) {
        JsonSerializer jsonSerializer2 = this._keySerializer;
        HashSet hashSet = this._ignoredEntries;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        int isEnabled = serializerProvider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES) ^ 1;
        for (Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            Object key = entry.getKey();
            if (key == null) {
                serializerProvider.findNullKeySerializer(this._keyType, this._property).serialize(null, jsonGenerator, serializerProvider);
            } else if (isEnabled == 0 || value != null) {
                if (hashSet == null || !hashSet.contains(key)) {
                    jsonSerializer2.serialize(key, jsonGenerator, serializerProvider);
                }
            }
            if (value == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
            } else if (typeSerializer == null) {
                try {
                    jsonSerializer.serialize(value, jsonGenerator, serializerProvider);
                } catch (Throwable e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(key);
                    wrapAndThrow(serializerProvider, e, (Object) map, stringBuilder.toString());
                }
            } else {
                jsonSerializer.serializeWithType(value, jsonGenerator, serializerProvider, typeSerializer);
            }
        }
    }

    public void serializeTypedFields(Map map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        JsonSerializer jsonSerializer = this._keySerializer;
        HashSet hashSet = this._ignoredEntries;
        int isEnabled = serializerProvider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES) ^ 1;
        Object obj = null;
        JsonSerializer jsonSerializer2 = null;
        for (Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            Object key = entry.getKey();
            if (key == null) {
                serializerProvider.findNullKeySerializer(this._keyType, this._property).serialize(null, jsonGenerator, serializerProvider);
            } else if (isEnabled == 0 || value != null) {
                if (hashSet == null || !hashSet.contains(key)) {
                    jsonSerializer.serialize(key, jsonGenerator, serializerProvider);
                }
            }
            if (value == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
            } else {
                Class cls = value.getClass();
                if (cls != obj) {
                    if (this._valueType.hasGenericTypes()) {
                        jsonSerializer2 = serializerProvider.findValueSerializer(serializerProvider.constructSpecializedType(this._valueType, cls), this._property);
                    } else {
                        jsonSerializer2 = serializerProvider.findValueSerializer(cls, this._property);
                    }
                    obj = cls;
                }
                try {
                    jsonSerializer2.serializeWithType(value, jsonGenerator, serializerProvider, this._valueTypeSerializer);
                } catch (Throwable e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(key);
                    wrapAndThrow(serializerProvider, e, (Object) map, stringBuilder.toString());
                }
            }
        }
    }

    public void serializeWithType(Map map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        typeSerializer.writeTypePrefixForObject(map, jsonGenerator);
        if (!map.isEmpty()) {
            if (serializerProvider.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS)) {
                map = _orderEntries(map);
            }
            JsonSerializer jsonSerializer = this._valueSerializer;
            if (jsonSerializer != null) {
                serializeFieldsUsing(map, jsonGenerator, serializerProvider, jsonSerializer);
            } else {
                serializeFields(map, jsonGenerator, serializerProvider);
            }
        }
        typeSerializer.writeTypeSuffixForObject(map, jsonGenerator);
    }

    private static HashSet toSet(String[] strArr) {
        if (strArr != null) {
            if (strArr.length != 0) {
                HashSet hashSet = new HashSet(strArr.length);
                for (Object add : strArr) {
                    hashSet.add(add);
                }
                return hashSet;
            }
        }
        return null;
    }

    public MapSerializer withResolved(BeanProperty beanProperty, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, HashSet hashSet) {
        return new MapSerializer(this, beanProperty, jsonSerializer, jsonSerializer2, hashSet);
    }
}
