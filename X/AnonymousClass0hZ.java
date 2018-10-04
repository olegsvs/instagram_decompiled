package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;

/* renamed from: X.0hZ */
public final class AnonymousClass0hZ {
    /* renamed from: F */
    private static AnonymousClass0hZ f8432F;
    /* renamed from: B */
    public final Context f8433B;
    /* renamed from: C */
    public final List f8434C = new LinkedList();
    /* renamed from: D */
    public AnonymousClass0FM f8435D;
    /* renamed from: E */
    public AnonymousClass3b8 f8436E;

    private AnonymousClass0hZ(Context context) {
        this.f8433B = context;
    }

    /* renamed from: A */
    public final void m6768A(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass1Lh anonymousClass1Lh) {
        String str = "background_prefetch_elapsed_time";
        this.f8435D = AnonymousClass0FM.m1569F(str, str);
        if (new Random().nextInt(100) < 1) {
            AnonymousClass0NN.m3291B("ig_android_background_prefetch_scheduler", null).m3298F("type", "start").m3310R();
        }
        AnonymousClass0Kq B = AnonymousClass0Kq.m2860B();
        B.f3132F = "BackgroundWifiPrefetch";
        Executor A = B.m2861A();
        AnonymousClass0SH anonymousClass0SH = new AnonymousClass0SH(this, anonymousClass1Lh);
        this.f8436E = new AnonymousClass1Li(this, anonymousClass0SH);
        this.f8434C.add(new AnonymousClass1Lj(anonymousClass0Cm, this.f8433B, anonymousClass0SH));
        this.f8434C.add(new AnonymousClass1Lk(AnonymousClass0Jd.f2931B.mo638L(anonymousClass0Cm), anonymousClass0Cm, this.f8436E, "reel_background_prefetch"));
        this.f8434C.add(AnonymousClass0Ib.f2781B.mo617F(anonymousClass0Cm, anonymousClass0SH));
        for (Runnable B2 : this.f8434C) {
            AnonymousClass0GG.m1763B(A, B2, -1839804765);
        }
    }

    /* renamed from: B */
    public static synchronized AnonymousClass0hZ m6764B() {
        AnonymousClass0hZ anonymousClass0hZ;
        synchronized (AnonymousClass0hZ.class) {
            anonymousClass0hZ = f8432F;
        }
        return anonymousClass0hZ;
    }

    /* renamed from: C */
    public static synchronized void m6765C(Context context) {
        synchronized (AnonymousClass0hZ.class) {
            f8432F = new AnonymousClass0hZ(context);
        }
    }

    /* renamed from: D */
    public static void m6766D(AnonymousClass0hZ anonymousClass0hZ) {
        if (new Random().nextInt(100) < 1) {
            AnonymousClass0NN B = AnonymousClass0NN.m3291B("ig_android_background_prefetcher_finished", null);
            AnonymousClass0FM anonymousClass0FM = anonymousClass0hZ.f8435D;
            if (anonymousClass0FM != null) {
                long j = anonymousClass0FM.f2119F;
                ArrayList arrayList = anonymousClass0hZ.f8435D.f2120G;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    AnonymousClass0M0 anonymousClass0M0 = (AnonymousClass0M0) arrayList.get(i);
                    long j2 = anonymousClass0M0.f3315C - j;
                    B.m3295C(anonymousClass0M0.f3314B, j2);
                    Long.valueOf(j2);
                }
            }
            B.m3310R();
        }
    }

    /* renamed from: E */
    public static synchronized void m6767E() {
        synchronized (AnonymousClass0hZ.class) {
            f8432F = null;
        }
    }
}
