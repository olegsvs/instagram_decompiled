package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

public abstract class StdConverter implements Converter {
    public abstract Object convert(Object obj);

    public JavaType getInputType(TypeFactory typeFactory) {
        JavaType[] findTypeParameters = typeFactory.findTypeParameters(getClass(), Converter.class);
        if (findTypeParameters != null && findTypeParameters.length >= 2) {
            return findTypeParameters[0];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not find OUT type parameter for Converter of type ");
        stringBuilder.append(getClass().getName());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public JavaType getOutputType(TypeFactory typeFactory) {
        JavaType[] findTypeParameters = typeFactory.findTypeParameters(getClass(), Converter.class);
        if (findTypeParameters != null && findTypeParameters.length >= 2) {
            return findTypeParameters[1];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not find OUT type parameter for Converter of type ");
        stringBuilder.append(getClass().getName());
        throw new IllegalStateException(stringBuilder.toString());
    }
}
