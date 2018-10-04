package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.mainactivity.MainActivity;
import com.instagram.ui.widget.proxy.ProxyFrameLayout;

/* renamed from: X.0cf */
public final class AnonymousClass0cf implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ ProxyFrameLayout f7218B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0cA f7219C;

    public AnonymousClass0cf(MainActivity mainActivity, AnonymousClass0cA anonymousClass0cA, ProxyFrameLayout proxyFrameLayout) {
        this.f7219C = anonymousClass0cA;
        this.f7218B = proxyFrameLayout;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.m5863M(this, 948362666);
        AnonymousClass0EI B = AnonymousClass0EI.m1383B();
        AnonymousClass0cA anonymousClass0cA = this.f7219C;
        if (!(B.f1964C == null || B.f1963B != null || anonymousClass0cA == AnonymousClass0cA.FEED)) {
            AnonymousClass0FM.m1565B("init_to_switch_screen_ms", "AppStartPerformanceTracer");
            B.f1963B = anonymousClass0cA.m5725C();
        }
        this.f7218B.post(new AnonymousClass0gu(this, this));
        AnonymousClass0cQ.m5862L(this, 1816667483, M);
    }
}
