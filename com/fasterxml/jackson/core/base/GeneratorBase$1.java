package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.JsonParser$NumberType;
import com.fasterxml.jackson.core.JsonToken;

public final /* synthetic */ class GeneratorBase$1 {
    public static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType = new int[JsonParser$NumberType.values().length];
    public static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = com.fasterxml.jackson.core.JsonToken.values();
        r0 = r0.length;
        r0 = new int[r0];
        $SwitchMap$com$fasterxml$jackson$core$JsonToken = r0;
        r6 = 1;
        r1 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x0014 }
        r0 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;	 Catch:{ NoSuchFieldError -> 0x0014 }
        r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
        r1[r0] = r6;	 Catch:{ NoSuchFieldError -> 0x0014 }
    L_0x0014:
        r5 = 2;
        r1 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x001f }
        r0 = com.fasterxml.jackson.core.JsonToken.END_OBJECT;	 Catch:{ NoSuchFieldError -> 0x001f }
        r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
        r1[r0] = r5;	 Catch:{ NoSuchFieldError -> 0x001f }
    L_0x001f:
        r4 = 3;
        r1 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x002a }
        r0 = com.fasterxml.jackson.core.JsonToken.START_ARRAY;	 Catch:{ NoSuchFieldError -> 0x002a }
        r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
        r1[r0] = r4;	 Catch:{ NoSuchFieldError -> 0x002a }
    L_0x002a:
        r3 = 4;
        r1 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x0035 }
        r0 = com.fasterxml.jackson.core.JsonToken.END_ARRAY;	 Catch:{ NoSuchFieldError -> 0x0035 }
        r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
        r1[r0] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
    L_0x0035:
        r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x0040 }
        r0 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;	 Catch:{ NoSuchFieldError -> 0x0040 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
        r0 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0040 }
    L_0x0040:
        r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x004b }
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;	 Catch:{ NoSuchFieldError -> 0x004b }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
        r0 = 6;	 Catch:{ NoSuchFieldError -> 0x004b }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x004b }
    L_0x004b:
        r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x0056 }
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;	 Catch:{ NoSuchFieldError -> 0x0056 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
        r0 = 7;	 Catch:{ NoSuchFieldError -> 0x0056 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0056 }
    L_0x0056:
        r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x0062 }
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;	 Catch:{ NoSuchFieldError -> 0x0062 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0062 }
        r0 = 8;	 Catch:{ NoSuchFieldError -> 0x0062 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0062 }
    L_0x0062:
        r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x006e }
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;	 Catch:{ NoSuchFieldError -> 0x006e }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x006e }
        r0 = 9;	 Catch:{ NoSuchFieldError -> 0x006e }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x006e }
    L_0x006e:
        r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x007a }
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;	 Catch:{ NoSuchFieldError -> 0x007a }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x007a }
        r0 = 10;	 Catch:{ NoSuchFieldError -> 0x007a }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x007a }
    L_0x007a:
        r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x0086 }
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;	 Catch:{ NoSuchFieldError -> 0x0086 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0086 }
        r0 = 11;	 Catch:{ NoSuchFieldError -> 0x0086 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0086 }
    L_0x0086:
        r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x0092 }
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT;	 Catch:{ NoSuchFieldError -> 0x0092 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0092 }
        r0 = 12;	 Catch:{ NoSuchFieldError -> 0x0092 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0092 }
    L_0x0092:
        r0 = com.fasterxml.jackson.core.JsonParser$NumberType.values();
        r0 = r0.length;
        r0 = new int[r0];
        $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType = r0;
        r1 = $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType;	 Catch:{ NoSuchFieldError -> 0x00a5 }
        r0 = com.fasterxml.jackson.core.JsonParser$NumberType.INT;	 Catch:{ NoSuchFieldError -> 0x00a5 }
        r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x00a5 }
        r1[r0] = r6;	 Catch:{ NoSuchFieldError -> 0x00a5 }
    L_0x00a5:
        r1 = $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType;	 Catch:{ NoSuchFieldError -> 0x00af }
        r0 = com.fasterxml.jackson.core.JsonParser$NumberType.BIG_INTEGER;	 Catch:{ NoSuchFieldError -> 0x00af }
        r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x00af }
        r1[r0] = r5;	 Catch:{ NoSuchFieldError -> 0x00af }
    L_0x00af:
        r1 = $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType;	 Catch:{ NoSuchFieldError -> 0x00b9 }
        r0 = com.fasterxml.jackson.core.JsonParser$NumberType.BIG_DECIMAL;	 Catch:{ NoSuchFieldError -> 0x00b9 }
        r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x00b9 }
        r1[r0] = r4;	 Catch:{ NoSuchFieldError -> 0x00b9 }
    L_0x00b9:
        r1 = $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType;	 Catch:{ NoSuchFieldError -> 0x00c3 }
        r0 = com.fasterxml.jackson.core.JsonParser$NumberType.FLOAT;	 Catch:{ NoSuchFieldError -> 0x00c3 }
        r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x00c3 }
        r1[r0] = r3;	 Catch:{ NoSuchFieldError -> 0x00c3 }
    L_0x00c3:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.base.GeneratorBase$1.<clinit>():void");
    }
}
