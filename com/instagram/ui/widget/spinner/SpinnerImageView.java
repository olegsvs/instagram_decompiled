package com.instagram.ui.widget.spinner;

import X.AnonymousClass0cQ;
import X.AnonymousClass2M1;
import X.AnonymousClass2M2;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView.ScaleType;
import com.facebook.C0164R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

public class SpinnerImageView extends ColorFilterAlphaImageView {
    /* renamed from: B */
    private boolean f7723B;
    /* renamed from: C */
    private ObjectAnimator f7724C;
    /* renamed from: D */
    private boolean f7725D = true;

    public SpinnerImageView(Context context) {
        super(context);
        m6310D();
    }

    public SpinnerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6310D();
    }

    public SpinnerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6310D();
    }

    /* renamed from: D */
    private void m6310D() {
        setScaleType(ScaleType.CENTER);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "rotation", new float[]{0.0f, 360.0f}).setDuration(850);
        this.f7724C = duration;
        duration.setRepeatMode(1);
        this.f7724C.setRepeatCount(-1);
        this.f7724C.setInterpolator(new LinearInterpolator());
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.m5864N(this, -529678929);
        super.onAttachedToWindow();
        if (isShown() && this.f7725D) {
            this.f7724C.start();
        }
        AnonymousClass0cQ.m5865O(this, 249481618, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.m5864N(this, -2004292350);
        this.f7723B = false;
        this.f7724C.cancel();
        super.onDetachedFromWindow();
        AnonymousClass0cQ.m5865O(this, -2075401652, N);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f7723B && this.f7725D) {
            this.f7724C.start();
            this.f7723B = false;
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (getWindowToken() == null) {
            return;
        }
        if (i != 0 || getVisibility() != 0 || !this.f7725D) {
            this.f7724C.cancel();
            this.f7723B = false;
        } else if (getAnimation() != null) {
        } else {
            if (getMeasuredWidth() != 0) {
                this.f7724C.start();
            } else {
                this.f7723B = true;
            }
        }
    }

    public void setLoadingStatus(AnonymousClass2M2 anonymousClass2M2) {
        switch (AnonymousClass2M1.f29479B[anonymousClass2M2.ordinal()]) {
            case 1:
                this.f7725D = true;
                this.f7724C.start();
                setBackgroundResource(C0164R.drawable.spinner_large);
                setVisibility(0);
                return;
            case 2:
                this.f7725D = false;
                this.f7724C.end();
                setBackgroundResource(C0164R.drawable.loadmore_icon_refresh_compound);
                setVisibility(0);
                return;
            case 3:
                setVisibility(8);
                return;
            default:
                return;
        }
    }
}
