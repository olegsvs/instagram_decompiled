package com.instagram.ui.widget.volume;

import X.AnonymousClass0cQ;
import X.AnonymousClass5Jj;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class VolumeIndicator extends ProgressBar {
    /* renamed from: B */
    public Runnable f62176B;

    public VolumeIndicator(Context context) {
        super(context);
    }

    public VolumeIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VolumeIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: A */
    public final void m26247A(int i, int i2) {
        Runnable runnable = this.f62176B;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        setMax(i2);
        if (!(getVisibility() == 0 && getAlpha() == 1.0f)) {
            setVisibility(0);
            animate().setDuration(200).setListener(null).alpha(1.0f);
        }
        setProgress(i);
        if (this.f62176B == null) {
            this.f62176B = new AnonymousClass5Jj(this);
        }
        postDelayed(this.f62176B, 2000);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, -582349776);
        Runnable runnable = this.f62176B;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f62176B = null;
        super.onDetachedFromWindow();
        AnonymousClass0cQ.O(this, 614533106, N);
    }
}
