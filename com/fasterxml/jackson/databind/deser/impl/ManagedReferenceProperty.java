package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.util.Annotations;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Map;

public final class ManagedReferenceProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    public final SettableBeanProperty _backProperty;
    public final boolean _isContainer;
    public final SettableBeanProperty _managedProperty;
    public final String _referenceName;

    public ManagedReferenceProperty(SettableBeanProperty settableBeanProperty, String str, SettableBeanProperty settableBeanProperty2, Annotations annotations, boolean z) {
        super(settableBeanProperty.getName(), settableBeanProperty.getType(), settableBeanProperty.getWrapperName(), settableBeanProperty.getValueTypeDeserializer(), annotations, settableBeanProperty.isRequired());
        this._referenceName = str;
        this._managedProperty = settableBeanProperty;
        this._backProperty = settableBeanProperty2;
        this._isContainer = z;
    }

    public ManagedReferenceProperty(ManagedReferenceProperty managedReferenceProperty, JsonDeserializer jsonDeserializer) {
        super((SettableBeanProperty) managedReferenceProperty, jsonDeserializer);
        this._referenceName = managedReferenceProperty._referenceName;
        this._isContainer = managedReferenceProperty._isContainer;
        this._managedProperty = managedReferenceProperty._managedProperty;
        this._backProperty = managedReferenceProperty._backProperty;
    }

    public ManagedReferenceProperty(ManagedReferenceProperty managedReferenceProperty, String str) {
        super((SettableBeanProperty) managedReferenceProperty, str);
        this._referenceName = managedReferenceProperty._referenceName;
        this._isContainer = managedReferenceProperty._isContainer;
        this._managedProperty = managedReferenceProperty._managedProperty;
        this._backProperty = managedReferenceProperty._backProperty;
    }

    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        set(obj, this._managedProperty.deserialize(jsonParser, deserializationContext));
    }

    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        return setAndReturn(obj, deserialize(jsonParser, deserializationContext));
    }

    public Annotation getAnnotation(Class cls) {
        return this._managedProperty.getAnnotation(cls);
    }

    public AnnotatedMember getMember() {
        return this._managedProperty.getMember();
    }

    public final void set(Object obj, Object obj2) {
        setAndReturn(obj, obj2);
    }

    public Object setAndReturn(Object obj, Object obj2) {
        Object andReturn = this._managedProperty.setAndReturn(obj, obj2);
        if (obj2 != null) {
            if (!this._isContainer) {
                this._backProperty.set(obj2, obj);
            } else if (obj2 instanceof Object[]) {
                for (Object obj3 : (Object[]) obj2) {
                    if (obj3 != null) {
                        this._backProperty.set(obj3, obj);
                    }
                }
            } else if (obj2 instanceof Collection) {
                for (Object obj32 : (Collection) obj2) {
                    if (obj32 != null) {
                        this._backProperty.set(obj32, obj);
                    }
                }
            } else if (obj2 instanceof Map) {
                for (Object obj322 : ((Map) obj2).values()) {
                    if (obj322 != null) {
                        this._backProperty.set(obj322, obj);
                    }
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported container type (");
                stringBuilder.append(obj2.getClass().getName());
                stringBuilder.append(") when resolving reference '");
                stringBuilder.append(this._referenceName);
                stringBuilder.append("'");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        return andReturn;
    }

    public ManagedReferenceProperty withName(String str) {
        return new ManagedReferenceProperty(this, str);
    }

    public ManagedReferenceProperty withValueDeserializer(JsonDeserializer jsonDeserializer) {
        return new ManagedReferenceProperty(this, jsonDeserializer);
    }
}
