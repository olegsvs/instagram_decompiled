package X;

import android.net.wifi.ScanResult;
import android.os.Build.VERSION;
import java.util.List;

/* renamed from: X.1GM */
public final class AnonymousClass1GM {
    /* renamed from: B */
    public final long f16267B;
    /* renamed from: C */
    private final AnonymousClass0C9 f16268C;
    /* renamed from: D */
    private final AnonymousClass0Jy f16269D;

    public AnonymousClass1GM(AnonymousClass0Jy anonymousClass0Jy, AnonymousClass0C9 anonymousClass0C9, long j) {
        this.f16269D = anonymousClass0Jy;
        this.f16268C = anonymousClass0C9;
        this.f16267B = j;
    }

    /* renamed from: A */
    public final void m10473A(ScanResult scanResult, long j) {
        if (scanResult != null) {
            if (j > 0) {
                if (VERSION.SDK_INT >= 17) {
                    long now = this.f16269D.now() - scanResult.timestamp;
                    if (Math.abs(now) <= j) {
                        scanResult.timestamp = (this.f16268C.now() - now) * 1000;
                    }
                }
            }
        }
    }

    /* renamed from: B */
    public final void m10474B(List list, long j) {
        if (list != null) {
            for (ScanResult A : list) {
                m10473A(A, j);
            }
        }
    }
}
