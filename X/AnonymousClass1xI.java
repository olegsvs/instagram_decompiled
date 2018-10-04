package X;

import java.util.Iterator;

/* renamed from: X.1xI */
public final class AnonymousClass1xI implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1c6 f24622B;
    /* renamed from: C */
    public final /* synthetic */ int f24623C;

    public AnonymousClass1xI(AnonymousClass1c6 anonymousClass1c6, int i) {
        this.f24622B = anonymousClass1c6;
        this.f24623C = i;
    }

    public final void run() {
        Iterator it = this.f24622B.f20589B.iterator();
        while (it.hasNext()) {
            ((AnonymousClass1H6) it.next()).vAA(this.f24623C);
        }
    }
}
