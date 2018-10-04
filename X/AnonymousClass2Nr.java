package X;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.2Nr */
public class AnonymousClass2Nr implements AnonymousClass1kj {
    /* renamed from: B */
    public float f29846B = 0.0f;
    /* renamed from: C */
    public boolean f29847C = false;
    /* renamed from: D */
    public AnonymousClass1ko f29848D = null;
    /* renamed from: E */
    public final AnonymousClass1kh f29849E;

    public AnonymousClass2Nr(AnonymousClass1ki anonymousClass1ki) {
        this.f29849E = new AnonymousClass1kh(this, anonymousClass1ki);
    }

    /* renamed from: A */
    public final AnonymousClass2Nr m15374A(AnonymousClass1kk anonymousClass1kk, int i) {
        this.f29849E.m12859I(anonymousClass1kk.m12877I(i, "ep"), 1.0f);
        this.f29849E.m12859I(anonymousClass1kk.m12877I(i, "em"), -1.0f);
        return this;
    }

    /* renamed from: B */
    public final AnonymousClass2Nr m15375B(AnonymousClass1ko anonymousClass1ko, AnonymousClass1ko anonymousClass1ko2, int i, float f, AnonymousClass1ko anonymousClass1ko3, AnonymousClass1ko anonymousClass1ko4, int i2) {
        if (anonymousClass1ko2 == anonymousClass1ko3) {
            this.f29849E.m12859I(anonymousClass1ko, 1.0f);
            this.f29849E.m12859I(anonymousClass1ko4, 1.0f);
            this.f29849E.m12859I(anonymousClass1ko2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f29849E.m12859I(anonymousClass1ko, 1.0f);
            this.f29849E.m12859I(anonymousClass1ko2, -1.0f);
            this.f29849E.m12859I(anonymousClass1ko3, -1.0f);
            this.f29849E.m12859I(anonymousClass1ko4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f29846B = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            this.f29849E.m12859I(anonymousClass1ko, -1.0f);
            this.f29849E.m12859I(anonymousClass1ko2, 1.0f);
            this.f29846B = (float) i;
        } else if (f >= 1.0f) {
            this.f29849E.m12859I(anonymousClass1ko3, -1.0f);
            this.f29849E.m12859I(anonymousClass1ko4, 1.0f);
            this.f29846B = (float) i2;
        } else {
            float f2 = 1.0f - f;
            this.f29849E.m12859I(anonymousClass1ko, f2 * 1.0f);
            this.f29849E.m12859I(anonymousClass1ko2, f2 * -1.0f);
            this.f29849E.m12859I(anonymousClass1ko3, -1.0f * f);
            this.f29849E.m12859I(anonymousClass1ko4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f29846B = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        return this;
    }

    /* renamed from: C */
    public final AnonymousClass2Nr m15376C(AnonymousClass1ko anonymousClass1ko, AnonymousClass1ko anonymousClass1ko2, AnonymousClass1ko anonymousClass1ko3, AnonymousClass1ko anonymousClass1ko4, float f) {
        this.f29849E.m12859I(anonymousClass1ko, -1.0f);
        this.f29849E.m12859I(anonymousClass1ko2, 1.0f);
        this.f29849E.m12859I(anonymousClass1ko3, f);
        this.f29849E.m12859I(anonymousClass1ko4, -f);
        return this;
    }

    /* renamed from: D */
    public final AnonymousClass2Nr m15377D(AnonymousClass1ko anonymousClass1ko, AnonymousClass1ko anonymousClass1ko2, AnonymousClass1ko anonymousClass1ko3, int i) {
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                obj = 1;
            }
            this.f29846B = (float) i;
        }
        if (obj == null) {
            this.f29849E.m12859I(anonymousClass1ko, -1.0f);
            this.f29849E.m12859I(anonymousClass1ko2, 1.0f);
            this.f29849E.m12859I(anonymousClass1ko3, 1.0f);
        } else {
            this.f29849E.m12859I(anonymousClass1ko, 1.0f);
            this.f29849E.m12859I(anonymousClass1ko2, -1.0f);
            this.f29849E.m12859I(anonymousClass1ko3, -1.0f);
        }
        return this;
    }

    /* renamed from: E */
    public final AnonymousClass2Nr m15378E(AnonymousClass1ko anonymousClass1ko, AnonymousClass1ko anonymousClass1ko2, AnonymousClass1ko anonymousClass1ko3, int i) {
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                obj = 1;
            }
            this.f29846B = (float) i;
        }
        if (obj == null) {
            this.f29849E.m12859I(anonymousClass1ko, -1.0f);
            this.f29849E.m12859I(anonymousClass1ko2, 1.0f);
            this.f29849E.m12859I(anonymousClass1ko3, -1.0f);
        } else {
            this.f29849E.m12859I(anonymousClass1ko, 1.0f);
            this.f29849E.m12859I(anonymousClass1ko2, -1.0f);
            this.f29849E.m12859I(anonymousClass1ko3, 1.0f);
        }
        return this;
    }

    /* renamed from: F */
    public final AnonymousClass2Nr m15379F(AnonymousClass1ko anonymousClass1ko, AnonymousClass1ko anonymousClass1ko2, AnonymousClass1ko anonymousClass1ko3, AnonymousClass1ko anonymousClass1ko4, float f) {
        this.f29849E.m12859I(anonymousClass1ko3, 0.5f);
        this.f29849E.m12859I(anonymousClass1ko4, 0.5f);
        this.f29849E.m12859I(anonymousClass1ko, -0.5f);
        this.f29849E.m12859I(anonymousClass1ko2, -0.5f);
        this.f29846B = -f;
        return this;
    }

    /* renamed from: G */
    public final void m15380G(AnonymousClass1ko anonymousClass1ko) {
        AnonymousClass1ko anonymousClass1ko2 = this.f29848D;
        if (anonymousClass1ko2 != null) {
            this.f29849E.m12859I(anonymousClass1ko2, -1.0f);
            this.f29848D = null;
        }
        float J = this.f29849E.m12860J(anonymousClass1ko, true) * -1.0f;
        this.f29848D = anonymousClass1ko;
        if (J != 1.0f) {
            this.f29846B /= J;
            AnonymousClass1kh anonymousClass1kh = this.f29849E;
            int i = anonymousClass1kh.f22261G;
            int i2 = 0;
            while (i != -1 && i2 < anonymousClass1kh.f22256B) {
                float[] fArr = anonymousClass1kh.f22259E;
                fArr[i] = fArr[i] / J;
                i = anonymousClass1kh.f22258D[i];
                i2++;
            }
        }
    }

    public final void KW(AnonymousClass1kj anonymousClass1kj) {
        if (anonymousClass1kj instanceof AnonymousClass2Nr) {
            AnonymousClass2Nr anonymousClass2Nr = (AnonymousClass2Nr) anonymousClass1kj;
            this.f29848D = null;
            this.f29849E.m12853C();
            for (int i = 0; i < anonymousClass2Nr.f29849E.f22256B; i++) {
                this.f29849E.m12851A(anonymousClass2Nr.f29849E.m12857G(i), anonymousClass2Nr.f29849E.m12858H(i), true);
            }
        }
    }

    public final AnonymousClass1ko UP(AnonymousClass1kk anonymousClass1kk, boolean[] zArr) {
        return this.f29849E.m12856F(zArr, null);
    }

    public final AnonymousClass1ko ZN() {
        return this.f29848D;
    }

    public final void clear() {
        this.f29849E.m12853C();
        this.f29848D = null;
        this.f29846B = 0.0f;
    }

    public void eB(AnonymousClass1ko anonymousClass1ko) {
        float f = 1.0f;
        if (anonymousClass1ko.f22326H != 1) {
            if (anonymousClass1ko.f22326H == 2) {
                f = 1000.0f;
            } else if (anonymousClass1ko.f22326H == 3) {
                f = 1000000.0f;
            } else if (anonymousClass1ko.f22326H == 4) {
                f = 1.0E9f;
            } else if (anonymousClass1ko.f22326H == 5) {
                f = 1.0E12f;
            }
        }
        this.f29849E.m12859I(anonymousClass1ko, f);
    }

    public final String toString() {
        StringBuilder stringBuilder;
        String stringBuilder2;
        Object obj;
        String str = JsonProperty.USE_DEFAULT_NAME;
        if (this.f29848D == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("0");
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.f29848D);
            stringBuilder2 = stringBuilder.toString();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder2);
        stringBuilder.append(" = ");
        String stringBuilder3 = stringBuilder.toString();
        if (this.f29846B != 0.0f) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder3);
            stringBuilder.append(this.f29846B);
            stringBuilder3 = stringBuilder.toString();
            obj = 1;
        } else {
            obj = null;
        }
        int i = this.f29849E.f22256B;
        for (int i2 = 0; i2 < i; i2++) {
            AnonymousClass1ko G = this.f29849E.m12857G(i2);
            if (G != null) {
                float H = this.f29849E.m12858H(i2);
                if (H != 0.0f) {
                    str = G.toString();
                    if (obj == null) {
                        if (H < 0.0f) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(stringBuilder3);
                            stringBuilder.append("- ");
                            stringBuilder3 = stringBuilder.toString();
                            H *= -1.0f;
                        }
                    } else if (H > 0.0f) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(stringBuilder3);
                        stringBuilder.append(" + ");
                        stringBuilder3 = stringBuilder.toString();
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(stringBuilder3);
                        stringBuilder.append(" - ");
                        stringBuilder3 = stringBuilder.toString();
                        H *= -1.0f;
                    }
                    if (H == 1.0f) {
                        StringBuilder stringBuilder4 = new StringBuilder();
                        stringBuilder4.append(stringBuilder3);
                        stringBuilder4.append(str);
                        stringBuilder3 = stringBuilder4.toString();
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(stringBuilder3);
                        stringBuilder.append(H);
                        stringBuilder.append(" ");
                        stringBuilder.append(str);
                        stringBuilder3 = stringBuilder.toString();
                    }
                    obj = 1;
                }
            }
        }
        if (obj != null) {
            return stringBuilder3;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder3);
        stringBuilder.append("0.0");
        return stringBuilder.toString();
    }
}
