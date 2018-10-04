package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.1xH */
public final class AnonymousClass1xH implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1c6 f24620B;
    /* renamed from: C */
    public final /* synthetic */ List f24621C;

    public AnonymousClass1xH(AnonymousClass1c6 anonymousClass1c6, List list) {
        this.f24620B = anonymousClass1c6;
        this.f24621C = list;
    }

    public final void run() {
        Iterator it = this.f24620B.f20589B.iterator();
        while (it.hasNext()) {
            ((AnonymousClass1H6) it.next()).Ci(this.f24621C);
        }
    }
}
