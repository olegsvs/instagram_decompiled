package X;

import android.content.Context;

/* renamed from: X.1Ww */
public final class AnonymousClass1Ww extends AnonymousClass0rr {
    public AnonymousClass1Ww(Context context) {
        super(context, 0, false);
    }

    /* renamed from: f */
    public final int mo2563f() {
        int i = this.f9556O;
        int i2 = 0;
        for (int i3 = 0; i3 < m7332T(); i3++) {
            i2 += m7331S(i3).getWidth();
            if (i2 >= i) {
                return super.mo2563f();
            }
        }
        return Math.round(((float) (i - i2)) / 2.0f);
    }

    /* renamed from: g */
    public final int mo2564g() {
        return mo2563f();
    }

    public final void nA(int i) {
        if (i == 0) {
            super.nA(i);
            return;
        }
        throw new UnsupportedOperationException("only horizontal orientation supported");
    }
}
