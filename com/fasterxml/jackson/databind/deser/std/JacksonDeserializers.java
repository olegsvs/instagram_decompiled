package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.util.TokenBuffer;

public class JacksonDeserializers {
    public static StdDeserializer[] all() {
        return new StdDeserializer[]{JacksonDeserializers$JavaTypeDeserializer.instance, JacksonDeserializers$TokenBufferDeserializer.instance};
    }

    public static JsonDeserializer find(Class cls) {
        if (cls == TokenBuffer.class) {
            return JacksonDeserializers$TokenBufferDeserializer.instance;
        }
        return JavaType.class.isAssignableFrom(cls) ? JacksonDeserializers$JavaTypeDeserializer.instance : null;
    }

    public static ValueInstantiator findValueInstantiator(DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        return beanDescription.getBeanClass() == JsonLocation.class ? JacksonDeserializers$JsonLocationInstantiator.instance : null;
    }
}
