package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.3G3 */
public abstract class AnonymousClass3G3 {
    /* renamed from: B */
    public static long m19157B(Drawable drawable) {
        if (drawable instanceof AnonymousClass2VC) {
            drawable = ((AnonymousClass2VC) drawable).m16108A();
            if (drawable instanceof AnonymousClass2Ut) {
                return ((AnonymousClass2Ut) drawable).TL();
            }
        }
        return 0;
    }

    /* renamed from: C */
    public static boolean m19158C(Drawable drawable) {
        return AnonymousClass3G3.m19159D(drawable) != null ? true : null;
    }

    /* renamed from: D */
    public static AnonymousClass2Ut m19159D(Drawable drawable) {
        if (drawable instanceof AnonymousClass2VC) {
            drawable = ((AnonymousClass2VC) drawable).m16108A();
            if (drawable instanceof AnonymousClass2Ut) {
                return (AnonymousClass2Ut) drawable;
            }
        }
        return null;
    }
}
