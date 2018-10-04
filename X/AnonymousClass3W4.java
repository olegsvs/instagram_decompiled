package X;

import android.content.Context;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/* renamed from: X.3W4 */
public final class AnonymousClass3W4 implements AnonymousClass0TV {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3WA f41828B;
    /* renamed from: C */
    public final /* synthetic */ String f41829C;

    public AnonymousClass3W4(AnonymousClass3WA anonymousClass3WA, String str) {
        this.f41828B = anonymousClass3WA;
        this.f41829C = str;
    }

    public final void Zt(Map map) {
        AnonymousClass1Bb anonymousClass1Bb = (AnonymousClass1Bb) map.get("android.permission.READ_PHONE_STATE");
        AnonymousClass0Fr anonymousClass0Fr = (anonymousClass1Bb == AnonymousClass1Bb.GRANTED ? 1 : null) != null ? AnonymousClass0Fr.ReadPhoneStatePermissionAllowed : AnonymousClass0Fr.ReadPhoneStatePermissionDenied;
        AnonymousClass2Na anonymousClass2Na = AnonymousClass3WA.f41843H;
        AnonymousClass0Oh anonymousClass0Oh = AnonymousClass3WA.f41842G;
        anonymousClass0Fr.G(anonymousClass2Na, anonymousClass0Oh).m15364E();
        if (anonymousClass1Bb == AnonymousClass1Bb.GRANTED) {
            AnonymousClass3WA anonymousClass3WA = this.f41828B;
            String replace = this.f41829C.replace("+", JsonProperty.USE_DEFAULT_NAME);
            anonymousClass3WA.f41845C.c();
            AnonymousClass0Fr.InitiateSilentCallRequestStart.D(anonymousClass2Na, anonymousClass0Oh).B("sim_count", AnonymousClass3WA.m19794B(anonymousClass3WA.f41844B)).R();
            Context context = anonymousClass3WA.f41844B;
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(AnonymousClass0G7.G());
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
            anonymousClass0Pt.f4229M = "accounts/telesign_appverify/";
            AnonymousClass0GA H = anonymousClass0Pt.D("phone_number", replace).D("device_id", AnonymousClass0Dt.B(context)).M(AnonymousClass2aw.class).N().H();
            H.f2849B = new AnonymousClass3W5(anonymousClass3WA, replace);
            AnonymousClass0Ix.D(H);
            return;
        }
        this.f41828B.f41845C.b();
    }
}
