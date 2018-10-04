package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.lang.reflect.Array;

@JacksonStdImpl
public class ObjectArrayDeserializer extends ContainerDeserializerBase implements ContextualDeserializer {
    private static final long serialVersionUID = 1;
    public final ArrayType _arrayType;
    public final Class _elementClass;
    public JsonDeserializer _elementDeserializer;
    public final TypeDeserializer _elementTypeDeserializer;
    public final boolean _untyped;

    public ObjectArrayDeserializer(ArrayType arrayType, JsonDeserializer jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(Object[].class);
        this._arrayType = arrayType;
        Class rawClass = arrayType.getContentType().getRawClass();
        this._elementClass = rawClass;
        this._untyped = rawClass == Object.class;
        this._elementDeserializer = jsonDeserializer;
        this._elementTypeDeserializer = typeDeserializer;
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonDeserializer findConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this._elementDeserializer);
        if (findConvertingContentDeserializer == null) {
            findConvertingContentDeserializer = deserializationContext.findContextualValueDeserializer(this._arrayType.getContentType(), beanProperty);
        } else if (findConvertingContentDeserializer instanceof ContextualDeserializer) {
            findConvertingContentDeserializer = ((ContextualDeserializer) findConvertingContentDeserializer).createContextual(deserializationContext, beanProperty);
        }
        TypeDeserializer typeDeserializer = this._elementTypeDeserializer;
        if (typeDeserializer != null) {
            typeDeserializer = typeDeserializer.forProperty(beanProperty);
        }
        return withDeserializer(typeDeserializer, findConvertingContentDeserializer);
    }

    public Object[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        Object[] completeAndClearBuffer;
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] resetAndStart = leaseObjectBuffer.resetAndStart();
        TypeDeserializer typeDeserializer = this._elementTypeDeserializer;
        int i = 0;
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == JsonToken.END_ARRAY) {
                break;
            }
            Object obj;
            if (nextToken == JsonToken.VALUE_NULL) {
                obj = null;
            } else if (typeDeserializer == null) {
                obj = this._elementDeserializer.deserialize(jsonParser, deserializationContext);
            } else {
                obj = this._elementDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
            }
            if (i >= resetAndStart.length) {
                resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                i = 0;
            }
            int i2 = i + 1;
            resetAndStart[i] = obj;
            i = i2;
        }
        if (this._untyped) {
            completeAndClearBuffer = leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i);
        } else {
            completeAndClearBuffer = leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i, this._elementClass);
        }
        deserializationContext.returnObjectBuffer(leaseObjectBuffer);
        return completeAndClearBuffer;
    }

    public Byte[] deserializeFromBase64(JsonParser jsonParser, DeserializationContext deserializationContext) {
        deserializationContext = jsonParser.getBinaryValue(deserializationContext.getBase64Variant());
        jsonParser = new Byte[deserializationContext.length];
        int length = deserializationContext.length;
        for (int i = 0; i < length; i++) {
            jsonParser[i] = Byte.valueOf(deserializationContext[i]);
        }
        return jsonParser;
    }

    public Object[] deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return (Object[]) typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    public JsonDeserializer getContentDeserializer() {
        return this._elementDeserializer;
    }

    public JavaType getContentType() {
        return this._arrayType.getContentType();
    }

    private final Object[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        JsonToken jsonToken = JsonToken.VALUE_STRING;
        Object[] objArr = null;
        if (currentToken == jsonToken && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.getText().length() == 0) {
            return null;
        }
        if (deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
            Object[] objArr2;
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                TypeDeserializer typeDeserializer = this._elementTypeDeserializer;
                if (typeDeserializer == null) {
                    objArr = this._elementDeserializer.deserialize(jsonParser, deserializationContext);
                } else {
                    objArr = this._elementDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                }
            }
            if (this._untyped) {
                objArr2 = new Object[1];
            } else {
                objArr2 = (Object[]) Array.newInstance(this._elementClass, 1);
            }
            objArr2[0] = objArr;
            return objArr2;
        } else if (jsonParser.getCurrentToken() == jsonToken && this._elementClass == Byte.class) {
            return deserializeFromBase64(jsonParser, deserializationContext);
        } else {
            throw deserializationContext.mappingException(this._arrayType.getRawClass());
        }
    }

    public ObjectArrayDeserializer withDeserializer(TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer) {
        if (jsonDeserializer == this._elementDeserializer && typeDeserializer == this._elementTypeDeserializer) {
            return this;
        }
        return new ObjectArrayDeserializer(this._arrayType, jsonDeserializer, typeDeserializer);
    }
}
