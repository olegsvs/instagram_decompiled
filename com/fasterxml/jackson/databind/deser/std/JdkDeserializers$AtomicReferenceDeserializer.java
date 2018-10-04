package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import java.util.concurrent.atomic.AtomicReference;

public class JdkDeserializers$AtomicReferenceDeserializer extends StdScalarDeserializer implements ContextualDeserializer {
    public final JavaType _referencedType;
    public final JsonDeserializer _valueDeserializer;

    public JdkDeserializers$AtomicReferenceDeserializer(JavaType javaType) {
        this(javaType, null);
    }

    public JdkDeserializers$AtomicReferenceDeserializer(JavaType javaType, JsonDeserializer jsonDeserializer) {
        super(AtomicReference.class);
        this._referencedType = javaType;
        this._valueDeserializer = jsonDeserializer;
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        if (this._valueDeserializer != null) {
            return this;
        }
        JavaType javaType = this._referencedType;
        return new JdkDeserializers$AtomicReferenceDeserializer(javaType, deserializationContext.findContextualValueDeserializer(javaType, beanProperty));
    }

    public AtomicReference deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return new AtomicReference(this._valueDeserializer.deserialize(jsonParser, deserializationContext));
    }
}
