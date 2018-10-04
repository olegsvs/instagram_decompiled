package com.instagram.direct.voice;

import X.AnonymousClass0Nm;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eS;
import X.AnonymousClass1mY;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.View.MeasureSpec;
import com.facebook.forker.Process;
import java.util.ArrayList;
import java.util.List;

public class VoiceVisualizer extends View {
    /* renamed from: B */
    public final ArrayList f57142B;
    /* renamed from: C */
    public final List f57143C;
    /* renamed from: D */
    public final float f57144D;
    /* renamed from: E */
    public final List f57145E;
    /* renamed from: F */
    private final Paint f57146F;
    /* renamed from: G */
    private final float f57147G;

    public VoiceVisualizer(Context context) {
        this(context, null);
    }

    public VoiceVisualizer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceVisualizer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f57143C = new ArrayList();
        this.f57145E = new ArrayList();
        this.f57142B = new ArrayList();
        this.f57146F = new Paint(5);
        this.f57144D = AnonymousClass0Nm.C(context, 5);
        this.f57147G = AnonymousClass0Nm.C(context, 3);
        this.f57146F.setStrokeCap(Cap.ROUND);
        Theme theme = context.getTheme();
        int i2 = AnonymousClass0eS.VoiceVisualizer;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, i2, 0, 0);
        try {
            i2 = obtainStyledAttributes.getColor(0, -1);
            this.f57146F.setColor(i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: B */
    private boolean m25041B(float f, float f2, float f3, float f4, int i, Canvas canvas) {
        f2 = (f2 * f3) * f;
        float f5 = f4 - (this.f57144D * ((float) i));
        float paddingTop = ((float) getPaddingTop()) + ((f3 - f2) / 2.0f);
        float f6 = this.f57147G;
        if (f5 < (-f6)) {
            return false;
        }
        this.f57146F.setStrokeWidth(f6 * f);
        canvas.drawLine(f5, paddingTop, f5, paddingTop + f2, this.f57146F);
        return true;
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, 998622087);
        super.onDetachedFromWindow();
        for (Pair pair : this.f57143C) {
            ((ValueAnimator) pair.second).end();
        }
        AnonymousClass0cQ.O(this, 1057510060, N);
    }

    public final void onDraw(Canvas canvas) {
        VoiceVisualizer voiceVisualizer = this;
        super.onDraw(canvas);
        if (!this.f57143C.isEmpty() || !this.f57145E.isEmpty()) {
            int size;
            float floatValue;
            if (this.f57145E.isEmpty()) {
                size = this.f57143C.size();
                floatValue = ((Float) ((ValueAnimator) ((Pair) this.f57143C.get(size - 1)).second).getAnimatedValue()).floatValue();
            } else {
                size = this.f57145E.size();
                floatValue = 1.0f;
            }
            float height = (float) ((canvas.getHeight() - getPaddingTop()) - getPaddingBottom());
            float width = (float) canvas.getWidth();
            float f = this.f57144D;
            float min = Math.min(width - (floatValue * f), ((float) size) * f);
            int i;
            int i2;
            if (this.f57145E.isEmpty()) {
                i = size - 1;
                i2 = 0;
                while (i >= 0) {
                    if (m25041B(((Float) ((ValueAnimator) ((Pair) voiceVisualizer.f57143C.get(i)).second).getAnimatedValue()).floatValue(), ((Float) ((Pair) voiceVisualizer.f57143C.get(i)).first).floatValue(), height, min, i2, canvas)) {
                        i2++;
                        i--;
                    } else {
                        return;
                    }
                }
                return;
            }
            i2 = 0;
            for (i = size - 1; i >= 0; i--) {
                m25041B(1.0f, ((Float) voiceVisualizer.f57145E.get(i)).floatValue(), height, min, i2, canvas);
                i2++;
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int size2 = this.f57145E.isEmpty() ? size : (int) (((float) this.f57145E.size()) * this.f57144D);
        int size3 = MeasureSpec.getSize(i2);
        if (size2 > size && !this.f57145E.isEmpty()) {
            double size4 = (double) this.f57145E.size();
            double d = (double) ((int) (((float) size) / this.f57144D));
            Double.isNaN(size4);
            Double.isNaN(d);
            int ceil = (int) Math.ceil(size4 / d);
            this.f57142B.clear();
            int i3 = 0;
            float f = 0.0f;
            int i4 = 1;
            while (i3 < this.f57145E.size()) {
                f += ((Float) this.f57145E.get(i3)).floatValue();
                if (i3 % ceil == 0 || i3 == this.f57145E.size() - 1) {
                    this.f57142B.add(Float.valueOf(f / ((float) i4)));
                    f = 0.0f;
                    i4 = 0;
                }
                i4++;
                i3++;
            }
            this.f57145E.clear();
            this.f57145E.addAll(this.f57142B);
        }
        if (mode != 1073741824) {
            if (mode == Process.WAIT_RESULT_TIMEOUT) {
                float size5 = (float) this.f57145E.size();
                float f2 = this.f57144D;
                size = (int) Math.min((size5 * f2) + f2, (float) size);
            }
        }
        setMeasuredDimension(size, size3);
    }

    public void setStaticSegments(List list) {
        AnonymousClass1mY.B(this.f57143C.isEmpty());
        this.f57145E.clear();
        this.f57145E.addAll(list);
        requestLayout();
    }
}
