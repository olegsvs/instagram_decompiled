package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class AnnotatedConstructor extends AnnotatedWithParams {
    private static final long serialVersionUID = 1;
    public final Constructor _constructor;
    public AnnotatedConstructor$Serialization _serialization;

    public AnnotatedConstructor(AnnotatedConstructor$Serialization annotatedConstructor$Serialization) {
        super(null, null);
        this._constructor = null;
        this._serialization = annotatedConstructor$Serialization;
    }

    public AnnotatedConstructor(Constructor constructor, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(annotationMap, annotationMapArr);
        if (constructor != null) {
            this._constructor = constructor;
            return;
        }
        throw new IllegalArgumentException("Null constructor not allowed");
    }

    public final Object call() {
        return this._constructor.newInstance(new Object[0]);
    }

    public final Object call(Object[] objArr) {
        return this._constructor.newInstance(objArr);
    }

    public final Object call1(Object obj) {
        return this._constructor.newInstance(new Object[]{obj});
    }

    public Constructor getAnnotated() {
        return this._constructor;
    }

    public Class getDeclaringClass() {
        return this._constructor.getDeclaringClass();
    }

    public Type getGenericParameterType(int i) {
        Type[] genericParameterTypes = this._constructor.getGenericParameterTypes();
        return i >= genericParameterTypes.length ? null : genericParameterTypes[i];
    }

    public Type getGenericType() {
        return getRawType();
    }

    public Member getMember() {
        return this._constructor;
    }

    public int getModifiers() {
        return this._constructor.getModifiers();
    }

    public String getName() {
        return this._constructor.getName();
    }

    public int getParameterCount() {
        return this._constructor.getParameterTypes().length;
    }

    public Class getRawParameterType(int i) {
        Class[] parameterTypes = this._constructor.getParameterTypes();
        return i >= parameterTypes.length ? null : parameterTypes[i];
    }

    public Class getRawType() {
        return this._constructor.getDeclaringClass();
    }

    public JavaType getType(TypeBindings typeBindings) {
        return getType(typeBindings, this._constructor.getTypeParameters());
    }

    public Object getValue(Object obj) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot call getValue() on constructor of ");
        stringBuilder.append(getDeclaringClass().getName());
        throw new UnsupportedOperationException(stringBuilder.toString());
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
        r0 = r0.args;	 Catch:{ Exception -> 0x001c }
        r2 = r3.getDeclaredConstructor(r0);	 Catch:{ Exception -> 0x001c }
        r0 = r2.isAccessible();	 Catch:{ Exception -> 0x001c }
        if (r0 != 0) goto L_0x0015;	 Catch:{ Exception -> 0x001c }
    L_0x0012:
        com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(r2);	 Catch:{ Exception -> 0x001c }
    L_0x0015:
        r1 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;	 Catch:{ Exception -> 0x001c }
        r0 = 0;	 Catch:{ Exception -> 0x001c }
        r1.<init>(r2, r0, r0);	 Catch:{ Exception -> 0x001c }
        return r1;	 Catch:{ Exception -> 0x001c }
    L_0x001c:
        r2 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Could not find constructor with ";
        r1.append(r0);
        r0 = r4._serialization;
        r0 = r0.args;
        r0 = r0.length;
        r1.append(r0);
        r0 = " args from Class '";
        r1.append(r0);
        r0 = r3.getName();
        r1.append(r0);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.AnnotatedConstructor.readResolve():java.lang.Object");
    }

    public void setValue(Object obj, Object obj2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot call setValue() on constructor of ");
        stringBuilder.append(getDeclaringClass().getName());
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[constructor for ");
        stringBuilder.append(getName());
        stringBuilder.append(", annotations: ");
        stringBuilder.append(this._annotations);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public AnnotatedConstructor withAnnotations(AnnotationMap annotationMap) {
        return new AnnotatedConstructor(this._constructor, annotationMap, this._paramAnnotations);
    }

    public Object writeReplace() {
        return new AnnotatedConstructor(new AnnotatedConstructor$Serialization(this._constructor));
    }
}
