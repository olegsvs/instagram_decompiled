package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.io.IOException;
import java.lang.reflect.Method;

public final class SettableAnyProperty {
    public final BeanProperty _property;
    public final Method _setter;
    public final JavaType _type;
    public JsonDeserializer _valueDeserializer;

    public SettableAnyProperty(BeanProperty beanProperty, AnnotatedMethod annotatedMethod, JavaType javaType, JsonDeserializer jsonDeserializer) {
        this(beanProperty, annotatedMethod.getAnnotated(), javaType, jsonDeserializer);
    }

    public SettableAnyProperty(BeanProperty beanProperty, Method method, JavaType javaType, JsonDeserializer jsonDeserializer) {
        this._property = beanProperty;
        this._type = javaType;
        this._setter = method;
        this._valueDeserializer = jsonDeserializer;
    }

    public void _throwAsIOE(Exception exception, String str, Object obj) {
        if (exception instanceof IllegalArgumentException) {
            String str2;
            if (obj == null) {
                str2 = "[NULL]";
            } else {
                str2 = obj.getClass().getName();
            }
            StringBuilder stringBuilder = new StringBuilder("Problem deserializing \"any\" property '");
            stringBuilder.append(str);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("' of class ");
            stringBuilder2.append(getClassName());
            stringBuilder2.append(" (expected type: ");
            stringBuilder.append(stringBuilder2.toString());
            stringBuilder.append(this._type);
            stringBuilder.append("; actual type: ");
            stringBuilder.append(str2);
            stringBuilder.append(")");
            String message = exception.getMessage();
            if (message != null) {
                stringBuilder.append(", problem: ");
                stringBuilder.append(message);
            } else {
                stringBuilder.append(" (no error message provided)");
            }
            throw new JsonMappingException(stringBuilder.toString(), null, exception);
        } else if (exception instanceof IOException) {
            throw ((IOException) exception);
        } else if (exception instanceof RuntimeException) {
            throw ((RuntimeException) exception);
        } else {
            while (exception.getCause() != null) {
                exception = exception.getCause();
            }
            throw new JsonMappingException(exception.getMessage(), null, exception);
        }
    }

    public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return this._valueDeserializer.deserialize(jsonParser, deserializationContext);
    }

    public final void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) {
        set(obj, str, deserialize(jsonParser, deserializationContext));
    }

    private String getClassName() {
        return this._setter.getDeclaringClass().getName();
    }

    public BeanProperty getProperty() {
        return this._property;
    }

    public JavaType getType() {
        return this._type;
    }

    public boolean hasValueDeserializer() {
        return this._valueDeserializer != null;
    }

    public final void set(Object obj, String str, Object obj2) {
        try {
            this._setter.invoke(obj, new Object[]{str, obj2});
        } catch (Exception e) {
            _throwAsIOE(e, str, obj2);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[any property on class ");
        stringBuilder.append(getClassName());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public SettableAnyProperty withValueDeserializer(JsonDeserializer jsonDeserializer) {
        return new SettableAnyProperty(this._property, this._setter, this._type, jsonDeserializer);
    }
}
