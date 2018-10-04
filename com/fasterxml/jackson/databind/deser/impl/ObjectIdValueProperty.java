package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.lang.annotation.Annotation;

public final class ObjectIdValueProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    public final ObjectIdReader _objectIdReader;

    public Annotation getAnnotation(Class cls) {
        return null;
    }

    public AnnotatedMember getMember() {
        return null;
    }

    public ObjectIdValueProperty(ObjectIdReader objectIdReader) {
        this(objectIdReader, true);
    }

    public ObjectIdValueProperty(ObjectIdReader objectIdReader, boolean z) {
        super(objectIdReader.propertyName, objectIdReader.idType, null, null, null, z);
        this._objectIdReader = objectIdReader;
        this._valueDeserializer = objectIdReader.deserializer;
    }

    public ObjectIdValueProperty(ObjectIdValueProperty objectIdValueProperty, JsonDeserializer jsonDeserializer) {
        super((SettableBeanProperty) objectIdValueProperty, jsonDeserializer);
        this._objectIdReader = objectIdValueProperty._objectIdReader;
    }

    public ObjectIdValueProperty(ObjectIdValueProperty objectIdValueProperty, String str) {
        super((SettableBeanProperty) objectIdValueProperty, str);
        this._objectIdReader = objectIdValueProperty._objectIdReader;
    }

    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        deserializeSetAndReturn(jsonParser, deserializationContext, obj);
    }

    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Object deserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
        deserializationContext.findObjectId(deserialize, this._objectIdReader.generator).bindItem(obj);
        SettableBeanProperty settableBeanProperty = this._objectIdReader.idProperty;
        return settableBeanProperty != null ? settableBeanProperty.setAndReturn(obj, deserialize) : obj;
    }

    public void set(Object obj, Object obj2) {
        setAndReturn(obj, obj2);
    }

    public Object setAndReturn(Object obj, Object obj2) {
        SettableBeanProperty settableBeanProperty = this._objectIdReader.idProperty;
        if (settableBeanProperty != null) {
            return settableBeanProperty.setAndReturn(obj, obj2);
        }
        throw new UnsupportedOperationException("Should not call set() on ObjectIdProperty that has no SettableBeanProperty");
    }

    public ObjectIdValueProperty withName(String str) {
        return new ObjectIdValueProperty(this, str);
    }

    public ObjectIdValueProperty withValueDeserializer(JsonDeserializer jsonDeserializer) {
        return new ObjectIdValueProperty(this, jsonDeserializer);
    }
}
