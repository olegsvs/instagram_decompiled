package X;

import android.content.Context;

/* renamed from: X.1BO */
public final class AnonymousClass1BO {
    /* renamed from: B */
    public static int m9813B(AnonymousClass0Cm anonymousClass0Cm) {
        return AnonymousClass0HV.m2008D(anonymousClass0Cm).f2646B.getInt("contacts_count", 0);
    }

    /* renamed from: C */
    public static boolean m9814C(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        return AnonymousClass1Ba.m9838D(context, "android.permission.READ_CONTACTS") && AnonymousClass0HV.m2008D(anonymousClass0Cm).f2646B.getBoolean("allow_contacts_sync", false);
    }
}
