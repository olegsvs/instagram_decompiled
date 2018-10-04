package X;

import com.facebook.forker.Process;
import java.util.Arrays;

/* renamed from: X.2fd */
public final class AnonymousClass2fd {
    /* renamed from: B */
    public int f32226B;
    /* renamed from: C */
    public int f32227C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass2fe f32228D;
    /* renamed from: E */
    private int f32229E;
    /* renamed from: F */
    private int f32230F;
    /* renamed from: G */
    private int f32231G;
    /* renamed from: H */
    private int f32232H;
    /* renamed from: I */
    private int f32233I;
    /* renamed from: J */
    private int f32234J;
    /* renamed from: K */
    private int f32235K;

    public AnonymousClass2fd(AnonymousClass2fe anonymousClass2fe, int i, int i2) {
        this.f32228D = anonymousClass2fe;
        this.f32226B = i;
        this.f32227C = i2;
        m16824C();
    }

    /* renamed from: A */
    public final boolean m16822A() {
        return (this.f32227C + 1) - this.f32226B > 1;
    }

    /* renamed from: B */
    public final int m16823B() {
        int D = m16825D();
        int[] iArr = this.f32228D.f32237B;
        int[] iArr2 = this.f32228D.f32239D;
        AnonymousClass2fe.m16829D(iArr, D, this.f32226B, this.f32227C);
        Arrays.sort(iArr, this.f32226B, this.f32227C + 1);
        AnonymousClass2fe.m16829D(iArr, D, this.f32226B, this.f32227C);
        int i = this.f32235K / 2;
        int i2 = this.f32226B;
        D = 0;
        while (true) {
            int i3 = this.f32227C;
            if (i2 > i3) {
                return this.f32226B;
            }
            D += iArr2[iArr[i2]];
            if (D >= i) {
                return Math.min(i3 - 1, i2);
            }
            i2++;
        }
    }

    /* renamed from: C */
    public final void m16824C() {
        int[] iArr = this.f32228D.f32237B;
        int[] iArr2 = this.f32228D.f32239D;
        int i = Integer.MAX_VALUE;
        int i2 = Process.WAIT_RESULT_TIMEOUT;
        int i3 = Integer.MAX_VALUE;
        int i4 = Process.WAIT_RESULT_TIMEOUT;
        int i5 = Integer.MAX_VALUE;
        int i6 = Process.WAIT_RESULT_TIMEOUT;
        int i7 = 0;
        for (int i8 = this.f32226B; i8 <= this.f32227C; i8++) {
            int i9 = iArr[i8];
            i7 += iArr2[i9];
            int G = AnonymousClass2fe.m16832G(i9);
            int F = AnonymousClass2fe.m16831F(i9);
            int i10 = i9 & 31;
            if (G > i2) {
                i2 = G;
            }
            if (G < i) {
                i = G;
            }
            if (F > i4) {
                i4 = F;
            }
            if (F < i3) {
                i3 = F;
            }
            if (i10 > i6) {
                i6 = i10;
            }
            if (i10 < i5) {
                i5 = i10;
            }
        }
        this.f32234J = i;
        this.f32231G = i2;
        this.f32233I = i3;
        this.f32230F = i4;
        this.f32232H = i5;
        this.f32229E = i6;
        this.f32235K = i7;
    }

    /* renamed from: D */
    public final int m16825D() {
        int i = this.f32231G - this.f32234J;
        int i2 = this.f32230F - this.f32233I;
        int i3 = this.f32229E - this.f32232H;
        if (i < i2 || i < i3) {
            return (i2 < i || i2 < i3) ? -1 : -2;
        } else {
            return -3;
        }
    }

    /* renamed from: E */
    public final int m16826E() {
        return (((this.f32231G - this.f32234J) + 1) * ((this.f32230F - this.f32233I) + 1)) * ((this.f32229E - this.f32232H) + 1);
    }
}
