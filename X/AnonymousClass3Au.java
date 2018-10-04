package X;

import android.view.Choreographer.FrameCallback;

/* renamed from: X.3Au */
public final class AnonymousClass3Au implements FrameCallback {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3B0 f38600B;

    public AnonymousClass3Au(AnonymousClass3B0 anonymousClass3B0) {
        this.f38600B = anonymousClass3B0;
    }

    public final void doFrame(long j) {
        AnonymousClass3B0.m18839D(this.f38600B);
        this.f38600B.invalidateSelf();
        this.f38600B.f38614D = false;
    }
}
