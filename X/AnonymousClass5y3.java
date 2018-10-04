package X;

import com.instagram.save.model.SavedCollection;

/* renamed from: X.5y3 */
public final class AnonymousClass5y3 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5y4 f70420B;

    public AnonymousClass5y3(AnonymousClass5y4 anonymousClass5y4) {
        this.f70420B = anonymousClass5y4;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 1939886384);
        AnonymousClass5y4.m28679C(this.f70420B);
        AnonymousClass0cQ.H(this, 1846904530, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 867398917);
        SavedCollection savedCollection = (SavedCollection) obj;
        int I2 = AnonymousClass0cQ.I(this, -2023484750);
        AnonymousClass0F4.f2058E.B(new AnonymousClass1Y0(savedCollection, AnonymousClass3dR.CREATED));
        AnonymousClass0eT.E(this.f70420B.getActivity()).Y(false);
        this.f70420B.getActivity().onBackPressed();
        AnonymousClass0cQ.H(this, -617420882, I2);
        AnonymousClass0cQ.H(this, -998883548, I);
    }
}
