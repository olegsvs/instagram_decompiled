package X;

import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* renamed from: X.68j */
public final class AnonymousClass68j implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass68k f72180B;

    public AnonymousClass68j(AnonymousClass68k anonymousClass68k) {
        this.f72180B = anonymousClass68k;
    }

    public final void run() {
        this.f72180B.f72182C.A(new AnonymousClass5Nj(BroadcastFailureType.SpeedTestFailure, "SpeedTestTimeoutRunnable", "UiTimeOut"));
    }
}
