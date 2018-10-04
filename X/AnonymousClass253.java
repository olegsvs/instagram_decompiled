package X;

import com.instagram.common.gallery.Medium;

/* renamed from: X.253 */
public final class AnonymousClass253 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0aa f25719B;

    public AnonymousClass253(AnonymousClass2Uf anonymousClass2Uf, AnonymousClass0aa anonymousClass0aa) {
        this.f25719B = anonymousClass0aa;
    }

    public final void run() {
        AnonymousClass255 anonymousClass255 = (AnonymousClass255) this.f25719B.f6576M;
        AnonymousClass25B anonymousClass25B = (AnonymousClass25B) anonymousClass255.f25722B.get();
        Medium medium = anonymousClass255.f25723C;
        if (anonymousClass25B != null) {
            if (anonymousClass25B.rX(medium)) {
                anonymousClass25B.ko(medium);
            }
        }
    }
}
