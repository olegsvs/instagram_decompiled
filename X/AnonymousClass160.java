package X;

import java.util.List;

/* renamed from: X.160 */
public final class AnonymousClass160 {
    /* renamed from: B */
    public boolean f14395B;
    /* renamed from: C */
    public boolean f14396C;
    /* renamed from: D */
    public String f14397D;
    /* renamed from: E */
    public List f14398E;
    /* renamed from: F */
    public String f14399F;
    /* renamed from: G */
    public boolean f14400G;
    /* renamed from: H */
    public Integer f14401H;

    public AnonymousClass160(String str, String str2, int i, boolean z, List list, boolean z2) {
        this.f14397D = str;
        this.f14399F = str2;
        this.f14401H = Integer.valueOf(i);
        this.f14400G = z;
        this.f14398E = list;
        this.f14396C = z2;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj instanceof AnonymousClass160) {
                AnonymousClass160 anonymousClass160 = (AnonymousClass160) obj;
                if (this.f14400G == anonymousClass160.f14400G) {
                    if (this.f14396C == anonymousClass160.f14396C) {
                        if (this.f14395B == anonymousClass160.f14395B) {
                            String str = this.f14397D;
                            if (str != null) {
                                if (!str.equals(anonymousClass160.f14397D)) {
                                }
                            } else if (anonymousClass160.f14397D != null) {
                            }
                            str = this.f14399F;
                            if (str != null) {
                                if (!str.equals(anonymousClass160.f14399F)) {
                                }
                            } else if (anonymousClass160.f14399F != null) {
                            }
                            Integer num = this.f14401H;
                            if (num != null) {
                                if (!num.equals(anonymousClass160.f14401H)) {
                                }
                            } else if (anonymousClass160.f14401H != null) {
                            }
                            List list = this.f14398E;
                            if (list != null) {
                                z = list.equals(anonymousClass160.f14398E);
                            } else if (anonymousClass160.f14398E != null) {
                                z = false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        String str = this.f14397D;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        str = this.f14399F;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.f14401H;
        hashCode = (((hashCode + (num != null ? num.hashCode() : 0)) * 31) + this.f14400G) * 31;
        List list = this.f14398E;
        if (list != null) {
            i = list.hashCode();
        }
        return ((((hashCode + i) * 31) + this.f14396C) * 31) + this.f14395B;
    }
}
