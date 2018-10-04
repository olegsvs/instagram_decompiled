package X;

import android.text.TextUtils;
import com.facebook.C0164R;

/* renamed from: X.56v */
public final class AnonymousClass56v implements AnonymousClass0F8 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass572 f60241B;

    public AnonymousClass56v(AnonymousClass572 anonymousClass572) {
        this.f60241B = anonymousClass572;
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.I(this, -375440608);
        AnonymousClass0ky anonymousClass0ky = (AnonymousClass0ky) anonymousClass0F6;
        int I2 = AnonymousClass0cQ.I(this, -1141105540);
        if (this.f60241B.isAdded() && !AnonymousClass572.m25778E(this.f60241B)) {
            AnonymousClass0IL anonymousClass0IL = this.f60241B;
            if (!TextUtils.isEmpty(AnonymousClass0i7.B().B())) {
                anonymousClass0IL.f60254D.setCurrentText(anonymousClass0IL.getString(C0164R.string.continue_as_facebook, new Object[]{AnonymousClass0i7.B().B()}));
                anonymousClass0IL.f60257G = true;
            }
            if (AnonymousClass0i7.B().E()) {
                AnonymousClass0Fr.FirstPartyTokenAcquired.F(AnonymousClass2Na.LANDING_STEP).B("fbid", AnonymousClass0i7.B().A()).E();
                AnonymousClass0GA E = AnonymousClass2Eh.E(AnonymousClass0Dt.f1941C.A(anonymousClass0IL.getContext()), anonymousClass0IL.f60256F.f3500C.getBoolean("analytics_device_id_external", false) ? anonymousClass0IL.f60256F.B() : null, AnonymousClass0i7.B().C(), true, "landing");
                E.f2849B = new AnonymousClass571(anonymousClass0IL, "access_token", AnonymousClass0i7.B().C());
                anonymousClass0IL.schedule(E);
            }
        }
        AnonymousClass0cQ.H(this, -1442346133, I2);
        AnonymousClass0cQ.H(this, -300559138, I);
    }
}
