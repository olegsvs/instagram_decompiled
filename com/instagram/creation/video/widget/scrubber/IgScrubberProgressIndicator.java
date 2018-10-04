package com.instagram.creation.video.widget.scrubber;

import X.AnonymousClass0cQ;
import X.AnonymousClass3Ij;
import X.AnonymousClass3Ik;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.framelayout.MediaFrameLayout;

public class IgScrubberProgressIndicator extends MediaFrameLayout {
    /* renamed from: B */
    public AnimatorSet f39968B;
    /* renamed from: C */
    public final Runnable f39969C;
    /* renamed from: D */
    public boolean f39970D;
    /* renamed from: E */
    private boolean f39971E;

    public IgScrubberProgressIndicator(Context context) {
        this(context, null);
    }

    public IgScrubberProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IgScrubberProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39970D = false;
        this.f39971E = false;
        this.f39969C = new AnonymousClass3Ij(this);
        LayoutInflater.from(context).inflate(C0164R.layout.view_ig_scrubber_progress_indicator, this);
        View findViewById = findViewById(C0164R.id.dot1);
        View findViewById2 = findViewById(C0164R.id.dot2);
        View findViewById3 = findViewById(C0164R.id.dot3);
        Animator ofFloat = ObjectAnimator.ofFloat(findViewById, "scaleX", new float[]{1.0f, 1.33f});
        ofFloat.setDuration(250);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        Animator clone = ofFloat.clone();
        clone.setPropertyName("scaleY");
        Animator ofFloat2 = ObjectAnimator.ofFloat(findViewById, "scaleX", new float[]{1.33f, 1.0f});
        ofFloat2.setDuration(250);
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        Animator clone2 = ofFloat2.clone();
        clone2.setPropertyName("scaleY");
        Animator clone3 = ofFloat.clone();
        Animator clone4 = clone.clone();
        Animator clone5 = ofFloat2.clone();
        Animator clone6 = clone2.clone();
        clone3.setTarget(findViewById2);
        clone4.setTarget(findViewById2);
        clone5.setTarget(findViewById2);
        clone6.setTarget(findViewById2);
        Animator clone7 = ofFloat.clone();
        Animator clone8 = clone.clone();
        Animator clone9 = ofFloat2.clone();
        Animator clone10 = clone2.clone();
        clone7.setTarget(findViewById3);
        clone8.setTarget(findViewById3);
        clone9.setTarget(findViewById3);
        clone10.setTarget(findViewById3);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f39968B = animatorSet;
        animatorSet.play(ofFloat).with(clone);
        this.f39968B.play(clone3).with(clone4).with(ofFloat2).with(clone2).after(ofFloat);
        this.f39968B.play(clone7).with(clone8).with(clone5).with(clone6).after(clone3);
        this.f39968B.play(clone9).with(clone10).after(clone7);
        this.f39968B.addListener(new AnonymousClass3Ik(this));
    }

    /* renamed from: B */
    private void m19314B() {
        this.f39970D = true;
        if (!this.f39968B.isStarted()) {
            this.f39968B.start();
        }
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, -746607842);
        super.onAttachedToWindow();
        this.f39971E = true;
        if (getVisibility() == 0) {
            m19314B();
        }
        AnonymousClass0cQ.O(this, -1844312675, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, -1068222831);
        super.onDetachedFromWindow();
        this.f39971E = false;
        this.f39970D = false;
        AnonymousClass0cQ.O(this, -309377377, N);
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (!this.f39971E) {
            return;
        }
        if (i == 0) {
            m19314B();
        } else {
            this.f39970D = false;
        }
    }
}
