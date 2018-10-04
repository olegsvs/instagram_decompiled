package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.1d9 */
public final class AnonymousClass1d9 extends AnonymousClass17n {
    /* renamed from: B */
    public long f20706B;
    /* renamed from: C */
    public final /* synthetic */ Context f20707C;
    /* renamed from: D */
    public final /* synthetic */ String f20708D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0Cn f20709E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass1BD f20710F;

    public AnonymousClass1d9(String str, Context context, AnonymousClass1BD anonymousClass1BD, AnonymousClass0Cn anonymousClass0Cn) {
        this.f20708D = str;
        this.f20707C = context;
        this.f20710F = anonymousClass1BD;
        this.f20709E = anonymousClass0Cn;
    }

    /* renamed from: A */
    public final void mo1811A(Exception exception) {
        super.mo1811A(exception);
        AnonymousClass0Fr.ResponseFromHSiteNotReceived.m1685A().m3295C("duration_ms", AnonymousClass1BF.m9794E() - this.f20706B).m3298F("reason", exception != null ? exception.getClass().getSimpleName() : "cannot tell").m3310R();
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void mo1812B(Object obj) {
        AnonymousClass3R1 anonymousClass3R1 = (AnonymousClass3R1) obj;
        AnonymousClass0Fr.ResponseFromHSiteReceived.m1685A().m3295C("duration_ms", AnonymousClass1BF.m9794E() - this.f20706B).m3300H(RealtimeConstants.SEND_SUCCESS, anonymousClass3R1.f41192C).m3300H("encr_phone_num_avail", TextUtils.isEmpty(anonymousClass3R1.f41191B) ^ 1).m3310R();
        if ((TextUtils.isEmpty(anonymousClass3R1.f41191B) ^ 1) != 0) {
            AnonymousClass1BF.m9792C(this.f20707C, anonymousClass3R1.f41191B, this.f20710F, this.f20709E);
        }
    }

    public final /* bridge */ /* synthetic */ Object call() {
        AnonymousClass0gN anonymousClass0gN = new AnonymousClass0gN();
        anonymousClass0gN.f8152H = AnonymousClass0Qv.API;
        AnonymousClass0aA A = anonymousClass0gN.m6617A();
        String str = this.f20708D;
        AnonymousClass0aB anonymousClass0aB = new AnonymousClass0aB(AnonymousClass0G7.m1740G());
        anonymousClass0aB.f6464D = AnonymousClass0Pu.GET;
        anonymousClass0aB.f6466F = str;
        return (AnonymousClass3R1) new AnonymousClass3R0().B(AnonymousClass0aD.m5438B().m5439A(new AnonymousClass0aC(anonymousClass0aB.m5435B(), A)));
    }

    public final void onStart() {
        super.onStart();
        this.f20706B = AnonymousClass1BF.m9794E();
    }
}
