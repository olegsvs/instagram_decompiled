package X;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.common.dextricks.DexStore;

/* renamed from: X.1n2 */
public final class AnonymousClass1n2 {
    /* renamed from: C */
    public static final AnonymousClass1mz f22646C;
    /* renamed from: B */
    public final AccessibilityNodeInfo f22647B;

    /* renamed from: D */
    private static String m13082D(int i) {
        switch (i) {
            case 1:
                return "ACTION_FOCUS";
            case 2:
                return "ACTION_CLEAR_FOCUS";
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case DexStore.LOAD_RESULT_DEX2OAT_QUICKENED /*512*/:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case DexStore.LOAD_RESULT_MIXED_MODE /*1024*/:
                return "ACTION_NEXT_HTML_ELEMENT";
            case DexStore.LOAD_RESULT_OATMEAL_QUICKEN_ATTEMPTED /*2048*/:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case DexStore.LOAD_RESULT_DEX2OAT_QUICKEN_ATTEMPTED /*4096*/:
                return "ACTION_SCROLL_FORWARD";
            case DexStore.LOAD_RESULT_MIXED_MODE_ATTEMPTED /*8192*/:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 24) {
            f22646C = new AnonymousClass2fb();
        } else if (i >= 23) {
            f22646C = new AnonymousClass2fa();
        } else if (i >= 22) {
            f22646C = new AnonymousClass2fZ();
        } else if (i >= 21) {
            f22646C = new AnonymousClass2fV();
        } else if (i >= 19) {
            f22646C = new AnonymousClass2fK();
        } else if (i >= 18) {
            f22646C = new AnonymousClass2ez();
        } else if (i >= 17) {
            f22646C = new AnonymousClass2d5();
        } else if (i >= 16) {
            f22646C = new AnonymousClass2OZ();
        } else {
            f22646C = new AnonymousClass1mz();
        }
    }

    private AnonymousClass1n2(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f22647B = accessibilityNodeInfo;
    }

    public AnonymousClass1n2(Object obj) {
        this.f22647B = (AccessibilityNodeInfo) obj;
    }

    /* renamed from: A */
    public final void m13083A(int i) {
        this.f22647B.addAction(i);
    }

    /* renamed from: B */
    public static AnonymousClass1n2 m13080B(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new AnonymousClass1n2(accessibilityNodeInfo);
    }

    /* renamed from: B */
    public final CharSequence m13084B() {
        return this.f22647B.getContentDescription();
    }

    /* renamed from: C */
    public static AnonymousClass1n2 m13081C(Object obj) {
        return obj != null ? new AnonymousClass1n2(obj) : null;
    }

    /* renamed from: C */
    public final void m13085C(boolean z) {
        f22646C.mo2780T(this.f22647B, z);
    }

    /* renamed from: D */
    public final void m13086D(CharSequence charSequence) {
        this.f22647B.setClassName(charSequence);
    }

    /* renamed from: E */
    public final void m13087E(boolean z) {
        this.f22647B.setClickable(z);
    }

    /* renamed from: F */
    public final void m13088F(Object obj) {
        f22646C.mo3637V(this.f22647B, ((AnonymousClass1n1) obj).f22645B);
    }

    /* renamed from: G */
    public final void m13089G(CharSequence charSequence) {
        this.f22647B.setContentDescription(charSequence);
    }

    /* renamed from: H */
    public final void m13090H(boolean z) {
        this.f22647B.setFocusable(z);
    }

    /* renamed from: I */
    public final void m13091I(View view) {
        this.f22647B.setParent(view);
    }

    /* renamed from: J */
    public final void m13092J(CharSequence charSequence) {
        f22646C.mo3638X(this.f22647B, charSequence);
    }

    /* renamed from: K */
    public final void m13093K(boolean z) {
        this.f22647B.setScrollable(z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    AnonymousClass1n2 anonymousClass1n2 = (AnonymousClass1n2) obj;
                    AccessibilityNodeInfo accessibilityNodeInfo = this.f22647B;
                    if (accessibilityNodeInfo == null) {
                        if (anonymousClass1n2.f22647B != null) {
                        }
                    } else if (!accessibilityNodeInfo.equals(anonymousClass1n2.f22647B)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f22647B;
        return accessibilityNodeInfo == null ? 0 : accessibilityNodeInfo.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        this.f22647B.getBoundsInParent(rect);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("; boundsInParent: ");
        stringBuilder2.append(rect);
        stringBuilder.append(stringBuilder2.toString());
        this.f22647B.getBoundsInScreen(rect);
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("; boundsInScreen: ");
        stringBuilder2.append(rect);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append("; packageName: ");
        stringBuilder.append(this.f22647B.getPackageName());
        stringBuilder.append("; className: ");
        stringBuilder.append(this.f22647B.getClassName());
        stringBuilder.append("; text: ");
        stringBuilder.append(this.f22647B.getText());
        stringBuilder.append("; contentDescription: ");
        stringBuilder.append(m13084B());
        stringBuilder.append("; viewId: ");
        stringBuilder.append(f22646C.mo3621L(this.f22647B));
        stringBuilder.append("; checkable: ");
        stringBuilder.append(this.f22647B.isCheckable());
        stringBuilder.append("; checked: ");
        stringBuilder.append(this.f22647B.isChecked());
        stringBuilder.append("; focusable: ");
        stringBuilder.append(this.f22647B.isFocusable());
        stringBuilder.append("; focused: ");
        stringBuilder.append(this.f22647B.isFocused());
        stringBuilder.append("; selected: ");
        stringBuilder.append(this.f22647B.isSelected());
        stringBuilder.append("; clickable: ");
        stringBuilder.append(this.f22647B.isClickable());
        stringBuilder.append("; longClickable: ");
        stringBuilder.append(this.f22647B.isLongClickable());
        stringBuilder.append("; enabled: ");
        stringBuilder.append(this.f22647B.isEnabled());
        stringBuilder.append("; password: ");
        stringBuilder.append(this.f22647B.isPassword());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("; scrollable: ");
        stringBuilder2.append(this.f22647B.isScrollable());
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append("; [");
        int actions = this.f22647B.getActions();
        while (actions != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
            actions &= numberOfTrailingZeros ^ -1;
            stringBuilder.append(AnonymousClass1n2.m13082D(numberOfTrailingZeros));
            if (actions != 0) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
