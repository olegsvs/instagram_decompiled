package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.Toast;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.actionbar.ActionButton;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;
import java.util.EnumSet;

/* renamed from: X.50A */
public final class AnonymousClass50A extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass3Xl, AnonymousClass3jW, AnonymousClass0IT, AnonymousClass0Pe, AnonymousClass3a1 {
    /* renamed from: O */
    public static final EnumSet f59203O = EnumSet.of(AnonymousClass1P7.ARGUMENT_EDIT_PROFILE_FLOW, AnonymousClass1P7.ARGUMENT_ADD_PHONE_NUMBER_FLOW);
    /* renamed from: B */
    public String f59204B;
    /* renamed from: C */
    public EditPhoneNumberView f59205C;
    /* renamed from: D */
    public AnonymousClass1P7 f59206D;
    /* renamed from: E */
    public final Handler f59207E = new Handler();
    /* renamed from: F */
    public boolean f59208F;
    /* renamed from: G */
    public String f59209G;
    /* renamed from: H */
    public AnonymousClass0Cm f59210H;
    /* renamed from: I */
    private boolean f59211I;
    /* renamed from: J */
    private AnonymousClass55n f59212J;
    /* renamed from: K */
    private final Runnable f59213K = new AnonymousClass509(this);
    /* renamed from: L */
    private final AnonymousClass0Iw f59214L = new AnonymousClass507(this);
    /* renamed from: M */
    private ActionButton f59215M;
    /* renamed from: N */
    private final AnonymousClass0Iw f59216N = new AnonymousClass505(this);

    public final void Iy() {
    }

    public final void fd() {
    }

    public final String getModuleName() {
        return "phone_number_entry";
    }

    public final boolean onBackPressed() {
        return false;
    }

    /* renamed from: B */
    public static String m25561B(AnonymousClass50A anonymousClass50A) {
        anonymousClass50A = anonymousClass50A.f59210H;
        if (anonymousClass50A == null) {
            return null;
        }
        return anonymousClass50A.f1759C;
    }

    /* renamed from: C */
    public static void m25562C(AnonymousClass50A anonymousClass50A, AnonymousClass2Di anonymousClass2Di, boolean z) {
        boolean z2 = anonymousClass50A.f59206D == AnonymousClass1P7.ARGUMENT_TWOFAC_FLOW;
        Bundle C = AnonymousClass3a3.C(anonymousClass50A.f59205C.getPhoneNumber(), anonymousClass50A.f59205C.getCountryCodeWithoutPlus(), anonymousClass50A.f59205C.getPhone(), z2, z2 ^ 1, anonymousClass2Di.A());
        C.putBoolean("AUTO_CONFIRM_SMS", z);
        AnonymousClass0Sy.G(new AnonymousClass236(new AnonymousClass0IZ(anonymousClass50A.getActivity()).F(AnonymousClass0GO.C().A().I(), C).E(anonymousClass50A, 0).A()));
    }

    /* renamed from: D */
    public static void m25563D(AnonymousClass50A anonymousClass50A) {
        AnonymousClass0GA H;
        if (f59203O.contains(anonymousClass50A.f59206D)) {
            if (TextUtils.isEmpty(anonymousClass50A.f59205C.getPhone())) {
                anonymousClass50A.getActivity().onBackPressed();
                AnonymousClass0F4.f2058E.B(new AnonymousClass2Ec(AnonymousClass50A.m25561B(anonymousClass50A), JsonProperty.USE_DEFAULT_NAME));
            } else if (AnonymousClass0E6.E(AnonymousClass0CS.f1631B) || !((Boolean) AnonymousClass0CC.tY.H(anonymousClass50A.f59210H)).booleanValue()) {
                H = AnonymousClass1fh.H(anonymousClass50A.f59210H, anonymousClass50A.f59205C.getPhoneNumber());
                H.f2849B = anonymousClass50A.f59216N;
                anonymousClass50A.schedule(H);
            } else {
                if (((Boolean) AnonymousClass0CC.uY.H(anonymousClass50A.f59210H)).booleanValue()) {
                    AnonymousClass3Xr.f42125E.B(anonymousClass50A.getActivity(), anonymousClass50A.f59205C.getPhoneNumber(), AnonymousClass2Na.PHONE_ENTRY, false, anonymousClass50A);
                }
                H = AnonymousClass1fh.F(anonymousClass50A.f59205C.getPhoneNumber(), AnonymousClass0i7.B().C(), anonymousClass50A.f59210H);
                H.f2849B = anonymousClass50A.f59214L;
                anonymousClass50A.schedule(H);
            }
        } else if (anonymousClass50A.f59206D != AnonymousClass1P7.ARGUMENT_TWOFAC_FLOW) {
            AnonymousClass0Fr.RegNextPressed.C(AnonymousClass2Na.PHONE_ENTRY).H("one_click", false).R();
            anonymousClass50A.m25565F();
        } else if (TextUtils.isEmpty(anonymousClass50A.f59205C.getPhoneNumber())) {
            Toast.makeText(anonymousClass50A.getActivity(), anonymousClass50A.getString(C0164R.string.phone_number_toast_number_required), 0).show();
        } else {
            H = AnonymousClass2DM.E(anonymousClass50A.getContext(), anonymousClass50A.f59210H, anonymousClass50A.f59205C.getPhoneNumber());
            H.f2849B = anonymousClass50A.f59216N;
            anonymousClass50A.schedule(H);
        }
    }

    /* renamed from: E */
    public static void m25564E(AnonymousClass50A anonymousClass50A) {
        AnonymousClass0GA G = AnonymousClass1fi.G(anonymousClass50A.getContext(), null, anonymousClass50A.f59205C.getPhoneNumber(), false);
        G.f2849B = new AnonymousClass504(anonymousClass50A, anonymousClass50A);
        anonymousClass50A.schedule(G);
    }

    /* renamed from: F */
    private void m25565F() {
        if (this.f59212J != null) {
            if (((Boolean) AnonymousClass0E6.B(AnonymousClass0CC.f1445H)).booleanValue()) {
                AnonymousClass0GA anonymousClass0n3 = new AnonymousClass0n3(new AnonymousClass55q(this.f59205C.getPhone(), AnonymousClass565.Phone, this.f59212J, AnonymousClass0Dt.B(getContext())));
                anonymousClass0n3.f9990B = new AnonymousClass503(this);
                schedule(anonymousClass0n3);
                return;
            }
        }
        AnonymousClass50A.m25564E(this);
    }

    /* renamed from: G */
    private void m25566G() {
        if (getView() != null) {
            ActionButton actionButton = this.f59215M;
        }
    }

    public final void Hy(Context context, String str, String str2) {
        context = AnonymousClass1fh.K(this.f59210H, str2, str, true);
        context.f2849B = new AnonymousClass3Y0(str2, str);
        AnonymousClass0Ix.D(context);
    }

    public final boolean Lk(int i) {
        if (i != 2) {
            return false;
        }
        if (this.f59215M.isEnabled()) {
            AnonymousClass50A.m25563D(this);
        }
        return true;
    }

    public final void SNA(CountryCodeData countryCodeData) {
        this.f59205C.setCountryCodeWithPlus(countryCodeData);
    }

    public final void VFA() {
        m25566G();
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        ActionButton e = anonymousClass0eT.e(C0164R.string.phone_number, new AnonymousClass508(this));
        this.f59215M = e;
        Object obj = (this.f59208F && this.f59205C.getPhoneNumber().equalsIgnoreCase(this.f59204B)) ? 1 : null;
        e.setVisibility(obj != null ? 8 : 0);
        m25566G();
        this.f59211I = true;
    }

    public final void lEA() {
        if (this.f59211I) {
            AnonymousClass0eT.D(AnonymousClass0eT.E(getActivity()));
        }
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1196399909);
        super.onCreate(bundle);
        this.f59206D = AnonymousClass1P7.B(getArguments());
        this.f59210H = AnonymousClass0Ce.G(getArguments());
        AnonymousClass0cQ.G(this, -596575268, F);
    }

    public final android.view.View onCreateView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r10 = this;
        r0 = 2112595722; // 0x7deba70a float:3.9154487E37 double:1.04376097E-314;
        r3 = X.AnonymousClass0cQ.F(r10, r0);
        r1 = 2131427766; // 0x7f0b01b6 float:1.8477158E38 double:1.053065236E-314;
        r0 = 0;
        r4 = r11.inflate(r1, r12, r0);
        r0 = 2131298439; // 0x7f090887 float:1.8214851E38 double:1.0530013397E-314;
        r0 = r4.findViewById(r0);
        r0 = (com.instagram.ui.widget.editphonenumber.EditPhoneNumberView) r0;
        r10.f59205C = r0;
        r0 = r10.getArguments();
        if (r0 == 0) goto L_0x00db;
    L_0x0020:
        r0 = r10.getArguments();
        r0 = X.AnonymousClass3a3.D(r0);
        r10.f59204B = r0;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x006e;
    L_0x0030:
        r5 = r10.getContext();
        r1 = r10.getArguments();
        r0 = "COUNTRY_CODE";
        r2 = r1.getString(r0);
        r0 = android.text.TextUtils.isEmpty(r2);
        if (r0 == 0) goto L_0x004d;
    L_0x0044:
        r0 = X.AnonymousClass3a3.E(r5);
        r5 = r0.A();
        goto L_0x005e;
    L_0x004d:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "+";
        r1.append(r0);
        r1.append(r2);
        r5 = r1.toString();
    L_0x005e:
        r2 = r10.f59205C;
        r1 = r10.getArguments();
        r0 = "NATIONAL_NUMBER";
        r0 = r1.getString(r0);
        r2.setupEditPhoneNumberView(r5, r0);
        goto L_0x00cf;
    L_0x006e:
        r1 = r10.getActivity();
        r0 = X.AnonymousClass2Na.PHONE_ENTRY;
        r0 = X.AnonymousClass3a8.C(r1, r0);
        if (r0 == 0) goto L_0x00cf;
    L_0x007a:
        r2 = r0.f28037B;
        r0 = r10.getActivity();	 Catch:{ 1w5 -> 0x00cf }
        r0 = X.AnonymousClass3a3.E(r0);	 Catch:{ 1w5 -> 0x00cf }
        r1 = r0.f28032B;	 Catch:{ 1w5 -> 0x00cf }
        r0 = r10.getActivity();	 Catch:{ 1w5 -> 0x00cf }
        r0 = com.facebook.phonenumbers.PhoneNumberUtil.C(r0);	 Catch:{ 1w5 -> 0x00cf }
        r9 = r0.T(r2, r1);	 Catch:{ 1w5 -> 0x00cf }
        r0 = X.AnonymousClass0CS.f1631B;	 Catch:{ 1w5 -> 0x00cf }
        r0 = X.AnonymousClass0E6.E(r0);	 Catch:{ 1w5 -> 0x00cf }
        if (r0 != 0) goto L_0x00cf;	 Catch:{ 1w5 -> 0x00cf }
    L_0x009a:
        r1 = X.AnonymousClass0CC.vY;	 Catch:{ 1w5 -> 0x00cf }
        r0 = r10.f59210H;	 Catch:{ 1w5 -> 0x00cf }
        r0 = r1.H(r0);	 Catch:{ 1w5 -> 0x00cf }
        r0 = (java.lang.Boolean) r0;	 Catch:{ 1w5 -> 0x00cf }
        r0 = r0.booleanValue();	 Catch:{ 1w5 -> 0x00cf }
        if (r0 == 0) goto L_0x00cf;	 Catch:{ 1w5 -> 0x00cf }
    L_0x00aa:
        r8 = r10.f59205C;	 Catch:{ 1w5 -> 0x00cf }
        r5 = "%d";	 Catch:{ 1w5 -> 0x00cf }
        r2 = 1;	 Catch:{ 1w5 -> 0x00cf }
        r1 = new java.lang.Object[r2];	 Catch:{ 1w5 -> 0x00cf }
        r0 = r9.f24496C;	 Catch:{ 1w5 -> 0x00cf }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ 1w5 -> 0x00cf }
        r7 = 0;	 Catch:{ 1w5 -> 0x00cf }
        r1[r7] = r0;	 Catch:{ 1w5 -> 0x00cf }
        r6 = X.AnonymousClass0IE.E(r5, r1);	 Catch:{ 1w5 -> 0x00cf }
        r2 = new java.lang.Object[r2];	 Catch:{ 1w5 -> 0x00cf }
        r0 = r9.f24507N;	 Catch:{ 1w5 -> 0x00cf }
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ 1w5 -> 0x00cf }
        r2[r7] = r0;	 Catch:{ 1w5 -> 0x00cf }
        r0 = X.AnonymousClass0IE.E(r5, r2);	 Catch:{ 1w5 -> 0x00cf }
        r8.setupEditPhoneNumberView(r6, r0);	 Catch:{ 1w5 -> 0x00cf }
    L_0x00cf:
        r1 = r10.getArguments();
        r0 = "IS_PHONE_CONFIRMED";
        r0 = r1.getBoolean(r0);
        r10.f59208F = r0;
    L_0x00db:
        r2 = r10.f59205C;
        r1 = r10.f59210H;
        r0 = r10.f59206D;
        r2.A(r1, r10, r10, r0);
        r0 = r10.f59205C;
        r0.requestFocus();
        r1 = f59203O;
        r0 = r10.f59206D;
        r0 = r1.contains(r0);
        if (r0 == 0) goto L_0x0102;
    L_0x00f3:
        r0 = 2131297841; // 0x7f090631 float:1.8213638E38 double:1.0530010443E-314;
        r1 = r4.findViewById(r0);
        r1 = (android.widget.TextView) r1;
        r0 = 2131692835; // 0x7f0f0d23 float:1.9014781E38 double:1.0531961973E-314;
        r1.setText(r0);
    L_0x0102:
        r0 = -1828716266; // 0xffffffff93000116 float:-1.6156407E-27 double:NaN;
        X.AnonymousClass0cQ.G(r10, r0, r3);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.50A.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, -1321708138);
        super.onDestroy();
        AnonymousClass3Xr.f42125E.C(getContext());
        AnonymousClass0cQ.G(this, -894334433, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 583932428);
        super.onDestroyView();
        this.f59205C = null;
        AnonymousClass0cQ.G(this, 1318306072, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -451001097);
        super.onPause();
        AnonymousClass0OR.G(this.f59207E, this.f59213K, -2002595168);
        AnonymousClass0cQ.G(this, -1404588560, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1659353686);
        super.onResume();
        if (getArguments().getBoolean("push_to_next", false)) {
            AnonymousClass0OR.D(this.f59207E, this.f59213K, 1869781590);
        } else {
            EditPhoneNumberView editPhoneNumberView = this.f59205C;
            editPhoneNumberView.f43749E.postDelayed(editPhoneNumberView.f43752H, 200);
        }
        AnonymousClass0cQ.G(this, -1567584986, F);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, -1384329771);
        super.onStart();
        if (this.f59206D == AnonymousClass1P7.ARGUMENT_EDIT_PROFILE_FLOW || this.f59206D == AnonymousClass1P7.ARGUMENT_TWOFAC_FLOW) {
            if (Z() instanceof AnonymousClass0Hj) {
                ((AnonymousClass0Hj) Z()).CSA(8);
            }
            AnonymousClass3Xr.f42125E.C(getContext());
        }
        AnonymousClass0cQ.G(this, -647072891, F);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.F(this, -1481032813);
        AnonymousClass0Nm.N(getView());
        getActivity().getWindow().setSoftInputMode(3);
        super.onStop();
        AnonymousClass0cQ.G(this, -526455746, F);
    }

    public final boolean vU() {
        if (this.f59206D == AnonymousClass1P7.ARGUMENT_TWOFAC_FLOW) {
            getFragmentManager().N(null, 1);
            AnonymousClass0IL A = AnonymousClass0GO.C().A().A(this.f59210H);
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(getActivity());
            anonymousClass0IZ.f2754D = A;
            anonymousClass0IZ.B();
        } else {
            getFragmentManager().N("PhoneNumberEntryFragment.BACKSTATE_NAME", 1);
            AnonymousClass0F4.f2058E.B(new AnonymousClass2Ec(AnonymousClass50A.m25561B(this), this.f59209G));
        }
        return true;
    }
}
