package X;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

/* renamed from: X.10B */
public final class AnonymousClass10B implements FrameCallback {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Gu f13198B;

    public AnonymousClass10B(AnonymousClass0Gu anonymousClass0Gu) {
        this.f13198B = anonymousClass0Gu;
    }

    public final void doFrame(long j) {
        if (this.f13198B.f2476E) {
            AnonymousClass0Gu.m1923B(this.f13198B, j);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }
}
