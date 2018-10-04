package X;

import java.util.Iterator;

/* renamed from: X.1eE */
public final class AnonymousClass1eE implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1c6 f20953B;
    /* renamed from: C */
    public final /* synthetic */ int f20954C;
    /* renamed from: D */
    public final /* synthetic */ int f20955D;

    public AnonymousClass1eE(AnonymousClass1c6 anonymousClass1c6, int i, int i2) {
        this.f20953B = anonymousClass1c6;
        this.f20955D = i;
        this.f20954C = i2;
    }

    public final void run() {
        Iterator it = this.f20953B.f20589B.iterator();
        while (it.hasNext()) {
            ((AnonymousClass1H6) it.next()).GGA(this.f20955D, this.f20954C);
        }
    }
}
