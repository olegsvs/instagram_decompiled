package X;

import android.support.v4.app.FragmentActivity;

/* renamed from: X.5hh */
public final class AnonymousClass5hh extends AnonymousClass40X {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5hn f68259B;

    public AnonymousClass5hh(AnonymousClass5hn anonymousClass5hn, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE, FragmentActivity fragmentActivity) {
        this.f68259B = anonymousClass5hn;
        super(anonymousClass0Cm, anonymousClass0EE, fragmentActivity);
    }

    public final void Ey(AnonymousClass0mW anonymousClass0mW, int i) {
        if (this.f68259B.f68275L.add(anonymousClass0mW.f9808G.getId())) {
            AnonymousClass3PU.C(this.f68259B, AnonymousClass3mO.Impression.A(), this.f68259B.f68268E, anonymousClass0mW.f9808G.getId(), AnonymousClass3mP.DIRECT_PIVOT_UNIT.A(), 0);
        }
    }

    public final void em(AnonymousClass0mW anonymousClass0mW, int i) {
        AnonymousClass0rF.B(this.f68259B.f68265B, -1564368829);
        AnonymousClass3PU.C(this.f68259B, AnonymousClass3mO.FollowButtonTapped.A(), this.f68259B.f68268E, anonymousClass0mW.f9808G.getId(), AnonymousClass3mP.DIRECT_PIVOT_UNIT.A(), 0);
    }

    public final void yEA(AnonymousClass0mW anonymousClass0mW, int i) {
        AnonymousClass3PU.C(this.f68259B, AnonymousClass3mO.UserNameTapped.A(), this.f68259B.f68268E, anonymousClass0mW.f9808G.getId(), AnonymousClass3mP.DIRECT_PIVOT_UNIT.A(), null);
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f68259B.getActivity());
        anonymousClass0IZ.f2754D = AnonymousClass0Jj.f2938B.B().D(AnonymousClass0bx.C(this.f68259B.f68274K, anonymousClass0mW.f9808G.getId(), "feed_single_media_user_button").A());
        anonymousClass0IZ.B();
    }
}
