package X;

import org.webrtc.EglBase;
import org.webrtc.MediaStream;
import org.webrtc.VideoTrack;

/* renamed from: X.5j7 */
public final class AnonymousClass5j7 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5jH f68484B;
    /* renamed from: C */
    public final /* synthetic */ Object f68485C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass4u2 f68486D;

    public AnonymousClass5j7(AnonymousClass5jH anonymousClass5jH, AnonymousClass4u2 anonymousClass4u2, Object obj) {
        this.f68484B = anonymousClass5jH;
        this.f68486D = anonymousClass4u2;
        this.f68485C = obj;
    }

    public final void run() {
        IllegalArgumentException illegalArgumentException;
        try {
            MediaStream mediaStream = (MediaStream) this.f68484B.f68518O.get(this.f68486D.f58322D);
            StringBuilder stringBuilder;
            if (mediaStream == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Media stream could not be found: ");
                stringBuilder.append(this.f68486D);
                illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
            } else if (mediaStream.videoTracks.isEmpty()) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Media stream nave no video tracks to attach: ");
                stringBuilder.append(this.f68486D);
                illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
            } else {
                AnonymousClass5jH.m28343B(this.f68484B, (VideoTrack) mediaStream.videoTracks.get(0), ((AnonymousClass6GY) this.f68485C).f73804D);
                if (this.f68485C instanceof AnonymousClass6GY) {
                    AnonymousClass0Sy.F(new AnonymousClass5j6(this, ((EglBase) AnonymousClass0LH.E(this.f68484B.f68530a)).getEglBaseContext()));
                    return;
                }
                return;
            }
            throw illegalArgumentException;
        } catch (IllegalArgumentException illegalArgumentException2) {
            AnonymousClass4tz.m25308B(this.f68484B.f68509F, illegalArgumentException2.toString());
        }
    }
}
