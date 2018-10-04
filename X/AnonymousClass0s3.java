package X;

import android.app.Activity;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;

/* renamed from: X.0s3 */
public final class AnonymousClass0s3 extends AnonymousClass0nJ {
    /* renamed from: B */
    public final Runnable f11324B;
    /* renamed from: C */
    public final AnonymousClass0j3 f11325C;
    /* renamed from: D */
    public final Runnable f11326D;
    /* renamed from: E */
    public AnonymousClass0ly f11327E;
    /* renamed from: F */
    public AnonymousClass0s8 f11328F;
    /* renamed from: G */
    public final AnonymousClass0Cm f11329G;
    /* renamed from: H */
    private final Activity f11330H;
    /* renamed from: I */
    private final AnonymousClass0EE f11331I;
    /* renamed from: J */
    private final AnonymousClass0ry f11332J;
    /* renamed from: K */
    private final int f11333K;
    /* renamed from: L */
    private final AnonymousClass0F8 f11334L = new AnonymousClass3Mr(this);
    /* renamed from: M */
    private final AnonymousClass0IP f11335M;

    public AnonymousClass0s3(Activity activity, AnonymousClass0EE anonymousClass0EE, AnonymousClass0IP anonymousClass0IP, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0j3 anonymousClass0j3, Runnable runnable, Runnable runnable2, AnonymousClass0ry anonymousClass0ry) {
        this.f11330H = activity;
        this.f11331I = anonymousClass0EE;
        this.f11335M = anonymousClass0IP;
        this.f11329G = anonymousClass0Cm;
        this.f11325C = anonymousClass0j3;
        this.f11324B = runnable;
        this.f11326D = runnable2;
        this.f11333K = AnonymousClass0mY.m7540B(this.f11330H.getResources(), AnonymousClass0Nm.m3431J(this.f11330H));
        this.f11332J = anonymousClass0ry;
    }

    /* renamed from: B */
    public final int mo1813B() {
        return this.f11327E.m7413C() + (this.f11327E.m7415E() >= 0 ? 1 : 0);
    }

    /* renamed from: B */
    public static int m8051B(AnonymousClass0s3 anonymousClass0s3, int i) {
        anonymousClass0s3 = anonymousClass0s3.f11327E.m7415E();
        anonymousClass0s3 = (anonymousClass0s3 < null || i < anonymousClass0s3) ? null : true;
        return i - anonymousClass0s3;
    }

    /* renamed from: C */
    public static void m8052C(AnonymousClass0s3 anonymousClass0s3, int i) {
        int E = anonymousClass0s3.f11327E.m7415E();
        if (E < 0) {
            anonymousClass0s3.f11327E.m7419I(i);
        } else if (i < E) {
            anonymousClass0s3.f11327E.m7419I(AnonymousClass0s3.m8051B(anonymousClass0s3, i));
            anonymousClass0s3.f11327E.f9638P = Integer.valueOf(E - 1);
        } else if (i > E) {
            anonymousClass0s3.f11327E.m7419I(AnonymousClass0s3.m8051B(anonymousClass0s3, i));
        } else if (i == E) {
            anonymousClass0s3.f11327E.f9638P = Integer.valueOf(-1);
        }
        AnonymousClass0s8 anonymousClass0s8 = anonymousClass0s3.f11328F;
        if (anonymousClass0s8 != null) {
            anonymousClass0s8.f11341D.m8433A();
        }
        if (anonymousClass0s3.mo1813B() == 0) {
            AnonymousClass0F4.f2058E.m1505B(new AnonymousClass0l0());
        } else {
            anonymousClass0s3.m7639G(i);
        }
    }

    /* renamed from: I */
    public final void mo1814I(AnonymousClass0oo anonymousClass0oo, int i) {
        if (getItemViewType(i) == 1) {
            AnonymousClass3Mx anonymousClass3Mx = (AnonymousClass3Mx) anonymousClass0oo;
            if (VERSION.SDK_INT < 21) {
                anonymousClass3Mx.f40557D.getPaint().setFakeBoldText(true);
            }
            anonymousClass3Mx.f40556C.setOnClickListener(new AnonymousClass3Ms(this, anonymousClass3Mx));
            anonymousClass3Mx.f40555B.setOnClickListener(new AnonymousClass3Mt(this));
            return;
        }
        AnonymousClass1Wz anonymousClass1Wz = (AnonymousClass1Wz) anonymousClass0oo;
        AnonymousClass0mW B = this.f11327E.m7412B(AnonymousClass0s3.m8051B(this, i));
        AnonymousClass0Ci anonymousClass0Ci = B.f9808G;
        anonymousClass1Wz.f19641C.setOnClickListener(new AnonymousClass3Mu(this, anonymousClass1Wz, B));
        anonymousClass1Wz.f19640B.setUrl(anonymousClass0Ci.DQ());
        AnonymousClass15G.m9295C(anonymousClass1Wz.f19647I, anonymousClass0Ci.m1030u());
        anonymousClass1Wz.f19645G.setOnClickListener(new AnonymousClass3Mv(this, anonymousClass1Wz, B));
        if (this.f11327E.nL() == AnonymousClass0mZ.SUGGESTED_CLOSE_FRIENDS) {
            if (anonymousClass1Wz.f19642D != null) {
                anonymousClass1Wz.f19642D.setVisibility(0);
            }
            if (anonymousClass1Wz.f19643E != null) {
                AnonymousClass3lD anonymousClass3lD = anonymousClass1Wz.f19643E;
                AnonymousClass0Ci anonymousClass0Ci2 = B.f9808G;
                anonymousClass3lD.f44140F = AnonymousClass3lC.B(anonymousClass0Ci2);
                anonymousClass3lD.f44141G = anonymousClass0Ci2;
                AnonymousClass3lD.C(anonymousClass3lD);
            }
            anonymousClass1Wz.f19644F.setText(B.f9808G.f1757z);
            anonymousClass1Wz.f19646H.setVisibility(8);
            anonymousClass1Wz.f19647I.setText(anonymousClass0Ci.uT());
        } else {
            boolean booleanValue;
            if (anonymousClass1Wz.f19642D != null) {
                anonymousClass1Wz.f19642D.setVisibility(8);
            }
            if (anonymousClass0Ci.m1023n()) {
                booleanValue = ((Boolean) AnonymousClass0CC.Qh.m846H(this.f11329G)).booleanValue();
                anonymousClass1Wz.f19646H.setShouldShowFollowBack(booleanValue);
            } else {
                booleanValue = false;
            }
            anonymousClass1Wz.f19644F.setText(B.f9807F);
            anonymousClass1Wz.f19646H.setVisibility(0);
            AnonymousClass0db C = AnonymousClass0db.m6067C();
            C.m6076I("can_show_follow_back", booleanValue);
            C.m6076I("following_current_user", anonymousClass0Ci.m1023n());
            anonymousClass1Wz.f19646H.m8655B(this.f11329G, anonymousClass0Ci, new AnonymousClass3Mw(this, anonymousClass1Wz, B), null, C, null);
            if (TextUtils.isEmpty(anonymousClass0Ci.f1757z)) {
                anonymousClass1Wz.f19647I.setText(anonymousClass0Ci.uT());
            } else {
                anonymousClass1Wz.f19647I.setText(anonymousClass0Ci.f1757z);
            }
        }
        if (anonymousClass1Wz.f19648J != null && anonymousClass1Wz.f19649K != null) {
            anonymousClass1Wz.f19649K.setVisibility(4);
            anonymousClass1Wz.f19648J.setVisibility(8);
            if (!B.f9805D) {
                return;
            }
            if (AnonymousClass0HV.m2008D(this.f11329G).f2646B.getBoolean("aysf_has_seen_new_badge_long_impression", false) && AnonymousClass0mY.f9819B) {
                anonymousClass1Wz.f19649K.setVisibility(0);
            } else {
                anonymousClass1Wz.f19648J.setVisibility(0);
            }
        }
    }

    /* renamed from: J */
    public final AnonymousClass0oo mo1815J(ViewGroup viewGroup, int i) {
        if (i == 1) {
            View inflate = LayoutInflater.from(this.f11330H).inflate(C0164R.layout.fb_connect_card, viewGroup, false);
            inflate.getLayoutParams().width = this.f11333K;
            return new AnonymousClass3Mx(inflate);
        }
        View view = null;
        if (i != 0) {
            return null;
        }
        AnonymousClass0ry anonymousClass0ry = this.f11332J;
        if (anonymousClass0ry != null) {
            view = (View) anonymousClass0ry.f11312F.poll();
        }
        if (view == null) {
            view = LayoutInflater.from(this.f11330H).inflate(C0164R.layout.suggested_entity_card, viewGroup, false);
        }
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new AnonymousClass12d(this.f11333K, -1));
        } else {
            view.getLayoutParams().width = this.f11333K;
        }
        return new AnonymousClass1Wz(this.f11330H, this.f11331I, this.f11335M, this.f11329G, view);
    }

    /* renamed from: K */
    public final void mo1816K(AnonymousClass0oo anonymousClass0oo) {
        super.mo1816K(anonymousClass0oo);
        if (!((Boolean) AnonymousClass0CC.ze.m846H(this.f11329G)).booleanValue()) {
            int E = this.f11327E.m7415E();
            int E2 = anonymousClass0oo.m7713E();
            if (E2 != E) {
                this.f11325C.ICA(this.f11327E.f9637O, E2, this.f11327E.m7412B(AnonymousClass0s3.m8051B(this, E2)));
            }
        }
        AnonymousClass0F4.f2058E.m1504A(AnonymousClass1Vb.class, this.f11334L);
    }

    /* renamed from: L */
    public final void mo1901L(AnonymousClass0oo anonymousClass0oo) {
        super.mo1901L(anonymousClass0oo);
        AnonymousClass0F4.f2058E.m1507D(AnonymousClass1Vb.class, this.f11334L);
    }

    public final int getItemViewType(int i) {
        int E = this.f11327E.m7415E();
        return (E < 0 || i != E) ? 0 : 1;
    }
}
