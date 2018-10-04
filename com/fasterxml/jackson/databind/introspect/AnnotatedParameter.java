package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class AnnotatedParameter extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    public final int _index;
    public final AnnotatedWithParams _owner;
    public final Type _type;

    public AnnotatedElement getAnnotated() {
        return null;
    }

    public String getName() {
        return JsonProperty.USE_DEFAULT_NAME;
    }

    public AnnotatedParameter(AnnotatedWithParams annotatedWithParams, Type type, AnnotationMap annotationMap, int i) {
        super(annotationMap);
        this._owner = annotatedWithParams;
        this._type = type;
        this._index = i;
    }

    public Annotation getAnnotation(Class cls) {
        return this._annotations == null ? null : this._annotations.get(cls);
    }

    public Class getDeclaringClass() {
        return this._owner.getDeclaringClass();
    }

    public Type getGenericType() {
        return this._type;
    }

    public int getIndex() {
        return this._index;
    }

    public Member getMember() {
        return this._owner.getMember();
    }

    public int getModifiers() {
        return this._owner.getModifiers();
    }

    public AnnotatedWithParams getOwner() {
        return this._owner;
    }

    public Type getParameterType() {
        return this._type;
    }

    public Class getRawType() {
        Type type = this._type;
        if (type instanceof Class) {
            return (Class) type;
        }
        return TypeFactory.defaultInstance().constructType(this._type).getRawClass();
    }

    public Object getValue(Object obj) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot call getValue() on constructor parameter of ");
        stringBuilder.append(getDeclaringClass().getName());
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public void setValue(Object obj, Object obj2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot call setValue() on constructor parameter of ");
        stringBuilder.append(getDeclaringClass().getName());
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[parameter #");
        stringBuilder.append(getIndex());
        stringBuilder.append(", annotations: ");
        stringBuilder.append(this._annotations);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public AnnotatedParameter withAnnotations(AnnotationMap annotationMap) {
        if (annotationMap == this._annotations) {
            return this;
        }
        return this._owner.replaceParameterAnnotations(this._index, annotationMap);
    }
}
