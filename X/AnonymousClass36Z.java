package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.C0164R;
import com.instagram.model.business.BusinessInfo;

/* renamed from: X.36Z */
public final class AnonymousClass36Z extends AnonymousClass1Y5 {
    /* renamed from: B */
    public final /* synthetic */ Context f37856B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass36a f37857C;

    public AnonymousClass36Z(Context context, AnonymousClass0Cm anonymousClass0Cm, BusinessInfo businessInfo, String str, String str2, String str3, String str4, AnonymousClass33X anonymousClass33X, AnonymousClass36a anonymousClass36a, Context context2) {
        this.f37857C = anonymousClass36a;
        this.f37856B = context2;
        super(context, anonymousClass0Cm, businessInfo, str, str2, str3, str4, anonymousClass33X);
    }

    /* renamed from: A */
    public final void m18528A(AnonymousClass3cZ anonymousClass3cZ) {
        int I = AnonymousClass0cQ.I(this, -868264760);
        super.A(anonymousClass3cZ);
        this.f37857C.Mx();
        AnonymousClass0cQ.H(this, 2069049564, I);
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        String str;
        int I = AnonymousClass0cQ.I(this, 255149887);
        super.onFail(anonymousClass0Q6);
        String string = this.f37856B.getString(C0164R.string.error_msg_edit_business_profile);
        if (anonymousClass0Q6.B() && !TextUtils.isEmpty(((AnonymousClass3cZ) anonymousClass0Q6.f4288C).A())) {
            string = ((AnonymousClass3cZ) anonymousClass0Q6.f4288C).A();
        }
        if (anonymousClass0Q6.B()) {
            str = ((AnonymousClass3cZ) anonymousClass0Q6.f4288C).f42759B;
        } else {
            str = "NO_INTERNET";
        }
        AnonymousClass33X anonymousClass33X = this.f19934D;
        if (anonymousClass33X != null) {
            AnonymousClass33X.m18323B(anonymousClass33X, this.f19935E, "submit_error", AnonymousClass33Y.m18327B(this.f19932B, str, string));
        }
        AnonymousClass33Z.m18353R(this.f19933C, this.f19936F, this.f19932B.f27751K, str, string, AnonymousClass1Y5.C(this), this.f19932B.f27750J, AnonymousClass1Y5.B(this), this.f19932B.f27749I, null, AnonymousClass0a2.I(this.f19937G));
        this.f37857C.Bx(string, str);
        AnonymousClass0cQ.H(this, -1311862343, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -1399229220);
        super.onFinish();
        this.f37857C.Ex();
        AnonymousClass0cQ.H(this, 1492536454, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -1220550620);
        super.onStart();
        this.f37857C.Jx();
        AnonymousClass0cQ.H(this, 1765979489, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 1179748017);
        m18528A((AnonymousClass3cZ) obj);
        AnonymousClass0cQ.H(this, 520551826, I);
    }
}
