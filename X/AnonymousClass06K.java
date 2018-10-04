package X;

import android.content.Context;
import com.facebook.rti.common.time.RealtimeSinceBootClock;

/* renamed from: X.06K */
public final class AnonymousClass06K {
    /* renamed from: B */
    public final RealtimeSinceBootClock f332B;
    /* renamed from: C */
    public final AnonymousClass06L f333C;
    /* renamed from: D */
    public long f334D = 0;
    /* renamed from: E */
    private final boolean f335E;
    /* renamed from: F */
    private long f336F = -1;
    /* renamed from: G */
    private long f337G = -1;
    /* renamed from: H */
    private final AnonymousClass0AH f338H;

    public AnonymousClass06K(Context context, AnonymousClass06L anonymousClass06L, RealtimeSinceBootClock realtimeSinceBootClock, boolean z, AnonymousClass0AH anonymousClass0AH) {
        this.f333C = anonymousClass06L;
        this.f332B = realtimeSinceBootClock;
        this.f335E = z;
        this.f338H = anonymousClass0AH;
        long now = this.f332B.now();
        if (AnonymousClass06K.m388B(this).m684D("last_log_ms", now) >= now) {
            AnonymousClass06K.m388B(this).m682B().TIA("last_log_ms", now).nE();
        }
    }

    /* renamed from: A */
    public final synchronized void m390A() {
        if (this.f335E) {
            m389C();
        }
    }

    /* renamed from: B */
    public static AnonymousClass0AG m388B(AnonymousClass06K anonymousClass06K) {
        return anonymousClass06K.f338H.m685A(AnonymousClass061.MQTT_RADIO_ACTIVE_TIME);
    }

    /* renamed from: C */
    private void m389C() {
        long now = this.f332B.now();
        long j = this.f336F;
        if (j < 0) {
            this.f336F = now;
            this.f337G = now;
            return;
        }
        long j2 = now - j;
        this.f336F = now;
        if (j2 > 10000) {
            this.f334D += 10000;
        } else {
            this.f334D += j2;
        }
        if (now - this.f337G > 20000) {
            this.f334D += AnonymousClass06K.m388B(this).m684D("total_wake_ms", 0);
            AnonymousClass06K.m388B(this).m682B().TIA("total_wake_ms", this.f334D).nE();
            this.f334D = 0;
            this.f337G = now;
        }
        if (now - AnonymousClass06K.m388B(this).m684D("last_log_ms", now) > 3600000) {
            AnonymousClass06L anonymousClass06L = this.f333C;
            long D = AnonymousClass06K.m388B(this).m684D("total_wake_ms", 0);
            String str = "mqtt_radio_active_time";
            anonymousClass06L.m397B(str, AnonymousClass05g.m343D("total_wake_ms", Long.toString(D)));
            AnonymousClass06K.m388B(this).m682B().SE().nE();
            AnonymousClass06K.m388B(this).m682B().TIA("last_log_ms", now).nE();
        }
    }
}
