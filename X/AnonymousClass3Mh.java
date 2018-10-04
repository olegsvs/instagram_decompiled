package X;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: X.3Mh */
public final class AnonymousClass3Mh {
    /* renamed from: C */
    public static AnonymousClass3Mh f40499C;
    /* renamed from: B */
    private SharedPreferences f40500B = AnonymousClass0Mu.C("leadAdsPreferences");

    private AnonymousClass3Mh() {
    }

    /* renamed from: A */
    public final boolean m19479A(String str) {
        return !TextUtils.isEmpty(str) && this.f40500B.getBoolean(str, false);
    }

    /* renamed from: B */
    public static AnonymousClass3Mh m19478B() {
        if (f40499C == null) {
            f40499C = new AnonymousClass3Mh();
        }
        return f40499C;
    }

    /* renamed from: B */
    public final void m19480B(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && m19479A(str) != z) {
            this.f40500B.edit().putBoolean(str, z).apply();
        }
    }
}
