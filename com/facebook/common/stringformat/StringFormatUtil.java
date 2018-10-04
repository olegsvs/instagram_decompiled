package com.facebook.common.stringformat;

import java.util.Formattable;
import java.util.Formatter;
import java.util.IllegalFormatException;

public class StringFormatUtil {
    /* renamed from: B */
    private static final Object[] f1899B = new Object[]{null};

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public static int m1274B(java.lang.StringBuilder r12, java.lang.String r13, int r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18) {
        /*
        r5 = r12;
        if (r12 != 0) goto L_0x0005;
    L_0x0003:
        r4 = 1;
        goto L_0x0006;
    L_0x0005:
        r4 = 0;
    L_0x0006:
        r3 = -1;
        if (r14 != 0) goto L_0x000b;
    L_0x0009:
        r2 = -1;
        goto L_0x000c;
    L_0x000b:
        r2 = 0;
    L_0x000c:
        r12 = r2;
        r7 = 0;
        r1 = 0;
    L_0x000f:
        r6 = r13;
        if (r12 >= r14) goto L_0x0039;
    L_0x0012:
        r8 = r15;
        r9 = r16;
        r10 = r17;
        r11 = r18;
        r0 = m1278F(r5, r6, r7, r8, r9, r10, r11, r12);
        if (r0 != r3) goto L_0x0020;
    L_0x001f:
        return r3;
    L_0x0020:
        if (r4 == 0) goto L_0x0023;
    L_0x0022:
        r1 = r1 + r0;
    L_0x0023:
        r7 = m1284L(r13, r7);
        if (r12 != r2) goto L_0x0031;
    L_0x0029:
        r0 = -200; // 0xffffffffffffff38 float:NaN double:NaN;
        if (r7 != r0) goto L_0x0033;
    L_0x002d:
        if (r4 == 0) goto L_0x0033;
    L_0x002f:
        r0 = -2;
        return r0;
    L_0x0031:
        r0 = -200; // 0xffffffffffffff38 float:NaN double:NaN;
    L_0x0033:
        if (r7 >= 0) goto L_0x0036;
    L_0x0035:
        goto L_0x003b;
    L_0x0036:
        r12 = r12 + 1;
        goto L_0x000f;
    L_0x0039:
        r0 = -200; // 0xffffffffffffff38 float:NaN double:NaN;
    L_0x003b:
        if (r7 == r0) goto L_0x0047;
    L_0x003d:
        r0 = -201; // 0xffffffffffffff37 float:NaN double:NaN;
        if (r7 != r0) goto L_0x0042;
    L_0x0041:
        goto L_0x0047;
    L_0x0042:
        r0 = m1285M(r5, r13, r7, r1, r4);
        return r0;
    L_0x0047:
        if (r4 == 0) goto L_0x004a;
    L_0x0049:
        return r1;
    L_0x004a:
        r0 = -3;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.stringformat.StringFormatUtil.B(java.lang.StringBuilder, java.lang.String, int, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):int");
    }

    /* renamed from: C */
    public static int m1275C(StringBuilder stringBuilder, String str, Object... objArr) {
        int i;
        int length;
        int i2;
        int i3;
        Object obj;
        int E;
        int i4 = 0;
        boolean z = stringBuilder == null;
        if (objArr != null) {
            if (objArr.length != 0) {
                i = 0;
                length = objArr.length;
                i2 = 0;
                i3 = 0;
                obj = null;
                while (i4 < length) {
                    E = m1277E(stringBuilder, str, i2, objArr[i4], i ^ 1);
                    if (E != -1) {
                        return -1;
                    }
                    if (z) {
                        i3 += E;
                    }
                    i2 = m1284L(str, i2);
                    if (i2 != -200) {
                        break;
                    } else if (i2 == -201) {
                        obj = 1;
                        break;
                    } else {
                        i4++;
                        obj = 1;
                    }
                }
                if (!z && r4 == null) {
                    return -2;
                }
                if (i2 != -200) {
                    if (i2 == -201) {
                        return m1285M(stringBuilder, str, i2, i3, z);
                    }
                }
                return z ? i3 : -3;
            }
        }
        objArr = f1899B;
        i = 1;
        length = objArr.length;
        i2 = 0;
        i3 = 0;
        obj = null;
        while (i4 < length) {
            E = m1277E(stringBuilder, str, i2, objArr[i4], i ^ 1);
            if (E != -1) {
                if (z) {
                    i3 += E;
                }
                i2 = m1284L(str, i2);
                if (i2 != -200) {
                    if (i2 == -201) {
                        obj = 1;
                        break;
                    }
                    i4++;
                    obj = 1;
                } else {
                    break;
                }
            }
            return -1;
        }
        if (!z) {
        }
        if (i2 != -200) {
            if (i2 == -201) {
                return m1285M(stringBuilder, str, i2, i3, z);
            }
        }
        if (z) {
        }
    }

    /* renamed from: D */
    private static int m1276D(StringBuilder stringBuilder, Object obj) {
        int i = 0;
        Object obj2 = stringBuilder == null ? 1 : null;
        if (obj != null) {
            if (obj instanceof Integer) {
                if (obj2 != null) {
                    i = 11;
                }
            } else if (obj instanceof Short) {
                if (obj2 != null) {
                    i = 6;
                }
            } else if (obj instanceof Byte) {
                if (obj2 != null) {
                    i = 4;
                }
            } else if (obj instanceof Long) {
                if (obj2 != null) {
                    i = 20;
                } else {
                    stringBuilder.append(((Long) obj).longValue());
                }
            } else if (obj2 != null) {
                return -1;
            } else {
                throw new AssertionError();
            }
            stringBuilder.append(((Number) obj).intValue());
        } else if (obj2 != null) {
            i = 0 + 4;
        } else {
            stringBuilder.append("null");
        }
        if (obj2 == null) {
            i = -3;
        }
        return i;
    }

    /* renamed from: E */
    private static int m1277E(StringBuilder stringBuilder, String str, int i, Object obj, boolean z) {
        int length = str.length();
        Object obj2 = stringBuilder == null ? 1 : null;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '%') {
                if (m1286N(str, i) == -100) {
                    int i3 = i + 1;
                    char charAt2 = str.charAt(i3);
                    if (z || charAt2 == '%') {
                        int G;
                        Object obj3;
                        if (charAt2 == 's') {
                            G = m1279G(stringBuilder, obj);
                        } else if (charAt2 == 'd') {
                            G = m1276D(stringBuilder, obj);
                        } else {
                            if (charAt2 == '%') {
                                if (obj2 == null) {
                                    stringBuilder.append('%');
                                }
                                i = i3;
                                obj3 = null;
                                G = 1;
                            } else {
                                obj3 = 1;
                                G = -1;
                            }
                            if (G == -1) {
                                if (obj2 != null) {
                                    i2 += G;
                                }
                                if (obj3 != null) {
                                    break;
                                }
                            }
                        }
                        obj3 = 1;
                        if (G == -1) {
                            if (obj2 != null) {
                                i2 += G;
                            }
                            if (obj3 != null) {
                                break;
                            }
                        }
                    }
                }
                return -1;
            } else if (obj2 != null) {
                i2++;
            } else {
                stringBuilder.append(charAt);
            }
            i++;
        }
        if (obj2 == null) {
            i2 = -3;
        }
        return i2;
    }

    /* renamed from: F */
    private static int m1278F(StringBuilder stringBuilder, String str, int i, Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        switch (i2) {
            case -1:
                return m1277E(stringBuilder, str, i, null, false);
            case 0:
                return m1277E(stringBuilder, str, i, obj, true);
            case 1:
                return m1277E(stringBuilder, str, i, obj2, true);
            case 2:
                return m1277E(stringBuilder, str, i, obj3, true);
            case 3:
                return m1277E(stringBuilder, str, i, obj4, true);
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: G */
    private static int m1279G(StringBuilder stringBuilder, Object obj) {
        Object obj2 = stringBuilder == null ? 1 : null;
        if (!(obj instanceof Formattable)) {
            String str = null;
            if (obj instanceof String) {
                str = (String) obj;
            } else if (obj != null) {
                str = obj.toString();
            }
            if (str == null) {
                str = "null";
            }
            if (obj2 != null) {
                return str.length();
            }
            stringBuilder.append(str);
            return -3;
        } else if (obj2 != null) {
            return -1;
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: H */
    private static int m1280H(String str, int i, Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        switch (i) {
            case 0:
                return m1274B(null, str, 0, null, null, null, null);
            case 1:
                return m1274B(null, str, 1, obj, null, null, null);
            case 2:
                return m1274B(null, str, 2, obj, obj2, null, null);
            case 3:
                return m1274B(null, str, 3, obj, obj2, obj3, null);
            case 4:
                return m1274B(null, str, 4, obj, obj2, obj3, obj4);
            default:
                return m1275C(null, str, objArr);
        }
    }

    /* renamed from: I */
    private static String m1281I(String str, Object... objArr) {
        try {
            return String.format(null, str, objArr);
        } catch (IllegalFormatException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(e.getMessage());
            stringBuilder.append(": ");
            stringBuilder.append(str);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /* renamed from: J */
    private static String m1282J(String str, int i, Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        switch (i) {
            case 0:
                return m1281I(str, new Object[0]);
            case 1:
                return m1281I(str, obj);
            case 2:
                return m1281I(str, obj, obj2);
            case 3:
                return m1281I(str, obj, obj2, obj3);
            case 4:
                return m1281I(str, obj, obj2, obj3, obj4);
            default:
                return m1281I(str, objArr);
        }
    }

    /* renamed from: K */
    private static String m1283K(String str, int i, Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        int H = m1280H(str, i, obj, obj2, obj3, obj4, objArr);
        if (H == -1) {
            return m1282J(str, i, obj, obj2, obj3, obj4, objArr);
        }
        if (H == -2) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder(H);
        if (i == -1) {
            m1275C(stringBuilder, str, objArr);
        } else {
            m1274B(stringBuilder, str, i, obj, obj2, obj3, obj4);
        }
        return stringBuilder.toString();
    }

    /* renamed from: L */
    private static int m1284L(String str, int i) {
        int length = str.length();
        Object obj = null;
        while (i < length) {
            if (str.charAt(i) == '%' && m1286N(str, i) == -100) {
                int i2 = i + 1;
                if (str.charAt(i2) != '%') {
                    return i + 2;
                }
                i = i2;
                obj = 1;
            }
            i++;
        }
        return obj != null ? -201 : -200;
    }

    /* renamed from: M */
    private static int m1285M(StringBuilder stringBuilder, String str, int i, int i2, boolean z) {
        int length = str.length();
        int i3 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '%') {
                i++;
                if (length <= i || str.charAt(i) != '%') {
                    if (z) {
                        return -1;
                    }
                    throw new AssertionError();
                }
            }
            if (z) {
                i3++;
            } else {
                stringBuilder.append(charAt);
            }
            i++;
        }
        return z ? i2 + i3 : -3;
    }

    /* renamed from: N */
    private static int m1286N(String str, int i) {
        int i2 = i + 1;
        if (str.length() > i2) {
            char charAt = str.charAt(i2);
            if (charAt == 's' || charAt == 'd' || charAt == '%') {
                return -100;
            }
        }
        return -101;
    }

    public static void appendFormatStrLocaleSafe(StringBuilder stringBuilder, String str, Object... objArr) {
        int H = m1280H(str, -1, null, null, null, null, objArr);
        if (H == -1) {
            new Formatter(stringBuilder).format(null, str, objArr);
        } else if (H == -2) {
            stringBuilder.append(str);
        } else {
            stringBuilder.ensureCapacity(H);
            m1275C(stringBuilder, str, objArr);
        }
    }

    public static String formatStrLocaleSafe(String str) {
        return m1283K(str, 0, null, null, null, null, null);
    }

    public static String formatStrLocaleSafe(String str, Object obj) {
        return m1283K(str, 1, obj, null, null, null, null);
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2) {
        return m1283K(str, 2, obj, obj2, null, null, null);
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2, Object obj3) {
        return m1283K(str, 3, obj, obj2, obj3, null, null);
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        return m1283K(str, 4, obj, obj2, obj3, obj4, null);
    }

    public static String formatStrLocaleSafe(String str, Object... objArr) {
        return m1283K(str, -1, null, null, null, null, objArr);
    }
}
