package com.instagram.ui.widget.pulsingbutton;

import X.AnonymousClass0TJ;
import X.AnonymousClass26P;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.C0164R;

public class PulsingButton extends FrameLayout {
    /* renamed from: B */
    private final AnimatorSet f29415B;
    /* renamed from: C */
    private final ImageView f29416C;
    /* renamed from: D */
    private final ImageView f29417D;
    /* renamed from: E */
    private final ImageView f29418E;

    public PulsingButton(Context context) {
        this(context, null);
    }

    public PulsingButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PulsingButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(getContext()).inflate(C0164R.layout.pulsing_image_view, this, true);
        this.f29418E = (ImageView) inflate.findViewById(C0164R.id.pulse_circle_outer);
        this.f29417D = (ImageView) inflate.findViewById(C0164R.id.pulse_circle_inner);
        this.f29416C = (ImageView) inflate.findViewById(C0164R.id.pulse_icon);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f29415B = animatorSet;
        animatorSet.playTogether(new Animator[]{AnonymousClass26P.m14435B(this.f29418E), AnonymousClass26P.m14435B(this.f29417D)});
    }

    /* renamed from: A */
    public final void m15173A(int i, int i2) {
        Drawable H = AnonymousClass0TJ.H(getContext(), C0164R.drawable.pulse_circle_inner, i, i2);
        Drawable H2 = AnonymousClass0TJ.H(getContext(), C0164R.drawable.pulse_circle_outer, i, i2);
        this.f29417D.setImageDrawable(H);
        this.f29418E.setImageDrawable(H2);
    }

    public void setButtonResource(int i) {
        this.f29416C.setImageResource(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f29416C.setColorFilter(colorFilter);
    }

    public void setPulsingEnabled(boolean z) {
        if (z && !this.f29415B.isStarted()) {
            this.f29418E.setVisibility(0);
            this.f29417D.setVisibility(0);
            this.f29415B.start();
        } else if (!z) {
            this.f29418E.setVisibility(8);
            this.f29417D.setVisibility(8);
            if (this.f29415B.isStarted()) {
                this.f29415B.end();
            }
        }
    }
}
