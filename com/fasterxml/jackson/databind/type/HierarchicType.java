package com.fasterxml.jackson.databind.type;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class HierarchicType {
    public final Type _actualType;
    public final ParameterizedType _genericType;
    public final Class _rawClass;
    public HierarchicType _subType;
    public HierarchicType _superType;

    public HierarchicType(Type type) {
        this._actualType = type;
        if (type instanceof Class) {
            this._rawClass = (Class) type;
            this._genericType = null;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            this._genericType = parameterizedType;
            this._rawClass = (Class) parameterizedType.getRawType();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Type ");
            stringBuilder.append(type.getClass().getName());
            stringBuilder.append(" can not be used to construct HierarchicType");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private HierarchicType(Type type, Class cls, ParameterizedType parameterizedType, HierarchicType hierarchicType, HierarchicType hierarchicType2) {
        this._actualType = type;
        this._rawClass = cls;
        this._genericType = parameterizedType;
        this._superType = hierarchicType;
        this._subType = hierarchicType2;
    }

    public final ParameterizedType asGeneric() {
        return this._genericType;
    }

    public HierarchicType deepCloneWithoutSubtype() {
        HierarchicType hierarchicType = this._superType;
        HierarchicType deepCloneWithoutSubtype = hierarchicType == null ? null : hierarchicType.deepCloneWithoutSubtype();
        hierarchicType = new HierarchicType(this._actualType, this._rawClass, this._genericType, deepCloneWithoutSubtype, null);
        if (deepCloneWithoutSubtype != null) {
            deepCloneWithoutSubtype.setSubType(hierarchicType);
        }
        return hierarchicType;
    }

    public final Class getRawClass() {
        return this._rawClass;
    }

    public final HierarchicType getSubType() {
        return this._subType;
    }

    public final HierarchicType getSuperType() {
        return this._superType;
    }

    public final boolean isGeneric() {
        return this._genericType != null;
    }

    public void setSubType(HierarchicType hierarchicType) {
        this._subType = hierarchicType;
    }

    public void setSuperType(HierarchicType hierarchicType) {
        this._superType = hierarchicType;
    }

    public String toString() {
        ParameterizedType parameterizedType = this._genericType;
        if (parameterizedType != null) {
            return parameterizedType.toString();
        }
        return this._rawClass.getName();
    }
}
