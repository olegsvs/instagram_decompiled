package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;

public class BeanUtil {
    public static boolean isCglibGetCallbacks(AnnotatedMethod annotatedMethod) {
        Class rawType = annotatedMethod.getRawType();
        if (rawType != null) {
            if (rawType.isArray()) {
                Package packageR = rawType.getComponentType().getPackage();
                if (packageR != null) {
                    String name = packageR.getName();
                    if (name.startsWith("net.sf.cglib") || name.startsWith("org.hibernate.repackage.cglib")) {
                        return true;
                    }
                }
            }
        }
        return null;
    }

    public static boolean isGroovyMetaClassGetter(AnnotatedMethod annotatedMethod) {
        Class rawType = annotatedMethod.getRawType();
        if (rawType != null) {
            if (!rawType.isArray()) {
                Package packageR = rawType.getPackage();
                if (packageR != null && packageR.getName().startsWith("groovy.lang")) {
                    return true;
                }
            }
        }
        return null;
    }

    public static boolean isGroovyMetaClassSetter(AnnotatedMethod annotatedMethod) {
        Package packageR = annotatedMethod.getRawParameterType(0).getPackage();
        if (packageR == null || !packageR.getName().startsWith("groovy.lang")) {
            return false;
        }
        return true;
    }

    public static String manglePropertyName(String str) {
        int length = str.length();
        StringBuilder stringBuilder = null;
        if (length == 0) {
            return null;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            char toLowerCase = Character.toLowerCase(charAt);
            if (charAt == toLowerCase) {
                break;
            }
            if (stringBuilder == null) {
                stringBuilder = new StringBuilder(str);
            }
            stringBuilder.setCharAt(i, toLowerCase);
        }
        if (stringBuilder != null) {
            str = stringBuilder.toString();
        }
        return str;
    }

    public static String okNameForGetter(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        String okNameForIsGetter = okNameForIsGetter(annotatedMethod, name);
        return okNameForIsGetter == null ? okNameForRegularGetter(annotatedMethod, name) : okNameForIsGetter;
    }

    public static String okNameForIsGetter(AnnotatedMethod annotatedMethod, String str) {
        if (str.startsWith("is")) {
            Class rawType = annotatedMethod.getRawType();
            if (rawType == Boolean.class || rawType == Boolean.TYPE) {
                return manglePropertyName(str.substring(2));
            }
        }
        return null;
    }

    public static String okNameForMutator(AnnotatedMethod annotatedMethod, String str) {
        annotatedMethod = annotatedMethod.getName();
        return annotatedMethod.startsWith(str) ? manglePropertyName(annotatedMethod.substring(str.length())) : null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String okNameForRegularGetter(com.fasterxml.jackson.databind.introspect.AnnotatedMethod r2, java.lang.String r3) {
        /*
        r0 = "get";
        r0 = r3.startsWith(r0);
        r1 = 0;
        if (r0 == 0) goto L_0x0017;
    L_0x0009:
        r0 = "getCallbacks";
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x0018;
    L_0x0011:
        r0 = isCglibGetCallbacks(r2);
        if (r0 == 0) goto L_0x0027;
    L_0x0017:
        return r1;
    L_0x0018:
        r0 = "getMetaClass";
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x0027;
    L_0x0020:
        r0 = isGroovyMetaClassGetter(r2);
        if (r0 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0017;
    L_0x0027:
        r0 = 3;
        r0 = r3.substring(r0);
        r0 = manglePropertyName(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.BeanUtil.okNameForRegularGetter(com.fasterxml.jackson.databind.introspect.AnnotatedMethod, java.lang.String):java.lang.String");
    }

    public static String okNameForSetter(AnnotatedMethod annotatedMethod) {
        String okNameForMutator = okNameForMutator(annotatedMethod, "set");
        if (okNameForMutator == null || ("metaClass".equals(okNameForMutator) && isGroovyMetaClassSetter(annotatedMethod))) {
            return null;
        }
        return okNameForMutator;
    }
}
