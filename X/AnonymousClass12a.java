package X;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import com.facebook.common.dextricks.StartupQEsConfig;

/* renamed from: X.12a */
public final class AnonymousClass12a extends AnonymousClass0rv implements AnonymousClass12b {
    /* renamed from: e */
    private static final int[] f13553e = new int[0];
    /* renamed from: f */
    private static final int[] f13554f = new int[]{16842919};
    /* renamed from: B */
    public int f13555B = 0;
    /* renamed from: C */
    public final Runnable f13556C = new AnonymousClass1o8(this);
    /* renamed from: D */
    public float f13557D;
    /* renamed from: E */
    public final int[] f13558E = new int[2];
    /* renamed from: F */
    public int f13559F;
    /* renamed from: G */
    public final StateListDrawable f13560G;
    /* renamed from: H */
    public final int f13561H;
    /* renamed from: I */
    public int f13562I;
    /* renamed from: J */
    public final Drawable f13563J;
    /* renamed from: K */
    public final int f13564K;
    /* renamed from: L */
    public final int f13565L;
    /* renamed from: M */
    public final AnonymousClass0Gv f13566M = new AnonymousClass1o9(this);
    /* renamed from: N */
    public RecyclerView f13567N;
    /* renamed from: O */
    public int f13568O = 0;
    /* renamed from: P */
    public int f13569P = 0;
    /* renamed from: Q */
    public final ValueAnimator f13570Q = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    /* renamed from: R */
    public float f13571R;
    /* renamed from: S */
    public final int[] f13572S = new int[2];
    /* renamed from: T */
    public int f13573T;
    /* renamed from: U */
    public final StateListDrawable f13574U;
    /* renamed from: V */
    public int f13575V;
    /* renamed from: W */
    public final int f13576W;
    /* renamed from: X */
    public final Drawable f13577X;
    /* renamed from: Y */
    public final int f13578Y;
    /* renamed from: Z */
    private int f13579Z = 0;
    /* renamed from: a */
    private boolean f13580a = false;
    /* renamed from: b */
    private boolean f13581b = false;
    /* renamed from: c */
    private final int f13582c;
    /* renamed from: d */
    private int f13583d = 0;

    public final void ww(boolean z) {
    }

    public AnonymousClass12a(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f13574U = stateListDrawable;
        this.f13577X = drawable;
        this.f13560G = stateListDrawable2;
        this.f13563J = drawable2;
        this.f13576W = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f13578Y = Math.max(i, drawable.getIntrinsicWidth());
        this.f13561H = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f13564K = Math.max(i, drawable2.getIntrinsicWidth());
        this.f13582c = i2;
        this.f13565L = i3;
        this.f13574U.setAlpha(255);
        this.f13577X.setAlpha(255);
        this.f13570Q.addListener(new AnonymousClass1oA(this));
        this.f13570Q.addUpdateListener(new AnonymousClass1oB(this));
        m8947D(recyclerView);
    }

    /* renamed from: B */
    public static boolean m8941B(AnonymousClass12a anonymousClass12a) {
        return AnonymousClass0mE.m7513C(anonymousClass12a.f13567N) == 1;
    }

    /* renamed from: C */
    public static void m8942C(AnonymousClass12a anonymousClass12a, int i) {
        if (i == 2 && anonymousClass12a.f13583d != 2) {
            anonymousClass12a.f13574U.setState(f13554f);
            anonymousClass12a.f13567N.removeCallbacks(anonymousClass12a.f13556C);
        }
        if (i == 0) {
            anonymousClass12a.f13567N.invalidate();
        } else {
            anonymousClass12a.m8950G();
        }
        if (anonymousClass12a.f13583d == 2 && i != 2) {
            anonymousClass12a.f13574U.setState(f13553e);
            anonymousClass12a.f13567N.removeCallbacks(anonymousClass12a.f13556C);
            anonymousClass12a.f13567N.postDelayed(anonymousClass12a.f13556C, (long) 1200);
        } else if (i == 1) {
            anonymousClass12a.f13567N.removeCallbacks(anonymousClass12a.f13556C);
            anonymousClass12a.f13567N.postDelayed(anonymousClass12a.f13556C, (long) StartupQEsConfig.DEFAULT_NON_CRITICAL_INEED_INIT_IDLE_DELAY);
        }
        anonymousClass12a.f13583d = i;
    }

    /* renamed from: C */
    public final void mo2056C(Canvas canvas, RecyclerView recyclerView, AnonymousClass0or anonymousClass0or) {
        if (this.f13569P == this.f13567N.getWidth()) {
            if (this.f13568O == this.f13567N.getHeight()) {
                if (this.f13555B != 0) {
                    int i;
                    int i2;
                    int i3;
                    if (this.f13581b) {
                        i = this.f13569P;
                        int i4 = this.f13576W;
                        i -= i4;
                        i2 = this.f13573T;
                        i3 = this.f13575V;
                        i2 -= i3 / 2;
                        this.f13574U.setBounds(0, 0, i4, i3);
                        this.f13577X.setBounds(0, 0, this.f13578Y, this.f13568O);
                        if (AnonymousClass12a.m8941B(this)) {
                            this.f13577X.draw(canvas);
                            canvas.translate((float) this.f13576W, (float) i2);
                            canvas.scale(-1.0f, 1.0f);
                            this.f13574U.draw(canvas);
                            canvas.scale(1.0f, 1.0f);
                            canvas.translate((float) (-this.f13576W), (float) (-i2));
                        } else {
                            canvas.translate((float) i, 0.0f);
                            this.f13577X.draw(canvas);
                            canvas.translate(0.0f, (float) i2);
                            this.f13574U.draw(canvas);
                            canvas.translate((float) (-i), (float) (-i2));
                        }
                    }
                    if (this.f13580a) {
                        int i5 = this.f13568O;
                        i2 = this.f13561H;
                        i5 -= i2;
                        i = this.f13559F;
                        i3 = this.f13562I;
                        i -= i3 / 2;
                        this.f13560G.setBounds(0, 0, i3, i2);
                        this.f13563J.setBounds(0, 0, this.f13569P, this.f13564K);
                        canvas.translate(0.0f, (float) i5);
                        this.f13563J.draw(canvas);
                        canvas.translate((float) i, 0.0f);
                        this.f13560G.draw(canvas);
                        canvas.translate((float) (-i), (float) (-i5));
                    }
                }
                return;
            }
        }
        this.f13569P = this.f13567N.getWidth();
        this.f13568O = this.f13567N.getHeight();
        AnonymousClass12a.m8942C(this, 0);
    }

    /* renamed from: D */
    private void m8943D(float f) {
        int[] iArr = this.f13558E;
        int i = this.f13565L;
        iArr[0] = i;
        iArr[1] = this.f13569P - i;
        float max = Math.max((float) iArr[0], Math.min((float) iArr[1], f));
        if (Math.abs(((float) this.f13559F) - max) >= 2.0f) {
            int E = AnonymousClass12a.m8944E(this.f13557D, max, iArr, this.f13567N.computeHorizontalScrollRange(), this.f13567N.computeHorizontalScrollOffset(), this.f13569P);
            if (E != 0) {
                this.f13567N.scrollBy(E, 0);
            }
            this.f13557D = max;
        }
    }

    /* renamed from: D */
    public final void m8947D(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f13567N;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                this.f13567N.m7002y(this);
                this.f13567N.AA(this);
                this.f13567N.BA(this.f13566M);
                this.f13567N.removeCallbacks(this.f13556C);
            }
            this.f13567N = recyclerView;
            if (recyclerView != null) {
                this.f13567N.m6955A(this);
                this.f13567N.m6957C(this);
                this.f13567N.m6958D(this.f13566M);
            }
        }
    }

    /* renamed from: E */
    private static int m8944E(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            i -= i3;
            int i5 = (int) (((f2 - f) / ((float) i4)) * ((float) i));
            i2 += i5;
            return (i2 >= i || i2 < 0) ? 0 : i5;
        }
    }

    /* renamed from: E */
    public final boolean m8948E(float f, float f2) {
        if (f2 >= ((float) (this.f13568O - this.f13561H))) {
            int i = this.f13559F;
            int i2 = this.f13562I;
            if (f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    private void m8945F(float f) {
        int[] iArr = this.f13572S;
        int i = this.f13565L;
        iArr[0] = i;
        iArr[1] = this.f13568O - i;
        float max = Math.max((float) iArr[0], Math.min((float) iArr[1], f));
        if (Math.abs(((float) this.f13573T) - max) >= 2.0f) {
            int E = AnonymousClass12a.m8944E(this.f13571R, max, iArr, this.f13567N.computeVerticalScrollRange(), this.f13567N.computeVerticalScrollOffset(), this.f13568O);
            if (E != 0) {
                this.f13567N.scrollBy(0, E);
            }
            this.f13571R = max;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: F */
    public final boolean m8949F(float r4, float r5) {
        /*
        r3 = this;
        r0 = X.AnonymousClass12a.m8941B(r3);
        if (r0 == 0) goto L_0x0010;
    L_0x0006:
        r0 = r3.f13576W;
        r0 = r0 / 2;
        r0 = (float) r0;
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r0 > 0) goto L_0x0031;
    L_0x000f:
        goto L_0x001a;
    L_0x0010:
        r1 = r3.f13569P;
        r0 = r3.f13576W;
        r1 = r1 - r0;
        r0 = (float) r1;
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x0031;
    L_0x001a:
        r2 = r3.f13573T;
        r1 = r3.f13575V;
        r0 = r1 / 2;
        r0 = r2 - r0;
        r0 = (float) r0;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x0031;
    L_0x0027:
        r0 = r1 / 2;
        r2 = r2 + r0;
        r0 = (float) r2;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 > 0) goto L_0x0031;
    L_0x002f:
        r0 = 1;
        goto L_0x0032;
    L_0x0031:
        r0 = 0;
    L_0x0032:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.12a.F(float, float):boolean");
    }

    /* renamed from: G */
    public final void m8950G() {
        int i = this.f13555B;
        if (i != 0) {
            if (i == 3) {
                this.f13570Q.cancel();
            } else {
                return;
            }
        }
        this.f13555B = 1;
        this.f13570Q.setFloatValues(new float[]{((Float) this.f13570Q.getAnimatedValue()).floatValue(), 1.0f});
        this.f13570Q.setDuration(500);
        this.f13570Q.setStartDelay(0);
        this.f13570Q.start();
    }

    /* renamed from: H */
    public final void m8951H(int i, int i2) {
        int computeVerticalScrollRange = this.f13567N.computeVerticalScrollRange();
        int i3 = this.f13568O;
        boolean z = computeVerticalScrollRange - i3 > 0 && i3 >= this.f13582c;
        this.f13581b = z;
        int computeHorizontalScrollRange = this.f13567N.computeHorizontalScrollRange();
        int i4 = this.f13569P;
        z = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f13582c;
        this.f13580a = z;
        if (this.f13581b || this.f13580a) {
            float f;
            if (this.f13581b) {
                f = (float) i3;
                this.f13573T = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f13575V = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f13580a) {
                f = (float) i4;
                this.f13559F = (int) ((f * (((float) i) + (f / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f13562I = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f13583d;
            if (i5 == 0 || i5 == 1) {
                AnonymousClass12a.m8942C(this, 1);
            }
        } else if (this.f13583d != 0) {
            AnonymousClass12a.m8942C(this, 0);
        }
    }

    public final boolean To(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f13583d;
        if (i == 1) {
            boolean F = m8949F(motionEvent.getX(), motionEvent.getY());
            boolean E = m8948E(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!F && !E) {
                return false;
            }
            if (E) {
                this.f13579Z = 1;
                this.f13557D = (float) ((int) motionEvent.getX());
            } else if (F) {
                this.f13579Z = 2;
                this.f13571R = (float) ((int) motionEvent.getY());
            }
            AnonymousClass12a.m8942C(this, 2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    public final void yDA(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f13583d != 0) {
            if (motionEvent.getAction() == 0) {
                boolean F = m8949F(motionEvent.getX(), motionEvent.getY());
                boolean E = m8948E(motionEvent.getX(), motionEvent.getY());
                if (F || E) {
                    if (E) {
                        this.f13579Z = 1;
                        this.f13557D = (float) ((int) motionEvent.getX());
                    } else if (F) {
                        this.f13579Z = 2;
                        this.f13571R = (float) ((int) motionEvent.getY());
                    }
                    AnonymousClass12a.m8942C(this, 2);
                }
            } else if (motionEvent.getAction() == 1 && this.f13583d == 2) {
                this.f13571R = 0.0f;
                this.f13557D = 0.0f;
                AnonymousClass12a.m8942C(this, 1);
                this.f13579Z = 0;
            } else if (motionEvent.getAction() == 2 && this.f13583d == 2) {
                m8950G();
                if (this.f13579Z == 1) {
                    m8943D(motionEvent.getX());
                }
                if (this.f13579Z == 2) {
                    m8945F(motionEvent.getY());
                }
            }
        }
    }
}
