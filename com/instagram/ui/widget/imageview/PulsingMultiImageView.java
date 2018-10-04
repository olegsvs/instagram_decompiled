package com.instagram.ui.widget.imageview;

import X.AnonymousClass0cQ;
import X.AnonymousClass0eS;
import X.AnonymousClass0z0;
import X.AnonymousClass1JQ;
import X.AnonymousClass1JR;
import X.AnonymousClass1JS;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import java.util.ArrayList;
import java.util.List;

public class PulsingMultiImageView extends CircularImageView implements AnonymousClass0z0 {
    /* renamed from: B */
    public boolean f17061B;
    /* renamed from: C */
    public int f17062C;
    /* renamed from: D */
    public final Handler f17063D;
    /* renamed from: E */
    public Drawable f17064E;
    /* renamed from: F */
    public Matrix f17065F;
    /* renamed from: G */
    public final ValueAnimator f17066G;
    /* renamed from: H */
    public final ValueAnimator f17067H;
    /* renamed from: I */
    public List f17068I;
    /* renamed from: J */
    private final boolean f17069J;
    /* renamed from: K */
    private long f17070K;

    public final void dl() {
    }

    public PulsingMultiImageView(Context context) {
        this(context, null);
    }

    public PulsingMultiImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PulsingMultiImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17063D = new AnonymousClass1JQ(this, Looper.getMainLooper());
        setOnLoadListener(this);
        AnimatorUpdateListener anonymousClass1JR = new AnonymousClass1JR(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.PulsingMultiImageView);
        this.f17069J = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.f17067H = ofFloat;
        ofFloat.setDuration(400);
        this.f17067H.addUpdateListener(anonymousClass1JR);
        this.f17067H.addListener(new AnonymousClass1JS(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.95f});
        this.f17066G = ofFloat2;
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        this.f17066G.setDuration(400);
        this.f17066G.setRepeatCount(-1);
        this.f17066G.setRepeatMode(2);
        this.f17066G.addUpdateListener(anonymousClass1JR);
    }

    /* renamed from: C */
    public static void m10695C(PulsingMultiImageView pulsingMultiImageView) {
        pulsingMultiImageView.f17070K = SystemClock.elapsedRealtime();
        pulsingMultiImageView.m1962C((String) pulsingMultiImageView.f17068I.get(pulsingMultiImageView.f17062C), false);
    }

    /* renamed from: D */
    public static void m10696D(PulsingMultiImageView pulsingMultiImageView) {
        if (pulsingMultiImageView.f17068I.size() > 1) {
            pulsingMultiImageView.f17064E = pulsingMultiImageView.getDrawable();
            pulsingMultiImageView.f17065F = new Matrix(pulsingMultiImageView.getImageMatrix());
            pulsingMultiImageView.f17062C = (pulsingMultiImageView.f17062C + 1) % pulsingMultiImageView.f17068I.size();
            m10695C(pulsingMultiImageView);
        }
    }

    /* renamed from: E */
    private void m10697E() {
        if (!this.f17061B && this.f17068I != null) {
            this.f17061B = true;
            m10695C(this);
        }
    }

    /* renamed from: I */
    public final void m10698I() {
        if (this.f17061B) {
            this.f17061B = false;
            this.f17063D.removeMessages(0);
            this.f17063D.removeMessages(1);
            this.f17066G.cancel();
            this.f17067H.cancel();
            this.f17064E = null;
            this.f17065F = null;
        }
    }

    public final void kp(Bitmap bitmap) {
        if (!this.f17061B) {
            return;
        }
        if (this.f17064E == null) {
            if (!this.f17069J || this.f17068I.size() <= 1 || this.f17067H.isStarted()) {
                m10696D(this);
            } else {
                this.f17063D.sendEmptyMessage(1);
            }
            this.f17066G.start();
            return;
        }
        this.f17063D.sendEmptyMessageDelayed(0, Math.max(3000 - (SystemClock.elapsedRealtime() - this.f17070K), 0));
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.m5864N(this, -25695805);
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            m10697E();
        }
        AnonymousClass0cQ.m5865O(this, -1118463951, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.m5864N(this, 1739088936);
        super.onDetachedFromWindow();
        m10698I();
        AnonymousClass0cQ.m5865O(this, 1963775678, N);
    }

    public final void onDraw(Canvas canvas) {
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        float floatValue;
        if (this.f17064E != null) {
            canvas.save();
            if (this.f17067H.isStarted()) {
                floatValue = ((Float) this.f17067H.getAnimatedValue()).floatValue();
            } else {
                floatValue = ((Float) this.f17066G.getAnimatedValue()).floatValue();
            }
            canvas.scale(floatValue, floatValue, width, height);
            canvas.concat(this.f17065F);
            this.f17064E.draw(canvas);
            canvas.restore();
        } else if (this.f17067H.isStarted()) {
            floatValue = ((Float) this.f17067H.getAnimatedValue()).floatValue();
            canvas.save();
            canvas.scale(floatValue, floatValue, width, height);
            super.onDraw(canvas);
            canvas.restore();
        } else if (this.f17066G.isStarted()) {
            floatValue = ((Float) this.f17066G.getAnimatedValue()).floatValue();
            canvas.save();
            canvas.scale(floatValue, floatValue, width, height);
            super.onDraw(canvas);
            canvas.restore();
        }
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (getVisibility() == 0) {
            m10697E();
        }
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m10698I();
    }

    public void setAnimatingImageUrl(String str) {
        List arrayList = new ArrayList();
        arrayList.add(str);
        setAnimatingImageUrls(arrayList);
    }

    public void setAnimatingImageUrls(List list) {
        m10698I();
        this.f17068I = list;
        this.f17062C = 0;
        m10697E();
    }

    public void setPulseDurationMs(long j) {
        this.f17066G.setDuration(j / 2);
    }
}
