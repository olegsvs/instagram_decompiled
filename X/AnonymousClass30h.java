package X;

import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.30h */
public final class AnonymousClass30h extends AnonymousClass0Iw {
    /* renamed from: B */
    public AnonymousClass30i f36851B;
    /* renamed from: C */
    public String f36852C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass30j f36853D;

    public AnonymousClass30h(AnonymousClass30j anonymousClass30j, String str, AnonymousClass30i anonymousClass30i) {
        this.f36853D = anonymousClass30j;
        this.f36852C = str;
        this.f36851B = anonymousClass30i;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1731882261);
        AnonymousClass0Sy.G(new AnonymousClass30g(this.f36853D));
        Toast.makeText(this.f36853D.f36854B, this.f36853D.f36854B.getResources().getString(C0164R.string.unknown_error_occured), 0).show();
        AnonymousClass0cQ.H(this, -1223429214, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1873542779);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.I(this, -1184970866);
        AnonymousClass0Sy.G(new AnonymousClass30g(this.f36853D));
        AnonymousClass0MI D = AnonymousClass0Jd.f2931B.M(this.f36853D.f36857E).D(this.f36852C);
        if (D != null) {
            for (AnonymousClass0Pj anonymousClass0Pj : D.F()) {
                if (anonymousClass0Pj.f4137I == AnonymousClass17B.MEDIA) {
                    anonymousClass0Pj.f4134F.CB(this.f36852C);
                }
            }
            AnonymousClass0Jd.f2931B.M(this.f36853D.f36857E).M(this.f36852C);
            AnonymousClass0F4.f2058E.C(new AnonymousClass3Ul(D));
        }
        AnonymousClass30i anonymousClass30i = this.f36851B;
        if (anonymousClass30i != null) {
            anonymousClass30i.Zi();
        }
        AnonymousClass0cQ.H(this, -2080968041, I2);
        AnonymousClass0cQ.H(this, 973775680, I);
    }
}
