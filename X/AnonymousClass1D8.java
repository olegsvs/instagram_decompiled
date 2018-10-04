package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;

/* renamed from: X.1D8 */
public abstract class AnonymousClass1D8 {
    /* renamed from: B */
    public static final AnonymousClass1D8 f15638B;

    /* renamed from: A */
    public abstract SharedPreferences mo93A(Context context, String str, boolean z);

    static {
        if (VERSION.SDK_INT >= 11) {
            f15638B = new AnonymousClass1D9();
        } else {
            f15638B = new AnonymousClass0AI();
        }
    }

    /* renamed from: B */
    public static void m9968B(Editor editor) {
        if (VERSION.SDK_INT >= 9) {
            editor.apply();
        } else {
            editor.commit();
        }
    }
}
