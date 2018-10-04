package X;

import java.lang.ref.WeakReference;

/* renamed from: X.38m */
public final class AnonymousClass38m {
    /* renamed from: B */
    public int f38275B;
    /* renamed from: C */
    public AnonymousClass38t f38276C;
    /* renamed from: D */
    public WeakReference f38277D;
    /* renamed from: E */
    public int f38278E;

    /* renamed from: A */
    public final void m18739A(AnonymousClass3yU anonymousClass3yU) {
        this.f38277D = anonymousClass3yU != null ? new WeakReference(anonymousClass3yU) : null;
        anonymousClass3yU = this.f38276C;
        if (anonymousClass3yU != null) {
            anonymousClass3yU.f38298E = this.f38277D;
            anonymousClass3yU.f38297D.addListener(anonymousClass3yU.f38296C);
            anonymousClass3yU.onAnimationUpdate(anonymousClass3yU.f38297D);
        }
    }
}
