package X;

import android.content.Context;
import com.facebook.C0164R;
import java.util.Random;

/* renamed from: X.0d0 */
public final class AnonymousClass0d0 implements AnonymousClass0EJ, AnonymousClass0G2 {
    /* renamed from: E */
    public static final Random f7300E = new Random();
    /* renamed from: B */
    public final AnonymousClass0Xr f7301B;
    /* renamed from: C */
    public int f7302C;
    /* renamed from: D */
    public AnonymousClass0Cm f7303D;

    public AnonymousClass0d0(Context context, AnonymousClass0Cm anonymousClass0Cm, int i) {
        this.f7303D = anonymousClass0Cm;
        this.f7302C = i;
        this.f7301B = new AnonymousClass1EZ(context).m10210A();
    }

    /* renamed from: B */
    private void m5939B(boolean z) {
        boolean z2 = true;
        if (f7300E.nextInt(100) < 1) {
            AnonymousClass0NN F = AnonymousClass0NN.m3291B("ig_android_background_prefetch_scheduler", null).m3298F("type", "cancelled");
            String str = "is_running";
            if (AnonymousClass0hZ.m6764B() == null) {
                z2 = false;
            }
            AnonymousClass0NN H = F.m3300H(str, z2);
            if (z) {
                long j = AnonymousClass0HV.m2008D(this.f7303D).f2646B.getLong("bg_fetch_schedule_target_ms", -1);
                long B = AnonymousClass0dw.m6134B();
                if (j != -1 && B < j) {
                    H.m3295C("latency_delta", j - B);
                }
            }
            H.m3310R();
        }
    }

    public final void onAppBackgrounded() {
        if (this.f7301B != null) {
            long B = AnonymousClass0ha.m6769B(this.f7303D, AnonymousClass0Gc.f2391B) * 60000;
            if (this.f7301B != null) {
                if (f7300E.nextInt(100) < 1) {
                    AnonymousClass0NN.m3291B("ig_android_background_prefetch_scheduler", null).m3298F("type", "scheduled").m3310R();
                }
                AnonymousClass0HV.m2008D(this.f7303D).gA(AnonymousClass0dw.m6134B() + B);
                AnonymousClass0Xr anonymousClass0Xr = this.f7301B;
                int i = ((Boolean) AnonymousClass0CC.xB.m846H(this.f7303D)).booleanValue() ? 1 : 2;
                AnonymousClass0Xs anonymousClass0Xs = new AnonymousClass0Xs(C0164R.id.background_wifi_prefetcher_job_scheduler_compat_id);
                anonymousClass0Xs.f6212E = B;
                anonymousClass0Xs.f6216I = B + ((long) this.f7302C);
                anonymousClass0Xs.f6213F = i;
                anonymousClass0Xs.f6217J = true;
                anonymousClass0Xr.m5271D(anonymousClass0Xs.m5272A());
            }
        }
    }

    public final void onAppForegrounded() {
        AnonymousClass0Xr anonymousClass0Xr = this.f7301B;
        if (anonymousClass0Xr != null) {
            anonymousClass0Xr.m5268A(C0164R.id.background_wifi_prefetcher_job_scheduler_compat_id);
            m5939B(true);
        }
        AnonymousClass0HV.m2008D(this.f7303D).m2048j();
    }

    public final void onUserSessionWillEnd(boolean z) {
        AnonymousClass0Xr anonymousClass0Xr = this.f7301B;
        if (anonymousClass0Xr != null) {
            anonymousClass0Xr.m5268A(C0164R.id.background_wifi_prefetcher_job_scheduler_compat_id);
            m5939B(false);
        }
        AnonymousClass0HV.m2008D(this.f7303D).m2048j();
        AnonymousClass0Fj.f2192B.m1669D(this);
        this.f7303D = null;
    }
}
