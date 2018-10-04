package com.instagram.business.activity;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0E6;
import X.AnonymousClass0EE;
import X.AnonymousClass0F4;
import X.AnonymousClass0IL;
import X.AnonymousClass0IZ;
import X.AnonymousClass0Ir;
import X.AnonymousClass0LH;
import X.AnonymousClass0Ow;
import X.AnonymousClass0a2;
import X.AnonymousClass0cQ;
import X.AnonymousClass0db;
import X.AnonymousClass1Pt;
import X.AnonymousClass1ga;
import X.AnonymousClass1jJ;
import X.AnonymousClass2Vt;
import X.AnonymousClass33X;
import X.AnonymousClass33Y;
import X.AnonymousClass34I;
import X.AnonymousClass34J;
import X.AnonymousClass34K;
import X.AnonymousClass34L;
import X.AnonymousClass34N;
import X.AnonymousClass34O;
import X.AnonymousClass4BP;
import X.AnonymousClass4BQ;
import X.AnonymousClass4Bq;
import X.AnonymousClass4C1;
import X.AnonymousClass4Co;
import X.AnonymousClass4Cy;
import X.AnonymousClass5Rx;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.controller.datamodel.BusinessConversionFlowStatus;
import com.instagram.business.controller.datamodel.BusinessConversionStep;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.login.api.RegistrationFlowExtras;
import com.instagram.model.business.BusinessInfo;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.webrtc.audio.WebRtcAudioRecord;

public class BusinessConversionActivity extends BaseFragmentActivity implements AnonymousClass0EE, AnonymousClass34I {
    /* renamed from: B */
    public AnonymousClass0IL f12383B;
    /* renamed from: C */
    public AnonymousClass0IL f12384C;
    /* renamed from: D */
    public BusinessInfo f12385D;
    /* renamed from: E */
    public AnonymousClass0IL f12386E;
    /* renamed from: F */
    public AnonymousClass0IL f12387F;
    /* renamed from: G */
    public AnonymousClass0IL f12388G;
    /* renamed from: H */
    public AnonymousClass0IL f12389H;
    /* renamed from: I */
    public AnonymousClass0IL f12390I;
    /* renamed from: J */
    public String f12391J;
    /* renamed from: K */
    public AnonymousClass0IL f12392K;
    /* renamed from: L */
    public AnonymousClass34J f12393L;
    /* renamed from: M */
    public AnonymousClass0IL f12394M;
    /* renamed from: N */
    public AnonymousClass0IL f12395N;
    /* renamed from: O */
    public String f12396O;
    /* renamed from: P */
    public int f12397P;
    /* renamed from: Q */
    public AnonymousClass34L f12398Q;
    /* renamed from: R */
    public final AnonymousClass33X f12399R = new AnonymousClass33X();
    /* renamed from: S */
    public HashSet f12400S = new HashSet();
    /* renamed from: T */
    public AnonymousClass0IL f12401T;
    /* renamed from: U */
    public boolean f12402U;
    /* renamed from: V */
    public boolean f12403V;
    /* renamed from: W */
    public boolean f12404W;
    /* renamed from: X */
    public boolean f12405X;
    /* renamed from: Y */
    public String f12406Y;
    /* renamed from: Z */
    public String f12407Z;
    /* renamed from: a */
    public String f12408a;
    /* renamed from: b */
    public String f12409b;
    /* renamed from: c */
    public AnonymousClass0IL f12410c;
    /* renamed from: d */
    public AnonymousClass0IL f12411d;
    /* renamed from: e */
    public ConversionStep f12412e;
    /* renamed from: f */
    public AnonymousClass0IL f12413f;
    /* renamed from: g */
    public AnonymousClass2Vt f12414g;
    /* renamed from: h */
    public String f12415h;
    /* renamed from: i */
    public AnonymousClass0IL f12416i;
    /* renamed from: j */
    public AnonymousClass0IL f12417j;
    /* renamed from: k */
    public Bundle f12418k;
    /* renamed from: l */
    public String f12419l;
    /* renamed from: m */
    public AnonymousClass0Cm f12420m;
    /* renamed from: n */
    public AnonymousClass34K f12421n;
    /* renamed from: o */
    private boolean f12422o;
    /* renamed from: p */
    private RegistrationFlowExtras f12423p;

    public final String getModuleName() {
        return "business_conversion_activity";
    }

    /* renamed from: B */
    public static boolean m8450B(BusinessConversionActivity businessConversionActivity) {
        AnonymousClass2Vt anonymousClass2Vt = businessConversionActivity.f12414g;
        return (anonymousClass2Vt == null || anonymousClass2Vt.f31076B == null || businessConversionActivity.f12414g.f31076B.f31075B == null || businessConversionActivity.f12414g.f31076B.f31075B.isEmpty()) ? false : true;
    }

    /* renamed from: C */
    public static void m8451C(BusinessConversionActivity businessConversionActivity, ConversionStep conversionStep) {
        if (conversionStep == ConversionStep.f37551Q || conversionStep == ConversionStep.f37545K) {
            businessConversionActivity.f12415h = null;
            businessConversionActivity.f12409b = null;
        }
    }

    /* renamed from: D */
    public static void m8452D(BusinessConversionActivity businessConversionActivity, AnonymousClass0IL anonymousClass0IL) {
        m8453E(businessConversionActivity, anonymousClass0IL, false);
    }

    public final int DG() {
        AnonymousClass34J anonymousClass34J = this.f12393L;
        return AnonymousClass34J.C(anonymousClass34J, anonymousClass34J.f37521D.f37529B + 1) - 1;
    }

    /* renamed from: E */
    public static void m8453E(BusinessConversionActivity businessConversionActivity, AnonymousClass0IL anonymousClass0IL, boolean z) {
        List J = businessConversionActivity.mo382D().mo1458J();
        if (anonymousClass0IL == null) {
            businessConversionActivity.eb();
        } else if (J == null || !J.contains(anonymousClass0IL)) {
            if (anonymousClass0IL.getArguments() == null) {
                anonymousClass0IL.setArguments(new Bundle());
            }
            String str = "IgSessionManager.USER_ID";
            if (TextUtils.isEmpty(anonymousClass0IL.getArguments().getString(str))) {
                anonymousClass0IL.getArguments().putString(str, businessConversionActivity.f12420m.f1759C);
            }
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(businessConversionActivity);
            if (z) {
                anonymousClass0IZ = anonymousClass0IZ.m2307A();
            }
            anonymousClass0IZ.f2752B = businessConversionActivity.oK().name();
            anonymousClass0IZ.f2754D = anonymousClass0IL;
            anonymousClass0IZ.m2308B();
        }
    }

    public final AnonymousClass34L EM() {
        return this.f12398Q;
    }

    /* renamed from: F */
    private void m8454F() {
        AnonymousClass34J anonymousClass34J = this.f12393L;
        BusinessConversionFlowStatus businessConversionFlowStatus = anonymousClass34J.f37521D;
        anonymousClass34J.f37521D = AnonymousClass34N.D(businessConversionFlowStatus, AnonymousClass0Ow.m3685F(anonymousClass34J.f37521D.A()), businessConversionFlowStatus.f37529B, businessConversionFlowStatus.f37529B);
        AnonymousClass34J.B(anonymousClass34J, true);
        m8456H();
    }

    /* renamed from: G */
    private String m8455G() {
        ConversionStep oK = oK();
        if (oK == null) {
            return null;
        }
        return oK.f37555B;
    }

    /* renamed from: H */
    private void m8456H() {
        ConversionStep oK = oK();
        if (oK == null) {
            finish();
            return;
        }
        m8451C(this, oK);
        String str;
        Bundle bundle;
        AnonymousClass0IL anonymousClass1Pt;
        String str2;
        String str3;
        switch (oK.ordinal()) {
            case 0:
                AnonymousClass0LH.m2930H(this.f12397P != -1);
                if (this.f12401T == null) {
                    AnonymousClass0Ir.f2848B.mo557A();
                    str = this.f12396O;
                    int i = this.f12397P;
                    bundle = new Bundle();
                    bundle.putString("entry_point", str);
                    bundle.putString("edit_profile_entry", null);
                    bundle.putInt("entry_position", i);
                    anonymousClass1Pt = new AnonymousClass1Pt();
                    anonymousClass1Pt.setArguments(bundle);
                    this.f12401T = anonymousClass1Pt;
                }
                m8452D(this, this.f12401T);
                return;
            case 1:
                if (this.f12410c == null) {
                    this.f12410c = AnonymousClass0Ir.f2848B.mo557A().m2372N(this.f12396O, null, null, false, false, null);
                }
                if (LHA() == ConversionStep.f37551Q) {
                    AnonymousClass0IL anonymousClass0IL = this.f12411d;
                    if (anonymousClass0IL != null) {
                        this.f12410c.setTargetFragment(anonymousClass0IL, 0);
                    }
                }
                m8452D(this, this.f12410c);
                return;
            case 2:
                if (this.f12390I == null) {
                    AnonymousClass0Ir.f2848B.mo557A();
                    Parcelable parcelable = this.f12385D;
                    String str4 = this.f12396O;
                    bundle = new Bundle();
                    bundle.putParcelable("business_info", parcelable);
                    bundle.putString("entry_point", str4);
                    bundle.putString("edit_profile_entry", null);
                    bundle.putString("page_access_token", null);
                    bundle.putString("page_name", null);
                    bundle.putBoolean("show_created_page_dialog", false);
                    anonymousClass1Pt = new AnonymousClass4C1();
                    anonymousClass1Pt.setArguments(bundle);
                    this.f12390I = anonymousClass1Pt;
                }
                m8452D(this, this.f12390I);
                return;
            case 3:
                if (this.f12389H == null) {
                    AnonymousClass0Ir.f2848B.mo557A();
                    str2 = this.f12396O;
                    str3 = (String) null;
                    bundle = new Bundle();
                    bundle.putString("edit_profile_entry", str3);
                    bundle.putString("entry_point", str2);
                    anonymousClass1Pt = new AnonymousClass4Cy();
                    anonymousClass1Pt.setArguments(bundle);
                    this.f12389H = anonymousClass1Pt;
                }
                this.f12418k = AnonymousClass33Y.D(this.f12420m);
                m8453E(this, this.f12389H, true);
                return;
            case 4:
                if (this.f12411d == null) {
                    this.f12411d = AnonymousClass0Ir.f2848B.mo557A().m2371M(this.f12396O, null, this.f12419l);
                }
                m8452D(this, this.f12411d);
                return;
            case 5:
                if (this.f12386E == null) {
                    this.f12386E = AnonymousClass0Ir.f2848B.mo557A().m2368J(this.f12396O, null, this.f12408a, this.f12407Z, this.f12406Y);
                }
                m8452D(this, this.f12386E);
                return;
            case 6:
                if (this.f12394M == null) {
                    this.f12394M = AnonymousClass0Ir.f2848B.mo557A().m2370L(this.f12385D, this.f12396O, this.f12415h, null, null, false, this.f12391J, this.f12404W);
                }
                m8452D(this, this.f12394M);
                return;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                if (this.f12413f == null) {
                    this.f12413f = AnonymousClass0Ir.f2848B.mo557A().m2371M(this.f12396O, null, this.f12419l);
                }
                m8452D(this, this.f12413f);
                return;
            case 8:
                if (this.f12388G == null) {
                    AnonymousClass0Ir.f2848B.mo557A();
                    str2 = this.f12396O;
                    bundle = new Bundle();
                    bundle.putString("entry_point", str2);
                    bundle.putString("edit_profile_entry", null);
                    anonymousClass1Pt = new AnonymousClass4Bq();
                    anonymousClass1Pt.setArguments(bundle);
                    this.f12388G = anonymousClass1Pt;
                }
                m8453E(this, this.f12388G, true);
                return;
            case 9:
                if (this.f12387F == null) {
                    AnonymousClass0Ir.f2848B.mo557A();
                    str = this.f12396O;
                    boolean z = this.f12405X;
                    bundle = new Bundle();
                    bundle.putString("entry_point", str);
                    bundle.putString("edit_profile_entry", null);
                    bundle.putBoolean("sign_up_megaphone_entry", z);
                    anonymousClass1Pt = new AnonymousClass4Co();
                    anonymousClass1Pt.setArguments(bundle);
                    this.f12387F = anonymousClass1Pt;
                }
                m8453E(this, this.f12387F, true);
                return;
            case 10:
                if (this.f12417j == null) {
                    this.f12417j = AnonymousClass0Ir.f2848B.mo557A().m2367I(this.f12396O, this.f12419l);
                }
                m8453E(this, this.f12417j, true);
                return;
            case 11:
                if (this.f12392K == null) {
                    this.f12392K = AnonymousClass0Ir.f2848B.mo557A().m2364F(this.f12396O, null);
                }
                m8453E(this, this.f12392K, true);
                return;
            case 12:
                if (this.f12383B == null) {
                    this.f12383B = AnonymousClass0Ir.f2848B.mo557A().m2366H(this.f12396O, new Bundle());
                }
                m8453E(this, this.f12383B, true);
                return;
            case ParserMinimalBase.INT_CR /*13*/:
                if (this.f12384C == null) {
                    AnonymousClass0Ir.f2848B.mo557A();
                    str3 = this.f12396O;
                    bundle = new Bundle();
                    bundle.putString("entry_point", str3);
                    anonymousClass1Pt = new AnonymousClass5Rx();
                    anonymousClass1Pt.setArguments(bundle);
                    this.f12384C = anonymousClass1Pt;
                }
                m8453E(this, this.f12384C, true);
                return;
            case 14:
                if (this.f12416i == null) {
                    this.f12416i = AnonymousClass0Ir.f2848B.mo557A().m2362D(this.f12396O, null, new Bundle());
                }
                m8453E(this, this.f12416i, true);
                return;
            case 15:
                if (this.f12395N == null) {
                    this.f12395N = AnonymousClass0Ir.f2848B.mo557A().m2361C(this.f12396O, null, new Bundle());
                }
                m8453E(this, this.f12395N, true);
                return;
            default:
                eb();
                return;
        }
    }

    /* renamed from: I */
    private void m8457I(Bundle bundle) {
        String str = null;
        this.f12423p = bundle != null ? (RegistrationFlowExtras) bundle.getParcelable("RegistrationFlowExtras.EXTRA_KEY") : null;
        if (bundle != null) {
            str = bundle.getString("error_message");
        }
        this.f12391J = str;
    }

    /* renamed from: K */
    private void m8458K() {
        ConversionStep A = this.f12393L.A();
        AnonymousClass34J anonymousClass34J;
        if (A == ConversionStep.f37545K) {
            anonymousClass34J = this.f12393L;
            BusinessConversionFlowStatus businessConversionFlowStatus = anonymousClass34J.f37521D;
            AnonymousClass0LH.m2927E(businessConversionFlowStatus.A());
            anonymousClass34J.f37521D = AnonymousClass34N.F(businessConversionFlowStatus, businessConversionFlowStatus.f37529B, businessConversionFlowStatus.f37529B - 1);
            this.f12400S.remove(A);
        } else if (A == ConversionStep.f37550P) {
            anonymousClass34J = this.f12393L;
            BusinessConversionFlowStatus businessConversionFlowStatus2 = anonymousClass34J.f37521D;
            AnonymousClass0Cm anonymousClass0Cm = this.f12420m;
            boolean B = m8450B(this);
            boolean z = this.f12404W;
            AnonymousClass1jJ anonymousClass1jJ = new AnonymousClass1jJ();
            if (B) {
                if (!((Boolean) AnonymousClass0CC.PC.m846H(anonymousClass0Cm)).booleanValue()) {
                    anonymousClass1jJ.m12744E(new BusinessConversionStep(ConversionStep.f37548N));
                }
                anonymousClass1jJ.m12744E(new BusinessConversionStep(ConversionStep.f37551Q));
                AnonymousClass34O.B(anonymousClass1jJ, z);
            } else {
                anonymousClass1jJ.m12744E(new BusinessConversionStep(ConversionStep.f37540F));
                AnonymousClass34O.B(anonymousClass1jJ, z);
                if (!((Boolean) AnonymousClass0CC.PC.m846H(anonymousClass0Cm)).booleanValue()) {
                    anonymousClass1jJ.m12744E(new BusinessConversionStep(ConversionStep.f37548N));
                }
                anonymousClass1jJ.m12744E(new BusinessConversionStep(ConversionStep.f37551Q));
            }
            anonymousClass34J.f37521D = AnonymousClass34N.D(businessConversionFlowStatus2, anonymousClass1jJ.m12747H(), businessConversionFlowStatus2.f37529B, businessConversionFlowStatus2.f37529B - 1);
        }
    }

    public final ConversionStep KHA() {
        BusinessConversionFlowStatus businessConversionFlowStatus = this.f12393L.f37521D;
        BusinessConversionStep businessConversionStep = businessConversionFlowStatus.C() ? (BusinessConversionStep) businessConversionFlowStatus.f37530C.get(businessConversionFlowStatus.f37529B + 1) : null;
        if (businessConversionStep == null) {
            return null;
        }
        return businessConversionStep.f37536C;
    }

    public final void KOA(AnonymousClass34L anonymousClass34L) {
        if (this.f12398Q != anonymousClass34L) {
            this.f12398Q = anonymousClass34L;
            this.f12399R.A();
            this.f12399R.f37404B = this.f12398Q.name();
            this.f12399R.B(AnonymousClass0a2.m5424I(this.f12420m), this.f12396O);
            if (oK() == ConversionStep.f37553S) {
                List E;
                BusinessConversionFlowStatus businessConversionFlowStatus = this.f12393L.f37521D;
                if (this.f12398Q == AnonymousClass34L.f37527E) {
                    E = AnonymousClass34O.E();
                } else {
                    E = AnonymousClass34O.D(this.f12420m, this.f12404W);
                }
                this.f12393L.f37521D = AnonymousClass34N.D(businessConversionFlowStatus, E, businessConversionFlowStatus.f37529B + 1, businessConversionFlowStatus.f37529B);
            }
        }
    }

    /* renamed from: L */
    private void m8459L(ConversionStep conversionStep) {
        if (conversionStep != null) {
            List H;
            this.f12400S.add(conversionStep);
            AnonymousClass34J anonymousClass34J = this.f12393L;
            BusinessConversionFlowStatus businessConversionFlowStatus = anonymousClass34J.f37521D;
            BusinessConversionStep businessConversionStep = new BusinessConversionStep(conversionStep);
            int i = businessConversionFlowStatus.f37529B + 1;
            int i2 = businessConversionFlowStatus.f37529B;
            boolean z = businessConversionFlowStatus != null && businessConversionStep != null && i >= 0 && i <= businessConversionFlowStatus.f37530C.size();
            AnonymousClass0LH.m2930H(z);
            if (i == businessConversionFlowStatus.f37530C.size()) {
                AnonymousClass1jJ anonymousClass1jJ = new AnonymousClass1jJ();
                anonymousClass1jJ.m12745F(businessConversionFlowStatus.f37530C);
                anonymousClass1jJ.m12744E(businessConversionStep);
                H = anonymousClass1jJ.m12747H();
            } else {
                H = AnonymousClass34N.G(businessConversionFlowStatus, businessConversionStep, i, true);
            }
            anonymousClass34J.f37521D = new BusinessConversionFlowStatus(H, i2);
        }
    }

    public final ConversionStep LHA() {
        return this.f12393L.B();
    }

    /* renamed from: M */
    private void m8460M(ConversionStep conversionStep) {
        if (conversionStep != null) {
            AnonymousClass34J anonymousClass34J = this.f12393L;
            BusinessConversionFlowStatus businessConversionFlowStatus = anonymousClass34J.f37521D;
            anonymousClass34J.f37521D = new BusinessConversionFlowStatus(AnonymousClass34N.G(businessConversionFlowStatus, new BusinessConversionStep(conversionStep), businessConversionFlowStatus.f37529B + 1, false), businessConversionFlowStatus.f37529B);
        }
    }

    public final void NUA() {
        OUA(null);
    }

    public final void OUA(Bundle bundle) {
        m8457I(bundle);
        AnonymousClass33X.B(this.f12399R, m8455G(), "skip", bundle);
        m8458K();
        AnonymousClass1jJ anonymousClass1jJ;
        if (this.f12398Q == AnonymousClass34L.f37527E) {
            AnonymousClass34J anonymousClass34J = this.f12393L;
            anonymousClass1jJ = new AnonymousClass1jJ();
            anonymousClass1jJ.m12744E(new BusinessConversionStep(ConversionStep.f37540F));
            anonymousClass1jJ.m12744E(new BusinessConversionStep(ConversionStep.f37552R));
            anonymousClass34J.D(anonymousClass1jJ.m12747H());
        } else {
            AnonymousClass34J anonymousClass34J2 = this.f12393L;
            boolean z = this.f12404W;
            anonymousClass1jJ = new AnonymousClass1jJ();
            anonymousClass1jJ.m12744E(new BusinessConversionStep(ConversionStep.f37540F));
            AnonymousClass34O.B(anonymousClass1jJ, z);
            anonymousClass34J2.D(anonymousClass1jJ.m12747H());
        }
        AnonymousClass33X.B(this.f12399R, m8455G(), "start_step", this.f12418k);
        m8456H();
    }

    public final BusinessInfo QJ() {
        return this.f12385D;
    }

    /* renamed from: T */
    public final void mo394T() {
        if (oK() == null) {
            eb();
        }
    }

    /* renamed from: W */
    public final void m8462W() {
        AnonymousClass33X.B(this.f12399R, m8455G(), "cancel", null);
        m8454F();
    }

    /* renamed from: X */
    public final AnonymousClass0db m8463X(AnonymousClass0db anonymousClass0db) {
        if (anonymousClass0db == null) {
            anonymousClass0db = AnonymousClass0db.m6067C();
        }
        anonymousClass0db.m6076I("is_fb_linked_when_enter_flow", this.f12422o);
        if (this.f12422o) {
            anonymousClass0db.m6076I("is_fb_page_admin_when_enter_flow", this.f12403V);
        }
        return anonymousClass0db;
    }

    public final void XLA() {
        YLA(null);
    }

    public final AnonymousClass33X XM() {
        return this.f12399R;
    }

    /* renamed from: Y */
    public final boolean m8464Y() {
        if (this.f12420m.m1037B().m1018i()) {
            return false;
        }
        if (ConversionStep.f37543I == oK() || ConversionStep.f37546L == oK()) {
            return true;
        }
        return false;
    }

    public final void YLA(Bundle bundle) {
        ConversionStep oK = oK();
        AnonymousClass33X.B(this.f12399R, m8455G(), "cancel", bundle);
        this.f12393L.C();
        AnonymousClass34J anonymousClass34J;
        if (oK == ConversionStep.f37545K) {
            anonymousClass34J = this.f12393L;
            anonymousClass34J.f37521D = AnonymousClass34N.E(anonymousClass34J.f37521D);
            if (!(this.f12412e != ConversionStep.f37551Q || this.f12414g == null || m8450B(this))) {
                XLA();
            }
        } else if (this.f12400S.contains(oK)) {
            anonymousClass34J = this.f12393L;
            anonymousClass34J.f37521D = AnonymousClass34N.E(anonymousClass34J.f37521D);
        }
        this.f12400S.remove(oK);
        ConversionStep oK2 = oK();
        if (oK2 == null) {
            finish();
            return;
        }
        m8451C(this, oK2);
        mo382D().mo1465Q(oK2.name(), 0);
    }

    /* renamed from: Z */
    public final void m8465Z() {
        AnonymousClass33X.B(this.f12399R, m8455G(), "skip", null);
        m8454F();
    }

    /* renamed from: a */
    public final void m8466a(BusinessInfo businessInfo) {
        if (businessInfo != null) {
            this.f12385D = businessInfo;
        }
    }

    /* renamed from: b */
    public final void m8467b(String str) {
        AnonymousClass0F4.f2058E.m1505B(new AnonymousClass1ga(this.f12420m.f1759C, str == null));
    }

    public final RegistrationFlowExtras dQ() {
        return this.f12423p;
    }

    public final int dVA() {
        AnonymousClass34J anonymousClass34J = this.f12393L;
        return AnonymousClass34J.C(anonymousClass34J, anonymousClass34J.f37521D.f37530C.size());
    }

    public final void eb() {
        fb(null);
    }

    public final void fb(Bundle bundle) {
        gb(bundle, null, true);
    }

    public final void gb(Bundle bundle, ConversionStep conversionStep, boolean z) {
        m8457I(bundle);
        AnonymousClass33X.B(this.f12399R, m8455G(), "finish_step", bundle);
        m8458K();
        if (z) {
            m8459L(conversionStep);
        } else {
            m8460M(conversionStep);
        }
        AnonymousClass34J.B(this.f12393L, false);
        m8456H();
        AnonymousClass33X.B(this.f12399R, m8455G(), "start_step", this.f12418k);
    }

    public final boolean iTA() {
        return this.f12398Q == AnonymousClass34L.f37526D && !((Boolean) AnonymousClass0E6.m1318D(AnonymousClass0CC.oC, this.f12420m)).booleanValue() && ((Boolean) AnonymousClass0CC.ye.m846H(this.f12420m)).booleanValue();
    }

    public final ConversionStep oK() {
        return this.f12393L.A();
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.m5852B(this, -2126359644);
        Bundle extras = getIntent().getExtras();
        this.f12396O = (String) AnonymousClass0LH.m2927E(extras.getString("entry_point"));
        this.f12397P = extras.getInt("intro_entry_position");
        this.f12405X = extras.getBoolean("sign_up_megaphone_entry", false);
        this.f12419l = extras.getString("target_page_id");
        this.f12398Q = AnonymousClass34L.B(extras.getInt("business_account_flow"));
        AnonymousClass0Cm G = AnonymousClass0Ce.m950G(getIntent().getExtras());
        this.f12420m = G;
        AnonymousClass0LH.m2927E(G);
        this.f12421n = new AnonymousClass34K(this.f12420m);
        if ("activity_feed".equals(this.f12396O)) {
            this.f12402U = ((Boolean) AnonymousClass0CC.LC.m846H(this.f12420m)).booleanValue();
        } else {
            this.f12402U = ((Boolean) AnonymousClass0CC.pC.m846H(this.f12420m)).booleanValue();
        }
        this.f12399R.f37404B = this.f12398Q.name();
        this.f12399R.B(AnonymousClass0a2.m5424I(this.f12420m), this.f12396O);
        this.f12404W = ((Boolean) AnonymousClass0CC.MC.m846H(this.f12420m)).booleanValue();
        AnonymousClass34J anonymousClass34J = (AnonymousClass34J) AnonymousClass34J.f37518G.get(this.f12420m.f1759C);
        this.f12393L = anonymousClass34J;
        if (anonymousClass34J == null) {
            BusinessConversionFlowStatus businessConversionFlowStatus;
            if (bundle != null) {
                businessConversionFlowStatus = (BusinessConversionFlowStatus) bundle.getParcelable("conversion_flow_status");
            } else {
                businessConversionFlowStatus = AnonymousClass34O.C(this.f12398Q, this.f12420m, this.f12402U, this.f12397P == -1, this.f12404W);
            }
            AnonymousClass34K anonymousClass34K = this.f12421n;
            Map map = AnonymousClass34J.f37518G;
            AnonymousClass34J anonymousClass34J2 = (AnonymousClass34J) map.get(anonymousClass34K.A());
            if (anonymousClass34J2 == null) {
                anonymousClass34J2 = new AnonymousClass34J(anonymousClass34K, businessConversionFlowStatus);
                map.put(anonymousClass34K.A(), anonymousClass34J2);
            }
            this.f12393L = anonymousClass34J2;
            AnonymousClass4BP anonymousClass4BP = new AnonymousClass4BP(this);
            if (anonymousClass4BP != null) {
                anonymousClass34J2.f37519B.add(anonymousClass4BP);
            }
            anonymousClass34J = this.f12393L;
            AnonymousClass4BQ anonymousClass4BQ = new AnonymousClass4BQ(this);
            if (anonymousClass4BQ != null) {
                anonymousClass34J.f37520C.add(anonymousClass4BQ);
            }
        }
        if (bundle == null || bundle.getParcelable("business_info") == null) {
            this.f12385D = new BusinessInfo(null, null, null, null, null);
        } else {
            this.f12385D = (BusinessInfo) bundle.getParcelable("business_info");
        }
        if (this.f12402U) {
            this.f12422o = AnonymousClass0a2.m5426K(this.f12420m);
        }
        super.onCreate(bundle);
        AnonymousClass0cQ.m5853C(this, -1954870128, B);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass34J anonymousClass34J = this.f12393L;
        if (anonymousClass34J != null) {
            bundle.putParcelable("conversion_flow_status", anonymousClass34J.f37521D);
        }
        bundle.putParcelable("business_info", this.f12385D);
    }
}
