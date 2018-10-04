package com.instagram.video.player.common;

import X.AnonymousClass3pT;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import java.util.Timer;

public class LiveVideoDebugStatsView extends View {
    /* renamed from: B */
    public long f44964B;
    /* renamed from: C */
    public long f44965C;
    /* renamed from: D */
    public long f44966D;
    /* renamed from: E */
    public int f44967E;
    /* renamed from: F */
    public int f44968F;
    /* renamed from: G */
    public long f44969G;
    /* renamed from: H */
    public long f44970H;
    /* renamed from: I */
    public AnonymousClass3pT[] f44971I;
    /* renamed from: J */
    public Timer f44972J;
    /* renamed from: K */
    private Paint f44973K;
    /* renamed from: L */
    private float f44974L;

    public long getPreferredTimePeriod() {
        return 100;
    }

    public LiveVideoDebugStatsView(Context context) {
        super(context);
        m20821C();
    }

    public LiveVideoDebugStatsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m20821C();
    }

    public LiveVideoDebugStatsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m20821C();
    }

    /* renamed from: B */
    private void m20820B(Canvas canvas, float f, float f2, float f3, float f4, int i, int i2) {
        float height = ((float) getHeight()) - (this.f44974L * 2.0f);
        float height2 = (((float) getHeight()) - this.f44974L) - (f2 * height);
        float height3 = (((float) getHeight()) - this.f44974L) - (height * f4);
        this.f44973K.setColor(i2);
        this.f44973K.setAlpha(i);
        canvas.drawLine(f, height2, f3, height3, this.f44973K);
    }

    /* renamed from: C */
    private void m20821C() {
        setWillNotDraw(false);
        this.f44971I = new AnonymousClass3pT[100];
        this.f44968F = 0;
        this.f44967E = 0;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Paint paint = new Paint();
        this.f44973K = paint;
        paint.setColor(-65536);
        this.f44973K.setStrokeWidth(TypedValue.applyDimension(1, 2.0f, displayMetrics));
        this.f44973K.setStrokeCap(Cap.ROUND);
        this.f44973K.setStrokeJoin(Join.ROUND);
        this.f44974L = TypedValue.applyDimension(1, 16.0f, displayMetrics);
    }

    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2 = canvas;
        super.draw(canvas2);
        synchronized (r6) {
            i = r6.f44967E;
            int i2 = r6.f44968F;
            if (i2 < r6.f44967E) {
                i2 = r6.f44968F + r6.f44971I.length;
            }
        }
        float width = ((float) getWidth()) - (r6.f44974L * 2.0f);
        long j = -1;
        int i3 = i;
        while (true) {
            int i4 = i2 - 1;
            if (i3 >= i4) {
                break;
            }
            AnonymousClass3pT[] anonymousClass3pTArr = r6.f44971I;
            AnonymousClass3pT anonymousClass3pT = anonymousClass3pTArr[i3 % anonymousClass3pTArr.length];
            if (anonymousClass3pT == null) {
                break;
            }
            long j2 = anonymousClass3pT.f44962E - anonymousClass3pT.f44961D;
            if (j2 > j) {
                j = j2;
            }
            i3++;
        }
        if (j > 0) {
            anonymousClass3pTArr = r6.f44971I;
            long j3 = anonymousClass3pTArr[i4 % anonymousClass3pTArr.length].f44960C - r6.f44971I[r6.f44967E].f44960C;
            if (j3 <= 0) {
                j3 = 1;
            }
            for (int i5 = i; i5 < i2 - 2; i5++) {
                AnonymousClass3pT[] anonymousClass3pTArr2 = r6.f44971I;
                int length = i5 % anonymousClass3pTArr2.length;
                float f = r6.f44974L;
                float length2 = f + ((((float) length) * width) / ((float) anonymousClass3pTArr2.length));
                int length3 = (length + 1) % anonymousClass3pTArr2.length;
                f += (((float) length3) * width) / ((float) anonymousClass3pTArr2.length);
                if (f > length2) {
                    AnonymousClass3pT anonymousClass3pT2 = anonymousClass3pTArr2[i];
                    AnonymousClass3pT anonymousClass3pT3 = anonymousClass3pTArr2[length];
                    AnonymousClass3pT anonymousClass3pT4 = anonymousClass3pTArr2[length3];
                    int min = ((i5 - i) * 255) / Math.min(i2 - i, anonymousClass3pTArr2.length);
                    if (i5 != i) {
                        anonymousClass3pTArr2 = r6.f44971I;
                        if (anonymousClass3pT3.f44963F > r6.f44971I[((anonymousClass3pTArr2.length + i5) - 1) % anonymousClass3pTArr2.length].f44963F) {
                            m20820B(canvas2, length2, 0.0f, length2, (float) getHeight(), min, -3355444);
                        }
                    }
                    float f2 = (float) j3;
                    float f3 = f;
                    int i6 = min;
                    m20820B(canvas2, length2, ((float) (anonymousClass3pT3.f44960C - anonymousClass3pT2.f44960C)) / f2, f3, ((float) (anonymousClass3pT4.f44960C - anonymousClass3pT2.f44960C)) / f2, i6, -256);
                    float f4 = (float) j;
                    m20820B(canvas2, length2, ((float) (anonymousClass3pT3.f44959B - anonymousClass3pT3.f44961D)) / f4, f3, ((float) (anonymousClass3pT4.f44959B - anonymousClass3pT4.f44961D)) / f4, i6, -65536);
                    m20820B(canvas2, length2, ((float) (anonymousClass3pT3.f44962E - anonymousClass3pT3.f44959B)) / f4, f3, ((float) (anonymousClass3pT4.f44962E - anonymousClass3pT4.f44959B)) / f4, i6, Color.rgb(128, 0, 0));
                }
            }
        }
    }
}
