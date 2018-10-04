package X;

import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.util.Log;
import com.facebook.forker.Process;

/* renamed from: X.2xr */
public final class AnonymousClass2xr {
    /* renamed from: B */
    public long f36400B;
    /* renamed from: C */
    public float f36401C;
    /* renamed from: D */
    public int f36402D;
    /* renamed from: E */
    public int f36403E;
    /* renamed from: F */
    public float f36404F;
    /* renamed from: G */
    public int f36405G;
    /* renamed from: H */
    public long f36406H;
    /* renamed from: I */
    public SpannableStringBuilder f36407I;
    /* renamed from: J */
    public Alignment f36408J;
    /* renamed from: K */
    public float f36409K;

    public AnonymousClass2xr() {
        m17979B();
    }

    /* renamed from: A */
    public final AnonymousClass3wP m17978A() {
        if (this.f36404F != Float.MIN_VALUE && this.f36405G == Process.WAIT_RESULT_TIMEOUT) {
            if (this.f36408J != null) {
                switch (AnonymousClass2xq.f36399B[this.f36408J.ordinal()]) {
                    case 1:
                        this.f36405G = 0;
                        break;
                    case 2:
                        this.f36405G = 1;
                        break;
                    case 3:
                        this.f36405G = 2;
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unrecognized alignment: ");
                        stringBuilder.append(this.f36408J);
                        Log.w("WebvttCueBuilder", stringBuilder.toString());
                        this.f36405G = 0;
                        break;
                }
            }
            this.f36405G = Process.WAIT_RESULT_TIMEOUT;
        }
        return new AnonymousClass3wP(this.f36406H, this.f36400B, this.f36407I, this.f36408J, this.f36401C, this.f36403E, this.f36402D, this.f36404F, this.f36405G, this.f36409K);
    }

    /* renamed from: B */
    public final void m17979B() {
        this.f36406H = 0;
        this.f36400B = 0;
        this.f36407I = null;
        this.f36408J = null;
        this.f36401C = Float.MIN_VALUE;
        this.f36403E = Process.WAIT_RESULT_TIMEOUT;
        this.f36402D = Process.WAIT_RESULT_TIMEOUT;
        this.f36404F = Float.MIN_VALUE;
        this.f36405G = Process.WAIT_RESULT_TIMEOUT;
        this.f36409K = Float.MIN_VALUE;
    }
}
