package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.1L2 */
public class AnonymousClass1L2 {
    /* renamed from: A */
    public boolean m10801A(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return viewParent instanceof AnonymousClass0cB ? ((AnonymousClass0cB) viewParent).onNestedFling(view, f, f2, z) : false;
    }

    /* renamed from: B */
    public boolean m10802B(ViewParent viewParent, View view, float f, float f2) {
        return viewParent instanceof AnonymousClass0cB ? ((AnonymousClass0cB) viewParent).onNestedPreFling(view, f, f2) : false;
    }

    /* renamed from: C */
    public void m10803C(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        if (viewParent instanceof AnonymousClass0cB) {
            ((AnonymousClass0cB) viewParent).onNestedPreScroll(view, i, i2, iArr);
        }
    }

    /* renamed from: D */
    public void m10804D(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        if (viewParent instanceof AnonymousClass0cB) {
            ((AnonymousClass0cB) viewParent).onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: E */
    public void m10805E(ViewParent viewParent, View view, View view2, int i) {
        if (viewParent instanceof AnonymousClass0cB) {
            ((AnonymousClass0cB) viewParent).onNestedScrollAccepted(view, view2, i);
        }
    }

    /* renamed from: F */
    public boolean m10806F(ViewParent viewParent, View view, View view2, int i) {
        return viewParent instanceof AnonymousClass0cB ? ((AnonymousClass0cB) viewParent).onStartNestedScroll(view, view2, i) : false;
    }

    /* renamed from: G */
    public void m10807G(ViewParent viewParent, View view) {
        if (viewParent instanceof AnonymousClass0cB) {
            ((AnonymousClass0cB) viewParent).onStopNestedScroll(view);
        }
    }
}
