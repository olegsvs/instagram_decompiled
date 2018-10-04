package X;

import android.os.Build.VERSION;
import android.view.View;
import android.view.View.AccessibilityDelegate;

/* renamed from: X.0mE */
public final class AnonymousClass0mE {
    /* renamed from: B */
    public static final AnonymousClass12q f9733B;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 26) {
            f9733B = new AnonymousClass2ey();
        } else if (i >= 24) {
            f9733B = new AnonymousClass2d4();
        } else if (i >= 23) {
            f9733B = new AnonymousClass2OX();
        } else if (i >= 21) {
            f9733B = new AnonymousClass1mj();
        } else if (i >= 19) {
            f9733B = new AnonymousClass12y();
        } else if (i >= 18) {
            f9733B = new AnonymousClass12z();
        } else if (i >= 17) {
            f9733B = new AnonymousClass130();
        } else if (i >= 16) {
            f9733B = new AnonymousClass131();
        } else if (i >= 15) {
            f9733B = new AnonymousClass132();
        } else {
            f9733B = new AnonymousClass12q();
        }
    }

    /* renamed from: B */
    public static int m7512B(View view) {
        return f9733B.mo2071E(view);
    }

    /* renamed from: C */
    public static int m7513C(View view) {
        return f9733B.mo2065F(view);
    }

    /* renamed from: D */
    public static int m7514D(View view) {
        return f9733B.mo2066I(view);
    }

    /* renamed from: E */
    public static int m7515E(View view) {
        return f9733B.mo2067J(view);
    }

    /* renamed from: F */
    public static String m7516F(View view) {
        return f9733B.m9011L(view);
    }

    /* renamed from: G */
    public static boolean m7517G(View view) {
        return AnonymousClass12q.mo2064B(view);
    }

    /* renamed from: H */
    public static boolean m7518H(View view) {
        return f9733B.mo2061O(view);
    }

    /* renamed from: I */
    public static boolean m7519I(View view) {
        return f9733B.mo2062P(view);
    }

    /* renamed from: J */
    public static void m7520J(View view) {
        f9733B.mo2078V(view);
    }

    /* renamed from: K */
    public static void m7521K(View view, Runnable runnable) {
        f9733B.mo2080X(view, runnable);
    }

    /* renamed from: L */
    public static void m7522L(View view, Runnable runnable, long j) {
        f9733B.mo2081Y(view, runnable, j);
    }

    /* renamed from: M */
    public static void m7523M(View view, AnonymousClass12Y anonymousClass12Y) {
        AccessibilityDelegate accessibilityDelegate;
        if (anonymousClass12Y == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = anonymousClass12Y.f13552B;
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    /* renamed from: N */
    public static void m7524N(View view, float f) {
        f9733B.m9027b(view, f);
    }

    /* renamed from: O */
    public static void m7525O(View view, int i) {
        f9733B.mo2063c(view, i);
    }

    /* renamed from: P */
    public static void m7526P(View view, int i, int i2, int i3, int i4) {
        f9733B.mo2069g(view, i, i2, i3, i4);
    }
}
