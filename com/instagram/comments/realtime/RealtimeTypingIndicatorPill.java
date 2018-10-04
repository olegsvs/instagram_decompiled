package com.instagram.comments.realtime;

import X.AnonymousClass0Ca;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.facebook.C0164R;

public class RealtimeTypingIndicatorPill extends LinearLayout {
    /* renamed from: B */
    public BlurMaskFilter f52029B = new BlurMaskFilter(12.0f, Blur.NORMAL);
    /* renamed from: C */
    public Paint f52030C = new Paint(1);
    /* renamed from: D */
    public RectF f52031D = new RectF();
    /* renamed from: E */
    public RectF f52032E = new RectF();
    /* renamed from: F */
    public int f52033F = AnonymousClass0Ca.C(getContext(), C0164R.color.realtime_typing_pill_shadow_color);

    public RealtimeTypingIndicatorPill(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        setLayerType(1, this.f52030C);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f52030C.setColor(this.f52033F);
        this.f52030C.setMaskFilter(this.f52029B);
        canvas.drawRoundRect(this.f52032E, 40.0f, 40.0f, this.f52030C);
        this.f52030C.setMaskFilter(null);
        this.f52030C.setColor(-1);
        canvas.drawRoundRect(this.f52031D, 40.0f, 40.0f, this.f52030C);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float f = (float) (i3 - i);
        float f2 = (float) (i4 - i2);
        float f3 = f * 0.6f;
        float f4 = 0.6f * f2;
        f = (f * 0.5f) - (f3 * 0.5f);
        f2 = (f2 * 0.5f) - (0.5f * f4);
        this.f52031D.set(f, f2, f3 + f, f4 + f2);
        this.f52032E.set(this.f52031D);
        this.f52032E.inset(5.0f, 11.0f);
        this.f52032E.offset(0.0f, 18.0f);
    }
}
