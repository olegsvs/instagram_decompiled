package com.instagram.ui.widget.countdowntimer;

import X.AnonymousClass5Jc;
import X.AnonymousClass5Ss;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

public class CountdownTimerView extends FrameLayout {
    /* renamed from: B */
    public AnonymousClass5Ss f62002B;
    /* renamed from: C */
    public AnonymousClass5Jc f62003C;
    /* renamed from: D */
    public GradientSpinner f62004D;
    /* renamed from: E */
    public int f62005E;
    /* renamed from: F */
    public TextView f62006F;
    /* renamed from: G */
    public AlphaAnimation f62007G;
    /* renamed from: H */
    public boolean f62008H;

    public CountdownTimerView(Context context) {
        this(context, null);
    }

    public CountdownTimerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CountdownTimerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f62005E = 3;
        LayoutInflater.from(getContext()).inflate(C0164R.layout.layout_countdown_timer, this);
        this.f62004D = (GradientSpinner) findViewById(C0164R.id.countdown_timer_spinner);
        this.f62006F = (TextView) findViewById(C0164R.id.countdown_timer_title_text);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.5f);
        this.f62007G = alphaAnimation;
        alphaAnimation.setDuration(1000);
        this.f62007G.setRepeatCount(-1);
        this.f62007G.setRepeatMode(2);
    }

    public void setCallback(AnonymousClass5Ss anonymousClass5Ss) {
        this.f62002B = anonymousClass5Ss;
    }

    public void setNumTicks(int i) {
        this.f62005E = i;
    }
}
