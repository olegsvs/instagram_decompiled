package com.instagram.feed.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.facebook.C0164R;

public class EndOfFeedDemarcatorIconView extends View {
    /* renamed from: B */
    public float f11709B;
    /* renamed from: C */
    private RectF f11710C;
    /* renamed from: D */
    private int f11711D;
    /* renamed from: E */
    private Path f11712E;
    /* renamed from: F */
    private int f11713F;
    /* renamed from: G */
    private Point f11714G;
    /* renamed from: H */
    private int f11715H;
    /* renamed from: I */
    private int[] f11716I;
    /* renamed from: J */
    private Paint f11717J;
    /* renamed from: K */
    private int f11718K;
    /* renamed from: L */
    private LinearGradient f11719L;
    /* renamed from: M */
    private Paint f11720M;
    /* renamed from: N */
    private int f11721N;

    public EndOfFeedDemarcatorIconView(Context context) {
        super(context);
        m8179A();
    }

    public EndOfFeedDemarcatorIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m8179A();
    }

    public EndOfFeedDemarcatorIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m8179A();
    }

    /* renamed from: A */
    public final void m8179A() {
        this.f11716I = new int[]{-14170891, -9387952};
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f11720M = paint;
        paint.setColor(-6842473);
        this.f11720M.setStrokeWidth((float) getResources().getDimensionPixelSize(C0164R.dimen.eof_demarcator_line_stroke_width));
        Paint paint2 = this.f11720M;
        Style style = Style.STROKE;
        paint2.setStyle(style);
        this.f11714G = new Point();
        paint = new Paint(1);
        this.f11717J = paint;
        paint.setStyle(style);
        this.f11717J.setStrokeWidth((float) getResources().getDimensionPixelSize(C0164R.dimen.eof_demarcator_circle_stroke_width));
        this.f11710C = new RectF();
        this.f11712E = new Path();
        this.f11717J.setStrokeCap(Cap.ROUND);
        this.f11717J.setStrokeJoin(Join.ROUND);
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        this.f11717J.setAlpha(255);
        float f = this.f11709B;
        if (f < 1.0f) {
            canvas2.drawArc(this.f11710C, 0.0f, (-(Math.max(f - 0.5f, 0.0f) / 0.5f)) * 360.0f, false, this.f11717J);
        } else {
            canvas.drawCircle((float) this.f11714G.x, (float) this.f11714G.y, (float) this.f11715H, this.f11717J);
        }
        this.f11717J.setAlpha((int) ((Math.max(this.f11709B - 0.5f, 0.0f) / 0.5f) * 255.0f));
        canvas.drawPath(this.f11712E, this.f11717J);
        int width = canvas.getWidth() / 32;
        int width2 = ((canvas.getWidth() / 2) - (width * 2)) - this.f11715H;
        float f2 = (float) width2;
        canvas2.drawLine((float) (((this.f11714G.x - this.f11715H) - width) - width2), (float) this.f11714G.y, ((float) ((this.f11714G.x - this.f11715H) - width)) - ((1.0f - Math.min(this.f11709B * 2.0f, 1.0f)) * f2), (float) this.f11714G.y, this.f11720M);
        canvas2.drawLine((float) (((this.f11714G.x + this.f11715H) + width) + width2), (float) this.f11714G.y, ((float) ((this.f11714G.x + this.f11715H) + width)) + (f2 * (1.0f - Math.min(this.f11709B * 2.0f, 1.0f))), (float) this.f11714G.y, this.f11720M);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (size != this.f11721N || size2 != this.f11718K) {
            int i3 = size2 / 2;
            this.f11714G.set(size / 2, i3);
            int i4 = (int) (((float) i3) * 0.8f);
            this.f11715H = i4;
            this.f11711D = (int) (((float) i4) * 0.4f);
            this.f11713F = (int) (((float) i4) * 0.56f);
            this.f11719L = new LinearGradient((float) (this.f11714G.x - this.f11715H), (float) (this.f11714G.y + this.f11715H), (float) (this.f11714G.x + this.f11715H), (float) (this.f11714G.y - this.f11715H), this.f11716I, null, TileMode.CLAMP);
            this.f11717J.setShader(this.f11719L);
            this.f11721N = size;
            this.f11718K = size2;
            this.f11710C.set((float) (this.f11714G.x - this.f11715H), (float) (this.f11714G.y - this.f11715H), (float) (this.f11714G.x + this.f11715H), (float) (this.f11714G.y + this.f11715H));
            this.f11712E.reset();
            this.f11712E.moveTo((float) (this.f11714G.x - this.f11713F), ((float) this.f11714G.y) + (((float) this.f11711D) * 0.1f));
            this.f11712E.lineTo(((float) this.f11714G.x) - (((float) this.f11713F) * 0.16f), (float) (this.f11714G.y + this.f11711D));
            Path path = this.f11712E;
            float f = ((float) this.f11714G.x) + (((float) this.f11713F) * 0.84f);
            int i5 = this.f11714G.y;
            i3 = this.f11711D;
            path.lineTo(f, (float) ((i5 + i3) - (i3 * 2)));
        }
    }
}
