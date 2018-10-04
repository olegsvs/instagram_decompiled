package com.fasterxml.jackson.databind;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class InjectableValues$Std extends InjectableValues implements Serializable {
    private static final long serialVersionUID = 1;
    public final Map _values;

    public InjectableValues$Std() {
        this(new HashMap());
    }

    public InjectableValues$Std(Map map) {
        this._values = map;
    }

    public InjectableValues$Std addValue(Class cls, Object obj) {
        this._values.put(cls.getName(), obj);
        return this;
    }

    public InjectableValues$Std addValue(String str, Object obj) {
        this._values.put(str, obj);
        return this;
    }

    public Object findInjectableValue(Object obj, DeserializationContext deserializationContext, BeanProperty beanProperty, Object obj2) {
        if (obj instanceof String) {
            String str = (String) obj;
            Object obj3 = this._values.get(str);
            if (obj3 == null) {
                if (!this._values.containsKey(str)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("No injectable id with value '");
                    stringBuilder.append(str);
                    stringBuilder.append("' found (for property '");
                    stringBuilder.append(beanProperty.getName());
                    stringBuilder.append("')");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            return obj3;
        }
        if (obj == null) {
            obj = "[null]";
        } else {
            obj = obj.getClass().getName();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unrecognized inject value id type (");
        stringBuilder.append(obj);
        stringBuilder.append("), expecting String");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
