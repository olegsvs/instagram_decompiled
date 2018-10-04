package X;

import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;

/* renamed from: X.454 */
public final class AnonymousClass454 extends AnonymousClass40X {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3mT f49641B;

    public AnonymousClass454(AnonymousClass3mT anonymousClass3mT, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE, FragmentActivity fragmentActivity) {
        this.f49641B = anonymousClass3mT;
        super(anonymousClass0Cm, anonymousClass0EE, fragmentActivity);
    }

    public final void Ey(AnonymousClass0mW anonymousClass0mW, int i) {
        if (this.f49641B.f44333H.add(anonymousClass0mW.f9808G.getId())) {
            AnonymousClass3PU.m19556C(this.f49641B, AnonymousClass3mO.Impression.m20630A(), this.f49641B.f44331F, anonymousClass0mW.f9808G.getId(), AnonymousClass3mP.USER_PROFILE_SEE_ALL.m20631A(), 0);
        }
    }

    public final void em(AnonymousClass0mW anonymousClass0mW, int i) {
        AnonymousClass3PU.m19556C(this.f49641B, AnonymousClass3mO.FollowButtonTapped.m20630A(), this.f49641B.f44331F, anonymousClass0mW.f9808G.getId(), AnonymousClass3mP.USER_PROFILE_SEE_ALL.m20631A(), 0);
    }

    public final void ri(AnonymousClass0mW anonymousClass0mW, int i) {
        Object id = anonymousClass0mW.f9808G.getId();
        if (!(TextUtils.isEmpty(this.f49641B.f44331F) || TextUtils.isEmpty(id))) {
            AnonymousClass0Ix.D(AnonymousClass0ma.C(this.f49641B.f44332G, this.f49641B.f44331F, id));
        }
        AnonymousClass3PO B = this.f49641B.m20634B();
        B.f40857B.f40829B.remove(anonymousClass0mW);
        AnonymousClass3PO.m19549B(B);
        AnonymousClass3PU.m19556C(this.f49641B, AnonymousClass3mO.SuggestionsClosed.m20630A(), this.f49641B.f44331F, anonymousClass0mW.f9808G.getId(), AnonymousClass3mP.USER_PROFILE_SEE_ALL.m20631A(), 0);
    }

    public final void yEA(AnonymousClass0mW anonymousClass0mW, int i) {
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f49641B.getActivity());
        anonymousClass0IZ.f2754D = AnonymousClass0Jj.f2938B.B().D(AnonymousClass0bx.C(this.f49641B.f44332G, anonymousClass0mW.f9808G.getId(), "similar_accounts_user_button").A());
        anonymousClass0IZ.B();
        AnonymousClass3PU.m19556C(this.f49641B, AnonymousClass3mO.UserNameTapped.m20630A(), this.f49641B.f44331F, anonymousClass0mW.f9808G.getId(), AnonymousClass3mP.USER_PROFILE_SEE_ALL.m20631A(), null);
    }
}
