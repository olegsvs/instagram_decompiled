package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.C0164R;

/* renamed from: X.36M */
public final class AnonymousClass36M extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ Context f37827B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass4DM f37828C;

    public AnonymousClass36M(AnonymousClass4DM anonymousClass4DM, Context context) {
        this.f37828C = anonymousClass4DM;
        this.f37827B = context;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -207849587);
        super.onFail(anonymousClass0Q6);
        CharSequence string = this.f37827B.getString(C0164R.string.error_msg_edit_business_profile);
        if (anonymousClass0Q6.B() && !TextUtils.isEmpty(((AnonymousClass34z) anonymousClass0Q6.f4288C).A())) {
            string = ((AnonymousClass34z) anonymousClass0Q6.f4288C).A();
        }
        AnonymousClass0IL anonymousClass0IL = this.f37828C;
        AnonymousClass34H.m18403L(anonymousClass0IL.f51563D, AnonymousClass33Y.m18332G(null, string));
        AnonymousClass33Z.m18344I("edit_profile", anonymousClass0IL.f51565F, string, AnonymousClass0a2.I(anonymousClass0IL.f51576Q));
        if (TextUtils.isEmpty(anonymousClass0IL.f51561B.getNationalNumber())) {
            AnonymousClass0OR.D(anonymousClass0IL.f51566G, new AnonymousClass4DA(anonymousClass0IL), -1956208322);
        } else if (anonymousClass0IL.f51575P) {
            anonymousClass0IL.f51561B.f37711D.setVisibility(0);
        } else {
            AnonymousClass0IG.H(anonymousClass0IL.getContext(), string);
        }
        AnonymousClass0cQ.H(this, -706941354, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -1854478953);
        super.onFinish();
        AnonymousClass4DM.m23556F(this.f37828C, false);
        AnonymousClass0cQ.H(this, -305261743, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, 507359463);
        super.onStart();
        AnonymousClass4DM.m23556F(this.f37828C, true);
        AnonymousClass0cQ.H(this, 188222089, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -68847857);
        AnonymousClass34z anonymousClass34z = (AnonymousClass34z) obj;
        int I2 = AnonymousClass0cQ.I(this, 2098779333);
        super.onSuccess(anonymousClass34z);
        if (anonymousClass34z != null) {
            AnonymousClass4DM anonymousClass4DM = this.f37828C;
            String str = anonymousClass34z.f37645B;
            AnonymousClass34H.m18404M(anonymousClass4DM.f51563D, AnonymousClass33Y.m18334I("phone", str));
            String str2 = anonymousClass4DM.f51565F;
            AnonymousClass0wt.BUSINESS_CONVERSION_FETCH_DATA.A().F("step", "edit_profile").F("entry_point", str2).F("fb_user_id", AnonymousClass0a2.I(anonymousClass4DM.f51576Q)).F("phone", str).R();
            AnonymousClass0OR.D(anonymousClass4DM.f51566G, new AnonymousClass4DA(anonymousClass4DM), -1956208322);
        }
        AnonymousClass0cQ.H(this, 779854105, I2);
        AnonymousClass0cQ.H(this, 504034684, I);
    }
}
