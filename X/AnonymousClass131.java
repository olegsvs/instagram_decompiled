package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.131 */
public class AnonymousClass131 extends AnonymousClass132 {
    /* renamed from: D */
    public final boolean mo2070D(View view) {
        return view.getFitsSystemWindows();
    }

    /* renamed from: E */
    public final int mo2071E(View view) {
        return view.getImportantForAccessibility();
    }

    /* renamed from: G */
    public final int mo2072G(View view) {
        return view.getMinimumHeight();
    }

    /* renamed from: H */
    public final int mo2073H(View view) {
        return view.getMinimumWidth();
    }

    /* renamed from: K */
    public final ViewParent mo2074K(View view) {
        return view.getParentForAccessibility();
    }

    /* renamed from: M */
    public final boolean mo2075M(View view) {
        return view.hasOverlappingRendering();
    }

    /* renamed from: N */
    public final boolean mo2076N(View view) {
        return view.hasTransientState();
    }

    /* renamed from: U */
    public final boolean mo2077U(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    /* renamed from: V */
    public final void mo2078V(View view) {
        view.postInvalidateOnAnimation();
    }

    /* renamed from: W */
    public final void mo2079W(View view, int i, int i2, int i3, int i4) {
        view.postInvalidateOnAnimation(i, i2, i3, i4);
    }

    /* renamed from: X */
    public final void mo2080X(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* renamed from: Y */
    public final void mo2081Y(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    /* renamed from: Z */
    public void mo2082Z(View view) {
        view.requestFitSystemWindows();
    }

    /* renamed from: a */
    public final void mo2083a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: c */
    public void mo2063c(View view, int i) {
        if (i == 4) {
            i = 2;
        }
        view.setImportantForAccessibility(i);
    }
}
