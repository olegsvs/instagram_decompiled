package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.EnumMap;
import java.util.EnumSet;

public class ClassNameIdResolver extends TypeIdResolverBase {
    public void registerSubtype(Class cls, String str) {
    }

    public ClassNameIdResolver(JavaType javaType, TypeFactory typeFactory) {
        super(javaType, typeFactory);
    }

    public final String _idFrom(Object obj, Class cls) {
        if (Enum.class.isAssignableFrom(cls) && !cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        String name = cls.getName();
        if (!name.startsWith("java.util")) {
            return (name.indexOf(36) < 0 || ClassUtil.getOuterClass(cls) == null || ClassUtil.getOuterClass(this._baseType.getRawClass()) != null) ? name : this._baseType.getRawClass().getName();
        } else {
            if (obj instanceof EnumSet) {
                return TypeFactory.defaultInstance().constructCollectionType(EnumSet.class, ClassUtil.findEnumType((EnumSet) obj)).toCanonical();
            } else if (obj instanceof EnumMap) {
                return TypeFactory.defaultInstance().constructMapType(EnumMap.class, ClassUtil.findEnumType((EnumMap) obj), Object.class).toCanonical();
            } else {
                String substring = name.substring(9);
                if ((substring.startsWith(".Arrays$") || substring.startsWith(".Collections$")) && name.indexOf("List") >= 0) {
                    return "java.util.ArrayList";
                }
                return name;
            }
        }
    }

    public Id getMechanism() {
        return Id.CLASS;
    }

    public String idFromValue(Object obj) {
        return _idFrom(obj, obj.getClass());
    }

    public String idFromValueAndType(Object obj, Class cls) {
        return _idFrom(obj, cls);
    }

    public com.fasterxml.jackson.databind.JavaType typeFromId(java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = 60;
        r0 = r4.indexOf(r0);
        if (r0 <= 0) goto L_0x000f;
    L_0x0008:
        r0 = r3._typeFactory;
        r0 = r0.constructFromCanonical(r4);
        return r0;
    L_0x000f:
        r2 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(r4);	 Catch:{ ClassNotFoundException -> 0x0040, Exception -> 0x001c }
        r1 = r3._typeFactory;	 Catch:{ ClassNotFoundException -> 0x0040, Exception -> 0x001c }
        r0 = r3._baseType;	 Catch:{ ClassNotFoundException -> 0x0040, Exception -> 0x001c }
        r0 = r1.constructSpecializedType(r0, r2);	 Catch:{ ClassNotFoundException -> 0x0040, Exception -> 0x001c }
        return r0;	 Catch:{ ClassNotFoundException -> 0x0040, Exception -> 0x001c }
    L_0x001c:
        r3 = move-exception;
        r2 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Invalid type id '";
        r1.append(r0);
        r1.append(r4);
        r0 = "' (for id type 'Id.class'): ";
        r1.append(r0);
        r0 = r3.getMessage();
        r1.append(r0);
        r0 = r1.toString();
        r2.<init>(r0, r3);
        throw r2;
    L_0x0040:
        r2 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Invalid type id '";
        r1.append(r0);
        r1.append(r4);
        r0 = "' (for id type 'Id.class'): no such class found";
        r1.append(r0);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver.typeFromId(java.lang.String):com.fasterxml.jackson.databind.JavaType");
    }
}
