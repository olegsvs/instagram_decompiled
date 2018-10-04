package com.instagram.common.ui.widget.imageview;

import X.AnonymousClass0mE;
import X.AnonymousClass26G;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.util.AttributeSet;
import android.view.View;

public class PunchedOverlayView extends View {
    /* renamed from: B */
    public float f25977B = 1.0f;
    /* renamed from: C */
    public Runnable f25978C;
    /* renamed from: D */
    private int f25979D;
    /* renamed from: E */
    private int f25980E = Color.argb(192, 0, 0, 0);
    /* renamed from: F */
    private Paint f25981F;
    /* renamed from: G */
    private Path f25982G;

    public PunchedOverlayView(Context context) {
        super(context);
    }

    public PunchedOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PunchedOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: A */
    public final void m14428A(AnonymousClass26G anonymousClass26G) {
        Path path = new Path();
        this.f25982G = path;
        path.setFillType(FillType.EVEN_ODD);
        this.f25982G.addRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), Direction.CW);
        anonymousClass26G.mo3245A(this.f25982G);
        Paint paint = new Paint(1);
        this.f25981F = paint;
        paint.setColor(this.f25980E);
        this.f25981F.setAlpha((int) (this.f25977B * ((float) Color.alpha(this.f25980E))));
        invalidate();
    }

    public final void draw(Canvas canvas) {
        Path path = this.f25982G;
        if (path != null) {
            canvas.drawPath(path, this.f25981F);
            float f = this.f25977B;
            if (f < 1.0f) {
                this.f25977B = Math.min(f + (1.0f / ((float) this.f25979D)), 1.0f);
                this.f25981F.setAlpha((int) (this.f25977B * ((float) Color.alpha(this.f25980E))));
                AnonymousClass0mE.J(this);
            } else if (this.f25977B >= 1.0f) {
                Runnable runnable = this.f25978C;
                if (runnable != null) {
                    runnable.run();
                    this.f25978C = null;
                }
            }
        }
    }

    public void setDarkenColor(int i) {
        this.f25980E = i;
    }
}
