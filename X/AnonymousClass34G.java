package X;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.facebook.C0164R;

/* renamed from: X.34G */
public class AnonymousClass34G extends AnonymousClass0Iw {
    /* renamed from: B */
    public final Context f37513B;
    /* renamed from: C */
    public final AnonymousClass0Oh f37514C;
    /* renamed from: D */
    private final AnonymousClass3TC f37515D;
    /* renamed from: E */
    private final AnonymousClass0IU f37516E;
    /* renamed from: F */
    private final Handler f37517F;

    /* renamed from: B */
    public void mo4700B(String str) {
    }

    /* renamed from: C */
    public void mo4701C(String str, String str2) {
    }

    /* renamed from: E */
    public void mo4703E(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ci anonymousClass0Ci) {
    }

    public AnonymousClass34G(Context context, Handler handler, AnonymousClass0IU anonymousClass0IU, AnonymousClass3TC anonymousClass3TC, AnonymousClass0Oh anonymousClass0Oh) {
        this.f37513B = context;
        this.f37517F = handler;
        this.f37516E = anonymousClass0IU;
        this.f37515D = anonymousClass3TC;
        this.f37514C = anonymousClass0Oh;
    }

    /* renamed from: A */
    public final void m18388A() {
        AnonymousClass0OR.D(this.f37517F, new AnonymousClass34D(this, (AnonymousClass1Pn) this.f37516E.F("ProgressDialog")), -1517857053);
    }

    /* renamed from: B */
    public static void m18387B(AnonymousClass34G anonymousClass34G, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass2DQ anonymousClass2DQ) {
        anonymousClass34G.m18388A();
        if (anonymousClass2DQ.f27589C) {
            anonymousClass34G.mo4703E(anonymousClass0Cm, anonymousClass2DQ.f27591E);
        } else {
            anonymousClass34G.mo4702D(anonymousClass0Cm, anonymousClass2DQ.f27591E);
        }
    }

    /* renamed from: D */
    public void mo4702D(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ci anonymousClass0Ci) {
        anonymousClass0Ci.hB = Integer.valueOf(0);
        AnonymousClass1Pj.I(anonymousClass0Ci.uT());
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        String str;
        String F;
        int I = AnonymousClass0cQ.I(this, 1303638659);
        m18388A();
        AnonymousClass3TC anonymousClass3TC;
        if (anonymousClass0Q6.B()) {
            AnonymousClass2DQ anonymousClass2DQ = (AnonymousClass2DQ) anonymousClass0Q6.f4288C;
            boolean D = AnonymousClass0kr.D(null, anonymousClass2DQ);
            AnonymousClass2DP anonymousClass2DP = anonymousClass2DQ.f27588B;
            str = anonymousClass2DP != null ? anonymousClass2DP.f27587C : null;
            F = anonymousClass2DQ.m14731F();
            if (TextUtils.isEmpty(F)) {
                F = anonymousClass2DQ.f4181G;
            }
            if (!D) {
                anonymousClass3TC = this.f37515D;
                if (anonymousClass3TC != null) {
                    anonymousClass3TC.AUA(F, AnonymousClass22w.USERNAME);
                    mo4701C(str, F);
                    AnonymousClass0cQ.H(this, 141071645, I);
                }
            }
        }
        F = this.f37513B.getString(C0164R.string.network_error);
        str = this.f37513B.getString(C0164R.string.unknown_error_occured);
        anonymousClass3TC = this.f37515D;
        if (anonymousClass3TC != null) {
            anonymousClass3TC.AUA(F, AnonymousClass22w.UNKNOWN);
            mo4701C(str, F);
            AnonymousClass0cQ.H(this, 141071645, I);
        }
        AnonymousClass0F4.f2058E.B(new AnonymousClass34E(F, AnonymousClass22w.USERNAME));
        mo4701C(str, F);
        AnonymousClass0cQ.H(this, 141071645, I);
    }

    public void onStart() {
        int I = AnonymousClass0cQ.I(this, -2123151724);
        super.onStart();
        new AnonymousClass34F().D(this.f37516E, "ProgressDialog");
        AnonymousClass0cQ.H(this, -1645178011, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 1940633790);
        AnonymousClass2DQ anonymousClass2DQ = (AnonymousClass2DQ) obj;
        int I2 = AnonymousClass0cQ.I(this, -1754971842);
        AnonymousClass0Ci anonymousClass0Ci = anonymousClass2DQ.f27591E;
        (anonymousClass2DQ.f27589C ? AnonymousClass0Fr.LogIn : AnonymousClass0Fr.RegisterAccountCreated).G(AnonymousClass2Na.DONE, this.f37514C).m15361B("instagram_id", anonymousClass0Ci.getId()).m15364E();
        mo4700B(anonymousClass0Ci.getId());
        AnonymousClass0Cm G = AnonymousClass1Qv.G(this.f37513B, anonymousClass0Ci, AnonymousClass0Cd.f1698B.N(), false);
        if (anonymousClass2DQ.f27590D) {
            AnonymousClass0Ix.D(new AnonymousClass34C(this, G, anonymousClass2DQ));
        } else {
            AnonymousClass34G.m18387B(this, G, anonymousClass2DQ);
        }
        AnonymousClass0cQ.H(this, -1245501504, I2);
        AnonymousClass0cQ.H(this, -658391784, I);
    }
}
