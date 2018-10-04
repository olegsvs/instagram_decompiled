package X;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: X.0hY */
public abstract class AnonymousClass0hY {
    /* renamed from: B */
    private static AnonymousClass0hY f8431B;

    /* renamed from: A */
    public abstract void mo2101A(AnonymousClass0hX anonymousClass0hX);

    /* renamed from: B */
    public abstract void mo2102B(AnonymousClass0hX anonymousClass0hX, Class cls);

    /* renamed from: B */
    public static synchronized AnonymousClass0hY m6761B(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0hY anonymousClass2D1;
        synchronized (AnonymousClass0hY.class) {
            if (f8431B == null) {
                if (VERSION.SDK_INT >= 21) {
                    anonymousClass2D1 = new AnonymousClass2D1(context);
                } else {
                    anonymousClass2D1 = new AnonymousClass13z(context, anonymousClass0Cm);
                }
                f8431B = anonymousClass2D1;
            }
            anonymousClass2D1 = f8431B;
        }
        return anonymousClass2D1;
    }
}
