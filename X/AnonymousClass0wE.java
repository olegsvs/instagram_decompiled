package X;

import java.lang.ref.WeakReference;

/* renamed from: X.0wE */
public final class AnonymousClass0wE {
    /* renamed from: B */
    public WeakReference f12243B;
    /* renamed from: C */
    public AnonymousClass0pY f12244C;
    /* renamed from: D */
    public final AnonymousClass0wF f12245D = new AnonymousClass0wF();

    /* renamed from: B */
    public static void m8426B(AnonymousClass0wE anonymousClass0wE) {
        anonymousClass0wE.f12245D.f12246B.clear();
        AnonymousClass0wF anonymousClass0wF = anonymousClass0wE.f12245D;
        WeakReference weakReference = new WeakReference(anonymousClass0wE.f12244C);
        if (weakReference != null) {
            anonymousClass0wF.f12246B.add(weakReference);
        }
        AnonymousClass0wF anonymousClass0wF2 = anonymousClass0wE.f12245D;
        weakReference = anonymousClass0wE.f12243B;
        if (weakReference != null) {
            anonymousClass0wF2.f12246B.add(weakReference);
        }
    }
}
