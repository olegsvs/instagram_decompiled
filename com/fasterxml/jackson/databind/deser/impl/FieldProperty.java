package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public final class FieldProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    public final AnnotatedField _annotated;
    public final transient Field _field;

    public FieldProperty(FieldProperty fieldProperty, JsonDeserializer jsonDeserializer) {
        super((SettableBeanProperty) fieldProperty, jsonDeserializer);
        this._annotated = fieldProperty._annotated;
        this._field = fieldProperty._field;
    }

    public FieldProperty(FieldProperty fieldProperty, String str) {
        super((SettableBeanProperty) fieldProperty, str);
        this._annotated = fieldProperty._annotated;
        this._field = fieldProperty._field;
    }

    public FieldProperty(FieldProperty fieldProperty, Field field) {
        super(fieldProperty);
        this._annotated = fieldProperty._annotated;
        if (field != null) {
            this._field = field;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No Field passed for property '");
        stringBuilder.append(fieldProperty.getName());
        stringBuilder.append("' (class ");
        stringBuilder.append(fieldProperty.getDeclaringClass().getName());
        stringBuilder.append(")");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public FieldProperty(BeanPropertyDefinition beanPropertyDefinition, JavaType javaType, TypeDeserializer typeDeserializer, Annotations annotations, AnnotatedField annotatedField) {
        super(beanPropertyDefinition, javaType, typeDeserializer, annotations);
        this._annotated = annotatedField;
        this._field = annotatedField.getAnnotated();
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
        return new FieldProperty(this, this._annotated.getAnnotated());
    }

    public final void set(Object obj, Object obj2) {
        try {
            this._field.set(obj, obj2);
        } catch (Exception e) {
            _throwAsIOE(e, obj2);
        }
    }

    public Object setAndReturn(Object obj, Object obj2) {
        try {
            this._field.set(obj, obj2);
        } catch (Exception e) {
            _throwAsIOE(e, obj2);
        }
        return obj;
    }

    public FieldProperty withName(String str) {
        return new FieldProperty(this, str);
    }

    public FieldProperty withValueDeserializer(JsonDeserializer jsonDeserializer) {
        return new FieldProperty(this, jsonDeserializer);
    }
}
