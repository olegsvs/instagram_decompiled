package X;

import com.facebook.C0164R;
import com.instagram.igtv.viewer.IGTVViewerFragment;

/* renamed from: X.4vz */
public final class AnonymousClass4vz extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ IGTVViewerFragment f58611B;

    public AnonymousClass4vz(IGTVViewerFragment iGTVViewerFragment) {
        this.f58611B = iGTVViewerFragment;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -2128471978);
        AnonymousClass0IG.B(this.f58611B.getContext(), this.f58611B.getResources().getString(C0164R.string.error), 0, 0);
        AnonymousClass0cQ.H(this, 1385303195, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1056759473);
        AnonymousClass0ft anonymousClass0ft = (AnonymousClass0ft) obj;
        int I2 = AnonymousClass0cQ.I(this, -1055054922);
        IGTVViewerFragment.m27469Q(this.f58611B, (AnonymousClass0P7) anonymousClass0ft.f8015E.get(0));
        AnonymousClass0cQ.H(this, 1908930312, I2);
        AnonymousClass0cQ.H(this, 355412206, I);
    }
}
