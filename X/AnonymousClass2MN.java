package X;

import android.graphics.RectF;

/* renamed from: X.2MN */
public final class AnonymousClass2MN {
    /* renamed from: B */
    public static void m15209B(AnonymousClass2MM anonymousClass2MM, RectF rectF, RectF rectF2, RectF rectF3) {
        if (!rectF.equals(rectF2)) {
            if (rectF2 != null) {
                if (anonymousClass2MM == AnonymousClass2MM.Stretch) {
                    rectF3.set(rectF2);
                    return;
                }
                float abs = Math.abs(rectF2.width() / rectF.width());
                float abs2 = Math.abs(rectF2.height() / rectF.height());
                float f = 0.0f;
                switch (anonymousClass2MM.ordinal()) {
                    case 0:
                        f = Math.min(abs, abs2);
                        break;
                    case 1:
                        f = Math.max(abs, abs2);
                        break;
                    case 3:
                        f = 1.0f;
                        break;
                    default:
                        break;
                }
                anonymousClass2MM = Math.abs(rectF.width() * f);
                anonymousClass2MM /= 1073741824;
                float abs3 = Math.abs(rectF.height() * f) / 2.0f;
                rectF3.set(rectF2.centerX() - anonymousClass2MM, rectF2.centerY() - abs3, rectF2.centerX() + anonymousClass2MM, rectF2.centerY() + abs3);
                return;
            }
        }
        rectF3.set(rectF);
    }
}
