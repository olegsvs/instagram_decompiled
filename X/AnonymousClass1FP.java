package X;

import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;

/* renamed from: X.1FP */
public final class AnonymousClass1FP extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1HH f16015B;

    public AnonymousClass1FP(AnonymousClass0Ng anonymousClass0Ng, AnonymousClass1HH anonymousClass1HH) {
        this.f16015B = anonymousClass1HH;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.m5859I(this, 96290820);
        DLog.m8809e(DLogTag.LIVE, AnonymousClass0IE.m2137E("confirm failed: %s", this.f16015B), new Object[0]);
        AnonymousClass0cQ.m5858H(this, -1280216297, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, -480596760);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.m5859I(this, -1285545807);
        DLog.m8808d(DLogTag.LIVE, AnonymousClass0IE.m2137E("confirmed: %s", this.f16015B), new Object[0]);
        AnonymousClass0cQ.m5858H(this, -1839362953, I2);
        AnonymousClass0cQ.m5858H(this, -445630654, I);
    }
}
