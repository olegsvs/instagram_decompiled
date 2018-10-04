package X;

import android.view.View;
import com.facebook.C0164R;

/* renamed from: X.0vU */
public final class AnonymousClass0vU {
    /* renamed from: B */
    public int f12081B;
    /* renamed from: C */
    public float f12082C;
    /* renamed from: D */
    public int f12083D;
    /* renamed from: E */
    public float f12084E;
    /* renamed from: F */
    public int f12085F;
    /* renamed from: G */
    private final int f12086G;
    /* renamed from: H */
    private final int f12087H;
    /* renamed from: I */
    private final int f12088I;
    /* renamed from: J */
    private final int f12089J;

    public AnonymousClass0vU(View view) {
        this.f12088I = view.getResources().getDimensionPixelSize(C0164R.dimen.video_scrubber_touch_margin);
        this.f12087H = view.getResources().getDimensionPixelSize(C0164R.dimen.video_scrubber_min_scrub_range);
        this.f12086G = view.getResources().getDimensionPixelSize(C0164R.dimen.video_scrubber_max_scrub_range);
        this.f12089J = view.getWidth();
    }

    /* renamed from: A */
    public final int m8339A(float f) {
        f = (f - this.f12084E) / this.f12082C;
        int i = this.f12085F;
        int i2 = (int) (f * ((float) i));
        if (i2 < 0) {
            return Math.max(0, this.f12081B + i2);
        }
        return Math.min(i, this.f12081B + i2);
    }

    /* renamed from: B */
    public static float m8338B(AnonymousClass0vU anonymousClass0vU) {
        int i = anonymousClass0vU.f12085F;
        if (i == 0) {
            return (float) anonymousClass0vU.f12089J;
        }
        float f = (float) (anonymousClass0vU.f12083D / i);
        float f2 = anonymousClass0vU.f12084E;
        int i2 = anonymousClass0vU.f12088I;
        return Math.min(Math.max(Math.min((f2 - ((float) i2)) / f, ((((float) anonymousClass0vU.f12089J) - f2) - ((float) i2)) / (1.0f - f)), (float) anonymousClass0vU.f12087H), (float) anonymousClass0vU.f12086G);
    }
}
