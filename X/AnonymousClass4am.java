package X;

import android.os.Bundle;
import java.util.UUID;

/* renamed from: X.4am */
public final class AnonymousClass4am {
    /* renamed from: B */
    public String f55542B;
    /* renamed from: C */
    public String f55543C;
    /* renamed from: D */
    public String f55544D;

    public AnonymousClass4am(String str) {
        this(str, UUID.randomUUID().toString(), null);
    }

    private AnonymousClass4am(String str, String str2, String str3) {
        this.f55542B = str;
        this.f55543C = str3;
        this.f55544D = str2;
    }

    /* renamed from: A */
    public final void m24539A(Bundle bundle) {
        bundle.putString("source_module", this.f55542B);
        bundle.putString("thread_id", this.f55543C);
        bundle.putString("waterfall_id", this.f55544D);
    }

    /* renamed from: B */
    public static AnonymousClass4am m24538B(Bundle bundle) {
        return new AnonymousClass4am(bundle.getString("source_module"), bundle.getString("waterfall_id"), bundle.getString("thread_id"));
    }
}
