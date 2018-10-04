package X;

import android.app.Activity;
import com.facebook.C0164R;

/* renamed from: X.4ys */
public final class AnonymousClass4ys extends AnonymousClass3TL {
    /* renamed from: B */
    private final Activity f59056B;
    /* renamed from: C */
    private final AnonymousClass0EE f59057C;
    /* renamed from: D */
    private final AnonymousClass0Ur f59058D;

    public AnonymousClass4ys(Activity activity, AnonymousClass0EE anonymousClass0EE) {
        super(activity, AnonymousClass2Na.FORCE_LOGOUT_LOGIN_STEP, anonymousClass0EE, AnonymousClass3TK.SSO, null, null, null);
        AnonymousClass0Ur anonymousClass0Ur = new AnonymousClass0Ur(activity);
        this.f59058D = anonymousClass0Ur;
        anonymousClass0Ur.A(activity.getString(C0164R.string.logging_in));
        this.f59056B = activity;
        this.f59057C = anonymousClass0EE;
    }

    /* renamed from: A */
    public final AnonymousClass0Fr m25515A() {
        return AnonymousClass0Fr.LogInSso;
    }

    /* renamed from: C */
    public final void m25516C(AnonymousClass2aG anonymousClass2aG) {
        int I = AnonymousClass0cQ.I(this, 8240232);
        AnonymousClass0Ci anonymousClass0Ci = anonymousClass2aG.f31381E;
        AnonymousClass1Pj.I(anonymousClass0Ci.uT());
        AnonymousClass0Cm G = AnonymousClass1Qv.G(this.f59056B, anonymousClass0Ci, false, false);
        if (AnonymousClass0Cd.f1698B.C() == 1) {
            AnonymousClass1Qv.F(G, this.f59056B, this.f59057C, false, null, true);
        } else {
            AnonymousClass0IF.F(this.f59056B, G, anonymousClass0Ci, "feed_force_logout_login", null);
        }
        m25514C(true, this.f59056B.toString(), anonymousClass0Ci, null);
        AnonymousClass0cQ.H(this, 1302954467, I);
    }

    /* renamed from: C */
    private void m25514C(boolean z, String str, AnonymousClass0Ci anonymousClass0Ci, String str2) {
        if (z && anonymousClass0Ci != null) {
            super.B(m25515A(), anonymousClass0Ci);
        }
        AnonymousClass0Fr.ForceLogoutLoginHelperAttempt.C(AnonymousClass2Na.FORCE_LOGOUT_LOGIN_STEP).H("successful", z).B("accounts_count", AnonymousClass0Cd.f1698B.C()).F("current_activity", str).K("error", str2).R();
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1728301658);
        super.onFail(anonymousClass0Q6);
        m25514C(false, this.f59056B.toString(), null, anonymousClass0Q6.f4287B != null ? anonymousClass0Q6.f4287B.getMessage() : "unknown");
        AnonymousClass0cQ.H(this, -911774761, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -1279791941);
        super.onFinish();
        this.f59058D.hide();
        AnonymousClass0cQ.H(this, 764414996, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, 734148448);
        super.onStart();
        this.f59058D.show();
        AnonymousClass0cQ.H(this, -1572239778, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 912942607);
        m25516C((AnonymousClass2aG) obj);
        AnonymousClass0cQ.H(this, 569535819, I);
    }
}
