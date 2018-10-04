package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

public abstract class Annotated {
    public abstract AnnotationMap getAllAnnotations();

    public abstract AnnotatedElement getAnnotated();

    public abstract Annotation getAnnotation(Class cls);

    public abstract Type getGenericType();

    public abstract int getModifiers();

    public abstract String getName();

    public abstract Class getRawType();

    public abstract Annotated withAnnotations(AnnotationMap annotationMap);

    public JavaType getType(TypeBindings typeBindings) {
        return typeBindings.resolveType(getGenericType());
    }

    public final boolean hasAnnotation(Class cls) {
        return getAnnotation(cls) != null;
    }

    public final boolean isPublic() {
        return Modifier.isPublic(getModifiers());
    }

    public final Annotated withFallBackAnnotationsFrom(Annotated annotated) {
        return withAnnotations(AnnotationMap.merge(getAllAnnotations(), annotated.getAllAnnotations()));
    }
}
