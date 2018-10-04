package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.math.BigDecimal;

@JacksonStdImpl
public class NumberDeserializers$BigDecimalDeserializer extends StdScalarDeserializer {
    public static final NumberDeserializers$BigDecimalDeserializer instance = new NumberDeserializers$BigDecimalDeserializer();

    public NumberDeserializers$BigDecimalDeserializer() {
        super(BigDecimal.class);
    }

    public java.math.BigDecimal deserialize(com.fasterxml.jackson.core.JsonParser r4, com.fasterxml.jackson.databind.DeserializationContext r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r1 = r4.getCurrentToken();
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
        if (r1 == r0) goto L_0x0037;
    L_0x0008:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
        if (r1 != r0) goto L_0x000d;
    L_0x000c:
        goto L_0x0037;
    L_0x000d:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
        if (r1 != r0) goto L_0x0030;
    L_0x0011:
        r0 = r4.getText();
        r2 = r0.trim();
        r0 = r2.length();
        if (r0 != 0) goto L_0x0021;
    L_0x001f:
        r0 = 0;
        return r0;
    L_0x0021:
        r0 = new java.math.BigDecimal;	 Catch:{ IllegalArgumentException -> 0x0027 }
        r0.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0027 }
        return r0;	 Catch:{ IllegalArgumentException -> 0x0027 }
    L_0x0027:
        r1 = r3._valueClass;
        r0 = "not a valid representation";
        r0 = r5.weirdStringException(r2, r1, r0);
        throw r0;
    L_0x0030:
        r0 = r3._valueClass;
        r0 = r5.mappingException(r0, r1);
        throw r0;
    L_0x0037:
        r0 = r4.getDecimalValue();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):java.math.BigDecimal");
    }
}
