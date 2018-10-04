package X;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.1C7 */
public final class AnonymousClass1C7 {
    /* renamed from: C */
    public static final AnonymousClass1C7 f15491C = new AnonymousClass1C7(JsonProperty.USE_DEFAULT_NAME);
    /* renamed from: B */
    public final String f15492B;

    private AnonymousClass1C7(String str) {
        if (str == null || str.contains(":")) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.f15492B = str;
    }

    /* renamed from: B */
    public static AnonymousClass1C7 m9890B(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Invalid name");
        } else if (JsonProperty.USE_DEFAULT_NAME.equals(str)) {
            return f15491C;
        } else {
            return new AnonymousClass1C7(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    if (!this.f15492B.equals(((AnonymousClass1C7) obj).f15492B)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f15492B.hashCode();
    }

    public final String toString() {
        return this.f15492B;
    }
}
