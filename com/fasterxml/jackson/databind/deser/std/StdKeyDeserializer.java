package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

public abstract class StdKeyDeserializer extends KeyDeserializer implements Serializable {
    private static final long serialVersionUID = 1;
    public final Class _keyClass;

    public final class DelegatingKD extends KeyDeserializer implements Serializable {
        private static final long serialVersionUID = 1;
        public final JsonDeserializer _delegate;
        public final Class _keyClass;

        public DelegatingKD(Class cls, JsonDeserializer jsonDeserializer) {
            this._keyClass = cls;
            this._delegate = jsonDeserializer;
        }

        public final Object deserializeKey(String str, DeserializationContext deserializationContext) {
            if (str == null) {
                return null;
            }
            try {
                Object deserialize = this._delegate.deserialize(deserializationContext.getParser(), deserializationContext);
                if (deserialize != null) {
                    return deserialize;
                }
                throw deserializationContext.weirdKeyException(this._keyClass, str, "not a valid representation");
            } catch (Exception e) {
                Class cls = this._keyClass;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("not a valid representation: ");
                stringBuilder.append(e.getMessage());
                throw deserializationContext.weirdKeyException(cls, str, stringBuilder.toString());
            }
        }

        public Class getKeyClass() {
            return this._keyClass;
        }
    }

    @JacksonStdImpl
    public final class BoolKD extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;

        public BoolKD() {
            super(Boolean.class);
        }

        public Boolean _parse(String str, DeserializationContext deserializationContext) {
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equals(str)) {
                return Boolean.FALSE;
            }
            throw deserializationContext.weirdKeyException(this._keyClass, str, "value not 'true' or 'false'");
        }
    }

    @JacksonStdImpl
    public final class ByteKD extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;

        public ByteKD() {
            super(Byte.class);
        }

        public Byte _parse(String str, DeserializationContext deserializationContext) {
            int _parseInt = _parseInt(str);
            if (_parseInt >= -128 && _parseInt <= 255) {
                return Byte.valueOf((byte) _parseInt);
            }
            throw deserializationContext.weirdKeyException(this._keyClass, str, "overflow, value can not be represented as 8-bit value");
        }
    }

    @JacksonStdImpl
    public final class CalendarKD extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;

        public CalendarKD() {
            super(Calendar.class);
        }

        public Object _parse(String str, DeserializationContext deserializationContext) {
            Date parseDate = deserializationContext.parseDate(str);
            if (parseDate == null) {
                return null;
            }
            return deserializationContext.constructCalendar(parseDate);
        }
    }

    @JacksonStdImpl
    public final class CharKD extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;

        public CharKD() {
            super(Character.class);
        }

        public Character _parse(String str, DeserializationContext deserializationContext) {
            if (str.length() == 1) {
                return Character.valueOf(str.charAt(0));
            }
            throw deserializationContext.weirdKeyException(this._keyClass, str, "can only convert 1-character Strings");
        }
    }

    @JacksonStdImpl
    public final class DateKD extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;

        public DateKD() {
            super(Date.class);
        }

        public Object _parse(String str, DeserializationContext deserializationContext) {
            return deserializationContext.parseDate(str);
        }
    }

    @JacksonStdImpl
    public final class DoubleKD extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;

        public DoubleKD() {
            super(Double.class);
        }

        public Double _parse(String str, DeserializationContext deserializationContext) {
            return Double.valueOf(_parseDouble(str));
        }
    }

    @JacksonStdImpl
    public final class EnumKD extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        public final AnnotatedMethod _factory;
        public final EnumResolver _resolver;

        public EnumKD(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
            super(enumResolver.getEnumClass());
            this._resolver = enumResolver;
            this._factory = annotatedMethod;
        }

        public Object _parse(String str, DeserializationContext deserializationContext) {
            AnnotatedWithParams annotatedWithParams = this._factory;
            if (annotatedWithParams != null) {
                try {
                    return annotatedWithParams.call1(str);
                } catch (Throwable e) {
                    ClassUtil.unwrapAndThrowAsIAE(e);
                }
            }
            Enum findEnum = this._resolver.findEnum(str);
            if (findEnum == null) {
                if (!deserializationContext.getConfig().isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    throw deserializationContext.weirdKeyException(this._keyClass, str, "not one of values for Enum class");
                }
            }
            return findEnum;
        }
    }

    @JacksonStdImpl
    public final class FloatKD extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;

        public FloatKD() {
            super(Float.class);
        }

        public Float _parse(String str, DeserializationContext deserializationContext) {
            return Float.valueOf((float) _parseDouble(str));
        }
    }

    @JacksonStdImpl
    public final class IntKD extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;

        public IntKD() {
            super(Integer.class);
        }

        public Integer _parse(String str, DeserializationContext deserializationContext) {
            return Integer.valueOf(_parseInt(str));
        }
    }

    @JacksonStdImpl
    public final class LocaleKD extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        public JdkDeserializers$LocaleDeserializer _localeDeserializer = new JdkDeserializers$LocaleDeserializer();

        public LocaleKD() {
            super(Locale.class);
        }

        public java.util.Locale _parse(java.lang.String r2, com.fasterxml.jackson.databind.DeserializationContext r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r1 = this;
            r0 = r1._localeDeserializer;	 Catch:{ IOException -> 0x0007 }
            r0 = r0._deserialize(r2, r3);	 Catch:{ IOException -> 0x0007 }
            return r0;	 Catch:{ IOException -> 0x0007 }
        L_0x0007:
            r1 = r1._keyClass;
            r0 = "unable to parse key as locale";
            r0 = r3.weirdKeyException(r1, r2, r0);
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.LocaleKD._parse(java.lang.String, com.fasterxml.jackson.databind.DeserializationContext):java.util.Locale");
        }
    }

    @JacksonStdImpl
    public final class LongKD extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;

        public LongKD() {
            super(Long.class);
        }

        public Long _parse(String str, DeserializationContext deserializationContext) {
            return Long.valueOf(_parseLong(str));
        }
    }

    @JacksonStdImpl
    public final class ShortKD extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;

        public ShortKD() {
            super(Integer.class);
        }

        public Short _parse(String str, DeserializationContext deserializationContext) {
            int _parseInt = _parseInt(str);
            if (_parseInt >= -32768 && _parseInt <= 32767) {
                return Short.valueOf((short) _parseInt);
            }
            throw deserializationContext.weirdKeyException(this._keyClass, str, "overflow, value can not be represented as 16-bit value");
        }
    }

    public final class StringCtorKeyDeserializer extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        public final Constructor _ctor;

        public StringCtorKeyDeserializer(Constructor constructor) {
            super(constructor.getDeclaringClass());
            this._ctor = constructor;
        }

        public Object _parse(String str, DeserializationContext deserializationContext) {
            return this._ctor.newInstance(new Object[]{str});
        }
    }

    public final class StringFactoryKeyDeserializer extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        public final Method _factoryMethod;

        public StringFactoryKeyDeserializer(Method method) {
            super(method.getDeclaringClass());
            this._factoryMethod = method;
        }

        public Object _parse(String str, DeserializationContext deserializationContext) {
            return this._factoryMethod.invoke(null, new Object[]{str});
        }
    }

    @JacksonStdImpl
    public final class StringKD extends StdKeyDeserializer {
        private static final StringKD sObject = new StringKD(Object.class);
        private static final StringKD sString = new StringKD(String.class);
        private static final long serialVersionUID = 1;

        public String _parse(String str, DeserializationContext deserializationContext) {
            return str;
        }

        private StringKD(Class cls) {
            super(cls);
        }

        public static StringKD forType(Class cls) {
            if (cls == String.class) {
                return sString;
            }
            if (cls == Object.class) {
                return sObject;
            }
            return new StringKD(cls);
        }
    }

    @JacksonStdImpl
    public final class UuidKD extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;

        public UuidKD() {
            super(UUID.class);
        }

        public Object _parse(String str, DeserializationContext deserializationContext) {
            return UUID.fromString(str);
        }
    }

    public abstract Object _parse(String str, DeserializationContext deserializationContext);

    public StdKeyDeserializer(Class cls) {
        this._keyClass = cls;
    }

    public double _parseDouble(String str) {
        return NumberInput.parseDouble(str);
    }

    public int _parseInt(String str) {
        return Integer.parseInt(str);
    }

    public long _parseLong(String str) {
        return Long.parseLong(str);
    }

    public final Object deserializeKey(String str, DeserializationContext deserializationContext) {
        if (str != null) {
            try {
                Object _parse = _parse(str, deserializationContext);
                if (_parse != null) {
                    return _parse;
                }
                if (!this._keyClass.isEnum() || !deserializationContext.getConfig().isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    throw deserializationContext.weirdKeyException(this._keyClass, str, "not a valid representation");
                }
            } catch (Exception e) {
                Class cls = this._keyClass;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("not a valid representation: ");
                stringBuilder.append(e.getMessage());
                throw deserializationContext.weirdKeyException(cls, str, stringBuilder.toString());
            }
        }
        return null;
    }

    public Class getKeyClass() {
        return this._keyClass;
    }
}
