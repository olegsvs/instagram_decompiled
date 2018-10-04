package X;

import com.facebook.video.common.livestreaming.NetworkSpeedTest;

/* renamed from: X.47C */
public final class AnonymousClass47C implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Rh f50404B;
    /* renamed from: C */
    public final /* synthetic */ NetworkSpeedTest f50405C;

    public AnonymousClass47C(AnonymousClass5Rh anonymousClass5Rh, NetworkSpeedTest networkSpeedTest) {
        this.f50404B = anonymousClass5Rh;
        this.f50405C = networkSpeedTest;
    }

    public final void run() {
        if (this.f50404B.f63439U != null) {
            this.f50404B.f63439U.A(this.f50405C);
        }
    }
}
