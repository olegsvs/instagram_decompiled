package X;

import android.text.TextUtils;
import com.facebook.C0164R;

/* renamed from: X.580 */
public final class AnonymousClass580 implements AnonymousClass0F8 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass584 f60393B;

    public AnonymousClass580(AnonymousClass584 anonymousClass584) {
        this.f60393B = anonymousClass584;
    }

    /* renamed from: A */
    public final void m25806A(AnonymousClass3Xn anonymousClass3Xn) {
        int I = AnonymousClass0cQ.I(this, 238554300);
        if (AnonymousClass584.m25808B(this.f60393B).equals(anonymousClass3Xn.f42120D)) {
            if (TextUtils.isEmpty(anonymousClass3Xn.f42118B)) {
                AnonymousClass0IL anonymousClass0IL = this.f60393B;
                anonymousClass0IL.AUA(anonymousClass0IL.getString(C0164R.string.request_error), AnonymousClass22w.UNKNOWN);
            } else {
                this.f60393B.AUA(anonymousClass3Xn.f42118B, anonymousClass3Xn.f42119C);
            }
            AnonymousClass0cQ.H(this, -1961064093, I);
            return;
        }
        AnonymousClass0cQ.H(this, -247086657, I);
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.I(this, 612174531);
        m25806A((AnonymousClass3Xn) anonymousClass0F6);
        AnonymousClass0cQ.H(this, 853491745, I);
    }
}
