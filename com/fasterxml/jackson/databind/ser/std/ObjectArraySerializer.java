package com.fasterxml.jackson.databind.ser.std;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult;
import com.fasterxml.jackson.databind.type.ArrayType;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

@JacksonStdImpl
public class ObjectArraySerializer extends ArraySerializerBase implements ContextualSerializer {
    public PropertySerializerMap _dynamicSerializers;
    public JsonSerializer _elementSerializer;
    public final JavaType _elementType;
    public final boolean _staticTyping;
    public final TypeSerializer _valueTypeSerializer;

    public ObjectArraySerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        super(Object[].class, null);
        this._elementType = javaType;
        this._staticTyping = z;
        this._valueTypeSerializer = typeSerializer;
        this._dynamicSerializers = PropertySerializerMap.emptyMap();
        this._elementSerializer = jsonSerializer;
    }

    public ObjectArraySerializer(ObjectArraySerializer objectArraySerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        super((ArraySerializerBase) objectArraySerializer, beanProperty);
        this._elementType = objectArraySerializer._elementType;
        this._valueTypeSerializer = typeSerializer;
        this._staticTyping = objectArraySerializer._staticTyping;
        this._dynamicSerializers = objectArraySerializer._dynamicSerializers;
        this._elementSerializer = jsonSerializer;
    }

    public ObjectArraySerializer(ObjectArraySerializer objectArraySerializer, TypeSerializer typeSerializer) {
        super((ArraySerializerBase) objectArraySerializer);
        this._elementType = objectArraySerializer._elementType;
        this._valueTypeSerializer = typeSerializer;
        this._staticTyping = objectArraySerializer._staticTyping;
        this._dynamicSerializers = objectArraySerializer._dynamicSerializers;
        this._elementSerializer = objectArraySerializer._elementSerializer;
    }

    public final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertySerializerMap, JavaType javaType, SerializerProvider serializerProvider) {
        SerializerAndMapResult findAndAddSerializer = propertySerializerMap.findAndAddSerializer(javaType, serializerProvider, this._property);
        if (propertySerializerMap != findAndAddSerializer.map) {
            this._dynamicSerializers = findAndAddSerializer.map;
        }
        return findAndAddSerializer.serializer;
    }

    public final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class cls, SerializerProvider serializerProvider) {
        SerializerAndMapResult findAndAddSerializer = propertySerializerMap.findAndAddSerializer(cls, serializerProvider, this._property);
        if (propertySerializerMap != findAndAddSerializer.map) {
            this._dynamicSerializers = findAndAddSerializer.map;
        }
        return findAndAddSerializer.serializer;
    }

    public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new ObjectArraySerializer(this._elementType, this._staticTyping, typeSerializer, this._elementSerializer);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        JsonArrayFormatVisitor expectArrayFormat = jsonFormatVisitorWrapper.expectArrayFormat(javaType);
        if (expectArrayFormat != null) {
            JavaType moreSpecificType = jsonFormatVisitorWrapper.getProvider().getTypeFactory().moreSpecificType(this._elementType, javaType.getContentType());
            if (moreSpecificType != null) {
                JsonFormatVisitable jsonFormatVisitable = this._elementSerializer;
                if (jsonFormatVisitable == null) {
                    jsonFormatVisitable = jsonFormatVisitorWrapper.getProvider().findValueSerializer(moreSpecificType, this._property);
                }
                expectArrayFormat.itemsFormat(jsonFormatVisitable, moreSpecificType);
                return;
            }
            throw new JsonMappingException("Could not resolve type");
        }
    }

    public JsonSerializer createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        if (typeSerializer != null) {
            typeSerializer = typeSerializer.forProperty(beanProperty);
        }
        JsonSerializer jsonSerializer = null;
        if (beanProperty != null) {
            Annotated member = beanProperty.getMember();
            if (member != null) {
                Object findContentSerializer = serializerProvider.getAnnotationIntrospector().findContentSerializer(member);
                if (findContentSerializer != null) {
                    jsonSerializer = serializerProvider.serializerInstance(member, findContentSerializer);
                }
            }
        }
        if (jsonSerializer == null) {
            jsonSerializer = this._elementSerializer;
        }
        JsonSerializer findConvertingContentSerializer = findConvertingContentSerializer(serializerProvider, beanProperty, jsonSerializer);
        if (findConvertingContentSerializer == null) {
            if (this._elementType != null && (this._staticTyping || hasContentTypeAnnotation(serializerProvider, beanProperty))) {
                findConvertingContentSerializer = serializerProvider.findValueSerializer(this._elementType, beanProperty);
            }
        } else if (findConvertingContentSerializer instanceof ContextualSerializer) {
            findConvertingContentSerializer = ((ContextualSerializer) findConvertingContentSerializer).createContextual(serializerProvider, beanProperty);
        }
        return withResolved(beanProperty, typeSerializer, findConvertingContentSerializer);
    }

    public JsonSerializer getContentSerializer() {
        return this._elementSerializer;
    }

    public JavaType getContentType() {
        return this._elementType;
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        JsonNode createSchemaNode = createSchemaNode("array", true);
        if (type != null) {
            ResolvedType constructType = serializerProvider.constructType(type);
            if (constructType.isArrayType()) {
                Class rawClass = ((ArrayType) constructType).getContentType().getRawClass();
                if (rawClass == Object.class) {
                    createSchemaNode.put(DialogModule.KEY_ITEMS, JsonSchema.getDefaultSchemaNode());
                } else {
                    JsonNode schema;
                    JsonSerializer findValueSerializer = serializerProvider.findValueSerializer(rawClass, this._property);
                    if (findValueSerializer instanceof SchemaAware) {
                        schema = ((SchemaAware) findValueSerializer).getSchema(serializerProvider, null);
                    } else {
                        schema = JsonSchema.getDefaultSchemaNode();
                    }
                    createSchemaNode.put(DialogModule.KEY_ITEMS, schema);
                }
            }
        }
        return createSchemaNode;
    }

    public boolean hasSingleElement(Object[] objArr) {
        return objArr.length == 1;
    }

    public boolean isEmpty(Object[] objArr) {
        if (objArr != null) {
            if (objArr.length != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void serializeContents(java.lang.Object[] r7, com.fasterxml.jackson.core.JsonGenerator r8, com.fasterxml.jackson.databind.SerializerProvider r9) {
        /*
        r6 = this;
        r5 = r7.length;
        if (r5 != 0) goto L_0x0004;
    L_0x0003:
        return;
    L_0x0004:
        r0 = r6._elementSerializer;
        if (r0 == 0) goto L_0x000c;
    L_0x0008:
        r6.serializeContentsUsing(r7, r8, r9, r0);
        return;
    L_0x000c:
        r0 = r6._valueTypeSerializer;
        if (r0 == 0) goto L_0x0014;
    L_0x0010:
        r6.serializeTypedContents(r7, r8, r9);
        return;
    L_0x0014:
        r3 = 0;
        r2 = 0;
        r4 = r6._dynamicSerializers;	 Catch:{ IOException -> 0x0067, Exception -> 0x004b }
    L_0x0018:
        if (r3 >= r5) goto L_0x0003;
    L_0x001a:
        r2 = r7[r3];	 Catch:{ IOException -> 0x0067, Exception -> 0x004b }
        if (r2 != 0) goto L_0x0022;
    L_0x001e:
        r9.defaultSerializeNull(r8);	 Catch:{ IOException -> 0x0067, Exception -> 0x0049 }
        goto L_0x0046;
    L_0x0022:
        r1 = r2.getClass();	 Catch:{ IOException -> 0x0067, Exception -> 0x0049 }
        r0 = r4.serializerFor(r1);	 Catch:{ IOException -> 0x0067, Exception -> 0x0049 }
        if (r0 != 0) goto L_0x0043;
    L_0x002c:
        r0 = r6._elementType;	 Catch:{ IOException -> 0x0067, Exception -> 0x0049 }
        r0 = r0.hasGenericTypes();	 Catch:{ IOException -> 0x0067, Exception -> 0x0049 }
        if (r0 == 0) goto L_0x003f;
    L_0x0034:
        r0 = r6._elementType;	 Catch:{ IOException -> 0x0067, Exception -> 0x0049 }
        r0 = r9.constructSpecializedType(r0, r1);	 Catch:{ IOException -> 0x0067, Exception -> 0x0049 }
        r0 = r6._findAndAddDynamic(r4, r0, r9);	 Catch:{ IOException -> 0x0067, Exception -> 0x0049 }
        goto L_0x0043;
    L_0x003f:
        r0 = r6._findAndAddDynamic(r4, r1, r9);	 Catch:{ IOException -> 0x0067, Exception -> 0x0049 }
    L_0x0043:
        r0.serialize(r2, r8, r9);	 Catch:{ IOException -> 0x0067, Exception -> 0x0049 }
    L_0x0046:
        r3 = r3 + 1;
        goto L_0x0018;
    L_0x0049:
        r1 = move-exception;
        goto L_0x004c;
    L_0x004b:
        r1 = move-exception;
    L_0x004c:
        r0 = r1 instanceof java.lang.reflect.InvocationTargetException;
        if (r0 == 0) goto L_0x005b;
    L_0x0050:
        r0 = r1.getCause();
        if (r0 == 0) goto L_0x005b;
    L_0x0056:
        r1 = r1.getCause();
        goto L_0x004c;
    L_0x005b:
        r0 = r1 instanceof java.lang.Error;
        if (r0 == 0) goto L_0x0062;
    L_0x005f:
        r1 = (java.lang.Error) r1;
        throw r1;
    L_0x0062:
        r0 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(r1, r2, r3);
        throw r0;
    L_0x0067:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer.serializeContents(java.lang.Object[], com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider):void");
    }

    public void serializeContentsUsing(Object[] objArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, JsonSerializer jsonSerializer) {
        Throwable e;
        int length = objArr.length;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        int i = 0;
        Object obj = null;
        while (i < length) {
            try {
                obj = objArr[i];
                if (obj == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else if (typeSerializer == null) {
                    try {
                        jsonSerializer.serialize(obj, jsonGenerator, serializerProvider);
                    } catch (IOException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        e = e3;
                    }
                } else {
                    jsonSerializer.serializeWithType(obj, jsonGenerator, serializerProvider, typeSerializer);
                }
                i++;
            } catch (IOException e22) {
                throw e22;
            } catch (Exception e4) {
                e = e4;
            }
        }
        return;
        while ((e instanceof InvocationTargetException) && e.getCause() != null) {
            e = e.getCause();
        }
        if (e instanceof Error) {
            throw ((Error) e);
        }
        throw JsonMappingException.wrapWithPath(e, obj, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void serializeTypedContents(java.lang.Object[] r8, com.fasterxml.jackson.core.JsonGenerator r9, com.fasterxml.jackson.databind.SerializerProvider r10) {
        /*
        r7 = this;
        r6 = r8.length;
        r5 = r7._valueTypeSerializer;
        r4 = 0;
        r2 = 0;
        r3 = r7._dynamicSerializers;	 Catch:{ IOException -> 0x0044, Exception -> 0x0028 }
    L_0x0007:
        if (r4 >= r6) goto L_0x0027;
    L_0x0009:
        r2 = r8[r4];	 Catch:{ IOException -> 0x0044, Exception -> 0x0028 }
        if (r2 != 0) goto L_0x0011;
    L_0x000d:
        r10.defaultSerializeNull(r9);	 Catch:{ IOException -> 0x0044, Exception -> 0x0025 }
        goto L_0x0022;
    L_0x0011:
        r1 = r2.getClass();	 Catch:{ IOException -> 0x0044, Exception -> 0x0025 }
        r0 = r3.serializerFor(r1);	 Catch:{ IOException -> 0x0044, Exception -> 0x0025 }
        if (r0 != 0) goto L_0x001f;
    L_0x001b:
        r0 = r7._findAndAddDynamic(r3, r1, r10);	 Catch:{ IOException -> 0x0044, Exception -> 0x0025 }
    L_0x001f:
        r0.serializeWithType(r2, r9, r10, r5);	 Catch:{ IOException -> 0x0044, Exception -> 0x0025 }
    L_0x0022:
        r4 = r4 + 1;
        goto L_0x0007;
    L_0x0025:
        r1 = move-exception;
        goto L_0x0029;
    L_0x0027:
        return;
    L_0x0028:
        r1 = move-exception;
    L_0x0029:
        r0 = r1 instanceof java.lang.reflect.InvocationTargetException;
        if (r0 == 0) goto L_0x0038;
    L_0x002d:
        r0 = r1.getCause();
        if (r0 == 0) goto L_0x0038;
    L_0x0033:
        r1 = r1.getCause();
        goto L_0x0029;
    L_0x0038:
        r0 = r1 instanceof java.lang.Error;
        if (r0 == 0) goto L_0x003f;
    L_0x003c:
        r1 = (java.lang.Error) r1;
        throw r1;
    L_0x003f:
        r0 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(r1, r2, r4);
        throw r0;
    L_0x0044:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer.serializeTypedContents(java.lang.Object[], com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider):void");
    }

    public ObjectArraySerializer withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        if (this._property == beanProperty && jsonSerializer == this._elementSerializer && this._valueTypeSerializer == typeSerializer) {
            return this;
        }
        return new ObjectArraySerializer(this, beanProperty, typeSerializer, jsonSerializer);
    }
}
