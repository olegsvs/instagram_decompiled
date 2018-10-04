package com.instagram.common.ui.widget.imageview;

import X.AnonymousClass0Gs;
import X.AnonymousClass0RJ;
import X.AnonymousClass0RL;
import X.AnonymousClass0aa;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eS;
import X.AnonymousClass26A;
import X.AnonymousClass26B;
import X.AnonymousClass26C;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.List;

public class FadingCarouselImageView extends View implements AnonymousClass0RL {
    /* renamed from: B */
    public Bitmap f25951B;
    /* renamed from: C */
    public final Rect f25952C;
    /* renamed from: D */
    public int f25953D;
    /* renamed from: E */
    public final ValueAnimator f25954E;
    /* renamed from: F */
    public Bitmap f25955F;
    /* renamed from: G */
    public final Rect f25956G;
    /* renamed from: H */
    public List f25957H;
    /* renamed from: I */
    private final Paint f25958I;
    /* renamed from: J */
    private boolean f25959J;
    /* renamed from: K */
    private final Rect f25960K;
    /* renamed from: L */
    private final long f25961L;
    /* renamed from: M */
    private final Handler f25962M;
    /* renamed from: N */
    private long f25963N;
    /* renamed from: O */
    private final long f25964O;
    /* renamed from: P */
    private String f25965P;

    public final void Ao(AnonymousClass0aa anonymousClass0aa) {
    }

    public final void Bo(AnonymousClass0aa anonymousClass0aa, int i) {
    }

    public FadingCarouselImageView(Context context) {
        this(context, null);
    }

    public FadingCarouselImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FadingCarouselImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25958I = new Paint();
        this.f25952C = new Rect();
        this.f25956G = new Rect();
        this.f25960K = new Rect();
        this.f25962M = new AnonymousClass26A(this, Looper.getMainLooper());
        if (attributeSet == null) {
            this.f25961L = 800;
            this.f25964O = 3000;
        } else {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.FadingCarouselImageView);
            this.f25961L = (long) obtainStyledAttributes.getInt(0, 800);
            this.f25964O = (long) obtainStyledAttributes.getInt(1, 3000);
            obtainStyledAttributes.recycle();
        }
        AnimatorUpdateListener anonymousClass26B = new AnonymousClass26B(this);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 255});
        this.f25954E = ofInt;
        ofInt.setInterpolator(new LinearInterpolator());
        this.f25954E.setDuration(this.f25961L);
        this.f25954E.addUpdateListener(anonymousClass26B);
        this.f25954E.addListener(new AnonymousClass26C(this));
    }

    /* renamed from: A */
    public final void m14425A() {
        if (this.f25959J) {
            this.f25962M.removeMessages(0);
            this.f25954E.cancel();
            this.f25951B = null;
            this.f25952C.setEmpty();
            this.f25955F = null;
            this.f25956G.setEmpty();
            this.f25959J = false;
        }
    }

    /* renamed from: B */
    public static void m14422B(FadingCarouselImageView fadingCarouselImageView) {
        fadingCarouselImageView.f25963N = SystemClock.elapsedRealtime();
        AnonymousClass0RJ D = AnonymousClass0Gs.f2431j.D((String) fadingCarouselImageView.f25957H.get(fadingCarouselImageView.f25953D));
        D.f4635F = false;
        D = D.C(fadingCarouselImageView);
        String str = fadingCarouselImageView.f25965P;
        if (str != null) {
            D.f4645P = str;
        }
        D.B();
    }

    /* renamed from: C */
    public static void m14423C(FadingCarouselImageView fadingCarouselImageView) {
        if (fadingCarouselImageView.f25957H.size() > 1) {
            fadingCarouselImageView.f25953D = (fadingCarouselImageView.f25953D + 1) % fadingCarouselImageView.f25957H.size();
            m14422B(fadingCarouselImageView);
        }
    }

    /* renamed from: D */
    private void m14424D() {
        if (!this.f25959J && this.f25957H != null) {
            m14422B(this);
            this.f25959J = true;
        }
    }

    public final void Se(AnonymousClass0aa anonymousClass0aa, Bitmap bitmap) {
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        if (this.f25951B == null) {
            this.f25951B = bitmap;
            this.f25952C.set(0, 0, min, min);
            invalidate();
            m14423C(this);
            return;
        }
        this.f25955F = bitmap;
        this.f25956G.set(0, 0, min, min);
        this.f25962M.sendEmptyMessageDelayed(0, Math.max(this.f25964O - (SystemClock.elapsedRealtime() - this.f25963N), 0));
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, -1958737560);
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            m14424D();
        }
        AnonymousClass0cQ.O(this, 967631230, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, 977835869);
        super.onDetachedFromWindow();
        m14425A();
        AnonymousClass0cQ.O(this, 1633164979, N);
    }

    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f25951B;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.f25952C, this.f25960K, null);
            if (this.f25955F != null && this.f25954E.isRunning()) {
                this.f25958I.setAlpha(((Integer) this.f25954E.getAnimatedValue()).intValue());
                canvas.drawBitmap(this.f25955F, this.f25956G, this.f25960K, this.f25958I);
            }
        }
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (getVisibility() == 0) {
            m14424D();
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, 970133573);
        this.f25960K.set(0, 0, getWidth(), getHeight());
        AnonymousClass0cQ.O(this, -2057872570, N);
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m14425A();
    }

    public void setSource(String str) {
        this.f25965P = str;
    }

    public void setUrls(List list) {
        m14425A();
        this.f25957H = list;
        this.f25953D = 0;
        m14424D();
    }
}
