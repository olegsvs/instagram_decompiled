package X;

import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.5pW */
public final class AnonymousClass5pW extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1fo f69236B;

    public AnonymousClass5pW(AnonymousClass1fo anonymousClass1fo) {
        this.f69236B = anonymousClass1fo;
    }

    /* renamed from: B */
    public static void m28489B(AnonymousClass5pW anonymousClass5pW) {
        Toast.makeText(AnonymousClass1fo.C(anonymousClass5pW.f69236B), C0164R.string.translation_fail, 0).show();
        anonymousClass5pW.f69236B.f21253C.J(AnonymousClass3Nj.Original);
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 1408282956);
        AnonymousClass5pW.m28489B(this);
        AnonymousClass0cQ.H(this, -1536032654, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -740889471);
        this.f69236B.f21253C.J(AnonymousClass3Nj.Loading);
        AnonymousClass0cQ.H(this, 841802490, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 1429253139);
        AnonymousClass1YW anonymousClass1YW = (AnonymousClass1YW) obj;
        int I2 = AnonymousClass0cQ.I(this, 366108963);
        if (anonymousClass1YW.f20035C == null) {
            AnonymousClass5pW.m28489B(this);
        } else {
            AnonymousClass3Nh.B(AnonymousClass0kW.E(this.f69236B.f21270T), anonymousClass1YW.f20034B);
            this.f69236B.f21253C.O(anonymousClass1YW.f20035C);
            this.f69236B.f21253C.J(AnonymousClass3Nj.Translated);
        }
        AnonymousClass0cQ.H(this, -759787709, I2);
        AnonymousClass0cQ.H(this, -1600449587, I);
    }
}
