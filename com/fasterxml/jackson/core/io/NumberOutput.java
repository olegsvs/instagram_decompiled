package com.fasterxml.jackson.core.io;

import com.facebook.forker.Process;
import com.fasterxml.jackson.databind.JsonMappingException;

public final class NumberOutput {
    private static int BILLION = 1000000000;
    public static final char[] FULL_TRIPLETS = new char[4000];
    public static final byte[] FULL_TRIPLETS_B = new byte[4000];
    public static final char[] LEADING_TRIPLETS = new char[4000];
    private static long MAX_INT_AS_LONG = 2147483647L;
    private static int MILLION = 1000000;
    private static long MIN_INT_AS_LONG = -2147483648L;
    public static final String SMALLEST_LONG = "-9223372036854775808";
    private static long TEN_BILLION_L = 10000000000L;
    private static long THOUSAND_L = 1000;
    public static final String[] sSmallIntStrs = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    public static final String[] sSmallIntStrs2 = new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};

    static {
        int i = 0;
        int i2 = 0;
        while (i < 10) {
            char c = (char) (i + 48);
            char c2 = i == 0 ? '\u0000' : c;
            int i3 = 0;
            while (i3 < 10) {
                char c3 = (char) (i3 + 48);
                char c4 = (i == 0 && i3 == 0) ? '\u0000' : c3;
                for (int i4 = 0; i4 < 10; i4++) {
                    char c5 = (char) (i4 + 48);
                    char[] cArr = LEADING_TRIPLETS;
                    cArr[i2] = c2;
                    int i5 = i2 + 1;
                    cArr[i5] = c4;
                    int i6 = i2 + 2;
                    cArr[i6] = c5;
                    cArr = FULL_TRIPLETS;
                    cArr[i2] = c;
                    cArr[i5] = c3;
                    cArr[i6] = c5;
                    i2 += 4;
                }
                i3++;
            }
            i++;
        }
        for (i5 = 0; i5 < 4000; i5++) {
            FULL_TRIPLETS_B[i5] = (byte) FULL_TRIPLETS[i5];
        }
    }

    private static int calcLongStrLength(long j) {
        int i = 10;
        for (long j2 = TEN_BILLION_L; j >= j2; j2 = (j2 << 1) + (j2 << 3)) {
            if (i == 19) {
                break;
            }
            i++;
        }
        return i;
    }

    private static int outputFullTriplet(int i, byte[] bArr, int i2) {
        int i3 = i << 2;
        i = i2 + 1;
        byte[] bArr2 = FULL_TRIPLETS_B;
        int i4 = i3 + 1;
        bArr[i2] = bArr2[i3];
        int i5 = i + 1;
        int i6 = i4 + 1;
        bArr[i] = bArr2[i4];
        i4 = i5 + 1;
        bArr[i5] = bArr2[i6];
        return i4;
    }

    private static int outputFullTriplet(int i, char[] cArr, int i2) {
        int i3 = i << 2;
        i = i2 + 1;
        char[] cArr2 = FULL_TRIPLETS;
        int i4 = i3 + 1;
        cArr[i2] = cArr2[i3];
        int i5 = i + 1;
        int i6 = i4 + 1;
        cArr[i] = cArr2[i4];
        i4 = i5 + 1;
        cArr[i5] = cArr2[i6];
        return i4;
    }

    public static int outputInt(int i, byte[] bArr, int i2) {
        if (i < 0) {
            if (i == Process.WAIT_RESULT_TIMEOUT) {
                return outputLong((long) i, bArr, i2);
            }
            int i3 = i2 + 1;
            bArr[i2] = (byte) 45;
            i = -i;
            i2 = i3;
        }
        if (i < MILLION) {
            if (i >= JsonMappingException.MAX_REFS_TO_LIST) {
                i3 = i / JsonMappingException.MAX_REFS_TO_LIST;
                i3 = outputFullTriplet(i - (i3 * JsonMappingException.MAX_REFS_TO_LIST), bArr, outputLeadingTriplet(i3, bArr, i2));
            } else if (i < 10) {
                i3 = i2 + 1;
                bArr[i2] = (byte) (i + 48);
            } else {
                i3 = outputLeadingTriplet(i, bArr, i2);
            }
            return i3;
        }
        int i4;
        int i5;
        Object obj = i >= BILLION ? 1 : null;
        if (obj != null) {
            i4 = BILLION;
            i -= i4;
            if (i >= i4) {
                i -= i4;
                i5 = i2 + 1;
                bArr[i2] = (byte) 50;
            } else {
                i5 = i2 + 1;
                bArr[i2] = (byte) 49;
            }
        } else {
            i5 = i2;
        }
        int i6 = i / JsonMappingException.MAX_REFS_TO_LIST;
        i -= i6 * JsonMappingException.MAX_REFS_TO_LIST;
        i3 = i6 / JsonMappingException.MAX_REFS_TO_LIST;
        i6 -= i3 * JsonMappingException.MAX_REFS_TO_LIST;
        if (obj != null) {
            i4 = outputFullTriplet(i3, bArr, i5);
        } else {
            i4 = outputLeadingTriplet(i3, bArr, i5);
        }
        return outputFullTriplet(i, bArr, outputFullTriplet(i6, bArr, i4));
    }

    public static int outputInt(int i, char[] cArr, int i2) {
        if (i < 0) {
            if (i == Process.WAIT_RESULT_TIMEOUT) {
                return outputLong((long) i, cArr, i2);
            }
            int i3 = i2 + 1;
            cArr[i2] = '-';
            i = -i;
            i2 = i3;
        }
        if (i < MILLION) {
            if (i >= JsonMappingException.MAX_REFS_TO_LIST) {
                i3 = i / JsonMappingException.MAX_REFS_TO_LIST;
                i3 = outputFullTriplet(i - (i3 * JsonMappingException.MAX_REFS_TO_LIST), cArr, outputLeadingTriplet(i3, cArr, i2));
            } else if (i < 10) {
                i3 = i2 + 1;
                cArr[i2] = (char) (i + 48);
            } else {
                i3 = outputLeadingTriplet(i, cArr, i2);
            }
            return i3;
        }
        int i4;
        int i5;
        Object obj = i >= BILLION ? 1 : null;
        if (obj != null) {
            i4 = BILLION;
            i -= i4;
            if (i >= i4) {
                i -= i4;
                i5 = i2 + 1;
                cArr[i2] = '2';
            } else {
                i5 = i2 + 1;
                cArr[i2] = '1';
            }
        } else {
            i5 = i2;
        }
        int i6 = i / JsonMappingException.MAX_REFS_TO_LIST;
        i -= i6 * JsonMappingException.MAX_REFS_TO_LIST;
        i3 = i6 / JsonMappingException.MAX_REFS_TO_LIST;
        i6 -= i3 * JsonMappingException.MAX_REFS_TO_LIST;
        if (obj != null) {
            i4 = outputFullTriplet(i3, cArr, i5);
        } else {
            i4 = outputLeadingTriplet(i3, cArr, i5);
        }
        return outputFullTriplet(i, cArr, outputFullTriplet(i6, cArr, i4));
    }

    private static int outputLeadingTriplet(int i, byte[] bArr, int i2) {
        int i3 = i << 2;
        i = i3 + 1;
        char c = LEADING_TRIPLETS[i3];
        if (c != '\u0000') {
            i3 = i2 + 1;
            bArr[i2] = (byte) c;
            i2 = i3;
        }
        int i4 = i + 1;
        c = LEADING_TRIPLETS[i];
        if (c != '\u0000') {
            i3 = i2 + 1;
            bArr[i2] = (byte) c;
            i2 = i3;
        }
        i3 = i2 + 1;
        bArr[i2] = (byte) LEADING_TRIPLETS[i4];
        return i3;
    }

    private static int outputLeadingTriplet(int i, char[] cArr, int i2) {
        int i3 = i << 2;
        i = i3 + 1;
        char c = LEADING_TRIPLETS[i3];
        if (c != '\u0000') {
            int i4 = i2 + 1;
            cArr[i2] = c;
            i2 = i4;
        }
        int i5 = i + 1;
        c = LEADING_TRIPLETS[i];
        if (c != '\u0000') {
            i4 = i2 + 1;
            cArr[i2] = c;
            i2 = i4;
        }
        i3 = i2 + 1;
        cArr[i2] = LEADING_TRIPLETS[i5];
        return i3;
    }

    public static int outputLong(long j, byte[] bArr, int i) {
        int calcLongStrLength;
        int i2;
        long j2;
        long j3;
        int i3;
        int i4;
        if (j >= 0) {
            if (j <= MAX_INT_AS_LONG) {
            }
            calcLongStrLength = calcLongStrLength(j) + i;
            i2 = calcLongStrLength;
            while (j > MAX_INT_AS_LONG) {
                i2 -= 3;
                j2 = THOUSAND_L;
                j3 = j / j2;
                outputFullTriplet((int) (j - (j2 * j3)), bArr, i2);
                j = j3;
            }
            i3 = (int) j;
            while (i3 >= JsonMappingException.MAX_REFS_TO_LIST) {
                i2 -= 3;
                i4 = i3 / JsonMappingException.MAX_REFS_TO_LIST;
                outputFullTriplet(i3 - (i4 * JsonMappingException.MAX_REFS_TO_LIST), bArr, i2);
                i3 = i4;
            }
            outputLeadingTriplet(i3, bArr, i);
            return calcLongStrLength;
        } else if (j <= MIN_INT_AS_LONG) {
            if (j == Long.MIN_VALUE) {
                int length = SMALLEST_LONG.length();
                i3 = 0;
                while (i3 < length) {
                    i4 = i + 1;
                    bArr[i] = (byte) SMALLEST_LONG.charAt(i3);
                    i3++;
                    i = i4;
                }
                return i;
            }
            i4 = i + 1;
            bArr[i] = (byte) 45;
            j = -j;
            i = i4;
            calcLongStrLength = calcLongStrLength(j) + i;
            i2 = calcLongStrLength;
            while (j > MAX_INT_AS_LONG) {
                i2 -= 3;
                j2 = THOUSAND_L;
                j3 = j / j2;
                outputFullTriplet((int) (j - (j2 * j3)), bArr, i2);
                j = j3;
            }
            i3 = (int) j;
            while (i3 >= JsonMappingException.MAX_REFS_TO_LIST) {
                i2 -= 3;
                i4 = i3 / JsonMappingException.MAX_REFS_TO_LIST;
                outputFullTriplet(i3 - (i4 * JsonMappingException.MAX_REFS_TO_LIST), bArr, i2);
                i3 = i4;
            }
            outputLeadingTriplet(i3, bArr, i);
            return calcLongStrLength;
        }
        return outputInt((int) j, bArr, i);
    }

    public static int outputLong(long j, char[] cArr, int i) {
        int calcLongStrLength;
        int i2;
        long j2;
        long j3;
        int i3;
        int i4;
        if (j >= 0) {
            if (j <= MAX_INT_AS_LONG) {
            }
            calcLongStrLength = calcLongStrLength(j) + i;
            i2 = calcLongStrLength;
            while (j > MAX_INT_AS_LONG) {
                i2 -= 3;
                j2 = THOUSAND_L;
                j3 = j / j2;
                outputFullTriplet((int) (j - (j2 * j3)), cArr, i2);
                j = j3;
            }
            i3 = (int) j;
            while (i3 >= JsonMappingException.MAX_REFS_TO_LIST) {
                i2 -= 3;
                i4 = i3 / JsonMappingException.MAX_REFS_TO_LIST;
                outputFullTriplet(i3 - (i4 * JsonMappingException.MAX_REFS_TO_LIST), cArr, i2);
                i3 = i4;
            }
            outputLeadingTriplet(i3, cArr, i);
            return calcLongStrLength;
        } else if (j <= MIN_INT_AS_LONG) {
            if (j == Long.MIN_VALUE) {
                i3 = SMALLEST_LONG.length();
                SMALLEST_LONG.getChars(0, i3, cArr, i);
                return i + i3;
            }
            i4 = i + 1;
            cArr[i] = '-';
            j = -j;
            i = i4;
            calcLongStrLength = calcLongStrLength(j) + i;
            i2 = calcLongStrLength;
            while (j > MAX_INT_AS_LONG) {
                i2 -= 3;
                j2 = THOUSAND_L;
                j3 = j / j2;
                outputFullTriplet((int) (j - (j2 * j3)), cArr, i2);
                j = j3;
            }
            i3 = (int) j;
            while (i3 >= JsonMappingException.MAX_REFS_TO_LIST) {
                i2 -= 3;
                i4 = i3 / JsonMappingException.MAX_REFS_TO_LIST;
                outputFullTriplet(i3 - (i4 * JsonMappingException.MAX_REFS_TO_LIST), cArr, i2);
                i3 = i4;
            }
            outputLeadingTriplet(i3, cArr, i);
            return calcLongStrLength;
        }
        return outputInt((int) j, cArr, i);
    }

    public static String toString(double d) {
        return Double.toString(d);
    }

    public static String toString(int i) {
        String[] strArr = sSmallIntStrs;
        if (i < strArr.length) {
            if (i >= 0) {
                return strArr[i];
            }
            int i2 = (-i) - 1;
            strArr = sSmallIntStrs2;
            if (i2 < strArr.length) {
                return strArr[i2];
            }
        }
        return Integer.toString(i);
    }

    public static String toString(long j) {
        if (j > 2147483647L || j < -2147483648L) {
            return Long.toString(j);
        }
        return toString((int) j);
    }
}
