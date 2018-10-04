package com.instagram.ui.mediaactions;

import X.AnonymousClass0dh;
import X.AnonymousClass0z4;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class LikeActionView extends ImageView implements AnonymousClass0z4 {
    public LikeActionView(Context context) {
        super(context);
    }

    public LikeActionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LikeActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: A */
    public final void m8664A() {
        setScaleX(0.0f);
        setScaleY(0.0f);
        setAlpha(1.0f);
    }

    public final void Xd(float f, boolean z, boolean z2) {
        setScaleX(f);
        setScaleY(f);
        if (z) {
            f = (float) AnonymousClass0dh.m6102B((double) f, (double) getAlpha(), 1.0d);
        }
        setAlpha(f);
    }
}
