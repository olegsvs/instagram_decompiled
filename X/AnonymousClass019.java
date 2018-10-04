package X;

import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.019 */
public final class AnonymousClass019 {
    /* renamed from: B */
    private static final Map f144B = new HashMap();

    /* renamed from: B */
    public static synchronized void m70B(Looper looper) {
        synchronized (AnonymousClass019.class) {
            AnonymousClass018 anonymousClass018 = (AnonymousClass018) f144B.get(looper);
            if (anonymousClass018 != null) {
                anonymousClass018.dumpToLogCat();
            }
        }
    }
}
