package X;

import java.util.Map;

/* renamed from: X.49K */
public final class AnonymousClass49K implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass49L f50896B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass49O f50897C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass30W f50898D;

    public AnonymousClass49K(AnonymousClass49L anonymousClass49L, AnonymousClass30W anonymousClass30W, AnonymousClass49O anonymousClass49O) {
        this.f50896B = anonymousClass49L;
        this.f50898D = anonymousClass30W;
        this.f50897C = anonymousClass49O;
    }

    public final void run() {
        AnonymousClass0IJ anonymousClass0IJ = this.f50896B.f50899B;
        Map map = this.f50898D.f36815B;
        Map map2 = this.f50898D.f36819F;
        AnonymousClass0Iw anonymousClass0Iw = this.f50897C;
        AnonymousClass0GA E = AnonymousClass0hR.E(anonymousClass0IJ.f50911H, anonymousClass0IJ.f50908E, anonymousClass0IJ.f50910G, map.keySet(), map2.keySet(), anonymousClass0IJ.f50909F.f36823D, anonymousClass0IJ.f50909F.m18175D(), anonymousClass0IJ.f50909F.f36821B.f36865F, AnonymousClass30Y.m18170D(anonymousClass0IJ.f50909F.f36821B));
        E.f2849B = anonymousClass0Iw;
        anonymousClass0IJ.schedule(E);
    }
}
