package X;

import java.util.Iterator;

/* renamed from: X.2o9 */
public final class AnonymousClass2o9 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2oF f34237B;

    public AnonymousClass2o9(AnonymousClass2oF anonymousClass2oF) {
        this.f34237B = anonymousClass2oF;
    }

    public final void run() {
        Iterator it = this.f34237B.f34246B.iterator();
        while (it.hasNext()) {
            ((AnonymousClass2o8) it.next()).us();
        }
    }
}
