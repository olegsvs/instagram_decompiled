package X;

import com.facebook.common.dextricks.StartupQEsConfig;

/* renamed from: X.1u4 */
public final class AnonymousClass1u4 {
    /* renamed from: B */
    public final int f23914B;
    /* renamed from: C */
    public final int f23915C;
    /* renamed from: D */
    public final int f23916D;

    public AnonymousClass1u4() {
        this.f23915C = 50;
        this.f23916D = 1;
        this.f23914B = StartupQEsConfig.DEFAULT_IDLE_MAX_INTERVAL_MS;
    }

    public AnonymousClass1u4(int i, int i2, int i3) {
        this.f23915C = Math.max(Math.min(i, StartupQEsConfig.DEFAULT_IDLE_MAX_INTERVAL_MS), 0);
        this.f23916D = Math.max(Math.min(i2, 5000), 1);
        this.f23914B = Math.max(Math.min(i3, 5000), 1);
    }
}
