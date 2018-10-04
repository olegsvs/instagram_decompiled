package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;

public class PropertyBasedObjectIdGenerator extends ObjectIdGenerators$PropertyGenerator {
    private static final long serialVersionUID = 1;

    public ObjectIdGenerator newForSerialization(Object obj) {
        return this;
    }

    public PropertyBasedObjectIdGenerator(Class cls) {
        super(cls);
    }

    public ObjectIdGenerator forScope(Class cls) {
        return cls == this._scope ? this : new PropertyBasedObjectIdGenerator(cls);
    }

    public Object generateId(Object obj) {
        throw new UnsupportedOperationException();
    }

    public IdKey key(Object obj) {
        return new IdKey(getClass(), this._scope, obj);
    }
}
