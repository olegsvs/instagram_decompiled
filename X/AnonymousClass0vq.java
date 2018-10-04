package X;

import com.fasterxml.jackson.core.JsonParser;

/* renamed from: X.0vq */
public final class AnonymousClass0vq {
    /* renamed from: B */
    public String f12143B;
    /* renamed from: C */
    public String f12144C;
    /* renamed from: D */
    public String f12145D;
    /* renamed from: E */
    public String f12146E;
    /* renamed from: F */
    public AnonymousClass0xM f12147F;
    /* renamed from: G */
    public String f12148G;
    /* renamed from: H */
    public String f12149H;
    /* renamed from: I */
    public String f12150I;
    /* renamed from: J */
    public String f12151J;

    public AnonymousClass0vq(String str, String str2, String str3, int i) {
        this.f12145D = str;
        this.f12148G = str2;
        this.f12151J = str3;
        this.f12147F = AnonymousClass0xM.m8532B(i);
    }

    /* renamed from: B */
    public static AnonymousClass0vq m8372B(JsonParser jsonParser, boolean z) {
        return AnonymousClass12D.parseFromJson(jsonParser);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj instanceof AnonymousClass0vq) {
                AnonymousClass0vq anonymousClass0vq = (AnonymousClass0vq) obj;
                if (this.f12147F == anonymousClass0vq.f12147F) {
                    String str = this.f12151J;
                    if (str != null) {
                        if (!str.equals(anonymousClass0vq.f12151J)) {
                        }
                    } else if (anonymousClass0vq.f12151J != null) {
                    }
                    str = this.f12148G;
                    if (str != null) {
                        if (!str.equals(anonymousClass0vq.f12148G)) {
                        }
                    } else if (anonymousClass0vq.f12148G != null) {
                    }
                    str = this.f12145D;
                    if (str != null) {
                        if (!str.equals(anonymousClass0vq.f12145D)) {
                        }
                    } else if (anonymousClass0vq.f12145D != null) {
                    }
                    str = this.f12149H;
                    if (str != null) {
                        if (!str.equals(anonymousClass0vq.f12149H)) {
                        }
                    } else if (anonymousClass0vq.f12149H != null) {
                    }
                    str = this.f12144C;
                    if (str != null) {
                        if (!str.equals(anonymousClass0vq.f12144C)) {
                        }
                    } else if (anonymousClass0vq.f12144C != null) {
                    }
                    str = this.f12143B;
                    if (str != null) {
                        if (!str.equals(anonymousClass0vq.f12143B)) {
                        }
                    } else if (anonymousClass0vq.f12143B != null) {
                    }
                    str = this.f12146E;
                    if (str != null) {
                        if (!str.equals(anonymousClass0vq.f12146E)) {
                        }
                    } else if (anonymousClass0vq.f12146E != null) {
                    }
                    str = this.f12150I;
                    if (str != null) {
                        z = str.equals(anonymousClass0vq.f12150I);
                    } else if (anonymousClass0vq.f12150I != null) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        AnonymousClass0xM anonymousClass0xM = this.f12147F;
        int i = 0;
        int hashCode = (anonymousClass0xM != null ? anonymousClass0xM.hashCode() : 0) * 31;
        String str = this.f12151J;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f12148G;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f12145D;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f12149H;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f12144C;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f12143B;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f12146E;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f12150I;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
