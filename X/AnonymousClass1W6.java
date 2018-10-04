package X;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1W6 */
public final class AnonymousClass1W6 extends AnonymousClass0VA {
    /* renamed from: B */
    public final View f19433B;
    /* renamed from: C */
    public final Rect f19434C = new Rect();
    /* renamed from: D */
    public final int f19435D;
    /* renamed from: E */
    public final Handler f19436E = new Handler(Looper.getMainLooper());
    /* renamed from: F */
    public final AnonymousClass0Ie f19437F;
    /* renamed from: G */
    public final AnonymousClass3kQ f19438G = new AnonymousClass5l3(this);
    /* renamed from: H */
    public final AnonymousClass0hq f19439H;
    /* renamed from: I */
    public Runnable f19440I;
    /* renamed from: J */
    public AnonymousClass3kR f19441J;
    /* renamed from: K */
    public final AnonymousClass0Cm f19442K;

    public AnonymousClass1W6(AnonymousClass0Ie anonymousClass0Ie, View view, AnonymousClass0hq anonymousClass0hq, int i, AnonymousClass0Cm anonymousClass0Cm) {
        this.f19437F = anonymousClass0Ie;
        this.f19433B = view;
        this.f19439H = anonymousClass0hq;
        this.f19435D = i;
        this.f19442K = anonymousClass0Cm;
    }

    /* renamed from: B */
    public static void m11721B(AnonymousClass1W6 anonymousClass1W6) {
        AnonymousClass3kR anonymousClass3kR = anonymousClass1W6.f19441J;
        if (anonymousClass3kR != null) {
            anonymousClass3kR.A(false);
            anonymousClass1W6.f19441J = null;
        }
        Runnable runnable = anonymousClass1W6.f19440I;
        if (runnable != null) {
            AnonymousClass0OR.m3627G(anonymousClass1W6.f19436E, runnable, 524678939);
            anonymousClass1W6.f19440I = null;
        }
    }

    /* renamed from: C */
    public static boolean m11722C(AnonymousClass1W6 anonymousClass1W6) {
        if (AnonymousClass0HV.m2008D(anonymousClass1W6.f19442K).f2646B.getLong("last_visit_explore_tooltip_time", 0) == 0) {
            return true;
        }
        if (TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - AnonymousClass0HV.m2008D(anonymousClass1W6.f19442K).f2646B.getLong("last_visit_explore_tooltip_time", 0) > 900) {
            return true;
        }
        return false;
    }

    public final void ei() {
        this.f19437F.unregisterLifecycleListener(this);
    }

    public final void gi() {
        AnonymousClass1W6.m11721B(this);
    }

    public final void gx() {
        Object obj = (this.f19440I == null && this.f19441J == null && AnonymousClass1W6.m11722C(this)) ? 1 : null;
        if (obj != null) {
            this.f19440I = new AnonymousClass5l4(this);
            AnonymousClass0OR.m3626F(this.f19436E, this.f19440I, 1000, 1072899007);
        }
    }
}
