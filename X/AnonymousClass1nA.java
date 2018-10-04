package X;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: X.1nA */
public final class AnonymousClass1nA {
    /* renamed from: C */
    public static final AnonymousClass1n9 f22652C;
    /* renamed from: B */
    public final AccessibilityRecord f22653B;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 16) {
            f22652C = new AnonymousClass2d8();
        } else if (i >= 15) {
            f22652C = new AnonymousClass2Od();
        } else {
            f22652C = new AnonymousClass1n9();
        }
    }

    public AnonymousClass1nA(Object obj) {
        this.f22653B = (AccessibilityRecord) obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    AnonymousClass1nA anonymousClass1nA = (AnonymousClass1nA) obj;
                    AccessibilityRecord accessibilityRecord = this.f22653B;
                    if (accessibilityRecord == null) {
                        if (anonymousClass1nA.f22653B != null) {
                        }
                    } else if (!accessibilityRecord.equals(anonymousClass1nA.f22653B)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f22653B;
        return accessibilityRecord == null ? 0 : accessibilityRecord.hashCode();
    }
}
