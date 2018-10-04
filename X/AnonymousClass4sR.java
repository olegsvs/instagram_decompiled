package X;

import android.content.Context;
import android.net.Uri;

/* renamed from: X.4sR */
public final class AnonymousClass4sR {
    /* renamed from: B */
    public final String f58073B;
    /* renamed from: C */
    public final AnonymousClass0j6 f58074C;
    /* renamed from: D */
    public final AnonymousClass0Cm f58075D;

    public AnonymousClass4sR(Context context, String str, AnonymousClass0Fz anonymousClass0Fz, AnonymousClass0EE anonymousClass0EE, AnonymousClass0Cm anonymousClass0Cm) {
        this.f58074C = new AnonymousClass0j6(context, anonymousClass0Fz, anonymousClass0EE);
        this.f58073B = Uri.encode(str.trim());
        this.f58075D = anonymousClass0Cm;
    }
}
