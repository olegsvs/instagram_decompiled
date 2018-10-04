package X;

import android.view.ViewTreeObserver.OnWindowFocusChangeListener;

/* renamed from: X.4uv */
public final class AnonymousClass4uv implements OnWindowFocusChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4uw f58427B;

    public AnonymousClass4uv(AnonymousClass4uw anonymousClass4uw) {
        this.f58427B = anonymousClass4uw;
    }

    public final void onWindowFocusChanged(boolean z) {
        if (this.f58427B.f58428B.getWindow() != null) {
            AnonymousClass4v0.m25353B(this.f58427B.f58428B).m25360E(z);
        }
    }
}
