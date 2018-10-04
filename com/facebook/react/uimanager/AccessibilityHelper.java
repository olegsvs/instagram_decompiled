package com.facebook.react.uimanager;

import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.RadioButton;

public final class AccessibilityHelper {
    private static final AccessibilityDelegate BUTTON_DELEGATE = new C01051();
    private static final AccessibilityDelegate RADIOBUTTON_CHECKED_DELEGATE = new C01062();
    private static final AccessibilityDelegate RADIOBUTTON_UNCHECKED_DELEGATE = new C01073();

    /* renamed from: com.facebook.react.uimanager.AccessibilityHelper$1 */
    public final class C01051 extends AccessibilityDelegate {
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(Button.class.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(Button.class.getName());
        }
    }

    /* renamed from: com.facebook.react.uimanager.AccessibilityHelper$2 */
    public final class C01062 extends AccessibilityDelegate {
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(RadioButton.class.getName());
            accessibilityEvent.setChecked(true);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(RadioButton.class.getName());
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    /* renamed from: com.facebook.react.uimanager.AccessibilityHelper$3 */
    public final class C01073 extends AccessibilityDelegate {
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(RadioButton.class.getName());
            accessibilityEvent.setChecked(false);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(RadioButton.class.getName());
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(false);
        }
    }

    public static void sendAccessibilityEvent(View view, int i) {
        view.sendAccessibilityEvent(i);
    }

    public static void updateAccessibilityComponentType(View view, String str) {
        if (str == null) {
            view.setAccessibilityDelegate(null);
            return;
        }
        Object obj = -1;
        int hashCode = str.hashCode();
        if (hashCode != -1377687758) {
            if (hashCode != -1320494052) {
                if (hashCode == -714126251) {
                    if (str.equals("radiobutton_checked")) {
                        obj = 1;
                    }
                }
            } else if (str.equals("radiobutton_unchecked")) {
                obj = 2;
            }
        } else if (str.equals("button")) {
            obj = null;
        }
        switch (obj) {
            case null:
                view.setAccessibilityDelegate(BUTTON_DELEGATE);
                break;
            case 1:
                view.setAccessibilityDelegate(RADIOBUTTON_CHECKED_DELEGATE);
                break;
            case 2:
                view.setAccessibilityDelegate(RADIOBUTTON_UNCHECKED_DELEGATE);
                break;
            default:
                view.setAccessibilityDelegate(null);
                break;
        }
    }
}
