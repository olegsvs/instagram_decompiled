package com.fasterxml.jackson.core.type;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class TypeReference implements Comparable {
    public final Type _type;

    public static final int compareTo(TypeReference typeReference) {
        return 0;
    }

    public TypeReference() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new IllegalArgumentException("Internal error: TypeReference constructed without actual type information");
        }
        this._type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }

    public final Type getType() {
        return this._type;
    }
}
