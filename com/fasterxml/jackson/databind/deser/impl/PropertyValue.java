package com.fasterxml.jackson.databind.deser.impl;

public abstract class PropertyValue {
    public final PropertyValue next;
    public final Object value;

    public abstract void assign(Object obj);

    public PropertyValue(PropertyValue propertyValue, Object obj) {
        this.next = propertyValue;
        this.value = obj;
    }
}
