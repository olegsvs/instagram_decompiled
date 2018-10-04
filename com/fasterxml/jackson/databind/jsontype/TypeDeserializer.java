package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;

public abstract class TypeDeserializer {

    /* renamed from: com.fasterxml.jackson.databind.jsontype.TypeDeserializer$1 */
    public /* synthetic */ class C01531 {
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
            r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r0 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.jsontype.TypeDeserializer.1.<clinit>():void");
        }
    }

    public abstract Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext);

    public abstract Object deserializeTypedFromArray(JsonParser jsonParser, DeserializationContext deserializationContext);

    public abstract Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext);

    public abstract Object deserializeTypedFromScalar(JsonParser jsonParser, DeserializationContext deserializationContext);

    public abstract TypeDeserializer forProperty(BeanProperty beanProperty);

    public abstract Class getDefaultImpl();

    public abstract String getPropertyName();

    public abstract TypeIdResolver getTypeIdResolver();

    public abstract As getTypeInclusion();

    public static Object deserializeIfNatural(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) {
        return deserializeIfNatural(jsonParser, deserializationContext, javaType.getRawClass());
    }

    public static Object deserializeIfNatural(JsonParser jsonParser, DeserializationContext deserializationContext, Class cls) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken != null) {
            switch (C01531.$SwitchMap$com$fasterxml$jackson$core$JsonToken[currentToken.ordinal()]) {
                case 1:
                    if (cls.isAssignableFrom(String.class)) {
                        return jsonParser.getText();
                    }
                    break;
                case 2:
                    if (cls.isAssignableFrom(Integer.class)) {
                        return Integer.valueOf(jsonParser.getIntValue());
                    }
                    break;
                case 3:
                    if (cls.isAssignableFrom(Double.class)) {
                        return Double.valueOf(jsonParser.getDoubleValue());
                    }
                    break;
                case 4:
                    if (cls.isAssignableFrom(Boolean.class)) {
                        return Boolean.TRUE;
                    }
                    break;
                case 5:
                    if (cls.isAssignableFrom(Boolean.class)) {
                        return Boolean.FALSE;
                    }
                    break;
                default:
                    break;
            }
        }
        return null;
    }
}
