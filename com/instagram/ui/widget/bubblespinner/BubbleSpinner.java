package com.instagram.ui.widget.bubblespinner;

import X.AnonymousClass0eS;
import X.AnonymousClass3jN;
import X.AnonymousClass3jO;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.fasterxml.jackson.databind.JsonMappingException;

public class BubbleSpinner extends View {
    /* renamed from: B */
    public int f43725B;
    /* renamed from: C */
    public AnonymousClass3jN[] f43726C;
    /* renamed from: D */
    public boolean f43727D;
    /* renamed from: E */
    public long f43728E;
    /* renamed from: F */
    public boolean f43729F;
    /* renamed from: G */
    public Paint f43730G;
    /* renamed from: H */
    private long f43731H;
    /* renamed from: I */
    private AnonymousClass3jO f43732I;
    /* renamed from: J */
    private final float[] f43733J;

    public BubbleSpinner(Context context) {
        this(context, null);
    }

    public BubbleSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BubbleSpinner(Context context, AttributeSet attributeSet, int i) {
        Throwable th;
        super(context, attributeSet, i);
        this.f43733J = new float[]{0.0f, 0.2f, 0.4f, 0.6f, 0.8f, 1.0f, 0.8f, 0.6f, 0.4f, 0.2f, 0.0f};
        this.f43725B = 40;
        this.f43728E = 1000;
        TypedArray typedArray = null;
        try {
            typedArray = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.BubbleSpinner);
            try {
                this.f43725B = typedArray.getInteger(3, 40);
                float f = typedArray.getFloat(0, 12.0f);
                this.f43728E = (long) typedArray.getInteger(2, JsonMappingException.MAX_REFS_TO_LIST);
                this.f43727D = typedArray.getBoolean(1, true);
                if (typedArray != null) {
                    typedArray.recycle();
                }
                this.f43726C = new AnonymousClass3jN[this.f43725B];
                for (int i2 = 0; i2 < this.f43725B; i2++) {
                    this.f43726C[i2] = new AnonymousClass3jN(f);
                }
                Paint paint = new Paint();
                this.f43730G = paint;
                paint.setColor(-1);
            } catch (Throwable th2) {
                th = th2;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    private int getPivotIndex() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f43731H;
        long j = this.f43728E;
        return (int) ((((float) (elapsedRealtime % j)) / ((float) j)) * ((float) this.f43725B));
    }

    public final void onDraw(Canvas canvas) {
        if (this.f43732I == AnonymousClass3jO.LOADING) {
            int i;
            int i2;
            if (!this.f43729F) {
                int width = canvas.getWidth() / 2;
                int height = (int) (((float) canvas.getHeight()) * (this.f43727D ? 0.5f : 0.416f));
                i = (int) (((float) width) * 0.875f);
                AnonymousClass3jN[] anonymousClass3jNArr = this.f43726C;
                double length = (double) anonymousClass3jNArr.length;
                Double.isNaN(length);
                float f = (float) (6.283185307179586d / length);
                i2 = 0;
                float f2 = ((float) i) + anonymousClass3jNArr[0].f43718B;
                while (i2 < this.f43725B) {
                    length = (double) width;
                    double d = (double) (((float) i2) * f);
                    double cos = Math.cos(d);
                    double d2 = (double) f2;
                    Double.isNaN(d2);
                    cos *= d2;
                    Double.isNaN(length);
                    int i3 = (int) (length + cos);
                    length = (double) height;
                    d = Math.sin(d);
                    Double.isNaN(d2);
                    d *= d2;
                    Double.isNaN(length);
                    int i4 = (int) (length + d);
                    AnonymousClass3jN anonymousClass3jN = this.f43726C[i2];
                    anonymousClass3jN.f43720D = i3;
                    anonymousClass3jN.f43721E = i4;
                    i2++;
                }
                this.f43729F = true;
            }
            i2 = getPivotIndex();
            i = i2;
            while (i < this.f43733J.length + i2) {
                int i5 = this.f43725B;
                AnonymousClass3jN anonymousClass3jN2 = this.f43726C[i < i5 ? i : i - i5];
                anonymousClass3jN2.f43719C = this.f43733J[i - i2];
                canvas.drawCircle((float) anonymousClass3jN2.f43720D, (float) anonymousClass3jN2.f43721E, (float) ((int) (anonymousClass3jN2.f43718B * anonymousClass3jN2.f43719C)), this.f43730G);
                i++;
            }
            invalidate();
        }
    }

    public void setLoadingStatus(AnonymousClass3jO anonymousClass3jO) {
        if (this.f43732I != anonymousClass3jO) {
            switch (anonymousClass3jO.ordinal()) {
                case 0:
                    this.f43729F = false;
                    this.f43732I = AnonymousClass3jO.LOADING;
                    this.f43731H = SystemClock.elapsedRealtime();
                    setVisibility(0);
                    invalidate();
                    return;
                case 1:
                    this.f43732I = AnonymousClass3jO.DONE;
                    setVisibility(8);
                    return;
                default:
                    return;
            }
        }
    }
}
