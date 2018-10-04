package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.SettableAnyProperty;

public final class PropertyValue$Any extends PropertyValue {
    public final SettableAnyProperty _property;
    public final String _propertyName;

    public PropertyValue$Any(PropertyValue propertyValue, Object obj, SettableAnyProperty settableAnyProperty, String str) {
        super(propertyValue, obj);
        this._property = settableAnyProperty;
        this._propertyName = str;
    }

    public void assign(Object obj) {
        this._property.set(obj, this._propertyName, this.value);
    }
}
