package X;

import java.util.Iterator;

/* renamed from: X.2oB */
public final class AnonymousClass2oB implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2oF f34239B;

    public AnonymousClass2oB(AnonymousClass2oF anonymousClass2oF) {
        this.f34239B = anonymousClass2oF;
    }

    public final void run() {
        Iterator it = this.f34239B.f34246B.iterator();
        while (it.hasNext()) {
            ((AnonymousClass2o8) it.next()).fBA();
        }
    }
}
