package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;

/* renamed from: X.1ko */
public final class AnonymousClass1ko {
    /* renamed from: L */
    public static int f22319L = 1;
    /* renamed from: B */
    public float f22320B;
    /* renamed from: C */
    public int f22321C = -1;
    /* renamed from: D */
    public int f22322D = -1;
    /* renamed from: E */
    public AnonymousClass2Nr[] f22323E = new AnonymousClass2Nr[8];
    /* renamed from: F */
    public int f22324F = 0;
    /* renamed from: G */
    public AnonymousClass1kn f22325G;
    /* renamed from: H */
    public int f22326H = 0;
    /* renamed from: I */
    public float[] f22327I = new float[7];
    /* renamed from: J */
    public int f22328J = 0;
    /* renamed from: K */
    private String f22329K;

    public AnonymousClass1ko(AnonymousClass1kn anonymousClass1kn, String str) {
        this.f22325G = anonymousClass1kn;
    }

    /* renamed from: A */
    public final void m12883A(AnonymousClass2Nr anonymousClass2Nr) {
        int i = 0;
        while (true) {
            int i2 = this.f22324F;
            if (i >= i2) {
                break;
            } else if (this.f22323E[i] != anonymousClass2Nr) {
                i++;
            } else {
                return;
            }
        }
        AnonymousClass2Nr[] anonymousClass2NrArr = this.f22323E;
        if (i2 >= anonymousClass2NrArr.length) {
            this.f22323E = (AnonymousClass2Nr[]) Arrays.copyOf(anonymousClass2NrArr, anonymousClass2NrArr.length * 2);
        }
        anonymousClass2NrArr = this.f22323E;
        int i3 = this.f22324F;
        anonymousClass2NrArr[i3] = anonymousClass2Nr;
        this.f22324F = i3 + 1;
    }

    /* renamed from: B */
    public final void m12884B(AnonymousClass2Nr anonymousClass2Nr) {
        int i = this.f22324F;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f22323E[i2] == anonymousClass2Nr) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    AnonymousClass2Nr[] anonymousClass2NrArr = this.f22323E;
                    int i4 = i2 + i3;
                    anonymousClass2NrArr[i4] = anonymousClass2NrArr[i4 + 1];
                }
                this.f22324F--;
                return;
            }
        }
    }

    /* renamed from: C */
    public final void m12885C() {
        this.f22329K = null;
        this.f22325G = AnonymousClass1kn.UNKNOWN;
        this.f22326H = 0;
        this.f22322D = -1;
        this.f22321C = -1;
        this.f22320B = 0.0f;
        this.f22324F = 0;
        this.f22328J = 0;
    }

    /* renamed from: D */
    public final void m12886D(AnonymousClass2Nr anonymousClass2Nr) {
        int i = this.f22324F;
        for (int i2 = 0; i2 < i; i2++) {
            AnonymousClass1kh anonymousClass1kh = this.f22323E[i2].f29849E;
            AnonymousClass2Nr anonymousClass2Nr2 = this.f22323E[i2];
            int i3 = anonymousClass1kh.f22261G;
            while (true) {
                int i4 = 0;
                while (i3 != -1 && i4 < anonymousClass1kh.f22256B) {
                    if (anonymousClass1kh.f22257C[i3] == anonymousClass2Nr.f29848D.f22322D) {
                        float f = anonymousClass1kh.f22259E[i3];
                        anonymousClass1kh.m12860J(anonymousClass2Nr.f29848D, false);
                        AnonymousClass1kh anonymousClass1kh2 = anonymousClass2Nr.f29849E;
                        i4 = anonymousClass1kh2.f22261G;
                        i3 = 0;
                        while (i4 != -1 && i3 < anonymousClass1kh2.f22256B) {
                            anonymousClass1kh.m12851A(anonymousClass1kh.f22260F.f22268C[anonymousClass1kh2.f22257C[i4]], anonymousClass1kh2.f22259E[i4] * f, false);
                            i4 = anonymousClass1kh2.f22258D[i4];
                            i3++;
                        }
                        anonymousClass2Nr2.f29846B += anonymousClass2Nr.f29846B * f;
                        i3 = anonymousClass1kh.f22261G;
                    } else {
                        i3 = anonymousClass1kh.f22258D[i3];
                        i4++;
                    }
                }
            }
        }
        this.f22324F = 0;
    }

    public final String toString() {
        String str = JsonProperty.USE_DEFAULT_NAME;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(this.f22329K);
        return stringBuilder.toString();
    }
}
