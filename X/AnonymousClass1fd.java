package X;

/* renamed from: X.1fd */
public final class AnonymousClass1fd extends AnonymousClass0Iw {
    /* renamed from: B */
    public final AnonymousClass0EE f21186B;
    /* renamed from: C */
    public final AnonymousClass0Ci f21187C;

    public AnonymousClass1fd(AnonymousClass0Ci anonymousClass0Ci, AnonymousClass0EE anonymousClass0EE) {
        this.f21187C = anonymousClass0Ci;
        this.f21186B = anonymousClass0EE;
    }

    public final void onFailInBackground(AnonymousClass0fq anonymousClass0fq) {
        int I = AnonymousClass0cQ.m5859I(this, 1159761420);
        AnonymousClass0NN.m3291B("ig_onetap_nonce_response_failed", this.f21186B).m3300H("multi_tap_enabled", ((Boolean) AnonymousClass0E6.m1316B(AnonymousClass0CC.uU)).booleanValue()).m3298F("guid", AnonymousClass0Dt.f1941C.m1313B()).m3310R();
        AnonymousClass0cQ.m5858H(this, -357790172, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, 1152694118);
        AnonymousClass2De anonymousClass2De = (AnonymousClass2De) obj;
        int I2 = AnonymousClass0cQ.m5859I(this, 1959080401);
        for (AnonymousClass0dq anonymousClass0dq : AnonymousClass0dp.m6114B().m6116D()) {
            if (this.f21187C.getId().equals(anonymousClass0dq.f7532H)) {
                break;
            }
        }
        AnonymousClass0dq anonymousClass0dq2 = null;
        boolean z = (anonymousClass0dq2 == null || AnonymousClass0LQ.m2954B(anonymousClass0dq2.f7527C, anonymousClass2De.f27634B)) ? false : true;
        if (z) {
            AnonymousClass0dq anonymousClass0dq3 = new AnonymousClass0dq(this.f21187C, anonymousClass2De.f27634B);
            AnonymousClass0dp B = AnonymousClass0dp.m6114B();
            String str = anonymousClass0dq3.f7532H;
            if (B.f7525B.containsKey(str)) {
                anonymousClass0dq3.f7528D = ((AnonymousClass0dq) B.f7525B.get(str)).f7528D;
            }
            B.f7525B.put(str, anonymousClass0dq3);
            B.m6127K();
        }
        AnonymousClass0NN.m3291B("ig_onetap_nonce_received", this.f21186B).m3300H("multi_tap_enabled", ((Boolean) AnonymousClass0E6.m1316B(AnonymousClass0CC.uU)).booleanValue()).m3298F("guid", AnonymousClass0Dt.f1941C.m1313B()).m3300H("updated", z).m3310R();
        AnonymousClass0cQ.m5858H(this, 1505966383, I2);
        AnonymousClass0cQ.m5858H(this, 239050569, I);
    }
}
