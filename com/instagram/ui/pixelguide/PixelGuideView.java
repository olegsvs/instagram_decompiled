package com.instagram.ui.pixelguide;

import X.AnonymousClass0Nm;
import X.AnonymousClass0cQ;
import X.AnonymousClass0mE;
import X.AnonymousClass1lw;
import X.AnonymousClass3iv;
import X.AnonymousClass427;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0164R;

public class PixelGuideView extends View {
    /* renamed from: B */
    public Paint f43644B;
    /* renamed from: C */
    public String f43645C;
    /* renamed from: D */
    public AnonymousClass3iv f43646D;
    /* renamed from: E */
    public int f43647E;
    /* renamed from: F */
    public int f43648F;
    /* renamed from: G */
    public Paint f43649G;
    /* renamed from: H */
    public Rect f43650H;
    /* renamed from: I */
    public int f43651I;
    /* renamed from: J */
    private int f43652J;
    /* renamed from: K */
    private int f43653K;
    /* renamed from: L */
    private int f43654L;

    public PixelGuideView(Context context) {
        super(context);
        m20496B();
    }

    public PixelGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m20496B();
    }

    public PixelGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m20496B();
    }

    /* renamed from: B */
    private void m20496B() {
        int dimensionPixelSize;
        Paint paint = new Paint();
        this.f43649G = paint;
        paint.setColor(587137024);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Device Density: ");
        stringBuilder.append(AnonymousClass0Nm.G(getContext()).density);
        this.f43645C = stringBuilder.toString();
        this.f43647E = AnonymousClass0mE.C(this);
        Paint paint2 = new Paint(1);
        this.f43644B = paint2;
        paint2.setTextSize((float) getResources().getDimensionPixelSize(C0164R.dimen.font_medium_xlarge));
        this.f43644B.setColor(AnonymousClass1lw.m12954B(getResources(), C0164R.color.green_5, null));
        this.f43650H = new Rect();
        Paint paint3 = this.f43644B;
        String str = this.f43645C;
        paint3.getTextBounds(str, 0, str.length(), this.f43650H);
        this.f43651I = this.f43650H.height();
        if ((this.f43647E == 0 ? 1 : null) != null) {
            dimensionPixelSize = getResources().getDimensionPixelSize(C0164R.dimen.pixel_grid_padding);
        } else {
            dimensionPixelSize = getResources().getDimensionPixelSize(C0164R.dimen.row_padding_large);
        }
        this.f43648F = dimensionPixelSize;
        this.f43646D = new AnonymousClass427(587137024, 570425344, (int) AnonymousClass0Nm.C(getContext(), 8));
    }

    public final void onDraw(Canvas canvas) {
        int i = this.f43653K;
        if (i != 0) {
            this.f43646D.sG(canvas, i, this.f43652J);
            canvas.drawText(this.f43645C, (float) this.f43654L, (float) this.f43651I, this.f43644B);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, 855974320);
        super.onSizeChanged(i, i2, i3, i4);
        this.f43653K = i;
        this.f43652J = i2;
        this.f43654L = (this.f43647E == 0 ? 1 : null) != null ? (i - this.f43650H.width()) - this.f43648F : this.f43648F;
        AnonymousClass0cQ.O(this, 370788972, N);
    }
}
