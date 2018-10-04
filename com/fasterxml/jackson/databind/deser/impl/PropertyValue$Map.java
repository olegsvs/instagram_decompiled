package com.fasterxml.jackson.databind.deser.impl;

import java.util.Map;

public final class PropertyValue$Map extends PropertyValue {
    public final Object _key;

    public PropertyValue$Map(PropertyValue propertyValue, Object obj, Object obj2) {
        super(propertyValue, obj);
        this._key = obj2;
    }

    public void assign(Object obj) {
        ((Map) obj).put(this._key, this.value);
    }
}
