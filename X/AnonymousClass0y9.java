package X;

import android.os.Handler;

/* renamed from: X.0y9 */
public final class AnonymousClass0y9 extends AnonymousClass0VA {
    /* renamed from: B */
    public final AnonymousClass0iD f12727B;
    /* renamed from: C */
    public final AnonymousClass0jz f12728C;
    /* renamed from: D */
    public final AnonymousClass0Ie f12729D;
    /* renamed from: E */
    private final AnonymousClass0PZ f12730E;
    /* renamed from: F */
    private final AnonymousClass0Ci f12731F;

    public AnonymousClass0y9(AnonymousClass0Ie anonymousClass0Ie, AnonymousClass0iD anonymousClass0iD, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0jz anonymousClass0jz, AnonymousClass0Ci anonymousClass0Ci) {
        this.f12729D = anonymousClass0Ie;
        this.f12727B = anonymousClass0iD;
        this.f12730E = anonymousClass0PZ;
        this.f12728C = anonymousClass0jz;
        this.f12731F = anonymousClass0Ci;
    }

    public final void gx() {
        AnonymousClass106 anonymousClass106 = AnonymousClass106.f13177F;
        if (anonymousClass106.f13179C) {
            AnonymousClass0P7 A = AnonymousClass107.f13182C.m8703A(anonymousClass106.f13181E);
            if (A != null) {
                Object RO = this.f12727B.RO(A);
                AnonymousClass0OR.m3626F(new Handler(), new AnonymousClass108(this, RO, A, new AnonymousClass0ms(A, RO)), 100, -1746325630);
                AnonymousClass10A.m8706C(this.f12729D.getActivity(), this.f12730E, A.NO(), AnonymousClass109.ACTION_DONE_REPORT_IN_WEBVIEW, this.f12731F);
                return;
            }
            return;
        }
        anonymousClass106.m8702A();
    }
}
