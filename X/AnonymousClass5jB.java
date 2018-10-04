package X;

import org.webrtc.MediaStreamTrack;

/* renamed from: X.5jB */
public final class AnonymousClass5jB implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5jH f68498B;

    public AnonymousClass5jB(AnonymousClass5jH anonymousClass5jH) {
        this.f68498B = anonymousClass5jH;
    }

    public final void run() {
        if (this.f68498B.f68513J == null) {
            AnonymousClass5jH anonymousClass5jH = this.f68498B;
            String id = anonymousClass5jH.f68512I.id();
            AnonymousClass0LH.I(anonymousClass5jH.f68513J == null, "only one audio track is allowed at the same time");
            anonymousClass5jH.f68507D = anonymousClass5jH.f68521R.createAudioSource(anonymousClass5jH.f68505B);
            MediaStreamTrack createAudioTrack = anonymousClass5jH.f68521R.createAudioTrack(id, anonymousClass5jH.f68507D);
            anonymousClass5jH.f68513J = createAudioTrack;
            createAudioTrack.setEnabled(false);
            anonymousClass5jH.f68513J = anonymousClass5jH.f68513J;
        }
        this.f68498B.f68513J.setEnabled(this.f68498B.f68506C ^ 1);
        this.f68498B.f68512I.setTrack(this.f68498B.f68513J, false);
        AnonymousClass5Y4 anonymousClass5Y4 = this.f68498B.f68509F;
        if (anonymousClass5Y4 != null) {
            AnonymousClass0Sy.F(new AnonymousClass4ty(anonymousClass5Y4));
        }
    }
}
