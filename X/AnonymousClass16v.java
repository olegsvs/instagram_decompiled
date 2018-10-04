package X;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: X.16v */
public final class AnonymousClass16v extends AnonymousClass16w {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0xy f14620B;
    /* renamed from: C */
    public final /* synthetic */ WeakReference f14621C;

    public AnonymousClass16v(AnonymousClass0xy anonymousClass0xy, WeakReference weakReference) {
        this.f14620B = anonymousClass0xy;
        this.f14621C = weakReference;
    }

    /* renamed from: A */
    public final void mo2162A(AnonymousClass16u anonymousClass16u) {
        for (String str : anonymousClass16u.f14618B) {
            this.f14620B.f12677B.remove(str);
            List<WeakReference> list = (List) this.f14620B.f12678C.get(str);
            if (list != null) {
                for (WeakReference weakReference : list) {
                    AnonymousClass3b5 anonymousClass3b5 = (AnonymousClass3b5) weakReference.get();
                    if (anonymousClass3b5 != null) {
                        anonymousClass3b5.Aq(str);
                    }
                }
            }
            this.f14620B.f12678C.remove(str);
        }
        WeakReference weakReference2 = this.f14621C;
        if (weakReference2 != null) {
            AnonymousClass41X anonymousClass41X = (AnonymousClass41X) weakReference2.get();
        }
    }

    /* renamed from: C */
    public final void mo2163C(AnonymousClass16u anonymousClass16u, Map map) {
        for (String str : anonymousClass16u.f14618B) {
            this.f14620B.f12677B.remove(str);
            List<WeakReference> list = (List) this.f14620B.f12678C.get(str);
            if (list != null) {
                for (WeakReference weakReference : list) {
                    AnonymousClass3b5 anonymousClass3b5 = (AnonymousClass3b5) weakReference.get();
                    if (anonymousClass3b5 != null) {
                        anonymousClass3b5.Fq(str, false);
                    }
                }
            }
            this.f14620B.f12678C.remove(str);
        }
        WeakReference weakReference2 = this.f14621C;
        if (weakReference2 != null) {
            AnonymousClass41X anonymousClass41X = (AnonymousClass41X) weakReference2.get();
            if (anonymousClass41X != null) {
                anonymousClass41X.A();
            }
        }
    }
}
