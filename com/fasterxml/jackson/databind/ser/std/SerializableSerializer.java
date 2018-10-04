package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.util.concurrent.atomic.AtomicReference;

@JacksonStdImpl
public class SerializableSerializer extends StdSerializer {
    private static final AtomicReference _mapperReference = new AtomicReference();
    public static final SerializableSerializer instance = new SerializableSerializer();

    public SerializableSerializer() {
        super(JsonSerializable.class);
    }

    private static final synchronized ObjectMapper _getObjectMapper() {
        ObjectMapper objectMapper;
        synchronized (SerializableSerializer.class) {
            AtomicReference atomicReference = _mapperReference;
            objectMapper = (ObjectMapper) atomicReference.get();
            if (objectMapper == null) {
                objectMapper = new ObjectMapper();
                atomicReference.set(objectMapper);
            }
        }
        return objectMapper;
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper.expectAnyFormat(javaType);
    }

    public com.fasterxml.jackson.databind.JsonNode getSchema(com.fasterxml.jackson.databind.SerializerProvider r6, java.lang.reflect.Type r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r3 = r5.createObjectNode();
        r6 = "any";
        r4 = 0;
        if (r7 == 0) goto L_0x0042;
    L_0x0009:
        r1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(r7);
        r0 = com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema.class;
        r0 = r1.isAnnotationPresent(r0);
        if (r0 == 0) goto L_0x0042;
    L_0x0015:
        r0 = com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema.class;
        r5 = r1.getAnnotation(r0);
        r5 = (com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema) r5;
        r6 = r5.schemaType();
        r1 = "##irrelevant";
        r0 = r5.schemaObjectPropertiesDefinition();
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0032;
    L_0x002d:
        r2 = r5.schemaObjectPropertiesDefinition();
        goto L_0x0033;
    L_0x0032:
        r2 = r4;
    L_0x0033:
        r0 = r5.schemaItemDefinition();
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0043;
    L_0x003d:
        r4 = r5.schemaItemDefinition();
        goto L_0x0043;
    L_0x0042:
        r2 = r4;
    L_0x0043:
        r0 = "type";
        r3.put(r0, r6);
        if (r2 == 0) goto L_0x0060;
    L_0x004a:
        r1 = "properties";	 Catch:{ IOException -> 0x0058 }
        r0 = _getObjectMapper();	 Catch:{ IOException -> 0x0058 }
        r0 = r0.readTree(r2);	 Catch:{ IOException -> 0x0058 }
        r3.put(r1, r0);	 Catch:{ IOException -> 0x0058 }
        goto L_0x0060;	 Catch:{ IOException -> 0x0058 }
    L_0x0058:
        r1 = new com.fasterxml.jackson.databind.JsonMappingException;
        r0 = "Failed to parse @JsonSerializableSchema.schemaObjectPropertiesDefinition value";
        r1.<init>(r0);
        throw r1;
    L_0x0060:
        if (r4 == 0) goto L_0x0078;
    L_0x0062:
        r1 = "items";	 Catch:{ IOException -> 0x0070 }
        r0 = _getObjectMapper();	 Catch:{ IOException -> 0x0070 }
        r0 = r0.readTree(r4);	 Catch:{ IOException -> 0x0070 }
        r3.put(r1, r0);	 Catch:{ IOException -> 0x0070 }
        goto L_0x0078;	 Catch:{ IOException -> 0x0070 }
    L_0x0070:
        r1 = new com.fasterxml.jackson.databind.JsonMappingException;
        r0 = "Failed to parse @JsonSerializableSchema.schemaItemDefinition value";
        r1.<init>(r0);
        throw r1;
    L_0x0078:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.SerializableSerializer.getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type):com.fasterxml.jackson.databind.JsonNode");
    }

    public void serialize(JsonSerializable jsonSerializable, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonSerializable.serialize(jsonGenerator, serializerProvider);
    }

    public final void serializeWithType(JsonSerializable jsonSerializable, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        jsonSerializable.serializeWithType(jsonGenerator, serializerProvider, typeSerializer);
    }
}
