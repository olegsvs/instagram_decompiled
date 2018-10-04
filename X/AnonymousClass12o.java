package X;

import android.os.Build.VERSION;

/* renamed from: X.12o */
public final class AnonymousClass12o {
    /* renamed from: B */
    public static final AnonymousClass12p f13616B;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            f13616B = new AnonymousClass1Lf();
        } else if (i >= 16) {
            f13616B = new AnonymousClass1Lg();
        } else {
            f13616B = new AnonymousClass12p();
        }
    }
}
