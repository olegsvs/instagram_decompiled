package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.facebook.C0164R;

/* renamed from: X.5BN */
public final class AnonymousClass5BN extends Drawable implements OnGestureListener, OnTouchListener {
    /* renamed from: B */
    public final Context f60936B;
    /* renamed from: C */
    private final TimeInterpolator f60937C = new AccelerateDecelerateInterpolator();
    /* renamed from: D */
    private final Drawable f60938D;
    /* renamed from: E */
    private int f60939E;
    /* renamed from: F */
    private long f60940F = -1;
    /* renamed from: G */
    private final boolean f60941G;
    /* renamed from: H */
    private final Drawable f60942H;
    /* renamed from: I */
    private int f60943I;
    /* renamed from: J */
    private long f60944J = -1;
    /* renamed from: K */
    private final boolean f60945K;
    /* renamed from: L */
    private final GestureDetector f60946L;
    /* renamed from: M */
    private final AnonymousClass5Tf f60947M;
    /* renamed from: N */
    private final int f60948N;

    public final int getOpacity() {
        return -3;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public AnonymousClass5BN(Context context, boolean z, boolean z2, AnonymousClass5Tf anonymousClass5Tf) {
        this.f60936B = context;
        this.f60938D = AnonymousClass0Ca.E(context, C0164R.drawable.reel_viewer_shadow_left).mutate();
        this.f60942H = AnonymousClass0Ca.E(context, C0164R.drawable.reel_viewer_shadow_right).mutate();
        this.f60948N = context.getResources().getDimensionPixelSize(C0164R.dimen.reel_navigation_shadow_affordance_width);
        this.f60941G = z;
        this.f60945K = z2;
        this.f60947M = anonymousClass5Tf;
        this.f60946L = new GestureDetector(context, this);
    }

    /* renamed from: A */
    public final void m25939A() {
        if (this.f60939E > 0 && this.f60940F == -1) {
            this.f60940F = SystemClock.elapsedRealtime();
            invalidateSelf();
        }
        if (this.f60943I > 0 && this.f60944J == -1) {
            this.f60944J = SystemClock.elapsedRealtime();
            invalidateSelf();
        }
    }

    /* renamed from: B */
    private float m25937B() {
        return ((float) getBounds().width()) * 0.1f;
    }

    /* renamed from: C */
    private float m25938C() {
        float width = (float) getBounds().width();
        return width - (0.1f * width);
    }

    public final void draw(Canvas canvas) {
        if (this.f60941G) {
            if (this.f60940F != -1) {
                int round;
                round = Math.round((1.0f - Math.min(Math.max(this.f60937C.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f60940F)) / 200.0f)), 0.0f), 1.0f)) * 255.0f);
                this.f60939E = round;
                if (round > 0) {
                    invalidateSelf();
                } else {
                    this.f60940F = -1;
                }
            }
            this.f60938D.setAlpha(this.f60939E);
            this.f60938D.draw(canvas);
        }
        if (this.f60945K) {
            if (this.f60944J != -1) {
                round = Math.round((1.0f - Math.min(Math.max(this.f60937C.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.f60944J)) / 200.0f)), 0.0f), 1.0f)) * 255.0f);
                this.f60943I = round;
                if (round > 0) {
                    invalidateSelf();
                } else {
                    this.f60944J = -1;
                }
            }
            this.f60942H.setAlpha(this.f60943I);
            this.f60942H.draw(canvas);
        }
    }

    public final void onBoundsChange(Rect rect) {
        this.f60938D.setBounds(rect.left, rect.top, rect.left + this.f60948N, rect.bottom);
        this.f60942H.setBounds(rect.right - this.f60948N, rect.top, rect.right, rect.bottom);
    }

    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent.getX() > m25937B()) {
            if (motionEvent.getX() < m25938C()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onSingleTapUp(android.view.MotionEvent r5) {
        /*
        r4 = this;
        r1 = r5.getX();
        r0 = r4.m25937B();
        r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1));
        r3 = 1;
        r2 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r0 > 0) goto L_0x0028;
    L_0x000f:
        r4.f60939E = r2;
        r4.invalidateSelf();
        r0 = r4.f60936B;
        r0 = X.AnonymousClass0e8.D(r0);
        if (r0 == 0) goto L_0x0022;
    L_0x001c:
        r0 = r4.f60947M;
        r0.m26933C();
        goto L_0x0027;
    L_0x0022:
        r0 = r4.f60947M;
        r0.m26932B();
    L_0x0027:
        return r3;
    L_0x0028:
        r1 = r5.getX();
        r0 = r4.m25938C();
        r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x0042;
    L_0x0034:
        r4.f60943I = r2;
        r4.invalidateSelf();
        r0 = r4.f60936B;
        r0 = X.AnonymousClass0e8.D(r0);
        if (r0 == 0) goto L_0x001c;
    L_0x0041:
        goto L_0x0022;
    L_0x0042:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5BN.onSingleTapUp(android.view.MotionEvent):boolean");
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean onTouchEvent = this.f60946L.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            m25939A();
        }
        return onTouchEvent;
    }

    public final void setAlpha(int i) {
        this.f60938D.setAlpha(i);
        this.f60942H.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f60938D.setColorFilter(colorFilter);
        this.f60942H.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
