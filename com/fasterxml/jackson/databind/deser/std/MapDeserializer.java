package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Map;

@JacksonStdImpl
public class MapDeserializer extends ContainerDeserializerBase implements ContextualDeserializer, ResolvableDeserializer {
    private static final long serialVersionUID = -3378654289961736240L;
    public JsonDeserializer _delegateDeserializer;
    public final boolean _hasDefaultCreator;
    public HashSet _ignorableProperties;
    public final KeyDeserializer _keyDeserializer;
    public final JavaType _mapType;
    public PropertyBasedCreator _propertyBasedCreator;
    public boolean _standardStringKey;
    public final JsonDeserializer _valueDeserializer;
    public final ValueInstantiator _valueInstantiator;
    public final TypeDeserializer _valueTypeDeserializer;

    public MapDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, KeyDeserializer keyDeserializer, JsonDeserializer jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(Map.class);
        this._mapType = javaType;
        this._keyDeserializer = keyDeserializer;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._valueInstantiator = valueInstantiator;
        this._hasDefaultCreator = valueInstantiator.canCreateUsingDefault();
        this._delegateDeserializer = null;
        this._propertyBasedCreator = null;
        this._standardStringKey = _isStdKeyDeser(javaType, keyDeserializer);
    }

    public MapDeserializer(MapDeserializer mapDeserializer) {
        super(mapDeserializer._valueClass);
        this._mapType = mapDeserializer._mapType;
        this._keyDeserializer = mapDeserializer._keyDeserializer;
        this._valueDeserializer = mapDeserializer._valueDeserializer;
        this._valueTypeDeserializer = mapDeserializer._valueTypeDeserializer;
        this._valueInstantiator = mapDeserializer._valueInstantiator;
        this._propertyBasedCreator = mapDeserializer._propertyBasedCreator;
        this._delegateDeserializer = mapDeserializer._delegateDeserializer;
        this._hasDefaultCreator = mapDeserializer._hasDefaultCreator;
        this._ignorableProperties = mapDeserializer._ignorableProperties;
        this._standardStringKey = mapDeserializer._standardStringKey;
    }

    public MapDeserializer(MapDeserializer mapDeserializer, KeyDeserializer keyDeserializer, JsonDeserializer jsonDeserializer, TypeDeserializer typeDeserializer, HashSet hashSet) {
        super(mapDeserializer._valueClass);
        this._mapType = mapDeserializer._mapType;
        this._keyDeserializer = keyDeserializer;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._valueInstantiator = mapDeserializer._valueInstantiator;
        this._propertyBasedCreator = mapDeserializer._propertyBasedCreator;
        this._delegateDeserializer = mapDeserializer._delegateDeserializer;
        this._hasDefaultCreator = mapDeserializer._hasDefaultCreator;
        this._ignorableProperties = hashSet;
        this._standardStringKey = _isStdKeyDeser(this._mapType, keyDeserializer);
    }

    public Map _deserializeUsingCreator(JsonParser jsonParser, DeserializationContext deserializationContext) {
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer startBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, null);
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.START_OBJECT) {
            currentToken = jsonParser.nextToken();
        }
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            JsonToken nextToken = jsonParser.nextToken();
            HashSet hashSet = this._ignorableProperties;
            if (hashSet == null || !hashSet.contains(currentName)) {
                SettableBeanProperty findCreatorProperty = propertyBasedCreator.findCreatorProperty(currentName);
                if (findCreatorProperty != null) {
                    if (startBuilding.assignParameter(findCreatorProperty.getCreatorIndex(), findCreatorProperty.deserialize(jsonParser, deserializationContext))) {
                        jsonParser.nextToken();
                        try {
                            Map map = (Map) propertyBasedCreator.build(deserializationContext, startBuilding);
                            _readAndBind(jsonParser, deserializationContext, map);
                            return map;
                        } catch (Throwable e) {
                            wrapAndThrow(e, this._mapType.getRawClass());
                            return null;
                        }
                    }
                } else {
                    Object obj;
                    Object deserializeKey = this._keyDeserializer.deserializeKey(jsonParser.getCurrentName(), deserializationContext);
                    if (nextToken == JsonToken.VALUE_NULL) {
                        obj = null;
                    } else if (typeDeserializer == null) {
                        obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                    } else {
                        obj = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                    }
                    startBuilding.bufferMapProperty(deserializeKey, obj);
                }
            } else {
                jsonParser.skipChildren();
            }
            currentToken = jsonParser.nextToken();
        }
        try {
            return (Map) propertyBasedCreator.build(deserializationContext, startBuilding);
        } catch (Throwable e2) {
            wrapAndThrow(e2, this._mapType.getRawClass());
            return null;
        }
    }

    public final boolean _isStdKeyDeser(JavaType javaType, KeyDeserializer keyDeserializer) {
        if (keyDeserializer == null) {
            return true;
        }
        ResolvedType keyType = javaType.getKeyType();
        if (keyType == null) {
            return true;
        }
        Class rawClass = keyType.getRawClass();
        if ((rawClass == String.class || rawClass == Object.class) && isDefaultKeyDeserializer(keyDeserializer)) {
            return true;
        }
        return false;
    }

    public final void _readAndBind(JsonParser jsonParser, DeserializationContext deserializationContext, Map map) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.START_OBJECT) {
            currentToken = jsonParser.nextToken();
        }
        KeyDeserializer keyDeserializer = this._keyDeserializer;
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            Object deserializeKey = keyDeserializer.deserializeKey(currentName, deserializationContext);
            currentToken = jsonParser.nextToken();
            HashSet hashSet = this._ignorableProperties;
            if (hashSet == null || !hashSet.contains(currentName)) {
                Object obj;
                if (currentToken == JsonToken.VALUE_NULL) {
                    obj = null;
                } else if (typeDeserializer == null) {
                    obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                } else {
                    obj = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                }
                map.put(deserializeKey, obj);
            } else {
                jsonParser.skipChildren();
            }
            currentToken = jsonParser.nextToken();
        }
    }

    public final void _readAndBindStringMap(JsonParser jsonParser, DeserializationContext deserializationContext, Map map) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.START_OBJECT) {
            currentToken = jsonParser.nextToken();
        }
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            currentToken = jsonParser.nextToken();
            HashSet hashSet = this._ignorableProperties;
            if (hashSet == null || !hashSet.contains(currentName)) {
                Object obj;
                if (currentToken == JsonToken.VALUE_NULL) {
                    obj = null;
                } else if (typeDeserializer == null) {
                    obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                } else {
                    obj = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                }
                map.put(currentName, obj);
            } else {
                jsonParser.skipChildren();
            }
            currentToken = jsonParser.nextToken();
        }
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        KeyDeserializer keyDeserializer = this._keyDeserializer;
        if (keyDeserializer == null) {
            keyDeserializer = deserializationContext.findKeyDeserializer(this._mapType.getKeyType(), beanProperty);
        } else if (keyDeserializer instanceof ContextualKeyDeserializer) {
            keyDeserializer = ((ContextualKeyDeserializer) keyDeserializer).createContextual(deserializationContext, beanProperty);
        }
        JsonDeserializer findConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this._valueDeserializer);
        if (findConvertingContentDeserializer == null) {
            findConvertingContentDeserializer = deserializationContext.findContextualValueDeserializer(this._mapType.getContentType(), beanProperty);
        } else if (findConvertingContentDeserializer instanceof ContextualDeserializer) {
            findConvertingContentDeserializer = ((ContextualDeserializer) findConvertingContentDeserializer).createContextual(deserializationContext, beanProperty);
        }
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (typeDeserializer != null) {
            typeDeserializer = typeDeserializer.forProperty(beanProperty);
        }
        HashSet hashSet = this._ignorableProperties;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (!(annotationIntrospector == null || beanProperty == null)) {
            String[] findPropertiesToIgnore = annotationIntrospector.findPropertiesToIgnore(beanProperty.getMember());
            if (findPropertiesToIgnore != null) {
                hashSet = hashSet == null ? new HashSet() : new HashSet(hashSet);
                for (Object add : findPropertiesToIgnore) {
                    hashSet.add(add);
                }
            }
        }
        return withResolved(keyDeserializer, typeDeserializer, findConvertingContentDeserializer, hashSet);
    }

    public Map deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingCreator(jsonParser, deserializationContext);
        }
        JsonDeserializer jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return (Map) this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (this._hasDefaultCreator) {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.START_OBJECT || currentToken == JsonToken.FIELD_NAME || currentToken == JsonToken.END_OBJECT) {
                Map map = (Map) this._valueInstantiator.createUsingDefault(deserializationContext);
                if (this._standardStringKey) {
                    _readAndBindStringMap(jsonParser, deserializationContext, map);
                    return map;
                }
                _readAndBind(jsonParser, deserializationContext, map);
                return map;
            } else if (currentToken == JsonToken.VALUE_STRING) {
                return (Map) this._valueInstantiator.createFromString(deserializationContext, jsonParser.getText());
            } else {
                throw deserializationContext.mappingException(getMapClass());
            }
        }
        throw deserializationContext.instantiationException(getMapClass(), "No default constructor found");
    }

    public Map deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Map map) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken != JsonToken.START_OBJECT) {
            if (currentToken != JsonToken.FIELD_NAME) {
                throw deserializationContext.mappingException(getMapClass());
            }
        }
        if (this._standardStringKey) {
            _readAndBindStringMap(jsonParser, deserializationContext, map);
            return map;
        }
        _readAndBind(jsonParser, deserializationContext, map);
        return map;
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    public JsonDeserializer getContentDeserializer() {
        return this._valueDeserializer;
    }

    public JavaType getContentType() {
        return this._mapType.getContentType();
    }

    public final Class getMapClass() {
        return this._mapType.getRawClass();
    }

    public JavaType getValueType() {
        return this._mapType;
    }

    public void resolve(DeserializationContext deserializationContext) {
        if (this._valueInstantiator.canCreateUsingDelegate()) {
            JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
            if (delegateType != null) {
                this._delegateDeserializer = findDeserializer(deserializationContext, delegateType, null);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid delegate-creator definition for ");
                stringBuilder.append(this._mapType);
                stringBuilder.append(": value instantiator (");
                stringBuilder.append(this._valueInstantiator.getClass().getName());
                stringBuilder.append(") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        if (this._valueInstantiator.canCreateFromObjectWith()) {
            this._propertyBasedCreator = PropertyBasedCreator.construct(deserializationContext, this._valueInstantiator, this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig()));
        }
        this._standardStringKey = _isStdKeyDeser(this._mapType, this._keyDeserializer);
    }

    public void setIgnorableProperties(String[] strArr) {
        HashSet arrayToSet;
        if (strArr != null) {
            if (strArr.length != 0) {
                arrayToSet = ArrayBuilders.arrayToSet(strArr);
                this._ignorableProperties = arrayToSet;
            }
        }
        arrayToSet = null;
        this._ignorableProperties = arrayToSet;
    }

    public MapDeserializer withResolved(KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer, HashSet hashSet) {
        MapDeserializer mapDeserializer = this;
        KeyDeserializer keyDeserializer2 = this._keyDeserializer;
        KeyDeserializer keyDeserializer3 = keyDeserializer;
        JsonDeserializer jsonDeserializer2 = jsonDeserializer;
        HashSet hashSet2 = hashSet;
        if (keyDeserializer2 == keyDeserializer3 && mapDeserializer._valueDeserializer == jsonDeserializer2 && mapDeserializer._valueTypeDeserializer == typeDeserializer && mapDeserializer._ignorableProperties == hashSet) {
            return mapDeserializer;
        }
        return new MapDeserializer(mapDeserializer, keyDeserializer3, jsonDeserializer2, typeDeserializer, hashSet2);
    }

    public void wrapAndThrow(Throwable th, Object obj) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (!(th instanceof IOException) || (th instanceof JsonMappingException)) {
            throw JsonMappingException.wrapWithPath(th, obj, null);
        } else {
            throw ((IOException) th);
        }
    }
}
