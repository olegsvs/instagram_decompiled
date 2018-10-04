package X;

import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

/* renamed from: X.2fV */
public class AnonymousClass2fV extends AnonymousClass2fK {
    /* renamed from: A */
    public final void mo3639A(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
        accessibilityNodeInfo.addAction((AccessibilityAction) obj);
    }

    /* renamed from: O */
    public final Object mo3640O(int i, CharSequence charSequence) {
        return new AccessibilityAction(i, charSequence);
    }

    /* renamed from: Q */
    public final Object mo3634Q(int i, int i2, boolean z, int i3) {
        return CollectionInfo.obtain(i, i2, z, i3);
    }

    /* renamed from: R */
    public final Object mo3635R(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        return CollectionItemInfo.obtain(i, i2, i3, i4, z, z2);
    }

    /* renamed from: S */
    public final boolean mo3641S(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
        return accessibilityNodeInfo.removeAction((AccessibilityAction) obj);
    }
}
