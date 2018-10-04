package X;

import android.content.Context;

/* renamed from: X.5r7 */
public final class AnonymousClass5r7 implements AnonymousClass19O {
    /* renamed from: B */
    private Context f69396B;
    /* renamed from: C */
    private boolean f69397C;

    public AnonymousClass5r7(Context context, boolean z) {
        this.f69396B = context;
        this.f69397C = z;
    }

    /* renamed from: B */
    public static AnonymousClass19O m28561B(Context context, AnonymousClass1bR anonymousClass1bR) {
        return (anonymousClass1bR == null || !"value".equalsIgnoreCase(anonymousClass1bR.f20462D) || anonymousClass1bR.f20460B == null) ? null : new AnonymousClass5r7(context, anonymousClass1bR.f20460B.booleanValue());
    }

    public final boolean GHA(AnonymousClass0T7 anonymousClass0T7, AnonymousClass0oj anonymousClass0oj) {
        return this.f69397C == AnonymousClass0EF.K(this.f69396B);
    }
}
