package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.6HL */
public final class AnonymousClass6HL extends AnonymousClass6DK {
    /* renamed from: B */
    private final AnonymousClass5eu f74010B;
    /* renamed from: C */
    private final AnonymousClass5eu f74011C;
    /* renamed from: D */
    private final AnonymousClass5eu f74012D = new AnonymousClass5eu("video_CurrentDelayMs");
    /* renamed from: E */
    private final AnonymousClass5eu f74013E = new AnonymousClass5eu("video_DecodeMs");
    /* renamed from: F */
    private final AnonymousClass5eu f74014F;
    /* renamed from: G */
    private final AnonymousClass5eu f74015G;
    /* renamed from: H */
    private final AnonymousClass5eu f74016H;
    /* renamed from: I */
    private final AnonymousClass5eu f74017I;
    /* renamed from: J */
    private final AnonymousClass5eu f74018J;
    /* renamed from: K */
    private final AnonymousClass5eu f74019K;
    /* renamed from: L */
    private final AnonymousClass5eu f74020L;
    /* renamed from: M */
    private final AnonymousClass5eu f74021M;
    /* renamed from: N */
    private final AnonymousClass5eu f74022N;
    /* renamed from: O */
    private final AnonymousClass5eu f74023O;
    /* renamed from: P */
    private final AnonymousClass5eu f74024P;
    /* renamed from: Q */
    private final AnonymousClass5eu f74025Q;
    /* renamed from: R */
    private final AnonymousClass5eu f74026R;
    /* renamed from: S */
    private final AnonymousClass5eu f74027S;
    /* renamed from: T */
    private final AnonymousClass5eu f74028T;

    public AnonymousClass6HL() {
        AnonymousClass5ev anonymousClass5ev = AnonymousClass5ev.SET;
        this.f74010B = new AnonymousClass5eu("video_bytesReceived", anonymousClass5ev, new AnonymousClass6CK());
        this.f74014F = new AnonymousClass5eu("video_FirsSent", anonymousClass5ev, new AnonymousClass6CK());
        this.f74011C = new AnonymousClass5eu("video_CaptureStartNtpTimeMs");
        this.f74015G = new AnonymousClass5eu("video_FrameHeightReceived");
        this.f74016H = new AnonymousClass5eu("video_FrameRateDecoded");
        this.f74017I = new AnonymousClass5eu("video_FrameRateOutput");
        this.f74018J = new AnonymousClass5eu("video_FrameRateReceived");
        this.f74019K = new AnonymousClass5eu("video_FrameWidthReceived");
        this.f74020L = new AnonymousClass5eu("video_InterframeDelayMax");
        this.f74021M = new AnonymousClass5eu("video_JitterBufferMs");
        this.f74022N = new AnonymousClass5eu("video_MaxDecodeMs");
        this.f74023O = new AnonymousClass5eu("video_MinPlayoutDelayMs");
        this.f74024P = new AnonymousClass5eu("video_NacksSent", anonymousClass5ev, new AnonymousClass6CK());
        this.f74025Q = new AnonymousClass5eu("video_packetsReceived", anonymousClass5ev, new AnonymousClass6CK());
        this.f74026R = new AnonymousClass5eu("video_PlisSent", anonymousClass5ev, new AnonymousClass6CK());
        this.f74027S = new AnonymousClass5eu("video_RenderDelayMs");
        this.f74028T = new AnonymousClass5eu("video_TargetDelayMs");
    }

    /* renamed from: A */
    public final List mo6807A() {
        List A = super.mo6807A();
        A.addAll(Arrays.asList(new AnonymousClass5eu[]{this.f74010B, this.f74012D, this.f74013E, this.f74014F, this.f74011C, this.f74015G, this.f74016H, this.f74017I, this.f74018J, this.f74019K, this.f74020L, this.f74021M, this.f74022N, this.f74023O, this.f74024P, this.f74025Q, this.f74026R, this.f74027S, this.f74028T}));
        return A;
    }

    /* renamed from: C */
    public final void m29901C(AnonymousClass6Dc anonymousClass6Dc) {
        super.m29506B(anonymousClass6Dc);
        this.f74010B.m28204B(anonymousClass6Dc.m28340C("bytesReceived", 0));
        this.f74012D.m28204B(anonymousClass6Dc.m28340C("googCurrentDelayMs", 0));
        this.f74013E.m28204B(anonymousClass6Dc.m28340C("googDecodeMs", 0));
        this.f74014F.m28204B(anonymousClass6Dc.m28340C("googFirsSent", 0));
        this.f74011C.m28204B(anonymousClass6Dc.m28340C("googCaptureStartNtpTimeMs", 0));
        this.f74015G.m28203A(anonymousClass6Dc.m28339B("googFrameHeightReceived", 0));
        this.f74016H.m28203A(anonymousClass6Dc.m28339B("googFrameRateDecoded", 0));
        this.f74017I.m28203A(anonymousClass6Dc.m28339B("googFrameRateOutput", 0));
        this.f74018J.m28203A(anonymousClass6Dc.m28339B("googFrameRateReceived", 0));
        this.f74019K.m28203A(anonymousClass6Dc.m28339B("googFrameWidthReceived", 0));
        this.f74020L.m28204B(anonymousClass6Dc.m28340C("googInterframeDelayMax", 0));
        this.f74021M.m28204B(anonymousClass6Dc.m28340C("googJitterBufferMs", 0));
        this.f74022N.m28204B(anonymousClass6Dc.m28340C("googMaxDecodeMs", 0));
        this.f74023O.m28204B(anonymousClass6Dc.m28340C("googMinPlayoutDelayMs", 0));
        this.f74024P.m28204B(anonymousClass6Dc.m28340C("googNacksSent", 0));
        this.f74025Q.m28204B(anonymousClass6Dc.m28340C("packetsReceived", 0));
        this.f74026R.m28204B(anonymousClass6Dc.m28340C("googPlisSent", 0));
        this.f74027S.m28204B(anonymousClass6Dc.m28340C("googRenderDelayMs", 0));
        this.f74028T.m28204B(anonymousClass6Dc.m28340C("googTargetDelayMs", 0));
    }
}
