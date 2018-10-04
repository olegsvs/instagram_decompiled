package com.instagram.ui.widget.emitter;

import X.AnonymousClass0cQ;
import X.AnonymousClass1JP;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class PulseEmitter extends View {
    /* renamed from: J */
    private static final int[] f17050J = new int[]{Color.argb(255, 25, 25, 25), Color.argb(255, 69, 69, 69), Color.argb(255, 89, 89, 89)};
    /* renamed from: K */
    private static final float[] f17051K = new float[]{0.75f, 0.95f, 1.0f};
    /* renamed from: B */
    public boolean f17052B;
    /* renamed from: C */
    public final List f17053C;
    /* renamed from: D */
    public final List f17054D;
    /* renamed from: E */
    private int[] f17055E;
    /* renamed from: F */
    private float[] f17056F;
    /* renamed from: G */
    private final Handler f17057G;
    /* renamed from: H */
    private final Paint f17058H;
    /* renamed from: I */
    private final Picture f17059I;

    public PulseEmitter(Context context) {
        this(context, null);
    }

    public PulseEmitter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PulseEmitter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17053C = new ArrayList();
        this.f17054D = new ArrayList();
        this.f17059I = new Picture();
        this.f17055E = f17050J;
        this.f17056F = f17051K;
        this.f17057G = new AnonymousClass1JP(this, Looper.getMainLooper());
        Paint paint = new Paint();
        this.f17058H = paint;
        paint.setAntiAlias(true);
        this.f17058H.setDither(true);
        this.f17058H.setFilterBitmap(true);
        if (VERSION.SDK_INT < 23) {
            setLayerType(1, this.f17058H);
        }
    }

    /* renamed from: A */
    public final void m10693A() {
        if (!this.f17052B) {
            this.f17052B = true;
            this.f17057G.sendEmptyMessage(0);
        }
    }

    /* renamed from: B */
    public final void m10694B() {
        if (this.f17052B) {
            this.f17052B = false;
            this.f17057G.removeMessages(0);
            for (Animator cancel : this.f17054D) {
                cancel.cancel();
            }
            this.f17054D.clear();
            this.f17053C.clear();
        }
    }

    /* renamed from: B */
    private void m10692B(int i, int i2) {
        float f = ((float) i) / 2.0f;
        this.f17058H.setShader(new RadialGradient(f, ((float) i2) / 2.0f, f, this.f17055E, this.f17056F, TileMode.CLAMP));
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.m5864N(this, 1526535855);
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            m10693A();
        }
        AnonymousClass0cQ.m5865O(this, 1282001367, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.m5864N(this, 551056016);
        super.onDetachedFromWindow();
        m10694B();
        AnonymousClass0cQ.m5865O(this, 1816822822, N);
    }

    public final void onDraw(Canvas canvas) {
        Canvas beginRecording = this.f17059I.beginRecording(getWidth(), getHeight());
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        beginRecording.drawCircle(width, height, width, this.f17058H);
        for (int i = 0; i < this.f17054D.size(); i++) {
            float floatValue = ((Float) ((ValueAnimator) this.f17054D.get(i)).getAnimatedValue()).floatValue();
            beginRecording.save();
            beginRecording.scale(floatValue, floatValue, width, height);
            beginRecording.drawCircle(width, height, width, this.f17058H);
            beginRecording.restore();
        }
        canvas.drawPicture(this.f17059I);
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (getVisibility() == 0) {
            m10693A();
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.m5864N(this, 216059109);
        super.onSizeChanged(i, i2, i3, i4);
        m10692B(i, i2);
        AnonymousClass0cQ.m5865O(this, 1589603495, N);
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m10694B();
    }

    public void setGradientColors(int[] iArr) {
        this.f17055E = iArr;
        if (getWidth() > 0 && getHeight() > 0) {
            m10692B(getWidth(), getHeight());
        }
    }
}
