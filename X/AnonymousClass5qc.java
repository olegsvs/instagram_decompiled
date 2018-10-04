package X;

import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.5qc */
public final class AnonymousClass5qc extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0od f69338B;

    public AnonymousClass5qc(AnonymousClass0od anonymousClass0od) {
        this.f69338B = anonymousClass0od;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -619455951);
        Toast.makeText(this.f69338B.f10324B, C0164R.string.fail_send_confirm_email, 0).show();
        AnonymousClass0cQ.H(this, 1891588428, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 1890489082);
        AnonymousClass2MF anonymousClass2MF = (AnonymousClass2MF) obj;
        int I2 = AnonymousClass0cQ.I(this, 302949011);
        new AnonymousClass0Sb(this.f69338B.f10324B).R(anonymousClass2MF.f29525C).I(anonymousClass2MF.f29524B).O(C0164R.string.ok, null).C().show();
        AnonymousClass0cQ.H(this, -993272214, I2);
        AnonymousClass0cQ.H(this, 162556257, I);
    }
}
