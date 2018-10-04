package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.BeanProperty.Std;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.util.Annotations;

public class ValueInjector extends Std {
    public final Object _valueId;

    public ValueInjector(String str, JavaType javaType, Annotations annotations, AnnotatedMember annotatedMember, Object obj) {
        super(str, javaType, null, annotations, annotatedMember, false);
        this._valueId = obj;
    }

    public Object findValue(DeserializationContext deserializationContext, Object obj) {
        return deserializationContext.findInjectableValue(this._valueId, this, obj);
    }

    public void inject(DeserializationContext deserializationContext, Object obj) {
        this._member.setValue(obj, findValue(deserializationContext, obj));
    }
}
