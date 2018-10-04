package X;

import android.content.Context;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.1Fh */
public final class AnonymousClass1Fh {
    /* renamed from: N */
    private static AnonymousClass1Fh f16063N;
    /* renamed from: B */
    public final Context f16064B;
    /* renamed from: C */
    public final AnonymousClass0G4 f16065C = new AnonymousClass1GC(this);
    /* renamed from: D */
    public AnonymousClass1GO f16066D;
    /* renamed from: E */
    public AnonymousClass1GI f16067E;
    /* renamed from: F */
    public final AnonymousClass0G4 f16068F = new AnonymousClass1GA(this);
    /* renamed from: G */
    public AnonymousClass1GF f16069G;
    /* renamed from: H */
    public final AnonymousClass0G4 f16070H = new AnonymousClass1GB(this);
    /* renamed from: I */
    private ScheduledExecutorService f16071I;
    /* renamed from: J */
    private AnonymousClass1G3 f16072J;
    /* renamed from: K */
    private AnonymousClass1GE f16073K;
    /* renamed from: L */
    private ScheduledExecutorService f16074L;
    /* renamed from: M */
    private AnonymousClass1GG f16075M;

    private AnonymousClass1Fh(Context context) {
        this.f16064B = context;
    }

    /* renamed from: A */
    public final synchronized ScheduledExecutorService m10368A() {
        if (this.f16071I == null) {
            this.f16071I = new AnonymousClass1GD(new Handler(AnonymousClass0NZ.m3338B()));
        }
        return this.f16071I;
    }

    /* renamed from: B */
    public static synchronized AnonymousClass1Fh m10366B(Context context) {
        AnonymousClass1Fh anonymousClass1Fh;
        synchronized (AnonymousClass1Fh.class) {
            if (f16063N == null) {
                f16063N = new AnonymousClass1Fh(context.getApplicationContext());
            }
            anonymousClass1Fh = f16063N;
        }
        return anonymousClass1Fh;
    }

    /* renamed from: B */
    public final synchronized AnonymousClass1G3 m10369B() {
        if (this.f16072J == null) {
            AnonymousClass1GE C = m10367C();
            LocationManager C2 = m10367C();
            synchronized (this) {
                if (this.f16069G == null) {
                    this.f16069G = new AnonymousClass1GF(AnonymousClass0Kd.f3087B, RealtimeSinceBootClock.get());
                }
            }
            this.f16072J = new AnonymousClass1G3(C, C2, this.f16069G);
        }
        return this.f16072J;
    }

    /* renamed from: C */
    public final synchronized AnonymousClass1GE m10370C() {
        if (this.f16073K == null) {
            this.f16073K = new AnonymousClass1GE(this.f16064B, m10367C(), true);
        }
        return this.f16073K;
    }

    /* renamed from: C */
    private LocationManager m10367C() {
        return (LocationManager) this.f16064B.getSystemService("location");
    }

    /* renamed from: D */
    public final synchronized ScheduledExecutorService m10371D() {
        if (this.f16074L == null) {
            this.f16074L = new AnonymousClass1GD(new Handler(Looper.getMainLooper()));
        }
        return this.f16074L;
    }

    /* renamed from: E */
    public final synchronized AnonymousClass1GG m10372E() {
        if (this.f16075M == null) {
            this.f16075M = new AnonymousClass1GG(this.f16064B, AnonymousClass0Kd.f3087B, RealtimeSinceBootClock.get(), m10368A(), 600000);
        }
        return this.f16075M;
    }

    /* renamed from: F */
    public final AnonymousClass1Fx m10373F() {
        return new AnonymousClass1GH(m10367C(), AnonymousClass0Kd.f3087B, RealtimeSinceBootClock.get(), m10368A(), m10371D(), m10367C(), m10369B());
    }

    /* renamed from: G */
    public final AnonymousClass1Fi m10374G() {
        AnonymousClass1GI anonymousClass1GI;
        synchronized (this) {
            if (this.f16067E == null) {
                this.f16067E = new AnonymousClass1GI((TelephonyManager) this.f16064B.getSystemService("phone"));
            }
            anonymousClass1GI = this.f16067E;
        }
        return new AnonymousClass1Fi(anonymousClass1GI, this.f16068F, this.f16070H, this.f16065C, m10372E(), m10368A());
    }
}
