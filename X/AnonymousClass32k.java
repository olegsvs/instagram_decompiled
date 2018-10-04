package X;

import android.widget.Toast;
import com.facebook.C0164R;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* renamed from: X.32k */
public final class AnonymousClass32k extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1fF f37255B;

    public AnonymousClass32k(AnonymousClass1fF anonymousClass1fF) {
        this.f37255B = anonymousClass1fF;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -2028411014);
        if (this.f37255B.f21095C.isResumed()) {
            AnonymousClass32T.m18269C(this.f37255B.f21095C.getContext(), C0164R.string.could_not_update_profile_picture);
            AnonymousClass0OR.D(AnonymousClass1fF.f21093K, new AnonymousClass32j(this), -555476609);
        }
        AnonymousClass0cQ.H(this, 1087244741, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -1709075131);
        AnonymousClass1fF.B(this.f37255B);
        AnonymousClass0cQ.H(this, 1335309186, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, 1969140993);
        new AnonymousClass2Hg().D(this.f37255B.f21096D, ReactProgressBarViewManager.PROP_PROGRESS);
        AnonymousClass0cQ.H(this, -1601710304, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -201022056);
        AnonymousClass32l anonymousClass32l = (AnonymousClass32l) obj;
        int I2 = AnonymousClass0cQ.I(this, -880329947);
        AnonymousClass1fF anonymousClass1fF = this.f37255B;
        anonymousClass32l.f37256B.D();
        Toast.makeText(anonymousClass1fF.f21095C.getContext(), C0164R.string.profile_picture_changed, 0).show();
        AnonymousClass0OR.D(AnonymousClass1fF.f21093K, new AnonymousClass32h(anonymousClass1fF), 63396867);
        AnonymousClass0cQ.H(this, -1340677677, I2);
        AnonymousClass0cQ.H(this, -711581957, I);
    }
}
