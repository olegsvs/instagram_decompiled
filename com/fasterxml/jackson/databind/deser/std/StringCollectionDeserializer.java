package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.Collection;

@JacksonStdImpl
public final class StringCollectionDeserializer extends ContainerDeserializerBase implements ContextualDeserializer {
    private static final long serialVersionUID = 1;
    public final JavaType _collectionType;
    public final JsonDeserializer _delegateDeserializer;
    public final JsonDeserializer _valueDeserializer;
    public final ValueInstantiator _valueInstantiator;

    public StringCollectionDeserializer(JavaType javaType, JsonDeserializer jsonDeserializer, ValueInstantiator valueInstantiator) {
        this(javaType, valueInstantiator, null, jsonDeserializer);
    }

    public StringCollectionDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, JsonDeserializer jsonDeserializer, JsonDeserializer jsonDeserializer2) {
        super(javaType.getRawClass());
        this._collectionType = javaType;
        this._valueDeserializer = jsonDeserializer2;
        this._valueInstantiator = valueInstantiator;
        this._delegateDeserializer = jsonDeserializer;
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        JsonDeserializer findDeserializer = (valueInstantiator == null || valueInstantiator.getDelegateCreator() == null) ? null : findDeserializer(deserializationContext, this._valueInstantiator.getDelegateType(deserializationContext.getConfig()), beanProperty);
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        if (jsonDeserializer == null) {
            jsonDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, jsonDeserializer);
            if (jsonDeserializer == null) {
                jsonDeserializer = deserializationContext.findContextualValueDeserializer(this._collectionType.getContentType(), beanProperty);
            }
        } else if (jsonDeserializer instanceof ContextualDeserializer) {
            jsonDeserializer = ((ContextualDeserializer) jsonDeserializer).createContextual(deserializationContext, beanProperty);
        }
        if (isDefaultDeserializer(jsonDeserializer)) {
            jsonDeserializer = null;
        }
        return withResolved(findDeserializer, jsonDeserializer);
    }

    public Collection deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonDeserializer jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return (Collection) this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        return deserialize(jsonParser, deserializationContext, (Collection) this._valueInstantiator.createUsingDefault(deserializationContext));
    }

    public Collection deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Collection collection) {
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext, collection);
        }
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        if (jsonDeserializer != null) {
            return deserializeUsingCustom(jsonParser, deserializationContext, collection, jsonDeserializer);
        }
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == JsonToken.END_ARRAY) {
                return collection;
            }
            collection.add(nextToken == JsonToken.VALUE_NULL ? null : _parseString(jsonParser, deserializationContext));
        }
    }

    private Collection deserializeUsingCustom(JsonParser jsonParser, DeserializationContext deserializationContext, Collection collection, JsonDeserializer jsonDeserializer) {
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == JsonToken.END_ARRAY) {
                return collection;
            }
            Object obj;
            if (nextToken == JsonToken.VALUE_NULL) {
                obj = null;
            } else {
                obj = (String) jsonDeserializer.deserialize(jsonParser, deserializationContext);
            }
            collection.add(obj);
        }
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    public JsonDeserializer getContentDeserializer() {
        return this._valueDeserializer;
    }

    public JavaType getContentType() {
        return this._collectionType.getContentType();
    }

    private final Collection handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection collection) {
        if (deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
            JsonDeserializer jsonDeserializer = this._valueDeserializer;
            Object _parseString = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonDeserializer == null ? _parseString(jsonParser, deserializationContext) : (String) jsonDeserializer.deserialize(jsonParser, deserializationContext);
            collection.add(_parseString);
            return collection;
        }
        throw deserializationContext.mappingException(this._collectionType.getRawClass());
    }

    public StringCollectionDeserializer withResolved(JsonDeserializer jsonDeserializer, JsonDeserializer jsonDeserializer2) {
        if (this._valueDeserializer == jsonDeserializer2 && this._delegateDeserializer == jsonDeserializer) {
            return this;
        }
        return new StringCollectionDeserializer(this._collectionType, this._valueInstantiator, jsonDeserializer, jsonDeserializer2);
    }
}
