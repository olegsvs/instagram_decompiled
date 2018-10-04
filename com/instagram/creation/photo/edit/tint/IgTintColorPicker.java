package com.instagram.creation.photo.edit.tint;

import X.AnonymousClass0Ca;
import X.AnonymousClass0G5;
import X.AnonymousClass0cN;
import X.AnonymousClass0ca;
import X.AnonymousClass0e5;
import X.AnonymousClass0e6;
import X.AnonymousClass3Hg;
import X.AnonymousClass3Hh;
import X.AnonymousClass4YC;
import X.AnonymousClass4YD;
import X.AnonymousClass5Uf;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;

public class IgTintColorPicker extends FrameLayout implements OnTouchListener {
    /* renamed from: B */
    public TextView f55112B;
    /* renamed from: C */
    public AnonymousClass0cN f55113C;
    /* renamed from: D */
    public Paint f55114D;
    /* renamed from: E */
    private boolean f55115E;
    /* renamed from: F */
    private int f55116F;
    /* renamed from: G */
    private boolean f55117G;
    /* renamed from: H */
    private int f55118H;
    /* renamed from: I */
    private int f55119I;
    /* renamed from: J */
    private int f55120J;
    /* renamed from: K */
    private AnonymousClass5Uf f55121K;
    /* renamed from: L */
    private LayerDrawable f55122L;
    /* renamed from: M */
    private Drawable f55123M;
    /* renamed from: N */
    private Drawable f55124N;
    /* renamed from: O */
    private int f55125O;
    /* renamed from: P */
    private AnonymousClass0e6 f55126P;
    /* renamed from: Q */
    private int f55127Q;

    public IgTintColorPicker(Context context) {
        this(context, null);
    }

    public IgTintColorPicker(Context context, AttributeSet attributeSet) {
        super(AnonymousClass0G5.C(context, C0164R.attr.tintPickerStyle), attributeSet);
        Resources resources = context.getResources();
        Paint paint = new Paint();
        this.f55114D = paint;
        paint.setColor(resources.getColor(C0164R.color.grey_5));
        this.f55114D.setFlags(1);
        this.f55114D.setStrokeWidth((float) resources.getDimensionPixelSize(C0164R.dimen.seek_bar_width));
        this.f55120J = AnonymousClass3Hg.values().length;
        this.f55119I = AnonymousClass0G5.D(getContext(), C0164R.attr.tintPickerLineColor);
        LayerDrawable layerDrawable = (LayerDrawable) AnonymousClass0Ca.E(getContext(), AnonymousClass0G5.F(getContext(), C0164R.attr.tintPickerKnob));
        this.f55122L = layerDrawable;
        this.f55124N = layerDrawable.findDrawableByLayerId(C0164R.id.seek_bar_knob_outer_circle);
        this.f55123M = this.f55122L.findDrawableByLayerId(C0164R.id.seek_bar_knob_inner_circle);
        this.f55125O = resources.getDimensionPixelSize(AnonymousClass0G5.F(getContext(), C0164R.attr.tintPickerSelectedSize));
        int C = AnonymousClass3Hh.m19267C(getContext(), AnonymousClass3Hg.NONE, this.f55115E);
        this.f55124N.setColorFilter(AnonymousClass0ca.B(C));
        this.f55123M.setColorFilter(AnonymousClass0ca.B(C));
        this.f55126P = AnonymousClass0e6.B();
        AnonymousClass0e5 C2 = AnonymousClass0e5.C(4.0d, 4.0d);
        AnonymousClass0cN C3 = this.f55126P.C();
        this.f55113C = C3;
        C3.O(C2);
        this.f55113C.A(new AnonymousClass4YC(this));
        this.f55117G = true;
        this.f55115E = true;
        setOnTouchListener(this);
        setWillNotDraw(false);
    }

    /* renamed from: B */
    private int m24470B(int i, int i2) {
        return (getLeftBound() + (i2 / 2)) + ((i2 * i) * 2);
    }

    public boolean getAdjustingShadows() {
        return this.f55115E;
    }

    private int getCenterY() {
        return getHeight() / 2;
    }

    private int getCurrentTintAsValue() {
        return this.f55116F;
    }

    private int getLeftBound() {
        return this.f55127Q;
    }

    public final void onDraw(Canvas canvas) {
        this.f55114D.setColor(-65536);
        this.f55127Q = getWidth() / ((this.f55120J * 2) + 1);
        for (int i = 0; i < this.f55120J; i++) {
            this.f55114D.setColor(AnonymousClass3Hh.m19267C(getContext(), AnonymousClass3Hh.m19266B(i), this.f55115E));
            Canvas canvas2 = canvas;
            int i2;
            if (this.f55116F == i) {
                Drawable drawable = this.f55122L;
                int i3 = this.f55125O;
                int B = m24470B(i, this.f55127Q);
                int centerY = getCenterY();
                i2 = i3 / 2;
                drawable.setBounds(B - i2, centerY - i2, B + i2, centerY + i2);
                this.f55122L.draw(canvas);
            } else {
                float B2 = (float) m24470B(i, this.f55127Q);
                float centerY2 = (float) getCenterY();
                canvas.drawCircle(B2, centerY2, (float) (this.f55127Q / 2), this.f55114D);
                if (i == 0) {
                    this.f55114D.setColor(this.f55119I);
                    i2 = this.f55127Q;
                    canvas2.drawLine(B2 + (((float) i2) / 3.0f), centerY2 - (((float) i2) / 3.0f), B2 - (((float) i2) / 3.0f), centerY2 + (((float) i2) / 3.0f), this.f55114D);
                }
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int leftBound = getLeftBound();
        int width = getWidth() - this.f55127Q;
        int height = view.getHeight();
        int i = leftBound / 2;
        float f = (float) i;
        if (x > f && x < ((float) (i + width)) && y > ((float) (height / 4))) {
            int i2 = (int) ((x - f) / ((((float) width) * 1.0f) / ((float) this.f55120J)));
            if (motionEvent.getActionMasked() == 1) {
                if (i2 == this.f55118H && i2 != 0) {
                    AnonymousClass5Uf anonymousClass5Uf = this.f55121K;
                    anonymousClass5Uf.f65034B.f18437O.N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
                    anonymousClass5Uf.f65034B.f18435M.bringToFront();
                    anonymousClass5Uf.f65034B.f18434L.setVisibility(0);
                    anonymousClass5Uf.f65034B.f18434L.bringToFront();
                }
                this.f55118H = i2;
            }
            if (motionEvent.getActionMasked() == 0 && this.f55117G && i2 != this.f55116F) {
                this.f55112B.setVisibility(0);
                this.f55112B.setPadding(0, getCenterY() + (this.f55127Q / 2), 0, 0);
                postDelayed(new AnonymousClass4YD(this), 2500);
                this.f55117G = false;
            }
            setCurrentColor(i2);
        }
        return true;
    }

    public void setAdjustingShadows(boolean z) {
        if (this.f55115E != z) {
            int C = AnonymousClass3Hh.m19267C(getContext(), AnonymousClass3Hh.m19266B(this.f55116F), z);
            this.f55124N.setColorFilter(AnonymousClass0ca.B(C));
            this.f55123M.setColorFilter(AnonymousClass0ca.B(C));
            this.f55115E = z;
            invalidate();
        }
    }

    public void setCurrentColor(int i) {
        if (this.f55116F != i) {
            this.f55116F = i;
            if (this.f55122L != null) {
                int C = AnonymousClass3Hh.m19267C(getContext(), AnonymousClass3Hh.m19266B(this.f55116F), this.f55115E);
                this.f55124N.setColorFilter(AnonymousClass0ca.B(C));
                this.f55123M.setColorFilter(AnonymousClass0ca.B(C));
            }
            AnonymousClass5Uf anonymousClass5Uf = this.f55121K;
            if (anonymousClass5Uf != null) {
                anonymousClass5Uf.A(i);
            }
            invalidate();
        }
    }

    public void setNux(TextView textView) {
        this.f55112B = textView;
    }

    public void setOnTintColorChangeListener(AnonymousClass5Uf anonymousClass5Uf) {
        this.f55121K = anonymousClass5Uf;
        if (anonymousClass5Uf != null) {
            anonymousClass5Uf.A(getCurrentTintAsValue());
        }
    }
}
