package X;

import android.os.Bundle;
import android.widget.TextView;
import com.instagram.nux.ui.NotificationBar;

/* renamed from: X.56a */
public final class AnonymousClass56a extends AnonymousClass0IJ implements AnonymousClass3XE, AnonymousClass0IS, AnonymousClass0EJ {
    /* renamed from: B */
    public NotificationBar f60165B;
    /* renamed from: C */
    public String f60166C;
    /* renamed from: D */
    public AnonymousClass3XF f60167D;
    /* renamed from: E */
    public String f60168E;
    /* renamed from: F */
    public final AnonymousClass0Iw f60169F = new AnonymousClass56Y(this);
    /* renamed from: G */
    private TextView f60170G;
    /* renamed from: H */
    private TextView f60171H;
    /* renamed from: I */
    private TextView f60172I;

    public final void FH() {
    }

    public final boolean KY() {
        return true;
    }

    public final void bG() {
    }

    public final String getModuleName() {
        return "nux_additional_contact";
    }

    public final void onAppForegrounded() {
    }

    /* renamed from: B */
    public static void m25740B(AnonymousClass56a anonymousClass56a, boolean z) {
        AnonymousClass0Ok B = AnonymousClass1PJ.B(anonymousClass56a.getActivity());
        if (B != null) {
            B.hb(z);
        } else {
            new AnonymousClass3XI(anonymousClass56a, AnonymousClass0Ce.G(anonymousClass56a.getArguments()), anonymousClass56a).A();
        }
    }

    public final void Bv(boolean z) {
        this.f60170G.setEnabled(z);
    }

    public final AnonymousClass0Oh DM() {
        return AnonymousClass0Oh.EMAIL;
    }

    public final AnonymousClass2Na IS() {
        return AnonymousClass2Na.ADDITIONAL_CONTACT;
    }

    public final void ms() {
        AnonymousClass0GA K = AnonymousClass1fh.K(AnonymousClass0Ce.G(getArguments()), this.f60166C, this.f60168E, false);
        K.f2849B = this.f60169F;
        schedule(K);
        AnonymousClass0Fr.RegNextPressed.C(IS()).R();
    }

    public final void onAppBackgrounded() {
        AnonymousClass0Fr.StepViewBackgrounded.C(IS()).R();
    }

    public final boolean onBackPressed() {
        AnonymousClass0Fr.RegBackPressed.C(IS()).R();
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -400610349);
        super.onCreate(bundle);
        this.f60168E = getArguments().getString("verification_code");
        this.f60166C = getArguments().getString("phone_number");
        AnonymousClass0LH.E(this.f60168E);
        AnonymousClass0LH.E(this.f60166C);
        AnonymousClass0cQ.G(this, 1770111685, F);
    }

    public final android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r0 = -1667755995; // 0xffffffff9c981025 float:-1.006269E-21 double:NaN;
        r3 = X.AnonymousClass0cQ.F(r7, r0);
        r1 = X.AnonymousClass0Fr.RegScreenLoaded;
        r0 = r7.IS();
        r0 = r1.C(r0);
        r0.R();
        r4 = X.AnonymousClass3Xc.C(r8, r9);
        r0 = 2131296891; // 0x7f09027b float:1.8211711E38 double:1.053000575E-314;
        r1 = r4.findViewById(r0);
        r1 = (android.view.ViewGroup) r1;
        r0 = X.AnonymousClass3Xc.I();
        if (r0 == 0) goto L_0x002b;
    L_0x0027:
        r0 = 2131428336; // 0x7f0b03f0 float:1.8478314E38 double:1.0530655174E-314;
        goto L_0x002e;
    L_0x002b:
        r0 = 2131428353; // 0x7f0b0401 float:1.8478348E38 double:1.053065526E-314;
    L_0x002e:
        r2 = 1;
        r8.inflate(r0, r1, r2);
        r0 = 2131298308; // 0x7f090804 float:1.8214585E38 double:1.053001275E-314;
        r0 = r4.findViewById(r0);
        r0 = (com.instagram.nux.ui.NotificationBar) r0;
        r7.f60165B = r0;
        r0 = 2131299476; // 0x7f090c94 float:1.8216954E38 double:1.053001852E-314;
        r1 = r4.findViewById(r0);
        r1 = (android.widget.TextView) r1;
        r7.f60170G = r1;
        r0 = 2131692816; // 0x7f0f0d10 float:1.9014743E38 double:1.053196188E-314;
        r1.setText(r0);
        r1 = r7.f60170G;
        r0 = new X.56Z;
        r0.<init>(r7);
        r1.setOnClickListener(r0);
        r0 = 2131297365; // 0x7f090455 float:1.8212673E38 double:1.053000809E-314;
        r0 = r4.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r7.f60171H = r0;
        r0 = 2131297369; // 0x7f090459 float:1.821268E38 double:1.053000811E-314;
        r0 = r4.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r7.f60172I = r0;
        r6 = r7.f60166C;
        r0 = r7.getActivity();	 Catch:{ 1w5 -> 0x008d }
        r5 = com.facebook.phonenumbers.PhoneNumberUtil.C(r0);	 Catch:{ 1w5 -> 0x008d }
        r0 = r7.getActivity();	 Catch:{ 1w5 -> 0x008d }
        r0 = X.AnonymousClass3a3.E(r0);	 Catch:{ 1w5 -> 0x008d }
        r0 = r0.f28032B;	 Catch:{ 1w5 -> 0x008d }
        r1 = r5.T(r6, r0);	 Catch:{ 1w5 -> 0x008d }
        r0 = X.AnonymousClass1wD.NATIONAL;	 Catch:{ 1w5 -> 0x008d }
        r6 = r5.C(r1, r0);	 Catch:{ 1w5 -> 0x008d }
        goto L_0x009a;	 Catch:{ 1w5 -> 0x008d }
    L_0x008d:
        r1 = X.AnonymousClass0Fr.AdditionalPhoneNumberParseFail;
        r0 = r7.IS();
        r0 = r1.C(r0);
        r0.R();
    L_0x009a:
        r0 = X.AnonymousClass0CC.Fi;
        r0 = r0.G();
        r0 = (java.lang.Boolean) r0;
        r5 = r0.booleanValue();
        r1 = r7.getResources();
        if (r5 == 0) goto L_0x00b0;
    L_0x00ac:
        r0 = 2131689634; // 0x7f0f00a2 float:1.9008289E38 double:1.053194616E-314;
        goto L_0x00b3;
    L_0x00b0:
        r0 = 2131689633; // 0x7f0f00a1 float:1.9008287E38 double:1.0531946153E-314;
    L_0x00b3:
        r1 = r1.getString(r0);
        r0 = new java.lang.Object[r2];
        r2 = 0;
        r0[r2] = r6;
        r1 = X.AnonymousClass0IE.E(r1, r0);
        r0 = r7.f60172I;
        r0.setText(r1);
        r1 = r7.f60171H;
        if (r5 == 0) goto L_0x00cd;
    L_0x00c9:
        r0 = 2131689632; // 0x7f0f00a0 float:1.9008285E38 double:1.053194615E-314;
        goto L_0x00d0;
    L_0x00cd:
        r0 = 2131689631; // 0x7f0f009f float:1.9008283E38 double:1.0531946143E-314;
    L_0x00d0:
        r1.setText(r0);
        r0 = 2131298286; // 0x7f0907ee float:1.821454E38 double:1.053001264E-314;
        r1 = r4.findViewById(r0);
        r1 = (com.instagram.ui.widget.progressbutton.ProgressButton) r1;
        r0 = new android.widget.TextView[r2];
        X.AnonymousClass3Xc.G(r1, r0);
        r0 = new X.3XF;
        r0.<init>(r7, r1);
        r7.f60167D = r0;
        r0 = r7.f60167D;
        r7.registerLifecycleListener(r0);
        r0 = X.AnonymousClass0Fj.f2192B;
        r0.A(r7);
        r0 = 1069600968; // 0x3fc0d0c8 float:1.5063715 double:5.28453093E-315;
        X.AnonymousClass0cQ.G(r7, r0, r3);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.56a.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -934732912);
        super.onDestroyView();
        unregisterLifecycleListener(this.f60167D);
        AnonymousClass0Fj.f2192B.D(this);
        AnonymousClass0cQ.G(this, -754821389, F);
    }
}
