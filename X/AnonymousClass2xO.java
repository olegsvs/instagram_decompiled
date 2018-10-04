package X;

import android.graphics.Bitmap;
import android.text.Layout.Alignment;
import com.facebook.forker.Process;

/* renamed from: X.2xO */
public class AnonymousClass2xO {
    /* renamed from: B */
    public final float f36232B;
    /* renamed from: C */
    public final float f36233C;
    /* renamed from: D */
    public final CharSequence f36234D;

    public AnonymousClass2xO(Bitmap bitmap, float f, int i, float f2, int i2, float f3, float f4) {
        this(null, null, bitmap, f2, 0, i2, f, i, Process.WAIT_RESULT_TIMEOUT, Float.MIN_VALUE, f3, f4, false, -16777216);
    }

    public AnonymousClass2xO(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, Process.WAIT_RESULT_TIMEOUT, Process.WAIT_RESULT_TIMEOUT, Float.MIN_VALUE, Process.WAIT_RESULT_TIMEOUT, Float.MIN_VALUE);
    }

    public AnonymousClass2xO(CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        this(charSequence, alignment, f, i, i2, f2, i3, f3, false, -16777216);
    }

    public AnonymousClass2xO(CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, int i4, float f4) {
        this(charSequence, alignment, null, f, i, i2, f2, i3, i4, f4, f3, Float.MIN_VALUE, false, -16777216);
    }

    public AnonymousClass2xO(CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4) {
        this(charSequence, alignment, null, f, i, i2, f2, i3, Process.WAIT_RESULT_TIMEOUT, Float.MIN_VALUE, f3, Float.MIN_VALUE, z, i4);
    }

    private AnonymousClass2xO(CharSequence charSequence, Alignment alignment, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5) {
        this.f36234D = charSequence;
        this.f36232B = f;
        this.f36233C = f2;
    }
}
