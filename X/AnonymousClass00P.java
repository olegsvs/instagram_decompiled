package X;

import android.app.ActivityManager;
import android.app.ActivityManager.ProcessErrorStateInfo;
import android.content.Context;
import com.facebook.common.dextricks.StartupQEsConfig;
import java.util.List;

/* renamed from: X.00P */
public final class AnonymousClass00P {
    /* renamed from: J */
    public static final String f50J = "ProcessAnrErrorMonitor";
    /* renamed from: B */
    public final boolean f51B;
    /* renamed from: C */
    public final boolean f52C;
    /* renamed from: D */
    public final int f53D;
    /* renamed from: E */
    public AnonymousClass00N f54E;
    /* renamed from: F */
    private final Context f55F;
    /* renamed from: G */
    private long f56G;
    /* renamed from: H */
    private AnonymousClass00L f57H;
    /* renamed from: I */
    private final String f58I;

    public AnonymousClass00P(Context context, String str) {
        this(context, str, true, StartupQEsConfig.DEFAULT_IDLE_MAX_INTERVAL_MS, false);
    }

    public AnonymousClass00P(Context context, String str, boolean z, int i, boolean z2) {
        this.f55F = context;
        this.f58I = str;
        this.f54E = AnonymousClass00N.NOT_MONITORING;
        this.f52C = z;
        this.f53D = i;
        this.f51B = z2;
    }

    /* renamed from: A */
    public final ProcessErrorStateInfo m22A(ActivityManager activityManager) {
        List<ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
        if (processesInErrorState != null) {
            for (ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                if (this.f58I.equals(processErrorStateInfo.processName) && processErrorStateInfo.condition == 2) {
                    return processErrorStateInfo;
                }
            }
        }
        return null;
    }

    /* renamed from: B */
    public final void m23B(AnonymousClass00M anonymousClass00M, long j) {
        long j2 = j;
        Long.valueOf(j);
        ActivityManager activityManager = (ActivityManager) this.f55F.getSystemService("activity");
        synchronized (this) {
            if (this.f54E != AnonymousClass00N.NOT_MONITORING) {
                AnonymousClass00L.m19B(this.f57H);
            }
            this.f56G++;
            this.f57H = new AnonymousClass00L(r4, activityManager, anonymousClass00M, this.f56G, j2);
            this.f54E = AnonymousClass00N.MONITORING_NO_ERROR_DETECTED;
            this.f57H.start();
        }
    }

    /* renamed from: C */
    public final void m24C() {
        synchronized (this) {
            if (this.f54E != AnonymousClass00N.NOT_MONITORING) {
                AnonymousClass00L.m19B(this.f57H);
            }
        }
    }

    /* renamed from: D */
    public final void m25D(AnonymousClass00O anonymousClass00O, AnonymousClass00M anonymousClass00M) {
        m26E(anonymousClass00O, anonymousClass00M, null, null);
    }

    /* renamed from: E */
    public final synchronized void m26E(AnonymousClass00O anonymousClass00O, AnonymousClass00M anonymousClass00M, String str, String str2) {
        if (this.f57H.f31B == this.f56G) {
            switch (AnonymousClass00J.f28B[anonymousClass00O.ordinal()]) {
                case 1:
                    this.f54E = AnonymousClass00N.MONITORING_ERROR_DETECTED;
                    anonymousClass00M.vk(str, str2);
                    break;
                case 2:
                    if (this.f51B) {
                        this.f54E = AnonymousClass00N.MONITORING_NO_ERROR_DETECTED;
                    } else {
                        this.f54E = AnonymousClass00N.NOT_MONITORING;
                    }
                    anonymousClass00M.uk();
                    break;
                case 3:
                    this.f54E = AnonymousClass00N.NOT_MONITORING;
                    anonymousClass00M.xq();
                    break;
                case 4:
                    this.f54E = AnonymousClass00N.NOT_MONITORING;
                    anonymousClass00M.yq();
                    break;
                case 5:
                    this.f54E = AnonymousClass00N.NOT_MONITORING;
                    break;
                case 6:
                    this.f54E = AnonymousClass00N.NOT_MONITORING;
                    anonymousClass00M.Yf();
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unexpected state change reason: ");
                    stringBuilder.append(anonymousClass00O);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }
}
