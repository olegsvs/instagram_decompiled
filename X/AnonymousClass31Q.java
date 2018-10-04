package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;

/* renamed from: X.31Q */
public final class AnonymousClass31Q {
    /* renamed from: B */
    public float f37061B;
    /* renamed from: C */
    public float f37062C;
    /* renamed from: D */
    public int f37063D;
    /* renamed from: E */
    public float f37064E;
    /* renamed from: F */
    public float f37065F;
    /* renamed from: G */
    public final long f37066G;
    /* renamed from: H */
    public int f37067H;
    /* renamed from: I */
    public final Bitmap f37068I;
    /* renamed from: J */
    public int f37069J;
    /* renamed from: K */
    public int f37070K;
    /* renamed from: L */
    public final Matrix f37071L = new Matrix();
    /* renamed from: M */
    public final Paint f37072M = new Paint();
    /* renamed from: N */
    public float f37073N;
    /* renamed from: O */
    public float f37074O;
    /* renamed from: P */
    public float f37075P;
    /* renamed from: Q */
    public float f37076Q;

    public AnonymousClass31Q(Bitmap bitmap, long j) {
        this.f37068I = bitmap;
        this.f37066G = j;
    }

    /* renamed from: A */
    public final boolean m18231A(long j) {
        if (j > this.f37066G) {
            return false;
        }
        float f = (float) j;
        this.f37064E = (((float) this.f37069J) + (this.f37075P * f)) + ((this.f37061B * f) * f);
        this.f37065F = (((float) this.f37070K) + (this.f37076Q * f)) + ((this.f37062C * f) * f);
        if (this.f37067H > 0) {
            long j2 = this.f37066G;
            int i = this.f37067H;
            if (j < j2 - ((long) i)) {
                this.f37063D = 255;
            } else if (j > j2) {
                this.f37063D = 0;
            } else {
                this.f37063D = (int) (((((float) (j2 - j)) * 1.0f) / ((float) i)) * 255.0f);
            }
        }
        return true;
    }
}
