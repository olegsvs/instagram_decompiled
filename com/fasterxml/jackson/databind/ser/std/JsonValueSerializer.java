package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

@JacksonStdImpl
public class JsonValueSerializer extends StdSerializer implements ContextualSerializer, SchemaAware, JsonFormatVisitable {
    public final Method _accessorMethod;
    public final boolean _forceTypeInformation;
    public final BeanProperty _property;
    public final JsonSerializer _valueSerializer;

    public JsonValueSerializer(JsonValueSerializer jsonValueSerializer, BeanProperty beanProperty, JsonSerializer jsonSerializer, boolean z) {
        super(_notNullClass(jsonValueSerializer.handledType()));
        this._accessorMethod = jsonValueSerializer._accessorMethod;
        this._valueSerializer = jsonSerializer;
        this._property = beanProperty;
        this._forceTypeInformation = z;
    }

    public JsonValueSerializer(Method method, JsonSerializer jsonSerializer) {
        super(Object.class);
        this._accessorMethod = method;
        this._valueSerializer = jsonSerializer;
        this._property = null;
        this._forceTypeInformation = true;
    }

    private static final Class _notNullClass(Class cls) {
        return cls == null ? Object.class : cls;
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        JsonSerializer jsonSerializer = this._valueSerializer;
        if (jsonSerializer == null) {
            if (javaType == null) {
                BeanProperty beanProperty = this._property;
                if (beanProperty != null) {
                    javaType = beanProperty.getType();
                }
                if (javaType == null) {
                    javaType = jsonFormatVisitorWrapper.getProvider().constructType(this._accessorMethod.getReturnType());
                }
            }
            jsonSerializer = jsonFormatVisitorWrapper.getProvider().findTypedValueSerializer(javaType, false, this._property);
            if (jsonSerializer == null) {
                jsonFormatVisitorWrapper.expectAnyFormat(javaType);
                return;
            }
        }
        jsonSerializer.acceptJsonFormatVisitor(jsonFormatVisitorWrapper, null);
    }

    public JsonSerializer createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonSerializer jsonSerializer = this._valueSerializer;
        if (jsonSerializer == null) {
            if (serializerProvider.isEnabled(MapperFeature.USE_STATIC_TYPING) || Modifier.isFinal(this._accessorMethod.getReturnType().getModifiers())) {
                JavaType constructType = serializerProvider.constructType(this._accessorMethod.getGenericReturnType());
                jsonSerializer = serializerProvider.findTypedValueSerializer(constructType, false, this._property);
                return withResolved(beanProperty, jsonSerializer, isNaturalTypeWithStdHandling(constructType.getRawClass(), jsonSerializer));
            }
        } else if (jsonSerializer instanceof ContextualSerializer) {
            return withResolved(beanProperty, ((ContextualSerializer) jsonSerializer).createContextual(serializerProvider, beanProperty), this._forceTypeInformation);
        }
        return this;
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        JsonSerializer jsonSerializer = this._valueSerializer;
        if (jsonSerializer instanceof SchemaAware) {
            return ((SchemaAware) jsonSerializer).getSchema(serializerProvider, null);
        }
        return JsonSchema.getDefaultSchemaNode();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isNaturalTypeWithStdHandling(java.lang.Class r3, com.fasterxml.jackson.databind.JsonSerializer r4) {
        /*
        r2 = this;
        r0 = r3.isPrimitive();
        r1 = 0;
        if (r0 == 0) goto L_0x0014;
    L_0x0007:
        r0 = java.lang.Integer.TYPE;
        if (r3 == r0) goto L_0x0025;
    L_0x000b:
        r0 = java.lang.Boolean.TYPE;
        if (r3 == r0) goto L_0x0025;
    L_0x000f:
        r0 = java.lang.Double.TYPE;
        if (r3 == r0) goto L_0x0025;
    L_0x0013:
        return r1;
    L_0x0014:
        r0 = java.lang.String.class;
        if (r3 == r0) goto L_0x0025;
    L_0x0018:
        r0 = java.lang.Integer.class;
        if (r3 == r0) goto L_0x0025;
    L_0x001c:
        r0 = java.lang.Boolean.class;
        if (r3 == r0) goto L_0x0025;
    L_0x0020:
        r0 = java.lang.Double.class;
        if (r3 == r0) goto L_0x0025;
    L_0x0024:
        goto L_0x0013;
    L_0x0025:
        r0 = r2.isDefaultSerializer(r4);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.isNaturalTypeWithStdHandling(java.lang.Class, com.fasterxml.jackson.databind.JsonSerializer):boolean");
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        try {
            Object invoke = this._accessorMethod.invoke(obj, new Object[0]);
            if (invoke == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
                return;
            }
            JsonSerializer jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null) {
                jsonSerializer = serializerProvider.findTypedValueSerializer(invoke.getClass(), true, this._property);
            }
            jsonSerializer.serialize(invoke, jsonGenerator, serializerProvider);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            Throwable e3 = e2;
            while ((e3 instanceof InvocationTargetException) && e3.getCause() != null) {
                e3 = e3.getCause();
            }
            if (e3 instanceof Error) {
                throw ((Error) e3);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this._accessorMethod.getName());
            stringBuilder.append("()");
            throw JsonMappingException.wrapWithPath(e3, obj, stringBuilder.toString());
        }
    }

    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        try {
            Object invoke = this._accessorMethod.invoke(obj, new Object[0]);
            if (invoke == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
                return;
            }
            JsonSerializer jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null) {
                jsonSerializer = serializerProvider.findValueSerializer(invoke.getClass(), this._property);
            } else if (this._forceTypeInformation) {
                typeSerializer.writeTypePrefixForScalar(obj, jsonGenerator);
                jsonSerializer.serialize(invoke, jsonGenerator, serializerProvider);
                typeSerializer.writeTypeSuffixForScalar(obj, jsonGenerator);
                return;
            }
            jsonSerializer.serializeWithType(invoke, jsonGenerator, serializerProvider, typeSerializer);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            Throwable e3 = e2;
            while ((e3 instanceof InvocationTargetException) && e3.getCause() != null) {
                e3 = e3.getCause();
            }
            if (e3 instanceof Error) {
                throw ((Error) e3);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this._accessorMethod.getName());
            stringBuilder.append("()");
            throw JsonMappingException.wrapWithPath(e3, obj, stringBuilder.toString());
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(@JsonValue serializer for method ");
        stringBuilder.append(this._accessorMethod.getDeclaringClass());
        stringBuilder.append("#");
        stringBuilder.append(this._accessorMethod.getName());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public JsonValueSerializer withResolved(BeanProperty beanProperty, JsonSerializer jsonSerializer, boolean z) {
        if (this._property == beanProperty && this._valueSerializer == jsonSerializer && z == this._forceTypeInformation) {
            return this;
        }
        return new JsonValueSerializer(this, beanProperty, jsonSerializer, z);
    }
}
