package com.instagram.mainactivity;

import X.AnonymousClass0CB;
import X.AnonymousClass0CC;
import X.AnonymousClass0Cd;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0EA;
import X.AnonymousClass0EE;
import X.AnonymousClass0F4;
import X.AnonymousClass0F9;
import X.AnonymousClass0FA;
import X.AnonymousClass0FM;
import X.AnonymousClass0Fj;
import X.AnonymousClass0Fz;
import X.AnonymousClass0GG;
import X.AnonymousClass0Gi;
import X.AnonymousClass0HI;
import X.AnonymousClass0HV;
import X.AnonymousClass0Hj;
import X.AnonymousClass0Hk;
import X.AnonymousClass0Hl;
import X.AnonymousClass0Ho;
import X.AnonymousClass0Hp;
import X.AnonymousClass0Hq;
import X.AnonymousClass0Hr;
import X.AnonymousClass0Hs;
import X.AnonymousClass0Ht;
import X.AnonymousClass0Hu;
import X.AnonymousClass0Hv;
import X.AnonymousClass0Hw;
import X.AnonymousClass0Hx;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0IQ;
import X.AnonymousClass0IU;
import X.AnonymousClass0IV;
import X.AnonymousClass0IW;
import X.AnonymousClass0IY;
import X.AnonymousClass0Ib;
import X.AnonymousClass0Iz;
import X.AnonymousClass0J7;
import X.AnonymousClass0JQ;
import X.AnonymousClass0JW;
import X.AnonymousClass0Jj;
import X.AnonymousClass0Kl;
import X.AnonymousClass0M7;
import X.AnonymousClass0MM;
import X.AnonymousClass0MO;
import X.AnonymousClass0NN;
import X.AnonymousClass0OR;
import X.AnonymousClass0PH;
import X.AnonymousClass0PY;
import X.AnonymousClass0QP;
import X.AnonymousClass0RG;
import X.AnonymousClass0RN;
import X.AnonymousClass0SY;
import X.AnonymousClass0Uv;
import X.AnonymousClass0Za;
import X.AnonymousClass0bo;
import X.AnonymousClass0bp;
import X.AnonymousClass0bq;
import X.AnonymousClass0br;
import X.AnonymousClass0bs;
import X.AnonymousClass0bu;
import X.AnonymousClass0bx;
import X.AnonymousClass0bz;
import X.AnonymousClass0c0;
import X.AnonymousClass0c1;
import X.AnonymousClass0c2;
import X.AnonymousClass0c3;
import X.AnonymousClass0c4;
import X.AnonymousClass0c5;
import X.AnonymousClass0c6;
import X.AnonymousClass0cA;
import X.AnonymousClass0cC;
import X.AnonymousClass0cF;
import X.AnonymousClass0cG;
import X.AnonymousClass0cH;
import X.AnonymousClass0cI;
import X.AnonymousClass0cJ;
import X.AnonymousClass0cL;
import X.AnonymousClass0cM;
import X.AnonymousClass0cN;
import X.AnonymousClass0cO;
import X.AnonymousClass0cP;
import X.AnonymousClass0cQ;
import X.AnonymousClass0cT;
import X.AnonymousClass0cU;
import X.AnonymousClass0cn;
import X.AnonymousClass0co;
import X.AnonymousClass0ct;
import X.AnonymousClass0cw;
import X.AnonymousClass0cx;
import X.AnonymousClass0d5;
import X.AnonymousClass0d8;
import X.AnonymousClass0d9;
import X.AnonymousClass0dA;
import X.AnonymousClass0dB;
import X.AnonymousClass0dC;
import X.AnonymousClass0dD;
import X.AnonymousClass0dE;
import X.AnonymousClass0dK;
import X.AnonymousClass0dL;
import X.AnonymousClass0dO;
import X.AnonymousClass26j;
import X.AnonymousClass3Tn;
import X.AnonymousClass3To;
import X.AnonymousClass3Tr;
import X.AnonymousClass3Tt;
import X.AnonymousClass3jF;
import X.AnonymousClass4e8;
import X.AnonymousClass55O;
import X.AnonymousClass55Q;
import X.AnonymousClass5Uk;
import X.AnonymousClass5k1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.facebook.C0164R;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.ShouldInitUserSession;
import com.instagram.ui.swipenavigation.SwipeNavigationContainer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import org.webrtc.audio.WebRtcAudioRecord;

@ShouldInitUserSession
public class MainActivity extends BaseFragmentActivity implements AnonymousClass0EE, AnonymousClass0Hj, AnonymousClass0Hk, AnonymousClass0Hl, AnonymousClass0Ho, AnonymousClass0Hp, AnonymousClass0Hq, AnonymousClass0Hr, AnonymousClass0Hu, AnonymousClass0Hs, AnonymousClass0Ht, AnonymousClass0Hv, AnonymousClass3Tn, AnonymousClass0Hw {
    /* renamed from: o */
    public static Bundle f2656o;
    /* renamed from: B */
    public View f2657B;
    /* renamed from: C */
    public float f2658C;
    /* renamed from: D */
    public float f2659D;
    /* renamed from: E */
    public AnonymousClass0ct f2660E;
    /* renamed from: F */
    public AnonymousClass0IJ f2661F;
    /* renamed from: G */
    public AnonymousClass0c6 f2662G;
    /* renamed from: H */
    public float f2663H;
    /* renamed from: I */
    public View f2664I;
    /* renamed from: J */
    public AnonymousClass0cF f2665J;
    /* renamed from: K */
    public AnonymousClass0cG f2666K;
    /* renamed from: L */
    public AnonymousClass0br f2667L;
    /* renamed from: M */
    public final AnonymousClass0bo f2668M;
    /* renamed from: N */
    public ViewGroup f2669N;
    /* renamed from: O */
    public int f2670O;
    /* renamed from: P */
    public AnonymousClass0Cm f2671P;
    /* renamed from: Q */
    private AnonymousClass0PH f2672Q;
    /* renamed from: R */
    private View f2673R;
    /* renamed from: S */
    private AnonymousClass0co f2674S;
    /* renamed from: T */
    private int f2675T;
    /* renamed from: U */
    private AnonymousClass0cx f2676U;
    /* renamed from: V */
    private boolean f2677V;
    /* renamed from: W */
    private boolean f2678W;
    /* renamed from: X */
    private String f2679X;
    /* renamed from: Y */
    private View f2680Y;
    /* renamed from: Z */
    private AnonymousClass3To f2681Z;
    /* renamed from: a */
    private AnonymousClass0cn f2682a;
    /* renamed from: b */
    private AnonymousClass0cH f2683b;
    /* renamed from: c */
    private LayoutParams f2684c;
    /* renamed from: d */
    private AnonymousClass0cM f2685d;
    /* renamed from: e */
    private View f2686e;
    /* renamed from: f */
    private AnonymousClass0c3 f2687f;
    /* renamed from: g */
    private AnonymousClass0c4 f2688g;
    /* renamed from: h */
    private View f2689h;
    /* renamed from: i */
    private boolean f2690i;
    /* renamed from: j */
    private AnonymousClass0cU f2691j;
    /* renamed from: k */
    private AnonymousClass0cw f2692k;
    /* renamed from: l */
    private SwipeNavigationContainer f2693l;
    /* renamed from: m */
    private View f2694m;
    /* renamed from: n */
    private LayoutParams f2695n;

    public final void GWA() {
    }

    /* renamed from: T */
    public final void mo394T() {
    }

    public final Activity cK() {
        return this;
    }

    public MainActivity() {
        AnonymousClass0bo anonymousClass0bo = new AnonymousClass0bo(new AnonymousClass0bp());
        this.f2668M = anonymousClass0bo;
        this.f2658C = anonymousClass0bo.f6866D.mo1411A();
    }

    public final void APA(String str) {
        this.f2679X = str;
    }

    public final void ASA(AnonymousClass0cA anonymousClass0cA) {
        if (!this.f2662G.f6981B.equals(this.f2662G.m5680B(anonymousClass0cA))) {
            AnonymousClass0c6 anonymousClass0c6 = this.f2662G;
            AnonymousClass0c2 anonymousClass0c2 = anonymousClass0c6.f6981B.f6955D;
            Object obj = ((anonymousClass0c6.m5681C() && anonymousClass0c2.equals(anonymousClass0c6.f6996Q.f6955D)) || anonymousClass0c2.equals(anonymousClass0c6.f6989J.f6955D)) ? 1 : null;
            if (obj == null) {
                AnonymousClass0c6 anonymousClass0c62 = this.f2662G;
                anonymousClass0c62.m5685G(anonymousClass0c62.m5680B(anonymousClass0cA));
            }
        }
    }

    /* renamed from: B */
    public static AnonymousClass0IL m2072B(MainActivity mainActivity, int i) {
        switch (i) {
            case 0:
                return m2076F(mainActivity, new AnonymousClass0PY());
            case 1:
                return m2076F(mainActivity, AnonymousClass0Ib.f2781B.mo613B().m2320B());
            case 3:
                AnonymousClass0JW.f2922B.mo601C();
                return m2076F(mainActivity, new AnonymousClass0bu());
            case 4:
                AnonymousClass0SY B = AnonymousClass0Jj.f2938B.mo659B();
                AnonymousClass0bx B2 = AnonymousClass0bx.m5659B(mainActivity.f2671P, "tab_button");
                B2.f6909I = true;
                return m2076F(mainActivity, B.m4355D(B2.m5662A()));
            case 5:
                AnonymousClass0J7.f2895B.mo533O();
                return m2076F(mainActivity, new AnonymousClass0bs());
            case 6:
                AnonymousClass0Hx.f2719B.mo558A();
                return m2076F(mainActivity, new AnonymousClass0br());
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                AnonymousClass0J7.f2895B.mo533O();
                AnonymousClass0IL anonymousClass5Uk = new AnonymousClass5Uk();
                Bundle bundle = new Bundle();
                bundle.putString("DirectFragment.ENTRY_POINT", "direct_tab");
                anonymousClass5Uk.setArguments(bundle);
                return m2076F(mainActivity, anonymousClass5Uk);
            default:
                throw new RuntimeException("Unknown starting fragment.");
        }
    }

    public final void BSA(AnonymousClass0cA anonymousClass0cA) {
        ASA(anonymousClass0cA);
        XHA(anonymousClass0cA);
    }

    /* renamed from: C */
    public static boolean m2073C(MainActivity mainActivity) {
        AnonymousClass0bz.m5663B(mainActivity).m5668C(AnonymousClass0IY.m2265B().m2268C(mainActivity.f2671P.f1759C));
        return true;
    }

    public final String CS() {
        return this.f2662G.f6985F.f6955D.toString();
    }

    public final void CSA(int i) {
        this.f2670O = i;
        if (getResources().getConfiguration().orientation == 1) {
            lS().setVisibility(i);
        }
        if (i == 8) {
            this.f2673R.setLayoutParams(this.f2695n);
            this.f2694m.setVisibility(i);
        } else {
            this.f2673R.setLayoutParams(this.f2684c);
            this.f2694m.setVisibility(this.f2675T);
        }
        this.f2669N.setVisibility(i);
    }

    /* renamed from: D */
    public final AnonymousClass0IU mo382D() {
        return this.f2662G.f6985F.f6954C.m5694H();
    }

    /* renamed from: D */
    private AnonymousClass0c0 m2074D(Intent intent) {
        String stringExtra = intent.getStringExtra("MainActivityAccountHelper.STARTUP_TAB");
        Intent<AnonymousClass0c0> intent2 = this.f2662G.f6998S;
        if (stringExtra != null) {
            AnonymousClass0cA valueOf = AnonymousClass0cA.valueOf(stringExtra);
            for (AnonymousClass0c0 anonymousClass0c0 : intent2) {
                if (((AnonymousClass0cA) anonymousClass0c0.f6955D).equals(valueOf)) {
                    return anonymousClass0c0;
                }
            }
        }
        return (AnonymousClass0c0) intent2.get(0);
    }

    /* renamed from: E */
    public final AnonymousClass0Fz mo383E() {
        return this.f2662G.f6985F.f6954C.m5695I();
    }

    /* renamed from: E */
    private static AnonymousClass0cA m2075E(String str) {
        for (AnonymousClass0cA anonymousClass0cA : AnonymousClass0cA.values()) {
            if (anonymousClass0cA.toString().equals(str)) {
                return anonymousClass0cA;
            }
        }
        return null;
    }

    public final AnonymousClass0cH EO() {
        return this.f2683b;
    }

    public final boolean EX(AnonymousClass0cA anonymousClass0cA) {
        return anonymousClass0cA.equals(this.f2662G.f6981B.f6955D);
    }

    /* renamed from: F */
    private static AnonymousClass0IL m2076F(MainActivity mainActivity, AnonymousClass0IL anonymousClass0IL) {
        Bundle arguments = anonymousClass0IL.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putString("IgSessionManager.USER_ID", mainActivity.f2671P.f1759C);
        anonymousClass0IL.setArguments(arguments);
        return anonymousClass0IL;
    }

    public final boolean GY() {
        return this.f2662G.f6985F.f6954C.m5694H().mo1456H() == 0;
    }

    /* renamed from: I */
    public final void mo388I() {
        super.mo388I();
        this.f2662G.f6981B.f6954C.m5689C();
        if (this.f2662G.m5681C()) {
            AnonymousClass0cC.m5736B(this, this.f2693l, this.f2668M);
        }
    }

    public final AnonymousClass0c4 NQ() {
        return this.f2688g;
    }

    public final void Ny() {
        AnonymousClass0cM anonymousClass0cM = this.f2685d;
        if (anonymousClass0cM != null) {
            anonymousClass0cM.f7101B.m5767L(1.0d).m5769N(1.25d);
        }
    }

    public final void OWA(AnonymousClass3jF anonymousClass3jF) {
        this.f2693l.setPosition(anonymousClass3jF);
    }

    /* renamed from: R */
    public final int mo392R() {
        return C0164R.layout.layout_activity_main;
    }

    public final int RP() {
        return this.f2666K.f7086N;
    }

    public final void VNA(String str) {
        AnonymousClass0cA E = m2075E(str);
        if (E == null) {
            throw new UnsupportedOperationException("Stub");
        } else if (!EX(E)) {
            ASA(E);
        }
    }

    public final boolean VX() {
        if ((this.f2693l.getPosition() == this.f2668M.f6866D.mo1416F() ? 1 : null) == null || !EX(AnonymousClass0cA.FEED)) {
            return false;
        }
        return true;
    }

    public final void WHA() {
        XHA((AnonymousClass0cA) this.f2662G.f6981B.f6955D);
    }

    public final void XHA(AnonymousClass0cA anonymousClass0cA) {
        AnonymousClass0F4.f2058E.m1506C(new AnonymousClass0cI());
        if (this.f2662G.m5680B(anonymousClass0cA).equals(this.f2662G.f6981B)) {
            AnonymousClass0c6 anonymousClass0c6 = this.f2662G;
            AnonymousClass0c0 B = anonymousClass0c6.m5680B(anonymousClass0cA);
            AnonymousClass0IU H = B.f6954C.m5694H();
            if (!AnonymousClass0cJ.m5755E(H)) {
                anonymousClass0c6.f6993N = B;
            } else if (H.mo1456H() > 0) {
                B.f6954C.m5694H().mo1464P(0, 1);
            }
        }
    }

    public final void YRA(boolean z) {
        this.f2690i = z;
    }

    public final void bDA(AnonymousClass0cA anonymousClass0cA) {
        if (anonymousClass0cA != AnonymousClass0cA.NEWS || !AnonymousClass0JW.f2922B.mo602D()) {
            XHA(anonymousClass0cA);
            if (!EX(anonymousClass0cA)) {
                ASA(anonymousClass0cA);
            }
        }
    }

    public final AnonymousClass0PH dJ() {
        if (this.f2672Q == null) {
            this.f2672Q = AnonymousClass0Hx.f2719B.mo560C(this, this.f2683b, this.f2671P.m1037B());
        }
        return this.f2672Q;
    }

    public final void dNA() {
        this.f2662G.m5679A();
    }

    public final AnonymousClass0bq fS() {
        return this.f2668M.f6866D;
    }

    public final AnonymousClass0bo gS() {
        return this.f2668M;
    }

    public final String getModuleName() {
        AnonymousClass0IU H;
        AnonymousClass0c6 anonymousClass0c6 = this.f2662G;
        if (anonymousClass0c6 != null) {
            if (anonymousClass0c6.f6981B != null) {
                H = this.f2662G.f6981B.f6954C.m5694H();
                return AnonymousClass0cF.m5738B(H, this.f2667L, this.f2661F, this.f2668M);
            }
        }
        H = null;
        return AnonymousClass0cF.m5738B(H, this.f2667L, this.f2661F, this.f2668M);
    }

    public final void kRA(AnonymousClass0cL anonymousClass0cL) {
        ASA(anonymousClass0cL.f7098I);
        f2656o = anonymousClass0cL.f7099J;
        XHA(anonymousClass0cL.f7098I);
    }

    public final View kS(String str) {
        throw new UnsupportedOperationException("Stub");
    }

    public final View lS() {
        return this.f2669N;
    }

    public final View mS() {
        return this.f2694m;
    }

    public final boolean mY() {
        AnonymousClass0cF anonymousClass0cF = this.f2665J;
        if (anonymousClass0cF == null) {
            return false;
        }
        return anonymousClass0cF.m5742B(this.f2668M, this.f2671P, this.f2667L, this.f2661F);
    }

    public final int nS() {
        return getResources().getConfiguration().orientation == 2 ? 8 : this.f2670O;
    }

    public final void nd(AnonymousClass0c0 anonymousClass0c0, AnonymousClass0IL anonymousClass0IL) {
        Context context = this;
        if (AnonymousClass0c1.CAMERA.equals(anonymousClass0c0.f6955D) && (anonymousClass0IL instanceof AnonymousClass0br)) {
            this.f2667L = (AnonymousClass0br) anonymousClass0IL;
            AnonymousClass0c4 anonymousClass0c4;
            if (this.f2678W) {
                AnonymousClass0Uv anonymousClass0c3 = new AnonymousClass0c3(context, this.f2671P, this.f2668M, context, context);
                context.f2688g = new AnonymousClass0c4((ViewGroup) getWindow().getDecorView(), anonymousClass0c3);
                AnonymousClass0br anonymousClass0br = context.f2667L;
                AnonymousClass0bo anonymousClass0bo = context.f2668M;
                anonymousClass0c4 = context.f2688g;
                anonymousClass0br.f6874E = anonymousClass0bo;
                anonymousClass0br.f6875F = anonymousClass0c4;
                anonymousClass0br.f6873D = anonymousClass0c3;
                return;
            }
            AnonymousClass0br anonymousClass0br2 = this.f2667L;
            AnonymousClass0bo anonymousClass0bo2 = this.f2668M;
            AnonymousClass0Uv anonymousClass0Uv = this.f2687f;
            anonymousClass0c4 = this.f2688g;
            anonymousClass0br2.f6874E = anonymousClass0bo2;
            anonymousClass0br2.f6875F = anonymousClass0c4;
            anonymousClass0br2.f6873D = anonymousClass0Uv;
        } else if (AnonymousClass0c1.DIRECT.equals(anonymousClass0c0.f6955D)) {
            this.f2661F = (AnonymousClass0IJ) anonymousClass0IL;
            AnonymousClass0IJ anonymousClass0IJ = this.f2661F;
            if (anonymousClass0IJ instanceof AnonymousClass0bs) {
                ((AnonymousClass0bs) anonymousClass0IJ).f6881D = this;
            }
        } else if (anonymousClass0IL instanceof AnonymousClass0IQ) {
            ((AnonymousClass0IQ) anonymousClass0IL).registerLifecycleListener(new AnonymousClass0c5(this, anonymousClass0IL));
        }
    }

    public final void oLA() {
        AnonymousClass0PY.vB = true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f2662G.m5682D(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
        dJ().m3808A(i, i2, intent);
        AnonymousClass0cO.m5772B().m5773A();
    }

    public final void onBackPressed() {
        if (!this.f2665J.m5741A(this.f2704B, this.f2667L, this.f2661F, this.f2693l, this.f2668M, this.f2671P) && !this.f2662G.m5683E()) {
            super.onBackPressed();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2662G.f6981B.f6954C.f7000B.f7003D.m5825Z(configuration);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r19) {
        /*
        r18 = this;
        r1 = -1995360868; // 0xffffffff8911359c float:-1.7478947E-33 double:NaN;
        r0 = r18;
        r8 = X.AnonymousClass0cQ.m5852B(r0, r1);
        r2 = X.AnonymousClass0F9.m1509C();
        r1 = "ACTIVITY_STARTED";
        X.AnonymousClass0F9.m1510D(r2, r1);
        r1 = X.AnonymousClass0F9.m1509C();
        r1.m1517G(r0);
        r1 = X.AnonymousClass0Cd.f1698B;
        r1 = r1.m970N();
        if (r1 == 0) goto L_0x0086;
    L_0x0021:
        r2 = r0.getIntent();
        r1 = "android.intent.category.LAUNCHER";
        r1 = r2.hasCategory(r1);
        if (r1 == 0) goto L_0x0086;
    L_0x002d:
        r2 = "android.intent.action.MAIN";
        r1 = r0.getIntent();
        r1 = r1.getAction();
        r1 = r2.equals(r1);
        if (r1 == 0) goto L_0x0086;
    L_0x003d:
        r2 = X.AnonymousClass0Ce.m951H(r0);
        r4 = new X.5LV;
        r4.<init>(r2);
        r3 = X.AnonymousClass0CC.QJ;
        r1 = r4.f62416B;
        r1 = r3.m846H(r1);
        r1 = (java.lang.Boolean) r1;
        r1 = r1.booleanValue();
        if (r1 == 0) goto L_0x0071;
    L_0x0056:
        r1 = X.AnonymousClass0cR.f7154D;
        r1 = r1.f7156B;
        r1 = X.AnonymousClass5LV.B(r1);
        if (r1 == 0) goto L_0x0071;
    L_0x0060:
        r1 = X.AnonymousClass0HV.m2008D(r2);
        r1 = r4.A(r1);
        if (r1 == 0) goto L_0x0071;
    L_0x006a:
        r1 = X.AnonymousClass0G8.m1750D(r2);
        r1.m1751A(r0, r2);
    L_0x0071:
        r1 = X.AnonymousClass0CC.UJ;
        r1 = r1.m845G();
        r1 = (java.lang.Boolean) r1;
        r1 = r1.booleanValue();
        if (r1 == 0) goto L_0x0086;
    L_0x007f:
        r1 = X.AnonymousClass0G8.m1750D(r2);
        r1.m1752B(r2);
    L_0x0086:
        r2 = r0.getIntent();
        r4 = java.lang.System.currentTimeMillis();
        r1 = "MTA_CreationTime";
        r6 = 0;
        r6 = r2.getLongExtra(r1, r6);
        r4 = r4 - r6;
        r1 = "ig_time_taken_to_create_main_activity";
        r3 = 0;
        r6 = X.AnonymousClass0NN.m3291B(r1, r3);
        r1 = "time_taken";
        r1 = r6.m3295C(r1, r4);
        r1.m3310R();
        r6 = new X.0cF;
        r6.<init>(r0, r2, r0);
        r0.f2665J = r6;
        r1 = new java.lang.ref.WeakReference;
        r1.<init>(r0);
        X.AnonymousClass0cS.f7158B = r1;
        r4 = "init_to_main_activity_started";
        r1 = "AppStartPerformanceTracer";
        X.AnonymousClass0FM.m1565B(r4, r1);
        r4 = r6.f7069B;
        r1 = r6.f7072E;
        X.AnonymousClass0cT.m5870C(r0, r4, r1);
        r5 = r6.f7069B;
        r1 = X.AnonymousClass0CC.CW;
        r1 = r1.m845G();
        r1 = (java.lang.Boolean) r1;
        r1 = r1.booleanValue();
        if (r1 == 0) goto L_0x00e0;
    L_0x00d3:
        r4 = new android.content.Intent;
        r1 = com.instagram.osversionblock.OsVersionBlockingActivity.class;
        r4.<init>(r5, r1);
        r5.startActivity(r4);
        r5.finish();
    L_0x00e0:
        r1 = r6.f7069B;
        X.AnonymousClass0G5.m1728I(r1);
        r4 = X.AnonymousClass0Iz.f2854L;
        r1 = r4.f2861H;
        r1.clear();
        r1 = r4.f2857D;
        r1.clear();
        r1 = 0;
        r4.f2856C = r1;
        r1 = X.AnonymousClass0Cd.f1698B;
        r10 = r1.m970N();
        r6 = 0;
        if (r10 == 0) goto L_0x0117;
    L_0x00fd:
        r1 = X.AnonymousClass0Ce.m951H(r0);
        r0.f2671P = r1;
        r4 = X.AnonymousClass0CC.HU;
        r1 = r0.f2671P;
        r1 = r4.m846H(r1);
        r1 = (java.lang.Boolean) r1;
        r4 = r1.booleanValue();
        r1 = r0.f2671P;
        X.AnonymousClass5bA.B(r1);
        goto L_0x0118;
    L_0x0117:
        r4 = 0;
    L_0x0118:
        r1 = X.AnonymousClass0CC.PI;
        r1 = r1.m914G();
        r1 = (java.lang.Boolean) r1;
        r9 = r1.booleanValue();
        r1 = new X.0c6;
        r1.<init>(r0, r9, r4, r0);
        r0.f2662G = r1;
        r13 = r0.f2662G;
        r7 = r0.m2074D(r2);
        r1 = r19;
        if (r19 == 0) goto L_0x01b9;
    L_0x0135:
        r4 = "HostManager.BUNDLE_KEY_BACK_TAB_LIST";
        r4 = r1.getStringArrayList(r4);
        if (r4 == 0) goto L_0x0157;
    L_0x013d:
        r11 = r4.iterator();
    L_0x0141:
        r4 = r11.hasNext();
        if (r4 == 0) goto L_0x0157;
    L_0x0147:
        r4 = r11.next();
        r4 = (java.lang.String) r4;
        r5 = r13.f6984E;
        r4 = X.AnonymousClass0cA.valueOf(r4);
        r5.push(r4);
        goto L_0x0141;
    L_0x0157:
        r4 = r13.f6983D;
        r16 = r4.iterator();
    L_0x015d:
        r4 = r16.hasNext();
        if (r4 == 0) goto L_0x01b9;
    L_0x0163:
        r11 = r16.next();
        r11 = (X.AnonymousClass0c0) r11;
        r4 = r11.f6955D;
        r4 = r4.toString();
        r4 = r1.containsKey(r4);
        if (r4 == 0) goto L_0x015d;
    L_0x0175:
        r4 = r11.f6957F;
        if (r4 == 0) goto L_0x015d;
    L_0x0179:
        X.AnonymousClass0c0.m5671B(r11);
        r5 = r11.f6954C;
        r4 = r11.f6955D;
        r4 = r4.toString();
        r15 = r1.getParcelable(r4);
        r14 = 0;
        r14 = (java.util.List) r14;
        r4 = r5.f7000B;
        r12 = r4.f7003D;
        r5 = new X.0e2;
        r4 = 0;
        r5.<init>(r14, r4);
        r12.OA(r15, r5);
        r4 = r13.f6987H;
        r4.un(r11);
        r4 = r13.f6990K;
        if (r4 == 0) goto L_0x01a6;
    L_0x01a1:
        r4 = r13.f6995P;
        r4.add(r11);
    L_0x01a6:
        r5 = r11.f6955D;
        r4 = r13.f6984E;
        r4 = r4.peek();
        r4 = r5.equals(r4);
        if (r4 == 0) goto L_0x015d;
    L_0x01b4:
        r13.f6985F = r11;
        r13.f6981B = r11;
        goto L_0x015d;
    L_0x01b9:
        r4 = r13.f6981B;
        if (r4 != 0) goto L_0x01cd;
    L_0x01bd:
        r4 = r13.f6984E;
        r4.clear();
        r5 = r13.f6984E;
        r4 = r7.f6955D;
        r5.push(r4);
        r13.f6985F = r7;
        r13.f6981B = r7;
    L_0x01cd:
        r12 = 0;
        if (r19 == 0) goto L_0x020d;
    L_0x01d0:
        r4 = "host_manager_next_request_index";
        r4 = r1.containsKey(r4);
        if (r4 == 0) goto L_0x020d;
    L_0x01d8:
        r4 = "host_manager_next_request_index";
        r4 = r1.getInt(r4);
        r13.f6991L = r4;
        r4 = "host_manager_request_indicies";
        r15 = r1.getIntArray(r4);
        r4 = "host_manager_request_fragment_who";
        r14 = r1.getStringArray(r4);
        if (r15 == 0) goto L_0x020d;
    L_0x01ee:
        if (r14 == 0) goto L_0x020d;
    L_0x01f0:
        r5 = r15.length;
        r4 = r14.length;
        if (r5 == r4) goto L_0x01f5;
    L_0x01f4:
        goto L_0x020d;
    L_0x01f5:
        r5 = new X.0Kh;
        r4 = r15.length;
        r5.<init>(r4);
        r13.f6992M = r5;
        r11 = 0;
    L_0x01fe:
        r4 = r15.length;
        if (r11 >= r4) goto L_0x020d;
    L_0x0201:
        r7 = r13.f6992M;
        r5 = r15[r11];
        r4 = r14[r11];
        r7.m2846F(r5, r4);
        r11 = r11 + 1;
        goto L_0x01fe;
    L_0x020d:
        r4 = r13.f6992M;
        if (r4 != 0) goto L_0x021a;
    L_0x0211:
        r4 = new X.0Kh;
        r4.<init>();
        r13.f6992M = r4;
        r13.f6991L = r12;
    L_0x021a:
        super.onCreate(r1);
        r7 = r0.f2665J;
        r5 = r0.mo382D();
        r4 = r0.f2671P;
        r7.m5744D(r5, r4);
        r4 = new X.0cU;
        r4.<init>(r0, r0);
        r0.f2691j = r4;
        r4 = new X.0cH;
        r4.<init>(r0, r0);
        r0.f2683b = r4;
        r5 = new X.0cG;
        r4 = r0.f2671P;
        r5.<init>(r0, r0, r4);
        r0.f2666K = r5;
        if (r19 != 0) goto L_0x0246;
    L_0x0241:
        r4 = r0.f2691j;
        r4.m5875C(r10, r2, r0);
    L_0x0246:
        if (r10 != 0) goto L_0x0258;
    L_0x0248:
        r3 = X.AnonymousClass0EQ.f1975B;
        r1 = X.AnonymousClass0cU.m5872C(r2);
        r3.m1399A(r0, r1);
        r1 = -862312098; // 0xffffffffcc9a295e float:-8.0825072E7 double:NaN;
        X.AnonymousClass0cQ.m5853C(r0, r1, r8);
        return;
    L_0x0258:
        r7 = r0.getIntent();
        r5 = "IgSessionManager.USER_ID";
        r4 = r0.f2671P;
        r4 = r4.f1759C;
        r7.putExtra(r5, r4);
        r7 = r0.f2665J;
        r11 = r0.f2671P;
        r5 = X.AnonymousClass0cV.m5876B(r11);
        r4 = r5.f7164B;
        r4 = r4.m2037Y();
        r5 = r5.f7164B;
        r4 = r4 + 1;
        r5.XA(r4);
        r4 = r7.f7069B;
        r12 = r4.getApplicationContext();
        r5 = "ig_cellular_data_opt";
        r4 = 0;
        r7 = X.AnonymousClass0NN.m3291B(r5, r4);
        r5 = "unlimited";
        r4 = X.AnonymousClass0HV.m2008D(r11);
        r4 = r4.m2040b();
        r7 = r7.m3300H(r5, r4);
        r5 = "data_saver_mode";
        r4 = X.AnonymousClass0cW.m5880C(r11);
        r7 = r7.m3300H(r5, r4);
        r5 = "advanced_toggles_disabled";
        r4 = X.AnonymousClass0cW.m5890M();
        r7 = r7.m3300H(r5, r4);
        r5 = "high_quality_network_setting";
        r4 = X.AnonymousClass0cX.HighQualityMedia;
        r4 = X.AnonymousClass0cW.m5879B(r11, r4);
        r7 = r7.m3294B(r5, r4);
        r5 = "feed_autoplay_setting";
        r4 = X.AnonymousClass0cX.FeedVideoAutoplay;
        r4 = X.AnonymousClass0cW.m5879B(r11, r4);
        r7 = r7.m3294B(r5, r4);
        r5 = "story_autoplay_setting";
        r4 = X.AnonymousClass0cX.StoriesVideoAutoplay;
        r4 = X.AnonymousClass0cW.m5879B(r11, r4);
        r7 = r7.m3294B(r5, r4);
        r5 = "os_data_saver_settings";
        r4 = X.AnonymousClass0cW.m5885H(r12);
        r4 = r7.m3294B(r5, r4);
        r4.m3310R();
        r4 = X.AnonymousClass0CC.nJ;
        r4 = r4.m846H(r11);
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x0304;
    L_0x02e8:
        r10 = X.AnonymousClass0Gs.f2431j;
        r7 = new X.0H8;
        r7.<init>();
        r4 = X.AnonymousClass0cY.m5900D(r11);
        r5 = r10.f2458b;
        monitor-enter(r5);
        r10.f2436F = r7;	 Catch:{ all -> 0x0a53 }
        r10.f2450T = r4;	 Catch:{ all -> 0x0a53 }
        r4 = r10.f2453W;	 Catch:{ all -> 0x0a53 }
        if (r4 == 0) goto L_0x0303;
    L_0x02fe:
        r4 = r10.f2453W;	 Catch:{ all -> 0x0a53 }
        r4.C();	 Catch:{ all -> 0x0a53 }
    L_0x0303:
        monitor-exit(r5);	 Catch:{ all -> 0x0a53 }
    L_0x0304:
        r4 = 2131299630; // 0x7f090d2e float:1.8217267E38 double:1.053001928E-314;
        r4 = r0.findViewById(r4);
        r4 = (android.view.ViewGroup) r4;
        r0.f2669N = r4;
        r4 = com.instagram.strings.StringBridge.getFailedToLoadStrings();
        if (r4 == 0) goto L_0x034b;
    L_0x0315:
        r2 = "failed_to_load_library_logged_in";
        X.AnonymousClass0Gn.m1876C(r2, r2);
        r2 = new X.0P2;
        r2.<init>(r0);
        r1 = 2131690894; // 0x7f0f058e float:1.9010844E38 double:1.0531952383E-314;
        r1 = r2.m3732V(r1);
        r2 = r1.m3715E(r6);
        r1 = 2131693269; // 0x7f0f0ed5 float:1.9015662E38 double:1.0531964117E-314;
        r3 = r2.m3721K(r1);
        r2 = 2131691968; // 0x7f0f09c0 float:1.9013023E38 double:1.053195769E-314;
        r1 = new X.0cZ;
        r1.<init>(r0);
        r1 = r3.m3729S(r2, r1);
        r1 = r1.m3711A();
        r1.show();
        r1 = -1767716855; // 0xffffffff96a2c809 float:-2.6298752E-25 double:NaN;
        X.AnonymousClass0cQ.m5853C(r0, r1, r8);
        return;
    L_0x034b:
        r4 = r0.f2662G;
        r4 = r4.f6998S;
        r12 = r4.iterator();
    L_0x0353:
        r4 = r12.hasNext();
        if (r4 == 0) goto L_0x044f;
    L_0x0359:
        r10 = r12.next();
        r10 = (X.AnonymousClass0c0) r10;
        r7 = r0.f2669N;
        r13 = new X.3Tr;
        r15 = r0.f2671P;
        r5 = r10.f6955D;
        r5 = (X.AnonymousClass0cA) r5;
        r4 = r0.f2662G;
        r4 = r4.f6988I;
        if (r4 == 0) goto L_0x0372;
    L_0x036f:
        r18 = "notification_type_count";
        goto L_0x0374;
    L_0x0372:
        r18 = "notification_type_dot";
    L_0x0374:
        r14 = r0;
        r16 = r5;
        r17 = r7;
        r13.<init>(r14, r15, r16, r17, r18);
        r5 = r10.f6955D;
        r4 = X.AnonymousClass0cA.NEWS;
        if (r5 == r4) goto L_0x038e;
    L_0x0382:
        r5 = r10.f6955D;
        r4 = X.AnonymousClass0cA.PROFILE;
        if (r5 == r4) goto L_0x038e;
    L_0x0388:
        r5 = r10.f6955D;
        r4 = X.AnonymousClass0cA.DIRECT;
        if (r5 != r4) goto L_0x03a6;
    L_0x038e:
        r7 = r0.f2666K;
        r5 = X.AnonymousClass3Tu.f41560B;
        r4 = r13.f41552D;
        r4 = r4.ordinal();
        r4 = r5[r4];
        switch(r4) {
            case 1: goto L_0x03a4;
            case 2: goto L_0x03a1;
            case 3: goto L_0x039e;
            default: goto L_0x039d;
        };
    L_0x039d:
        goto L_0x03a6;
    L_0x039e:
        r7.f7078F = r13;
        goto L_0x03a6;
    L_0x03a1:
        r7.f7087O = r13;
        goto L_0x03a6;
    L_0x03a4:
        r7.f7082J = r13;
    L_0x03a6:
        r5 = r10.f6955D;
        r5 = (X.AnonymousClass0cA) r5;
        r7 = r13.f41553E;
        r7 = (com.instagram.ui.widget.proxy.ProxyFrameLayout) r7;
        r4 = r0.f2662G;
        r4 = r4.f6981B;
        r4 = r4.equals(r10);
        if (r4 == 0) goto L_0x03c0;
    L_0x03b8:
        r0.f2664I = r7;
        r11 = r0.f2664I;
        r4 = 1;
        r11.setSelected(r4);
    L_0x03c0:
        r4 = X.AnonymousClass0cA.FEED;
        if (r5 != r4) goto L_0x03d2;
    L_0x03c4:
        r4 = X.AnonymousClass0CB.m840J();
        if (r4 != 0) goto L_0x03d2;
    L_0x03ca:
        r4 = new X.0cc;
        r4.<init>(r0);
        r7.setOnLongClickListener(r4);
    L_0x03d2:
        r4 = new X.0cd;
        r4.<init>(r0, r10, r7);
        r7.setOnClickListener(r4);
        r4 = new X.0ce;
        r4.<init>(r0, r5);
        r7.m5925A(r4);
        r4 = new X.0cf;
        r4.<init>(r0, r5, r7);
        r7.m5925A(r4);
        r4 = X.AnonymousClass0cA.SHARE;
        if (r5 != r4) goto L_0x040d;
    L_0x03ee:
        r4 = 0;
        r7.setProxyToOnClickListener(r4);
        r4 = new X.0cg;
        r4.<init>(r0);
        r7.m5925A(r4);
        r4 = X.AnonymousClass0ch.DEFAULT;
        r4 = X.AnonymousClass0ci.m5926B(r4);
        r4 = r4.f7232C;
        if (r4 == 0) goto L_0x0415;
    L_0x0404:
        r4 = new X.0ck;
        r4.<init>(r0);
        r7.setOnLongClickListener(r4);
        goto L_0x0415;
    L_0x040d:
        r4 = new X.0cm;
        r4.<init>(r0, r5);
        r7.m5925A(r4);
    L_0x0415:
        r4 = X.AnonymousClass0cA.SEARCH;
        if (r5 != r4) goto L_0x0421;
    L_0x0419:
        r4 = new X.0cl;
        r4.<init>(r0);
        r7.setOnLongClickListener(r4);
    L_0x0421:
        r4 = r0.f2669N;
        r4.addView(r7);
        r5 = r10.f6955D;
        r5 = (X.AnonymousClass0cA) r5;
        r4 = X.AnonymousClass0cA.FEED;
        r4 = r5.equals(r4);
        if (r4 == 0) goto L_0x0436;
    L_0x0432:
        r0.f2664I = r7;
        goto L_0x0353;
    L_0x0436:
        r5 = r10.f6955D;
        r5 = (X.AnonymousClass0cA) r5;
        r4 = X.AnonymousClass0cA.PROFILE;
        r4 = r5.equals(r4);
        if (r4 == 0) goto L_0x0353;
    L_0x0442:
        r0.f2686e = r7;
        r5 = new X.0cM;
        r4 = r0.f2686e;
        r5.<init>(r4);
        r0.f2685d = r5;
        goto L_0x0353;
    L_0x044f:
        r10 = new X.3To;
        r10.<init>(r0);
        r0.f2681Z = r10;
        r7 = com.instagram.mainactivity.MainActivity.class;
        r5 = r10.f41546C;
        r4 = "LogoutManager.BROADCAST_POST_ACCOUNT_SWITCH";
        r5.addAction(r4);
        r5 = r10.f41546C;
        r4 = "LogoutManager.BROADCAST_POST_LOGOUT";
        r5.addAction(r4);
        r4 = new X.3Tm;
        r4.<init>(r10, r0, r7);
        r10.f41545B = r4;
        r4 = r0.f2681Z;
        r5 = r4.f41545B;
        r4 = r4.f41546C;
        X.AnonymousClass0dB.m5946B(r5, r4);
        r10 = new X.0cn;
        r7 = r0.f2671P;
        r5 = r0.f2686e;
        r4 = r0.f2666K;
        r16 = r0;
        r11 = r0;
        r12 = r7;
        r13 = r5;
        r14 = r4;
        r15 = r9;
        r10.<init>(r11, r12, r13, r14, r15, r16);
        r0.f2682a = r10;
        r4 = X.AnonymousClass0CB.m840J();
        if (r4 != 0) goto L_0x0512;
    L_0x0490:
        r9 = new X.0co;
        r5 = r0.f2669N;
        r4 = r0.mo382D();
        r9.<init>(r5, r4);
        r0.f2674S = r9;
        r4 = X.AnonymousClass0CB.m840J();
        if (r4 != 0) goto L_0x050b;
    L_0x04a3:
        r10 = X.AnonymousClass0FZ.m1634B();
        r7 = r10.f2177B;
        r5 = "debug_bar";
        r4 = 0;
        r4 = r7.getBoolean(r5, r4);
        r11 = 1;
        r12 = 0;
        if (r4 == 0) goto L_0x04c1;
    L_0x04b4:
        r7 = r10.f2177B;
        r5 = "debug_bar_overlay_mode";
        r4 = 0;
        r4 = r7.getBoolean(r5, r4);
        if (r4 != 0) goto L_0x04c1;
    L_0x04bf:
        r4 = 1;
        goto L_0x04c2;
    L_0x04c1:
        r4 = 0;
    L_0x04c2:
        r9.f7251D = r4;
        if (r4 == 0) goto L_0x050b;
    L_0x04c6:
        r4 = "com.instagram.debug.devoptions.DebugBar";
        r10 = java.lang.Class.forName(r4);	 Catch:{ Exception -> 0x0503 }
        r5 = new java.lang.Class[r11];	 Catch:{ Exception -> 0x0503 }
        r4 = android.content.Context.class;
        r5[r12] = r4;	 Catch:{ Exception -> 0x0503 }
        r7 = r10.getConstructor(r5);	 Catch:{ Exception -> 0x0503 }
        r5 = new java.lang.Object[r11];	 Catch:{ Exception -> 0x0503 }
        r4 = r9.f7252E;	 Catch:{ Exception -> 0x0503 }
        r4 = r4.getContext();	 Catch:{ Exception -> 0x0503 }
        r5[r12] = r4;	 Catch:{ Exception -> 0x0503 }
        r4 = r7.newInstance(r5);	 Catch:{ Exception -> 0x0503 }
        r4 = (android.view.ViewGroup) r4;	 Catch:{ Exception -> 0x0503 }
        r9.f7249B = r4;	 Catch:{ Exception -> 0x0503 }
        r5 = r9.f7252E;	 Catch:{ Exception -> 0x0503 }
        r4 = r9.f7249B;	 Catch:{ Exception -> 0x0503 }
        r5.addView(r4);	 Catch:{ Exception -> 0x0503 }
        r4 = r9.f7249B;	 Catch:{ Exception -> 0x0503 }
        r4.bringToFront();	 Catch:{ Exception -> 0x0503 }
        r7 = "processNewLogEvent";
        r5 = new java.lang.Class[r11];	 Catch:{ Exception -> 0x0503 }
        r4 = com.instagram.debug.log.DLog$NewLogEvent.class;
        r5[r12] = r4;	 Catch:{ Exception -> 0x0503 }
        r4 = r10.getMethod(r7, r5);	 Catch:{ Exception -> 0x0503 }
        r9.f7250C = r4;	 Catch:{ Exception -> 0x0503 }
        goto L_0x050b;
    L_0x0503:
        r7 = move-exception;
        r5 = X.AnonymousClass0co.f7248G;
        r4 = "Error fetching DebugBar";
        X.AnonymousClass0Dc.m1244G(r5, r4, r7);
    L_0x050b:
        r5 = X.AnonymousClass0Gi.f2408B;
        r4 = r0.f2674S;
        r5.m1848E(r4);
    L_0x0512:
        r4 = "MainActivityAccountHelper.ACCOUNT_SWITCH_EVENT";
        r4 = r2.hasExtra(r4);
        r11 = 1;
        if (r4 == 0) goto L_0x0553;
    L_0x051b:
        if (r19 != 0) goto L_0x0553;
    L_0x051d:
        r4 = X.AnonymousClass0cA.PROFILE;
        r4 = r0.EX(r4);
        if (r4 != 0) goto L_0x0553;
    L_0x0525:
        r10 = new X.0cq;
        r10.<init>();
        r9 = r0.getResources();
        r7 = 2131692973; // 0x7f0f0dad float:1.9015061E38 double:1.0531962654E-314;
        r5 = new java.lang.Object[r11];
        r4 = r0.f2671P;
        r4 = r4.m1037B();
        r4 = r4.uT();
        r5[r6] = r4;
        r4 = r9.getString(r7, r5);
        r10.f7260G = r4;
        r7 = r10.m5927A();
        r5 = X.AnonymousClass0F4.f2058E;
        r4 = new X.0cs;
        r4.<init>(r7);
        r5.m1505B(r4);
    L_0x0553:
        r4 = "FORCE_LOGOUT_LOGIN_EVENT";
        r4 = r2.hasExtra(r4);
        if (r4 == 0) goto L_0x0589;
    L_0x055b:
        r10 = new X.0cq;
        r10.<init>();
        r9 = r0.getResources();
        r7 = 2131691633; // 0x7f0f0871 float:1.9012343E38 double:1.0531956034E-314;
        r5 = new java.lang.Object[r11];
        r4 = r0.f2671P;
        r4 = r4.m1037B();
        r4 = r4.uT();
        r5[r6] = r4;
        r4 = r9.getString(r7, r5);
        r10.f7260G = r4;
        r7 = r10.m5927A();
        r5 = X.AnonymousClass0F4.f2058E;
        r4 = new X.0cs;
        r4.<init>(r7);
        r5.m1505B(r4);
    L_0x0589:
        r4 = 2131299631; // 0x7f090d2f float:1.8217269E38 double:1.0530019287E-314;
        r4 = r0.findViewById(r4);
        r0.f2694m = r4;
        r4 = 2131297931; // 0x7f09068b float:1.821382E38 double:1.053001089E-314;
        r4 = r0.findViewById(r4);
        r0.f2657B = r4;
        r4 = 2131297930; // 0x7f09068a float:1.8213819E38 double:1.0530010883E-314;
        r4 = r0.findViewById(r4);
        r0.f2673R = r4;
        r4 = 2131297929; // 0x7f090689 float:1.8213817E38 double:1.053001088E-314;
        r4 = r0.findViewById(r4);
        r0.f2680Y = r4;
        r4 = 2131297933; // 0x7f09068d float:1.8213825E38 double:1.0530010897E-314;
        r4 = r0.findViewById(r4);
        r0.f2689h = r4;
        r4 = r0.f2657B;
        r4 = r4.getLayoutParams();
        r4 = (android.view.ViewGroup.MarginLayoutParams) r4;
        r5 = X.AnonymousClass0CC.iG;
        r4 = r0.f2671P;
        r4 = r5.m846H(r4);
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        r0.f2678W = r4;
        if (r4 != 0) goto L_0x05f3;
    L_0x05d0:
        r9 = new X.0c3;
        r5 = r0.f2671P;
        r4 = r0.f2668M;
        r13 = r0;
        r14 = r0;
        r10 = r0;
        r11 = r5;
        r12 = r4;
        r9.<init>(r10, r11, r12, r13, r14);
        r0.f2687f = r9;
        r7 = new X.0c4;
        r4 = r0.getWindow();
        r5 = r4.getDecorView();
        r5 = (android.view.ViewGroup) r5;
        r4 = r0.f2687f;
        r7.<init>(r5, r4);
        r0.f2688g = r7;
    L_0x05f3:
        r5 = new X.0ct;
        r4 = 2131299621; // 0x7f090d25 float:1.8217249E38 double:1.0530019237E-314;
        r4 = r0.findViewById(r4);
        r4 = (android.view.ViewStub) r4;
        r5.<init>(r4);
        r0.f2660E = r5;
        r4 = 2131299620; // 0x7f090d24 float:1.8217247E38 double:1.053001923E-314;
        r4 = r0.findViewById(r4);
        r4 = (com.instagram.ui.swipenavigation.SwipeNavigationContainer) r4;
        r0.f2693l = r4;
        r4 = r0.f2668M;
        r5 = r4.f6866D;
        r11 = r0.f2693l;
        r9 = new X.0cu;
        r7 = r0.f2680Y;
        r4 = r5.mo1417G();
        r9.<init>(r7, r4);
        r10 = new X.0cv;
        r10.<init>(r9);
        r12 = new X.0cu;
        r7 = r0.f2657B;
        r4 = r5.mo1416F();
        r12.<init>(r7, r4);
        r9 = new X.0cv;
        r9.<init>(r12);
        r4 = r0.f2662G;
        r4 = r4.m5681C();
        if (r4 == 0) goto L_0x064c;
    L_0x063c:
        r7 = new X.0cu;
        r4 = r0.f2689h;
        r3 = r5.mo1415E();
        r7.<init>(r4, r3);
        r3 = new X.0cv;
        r3.<init>(r7);
    L_0x064c:
        r11.f7025D = r0;
        r11.f7023B = r9;
        r11.f7029H = r10;
        r11.f7026E = r3;
        r3 = 2130968638; // 0x7f04003e float:1.7545935E38 double:1.0528383964E-314;
        r3 = X.AnonymousClass0G5.m1725F(r0, r3);
        r9 = X.AnonymousClass0Ca.m937C(r0, r3);
        r7 = new X.0cw;
        r4 = r0.f2693l;
        r3 = 1059481190; // 0x3f266666 float:0.65 double:5.234532584E-315;
        r7.<init>(r4, r0, r3, r9);
        r0.f2692k = r7;
        r3 = r0.f2662G;
        r3 = r3.m5681C();
        if (r3 == 0) goto L_0x067a;
    L_0x0673:
        r4 = r0.f2693l;
        r3 = r0.f2668M;
        X.AnonymousClass0cC.m5736B(r0, r4, r3);
    L_0x067a:
        r4 = r0.f2668M;
        r3 = r0.f2692k;
        r4.m5629A(r3);
        r4 = r0.f2693l;
        r3 = new X.0cE;
        r3.<init>(r0, r5);
        r4.setListener(r3);
        r3 = r0.f2668M;
        if (r19 == 0) goto L_0x0696;
    L_0x068f:
        r3 = "MainActivity.BUNDLE_KEY_CURRENT_NAVIGATION_POSITION";
        r3 = r1.getFloat(r3);
        goto L_0x069c;
    L_0x0696:
        r3 = r3.f6866D;
        r3 = r3.mo1411A();
    L_0x069c:
        r0.f2658C = r3;
        r0.f2663H = r3;
        if (r19 != 0) goto L_0x06a5;
    L_0x06a2:
        r5 = "activity_newly_created";
        goto L_0x06a7;
    L_0x06a5:
        r5 = "activity_recreated";
    L_0x06a7:
        r4 = X.AnonymousClass3jF.B();
        r3 = r0.f2658C;
        r3 = r4.B(r3);
        r3 = r3.A(r6);
        r3 = r3.C(r5);
        r3 = r3.ID();
        r0.OWA(r3);
        r7 = 8;
        r3 = X.AnonymousClass0Nm.m3424C(r0, r7);
        r0.f2659D = r3;
        r6 = new android.widget.FrameLayout$LayoutParams;
        r5 = -1;
        r6.<init>(r5, r5);
        r0.f2684c = r6;
        r4 = r0.getResources();
        r3 = 2130969324; // 0x7f0402ec float:1.7547327E38 double:1.0528387353E-314;
        r3 = X.AnonymousClass0G5.m1725F(r0, r3);
        r3 = r4.getDimensionPixelOffset(r3);
        r6.bottomMargin = r3;
        r3 = new android.widget.FrameLayout$LayoutParams;
        r3.<init>(r5, r5);
        r0.f2695n = r3;
        r3 = 2130968584; // 0x7f040008 float:1.7545826E38 double:1.0528383697E-314;
        r3 = X.AnonymousClass0G5.m1723D(r0, r3);
        if (r3 != 0) goto L_0x06f2;
    L_0x06f1:
        r7 = 0;
    L_0x06f2:
        r0.f2675T = r7;
        r3 = new X.0cx;
        r3.<init>();
        r0.f2676U = r3;
        r4 = r0.f2665J;
        r3 = r0.f2671P;
        r3 = r4.m5743C(r2, r1, r3);
        r0.f2677V = r3;
        r5 = X.AnonymousClass0F4.f2058E;
        r4 = new X.0Tn;
        r3 = r0.f2671P;
        r4.<init>(r3);
        r5.m1506C(r4);
        r4 = 1280; // 0x500 float:1.794E-42 double:6.324E-321;
        r3 = r0.getWindow();
        r3 = r3.getDecorView();
        r3.setSystemUiVisibility(r4);
        r7 = r0.f2665J;
        r5 = r0.f2671P;
        r6 = r0.gS();
        r3 = r2.getData();
        if (r3 != 0) goto L_0x07a9;
    L_0x072c:
        r3 = X.AnonymousClass0HV.m2008D(r5);
        r9 = r3.f2646B;
        r4 = "has_ever_captured_media_for_recovery";
        r3 = 0;
        r3 = r9.getBoolean(r4, r3);
        if (r3 == 0) goto L_0x07a9;
    L_0x073b:
        r9 = X.AnonymousClass0cy.m5934B(r5);
        if (r9 == 0) goto L_0x07a6;
    L_0x0741:
        r10 = java.lang.System.currentTimeMillis();
        r3 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r10 = r10 - r3;
        r3 = r9.f7295D;
        r3 = android.text.TextUtils.isEmpty(r3);
        r3 = r3 ^ 1;
        if (r3 == 0) goto L_0x0765;
    L_0x0753:
        r3 = r9.f7294C;
        r3 = android.text.TextUtils.isEmpty(r3);
        r3 = r3 ^ 1;
        if (r3 == 0) goto L_0x0765;
    L_0x075d:
        r3 = r9.f7293B;
        r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1));
        if (r3 < 0) goto L_0x0765;
    L_0x0763:
        r3 = 1;
        goto L_0x0766;
    L_0x0765:
        r3 = 0;
    L_0x0766:
        if (r3 == 0) goto L_0x0799;
    L_0x0768:
        r4 = r9.f7298G;
        r3 = 3;
        if (r4 >= r3) goto L_0x0799;
    L_0x076d:
        r3 = r9.f7298G;
        r3 = r3 + 1;
        r9.f7298G = r3;
        X.AnonymousClass0cy.m5937E(r5, r9);
        r5 = r7.f7071D;
        r4 = X.AnonymousClass3jF.B();
        r3 = r6.f6866D;
        r3 = r3.mo1417G();
        r4 = r4.B(r3);
        r3 = 0;
        r4 = r4.A(r3);
        r3 = "story_captured_media_recovery";
        r3 = r4.C(r3);
        r3 = r3.ID();
        r5.OWA(r3);
        goto L_0x07a9;
    L_0x0799:
        r4 = X.AnonymousClass0HV.m2008D(r5);
        r3 = "";
        r4.m2056r(r3);
        X.AnonymousClass0d6.m5941B(r5);
        goto L_0x07a9;
    L_0x07a6:
        X.AnonymousClass0d6.m5941B(r5);
    L_0x07a9:
        r9 = r0.f2665J;
        r6 = r0.getApplicationContext();
        r7 = r0.f2671P;
        r3 = X.AnonymousClass0CC.nB;
        r3 = r3.m846H(r7);
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        if (r3 == 0) goto L_0x083b;
    L_0x07bf:
        r4 = X.AnonymousClass0HV.m2008D(r7);
        r3 = X.AnonymousClass0CC.qB;
        r3 = r3.m846H(r7);
        r3 = (java.lang.Boolean) r3;
        r5 = r3.booleanValue();
        r3 = r4.f2646B;
        r4 = r3.edit();
        r3 = "main_feed_media_prefetch_enabled";
        r3 = r4.putBoolean(r3, r5);
        r3.apply();
        r3 = X.AnonymousClass0CC.zB;
        r3 = r3.m846H(r7);
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        if (r3 == 0) goto L_0x0808;
    L_0x07ec:
        r3 = X.AnonymousClass0CC.kB;
        r3 = r3.m846H(r7);
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
        r4 = new X.0d0;
        r4.<init>(r6, r7, r3);
        r3 = X.AnonymousClass0Fj.f2192B;
        r3.m1666A(r4);
        r3 = X.AnonymousClass0d0.class;
        r7.m1039D(r3, r4);
        goto L_0x083b;
    L_0x0808:
        r10 = new X.0d7;
        r10.<init>(r6, r7);
        r3 = X.AnonymousClass0Fj.f2192B;
        r3.m1666A(r10);
        r3 = X.AnonymousClass0d7.class;
        r7.m1039D(r3, r10);
        r3 = X.AnonymousClass0CC.yB;
        r3 = r3.m846H(r7);
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        if (r3 == 0) goto L_0x083b;
    L_0x0825:
        r3 = X.AnonymousClass0CC.pB;
        r3 = r3.m846H(r7);
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
        r5 = (long) r3;
        r3 = 1;
        r10.f7316C = r3;
        r3 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r5 = r5 * r3;
        r10.f7315B = r5;
    L_0x083b:
        r3 = X.AnonymousClass0CC.VM;
        r3 = r3.m846H(r7);
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        if (r3 == 0) goto L_0x0855;
    L_0x0849:
        r4 = android.os.Looper.myQueue();
        r3 = new X.0d1;
        r3.<init>(r9, r7);
        r4.addIdleHandler(r3);
    L_0x0855:
        r4 = r0.f2665J;
        r3 = X.AnonymousClass0cA.PROFILE;
        r6 = r0.EX(r3);
        r9 = r0.getResources();
        r10 = r0.f2671P;
        r3 = r4.f7072E;
        r5 = X.AnonymousClass0IX.m2261G(r3);
        r4 = r4.f7072E;
        r3 = "MainActivityAccountHelper.ACCOUNT_SWITCH_EVENT";
        r3 = r4.hasExtra(r3);
        if (r3 != 0) goto L_0x0875;
    L_0x0873:
        if (r5 == 0) goto L_0x08a9;
    L_0x0875:
        if (r19 != 0) goto L_0x08a9;
    L_0x0877:
        if (r6 != 0) goto L_0x08a9;
    L_0x0879:
        if (r5 == 0) goto L_0x087f;
    L_0x087b:
        r7 = 2131691633; // 0x7f0f0871 float:1.9012343E38 double:1.0531956034E-314;
        goto L_0x0882;
    L_0x087f:
        r7 = 2131692973; // 0x7f0f0dad float:1.9015061E38 double:1.0531962654E-314;
    L_0x0882:
        r6 = new X.0cq;
        r6.<init>();
        r3 = 1;
        r5 = new java.lang.Object[r3];
        r4 = 0;
        r3 = r10.m1037B();
        r3 = r3.uT();
        r5[r4] = r3;
        r3 = r9.getString(r7, r5);
        r6.f7260G = r3;
        r5 = r6.m5927A();
        r4 = X.AnonymousClass0F4.f2058E;
        r3 = new X.0cs;
        r3.<init>(r5);
        r4.m1505B(r3);
    L_0x08a9:
        r5 = r0.f2671P;
        r3 = X.AnonymousClass0Ce.m951H(r0);
        r4 = X.AnonymousClass0HV.m2008D(r3);
        r3 = X.AnonymousClass0HU.m2004B(r5);
        if (r3 == 0) goto L_0x0951;
    L_0x08b9:
        r3 = new X.0HU;
        r3.<init>(r0, r5, r4);
        r4 = r3.f2641B;
        r5 = r3.f2643D;
        r10 = X.AnonymousClass0Gd.m1838C();
        r4 = X.AnonymousClass0bc.m5604B(r4);
        r12 = r4.f6824B;
        r14 = X.AnonymousClass0HU.f2639F;
        r16 = X.AnonymousClass0HU.f2640G;
        r7 = r5.f2646B;
        r6 = "employee_dogfood_lockout_snooze_time";
        r4 = 0;
        r18 = r7.getLong(r6, r4);
        r9 = new X.0bb;
        r9.<init>(r10, r12, r14, r16, r18);
        r6 = r9.f6814B;
        r4 = r9.f6815C;
        r4 = r4 - r6;
        r6 = r9.f6816D;
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 <= 0) goto L_0x08ec;
    L_0x08ea:
        r4 = 1;
        goto L_0x08ed;
    L_0x08ec:
        r4 = 0;
    L_0x08ed:
        if (r4 == 0) goto L_0x08f7;
    L_0x08ef:
        r4 = X.AnonymousClass0HU.m2005C(r9);
        if (r4 != 0) goto L_0x08f7;
    L_0x08f5:
        r4 = 1;
        goto L_0x08f8;
    L_0x08f7:
        r4 = 0;
    L_0x08f8:
        if (r4 == 0) goto L_0x0951;
    L_0x08fa:
        r4 = r3.f2641B;
        r4 = X.AnonymousClass3K0.B(r4);
        if (r4 == 0) goto L_0x0904;
    L_0x0902:
        r10 = 1;
        goto L_0x0905;
    L_0x0904:
        r10 = 0;
    L_0x0905:
        r9 = new X.0P2;
        r4 = r3.f2641B;
        r9.<init>(r4);
        r4 = r3.f2643D;
        r4 = r4.m2023K();
        if (r4 <= 0) goto L_0x0916;
    L_0x0914:
        r7 = 1;
        goto L_0x0917;
    L_0x0916:
        r7 = 0;
    L_0x0917:
        r6 = new X.0d2;
        r6.<init>(r3, r10);
        r5 = new X.0d3;
        r5.<init>(r3);
        r4 = 2131691619; // 0x7f0f0863 float:1.9012315E38 double:1.0531955965E-314;
        r9.m3721K(r4);
        if (r10 == 0) goto L_0x092d;
    L_0x0929:
        r4 = 2131691621; // 0x7f0f0865 float:1.901232E38 double:1.0531955975E-314;
        goto L_0x0930;
    L_0x092d:
        r4 = 2131691618; // 0x7f0f0862 float:1.9012313E38 double:1.053195596E-314;
    L_0x0930:
        r9.m3729S(r4, r6);
        r4 = 0;
        r9.m3715E(r4);
        r9.m3716F(r4);
        if (r7 == 0) goto L_0x0942;
    L_0x093c:
        r4 = 2131691620; // 0x7f0f0864 float:1.9012317E38 double:1.053195597E-314;
        r9.m3724N(r4, r5);
    L_0x0942:
        r5 = r9.m3711A();
        r4 = new X.0d4;
        r4.<init>(r3);
        r5.setOnShowListener(r4);
        r5.show();
    L_0x0951:
        r9 = r0.f2691j;
        r4 = r0.f2671P;
        r3 = r0.f2662G;
        r3 = r3.f6981B;
        r3 = r3.f6955D;
        r12 = r3.toString();
        if (r1 != 0) goto L_0x096b;
    L_0x0961:
        r10 = r2;
        r14 = r0;
        r11 = r4;
        r13 = r0;
        r3 = r9.m5873A(r10, r11, r12, r13, r14);
        if (r3 != 0) goto L_0x098a;
    L_0x096b:
        r3 = "MainActivityAccountHelper.STARTUP_TAB";
        r3 = r2.hasExtra(r3);
        if (r3 == 0) goto L_0x0985;
    L_0x0973:
        if (r1 != 0) goto L_0x0985;
    L_0x0975:
        r3 = r9.f7163C;
        r1 = "MainActivityAccountHelper.STARTUP_TAB";
        r1 = r2.getStringExtra(r1);
        r1 = X.AnonymousClass0cU.m5871B(r1);
        r3.ASA(r1);
        goto L_0x098a;
    L_0x0985:
        r1 = r9.f7163C;
        r1.dNA();
    L_0x098a:
        r3 = r0.getClass();
        r1 = X.AnonymousClass0Gb.f2388D;
        if (r1 == 0) goto L_0x099b;
    L_0x0992:
        r2 = r1.f2389B;
        r1 = r3.getCanonicalName();
        r2.add(r1);
    L_0x099b:
        r3 = r0.f2662G;
        r1 = r3.f6990K;
        if (r1 == 0) goto L_0x09d8;
    L_0x09a1:
        r1 = r3.f6995P;
        r1 = r1.isEmpty();
        if (r1 != 0) goto L_0x09c7;
    L_0x09a9:
        r1 = r3.f6995P;
        r2 = r1.iterator();
    L_0x09af:
        r1 = r2.hasNext();
        if (r1 == 0) goto L_0x09c1;
    L_0x09b5:
        r1 = r2.next();
        r1 = (X.AnonymousClass0c0) r1;
        r1 = r1.f6954C;
        r1.m5687A();
        goto L_0x09af;
    L_0x09c1:
        r1 = r3.f6995P;
        r1.clear();
        goto L_0x09df;
    L_0x09c7:
        r1 = r3.f6981B;
        r1 = r1.f6956E;
        if (r1 != 0) goto L_0x09d0;
    L_0x09cd:
        r3.m5679A();
    L_0x09d0:
        r1 = r3.f6981B;
        r1 = r1.f6954C;
        r1.m5687A();
        goto L_0x09df;
    L_0x09d8:
        r1 = r3.f6981B;
        r1 = r1.f6956E;
        if (r1 != 0) goto L_0x09d0;
    L_0x09de:
        goto L_0x09cd;
    L_0x09df:
        r1 = r0.f2671P;
        r2 = X.AnonymousClass0d5.m5940B(r1);
        r1 = new java.lang.ref.WeakReference;
        r1.<init>(r0);
        r2.f7309B = r1;
        r2 = "init_to_main_activity_created";
        r1 = "AppStartPerformanceTracer";
        X.AnonymousClass0FM.m1565B(r2, r1);
        r4 = X.AnonymousClass0F9.m1509C();
        r1 = "ACTIVITY_CREATED";
        X.AnonymousClass0F9.m1510D(r4, r1);
        r1 = r4.f2070C;
        if (r1 == 0) goto L_0x0a10;
    L_0x0a00:
        r3 = new android.content.Intent;
        r2 = r1.f2078C;
        r1 = com.instagram.util.startup.tracking.TaskLifeDetectingService.class;
        r3.<init>(r2, r1);
        r1 = r4.f2070C;
        r1 = r1.f2078C;
        X.AnonymousClass0IW.m2248N(r3, r1);
    L_0x0a10:
        r4 = X.AnonymousClass0Iz.f2854L;
        X.AnonymousClass0Sy.m4434C();
        r1 = r4.f2862I;
        if (r1 == 0) goto L_0x0a24;
    L_0x0a19:
        r1 = com.facebook.common.time.AwakeTimeSinceBootClock.get();
        r1 = r1.now();
        r4.f2859F = r1;
        goto L_0x0a2a;
    L_0x0a24:
        r1 = android.os.SystemClock.elapsedRealtime();
        r4.f2859F = r1;
    L_0x0a2a:
        r3 = "navigation";
        r2 = new X.0NM;
        r1 = "login";
        r2.<init>(r1);
        r3 = X.AnonymousClass0NN.m3291B(r3, r2);
        r2 = "click_point";
        r1 = "cold start";
        r3 = r3.m3298F(r2, r1);
        r2 = "nav_depth";
        r1 = 0;
        r1 = r3.m3294B(r2, r1);
        r4.f2858E = r1;
        r1 = "login";
        r4.f2860G = r1;
        r1 = -705787008; // 0xffffffffd5ee8b80 float:-3.27853644E13 double:NaN;
        X.AnonymousClass0cQ.m5853C(r0, r1, r8);
        return;
    L_0x0a53:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0a53 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mainactivity.MainActivity.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        int B = AnonymousClass0cQ.m5852B(this, 1419259622);
        AnonymousClass0cG anonymousClass0cG = this.f2666K;
        if (anonymousClass0cG != null) {
            AnonymousClass3Tr anonymousClass3Tr = anonymousClass0cG.f7082J;
            if (anonymousClass3Tr != null) {
                anonymousClass3Tr.A();
            }
            anonymousClass3Tr = anonymousClass0cG.f7087O;
            if (anonymousClass3Tr != null) {
                anonymousClass3Tr.A();
            }
            anonymousClass0cG.f7085M.clear();
            anonymousClass0cG.f7080H = false;
            anonymousClass0cG.f7086N = 0;
        }
        AnonymousClass3To anonymousClass3To = this.f2681Z;
        if (anonymousClass3To != null) {
            AnonymousClass0dB.m5950F(anonymousClass3To.f41545B);
            this.f2681Z = null;
        }
        if (!AnonymousClass0CB.m840J()) {
            AnonymousClass0Gi.f2408B.m1849F(this.f2674S);
            this.f2674S = null;
        }
        this.f2683b = null;
        this.f2672Q = null;
        this.f2688g = null;
        this.f2687f = null;
        this.f2676U = null;
        this.f2667L = null;
        this.f2691j = null;
        this.f2665J = null;
        this.f2682a = null;
        super.onDestroy();
        AnonymousClass0c6 anonymousClass0c6 = this.f2662G;
        for (AnonymousClass0c0 anonymousClass0c0 : anonymousClass0c6.f6983D) {
            if (anonymousClass0c0.f6956E) {
                AnonymousClass0c6.m5676B(anonymousClass0c6, anonymousClass0c0);
                anonymousClass0c0.f6954C.f7000B.f7003D.m5829d();
                anonymousClass0c0.f6954C.m5690D();
            }
        }
        anonymousClass0c6.f6982C = null;
        AnonymousClass0Cm anonymousClass0Cm = this.f2671P;
        if (anonymousClass0Cm != null && anonymousClass0Cm.f1758B && ((Boolean) AnonymousClass0CC.f1451N.m914G()).booleanValue()) {
            anonymousClass0Cm.m1038C();
        }
        AnonymousClass0cQ.m5853C(this, 708340746, B);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!AnonymousClass0CB.m834D() || ((i != 82 && keyEvent.getScanCode() != 64) || !AnonymousClass26j.B())) {
            return super.onKeyDown(i, keyEvent);
        }
        AnonymousClass0HI.m1976C(this, AnonymousClass0Ce.m951H(this)).mo376A();
        return true;
    }

    public final void onLowMemory() {
        super.onLowMemory();
        this.f2662G.f6981B.f6954C.f7000B.f7003D.m5830e();
    }

    public final void onNewIntent(Intent intent) {
        this.f2662G.m5684F();
        AnonymousClass0cU anonymousClass0cU = this.f2691j;
        AnonymousClass0Cm anonymousClass0Cm = this.f2671P;
        String obj = this.f2662G.f6981B.f6955D.toString();
        Intent intent2 = intent;
        AnonymousClass0cT.m5870C(this, this, intent);
        boolean B = anonymousClass0cU.m5874B(intent2, anonymousClass0Cm, obj, this, this);
        AnonymousClass0d5 B2 = AnonymousClass0d5.m5940B(anonymousClass0Cm);
        B2.f7310C = B | B2.f7310C;
        super.onNewIntent(intent2);
    }

    public final void onPause() {
        Object obj;
        int B = AnonymousClass0cQ.m5852B(this, 392973654);
        super.onPause();
        this.f2662G.f6981B.f6954C.m5688B();
        AnonymousClass0cF anonymousClass0cF = this.f2665J;
        AnonymousClass0QP anonymousClass0QP = this.f2685d;
        AnonymousClass0c6 anonymousClass0c6 = this.f2662G;
        AnonymousClass0cG anonymousClass0cG = this.f2666K;
        AnonymousClass0cn anonymousClass0cn = this.f2682a;
        AnonymousClass0cw anonymousClass0cw = this.f2692k;
        SwipeNavigationContainer swipeNavigationContainer = this.f2693l;
        AnonymousClass0bo anonymousClass0bo = this.f2668M;
        if (anonymousClass0QP != null) {
            anonymousClass0QP.f7101B.m5765J(anonymousClass0QP).m5766K();
        }
        anonymousClass0cw.f7285F.removeCallbacks(anonymousClass0cw.f7284E);
        AnonymousClass4e8 anonymousClass4e8 = anonymousClass0cn.f7241E;
        if (anonymousClass4e8 != null) {
            Handler handler = anonymousClass4e8.f55932C;
            if (handler != null) {
                AnonymousClass0OR.m3627G(handler, null, -1774012907);
            }
        }
        anonymousClass0cG.f7079G.removeCallbacksAndMessages(null);
        anonymousClass0cG.f7085M.clear();
        AnonymousClass3Tr anonymousClass3Tr = anonymousClass0cG.f7082J;
        if (anonymousClass3Tr != null) {
            AnonymousClass3Tr.B(anonymousClass3Tr);
        }
        anonymousClass3Tr = anonymousClass0cG.f7087O;
        if (anonymousClass3Tr != null) {
            AnonymousClass3Tr.B(anonymousClass3Tr);
        }
        anonymousClass3Tr = anonymousClass0cG.f7078F;
        if (anonymousClass3Tr != null) {
            AnonymousClass3Tr.B(anonymousClass3Tr);
        }
        AnonymousClass0F4 anonymousClass0F4 = AnonymousClass0F4.f2058E;
        anonymousClass0F4.m1507D(AnonymousClass0d8.class, anonymousClass0cG.f7074B);
        anonymousClass0F4.m1507D(AnonymousClass0d9.class, anonymousClass0cG.f7081I);
        anonymousClass0F4.m1507D(AnonymousClass0dA.class, anonymousClass0cG.f7075C);
        anonymousClass0F4.m1507D(AnonymousClass0dO.class, anonymousClass0cG.f7083K);
        AnonymousClass0dB.m5950F(anonymousClass0cF.f7070C);
        boolean z = false;
        if (anonymousClass0c6.m5681C()) {
            if ((anonymousClass0bo.f6866D.mo1412B(swipeNavigationContainer.getPosition()) == 0.0f ? 1 : null) == null) {
                obj = null;
                if (obj != null) {
                    if ((anonymousClass0bo.f6866D.mo1414D(swipeNavigationContainer.getPosition()) != 0.0f ? 1 : null) != null) {
                        z = true;
                    }
                }
                anonymousClass0cF.f7073F = z;
                AnonymousClass0RG.m4132D().wc(this);
                AnonymousClass0cQ.m5853C(this, 990526814, B);
            }
        }
        obj = 1;
        if (obj != null) {
            if (anonymousClass0bo.f6866D.mo1414D(swipeNavigationContainer.getPosition()) != 0.0f) {
            }
            if ((anonymousClass0bo.f6866D.mo1414D(swipeNavigationContainer.getPosition()) != 0.0f ? 1 : null) != null) {
                z = true;
            }
        }
        anonymousClass0cF.f7073F = z;
        AnonymousClass0RG.m4132D().wc(this);
        AnonymousClass0cQ.m5853C(this, 990526814, B);
    }

    public final void onPostResume() {
        AnonymousClass0Iz.f2854L.f2856C = this.f2662G.f6981B.f6955D.toString();
        super.onPostResume();
        AnonymousClass0c6 anonymousClass0c6 = this.f2662G;
        AnonymousClass0c0 anonymousClass0c0 = anonymousClass0c6.f6994O;
        if (anonymousClass0c0 != null) {
            anonymousClass0c6.m5685G(anonymousClass0c0);
            anonymousClass0c6.f6994O = null;
        }
        anonymousClass0c0 = anonymousClass0c6.f6993N;
        if (anonymousClass0c0 != null) {
            anonymousClass0c0.f6954C.m5694H().mo1464P(0, 1);
            anonymousClass0c6.f6993N = null;
        }
        anonymousClass0c6.f6981B.f6954C.m5693G();
        Bundle bundle = f2656o;
        f2656o = null;
        if (!(bundle == null || bundle.isEmpty())) {
            AnonymousClass0d5 B = AnonymousClass0d5.m5940B(this.f2671P);
            B.f7310C = true | B.f7310C;
            AnonymousClass0Cm anonymousClass0Cm = this.f2671P;
            AnonymousClass0dD E = AnonymousClass0dC.m5955E(new AnonymousClass0dC(), bundle.getString("screen"));
            if (E == null) {
                throw new RuntimeException("Received unknown starting bundle type");
            } else if (!E.m5959A(this, anonymousClass0Cm, bundle)) {
                AnonymousClass5k1 anonymousClass5k1 = E.f7359C;
                if (anonymousClass5k1 != null) {
                    anonymousClass5k1.PHA(this, anonymousClass0Cm, bundle);
                }
            }
        }
        AnonymousClass0cF anonymousClass0cF = this.f2665J;
        AnonymousClass0d5 B2 = AnonymousClass0d5.m5940B(this.f2671P);
        boolean z = anonymousClass0cF.f7073F;
        long j = AnonymousClass0HV.m2008D(B2.f7312E).f2646B.getLong("reset_to_main_feed_background_time", 0);
        AnonymousClass0HV.m2008D(B2.f7312E).TA(0);
        if (((Boolean) AnonymousClass0CC.ob.m846H(B2.f7312E)).booleanValue() && j != 0) {
            WeakReference weakReference = B2.f7309B;
            if (!(weakReference == null || weakReference.get() == null || !z || B2.f7310C)) {
                long abs = Math.abs(B2.f7311D - j);
                long abs2 = Math.abs(new Date().getTime() - B2.f7311D);
                if (abs > ((long) ((((Integer) AnonymousClass0CC.pb.m846H(B2.f7312E)).intValue() * JsonMappingException.MAX_REFS_TO_LIST) * 60)) && abs2 < 500) {
                    Intent intent = new Intent((Context) B2.f7309B.get(), ((Activity) B2.f7309B.get()).getClass());
                    intent.addFlags(268533760);
                    AnonymousClass0IW.m2243I(intent, (Context) B2.f7309B.get());
                    ((Activity) B2.f7309B.get()).finish();
                }
            }
        }
        B2.f7310C = false;
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        AnonymousClass0cF anonymousClass0cF = this.f2665J;
        AnonymousClass0PH dJ = dJ();
        anonymousClass0cF.f7073F = bundle.getBoolean("MainActivity.should_restore_to_main_feed");
        dJ.m3809B(bundle);
    }

    public final void onResume() {
        int B = AnonymousClass0cQ.m5852B(this, -850764651);
        AnonymousClass0c6 anonymousClass0c6 = this.f2662G;
        anonymousClass0c6.m5684F();
        anonymousClass0c6.f6981B.f6954C.m5693G();
        AnonymousClass0RG.m4132D().zc(this);
        AnonymousClass0EA.m1322B();
        super.onResume();
        OnLongClickListener anonymousClass0dE = new AnonymousClass0dE(this);
        AnonymousClass0cF anonymousClass0cF = this.f2665J;
        AnonymousClass0Cm anonymousClass0Cm = this.f2671P;
        AnonymousClass0QP anonymousClass0QP = this.f2685d;
        View view = this.f2686e;
        boolean z = this.f2690i;
        String str = this.f2679X;
        AnonymousClass0br anonymousClass0br = this.f2667L;
        SwipeNavigationContainer swipeNavigationContainer = this.f2693l;
        AnonymousClass0bo anonymousClass0bo = this.f2668M;
        AnonymousClass0cw anonymousClass0cw = this.f2692k;
        AnonymousClass0cG anonymousClass0cG = this.f2666K;
        View lS = lS();
        if (anonymousClass0QP != null) {
            AnonymousClass0cN anonymousClass0cN = anonymousClass0QP.f7101B;
            if (anonymousClass0cN != null) {
                anonymousClass0cN.m5756A(anonymousClass0QP).m5766K();
            }
        }
        if (z) {
            anonymousClass0cF.f7071D.YRA(false);
            if (swipeNavigationContainer.getPosition() != anonymousClass0bo.f6866D.mo1417G() || anonymousClass0br == null || anonymousClass0br.f6876G == null) {
                anonymousClass0cF.f7071D.OWA(AnonymousClass3jF.B().B(anonymousClass0bo.f6866D.mo1417G()).A(false).C("story_share_intent").ID());
            } else {
                anonymousClass0br.f6876G.m6003C();
            }
        }
        AnonymousClass0cw.m5932B(anonymousClass0cw);
        AnonymousClass55Q anonymousClass55Q = AnonymousClass0EA.m1322B().f1949B;
        AnonymousClass0GG.m1763B(anonymousClass55Q.f59993C, new AnonymousClass55O(anonymousClass55Q, AnonymousClass55Q.B(anonymousClass55Q, "newstab"), anonymousClass0Cm), -1069717001);
        AnonymousClass0MM.f3405B = ((Integer) AnonymousClass0CC.QV.m846H(anonymousClass0Cm)).intValue();
        AnonymousClass0HV.m2012H(anonymousClass0Cm.f1759C, 0);
        AnonymousClass0MO.m3165C(anonymousClass0Cm).m3170B();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("MainActivity.BROADCAST_BACK_PUSHED");
        intentFilter.addAction("SelfFragment.BROADCAST_SELF_PROFILE_SHOWN");
        AnonymousClass0F4 anonymousClass0F4 = AnonymousClass0F4.f2058E;
        anonymousClass0F4.m1504A(AnonymousClass0d8.class, anonymousClass0cG.f7074B);
        anonymousClass0F4.m1504A(AnonymousClass0d9.class, anonymousClass0cG.f7081I);
        anonymousClass0F4.m1504A(AnonymousClass0dA.class, anonymousClass0cG.f7075C);
        anonymousClass0F4.m1504A(AnonymousClass0dO.class, anonymousClass0cG.f7083K);
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0cG.f7088P;
        if (!(anonymousClass0Cm2 == null || AnonymousClass0HV.m2008D(anonymousClass0Cm2).f2646B.getBoolean("direct_seen_tab_moved_nux", false))) {
            AnonymousClass3Tr anonymousClass3Tr = anonymousClass0cG.f7078F;
            if (!(anonymousClass3Tr == null || anonymousClass0cG.f7080H)) {
                anonymousClass3Tr.f41553E.post(new AnonymousClass3Tt(anonymousClass0cG));
            }
        }
        anonymousClass0cF.f7070C = new AnonymousClass0dK(anonymousClass0cF, lS, anonymousClass0cG);
        AnonymousClass0dB.m5946B(anonymousClass0cF.f7070C, intentFilter);
        if (str != null) {
            AnonymousClass0JQ.f2915B.mo575N(anonymousClass0Cm, str);
            anonymousClass0cF.f7071D.APA(null);
        }
        if (view != null && AnonymousClass0Cd.f1698B.m966J()) {
            view.setOnLongClickListener(anonymousClass0dE);
        }
        if (anonymousClass0Cm != null) {
            AnonymousClass0M7.f3347C.mo868O(anonymousClass0Cm);
            AnonymousClass0dL.m6024B(anonymousClass0Cm).m6028D();
        } else {
            AnonymousClass0M7.f3347C.mo867N();
        }
        anonymousClass0cF.f7071D.GWA();
        AnonymousClass0RG.m4132D().f4619B = false;
        AnonymousClass0NN.m3291B("ig_android_pigeon_sampling_test_event", null).m3310R();
        AnonymousClass0FM.m1565B("init_to_activity_resume_ms", "AppStartPerformanceTracer");
        AnonymousClass0F9.m1510D(AnonymousClass0F9.m1509C(), "ACTIVITY_RESUMED");
        AnonymousClass0cQ.m5853C(this, 1013147563, B);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass0c6 anonymousClass0c6 = this.f2662G;
        for (AnonymousClass0c0 anonymousClass0c0 : anonymousClass0c6.f6983D) {
            if (anonymousClass0c0.f6956E && anonymousClass0c0.f6957F) {
                Parcelable PA = anonymousClass0c0.f6954C.f7000B.f7003D.PA();
                if (PA != null) {
                    bundle.putParcelable(anonymousClass0c0.f6955D.toString(), PA);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        int size = anonymousClass0c6.f6984E.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((AnonymousClass0cA) anonymousClass0c6.f6984E.get(i)).toString());
        }
        bundle.putStringArrayList("HostManager.BUNDLE_KEY_BACK_TAB_LIST", arrayList);
        if ((anonymousClass0c6.f6992M.m2849I() > 0 ? 1 : null) != null) {
            bundle.putInt("host_manager_next_request_index", anonymousClass0c6.f6991L);
            int[] iArr = new int[anonymousClass0c6.f6992M.m2849I()];
            String[] strArr = new String[anonymousClass0c6.f6992M.m2849I()];
            for (int i2 = 0; i2 < anonymousClass0c6.f6992M.m2849I(); i2++) {
                iArr[i2] = anonymousClass0c6.f6992M.m2845E(i2);
                strArr[i2] = (String) anonymousClass0c6.f6992M.m2850J(i2);
            }
            bundle.putIntArray("host_manager_request_indicies", iArr);
            bundle.putStringArray("host_manager_request_fragment_who", strArr);
        }
        AnonymousClass0cF anonymousClass0cF = this.f2665J;
        boolean z = this.f2677V;
        AnonymousClass0PH dJ = dJ();
        float f = this.f2658C;
        dJ.m3810C(bundle);
        bundle.putBoolean("handled_one_tap_dialog_request", z);
        bundle.putFloat("MainActivity.BUNDLE_KEY_CURRENT_NAVIGATION_POSITION", f);
        bundle.putBoolean("MainActivity.should_restore_to_main_feed", anonymousClass0cF.f7073F);
    }

    public final void onStart() {
        AnonymousClass0cP anonymousClass0cP;
        int B = AnonymousClass0cQ.m5852B(this, 523910853);
        super.onStart();
        AnonymousClass0c6 anonymousClass0c6 = this.f2662G;
        if (!anonymousClass0c6.f6986G) {
            anonymousClass0c6.f6986G = true;
            anonymousClass0cP = anonymousClass0c6.f6981B.f6954C.f7000B.f7003D;
            anonymousClass0cP.f7149Z = false;
            AnonymousClass0cP.m5776D(anonymousClass0cP, 2);
        }
        anonymousClass0c6.m5684F();
        anonymousClass0c6.f6981B.f6954C.m5693G();
        anonymousClass0c6.f6981B.f6954C.m5691E();
        anonymousClass0cP = anonymousClass0c6.f6981B.f6954C.f7000B.f7003D;
        anonymousClass0cP.f7149Z = false;
        AnonymousClass0cP.m5776D(anonymousClass0cP, 4);
        anonymousClass0c6.f6981B.f6954C.m5697K();
        anonymousClass0c6.f6981B.f6958G = true;
        AnonymousClass0F9 C = AnonymousClass0F9.m1509C();
        if (AnonymousClass0Fj.f2192B.m1668C()) {
            AnonymousClass0F9.m1508B(C, this, AnonymousClass0FA.WARM, -1);
            AnonymousClass0F9.m1509C().m1518H(AnonymousClass0Kl.LAUNCHER);
        }
        AnonymousClass0cn anonymousClass0cn = this.f2682a;
        this.f2676U.m5933A(true, this);
        AnonymousClass0F4.f2058E.m1504A(AnonymousClass0RN.class, anonymousClass0cn.f7242F).m1504A(AnonymousClass0Za.class, anonymousClass0cn.f7246J);
        if (anonymousClass0cn.f7240D) {
            AnonymousClass0J7.f2895B.mo519A(anonymousClass0cn.f7245I, anonymousClass0cn.f7239C);
            AnonymousClass0cG anonymousClass0cG = anonymousClass0cn.f7243G;
            int L = AnonymousClass0J7.f2895B.mo530L(anonymousClass0cn.f7245I);
            AnonymousClass3Tr anonymousClass3Tr = anonymousClass0cG.f7078F;
            if (anonymousClass3Tr != null) {
                if (L > 0) {
                    anonymousClass3Tr.C(L);
                } else {
                    anonymousClass3Tr.A();
                }
            }
            anonymousClass0cn.f7241E.A();
        }
        AnonymousClass0cQ.m5853C(this, -1317060568, B);
    }

    public final void onStateNotSaved() {
        this.f2662G.m5684F();
    }

    public final void onStop() {
        int B = AnonymousClass0cQ.m5852B(this, -601180033);
        AnonymousClass0cn anonymousClass0cn = this.f2682a;
        AnonymousClass0cx anonymousClass0cx = this.f2676U;
        AnonymousClass0F4.f2058E.m1507D(AnonymousClass0RN.class, anonymousClass0cn.f7242F).m1507D(AnonymousClass0Za.class, anonymousClass0cn.f7246J);
        anonymousClass0cx.m5933A(false, this);
        if (anonymousClass0cn.f7240D) {
            AnonymousClass0J7.f2895B.mo543Y(anonymousClass0cn.f7245I, anonymousClass0cn.f7239C);
        }
        super.onStop();
        AnonymousClass0c6 anonymousClass0c6 = this.f2662G;
        for (AnonymousClass0c0 anonymousClass0c0 : anonymousClass0c6.f6983D) {
            if (anonymousClass0c0.f6956E && anonymousClass0c0.f6958G) {
                anonymousClass0c0.f6958G = false;
                AnonymousClass0c6.m5676B(anonymousClass0c6, anonymousClass0c0);
                AnonymousClass0cP anonymousClass0cP = anonymousClass0c0.f6954C.f7000B.f7003D;
                anonymousClass0cP.f7149Z = true;
                AnonymousClass0cP.m5776D(anonymousClass0cP, 3);
                anonymousClass0c0.f6954C.m5692F(false);
            }
        }
        AnonymousClass0cQ.m5853C(this, -1794889423, B);
    }

    public final void onTrimMemory(int i) {
        this.f2662G.f6981B.f6954C.f7000B.f7003D.m5830e();
    }

    public final void un(AnonymousClass0c0 anonymousClass0c0) {
        if (anonymousClass0c0.f6954C.m5694H().mo1453E(anonymousClass0c0.f6953B) == null) {
            AnonymousClass0IV B = anonymousClass0c0.f6954C.m5694H().mo1450B();
            AnonymousClass0IL B2 = m2072B(this, anonymousClass0c0.f6955D.MM());
            B.mo1623N(anonymousClass0c0.f6953B, B2, B2.getClass().getCanonicalName());
            B.mo1615F();
        }
    }

    public final void vn(AnonymousClass0c0 anonymousClass0c0, AnonymousClass0c0 anonymousClass0c02) {
        AnonymousClass0cF anonymousClass0cF = this.f2665J;
        AnonymousClass0Cm anonymousClass0Cm = this.f2671P;
        AnonymousClass0cA anonymousClass0cA = (AnonymousClass0cA) anonymousClass0c0.f6955D;
        AnonymousClass0cA anonymousClass0cA2 = (AnonymousClass0cA) this.f2662G.f6981B.f6955D;
        AnonymousClass0cA anonymousClass0cA3 = AnonymousClass0cA.PROFILE;
        if (!anonymousClass0cA2.equals(anonymousClass0cA3) && anonymousClass0cA.equals(anonymousClass0cA3)) {
            AnonymousClass0Jj.f2938B.mo660C(anonymousClass0cF.f7069B, anonymousClass0Cm);
        }
        if (this.f2666K.m5750A((AnonymousClass0cA) anonymousClass0c02.f6955D)) {
            XHA((AnonymousClass0cA) anonymousClass0c02.f6955D);
        }
        AnonymousClass0IU H = anonymousClass0c02.f6954C.m5694H();
        H.mo1467S(this.f2697C);
        H.mo1449A(this.f2697C);
        AnonymousClass0cA anonymousClass0cA4 = (AnonymousClass0cA) this.f2662G.m5680B((AnonymousClass0cA) anonymousClass0c02.f6955D).f6955D;
        for (int i = 0; i < this.f2669N.getChildCount(); i++) {
            if (this.f2669N.getChildAt(i).getTag().equals(anonymousClass0cA4)) {
                View childAt = this.f2669N.getChildAt(i);
                this.f2664I.setSelected(false);
                this.f2664I = childAt;
                childAt.setSelected(true);
            }
        }
        m2084P();
        m2085Q();
    }

    public final boolean vu() {
        return m2073C(this);
    }

    public final AnonymousClass0bq xJ() {
        return this.f2668M.f6866D;
    }

    public final void yTA(boolean z) {
        this.f2673R.setLayoutParams(z ? this.f2684c : this.f2695n);
    }
}
