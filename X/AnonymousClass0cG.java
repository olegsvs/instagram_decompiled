package X;

import android.content.Context;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.facebook.C0164R;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0cG */
public final class AnonymousClass0cG {
    /* renamed from: B */
    public final AnonymousClass0F8 f7074B = new AnonymousClass0g5(this);
    /* renamed from: C */
    public final AnonymousClass0F8 f7075C = new AnonymousClass0g8(this);
    /* renamed from: D */
    public final Context f7076D;
    /* renamed from: E */
    public final AnonymousClass0Hq f7077E;
    /* renamed from: F */
    public AnonymousClass3Tr f7078F;
    /* renamed from: G */
    public final Handler f7079G = new Handler();
    /* renamed from: H */
    public boolean f7080H = false;
    /* renamed from: I */
    public final AnonymousClass0F8 f7081I = new AnonymousClass0g6(this);
    /* renamed from: J */
    public AnonymousClass3Tr f7082J;
    /* renamed from: K */
    public final AnonymousClass0F8 f7083K = new AnonymousClass0g4(this);
    /* renamed from: L */
    public boolean f7084L;
    /* renamed from: M */
    public final List f7085M = new ArrayList();
    /* renamed from: N */
    public int f7086N = 0;
    /* renamed from: O */
    public AnonymousClass3Tr f7087O;
    /* renamed from: P */
    public final AnonymousClass0Cm f7088P;

    public AnonymousClass0cG(Context context, AnonymousClass0Hq anonymousClass0Hq, AnonymousClass0Cm anonymousClass0Cm) {
        this.f7076D = context;
        this.f7077E = anonymousClass0Hq;
        this.f7088P = anonymousClass0Cm;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: A */
    public final boolean m5750A(X.AnonymousClass0cA r4) {
        /*
        r3 = this;
        r1 = X.AnonymousClass3Tu.f41560B;
        r0 = r4.ordinal();
        r2 = r1[r0];
        r1 = 1;
        r0 = 0;
        switch(r2) {
            case 1: goto L_0x001b;
            case 2: goto L_0x000e;
            default: goto L_0x000d;
        };
    L_0x000d:
        return r0;
    L_0x000e:
        r0 = r3.f7087O;
        if (r0 == 0) goto L_0x0019;
    L_0x0012:
        r0 = r0.B();
        if (r0 == 0) goto L_0x0019;
    L_0x0018:
        goto L_0x001a;
    L_0x0019:
        r1 = 0;
    L_0x001a:
        return r1;
    L_0x001b:
        r0 = r3.f7082J;
        if (r0 == 0) goto L_0x0019;
    L_0x001f:
        r0 = r0.B();
        if (r0 == 0) goto L_0x0019;
    L_0x0025:
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0cG.A(X.0cA):boolean");
    }

    /* renamed from: B */
    public static /* synthetic */ List m5745B(AnonymousClass0cG anonymousClass0cG, int i, int i2, int i3, int i4) {
        anonymousClass0cG = new ArrayList();
        if (i > 0) {
            anonymousClass0cG.add(new AnonymousClass3kA(i, C0164R.drawable.notification_comment_icon));
        }
        if (i2 > 0) {
            anonymousClass0cG.add(new AnonymousClass3kA(i2, C0164R.drawable.notification_like_icon));
        }
        if (i3 > 0) {
            anonymousClass0cG.add(new AnonymousClass3kA(i3, C0164R.drawable.notification_tag_icon));
        }
        if (i4 > 0) {
            anonymousClass0cG.add(new AnonymousClass3kA(i4, C0164R.drawable.notification_people_icon));
        }
        return anonymousClass0cG;
    }

    /* renamed from: B */
    public final void m5751B() {
        this.f7080H = false;
        if (!this.f7085M.isEmpty()) {
            AnonymousClass1Pa anonymousClass1Pa = (AnonymousClass1Pa) this.f7085M.get(0);
            this.f7085M.remove(0);
            AnonymousClass0OR.m3626F(this.f7079G, new AnonymousClass0cb(this, anonymousClass1Pa), 500, 262733122);
        }
    }

    /* renamed from: C */
    public static void m5746C(AnonymousClass0cG anonymousClass0cG, AnonymousClass3Tr anonymousClass3Tr, List list, int i) {
        if (anonymousClass0cG.f7077E.nS() != 0) {
            return;
        }
        if (!list.isEmpty()) {
            if (anonymousClass0cG.f7080H) {
                anonymousClass0cG.f7085M.add(new AnonymousClass1Pa(anonymousClass3Tr, list, i));
                return;
            }
            AnonymousClass0bz wI = anonymousClass0cG.f7077E.wI();
            if (wI == null || !wI.f6946J) {
                AnonymousClass0cG.m5749F(anonymousClass0cG, anonymousClass3Tr, list, i);
            } else {
                wI.m5666A(new AnonymousClass1Tg(anonymousClass0cG, anonymousClass3Tr, list, i));
            }
        }
    }

    /* renamed from: D */
    public static void m5747D(AnonymousClass0cG anonymousClass0cG, int i) {
        if (anonymousClass0cG.f7088P != null && !anonymousClass0cG.f7084L) {
            AnonymousClass0IU D = ((FragmentActivity) anonymousClass0cG.f7077E.cK()).mo382D();
            AnonymousClass3Tr anonymousClass3Tr = anonymousClass0cG.f7082J;
            if (!anonymousClass0cG.f7077E.EX(anonymousClass3Tr.f41552D)) {
                anonymousClass3Tr.C(i);
                anonymousClass0cG.f7077E.XHA(anonymousClass3Tr.f41552D);
            } else if (D.mo1456H() == 0) {
                anonymousClass3Tr.C(i);
            }
            AnonymousClass0JW.m2604B(anonymousClass0cG.f7088P).f8053C = true;
        }
    }

    /* renamed from: E */
    public static void m5748E(AnonymousClass0cG anonymousClass0cG) {
        AnonymousClass3Tr anonymousClass3Tr = anonymousClass0cG.f7087O;
        if (anonymousClass3Tr != null) {
            anonymousClass3Tr.f41551C.setVisibility(anonymousClass0cG.f7086N > 0 ? 0 : 8);
        }
    }

    /* renamed from: F */
    public static void m5749F(AnonymousClass0cG anonymousClass0cG, AnonymousClass3Tr anonymousClass3Tr, List list, int i) {
        anonymousClass0cG.f7079G.removeCallbacksAndMessages(null);
        View view = anonymousClass3Tr.f41550B;
        if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
            AnonymousClass0OR.m3626F(anonymousClass0cG.f7079G, new AnonymousClass3Tv(anonymousClass0cG, anonymousClass3Tr, list, i), 100, 989378058);
            return;
        }
        anonymousClass0cG.f7080H = true;
        anonymousClass0cG.f7082J.D(new AnonymousClass3Th(list), JsonMappingException.MAX_REFS_TO_LIST, i, new AnonymousClass1Tk(anonymousClass0cG));
    }
}
