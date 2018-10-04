package X;

import android.content.Context;
import android.text.Editable;

/* renamed from: X.2K0 */
public final class AnonymousClass2K0 {
    /* renamed from: B */
    public static void m15054B(AnonymousClass2K5 anonymousClass2K5, Editable editable, Context context) {
        AnonymousClass2K2 anonymousClass2K2 = (AnonymousClass2K2) AnonymousClass2Jd.m15019D(editable, AnonymousClass2K2.class);
        if (anonymousClass2K2 == null || anonymousClass2K2.f28919B != anonymousClass2K5.f28942M) {
            AnonymousClass2Jd.m15022G(editable, AnonymousClass2K2.class);
            editable.setSpan(new AnonymousClass2K2(context, anonymousClass2K5.f28942M), 0, editable.length(), 18);
        }
    }
}
