package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public final class MethodProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    public final AnnotatedMethod _annotated;
    public final transient Method _setter;

    public MethodProperty(MethodProperty methodProperty, JsonDeserializer jsonDeserializer) {
        super((SettableBeanProperty) methodProperty, jsonDeserializer);
        this._annotated = methodProperty._annotated;
        this._setter = methodProperty._setter;
    }

    public MethodProperty(MethodProperty methodProperty, String str) {
        super((SettableBeanProperty) methodProperty, str);
        this._annotated = methodProperty._annotated;
        this._setter = methodProperty._setter;
    }

    public MethodProperty(MethodProperty methodProperty, Method method) {
        super(methodProperty);
        this._annotated = methodProperty._annotated;
        this._setter = method;
    }

    public MethodProperty(BeanPropertyDefinition beanPropertyDefinition, JavaType javaType, TypeDeserializer typeDeserializer, Annotations annotations, AnnotatedMethod annotatedMethod) {
        super(beanPropertyDefinition, javaType, typeDeserializer, annotations);
        this._annotated = annotatedMethod;
        this._setter = annotatedMethod.getAnnotated();
    }

    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        set(obj, deserialize(jsonParser, deserializationContext));
    }

    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        return setAndReturn(obj, deserialize(jsonParser, deserializationContext));
    }

    public Annotation getAnnotation(Class cls) {
        return this._annotated.getAnnotation(cls);
    }

    public AnnotatedMember getMember() {
        return this._annotated;
    }

    public Object readResolve() {
        return new MethodProperty(this, this._annotated.getAnnotated());
    }

    public final void set(Object obj, Object obj2) {
        try {
            this._setter.invoke(obj, new Object[]{obj2});
        } catch (Exception e) {
            _throwAsIOE(e, obj2);
        }
    }

    public Object setAndReturn(Object obj, Object obj2) {
        try {
            Object invoke = this._setter.invoke(obj, new Object[]{obj2});
            if (invoke != null) {
                obj = invoke;
            }
            return obj;
        } catch (Exception e) {
            _throwAsIOE(e, obj2);
            return null;
        }
    }

    public MethodProperty withName(String str) {
        return new MethodProperty(this, str);
    }

    public MethodProperty withValueDeserializer(JsonDeserializer jsonDeserializer) {
        return new MethodProperty(this, jsonDeserializer);
    }
}
