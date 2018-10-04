package com.instagram.ui.widget.imageview;

import X.AnonymousClass0cQ;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

public class BlinkingImageView extends ImageView implements AnimatorUpdateListener {
    /* renamed from: B */
    private final ValueAnimator f29311B;
    /* renamed from: C */
    private boolean f29312C;
    /* renamed from: D */
    private float f29313D;
    /* renamed from: E */
    private float f29314E;

    public BlinkingImageView(Context context) {
        this(context, null);
    }

    public BlinkingImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BlinkingImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29314E = 0.2f;
        this.f29313D = 1.0f;
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{this.f29313D, this.f29314E}).setDuration(800);
        this.f29311B = duration;
        duration.addUpdateListener(this);
        this.f29311B.setRepeatMode(2);
        this.f29311B.setRepeatCount(-1);
        this.f29311B.setInterpolator(new LinearInterpolator());
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        setImageAlpha(Math.round(((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, 1087184377);
        super.onAttachedToWindow();
        if (this.f29312C && !this.f29311B.isStarted()) {
            this.f29311B.start();
        }
        AnonymousClass0cQ.O(this, 355755839, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, 1067989183);
        this.f29311B.cancel();
        super.onDetachedFromWindow();
        AnonymousClass0cQ.O(this, -1428712358, N);
    }

    public void setBlinking(boolean z) {
        this.f29312C = z;
        if (!z) {
            this.f29311B.cancel();
            setImageAlpha(255);
        } else if (!this.f29311B.isStarted()) {
            this.f29311B.start();
        }
    }
}
