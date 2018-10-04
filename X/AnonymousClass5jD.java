package X;

import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpSender;

/* renamed from: X.5jD */
public final class AnonymousClass5jD implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5jH f68500B;

    public AnonymousClass5jD(AnonymousClass5jH anonymousClass5jH) {
        this.f68500B = anonymousClass5jH;
    }

    public final void run() {
        if (this.f68500B.f68517N == null) {
            RtpSender rtpSender = this.f68500B.f68516M;
            AnonymousClass5jH anonymousClass5jH = this.f68500B;
            String id = anonymousClass5jH.f68516M.id();
            if (anonymousClass5jH.f68517N == null) {
                MediaStreamTrack createVideoTrack = anonymousClass5jH.f68521R.createVideoTrack(id, anonymousClass5jH.f68534e);
                anonymousClass5jH.f68517N = createVideoTrack;
                createVideoTrack.setEnabled(false);
            }
            rtpSender.setTrack(anonymousClass5jH.f68517N, true);
        }
        this.f68500B.f68517N.setEnabled(true);
        AnonymousClass5Y4 anonymousClass5Y4 = this.f68500B.f68509F;
        if (anonymousClass5Y4 != null) {
            AnonymousClass0Sy.F(new AnonymousClass4ti(anonymousClass5Y4));
        }
    }
}
