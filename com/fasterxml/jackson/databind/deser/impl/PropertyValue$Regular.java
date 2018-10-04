package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.SettableBeanProperty;

public final class PropertyValue$Regular extends PropertyValue {
    public final SettableBeanProperty _property;

    public PropertyValue$Regular(PropertyValue propertyValue, Object obj, SettableBeanProperty settableBeanProperty) {
        super(propertyValue, obj);
        this._property = settableBeanProperty;
    }

    public void assign(Object obj) {
        this._property.set(obj, this.value);
    }
}
