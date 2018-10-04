package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public final class AnnotatedMethod extends AnnotatedWithParams implements Serializable {
    private static final long serialVersionUID = 1;
    public final transient Method _method;
    public Class[] _paramClasses;
    public AnnotatedMethod$Serialization _serialization;

    public AnnotatedMethod(AnnotatedMethod$Serialization annotatedMethod$Serialization) {
        super(null, null);
        this._method = null;
        this._serialization = annotatedMethod$Serialization;
    }

    public AnnotatedMethod(Method method, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(annotationMap, annotationMapArr);
        if (method != null) {
            this._method = method;
            return;
        }
        throw new IllegalArgumentException("Can not construct AnnotatedMethod with null Method");
    }

    public final Object call() {
        return this._method.invoke(null, new Object[0]);
    }

    public final Object call(Object[] objArr) {
        return this._method.invoke(null, objArr);
    }

    public final Object call1(Object obj) {
        return this._method.invoke(null, new Object[]{obj});
    }

    public Method getAnnotated() {
        return this._method;
    }

    public Class getDeclaringClass() {
        return this._method.getDeclaringClass();
    }

    public String getFullName() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getDeclaringClass().getName());
        stringBuilder.append("#");
        stringBuilder.append(getName());
        stringBuilder.append("(");
        stringBuilder.append(getParameterCount());
        stringBuilder.append(" params)");
        return stringBuilder.toString();
    }

    public Type getGenericParameterType(int i) {
        Type[] genericParameterTypes = this._method.getGenericParameterTypes();
        return i >= genericParameterTypes.length ? null : genericParameterTypes[i];
    }

    public Type[] getGenericParameterTypes() {
        return this._method.getGenericParameterTypes();
    }

    public Type getGenericReturnType() {
        return this._method.getGenericReturnType();
    }

    public Type getGenericType() {
        return this._method.getGenericReturnType();
    }

    public Method getMember() {
        return this._method;
    }

    public int getModifiers() {
        return this._method.getModifiers();
    }

    public String getName() {
        return this._method.getName();
    }

    public int getParameterCount() {
        return getRawParameterTypes().length;
    }

    public Class getRawParameterType(int i) {
        Class[] rawParameterTypes = getRawParameterTypes();
        return i >= rawParameterTypes.length ? null : rawParameterTypes[i];
    }

    public Class[] getRawParameterTypes() {
        if (this._paramClasses == null) {
            this._paramClasses = this._method.getParameterTypes();
        }
        return this._paramClasses;
    }

    public Class getRawReturnType() {
        return this._method.getReturnType();
    }

    public Class getRawType() {
        return this._method.getReturnType();
    }

    public JavaType getType(TypeBindings typeBindings) {
        return getType(typeBindings, this._method.getTypeParameters());
    }

    public Object getValue(Object obj) {
        StringBuilder stringBuilder;
        try {
            return this._method.invoke(obj, new Object[0]);
        } catch (Throwable e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to getValue() with method ");
            stringBuilder.append(getFullName());
            stringBuilder.append(": ");
            stringBuilder.append(e.getMessage());
            throw new IllegalArgumentException(stringBuilder.toString(), e);
        } catch (Throwable e2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to getValue() with method ");
            stringBuilder.append(getFullName());
            stringBuilder.append(": ");
            stringBuilder.append(e2.getMessage());
            throw new IllegalArgumentException(stringBuilder.toString(), e2);
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
        r0 = r4._serialization;	 Catch:{ Exception -> 0x0020 }
        r1 = r0.name;	 Catch:{ Exception -> 0x0020 }
        r0 = r4._serialization;	 Catch:{ Exception -> 0x0020 }
        r0 = r0.args;	 Catch:{ Exception -> 0x0020 }
        r2 = r3.getDeclaredMethod(r1, r0);	 Catch:{ Exception -> 0x0020 }
        r0 = r2.isAccessible();	 Catch:{ Exception -> 0x0020 }
        if (r0 != 0) goto L_0x0019;	 Catch:{ Exception -> 0x0020 }
    L_0x0016:
        com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(r2);	 Catch:{ Exception -> 0x0020 }
    L_0x0019:
        r1 = new com.fasterxml.jackson.databind.introspect.AnnotatedMethod;	 Catch:{ Exception -> 0x0020 }
        r0 = 0;	 Catch:{ Exception -> 0x0020 }
        r1.<init>(r2, r0, r0);	 Catch:{ Exception -> 0x0020 }
        return r1;	 Catch:{ Exception -> 0x0020 }
    L_0x0020:
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
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.AnnotatedMethod.readResolve():java.lang.Object");
    }

    public void setValue(Object obj, Object obj2) {
        StringBuilder stringBuilder;
        try {
            this._method.invoke(obj, new Object[]{obj2});
        } catch (Throwable e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to setValue() with method ");
            stringBuilder.append(getFullName());
            stringBuilder.append(": ");
            stringBuilder.append(e.getMessage());
            throw new IllegalArgumentException(stringBuilder.toString(), e);
        } catch (Throwable e2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to setValue() with method ");
            stringBuilder.append(getFullName());
            stringBuilder.append(": ");
            stringBuilder.append(e2.getMessage());
            throw new IllegalArgumentException(stringBuilder.toString(), e2);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[method ");
        stringBuilder.append(getFullName());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public AnnotatedMethod withAnnotations(AnnotationMap annotationMap) {
        return new AnnotatedMethod(this._method, annotationMap, this._paramAnnotations);
    }

    public AnnotatedMethod withMethod(Method method) {
        return new AnnotatedMethod(method, this._annotations, this._paramAnnotations);
    }

    public Object writeReplace() {
        return new AnnotatedMethod(new AnnotatedMethod$Serialization(this._method));
    }
}
