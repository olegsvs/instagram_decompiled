package X;

import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.4xl */
public final class AnonymousClass4xl implements AnonymousClass0F8 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0sa f58891B;

    public AnonymousClass4xl(AnonymousClass0sa anonymousClass0sa) {
        this.f58891B = anonymousClass0sa;
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.I(this, 1221841648);
        AnonymousClass0l1 anonymousClass0l1 = (AnonymousClass0l1) anonymousClass0F6;
        int I2 = AnonymousClass0cQ.I(this, 1352190680);
        switch (anonymousClass0l1.f9403C.ordinal()) {
            case 4:
                AnonymousClass0F4.f2058E.D(AnonymousClass0l1.class, this.f58891B.f11458D);
                break;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                AnonymousClass0sa.B(this.f58891B, anonymousClass0l1.f9404D);
                break;
            default:
                break;
        }
        AnonymousClass0cQ.H(this, -571746665, I2);
        AnonymousClass0cQ.H(this, -1191303873, I);
    }
}
