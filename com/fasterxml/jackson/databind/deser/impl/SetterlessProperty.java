package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public final class SetterlessProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    public final AnnotatedMethod _annotated;
    public final Method _getter;

    public SetterlessProperty(SetterlessProperty setterlessProperty, JsonDeserializer jsonDeserializer) {
        super((SettableBeanProperty) setterlessProperty, jsonDeserializer);
        this._annotated = setterlessProperty._annotated;
        this._getter = setterlessProperty._getter;
    }

    public SetterlessProperty(SetterlessProperty setterlessProperty, String str) {
        super((SettableBeanProperty) setterlessProperty, str);
        this._annotated = setterlessProperty._annotated;
        this._getter = setterlessProperty._getter;
    }

    public SetterlessProperty(BeanPropertyDefinition beanPropertyDefinition, JavaType javaType, TypeDeserializer typeDeserializer, Annotations annotations, AnnotatedMethod annotatedMethod) {
        super(beanPropertyDefinition, javaType, typeDeserializer, annotations);
        this._annotated = annotatedMethod;
        this._getter = annotatedMethod.getAnnotated();
    }

    public final void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
            try {
                Object invoke = this._getter.invoke(obj, new Object[0]);
                if (invoke != null) {
                    this._valueDeserializer.deserialize(jsonParser, deserializationContext, invoke);
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Problem deserializing 'setterless' property '");
                stringBuilder.append(getName());
                stringBuilder.append("': get method returned null");
                throw new JsonMappingException(stringBuilder.toString());
            } catch (Exception e) {
                _throwAsIOE(e);
            }
        }
    }

    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        deserializeAndSet(jsonParser, deserializationContext, obj);
        return obj;
    }

    public Annotation getAnnotation(Class cls) {
        return this._annotated.getAnnotation(cls);
    }

    public AnnotatedMember getMember() {
        return this._annotated;
    }

    public final void set(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should never call 'set' on setterless property");
    }

    public Object setAndReturn(Object obj, Object obj2) {
        set(obj, obj2);
        return null;
    }

    public SetterlessProperty withName(String str) {
        return new SetterlessProperty(this, str);
    }

    public SetterlessProperty withValueDeserializer(JsonDeserializer jsonDeserializer) {
        return new SetterlessProperty(this, jsonDeserializer);
    }
}
