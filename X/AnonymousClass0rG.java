package X;

import android.content.Context;
import android.util.LruCache;

/* renamed from: X.0rG */
public final class AnonymousClass0rG implements AnonymousClass0G2 {
    /* renamed from: B */
    public final AnonymousClass0kW f11157B;
    /* renamed from: C */
    public final AnonymousClass0qJ f11158C;
    /* renamed from: D */
    public final AnonymousClass0qJ f11159D;
    /* renamed from: E */
    public final LruCache f11160E = new LruCache(300);
    /* renamed from: F */
    public final LruCache f11161F = new LruCache(600);
    /* renamed from: G */
    public final LruCache f11162G = new LruCache(300);
    /* renamed from: H */
    private AnonymousClass0F8 f11163H;
    /* renamed from: I */
    private AnonymousClass0F8 f11164I;

    private AnonymousClass0rG(Context context, AnonymousClass0kW anonymousClass0kW) {
        this.f11157B = anonymousClass0kW;
        this.f11159D = AnonymousClass0qH.m7922C(context, false, false);
        this.f11158C = AnonymousClass0qH.m7922C(context, true, false);
        this.f11164I = new AnonymousClass3OW(this);
        this.f11163H = new AnonymousClass1Wm(this);
        AnonymousClass0F4.f2058E.m1504A(AnonymousClass0qC.class, this.f11164I);
        AnonymousClass0F4.f2058E.m1504A(AnonymousClass0qE.class, this.f11163H);
    }

    /* renamed from: A */
    public final void m7950A(AnonymousClass0P7 anonymousClass0P7) {
        this.f11160E.remove(anonymousClass0P7);
        this.f11162G.remove(anonymousClass0P7);
        AnonymousClass0uF o = anonymousClass0P7.m3785o();
        if (o != null) {
            for (AnonymousClass0SK anonymousClass0SK : o.f11811B) {
                for (int i = 0; i < 8; i++) {
                    this.f11161F.remove(AnonymousClass0rG.m7949C(anonymousClass0SK, i, true));
                    this.f11161F.remove(AnonymousClass0rG.m7949C(anonymousClass0SK, i, false));
                }
            }
        }
    }

    /* renamed from: B */
    public static synchronized AnonymousClass0rG m7948B(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0rG anonymousClass0rG;
        Class cls = AnonymousClass0rG.class;
        synchronized (cls) {
            anonymousClass0rG = (AnonymousClass0rG) anonymousClass0Cm.m1036A(cls);
            if (anonymousClass0rG == null) {
                anonymousClass0rG = new AnonymousClass0rG(context, AnonymousClass0kW.m7183E(anonymousClass0Cm));
                anonymousClass0Cm.m1039D(cls, anonymousClass0rG);
            }
        }
        return anonymousClass0rG;
    }

    /* renamed from: C */
    public static String m7949C(AnonymousClass0SK anonymousClass0SK, int i, boolean z) {
        return AnonymousClass0IE.m2137E("%s%d%b", anonymousClass0SK.XP(), Integer.valueOf(i), Boolean.valueOf(z));
    }

    public final void onUserSessionWillEnd(boolean z) {
        AnonymousClass0F4.f2058E.m1507D(AnonymousClass0qC.class, this.f11164I);
        AnonymousClass0F4.f2058E.m1507D(AnonymousClass0qE.class, this.f11163H);
    }
}
