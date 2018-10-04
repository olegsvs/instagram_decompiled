package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public abstract class AnnotatedWithParams extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    public final AnnotationMap[] _paramAnnotations;

    public abstract Object call();

    public abstract Object call(Object[] objArr);

    public abstract Object call1(Object obj);

    public abstract Type getGenericParameterType(int i);

    public abstract int getParameterCount();

    public abstract Class getRawParameterType(int i);

    public AnnotatedWithParams(AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(annotationMap);
        this._paramAnnotations = annotationMapArr;
    }

    public final void addOrOverrideParam(int i, Annotation annotation) {
        AnnotationMap annotationMap = this._paramAnnotations[i];
        if (annotationMap == null) {
            annotationMap = new AnnotationMap();
            this._paramAnnotations[i] = annotationMap;
        }
        annotationMap.add(annotation);
    }

    public final Annotation getAnnotation(Class cls) {
        return this._annotations.get(cls);
    }

    public final int getAnnotationCount() {
        return this._annotations.size();
    }

    public final AnnotatedParameter getParameter(int i) {
        return new AnnotatedParameter(this, getGenericParameterType(i), getParameterAnnotations(i), i);
    }

    public final AnnotationMap getParameterAnnotations(int i) {
        AnnotationMap[] annotationMapArr = this._paramAnnotations;
        return (annotationMapArr == null || i < 0 || i > annotationMapArr.length) ? null : annotationMapArr[i];
    }

    public JavaType getType(TypeBindings typeBindings, TypeVariable[] typeVariableArr) {
        if (typeVariableArr != null && typeVariableArr.length > 0) {
            typeBindings = typeBindings.childInstance();
            for (TypeVariable typeVariable : typeVariableArr) {
                JavaType unknownType;
                typeBindings._addPlaceholder(typeVariable.getName());
                Type type = typeVariable.getBounds()[0];
                if (type == null) {
                    unknownType = TypeFactory.unknownType();
                } else {
                    unknownType = typeBindings.resolveType(type);
                }
                typeBindings.addBinding(typeVariable.getName(), unknownType);
            }
        }
        return typeBindings.resolveType(getGenericType());
    }

    public AnnotatedParameter replaceParameterAnnotations(int i, AnnotationMap annotationMap) {
        this._paramAnnotations[i] = annotationMap;
        return getParameter(i);
    }

    public final JavaType resolveParameterType(int i, TypeBindings typeBindings) {
        return typeBindings.resolveType(getGenericParameterType(i));
    }
}
