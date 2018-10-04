package com.instagram.ui.widget.base;

import X.AnonymousClass0Nm;
import X.AnonymousClass0e8;
import X.AnonymousClass0eS;
import X.AnonymousClass2KR;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.Spinner;
import com.facebook.C0164R;

public class TriangleSpinner extends Spinner {
    /* renamed from: B */
    private boolean f28998B;
    /* renamed from: C */
    private boolean f28999C;
    /* renamed from: D */
    private int f29000D;
    /* renamed from: E */
    private final Paint f29001E = new Paint(1);
    /* renamed from: F */
    private int f29002F;
    /* renamed from: G */
    private AnonymousClass2KR f29003G;
    /* renamed from: H */
    private Path f29004H;

    public TriangleSpinner(Context context) {
        super(context);
        m15091B(null, 0);
    }

    public TriangleSpinner(Context context, int i) {
        super(context, i);
        m15091B(null, 0);
    }

    public TriangleSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0164R.attr.triangleSpinnerStyle);
        m15091B(attributeSet, C0164R.attr.triangleSpinnerStyle);
    }

    public TriangleSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m15091B(attributeSet, i);
    }

    public TriangleSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m15091B(attributeSet, i);
    }

    /* renamed from: B */
    private void m15091B(AttributeSet attributeSet, int i) {
        this.f28999C = AnonymousClass0e8.D(getContext());
        int C = (int) AnonymousClass0Nm.C(getContext(), 12);
        AnonymousClass2KR anonymousClass2KR = AnonymousClass2KR.CORNER;
        int i2 = -16777216;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, AnonymousClass0eS.TriangleSpinner, i, 0);
            try {
                i2 = obtainStyledAttributes.getColor(0, -16777216);
                C = obtainStyledAttributes.getDimensionPixelSize(2, C);
                anonymousClass2KR = AnonymousClass2KR.m15090B(obtainStyledAttributes.getInt(3, 0));
                this.f29000D = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f29001E.setStyle(Style.FILL);
        this.f29001E.setColor(i2);
        setTriangleSize(C);
        setTriangleStyle(anonymousClass2KR);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getChildCount() != 0) {
            int scrollX;
            int i;
            canvas.save();
            if (this.f28998B) {
                scrollX = (getScrollX() + canvas.getWidth()) - this.f29002F;
                if (this.f29003G == AnonymousClass2KR.CORNER) {
                    double scrollY = (double) (getScrollY() + canvas.getHeight());
                    double ceil = Math.ceil((double) (((float) this.f29002F) * 1.5f));
                    Double.isNaN(scrollY);
                    i = (int) (scrollY - ceil);
                    canvas.translate((float) scrollX, (float) i);
                    canvas.drawPath(this.f29004H, this.f29001E);
                    canvas.restore();
                }
            }
            if (this.f28999C) {
                scrollX = (getChildAt(0).getLeft() - this.f29000D) - this.f29002F;
            } else {
                scrollX = (getScrollX() + getChildAt(0).getRight()) + this.f29000D;
            }
            if (this.f29003G == AnonymousClass2KR.CORNER) {
                i = (getScrollY() + (canvas.getHeight() / 2)) + (this.f29002F / 2);
                canvas.translate((float) scrollX, (float) i);
                canvas.drawPath(this.f29004H, this.f29001E);
                canvas.restore();
            }
            i = (getScrollY() + (canvas.getHeight() / 2)) - (this.f29002F / 4);
            canvas.translate((float) scrollX, (float) i);
            canvas.drawPath(this.f29004H, this.f29001E);
            canvas.restore();
        }
    }

    public void setAlignToEdge(boolean z) {
        this.f28998B = z;
        invalidate();
    }

    public void setTriangleAlpha(int i) {
        this.f29001E.setAlpha(i);
        invalidate();
    }

    public void setTriangleColor(int i) {
        this.f29001E.setColor(i);
        invalidate();
    }

    public void setTriangleSize(int i) {
        this.f29002F = i;
        setTriangleStyle(this.f29003G);
        AnonymousClass0Nm.d(this, this.f29000D + this.f29002F);
    }

    public void setTriangleStyle(AnonymousClass2KR anonymousClass2KR) {
        this.f29003G = anonymousClass2KR;
        this.f29004H = new Path();
        if (anonymousClass2KR == AnonymousClass2KR.CORNER) {
            this.f29004H.moveTo(0.0f, (float) this.f29002F);
            Path path = this.f29004H;
            int i = this.f29002F;
            path.lineTo((float) i, (float) i);
            this.f29004H.lineTo((float) this.f29002F, 0.0f);
            this.f29004H.lineTo(0.0f, (float) this.f29002F);
        } else {
            this.f29004H.moveTo(0.0f, 0.0f);
            this.f29004H.lineTo((float) this.f29002F, 0.0f);
            Path path2 = this.f29004H;
            int i2 = this.f29002F;
            path2.lineTo((float) (i2 / 2), (float) (i2 / 2));
            this.f29004H.lineTo(0.0f, 0.0f);
        }
        this.f29004H.close();
        invalidate();
    }
}
