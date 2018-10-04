package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.08p */
public final class AnonymousClass08p {
    /* renamed from: B */
    public final AnonymousClass08r f1009B;
    /* renamed from: C */
    private final Context f1010C;

    public AnonymousClass08p(Context context, AnonymousClass08r anonymousClass08r) {
        this.f1010C = context;
        this.f1009B = anonymousClass08r;
    }

    /* renamed from: A */
    public final AnonymousClass070 m550A() {
        SharedPreferences B = AnonymousClass1D6.m9967B(this.f1010C, AnonymousClass1D6.f15629C);
        String str = JsonProperty.USE_DEFAULT_NAME;
        return new AnonymousClass070(B.getString("fbns_shared_id", str), B.getString("fbns_shared_secret", str), B.getLong("fbns_shared_timestamp", Long.MAX_VALUE));
    }
}
