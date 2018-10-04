package X;

import android.os.SystemClock;
import com.facebook.video.heroplayer.ipc.VideoSource;

/* renamed from: X.1c4 */
public final class AnonymousClass1c4 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1c2 f20588B;

    public AnonymousClass1c4(AnonymousClass1c2 anonymousClass1c2) {
        this.f20588B = anonymousClass1c2;
    }

    public final void run() {
        VideoSource videoSource = this.f20588B.f20576S;
        if (videoSource != null) {
            this.f20588B.f20568K.m10596H(AnonymousClass0a1.m5408B(videoSource, this.f20588B.f20577T, AnonymousClass0cW.m5889L(this.f20588B.f20572O), this.f20588B.f20570M, this.f20588B.f20579V));
            this.f20588B.f20566I = SystemClock.elapsedRealtime();
        }
    }
}
