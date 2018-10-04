package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.math.BigInteger;

@JacksonStdImpl
public class NumberDeserializers$BigIntegerDeserializer extends StdScalarDeserializer {
    public static final NumberDeserializers$BigIntegerDeserializer instance = new NumberDeserializers$BigIntegerDeserializer();

    public NumberDeserializers$BigIntegerDeserializer() {
        super(BigInteger.class);
    }

    public java.math.BigInteger deserialize(com.fasterxml.jackson.core.JsonParser r4, com.fasterxml.jackson.databind.DeserializationContext r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r1 = r4.getCurrentToken();
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
        if (r1 != r0) goto L_0x001d;
    L_0x0008:
        r0 = r4.getNumberType();
        r0 = r0.ordinal();
        switch(r0) {
            case 0: goto L_0x0014;
            case 1: goto L_0x0014;
            default: goto L_0x0013;
        };
    L_0x0013:
        goto L_0x002e;
    L_0x0014:
        r0 = r4.getLongValue();
        r0 = java.math.BigInteger.valueOf(r0);
        return r0;
    L_0x001d:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
        if (r1 != r0) goto L_0x002a;
    L_0x0021:
        r0 = r4.getDecimalValue();
        r0 = r0.toBigInteger();
        return r0;
    L_0x002a:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
        if (r1 != r0) goto L_0x004d;
    L_0x002e:
        r0 = r4.getText();
        r2 = r0.trim();
        r0 = r2.length();
        if (r0 != 0) goto L_0x003e;
    L_0x003c:
        r0 = 0;
        return r0;
    L_0x003e:
        r0 = new java.math.BigInteger;	 Catch:{ IllegalArgumentException -> 0x0044 }
        r0.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0044 }
        return r0;	 Catch:{ IllegalArgumentException -> 0x0044 }
    L_0x0044:
        r1 = r3._valueClass;
        r0 = "not a valid representation";
        r0 = r5.weirdStringException(r2, r1, r0);
        throw r0;
    L_0x004d:
        r0 = r3._valueClass;
        r0 = r5.mappingException(r0, r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):java.math.BigInteger");
    }
}
