package com.facebook.react.uimanager;

import X.AnonymousClass0mE;
import X.AnonymousClass12Y;
import X.AnonymousClass1n2;
import android.content.Context;
import android.view.View;
import com.facebook.C0164R;
import java.util.Locale;

public final class AccessibilityDelegateUtil {

    /* renamed from: com.facebook.react.uimanager.AccessibilityDelegateUtil$1 */
    public final class C01041 extends AnonymousClass12Y {
        public final /* synthetic */ View val$view;

        public C01041(View view) {
            this.val$view = view;
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AnonymousClass1n2 anonymousClass1n2) {
            super.onInitializeAccessibilityNodeInfo(view, anonymousClass1n2);
            String str = (String) this.val$view.getTag(C0164R.id.accessibility_hint);
            AccessibilityRole accessibilityRole = (AccessibilityRole) this.val$view.getTag(C0164R.id.accessibility_role);
            if (accessibilityRole == null) {
                accessibilityRole = AccessibilityRole.NONE;
            }
            AccessibilityDelegateUtil.setRole(anonymousClass1n2, accessibilityRole, this.val$view.getContext());
            if (str != null) {
                String str2 = (String) anonymousClass1n2.m13084B();
                if (str2 != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str2);
                    stringBuilder.append(", ");
                    stringBuilder.append(str);
                    anonymousClass1n2.m13089G(stringBuilder.toString());
                    return;
                }
                anonymousClass1n2.m13089G(str);
            }
        }
    }

    public enum AccessibilityRole {
        NONE(null),
        BUTTON("android.widget.Button"),
        LINK("android.widget.ViewGroup"),
        SEARCH("android.widget.EditText"),
        IMAGE(r2),
        IMAGEBUTTON(r2),
        KEYBOARDKEY("android.inputmethodservice.Keyboard$Key"),
        TEXT("android.widget.ViewGroup"),
        ADJUSTABLE("android.widget.SeekBar"),
        SUMMARY(r13),
        HEADER(r13);
        
        private final String mValue;

        private AccessibilityRole(String str) {
            this.mValue = str;
        }

        public static AccessibilityRole fromValue(String str) {
            for (AccessibilityRole accessibilityRole : values()) {
                if (accessibilityRole.name().equalsIgnoreCase(str)) {
                    return accessibilityRole;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid accessibility role value: ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public final String getValue() {
            return this.mValue;
        }
    }

    private AccessibilityDelegateUtil() {
    }

    public static void setDelegate(View view) {
        if (!AnonymousClass0mE.G(view)) {
            AnonymousClass0mE.M(view, new C01041(view));
        }
    }

    public static void setRole(AnonymousClass1n2 anonymousClass1n2, AccessibilityRole accessibilityRole, Context context) {
        anonymousClass1n2.m13086D(accessibilityRole.getValue());
        if (Locale.getDefault().getLanguage().equals(new Locale("en").getLanguage())) {
            if (accessibilityRole.equals(AccessibilityRole.LINK)) {
                anonymousClass1n2.m13092J(context.getString(C0164R.string.link_description));
            }
            if (accessibilityRole.equals(AccessibilityRole.SEARCH)) {
                anonymousClass1n2.m13092J(context.getString(C0164R.string.search_description));
            }
            if (accessibilityRole.equals(AccessibilityRole.IMAGE)) {
                anonymousClass1n2.m13092J(context.getString(C0164R.string.image_description));
            }
            if (accessibilityRole.equals(AccessibilityRole.IMAGEBUTTON)) {
                anonymousClass1n2.m13092J(context.getString(C0164R.string.image_button_description));
            }
            if (accessibilityRole.equals(AccessibilityRole.ADJUSTABLE)) {
                anonymousClass1n2.m13092J(context.getString(C0164R.string.adjustable_description));
            }
        }
        if (accessibilityRole.equals(AccessibilityRole.IMAGEBUTTON)) {
            anonymousClass1n2.m13087E(true);
        }
    }
}
