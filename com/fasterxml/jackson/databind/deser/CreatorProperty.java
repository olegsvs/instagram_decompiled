package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import java.lang.annotation.Annotation;

public class CreatorProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    public final AnnotatedParameter _annotated;
    public final int _creatorIndex;
    public final Object _injectableValueId;

    public Object setAndReturn(Object obj, Object obj2) {
        return obj;
    }

    public CreatorProperty(CreatorProperty creatorProperty, JsonDeserializer jsonDeserializer) {
        super((SettableBeanProperty) creatorProperty, jsonDeserializer);
        this._annotated = creatorProperty._annotated;
        this._creatorIndex = creatorProperty._creatorIndex;
        this._injectableValueId = creatorProperty._injectableValueId;
    }

    public CreatorProperty(CreatorProperty creatorProperty, String str) {
        super((SettableBeanProperty) creatorProperty, str);
        this._annotated = creatorProperty._annotated;
        this._creatorIndex = creatorProperty._creatorIndex;
        this._injectableValueId = creatorProperty._injectableValueId;
    }

    public CreatorProperty(String str, JavaType javaType, PropertyName propertyName, TypeDeserializer typeDeserializer, Annotations annotations, AnnotatedParameter annotatedParameter, int i, Object obj, boolean z) {
        super(str, javaType, propertyName, typeDeserializer, annotations, z);
        this._annotated = annotatedParameter;
        this._creatorIndex = i;
        this._injectableValueId = obj;
    }

    public CreatorProperty(String str, JavaType javaType, TypeDeserializer typeDeserializer, Annotations annotations, AnnotatedParameter annotatedParameter, int i, Object obj) {
        this(str, javaType, null, typeDeserializer, annotations, annotatedParameter, i, obj, true);
    }

    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        set(obj, deserialize(jsonParser, deserializationContext));
    }

    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        return setAndReturn(obj, deserialize(jsonParser, deserializationContext));
    }

    public Object findInjectableValue(DeserializationContext deserializationContext, Object obj) {
        Object obj2 = this._injectableValueId;
        if (obj2 != null) {
            return deserializationContext.findInjectableValue(obj2, this, obj);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Property '");
        stringBuilder.append(getName());
        stringBuilder.append("' (type ");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(") has no injectable value id configured");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public Annotation getAnnotation(Class cls) {
        Annotated annotated = this._annotated;
        if (annotated == null) {
            return null;
        }
        return annotated.getAnnotation(cls);
    }

    public int getCreatorIndex() {
        return this._creatorIndex;
    }

    public Object getInjectableValueId() {
        return this._injectableValueId;
    }

    public AnnotatedMember getMember() {
        return this._annotated;
    }

    public void inject(DeserializationContext deserializationContext, Object obj) {
        set(obj, findInjectableValue(deserializationContext, obj));
    }

    public void set(Object obj, Object obj2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Method should never be called on a ");
        stringBuilder.append(getClass().getName());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[creator property, name '");
        stringBuilder.append(getName());
        stringBuilder.append("'; inject id '");
        stringBuilder.append(this._injectableValueId);
        stringBuilder.append("']");
        return stringBuilder.toString();
    }

    public CreatorProperty withName(String str) {
        return new CreatorProperty(this, str);
    }

    public CreatorProperty withValueDeserializer(JsonDeserializer jsonDeserializer) {
        return new CreatorProperty(this, jsonDeserializer);
    }
}
