package X;

import java.util.Iterator;

/* renamed from: X.2oC */
public final class AnonymousClass2oC implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2oF f34240B;

    public AnonymousClass2oC(AnonymousClass2oF anonymousClass2oF) {
        this.f34240B = anonymousClass2oF;
    }

    public final void run() {
        Iterator it = this.f34240B.f34246B.iterator();
        while (it.hasNext()) {
            ((AnonymousClass2o8) it.next()).Sw();
        }
    }
}
