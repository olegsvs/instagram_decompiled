package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;
import java.lang.reflect.Method;

public final class AnnotatedMethod$Serialization implements Serializable {
    private static final long serialVersionUID = 1;
    public Class[] args;
    public Class clazz;
    public String name;

    public AnnotatedMethod$Serialization(Method method) {
        this.clazz = method.getDeclaringClass();
        this.name = method.getName();
        this.args = method.getParameterTypes();
    }
}
