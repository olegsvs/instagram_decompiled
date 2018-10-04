package X;

import android.view.View;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Av */
public final class AnonymousClass6Av {
    /* renamed from: K */
    public static final long f72631K = TimeUnit.SECONDS.toMillis(15);
    /* renamed from: B */
    public float f72632B;
    /* renamed from: C */
    public final AnonymousClass6BV f72633C;
    /* renamed from: D */
    public final AnonymousClass6Gv f72634D = new AnonymousClass6Gv(this);
    /* renamed from: E */
    public final AnonymousClass6Gu f72635E = new AnonymousClass6Gu(this);
    /* renamed from: F */
    public final AnonymousClass6AZ f72636F;
    /* renamed from: G */
    public AnonymousClass6Gz f72637G;
    /* renamed from: H */
    public boolean f72638H;
    /* renamed from: I */
    public final int f72639I;
    /* renamed from: J */
    public final int f72640J;

    public AnonymousClass6Av(AnonymousClass6AZ anonymousClass6AZ, AnonymousClass6BV anonymousClass6BV, int i, int i2) {
        this.f72636F = anonymousClass6AZ;
        this.f72633C = anonymousClass6BV;
        this.f72640J = i;
        this.f72639I = i2;
    }

    /* renamed from: A */
    public final void m29298A() {
        this.f72638H = false;
        this.f72633C.f72759H = null;
        AnonymousClass6BV anonymousClass6BV = this.f72633C;
        if (anonymousClass6BV.f72758G.B()) {
            View view = AnonymousClass6BV.m29327B(anonymousClass6BV).f72746E;
            view.setOnTouchListener(null);
            view.animate().alpha(0.0f).setListener(new AnonymousClass6BN(anonymousClass6BV, view)).start();
        }
    }
}
