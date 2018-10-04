package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;

public class SimpleBeanPropertyDefinition extends BeanPropertyDefinition {
    public final AnnotationIntrospector _introspector;
    public final AnnotatedMember _member;
    public final String _name;

    public boolean isExplicitlyIncluded() {
        return false;
    }

    public SimpleBeanPropertyDefinition(AnnotatedMember annotatedMember) {
        this(annotatedMember, annotatedMember.getName(), null);
    }

    public SimpleBeanPropertyDefinition(AnnotatedMember annotatedMember, String str) {
        this(annotatedMember, str, null);
    }

    private SimpleBeanPropertyDefinition(AnnotatedMember annotatedMember, String str, AnnotationIntrospector annotationIntrospector) {
        this._introspector = annotationIntrospector;
        this._member = annotatedMember;
        this._name = str;
    }

    public static SimpleBeanPropertyDefinition construct(MapperConfig mapperConfig, AnnotatedMember annotatedMember) {
        AnnotationIntrospector annotationIntrospector;
        String name = annotatedMember.getName();
        if (mapperConfig == null) {
            annotationIntrospector = null;
        } else {
            annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        }
        return new SimpleBeanPropertyDefinition(annotatedMember, name, annotationIntrospector);
    }

    public static SimpleBeanPropertyDefinition construct(MapperConfig mapperConfig, AnnotatedMember annotatedMember, String str) {
        AnnotationIntrospector annotationIntrospector;
        if (mapperConfig == null) {
            annotationIntrospector = null;
        } else {
            annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        }
        return new SimpleBeanPropertyDefinition(annotatedMember, str, annotationIntrospector);
    }

    public AnnotatedMember getAccessor() {
        AnnotatedMember getter = getGetter();
        return getter == null ? getField() : getter;
    }

    public AnnotatedParameter getConstructorParameter() {
        AnnotatedMember annotatedMember = this._member;
        return annotatedMember instanceof AnnotatedParameter ? (AnnotatedParameter) annotatedMember : null;
    }

    public AnnotatedField getField() {
        AnnotatedMember annotatedMember = this._member;
        return annotatedMember instanceof AnnotatedField ? (AnnotatedField) annotatedMember : null;
    }

    public AnnotatedMethod getGetter() {
        AnnotatedMember annotatedMember = this._member;
        return ((annotatedMember instanceof AnnotatedMethod) && ((AnnotatedMethod) annotatedMember).getParameterCount() == 0) ? (AnnotatedMethod) this._member : null;
    }

    public String getInternalName() {
        return getName();
    }

    public AnnotatedMember getMutator() {
        AnnotatedMember constructorParameter = getConstructorParameter();
        if (constructorParameter != null) {
            return constructorParameter;
        }
        constructorParameter = getSetter();
        return constructorParameter == null ? getField() : constructorParameter;
    }

    public String getName() {
        return this._name;
    }

    public AnnotatedMember getPrimaryMember() {
        return this._member;
    }

    public AnnotatedMethod getSetter() {
        AnnotatedMember annotatedMember = this._member;
        return ((annotatedMember instanceof AnnotatedMethod) && ((AnnotatedMethod) annotatedMember).getParameterCount() == 1) ? (AnnotatedMethod) this._member : null;
    }

    public PropertyName getWrapperName() {
        AnnotationIntrospector annotationIntrospector = this._introspector;
        return annotationIntrospector == null ? null : annotationIntrospector.findWrapperName(this._member);
    }

    public boolean hasConstructorParameter() {
        return this._member instanceof AnnotatedParameter;
    }

    public boolean hasField() {
        return this._member instanceof AnnotatedField;
    }

    public boolean hasGetter() {
        return getGetter() != null;
    }

    public boolean hasSetter() {
        return getSetter() != null;
    }

    public SimpleBeanPropertyDefinition withName(String str) {
        if (this._name.equals(str)) {
            return this;
        }
        return new SimpleBeanPropertyDefinition(this._member, str, this._introspector);
    }
}
