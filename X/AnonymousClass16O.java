package X;

import android.graphics.Rect;
import android.view.View;
import com.facebook.forker.Process;

/* renamed from: X.16O */
public abstract class AnonymousClass16O {
    /* renamed from: B */
    public int f14533B = Process.WAIT_RESULT_TIMEOUT;
    /* renamed from: C */
    public final AnonymousClass0la f14534C;
    /* renamed from: D */
    public final Rect f14535D = new Rect();

    /* renamed from: A */
    public abstract int mo2145A(View view);

    /* renamed from: B */
    public abstract int mo2146B(View view);

    /* renamed from: C */
    public abstract int mo2147C(View view);

    /* renamed from: D */
    public abstract int mo2148D(View view);

    /* renamed from: E */
    public abstract int mo2149E();

    /* renamed from: F */
    public abstract int mo2150F();

    /* renamed from: G */
    public abstract int mo2151G();

    /* renamed from: H */
    public abstract int mo2152H();

    /* renamed from: I */
    public abstract int mo2153I();

    /* renamed from: J */
    public abstract int mo2154J();

    /* renamed from: K */
    public abstract int mo2155K();

    /* renamed from: M */
    public abstract int mo2156M(View view);

    /* renamed from: N */
    public abstract int mo2157N(View view);

    /* renamed from: O */
    public abstract void mo2158O(int i);

    public AnonymousClass16O(AnonymousClass0la anonymousClass0la) {
        this.f14534C = anonymousClass0la;
    }

    /* renamed from: B */
    public static AnonymousClass16O m9395B(AnonymousClass0la anonymousClass0la, int i) {
        switch (i) {
            case 0:
                return new AnonymousClass16P(anonymousClass0la);
            case 1:
                return new AnonymousClass1oI(anonymousClass0la);
            default:
                throw new IllegalArgumentException("invalid orientation");
        }
    }

    /* renamed from: L */
    public final int m9407L() {
        return Process.WAIT_RESULT_TIMEOUT == this.f14533B ? 0 : mo2155K() - this.f14533B;
    }
}
