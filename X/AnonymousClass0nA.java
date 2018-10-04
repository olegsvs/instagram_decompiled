package X;

import android.content.res.Resources;
import android.graphics.Typeface;

/* renamed from: X.0nA */
public final class AnonymousClass0nA {
    /* renamed from: B */
    private static Typeface f10019B;
    /* renamed from: C */
    private static Typeface f10020C;
    /* renamed from: D */
    public static Typeface f10021D;
    /* renamed from: E */
    private static Typeface f10022E;
    /* renamed from: F */
    public static Typeface f10023F;
    /* renamed from: G */
    private static Typeface f10024G;
    /* renamed from: H */
    public static Typeface f10025H;

    /* renamed from: B */
    public static Typeface m7615B(Resources resources) {
        if (f10019B == null) {
            f10019B = Typeface.createFromAsset(resources.getAssets(), "AvenyTMedium.otf");
        }
        return f10019B;
    }

    /* renamed from: C */
    public static Typeface m7616C(Resources resources) {
        if (f10020C == null) {
            f10020C = Typeface.createFromAsset(resources.getAssets(), "AvenyTRegular.otf");
        }
        return f10020C;
    }

    /* renamed from: D */
    public static Typeface m7617D() {
        if (f10022E == null) {
            f10022E = Typeface.create("sans-serif-black", 0);
        }
        return f10022E;
    }

    /* renamed from: E */
    public static Typeface m7618E() {
        if (f10024G == null) {
            f10024G = Typeface.create("sans-serif-medium", 0);
        }
        return f10024G;
    }
}
