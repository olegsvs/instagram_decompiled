package X;

import com.instagram.reels.fragment.ReelViewerFragment;

/* renamed from: X.5wm */
public final class AnonymousClass5wm implements AnonymousClass3b5 {
    /* renamed from: B */
    public final /* synthetic */ ReelViewerFragment f70215B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass14Z f70216C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass14t f70217D;

    public AnonymousClass5wm(ReelViewerFragment reelViewerFragment, AnonymousClass14t anonymousClass14t, AnonymousClass14Z anonymousClass14Z) {
        this.f70215B = reelViewerFragment;
        this.f70217D = anonymousClass14t;
        this.f70216C = anonymousClass14Z;
    }

    public final void Aq(String str) {
        this.f70215B.f4305B.remove(this);
    }

    public final void Fq(String str, boolean z) {
        this.f70215B.f4305B.remove(this);
        this.f70217D.R();
        AnonymousClass14t anonymousClass14t = this.f70216C.f13954r;
        AnonymousClass14t anonymousClass14t2 = this.f70217D;
        if (anonymousClass14t == anonymousClass14t2 && !anonymousClass14t2.N()) {
            ReelViewerFragment reelViewerFragment = this.f70215B;
            AnonymousClass14Z anonymousClass14Z = this.f70216C;
            anonymousClass14t = this.f70217D;
            ReelViewerFragment.C(reelViewerFragment, anonymousClass14Z, anonymousClass14t, anonymousClass14t.J());
        }
    }
}
