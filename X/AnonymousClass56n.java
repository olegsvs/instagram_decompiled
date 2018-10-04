package X;

import com.google.android.gms.auth.api.credentials.HintRequest;

/* renamed from: X.56n */
public final class AnonymousClass56n implements AnonymousClass3Td {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass56t f60192B;

    public AnonymousClass56n(AnonymousClass56t anonymousClass56t) {
        this.f60192B = anonymousClass56t;
    }

    public final /* bridge */ /* synthetic */ void Nh(Object obj) {
        AnonymousClass5jt anonymousClass5jt = (AnonymousClass5jt) obj;
        if (anonymousClass5jt != null && ((Boolean) AnonymousClass0CC.ae.G()).booleanValue()) {
            AnonymousClass0IL anonymousClass0IL = this.f60192B;
            AnonymousClass0TK anonymousClass57L = new AnonymousClass57L(anonymousClass5jt);
            AnonymousClass57M.m25788B(anonymousClass0IL, anonymousClass57L);
            AnonymousClass2Na IS = anonymousClass0IL.IS();
            AnonymousClass3Td anonymousClass56o = new AnonymousClass56o(anonymousClass0IL, anonymousClass57L);
            AnonymousClass5f3 anonymousClass5f3 = new AnonymousClass5f3();
            anonymousClass5f3.f67920G = true;
            anonymousClass5f3.f67921H = true;
            anonymousClass5f3.f67916C = true;
            if (anonymousClass5f3.f67915B == null) {
                anonymousClass5f3.f67915B = new String[0];
            }
            if (!(anonymousClass5f3.f67920G || anonymousClass5f3.f67921H)) {
                if (anonymousClass5f3.f67915B.length == 0) {
                    throw new IllegalStateException("At least one authentication method must be specified");
                }
            }
            anonymousClass5jt.f68636B.m28370A(new AnonymousClass5jm(anonymousClass5jt, new HintRequest(anonymousClass5f3), anonymousClass56o, IS));
        }
    }
}
