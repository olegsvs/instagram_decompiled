package X;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.4vg */
public final class AnonymousClass4vg implements AnonymousClass0G2 {
    /* renamed from: B */
    public final HashMap f58528B = new HashMap();
    /* renamed from: C */
    public final AnonymousClass0Cm f58529C;

    private AnonymousClass4vg(AnonymousClass0Cm anonymousClass0Cm) {
        this.f58529C = anonymousClass0Cm;
    }

    /* renamed from: A */
    public final void m25395A(Context context, AnonymousClass0Fz anonymousClass0Fz, String str, AnonymousClass2CW anonymousClass2CW, AnonymousClass5YM anonymousClass5YM) {
        AnonymousClass0GA B = AnonymousClass11q.B(context, this.f58529C, str, null);
        B.f2849B = new AnonymousClass4ve(this, this.f58529C, anonymousClass5YM, anonymousClass2CW);
        AnonymousClass0Px.B(context, anonymousClass0Fz, B);
    }

    /* renamed from: B */
    public static AnonymousClass0Iu m25392B(AnonymousClass4vg anonymousClass4vg, boolean z, AnonymousClass5YM anonymousClass5YM) {
        AnonymousClass0Cn anonymousClass0Cn = anonymousClass4vg.f58529C;
        String string = AnonymousClass0HV.D(anonymousClass0Cn).f2646B.getString("igtv_banner_token", null);
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        anonymousClass0Pt.f4229M = "igtv/tv_guide/";
        AnonymousClass0Pt M = anonymousClass0Pt.M(AnonymousClass11p.class);
        if (z && !AnonymousClass0FZ.B().f2177B.getBoolean("force_igtv_banner", false)) {
            M.D("prefetch", "1");
        }
        if (string != null) {
            M.D("banner_token", string);
        }
        AnonymousClass0Iu H = M.H();
        H.f2849B = new AnonymousClass4vd(anonymousClass4vg, anonymousClass4vg.f58529C, anonymousClass5YM);
        return H;
    }

    /* renamed from: B */
    public final void m25396B(Context context, AnonymousClass0Fz anonymousClass0Fz, String str, String str2, AnonymousClass2CW anonymousClass2CW, AnonymousClass5YM anonymousClass5YM) {
        AnonymousClass4vg anonymousClass4vg = this;
        AnonymousClass2CW anonymousClass2CW2 = anonymousClass2CW;
        Set C = AnonymousClass4vg.m25393C(this, anonymousClass2CW);
        String str3 = str;
        if (!C.contains(str)) {
            AnonymousClass4vg.m25393C(anonymousClass4vg, anonymousClass2CW).add(str);
            AnonymousClass0GA B = AnonymousClass11q.B(context, anonymousClass4vg.f58529C, str, str2);
            B.f2849B = new AnonymousClass4vf(anonymousClass4vg, anonymousClass4vg.f58529C, anonymousClass5YM, anonymousClass2CW2, str3);
            AnonymousClass0Px.B(context, anonymousClass0Fz, B);
        }
    }

    /* renamed from: C */
    public static Set m25393C(AnonymousClass4vg anonymousClass4vg, AnonymousClass2CW anonymousClass2CW) {
        Set set = (Set) anonymousClass4vg.f58528B.get(anonymousClass2CW);
        if (set != null) {
            return set;
        }
        set = new HashSet();
        anonymousClass4vg.f58528B.put(anonymousClass2CW, set);
        return set;
    }

    /* renamed from: D */
    public static synchronized AnonymousClass4vg m25394D(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass4vg anonymousClass4vg;
        Class cls = AnonymousClass4vg.class;
        synchronized (cls) {
            anonymousClass4vg = (AnonymousClass4vg) anonymousClass0Cm.A(cls);
            if (anonymousClass4vg == null) {
                anonymousClass4vg = new AnonymousClass4vg(anonymousClass0Cm);
                anonymousClass0Cm.D(cls, anonymousClass4vg);
            }
        }
        return anonymousClass4vg;
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.f58528B.clear();
    }
}
