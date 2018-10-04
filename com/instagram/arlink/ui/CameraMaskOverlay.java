package com.instagram.arlink.ui;

import X.AnonymousClass0Nm;
import X.AnonymousClass0cQ;
import X.AnonymousClass1lz;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

public class CameraMaskOverlay extends ImageView {
    /* renamed from: B */
    private View f36969B;
    /* renamed from: C */
    private final Path f36970C = new Path();
    /* renamed from: D */
    private final Paint f36971D = new Paint();
    /* renamed from: E */
    private boolean f36972E;

    public CameraMaskOverlay(Context context) {
        super(context);
    }

    public CameraMaskOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CameraMaskOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void onDraw(Canvas canvas) {
        if (!this.f36970C.isEmpty()) {
            if (this.f36972E) {
                canvas.drawPath(this.f36970C, this.f36971D);
            }
            canvas.clipPath(this.f36970C, Op.DIFFERENCE);
        }
        super.onDraw(canvas);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, -1657312850);
        super.onSizeChanged(i, i2, i3, i4);
        View view = this.f36969B;
        if (view != null) {
            RectF L = AnonymousClass0Nm.L(view);
            if (L.width() > 0.0f && L.height() > 0.0f) {
                this.f36970C.reset();
                this.f36970C.addOval(L, Direction.CW);
            }
            this.f36971D.setColor(-16777216);
        }
        AnonymousClass0cQ.O(this, 1157724998, N);
    }

    public void setCameraView(View view) {
        this.f36969B = view;
    }

    public void setImageAlpha(int i) {
        this.f36972E = i < 255;
        this.f36971D.setColor(AnonymousClass1lz.m12964I(-16777216, i));
        super.setImageAlpha(i);
    }
}
