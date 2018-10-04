package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.JsonSerializer.None;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.IdentityHashMap;

public abstract class DefaultSerializerProvider extends SerializerProvider implements Serializable {
    private static final long serialVersionUID = 1;
    public transient ArrayList _objectIdGenerators;
    public transient IdentityHashMap _seenObjectIds;

    public final class Impl extends DefaultSerializerProvider {
        private static final long serialVersionUID = 1;

        public Impl(SerializerProvider serializerProvider, SerializationConfig serializationConfig, SerializerFactory serializerFactory) {
            super(serializerProvider, serializationConfig, serializerFactory);
        }

        public Impl createInstance(SerializationConfig serializationConfig, SerializerFactory serializerFactory) {
            return new Impl(this, serializationConfig, serializerFactory);
        }
    }

    public abstract DefaultSerializerProvider createInstance(SerializationConfig serializationConfig, SerializerFactory serializerFactory);

    public DefaultSerializerProvider(SerializerProvider serializerProvider, SerializationConfig serializationConfig, SerializerFactory serializerFactory) {
        super(serializerProvider, serializationConfig, serializerFactory);
    }

    public void acceptJsonFormatVisitor(JavaType javaType, JsonFormatVisitorWrapper jsonFormatVisitorWrapper) {
        if (javaType != null) {
            jsonFormatVisitorWrapper.setProvider(this);
            findValueSerializer(javaType, null).acceptJsonFormatVisitor(jsonFormatVisitorWrapper, javaType);
            return;
        }
        throw new IllegalArgumentException("A class must be provided");
    }

    public int cachedSerializersCount() {
        return this._serializerCache.size();
    }

    public WritableObjectId findObjectId(Object obj, ObjectIdGenerator objectIdGenerator) {
        IdentityHashMap identityHashMap = this._seenObjectIds;
        if (identityHashMap == null) {
            this._seenObjectIds = new IdentityHashMap();
        } else {
            WritableObjectId writableObjectId = (WritableObjectId) identityHashMap.get(obj);
            if (writableObjectId != null) {
                return writableObjectId;
            }
        }
        ObjectIdGenerator objectIdGenerator2 = null;
        ArrayList arrayList = this._objectIdGenerators;
        if (arrayList == null) {
            this._objectIdGenerators = new ArrayList(8);
        } else {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ObjectIdGenerator objectIdGenerator3 = (ObjectIdGenerator) this._objectIdGenerators.get(i);
                if (objectIdGenerator3.canUseFor(objectIdGenerator)) {
                    objectIdGenerator2 = objectIdGenerator3;
                    break;
                }
            }
        }
        if (objectIdGenerator2 == null) {
            objectIdGenerator2 = objectIdGenerator.newForSerialization(this);
            this._objectIdGenerators.add(objectIdGenerator2);
        }
        WritableObjectId writableObjectId2 = new WritableObjectId(objectIdGenerator2);
        this._seenObjectIds.put(obj, writableObjectId2);
        return writableObjectId2;
    }

    public void flushCachedSerializers() {
        this._serializerCache.flush();
    }

    public JsonSchema generateJsonSchema(Class cls) {
        if (cls != null) {
            JsonSerializer findValueSerializer = findValueSerializer(cls, null);
            JsonNode schema = findValueSerializer instanceof SchemaAware ? ((SchemaAware) findValueSerializer).getSchema(this, null) : JsonSchema.getDefaultSchemaNode();
            if (schema instanceof ObjectNode) {
                return new JsonSchema((ObjectNode) schema);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Class ");
            stringBuilder.append(cls.getName());
            stringBuilder.append(" would not be serialized as a JSON object and therefore has no schema");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new IllegalArgumentException("A class must be provided");
    }

    public boolean hasSerializerFor(java.lang.Class r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r1 = 0;
        r0 = r2._findExplicitUntypedSerializer(r3);	 Catch:{ JsonMappingException -> 0x0009 }
        if (r0 == 0) goto L_0x0008;	 Catch:{ JsonMappingException -> 0x0009 }
    L_0x0007:
        r1 = 1;	 Catch:{ JsonMappingException -> 0x0009 }
    L_0x0008:
        return r1;	 Catch:{ JsonMappingException -> 0x0009 }
    L_0x0009:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.hasSerializerFor(java.lang.Class):boolean");
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj) {
        JsonSerializer defaultNullValueSerializer;
        String rootName;
        boolean z = false;
        if (obj == null) {
            defaultNullValueSerializer = getDefaultNullValueSerializer();
        } else {
            defaultNullValueSerializer = findTypedValueSerializer(obj.getClass(), true, null);
            rootName = this._config.getRootName();
            if (rootName == null) {
                z = this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
                if (z) {
                    jsonGenerator.writeStartObject();
                    jsonGenerator.writeFieldName(this._rootNames.findRootName(obj.getClass(), this._config));
                }
            } else if (rootName.length() != 0) {
                jsonGenerator.writeStartObject();
                jsonGenerator.writeFieldName(rootName);
                z = true;
            }
        }
        try {
            defaultNullValueSerializer.serialize(obj, jsonGenerator, this);
            if (z) {
                jsonGenerator.writeEndObject();
            }
        } catch (IOException e) {
            throw e;
        } catch (Throwable e2) {
            rootName = e2.getMessage();
            if (rootName == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("[no message for ");
                stringBuilder.append(e2.getClass().getName());
                stringBuilder.append("]");
                rootName = stringBuilder.toString();
            }
            throw new JsonMappingException(rootName, e2);
        }
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj, JavaType javaType) {
        JsonSerializer defaultNullValueSerializer;
        boolean z;
        if (obj == null) {
            defaultNullValueSerializer = getDefaultNullValueSerializer();
            z = false;
        } else {
            if (!javaType.getRawClass().isAssignableFrom(obj.getClass())) {
                _reportIncompatibleRootType(obj, javaType);
            }
            defaultNullValueSerializer = findTypedValueSerializer(javaType, true, null);
            z = this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
            if (z) {
                jsonGenerator.writeStartObject();
                jsonGenerator.writeFieldName(this._rootNames.findRootName(javaType, this._config));
            }
        }
        try {
            defaultNullValueSerializer.serialize(obj, jsonGenerator, this);
            if (z) {
                jsonGenerator.writeEndObject();
            }
        } catch (IOException e) {
            throw e;
        } catch (Throwable e2) {
            String message = e2.getMessage();
            if (message == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("[no message for ");
                stringBuilder.append(e2.getClass().getName());
                stringBuilder.append("]");
                message = stringBuilder.toString();
            }
            throw new JsonMappingException(message, e2);
        }
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj, JavaType javaType, JsonSerializer jsonSerializer) {
        boolean z;
        if (obj == null) {
            jsonSerializer = getDefaultNullValueSerializer();
            z = false;
        } else {
            if (!(javaType == null || javaType.getRawClass().isAssignableFrom(obj.getClass()))) {
                _reportIncompatibleRootType(obj, javaType);
            }
            if (jsonSerializer == null) {
                jsonSerializer = findTypedValueSerializer(javaType, true, null);
            }
            z = this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
            if (z) {
                jsonGenerator.writeStartObject();
                jsonGenerator.writeFieldName(this._rootNames.findRootName(javaType, this._config));
            }
        }
        try {
            jsonSerializer.serialize(obj, jsonGenerator, this);
            if (z) {
                jsonGenerator.writeEndObject();
            }
        } catch (IOException e) {
            throw e;
        } catch (Throwable e2) {
            String message = e2.getMessage();
            if (message == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("[no message for ");
                stringBuilder.append(e2.getClass().getName());
                stringBuilder.append("]");
                message = stringBuilder.toString();
            }
            throw new JsonMappingException(message, e2);
        }
    }

    public JsonSerializer serializerInstance(Annotated annotated, Object obj) {
        JsonSerializer jsonSerializer = null;
        if (obj != null) {
            if (obj instanceof JsonSerializer) {
                obj = (JsonSerializer) obj;
            } else if (obj instanceof Class) {
                Class cls = (Class) obj;
                if (cls != None.class) {
                    if (cls != NoClass.class) {
                        if (JsonSerializer.class.isAssignableFrom(cls)) {
                            HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
                            if (handlerInstantiator != null) {
                                jsonSerializer = handlerInstantiator.serializerInstance(this._config, annotated, cls);
                            }
                            obj = jsonSerializer == null ? (JsonSerializer) ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers()) : jsonSerializer;
                        } else {
                            r1 = new StringBuilder();
                            r1.append("AnnotationIntrospector returned Class ");
                            r1.append(cls.getName());
                            r1.append("; expected Class<JsonSerializer>");
                            throw new IllegalStateException(r1.toString());
                        }
                    }
                }
            } else {
                r1 = new StringBuilder();
                r1.append("AnnotationIntrospector returned serializer definition of type ");
                r1.append(obj.getClass().getName());
                r1.append("; expected type JsonSerializer or Class<JsonSerializer> instead");
                throw new IllegalStateException(r1.toString());
            }
            return _handleResolvable(obj);
        }
        return null;
    }
}
