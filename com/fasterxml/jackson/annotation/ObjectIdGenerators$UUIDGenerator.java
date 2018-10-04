package com.fasterxml.jackson.annotation;

import com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey;
import java.util.UUID;

public final class ObjectIdGenerators$UUIDGenerator extends ObjectIdGenerators$Base {
    private static final long serialVersionUID = 1;

    public ObjectIdGenerator forScope(Class cls) {
        return this;
    }

    public ObjectIdGenerator newForSerialization(Object obj) {
        return this;
    }

    public ObjectIdGenerators$UUIDGenerator() {
        this(Object.class);
    }

    private ObjectIdGenerators$UUIDGenerator(Class cls) {
        super(Object.class);
    }

    public boolean canUseFor(ObjectIdGenerator objectIdGenerator) {
        return objectIdGenerator.getClass() == getClass();
    }

    public UUID generateId(Object obj) {
        return UUID.randomUUID();
    }

    public IdKey key(Object obj) {
        return new IdKey(getClass(), null, obj);
    }
}
