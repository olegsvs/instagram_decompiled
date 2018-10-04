package X;

import android.os.Bundle;
import android.widget.DatePicker.OnDateChangedListener;
import com.facebook.C0164R;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* renamed from: X.5bo */
public final class AnonymousClass5bo extends AnonymousClass5Xf {
    /* renamed from: B */
    public AnonymousClass3Pu f67167B;
    /* renamed from: C */
    public int f67168C;
    /* renamed from: D */
    public int f67169D;
    /* renamed from: E */
    public final OnDateChangedListener f67170E = new AnonymousClass4qx(this);
    /* renamed from: F */
    public int f67171F;
    /* renamed from: G */
    private AnonymousClass4rZ f67172G;

    public final String getModuleName() {
        return "instagram_terms_flow";
    }

    /* renamed from: C */
    public static void m27948C(AnonymousClass5bo anonymousClass5bo) {
        AnonymousClass3Po C = AnonymousClass3Po.C();
        AnonymousClass3Pm anonymousClass3Pm = AnonymousClass3Pm.CONSENT_ACTION;
        AnonymousClass3Pq anonymousClass3Pq = AnonymousClass3Pq.NEXT;
        Calendar instance = Calendar.getInstance();
        AnonymousClass0IL anonymousClass0IL = anonymousClass5bo;
        instance.set(anonymousClass5bo.f67171F, anonymousClass5bo.f67169D, anonymousClass5bo.f67168C);
        C.E(anonymousClass3Pm, anonymousClass3Pq, anonymousClass0IL, anonymousClass5bo.YM(), new SimpleDateFormat(StdDateFormat.DATE_FORMAT_STR_PLAIN).format(instance.getTime()), null);
        anonymousClass5bo.f67172G.m25213A();
        AnonymousClass3Q3 anonymousClass3Q3 = new AnonymousClass3Q3(anonymousClass5bo.getContext(), AnonymousClass3Q9.B().f41084O, AnonymousClass3Q9.B().f41080K, AnonymousClass3Q9.B().f41076G, anonymousClass5bo.f65945C);
        anonymousClass3Q3.f41034B.D("year", Integer.toString(anonymousClass0IL.f67171F)).D("month", Integer.toString(anonymousClass0IL.f67169D + 1)).D("day", Integer.toString(anonymousClass0IL.f67168C));
        anonymousClass3Q3.f41034B.D("gdpr_s", AnonymousClass3Q9.B().f41076G);
        AnonymousClass3Q4.C(anonymousClass3Q3, new AnonymousClass4qs(anonymousClass0IL.getContext(), anonymousClass0IL, anonymousClass0IL.f67172G));
    }

    public final AnonymousClass3Pp YM() {
        return AnonymousClass3Pp.DOB;
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        super.configureActionBar(anonymousClass0eT);
        anonymousClass0eT.a(getString(C0164R.string.date_of_birth));
    }

    public final void ms() {
        AnonymousClass5bo anonymousClass5bo = this;
        super.ms();
        int i = this.f67171F;
        int i2 = this.f67169D;
        int i3 = this.f67168C;
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.set(i, i2, i3);
        i = instance2.get(1) - instance.get(1);
        if (instance2.get(6) < instance.get(6)) {
            i--;
        }
        if (i >= AnonymousClass3Q6.f41060H || AnonymousClass3Q9.B().f41084O != AnonymousClass3Q8.EXISTING_USER) {
            AnonymousClass5bo.m27948C(this);
            return;
        }
        Calendar.getInstance().set(this.f67171F, this.f67169D, this.f67168C);
        AnonymousClass3Po.C().G(AnonymousClass3Pm.CONSENT_VIEW, this, AnonymousClass3Pp.DOB_DIALOG);
        AnonymousClass0Ss.G(getActivity(), getString(C0164R.string.confirm_dob_dialog_title), getString(C0164R.string.confirm_dob_dialog_body_with_age, new Object[]{Integer.valueOf(i)}), anonymousClass5bo, new AnonymousClass4qy(this), new AnonymousClass4qz(this), getString(C0164R.string.confirm), getString(C0164R.string.cancel));
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 566855642);
        super.onCreate(bundle);
        this.f67167B = AnonymousClass3Q9.B().f41073D.f41008C;
        this.f67168C = 1;
        this.f67169D = 0;
        this.f67171F = 1993;
        AnonymousClass0cQ.G(this, -1780335485, F);
    }

    public final android.view.View onCreateView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r10 = this;
        r0 = 1316415812; // 0x4e76e944 float:1.03562061E9 double:6.503958284E-315;
        r2 = X.AnonymousClass0cQ.F(r10, r0);
        r1 = 2131427813; // 0x7f0b01e5 float:1.8477253E38 double:1.053065259E-314;
        r0 = 0;
        r4 = r11.inflate(r1, r12, r0);
        r0 = 2131296904; // 0x7f090288 float:1.8211738E38 double:1.0530005814E-314;
        r6 = r4.findViewById(r0);
        r6 = (android.widget.TextView) r6;
        r0 = 2131298390; // 0x7f090856 float:1.8214752E38 double:1.0530013155E-314;
        r5 = r4.findViewById(r0);
        r5 = (android.widget.LinearLayout) r5;
        r0 = r10.getContext();
        X.AnonymousClass0Ss.E(r0, r6);
        r0 = 2131296522; // 0x7f09010a float:1.8210963E38 double:1.0530003926E-314;
        r8 = r4.findViewById(r0);
        r8 = (android.widget.DatePicker) r8;
        r0 = r10.f67167B;
        if (r0 == 0) goto L_0x0038;
    L_0x0035:
        r3 = r0.f41001B;
        goto L_0x003a;
    L_0x0038:
        r3 = 25;
    L_0x003a:
        r9 = java.util.Calendar.getInstance();
        r0 = r10.f67167B;
        if (r0 == 0) goto L_0x0062;
    L_0x0042:
        r0 = r0.f41006G;
        if (r0 == 0) goto L_0x0062;
    L_0x0046:
        r7 = new java.text.SimpleDateFormat;	 Catch:{ ParseException -> 0x005b }
        r1 = "yyyy-MM-dd";	 Catch:{ ParseException -> 0x005b }
        r0 = java.util.Locale.US;	 Catch:{ ParseException -> 0x005b }
        r7.<init>(r1, r0);	 Catch:{ ParseException -> 0x005b }
        r0 = r10.f67167B;	 Catch:{ ParseException -> 0x005b }
        r0 = r0.f41006G;	 Catch:{ ParseException -> 0x005b }
        r0 = r7.parse(r0);	 Catch:{ ParseException -> 0x005b }
        r9.setTime(r0);	 Catch:{ ParseException -> 0x005b }
        goto L_0x0062;	 Catch:{ ParseException -> 0x005b }
    L_0x005b:
        r1 = "GDPR consent flow";
        r0 = "Today format error";
        X.AnonymousClass0Gn.C(r1, r0);
    L_0x0062:
        r0 = 1;
        r0 = r9.get(r0);
        r0 = r0 - r3;
        r10.f67171F = r0;
        r0 = 2;
        r0 = r9.get(r0);
        r10.f67169D = r0;
        r0 = 5;
        r0 = r9.get(r0);
        r10.f67168C = r0;
        r7 = r10.f67171F;
        r3 = r10.f67169D;
        r1 = r10.f67168C;
        r0 = r10.f67170E;
        r8.init(r7, r3, r1, r0);
        r0 = r9.getTimeInMillis();
        r8.setMaxDate(r0);
        r0 = 2131299557; // 0x7f090ce5 float:1.8217119E38 double:1.053001892E-314;
        r7 = r4.findViewById(r0);
        r7 = (com.instagram.ui.widget.progressbutton.ProgressButton) r7;
        r3 = new X.4rZ;
        r0 = X.AnonymousClass3Q9.B();
        r1 = r0.f41079J;
        r0 = 1;
        r3.<init>(r7, r1, r0, r10);
        r10.f67172G = r3;
        r0 = r10.f67172G;
        r10.registerLifecycleListener(r0);
        r1 = X.AnonymousClass3Po.C();
        r0 = X.AnonymousClass3Pm.CONSENT_VIEW;
        r1.F(r0, r10, r10);
        r0 = r10.f67167B;
        if (r0 == 0) goto L_0x00c3;
    L_0x00b3:
        r0 = r0.f41003D;
        r6.setText(r0);
        r1 = r10.getContext();
        r0 = r10.f67167B;
        r0 = r0.f41005F;
        X.AnonymousClass4rf.m25218B(r1, r5, r0);
    L_0x00c3:
        r0 = 1020933720; // 0x3cda3658 float:0.026637241 double:5.044082777E-315;
        X.AnonymousClass0cQ.G(r10, r0, r2);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5bo.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, 1085215417);
        super.onDestroy();
        if (this.f67167B != null) {
            unregisterLifecycleListener(this.f67172G);
        }
        AnonymousClass0cQ.G(this, -828903085, F);
    }
}
