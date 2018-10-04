package com.instagram.ui.widget.tooltippopup;

import X.AnonymousClass0Ca;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.C0164R;

public class MaskingFrameLayout extends FrameLayout {
    /* renamed from: B */
    public Bitmap f43998B;
    /* renamed from: C */
    public float f43999C;
    /* renamed from: D */
    private final Rect f44000D = new Rect();
    /* renamed from: E */
    private final Paint f44001E = new Paint(1);
    /* renamed from: F */
    private final Rect f44002F = new Rect();

    public MaskingFrameLayout(Context context) {
        super(context);
        m20557B();
    }

    public MaskingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m20557B();
    }

    public MaskingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m20557B();
    }

    /* renamed from: B */
    private void m20557B() {
        this.f44001E.setColor(AnonymousClass0Ca.C(getContext(), C0164R.color.grey_5));
        this.f44001E.setDither(true);
        this.f44001E.setFilterBitmap(true);
        this.f44001E.setXfermode(new PorterDuffXfermode(Mode.SRC_ATOP));
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (this.f43998B != null) {
            getGlobalVisibleRect(this.f44002F);
            Rect rect = this.f44002F;
            rect.set(Math.round(((float) rect.left) / this.f43999C), Math.round(((float) this.f44002F.top) / this.f43999C), Math.round(((float) this.f44002F.right) / this.f43999C), Math.round(((float) this.f44002F.bottom) / this.f43999C));
            this.f44000D.set(0, 0, getWidth(), getHeight());
            canvas.drawBitmap(this.f43998B, this.f44002F, this.f44000D, this.f44001E);
            this.f44001E.setAlpha(51);
            canvas2.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.f44001E);
            this.f44001E.setAlpha(255);
        }
    }
}
