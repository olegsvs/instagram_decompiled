package X;

import android.media.MediaMetadataRetriever;
import java.io.File;
import java.util.List;

/* renamed from: X.1Km */
public final class AnonymousClass1Km implements AnonymousClass2Er {
    /* renamed from: B */
    public float f17205B = 1.0f;
    /* renamed from: C */
    public float f17206C;
    /* renamed from: D */
    public int f17207D;
    /* renamed from: E */
    public List f17208E;
    /* renamed from: F */
    public int f17209F;
    /* renamed from: G */
    public double f17210G;
    /* renamed from: H */
    public double f17211H;
    /* renamed from: I */
    public boolean f17212I;
    /* renamed from: J */
    public boolean f17213J = false;
    /* renamed from: K */
    public int f17214K;
    /* renamed from: L */
    public boolean f17215L;
    /* renamed from: M */
    public long f17216M = -1;
    /* renamed from: N */
    public float f17217N = 0.5f;
    /* renamed from: O */
    public Integer f17218O = null;
    /* renamed from: P */
    public String f17219P;
    /* renamed from: Q */
    public int f17220Q;
    /* renamed from: R */
    public int f17221R;
    /* renamed from: S */
    public String f17222S;
    /* renamed from: T */
    public long f17223T = -1;
    /* renamed from: U */
    public int f17224U;
    /* renamed from: V */
    private transient String f17225V;

    /* renamed from: A */
    public final String m10790A() {
        if (this.f17225V == null && this.f17222S != null && new File(this.f17222S).exists()) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(this.f17222S);
            this.f17225V = mediaMetadataRetriever.extractMetadata(12);
        }
        String str = this.f17225V;
        return str != null ? str : "unknown";
    }

    /* renamed from: B */
    public final int m10791B() {
        long j = this.f17216M;
        return j > 0 ? (int) ((this.f17223T * 8000) / j) : -1;
    }

    /* renamed from: C */
    public final int m10792C() {
        Integer num = this.f17218O;
        return num != null ? num.intValue() : 0;
    }

    /* renamed from: D */
    public final void m10793D(int i, int i2) {
        this.f17224U = i;
        this.f17214K = i2;
        this.f17206C = ((float) i) / ((float) i2);
    }

    /* renamed from: E */
    public final void m10794E(int i, int i2) {
        int C = m10792C();
        if (C != 1) {
            if (C != 3) {
                m10793D(i, i2);
                return;
            }
        }
        m10793D(i2, i);
    }

    /* renamed from: F */
    public final AnonymousClass1Km m10795F(int i) {
        this.f17218O = Integer.valueOf(i);
        return this;
    }

    /* renamed from: G */
    public final AnonymousClass1Km m10796G(String str) {
        this.f17222S = str;
        this.f17223T = AnonymousClass1Ag.m9744H(str);
        return this;
    }

    public final int getDuration() {
        return this.f17209F - this.f17220Q;
    }
}
