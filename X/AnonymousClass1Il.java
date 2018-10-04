package X;

import android.util.SparseArray;

/* renamed from: X.1Il */
public final class AnonymousClass1Il implements AnonymousClass0KO {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0lA f16903B;

    public AnonymousClass1Il(AnonymousClass0lA anonymousClass0lA) {
        this.f16903B = anonymousClass0lA;
    }

    public final void lWA(long j, String str, String str2, SparseArray sparseArray) {
        AnonymousClass0db C = AnonymousClass0db.m6067C();
        C.m6071D("timeSinceStart", j);
        C.m6074G("name", str);
        if (str2 != null) {
            C.m6074G("data", str2);
        }
        this.f16903B.m7238B(C);
    }
}
