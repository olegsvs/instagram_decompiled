package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueDeserializer extends CollectionDeserializer {
    private static final long serialVersionUID = 5471961369237518580L;

    public ArrayBlockingQueueDeserializer(JavaType javaType, JsonDeserializer jsonDeserializer, TypeDeserializer typeDeserializer, ValueInstantiator valueInstantiator, JsonDeserializer jsonDeserializer2) {
        super(javaType, jsonDeserializer, typeDeserializer, valueInstantiator, jsonDeserializer2);
    }

    public ArrayBlockingQueueDeserializer(ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer) {
        super(arrayBlockingQueueDeserializer);
    }

    public Collection deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this._delegateDeserializer != null) {
            return (Collection) this._valueInstantiator.createUsingDelegate(deserializationContext, this._delegateDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_STRING) {
            String text = jsonParser.getText();
            if (text.length() == 0) {
                return (Collection) this._valueInstantiator.createFromString(deserializationContext, text);
            }
        }
        return deserialize(jsonParser, deserializationContext, null);
    }

    public Collection deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Collection collection) {
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext, new ArrayBlockingQueue(1));
        }
        Collection arrayList = new ArrayList();
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == JsonToken.END_ARRAY) {
                break;
            }
            Object obj;
            if (nextToken == JsonToken.VALUE_NULL) {
                obj = null;
            } else if (typeDeserializer == null) {
                obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
            } else {
                obj = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
            }
            arrayList.add(obj);
        }
        if (collection == null) {
            return new ArrayBlockingQueue(arrayList.size(), false, arrayList);
        }
        collection.addAll(arrayList);
        return collection;
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    public ArrayBlockingQueueDeserializer withResolved(JsonDeserializer jsonDeserializer, JsonDeserializer jsonDeserializer2, TypeDeserializer typeDeserializer) {
        JsonDeserializer jsonDeserializer3 = jsonDeserializer2;
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        if (jsonDeserializer == this._delegateDeserializer && jsonDeserializer2 == this._valueDeserializer && typeDeserializer == this._valueTypeDeserializer) {
            return this;
        }
        return new ArrayBlockingQueueDeserializer(this._collectionType, jsonDeserializer3, typeDeserializer2, this._valueInstantiator, jsonDeserializer);
    }
}
