package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Converter;

public class StdDelegatingDeserializer extends StdDeserializer implements ContextualDeserializer, ResolvableDeserializer {
    private static final long serialVersionUID = 1;
    public final Converter _converter;
    public final JsonDeserializer _delegateDeserializer;
    public final JavaType _delegateType;

    public StdDelegatingDeserializer(Converter converter) {
        super(Object.class);
        this._converter = converter;
        this._delegateType = null;
        this._delegateDeserializer = null;
    }

    public StdDelegatingDeserializer(Converter converter, JavaType javaType, JsonDeserializer jsonDeserializer) {
        super(javaType);
        this._converter = converter;
        this._delegateType = javaType;
        this._delegateDeserializer = jsonDeserializer;
    }

    public Object convertValue(Object obj) {
        return this._converter.convert(obj);
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonDeserializer jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            if (jsonDeserializer instanceof ContextualDeserializer) {
                JsonDeserializer createContextual = ((ContextualDeserializer) jsonDeserializer).createContextual(deserializationContext, beanProperty);
                if (createContextual != this._delegateDeserializer) {
                    return withDelegate(this._converter, this._delegateType, createContextual);
                }
            }
            return this;
        }
        JavaType inputType = this._converter.getInputType(deserializationContext.getTypeFactory());
        return withDelegate(this._converter, inputType, deserializationContext.findContextualValueDeserializer(inputType, beanProperty));
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object deserialize = this._delegateDeserializer.deserialize(jsonParser, deserializationContext);
        if (deserialize == null) {
            return null;
        }
        return convertValue(deserialize);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        Object deserializeWithType = this._delegateDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
        if (deserializeWithType == null) {
            return null;
        }
        return convertValue(deserializeWithType);
    }

    public JsonDeserializer getDelegatee() {
        return this._delegateDeserializer;
    }

    public void resolve(DeserializationContext deserializationContext) {
        JsonDeserializer jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null && (jsonDeserializer instanceof ResolvableDeserializer)) {
            ((ResolvableDeserializer) jsonDeserializer).resolve(deserializationContext);
        }
    }

    public StdDelegatingDeserializer withDelegate(Converter converter, JavaType javaType, JsonDeserializer jsonDeserializer) {
        if (getClass() == StdDelegatingDeserializer.class) {
            return new StdDelegatingDeserializer(converter, javaType, jsonDeserializer);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sub-class ");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(" must override 'withDelegate'");
        throw new IllegalStateException(stringBuilder.toString());
    }
}
