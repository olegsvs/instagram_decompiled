package com.fasterxml.jackson.databind.util;

import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

public final class ClassUtil {

    public class EnumTypeLocator {
        public static final EnumTypeLocator instance = new EnumTypeLocator();
        private final Field enumMapTypeField;
        private final Field enumSetTypeField;

        private EnumTypeLocator() {
            String str = "elementType";
            Class cls = Class.class;
            this.enumSetTypeField = locateField(EnumSet.class, str, cls);
            this.enumMapTypeField = locateField(EnumMap.class, str, cls);
        }

        public Class enumTypeFor(EnumMap enumMap) {
            Field field = this.enumMapTypeField;
            if (field != null) {
                return (Class) get(enumMap, field);
            }
            throw new IllegalStateException("Can not figure out type for EnumMap (odd JDK platform?)");
        }

        public Class enumTypeFor(EnumSet enumSet) {
            Field field = this.enumSetTypeField;
            if (field != null) {
                return (Class) get(enumSet, field);
            }
            throw new IllegalStateException("Can not figure out type for EnumSet (odd JDK platform?)");
        }

        private Object get(Object obj, Field field) {
            try {
                return field.get(obj);
            } catch (Object obj2) {
                throw new IllegalArgumentException(obj2);
            }
        }

        private static java.lang.reflect.Field locateField(java.lang.Class r6, java.lang.String r7, java.lang.Class r8) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r6 = r6.getDeclaredFields();
            r2 = r6.length;
            r5 = 0;
            r1 = 0;
        L_0x0007:
            r4 = 0;
            if (r1 >= r2) goto L_0x0020;
        L_0x000a:
            r3 = r6[r1];
            r0 = r3.getName();
            r0 = r7.equals(r0);
            if (r0 == 0) goto L_0x001d;
        L_0x0016:
            r0 = r3.getType();
            if (r0 != r8) goto L_0x001d;
        L_0x001c:
            goto L_0x0021;
        L_0x001d:
            r1 = r1 + 1;
            goto L_0x0007;
        L_0x0020:
            r3 = r4;
        L_0x0021:
            if (r3 != 0) goto L_0x0035;
        L_0x0023:
            r2 = r6.length;
        L_0x0024:
            if (r5 >= r2) goto L_0x0035;
        L_0x0026:
            r1 = r6[r5];
            r0 = r1.getType();
            if (r0 != r8) goto L_0x0032;
        L_0x002e:
            if (r3 == 0) goto L_0x0031;
        L_0x0030:
            return r4;
        L_0x0031:
            r3 = r1;
        L_0x0032:
            r5 = r5 + 1;
            goto L_0x0024;
        L_0x0035:
            if (r3 == 0) goto L_0x003b;
        L_0x0037:
            r0 = 1;
            r3.setAccessible(r0);	 Catch:{ Throwable -> 0x003b }
        L_0x003b:
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.ClassUtil.EnumTypeLocator.locateField(java.lang.Class, java.lang.String, java.lang.Class):java.lang.reflect.Field");
        }
    }

    private static void _addSuperTypes(Class cls, Class cls2, Collection collection, boolean z) {
        if (!(cls == cls2 || cls == null)) {
            if (cls != Object.class) {
                if (z) {
                    if (!collection.contains(cls)) {
                        collection.add(cls);
                    }
                }
                for (Class _addSuperTypes : cls.getInterfaces()) {
                    _addSuperTypes(_addSuperTypes, cls2, collection, true);
                }
                _addSuperTypes(cls.getSuperclass(), cls2, collection, true);
            }
        }
    }

    public static String canBeABeanType(Class cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (cls.isEnum()) {
            return "enum";
        }
        return cls.isPrimitive() ? "primitive" : null;
    }

    public static void checkAndFixAccess(Member member) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e) {
            if (!accessibleObject.isAccessible()) {
                Class declaringClass = member.getDeclaringClass();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Can not access ");
                stringBuilder.append(member);
                stringBuilder.append(" (from class ");
                stringBuilder.append(declaringClass.getName());
                stringBuilder.append("; failed to set access: ");
                stringBuilder.append(e.getMessage());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    public static Object createInstance(Class cls, boolean z) {
        Constructor findConstructor = findConstructor(cls, z);
        if (findConstructor != null) {
            try {
                return findConstructor.newInstance(new Object[0]);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to instantiate class ");
                stringBuilder.append(cls.getName());
                stringBuilder.append(", problem: ");
                stringBuilder.append(e.getMessage());
                unwrapAndThrowAsIAE(e, stringBuilder.toString());
                return null;
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Class ");
        stringBuilder.append(cls.getName());
        stringBuilder.append(" has no default (no arg) constructor");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static Object defaultValue(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.valueOf(0);
        }
        if (cls == Long.TYPE) {
            return Long.valueOf(0);
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Byte.TYPE) {
            return Byte.valueOf((byte) 0);
        }
        if (cls == Short.TYPE) {
            return Short.valueOf((short) 0);
        }
        if (cls == Character.TYPE) {
            return Character.valueOf('\u0000');
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Class ");
        stringBuilder.append(cls.getName());
        stringBuilder.append(" is not a primitive type");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static Class findClass(String str) {
        if (str.indexOf(46) < 0) {
            if ("int".equals(str)) {
                return Integer.TYPE;
            }
            if ("long".equals(str)) {
                return Long.TYPE;
            }
            if ("float".equals(str)) {
                return Float.TYPE;
            }
            if ("double".equals(str)) {
                return Double.TYPE;
            }
            if ("boolean".equals(str)) {
                return Boolean.TYPE;
            }
            if ("byte".equals(str)) {
                return Byte.TYPE;
            }
            if ("char".equals(str)) {
                return Character.TYPE;
            }
            if ("short".equals(str)) {
                return Short.TYPE;
            }
            if ("void".equals(str)) {
                return Void.TYPE;
            }
        }
        Throwable th = null;
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            try {
                return Class.forName(str, true, contextClassLoader);
            } catch (Throwable e) {
                th = getRootCause(e);
            }
        }
        try {
            return Class.forName(str);
        } catch (Throwable e2) {
            if (th == null) {
                th = getRootCause(e2);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw new ClassNotFoundException(th.getMessage(), th);
        }
    }

    public static java.lang.reflect.Constructor findConstructor(java.lang.Class r3, boolean r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r0 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x005d, Exception -> 0x0038 }
        r1 = r3.getDeclaredConstructor(r0);	 Catch:{ NoSuchMethodException -> 0x005d, Exception -> 0x0038 }
        if (r4 == 0) goto L_0x000d;	 Catch:{ NoSuchMethodException -> 0x005d, Exception -> 0x0038 }
    L_0x0009:
        checkAndFixAccess(r1);	 Catch:{ NoSuchMethodException -> 0x005d, Exception -> 0x0038 }
        goto L_0x0017;	 Catch:{ NoSuchMethodException -> 0x005d, Exception -> 0x0038 }
    L_0x000d:
        r0 = r1.getModifiers();	 Catch:{ NoSuchMethodException -> 0x005d, Exception -> 0x0038 }
        r0 = java.lang.reflect.Modifier.isPublic(r0);	 Catch:{ NoSuchMethodException -> 0x005d, Exception -> 0x0038 }
        if (r0 == 0) goto L_0x0018;	 Catch:{ NoSuchMethodException -> 0x005d, Exception -> 0x0038 }
    L_0x0017:
        return r1;	 Catch:{ NoSuchMethodException -> 0x005d, Exception -> 0x0038 }
    L_0x0018:
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ NoSuchMethodException -> 0x005d, Exception -> 0x0038 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NoSuchMethodException -> 0x005d, Exception -> 0x0038 }
        r1.<init>();	 Catch:{ NoSuchMethodException -> 0x005d, Exception -> 0x0038 }
        r0 = "Default constructor for ";	 Catch:{ NoSuchMethodException -> 0x005d, Exception -> 0x0038 }
        r1.append(r0);	 Catch:{ NoSuchMethodException -> 0x005d, Exception -> 0x0038 }
        r0 = r3.getName();	 Catch:{ NoSuchMethodException -> 0x005d, Exception -> 0x0038 }
        r1.append(r0);	 Catch:{ NoSuchMethodException -> 0x005d, Exception -> 0x0038 }
        r0 = " is not accessible (non-public?): not allowed to try modify access via Reflection: can not instantiate type";	 Catch:{ NoSuchMethodException -> 0x005d, Exception -> 0x0038 }
        r1.append(r0);	 Catch:{ NoSuchMethodException -> 0x005d, Exception -> 0x0038 }
        r0 = r1.toString();	 Catch:{ NoSuchMethodException -> 0x005d, Exception -> 0x0038 }
        r2.<init>(r0);	 Catch:{ NoSuchMethodException -> 0x005d, Exception -> 0x0038 }
        throw r2;	 Catch:{ NoSuchMethodException -> 0x005d, Exception -> 0x0038 }
    L_0x0038:
        r2 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Failed to find default constructor of class ";
        r1.append(r0);
        r0 = r3.getName();
        r1.append(r0);
        r0 = ", problem: ";
        r1.append(r0);
        r0 = r2.getMessage();
        r1.append(r0);
        r0 = r1.toString();
        unwrapAndThrowAsIAE(r2, r0);
    L_0x005d:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(java.lang.Class, boolean):java.lang.reflect.Constructor");
    }

    public static Class findEnumType(Class cls) {
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }

    public static Class findEnumType(Enum enumR) {
        enumR = enumR.getClass();
        return enumR.getSuperclass() != Enum.class ? enumR.getSuperclass() : enumR;
    }

    public static Class findEnumType(EnumMap enumMap) {
        if (enumMap.isEmpty()) {
            return EnumTypeLocator.instance.enumTypeFor(enumMap);
        }
        return findEnumType((Enum) enumMap.keySet().iterator().next());
    }

    public static Class findEnumType(EnumSet enumSet) {
        if (enumSet.isEmpty()) {
            return EnumTypeLocator.instance.enumTypeFor(enumSet);
        }
        return findEnumType((Enum) enumSet.iterator().next());
    }

    public static List findSuperTypes(Class cls, Class cls2) {
        return findSuperTypes(cls, cls2, new ArrayList(8));
    }

    public static List findSuperTypes(Class cls, Class cls2, List list) {
        _addSuperTypes(cls, cls2, list, false);
        return list;
    }

    public static String getClassDescription(Object obj) {
        if (obj == null) {
            return "unknown";
        }
        if (obj instanceof Class) {
            obj = (Class) obj;
        } else {
            obj = obj.getClass();
        }
        return obj.getName();
    }

    public static java.lang.Class getOuterClass(java.lang.Class r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = 0;
        r0 = r2.getEnclosingMethod();	 Catch:{ SecurityException -> 0x0017, SecurityException -> 0x0017 }
        if (r0 == 0) goto L_0x0008;	 Catch:{ SecurityException -> 0x0017, SecurityException -> 0x0017 }
    L_0x0007:
        return r1;	 Catch:{ SecurityException -> 0x0017, SecurityException -> 0x0017 }
    L_0x0008:
        r0 = r2.getModifiers();	 Catch:{ SecurityException -> 0x0017, SecurityException -> 0x0017 }
        r0 = java.lang.reflect.Modifier.isStatic(r0);	 Catch:{ SecurityException -> 0x0017, SecurityException -> 0x0017 }
        if (r0 != 0) goto L_0x0017;	 Catch:{ SecurityException -> 0x0017, SecurityException -> 0x0017 }
    L_0x0012:
        r0 = r2.getEnclosingClass();	 Catch:{ SecurityException -> 0x0017, SecurityException -> 0x0017 }
        return r0;	 Catch:{ SecurityException -> 0x0017, SecurityException -> 0x0017 }
    L_0x0017:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.ClassUtil.getOuterClass(java.lang.Class):java.lang.Class");
    }

    public static Throwable getRootCause(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    public static boolean hasGetterSignature(Method method) {
        if (!Modifier.isStatic(method.getModifiers())) {
            Class[] parameterTypes = method.getParameterTypes();
            if (parameterTypes == null || parameterTypes.length == 0) {
                if (Void.TYPE != method.getReturnType()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCollectionMapOrArray(Class cls) {
        if (!cls.isArray()) {
            if (!Collection.class.isAssignableFrom(cls)) {
                if (!Map.class.isAssignableFrom(cls)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isConcrete(Class cls) {
        return (cls.getModifiers() & 1536) == null ? true : null;
    }

    public static boolean isConcrete(Member member) {
        return (member.getModifiers() & 1536) == null ? true : null;
    }

    public static boolean isJacksonStdImpl(Class cls) {
        return cls.getAnnotation(JacksonStdImpl.class) != null;
    }

    public static boolean isJacksonStdImpl(Object obj) {
        return (obj == null || isJacksonStdImpl(obj.getClass()) == null) ? null : true;
    }

    public static java.lang.String isLocalType(java.lang.Class r1, boolean r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r1.getEnclosingMethod();	 Catch:{ SecurityException -> 0x001e, SecurityException -> 0x001e }
        if (r0 == 0) goto L_0x0009;	 Catch:{ SecurityException -> 0x001e, SecurityException -> 0x001e }
    L_0x0006:
        r0 = "local/anonymous";	 Catch:{ SecurityException -> 0x001e, SecurityException -> 0x001e }
        return r0;	 Catch:{ SecurityException -> 0x001e, SecurityException -> 0x001e }
    L_0x0009:
        if (r2 != 0) goto L_0x001e;	 Catch:{ SecurityException -> 0x001e, SecurityException -> 0x001e }
    L_0x000b:
        r0 = r1.getEnclosingClass();	 Catch:{ SecurityException -> 0x001e, SecurityException -> 0x001e }
        if (r0 == 0) goto L_0x001e;	 Catch:{ SecurityException -> 0x001e, SecurityException -> 0x001e }
    L_0x0011:
        r0 = r1.getModifiers();	 Catch:{ SecurityException -> 0x001e, SecurityException -> 0x001e }
        r0 = java.lang.reflect.Modifier.isStatic(r0);	 Catch:{ SecurityException -> 0x001e, SecurityException -> 0x001e }
        if (r0 != 0) goto L_0x001e;	 Catch:{ SecurityException -> 0x001e, SecurityException -> 0x001e }
    L_0x001b:
        r0 = "non-static member class";	 Catch:{ SecurityException -> 0x001e, SecurityException -> 0x001e }
        return r0;	 Catch:{ SecurityException -> 0x001e, SecurityException -> 0x001e }
    L_0x001e:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.ClassUtil.isLocalType(java.lang.Class, boolean):java.lang.String");
    }

    public static boolean isProxyType(Class cls) {
        cls = cls.getName();
        if (!cls.startsWith("net.sf.cglib.proxy.")) {
            if (!cls.startsWith("org.hibernate.proxy.")) {
                return false;
            }
        }
        return true;
    }

    public static void throwAsIAE(Throwable th) {
        throwAsIAE(th, th.getMessage());
    }

    public static void throwAsIAE(Throwable th, String str) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        } else {
            throw new IllegalArgumentException(str, th);
        }
    }

    public static void throwRootCause(Throwable th) {
        th = getRootCause(th);
        if (th instanceof Exception) {
            throw ((Exception) th);
        }
        throw ((Error) th);
    }

    public static void unwrapAndThrowAsIAE(Throwable th) {
        throwAsIAE(getRootCause(th));
    }

    public static void unwrapAndThrowAsIAE(Throwable th, String str) {
        throwAsIAE(getRootCause(th), str);
    }

    public static Class wrapperType(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Class ");
        stringBuilder.append(cls.getName());
        stringBuilder.append(" is not a primitive type");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
