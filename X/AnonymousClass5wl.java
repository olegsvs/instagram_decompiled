package X;

import com.instagram.reels.fragment.ReelViewerFragment;

/* renamed from: X.5wl */
public final class AnonymousClass5wl implements AnonymousClass3b5 {
    /* renamed from: B */
    public final /* synthetic */ ReelViewerFragment f70212B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass14p f70213C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass14t f70214D;

    public AnonymousClass5wl(ReelViewerFragment reelViewerFragment, AnonymousClass14t anonymousClass14t, AnonymousClass14p anonymousClass14p) {
        this.f70212B = reelViewerFragment;
        this.f70214D = anonymousClass14t;
        this.f70213C = anonymousClass14p;
    }

    public final void Aq(String str) {
        this.f70212B.f4305B.remove(this);
    }

    public final void Fq(String str, boolean z) {
        this.f70212B.f4305B.remove(this);
        this.f70214D.R();
        AnonymousClass14t anonymousClass14t = this.f70213C.f14037S;
        AnonymousClass14t anonymousClass14t2 = this.f70214D;
        if (anonymousClass14t == anonymousClass14t2 && !anonymousClass14t2.N()) {
            AnonymousClass0Pj J = this.f70214D.J();
            int P = this.f70214D.P();
            int L = this.f70214D.L(J);
            AnonymousClass0Cm anonymousClass0Cm = this.f70212B.f4353x;
            AnonymousClass14p anonymousClass14p = this.f70213C;
            AnonymousClass14t anonymousClass14t3 = this.f70214D;
            AnonymousClass14s F = this.f70212B.f4306C.m25976F(J);
            boolean Q = this.f70214D.Q();
            AnonymousClass0QM anonymousClass0QM = this.f70212B;
            AnonymousClass14w.B(anonymousClass0Cm, anonymousClass14p, anonymousClass14t3, J, F, P, L, Q, anonymousClass0QM, anonymousClass0QM.f4351v, this.f70212B);
        }
    }
}
