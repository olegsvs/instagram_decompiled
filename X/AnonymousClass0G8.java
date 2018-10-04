package X;

import android.content.Context;
import java.util.concurrent.FutureTask;

/* renamed from: X.0G8 */
public final class AnonymousClass0G8 implements AnonymousClass0G2 {
    /* renamed from: B */
    public AnonymousClass0G9 f2304B;
    /* renamed from: C */
    public FutureTask f2305C;
    /* renamed from: D */
    public AnonymousClass0G9 f2306D;
    /* renamed from: E */
    public FutureTask f2307E;

    /* renamed from: A */
    public final void m1751A(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0G8 anonymousClass0G8 = this;
        if (this.f2304B != null) {
            AnonymousClass0Gn.m1876C("StartupPrefetcher", "prefetchMainFeed called twice");
            return;
        }
        FutureTask futureTask = this.f2305C;
        if (futureTask != null) {
            try {
                this.f2304B = (AnonymousClass0G9) futureTask.get();
                this.f2305C = null;
            } catch (Throwable e) {
                AnonymousClass0Gn.m1880G("StartupPrefetcher", e);
            }
        }
        if (this.f2304B == null) {
            AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
            AnonymousClass0GC B = AnonymousClass0GB.m1754B(anonymousClass0Cm);
            B.JW();
            anonymousClass0G8.f2304B = AnonymousClass0G8.m1748B(anonymousClass0G8, context, anonymousClass0Cm2, B.QR(), B.jT(), B.PR(), B.aW(), AnonymousClass0GD.m1757C(context, anonymousClass0Cm).m1759A());
        }
        AnonymousClass0Ix.m2384D(anonymousClass0G8.f2304B);
    }

    /* renamed from: B */
    public static AnonymousClass0G9 m1748B(AnonymousClass0G8 anonymousClass0G8, Context context, AnonymousClass0Cm anonymousClass0Cm, String str, String str2, String str3, boolean z, AnonymousClass0GE anonymousClass0GE) {
        AnonymousClass0CN.m901B("createFeedRequest", -660211525);
        try {
            Context context2 = context;
            AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
            AnonymousClass0GE anonymousClass0GE2 = anonymousClass0GE;
            AnonymousClass0G8 anonymousClass0G82 = anonymousClass0G8;
            AnonymousClass0G9 anonymousClass0G9 = new AnonymousClass0G9(AnonymousClass0Nt.m3473B(context2, new AnonymousClass0Nr(context2), AnonymousClass0HV.m2008D(anonymousClass0Cm2).f2646B.getString("main_feed_latest_story_id", null), str, str2, str3, AnonymousClass0GD.m1758D(anonymousClass0GE2), z, new AnonymousClass0Ns(), anonymousClass0Cm2, ((Integer) AnonymousClass0CC.ve.m846H(anonymousClass0Cm2)).intValue()), AnonymousClass0Fx.m1698B(), new AnonymousClass0Nu(anonymousClass0G82));
            anonymousClass0G9.m1753A(new AnonymousClass0Nv(anonymousClass0G82, context2, anonymousClass0Cm2, anonymousClass0GE2));
            return anonymousClass0G9;
        } finally {
            AnonymousClass0CN.m902C(1721217438);
        }
    }

    /* renamed from: B */
    public final void m1752B(AnonymousClass0Cm anonymousClass0Cm) {
        if (this.f2306D != null) {
            AnonymousClass0Gn.m1876C("StartupPrefetcher", "prefetchMainReel called twice");
            return;
        }
        FutureTask futureTask = this.f2307E;
        if (futureTask != null) {
            try {
                this.f2306D = (AnonymousClass0G9) futureTask.get();
                this.f2307E = null;
            } catch (Throwable e) {
                AnonymousClass0Gn.m1880G("StartupPrefetcher", e);
            }
        }
        if (this.f2306D == null) {
            this.f2306D = AnonymousClass0G8.m1749C(this, anonymousClass0Cm);
        }
        AnonymousClass0Ix.m2384D(this.f2306D);
    }

    /* renamed from: C */
    public static AnonymousClass0G9 m1749C(AnonymousClass0G8 anonymousClass0G8, AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0CN.m901B("createReelTrayRequest", 731299955);
        try {
            AnonymousClass0Ea.f1980C.m1457e(15335437);
            AnonymousClass0G9 anonymousClass0G9 = new AnonymousClass0G9(AnonymousClass0Jd.f2931B.mo631E(anonymousClass0Cm, AnonymousClass0Ny.SkipCache, AnonymousClass0Jd.f2931B.mo638L(anonymousClass0Cm).m3482B(), AnonymousClass0Jd.f2931B.mo638L(anonymousClass0Cm).m3483C()), AnonymousClass0Fx.m1698B(), new AnonymousClass0O0(anonymousClass0G8));
            anonymousClass0G9.m1753A(new AnonymousClass0O1(anonymousClass0G8));
            return anonymousClass0G9;
        } finally {
            AnonymousClass0CN.m902C(2086630078);
        }
    }

    /* renamed from: D */
    public static synchronized AnonymousClass0G8 m1750D(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0G8 anonymousClass0G8;
        Class cls = AnonymousClass0G8.class;
        synchronized (cls) {
            anonymousClass0G8 = (AnonymousClass0G8) anonymousClass0Cm.m1036A(cls);
            if (anonymousClass0G8 == null) {
                anonymousClass0G8 = new AnonymousClass0G8();
                anonymousClass0Cm.m1039D(cls, anonymousClass0G8);
            }
        }
        return anonymousClass0G8;
    }

    public final void onUserSessionWillEnd(boolean z) {
        AnonymousClass0G9 anonymousClass0G9 = this.f2304B;
        if (anonymousClass0G9 != null) {
            anonymousClass0G9.f2310D.m2381A();
            this.f2304B = null;
        }
        anonymousClass0G9 = this.f2306D;
        if (anonymousClass0G9 != null) {
            anonymousClass0G9.f2310D.m2381A();
            this.f2306D = null;
        }
    }
}
