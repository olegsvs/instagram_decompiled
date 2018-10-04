package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser$NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.Serializable;
import java.util.Date;

public abstract class StdDeserializer extends JsonDeserializer implements Serializable {
    private static final long serialVersionUID = 1;
    public final Class _valueClass;

    public JavaType getValueType() {
        return null;
    }

    public StdDeserializer(JavaType javaType) {
        Class cls;
        if (javaType == null) {
            cls = null;
        } else {
            cls = javaType.getRawClass();
        }
        this._valueClass = cls;
    }

    public StdDeserializer(Class cls) {
        this._valueClass = cls;
    }

    public final Boolean _parseBoolean(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken != JsonToken.VALUE_TRUE) {
            if (currentToken != JsonToken.VALUE_FALSE) {
                if (currentToken == JsonToken.VALUE_NUMBER_INT) {
                    if (jsonParser.getNumberType() != JsonParser$NumberType.INT) {
                        return Boolean.valueOf(_parseBooleanFromNumber(jsonParser, deserializationContext));
                    }
                    return jsonParser.getIntValue() == 0 ? Boolean.FALSE : Boolean.TRUE;
                } else if (currentToken == JsonToken.VALUE_NULL) {
                    return (Boolean) getNullValue();
                } else {
                    if (currentToken == JsonToken.VALUE_STRING) {
                        String trim = jsonParser.getText().trim();
                        if (!"true".equals(trim)) {
                            if (!"false".equals(trim)) {
                                if (trim.length() == 0) {
                                    return (Boolean) getEmptyValue();
                                }
                                throw deserializationContext.weirdStringException(trim, this._valueClass, "only \"true\" or \"false\" recognized");
                            }
                        }
                    } else {
                        throw deserializationContext.mappingException(this._valueClass, currentToken);
                    }
                }
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public final boolean _parseBooleanFromNumber(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getNumberType() == JsonParser$NumberType.LONG) {
            return (jsonParser.getLongValue() == 0 ? Boolean.FALSE : Boolean.TRUE).booleanValue();
        }
        String text = jsonParser.getText();
        if (!"0.0".equals(text)) {
            if (!"0".equals(text)) {
                return Boolean.TRUE.booleanValue();
            }
        }
        return Boolean.FALSE.booleanValue();
    }

    public final boolean _parseBooleanPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        boolean z = true;
        if (currentToken != JsonToken.VALUE_TRUE) {
            if (currentToken != JsonToken.VALUE_FALSE) {
                if (currentToken != JsonToken.VALUE_NULL) {
                    if (currentToken == JsonToken.VALUE_NUMBER_INT) {
                        if (jsonParser.getNumberType() != JsonParser$NumberType.INT) {
                            return _parseBooleanFromNumber(jsonParser, deserializationContext);
                        }
                        if (jsonParser.getIntValue() == 0) {
                            z = false;
                        }
                    } else if (currentToken == JsonToken.VALUE_STRING) {
                        String trim = jsonParser.getText().trim();
                        if (!"true".equals(trim)) {
                            if (!"false".equals(trim)) {
                                if (trim.length() != 0) {
                                    throw deserializationContext.weirdStringException(trim, this._valueClass, "only \"true\" or \"false\" recognized");
                                }
                            }
                            return Boolean.FALSE.booleanValue();
                        }
                    } else {
                        throw deserializationContext.mappingException(this._valueClass, currentToken);
                    }
                }
            }
            return false;
        }
        return z;
    }

    public java.lang.Byte _parseByte(com.fasterxml.jackson.core.JsonParser r4, com.fasterxml.jackson.databind.DeserializationContext r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r1 = r4.getCurrentToken();
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
        if (r1 == r0) goto L_0x005c;
    L_0x0008:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
        if (r1 != r0) goto L_0x000d;
    L_0x000c:
        goto L_0x005c;
    L_0x000d:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
        if (r1 != r0) goto L_0x004a;
    L_0x0011:
        r0 = r4.getText();
        r2 = r0.trim();
        r0 = r2.length();	 Catch:{ IllegalArgumentException -> 0x0041 }
        if (r0 != 0) goto L_0x0026;	 Catch:{ IllegalArgumentException -> 0x0041 }
    L_0x001f:
        r0 = r3.getEmptyValue();	 Catch:{ IllegalArgumentException -> 0x0041 }
        r0 = (java.lang.Byte) r0;	 Catch:{ IllegalArgumentException -> 0x0041 }
        return r0;	 Catch:{ IllegalArgumentException -> 0x0041 }
    L_0x0026:
        r1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(r2);	 Catch:{ IllegalArgumentException -> 0x0041 }
        r0 = -128; // 0xffffffffffffff80 float:NaN double:NaN;	 Catch:{ IllegalArgumentException -> 0x0041 }
        if (r1 < r0) goto L_0x0038;	 Catch:{ IllegalArgumentException -> 0x0041 }
    L_0x002e:
        r0 = 255; // 0xff float:3.57E-43 double:1.26E-321;	 Catch:{ IllegalArgumentException -> 0x0041 }
        if (r1 > r0) goto L_0x0038;	 Catch:{ IllegalArgumentException -> 0x0041 }
    L_0x0032:
        r0 = (byte) r1;
        r0 = java.lang.Byte.valueOf(r0);
        return r0;
    L_0x0038:
        r1 = r3._valueClass;
        r0 = "overflow, value can not be represented as 8-bit value";
        r0 = r5.weirdStringException(r2, r1, r0);
        throw r0;
    L_0x0041:
        r1 = r3._valueClass;
        r0 = "not a valid Byte value";
        r0 = r5.weirdStringException(r2, r1, r0);
        throw r0;
    L_0x004a:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
        if (r1 != r0) goto L_0x0055;
    L_0x004e:
        r0 = r3.getNullValue();
        r0 = (java.lang.Byte) r0;
        return r0;
    L_0x0055:
        r0 = r3._valueClass;
        r0 = r5.mappingException(r0, r1);
        throw r0;
    L_0x005c:
        r0 = r4.getByteValue();
        r0 = java.lang.Byte.valueOf(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseByte(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):java.lang.Byte");
    }

    public Date _parseDate(JsonParser jsonParser, DeserializationContext deserializationContext) {
        IllegalArgumentException e;
        Class cls;
        StringBuilder stringBuilder;
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NUMBER_INT) {
            return new Date(jsonParser.getLongValue());
        }
        if (currentToken == JsonToken.VALUE_NULL) {
            return (Date) getNullValue();
        }
        if (currentToken == JsonToken.VALUE_STRING) {
            String str = null;
            try {
                str = jsonParser.getText().trim();
                try {
                    if (str.length() == 0) {
                        return (Date) getEmptyValue();
                    }
                    return deserializationContext.parseDate(str);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    cls = this._valueClass;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("not a valid representation (error: ");
                    stringBuilder.append(e.getMessage());
                    stringBuilder.append(")");
                    throw deserializationContext.weirdStringException(str, cls, stringBuilder.toString());
                }
            } catch (IllegalArgumentException e3) {
                e = e3;
                cls = this._valueClass;
                stringBuilder = new StringBuilder();
                stringBuilder.append("not a valid representation (error: ");
                stringBuilder.append(e.getMessage());
                stringBuilder.append(")");
                throw deserializationContext.weirdStringException(str, cls, stringBuilder.toString());
            }
        }
        throw deserializationContext.mappingException(this._valueClass, currentToken);
    }

    public final java.lang.Double _parseDouble(com.fasterxml.jackson.core.JsonParser r4, com.fasterxml.jackson.databind.DeserializationContext r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r1 = r4.getCurrentToken();
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
        if (r1 == r0) goto L_0x009b;
    L_0x0008:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
        if (r1 != r0) goto L_0x000e;
    L_0x000c:
        goto L_0x009b;
    L_0x000e:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
        if (r1 != r0) goto L_0x0089;
    L_0x0012:
        r0 = r4.getText();
        r2 = r0.trim();
        r0 = r2.length();
        if (r0 != 0) goto L_0x0027;
    L_0x0020:
        r0 = r3.getEmptyValue();
        r0 = (java.lang.Double) r0;
        return r0;
    L_0x0027:
        r0 = 0;
        r1 = r2.charAt(r0);
        r0 = 45;
        if (r1 == r0) goto L_0x005f;
    L_0x0030:
        r0 = 73;
        if (r1 == r0) goto L_0x0048;
    L_0x0034:
        r0 = 78;
        if (r1 == r0) goto L_0x0039;
    L_0x0038:
        goto L_0x0070;
    L_0x0039:
        r0 = "NaN";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0070;
    L_0x0041:
        r0 = 9221120237041090560; // 0x7ff8000000000000 float:0.0 double:NaN;
        r0 = java.lang.Double.valueOf(r0);
        return r0;
    L_0x0048:
        r0 = "Infinity";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0058;
    L_0x0050:
        r0 = "INF";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0070;
    L_0x0058:
        r0 = 9218868437227405312; // 0x7ff0000000000000 float:0.0 double:Infinity;
        r0 = java.lang.Double.valueOf(r0);
        return r0;
    L_0x005f:
        r0 = "-Infinity";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0082;
    L_0x0067:
        r0 = "-INF";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0070;
    L_0x006f:
        goto L_0x0082;
    L_0x0070:
        r0 = parseDouble(r2);	 Catch:{ IllegalArgumentException -> 0x0079 }
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ IllegalArgumentException -> 0x0079 }
        return r0;	 Catch:{ IllegalArgumentException -> 0x0079 }
    L_0x0079:
        r1 = r3._valueClass;
        r0 = "not a valid Double value";
        r0 = r5.weirdStringException(r2, r1, r0);
        throw r0;
    L_0x0082:
        r0 = -4503599627370496; // 0xfff0000000000000 float:0.0 double:-Infinity;
        r0 = java.lang.Double.valueOf(r0);
        return r0;
    L_0x0089:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
        if (r1 != r0) goto L_0x0094;
    L_0x008d:
        r0 = r3.getNullValue();
        r0 = (java.lang.Double) r0;
        return r0;
    L_0x0094:
        r0 = r3._valueClass;
        r0 = r5.mappingException(r0, r1);
        throw r0;
    L_0x009b:
        r0 = r4.getDoubleValue();
        r0 = java.lang.Double.valueOf(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDouble(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):java.lang.Double");
    }

    public final double _parseDoublePrimitive(com.fasterxml.jackson.core.JsonParser r6, com.fasterxml.jackson.databind.DeserializationContext r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r1 = r6.getCurrentToken();
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
        if (r1 == r0) goto L_0x0080;
    L_0x0008:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
        if (r1 != r0) goto L_0x000d;
    L_0x000c:
        goto L_0x0080;
    L_0x000d:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
        r3 = 0;
        if (r1 != r0) goto L_0x0074;
    L_0x0013:
        r0 = r6.getText();
        r2 = r0.trim();
        r0 = r2.length();
        if (r0 != 0) goto L_0x0022;
    L_0x0021:
        return r3;
    L_0x0022:
        r0 = 0;
        r1 = r2.charAt(r0);
        r0 = 45;
        if (r1 == r0) goto L_0x0052;
    L_0x002b:
        r0 = 73;
        if (r1 == r0) goto L_0x003f;
    L_0x002f:
        r0 = 78;
        if (r1 == r0) goto L_0x0034;
    L_0x0033:
        goto L_0x0063;
    L_0x0034:
        r0 = "NaN";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0063;
    L_0x003c:
        r0 = 9221120237041090560; // 0x7ff8000000000000 float:0.0 double:NaN;
        return r0;
    L_0x003f:
        r0 = "Infinity";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x004f;
    L_0x0047:
        r0 = "INF";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0063;
    L_0x004f:
        r0 = 9218868437227405312; // 0x7ff0000000000000 float:0.0 double:Infinity;
        return r0;
    L_0x0052:
        r0 = "-Infinity";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0071;
    L_0x005a:
        r0 = "-INF";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0063;
    L_0x0062:
        goto L_0x0071;
    L_0x0063:
        r0 = parseDouble(r2);	 Catch:{ IllegalArgumentException -> 0x0068 }
        return r0;	 Catch:{ IllegalArgumentException -> 0x0068 }
    L_0x0068:
        r1 = r5._valueClass;
        r0 = "not a valid double value";
        r0 = r7.weirdStringException(r2, r1, r0);
        throw r0;
    L_0x0071:
        r0 = -4503599627370496; // 0xfff0000000000000 float:0.0 double:-Infinity;
        return r0;
    L_0x0074:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
        if (r1 != r0) goto L_0x0079;
    L_0x0078:
        goto L_0x0021;
    L_0x0079:
        r0 = r5._valueClass;
        r0 = r7.mappingException(r0, r1);
        throw r0;
    L_0x0080:
        r0 = r6.getDoubleValue();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):double");
    }

    public final java.lang.Float _parseFloat(com.fasterxml.jackson.core.JsonParser r4, com.fasterxml.jackson.databind.DeserializationContext r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r1 = r4.getCurrentToken();
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
        if (r1 == r0) goto L_0x009b;
    L_0x0008:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
        if (r1 != r0) goto L_0x000e;
    L_0x000c:
        goto L_0x009b;
    L_0x000e:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
        if (r1 != r0) goto L_0x0089;
    L_0x0012:
        r0 = r4.getText();
        r2 = r0.trim();
        r0 = r2.length();
        if (r0 != 0) goto L_0x0027;
    L_0x0020:
        r0 = r3.getEmptyValue();
        r0 = (java.lang.Float) r0;
        return r0;
    L_0x0027:
        r0 = 0;
        r1 = r2.charAt(r0);
        r0 = 45;
        if (r1 == r0) goto L_0x005f;
    L_0x0030:
        r0 = 73;
        if (r1 == r0) goto L_0x0048;
    L_0x0034:
        r0 = 78;
        if (r1 == r0) goto L_0x0039;
    L_0x0038:
        goto L_0x0070;
    L_0x0039:
        r0 = "NaN";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0070;
    L_0x0041:
        r0 = 2143289344; // 0x7fc00000 float:NaN double:1.058925634E-314;
        r0 = java.lang.Float.valueOf(r0);
        return r0;
    L_0x0048:
        r0 = "Infinity";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0058;
    L_0x0050:
        r0 = "INF";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0070;
    L_0x0058:
        r0 = 2139095040; // 0x7f800000 float:Infinity double:1.0568533725E-314;
        r0 = java.lang.Float.valueOf(r0);
        return r0;
    L_0x005f:
        r0 = "-Infinity";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0082;
    L_0x0067:
        r0 = "-INF";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0070;
    L_0x006f:
        goto L_0x0082;
    L_0x0070:
        r0 = java.lang.Float.parseFloat(r2);	 Catch:{ IllegalArgumentException -> 0x0079 }
        r0 = java.lang.Float.valueOf(r0);	 Catch:{ IllegalArgumentException -> 0x0079 }
        return r0;	 Catch:{ IllegalArgumentException -> 0x0079 }
    L_0x0079:
        r1 = r3._valueClass;
        r0 = "not a valid Float value";
        r0 = r5.weirdStringException(r2, r1, r0);
        throw r0;
    L_0x0082:
        r0 = -8388608; // 0xffffffffff800000 float:-Infinity double:NaN;
        r0 = java.lang.Float.valueOf(r0);
        return r0;
    L_0x0089:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
        if (r1 != r0) goto L_0x0094;
    L_0x008d:
        r0 = r3.getNullValue();
        r0 = (java.lang.Float) r0;
        return r0;
    L_0x0094:
        r0 = r3._valueClass;
        r0 = r5.mappingException(r0, r1);
        throw r0;
    L_0x009b:
        r0 = r4.getFloatValue();
        r0 = java.lang.Float.valueOf(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseFloat(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):java.lang.Float");
    }

    public final float _parseFloatPrimitive(com.fasterxml.jackson.core.JsonParser r4, com.fasterxml.jackson.databind.DeserializationContext r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r2 = r4.getCurrentToken();
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
        if (r2 == r0) goto L_0x007f;
    L_0x0008:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
        if (r2 != r0) goto L_0x000d;
    L_0x000c:
        goto L_0x007f;
    L_0x000d:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
        r1 = 0;
        if (r2 != r0) goto L_0x0073;
    L_0x0012:
        r0 = r4.getText();
        r2 = r0.trim();
        r0 = r2.length();
        if (r0 != 0) goto L_0x0021;
    L_0x0020:
        return r1;
    L_0x0021:
        r0 = 0;
        r1 = r2.charAt(r0);
        r0 = 45;
        if (r1 == r0) goto L_0x0051;
    L_0x002a:
        r0 = 73;
        if (r1 == r0) goto L_0x003e;
    L_0x002e:
        r0 = 78;
        if (r1 == r0) goto L_0x0033;
    L_0x0032:
        goto L_0x0062;
    L_0x0033:
        r0 = "NaN";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0062;
    L_0x003b:
        r0 = 2143289344; // 0x7fc00000 float:NaN double:1.058925634E-314;
        return r0;
    L_0x003e:
        r0 = "Infinity";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x004e;
    L_0x0046:
        r0 = "INF";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0062;
    L_0x004e:
        r0 = 2139095040; // 0x7f800000 float:Infinity double:1.0568533725E-314;
        return r0;
    L_0x0051:
        r0 = "-Infinity";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0070;
    L_0x0059:
        r0 = "-INF";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0062;
    L_0x0061:
        goto L_0x0070;
    L_0x0062:
        r0 = java.lang.Float.parseFloat(r2);	 Catch:{ IllegalArgumentException -> 0x0067 }
        return r0;	 Catch:{ IllegalArgumentException -> 0x0067 }
    L_0x0067:
        r1 = r3._valueClass;
        r0 = "not a valid float value";
        r0 = r5.weirdStringException(r2, r1, r0);
        throw r0;
    L_0x0070:
        r0 = -8388608; // 0xffffffffff800000 float:-Infinity double:NaN;
        return r0;
    L_0x0073:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
        if (r2 != r0) goto L_0x0078;
    L_0x0077:
        goto L_0x0020;
    L_0x0078:
        r0 = r3._valueClass;
        r0 = r5.mappingException(r0, r2);
        throw r0;
    L_0x007f:
        r0 = r4.getFloatValue();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseFloatPrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):float");
    }

    public final int _parseIntPrimitive(com.fasterxml.jackson.core.JsonParser r7, com.fasterxml.jackson.databind.DeserializationContext r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r1 = r7.getCurrentToken();
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
        if (r1 == r0) goto L_0x0085;
    L_0x0008:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
        if (r1 != r0) goto L_0x000d;
    L_0x000c:
        goto L_0x0085;
    L_0x000d:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
        r2 = 0;
        if (r1 != r0) goto L_0x0079;
    L_0x0012:
        r0 = r7.getText();
        r3 = r0.trim();
        r1 = r3.length();	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0 = 9;	 Catch:{ IllegalArgumentException -> 0x0070 }
        if (r1 <= r0) goto L_0x0068;	 Catch:{ IllegalArgumentException -> 0x0070 }
    L_0x0022:
        r4 = java.lang.Long.parseLong(r3);	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));	 Catch:{ IllegalArgumentException -> 0x0070 }
        if (r0 < 0) goto L_0x0036;	 Catch:{ IllegalArgumentException -> 0x0070 }
    L_0x002d:
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));	 Catch:{ IllegalArgumentException -> 0x0070 }
        if (r0 > 0) goto L_0x0036;	 Catch:{ IllegalArgumentException -> 0x0070 }
    L_0x0034:
        r0 = (int) r4;	 Catch:{ IllegalArgumentException -> 0x0070 }
        return r0;	 Catch:{ IllegalArgumentException -> 0x0070 }
    L_0x0036:
        r2 = r6._valueClass;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0 = "Overflow: numeric value (";	 Catch:{ IllegalArgumentException -> 0x0070 }
        r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x0070 }
        r1.append(r3);	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0 = ") out of range of int (";	 Catch:{ IllegalArgumentException -> 0x0070 }
        r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0 = " - ";	 Catch:{ IllegalArgumentException -> 0x0070 }
        r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0 = ")";	 Catch:{ IllegalArgumentException -> 0x0070 }
        r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0 = r8.weirdStringException(r3, r2, r0);	 Catch:{ IllegalArgumentException -> 0x0070 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0070 }
    L_0x0068:
        if (r1 != 0) goto L_0x006b;	 Catch:{ IllegalArgumentException -> 0x0070 }
    L_0x006a:
        return r2;	 Catch:{ IllegalArgumentException -> 0x0070 }
    L_0x006b:
        r0 = com.fasterxml.jackson.core.io.NumberInput.parseInt(r3);	 Catch:{ IllegalArgumentException -> 0x0070 }
        return r0;	 Catch:{ IllegalArgumentException -> 0x0070 }
    L_0x0070:
        r1 = r6._valueClass;
        r0 = "not a valid int value";
        r0 = r8.weirdStringException(r3, r1, r0);
        throw r0;
    L_0x0079:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
        if (r1 != r0) goto L_0x007e;
    L_0x007d:
        goto L_0x006a;
    L_0x007e:
        r0 = r6._valueClass;
        r0 = r8.mappingException(r0, r1);
        throw r0;
    L_0x0085:
        r0 = r7.getIntValue();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):int");
    }

    public final java.lang.Integer _parseInteger(com.fasterxml.jackson.core.JsonParser r6, com.fasterxml.jackson.databind.DeserializationContext r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r1 = r6.getCurrentToken();
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
        if (r1 == r0) goto L_0x0099;
    L_0x0008:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
        if (r1 != r0) goto L_0x000e;
    L_0x000c:
        goto L_0x0099;
    L_0x000e:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
        if (r1 != r0) goto L_0x0087;
    L_0x0012:
        r0 = r6.getText();
        r2 = r0.trim();
        r1 = r2.length();	 Catch:{ IllegalArgumentException -> 0x007e }
        r0 = 9;	 Catch:{ IllegalArgumentException -> 0x007e }
        if (r1 <= r0) goto L_0x006c;	 Catch:{ IllegalArgumentException -> 0x007e }
    L_0x0022:
        r3 = java.lang.Long.parseLong(r2);	 Catch:{ IllegalArgumentException -> 0x007e }
        r0 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;	 Catch:{ IllegalArgumentException -> 0x007e }
        r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1));	 Catch:{ IllegalArgumentException -> 0x007e }
        if (r0 < 0) goto L_0x003a;	 Catch:{ IllegalArgumentException -> 0x007e }
    L_0x002d:
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;	 Catch:{ IllegalArgumentException -> 0x007e }
        r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1));	 Catch:{ IllegalArgumentException -> 0x007e }
        if (r0 > 0) goto L_0x003a;	 Catch:{ IllegalArgumentException -> 0x007e }
    L_0x0034:
        r0 = (int) r3;	 Catch:{ IllegalArgumentException -> 0x007e }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ IllegalArgumentException -> 0x007e }
        return r0;	 Catch:{ IllegalArgumentException -> 0x007e }
    L_0x003a:
        r3 = r5._valueClass;	 Catch:{ IllegalArgumentException -> 0x007e }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x007e }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x007e }
        r0 = "Overflow: numeric value (";	 Catch:{ IllegalArgumentException -> 0x007e }
        r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x007e }
        r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x007e }
        r0 = ") out of range of Integer (";	 Catch:{ IllegalArgumentException -> 0x007e }
        r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x007e }
        r0 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;	 Catch:{ IllegalArgumentException -> 0x007e }
        r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x007e }
        r0 = " - ";	 Catch:{ IllegalArgumentException -> 0x007e }
        r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x007e }
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;	 Catch:{ IllegalArgumentException -> 0x007e }
        r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x007e }
        r0 = ")";	 Catch:{ IllegalArgumentException -> 0x007e }
        r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x007e }
        r0 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x007e }
        r0 = r7.weirdStringException(r2, r3, r0);	 Catch:{ IllegalArgumentException -> 0x007e }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007e }
    L_0x006c:
        if (r1 != 0) goto L_0x0075;	 Catch:{ IllegalArgumentException -> 0x007e }
    L_0x006e:
        r0 = r5.getEmptyValue();	 Catch:{ IllegalArgumentException -> 0x007e }
        r0 = (java.lang.Integer) r0;	 Catch:{ IllegalArgumentException -> 0x007e }
        return r0;	 Catch:{ IllegalArgumentException -> 0x007e }
    L_0x0075:
        r0 = com.fasterxml.jackson.core.io.NumberInput.parseInt(r2);	 Catch:{ IllegalArgumentException -> 0x007e }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ IllegalArgumentException -> 0x007e }
        return r0;	 Catch:{ IllegalArgumentException -> 0x007e }
    L_0x007e:
        r1 = r5._valueClass;
        r0 = "not a valid Integer value";
        r0 = r7.weirdStringException(r2, r1, r0);
        throw r0;
    L_0x0087:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
        if (r1 != r0) goto L_0x0092;
    L_0x008b:
        r0 = r5.getNullValue();
        r0 = (java.lang.Integer) r0;
        return r0;
    L_0x0092:
        r0 = r5._valueClass;
        r0 = r7.mappingException(r0, r1);
        throw r0;
    L_0x0099:
        r0 = r6.getIntValue();
        r0 = java.lang.Integer.valueOf(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseInteger(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):java.lang.Integer");
    }

    public final java.lang.Long _parseLong(com.fasterxml.jackson.core.JsonParser r4, com.fasterxml.jackson.databind.DeserializationContext r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r1 = r4.getCurrentToken();
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
        if (r1 == r0) goto L_0x004a;
    L_0x0008:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
        if (r1 != r0) goto L_0x000d;
    L_0x000c:
        goto L_0x004a;
    L_0x000d:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
        if (r1 != r0) goto L_0x0038;
    L_0x0011:
        r0 = r4.getText();
        r2 = r0.trim();
        r0 = r2.length();
        if (r0 != 0) goto L_0x0026;
    L_0x001f:
        r0 = r3.getEmptyValue();
        r0 = (java.lang.Long) r0;
        return r0;
    L_0x0026:
        r0 = com.fasterxml.jackson.core.io.NumberInput.parseLong(r2);	 Catch:{ IllegalArgumentException -> 0x002f }
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ IllegalArgumentException -> 0x002f }
        return r0;	 Catch:{ IllegalArgumentException -> 0x002f }
    L_0x002f:
        r1 = r3._valueClass;
        r0 = "not a valid Long value";
        r0 = r5.weirdStringException(r2, r1, r0);
        throw r0;
    L_0x0038:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
        if (r1 != r0) goto L_0x0043;
    L_0x003c:
        r0 = r3.getNullValue();
        r0 = (java.lang.Long) r0;
        return r0;
    L_0x0043:
        r0 = r3._valueClass;
        r0 = r5.mappingException(r0, r1);
        throw r0;
    L_0x004a:
        r0 = r4.getLongValue();
        r0 = java.lang.Long.valueOf(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLong(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):java.lang.Long");
    }

    public final long _parseLongPrimitive(com.fasterxml.jackson.core.JsonParser r6, com.fasterxml.jackson.databind.DeserializationContext r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r1 = r6.getCurrentToken();
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
        if (r1 == r0) goto L_0x003c;
    L_0x0008:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
        if (r1 != r0) goto L_0x000d;
    L_0x000c:
        goto L_0x003c;
    L_0x000d:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
        r3 = 0;
        if (r1 != r0) goto L_0x0030;
    L_0x0013:
        r0 = r6.getText();
        r2 = r0.trim();
        r0 = r2.length();
        if (r0 != 0) goto L_0x0022;
    L_0x0021:
        return r3;
    L_0x0022:
        r0 = com.fasterxml.jackson.core.io.NumberInput.parseLong(r2);	 Catch:{ IllegalArgumentException -> 0x0027 }
        return r0;	 Catch:{ IllegalArgumentException -> 0x0027 }
    L_0x0027:
        r1 = r5._valueClass;
        r0 = "not a valid long value";
        r0 = r7.weirdStringException(r2, r1, r0);
        throw r0;
    L_0x0030:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
        if (r1 != r0) goto L_0x0035;
    L_0x0034:
        goto L_0x0021;
    L_0x0035:
        r0 = r5._valueClass;
        r0 = r7.mappingException(r0, r1);
        throw r0;
    L_0x003c:
        r0 = r6.getLongValue();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):long");
    }

    public java.lang.Short _parseShort(com.fasterxml.jackson.core.JsonParser r4, com.fasterxml.jackson.databind.DeserializationContext r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r1 = r4.getCurrentToken();
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
        if (r1 == r0) goto L_0x005c;
    L_0x0008:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
        if (r1 != r0) goto L_0x000d;
    L_0x000c:
        goto L_0x005c;
    L_0x000d:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
        if (r1 != r0) goto L_0x004a;
    L_0x0011:
        r0 = r4.getText();
        r2 = r0.trim();
        r0 = r2.length();	 Catch:{ IllegalArgumentException -> 0x0041 }
        if (r0 != 0) goto L_0x0026;	 Catch:{ IllegalArgumentException -> 0x0041 }
    L_0x001f:
        r0 = r3.getEmptyValue();	 Catch:{ IllegalArgumentException -> 0x0041 }
        r0 = (java.lang.Short) r0;	 Catch:{ IllegalArgumentException -> 0x0041 }
        return r0;	 Catch:{ IllegalArgumentException -> 0x0041 }
    L_0x0026:
        r1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(r2);	 Catch:{ IllegalArgumentException -> 0x0041 }
        r0 = -32768; // 0xffffffffffff8000 float:NaN double:NaN;	 Catch:{ IllegalArgumentException -> 0x0041 }
        if (r1 < r0) goto L_0x0038;	 Catch:{ IllegalArgumentException -> 0x0041 }
    L_0x002e:
        r0 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;	 Catch:{ IllegalArgumentException -> 0x0041 }
        if (r1 > r0) goto L_0x0038;	 Catch:{ IllegalArgumentException -> 0x0041 }
    L_0x0032:
        r0 = (short) r1;
        r0 = java.lang.Short.valueOf(r0);
        return r0;
    L_0x0038:
        r1 = r3._valueClass;
        r0 = "overflow, value can not be represented as 16-bit value";
        r0 = r5.weirdStringException(r2, r1, r0);
        throw r0;
    L_0x0041:
        r1 = r3._valueClass;
        r0 = "not a valid Short value";
        r0 = r5.weirdStringException(r2, r1, r0);
        throw r0;
    L_0x004a:
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
        if (r1 != r0) goto L_0x0055;
    L_0x004e:
        r0 = r3.getNullValue();
        r0 = (java.lang.Short) r0;
        return r0;
    L_0x0055:
        r0 = r3._valueClass;
        r0 = r5.mappingException(r0, r1);
        throw r0;
    L_0x005c:
        r0 = r4.getShortValue();
        r0 = java.lang.Short.valueOf(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShort(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):java.lang.Short");
    }

    public final short _parseShortPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) {
        int _parseIntPrimitive = _parseIntPrimitive(jsonParser, deserializationContext);
        if (_parseIntPrimitive >= -32768 && _parseIntPrimitive <= 32767) {
            return (short) _parseIntPrimitive;
        }
        throw deserializationContext.weirdStringException(String.valueOf(_parseIntPrimitive), this._valueClass, "overflow, value can not be represented as 16-bit value");
    }

    public final String _parseString(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String valueAsString = jsonParser.getValueAsString();
        if (valueAsString != null) {
            return valueAsString;
        }
        throw deserializationContext.mappingException(String.class, jsonParser.getCurrentToken());
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public JsonDeserializer findConvertingContentDeserializer(DeserializationContext deserializationContext, BeanProperty beanProperty, JsonDeserializer jsonDeserializer) {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (!(annotationIntrospector == null || beanProperty == null)) {
            Object findDeserializationContentConverter = annotationIntrospector.findDeserializationContentConverter(beanProperty.getMember());
            if (findDeserializationContentConverter != null) {
                Converter converterInstance = deserializationContext.converterInstance(beanProperty.getMember(), findDeserializationContentConverter);
                JavaType inputType = converterInstance.getInputType(deserializationContext.getTypeFactory());
                if (jsonDeserializer == null) {
                    jsonDeserializer = deserializationContext.findContextualValueDeserializer(inputType, beanProperty);
                }
                return new StdDelegatingDeserializer(converterInstance, inputType, jsonDeserializer);
            }
        }
        return jsonDeserializer;
    }

    public JsonDeserializer findDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanProperty beanProperty) {
        return deserializationContext.findContextualValueDeserializer(javaType, beanProperty);
    }

    public Class getValueClass() {
        return this._valueClass;
    }

    public void handleUnknownProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) {
        if (obj == null) {
            obj = getValueClass();
        }
        if (!deserializationContext.handleUnknownProperty(jsonParser, this, obj, str)) {
            deserializationContext.reportUnknownProperty(obj, str, this);
            jsonParser.skipChildren();
        }
    }

    public boolean isDefaultDeserializer(JsonDeserializer jsonDeserializer) {
        return (jsonDeserializer == null || jsonDeserializer.getClass().getAnnotation(JacksonStdImpl.class) == null) ? false : true;
    }

    public boolean isDefaultKeyDeserializer(KeyDeserializer keyDeserializer) {
        return (keyDeserializer == null || keyDeserializer.getClass().getAnnotation(JacksonStdImpl.class) == null) ? false : true;
    }

    public static final double parseDouble(String str) {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_VALUE;
        }
        return Double.parseDouble(str);
    }
}
