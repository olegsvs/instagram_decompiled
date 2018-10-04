package com.instagram.video.interactivity.view;

import X.AnonymousClass0Ca;
import X.AnonymousClass0cQ;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.C0164R;

public class GradientTextView extends TextView {
    /* renamed from: B */
    private final int[] f71655B;

    public GradientTextView(Context context) {
        this(context, null);
    }

    public GradientTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GradientTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f71655B = new int[]{AnonymousClass0Ca.C(context, C0164R.color.ama_scrim_gradient_start), AnonymousClass0Ca.C(context, C0164R.color.ama_scrim_gradient_end)};
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, -1298900562);
        super.onSizeChanged(i, i2, i3, i4);
        if (!(i == i3 && i2 == i4)) {
            getPaint().setShader(new LinearGradient(0.0f, (float) i2, (float) i, 0.0f, this.f71655B, null, TileMode.CLAMP));
            getPaint().setDither(true);
        }
        AnonymousClass0cQ.O(this, 1644616131, N);
    }
}
