package com.facebook.browser.lite.views;

import X.AnonymousClass0ea;
import X.AnonymousClass1qm;
import X.AnonymousClass1qn;
import X.AnonymousClass1rI;
import X.AnonymousClass2PN;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class BrowserLiteWrapperView extends LinearLayout {
    /* renamed from: B */
    public ArgbEvaluator f23434B;
    /* renamed from: C */
    public View f23435C;
    /* renamed from: D */
    public AnonymousClass2PN f23436D;
    /* renamed from: E */
    public AnonymousClass1qn f23437E;
    /* renamed from: F */
    public AnonymousClass1qm f23438F;
    /* renamed from: G */
    public boolean f23439G;
    /* renamed from: H */
    public int f23440H;
    /* renamed from: I */
    public int f23441I;
    /* renamed from: J */
    public float f23442J;
    /* renamed from: K */
    private ObjectAnimator f23443K;
    /* renamed from: L */
    private int f23444L;
    /* renamed from: M */
    private ViewPropertyAnimator f23445M;

    public BrowserLiteWrapperView(Context context) {
        super(context);
    }

    public BrowserLiteWrapperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: A */
    public final void m13491A(int i, String str) {
        m13492B(0.0f, 300, null, new AnonymousClass1rI(this, i, str));
        this.f23439G = true;
    }

    /* renamed from: B */
    public final void m13492B(float f, long j, Interpolator interpolator, Runnable runnable) {
        if (!this.f23439G) {
            float f2 = this.f23442J;
            if (f < f2) {
                f = f2;
            } else if (f > 0.0f) {
                f = 0.0f;
            }
            float f3 = (f / this.f23442J) * 0.7f;
            this.f23443K = ObjectAnimator.ofFloat(this.f23435C, "alpha", new float[]{f3}).setDuration(j);
            this.f23445M = animate().y(f).setDuration(j);
            AnonymousClass0ea.D(this.f23438F.getActivity(), ((Integer) this.f23434B.evaluate(1.0f - (f / this.f23442J), Integer.valueOf(this.f23440H), Integer.valueOf(this.f23441I))).intValue());
            if (runnable != null) {
                this.f23445M.withEndAction(runnable);
            }
            if (interpolator != null) {
                this.f23445M.setInterpolator(interpolator);
                this.f23443K.setInterpolator(interpolator);
            }
            this.f23443K.start();
            this.f23445M.start();
        }
    }

    /* renamed from: B */
    public static void m13489B(BrowserLiteWrapperView browserLiteWrapperView) {
        Activity activity = browserLiteWrapperView.f23438F.getActivity();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        browserLiteWrapperView.f23444L = displayMetrics.heightPixels;
        LayoutParams layoutParams = browserLiteWrapperView.f23435C.getLayoutParams();
        int heightPx = browserLiteWrapperView.f23436D.f30186C.getHeightPx();
        layoutParams.height = browserLiteWrapperView.f23444L + heightPx;
        browserLiteWrapperView.f23435C.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) browserLiteWrapperView.f23438F.HJ().getLayoutParams();
        int i = browserLiteWrapperView.f23444L;
        layoutParams2.height = i;
        layoutParams2.setMargins(layoutParams2.leftMargin, -heightPx, layoutParams2.rightMargin, layoutParams2.bottomMargin);
        browserLiteWrapperView.f23438F.HJ().setLayoutParams(layoutParams2);
        LayoutParams layoutParams3 = browserLiteWrapperView.getLayoutParams();
        layoutParams3.height = browserLiteWrapperView.f23444L + i;
        browserLiteWrapperView.setLayoutParams(layoutParams3);
        browserLiteWrapperView.f23442J = (float) (-i);
    }

    /* renamed from: C */
    public final void m13493C() {
        if (!this.f23439G) {
            ObjectAnimator objectAnimator = this.f23443K;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f23445M;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
        }
    }

    /* renamed from: C */
    public static void m13490C(BrowserLiteWrapperView browserLiteWrapperView, float f, float f2) {
        browserLiteWrapperView.setY(f);
        browserLiteWrapperView.f23435C.setAlpha(f2);
    }

    /* renamed from: D */
    public final boolean m13494D(String str) {
        if (this.f23439G) {
            return false;
        }
        m13491A(0, str);
        return true;
    }

    /* renamed from: E */
    public final void m13495E(int i, int i2) {
        WebView IT = this.f23437E.IT();
        if (IT != null) {
            IT.flingScroll(i, i2);
        }
    }

    public int getChromeContainerHeight() {
        return this.f23436D.f30186C.getHeightPx();
    }

    public int[] getChromeContainerLocationInWindow() {
        if (this.f23438F.mJ() == null) {
            return null;
        }
        int[] iArr = new int[2];
        this.f23438F.mJ().getLocationInWindow(iArr);
        return iArr;
    }

    public int getUsableScreenHeight() {
        return this.f23444L;
    }

    public int getWebViewScrollY() {
        WebView IT = this.f23437E.IT();
        if (IT == null) {
            return -1;
        }
        return IT.getScrollY();
    }

    public float getWrapperViewTopY() {
        return this.f23442J;
    }

    public void setWebViewScrollY(int i) {
        WebView IT = this.f23437E.IT();
        if (IT != null) {
            IT.setScrollY(i);
        }
    }
}
