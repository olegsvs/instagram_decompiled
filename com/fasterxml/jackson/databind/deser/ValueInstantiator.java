package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;

public abstract class ValueInstantiator {
    public boolean canCreateFromBoolean() {
        return false;
    }

    public boolean canCreateFromDouble() {
        return false;
    }

    public boolean canCreateFromInt() {
        return false;
    }

    public boolean canCreateFromLong() {
        return false;
    }

    public boolean canCreateFromObjectWith() {
        return false;
    }

    public boolean canCreateFromString() {
        return false;
    }

    public boolean canCreateUsingDelegate() {
        return false;
    }

    public AnnotatedWithParams getDefaultCreator() {
        return null;
    }

    public AnnotatedWithParams getDelegateCreator() {
        return null;
    }

    public JavaType getDelegateType(DeserializationConfig deserializationConfig) {
        return null;
    }

    public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationConfig) {
        return null;
    }

    public AnnotatedParameter getIncompleteParameter() {
        return null;
    }

    public abstract String getValueTypeDesc();

    public AnnotatedWithParams getWithArgsCreator() {
        return null;
    }

    public boolean canCreateUsingDefault() {
        return getDefaultCreator() != null;
    }

    public boolean canInstantiate() {
        if (!(canCreateUsingDefault() || canCreateUsingDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble())) {
            if (!canCreateFromBoolean()) {
                return false;
            }
        }
        return true;
    }

    public Object createFromBoolean(DeserializationContext deserializationContext, boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not instantiate value of type ");
        stringBuilder.append(getValueTypeDesc());
        stringBuilder.append(" from Boolean value");
        throw new JsonMappingException(stringBuilder.toString());
    }

    public Object createFromDouble(DeserializationContext deserializationContext, double d) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not instantiate value of type ");
        stringBuilder.append(getValueTypeDesc());
        stringBuilder.append(" from Floating-point number (double)");
        throw new JsonMappingException(stringBuilder.toString());
    }

    public Object createFromInt(DeserializationContext deserializationContext, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not instantiate value of type ");
        stringBuilder.append(getValueTypeDesc());
        stringBuilder.append(" from Integer number (int)");
        throw new JsonMappingException(stringBuilder.toString());
    }

    public Object createFromLong(DeserializationContext deserializationContext, long j) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not instantiate value of type ");
        stringBuilder.append(getValueTypeDesc());
        stringBuilder.append(" from Integer number (long)");
        throw new JsonMappingException(stringBuilder.toString());
    }

    public Object createFromObjectWith(DeserializationContext deserializationContext, Object[] objArr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not instantiate value of type ");
        stringBuilder.append(getValueTypeDesc());
        stringBuilder.append(" with arguments");
        throw new JsonMappingException(stringBuilder.toString());
    }

    public Object createFromString(DeserializationContext deserializationContext, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not instantiate value of type ");
        stringBuilder.append(getValueTypeDesc());
        stringBuilder.append(" from String value");
        throw new JsonMappingException(stringBuilder.toString());
    }

    public Object createUsingDefault(DeserializationContext deserializationContext) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not instantiate value of type ");
        stringBuilder.append(getValueTypeDesc());
        stringBuilder.append("; no default creator found");
        throw new JsonMappingException(stringBuilder.toString());
    }

    public Object createUsingDelegate(DeserializationContext deserializationContext, Object obj) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not instantiate value of type ");
        stringBuilder.append(getValueTypeDesc());
        stringBuilder.append(" using delegate");
        throw new JsonMappingException(stringBuilder.toString());
    }
}
