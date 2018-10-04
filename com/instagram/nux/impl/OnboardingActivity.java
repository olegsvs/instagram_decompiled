package com.instagram.nux.impl;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0E6;
import X.AnonymousClass0EE;
import X.AnonymousClass0FL;
import X.AnonymousClass0Fr;
import X.AnonymousClass0GO;
import X.AnonymousClass0HV;
import X.AnonymousClass0IL;
import X.AnonymousClass0IU;
import X.AnonymousClass0IZ;
import X.AnonymousClass0Ix;
import X.AnonymousClass0Jp;
import X.AnonymousClass0LH;
import X.AnonymousClass0NN;
import X.AnonymousClass0Og;
import X.AnonymousClass0Oh;
import X.AnonymousClass0Oj;
import X.AnonymousClass0Ok;
import X.AnonymousClass0a2;
import X.AnonymousClass0cQ;
import X.AnonymousClass0iy;
import X.AnonymousClass1Ba;
import X.AnonymousClass1Qt;
import X.AnonymousClass1ZM;
import X.AnonymousClass1fn;
import X.AnonymousClass2Na;
import X.AnonymousClass3Ip;
import X.AnonymousClass3Vw;
import X.AnonymousClass3Vy;
import X.AnonymousClass3Vz;
import X.AnonymousClass3W0;
import X.AnonymousClass3W1;
import X.AnonymousClass3W2;
import X.AnonymousClass3W3;
import X.AnonymousClass3Wn;
import X.AnonymousClass4mh;
import X.AnonymousClass56R;
import X.AnonymousClass56X;
import X.AnonymousClass57v;
import X.AnonymousClass58o;
import X.AnonymousClass58p;
import X.AnonymousClass58r;
import X.AnonymousClass58s;
import X.AnonymousClass58t;
import X.AnonymousClass5SP;
import android.os.Bundle;
import com.facebook.C0164R;
import com.instagram.base.activity.BaseFragmentActivity;
import org.webrtc.audio.WebRtcAudioRecord;

public class OnboardingActivity extends BaseFragmentActivity implements AnonymousClass0EE, AnonymousClass0Ok {
    /* renamed from: B */
    public AnonymousClass0Oj f3944B;
    /* renamed from: C */
    public AnonymousClass0Cm f3945C;

    public final String getModuleName() {
        return "onboarding_activity";
    }

    /* renamed from: B */
    public static Bundle m3663B(OnboardingActivity onboardingActivity) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("IS_SIGN_UP_FLOW", true);
        AnonymousClass0FL.m1564G(onboardingActivity.f3945C, bundle);
        return bundle;
    }

    /* renamed from: C */
    public static void m3664C(OnboardingActivity onboardingActivity, AnonymousClass0IL anonymousClass0IL) {
        if (anonymousClass0IL.getArguments() == null) {
            anonymousClass0IL.setArguments(new Bundle());
        }
        anonymousClass0IL.getArguments().putAll(m3663B(onboardingActivity));
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(onboardingActivity);
        anonymousClass0IZ.f2754D = anonymousClass0IL;
        anonymousClass0IZ.m2307A().m2308B();
    }

    /* renamed from: D */
    public static void m3665D(OnboardingActivity onboardingActivity, AnonymousClass0Fr anonymousClass0Fr) {
        anonymousClass0Fr.m1687C(AnonymousClass2Na.f29755K).m3310R();
        AnonymousClass0HV.m2008D(onboardingActivity.f3945C).m2050l(false);
        AnonymousClass1fn.m12433F(false, onboardingActivity);
        onboardingActivity.hb(0);
    }

    /* renamed from: E */
    private boolean m3666E() {
        AnonymousClass0IU D = mo382D();
        int H = D.mo1456H();
        if (H == 0) {
            return false;
        }
        return AnonymousClass58t.f60532M.name().equals(D.mo1455G(H - 1).getName()) ^ 1;
    }

    /* renamed from: T */
    public final void mo394T() {
        AnonymousClass0Cm G = AnonymousClass0Ce.m950G(getIntent().getExtras());
        this.f3945C = G;
        AnonymousClass0LH.m2927E(G);
        AnonymousClass0Oj B = AnonymousClass0Oj.m3639B(this.f3945C.f1759C);
        this.f3944B = B;
        if (B == null) {
            B = AnonymousClass0Oj.m3639B(null);
            this.f3944B = B;
            if (B == null) {
                AnonymousClass0Og anonymousClass0Og = new AnonymousClass0Og();
                anonymousClass0Og.f3914C = AnonymousClass0Oh.EMAIL;
                anonymousClass0Og.f3915D = this.f3945C;
                this.f3944B = new AnonymousClass0Oj(this, anonymousClass0Og, new AnonymousClass58p());
                B = this.f3944B;
                AnonymousClass58r anonymousClass58r = new AnonymousClass58r(this);
                if (anonymousClass58r != null) {
                    B.f3932E.add(anonymousClass58r);
                }
            }
            AnonymousClass0NN.m3291B("ig_dynamic_onboarding_missing_business_logic", (AnonymousClass0EE) this).m3300H("found", this.f3944B != null).m3310R();
        }
        if (this.f3944B.f3931D == null) {
            hb(1);
        }
    }

    public final void hb(int i) {
        this.f3944B.hb(i);
        AnonymousClass58o anonymousClass58o = this.f3944B.f3931D;
        if (anonymousClass58o == null) {
            finish();
            return;
        }
        Bundle B;
        AnonymousClass0IL anonymousClass1Qt;
        Bundle B2;
        String str;
        AnonymousClass0IZ anonymousClass0IZ;
        String str2;
        switch (anonymousClass58o.f60518B.ordinal()) {
            case 0:
                AnonymousClass3W2 C = AnonymousClass3W3.C(this.f3945C);
                if (C == null || !((Boolean) AnonymousClass0CC.f1471h.m846H(this.f3945C)).booleanValue()) {
                    hb(-1);
                } else {
                    AnonymousClass3W3.F(this, this.f3945C, C.f41827C, C.f41826B);
                }
                return;
            case 1:
                AnonymousClass0GO.m1803C().mo343A();
                B = m3663B(this);
                anonymousClass1Qt = new AnonymousClass1Qt();
                anonymousClass1Qt.setArguments(B);
                m3664C(this, anonymousClass1Qt);
                return;
            case 2:
                Bundle B3 = m3663B(this);
                AnonymousClass0iy.NUX.m7058A(B3, AnonymousClass0a2.m5417B(this.f3945C), AnonymousClass0a2.m5424I(this.f3945C));
                AnonymousClass0GO.m1803C().mo343A();
                anonymousClass1Qt = new AnonymousClass5SP();
                anonymousClass1Qt.setArguments(B3);
                m3664C(this, anonymousClass1Qt);
                return;
            case 3:
                AnonymousClass0Fr.ContactsUpsellViewed.m1687C(AnonymousClass2Na.f29755K).m3310R();
                AnonymousClass1Ba.m9842H(this, new AnonymousClass58s(this), "android.permission.READ_CONTACTS");
                return;
            case 4:
                m3664C(this, AnonymousClass0Jp.f2944B.mo668A().m4410A(getString(C0164R.string.find_contacts_nux_title), true, null, this.f3945C.f1759C));
                return;
            case 5:
                AnonymousClass0GO.m1803C().mo343A();
                B = m3663B(this);
                anonymousClass1Qt = new AnonymousClass56X();
                anonymousClass1Qt.setArguments(B);
                m3664C(this, anonymousClass1Qt);
                return;
            case 6:
                AnonymousClass0GO.m1803C().mo343A();
                B = m3663B(this);
                anonymousClass1Qt = new AnonymousClass57v();
                anonymousClass1Qt.setArguments(B);
                m3664C(this, anonymousClass1Qt);
                return;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                AnonymousClass3W3.E(this, this.f3945C);
                hb(1);
                return;
            case 8:
                m3664C(this, AnonymousClass0Jp.f2944B.mo668A().m4411B(AnonymousClass0a2.m5417B(this.f3945C), getString(C0164R.string.find_facebook_friends_nux_title), true, false, this.f3945C.f1759C));
                return;
            case 9:
                AnonymousClass0GO.m1803C().mo343A();
                B2 = m3663B(this);
                str = this.f3945C.f1759C;
                anonymousClass1Qt = new AnonymousClass1ZM();
                anonymousClass1Qt.b(str, B2);
                AnonymousClass0IZ anonymousClass0IZ2 = new AnonymousClass0IZ(this);
                anonymousClass0IZ2.f2754D = anonymousClass1Qt;
                anonymousClass0IZ2.f2752B = AnonymousClass58t.f60532M.name();
                anonymousClass0IZ2.m2307A().m2308B();
                return;
            case 10:
                AnonymousClass0Cm anonymousClass0Cm = this.f3945C;
                AnonymousClass0Fr.FetchEmailInNux.m1685A().m3310R();
                AnonymousClass0Ix.m2384D(new AnonymousClass3Vw(this, anonymousClass0Cm));
                if (((Boolean) AnonymousClass0E6.m1316B(AnonymousClass0CC.AW)).booleanValue()) {
                    AnonymousClass3W3.B(this, anonymousClass0Cm, "add_email_nux", null, new AnonymousClass3W1(anonymousClass0Cm, false));
                }
                hb(1);
                return;
            case 11:
                AnonymousClass3Vy anonymousClass3Vy;
                AnonymousClass3W0 B4 = AnonymousClass3W0.B(this.f3945C);
                AnonymousClass3Vz A = AnonymousClass3W0.B(this.f3945C).A();
                AnonymousClass0LH.m2927E(A);
                AnonymousClass0NN A2 = AnonymousClass0Fr.AddEmailEmailSourceInfo.m1685A();
                str = "device_oauth_available";
                synchronized (B4) {
                    anonymousClass3Vy = B4.f41821B;
                }
                A2.m3298F(str, anonymousClass3Vy.name()).m3300H("email_fetched_with_oauth", A.f41820C).m3298F("email_prefetch_location", (String) AnonymousClass0E6.m1316B(AnonymousClass0CC.zV)).m3300H("prefetch_without_oauth", ((Boolean) AnonymousClass0E6.m1316B(AnonymousClass0CC.AW)).booleanValue()).m3310R();
                synchronized (B4) {
                    B4.f41823D = true;
                }
                AnonymousClass0Cm anonymousClass0Cm2 = this.f3945C;
                String str3 = A.f41819B;
                anonymousClass0IZ = new AnonymousClass0IZ(this);
                AnonymousClass0GO.m1803C().mo343A();
                str2 = anonymousClass0Cm2.f1759C;
                AnonymousClass0IL anonymousClass56R = new AnonymousClass56R();
                B = new Bundle();
                B.putString("IgSessionManager.USER_ID", str2);
                B.putString("argument_email", str3);
                anonymousClass56R.setArguments(B);
                anonymousClass0IZ.f2754D = anonymousClass56R;
                anonymousClass0IZ.m2308B();
                return;
            case 12:
                anonymousClass0IZ = new AnonymousClass0IZ(this);
                AnonymousClass3Ip.f39973B.A();
                str2 = "nux";
                B2 = new Bundle();
                B2.putString("ExplorePeopleFragment.ARGUMENT_ENTRY_POINT", str2);
                B2.putString("ExplorePeopleFragment.ARGUMENT_TYPE", str2);
                B2.putBoolean("ExplorePeopleFragment.ARGUMENT_NO_SCROLLABLE_NAVIGATION_HELPER", false);
                anonymousClass0IZ.f2754D = AnonymousClass4mh.C(B2);
                anonymousClass0IZ.m2308B();
                return;
            default:
                hb(-2);
                return;
        }
    }

    public final void oV(int i) {
        if (((Boolean) AnonymousClass0CC.JP.m914G()).booleanValue()) {
            this.f3944B.oV(i);
        }
    }

    public final void onBackPressed() {
        if (this.f3944B.f3931D != null && this.f3944B.f3931D.f60518B == AnonymousClass58t.f60532M && m3666E()) {
            super.onBackPressed();
        }
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.m5852B(this, -784194641);
        super.onCreate(bundle);
        AnonymousClass3Wn.B().C();
        AnonymousClass0cQ.m5853C(this, 1141948697, B);
    }
}
