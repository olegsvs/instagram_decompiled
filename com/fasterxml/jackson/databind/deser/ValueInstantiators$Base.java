package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;

public class ValueInstantiators$Base implements ValueInstantiators {
    public ValueInstantiator findValueInstantiator(DeserializationConfig deserializationConfig, BeanDescription beanDescription, ValueInstantiator valueInstantiator) {
        return valueInstantiator;
    }
}
