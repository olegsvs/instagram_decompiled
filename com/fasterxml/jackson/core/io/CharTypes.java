package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.util.Arrays;

public final class CharTypes {
    private static final byte[] HEX_BYTES;
    private static final char[] HEX_CHARS;
    public static final int[] sHexValues;
    public static final int[] sInputCodes;
    public static final int[] sInputCodesComment = new int[256];
    public static final int[] sInputCodesJsNames;
    public static final int[] sInputCodesUtf8;
    public static final int[] sInputCodesUtf8JsNames;
    public static final int[] sOutputEscapes128;

    static {
        int i;
        int i2;
        Object obj;
        int i3;
        char[] toCharArray = "0123456789ABCDEF".toCharArray();
        HEX_CHARS = toCharArray;
        int length = toCharArray.length;
        HEX_BYTES = new byte[length];
        int i4 = 0;
        for (i = 0; i < length; i++) {
            HEX_BYTES[i] = (byte) HEX_CHARS[i];
        }
        Object obj2 = new int[256];
        for (i2 = 0; i2 < 32; i2++) {
            obj2[i2] = -1;
        }
        obj2[34] = 1;
        obj2[92] = 1;
        sInputCodes = obj2;
        Object obj3 = new int[obj2.length];
        System.arraycopy(obj2, 0, obj3, 0, obj2.length);
        for (i = 128; i < 256; i++) {
            obj = (i & 224) == 192 ? 2 : (i & 240) == 224 ? 3 : (i & 248) == 240 ? 4 : -1;
            obj3[i] = obj;
        }
        sInputCodesUtf8 = obj3;
        int[] iArr = new int[256];
        Arrays.fill(iArr, -1);
        for (i3 = 33; i3 < 256; i3++) {
            if (Character.isJavaIdentifierPart((char) i3)) {
                iArr[i3] = 0;
            }
        }
        iArr[64] = 0;
        iArr[35] = 0;
        iArr[42] = 0;
        iArr[45] = 0;
        iArr[43] = 0;
        sInputCodesJsNames = iArr;
        Object obj4 = new int[256];
        obj2 = sInputCodesJsNames;
        System.arraycopy(obj2, 0, obj4, 0, obj2.length);
        Arrays.fill(obj4, 128, 128, 0);
        sInputCodesUtf8JsNames = obj4;
        obj = sInputCodesUtf8;
        obj2 = sInputCodesComment;
        System.arraycopy(obj, 128, obj2, 128, 128);
        Arrays.fill(obj2, 0, 32, -1);
        obj2[9] = null;
        obj2[10] = 10;
        obj2[13] = 13;
        obj2[42] = 42;
        iArr = new int[128];
        for (i2 = 0; i2 < 32; i2++) {
            iArr[i2] = -1;
        }
        iArr[34] = 34;
        iArr[92] = 92;
        iArr[8] = 98;
        iArr[9] = ParserMinimalBase.INT_t;
        iArr[12] = ParserMinimalBase.INT_f;
        iArr[10] = ParserMinimalBase.INT_n;
        iArr[13] = ParserMinimalBase.INT_r;
        sOutputEscapes128 = iArr;
        int[] iArr2 = new int[128];
        sHexValues = iArr2;
        Arrays.fill(iArr2, -1);
        for (i = 0; i < 10; i++) {
            sHexValues[i + 48] = i;
        }
        while (i4 < 6) {
            iArr = sHexValues;
            i3 = i4 + 10;
            iArr[i4 + 97] = i3;
            iArr[i4 + 65] = i3;
            i4++;
        }
    }

    private CharTypes() {
    }

    public static void appendQuoted(StringBuilder stringBuilder, String str) {
        int[] iArr = sOutputEscapes128;
        char length = iArr.length;
        int length2 = str.length();
        for (int i = 0; i < length2; i++) {
            char charAt = str.charAt(i);
            if (charAt < length) {
                if (iArr[charAt] != 0) {
                    stringBuilder.append('\\');
                    int i2 = iArr[charAt];
                    if (i2 < 0) {
                        stringBuilder.append('u');
                        stringBuilder.append('0');
                        stringBuilder.append('0');
                        char[] cArr = HEX_CHARS;
                        stringBuilder.append(cArr[charAt >> 4]);
                        stringBuilder.append(cArr[charAt & 15]);
                    } else {
                        stringBuilder.append((char) i2);
                    }
                }
            }
            stringBuilder.append(charAt);
        }
    }

    public static int charToHex(int i) {
        return i > 127 ? -1 : sHexValues[i];
    }

    public static byte[] copyHexBytes() {
        return (byte[]) HEX_BYTES.clone();
    }

    public static char[] copyHexChars() {
        return (char[]) HEX_CHARS.clone();
    }

    public static int[] get7BitOutputEscapes() {
        return sOutputEscapes128;
    }

    public static int[] getInputCodeComment() {
        return sInputCodesComment;
    }

    public static int[] getInputCodeLatin1() {
        return sInputCodes;
    }

    public static int[] getInputCodeLatin1JsNames() {
        return sInputCodesJsNames;
    }

    public static int[] getInputCodeUtf8() {
        return sInputCodesUtf8;
    }

    public static int[] getInputCodeUtf8JsNames() {
        return sInputCodesUtf8JsNames;
    }
}
