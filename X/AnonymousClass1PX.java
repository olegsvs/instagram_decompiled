package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.1PX */
public final class AnonymousClass1PX {
    /* renamed from: B */
    private static final int f18170B = Math.max((int) (((float) Runtime.getRuntime().availableProcessors()) * 1.5f), 3);
    /* renamed from: C */
    public static int f18171C = Integer.MAX_VALUE;
    /* renamed from: D */
    private static volatile AnonymousClass3qo f18172D;
    /* renamed from: E */
    public static final Handler f18173E = new Handler(Looper.getMainLooper());

    /* renamed from: B */
    public static AnonymousClass3qo m11267B() {
        if (f18172D == null) {
            synchronized (AnonymousClass1PX.class) {
                if (f18172D == null) {
                    f18172D = new AnonymousClass3qo(f18170B);
                }
            }
        }
        return f18172D;
    }

    /* renamed from: C */
    public static void m11268C(AnonymousClass2fy anonymousClass2fy) {
        int i = f18171C;
        f18171C = i - 1;
        anonymousClass2fy.f32292B = ((long) i) << 32;
        anonymousClass2fy.f32293C = null;
        anonymousClass2fy.f32294D = 0;
        AnonymousClass1PX.m11267B().f45292B.add(anonymousClass2fy);
    }
}
