package X;

import android.app.Dialog;
import android.content.Context;
import com.facebook.C0164R;

/* renamed from: X.36G */
public final class AnonymousClass36G extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ Context f37818B;
    /* renamed from: C */
    public final /* synthetic */ Dialog f37819C;
    /* renamed from: D */
    public final /* synthetic */ String f37820D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0Cm f37821E;

    public AnonymousClass36G(Dialog dialog, AnonymousClass0Cm anonymousClass0Cm, Context context, String str) {
        this.f37819C = dialog;
        this.f37821E = anonymousClass0Cm;
        this.f37818B = context;
        this.f37820D = str;
    }

    /* renamed from: A */
    public final void m18517A(X.AnonymousClass359 r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r12 = this;
        r0 = 1159513254; // 0x451cc4a6 float:2508.2905 double:5.728756647E-315;
        r0 = X.AnonymousClass0cQ.I(r12, r0);
        if (r13 == 0) goto L_0x00c8;
    L_0x0009:
        r1 = r13.f37657C;
        if (r1 == 0) goto L_0x0012;
    L_0x000d:
        r1 = r13.f37657C;
        r1.D();
    L_0x0012:
        r1 = r13.f37657C;
        if (r1 == 0) goto L_0x005a;
    L_0x0016:
        r1 = r13.f37657C;
        r1 = r1.lB;
        if (r1 == 0) goto L_0x005a;
    L_0x001c:
        r2 = X.AnonymousClass0CC.UX;
        r1 = r12.f37821E;
        r1 = r2.H(r1);
        r1 = (java.lang.Boolean) r1;
        r1 = r1.booleanValue();
        if (r1 == 0) goto L_0x005a;
    L_0x002c:
        r5 = new X.36F;
        r5.<init>(r12);
        r3 = r12.f37818B;
        r4 = r12.f37821E;
        r6 = "ig_business_profile";
        r7 = r13.f37656B;
        r8 = 1;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r1 = "fb://page/";
        r2.append(r1);
        r1 = r13.f37657C;
        r1 = r1.lB;
        r2.append(r1);
        r1 = "?referrer=ig_onboarding_flow";
        r2.append(r1);
        r9 = r2.toString();
        r10 = 0;
        r11 = 0;
        X.AnonymousClass3Kb.m19426E(r3, r4, r5, r6, r7, r8, r9, r10, r11);
        goto L_0x00c8;
    L_0x005a:
        r1 = r13.f37656B;
        if (r1 == 0) goto L_0x00c8;
    L_0x005e:
        r2 = new java.net.URL;	 Catch:{ MalformedURLException -> 0x00b5 }
        r1 = r13.f37656B;	 Catch:{ MalformedURLException -> 0x00b5 }
        r2.<init>(r1);	 Catch:{ MalformedURLException -> 0x00b5 }
        r3 = r2.getPath();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r1 = X.AnonymousClass36H.f37822B;
        r2.append(r1);
        r2.append(r3);
        r2 = r2.toString();
        r1 = r12.f37818B;
        r3 = X.AnonymousClass0rE.B(r2, r1);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r1 = "access_token=";
        r2.append(r1);
        r1 = r12.f37821E;
        r1 = X.AnonymousClass0a2.B(r1);
        r2.append(r1);
        r7 = r2.toString();
        r1 = r12.f37818B;
        X.AnonymousClass35N.m18454B(r1);
        r2 = r12.f37818B;
        r1 = 2131690935; // 0x7f0f05b7 float:1.9010928E38 double:1.0531952585E-314;
        r5 = r2.getString(r1);
        r1 = r12.f37821E;
        r8 = r1.B();
        r4 = 1;
        r6 = 0;
        r1 = com.instagram.business.payments.PaymentsWebViewActivity.m21681C(r2, r3, r4, r5, r6, r7, r8);
        X.AnonymousClass0IW.I(r1, r2);
        goto L_0x00c8;
    L_0x00b5:
        r3 = "FacebookPageClaimHelper";
        r2 = new java.net.MalformedURLException;
        r1 = "Server should return a valid URL";
        r2.<init>(r1);
        X.AnonymousClass0Gn.L(r3, r2);
        r1 = -1455648175; // 0xffffffffa93c9251 float:-4.1871295E-14 double:NaN;
        X.AnonymousClass0cQ.H(r12, r1, r0);
        return;
    L_0x00c8:
        r1 = "claim_facebook_page_successful";
        X.AnonymousClass2Go.m14904B(r1);
        r4 = r12.f37820D;
        r1 = r12.f37821E;
        r3 = X.AnonymousClass0a2.I(r1);
        r1 = X.AnonymousClass33e.EDIT_PROFILE_SUBMIT;
        r2 = r1.m18380A();
        r1 = "entry_point";
        r2 = r2.F(r1, r4);
        r1 = "fb_user_id";
        r3 = r2.F(r1, r3);
        r2 = "step";
        r1 = "claim_page";
        r1 = r3.F(r2, r1);
        r1.R();
        r1 = r12.f37819C;
        if (r1 == 0) goto L_0x00f9;
    L_0x00f6:
        r1.dismiss();
    L_0x00f9:
        r1 = 1675654375; // 0x63e074e7 float:8.280989E21 double:8.27883261E-315;
        X.AnonymousClass0cQ.H(r12, r1, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.36G.A(X.359):void");
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -2105396470);
        AnonymousClass2Go.m14904B("claim_facebook_page_failed");
        Object C = AnonymousClass35u.m18505C(anonymousClass0Q6, this.f37818B.getString(C0164R.string.request_error));
        AnonymousClass0IG.H(this.f37818B, C);
        String str = this.f37820D;
        AnonymousClass33e.EDIT_PROFILE_SUBMIT_ERROR.m18380A().F("entry_point", str).F("fb_user_id", AnonymousClass0a2.I(this.f37821E)).F("step", "claim_page").F("error_message", C).R();
        AnonymousClass0cQ.H(this, 337001493, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -2062909294);
        super.onFinish();
        Dialog dialog = this.f37819C;
        if (dialog != null) {
            AnonymousClass36H.m18520D(dialog, false);
        }
        AnonymousClass0cQ.H(this, 2055413674, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -1593608286);
        super.onStart();
        Dialog dialog = this.f37819C;
        if (dialog != null) {
            AnonymousClass36H.m18520D(dialog, true);
        }
        AnonymousClass0cQ.H(this, 377403036, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1846700232);
        m18517A((AnonymousClass359) obj);
        AnonymousClass0cQ.H(this, 34513032, I);
    }
}
