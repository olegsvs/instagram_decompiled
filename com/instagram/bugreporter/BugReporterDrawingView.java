package com.instagram.bugreporter;

import X.AnonymousClass0Nm;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eS;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class BugReporterDrawingView extends View {
    /* renamed from: B */
    public Paint f37321B;
    /* renamed from: C */
    public Bitmap f37322C;
    /* renamed from: D */
    public Canvas f37323D;
    /* renamed from: E */
    public Bitmap f37324E;
    /* renamed from: F */
    public Rect f37325F;
    /* renamed from: G */
    private final Path f37326G;
    /* renamed from: H */
    private final Path f37327H;
    /* renamed from: I */
    private float f37328I;
    /* renamed from: J */
    private float f37329J;
    /* renamed from: K */
    private int f37330K;
    /* renamed from: L */
    private Paint f37331L;
    /* renamed from: M */
    private float f37332M;

    public BugReporterDrawingView(Context context) {
        this(context, null);
    }

    public BugReporterDrawingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BugReporterDrawingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37326G = new Path();
        this.f37327H = new Path();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.BugReporterDrawingView);
        this.f37332M = obtainStyledAttributes.getDimension(1, AnonymousClass0Nm.C(getContext(), 12));
        this.f37330K = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f37331L = paint;
        paint.setAntiAlias(true);
        this.f37331L.setColor(this.f37330K);
        this.f37331L.setStyle(Style.STROKE);
        this.f37331L.setStrokeJoin(Join.ROUND);
        this.f37331L.setStrokeWidth(this.f37332M);
        this.f37331L.setStrokeCap(Cap.ROUND);
        paint = new Paint();
        this.f37321B = paint;
        paint.setAntiAlias(true);
        this.f37321B.setDither(true);
        this.f37321B.setFilterBitmap(true);
    }

    /* renamed from: A */
    public final Bitmap m18304A() {
        if (this.f37324E == null) {
            if (this.f37322C == null) {
                throw new IllegalStateException("The drawing view has a size of zero, so creating a final bitmap does not make sense.");
            }
        }
        Bitmap bitmap = this.f37324E;
        if (bitmap == null) {
            bitmap = this.f37322C;
            return bitmap.copy(bitmap.getConfig(), true);
        }
        Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
        Canvas canvas = new Canvas(copy);
        Matrix matrix = new Matrix();
        matrix.postTranslate((float) (-this.f37325F.left), (float) (-this.f37325F.top));
        matrix.postScale(((float) copy.getWidth()) / ((float) this.f37325F.width()), ((float) copy.getHeight()) / ((float) this.f37325F.height()));
        canvas.setMatrix(matrix);
        canvas.drawPath(this.f37326G, this.f37331L);
        return copy;
    }

    /* renamed from: B */
    public static void m18301B(BugReporterDrawingView bugReporterDrawingView) {
        int width;
        int paddingLeft;
        int width2;
        int paddingTop;
        Rect rect;
        int width3 = (bugReporterDrawingView.getWidth() - bugReporterDrawingView.getPaddingLeft()) - bugReporterDrawingView.getPaddingRight();
        int height = (bugReporterDrawingView.getHeight() - bugReporterDrawingView.getPaddingTop()) - bugReporterDrawingView.getPaddingBottom();
        Bitmap bitmap = bugReporterDrawingView.f37324E;
        if (bitmap != null && width3 > 0) {
            if (height > 0) {
                width = bitmap.getWidth();
                float f = (float) width;
                float height2 = (float) bugReporterDrawingView.f37324E.getHeight();
                float min = Math.min(((float) width3) / f, ((float) height) / height2);
                width = (width3 - ((int) Math.ceil((double) (f * min)))) / 2;
                height = (height - ((int) Math.ceil((double) (height2 * min)))) / 2;
                paddingLeft = bugReporterDrawingView.getPaddingLeft() + width;
                width2 = (bugReporterDrawingView.getWidth() - bugReporterDrawingView.getPaddingRight()) - width;
                paddingTop = bugReporterDrawingView.getPaddingTop() + height;
                width = (bugReporterDrawingView.getHeight() - bugReporterDrawingView.getPaddingBottom()) - height;
                rect = new Rect(paddingLeft, paddingTop, width2, width);
                bugReporterDrawingView.f37325F = rect;
                height = rect.width();
                width2 = bugReporterDrawingView.f37325F.height();
                if (height > 0 || width2 <= 0) {
                    m18302C(bugReporterDrawingView);
                }
                m18302C(bugReporterDrawingView);
                bugReporterDrawingView.f37322C = Bitmap.createBitmap(height, width2, Config.ARGB_8888);
                Canvas canvas = new Canvas(bugReporterDrawingView.f37322C);
                bugReporterDrawingView.f37323D = canvas;
                canvas.drawColor(0, Mode.CLEAR);
                if (bugReporterDrawingView.f37324E != null) {
                    bugReporterDrawingView.f37323D.drawBitmap(bugReporterDrawingView.f37324E, null, new Rect(0, 0, height, width2), bugReporterDrawingView.f37321B);
                }
                Matrix matrix = new Matrix();
                matrix.postTranslate((float) (-bugReporterDrawingView.f37325F.left), (float) (-bugReporterDrawingView.f37325F.top));
                bugReporterDrawingView.f37323D.setMatrix(matrix);
                return;
            }
        }
        paddingLeft = bugReporterDrawingView.getPaddingLeft();
        width2 = bugReporterDrawingView.getPaddingRight();
        paddingTop = bugReporterDrawingView.getPaddingTop();
        width = bugReporterDrawingView.getPaddingBottom();
        rect = new Rect(paddingLeft, paddingTop, width2, width);
        bugReporterDrawingView.f37325F = rect;
        height = rect.width();
        width2 = bugReporterDrawingView.f37325F.height();
        if (height > 0) {
        }
        m18302C(bugReporterDrawingView);
    }

    /* renamed from: C */
    public static void m18302C(BugReporterDrawingView bugReporterDrawingView) {
        Bitmap bitmap = bugReporterDrawingView.f37322C;
        if (bitmap != null) {
            bitmap.recycle();
            bugReporterDrawingView.f37322C = null;
            bugReporterDrawingView.f37323D = null;
        }
        bugReporterDrawingView.f37326G.reset();
    }

    /* renamed from: D */
    private void m18303D(float f, float f2) {
        float f3 = this.f37328I;
        f = (f + f3) / 2.0f;
        float f4 = this.f37329J;
        f2 = (f2 + f4) / 2.0f;
        this.f37327H.quadTo(f3, f4, f, f2);
        this.f37328I = f;
        this.f37329J = f2;
    }

    public final void finalize() {
        m18302C(this);
        super.finalize();
    }

    public final void onDraw(Canvas canvas) {
        if (this.f37325F.width() > 0 && this.f37325F.height() > 0) {
            Bitmap bitmap = this.f37322C;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, null, this.f37325F, this.f37321B);
            }
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, 115765338);
        m18301B(this);
        AnonymousClass0cQ.O(this, 816755891, N);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, -765808055);
        int i = 0;
        if (this.f37325F.width() <= 0 || this.f37325F.height() <= 0) {
            AnonymousClass0cQ.L(this, -454054701, M);
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f37328I = motionEvent.getX();
                this.f37329J = motionEvent.getY();
                Path path = this.f37326G;
                float f = this.f37328I;
                float f2 = this.f37329J;
                path.addRect(f, f2, f + 0.1f, f2 + 0.1f, Direction.CW);
                this.f37323D.drawPoint(this.f37328I, this.f37329J, this.f37331L);
                invalidate();
                break;
            case 1:
                this.f37326G.moveTo(this.f37328I, this.f37329J);
                this.f37326G.lineTo(motionEvent.getX(), motionEvent.getY());
                this.f37323D.drawLine(this.f37328I, this.f37329J, motionEvent.getX(), motionEvent.getY(), this.f37331L);
                invalidate();
                break;
            case 2:
                this.f37327H.reset();
                this.f37327H.moveTo(this.f37328I, this.f37329J);
                int historySize = motionEvent.getHistorySize();
                while (i < historySize) {
                    m18303D(motionEvent.getHistoricalX(i), motionEvent.getHistoricalY(i));
                    i++;
                }
                m18303D(motionEvent.getX(), motionEvent.getY());
                this.f37326G.addPath(this.f37327H);
                this.f37323D.drawPath(this.f37327H, this.f37331L);
                invalidate();
                break;
            default:
                AnonymousClass0cQ.L(this, -1347218969, M);
                return false;
        }
        AnonymousClass0cQ.L(this, 2082926856, M);
        return true;
    }
}
