package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public final class EnumValues {
    private final Class _enumClass;
    private final EnumMap _values;

    private EnumValues(Class cls, Map map) {
        this._enumClass = cls;
        this._values = new EnumMap(map);
    }

    public static EnumValues construct(Class cls, AnnotationIntrospector annotationIntrospector) {
        return constructFromName(cls, annotationIntrospector);
    }

    public static EnumValues constructFromName(Class cls, AnnotationIntrospector annotationIntrospector) {
        Enum[] enumArr = (Enum[]) ClassUtil.findEnumType(cls).getEnumConstants();
        if (enumArr != null) {
            Map hashMap = new HashMap();
            for (Enum enumR : enumArr) {
                hashMap.put(enumR, new SerializedString(annotationIntrospector.findEnumValue(enumR)));
            }
            return new EnumValues(cls, hashMap);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not determine enum constants for Class ");
        stringBuilder.append(cls.getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static EnumValues constructFromToString(Class cls, AnnotationIntrospector annotationIntrospector) {
        Enum[] enumArr = (Enum[]) ClassUtil.findEnumType(cls).getEnumConstants();
        if (enumArr != null) {
            Map hashMap = new HashMap();
            for (Enum enumR : enumArr) {
                hashMap.put(enumR, new SerializedString(enumR.toString()));
            }
            return new EnumValues(cls, hashMap);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not determine enum constants for Class ");
        stringBuilder.append(cls.getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public Class getEnumClass() {
        return this._enumClass;
    }

    public EnumMap internalMap() {
        return this._values;
    }

    public SerializedString serializedValueFor(Enum enumR) {
        return (SerializedString) this._values.get(enumR);
    }

    public Collection values() {
        return this._values.values();
    }
}
