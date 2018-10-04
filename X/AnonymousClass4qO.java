package X;

import java.util.Collection;

/* renamed from: X.4qO */
public final class AnonymousClass4qO extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Xa f57796B;

    public AnonymousClass4qO(AnonymousClass1Xa anonymousClass1Xa) {
        this.f57796B = anonymousClass1Xa;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1580785938);
        AnonymousClass3KS anonymousClass3KS = (AnonymousClass3KS) obj;
        int I2 = AnonymousClass0cQ.I(this, 77771203);
        AnonymousClass5XR anonymousClass5XR = this.f57796B.f19810B;
        Collection collection = anonymousClass3KS.f40181B;
        if (collection != null) {
            anonymousClass5XR.f65865W.clear();
            anonymousClass5XR.f65865W.addAll(collection);
            AnonymousClass5XR.m27387B(anonymousClass5XR);
        }
        AnonymousClass0cQ.H(this, 304617037, I2);
        AnonymousClass0cQ.H(this, 549066968, I);
    }
}
