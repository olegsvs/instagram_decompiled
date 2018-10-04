package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public class JSONPObject implements JsonSerializable {
    public final String _function;
    public final JavaType _serializationType;
    public final Object _value;

    public JSONPObject(String str, Object obj) {
        this(str, obj, (JavaType) null);
    }

    public JSONPObject(String str, Object obj, JavaType javaType) {
        this._function = str;
        this._value = obj;
        this._serializationType = javaType;
    }

    public String getFunction() {
        return this._function;
    }

    public JavaType getSerializationType() {
        return this._serializationType;
    }

    public Object getValue() {
        return this._value;
    }

    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeRaw(this._function);
        jsonGenerator.writeRaw('(');
        Object obj = this._value;
        if (obj == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
        } else {
            JavaType javaType = this._serializationType;
            if (javaType != null) {
                serializerProvider.findTypedValueSerializer(javaType, true, null).serialize(this._value, jsonGenerator, serializerProvider);
            } else {
                serializerProvider.findTypedValueSerializer(obj.getClass(), true, null).serialize(this._value, jsonGenerator, serializerProvider);
            }
        }
        jsonGenerator.writeRaw(')');
    }

    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        serialize(jsonGenerator, serializerProvider);
    }
}
