package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public abstract class TypeSerializerBase extends TypeSerializer {
    public final TypeIdResolver _idResolver;
    public final BeanProperty _property;

    public String getPropertyName() {
        return null;
    }

    public abstract As getTypeInclusion();

    public TypeSerializerBase(TypeIdResolver typeIdResolver, BeanProperty beanProperty) {
        this._idResolver = typeIdResolver;
        this._property = beanProperty;
    }

    public TypeIdResolver getTypeIdResolver() {
        return this._idResolver;
    }

    public String idFromValue(Object obj) {
        return this._idResolver.idFromValue(obj);
    }

    public String idFromValueAndType(Object obj, Class cls) {
        return this._idResolver.idFromValueAndType(obj, cls);
    }
}
