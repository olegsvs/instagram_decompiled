package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import java.io.Serializable;
import java.util.Collection;

public class ObjectMapper$DefaultTypeResolverBuilder extends StdTypeResolverBuilder implements Serializable {
    private static final long serialVersionUID = 1;
    public final DefaultTyping _appliesFor;

    public ObjectMapper$DefaultTypeResolverBuilder(DefaultTyping defaultTyping) {
        this._appliesFor = defaultTyping;
    }

    public TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection collection) {
        return useForType(javaType) ? super.buildTypeDeserializer(deserializationConfig, javaType, collection) : null;
    }

    public TypeSerializer buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection collection) {
        return useForType(javaType) ? super.buildTypeSerializer(serializationConfig, javaType, collection) : null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean useForType(com.fasterxml.jackson.databind.JavaType r3) {
        /*
        r2 = this;
        r1 = com.fasterxml.jackson.databind.ObjectMapper.C01502.f50707x3ef634e7;
        r0 = r2._appliesFor;
        r0 = r0.ordinal();
        r0 = r1[r0];
        r2 = 0;
        r1 = 1;
        switch(r0) {
            case 1: goto L_0x002a;
            case 2: goto L_0x0035;
            case 3: goto L_0x0019;
            default: goto L_0x000f;
        };
    L_0x000f:
        r1 = r3.getRawClass();
        r0 = java.lang.Object.class;
        if (r1 != r0) goto L_0x0044;
    L_0x0017:
        r2 = 1;
        goto L_0x0044;
    L_0x0019:
        r0 = r3.isArrayType();
        if (r0 == 0) goto L_0x0024;
    L_0x001f:
        r3 = r3.getContentType();
        goto L_0x0019;
    L_0x0024:
        r0 = r3.isFinal();
        r0 = r0 ^ r1;
        return r0;
    L_0x002a:
        r0 = r3.isArrayType();
        if (r0 == 0) goto L_0x0035;
    L_0x0030:
        r3 = r3.getContentType();
        goto L_0x002a;
    L_0x0035:
        r1 = r3.getRawClass();
        r0 = java.lang.Object.class;
        if (r1 == r0) goto L_0x0017;
    L_0x003d:
        r0 = r3.isConcrete();
        if (r0 != 0) goto L_0x0044;
    L_0x0043:
        goto L_0x0017;
    L_0x0044:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder.useForType(com.fasterxml.jackson.databind.JavaType):boolean");
    }
}
