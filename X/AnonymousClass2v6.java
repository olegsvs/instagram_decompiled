package X;

import java.util.Arrays;

/* renamed from: X.2v6 */
public final class AnonymousClass2v6 {
    /* renamed from: B */
    public final int f35737B;
    /* renamed from: C */
    public final short[] f35738C;
    /* renamed from: D */
    public short[] f35739D;
    /* renamed from: E */
    public int f35740E;
    /* renamed from: F */
    public final int f35741F;
    /* renamed from: G */
    public int f35742G;
    /* renamed from: H */
    public final int f35743H;
    /* renamed from: I */
    public final int f35744I;
    /* renamed from: J */
    public int f35745J;
    /* renamed from: K */
    public final int f35746K;
    /* renamed from: L */
    public int f35747L;
    /* renamed from: M */
    public int f35748M;
    /* renamed from: N */
    public short[] f35749N;
    /* renamed from: O */
    public int f35750O;
    /* renamed from: P */
    public final float f35751P;
    /* renamed from: Q */
    public short[] f35752Q;
    /* renamed from: R */
    public int f35753R;
    /* renamed from: S */
    public int f35754S;
    /* renamed from: T */
    public int f35755T;
    /* renamed from: U */
    public final float f35756U;
    /* renamed from: V */
    public int f35757V;
    /* renamed from: W */
    public final float f35758W;

    public AnonymousClass2v6(int i, int i2, float f, float f2, int i3) {
        this.f35741F = i;
        this.f35737B = i2;
        this.f35758W = f;
        this.f35751P = f2;
        this.f35756U = ((float) i) / ((float) i3);
        this.f35746K = i / 400;
        int i4 = i / 65;
        this.f35743H = i4;
        int i5 = i4 * 2;
        this.f35744I = i5;
        this.f35738C = new short[i5];
        this.f35739D = new short[(i5 * i2)];
        this.f35749N = new short[(i5 * i2)];
        this.f35752Q = new short[(i5 * i2)];
    }

    /* renamed from: B */
    public static void m17753B(AnonymousClass2v6 anonymousClass2v6, short[] sArr, int i, int i2) {
        anonymousClass2v6.f35749N = AnonymousClass2v6.m17755D(anonymousClass2v6, anonymousClass2v6.f35749N, anonymousClass2v6.f35750O, i2);
        int i3 = anonymousClass2v6.f35737B;
        System.arraycopy(sArr, i * i3, anonymousClass2v6.f35749N, anonymousClass2v6.f35750O * i3, i3 * i2);
        anonymousClass2v6.f35750O += i2;
    }

    /* renamed from: C */
    public static void m17754C(AnonymousClass2v6 anonymousClass2v6, short[] sArr, int i, int i2) {
        int i3 = anonymousClass2v6.f35744I / i2;
        int i4 = anonymousClass2v6.f35737B;
        i2 *= i4;
        i *= i4;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = 0;
            for (int i7 = 0; i7 < i2; i7++) {
                i6 += sArr[((i5 * i2) + i) + i7];
            }
            anonymousClass2v6.f35738C[i5] = (short) (i6 / i2);
        }
    }

    /* renamed from: D */
    public static short[] m17755D(AnonymousClass2v6 anonymousClass2v6, short[] sArr, int i, int i2) {
        int length = sArr.length;
        anonymousClass2v6 = anonymousClass2v6.f35737B;
        length /= anonymousClass2v6;
        if (i + i2 <= length) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((length * 3) / 2) + i2) * anonymousClass2v6);
    }

    /* renamed from: E */
    public static int m17756E(AnonymousClass2v6 anonymousClass2v6, short[] sArr, int i, int i2, int i3) {
        i *= anonymousClass2v6.f35737B;
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 255;
        while (i2 <= i3) {
            int i8 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                i8 += Math.abs(sArr[i + i9] - sArr[(i + i2) + i9]);
            }
            if (i8 * i5 < i4 * i2) {
                i5 = i2;
                i4 = i8;
            }
            if (i8 * i7 > i6 * i2) {
                i7 = i2;
                i6 = i8;
            }
            i2++;
        }
        anonymousClass2v6.f35745J = i4 / i5;
        anonymousClass2v6.f35742G = i6 / i7;
        return i5;
    }

    /* renamed from: F */
    public static void m17757F(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: G */
    public static boolean m17758G(AnonymousClass2v6 anonymousClass2v6, int i, int i2) {
        if (i != 0) {
            if (anonymousClass2v6.f35755T != 0) {
                if (i2 <= i * 3) {
                    if (i * 2 > anonymousClass2v6.f35754S * 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: H */
    public static void m17759H(AnonymousClass2v6 anonymousClass2v6) {
        int i = anonymousClass2v6.f35750O;
        float f = anonymousClass2v6.f35758W;
        float f2 = anonymousClass2v6.f35751P;
        f /= f2;
        float f3 = anonymousClass2v6.f35756U * f2;
        double d = (double) f;
        if (d <= 1.00001d) {
            if (d >= 0.99999d) {
                AnonymousClass2v6.m17753B(anonymousClass2v6, anonymousClass2v6.f35739D, 0, anonymousClass2v6.f35740E);
                anonymousClass2v6.f35740E = 0;
                if (f3 != 1.0f) {
                    anonymousClass2v6.m17760I(f3, i);
                }
            }
        }
        anonymousClass2v6.m17761J(f);
        if (f3 != 1.0f) {
            anonymousClass2v6.m17760I(f3, i);
        }
    }

    /* renamed from: I */
    private void m17760I(float f, int i) {
        int i2 = i;
        if (this.f35750O != i2) {
            int i3 = this.f35741F;
            int i4 = (int) (((float) i3) / f);
            while (true) {
                if (i4 <= 16384) {
                    if (i3 <= 16384) {
                        break;
                    }
                }
                i4 /= 2;
                i3 /= 2;
            }
            int i5 = this.f35750O - i;
            this.f35752Q = AnonymousClass2v6.m17755D(this, this.f35752Q, this.f35753R, i5);
            Object obj = this.f35749N;
            int i6 = this.f35737B;
            System.arraycopy(obj, i * i6, this.f35752Q, this.f35753R * i6, i6 * i5);
            this.f35750O = i2;
            this.f35753R += i5;
            i5 = 0;
            while (true) {
                int i7 = this.f35753R;
                boolean z = true;
                if (i5 < i7 - 1) {
                    int i8;
                    while (true) {
                        i6 = this.f35748M;
                        int i9 = (i6 + 1) * i4;
                        i7 = this.f35747L;
                        if (i9 <= i7 * i3) {
                            break;
                        }
                        this.f35749N = AnonymousClass2v6.m17755D(this, this.f35749N, this.f35750O, 1);
                        int i10 = 0;
                        while (true) {
                            i9 = this.f35737B;
                            if (i10 >= i9) {
                                break;
                            }
                            short[] sArr = this.f35749N;
                            int i11 = (this.f35750O * i9) + i10;
                            short[] sArr2 = this.f35752Q;
                            i9 = (i9 * i5) + i10;
                            short s = sArr2[i9];
                            short s2 = sArr2[i9 + this.f35737B];
                            i6 = this.f35747L * i3;
                            i8 = this.f35748M;
                            i9 = i8 * i4;
                            i7 = (i8 + 1) * i4;
                            i8 = i7 - i6;
                            i7 -= i9;
                            sArr[i11] = (short) (((s * i8) + ((i7 - i8) * s2)) / i7);
                            i10++;
                        }
                        this.f35747L++;
                        this.f35750O++;
                    }
                    i8 = i6 + 1;
                    this.f35748M = i8;
                    if (i8 == i3) {
                        this.f35748M = 0;
                        if (i7 != i4) {
                            z = false;
                        }
                        AnonymousClass2yO.m18017F(z);
                        this.f35747L = 0;
                    }
                    i5++;
                } else {
                    AnonymousClass2v6.m17762K(this, i7 - 1);
                    return;
                }
            }
        }
    }

    /* renamed from: J */
    private void m17761J(float f) {
        int i = this.f35740E;
        if (i >= this.f35744I) {
            int E;
            int i2 = 0;
            do {
                int min;
                if (r2.f35757V > 0) {
                    min = Math.min(r2.f35744I, r2.f35757V);
                    AnonymousClass2v6.m17753B(r2, r2.f35739D, i2, min);
                    r2.f35757V -= min;
                    i2 += min;
                } else {
                    short[] sArr = r2.f35739D;
                    int i3 = r2.f35741F;
                    i3 = i3 > 4000 ? i3 / 4000 : 1;
                    if (r2.f35737B == 1 && i3 == 1) {
                        E = AnonymousClass2v6.m17756E(r2, sArr, i2, r2.f35746K, r2.f35743H);
                    } else {
                        AnonymousClass2v6.m17754C(r2, sArr, i2, i3);
                        E = AnonymousClass2v6.m17756E(r2, r2.f35738C, 0, r2.f35746K / i3, r2.f35743H / i3);
                        if (i3 != 1) {
                            E *= i3;
                            min = i3 * 4;
                            int i4 = E - min;
                            E += min;
                            min = r2.f35746K;
                            if (i4 >= min) {
                                min = i4;
                            }
                            i4 = r2.f35743H;
                            if (E > i4) {
                                E = i4;
                            }
                            if (r2.f35737B == 1) {
                                E = AnonymousClass2v6.m17756E(r2, sArr, i2, min, E);
                            } else {
                                AnonymousClass2v6.m17754C(r2, sArr, i2, 1);
                                E = AnonymousClass2v6.m17756E(r2, r2.f35738C, 0, min, E);
                            }
                        }
                    }
                    min = AnonymousClass2v6.m17758G(r2, r2.f35745J, r2.f35742G) ? r2.f35755T : E;
                    r2.f35754S = r2.f35745J;
                    r2.f35755T = E;
                    if (((double) f) > 1.0d) {
                        int i5;
                        short[] sArr2 = r2.f35739D;
                        if (f >= 2.0f) {
                            i5 = (int) (((float) min) / (f - 1.0f));
                        } else {
                            r2.f35757V = (int) ((((float) min) * (2.0f - f)) / (f - 1.0f));
                            i5 = min;
                        }
                        r2.f35749N = AnonymousClass2v6.m17755D(r2, r2.f35749N, r2.f35750O, i5);
                        AnonymousClass2v6.m17757F(i5, r2.f35737B, r2.f35749N, r2.f35750O, sArr2, i2, sArr2, i2 + min);
                        r2.f35750O += i5;
                        i2 += min + i5;
                    } else {
                        int i6;
                        Object obj = r2.f35739D;
                        if (f < 0.5f) {
                            i6 = (int) ((((float) min) * f) / (1.0f - f));
                        } else {
                            r2.f35757V = (int) ((((float) min) * ((2.0f * f) - 1.0f)) / (1.0f - f));
                            i6 = min;
                        }
                        int i7 = min + i6;
                        r2.f35749N = AnonymousClass2v6.m17755D(r2, r2.f35749N, r2.f35750O, i7);
                        int i8 = r2.f35737B;
                        System.arraycopy(obj, i2 * i8, r2.f35749N, r2.f35750O * i8, i8 * min);
                        AnonymousClass2v6.m17757F(i6, r2.f35737B, r2.f35749N, r2.f35750O + min, obj, i2 + min, obj, i2);
                        r2.f35750O += i7;
                        i2 += i6;
                    }
                }
            } while (r2.f35744I + i2 <= i);
            E = r2.f35740E - i2;
            Object obj2 = r2.f35739D;
            i = r2.f35737B;
            System.arraycopy(obj2, i2 * i, obj2, 0, i * E);
            r2.f35740E = E;
        }
    }

    /* renamed from: K */
    private static void m17762K(AnonymousClass2v6 anonymousClass2v6, int i) {
        if (i != 0) {
            Object obj = anonymousClass2v6.f35752Q;
            int i2 = anonymousClass2v6.f35737B;
            System.arraycopy(obj, i * i2, obj, 0, (anonymousClass2v6.f35753R - i) * i2);
            anonymousClass2v6.f35753R -= i;
        }
    }
}
