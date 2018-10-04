package X;

import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;

/* renamed from: X.133 */
public final class AnonymousClass133 extends AnonymousClass134 {
    /* renamed from: A */
    public final AnonymousClass1n4 mo2084A(AccessibilityDelegate accessibilityDelegate, View view) {
        accessibilityDelegate = accessibilityDelegate.getAccessibilityNodeProvider(view);
        return accessibilityDelegate != null ? new AnonymousClass1n4(accessibilityDelegate) : null;
    }

    /* renamed from: B */
    public final AccessibilityDelegate mo2085B(AnonymousClass12Y anonymousClass12Y) {
        return new AnonymousClass135(this, anonymousClass12Y);
    }

    /* renamed from: C */
    public final boolean mo2086C(AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
    }
}
