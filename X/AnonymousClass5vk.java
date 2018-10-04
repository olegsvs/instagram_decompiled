package X;

import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.5vk */
public final class AnonymousClass5vk extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6Eq f70096B;

    public AnonymousClass5vk(AnonymousClass6Eq anonymousClass6Eq) {
        this.f70096B = anonymousClass6Eq;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 1758648879);
        this.f70096B.f73232D.f62383C = true;
        if (this.f70096B.f73232D.QV()) {
            AnonymousClass0rF.B(this.f70096B.f73230B, 1486524086);
        }
        Toast.makeText(this.f70096B.getActivity(), this.f70096B.getString(C0164R.string.request_error), 1).show();
        AnonymousClass0cQ.H(this, 2001253662, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 511918857);
        AnonymousClass0IL anonymousClass0IL = this.f70096B;
        anonymousClass0IL.f73232D.f62384D = false;
        AnonymousClass0eT.E(anonymousClass0IL.getActivity()).Y(false);
        if (anonymousClass0IL.f73230B.isEmpty()) {
            AnonymousClass6Eq.m29598D(anonymousClass0IL);
        }
        AnonymousClass0cQ.H(this, -40729803, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, 437833744);
        AnonymousClass6Eq.m29597C(this.f70096B);
        AnonymousClass0cQ.H(this, 681537391, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 158851746);
        AnonymousClass3bn anonymousClass3bn = (AnonymousClass3bn) obj;
        int I2 = AnonymousClass0cQ.I(this, 554844727);
        AnonymousClass1IU anonymousClass1IU = anonymousClass3bn.f42675B;
        if (this.f70096B.f73231C) {
            AnonymousClass5tH anonymousClass5tH = this.f70096B.f73230B;
            AnonymousClass0Pj anonymousClass0Pj = this.f70096B.f73234F;
            anonymousClass5tH.f69669B.clear();
            anonymousClass5tH.m28592F(anonymousClass0Pj, anonymousClass1IU);
            this.f70096B.f73231C = false;
        } else {
            this.f70096B.f73230B.m28592F(this.f70096B.f73234F, anonymousClass1IU);
        }
        this.f70096B.f73232D.f62385E = anonymousClass1IU.f16880F;
        AnonymousClass0cQ.H(this, 527848980, I2);
        AnonymousClass0cQ.H(this, -508720520, I);
    }
}
