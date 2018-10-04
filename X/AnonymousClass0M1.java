package X;

import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0M1 */
public final class AnonymousClass0M1 implements AnonymousClass0ES {
    /* renamed from: P */
    public static final Random f3316P = new Random();
    /* renamed from: B */
    public final Context f3317B;
    /* renamed from: C */
    public final AnonymousClass0M2 f3318C;
    /* renamed from: D */
    public final int f3319D;
    /* renamed from: E */
    public final long f3320E;
    /* renamed from: F */
    public final int f3321F;
    /* renamed from: G */
    public final int f3322G;
    /* renamed from: H */
    public final int f3323H;
    /* renamed from: I */
    public final boolean f3324I;
    /* renamed from: J */
    public final AnonymousClass0FI f3325J;
    /* renamed from: K */
    public final int f3326K;
    /* renamed from: L */
    public final boolean f3327L;
    /* renamed from: M */
    public final boolean f3328M;
    /* renamed from: N */
    public final boolean f3329N;
    /* renamed from: O */
    public final boolean f3330O;

    public AnonymousClass0M1(Context context, long j, int i, int i2, int i3, boolean z, int i4, AnonymousClass0M2 anonymousClass0M2, int i5, boolean z2, boolean z3, boolean z4, boolean z5, AnonymousClass0FI anonymousClass0FI) {
        this.f3317B = context;
        this.f3320E = j;
        this.f3321F = i;
        this.f3323H = i2;
        this.f3322G = i3;
        this.f3319D = i4;
        this.f3324I = z;
        this.f3318C = anonymousClass0M2;
        this.f3326K = i5;
        this.f3330O = z2;
        this.f3329N = z3;
        this.f3328M = z4;
        this.f3327L = z5;
        this.f3325J = anonymousClass0FI;
    }

    /* renamed from: B */
    public static AnonymousClass0Gy m3039B(AnonymousClass0M1 anonymousClass0M1, File file) {
        try {
            AnonymousClass0Gy anonymousClass0Gy = new AnonymousClass0Gy(file, "api", 20);
            AnonymousClass0Fj.f2192B.m1666A(new AnonymousClass22z(anonymousClass0M1, anonymousClass0Gy));
            return anonymousClass0Gy;
        } catch (IOException e) {
            AnonymousClass0Gn.m1876C("ig_cache_logger", StringFormatUtil.formatStrLocaleSafe("Could not initialize logger. %s", e.getLocalizedMessage()));
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ Object get() {
        Executor executor;
        if (((Boolean) AnonymousClass0CC.vc.m845G()).booleanValue()) {
            synchronized (AnonymousClass1M5.class) {
                if (AnonymousClass1M5.f17516C == null) {
                    AnonymousClass1M5.f17516C = new AnonymousClass1M5(new ThreadPoolExecutor(8, 32, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(100), AnonymousClass1M5.f17517D));
                }
                executor = AnonymousClass1M5.f17516C;
            }
        } else {
            executor = AnonymousClass0Fx.m1698B();
        }
        AnonymousClass0Nf anonymousClass0Ni = new AnonymousClass0Ni(executor, AnonymousClass0FJ.m1552B());
        File B = AnonymousClass0Gq.m1903B(this.f3317B, "http_responses", false);
        AnonymousClass0Gy B2 = AnonymousClass0M1.m3039B(this, B);
        AnonymousClass0TY.f5217H = new AnonymousClass0TY(B, B2);
        AnonymousClass0Nf anonymousClass0b5 = new AnonymousClass0b5(anonymousClass0Ni, this.f3326K);
        anonymousClass0b5.f6640B.add(new AnonymousClass0b6(this));
        anonymousClass0b5.f6640B.add(AnonymousClass0b8.m5521B());
        if (this.f3327L) {
            anonymousClass0b5.f6640B.add(AnonymousClass0b9.m5522B());
        }
        anonymousClass0b5 = new AnonymousClass0bB(new AnonymousClass0bF(anonymousClass0b5, r1.f3325J, AnonymousClass0H6.m1945B(), new AnonymousClass0bK(r1)), r1.f3320E, r1.f3321F, r1.f3323H, r1.f3322G, r1.f3319D, r1.f3324I, ((Boolean) AnonymousClass0CC.SO.m845G()).booleanValue(), ((Integer) AnonymousClass0CC.MQ.m845G()).intValue(), new AnonymousClass0bC());
        AnonymousClass0M2 anonymousClass0M2 = r1.f3318C;
        if (anonymousClass0M2 != null) {
            anonymousClass0b5 = new AnonymousClass0bH(anonymousClass0M2, anonymousClass0b5);
        }
        anonymousClass0b5 = new AnonymousClass0bL(new AnonymousClass0bJ(anonymousClass0b5, new AnonymousClass0TX(r1)), new AnonymousClass0bM(), B2, ((Boolean) AnonymousClass0CC.SO.m845G()).booleanValue());
        if (r1.f3330O) {
            try {
                anonymousClass0b5 = (AnonymousClass0Nf) Class.forName("com.instagram.api.visualizer.RequestVisualizerLayer").getConstructor(new Class[]{AnonymousClass0Nf.class}).newInstance(new Object[]{anonymousClass0b5});
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        if (r1.f3329N) {
            try {
                if (((Boolean) Class.forName("com.instagram.debug.devoptions.builtin.StethoLayer").getMethod("isStethoEnabled", new Class[0]).invoke(null, new Object[0])).booleanValue()) {
                    anonymousClass0b5 = (AnonymousClass0Nf) Class.forName("com.instagram.debug.devoptions.builtin.StethoLayer").getConstructor(new Class[]{AnonymousClass0Nf.class}).newInstance(new Object[]{anonymousClass0b5});
                }
            } catch (Throwable e2) {
                throw new RuntimeException(e2);
            }
        }
        if (r1.f3328M) {
            try {
                anonymousClass0b5 = (AnonymousClass0Nf) Class.forName("com.instagram.debug.devoptions.builtin.SonarNetworkLayer").getConstructor(new Class[]{Context.class, AnonymousClass0Nf.class}).newInstance(new Object[]{r1.f3317B, anonymousClass0b5});
            } catch (Throwable e22) {
                throw new RuntimeException(e22);
            }
        }
        AnonymousClass0Nf anonymousClass0bQ = new AnonymousClass0bQ(new AnonymousClass0bO(anonymousClass0b5));
        if (!AnonymousClass0bR.m5584B().isEmpty()) {
            anonymousClass0bQ = new AnonymousClass1Uf(anonymousClass0bQ);
        }
        if (r1.f3327L) {
            anonymousClass0bQ = new AnonymousClass0bT(anonymousClass0bQ);
        }
        return new AnonymousClass22u(anonymousClass0bQ);
    }
}
