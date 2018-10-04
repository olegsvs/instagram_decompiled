package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.EnumSet;

public class EnumSetDeserializer extends StdDeserializer implements ContextualDeserializer {
    private static final long serialVersionUID = 3479455075597887177L;
    public final Class _enumClass;
    public JsonDeserializer _enumDeserializer;
    public final JavaType _enumType;

    public boolean isCachable() {
        return true;
    }

    public EnumSetDeserializer(JavaType javaType, JsonDeserializer jsonDeserializer) {
        super(EnumSet.class);
        this._enumType = javaType;
        this._enumClass = javaType.getRawClass();
        this._enumDeserializer = jsonDeserializer;
    }

    private EnumSet constructSet() {
        return EnumSet.noneOf(this._enumClass);
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonDeserializer jsonDeserializer = this._enumDeserializer;
        if (jsonDeserializer == null) {
            jsonDeserializer = deserializationContext.findContextualValueDeserializer(this._enumType, beanProperty);
        } else if (jsonDeserializer instanceof ContextualDeserializer) {
            jsonDeserializer = ((ContextualDeserializer) jsonDeserializer).createContextual(deserializationContext, beanProperty);
        }
        return withDeserializer(jsonDeserializer);
    }

    public EnumSet deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.isExpectedStartArrayToken()) {
            EnumSet constructSet = constructSet();
            while (true) {
                JsonToken nextToken = jsonParser.nextToken();
                if (nextToken == JsonToken.END_ARRAY) {
                    return constructSet;
                }
                if (nextToken != JsonToken.VALUE_NULL) {
                    Enum enumR = (Enum) this._enumDeserializer.deserialize(jsonParser, deserializationContext);
                    if (enumR != null) {
                        constructSet.add(enumR);
                    }
                } else {
                    throw deserializationContext.mappingException(this._enumClass);
                }
            }
        }
        throw deserializationContext.mappingException(EnumSet.class);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    public EnumSetDeserializer withDeserializer(JsonDeserializer jsonDeserializer) {
        if (this._enumDeserializer == jsonDeserializer) {
            return this;
        }
        return new EnumSetDeserializer(this._enumType, jsonDeserializer);
    }
}
