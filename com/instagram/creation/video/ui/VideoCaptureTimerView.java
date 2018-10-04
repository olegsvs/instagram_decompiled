package com.instagram.creation.video.ui;

import X.AnonymousClass0Ca;
import X.AnonymousClass0dw;
import X.AnonymousClass27C;
import X.AnonymousClass27D;
import X.AnonymousClass3Hi;
import X.AnonymousClass3pF;
import X.AnonymousClass3pG;
import X.AnonymousClass3zj;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;

public class VideoCaptureTimerView extends FrameLayout implements AnonymousClass3Hi {
    /* renamed from: B */
    public Animation f48134B;
    /* renamed from: C */
    public ImageView f48135C;
    /* renamed from: D */
    public TextView f48136D;
    /* renamed from: E */
    private AnonymousClass3zj f48137E;

    public final void ax() {
    }

    public final void ig(AnonymousClass3pG anonymousClass3pG) {
    }

    public final void mg(AnonymousClass3pG anonymousClass3pG) {
    }

    public final void ng() {
    }

    public VideoCaptureTimerView(Context context) {
        this(context, null);
    }

    public VideoCaptureTimerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoCaptureTimerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), C0164R.layout.video_capture_timer_view, this);
        this.f48135C = (ImageView) findViewById(C0164R.id.video_capture_blinker);
        this.f48136D = (TextView) findViewById(C0164R.id.video_capture_timer);
        AnonymousClass27C B = AnonymousClass27D.m14489B(getContext());
        if (B == AnonymousClass27C.SMALL || B == AnonymousClass27C.SMALL_CONDENSED) {
            this.f48136D.setTextColor(AnonymousClass0Ca.C(getContext(), C0164R.color.white));
        }
        this.f48134B = AnimationUtils.loadAnimation(getContext(), C0164R.anim.recording_blinker);
    }

    /* renamed from: B */
    private void m21964B() {
        this.f48136D.setText(AnonymousClass0dw.E((long) this.f48137E.m21888E()));
    }

    public final void jg(AnonymousClass3pG anonymousClass3pG, AnonymousClass3pF anonymousClass3pF) {
        if (anonymousClass3pF == AnonymousClass3pF.RECORDING) {
            m21964B();
            setVisibility(0);
            this.f48135C.startAnimation(this.f48134B);
            return;
        }
        setVisibility(4);
        this.f48135C.clearAnimation();
    }

    public final void kg(AnonymousClass3pG anonymousClass3pG) {
        m21964B();
    }

    public void setClipStackManager(AnonymousClass3zj anonymousClass3zj) {
        this.f48137E = anonymousClass3zj;
        m21964B();
    }
}
