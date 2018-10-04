package X;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.facebook.C0164R;
import com.instagram.modal.ModalActivity;
import com.instagram.model.hashtag.Hashtag;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.4BG */
public final class AnonymousClass4BG implements AnonymousClass1LU {
    /* renamed from: B */
    public final AnonymousClass0Ie f51200B;
    /* renamed from: C */
    public final FragmentActivity f51201C;
    /* renamed from: D */
    public RectF f51202D;
    /* renamed from: E */
    public final AnonymousClass0Cm f51203E;
    /* renamed from: F */
    private final Context f51204F;
    /* renamed from: G */
    private final AnonymousClass0IU f51205G;
    /* renamed from: H */
    private final AnonymousClass1LU f51206H;

    public final boolean Ay(AnonymousClass1Oq anonymousClass1Oq, int i) {
        return false;
    }

    public final void Cy(AnonymousClass1Oq anonymousClass1Oq, int i) {
    }

    public final void Df(AnonymousClass1Oq anonymousClass1Oq, int i) {
    }

    public final void Oq(AnonymousClass1Oq anonymousClass1Oq, int i, String str) {
    }

    public final void Or(int i, AnonymousClass1Oq anonymousClass1Oq, int i2) {
    }

    public final void SGA(AnonymousClass1Oq anonymousClass1Oq, int i) {
    }

    public final void Sg(AnonymousClass0MI anonymousClass0MI, AnonymousClass10I anonymousClass10I) {
    }

    public final void TFA(String str, AnonymousClass1Oq anonymousClass1Oq, int i) {
    }

    public final void Yp(AnonymousClass1Oq anonymousClass1Oq, int i) {
    }

    public final void Zn(AnonymousClass1Oq anonymousClass1Oq, int i) {
    }

    public final void Zp(AnonymousClass1Oq anonymousClass1Oq, int i) {
    }

    public final void ag(Hashtag hashtag) {
    }

    public final void ap(AnonymousClass1Oq anonymousClass1Oq, int i, String str) {
    }

    public final void en(String str, AnonymousClass1Oq anonymousClass1Oq, int i) {
    }

    public final void ep(AnonymousClass1Oq anonymousClass1Oq, int i, String str) {
    }

    public final void fm(AnonymousClass0Ci anonymousClass0Ci) {
    }

    public final void gm(AnonymousClass0Ci anonymousClass0Ci) {
    }

    public final void im(AnonymousClass1Oq anonymousClass1Oq, int i) {
    }

    public final void km(AnonymousClass1Oq anonymousClass1Oq, Hashtag hashtag, int i) {
    }

    public final void mi(AnonymousClass1Oq anonymousClass1Oq, int i, boolean z) {
    }

    public final void sr(String str, AnonymousClass1Oq anonymousClass1Oq, int i) {
    }

    public final void su(AnonymousClass1Oq anonymousClass1Oq, int i) {
    }

    public final void sw(AnonymousClass1Oq anonymousClass1Oq, int i) {
    }

    public final void uu(AnonymousClass1Oq anonymousClass1Oq, int i, RectF rectF) {
    }

    public final void vv(AnonymousClass1Oq anonymousClass1Oq, int i, RectF rectF) {
    }

    public final void xf(Hashtag hashtag) {
    }

    public final void xg(AnonymousClass1Oq anonymousClass1Oq, int i, RectF rectF) {
    }

    public final void yg(AnonymousClass1Oq anonymousClass1Oq, int i) {
    }

    public final void zf(AnonymousClass0Ci anonymousClass0Ci) {
    }

    public final void zx(AnonymousClass1Oq anonymousClass1Oq, int i) {
    }

    public AnonymousClass4BG(FragmentActivity fragmentActivity, AnonymousClass0Ie anonymousClass0Ie, AnonymousClass0Cm anonymousClass0Cm, Context context, AnonymousClass0EE anonymousClass0EE, AnonymousClass0PZ anonymousClass0PZ) {
        this.f51201C = fragmentActivity;
        AnonymousClass0IL anonymousClass0IL = anonymousClass0Ie;
        this.f51200B = anonymousClass0Ie;
        this.f51205G = anonymousClass0Ie.getFragmentManager();
        this.f51204F = context;
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        this.f51203E = anonymousClass0Cm;
        this.f51206H = new AnonymousClass4BD(this, anonymousClass0IL, fragmentActivity, anonymousClass0Cm2, this.f51205G, anonymousClass0EE, anonymousClass0PZ);
    }

    /* renamed from: B */
    public static void m23486B(AnonymousClass4BG anonymousClass4BG, AnonymousClass0MI anonymousClass0MI, String str, int i) {
        if (i >= anonymousClass4BG.f51200B.getListView().getFirstVisiblePosition()) {
            if (i <= anonymousClass4BG.f51200B.getListView().getLastVisiblePosition()) {
                Set hashSet = new HashSet();
                hashSet.add(str);
                anonymousClass4BG.f51202D = AnonymousClass0Nm.L(anonymousClass4BG.f51200B.getListView().getChildAt(i - anonymousClass4BG.f51200B.getListView().getFirstVisiblePosition()).findViewById(C0164R.id.row_newsfeed_media_image));
                AnonymousClass0Jd.f2931B.O(anonymousClass4BG.f51201C, anonymousClass4BG.f51203E).F(anonymousClass0MI, null, -1, null, anonymousClass4BG.f51202D, new AnonymousClass4BF(anonymousClass4BG, anonymousClass0MI, hashSet), true, AnonymousClass0Qf.BRANDED_CONTENT, hashSet);
            }
        }
    }

    /* renamed from: C */
    private void m23487C(AnonymousClass1Oq anonymousClass1Oq) {
        anonymousClass1Oq.c();
        AnonymousClass0Cn anonymousClass0Cn = this.f51203E;
        AnonymousClass1dA anonymousClass1dA = AnonymousClass1dA.CLICK;
        String str = anonymousClass1Oq.f18020D;
        String W = anonymousClass1Oq.W();
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "business/branded_content/news/log/";
        AnonymousClass0Ix.D(anonymousClass0Pt.M(AnonymousClass0Pv.class).D("action", anonymousClass1dA.f20714B).D("pk", str).D("tuuid", W).H());
    }

    public final void CFA(String str, AnonymousClass1Oq anonymousClass1Oq, int i) {
        this.f51206H.CFA(str, anonymousClass1Oq, i);
    }

    public final void Cr(String str, AnonymousClass1Oq anonymousClass1Oq, int i, RectF rectF) {
        AnonymousClass1Ot anonymousClass1Ot = anonymousClass1Oq.f18018B;
        if (anonymousClass1Ot != null ? anonymousClass1Ot.f18056P : false) {
            String C = AnonymousClass0q1.C(str);
            String N = anonymousClass1Oq.N();
            AnonymousClass0MI D = AnonymousClass0Jd.f2931B.M(this.f51203E).D(C);
            Object obj = null;
            if (D != null) {
                List F = D.F();
                for (int i2 = 0; i2 < F.size(); i2++) {
                    if (N.equals(((AnonymousClass0Pj) F.get(i2)).getId())) {
                        break;
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                AnonymousClass0Ie anonymousClass0Ie = this.f51200B;
                AnonymousClass0GA G = AnonymousClass0Jd.f2931B.G(C, this.f51203E);
                G.f2849B = new AnonymousClass4BE(this, C, N, i);
                anonymousClass0Ie.schedule(G);
            } else {
                AnonymousClass4BG.m23486B(this, D, N, i);
            }
        } else {
            AnonymousClass0bm.C(this.f51203E).f6851R.add(str);
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f51201C);
            anonymousClass0IZ.f2754D = AnonymousClass0IY.B().Y(str).OOA(true).DD();
            anonymousClass0IZ.B();
        }
        m23487C(anonymousClass1Oq);
    }

    public final void nh(AnonymousClass1Oq anonymousClass1Oq, int i) {
        Bundle bundle = new Bundle();
        AnonymousClass0FL.G(this.f51203E, bundle);
        bundle.putString("com.instagram.brandedcontent.violation.ARGUMENT_EXTRA_VIOLATION_MEDIA_ID", anonymousClass1Oq.N());
        new AnonymousClass0Sn(ModalActivity.class, "branded_content_violation_alert", bundle, this.f51201C, this.f51203E.f1759C).B(this.f51204F);
        m23487C(anonymousClass1Oq);
    }
}
