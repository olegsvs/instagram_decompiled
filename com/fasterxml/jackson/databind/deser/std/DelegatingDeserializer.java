package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.Collection;

public abstract class DelegatingDeserializer extends StdDeserializer implements ContextualDeserializer, ResolvableDeserializer {
    private static final long serialVersionUID = 1;
    public final JsonDeserializer _delegatee;

    public boolean isCachable() {
        return false;
    }

    public abstract JsonDeserializer newDelegatingInstance(JsonDeserializer jsonDeserializer);

    public DelegatingDeserializer(JsonDeserializer jsonDeserializer) {
        super(_figureType(jsonDeserializer));
        this._delegatee = jsonDeserializer;
    }

    public JsonDeserializer _createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty, JsonDeserializer jsonDeserializer) {
        if (jsonDeserializer == this._delegatee) {
            return this;
        }
        return newDelegatingInstance(jsonDeserializer);
    }

    private static Class _figureType(JsonDeserializer jsonDeserializer) {
        if (jsonDeserializer instanceof StdDeserializer) {
            return ((StdDeserializer) jsonDeserializer).getValueClass();
        }
        return Object.class;
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonDeserializer jsonDeserializer = this._delegatee;
        if (jsonDeserializer instanceof ContextualDeserializer) {
            jsonDeserializer = ((ContextualDeserializer) jsonDeserializer).createContextual(deserializationContext, beanProperty);
        }
        return _createContextual(deserializationContext, beanProperty, jsonDeserializer);
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return this._delegatee.deserialize(jsonParser, deserializationContext);
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        return this._delegatee.deserialize(jsonParser, deserializationContext, obj);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return this._delegatee.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
    }

    public JsonDeserializer getDelegatee() {
        return this._delegatee;
    }

    public Object getEmptyValue() {
        return this._delegatee.getEmptyValue();
    }

    public Collection getKnownPropertyNames() {
        return this._delegatee.getKnownPropertyNames();
    }

    public Object getNullValue() {
        return this._delegatee.getNullValue();
    }

    public ObjectIdReader getObjectIdReader() {
        return this._delegatee.getObjectIdReader();
    }

    public JsonDeserializer replaceDelegatee(JsonDeserializer jsonDeserializer) {
        if (jsonDeserializer == this._delegatee) {
            return this;
        }
        return newDelegatingInstance(jsonDeserializer);
    }

    public void resolve(DeserializationContext deserializationContext) {
        JsonDeserializer jsonDeserializer = this._delegatee;
        if (jsonDeserializer instanceof ResolvableDeserializer) {
            ((ResolvableDeserializer) jsonDeserializer).resolve(deserializationContext);
        }
    }
}
