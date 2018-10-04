package X;

import com.facebook.C0164R;
import com.instagram.audience.FavoritesHomeFragment;

/* renamed from: X.31u */
public final class AnonymousClass31u extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ FavoritesHomeFragment f37124B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass32C f37125C;

    public AnonymousClass31u(FavoritesHomeFragment favoritesHomeFragment, AnonymousClass32C anonymousClass32C) {
        this.f37124B = favoritesHomeFragment;
        this.f37125C = anonymousClass32C;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 1202187655);
        new AnonymousClass0P2(this.f37124B.getContext()).V(C0164R.string.close_friends_home_title_save_error_dialog).K(C0164R.string.close_friends_home_message_save_error_dialog).S(C0164R.string.try_again, new AnonymousClass31t(this)).N(C0164R.string.cancel, new AnonymousClass31s(this)).A().show();
        AnonymousClass0cQ.H(this, -861744776, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -1128999676);
        this.f37124B.mProgressDialog.hide();
        this.f37124B.mProgressDialog = null;
        AnonymousClass0cQ.H(this, -1817285934, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -242913019);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.I(this, -806902606);
        AnonymousClass31w anonymousClass31w = this.f37124B.f47280M;
        anonymousClass31w.f37137F = this.f37125C.f37192E.size();
        anonymousClass31w.f37135D = this.f37125C.f37190C;
        int i = this.f37125C.f37189B;
        anonymousClass31w.f37139H.B("audience_added_search_count", i);
        anonymousClass31w.f37134C = i;
        AnonymousClass32E anonymousClass32E = this.f37124B.f47277J;
        anonymousClass32E.m18252F(anonymousClass32E.m18246B());
        for (AnonymousClass0Ci w : this.f37125C.f37191D) {
            w.w(true);
        }
        for (AnonymousClass0Ci w2 : this.f37125C.f37192E) {
            w2.w(false);
        }
        this.f37124B.f47279L.B().f1717L = Integer.valueOf(this.f37124B.f47277J.f37195D.size());
        this.f37124B.getView().post(new AnonymousClass31r(this));
        AnonymousClass0cQ.H(this, 928412854, I2);
        AnonymousClass0cQ.H(this, 1528943936, I);
    }
}
