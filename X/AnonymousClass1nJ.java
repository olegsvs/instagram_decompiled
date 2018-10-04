package X;

import android.graphics.Rect;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

/* renamed from: X.1nJ */
public final class AnonymousClass1nJ extends AnonymousClass12Y {
    /* renamed from: B */
    public final Rect f22695B = new Rect();
    /* renamed from: C */
    public final /* synthetic */ DrawerLayout f22696C;

    public AnonymousClass1nJ(DrawerLayout drawerLayout) {
        this.f22696C = drawerLayout;
    }

    /* renamed from: A */
    public final boolean m13107A(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.A(view, accessibilityEvent);
        }
        List text = accessibilityEvent.getText();
        View H = this.f22696C.m13116H();
        if (H != null) {
            CharSequence K = this.f22696C.m13131K(this.f22696C.m13132L(H));
            if (K != null) {
                text.add(K);
            }
        }
        return true;
    }

    /* renamed from: B */
    public final void m13108B(View view, AccessibilityEvent accessibilityEvent) {
        super.B(view, accessibilityEvent);
        accessibilityEvent.setClassName(DrawerLayout.class.getName());
    }

    /* renamed from: C */
    public final boolean m13109C(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (!DrawerLayout.f22707j) {
            if (!DrawerLayout.m13111C(view)) {
                return false;
            }
        }
        return super.C(viewGroup, view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AnonymousClass1n2 anonymousClass1n2) {
        if (DrawerLayout.f22707j) {
            super.onInitializeAccessibilityNodeInfo(view, anonymousClass1n2);
        } else {
            AnonymousClass1n2 B = AnonymousClass1n2.m13080B(AccessibilityNodeInfo.obtain(anonymousClass1n2.f22647B));
            super.onInitializeAccessibilityNodeInfo(view, B);
            anonymousClass1n2.f22647B.setSource(view);
            ViewParent K = AnonymousClass0mE.f9733B.K(view);
            if (K instanceof View) {
                anonymousClass1n2.m13091I((View) K);
            }
            Rect rect = this.f22695B;
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
            B.f22647B.recycle();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m13111C(childAt)) {
                    anonymousClass1n2.f22647B.addChild(childAt);
                }
            }
        }
        anonymousClass1n2.m13086D(DrawerLayout.class.getName());
        anonymousClass1n2.m13090H(false);
        anonymousClass1n2.f22647B.setFocused(false);
        AnonymousClass1my anonymousClass1my = AnonymousClass1my.f22642D;
        AnonymousClass1mz anonymousClass1mz2 = AnonymousClass1n2.f22646C;
        anonymousClass1mz2.mo3641S(anonymousClass1n2.f22647B, anonymousClass1my.f22643B);
        anonymousClass1mz2.mo3641S(anonymousClass1n2.f22647B, AnonymousClass1my.f22641C.f22643B);
    }
}
