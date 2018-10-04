package X;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.0Fm */
public final class AnonymousClass0Fm implements AnonymousClass0EJ {
    /* renamed from: B */
    private final Context f2200B;
    /* renamed from: C */
    private final boolean f2201C;

    public final void onAppForegrounded() {
    }

    public AnonymousClass0Fm(Context context, boolean z) {
        this.f2200B = context;
        this.f2201C = z;
    }

    public final void onAppBackgrounded() {
        if (this.f2201C && VERSION.SDK_INT >= 16) {
            String str = "mediacodec_report_fingerprint";
            if (!Build.FINGERPRINT.equals(AnonymousClass0FH.f2099C.f2100B.getString(str, JsonProperty.USE_DEFAULT_NAME))) {
                AnonymousClass0GG.m1763B(AnonymousClass0Fx.m1698B(), new AnonymousClass48S(this.f2200B), 1556933461);
                AnonymousClass0FH anonymousClass0FH = AnonymousClass0FH.f2099C;
                anonymousClass0FH.f2100B.edit().putString(str, Build.FINGERPRINT).apply();
            }
        }
    }
}
