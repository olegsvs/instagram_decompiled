package X;

import android.content.Context;

/* renamed from: X.09X */
public final class AnonymousClass09X {
    /* renamed from: B */
    private static AnonymousClass21c f1086B;

    /* renamed from: B */
    public static synchronized AnonymousClass21c m618B(Context context) {
        AnonymousClass21c anonymousClass21c;
        synchronized (AnonymousClass09X.class) {
            if (f1086B == null) {
                Context applicationContext = context.getApplicationContext();
                f1086B = new AnonymousClass2TZ(new AnonymousClass21n(applicationContext), applicationContext);
            }
            anonymousClass21c = f1086B;
        }
        return anonymousClass21c;
    }
}
