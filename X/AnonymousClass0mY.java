package X;

import android.content.res.Resources;
import com.facebook.C0164R;

/* renamed from: X.0mY */
public final class AnonymousClass0mY {
    /* renamed from: B */
    public static boolean f9819B;

    /* renamed from: B */
    public static int m7540B(Resources resources, int i) {
        int dimensionPixelSize = resources.getDimensionPixelSize(C0164R.dimen.carousel_horizontal_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C0164R.dimen.card_spacing);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(C0164R.dimen.card_width);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(C0164R.dimen.min_card_width);
        int i2 = i - dimensionPixelSize;
        double d = (double) (i - (((i2 / dimensionPixelSize3) * dimensionPixelSize2) + dimensionPixelSize));
        Double.isNaN(d);
        int i3 = (int) (d / 2.5d);
        d = (double) (i - (dimensionPixelSize + ((i2 / dimensionPixelSize4) * dimensionPixelSize2)));
        Double.isNaN(d);
        int i4 = (int) (d / 2.25d);
        if (dimensionPixelSize4 <= i3 && i3 <= dimensionPixelSize3) {
            return i3;
        }
        if (dimensionPixelSize4 <= i4 && i4 <= dimensionPixelSize3) {
            return i4;
        }
        if (i3 > dimensionPixelSize3) {
            return dimensionPixelSize3;
        }
        if (i4 < dimensionPixelSize4) {
            return dimensionPixelSize4;
        }
        return Math.max(i3, dimensionPixelSize3);
    }

    /* renamed from: C */
    public static void m7541C(AnonymousClass0mX anonymousClass0mX, int i, int i2, AnonymousClass0mW anonymousClass0mW, AnonymousClass0EE anonymousClass0EE, String str, boolean z) {
        String str2;
        String str3;
        String str4 = null;
        String id = anonymousClass0mW != null ? anonymousClass0mW.getId() : null;
        if (anonymousClass0mW != null) {
            str2 = anonymousClass0mW.f9810I;
        } else {
            str2 = null;
        }
        if (anonymousClass0mW != null) {
            str3 = anonymousClass0mW.f9803B;
        } else {
            str3 = null;
        }
        if (anonymousClass0mW != null) {
            str4 = anonymousClass0mW.f9807F;
        }
        anonymousClass0mX.m7537B(anonymousClass0EE, id, str2, str3, str4, Integer.valueOf(i), i2, str, z);
    }

    /* renamed from: D */
    public static void m7542D(AnonymousClass0mX anonymousClass0mX, int i, int i2, String str, String str2, String str3, String str4, AnonymousClass0EE anonymousClass0EE, String str5, boolean z, String str6, String str7) {
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        AnonymousClass0EE anonymousClass0EE2 = anonymousClass0EE;
        anonymousClass0mX.m7539D(anonymousClass0EE2, str8, str9, str10, str11, Integer.valueOf(i), i2, str5, z, null, str6, str7);
    }
}
