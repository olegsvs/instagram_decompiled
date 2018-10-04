package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import java.util.List;

/* renamed from: X.0Ux */
public final class AnonymousClass0Ux implements AnonymousClass3Il, AnonymousClass0MP, AnonymousClass0Uy {
    /* renamed from: B */
    public AnonymousClass3AM f5592B;
    /* renamed from: C */
    public final ImageView f5593C;
    /* renamed from: D */
    public final AnonymousClass0Uv f5594D;
    /* renamed from: E */
    public AnonymousClass3AM f5595E;
    /* renamed from: F */
    public final View f5596F;
    /* renamed from: G */
    public final TextView f5597G = ((TextView) this.f5596F.findViewById(C0164R.id.unseen_threads_count));
    /* renamed from: H */
    public final CircularImageView f5598H = ((CircularImageView) this.f5596F.findViewById(C0164R.id.user_avatar));
    /* renamed from: I */
    private AnonymousClass3DU f5599I;
    /* renamed from: J */
    private final AnonymousClass0Cm f5600J;

    public AnonymousClass0Ux(AnonymousClass0Uv anonymousClass0Uv, AnonymousClass0Cm anonymousClass0Cm, ViewStub viewStub, AnonymousClass0Uw anonymousClass0Uw) {
        this.f5594D = anonymousClass0Uv;
        this.f5600J = anonymousClass0Cm;
        viewStub.setLayoutResource(C0164R.layout.layout_direct_inbox_facepile);
        View inflate = viewStub.inflate();
        this.f5596F = inflate;
        this.f5593C = (ImageView) inflate.findViewById(C0164R.id.empty_state);
        this.f5593C.setImageResource(C0164R.drawable.instagram_overlay_forward_arrow_44);
        this.f5597G.setBackgroundResource(C0164R.drawable.direct_facepile_unseen_thread_count_badge_background);
        AnonymousClass15z anonymousClass15z = new AnonymousClass15z(this.f5596F);
        anonymousClass15z.f14394N = false;
        anonymousClass15z.f14385E = new AnonymousClass4Za(this, anonymousClass0Uw);
        anonymousClass15z.m9344A();
        anonymousClass0Uw.m4797A(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public static void m4801B(X.AnonymousClass0Ux r3) {
        /*
        r1 = r3.f5599I;
        r0 = X.AnonymousClass3DU.f39300Y;
        if (r1 == r0) goto L_0x0018;
    L_0x0006:
        r0 = r3.f5592B;
        if (r0 == 0) goto L_0x0018;
    L_0x000a:
        r0 = r3.f5595E;
        if (r0 != 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0018;
    L_0x000f:
        r0 = r3.f5592B;
        r0 = r0.ordinal();
        switch(r0) {
            case 1: goto L_0x0030;
            case 2: goto L_0x0024;
            default: goto L_0x0018;
        };
    L_0x0018:
        r0 = 1;
        r2 = new android.view.View[r0];
        r1 = r3.f5596F;
        r0 = 0;
        r2[r0] = r1;
        X.AnonymousClass14H.m9160E(r0, r2);
        goto L_0x0037;
    L_0x0024:
        r0 = 1;
        r2 = new android.view.View[r0];
        r1 = r3.f5596F;
        r0 = 0;
        r2[r0] = r1;
        X.AnonymousClass14H.m9163H(r0, r2);
        goto L_0x0037;
    L_0x0030:
        r1 = r3.f5595E;
        r0 = X.AnonymousClass3AM.f38546U;
        if (r1 == r0) goto L_0x0037;
    L_0x0036:
        goto L_0x0024;
    L_0x0037:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0Ux.B(X.0Ux):void");
    }

    /* renamed from: C */
    private String m4802C(List list) {
        if (list != null) {
            AnonymousClass0Tw C = AnonymousClass0Tw.m4598C(this.f5600J);
            for (AnonymousClass18R anonymousClass18R : list) {
                AnonymousClass0Vw c = C.m4631c(anonymousClass18R.f14972I);
                if (c != null && !c.m4938J().isEmpty()) {
                    List J = c.m4938J();
                    AnonymousClass0Ci anonymousClass0Ci = (AnonymousClass0Ci) J.get(0);
                    if (J.size() != 1) {
                        AnonymousClass0W7 H = c.m4936H();
                        if (!(H == null || H.m5011M() == null || H.m5017S(this.f5600J.m1037B()))) {
                            return H.m5011M().DQ();
                        }
                    }
                    return anonymousClass0Ci.DQ();
                }
            }
        }
        return null;
    }

    public final void Je(AnonymousClass0VO anonymousClass0VO) {
        if (anonymousClass0VO.f5725C == 0) {
            AnonymousClass14H.m9158C(this.f5593C).m9173J();
            AnonymousClass14H.m9158C(this.f5598H).m9173J();
            AnonymousClass14H K = AnonymousClass14H.m9158C(this.f5597G).m9173J().m9174K(true);
            K.f13862b = 8;
            K = K.m9165B(0.0f).m9168E(0.0f, -1.0f).m9169F(0.0f, -1.0f);
            K.f13848N = new AnonymousClass4Zc(this);
            K.m9177N();
            return;
        }
        CharSequence charSequence;
        TextView textView = this.f5597G;
        if (anonymousClass0VO.f5725C > 99) {
            charSequence = "99+";
        } else {
            charSequence = String.valueOf(anonymousClass0VO.f5725C);
        }
        textView.setText(charSequence);
        String C = m4802C(anonymousClass0VO.f5726D);
        if (C == null) {
            this.f5598H.m1960A();
        } else {
            this.f5598H.setUrl(C);
        }
        AnonymousClass14H.m9158C(this.f5597G).m9173J();
        AnonymousClass14H.m9158C(this.f5598H).m9173J();
        K = AnonymousClass14H.m9158C(this.f5593C).m9173J().m9174K(true);
        K.f13862b = 8;
        K = K.m9168E(0.0f, -1.0f).m9169F(0.0f, -1.0f);
        K.f13848N = new AnonymousClass4Ze(this);
        K.m9177N();
    }

    public final void Jf(AnonymousClass3DU anonymousClass3DU) {
        this.f5599I = anonymousClass3DU;
        AnonymousClass0Ux.m4801B(this);
    }

    public final void St() {
        AnonymousClass0J7.f2895B.mo543Y(this.f5600J, this);
    }

    public final /* bridge */ /* synthetic */ void WBA(Object obj, Object obj2, Object obj3) {
        AnonymousClass3AM anonymousClass3AM = (AnonymousClass3AM) obj;
        AnonymousClass3AM anonymousClass3AM2 = (AnonymousClass3AM) obj2;
        this.f5592B = anonymousClass3AM2;
        this.f5595E = anonymousClass3AM;
        AnonymousClass0Ux.m4801B(this);
        if (AnonymousClass1SU.f18786B[anonymousClass3AM2.ordinal()] == 1) {
            if (obj3 instanceof AnonymousClass3Dq) {
                this.f5594D.Fc();
            }
        }
    }

    public final void gx() {
        AnonymousClass0J7.f2895B.mo519A(this.f5600J, this);
        AnonymousClass0Tw.m4598C(this.f5600J).m4643o("DirectInboxIndicatorControllerImpl.onResume", 0);
    }
}
