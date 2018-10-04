package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.Serializers$Base;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

public class SimpleSerializers extends Serializers$Base implements Serializable {
    private static final long serialVersionUID = 8531646511998456779L;
    public HashMap _classMappings = null;
    public HashMap _interfaceMappings = null;

    public SimpleSerializers(List list) {
        addSerializers(list);
    }

    private void _addSerializer(Class cls, JsonSerializer jsonSerializer) {
        ClassKey classKey = new ClassKey(cls);
        if (cls.isInterface()) {
            if (this._interfaceMappings == null) {
                this._interfaceMappings = new HashMap();
            }
            this._interfaceMappings.put(classKey, jsonSerializer);
            return;
        }
        if (this._classMappings == null) {
            this._classMappings = new HashMap();
        }
        this._classMappings.put(classKey, jsonSerializer);
    }

    public JsonSerializer _findInterfaceMapping(Class cls, ClassKey classKey) {
        Class[] interfaces = cls.getInterfaces();
        int length = interfaces.length;
        int i = 0;
        while (i < length) {
            Class cls2 = interfaces[i];
            classKey.reset(cls2);
            JsonSerializer jsonSerializer = (JsonSerializer) this._interfaceMappings.get(classKey);
            if (jsonSerializer == null) {
                jsonSerializer = _findInterfaceMapping(cls2, classKey);
                if (jsonSerializer == null) {
                    i++;
                }
            }
            return jsonSerializer;
        }
        return null;
    }

    public void addSerializer(JsonSerializer jsonSerializer) {
        Class handledType = jsonSerializer.handledType();
        if (handledType == null || handledType == Object.class) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("JsonSerializer of type ");
            stringBuilder.append(jsonSerializer.getClass().getName());
            stringBuilder.append(" does not define valid handledType() -- must either register with method that takes type argument ");
            stringBuilder.append(" or make serializer extend 'com.fasterxml.jackson.databind.ser.std.StdSerializer'");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        _addSerializer(handledType, jsonSerializer);
    }

    public void addSerializer(Class cls, JsonSerializer jsonSerializer) {
        _addSerializer(cls, jsonSerializer);
    }

    public void addSerializers(List list) {
        for (JsonSerializer addSerializer : list) {
            addSerializer(addSerializer);
        }
    }

    public JsonSerializer findArraySerializer(SerializationConfig serializationConfig, ArrayType arrayType, BeanDescription beanDescription, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        return findSerializer(serializationConfig, arrayType, beanDescription);
    }

    public JsonSerializer findCollectionLikeSerializer(SerializationConfig serializationConfig, CollectionLikeType collectionLikeType, BeanDescription beanDescription, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        return findSerializer(serializationConfig, collectionLikeType, beanDescription);
    }

    public JsonSerializer findCollectionSerializer(SerializationConfig serializationConfig, CollectionType collectionType, BeanDescription beanDescription, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        return findSerializer(serializationConfig, collectionType, beanDescription);
    }

    public JsonSerializer findMapLikeSerializer(SerializationConfig serializationConfig, MapLikeType mapLikeType, BeanDescription beanDescription, JsonSerializer jsonSerializer, TypeSerializer typeSerializer, JsonSerializer jsonSerializer2) {
        return findSerializer(serializationConfig, mapLikeType, beanDescription);
    }

    public JsonSerializer findMapSerializer(SerializationConfig serializationConfig, MapType mapType, BeanDescription beanDescription, JsonSerializer jsonSerializer, TypeSerializer typeSerializer, JsonSerializer jsonSerializer2) {
        return findSerializer(serializationConfig, mapType, beanDescription);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonSerializer findSerializer(com.fasterxml.jackson.databind.SerializationConfig r5, com.fasterxml.jackson.databind.JavaType r6, com.fasterxml.jackson.databind.BeanDescription r7) {
        /*
        r4 = this;
        r3 = r6.getRawClass();
        r2 = new com.fasterxml.jackson.databind.type.ClassKey;
        r2.<init>(r3);
        r0 = r3.isInterface();
        if (r0 == 0) goto L_0x001c;
    L_0x000f:
        r0 = r4._interfaceMappings;
        if (r0 == 0) goto L_0x003f;
    L_0x0013:
        r0 = r0.get(r2);
        r0 = (com.fasterxml.jackson.databind.JsonSerializer) r0;
        if (r0 == 0) goto L_0x003f;
    L_0x001b:
        return r0;
    L_0x001c:
        r0 = r4._classMappings;
        if (r0 == 0) goto L_0x003f;
    L_0x0020:
        r0 = r0.get(r2);
        r0 = (com.fasterxml.jackson.databind.JsonSerializer) r0;
        if (r0 == 0) goto L_0x0029;
    L_0x0028:
        goto L_0x001b;
    L_0x0029:
        r1 = r3;
    L_0x002a:
        if (r1 == 0) goto L_0x003f;
    L_0x002c:
        r2.reset(r1);
        r0 = r4._classMappings;
        r0 = r0.get(r2);
        r0 = (com.fasterxml.jackson.databind.JsonSerializer) r0;
        if (r0 == 0) goto L_0x003a;
    L_0x0039:
        goto L_0x001b;
    L_0x003a:
        r1 = r1.getSuperclass();
        goto L_0x002a;
    L_0x003f:
        r0 = r4._interfaceMappings;
        if (r0 == 0) goto L_0x005d;
    L_0x0043:
        r0 = r4._findInterfaceMapping(r3, r2);
        if (r0 == 0) goto L_0x004a;
    L_0x0049:
        goto L_0x001b;
    L_0x004a:
        r0 = r3.isInterface();
        if (r0 != 0) goto L_0x005d;
    L_0x0050:
        r3 = r3.getSuperclass();
        if (r3 == 0) goto L_0x005d;
    L_0x0056:
        r0 = r4._findInterfaceMapping(r3, r2);
        if (r0 == 0) goto L_0x0050;
    L_0x005c:
        goto L_0x001b;
    L_0x005d:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.module.SimpleSerializers.findSerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription):com.fasterxml.jackson.databind.JsonSerializer");
    }
}
