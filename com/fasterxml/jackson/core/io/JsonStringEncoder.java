package com.fasterxml.jackson.core.io;

import com.facebook.common.dextricks.DexStore;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.lang.ref.SoftReference;

public final class JsonStringEncoder {
    private static final byte[] HEX_BYTES = CharTypes.copyHexBytes();
    private static final char[] HEX_CHARS = CharTypes.copyHexChars();
    public static final ThreadLocal _threadEncoder = new ThreadLocal();
    public ByteArrayBuilder _byteBuilder;
    public final char[] _quoteBuffer;
    public TextBuffer _textBuffer;

    public JsonStringEncoder() {
        char[] cArr = new char[6];
        this._quoteBuffer = cArr;
        cArr[0] = '\\';
        cArr[2] = '0';
        cArr[3] = '0';
    }

    private static int _appendByteEscape(int i, int i2, ByteArrayBuilder byteArrayBuilder, int i3) {
        byteArrayBuilder.setCurrentSegmentLength(i3);
        byteArrayBuilder.append(92);
        if (i2 < 0) {
            byte[] bArr;
            byteArrayBuilder.append(ParserMinimalBase.INT_u);
            if (i > 255) {
                int i4 = i >> 8;
                bArr = HEX_BYTES;
                byteArrayBuilder.append(bArr[i4 >> 4]);
                byteArrayBuilder.append(bArr[i4 & 15]);
                i &= 255;
            } else {
                byteArrayBuilder.append(48);
                byteArrayBuilder.append(48);
            }
            bArr = HEX_BYTES;
            byteArrayBuilder.append(bArr[i >> 4]);
            byteArrayBuilder.append(bArr[i & 15]);
        } else {
            byteArrayBuilder.append((byte) i2);
        }
        return byteArrayBuilder.getCurrentSegmentLength();
    }

    private static int _appendNamedEscape(int i, char[] cArr) {
        cArr[1] = (char) i;
        return 2;
    }

    private static int _appendNumericEscape(int i, char[] cArr) {
        cArr[1] = 'u';
        char[] cArr2 = HEX_CHARS;
        cArr[4] = cArr2[i >> 4];
        cArr[5] = cArr2[i & 15];
        return 6;
    }

    public static int _convertSurrogate(int i, int i2) {
        if (i2 >= 56320 && i2 <= 57343) {
            return (((i - 55296) << 10) + 65536) + (i2 - 56320);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Broken surrogate pair: first char 0x");
        stringBuilder.append(Integer.toHexString(i));
        stringBuilder.append(", second 0x");
        stringBuilder.append(Integer.toHexString(i2));
        stringBuilder.append("; illegal combination");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static void _illegalSurrogate(int i) {
        throw new IllegalArgumentException(UTF8Writer.illegalSurrogateDesc(i));
    }

    public final byte[] encodeAsUTF8(String str) {
        ByteArrayBuilder byteArrayBuilder = this._byteBuilder;
        if (byteArrayBuilder == null) {
            byteArrayBuilder = new ByteArrayBuilder(null);
            this._byteBuilder = byteArrayBuilder;
        }
        int length = str.length();
        byte[] resetAndGetFirstSegment = byteArrayBuilder.resetAndGetFirstSegment();
        int length2 = resetAndGetFirstSegment.length;
        int i = 0;
        int i2;
        loop0:
        for (int i3 = 0; i3 < length; i3 = i2) {
            int i4;
            i2 = i3 + 1;
            int charAt = str.charAt(i3);
            while (charAt <= 127) {
                if (i >= length2) {
                    resetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                    length2 = resetAndGetFirstSegment.length;
                    i = 0;
                }
                i4 = i + 1;
                resetAndGetFirstSegment[i] = (byte) charAt;
                if (i2 >= length) {
                    i = i4;
                    break loop0;
                }
                i3 = i2 + 1;
                charAt = str.charAt(i2);
                i2 = i3;
                i = i4;
            }
            if (i >= length2) {
                resetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                length2 = resetAndGetFirstSegment.length;
                i = 0;
            }
            if (charAt < DexStore.LOAD_RESULT_OATMEAL_QUICKEN_ATTEMPTED) {
                i4 = i + 1;
                resetAndGetFirstSegment[i] = (byte) ((charAt >> 6) | 192);
            } else {
                int i5;
                if (charAt >= 55296) {
                    if (charAt <= 57343) {
                        if (charAt > 56319) {
                            _illegalSurrogate(charAt);
                        }
                        if (i2 >= length) {
                            _illegalSurrogate(charAt);
                        }
                        i5 = i2 + 1;
                        charAt = _convertSurrogate(charAt, str.charAt(i2));
                        if (charAt > 1114111) {
                            _illegalSurrogate(charAt);
                        }
                        i2 = i + 1;
                        resetAndGetFirstSegment[i] = (byte) ((charAt >> 18) | 240);
                        if (i2 >= length2) {
                            resetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                            length2 = resetAndGetFirstSegment.length;
                            i2 = 0;
                        }
                        i = i2 + 1;
                        resetAndGetFirstSegment[i2] = (byte) (((charAt >> 12) & 63) | 128);
                        if (i >= length2) {
                            resetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                            length2 = resetAndGetFirstSegment.length;
                            i = 0;
                        }
                        i4 = i + 1;
                        resetAndGetFirstSegment[i] = (byte) (((charAt >> 6) & 63) | 128);
                        i2 = i5;
                    }
                }
                i5 = i + 1;
                resetAndGetFirstSegment[i] = (byte) ((charAt >> 12) | 224);
                if (i5 >= length2) {
                    resetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                    length2 = resetAndGetFirstSegment.length;
                    i5 = 0;
                }
                i4 = i5 + 1;
                resetAndGetFirstSegment[i5] = (byte) (((charAt >> 6) & 63) | 128);
            }
            if (i4 >= length2) {
                resetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                length2 = resetAndGetFirstSegment.length;
                i4 = 0;
            }
            i = i4 + 1;
            resetAndGetFirstSegment[i4] = (byte) ((charAt & 63) | 128);
        }
        return this._byteBuilder.completeAndCoalesce(i);
    }

    public static JsonStringEncoder getInstance() {
        JsonStringEncoder jsonStringEncoder;
        SoftReference softReference = (SoftReference) _threadEncoder.get();
        if (softReference == null) {
            jsonStringEncoder = null;
        } else {
            jsonStringEncoder = (JsonStringEncoder) softReference.get();
        }
        if (jsonStringEncoder != null) {
            return jsonStringEncoder;
        }
        jsonStringEncoder = new JsonStringEncoder();
        _threadEncoder.set(new SoftReference(jsonStringEncoder));
        return jsonStringEncoder;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final char[] quoteAsString(java.lang.String r12) {
        /*
        r11 = this;
        r7 = r11._textBuffer;
        if (r7 != 0) goto L_0x000c;
    L_0x0004:
        r7 = new com.fasterxml.jackson.core.util.TextBuffer;
        r0 = 0;
        r7.<init>(r0);
        r11._textBuffer = r7;
    L_0x000c:
        r6 = r7.emptyAndGetCurrentSegment();
        r5 = com.fasterxml.jackson.core.io.CharTypes.get7BitOutputEscapes();
        r4 = r5.length;
        r3 = r12.length();
        r2 = 0;
        r9 = 0;
        r8 = 0;
    L_0x001c:
        if (r9 >= r3) goto L_0x0075;
    L_0x001e:
        r1 = r12.charAt(r9);
        if (r1 >= r4) goto L_0x0061;
    L_0x0024:
        r0 = r5[r1];
        if (r0 == 0) goto L_0x0061;
    L_0x0028:
        r10 = r9 + 1;
        r9 = r12.charAt(r9);
        r1 = r5[r9];
        if (r1 >= 0) goto L_0x0039;
    L_0x0032:
        r0 = r11._quoteBuffer;
        r9 = _appendNumericEscape(r9, r0);
        goto L_0x003f;
    L_0x0039:
        r0 = r11._quoteBuffer;
        r9 = _appendNamedEscape(r1, r0);
    L_0x003f:
        r1 = r8 + r9;
        r0 = r6.length;
        if (r1 <= r0) goto L_0x0059;
    L_0x0044:
        r1 = r6.length;
        r1 = r1 - r8;
        if (r1 <= 0) goto L_0x004d;
    L_0x0048:
        r0 = r11._quoteBuffer;
        java.lang.System.arraycopy(r0, r2, r6, r8, r1);
    L_0x004d:
        r6 = r7.finishCurrentSegment();
        r9 = r9 - r1;
        r0 = r11._quoteBuffer;
        java.lang.System.arraycopy(r0, r1, r6, r2, r9);
        r8 = r9;
        goto L_0x005f;
    L_0x0059:
        r0 = r11._quoteBuffer;
        java.lang.System.arraycopy(r0, r2, r6, r8, r9);
        r8 = r1;
    L_0x005f:
        r9 = r10;
        goto L_0x001c;
    L_0x0061:
        r0 = r6.length;
        if (r8 < r0) goto L_0x0069;
    L_0x0064:
        r6 = r7.finishCurrentSegment();
        r8 = 0;
    L_0x0069:
        r0 = r8 + 1;
        r6[r8] = r1;
        r9 = r9 + 1;
        if (r9 < r3) goto L_0x0073;
    L_0x0071:
        r8 = r0;
        goto L_0x0075;
    L_0x0073:
        r8 = r0;
        goto L_0x001e;
    L_0x0075:
        r7.setCurrentLength(r8);
        r0 = r7.contentsAsArray();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.JsonStringEncoder.quoteAsString(java.lang.String):char[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] quoteAsUTF8(java.lang.String r11) {
        /*
        r10 = this;
        r5 = r10._byteBuilder;
        if (r5 != 0) goto L_0x000c;
    L_0x0004:
        r5 = new com.fasterxml.jackson.core.util.ByteArrayBuilder;
        r0 = 0;
        r5.<init>(r0);
        r10._byteBuilder = r5;
    L_0x000c:
        r4 = r11.length();
        r3 = r5.resetAndGetFirstSegment();
        r8 = 0;
        r1 = 0;
    L_0x0016:
        if (r8 >= r4) goto L_0x00fc;
    L_0x0018:
        r9 = com.fasterxml.jackson.core.io.CharTypes.get7BitOutputEscapes();
    L_0x001c:
        r7 = r11.charAt(r8);
        r6 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        if (r7 > r6) goto L_0x003f;
    L_0x0024:
        r0 = r9[r7];
        if (r0 == 0) goto L_0x0029;
    L_0x0028:
        goto L_0x003f;
    L_0x0029:
        r0 = r3.length;
        if (r1 < r0) goto L_0x0031;
    L_0x002c:
        r3 = r5.finishCurrentSegment();
        r1 = 0;
    L_0x0031:
        r2 = r1 + 1;
        r0 = (byte) r7;
        r3[r1] = r0;
        r8 = r8 + 1;
        if (r8 < r4) goto L_0x003d;
    L_0x003a:
        r1 = r2;
        goto L_0x00fc;
    L_0x003d:
        r1 = r2;
        goto L_0x001c;
    L_0x003f:
        r0 = r3.length;
        if (r1 < r0) goto L_0x0047;
    L_0x0042:
        r3 = r5.finishCurrentSegment();
        r1 = 0;
    L_0x0047:
        r2 = r8 + 1;
        r8 = r11.charAt(r8);
        if (r8 > r6) goto L_0x005b;
    L_0x004f:
        r0 = r9[r8];
        r1 = _appendByteEscape(r8, r0, r5, r1);
        r3 = r5.getCurrentSegment();
    L_0x0059:
        r8 = r2;
        goto L_0x0016;
    L_0x005b:
        r0 = 2047; // 0x7ff float:2.868E-42 double:1.0114E-320;
        if (r8 > r0) goto L_0x006e;
    L_0x005f:
        r7 = r1 + 1;
        r0 = r8 >> 6;
        r0 = r0 | 192;
        r0 = (byte) r0;
        r3[r1] = r0;
        r0 = r8 & 63;
        r6 = r0 | 128;
        goto L_0x00ed;
    L_0x006e:
        r0 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r8 < r0) goto L_0x00cd;
    L_0x0073:
        r0 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
        if (r8 <= r0) goto L_0x0079;
    L_0x0078:
        goto L_0x00cd;
    L_0x0079:
        r0 = 56319; // 0xdbff float:7.892E-41 double:2.78253E-319;
        if (r8 <= r0) goto L_0x0081;
    L_0x007e:
        _illegalSurrogate(r8);
    L_0x0081:
        if (r2 < r4) goto L_0x0086;
    L_0x0083:
        _illegalSurrogate(r8);
    L_0x0086:
        r9 = r2 + 1;
        r0 = r11.charAt(r2);
        r2 = _convertSurrogate(r8, r0);
        r0 = 1114111; // 0x10ffff float:1.561202E-39 double:5.50444E-318;
        if (r2 <= r0) goto L_0x0098;
    L_0x0095:
        _illegalSurrogate(r2);
    L_0x0098:
        r6 = r1 + 1;
        r0 = r2 >> 18;
        r0 = r0 | 240;
        r0 = (byte) r0;
        r3[r1] = r0;
        r0 = r3.length;
        if (r6 < r0) goto L_0x00a9;
    L_0x00a4:
        r3 = r5.finishCurrentSegment();
        r6 = 0;
    L_0x00a9:
        r1 = r6 + 1;
        r0 = r2 >> 12;
        r0 = r0 & 63;
        r0 = r0 | 128;
        r0 = (byte) r0;
        r3[r6] = r0;
        r0 = r3.length;
        if (r1 < r0) goto L_0x00bc;
    L_0x00b7:
        r3 = r5.finishCurrentSegment();
        r1 = 0;
    L_0x00bc:
        r7 = r1 + 1;
        r0 = r2 >> 6;
        r0 = r0 & 63;
        r0 = r0 | 128;
        r0 = (byte) r0;
        r3[r1] = r0;
        r0 = r2 & 63;
        r6 = r0 | 128;
        r2 = r9;
        goto L_0x00ed;
    L_0x00cd:
        r6 = r1 + 1;
        r0 = r8 >> 12;
        r0 = r0 | 224;
        r0 = (byte) r0;
        r3[r1] = r0;
        r0 = r3.length;
        if (r6 < r0) goto L_0x00de;
    L_0x00d9:
        r3 = r5.finishCurrentSegment();
        r6 = 0;
    L_0x00de:
        r7 = r6 + 1;
        r0 = r8 >> 6;
        r0 = r0 & 63;
        r0 = r0 | 128;
        r0 = (byte) r0;
        r3[r6] = r0;
        r0 = r8 & 63;
        r6 = r0 | 128;
    L_0x00ed:
        r0 = r3.length;
        if (r7 < r0) goto L_0x00f5;
    L_0x00f0:
        r3 = r5.finishCurrentSegment();
        r7 = 0;
    L_0x00f5:
        r1 = r7 + 1;
        r0 = (byte) r6;
        r3[r7] = r0;
        goto L_0x0059;
    L_0x00fc:
        r0 = r10._byteBuilder;
        r0 = r0.completeAndCoalesce(r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.JsonStringEncoder.quoteAsUTF8(java.lang.String):byte[]");
    }
}
