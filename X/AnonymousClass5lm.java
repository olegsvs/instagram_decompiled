package X;

import android.widget.Toast;
import com.facebook.C0164R;
import java.util.Collection;

/* renamed from: X.5lm */
public final class AnonymousClass5lm extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1bK f68832B;

    public AnonymousClass5lm(AnonymousClass1bK anonymousClass1bK) {
        this.f68832B = anonymousClass1bK;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -259507243);
        Toast.makeText(this.f68832B.getActivity(), C0164R.string.request_error, 0).show();
        AnonymousClass0cQ.H(this, -1009816780, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -1775828371);
        AnonymousClass0eT.E(this.f68832B.getActivity()).Y(false);
        AnonymousClass0cQ.H(this, 1163907883, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -1313451813);
        AnonymousClass0eT.E(this.f68832B.getActivity()).Y(true);
        AnonymousClass0cQ.H(this, -49569766, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass0ly anonymousClass0ly;
        int i;
        int I = AnonymousClass0cQ.I(this, 1791241383);
        AnonymousClass5K5 anonymousClass5K5 = (AnonymousClass5K5) obj;
        int I2 = AnonymousClass0cQ.I(this, 1852168390);
        AnonymousClass53Z B = AnonymousClass1bK.B(this.f68832B);
        Collection collection = anonymousClass5K5.f62234D;
        if (this.f68832B.f20427C) {
            anonymousClass0ly = anonymousClass5K5.f62232B;
        } else {
            anonymousClass0ly = null;
        }
        if (this.f68832B.f20427C) {
            i = anonymousClass5K5.f62233C;
        } else {
            i = -1;
        }
        B.f59638B.clear();
        B.f59638B.addAll(collection);
        B.f59648L = anonymousClass0ly;
        B.f59649M = i;
        AnonymousClass1bK.B(this.f68832B).m25658F(this.f68832B.f20431G);
        AnonymousClass0Ie anonymousClass0Ie = this.f68832B;
        AnonymousClass0GA B2 = AnonymousClass3lQ.B(anonymousClass0Ie.f20432H, anonymousClass5K5.f62234D);
        B2.f2849B = new AnonymousClass1Rb(anonymousClass0Ie);
        anonymousClass0Ie.schedule(B2);
        this.f68832B.f20428D = false;
        AnonymousClass0cQ.H(this, 422482283, I2);
        AnonymousClass0cQ.H(this, -1482380257, I);
    }
}
