package com.fasterxml.jackson.annotation;

public abstract class ObjectIdGenerators$Base extends ObjectIdGenerator {
    public final Class _scope;

    public abstract Object generateId(Object obj);

    public ObjectIdGenerators$Base(Class cls) {
        this._scope = cls;
    }

    public boolean canUseFor(ObjectIdGenerator objectIdGenerator) {
        return objectIdGenerator.getClass() == getClass() && objectIdGenerator.getScope() == this._scope;
    }

    public final Class getScope() {
        return this._scope;
    }
}
