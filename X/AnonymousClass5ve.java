package X;

import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.5ve */
public final class AnonymousClass5ve extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6Ep f70073B;

    public AnonymousClass5ve(AnonymousClass6Ep anonymousClass6Ep) {
        this.f70073B = anonymousClass6Ep;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 801917387);
        this.f70073B.f73220D.f62383C = true;
        if (this.f70073B.f73220D.QV()) {
            AnonymousClass0rF.B(this.f70073B.f73218B, 996727455);
        }
        Toast.makeText(this.f70073B.getActivity(), this.f70073B.getString(C0164R.string.request_error), 1).show();
        AnonymousClass0cQ.H(this, 1152573620, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 1576751281);
        AnonymousClass0IL anonymousClass0IL = this.f70073B;
        anonymousClass0IL.f73220D.f62384D = false;
        AnonymousClass0eT.E(anonymousClass0IL.getActivity()).Y(false);
        if (anonymousClass0IL.f73218B.f69662E.isEmpty()) {
            AnonymousClass6Ep.m29595D(anonymousClass0IL);
        }
        AnonymousClass0cQ.H(this, -605754631, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -324681999);
        AnonymousClass6Ep.m29594C(this.f70073B);
        AnonymousClass0cQ.H(this, -1850161084, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1662822770);
        AnonymousClass1R6 anonymousClass1R6 = (AnonymousClass1R6) obj;
        int I2 = AnonymousClass0cQ.I(this, 1930820315);
        AnonymousClass1If anonymousClass1If = anonymousClass1R6.f18527B;
        AnonymousClass5tG anonymousClass5tG;
        if (this.f70073B.f73219C) {
            anonymousClass5tG = this.f70073B.f73218B;
            AnonymousClass0MI anonymousClass0MI = this.f70073B.f73221E;
            AnonymousClass0Pj anonymousClass0Pj = this.f70073B.f73223G;
            anonymousClass5tG.f69660C = anonymousClass0MI;
            anonymousClass5tG.f69661D = anonymousClass0Pj;
            anonymousClass5tG.f69662E.clear();
            anonymousClass5tG.f69662E.addAll(anonymousClass1If.f16898E);
            anonymousClass5tG.f69659B = anonymousClass1If.f16897D;
            AnonymousClass5tG.m28590B(anonymousClass5tG);
            this.f70073B.f73219C = false;
        } else {
            anonymousClass5tG = this.f70073B.f73218B;
            anonymousClass5tG.f69662E.addAll(anonymousClass1If.f16898E);
            AnonymousClass5tG.m28590B(anonymousClass5tG);
        }
        this.f70073B.f73220D.f62385E = anonymousClass1If.f16895B;
        AnonymousClass0cQ.H(this, -1947536417, I2);
        AnonymousClass0cQ.H(this, 1330106375, I);
    }
}
