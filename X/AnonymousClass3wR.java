package X;

import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.3wR */
public abstract class AnonymousClass3wR implements AnonymousClass2y4 {
    /* renamed from: B */
    public final TrackGroup f47156B;
    /* renamed from: C */
    public final int f47157C;
    /* renamed from: D */
    public final int[] f47158D;
    /* renamed from: E */
    private final long[] f47159E;
    /* renamed from: F */
    private final Format[] f47160F;
    /* renamed from: G */
    private int f47161G;

    public final void BH() {
    }

    public final void WG() {
    }

    public final void qt(float f) {
    }

    public AnonymousClass3wR(TrackGroup trackGroup, int... iArr) {
        int i = 0;
        AnonymousClass2yO.m18017F(iArr.length > 0);
        this.f47156B = (TrackGroup) AnonymousClass2yO.m18016E(trackGroup);
        int length = iArr.length;
        this.f47157C = length;
        this.f47160F = new Format[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f47160F[i2] = trackGroup.m17885A(iArr[i2]);
        }
        Arrays.sort(this.f47160F, new AnonymousClass2xw());
        this.f47158D = new int[this.f47157C];
        while (true) {
            length = this.f47157C;
            if (i < length) {
                this.f47158D[i] = trackGroup.m17886B(this.f47160F[i]);
                i++;
            } else {
                this.f47159E = new long[length];
                return;
            }
        }
    }

    /* renamed from: A */
    public final boolean m21623A(int i, long j) {
        return this.f47159E[i] > j;
    }

    /* renamed from: B */
    public void mo5158B(long j, long j2, long j3, AnonymousClass2wz anonymousClass2wz, AnonymousClass443 anonymousClass443) {
        RWA(j, j2, j3);
    }

    public final Format JM(int i) {
        return this.f47160F[i];
    }

    public final TrackGroup QT() {
        return this.f47156B;
    }

    public int TH(long j, List list) {
        return list.size();
    }

    public final Format XR() {
        return this.f47160F[ZR()];
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    AnonymousClass3wR anonymousClass3wR = (AnonymousClass3wR) obj;
                    if (this.f47156B != anonymousClass3wR.f47156B || !Arrays.equals(this.f47158D, anonymousClass3wR.f47158D)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        if (this.f47161G == 0) {
            this.f47161G = (System.identityHashCode(this.f47156B) * 31) + Arrays.hashCode(this.f47158D);
        }
        return this.f47161G;
    }

    public final int length() {
        return this.f47158D.length;
    }

    public final int pV(Format format) {
        for (int i = 0; i < this.f47157C; i++) {
            if (this.f47160F[i] == format) {
                return i;
            }
        }
        return -1;
    }

    public final boolean tC(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean A = m21623A(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.f47157C && !A) {
            A = (i2 == i || m21623A(i2, elapsedRealtime)) ? false : true;
            i2++;
        }
        if (!A) {
            return false;
        }
        long[] jArr = this.f47159E;
        jArr[i] = Math.max(jArr[i], elapsedRealtime + j);
        return true;
    }

    public final int xM(int i) {
        return this.f47158D[i];
    }
}
