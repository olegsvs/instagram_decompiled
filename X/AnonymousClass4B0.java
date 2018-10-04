package X;

import android.os.Handler;
import com.facebook.C0164R;

/* renamed from: X.4B0 */
public final class AnonymousClass4B0 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4B1 f51172B;

    public AnonymousClass4B0(AnonymousClass4B1 anonymousClass4B1) {
        this.f51172B = anonymousClass4B1;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 464016381);
        AnonymousClass0IG.B(this.f51172B.getContext(), this.f51172B.getResources().getString(C0164R.string.error_msg), 0, this.f51172B.getResources().getDimensionPixelOffset(C0164R.dimen.reported_toast_offset));
        AnonymousClass0cQ.H(this, -1974360379, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 170752588);
        AnonymousClass0OR.D(new Handler(), new AnonymousClass4Ay(this), -1640488731);
        AnonymousClass0cQ.H(this, -458544631, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, 1788048126);
        AnonymousClass114.E(this.f51172B.getFragmentManager());
        AnonymousClass0cQ.H(this, -1946076096, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1871817718);
        AnonymousClass2X6 anonymousClass2X6 = (AnonymousClass2X6) obj;
        int I2 = AnonymousClass0cQ.I(this, 1580279556);
        AnonymousClass0OR.D(new Handler(), new AnonymousClass4Az(this), 1765996793);
        AnonymousClass0cQ.H(this, -1763729911, I2);
        AnonymousClass0cQ.H(this, 1563369090, I);
    }
}
