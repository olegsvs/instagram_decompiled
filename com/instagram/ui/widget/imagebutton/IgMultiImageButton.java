package com.instagram.ui.widget.imagebutton;

import X.AnonymousClass0LH;
import X.AnonymousClass0OR;
import X.AnonymousClass0cQ;
import X.AnonymousClass0z0;
import X.AnonymousClass3je;
import X.AnonymousClass3jf;
import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.List;

public class IgMultiImageButton extends IgImageButton implements AnonymousClass0z0, AnimatorListener {
    /* renamed from: B */
    public final ValueAnimator f43773B = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
    /* renamed from: C */
    public List f43774C;
    /* renamed from: D */
    private boolean f43775D;
    /* renamed from: E */
    private AnonymousClass3jf f43776E;
    /* renamed from: F */
    private int f43777F;
    /* renamed from: G */
    private Drawable f43778G;
    /* renamed from: H */
    private Matrix f43779H;
    /* renamed from: I */
    private final AnimatorUpdateListener f43780I = new AnonymousClass3je(this);

    public final void dl() {
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public IgMultiImageButton(Context context) {
        super(context);
    }

    public IgMultiImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IgMultiImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: B */
    public final void m20517B(String str, int i) {
        AnonymousClass0LH.E(str);
        m20515D();
        super.B(str, i);
    }

    /* renamed from: D */
    private void m20515D() {
        this.f43774C = null;
        this.f43778G = null;
        this.f43779H = null;
        AnonymousClass3jf anonymousClass3jf = this.f43776E;
        if (anonymousClass3jf != null) {
            anonymousClass3jf.m20518A(this);
        }
        if (this.f43773B.isRunning()) {
            this.f43773B.end();
        }
    }

    /* renamed from: E */
    private void m20516E() {
        this.f43778G = getDrawable();
        this.f43779H = new Matrix(getImageMatrix());
        this.f43777F = (this.f43777F + 1) % this.f43774C.size();
        C((String) this.f43774C.get(this.f43777F), false);
    }

    public final void kp(Bitmap bitmap) {
        if (this.f43775D && this.f43774C != null && this.f43778G == null) {
            m20516E();
        }
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f43775D && this.f43774C != null) {
            m20516E();
        }
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, 1424477959);
        super.onAttachedToWindow();
        this.f43775D = true;
        this.f43773B.addUpdateListener(this.f43780I);
        this.f43773B.addListener(this);
        if (this.f43774C != null) {
            Runnable runnable = this.f43776E;
            if (runnable != null) {
                synchronized (runnable) {
                    runnable.f43781B.add(this);
                    runnable.f43784E.add(this);
                    if (runnable.f43781B.size() == 1) {
                        runnable.f43782C.postAtTime(AnonymousClass0OR.C(runnable, 378717750), runnable.f43783D + 1200);
                    }
                }
            }
        }
        AnonymousClass0cQ.O(this, -1076086252, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, 2125725766);
        super.onDetachedFromWindow();
        this.f43775D = false;
        this.f43773B.removeAllUpdateListeners();
        this.f43773B.removeUpdateListener(this);
        AnonymousClass3jf anonymousClass3jf = this.f43776E;
        if (anonymousClass3jf != null) {
            anonymousClass3jf.m20518A(this);
        }
        if (this.f43773B.isRunning()) {
            this.f43773B.end();
        }
        AnonymousClass0cQ.O(this, -109999055, N);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f43778G != null) {
            canvas.save();
            canvas.concat(this.f43779H);
            if (this.f43773B.isRunning()) {
                this.f43778G.setAlpha((int) (((Float) this.f43773B.getAnimatedValue()).floatValue() * 255.0f));
            }
            this.f43778G.draw(canvas);
            canvas.restore();
        }
    }

    public void setCoordinator(AnonymousClass3jf anonymousClass3jf) {
        AnonymousClass3jf anonymousClass3jf2 = this.f43776E;
        if (anonymousClass3jf2 != null) {
            anonymousClass3jf2.m20518A(this);
        }
        this.f43776E = anonymousClass3jf;
    }

    public void setUrl(String str) {
        AnonymousClass0LH.E(str);
        m20515D();
        super.setUrl(str);
    }
}
