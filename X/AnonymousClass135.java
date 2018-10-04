package X;

import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: X.135 */
public final class AnonymousClass135 extends AccessibilityDelegate {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass12Y f13639B;

    public AnonymousClass135(AnonymousClass133 anonymousClass133, AnonymousClass12Y anonymousClass12Y) {
        this.f13639B = anonymousClass12Y;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f13639B.m8937A(view, accessibilityEvent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        AnonymousClass1n4 A = AnonymousClass12Y.f13551D.mo2084A(AnonymousClass12Y.f13550C, view);
        return A != null ? (AccessibilityNodeProvider) A.f22649B : null;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f13639B.mo2053B(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f13639B.onInitializeAccessibilityNodeInfo(view, AnonymousClass1n2.B(accessibilityNodeInfo));
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        AnonymousClass12Y.f13550C.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f13639B.m8939C(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f13639B.mo2054D(view, i, bundle);
    }

    public final void sendAccessibilityEvent(View view, int i) {
        AnonymousClass12Y.f13550C.sendAccessibilityEvent(view, i);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        AnonymousClass12Y.f13550C.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
