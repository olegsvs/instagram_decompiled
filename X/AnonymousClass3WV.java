package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.AccessToken;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3WV */
public final class AnonymousClass3WV extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3Wk f41900B;
    /* renamed from: C */
    public final /* synthetic */ String f41901C;
    /* renamed from: D */
    public final /* synthetic */ String f41902D;
    /* renamed from: E */
    public final /* synthetic */ boolean f41903E;
    /* renamed from: F */
    public final /* synthetic */ boolean f41904F;

    public AnonymousClass3WV(AnonymousClass3Wk anonymousClass3Wk, boolean z, boolean z2, String str, String str2) {
        this.f41900B = anonymousClass3Wk;
        this.f41903E = z;
        this.f41904F = z2;
        this.f41902D = str;
        this.f41901C = str2;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1403402743);
        Object obj = (anonymousClass0Q6.B() && ((AnonymousClass2Zz) anonymousClass0Q6.f4288C).f27693D) ? 1 : null;
        if (obj != null) {
            AnonymousClass3Wk anonymousClass3Wk = this.f41900B;
            AnonymousClass0OR.D(anonymousClass3Wk.f41946E, new AnonymousClass3Wd(anonymousClass3Wk, ((AnonymousClass2Zz) anonymousClass0Q6.f4288C).f27692C, ((AnonymousClass2Zz) anonymousClass0Q6.f4288C).f27691B), 1732450663);
            AnonymousClass0cQ.H(this, -2107875315, I);
            return;
        }
        String str;
        boolean B = anonymousClass0Q6.B();
        if (B) {
            str = ((AnonymousClass2Zz) anonymousClass0Q6.f4288C).f4184J;
        } else {
            str = null;
        }
        AnonymousClass2NZ B2 = AnonymousClass0Fr.FacebookSsoError.F(this.f41900B.f41950I).m15361B("fbid", this.f41902D);
        String str2 = "reason";
        if (str == null) {
            str = "request_failed";
        }
        B2.m15361B(str2, str).m15363D("token_source", this.f41903E ? "first_party_token" : "third_party_token").m15362C("has_response", B).m15362C("found_unlinked_account", this.f41904F).m15364E();
        if (B) {
            AnonymousClass2Zz anonymousClass2Zz = (AnonymousClass2Zz) anonymousClass0Q6.f4288C;
            if (!anonymousClass2Zz.D()) {
                AnonymousClass0P2 L = new AnonymousClass0P2(this.f41900B.f41943B).L(anonymousClass2Zz.A());
                if (anonymousClass2Zz.f4183I != null) {
                    L.f3974H = anonymousClass2Zz.f4183I;
                }
                if (anonymousClass2Zz.f4179E != null) {
                    L.L(anonymousClass2Zz.f4179E);
                }
                if (anonymousClass2Zz.f31365B != null) {
                    AnonymousClass3Wk anonymousClass3Wk2 = this.f41900B;
                    List list = anonymousClass2Zz.f31365B;
                    str = this.f41901C;
                    boolean z = this.f41903E;
                    if (!list.isEmpty()) {
                        AnonymousClass2Do anonymousClass2Do = (AnonymousClass2Do) list.get(0);
                        L.T(anonymousClass2Do.f27689C, AnonymousClass3Wk.m19813B(anonymousClass3Wk2, anonymousClass2Do, str, z));
                        if (list.size() > 1) {
                            AnonymousClass0Fr.FbClashDialog.F(anonymousClass3Wk2.f41950I).m15364E();
                            anonymousClass2Do = (AnonymousClass2Do) list.get(1);
                            L.O(anonymousClass2Do.f27689C, AnonymousClass3Wk.m19813B(anonymousClass3Wk2, anonymousClass2Do, str, z));
                        }
                    }
                } else {
                    L.S(C0164R.string.dismiss, null);
                }
                AnonymousClass3nj.m20683G(L);
            }
        } else {
            AnonymousClass3nj.m20680D(this.f41900B.f41943B);
        }
        AnonymousClass0cQ.H(this, 1321588649, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 2050381485);
        this.f41900B.f41948G.m14933A();
        AnonymousClass0cQ.H(this, 918828195, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, 1454584490);
        this.f41900B.f41948G.m14934B();
        AnonymousClass0cQ.H(this, -2024600041, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 68781991);
        AnonymousClass2Zz anonymousClass2Zz = (AnonymousClass2Zz) obj;
        int I2 = AnonymousClass0cQ.I(this, -191585455);
        AnonymousClass0Ci anonymousClass0Ci = anonymousClass2Zz.f31377N;
        if (anonymousClass0Ci != null) {
            if (!((anonymousClass2Zz.f31366C == 4 ? 1 : null) == null || anonymousClass2Zz.f31376M == null)) {
                AnonymousClass3Wk anonymousClass3Wk = this.f41900B;
                String str = anonymousClass2Zz.f31376M;
                AnonymousClass0Fr.CanRecoverPassword.F(anonymousClass3Wk.f41950I).m15364E();
                AnonymousClass0P2 anonymousClass0P2 = new AnonymousClass0P2(anonymousClass3Wk.f41943B);
                anonymousClass0P2.K(C0164R.string.reset_to_login);
                anonymousClass0P2.S(C0164R.string.reset_password, new AnonymousClass3Wh(anonymousClass3Wk, anonymousClass0Ci, str));
                anonymousClass0P2.A().show();
                AnonymousClass0cQ.H(this, -712980186, I2);
                AnonymousClass0cQ.H(this, -1562804551, I);
            }
        }
        if (anonymousClass0Ci != null) {
            AnonymousClass0Cm G = AnonymousClass1Qv.G(this.f41900B.f41945D.getContext(), anonymousClass0Ci, AnonymousClass0Cd.f1698B.N(), false);
            AnonymousClass1Pj.H(anonymousClass0Ci.uT());
            AnonymousClass0e0.B(AnonymousClass0Fr.FacebookSsoSuccess.H());
            AnonymousClass0Fr.FacebookSsoSuccess.F(this.f41900B.f41950I).m15361B("instagram_id", anonymousClass0Ci.getId()).m15363D("token_source", this.f41903E ? "first_party_token" : "third_party_token").m15362C("found_unlinked_account", this.f41904F).m15364E();
            if (this.f41900B.f41947F.f28510B == null) {
                this.f41900B.f41947F.f28510B = new AccessToken(anonymousClass2Zz.f31369F, anonymousClass2Zz.f31370G);
            }
            if (this.f41900B.f41947F.f28510B != null && AnonymousClass0a3.B()) {
                AnonymousClass2H3.m14905B(G, this.f41900B.f41947F.f28510B);
            }
            AnonymousClass0FO.Y(G, anonymousClass2Zz.f31369F, anonymousClass2Zz.f31370G, AnonymousClass2HK.FB_LOGIN);
            Uri E = AnonymousClass3Wk.m19816E(this.f41900B);
            if (E != null) {
                E = E.buildUpon().appendQueryParameter("fresh_sign_in", "1").build();
            }
            if (anonymousClass2Zz.f31372I == null || !anonymousClass2Zz.f31372I.f27633B) {
                AnonymousClass1Qv.F(G, this.f41900B.f41943B, this.f41900B.f41944C, true, E, false);
            } else {
                AnonymousClass0Ix.D(AnonymousClass2Ei.m14793B(this.f41900B.f41945D.getContext(), G, AnonymousClass0Om.F()));
                AnonymousClass0EE anonymousClass0EE = this.f41900B.f41944C;
                AnonymousClass0HV D = AnonymousClass0HV.D(G);
                String str2 = "account_nux_ran";
                boolean z = D.f2646B.getBoolean(str2, false);
                if (!z) {
                    D.f2646B.edit().putBoolean(str2, true).apply();
                }
                boolean z2 = !z && ((Boolean) AnonymousClass0CC.Ec.G()).booleanValue();
                AnonymousClass0NN.B("ig_android_should_launch_nux_post_facto", anonymousClass0EE).H("accountNuxRan", z).H("result", z2).R();
                if (z2) {
                    AnonymousClass0GO.C().B(this.f41900B.f41943B, G, AnonymousClass0Oh.FACEBOOK, new AnonymousClass3WU(this, G));
                }
            }
        } else if (anonymousClass2Zz.f31367D) {
            Context context = this.f41900B.f41945D.getContext();
            if (AnonymousClass0G5.B(context, C0164R.attr.nuxAllowSignUpFlow, true)) {
                AnonymousClass0FO.Y(this.f41900B.f41949H, anonymousClass2Zz.f31369F, anonymousClass2Zz.f31370G, AnonymousClass2HK.UNKNOWN);
                List A;
                if (anonymousClass2Zz.f31374K != null) {
                    A = anonymousClass2Zz.f31374K.m14794A();
                    AnonymousClass2NZ F = AnonymousClass0Fr.UsernameSuggestionPrototypesReceived.F(this.f41900B.f41950I);
                    str = "prototypes";
                    AnonymousClass0RR C = AnonymousClass0RR.C(", ");
                    AnonymousClass2El anonymousClass2El = anonymousClass2Zz.f31374K;
                    if (anonymousClass2El.f27923B == null) {
                        anonymousClass2El.f27923B = new ArrayList(anonymousClass2El.f27924C.size());
                        for (AnonymousClass2En anonymousClass2En : anonymousClass2El.f27924C) {
                            anonymousClass2El.f27923B.add(anonymousClass2En.f27928B);
                        }
                    }
                    F.m15361B(str, C.A(anonymousClass2El.f27923B)).m15364E();
                    AnonymousClass3Wk.m19819H(this.f41900B, A, anonymousClass2Zz.f31374K.f27924C, anonymousClass2Zz.f31375L);
                } else {
                    A = anonymousClass2Zz.f31373J;
                    if (A != null) {
                        AnonymousClass0Fr.NoPrototypeSent.F(this.f41900B.f41950I).m15364E();
                    }
                    AnonymousClass3Wk.m19819H(this.f41900B, A, null, anonymousClass2Zz.f31375L);
                }
            } else {
                new AnonymousClass0P2(context).V(C0164R.string.block_sign_up_via_facebook_title).K(C0164R.string.block_sign_up_via_facebook).S(C0164R.string.ok, null).A().show();
            }
        } else {
            String str3 = anonymousClass2Zz.f4184J;
            AnonymousClass2NZ B = AnonymousClass0Fr.FacebookSsoError.F(this.f41900B.f41950I).m15361B("fbid", this.f41902D);
            String str4 = "reason";
            if (str3 == null) {
                str3 = "bad_response";
            }
            B.m15361B(str4, str3).m15363D("token_source", this.f41903E ? "first_party_token" : "third_party_token").m15360A("code", anonymousClass2Zz.f31366C).m15362C("found_unlinked_account", this.f41904F).m15364E();
            AnonymousClass3Wk.m19820I(this.f41900B);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bad response with code: ");
            stringBuilder.append(anonymousClass2Zz.f31366C);
            AnonymousClass0Gn.C("FacebookSignUpRequest", stringBuilder.toString());
        }
        AnonymousClass0cQ.H(this, -712980186, I2);
        AnonymousClass0cQ.H(this, -1562804551, I);
    }
}
