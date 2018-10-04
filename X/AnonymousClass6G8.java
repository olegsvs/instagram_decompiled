package X;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import com.facebook.C0164R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.6G8 */
public final class AnonymousClass6G8 implements AnonymousClass5P8, AnonymousClass5OQ {
    /* renamed from: B */
    public final AnonymousClass67G f73581B;
    /* renamed from: C */
    public final AnonymousClass67C f73582C;
    /* renamed from: D */
    public final AnonymousClass6Fy f73583D;
    /* renamed from: E */
    public final AnonymousClass6G7 f73584E;
    /* renamed from: F */
    public final AnonymousClass5az f73585F;
    /* renamed from: G */
    public final AnonymousClass5OR f73586G;
    /* renamed from: H */
    public final AnonymousClass6GM f73587H;
    /* renamed from: I */
    public final AnonymousClass67b f73588I;
    /* renamed from: J */
    public final AnonymousClass6G3 f73589J;
    /* renamed from: K */
    public AnonymousClass67L f73590K = AnonymousClass67L.LIVE;
    /* renamed from: L */
    public final AnonymousClass6GA f73591L;
    /* renamed from: M */
    public final AnonymousClass0Cm f73592M;
    /* renamed from: N */
    public final AnonymousClass65Q f73593N;
    /* renamed from: O */
    public final AnonymousClass5ax f73594O;
    /* renamed from: P */
    private final Runnable f73595P = new AnonymousClass67H(this);

    public AnonymousClass6G8(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass5az anonymousClass5az, AnonymousClass6Fy anonymousClass6Fy, AnonymousClass6GM anonymousClass6GM, AnonymousClass6G3 anonymousClass6G3, AnonymousClass67C anonymousClass67C, AnonymousClass6G7 anonymousClass6G7, AnonymousClass6GA anonymousClass6GA, AnonymousClass5OR anonymousClass5OR, AnonymousClass67b anonymousClass67b, AnonymousClass5ax anonymousClass5ax, AnonymousClass65Q anonymousClass65Q, AnonymousClass67G anonymousClass67G) {
        this.f73592M = anonymousClass0Cm;
        this.f73589J = anonymousClass6G3;
        this.f73582C = anonymousClass67C;
        this.f73584E = anonymousClass6G7;
        this.f73587H = anonymousClass6GM;
        this.f73585F = anonymousClass5az;
        this.f73583D = anonymousClass6Fy;
        this.f73591L = anonymousClass6GA;
        this.f73586G = anonymousClass5OR;
        this.f73588I = anonymousClass67b;
        this.f73594O = anonymousClass5ax;
        this.f73593N = anonymousClass65Q;
        this.f73581B = anonymousClass67G;
        anonymousClass6Fy.f73520X = this;
        anonymousClass6Fy.f73503G = this;
        anonymousClass6Fy.f73528f = this;
        anonymousClass6Fy.f73508L = this;
        anonymousClass6Fy.f73530h = this;
        anonymousClass67C.f71937B = this;
        anonymousClass5az.f66789C = this;
        anonymousClass5ax.f66767C = this;
        anonymousClass6GA.f73603H = this;
        anonymousClass6GA.f73598C = this;
        anonymousClass67b.f71994I = this;
        anonymousClass5OR.f62938G = this;
        anonymousClass5az.f66788B.f63115P.setVisibility(8);
        if (anonymousClass67G != null) {
            anonymousClass67G.m29089B();
            anonymousClass67G.m29091D(anonymousClass6Fy.f73506J.F());
        }
    }

    /* renamed from: A */
    public final boolean m29695A() {
        if (!this.f73594O.m27756B()) {
            if (this.f73583D.f73527e.m26366A()) {
                if (!this.f73589J.m29680L()) {
                    this.f73588I.m29108A(this.f73583D);
                }
            } else if (this.f73583D.f73527e.m26366A()) {
                this.f73587H.m29769b(false, null);
                return true;
            } else {
                this.f73583D.m29662C(AnonymousClass5MI.USER_INITIATED, "onBackPressed", false);
                return false;
            }
        }
        return true;
    }

    /* renamed from: B */
    public static void m29693B(AnonymousClass6G8 anonymousClass6G8) {
        if (anonymousClass6G8.f73585F.f66788B.f63106G.getVisibility() == 0) {
            AnonymousClass14H.E(true, new View[]{anonymousClass6G8.f73585F.f66788B.f63106G});
        }
        anonymousClass6G8.f73589J.m29679K(false);
        AnonymousClass5OR anonymousClass5OR = anonymousClass6G8.f73586G;
        anonymousClass5OR.f62942K = true;
        anonymousClass5OR.f62941J.gSA(false);
    }

    /* renamed from: B */
    public final void m29696B(boolean z) {
        Bundle bundle;
        AnonymousClass5aa.m27728B(this.f73583D.f73501E, AnonymousClass5MJ.BROADCAST_DONE_BUTTON_TAP).H("share_status", z).R();
        AnonymousClass6Fy anonymousClass6Fy = this.f73583D;
        if (z) {
            AnonymousClass66E anonymousClass66E = anonymousClass6Fy.f73523a;
            AnonymousClass0Q9 anonymousClass0Q9 = new AnonymousClass0Q9(anonymousClass6Fy.f73500D, anonymousClass6Fy.f73517U, anonymousClass6Fy.f73518V);
            synchronized (anonymousClass66E) {
                AnonymousClass0Sy.F(new AnonymousClass66D(anonymousClass66E, anonymousClass0Q9));
            }
        } else {
            File file = new File(AnonymousClass0Pm.B(anonymousClass6Fy.f73500D));
            if (file.exists()) {
                file.delete();
            }
        }
        if (z) {
            bundle = new Bundle();
            bundle.putString("IgLive.broadcast_id", this.f73583D.f73500D);
        } else {
            bundle = null;
        }
        this.f73587H.m29769b(false, bundle);
    }

    /* renamed from: C */
    public final void m29697C(AnonymousClass5af anonymousClass5af) {
        if (anonymousClass5af.lN() == AnonymousClass5NW.ViewJoinRequest) {
            List list = ((AnonymousClass5cF) anonymousClass5af).f67349B;
            if (list.size() == 1) {
                AnonymousClass0Ci anonymousClass0Ci = (AnonymousClass0Ci) list.get(0);
                AnonymousClass5az anonymousClass5az = this.f73585F;
                AnonymousClass0Ci B = this.f73592M.B();
                AnonymousClass5NI anonymousClass67I = new AnonymousClass67I(this, anonymousClass0Ci);
                if (anonymousClass5az.f66792F == null) {
                    anonymousClass5az.f66792F = new AnonymousClass5NJ(anonymousClass5az.f66788B.f63113N.getContext());
                }
                anonymousClass5az.f66792F.m26356A(anonymousClass5az.f66788B.f63113N, B, anonymousClass0Ci, anonymousClass67I, true);
                return;
            }
            AnonymousClass6G8.m29694C(this);
        }
    }

    /* renamed from: C */
    public static void m29694C(AnonymousClass6G8 anonymousClass6G8) {
        anonymousClass6G8.f73591L.hV();
        Bundle bundle = new Bundle();
        bundle.putString("IgLiveWithInviteFragment.ARGUMENTS_KEY_EXTRA_BROADCAST_ID", anonymousClass6G8.f73583D.f73500D);
        bundle.putString("IgSessionManager.USER_ID", anonymousClass6G8.f73592M.f1759C);
        anonymousClass6G8 = anonymousClass6G8.f73582C.f71938C;
        AnonymousClass0IL mN = anonymousClass6G8.f66786C.mN(bundle);
        if (mN != null) {
            AnonymousClass0bz.B(anonymousClass6G8.f66785B).A(new AnonymousClass5PL(anonymousClass6G8)).C(mN);
        }
    }

    /* renamed from: D */
    public final void m29698D() {
        AnonymousClass6G7 anonymousClass6G7 = this.f73584E;
        anonymousClass6G7.f73579C.f63096C = anonymousClass6G7;
        AnonymousClass5PO anonymousClass5PO = anonymousClass6G7.f73579C;
        List arrayList = new ArrayList();
        arrayList.add(anonymousClass6G7.f73579C.m26435A(anonymousClass6G7.f73580D.m29702A() ? C0164R.string.enable_comments : C0164R.string.disable_comments));
        arrayList.add(anonymousClass6G7.f73579C.m26435A(anonymousClass6G7.f73580D.m29703B() ? C0164R.string.disable_requests_to_join : C0164R.string.enable_requests_to_join));
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]);
        new AnonymousClass0Sb(anonymousClass5PO.f63095B).G(charSequenceArr, new AnonymousClass5PN(anonymousClass5PO, charSequenceArr)).E(true).F(true).C().show();
    }

    /* renamed from: E */
    public final void m29699E(HashMap hashMap) {
        this.f73583D.f73524b = true;
        this.f73583D.f73525c = hashMap;
        AnonymousClass0OR.D(new Handler(Looper.getMainLooper()), this.f73595P, 721826128);
    }

    /* renamed from: F */
    public final void m29700F(String str, String str2, String str3, String str4, String str5, AnonymousClass0EE anonymousClass0EE) {
        this.f73582C.m29086B(str, str2, str3, str4, str5, anonymousClass0EE);
    }

    /* renamed from: G */
    public final void m29701G() {
        boolean z = this.f73583D.f73513Q;
        switch (this.f73590K.ordinal()) {
            case 0:
            case 1:
                Object obj = (!(this.f73590K == AnonymousClass67L.LIVE && z) && (this.f73590K != AnonymousClass67L.TOP_LIVE || z)) ? null : 1;
                if (obj != null) {
                    AnonymousClass5az anonymousClass5az = this.f73585F;
                    if (anonymousClass5az.f66791E == null) {
                        LayoutTransition layoutTransition = new LayoutTransition();
                        anonymousClass5az.f66791E = layoutTransition;
                        layoutTransition.enableTransitionType(4);
                        anonymousClass5az.f66788B.f63109J.setLayoutTransition(anonymousClass5az.f66791E);
                    }
                    if (z) {
                        Context context = anonymousClass5az.f66788B.f63108I.getContext();
                        Drawable anonymousClass5JD = new AnonymousClass5JD(new Drawable[]{AnonymousClass0Ca.E(context, C0164R.drawable.live_label_background), AnonymousClass0Ca.E(context, C0164R.drawable.top_live_badge_bg_purple), AnonymousClass0Ca.E(context, C0164R.drawable.top_live_badge_bg_red), AnonymousClass0Ca.E(context, C0164R.drawable.top_live_badge_bg_yellow), AnonymousClass0Ca.E(context, C0164R.drawable.top_live_badge_bg_red), AnonymousClass0Ca.E(context, C0164R.drawable.top_live_badge_bg_purple), AnonymousClass0Ca.E(context, C0164R.drawable.live_label_background)});
                        anonymousClass5az.f66788B.f63108I.setBackground(anonymousClass5JD);
                        anonymousClass5JD.f62014D = 1700;
                        anonymousClass5JD.f62015E = SystemClock.uptimeMillis();
                        anonymousClass5JD.f62012B = AnonymousClass5JC.RUNNING;
                        anonymousClass5JD.f62013C = 0;
                        anonymousClass5JD.invalidateSelf();
                    }
                    this.f73590K = z ? AnonymousClass67L.TOP_LIVE : AnonymousClass67L.LIVE;
                }
                int i = z ? C0164R.string.top_live_label : C0164R.string.live_label;
                AnonymousClass5az anonymousClass5az2 = this.f73585F;
                anonymousClass5az2.m27762E(anonymousClass5az2.f66788B.f63108I.getContext().getResources().getString(i));
                return;
            case 2:
            case 3:
                this.f73585F.m27762E(AnonymousClass0dw.E(this.f73583D.f73499C));
                return;
            default:
                return;
        }
    }

    public final void Sp(int i, boolean z) {
        AnonymousClass6G3 anonymousClass6G3 = this.f73589J;
        boolean z2 = i > 0;
        anonymousClass6G3.f73545D = z2;
        anonymousClass6G3.m29679K(z2 ^ true);
    }

    public final void an(AnonymousClass3oc anonymousClass3oc, AnonymousClass0Ci anonymousClass0Ci) {
        boolean z = anonymousClass0Ci.gB == AnonymousClass2EC.ELIGIBLE_GUEST;
        this.f73583D.f73501E.m27743G(anonymousClass3oc, anonymousClass0Ci.getId(), z);
    }

    public final void bGA(int i, int i2, AnonymousClass3oc anonymousClass3oc) {
        this.f73583D.f73501E.m27745I(i, 0, i2, anonymousClass3oc);
    }

    public final void fy() {
        this.f73583D.m29665F();
    }
}
