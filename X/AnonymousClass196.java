package X;

import android.graphics.Color;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.196 */
public final class AnonymousClass196 {
    /* renamed from: B */
    public String f15065B;
    /* renamed from: C */
    public boolean f15066C;
    /* renamed from: D */
    public String f15067D;
    /* renamed from: E */
    public String f15068E;
    /* renamed from: F */
    public String f15069F;
    /* renamed from: G */
    public String f15070G;
    /* renamed from: H */
    public float f15071H = -1.0f;
    /* renamed from: I */
    public float f15072I = -1.0f;
    /* renamed from: J */
    public int f15073J = -1;

    public AnonymousClass196(AnonymousClass2GV anonymousClass2GV) {
        this.f15065B = AnonymousClass196.m9645B(anonymousClass2GV.f28304B);
        this.f15067D = anonymousClass2GV.f28305C;
        this.f15069F = anonymousClass2GV.f28306D;
        this.f15070G = AnonymousClass196.m9645B(anonymousClass2GV.f28307E);
        this.f15072I = anonymousClass2GV.f28308F;
        this.f15073J = anonymousClass2GV.f28309G;
    }

    /* renamed from: A */
    public final int m9646A() {
        String str = this.f15065B;
        if (str == null) {
            return 0;
        }
        return Color.parseColor(str);
    }

    /* renamed from: B */
    public final int m9647B() {
        String str = this.f15070G;
        if (str == null) {
            return 0;
        }
        return Color.parseColor(str);
    }

    /* renamed from: B */
    public static String m9645B(int i) {
        return StringFormatUtil.formatStrLocaleSafe("#%06x", Integer.valueOf(i & 16777215));
    }

    /* renamed from: C */
    public final boolean m9648C() {
        float f = this.f15071H;
        return f >= 0.0f && f <= 1.0f;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    AnonymousClass196 anonymousClass196 = (AnonymousClass196) obj;
                    if (this.f15066C == anonymousClass196.f15066C) {
                        if (Float.compare(anonymousClass196.f15071H, this.f15071H) == 0) {
                            String str = this.f15065B;
                            if (str != null) {
                                if (!str.equals(anonymousClass196.f15065B)) {
                                }
                            } else if (anonymousClass196.f15065B != null) {
                            }
                            str = this.f15067D;
                            if (str != null) {
                                if (!str.equals(anonymousClass196.f15067D)) {
                                }
                            } else if (anonymousClass196.f15067D != null) {
                            }
                            str = this.f15068E;
                            if (str != null) {
                                if (!str.equals(anonymousClass196.f15068E)) {
                                }
                            } else if (anonymousClass196.f15068E != null) {
                            }
                            str = this.f15069F;
                            if (str != null) {
                                if (!str.equals(anonymousClass196.f15069F)) {
                                }
                            } else if (anonymousClass196.f15069F != null) {
                            }
                            str = this.f15070G;
                            if (str != null) {
                                z = str.equals(anonymousClass196.f15070G);
                            } else if (anonymousClass196.f15070G != null) {
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
        int i = this.f15066C * 31;
        float f = this.f15071H;
        int i2 = 0;
        int floatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        String str = this.f15065B;
        floatToIntBits = (floatToIntBits + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f15067D;
        floatToIntBits = (floatToIntBits + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f15068E;
        floatToIntBits = (floatToIntBits + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f15069F;
        floatToIntBits = (floatToIntBits + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f15070G;
        if (str != null) {
            i2 = str.hashCode();
        }
        return floatToIntBits + i2;
    }
}
