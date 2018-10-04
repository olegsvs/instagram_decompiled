package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

public final class InnerClassProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    public final Constructor _creator;
    public final SettableBeanProperty _delegate;

    public InnerClassProperty(SettableBeanProperty settableBeanProperty, Constructor constructor) {
        super(settableBeanProperty);
        this._delegate = settableBeanProperty;
        this._creator = constructor;
    }

    public InnerClassProperty(InnerClassProperty innerClassProperty, JsonDeserializer jsonDeserializer) {
        super((SettableBeanProperty) innerClassProperty, jsonDeserializer);
        this._delegate = innerClassProperty._delegate.withValueDeserializer(jsonDeserializer);
        this._creator = innerClassProperty._creator;
    }

    public InnerClassProperty(InnerClassProperty innerClassProperty, String str) {
        super((SettableBeanProperty) innerClassProperty, str);
        this._delegate = innerClassProperty._delegate.withName(str);
        this._creator = innerClassProperty._creator;
    }

    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Object obj2 = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            if (this._nullProvider != null) {
                obj2 = this._nullProvider.nullValue(deserializationContext);
            }
        } else if (this._valueTypeDeserializer != null) {
            obj2 = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, this._valueTypeDeserializer);
        } else {
            try {
                obj2 = this._creator.newInstance(new Object[]{obj});
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to instantiate class ");
                stringBuilder.append(this._creator.getDeclaringClass().getName());
                stringBuilder.append(", problem: ");
                stringBuilder.append(e.getMessage());
                ClassUtil.unwrapAndThrowAsIAE(e, stringBuilder.toString());
            }
            this._valueDeserializer.deserialize(jsonParser, deserializationContext, obj2);
        }
        set(obj, obj2);
    }

    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        return setAndReturn(obj, deserialize(jsonParser, deserializationContext));
    }

    public Annotation getAnnotation(Class cls) {
        return this._delegate.getAnnotation(cls);
    }

    public AnnotatedMember getMember() {
        return this._delegate.getMember();
    }

    public final void set(Object obj, Object obj2) {
        this._delegate.set(obj, obj2);
    }

    public Object setAndReturn(Object obj, Object obj2) {
        return this._delegate.setAndReturn(obj, obj2);
    }

    public InnerClassProperty withName(String str) {
        return new InnerClassProperty(this, str);
    }

    public InnerClassProperty withValueDeserializer(JsonDeserializer jsonDeserializer) {
        return new InnerClassProperty(this, jsonDeserializer);
    }
}
