package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Oq */
public final class AnonymousClass0Oq extends AnonymousClass0Kn {
    /* renamed from: H */
    private static AnonymousClass0Oq f3946H;
    /* renamed from: I */
    public static AnonymousClass0Or f3947I;
    /* renamed from: B */
    public AnonymousClass5Qu f3948B;
    /* renamed from: C */
    public Context f3949C;
    /* renamed from: D */
    public long f3950D = 0;
    /* renamed from: E */
    public long f3951E = 0;
    /* renamed from: F */
    public AnonymousClass0Cm f3952F;
    /* renamed from: G */
    private AnonymousClass0Oz f3953G;

    /* renamed from: A */
    public final void m3673A() {
        if (this.f3953G != null) {
            AnonymousClass0Oy.m3698B().m3700B(this.f3953G);
            this.f3953G = null;
        }
    }

    /* renamed from: B */
    public static AnonymousClass0Oq m3668B() {
        if (f3946H == null) {
            f3946H = new AnonymousClass0Oq();
        }
        return f3946H;
    }

    /* renamed from: B */
    public final AnonymousClass0Ov m3674B(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0Ov B = AnonymousClass0Ou.m3677B(this.f3949C, anonymousClass0Cm.f1759C);
        if (B == null) {
            B = new AnonymousClass0Ov();
        }
        long j = this.f3951E;
        if (!(j == 0 || this.f3950D == 0)) {
            B.f3958B.add(new AnonymousClass0Ot(j, AnonymousClass0Oq.m3668B().m3672F()));
        }
        return B;
    }

    /* renamed from: C */
    public static long m3669C(AnonymousClass0Cm anonymousClass0Cm) {
        anonymousClass0Cm = new AnonymousClass0P0(AnonymousClass0Oq.m3668B().m3674B(anonymousClass0Cm));
        long C = AnonymousClass0P0.m3702C(anonymousClass0Cm.f3965D + (((long) 6) * 86400), AnonymousClass0P0.m3701B(anonymousClass0Cm, 6), anonymousClass0Cm.f3963B);
        if (C > 86400) {
            return 86400;
        }
        return C;
    }

    /* renamed from: C */
    public final void m3675C() {
        AnonymousClass0Cm anonymousClass0Cm = this.f3952F;
        if (anonymousClass0Cm != null) {
            long C = AnonymousClass0Oq.m3669C(anonymousClass0Cm);
            long B = AnonymousClass0P1.m3703B(this.f3952F);
            m3673A();
            this.f3953G = new AnonymousClass0Oz(this, B);
            if (C < B) {
                AnonymousClass0Oy.m3698B().m3699A(this.f3953G, (B - C) * 1000);
            }
        }
    }

    /* renamed from: D */
    public static void m3670D(AnonymousClass0Oq anonymousClass0Oq) {
        anonymousClass0Oq.f3951E = System.currentTimeMillis() / 1000;
        anonymousClass0Oq.f3950D = SystemClock.elapsedRealtime() / 1000;
        if (anonymousClass0Oq.f3952F == null) {
            AnonymousClass5Qd.D(anonymousClass0Oq.f3951E, 0);
            return;
        }
        anonymousClass0Oq.m3675C();
        AnonymousClass0NN.m3291B("ig_active_interval", null).m3298F("logging_method", "deduplicated").m3298F("event_type", "interval_start").m3295C(TraceFieldType.StartTime, anonymousClass0Oq.f3951E).m3310R();
    }

    /* renamed from: E */
    public static void m3671E(AnonymousClass0Oq anonymousClass0Oq) {
        long F = AnonymousClass0Oq.m3668B().m3672F();
        if (anonymousClass0Oq.f3952F != null) {
            long j = anonymousClass0Oq.f3951E;
            if (!(j == 0 || anonymousClass0Oq.f3950D == 0)) {
                if (j < F) {
                    AnonymousClass0Ot anonymousClass0Ot = new AnonymousClass0Ot(j, F);
                    long j2 = anonymousClass0Oq.f3951E;
                    AnonymousClass0Ov B = AnonymousClass0Oq.m3668B().m3674B(anonymousClass0Oq.f3952F);
                    AnonymousClass0NN.m3291B("ig_active_interval", null).m3298F("logging_method", "deduplicated").m3298F("event_type", "interval").m3295C(TraceFieldType.StartTime, j2).m3295C("end_time", F).m3310R();
                    AnonymousClass0NN F2 = AnonymousClass0NN.m3291B("ig_active_interval", null).m3298F("logging_method", "deduplicated").m3298F("event_type", "summary");
                    String str = "summary_start_time";
                    long j3 = F - 86400;
                    long j4 = F;
                    for (AnonymousClass0Ot anonymousClass0Ot2 : B.m3680A()) {
                        if (anonymousClass0Ot2.f3956C > j3 && anonymousClass0Ot2.f3955B < F) {
                            j4 = Math.min(j4, Math.max(j3, anonymousClass0Ot2.f3955B));
                        }
                    }
                    F2.m3295C(str, j4).m3295C("summary_end_time", F).m3295C("time_in_app", AnonymousClass0P0.m3702C(F - 86400, F, B)).m3310R();
                    AnonymousClass0Ov B2 = AnonymousClass0Ou.m3677B(anonymousClass0Oq.f3949C, anonymousClass0Oq.f3952F.f1759C);
                    if (B2 == null) {
                        B2 = new AnonymousClass0Ov();
                    }
                    F -= 691200;
                    List arrayList = new ArrayList();
                    for (AnonymousClass0Ot anonymousClass0Ot3 : r2.m3680A()) {
                        if (anonymousClass0Ot3.f3955B >= F) {
                            arrayList.add(anonymousClass0Ot3);
                        }
                    }
                    B2 = AnonymousClass5Qx.B(new AnonymousClass0Ov(arrayList));
                    B2.f3958B.add(anonymousClass0Ot);
                    AnonymousClass0Ou.m3678C(anonymousClass0Oq.f3949C, anonymousClass0Oq.f3952F.f1759C, B2);
                    anonymousClass0Oq.m3673A();
                    anonymousClass0Oq.f3951E = 0;
                    anonymousClass0Oq.f3950D = 0;
                    return;
                }
            }
        }
        AnonymousClass5Qd.D(anonymousClass0Oq.f3951E, F);
    }

    /* renamed from: F */
    private long m3672F() {
        return (this.f3951E + (SystemClock.elapsedRealtime() / 1000)) - this.f3950D;
    }

    public final void onActivityPaused(Activity activity) {
        if (this.f3948B.f63326B && !this.f3948B.f63327C) {
            AnonymousClass0Oq.m3671E(this);
        }
        this.f3948B.f63326B = false;
    }

    public final void onActivityResumed(Activity activity) {
        if (!(this.f3948B.f63326B || this.f3948B.f63327C)) {
            AnonymousClass0Oq.m3670D(this);
        }
        this.f3948B.f63326B = true;
    }
}
