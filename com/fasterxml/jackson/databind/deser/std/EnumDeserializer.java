package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.lang.reflect.Method;

public class EnumDeserializer extends StdScalarDeserializer {
    private static final long serialVersionUID = -5893263645879532318L;
    public final EnumResolver _resolver;

    public class FactoryBasedDeserializer extends StdScalarDeserializer {
        private static final long serialVersionUID = -7775129435872564122L;
        public final Class _enumClass;
        public final Method _factory;
        public final Class _inputType;

        public FactoryBasedDeserializer(Class cls, AnnotatedMethod annotatedMethod, Class cls2) {
            super(Enum.class);
            this._enumClass = cls;
            this._factory = annotatedMethod.getAnnotated();
            this._inputType = cls2;
        }

        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            Class cls = this._inputType;
            if (cls == null) {
                deserializationContext = jsonParser.getText();
            } else if (cls == Integer.class) {
                deserializationContext = Integer.valueOf(jsonParser.getValueAsInt());
            } else if (cls == Long.class) {
                deserializationContext = Long.valueOf(jsonParser.getValueAsLong());
            } else {
                throw deserializationContext.mappingException(this._enumClass);
            }
            try {
                return this._factory.invoke(this._enumClass, new Object[]{deserializationContext});
            } catch (Throwable e) {
                ClassUtil.unwrapAndThrowAsIAE(e);
                return null;
            }
        }
    }

    public boolean isCachable() {
        return true;
    }

    public EnumDeserializer(EnumResolver enumResolver) {
        super(Enum.class);
        this._resolver = enumResolver;
    }

    public Enum deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Enum enumR;
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken != JsonToken.VALUE_STRING) {
            if (currentToken != JsonToken.FIELD_NAME) {
                if (currentToken != JsonToken.VALUE_NUMBER_INT) {
                    throw deserializationContext.mappingException(this._resolver.getEnumClass());
                } else if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                    throw deserializationContext.mappingException("Not allowed to deserialize Enum value out of JSON number (disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow)");
                } else {
                    int intValue = jsonParser.getIntValue();
                    enumR = this._resolver.getEnum(intValue);
                    if (enumR == null) {
                        if (!deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                            Number valueOf = Integer.valueOf(intValue);
                            Class enumClass = this._resolver.getEnumClass();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("index value outside legal index range [0..");
                            stringBuilder.append(this._resolver.lastValidIndex());
                            stringBuilder.append("]");
                            throw deserializationContext.weirdNumberException(valueOf, enumClass, stringBuilder.toString());
                        }
                    }
                    return enumR;
                }
            }
        }
        String text = jsonParser.getText();
        enumR = this._resolver.findEnum(text);
        if (enumR == null) {
            if (deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && (text.length() == 0 || text.trim().length() == 0)) {
                return null;
            }
            if (!deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                throw deserializationContext.weirdStringException(text, this._resolver.getEnumClass(), "value not one of declared Enum instance names");
            }
        }
        return enumR;
    }

    public static JsonDeserializer deserializerForCreator(DeserializationConfig deserializationConfig, Class cls, AnnotatedMethod annotatedMethod) {
        Class rawParameterType = annotatedMethod.getRawParameterType(0);
        if (rawParameterType == String.class) {
            rawParameterType = null;
        } else {
            if (rawParameterType != Integer.TYPE) {
                if (rawParameterType != Integer.class) {
                    if (rawParameterType != Long.TYPE) {
                        if (rawParameterType != Long.class) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Parameter #0 type for factory method (");
                            stringBuilder.append(annotatedMethod);
                            stringBuilder.append(") not suitable, must be java.lang.String or int/Integer/long/Long");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    rawParameterType = Long.class;
                }
            }
            rawParameterType = Integer.class;
        }
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotatedMethod.getMember());
        }
        return new FactoryBasedDeserializer(cls, annotatedMethod, rawParameterType);
    }
}
