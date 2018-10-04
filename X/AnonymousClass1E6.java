package X;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;

/* renamed from: X.1E6 */
public final class AnonymousClass1E6 extends AnonymousClass1E3 {
    /* renamed from: B */
    public final Object mo2244B(SharedPreferences sharedPreferences, String str, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, false));
        }
        return Boolean.valueOf(sharedPreferences.getBoolean(str, bool.booleanValue()));
    }

    /* renamed from: C */
    public final Object mo2245C(Bundle bundle, String str, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return Boolean.valueOf(bundle.getBoolean(str, false));
        }
        return Boolean.valueOf(bundle.getBoolean(str, bool.booleanValue()));
    }

    /* renamed from: D */
    public final Class mo2246D() {
        return Boolean.class;
    }

    /* renamed from: E */
    public final void mo2247E(Editor editor, String str, Object obj) {
        editor.putBoolean(str, ((Boolean) obj).booleanValue());
    }

    /* renamed from: F */
    public final void mo2248F(Bundle bundle, String str, Object obj) {
        bundle.putBoolean(str, ((Boolean) obj).booleanValue());
    }
}
