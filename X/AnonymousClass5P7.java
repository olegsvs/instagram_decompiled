package X;

import android.text.TextUtils;
import java.util.Collection;
import java.util.List;

/* renamed from: X.5P7 */
public final class AnonymousClass5P7 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5ax f63059B;
    /* renamed from: C */
    public final /* synthetic */ String f63060C;

    public AnonymousClass5P7(AnonymousClass5ax anonymousClass5ax, String str) {
        this.f63059B = anonymousClass5ax;
        this.f63060C = str;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1266380373);
        if (AnonymousClass5ax.m27753D(this.f63059B)) {
            this.f63059B.m27755A();
        }
        AnonymousClass0cQ.H(this, -545911348, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 276341339);
        this.f63059B.f66770F = false;
        this.f63059B.f66784T.setVisibility(8);
        AnonymousClass0OR.F(this.f63059B.f66769E, new AnonymousClass5P6(this), 2000, 1049490723);
        AnonymousClass0cQ.H(this, -1259413635, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1188878883);
        AnonymousClass3nW anonymousClass3nW = (AnonymousClass3nW) obj;
        int I2 = AnonymousClass0cQ.I(this, -346436864);
        if (AnonymousClass5ax.m27753D(this.f63059B)) {
            int i = 0;
            this.f63059B.f66772H.setVisibility(anonymousClass3nW.VN().isEmpty() ? 0 : 8);
            AnonymousClass5Oz anonymousClass5Oz = this.f63059B.f66781Q;
            List VN = anonymousClass3nW.VN();
            Collection B = AnonymousClass5Oz.m26419B(VN, anonymousClass5Oz.f63045D);
            Object<AnonymousClass0Ci> B2 = AnonymousClass5Oz.m26419B(anonymousClass5Oz.f63045D, VN);
            if (!(B.isEmpty() && B2.isEmpty())) {
                anonymousClass5Oz.f63043B.clear();
            }
            anonymousClass5Oz.f63045D.addAll(B);
            anonymousClass5Oz.f63045D.removeAll(B2);
            for (AnonymousClass0Ci id : B2) {
                anonymousClass5Oz.f63044C.remove(id.getId());
            }
            AnonymousClass5Oz.m26420C(anonymousClass5Oz);
            if (!TextUtils.isEmpty(this.f63059B.f66777M)) {
                this.f63059B.f66781Q.m26421F(this.f63059B.f66777M);
            }
            for (AnonymousClass0Ci id2 : anonymousClass3nW.VN()) {
                if (id2.gB == AnonymousClass2EC.ELIGIBLE_GUEST) {
                    i++;
                }
            }
            if (this.f63059B.f66767C != null) {
                this.f63059B.f66767C.bGA(anonymousClass3nW.VN().size(), i, AnonymousClass3oc.VIEWER_LIST);
            }
        }
        AnonymousClass0cQ.H(this, 1893115151, I2);
        AnonymousClass0cQ.H(this, -115428797, I);
    }
}
