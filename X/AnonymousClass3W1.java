package X;

import android.text.TextUtils;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.3W1 */
public final class AnonymousClass3W1 extends AnonymousClass0Iw {
    /* renamed from: B */
    public boolean f41824B;
    /* renamed from: C */
    public AnonymousClass0Cm f41825C;

    public AnonymousClass3W1(AnonymousClass0Cm anonymousClass0Cm, boolean z) {
        this.f41825C = anonymousClass0Cm;
        this.f41824B = z;
    }

    /* renamed from: B */
    public static void m19788B(boolean z, boolean z2, boolean z3) {
        AnonymousClass0Fr.FetchEmailInNuxResult.A().H("has_email", z2).H("used_oauth", z3).H(RealtimeConstants.SEND_SUCCESS, z).R();
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 1857572247);
        AnonymousClass3W1.m19788B(false, false, this.f41824B);
        AnonymousClass0cQ.H(this, -502944996, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 2066736474);
        AnonymousClass2ME anonymousClass2ME = (AnonymousClass2ME) obj;
        int I2 = AnonymousClass0cQ.I(this, 1405532410);
        if (TextUtils.isEmpty(anonymousClass2ME.f29521B)) {
            AnonymousClass3W1.m19788B(true, false, this.f41824B);
        } else {
            AnonymousClass3W0 B = AnonymousClass3W0.m19786B(this.f41825C);
            AnonymousClass3Vz A = B.m19787A();
            if (A == null || TextUtils.isEmpty(A.f41819B) || (!A.f41820C && this.f41824B)) {
                AnonymousClass3Vz anonymousClass3Vz = new AnonymousClass3Vz(anonymousClass2ME.f29521B, this.f41824B);
                synchronized (B) {
                    B.f41822C = anonymousClass3Vz;
                }
            }
            AnonymousClass3W1.m19788B(true, true, this.f41824B);
        }
        AnonymousClass0cQ.H(this, 50863838, I2);
        AnonymousClass0cQ.H(this, -647594029, I);
    }
}
