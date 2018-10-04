package X;

import android.content.Context;
import android.util.LruCache;

/* renamed from: X.0mz */
public final class AnonymousClass0mz {
    /* renamed from: B */
    private static final LruCache f9957B = new LruCache(100);

    /* renamed from: B */
    public static String m7581B(AnonymousClass0P7 anonymousClass0P7, Context context, boolean z) {
        AnonymousClass0Sy.m4434C();
        if (z) {
            return anonymousClass0P7.HA();
        }
        LruCache lruCache = f9957B;
        if (lruCache.get(anonymousClass0P7.NO()) != null) {
            return (String) lruCache.get(anonymousClass0P7.NO());
        }
        String str = AnonymousClass0Gz.f2522C.AHA(anonymousClass0P7.m3794x(context)).f6453E;
        f9957B.put(anonymousClass0P7.NO(), str);
        return str;
    }
}
