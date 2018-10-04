package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.HashMap;

public class SimpleAbstractTypeResolver extends AbstractTypeResolver implements Serializable {
    private static final long serialVersionUID = 8635483102371490919L;
    public final HashMap _mappings = new HashMap();

    public JavaType resolveAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) {
        return null;
    }

    public SimpleAbstractTypeResolver addMapping(Class cls, Class cls2) {
        if (cls == cls2) {
            throw new IllegalArgumentException("Can not add mapping from class to itself");
        } else if (!cls.isAssignableFrom(cls2)) {
            r1 = new StringBuilder();
            r1.append("Can not add mapping from class ");
            r1.append(cls.getName());
            r1.append(" to ");
            r1.append(cls2.getName());
            r1.append(", as latter is not a subtype of former");
            throw new IllegalArgumentException(r1.toString());
        } else if (Modifier.isAbstract(cls.getModifiers())) {
            this._mappings.put(new ClassKey(cls), cls2);
            return this;
        } else {
            r1 = new StringBuilder();
            r1.append("Can not add mapping from class ");
            r1.append(cls.getName());
            r1.append(" since it is not abstract");
            throw new IllegalArgumentException(r1.toString());
        }
    }

    public JavaType findTypeMapping(DeserializationConfig deserializationConfig, JavaType javaType) {
        Class cls = (Class) this._mappings.get(new ClassKey(javaType.getRawClass()));
        if (cls == null) {
            return null;
        }
        return javaType.narrowBy(cls);
    }
}
