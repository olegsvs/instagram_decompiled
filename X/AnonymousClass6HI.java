package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.6HI */
public final class AnonymousClass6HI extends AnonymousClass6DJ {
    /* renamed from: B */
    private final AnonymousClass5eu f73966B;
    /* renamed from: C */
    private final AnonymousClass5eu f73967C;
    /* renamed from: D */
    private final AnonymousClass5eu f73968D = new AnonymousClass5eu("audio_EchoCancellationReturnLoss");
    /* renamed from: E */
    private final AnonymousClass5eu f73969E = new AnonymousClass5eu("audio_EchoCancellationReturnLossEnhancement");
    /* renamed from: F */
    private final AnonymousClass5eu f73970F;
    /* renamed from: G */
    private final AnonymousClass5eu f73971G = new AnonymousClass5eu("audio_ResidualEchoLikelihood");
    /* renamed from: H */
    private final AnonymousClass5eu f73972H;

    public AnonymousClass6HI() {
        AnonymousClass5ev anonymousClass5ev = AnonymousClass5ev.SET;
        this.f73967C = new AnonymousClass5eu("audio_bytesSent", anonymousClass5ev, new AnonymousClass6CK());
        this.f73970F = new AnonymousClass5eu("audio_packetsSent", anonymousClass5ev, new AnonymousClass6CK());
        this.f73972H = new AnonymousClass5eu("audio_Rtt");
        this.f73966B = new AnonymousClass5eu("audio_audioInputLevel");
    }

    /* renamed from: A */
    public final List mo6806A() {
        List A = super.mo6806A();
        A.addAll(Arrays.asList(new AnonymousClass5eu[]{this.f73967C, this.f73968D, this.f73969E, this.f73971G, this.f73970F, this.f73972H, this.f73966B}));
        return A;
    }

    /* renamed from: C */
    public final void m29895C(AnonymousClass6DZ anonymousClass6DZ) {
        super.m29504B(anonymousClass6DZ);
        this.f73967C.m28204B(anonymousClass6DZ.m28340C("bytesSent", 0));
        this.f73968D.m28204B(anonymousClass6DZ.m28340C("googEchoCancellationReturnLoss", 0));
        this.f73969E.m28204B(anonymousClass6DZ.m28340C("googEchoCancellationReturnLossEnhancement", 0));
        this.f73971G.m28203A((int) (anonymousClass6DZ.m29532H() * 100.0d));
        this.f73970F.m28204B(anonymousClass6DZ.m29531G());
        this.f73972H.m28204B(anonymousClass6DZ.m29533I());
        this.f73966B.m28204B(anonymousClass6DZ.m29530F());
    }
}
