package X;

import com.instagram.audience.FavoritesListFragment;

/* renamed from: X.322 */
public final class AnonymousClass322 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ FavoritesListFragment f37164B;

    public AnonymousClass322(FavoritesListFragment favoritesListFragment) {
        this.f37164B = favoritesListFragment;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 670751493);
        AnonymousClass0Dc.F("FavoritesListFragment", "Failed to load Close Friend suggestions.");
        this.f37164B.f47287C.clear();
        FavoritesListFragment.m21667D(this.f37164B);
        AnonymousClass0cQ.H(this, -363189995, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -328676506);
        AnonymousClass3nW anonymousClass3nW = (AnonymousClass3nW) obj;
        int I2 = AnonymousClass0cQ.I(this, 1337890812);
        this.f37164B.f47287C.clear();
        this.f37164B.f47287C.addAll(anonymousClass3nW.VN());
        FavoritesListFragment.m21667D(this.f37164B);
        AnonymousClass0cQ.H(this, 1262159540, I2);
        AnonymousClass0cQ.H(this, -1397699046, I);
    }
}
