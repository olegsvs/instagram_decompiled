package X;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.0T1 */
public final class AnonymousClass0T1 {
    /* renamed from: B */
    public static Object m4441B(Context context, Class cls) {
        while (!cls.isInstance(context)) {
            if (context instanceof ContextWrapper) {
                Context baseContext = ((ContextWrapper) context).getBaseContext();
                if (context != baseContext) {
                    context = baseContext;
                }
            }
            return null;
        }
        return cls.cast(context);
    }
}
