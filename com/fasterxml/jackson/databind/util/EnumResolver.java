package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;

public class EnumResolver implements Serializable {
    private static final long serialVersionUID = 1;
    public final Class _enumClass;
    public final Enum[] _enums;
    public final HashMap _enumsById;

    public EnumResolver(Class cls, Enum[] enumArr, HashMap hashMap) {
        this._enumClass = cls;
        this._enums = enumArr;
        this._enumsById = hashMap;
    }

    public static EnumResolver constructFor(Class cls, AnnotationIntrospector annotationIntrospector) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr != null) {
            HashMap hashMap = new HashMap();
            for (Enum enumR : enumArr) {
                hashMap.put(annotationIntrospector.findEnumValue(enumR), enumR);
            }
            return new EnumResolver(cls, enumArr, hashMap);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No enum constants for class ");
        stringBuilder.append(cls.getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static EnumResolver constructUnsafe(Class cls, AnnotationIntrospector annotationIntrospector) {
        return constructFor(cls, annotationIntrospector);
    }

    public static EnumResolver constructUnsafeUsingMethod(Class cls, Method method) {
        return constructUsingMethod(cls, method);
    }

    public static EnumResolver constructUnsafeUsingToString(Class cls) {
        return constructUsingToString(cls);
    }

    public static EnumResolver constructUsingMethod(Class cls, Method method) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        HashMap hashMap = new HashMap();
        int length = enumArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return new EnumResolver(cls, enumArr, hashMap);
            }
            Object obj = enumArr[length];
            try {
                Object invoke = method.invoke(obj, new Object[0]);
                if (invoke != null) {
                    hashMap.put(invoke.toString(), obj);
                }
            } catch (Exception e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to access @JsonValue of Enum value ");
                stringBuilder.append(obj);
                stringBuilder.append(": ");
                stringBuilder.append(e.getMessage());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    public static EnumResolver constructUsingToString(Class cls) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        HashMap hashMap = new HashMap();
        int length = enumArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return new EnumResolver(cls, enumArr, hashMap);
            }
            Enum enumR = enumArr[length];
            hashMap.put(enumR.toString(), enumR);
        }
    }

    public Enum findEnum(String str) {
        return (Enum) this._enumsById.get(str);
    }

    public Enum getEnum(int i) {
        if (i >= 0) {
            Enum[] enumArr = this._enums;
            if (i < enumArr.length) {
                return enumArr[i];
            }
        }
        return null;
    }

    public Class getEnumClass() {
        return this._enumClass;
    }

    public int lastValidIndex() {
        return this._enums.length - 1;
    }
}
