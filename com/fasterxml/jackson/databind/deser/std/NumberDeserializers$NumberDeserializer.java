package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.C01511;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

@JacksonStdImpl
public final class NumberDeserializers$NumberDeserializer extends StdScalarDeserializer {
    public static final NumberDeserializers$NumberDeserializer instance = new NumberDeserializers$NumberDeserializer();

    public NumberDeserializers$NumberDeserializer() {
        super(Number.class);
    }

    public java.lang.Number deserialize(com.fasterxml.jackson.core.JsonParser r6, com.fasterxml.jackson.databind.DeserializationContext r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r1 = r6.getCurrentToken();
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
        if (r1 != r0) goto L_0x001a;
    L_0x0008:
        r0 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_INTEGER_FOR_INTS;
        r0 = r7.isEnabled(r0);
        if (r0 == 0) goto L_0x0015;
    L_0x0010:
        r0 = r6.getBigIntegerValue();
        return r0;
    L_0x0015:
        r0 = r6.getNumberValue();
        return r0;
    L_0x001a:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
        if (r1 != r0) goto L_0x0034;
    L_0x001e:
        r0 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
        r0 = r7.isEnabled(r0);
        if (r0 == 0) goto L_0x002b;
    L_0x0026:
        r0 = r6.getDecimalValue();
        return r0;
    L_0x002b:
        r0 = r6.getDoubleValue();
        r0 = java.lang.Double.valueOf(r0);
        return r0;
    L_0x0034:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
        if (r1 != r0) goto L_0x0090;
    L_0x0038:
        r0 = r6.getText();
        r4 = r0.trim();
        r0 = 46;
        r0 = r4.indexOf(r0);	 Catch:{ IllegalArgumentException -> 0x0087 }
        if (r0 < 0) goto L_0x005c;	 Catch:{ IllegalArgumentException -> 0x0087 }
    L_0x0048:
        r0 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;	 Catch:{ IllegalArgumentException -> 0x0087 }
        r0 = r7.isEnabled(r0);	 Catch:{ IllegalArgumentException -> 0x0087 }
        if (r0 == 0) goto L_0x0056;	 Catch:{ IllegalArgumentException -> 0x0087 }
    L_0x0050:
        r0 = new java.math.BigDecimal;	 Catch:{ IllegalArgumentException -> 0x0087 }
        r0.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0087 }
    L_0x0055:
        return r0;	 Catch:{ IllegalArgumentException -> 0x0087 }
    L_0x0056:
        r0 = new java.lang.Double;	 Catch:{ IllegalArgumentException -> 0x0087 }
        r0.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0087 }
        goto L_0x0055;	 Catch:{ IllegalArgumentException -> 0x0087 }
    L_0x005c:
        r0 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_INTEGER_FOR_INTS;	 Catch:{ IllegalArgumentException -> 0x0087 }
        r0 = r7.isEnabled(r0);	 Catch:{ IllegalArgumentException -> 0x0087 }
        if (r0 == 0) goto L_0x006a;	 Catch:{ IllegalArgumentException -> 0x0087 }
    L_0x0064:
        r0 = new java.math.BigInteger;	 Catch:{ IllegalArgumentException -> 0x0087 }
        r0.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0087 }
        goto L_0x0055;	 Catch:{ IllegalArgumentException -> 0x0087 }
    L_0x006a:
        r2 = java.lang.Long.parseLong(r4);	 Catch:{ IllegalArgumentException -> 0x0087 }
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;	 Catch:{ IllegalArgumentException -> 0x0087 }
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));	 Catch:{ IllegalArgumentException -> 0x0087 }
        if (r0 > 0) goto L_0x0082;	 Catch:{ IllegalArgumentException -> 0x0087 }
    L_0x0075:
        r0 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;	 Catch:{ IllegalArgumentException -> 0x0087 }
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));	 Catch:{ IllegalArgumentException -> 0x0087 }
        if (r0 < 0) goto L_0x0082;	 Catch:{ IllegalArgumentException -> 0x0087 }
    L_0x007c:
        r0 = (int) r2;	 Catch:{ IllegalArgumentException -> 0x0087 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ IllegalArgumentException -> 0x0087 }
        return r0;	 Catch:{ IllegalArgumentException -> 0x0087 }
    L_0x0082:
        r0 = java.lang.Long.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0087 }
        return r0;	 Catch:{ IllegalArgumentException -> 0x0087 }
    L_0x0087:
        r1 = r5._valueClass;
        r0 = "not a valid number";
        r0 = r7.weirdStringException(r4, r1, r0);
        throw r0;
    L_0x0090:
        r0 = r5._valueClass;
        r0 = r7.mappingException(r0, r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):java.lang.Number");
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        switch (C01511.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonParser.getCurrentToken().ordinal()]) {
            case 1:
            case 2:
            case 3:
                return deserialize(jsonParser, deserializationContext);
            default:
                return typeDeserializer.deserializeTypedFromScalar(jsonParser, deserializationContext);
        }
    }
}
