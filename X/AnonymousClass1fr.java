package X;

import com.facebook.C0164R;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.1fr */
public final class AnonymousClass1fr extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ UserDetailFragment f21282B;

    public AnonymousClass1fr(UserDetailFragment userDetailFragment) {
        this.f21282B = userDetailFragment;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.m5859I(this, -1969661189);
        AnonymousClass0IG.m2163E(C0164R.string.fail_send_confirm_email);
        AnonymousClass0cQ.m5858H(this, -941362784, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.m5859I(this, -1892014868);
        AnonymousClass2IF.B(false, this.f21282B.getView());
        AnonymousClass0cQ.m5858H(this, 1845311875, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.m5859I(this, -1507615030);
        AnonymousClass2IF.B(true, this.f21282B.getView());
        AnonymousClass0cQ.m5858H(this, -1144388279, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, 1123444212);
        AnonymousClass2MF anonymousClass2MF = (AnonymousClass2MF) obj;
        int I2 = AnonymousClass0cQ.m5859I(this, 1737794248);
        AnonymousClass0F4.f2058E.m1505B(new AnonymousClass0l2());
        AnonymousClass0Ci B = this.f21282B.f8260s.m1037B();
        B.m1033x(false);
        AnonymousClass0Cg.f1704B.m977A(B);
        AnonymousClass3nj.B(this.f21282B.getContext(), anonymousClass2MF.f29525C, anonymousClass2MF.f29524B);
        AnonymousClass0cQ.m5858H(this, -1132228706, I2);
        AnonymousClass0cQ.m5858H(this, -1796434507, I);
    }
}
