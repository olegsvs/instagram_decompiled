package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class AnnotatedField extends AnnotatedMember implements Serializable {
    private static final long serialVersionUID = 7364428299211355871L;
    public final transient Field _field;
    public AnnotatedField$Serialization _serialization;

    public AnnotatedField(AnnotatedField$Serialization annotatedField$Serialization) {
        super(null);
        this._field = null;
        this._serialization = annotatedField$Serialization;
    }

    public AnnotatedField(Field field, AnnotationMap annotationMap) {
        super(annotationMap);
        this._field = field;
    }

    public Field getAnnotated() {
        return this._field;
    }

    public Annotation getAnnotation(Class cls) {
        return this._annotations == null ? null : this._annotations.get(cls);
    }

    public int getAnnotationCount() {
        return this._annotations.size();
    }

    public Class getDeclaringClass() {
        return this._field.getDeclaringClass();
    }

    public String getFullName() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getDeclaringClass().getName());
        stringBuilder.append("#");
        stringBuilder.append(getName());
        return stringBuilder.toString();
    }

    public Type getGenericType() {
        return this._field.getGenericType();
    }

    public Member getMember() {
        return this._field;
    }

    public int getModifiers() {
        return this._field.getModifiers();
    }

    public String getName() {
        return this._field.getName();
    }

    public Class getRawType() {
        return this._field.getType();
    }

    public Object getValue(Object obj) {
        try {
            return this._field.get(obj);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to getValue() for field ");
            stringBuilder.append(getFullName());
            stringBuilder.append(": ");
            stringBuilder.append(e.getMessage());
            throw new IllegalArgumentException(stringBuilder.toString(), e);
        }
    }

    public java.lang.Object readResolve() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r4._serialization;
        r3 = r0.clazz;
        r0 = r4._serialization;	 Catch:{ Exception -> 0x001c }
        r0 = r0.name;	 Catch:{ Exception -> 0x001c }
        r2 = r3.getDeclaredField(r0);	 Catch:{ Exception -> 0x001c }
        r0 = r2.isAccessible();	 Catch:{ Exception -> 0x001c }
        if (r0 != 0) goto L_0x0015;	 Catch:{ Exception -> 0x001c }
    L_0x0012:
        com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(r2);	 Catch:{ Exception -> 0x001c }
    L_0x0015:
        r1 = new com.fasterxml.jackson.databind.introspect.AnnotatedField;	 Catch:{ Exception -> 0x001c }
        r0 = 0;	 Catch:{ Exception -> 0x001c }
        r1.<init>(r2, r0);	 Catch:{ Exception -> 0x001c }
        return r1;	 Catch:{ Exception -> 0x001c }
    L_0x001c:
        r2 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Could not find method '";
        r1.append(r0);
        r0 = r4._serialization;
        r0 = r0.name;
        r1.append(r0);
        r0 = "' from Class '";
        r1.append(r0);
        r0 = r3.getName();
        r1.append(r0);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.AnnotatedField.readResolve():java.lang.Object");
    }

    public void setValue(Object obj, Object obj2) {
        try {
            this._field.set(obj, obj2);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to setValue() for field ");
            stringBuilder.append(getFullName());
            stringBuilder.append(": ");
            stringBuilder.append(e.getMessage());
            throw new IllegalArgumentException(stringBuilder.toString(), e);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[field ");
        stringBuilder.append(getFullName());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public AnnotatedField withAnnotations(AnnotationMap annotationMap) {
        return new AnnotatedField(this._field, annotationMap);
    }

    public Object writeReplace() {
        return new AnnotatedField(new AnnotatedField$Serialization(this._field));
    }
}
