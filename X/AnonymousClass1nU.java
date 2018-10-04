package X;

import android.graphics.Rect;
import android.support.v4.widget.SlidingPaneLayout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.1nU */
public final class AnonymousClass1nU extends AnonymousClass12Y {
    /* renamed from: B */
    public final Rect f22746B = new Rect();
    /* renamed from: C */
    public final /* synthetic */ SlidingPaneLayout f22747C;

    public AnonymousClass1nU(SlidingPaneLayout slidingPaneLayout) {
        this.f22747C = slidingPaneLayout;
    }

    /* renamed from: B */
    public final void m13145B(View view, AccessibilityEvent accessibilityEvent) {
        super.B(view, accessibilityEvent);
        accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
    }

    /* renamed from: C */
    public final boolean m13146C(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return !this.f22747C.m13153B(view) ? super.C(viewGroup, view, accessibilityEvent) : false;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AnonymousClass1n2 anonymousClass1n2) {
        AnonymousClass1n2 B = AnonymousClass1n2.m13080B(AccessibilityNodeInfo.obtain(anonymousClass1n2.f22647B));
        super.onInitializeAccessibilityNodeInfo(view, B);
        Rect rect = this.f22746B;
        B.f22647B.getBoundsInParent(rect);
        anonymousClass1n2.f22647B.setBoundsInParent(rect);
        B.f22647B.getBoundsInScreen(rect);
        anonymousClass1n2.f22647B.setBoundsInScreen(rect);
        AnonymousClass1mz anonymousClass1mz = AnonymousClass1n2.f22646C;
        anonymousClass1mz.mo2782Y(anonymousClass1n2.f22647B, anonymousClass1mz.mo2778N(B.f22647B));
        anonymousClass1n2.f22647B.setPackageName(B.f22647B.getPackageName());
        anonymousClass1n2.m13086D(B.f22647B.getClassName());
        anonymousClass1n2.m13089G(B.m13084B());
        anonymousClass1n2.f22647B.setEnabled(B.f22647B.isEnabled());
        anonymousClass1n2.m13087E(B.f22647B.isClickable());
        anonymousClass1n2.m13090H(B.f22647B.isFocusable());
        anonymousClass1n2.f22647B.setFocused(B.f22647B.isFocused());
        anonymousClass1n2.m13085C(AnonymousClass1n2.f22646C.mo2777M(B.f22647B));
        anonymousClass1n2.f22647B.setSelected(B.f22647B.isSelected());
        anonymousClass1n2.f22647B.setLongClickable(B.f22647B.isLongClickable());
        anonymousClass1n2.m13083A(B.f22647B.getActions());
        anonymousClass1mz = AnonymousClass1n2.f22646C;
        anonymousClass1mz.mo2781W(anonymousClass1n2.f22647B, anonymousClass1mz.mo2776K(B.f22647B));
        B.f22647B.recycle();
        anonymousClass1n2.m13086D(SlidingPaneLayout.class.getName());
        anonymousClass1n2.f22647B.setSource(view);
        ViewParent K = AnonymousClass0mE.f9733B.K(view);
        if (K instanceof View) {
            anonymousClass1n2.m13091I((View) K);
        }
        int childCount = this.f22747C.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f22747C.getChildAt(i);
            if (!this.f22747C.m13153B(childAt) && childAt.getVisibility() == 0) {
                AnonymousClass0mE.O(childAt, 1);
                anonymousClass1n2.f22647B.addChild(childAt);
            }
        }
    }
}
