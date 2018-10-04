package X;

import com.instagram.reels.fragment.ReelViewerFragment;

/* renamed from: X.5wG */
public final class AnonymousClass5wG implements AnonymousClass0Qc {
    /* renamed from: B */
    public final /* synthetic */ ReelViewerFragment f70161B;

    public AnonymousClass5wG(ReelViewerFragment reelViewerFragment) {
        this.f70161B = reelViewerFragment;
    }

    public final /* bridge */ /* synthetic */ boolean RB(AnonymousClass0F6 anonymousClass0F6) {
        AnonymousClass0ko anonymousClass0ko = (AnonymousClass0ko) anonymousClass0F6;
        if (this.f70161B.f4312I != null) {
            Object obj;
            AnonymousClass14t anonymousClass14t = this.f70161B.f4312I;
            if (!anonymousClass14t.f14103H.R()) {
                if (!anonymousClass14t.f14103H.f3378K) {
                    obj = null;
                    if (obj != null && this.f70161B.f4312I.f14103H.f3385R.getId().equals(anonymousClass0ko.f9381C.getId())) {
                        return true;
                    }
                }
            }
            obj = 1;
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.I(this, 863129452);
        AnonymousClass0ko anonymousClass0ko = (AnonymousClass0ko) anonymousClass0F6;
        int I2 = AnonymousClass0cQ.I(this, -554169881);
        AnonymousClass14a anonymousClass14a = (AnonymousClass14a) this.f70161B.mViewPager.getCurrentActiveView().getTag();
        AnonymousClass0Cm anonymousClass0Cm;
        AnonymousClass0QE anonymousClass0QE;
        if (anonymousClass14a instanceof AnonymousClass14Z) {
            AnonymousClass14Z anonymousClass14Z = (AnonymousClass14Z) anonymousClass14a;
            AnonymousClass0Pj c = this.f70161B.c();
            anonymousClass0Cm = this.f70161B.f4353x;
            anonymousClass0QE = this.f70161B;
            AnonymousClass14Y.E(anonymousClass14Z, c, anonymousClass0Cm, anonymousClass0QE, anonymousClass0QE.f4351v);
        } else if (anonymousClass14a instanceof AnonymousClass14n) {
            AnonymousClass14n anonymousClass14n = (AnonymousClass14n) anonymousClass14a;
            anonymousClass0Cm = this.f70161B.f4353x;
            anonymousClass0QE = this.f70161B;
            AnonymousClass14v.B(anonymousClass14n, anonymousClass0Cm, anonymousClass0QE, anonymousClass0QE.f4351v);
        }
        AnonymousClass0cQ.H(this, -649755039, I2);
        AnonymousClass0cQ.H(this, -1660915445, I);
    }
}
