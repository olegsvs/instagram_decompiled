package X;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: X.0Zm */
public abstract class AnonymousClass0Zm {
    /* renamed from: A */
    public abstract boolean mo1381A(Context context, String str);

    /* renamed from: B */
    public abstract void mo1382B(int i, Context context);

    /* renamed from: B */
    public static final ComponentName m5382B(Context context) {
        return new ComponentName(context, context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent().getClassName());
    }
}
