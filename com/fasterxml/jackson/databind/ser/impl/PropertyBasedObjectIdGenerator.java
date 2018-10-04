package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;

public class PropertyBasedObjectIdGenerator extends ObjectIdGenerators$PropertyGenerator {
    private static final long serialVersionUID = 1;
    public final BeanPropertyWriter _property;

    public ObjectIdGenerator newForSerialization(Object obj) {
        return this;
    }

    public PropertyBasedObjectIdGenerator(ObjectIdInfo objectIdInfo, BeanPropertyWriter beanPropertyWriter) {
        this(objectIdInfo.getScope(), beanPropertyWriter);
    }

    public PropertyBasedObjectIdGenerator(Class cls, BeanPropertyWriter beanPropertyWriter) {
        super(cls);
        this._property = beanPropertyWriter;
    }

    public boolean canUseFor(ObjectIdGenerator objectIdGenerator) {
        if (objectIdGenerator.getClass() != getClass()) {
            return false;
        }
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = (PropertyBasedObjectIdGenerator) objectIdGenerator;
        if (propertyBasedObjectIdGenerator.getScope() == this._scope && propertyBasedObjectIdGenerator._property == this._property) {
            return true;
        }
        return false;
    }

    public ObjectIdGenerator forScope(Class cls) {
        return cls == this._scope ? this : new PropertyBasedObjectIdGenerator(cls, this._property);
    }

    public Object generateId(Object obj) {
        try {
            return this._property.get(obj);
        } catch (RuntimeException e) {
            throw e;
        } catch (Throwable e2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Problem accessing property '");
            stringBuilder.append(this._property.getName());
            stringBuilder.append("': ");
            stringBuilder.append(e2.getMessage());
            throw new IllegalStateException(stringBuilder.toString(), e2);
        }
    }

    public IdKey key(Object obj) {
        return new IdKey(getClass(), this._scope, obj);
    }
}
