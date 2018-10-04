package X;

import android.text.TextUtils;
import com.facebook.C0164R;

/* renamed from: X.4CN */
public final class AnonymousClass4CN implements AnonymousClass0F8 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Rx f51381B;

    public AnonymousClass4CN(AnonymousClass5Rx anonymousClass5Rx) {
        this.f51381B = anonymousClass5Rx;
    }

    /* renamed from: A */
    public final void m23516A(AnonymousClass3Xn anonymousClass3Xn) {
        int I = AnonymousClass0cQ.I(this, -1761612285);
        if (AnonymousClass5Rx.B(this.f51381B).equals(anonymousClass3Xn.f42120D)) {
            String string;
            if (TextUtils.isEmpty(anonymousClass3Xn.f42118B)) {
                string = this.f51381B.getString(C0164R.string.request_error);
                this.f51381B.AUA(string, AnonymousClass22w.UNKNOWN);
            } else {
                string = anonymousClass3Xn.f42118B;
                this.f51381B.AUA(string, anonymousClass3Xn.f42119C);
            }
            AnonymousClass33b.m18368J("confirmation", this.f51381B.f63629E, null, AnonymousClass0db.C().G("phone", this.f51381B.f63635K).G("component", "phone_verification"), string, AnonymousClass0a2.I(this.f51381B.f63638N));
            AnonymousClass0cQ.H(this, 1635324786, I);
            return;
        }
        AnonymousClass0cQ.H(this, -708033046, I);
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.I(this, -1411650779);
        m23516A((AnonymousClass3Xn) anonymousClass0F6);
        AnonymousClass0cQ.H(this, -35505932, I);
    }
}
