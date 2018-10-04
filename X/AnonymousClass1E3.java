package X;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;

/* renamed from: X.1E3 */
public abstract class AnonymousClass1E3 {
    /* renamed from: B */
    public static final AnonymousClass1E3 f15829B = new AnonymousClass1E6();
    /* renamed from: C */
    public static final AnonymousClass1E3 f15830C = new AnonymousClass1E5();
    /* renamed from: D */
    public static final AnonymousClass1E3 f15831D = new AnonymousClass1E4();
    /* renamed from: E */
    public static final String f15832E = "KeyValueWrapper";

    /* renamed from: B */
    public abstract Object mo2244B(SharedPreferences sharedPreferences, String str, Object obj);

    /* renamed from: C */
    public abstract Object mo2245C(Bundle bundle, String str, Object obj);

    /* renamed from: D */
    public abstract Class mo2246D();

    /* renamed from: E */
    public abstract void mo2247E(Editor editor, String str, Object obj);

    /* renamed from: F */
    public abstract void mo2248F(Bundle bundle, String str, Object obj);

    /* renamed from: A */
    public final void m10146A(Bundle bundle, Editor editor, String str, String str2) {
        try {
            mo2247E(editor, str2, mo2245C(bundle, str, null));
        } catch (Bundle bundle2) {
            AnonymousClass0Dc.m1244G(f15832E, "bundleToSharedPrefs got ClassCastException", bundle2);
        }
    }
}
