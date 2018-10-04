package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.io.Serializable;

public class StdValueInstantiator extends ValueInstantiator implements Serializable {
    private static final long serialVersionUID = 1;
    public final boolean _cfgEmptyStringsAsObjects;
    public CreatorProperty[] _constructorArguments;
    public AnnotatedWithParams _defaultCreator;
    public CreatorProperty[] _delegateArguments;
    public AnnotatedWithParams _delegateCreator;
    public JavaType _delegateType;
    public AnnotatedWithParams _fromBooleanCreator;
    public AnnotatedWithParams _fromDoubleCreator;
    public AnnotatedWithParams _fromIntCreator;
    public AnnotatedWithParams _fromLongCreator;
    public AnnotatedWithParams _fromStringCreator;
    public AnnotatedParameter _incompleteParameter;
    public final String _valueTypeDesc;
    public AnnotatedWithParams _withArgsCreator;

    public StdValueInstantiator(DeserializationConfig deserializationConfig, JavaType javaType) {
        boolean z;
        String str;
        if (deserializationConfig == null) {
            z = false;
        } else {
            z = deserializationConfig.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        }
        this._cfgEmptyStringsAsObjects = z;
        if (javaType == null) {
            str = "UNKNOWN TYPE";
        } else {
            str = javaType.toString();
        }
        this._valueTypeDesc = str;
    }

    public StdValueInstantiator(DeserializationConfig deserializationConfig, Class cls) {
        boolean z;
        String str;
        if (deserializationConfig == null) {
            z = false;
        } else {
            z = deserializationConfig.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        }
        this._cfgEmptyStringsAsObjects = z;
        if (cls == null) {
            str = "UNKNOWN TYPE";
        } else {
            str = cls.getName();
        }
        this._valueTypeDesc = str;
    }

    public StdValueInstantiator(StdValueInstantiator stdValueInstantiator) {
        this._cfgEmptyStringsAsObjects = stdValueInstantiator._cfgEmptyStringsAsObjects;
        this._valueTypeDesc = stdValueInstantiator._valueTypeDesc;
        this._defaultCreator = stdValueInstantiator._defaultCreator;
        this._constructorArguments = stdValueInstantiator._constructorArguments;
        this._withArgsCreator = stdValueInstantiator._withArgsCreator;
        this._delegateType = stdValueInstantiator._delegateType;
        this._delegateCreator = stdValueInstantiator._delegateCreator;
        this._delegateArguments = stdValueInstantiator._delegateArguments;
        this._fromStringCreator = stdValueInstantiator._fromStringCreator;
        this._fromIntCreator = stdValueInstantiator._fromIntCreator;
        this._fromLongCreator = stdValueInstantiator._fromLongCreator;
        this._fromDoubleCreator = stdValueInstantiator._fromDoubleCreator;
        this._fromBooleanCreator = stdValueInstantiator._fromBooleanCreator;
    }

    public Object _createFromStringFallbacks(DeserializationContext deserializationContext, String str) {
        if (this._fromBooleanCreator != null) {
            String trim = str.trim();
            if ("true".equals(trim)) {
                return createFromBoolean(deserializationContext, true);
            }
            if ("false".equals(trim)) {
                return createFromBoolean(deserializationContext, false);
            }
        }
        if (this._cfgEmptyStringsAsObjects && str.length() == 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not instantiate value of type ");
        stringBuilder.append(getValueTypeDesc());
        stringBuilder.append(" from String value; no single-String constructor/factory method");
        throw new JsonMappingException(stringBuilder.toString());
    }

    public boolean canCreateFromBoolean() {
        return this._fromBooleanCreator != null;
    }

    public boolean canCreateFromDouble() {
        return this._fromDoubleCreator != null;
    }

    public boolean canCreateFromInt() {
        return this._fromIntCreator != null;
    }

    public boolean canCreateFromLong() {
        return this._fromLongCreator != null;
    }

    public boolean canCreateFromObjectWith() {
        return this._withArgsCreator != null;
    }

    public boolean canCreateFromString() {
        return this._fromStringCreator != null;
    }

    public boolean canCreateUsingDefault() {
        return this._defaultCreator != null;
    }

    public boolean canCreateUsingDelegate() {
        return this._delegateType != null;
    }

    public void configureFromBooleanCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromBooleanCreator = annotatedWithParams;
    }

    public void configureFromDoubleCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromDoubleCreator = annotatedWithParams;
    }

    public void configureFromIntCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromIntCreator = annotatedWithParams;
    }

    public void configureFromLongCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromLongCreator = annotatedWithParams;
    }

    public void configureFromObjectSettings(AnnotatedWithParams annotatedWithParams, AnnotatedWithParams annotatedWithParams2, JavaType javaType, CreatorProperty[] creatorPropertyArr, AnnotatedWithParams annotatedWithParams3, CreatorProperty[] creatorPropertyArr2) {
        this._defaultCreator = annotatedWithParams;
        this._delegateCreator = annotatedWithParams2;
        this._delegateType = javaType;
        this._delegateArguments = creatorPropertyArr;
        this._withArgsCreator = annotatedWithParams3;
        this._constructorArguments = creatorPropertyArr2;
    }

    public void configureFromStringCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromStringCreator = annotatedWithParams;
    }

    public void configureIncompleteParameter(AnnotatedParameter annotatedParameter) {
        this._incompleteParameter = annotatedParameter;
    }

    public Object createFromBoolean(DeserializationContext deserializationContext, boolean z) {
        try {
            if (this._fromBooleanCreator != null) {
                return this._fromBooleanCreator.call1(Boolean.valueOf(z));
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can not instantiate value of type ");
            stringBuilder.append(getValueTypeDesc());
            stringBuilder.append(" from Boolean value; no single-boolean/Boolean-arg constructor/factory method");
            throw new JsonMappingException(stringBuilder.toString());
        } catch (Throwable e) {
            throw wrapException(e);
        } catch (Throwable e2) {
            throw wrapException(e2);
        }
    }

    public Object createFromDouble(DeserializationContext deserializationContext, double d) {
        try {
            if (this._fromDoubleCreator != null) {
                return this._fromDoubleCreator.call1(Double.valueOf(d));
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can not instantiate value of type ");
            stringBuilder.append(getValueTypeDesc());
            stringBuilder.append(" from Floating-point number; no one-double/Double-arg constructor/factory method");
            throw new JsonMappingException(stringBuilder.toString());
        } catch (Throwable e) {
            throw wrapException(e);
        } catch (Throwable e2) {
            throw wrapException(e2);
        }
    }

    public Object createFromInt(DeserializationContext deserializationContext, int i) {
        try {
            if (this._fromIntCreator != null) {
                return this._fromIntCreator.call1(Integer.valueOf(i));
            }
            if (this._fromLongCreator != null) {
                return this._fromLongCreator.call1(Long.valueOf((long) i));
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can not instantiate value of type ");
            stringBuilder.append(getValueTypeDesc());
            stringBuilder.append(" from Integral number; no single-int-arg constructor/factory method");
            throw new JsonMappingException(stringBuilder.toString());
        } catch (Throwable e) {
            throw wrapException(e);
        } catch (Throwable e2) {
            throw wrapException(e2);
        }
    }

    public Object createFromLong(DeserializationContext deserializationContext, long j) {
        try {
            if (this._fromLongCreator != null) {
                return this._fromLongCreator.call1(Long.valueOf(j));
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can not instantiate value of type ");
            stringBuilder.append(getValueTypeDesc());
            stringBuilder.append(" from Long integral number; no single-long-arg constructor/factory method");
            throw new JsonMappingException(stringBuilder.toString());
        } catch (Throwable e) {
            throw wrapException(e);
        } catch (Throwable e2) {
            throw wrapException(e2);
        }
    }

    public Object createFromObjectWith(DeserializationContext deserializationContext, Object[] objArr) {
        AnnotatedWithParams annotatedWithParams = this._withArgsCreator;
        if (annotatedWithParams != null) {
            try {
                return annotatedWithParams.call(objArr);
            } catch (Throwable e) {
                throw wrapException(e);
            } catch (Throwable e2) {
                throw wrapException(e2);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No with-args constructor for ");
        stringBuilder.append(getValueTypeDesc());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public Object createFromString(DeserializationContext deserializationContext, String str) {
        AnnotatedWithParams annotatedWithParams = this._fromStringCreator;
        if (annotatedWithParams == null) {
            return _createFromStringFallbacks(deserializationContext, str);
        }
        try {
            return annotatedWithParams.call1(str);
        } catch (Throwable e) {
            throw wrapException(e);
        } catch (Throwable e2) {
            throw wrapException(e2);
        }
    }

    public Object createUsingDefault(DeserializationContext deserializationContext) {
        AnnotatedWithParams annotatedWithParams = this._defaultCreator;
        if (annotatedWithParams != null) {
            try {
                return annotatedWithParams.call();
            } catch (Throwable e) {
                throw wrapException(e);
            } catch (Throwable e2) {
                throw wrapException(e2);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No default constructor for ");
        stringBuilder.append(getValueTypeDesc());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public Object createUsingDelegate(DeserializationContext deserializationContext, Object obj) {
        AnnotatedWithParams annotatedWithParams = this._delegateCreator;
        if (annotatedWithParams != null) {
            try {
                if (this._delegateArguments == null) {
                    return annotatedWithParams.call1(obj);
                }
                int length = this._delegateArguments.length;
                Object[] objArr = new Object[length];
                for (int i = 0; i < length; i++) {
                    BeanProperty beanProperty = this._delegateArguments[i];
                    if (beanProperty == null) {
                        objArr[i] = obj;
                    } else {
                        objArr[i] = deserializationContext.findInjectableValue(beanProperty.getInjectableValueId(), beanProperty, null);
                    }
                }
                return this._delegateCreator.call(objArr);
            } catch (Throwable e) {
                throw wrapException(e);
            } catch (Throwable e2) {
                throw wrapException(e2);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No delegate constructor for ");
        stringBuilder.append(getValueTypeDesc());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public AnnotatedWithParams getDefaultCreator() {
        return this._defaultCreator;
    }

    public AnnotatedWithParams getDelegateCreator() {
        return this._delegateCreator;
    }

    public JavaType getDelegateType(DeserializationConfig deserializationConfig) {
        return this._delegateType;
    }

    public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationConfig) {
        return (SettableBeanProperty[]) this._constructorArguments;
    }

    public AnnotatedParameter getIncompleteParameter() {
        return this._incompleteParameter;
    }

    public String getValueTypeDesc() {
        return this._valueTypeDesc;
    }

    public AnnotatedWithParams getWithArgsCreator() {
        return this._withArgsCreator;
    }

    public JsonMappingException wrapException(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        if (th instanceof JsonMappingException) {
            return (JsonMappingException) th;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Instantiation of ");
        stringBuilder.append(getValueTypeDesc());
        stringBuilder.append(" value failed: ");
        stringBuilder.append(th.getMessage());
        return new JsonMappingException(stringBuilder.toString(), th);
    }
}
