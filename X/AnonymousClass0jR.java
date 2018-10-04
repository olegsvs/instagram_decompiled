package X;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.0jR */
public final class AnonymousClass0jR extends AnonymousClass0VA {
    /* renamed from: B */
    public AnonymousClass0uR f9162B;
    /* renamed from: C */
    public final AnonymousClass0IL f9163C;
    /* renamed from: D */
    public final FragmentActivity f9164D;
    /* renamed from: E */
    public final AnonymousClass0PZ f9165E;
    /* renamed from: F */
    public AnonymousClass0hq f9166F;
    /* renamed from: G */
    public final AnonymousClass0Cm f9167G;
    /* renamed from: H */
    private final AnonymousClass0F8 f9168H = new AnonymousClass0u8(this);
    /* renamed from: I */
    private final AnonymousClass0F8 f9169I = new AnonymousClass0u6(this);
    /* renamed from: J */
    private final AnonymousClass0F8 f9170J = new AnonymousClass0u1(this);
    /* renamed from: K */
    private final AnonymousClass0F8 f9171K = new AnonymousClass0u0(this);
    /* renamed from: L */
    private final AnonymousClass0F8 f9172L = new AnonymousClass0u3(this);
    /* renamed from: M */
    private final AnonymousClass0F8 f9173M = new AnonymousClass0u9(this);
    /* renamed from: N */
    private final AnonymousClass0F8 f9174N = new AnonymousClass0u4(this);
    /* renamed from: O */
    private final AnonymousClass0F8 f9175O = new AnonymousClass0u2(this);
    /* renamed from: P */
    private final AnonymousClass0F8 f9176P = new AnonymousClass0uA(this);
    /* renamed from: Q */
    private final AnonymousClass0F8 f9177Q = new AnonymousClass0uB(this);
    /* renamed from: R */
    private final AnonymousClass0F8 f9178R = new AnonymousClass0u7(this);
    /* renamed from: S */
    private final AnonymousClass0F8 f9179S = new AnonymousClass0u5(this);

    public final void ei() {
    }

    public final void gi() {
    }

    public final void oh() {
    }

    public final void wh(View view) {
    }

    public AnonymousClass0jR(AnonymousClass0IL anonymousClass0IL, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0Cm anonymousClass0Cm) {
        this.f9163C = anonymousClass0IL;
        this.f9164D = anonymousClass0IL.getActivity();
        this.f9165E = anonymousClass0PZ;
        this.f9167G = anonymousClass0Cm;
    }

    /* renamed from: A */
    public final void m7118A() {
        AnonymousClass0F4 anonymousClass0F4 = AnonymousClass0F4.f2058E;
        anonymousClass0F4.m1504A(AnonymousClass0uG.class, this.f9171K);
        anonymousClass0F4.m1504A(AnonymousClass0uH.class, this.f9170J);
        anonymousClass0F4.m1504A(AnonymousClass0uI.class, this.f9175O);
        anonymousClass0F4.m1504A(AnonymousClass0uJ.class, this.f9172L);
        anonymousClass0F4.m1504A(AnonymousClass0uK.class, this.f9174N);
        anonymousClass0F4.m1504A(AnonymousClass0uL.class, this.f9179S);
        anonymousClass0F4.m1504A(AnonymousClass0uM.class, this.f9169I);
        anonymousClass0F4.m1504A(AnonymousClass0uN.class, this.f9178R);
        anonymousClass0F4.m1504A(AnonymousClass0uO.class, this.f9168H);
        anonymousClass0F4.m1504A(AnonymousClass0uP.class, this.f9173M);
        anonymousClass0F4.m1504A(AnonymousClass0uQ.class, this.f9176P);
        anonymousClass0F4.m1504A(AnonymousClass3fn.class, this.f9177Q);
    }

    /* renamed from: B */
    public static Bundle m7115B(AnonymousClass0jR anonymousClass0jR, AnonymousClass0P7 anonymousClass0P7) {
        Hashtag hashtag = anonymousClass0P7.MB;
        if (hashtag != null) {
            return AnonymousClass0uC.m8215I(hashtag, null, -1);
        }
        AnonymousClass0PZ anonymousClass0PZ = anonymousClass0jR.f9165E;
        if (anonymousClass0PZ instanceof AnonymousClass0uD) {
            return AnonymousClass0uC.m8214H(((AnonymousClass0uD) anonymousClass0PZ).CIA(anonymousClass0P7));
        }
        return new Bundle();
    }

    /* renamed from: B */
    public final void m7119B() {
        AnonymousClass0F4 anonymousClass0F4 = AnonymousClass0F4.f2058E;
        anonymousClass0F4.m1507D(AnonymousClass0uG.class, this.f9171K);
        anonymousClass0F4.m1507D(AnonymousClass0uH.class, this.f9170J);
        anonymousClass0F4.m1507D(AnonymousClass0uI.class, this.f9175O);
        anonymousClass0F4.m1507D(AnonymousClass0uJ.class, this.f9172L);
        anonymousClass0F4.m1507D(AnonymousClass0uK.class, this.f9174N);
        anonymousClass0F4.m1507D(AnonymousClass0uL.class, this.f9179S);
        anonymousClass0F4.m1507D(AnonymousClass0uM.class, this.f9169I);
        anonymousClass0F4.m1507D(AnonymousClass0uN.class, this.f9178R);
        anonymousClass0F4.m1507D(AnonymousClass0uO.class, this.f9168H);
        anonymousClass0F4.m1507D(AnonymousClass0uP.class, this.f9173M);
        anonymousClass0F4.m1507D(AnonymousClass0uQ.class, this.f9176P);
        anonymousClass0F4.m1507D(AnonymousClass3fn.class, this.f9177Q);
    }

    /* renamed from: C */
    public static void m7116C(AnonymousClass0jR anonymousClass0jR, AnonymousClass0P7 anonymousClass0P7, String str) {
        if (AnonymousClass0bN.m5547K(anonymousClass0P7, anonymousClass0jR.f9165E)) {
            AnonymousClass0bP E = AnonymousClass0bN.m5541E("number_of_comments", anonymousClass0P7, anonymousClass0jR.f9165E);
            E.kC = anonymousClass0P7.rB.m8228E(anonymousClass0P7.f4028c).f11811B;
            E.AB = str;
            AnonymousClass0bN.m5555S(E, anonymousClass0P7, anonymousClass0jR.f9165E, -1);
        }
    }

    /* renamed from: D */
    public static void m7117D(AnonymousClass0jR anonymousClass0jR, AnonymousClass0P7 anonymousClass0P7) {
        if (anonymousClass0jR.f9163C instanceof AnonymousClass0EE) {
            AnonymousClass0Iz.f2854L.m2398A((AnonymousClass0EE) anonymousClass0jR.f9163C, "viewport_pk", anonymousClass0P7.getId(), anonymousClass0jR.f9163C.getActivity());
        }
    }

    public final void St() {
        m7119B();
        AnonymousClass0uR anonymousClass0uR = this.f9162B;
        if (anonymousClass0uR != null) {
            Dialog dialog = anonymousClass0uR.f11832C;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public final void gx() {
        m7118A();
    }
}
