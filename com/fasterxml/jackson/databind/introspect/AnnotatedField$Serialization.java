package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;
import java.lang.reflect.Field;

public final class AnnotatedField$Serialization implements Serializable {
    private static final long serialVersionUID = 1;
    public Class clazz;
    public String name;

    public AnnotatedField$Serialization(Field field) {
        this.clazz = field.getDeclaringClass();
        this.name = field.getName();
    }
}
