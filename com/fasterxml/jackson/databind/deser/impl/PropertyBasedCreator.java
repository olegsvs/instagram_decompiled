package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.Collection;
import java.util.HashMap;

public final class PropertyBasedCreator {
    public final Object[] _defaultValues;
    public final HashMap _properties = new HashMap();
    public final SettableBeanProperty[] _propertiesWithInjectables;
    public final int _propertyCount;
    public final ValueInstantiator _valueInstantiator;

    public PropertyBasedCreator(ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, Object[] objArr) {
        this._valueInstantiator = valueInstantiator;
        int length = settableBeanPropertyArr.length;
        this._propertyCount = length;
        SettableBeanProperty[] settableBeanPropertyArr2 = null;
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
            this._properties.put(settableBeanProperty.getName(), settableBeanProperty);
            if (settableBeanProperty.getInjectableValueId() != null) {
                if (settableBeanPropertyArr2 == null) {
                    settableBeanPropertyArr2 = new SettableBeanProperty[length];
                }
                settableBeanPropertyArr2[i] = settableBeanProperty;
            }
        }
        this._defaultValues = objArr;
        this._propertiesWithInjectables = settableBeanPropertyArr2;
    }

    public void assignDeserializer(SettableBeanProperty settableBeanProperty, JsonDeserializer jsonDeserializer) {
        jsonDeserializer = settableBeanProperty.withValueDeserializer(jsonDeserializer);
        this._properties.put(jsonDeserializer.getName(), jsonDeserializer);
    }

    public Object build(DeserializationContext deserializationContext, PropertyValueBuffer propertyValueBuffer) {
        Object handleIdValue = propertyValueBuffer.handleIdValue(deserializationContext, this._valueInstantiator.createFromObjectWith(deserializationContext, propertyValueBuffer.getParameters(this._defaultValues)));
        for (PropertyValue buffered = propertyValueBuffer.buffered(); buffered != null; buffered = buffered.next) {
            buffered.assign(handleIdValue);
        }
        return handleIdValue;
    }

    public static PropertyBasedCreator construct(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) {
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[length];
        Object[] objArr = null;
        for (int i = 0; i < length; i++) {
            Object obj;
            SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
            if (!settableBeanProperty.hasValueDeserializer()) {
                settableBeanProperty = settableBeanProperty.withValueDeserializer(deserializationContext.findContextualValueDeserializer(settableBeanProperty.getType(), settableBeanProperty));
            }
            settableBeanPropertyArr2[i] = settableBeanProperty;
            JsonDeserializer valueDeserializer = settableBeanProperty.getValueDeserializer();
            if (valueDeserializer == null) {
                obj = null;
            } else {
                obj = valueDeserializer.getNullValue();
            }
            if (obj == null && settableBeanProperty.getType().isPrimitive()) {
                obj = ClassUtil.defaultValue(settableBeanProperty.getType().getRawClass());
            }
            if (obj != null) {
                if (objArr == null) {
                    objArr = new Object[length];
                }
                objArr[i] = obj;
            }
        }
        return new PropertyBasedCreator(valueInstantiator, settableBeanPropertyArr2, objArr);
    }

    public SettableBeanProperty findCreatorProperty(String str) {
        return (SettableBeanProperty) this._properties.get(str);
    }

    public Collection properties() {
        return this._properties.values();
    }

    public PropertyValueBuffer startBuilding(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectIdReader objectIdReader) {
        PropertyValueBuffer propertyValueBuffer = new PropertyValueBuffer(jsonParser, deserializationContext, this._propertyCount, objectIdReader);
        SettableBeanProperty[] settableBeanPropertyArr = this._propertiesWithInjectables;
        if (settableBeanPropertyArr != null) {
            propertyValueBuffer.inject(settableBeanPropertyArr);
        }
        return propertyValueBuffer;
    }
}
