package com.fasterxml.jackson.databind.deser.std;

import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.core.JsonParser$NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;

public class NumberDeserializers {
    private static final HashSet _classNames = new HashSet();

    /* renamed from: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$1 */
    public /* synthetic */ class C01511 {
        public static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType = new int[JsonParser$NumberType.values().length];
        public static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.fasterxml.jackson.core.JsonParser$NumberType.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType = r0;
            r3 = 1;
            r1 = $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = com.fasterxml.jackson.core.JsonParser$NumberType.INT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r0] = r3;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r2 = 2;
            r1 = $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = com.fasterxml.jackson.core.JsonParser$NumberType.LONG;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r1[r0] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = com.fasterxml.jackson.core.JsonToken.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$fasterxml$jackson$core$JsonToken = r0;
            r1 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x0032 }
            r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;	 Catch:{ NoSuchFieldError -> 0x0032 }
            r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0032 }
            r1[r0] = r3;	 Catch:{ NoSuchFieldError -> 0x0032 }
        L_0x0032:
            r1 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x003c }
            r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;	 Catch:{ NoSuchFieldError -> 0x003c }
            r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x003c }
            r1[r0] = r2;	 Catch:{ NoSuchFieldError -> 0x003c }
        L_0x003c:
            r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0047 }
            r0 = 3;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0047 }
        L_0x0047:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.NumberDeserializers.1.<clinit>():void");
        }
    }

    static {
        r4 = new Class[11];
        int i = 0;
        r4[0] = Boolean.class;
        r4[1] = Byte.class;
        r4[2] = Short.class;
        r4[3] = Character.class;
        r4[4] = Integer.class;
        r4[5] = Long.class;
        r4[6] = Float.class;
        r4[7] = Double.class;
        r4[8] = Number.class;
        r4[9] = BigDecimal.class;
        r4[10] = BigInteger.class;
        int length = r4.length;
        while (i < length) {
            _classNames.add(r4[i].getName());
            i++;
        }
    }

    public static StdDeserializer[] all() {
        return new StdDeserializer[]{new NumberDeserializers$BooleanDeserializer(Boolean.class, null), new NumberDeserializers$ByteDeserializer(Byte.class, null), new NumberDeserializers$ShortDeserializer(Short.class, null), new NumberDeserializers$CharacterDeserializer(Character.class, null), new NumberDeserializers$IntegerDeserializer(Integer.class, null), new NumberDeserializers$LongDeserializer(Long.class, null), new NumberDeserializers$FloatDeserializer(Float.class, null), new NumberDeserializers$DoubleDeserializer(Double.class, null), new NumberDeserializers$BooleanDeserializer(Boolean.TYPE, Boolean.FALSE), new NumberDeserializers$ByteDeserializer(Byte.TYPE, Byte.valueOf((byte) 0)), new NumberDeserializers$ShortDeserializer(Short.TYPE, Short.valueOf((short) 0)), new NumberDeserializers$CharacterDeserializer(Character.TYPE, Character.valueOf('\u0000')), new NumberDeserializers$IntegerDeserializer(Integer.TYPE, Integer.valueOf(0)), new NumberDeserializers$LongDeserializer(Long.TYPE, Long.valueOf(0)), new NumberDeserializers$FloatDeserializer(Float.TYPE, Float.valueOf(0.0f)), new NumberDeserializers$DoubleDeserializer(Double.TYPE, Double.valueOf(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED)), new NumberDeserializers$NumberDeserializer(), new NumberDeserializers$BigDecimalDeserializer(), new NumberDeserializers$BigIntegerDeserializer()};
    }

    public static JsonDeserializer find(Class cls, String str) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return NumberDeserializers$IntegerDeserializer.primitiveInstance;
            }
            if (cls == Boolean.TYPE) {
                return NumberDeserializers$BooleanDeserializer.primitiveInstance;
            }
            if (cls == Long.TYPE) {
                return NumberDeserializers$LongDeserializer.primitiveInstance;
            }
            if (cls == Double.TYPE) {
                return NumberDeserializers$DoubleDeserializer.primitiveInstance;
            }
            if (cls == Character.TYPE) {
                return NumberDeserializers$CharacterDeserializer.primitiveInstance;
            }
            if (cls == Byte.TYPE) {
                return NumberDeserializers$ByteDeserializer.primitiveInstance;
            }
            if (cls == Short.TYPE) {
                return NumberDeserializers$ShortDeserializer.primitiveInstance;
            }
            if (cls == Float.TYPE) {
                return NumberDeserializers$FloatDeserializer.primitiveInstance;
            }
        } else if (!_classNames.contains(str)) {
            return null;
        } else {
            if (cls == Integer.class) {
                return NumberDeserializers$IntegerDeserializer.wrapperInstance;
            }
            if (cls == Boolean.class) {
                return NumberDeserializers$BooleanDeserializer.wrapperInstance;
            }
            if (cls == Long.class) {
                return NumberDeserializers$LongDeserializer.wrapperInstance;
            }
            if (cls == Double.class) {
                return NumberDeserializers$DoubleDeserializer.wrapperInstance;
            }
            if (cls == Character.class) {
                return NumberDeserializers$CharacterDeserializer.wrapperInstance;
            }
            if (cls == Byte.class) {
                return NumberDeserializers$ByteDeserializer.wrapperInstance;
            }
            if (cls == Short.class) {
                return NumberDeserializers$ShortDeserializer.wrapperInstance;
            }
            if (cls == Float.class) {
                return NumberDeserializers$FloatDeserializer.wrapperInstance;
            }
            if (cls == Number.class) {
                return NumberDeserializers$NumberDeserializer.instance;
            }
            if (cls == BigDecimal.class) {
                return NumberDeserializers$BigDecimalDeserializer.instance;
            }
            if (cls == BigInteger.class) {
                return NumberDeserializers$BigIntegerDeserializer.instance;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Internal error: can't find deserializer for ");
        stringBuilder.append(cls.getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
