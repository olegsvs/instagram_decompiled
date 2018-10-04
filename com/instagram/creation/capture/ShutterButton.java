package com.instagram.creation.capture;

import X.AnonymousClass0G5;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0164R;

public class ShutterButton extends View {
    /* renamed from: B */
    private final int f52480B;
    /* renamed from: C */
    private final int f52481C;
    /* renamed from: D */
    private final int f52482D;
    /* renamed from: E */
    private final int f52483E;
    /* renamed from: F */
    private final int f52484F;
    /* renamed from: G */
    private final int f52485G;
    /* renamed from: H */
    private final int f52486H;
    /* renamed from: I */
    private final int f52487I;
    /* renamed from: J */
    private final int f52488J;
    /* renamed from: K */
    private final int f52489K;
    /* renamed from: L */
    private final int f52490L;
    /* renamed from: M */
    private final int f52491M;
    /* renamed from: N */
    private Integer f52492N;
    /* renamed from: O */
    private Integer f52493O;
    /* renamed from: P */
    private final ArgbEvaluator f52494P;
    /* renamed from: Q */
    private final Paint f52495Q;
    /* renamed from: R */
    private float f52496R;
    /* renamed from: S */
    private final int f52497S;

    public ShutterButton(Context context) {
        this(context, null);
    }

    public ShutterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52494P = new ArgbEvaluator();
        this.f52495Q = new Paint(1);
        this.f52497S = AnonymousClass0G5.D(getContext(), C0164R.attr.captureStrokeRing);
        this.f52486H = AnonymousClass0G5.D(getContext(), C0164R.attr.captureCameraOuterRing);
        this.f52489K = AnonymousClass0G5.D(getContext(), C0164R.attr.captureCameraInnerRing);
        this.f52488J = AnonymousClass0G5.D(getContext(), C0164R.attr.captureCameraOuterRingPressed);
        this.f52491M = AnonymousClass0G5.D(getContext(), C0164R.attr.captureCameraInnerRingPressed);
        this.f52487I = AnonymousClass0G5.D(getContext(), C0164R.attr.captureCameraOuterRing);
        this.f52490L = AnonymousClass0G5.D(getContext(), C0164R.attr.captureCameraInnerRing);
        this.f52480B = AnonymousClass0G5.D(getContext(), C0164R.attr.captureCamcorderOuterRing);
        this.f52483E = AnonymousClass0G5.D(getContext(), C0164R.attr.captureCamcorderInnerRing);
        this.f52482D = AnonymousClass0G5.D(getContext(), C0164R.attr.captureCamcorderOuterRingPressed);
        this.f52485G = AnonymousClass0G5.D(getContext(), C0164R.attr.captureCamcorderInnerRingPressed);
        this.f52481C = AnonymousClass0G5.D(getContext(), C0164R.attr.captureCamcorderOuterRingDisable);
        this.f52484F = AnonymousClass0G5.D(getContext(), C0164R.attr.captureCamcorderInnerRingDisable);
        m23778A(0.0f);
    }

    /* renamed from: A */
    public final void m23778A(float f) {
        if (!isPressed()) {
            if (!isActivated()) {
                if (isEnabled()) {
                    this.f52492N = (Integer) this.f52494P.evaluate(f, Integer.valueOf(this.f52486H), Integer.valueOf(this.f52480B));
                    this.f52493O = (Integer) this.f52494P.evaluate(f, Integer.valueOf(this.f52489K), Integer.valueOf(this.f52483E));
                    return;
                }
                this.f52492N = (Integer) this.f52494P.evaluate(f, Integer.valueOf(this.f52487I), Integer.valueOf(this.f52481C));
                this.f52493O = (Integer) this.f52494P.evaluate(f, Integer.valueOf(this.f52490L), Integer.valueOf(this.f52484F));
                return;
            }
        }
        this.f52492N = (Integer) this.f52494P.evaluate(f, Integer.valueOf(this.f52488J), Integer.valueOf(this.f52482D));
        this.f52493O = (Integer) this.f52494P.evaluate(f, Integer.valueOf(this.f52491M), Integer.valueOf(this.f52485G));
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m23778A(this.f52496R);
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = ((float) canvas.getWidth()) / 2.0f;
        float height = ((float) canvas.getHeight()) / 2.0f;
        float height2 = ((float) canvas.getHeight()) / 2.0f;
        this.f52495Q.setColor(this.f52497S);
        canvas.drawCircle(width, height, height2, this.f52495Q);
        this.f52495Q.setColor(this.f52492N.intValue());
        canvas.drawCircle(width, height, (float) Math.round(0.90909094f * height2), this.f52495Q);
        this.f52495Q.setColor(this.f52493O.intValue());
        canvas.drawCircle(width, height, (float) Math.round(height2 * 0.54545456f), this.f52495Q);
    }

    public void setProgress(float f) {
        this.f52496R = f;
        m23778A(f);
        invalidate();
    }
}
