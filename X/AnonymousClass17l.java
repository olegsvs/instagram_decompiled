package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.17l */
public final class AnonymousClass17l implements AnonymousClass0EJ {
    /* renamed from: B */
    public final /* synthetic */ QuickPerformanceLogger f14833B;

    public AnonymousClass17l(QuickPerformanceLogger quickPerformanceLogger) {
        this.f14833B = quickPerformanceLogger;
    }

    public final void onAppBackgrounded() {
        this.f14833B.markerEnd(11862018, (short) 2);
    }

    public final void onAppForegrounded() {
        if (!AnonymousClass0h0.m6717B()) {
            this.f14833B.markerStart(11862018, false);
        }
    }
}
