package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;

public abstract class AnnotatedMember extends Annotated implements Serializable {
    private static final long serialVersionUID = 7364428299211355871L;
    public final transient AnnotationMap _annotations;

    public abstract Class getDeclaringClass();

    public abstract Member getMember();

    public abstract Object getValue(Object obj);

    public abstract void setValue(Object obj, Object obj2);

    public AnnotatedMember(AnnotationMap annotationMap) {
        this._annotations = annotationMap;
    }

    public final void addIfNotPresent(Annotation annotation) {
        this._annotations.addIfNotPresent(annotation);
    }

    public final void addOrOverride(Annotation annotation) {
        this._annotations.add(annotation);
    }

    public final void fixAccess() {
        ClassUtil.checkAndFixAccess(getMember());
    }

    public AnnotationMap getAllAnnotations() {
        return this._annotations;
    }
}
