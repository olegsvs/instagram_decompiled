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
public class CollectionDeserializer extends ContainerDeserializerBase implements ContextualDeserializer {
    private static final long serialVersionUID = -2003828398549708958L;
    public final JavaType _collectionType;
    public final JsonDeserializer _delegateDeserializer;
    public final JsonDeserializer _valueDeserializer;
    public final ValueInstantiator _valueInstantiator;
    public final TypeDeserializer _valueTypeDeserializer;

    public CollectionDeserializer(JavaType javaType, JsonDeserializer jsonDeserializer, TypeDeserializer typeDeserializer, ValueInstantiator valueInstantiator) {
        this(javaType, jsonDeserializer, typeDeserializer, valueInstantiator, null);
    }

    public CollectionDeserializer(JavaType javaType, JsonDeserializer jsonDeserializer, TypeDeserializer typeDeserializer, ValueInstantiator valueInstantiator, JsonDeserializer jsonDeserializer2) {
        super(javaType.getRawClass());
        this._collectionType = javaType;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._valueInstantiator = valueInstantiator;
        this._delegateDeserializer = jsonDeserializer2;
    }

    public CollectionDeserializer(CollectionDeserializer collectionDeserializer) {
        super(collectionDeserializer._valueClass);
        this._collectionType = collectionDeserializer._collectionType;
        this._valueDeserializer = collectionDeserializer._valueDeserializer;
        this._valueTypeDeserializer = collectionDeserializer._valueTypeDeserializer;
        this._valueInstantiator = collectionDeserializer._valueInstantiator;
        this._delegateDeserializer = collectionDeserializer._delegateDeserializer;
    }

    public CollectionDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonDeserializer jsonDeserializer;
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        if (valueInstantiator == null || !valueInstantiator.canCreateUsingDelegate()) {
            jsonDeserializer = null;
        } else {
            JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
            if (delegateType != null) {
                jsonDeserializer = findDeserializer(deserializationContext, delegateType, beanProperty);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid delegate-creator definition for ");
                stringBuilder.append(this._collectionType);
                stringBuilder.append(": value instantiator (");
                stringBuilder.append(this._valueInstantiator.getClass().getName());
                stringBuilder.append(") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        JsonDeserializer findConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this._valueDeserializer);
        if (findConvertingContentDeserializer == null) {
            findConvertingContentDeserializer = deserializationContext.findContextualValueDeserializer(this._collectionType.getContentType(), beanProperty);
        } else if (findConvertingContentDeserializer instanceof ContextualDeserializer) {
            findConvertingContentDeserializer = ((ContextualDeserializer) findConvertingContentDeserializer).createContextual(deserializationContext, beanProperty);
        }
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (typeDeserializer != null) {
            typeDeserializer = typeDeserializer.forProperty(beanProperty);
        }
        return withResolved(jsonDeserializer, findConvertingContentDeserializer, typeDeserializer);
    }

    public Collection deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonDeserializer jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return (Collection) this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_STRING) {
            String text = jsonParser.getText();
            if (text.length() == 0) {
                return (Collection) this._valueInstantiator.createFromString(deserializationContext, text);
            }
        }
        return deserialize(jsonParser, deserializationContext, (Collection) this._valueInstantiator.createUsingDefault(deserializationContext));
    }

    public Collection deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Collection collection) {
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext, collection);
        }
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == JsonToken.END_ARRAY) {
                return collection;
            }
            Object obj;
            if (nextToken == JsonToken.VALUE_NULL) {
                obj = null;
            } else if (typeDeserializer == null) {
                obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
            } else {
                obj = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
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

    public final Collection handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection collection) {
        if (deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
            Object obj;
            JsonDeserializer jsonDeserializer = this._valueDeserializer;
            TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                obj = null;
            } else if (typeDeserializer == null) {
                obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
            } else {
                obj = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
            }
            collection.add(obj);
            return collection;
        }
        throw deserializationContext.mappingException(this._collectionType.getRawClass());
    }

    public CollectionDeserializer withResolved(JsonDeserializer jsonDeserializer, JsonDeserializer jsonDeserializer2, TypeDeserializer typeDeserializer) {
        JsonDeserializer jsonDeserializer3 = jsonDeserializer2;
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        if (jsonDeserializer == this._delegateDeserializer && jsonDeserializer2 == this._valueDeserializer && typeDeserializer == this._valueTypeDeserializer) {
            return this;
        }
        return new CollectionDeserializer(this._collectionType, jsonDeserializer3, typeDeserializer2, this._valueInstantiator, jsonDeserializer);
    }
}
