package X;

import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnFocusChangeListener;

/* renamed from: X.4PK */
public final class AnonymousClass4PK implements OnFocusChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5cl f53725B;

    public AnonymousClass4PK(AnonymousClass5cl anonymousClass5cl) {
        this.f53725B = anonymousClass5cl;
    }

    public final void onFocusChange(View view, boolean z) {
        AnonymousClass2bu anonymousClass2bu;
        AnonymousClass2bu anonymousClass2bu2;
        if (z) {
            AnonymousClass5cl anonymousClass5cl = this.f53725B;
            anonymousClass5cl.V(AnonymousClass4Pk.EDITING_TEXT);
            AnonymousClass0Nm.k(anonymousClass5cl.f67407F);
            AnonymousClass4UU anonymousClass4UU = anonymousClass5cl.f67439l;
            anonymousClass2bu = anonymousClass5cl.f67413L;
            if (anonymousClass2bu == null) {
                anonymousClass4UU.m24354A(AnonymousClass2Jg.OFF, true);
            } else {
                anonymousClass4UU.m24354A(AnonymousClass2Ji.m15030C(anonymousClass2bu), false);
            }
            if (anonymousClass5cl.f67418Q != null) {
                int i = 0;
                for (AnonymousClass2bu anonymousClass2bu22 : anonymousClass5cl.f67415N.m16525F(AnonymousClass2bu.class)) {
                    if (anonymousClass2bu22 != anonymousClass5cl.f67413L) {
                        i += ((AnonymousClass2VP[]) AnonymousClass2Jd.m15020E(anonymousClass2bu22.f31514M, AnonymousClass2VP.class)).length;
                    }
                }
                AnonymousClass5TZ anonymousClass5TZ = anonymousClass5cl.f67418Q;
                Spanned text = anonymousClass5cl.f67407F.getText();
                anonymousClass5TZ.f64505H = i;
                anonymousClass5TZ.f64511N.clear();
                for (Object add : (AnonymousClass2VP[]) AnonymousClass2Jd.m15020E(text, AnonymousClass2VP.class)) {
                    anonymousClass5TZ.f64511N.add(add);
                }
            }
            return;
        }
        Object obj;
        AnonymousClass5cl anonymousClass5cl2;
        AnonymousClass5cl anonymousClass5cl3;
        AnonymousClass2K5 A;
        CharSequence text2 = this.f53725B.f67407F.getText();
        if (!TextUtils.isEmpty(text2)) {
            if (!TextUtils.isEmpty(text2.toString().trim())) {
                obj = null;
                if (obj == null) {
                    if (this.f53725B.f67413L != null) {
                        this.f53725B.f67415N.m16529J(this.f53725B.f67413L);
                        AnonymousClass5cl.D(this.f53725B);
                    }
                    anonymousClass5cl2 = this.f53725B;
                    anonymousClass5cl2.V(AnonymousClass4Pk.AVAILABLE);
                    AnonymousClass0Nm.N(anonymousClass5cl2.f67407F);
                    anonymousClass5cl2.X();
                }
                if (this.f53725B.f67413L == null) {
                    if (this.f53725B.f67419R) {
                        AnonymousClass4QC.m24165B(this.f53725B.f67411J, this.f53725B.f67444q, null);
                    }
                    AnonymousClass2K5 A2 = this.f53725B.f67442o.m24359A();
                    anonymousClass5cl2 = this.f53725B;
                    this.f53725B.f67413L = AnonymousClass5cl.F(anonymousClass5cl2, anonymousClass5cl2.f67411J, A2);
                    AnonymousClass2Lb anonymousClass2Lb = new AnonymousClass2Lb();
                    anonymousClass2Lb.f29352B = true;
                    anonymousClass2Lb.f29354D = A2.f28943N.f28961C;
                    anonymousClass2Lb.f29364N = "TextOverlayController";
                    this.f53725B.f67415N.m16520A(this.f53725B.f67413L, anonymousClass2Lb.m15170A());
                }
                anonymousClass5cl3 = this.f53725B;
                A = anonymousClass5cl3.f67442o.m24359A();
                if (A.f28936G) {
                    anonymousClass5cl3.f67413L.m16453K((float) A.f28943N.m15072A(anonymousClass5cl3.f67411J));
                } else {
                    anonymousClass5cl3.f67413L.m16453K(AnonymousClass0Nm.m(anonymousClass5cl3.f67407F.getContext(), AnonymousClass5cl.I(anonymousClass5cl3)));
                }
                anonymousClass5cl3 = this.f53725B;
                if (anonymousClass5cl3.f67439l.f54594B != AnonymousClass2Jg.OFF) {
                    AnonymousClass2bu anonymousClass2bu3 = anonymousClass5cl3.f67413L;
                    anonymousClass2bu3.f31510I.setShadowLayer(anonymousClass5cl3.f67434g, 0.0f, anonymousClass5cl3.f67433f, anonymousClass5cl3.f67432e);
                    anonymousClass2bu3.m16446D();
                } else {
                    anonymousClass2bu22 = anonymousClass5cl3.f67413L;
                    anonymousClass2bu22.f31510I.clearShadowLayer();
                    anonymousClass2bu22.m16446D();
                }
                this.f53725B.f67413L.m16452J(this.f53725B.f67407F.getCurrentTextColor());
                AnonymousClass2bu anonymousClass2bu4 = this.f53725B.f67413L;
                float lineSpacingExtra = this.f53725B.f67407F.getLineSpacingExtra();
                float lineSpacingMultiplier = this.f53725B.f67407F.getLineSpacingMultiplier();
                anonymousClass2bu4.f31512K = lineSpacingExtra;
                anonymousClass2bu4.f31513L = lineSpacingMultiplier;
                anonymousClass2bu4.m16446D();
                this.f53725B.f67413L.m16450H(AnonymousClass5cl.G(this.f53725B.f67407F.getText()));
                anonymousClass5cl2 = this.f53725B;
                AnonymousClass2Jy.m15047B(anonymousClass5cl2.f67407F);
                anonymousClass2bu = anonymousClass5cl2.f67413L;
                if (anonymousClass2bu != null) {
                    AnonymousClass2Jy.m15048C(anonymousClass2bu);
                }
                anonymousClass5cl2 = this.f53725B;
                AnonymousClass5cl.B(anonymousClass5cl2, anonymousClass5cl2.f67413L);
                AnonymousClass5cl.R(this.f53725B);
                AnonymousClass5cl.S(this.f53725B);
                this.f53725B.f67413L.setVisible(true, false);
                this.f53725B.f67413L.invalidateSelf();
                anonymousClass5cl2 = this.f53725B;
                anonymousClass5cl2.V(AnonymousClass4Pk.AVAILABLE);
                AnonymousClass0Nm.N(anonymousClass5cl2.f67407F);
                anonymousClass5cl2.X();
                return;
            }
        }
        obj = 1;
        if (obj == null) {
            if (this.f53725B.f67413L == null) {
                if (this.f53725B.f67419R) {
                    AnonymousClass4QC.m24165B(this.f53725B.f67411J, this.f53725B.f67444q, null);
                }
                AnonymousClass2K5 A22 = this.f53725B.f67442o.m24359A();
                anonymousClass5cl2 = this.f53725B;
                this.f53725B.f67413L = AnonymousClass5cl.F(anonymousClass5cl2, anonymousClass5cl2.f67411J, A22);
                AnonymousClass2Lb anonymousClass2Lb2 = new AnonymousClass2Lb();
                anonymousClass2Lb2.f29352B = true;
                anonymousClass2Lb2.f29354D = A22.f28943N.f28961C;
                anonymousClass2Lb2.f29364N = "TextOverlayController";
                this.f53725B.f67415N.m16520A(this.f53725B.f67413L, anonymousClass2Lb2.m15170A());
            }
            anonymousClass5cl3 = this.f53725B;
            A = anonymousClass5cl3.f67442o.m24359A();
            if (A.f28936G) {
                anonymousClass5cl3.f67413L.m16453K((float) A.f28943N.m15072A(anonymousClass5cl3.f67411J));
            } else {
                anonymousClass5cl3.f67413L.m16453K(AnonymousClass0Nm.m(anonymousClass5cl3.f67407F.getContext(), AnonymousClass5cl.I(anonymousClass5cl3)));
            }
            anonymousClass5cl3 = this.f53725B;
            if (anonymousClass5cl3.f67439l.f54594B != AnonymousClass2Jg.OFF) {
                anonymousClass2bu22 = anonymousClass5cl3.f67413L;
                anonymousClass2bu22.f31510I.clearShadowLayer();
                anonymousClass2bu22.m16446D();
            } else {
                AnonymousClass2bu anonymousClass2bu32 = anonymousClass5cl3.f67413L;
                anonymousClass2bu32.f31510I.setShadowLayer(anonymousClass5cl3.f67434g, 0.0f, anonymousClass5cl3.f67433f, anonymousClass5cl3.f67432e);
                anonymousClass2bu32.m16446D();
            }
            this.f53725B.f67413L.m16452J(this.f53725B.f67407F.getCurrentTextColor());
            AnonymousClass2bu anonymousClass2bu42 = this.f53725B.f67413L;
            float lineSpacingExtra2 = this.f53725B.f67407F.getLineSpacingExtra();
            float lineSpacingMultiplier2 = this.f53725B.f67407F.getLineSpacingMultiplier();
            anonymousClass2bu42.f31512K = lineSpacingExtra2;
            anonymousClass2bu42.f31513L = lineSpacingMultiplier2;
            anonymousClass2bu42.m16446D();
            this.f53725B.f67413L.m16450H(AnonymousClass5cl.G(this.f53725B.f67407F.getText()));
            anonymousClass5cl2 = this.f53725B;
            AnonymousClass2Jy.m15047B(anonymousClass5cl2.f67407F);
            anonymousClass2bu = anonymousClass5cl2.f67413L;
            if (anonymousClass2bu != null) {
                AnonymousClass2Jy.m15048C(anonymousClass2bu);
            }
            anonymousClass5cl2 = this.f53725B;
            AnonymousClass5cl.B(anonymousClass5cl2, anonymousClass5cl2.f67413L);
            AnonymousClass5cl.R(this.f53725B);
            AnonymousClass5cl.S(this.f53725B);
            this.f53725B.f67413L.setVisible(true, false);
            this.f53725B.f67413L.invalidateSelf();
            anonymousClass5cl2 = this.f53725B;
            anonymousClass5cl2.V(AnonymousClass4Pk.AVAILABLE);
            AnonymousClass0Nm.N(anonymousClass5cl2.f67407F);
            anonymousClass5cl2.X();
            return;
        }
        if (this.f53725B.f67413L != null) {
            this.f53725B.f67415N.m16529J(this.f53725B.f67413L);
            AnonymousClass5cl.D(this.f53725B);
        }
        anonymousClass5cl2 = this.f53725B;
        anonymousClass5cl2.V(AnonymousClass4Pk.AVAILABLE);
        AnonymousClass0Nm.N(anonymousClass5cl2.f67407F);
        anonymousClass5cl2.X();
    }
}
