package X;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2FQ */
public final class AnonymousClass2FQ {
    /* renamed from: C */
    public static AnonymousClass2FQ f28041C;
    /* renamed from: B */
    public SharedPreferences f28042B = AnonymousClass0Mu.C("direct_v2_preferences");

    /* renamed from: A */
    public final void m14827A() {
        this.f28042B.edit().clear().apply();
        f28041C = null;
    }

    /* renamed from: B */
    public static AnonymousClass2FQ m14826B() {
        if (f28041C == null) {
            f28041C = new AnonymousClass2FQ();
        }
        return f28041C;
    }

    /* renamed from: B */
    public final Set m14828B() {
        return this.f28042B.getStringSet("direct_v2_threads_inline_group_naming_dismissed", new HashSet(0));
    }
}
