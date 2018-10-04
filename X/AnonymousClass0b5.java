package X;

import android.os.SystemClock;
import com.facebook.common.dextricks.StartupQEsConfig;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0b5 */
public final class AnonymousClass0b5 extends AnonymousClass0Tb implements AnonymousClass0Nf {
    /* renamed from: B */
    public final ArrayList f6640B = new ArrayList();
    /* renamed from: C */
    private long f6641C;
    /* renamed from: D */
    private long f6642D;
    /* renamed from: E */
    private final AnonymousClass0Nf f6643E;
    /* renamed from: F */
    private final int f6644F;
    /* renamed from: G */
    private int f6645G;
    /* renamed from: H */
    private final Set f6646H = new HashSet();
    /* renamed from: I */
    private long f6647I;

    public AnonymousClass0b5(AnonymousClass0Nf anonymousClass0Nf, int i) {
        this.f6643E = anonymousClass0Nf;
        this.f6644F = i;
    }

    /* renamed from: B */
    private static double m5517B(long j, long j2) {
        if (j < 50000 || j2 <= 50) {
            return -1.0d;
        }
        double d = (double) j;
        Double.isNaN(d);
        d *= 1.0d;
        double d2 = (double) j2;
        Double.isNaN(d2);
        return d / d2;
    }

    /* renamed from: B */
    public final synchronized void mo1282B(AnonymousClass0a8 anonymousClass0a8, AnonymousClass0aA anonymousClass0aA, ByteBuffer byteBuffer) {
        this.f6641C += (long) byteBuffer.limit();
        if (anonymousClass0aA.m5433A() == AnonymousClass0Qw.OnScreen) {
            this.f6642D += (long) byteBuffer.limit();
        }
    }

    /* renamed from: C */
    public final synchronized void mo1401C(AnonymousClass0a8 anonymousClass0a8, AnonymousClass0aA anonymousClass0aA) {
        if (this.f6646H.remove(anonymousClass0a8) && this.f6646H.isEmpty()) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f6647I;
            double B = AnonymousClass0b5.m5517B(this.f6641C, elapsedRealtime);
            double B2 = anonymousClass0aA.m5433A() == AnonymousClass0Qw.OnScreen ? AnonymousClass0b5.m5517B(this.f6642D, elapsedRealtime) : -1.0d;
            if (B != -1.0d) {
                int size = this.f6640B.size();
                for (int i = 0; i < size; i++) {
                    AnonymousClass0b7 anonymousClass0b7 = (AnonymousClass0b7) this.f6640B.get(i);
                    anonymousClass0b7.Ke(B, this.f6641C, elapsedRealtime);
                    if (B2 != -1.0d) {
                        anonymousClass0b7.NKA(B2);
                    }
                }
            }
            this.f6642D = 0;
            this.f6641C = 0;
            this.f6645G = 0;
        }
    }

    /* renamed from: E */
    public final synchronized void mo1283E(AnonymousClass0a8 anonymousClass0a8, AnonymousClass0aA anonymousClass0aA, AnonymousClass0qA anonymousClass0qA) {
        this.f6646H.add(anonymousClass0a8);
        if (this.f6646H.size() == 1) {
            this.f6647I = SystemClock.elapsedRealtime();
        }
        this.f6645G = Math.max(this.f6645G, this.f6646H.size());
    }

    public final AnonymousClass0aL pUA(AnonymousClass0a8 anonymousClass0a8, AnonymousClass0aA anonymousClass0aA, AnonymousClass0gT anonymousClass0gT) {
        double d = AnonymousClass0b8.m5521B().f6649B;
        if (d <= StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED || d >= ((double) this.f6644F) || anonymousClass0aA.f6460H != AnonymousClass0Qv.Video || anonymousClass0aA.m5433A() != AnonymousClass0Qw.OffScreen) {
            if (anonymousClass0aA.f6460H == AnonymousClass0Qv.Image || anonymousClass0aA.f6460H == AnonymousClass0Qv.Video) {
                anonymousClass0gT.m6621A(this);
            }
            return this.f6643E.pUA(anonymousClass0a8, anonymousClass0aA, anonymousClass0gT);
        }
        AnonymousClass0GG.m1763B(AnonymousClass0Fx.m1698B(), new AnonymousClass23k(this, anonymousClass0gT, anonymousClass0a8), 1396979228);
        return new AnonymousClass23l(this);
    }
}
