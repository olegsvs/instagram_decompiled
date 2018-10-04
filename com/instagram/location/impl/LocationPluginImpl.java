package com.instagram.location.impl;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Fj;
import X.AnonymousClass0IL;
import X.AnonymousClass0JI;
import X.AnonymousClass0NN;
import X.AnonymousClass0Sb;
import X.AnonymousClass1Ba;
import X.AnonymousClass1Cy;
import X.AnonymousClass1DO;
import X.AnonymousClass1DP;
import X.AnonymousClass1DQ;
import X.AnonymousClass1Fh;
import X.AnonymousClass1Fl;
import X.AnonymousClass1Fm;
import X.AnonymousClass1Fn;
import X.AnonymousClass1Fq;
import X.AnonymousClass1Fr;
import X.AnonymousClass1Ft;
import X.AnonymousClass1Fv;
import X.AnonymousClass1Fw;
import X.AnonymousClass1Fx;
import X.AnonymousClass1Fy;
import X.AnonymousClass1Fz;
import X.AnonymousClass1G0;
import X.AnonymousClass1G2;
import X.AnonymousClass1G4;
import X.AnonymousClass1G5;
import X.AnonymousClass1G6;
import X.AnonymousClass1G7;
import X.AnonymousClass1G8;
import X.AnonymousClass1G9;
import X.AnonymousClass1jP;
import X.AnonymousClass1mY;
import X.AnonymousClass2kT;
import X.AnonymousClass3Sd;
import X.AnonymousClass47P;
import X.AnonymousClass5jc;
import X.AnonymousClass5jf;
import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Build.VERSION;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.facebook.C0164R;
import com.facebook.location.FbLocationOperationParams;
import com.facebook.location.ImmutableLocation;
import com.facebook.wifiscan.WifiScanConfig;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class LocationPluginImpl extends AnonymousClass0JI {
    /* renamed from: I */
    private static final AnonymousClass47P f16049I = AnonymousClass47P.f50485D;
    /* renamed from: J */
    private static final String[] f16050J = new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN"};
    /* renamed from: B */
    public final Map f16051B = Collections.synchronizedMap(new HashMap());
    /* renamed from: C */
    public final Map f16052C = Collections.synchronizedMap(new HashMap());
    /* renamed from: D */
    public final Map f16053D = Collections.synchronizedMap(new HashMap());
    /* renamed from: E */
    public final Map f16054E = Collections.synchronizedMap(new HashMap());
    /* renamed from: F */
    private final Context f16055F;
    /* renamed from: G */
    private AnonymousClass5jf f16056G;
    /* renamed from: H */
    private final AnonymousClass1Fh f16057H;

    public LocationPluginImpl(Context context) {
        this.f16055F = context;
        this.f16057H = AnonymousClass1Fh.m10366B(context);
    }

    /* renamed from: B */
    public static void m10362B(LocationPluginImpl locationPluginImpl, AnonymousClass1DO anonymousClass1DO, String str) {
        AnonymousClass1DO anonymousClass1DO2 = anonymousClass1DO;
        AnonymousClass1Cy.m9949D(anonymousClass1DO != null);
        LocationPluginImpl locationPluginImpl2 = locationPluginImpl;
        Object G = AnonymousClass1Fh.m10366B(locationPluginImpl2.f16055F).m10374G();
        boolean z = VERSION.SDK_INT >= 23;
        AnonymousClass1Fl anonymousClass1Fl = new AnonymousClass1Fl();
        anonymousClass1Fl.f16089E = z;
        anonymousClass1Fl.f16086B = new AnonymousClass1Fm(500, 15);
        anonymousClass1Fl.f16092H = z;
        anonymousClass1Fl.f16097M = new AnonymousClass1jP(10000, 300000);
        anonymousClass1Fl.f16096L = new WifiScanConfig(true, 600000, 1800000, -1, -1, -85, 10, 15);
        anonymousClass1Fl.f16091G = true;
        AnonymousClass1Fn anonymousClass1Fn = new AnonymousClass1Fn(f16049I);
        anonymousClass1Fn.f16109C = Long.valueOf(300000);
        anonymousClass1Fn.f16111E = 5000;
        anonymousClass1Fn.f16110D = 100.0f;
        anonymousClass1Fn.f16116J = 10000;
        anonymousClass1Fl.f16088D = new FbLocationOperationParams(anonymousClass1Fn);
        anonymousClass1Fl.f16090F = false;
        String str2 = str;
        G.m10376C(new AnonymousClass1Fq(anonymousClass1Fl), str2);
        AnonymousClass1Ft.m10389B(G, new AnonymousClass1Fr(locationPluginImpl2, anonymousClass1DO2), locationPluginImpl2.f16057H.m10371D());
        locationPluginImpl2.f16052C.put(anonymousClass1DO2, G);
        AnonymousClass1Fv anonymousClass1Fv = new AnonymousClass1Fv(locationPluginImpl2, str2);
        locationPluginImpl2.f16054E.put(anonymousClass1DO2, anonymousClass1Fv);
        AnonymousClass0NN H = AnonymousClass0NN.m3291B("ig_location_plugin_package_leak", null).m3295C("timestamp", System.currentTimeMillis()).m3300H("has_leaked", false).m3298F("instance_id", anonymousClass1Fv.f16142C).m3298F("caller_name", anonymousClass1Fv.f16141B).m3300H("is_update_request", true);
        H.f3557G = System.currentTimeMillis();
        H.m3310R();
        locationPluginImpl2.f16057H.m10371D().schedule(new AnonymousClass1Fw(locationPluginImpl2, anonymousClass1DO2, G, str2), 100, TimeUnit.MILLISECONDS);
    }

    /* renamed from: C */
    public static void m10363C(LocationPluginImpl locationPluginImpl, AnonymousClass1DP anonymousClass1DP, String str) {
        AnonymousClass1Fx F = locationPluginImpl.f16057H.m10373F();
        AnonymousClass1Fy anonymousClass1Fy = new AnonymousClass1Fy(new AnonymousClass1Fz(AnonymousClass47P.f50485D));
        locationPluginImpl.f16051B.put(anonymousClass1DP, F);
        AnonymousClass1Fv anonymousClass1Fv = new AnonymousClass1Fv(locationPluginImpl, str);
        locationPluginImpl.f16053D.put(anonymousClass1DP, anonymousClass1Fv);
        AnonymousClass0NN H = AnonymousClass0NN.m3291B("ig_location_plugin_subscription_leak", null).m3295C("timestamp", System.currentTimeMillis()).m3300H("has_leaked", false).m3298F("instance_id", anonymousClass1Fv.f16142C).m3298F("caller_name", anonymousClass1Fv.f16141B).m3300H("is_update_request", true);
        H.f3557G = System.currentTimeMillis();
        H.m3310R();
        F.m10404C(anonymousClass1Fy, new AnonymousClass1G0(locationPluginImpl, anonymousClass1DP, F), str);
        locationPluginImpl.f16057H.m10371D().schedule(new AnonymousClass1G2(locationPluginImpl, anonymousClass1DP, str, F), 100, TimeUnit.MILLISECONDS);
    }

    /* renamed from: D */
    private static String[] m10364D() {
        if (VERSION.SDK_INT >= 23) {
            return f16050J;
        }
        return new String[]{"android.permission.ACCESS_FINE_LOCATION"};
    }

    public void cancelSignalPackageRequest(AnonymousClass1DO anonymousClass1DO) {
        this.f16052C.remove(anonymousClass1DO);
        AnonymousClass1Fv anonymousClass1Fv = (AnonymousClass1Fv) this.f16054E.get(anonymousClass1DO);
        if (anonymousClass1Fv != null) {
            AnonymousClass0NN H = AnonymousClass0NN.m3291B("ig_location_plugin_package_leak", null).m3295C("timestamp", System.currentTimeMillis()).m3300H("has_leaked", false).m3298F("instance_id", anonymousClass1Fv.f16142C).m3298F("caller_name", anonymousClass1Fv.f16141B).m3300H("is_update_request", false);
            H.f3557G = System.currentTimeMillis();
            H.m3310R();
            this.f16054E.remove(anonymousClass1DO);
        }
    }

    public AnonymousClass5jf getFragmentFactory() {
        if (this.f16056G == null) {
            this.f16056G = new AnonymousClass5jf();
        }
        return this.f16056G;
    }

    public Location getLastLocation() {
        ImmutableLocation A = this.f16057H.m10369B().m10408A(Long.MAX_VALUE, Float.MAX_VALUE);
        return A != null ? A.m10421H() : null;
    }

    public Location getLastLocation(long j) {
        ImmutableLocation A = this.f16057H.m10369B().m10408A(j, Float.MAX_VALUE);
        return A != null ? A.m10421H() : null;
    }

    public Location getLastLocation(long j, float f) {
        ImmutableLocation A = this.f16057H.m10369B().m10408A(j, f);
        return A != null ? A.m10421H() : null;
    }

    public boolean isAccurateEnough(Location location) {
        return isAccurateEnough(location, 300000, 100.0f);
    }

    public boolean isAccurateEnough(Location location, long j, float f) {
        if (location == null || !location.hasAccuracy() || location.getAccuracy() > f || new Date().getTime() - location.getTime() >= j) {
            return false;
        }
        return true;
    }

    public boolean isLocationValid(Location location) {
        return AnonymousClass1G4.m10426B(location);
    }

    public Future prefetchLocation(String str) {
        Future anonymousClass2kT = new AnonymousClass2kT();
        AnonymousClass1DP anonymousClass1G5 = new AnonymousClass1G5(this, anonymousClass2kT);
        anonymousClass2kT.oB(new AnonymousClass1G6(this, anonymousClass2kT, anonymousClass1G5), this.f16057H.m10371D());
        requestLocationUpdates(anonymousClass1G5, str);
        return anonymousClass2kT;
    }

    public void removeLocationUpdates(AnonymousClass1DP anonymousClass1DP) {
        AnonymousClass1Fx anonymousClass1Fx = (AnonymousClass1Fx) this.f16051B.get(anonymousClass1DP);
        if (anonymousClass1Fx != null) {
            anonymousClass1Fx.m10407F();
            this.f16051B.remove(anonymousClass1DP);
        }
        AnonymousClass1Fv anonymousClass1Fv = (AnonymousClass1Fv) this.f16053D.get(anonymousClass1DP);
        if (anonymousClass1Fv != null) {
            AnonymousClass0NN H = AnonymousClass0NN.m3291B("ig_location_plugin_subscription_leak", null).m3295C("timestamp", System.currentTimeMillis()).m3300H("has_leaked", false).m3298F("instance_id", anonymousClass1Fv.f16142C).m3298F("caller_name", anonymousClass1Fv.f16141B).m3300H("is_update_request", false);
            H.f3557G = System.currentTimeMillis();
            H.m3310R();
            this.f16053D.remove(anonymousClass1DP);
        }
    }

    public void requestLocationSignalPackage(AnonymousClass1DO anonymousClass1DO, String str) {
        if (AnonymousClass1Ba.m9837C(this.f16055F, m10364D())) {
            m10362B(this, anonymousClass1DO, str);
        }
    }

    public void requestLocationSignalPackage(Activity activity, AnonymousClass1DO anonymousClass1DO, AnonymousClass1DQ anonymousClass1DQ, String str) {
        String[] D = m10364D();
        LocationPluginImpl locationPluginImpl = this;
        boolean C = AnonymousClass1Ba.m9837C(this.f16055F, D);
        AnonymousClass1DO anonymousClass1DO2 = anonymousClass1DO;
        String str2 = str;
        if (C) {
            m10362B(locationPluginImpl, anonymousClass1DO, str);
            return;
        }
        AnonymousClass1DQ anonymousClass1DQ2 = anonymousClass1DQ;
        if (anonymousClass1DQ.XTA()) {
            AnonymousClass1Ba.m9842H(activity, new AnonymousClass1G7(locationPluginImpl, D, anonymousClass1DQ2, anonymousClass1DO2, str2), D);
        }
    }

    public void requestLocationUpdates(AnonymousClass1DP anonymousClass1DP, String str) {
        if (AnonymousClass1Ba.m9838D(this.f16055F, "android.permission.ACCESS_FINE_LOCATION")) {
            m10363C(this, anonymousClass1DP, str);
        }
    }

    public void requestLocationUpdates(Activity activity, AnonymousClass1DP anonymousClass1DP, AnonymousClass1DQ anonymousClass1DQ, String str) {
        if (AnonymousClass1Ba.m9838D(this.f16055F, "android.permission.ACCESS_FINE_LOCATION")) {
            m10363C(this, anonymousClass1DP, str);
        } else if (anonymousClass1DQ.XTA()) {
            AnonymousClass1Ba.m9842H(activity, new AnonymousClass1G8(this, anonymousClass1DQ, anonymousClass1DP, str), r4);
        }
    }

    public void setupForegroundCollection(AnonymousClass0Cm anonymousClass0Cm) {
        Context context = this.f16055F;
        AnonymousClass1G9 anonymousClass1G9 = (AnonymousClass1G9) anonymousClass0Cm.m1036A(AnonymousClass1G9.class);
        if (anonymousClass1G9 == null) {
            anonymousClass1G9 = new AnonymousClass1G9(context, anonymousClass0Cm);
            AnonymousClass0Fj.f2192B.m1666A(anonymousClass1G9);
            anonymousClass0Cm.m1039D(AnonymousClass1G9.class, anonymousClass1G9);
        }
        AnonymousClass1G9.m10429D(anonymousClass1G9);
    }

    public void showLinkedBusinessReportDialog(AnonymousClass0IL anonymousClass0IL, AnonymousClass3Sd anonymousClass3Sd) {
        AnonymousClass1mY.C(anonymousClass0IL);
        AnonymousClass0Sb anonymousClass0Sb = new AnonymousClass0Sb(anonymousClass0IL.getContext());
        anonymousClass0IL = anonymousClass0IL.getActivity();
        CharSequence[] charSequenceArr = new CharSequence[2];
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(anonymousClass0IL.getResources().getString(C0164R.string.related_business_report));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass0Ca.m937C(anonymousClass0IL, C0164R.color.red_4)), 0, spannableStringBuilder.length(), 18);
        charSequenceArr[0] = spannableStringBuilder;
        charSequenceArr[1] = anonymousClass0IL.getString(C0164R.string.cancel);
        anonymousClass0Sb.m4365G(charSequenceArr, new AnonymousClass5jc(anonymousClass3Sd)).m4363E(true).m4364F(true).m4375Q(C0164R.string.related_business_report_title).m4361C().show();
    }
}
