package X;

import android.os.Build.VERSION;

/* renamed from: X.1lD */
public final class AnonymousClass1lD {
    /* renamed from: B */
    public static final AnonymousClass1lC f22449B;

    /* renamed from: B */
    public static String m12934B(int i) {
        if (i == 4) {
            return "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (i == 8) {
            return "CAPABILITY_CAN_FILTER_KEY_EVENTS";
        }
        switch (i) {
            case 1:
                return "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
            case 2:
                return "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: C */
    public static String m12935C(int i) {
        if (i == 4) {
            return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
        }
        if (i == 8) {
            return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (i == 16) {
            return "FLAG_REPORT_VIEW_IDS";
        }
        if (i == 32) {
            return "FLAG_REQUEST_FILTER_KEY_EVENTS";
        }
        switch (i) {
            case 1:
                return "DEFAULT";
            case 2:
                return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
            default:
                return null;
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 18) {
            f22449B = new AnonymousClass2cz();
        } else if (i >= 16) {
            f22449B = new AnonymousClass2O4();
        } else {
            f22449B = new AnonymousClass1lC();
        }
    }
}
