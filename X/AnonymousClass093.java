package X;

import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.093 */
public final class AnonymousClass093 {
    /* renamed from: B */
    public int f1036B;
    /* renamed from: C */
    public char[] f1037C = this.f1038D.toCharArray();
    /* renamed from: D */
    public final String f1038D;
    /* renamed from: E */
    public int f1039E;
    /* renamed from: F */
    public final int f1040F;
    /* renamed from: G */
    public int f1041G;
    /* renamed from: H */
    private int f1042H;

    public AnonymousClass093(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f1038D = name;
        this.f1040F = name.length();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: A */
    public final java.lang.String m567A(java.lang.String r8) {
        /*
        r7 = this;
        r0 = 0;
        r7.f1041G = r0;
        r7.f1036B = r0;
        r7.f1039E = r0;
        r7.f1042H = r0;
        r3 = X.AnonymousClass093.m566F(r7);
        r6 = 0;
        if (r3 != 0) goto L_0x0011;
    L_0x0010:
        return r6;
    L_0x0011:
        r4 = "";
        r1 = r7.f1041G;
        r0 = r7.f1040F;
        if (r1 != r0) goto L_0x001a;
    L_0x0019:
        goto L_0x0010;
    L_0x001a:
        r0 = r7.f1037C;
        r0 = r0[r1];
        switch(r0) {
            case 34: goto L_0x00b6;
            case 35: goto L_0x0027;
            case 43: goto L_0x00ed;
            case 44: goto L_0x00ed;
            case 59: goto L_0x00ed;
            default: goto L_0x0021;
        };
    L_0x0021:
        r4 = X.AnonymousClass093.m564D(r7);
        goto L_0x00ed;
    L_0x0027:
        r2 = r7.f1041G;
        r1 = r2 + 4;
        r0 = r7.f1040F;
        if (r1 >= r0) goto L_0x0139;
    L_0x002f:
        r7.f1036B = r2;
        r0 = r2 + 1;
        r7.f1041G = r0;
    L_0x0035:
        r5 = r7.f1041G;
        r0 = r7.f1040F;
        if (r5 == r0) goto L_0x0086;
    L_0x003b:
        r4 = r7.f1037C;
        r1 = r4[r5];
        r0 = 43;
        if (r1 == r0) goto L_0x0086;
    L_0x0043:
        r1 = r4[r5];
        r0 = 44;
        if (r1 == r0) goto L_0x0086;
    L_0x0049:
        r1 = r4[r5];
        r0 = 59;
        if (r1 != r0) goto L_0x0050;
    L_0x004f:
        goto L_0x0086;
    L_0x0050:
        r0 = r4[r5];
        r2 = 32;
        if (r0 != r2) goto L_0x006d;
    L_0x0056:
        r7.f1039E = r5;
        r0 = r5 + 1;
        r7.f1041G = r0;
    L_0x005c:
        r1 = r7.f1041G;
        r0 = r7.f1040F;
        if (r1 >= r0) goto L_0x008a;
    L_0x0062:
        r0 = r7.f1037C;
        r0 = r0[r1];
        if (r0 != r2) goto L_0x008a;
    L_0x0068:
        r0 = r1 + 1;
        r7.f1041G = r0;
        goto L_0x005c;
    L_0x006d:
        r1 = r4[r5];
        r0 = 65;
        if (r1 < r0) goto L_0x007f;
    L_0x0073:
        r1 = r4[r5];
        r0 = 70;
        if (r1 > r0) goto L_0x007f;
    L_0x0079:
        r0 = r4[r5];
        r0 = r0 + r2;
        r0 = (char) r0;
        r4[r5] = r0;
    L_0x007f:
        r0 = r7.f1041G;
        r0 = r0 + 1;
        r7.f1041G = r0;
        goto L_0x0035;
    L_0x0086:
        r0 = r7.f1041G;
        r7.f1039E = r0;
    L_0x008a:
        r5 = r7.f1039E;
        r1 = r7.f1036B;
        r5 = r5 - r1;
        r0 = 5;
        if (r5 < r0) goto L_0x0139;
    L_0x0092:
        r0 = r5 & 1;
        if (r0 == 0) goto L_0x0139;
    L_0x0096:
        r0 = r5 / 2;
        r4 = new byte[r0];
        r2 = 0;
        r1 = r1 + 1;
    L_0x009d:
        r0 = r4.length;
        if (r2 >= r0) goto L_0x00ac;
    L_0x00a0:
        r0 = X.AnonymousClass093.m562B(r7, r1);
        r0 = (byte) r0;
        r4[r2] = r0;
        r1 = r1 + 2;
        r2 = r2 + 1;
        goto L_0x009d;
    L_0x00ac:
        r4 = new java.lang.String;
        r1 = r7.f1037C;
        r0 = r7.f1036B;
        r4.<init>(r1, r0, r5);
        goto L_0x00ed;
    L_0x00b6:
        r0 = r7.f1041G;
        r0 = r0 + 1;
        r7.f1041G = r0;
        r7.f1036B = r0;
        r7.f1039E = r0;
    L_0x00c0:
        r4 = r7.f1041G;
        r0 = r7.f1040F;
        if (r4 == r0) goto L_0x0139;
    L_0x00c6:
        r2 = r7.f1037C;
        r1 = r2[r4];
        r0 = 34;
        if (r1 != r0) goto L_0x0152;
    L_0x00ce:
        r0 = r4 + 1;
        r7.f1041G = r0;
        r4 = r7.f1041G;
        r0 = r7.f1040F;
        if (r4 >= r0) goto L_0x00e1;
    L_0x00d8:
        r0 = r7.f1037C;
        r1 = r0[r4];
        r0 = 32;
        if (r1 != r0) goto L_0x00e1;
    L_0x00e0:
        goto L_0x00ce;
    L_0x00e1:
        r4 = new java.lang.String;
        r2 = r7.f1037C;
        r1 = r7.f1036B;
        r0 = r7.f1039E;
        r0 = r0 - r1;
        r4.<init>(r2, r1, r0);
    L_0x00ed:
        r0 = r8.equalsIgnoreCase(r3);
        if (r0 == 0) goto L_0x00f4;
    L_0x00f3:
        return r4;
    L_0x00f4:
        r3 = r7.f1041G;
        r0 = r7.f1040F;
        if (r3 < r0) goto L_0x00fc;
    L_0x00fa:
        goto L_0x0010;
    L_0x00fc:
        r2 = r7.f1037C;
        r1 = r2[r3];
        r0 = 44;
        if (r1 == r0) goto L_0x012b;
    L_0x0104:
        r1 = r2[r3];
        r0 = 59;
        if (r1 != r0) goto L_0x010b;
    L_0x010a:
        goto L_0x012b;
    L_0x010b:
        r1 = r2[r3];
        r0 = 43;
        if (r1 != r0) goto L_0x0112;
    L_0x0111:
        goto L_0x012b;
    L_0x0112:
        r2 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Malformed DN: ";
        r1.append(r0);
        r0 = r7.f1038D;
        r1.append(r0);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
    L_0x012b:
        r0 = r7.f1041G;
        r0 = r0 + 1;
        r7.f1041G = r0;
        r3 = X.AnonymousClass093.m566F(r7);
        if (r3 == 0) goto L_0x0112;
    L_0x0137:
        goto L_0x0011;
    L_0x0139:
        r2 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Unexpected end of DN: ";
        r1.append(r0);
        r0 = r7.f1038D;
        r1.append(r0);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
    L_0x0152:
        r1 = r2[r4];
        r0 = 92;
        if (r1 != r0) goto L_0x0161;
    L_0x0158:
        r1 = r7.f1039E;
        r0 = X.AnonymousClass093.m563C(r7);
        r2[r1] = r0;
        goto L_0x0167;
    L_0x0161:
        r1 = r7.f1039E;
        r0 = r2[r4];
        r2[r1] = r0;
    L_0x0167:
        r0 = r7.f1041G;
        r0 = r0 + 1;
        r7.f1041G = r0;
        r0 = r7.f1039E;
        r0 = r0 + 1;
        r7.f1039E = r0;
        goto L_0x00c0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.093.A(java.lang.String):java.lang.String");
    }

    /* renamed from: B */
    public static int m562B(AnonymousClass093 anonymousClass093, int i) {
        int i2 = i + 1;
        if (i2 < anonymousClass093.f1040F) {
            int i3;
            char c = anonymousClass093.f1037C[i];
            if (c >= '0' && c <= '9') {
                i3 = c - 48;
            } else if (c >= 'a' && c <= 'f') {
                i3 = c - 87;
            } else if (c >= 'A' && c <= 'F') {
                i3 = c - 55;
            }
            char c2 = anonymousClass093.f1037C[i2];
            if (c2 >= '0' && c2 <= '9') {
                i2 = c2 - 48;
            } else if (c2 >= 'a' && c2 <= 'f') {
                i2 = c2 - 87;
            } else if (c2 >= 'A' && c2 <= 'F') {
                i2 = c2 - 55;
            }
            return (i3 << 4) + i2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Malformed DN: ");
        stringBuilder.append(anonymousClass093.f1038D);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: C */
    public static char m563C(AnonymousClass093 anonymousClass093) {
        int i = anonymousClass093.f1041G + 1;
        anonymousClass093.f1041G = i;
        if (i != anonymousClass093.f1040F) {
            char c = anonymousClass093.f1037C[i];
            if (!(c == ' ' || c == '%' || c == '\\' || c == '_')) {
                switch (c) {
                    case ParserMinimalBase.INT_QUOTE /*34*/:
                    case '#':
                        break;
                    default:
                        switch (c) {
                            case ParserMinimalBase.INT_ASTERISK /*42*/:
                            case '+':
                            case ParserMinimalBase.INT_COMMA /*44*/:
                                break;
                            default:
                                switch (c) {
                                    case ';':
                                    case StartupQEsConfig.DEFAULT_FPS_EXPECTED_FPS /*60*/:
                                    case '=':
                                    case '>':
                                        break;
                                    default:
                                        return anonymousClass093.m565E();
                                }
                        }
                }
            }
            return anonymousClass093.f1037C[anonymousClass093.f1041G];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected end of DN: ");
        stringBuilder.append(anonymousClass093.f1038D);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: D */
    private static String m564D(AnonymousClass093 anonymousClass093) {
        int i = anonymousClass093.f1041G;
        anonymousClass093.f1036B = i;
        anonymousClass093.f1039E = i;
        while (true) {
            char[] cArr;
            int i2;
            int i3 = anonymousClass093.f1041G;
            if (i3 < anonymousClass093.f1040F) {
                cArr = anonymousClass093.f1037C;
                char c = cArr[i3];
                if (c == ' ') {
                    i2 = anonymousClass093.f1039E;
                    anonymousClass093.f1042H = i2;
                    anonymousClass093.f1041G = i3 + 1;
                    anonymousClass093.f1039E = i2 + 1;
                    cArr[i2] = ' ';
                    while (true) {
                        i3 = anonymousClass093.f1041G;
                        if (i3 < anonymousClass093.f1040F) {
                            cArr = anonymousClass093.f1037C;
                            if (cArr[i3] == ' ') {
                                i2 = anonymousClass093.f1039E;
                                anonymousClass093.f1039E = i2 + 1;
                                cArr[i2] = ' ';
                                anonymousClass093.f1041G = i3 + 1;
                            }
                        }
                        i3 = anonymousClass093.f1041G;
                        if (i3 != anonymousClass093.f1040F) {
                            cArr = anonymousClass093.f1037C;
                            if (!(cArr[i3] == ',' || cArr[i3] == '+' || cArr[i3] == ';')) {
                            }
                        }
                        cArr = anonymousClass093.f1037C;
                        i2 = anonymousClass093.f1036B;
                        return new String(cArr, i2, anonymousClass093.f1042H - i2);
                    }
                } else if (c != ';') {
                    if (c != '\\') {
                        switch (c) {
                            case '+':
                            case ParserMinimalBase.INT_COMMA /*44*/:
                                break;
                            default:
                                i2 = anonymousClass093.f1039E;
                                anonymousClass093.f1039E = i2 + 1;
                                cArr[i2] = cArr[i3];
                                anonymousClass093.f1041G = i3 + 1;
                                continue;
                        }
                    } else {
                        i2 = anonymousClass093.f1039E;
                        anonymousClass093.f1039E = i2 + 1;
                        cArr[i2] = AnonymousClass093.m563C(anonymousClass093);
                        anonymousClass093.f1041G++;
                    }
                }
            }
            cArr = anonymousClass093.f1037C;
            i2 = anonymousClass093.f1036B;
            return new String(cArr, i2, anonymousClass093.f1039E - i2);
        }
    }

    /* renamed from: E */
    private char m565E() {
        int B = AnonymousClass093.m562B(this, this.f1041G);
        this.f1041G++;
        if (B >= 128) {
            if (B >= 192 && B <= 247) {
                int i;
                if (B <= 223) {
                    B &= 31;
                    i = 1;
                } else if (B <= 239) {
                    i = 2;
                    B &= 15;
                } else {
                    i = 3;
                    B &= 7;
                }
                int i2 = 0;
                while (i2 < i) {
                    int i3 = this.f1041G + 1;
                    this.f1041G = i3;
                    if (i3 != this.f1040F) {
                        if (this.f1037C[i3] == '\\') {
                            int i4 = i3 + 1;
                            this.f1041G = i4;
                            int B2 = AnonymousClass093.m562B(this, i4);
                            this.f1041G++;
                            if ((B2 & 192) == 128) {
                                B = (B << 6) + (B2 & 63);
                                i2++;
                            }
                        }
                    }
                }
            }
            return '?';
        }
        return (char) B;
    }

    /* renamed from: F */
    private static String m566F(AnonymousClass093 anonymousClass093) {
        int i;
        while (true) {
            i = anonymousClass093.f1041G;
            if (i >= anonymousClass093.f1040F || anonymousClass093.f1037C[i] != ' ') {
                i = anonymousClass093.f1041G;
            } else {
                anonymousClass093.f1041G = i + 1;
            }
        }
        i = anonymousClass093.f1041G;
        if (i == anonymousClass093.f1040F) {
            return null;
        }
        anonymousClass093.f1036B = i;
        anonymousClass093.f1041G = i + 1;
        while (true) {
            int i2 = anonymousClass093.f1041G;
            if (i2 >= anonymousClass093.f1040F) {
                break;
            }
            char[] cArr = anonymousClass093.f1037C;
            if (cArr[i2] == '=' || cArr[i2] == ' ') {
                break;
            }
            anonymousClass093.f1041G = i2 + 1;
        }
        i = anonymousClass093.f1041G;
        if (i < anonymousClass093.f1040F) {
            int i3;
            char[] cArr2;
            anonymousClass093.f1039E = i;
            if (anonymousClass093.f1037C[i] == ' ') {
                while (true) {
                    i2 = anonymousClass093.f1041G;
                    if (i2 >= anonymousClass093.f1040F) {
                        break;
                    }
                    cArr = anonymousClass093.f1037C;
                    if (cArr[i2] == '=' || cArr[i2] != ' ') {
                        break;
                    }
                    anonymousClass093.f1041G = i2 + 1;
                }
                char[] cArr3 = anonymousClass093.f1037C;
                i = anonymousClass093.f1041G;
                if (cArr3[i] == '=' && i != anonymousClass093.f1040F) {
                }
            }
            anonymousClass093.f1041G++;
            while (true) {
                i = anonymousClass093.f1041G;
                if (i >= anonymousClass093.f1040F || anonymousClass093.f1037C[i] != ' ') {
                    i3 = anonymousClass093.f1039E;
                    i2 = anonymousClass093.f1036B;
                } else {
                    anonymousClass093.f1041G = i + 1;
                }
            }
            i3 = anonymousClass093.f1039E;
            i2 = anonymousClass093.f1036B;
            if (i3 - i2 > 4) {
                cArr2 = anonymousClass093.f1037C;
                if (cArr2[i2 + 3] == '.' && (cArr2[i2] == 'O' || cArr2[i2] == 'o')) {
                    char[] cArr4 = anonymousClass093.f1037C;
                    int i4 = anonymousClass093.f1036B;
                    if (cArr4[i4 + 1] == 'I' || cArr4[i4 + 1] == 'i') {
                        cArr4 = anonymousClass093.f1037C;
                        i4 = anonymousClass093.f1036B;
                        if (cArr4[i4 + 2] == 'D' || cArr4[i4 + 2] == 'd') {
                            anonymousClass093.f1036B += 4;
                        }
                    }
                }
            }
            cArr2 = anonymousClass093.f1037C;
            i = anonymousClass093.f1036B;
            return new String(cArr2, i, anonymousClass093.f1039E - i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected end of DN: ");
        stringBuilder.append(anonymousClass093.f1038D);
        throw new IllegalStateException(stringBuilder.toString());
    }
}
