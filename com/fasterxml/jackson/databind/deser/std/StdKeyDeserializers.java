package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.BoolKD;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.ByteKD;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.CalendarKD;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.CharKD;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.DateKD;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.DelegatingKD;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.DoubleKD;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.EnumKD;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.FloatKD;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.IntKD;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.LocaleKD;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.LongKD;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.ShortKD;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.StringCtorKeyDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.StringFactoryKeyDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.StringKD;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.UuidKD;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

public class StdKeyDeserializers implements KeyDeserializers, Serializable {
    private static final long serialVersionUID = 923268084968181479L;

    public static KeyDeserializer constructDelegatingKeyDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, JsonDeserializer jsonDeserializer) {
        return new DelegatingKD(javaType.getRawClass(), jsonDeserializer);
    }

    public static KeyDeserializer constructEnumKeyDeserializer(EnumResolver enumResolver) {
        return new EnumKD(enumResolver, null);
    }

    public static KeyDeserializer constructEnumKeyDeserializer(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
        return new EnumKD(enumResolver, annotatedMethod);
    }

    public static KeyDeserializer constructStringKeyDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) {
        return StringKD.forType(javaType.getRawClass());
    }

    public KeyDeserializer findKeyDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        javaType = javaType.getRawClass();
        if (javaType != String.class) {
            if (javaType != Object.class) {
                if (javaType == UUID.class) {
                    return new UuidKD();
                }
                if (javaType.isPrimitive()) {
                    javaType = ClassUtil.wrapperType(javaType);
                }
                if (javaType == Integer.class) {
                    return new IntKD();
                }
                if (javaType == Long.class) {
                    return new LongKD();
                }
                if (javaType == Date.class) {
                    return new DateKD();
                }
                if (javaType == Calendar.class) {
                    return new CalendarKD();
                }
                if (javaType == Boolean.class) {
                    return new BoolKD();
                }
                if (javaType == Byte.class) {
                    return new ByteKD();
                }
                if (javaType == Character.class) {
                    return new CharKD();
                }
                if (javaType == Short.class) {
                    return new ShortKD();
                }
                if (javaType == Float.class) {
                    return new FloatKD();
                }
                if (javaType == Double.class) {
                    return new DoubleKD();
                }
                return javaType == Locale.class ? new LocaleKD() : null;
            }
        }
        return StringKD.forType(javaType);
    }

    public static KeyDeserializer findStringBasedKeyDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) {
        BeanDescription introspect = deserializationConfig.introspect(javaType);
        Class[] clsArr = new Class[1];
        clsArr[0] = String.class;
        Object findSingleArgConstructor = introspect.findSingleArgConstructor(clsArr);
        if (findSingleArgConstructor != null) {
            if (deserializationConfig.canOverrideAccessModifiers()) {
                ClassUtil.checkAndFixAccess(findSingleArgConstructor);
            }
            return new StringCtorKeyDeserializer(findSingleArgConstructor);
        }
        findSingleArgConstructor = introspect.findFactoryMethod(new Class[]{r3});
        if (findSingleArgConstructor == null) {
            return null;
        }
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(findSingleArgConstructor);
        }
        return new StringFactoryKeyDeserializer(findSingleArgConstructor);
    }
}
