package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.5mt */
public final class AnonymousClass5mt implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1fo f68952B;

    public AnonymousClass5mt(AnonymousClass1fo anonymousClass1fo) {
        this.f68952B = anonymousClass1fo;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -2091679725);
        AnonymousClass1fo anonymousClass1fo = this.f68952B;
        anonymousClass1fo.f21255E.A(3);
        if (anonymousClass1fo.f21253C.EQ() != AnonymousClass1gF.FULL_AUDIENCE_MEDIA_LIST) {
            AnonymousClass1gV.C(anonymousClass1fo.f21259I, "tap_timeline_view", AnonymousClass1fo.D(anonymousClass1fo), AnonymousClass1fo.E(anonymousClass1fo), anonymousClass1fo.f21266P, anonymousClass1fo.f21267Q);
            AnonymousClass0Iz anonymousClass0Iz = AnonymousClass0Iz.f2854L;
            anonymousClass0Iz.J(anonymousClass1fo.f21252B, "user_detail_list");
            anonymousClass0Iz.H(anonymousClass1fo.f21259I);
            anonymousClass1fo.f21253C.M(AnonymousClass1gF.FULL_AUDIENCE_MEDIA_LIST);
            if (((Boolean) AnonymousClass0CC.sY.H(anonymousClass1fo.f21270T)).booleanValue()) {
                anonymousClass1fo.f21259I.D(false, AnonymousClass1gF.FULL_AUDIENCE_MEDIA_LIST);
            }
        }
        AnonymousClass0cQ.L(this, 2117325528, M);
    }
}
