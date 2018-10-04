package com.instagram.ui.widget.bouncyufibutton;

import X.AnonymousClass0jk;
import X.AnonymousClass0z4;
import android.content.Context;
import android.util.AttributeSet;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

public class IgBouncyUfiButtonImageView extends ColorFilterAlphaImageView implements AnonymousClass0z4, AnonymousClass0jk {
    public IgBouncyUfiButtonImageView(Context context) {
        super(context);
    }

    public IgBouncyUfiButtonImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IgBouncyUfiButtonImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: B */
    public final void m8681B() {
        setScaleX(1.0f);
        setScaleY(1.0f);
        setAlpha(1.0f);
    }

    public final void Wd(float f, boolean z) {
        Xd(f, z, false);
    }

    public final void Xd(float f, boolean z, boolean z2) {
        setScaleX(f);
        setScaleY(f);
        if (!z) {
            f = 1.0f;
        }
        setAlpha(f);
    }
}
