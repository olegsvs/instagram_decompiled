package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.Annotations;
import java.lang.annotation.Annotation;
import java.util.HashMap;

public final class AnnotationMap implements Annotations {
    public HashMap _annotations;

    private AnnotationMap(HashMap hashMap) {
        this._annotations = hashMap;
    }

    public final void _add(Annotation annotation) {
        if (this._annotations == null) {
            this._annotations = new HashMap();
        }
        this._annotations.put(annotation.annotationType(), annotation);
    }

    public void add(Annotation annotation) {
        _add(annotation);
    }

    public void addIfNotPresent(Annotation annotation) {
        HashMap hashMap = this._annotations;
        if (hashMap == null || !hashMap.containsKey(annotation.annotationType())) {
            _add(annotation);
        }
    }

    public Annotation get(Class cls) {
        HashMap hashMap = this._annotations;
        if (hashMap == null) {
            return null;
        }
        return (Annotation) hashMap.get(cls);
    }

    public static AnnotationMap merge(AnnotationMap annotationMap, AnnotationMap annotationMap2) {
        if (annotationMap != null) {
            HashMap hashMap = annotationMap._annotations;
            if (hashMap != null) {
                if (!hashMap.isEmpty()) {
                    if (annotationMap2 != null) {
                        hashMap = annotationMap2._annotations;
                        if (hashMap != null) {
                            if (!hashMap.isEmpty()) {
                                HashMap hashMap2 = new HashMap();
                                for (Annotation annotation : annotationMap2._annotations.values()) {
                                    hashMap2.put(annotation.annotationType(), annotation);
                                }
                                for (Annotation annotation2 : annotationMap._annotations.values()) {
                                    hashMap2.put(annotation2.annotationType(), annotation2);
                                }
                                return new AnnotationMap(hashMap2);
                            }
                        }
                    }
                    return annotationMap;
                }
            }
        }
        return annotationMap2;
    }

    public int size() {
        HashMap hashMap = this._annotations;
        return hashMap == null ? 0 : hashMap.size();
    }

    public String toString() {
        HashMap hashMap = this._annotations;
        if (hashMap == null) {
            return "[null]";
        }
        return hashMap.toString();
    }
}
