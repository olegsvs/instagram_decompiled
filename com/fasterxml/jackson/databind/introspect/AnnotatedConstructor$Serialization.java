package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;
import java.lang.reflect.Constructor;

public final class AnnotatedConstructor$Serialization implements Serializable {
    private static final long serialVersionUID = 1;
    public Class[] args;
    public Class clazz;

    public AnnotatedConstructor$Serialization(Constructor constructor) {
        this.clazz = constructor.getDeclaringClass();
        this.args = constructor.getParameterTypes();
    }
}
