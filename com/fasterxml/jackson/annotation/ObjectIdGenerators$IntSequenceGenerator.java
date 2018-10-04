package com.fasterxml.jackson.annotation;

import com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey;

public final class ObjectIdGenerators$IntSequenceGenerator extends ObjectIdGenerators$Base {
    private static final long serialVersionUID = 1;
    public transient int _nextValue;

    public int initialValue() {
        return 1;
    }

    public ObjectIdGenerators$IntSequenceGenerator() {
        this(Object.class, -1);
    }

    public ObjectIdGenerators$IntSequenceGenerator(Class cls, int i) {
        super(cls);
        this._nextValue = i;
    }

    public ObjectIdGenerator forScope(Class cls) {
        return this._scope == cls ? this : new ObjectIdGenerators$IntSequenceGenerator(cls, this._nextValue);
    }

    public Integer generateId(Object obj) {
        int i = this._nextValue;
        this._nextValue = i + 1;
        return Integer.valueOf(i);
    }

    public IdKey key(Object obj) {
        return new IdKey(getClass(), this._scope, obj);
    }

    public ObjectIdGenerator newForSerialization(Object obj) {
        return new ObjectIdGenerators$IntSequenceGenerator(this._scope, initialValue());
    }
}
