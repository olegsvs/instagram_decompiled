package X;

import com.facebook.common.dextricks.StartupQEsConfig;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.6HK */
public final class AnonymousClass6HK extends AnonymousClass6DJ {
    /* renamed from: B */
    private final AnonymousClass5eu f73990B = new AnonymousClass5eu("audio_AccelerateRate");
    /* renamed from: C */
    private final AnonymousClass5eu f73991C = new AnonymousClass5eu("audio_audioOutputLevel");
    /* renamed from: D */
    private final AnonymousClass5eu f73992D;
    /* renamed from: E */
    private final AnonymousClass5eu f73993E;
    /* renamed from: F */
    private final AnonymousClass5eu f73994F;
    /* renamed from: G */
    private final AnonymousClass5eu f73995G;
    /* renamed from: H */
    private final AnonymousClass5eu f73996H;
    /* renamed from: I */
    private final AnonymousClass5eu f73997I;
    /* renamed from: J */
    private final AnonymousClass5eu f73998J;
    /* renamed from: K */
    private final AnonymousClass5eu f73999K;
    /* renamed from: L */
    private final AnonymousClass5eu f74000L;
    /* renamed from: M */
    private final AnonymousClass5eu f74001M;
    /* renamed from: N */
    private final AnonymousClass5eu f74002N;
    /* renamed from: O */
    private final AnonymousClass5eu f74003O;
    /* renamed from: P */
    private final AnonymousClass5eu f74004P;
    /* renamed from: Q */
    private final AnonymousClass5eu f74005Q;
    /* renamed from: R */
    private final AnonymousClass5eu f74006R;
    /* renamed from: S */
    private final AnonymousClass5eu f74007S;
    /* renamed from: T */
    private final AnonymousClass5eu f74008T;
    /* renamed from: U */
    private final AnonymousClass5eu f74009U;

    public AnonymousClass6HK() {
        AnonymousClass5ev anonymousClass5ev = AnonymousClass5ev.SET;
        this.f73992D = new AnonymousClass5eu("audio_bytesReceived", anonymousClass5ev, new AnonymousClass6CK());
        this.f73994F = new AnonymousClass5eu("audio_CurrentDelayMs");
        this.f73995G = new AnonymousClass5eu("audio_DecodingCNG", anonymousClass5ev, new AnonymousClass6CK());
        this.f73996H = new AnonymousClass5eu("audio_DecodingCTN", anonymousClass5ev, new AnonymousClass6CK());
        this.f73997I = new AnonymousClass5eu("audio_DecodingCTSG", anonymousClass5ev, new AnonymousClass6CK());
        this.f73998J = new AnonymousClass5eu("audio_DecodingMuted", anonymousClass5ev, new AnonymousClass6CK());
        this.f73999K = new AnonymousClass5eu("audio_DecodingNormal", anonymousClass5ev, new AnonymousClass6CK());
        this.f74000L = new AnonymousClass5eu("audio_DecodingPLC", anonymousClass5ev, new AnonymousClass6CK());
        this.f74001M = new AnonymousClass5eu("audio_DecodingPLCCNG", anonymousClass5ev, new AnonymousClass6CK());
        this.f73993E = new AnonymousClass5eu("audio_CaptureStartNtpTimeMs");
        this.f74002N = new AnonymousClass5eu("audio_ExpandRate");
        this.f74003O = new AnonymousClass5eu("audio_JitterBufferMs");
        this.f74004P = new AnonymousClass5eu("audio_packetsReceived", anonymousClass5ev, new AnonymousClass6CK());
        this.f74005Q = new AnonymousClass5eu("audio_PreemptiveExpandRate");
        this.f74006R = new AnonymousClass5eu("audio_PreferredJitterBufferMs");
        this.f74007S = new AnonymousClass5eu("audio_SecondaryDecodedRate");
        this.f74008T = new AnonymousClass5eu("audio_SecondaryDiscardedRate");
        this.f74009U = new AnonymousClass5eu("audio_SpeechExpandRate");
    }

    /* renamed from: A */
    public final List mo6806A() {
        List A = super.mo6806A();
        A.addAll(Arrays.asList(new AnonymousClass5eu[]{this.f73990B, this.f73991C, this.f73992D, this.f73994F, this.f73995G, this.f73996H, this.f73997I, this.f73998J, this.f73999K, this.f74000L, this.f74001M, this.f73993E, this.f74002N, this.f74003O, this.f74004P, this.f74005Q, this.f74006R, this.f74007S, this.f74008T, this.f74009U}));
        return A;
    }

    /* renamed from: C */
    public final void m29899C(AnonymousClass6Db anonymousClass6Db) {
        super.m29504B(anonymousClass6Db);
        this.f73990B.m28203A((int) (anonymousClass6Db.m28338A("googAccelerateRate", StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) * 100.0d));
        this.f73991C.m28204B(anonymousClass6Db.m28340C("audioOutputLevel", 0));
        this.f73992D.m28204B(anonymousClass6Db.m28340C("bytesReceived", 0));
        this.f73994F.m28204B(anonymousClass6Db.m28340C("googCurrentDelayMs", 0));
        this.f73995G.m28204B(anonymousClass6Db.m28340C("googDecodingCNG", 0));
        this.f73996H.m28204B(anonymousClass6Db.m28340C("googDecodingCTN", 0));
        this.f73997I.m28204B(anonymousClass6Db.m28340C("googDecodingCTSG", 0));
        this.f73998J.m28204B(anonymousClass6Db.m28340C("googDecodingMuted", 0));
        this.f73999K.m28204B(anonymousClass6Db.m28340C("googDecodingNormal", 0));
        this.f74000L.m28204B(anonymousClass6Db.m28340C("googDecodingPLC", 0));
        this.f74001M.m28204B(anonymousClass6Db.m28340C("googDecodingPLCCNG", 0));
        this.f73993E.m28204B(anonymousClass6Db.m28340C("googCaptureStartNtpTimeMs", 0));
        this.f74002N.m28203A((int) (anonymousClass6Db.m28338A("googExpandRate", StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) * 100.0d));
        this.f74003O.m28204B(anonymousClass6Db.m28340C("googJitterBufferMs", 0));
        this.f74004P.m28204B(anonymousClass6Db.m28340C("packetsReceived", 0));
        this.f74005Q.m28203A((int) (anonymousClass6Db.m28338A("googPreemptiveExpandRate", StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) * 100.0d));
        this.f74006R.m28204B(anonymousClass6Db.m28340C("googPreferredJitterBufferMs", 0));
        this.f74007S.m28204B(anonymousClass6Db.m28340C("googSecondaryDecodedRate", 0));
        this.f74008T.m28204B(anonymousClass6Db.m28340C("googSecondaryDiscardedRate", 0));
        this.f74009U.m28203A((int) (anonymousClass6Db.m28338A("googSpeechExpandRate", StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) * 100.0d));
    }
}
