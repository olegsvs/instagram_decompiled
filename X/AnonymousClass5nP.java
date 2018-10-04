package X;

import com.instagram.profile.edit.controller.EditProfileFieldsController;

/* renamed from: X.5nP */
public final class AnonymousClass5nP extends AnonymousClass0Iw {
    /* renamed from: B */
    public final String f69022B;
    /* renamed from: C */
    public final /* synthetic */ EditProfileFieldsController f69023C;

    public AnonymousClass5nP(EditProfileFieldsController editProfileFieldsController, String str) {
        this.f69023C = editProfileFieldsController;
        this.f69022B = str;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1849191449);
        this.f69023C.f73129F.put(this.f69022B, Integer.valueOf(0));
        AnonymousClass5jS.m28363B(this.f69023C.mUsernameField.f68580E);
        AnonymousClass0cQ.H(this, -654045345, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -732479103);
        AnonymousClass2MD anonymousClass2MD = (AnonymousClass2MD) obj;
        int I2 = AnonymousClass0cQ.I(this, 1046799859);
        this.f69023C.f73129F.put(this.f69022B, Integer.valueOf(anonymousClass2MD.f29520C ? 1 : 2));
        AnonymousClass5jS.m28363B(this.f69023C.mUsernameField.f68580E);
        AnonymousClass0cQ.H(this, -996387022, I2);
        AnonymousClass0cQ.H(this, -1448360226, I);
    }
}
