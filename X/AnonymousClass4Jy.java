package X;

import java.util.List;

/* renamed from: X.4Jy */
public final class AnonymousClass4Jy implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ List f52745B;
    /* renamed from: C */
    public final /* synthetic */ List f52746C;
    /* renamed from: D */
    public final /* synthetic */ List f52747D;
    /* renamed from: E */
    public final /* synthetic */ List f52748E;

    public AnonymousClass4Jy(AnonymousClass4Jz anonymousClass4Jz, List list, List list2, List list3, List list4) {
        this.f52746C = list;
        this.f52748E = list2;
        this.f52745B = list3;
        this.f52747D = list4;
    }

    public final void run() {
        for (AnonymousClass3zH nw : this.f52746C) {
            nw.nw();
        }
        for (AnonymousClass4HG nw2 : this.f52748E) {
            nw2.nw();
        }
        for (AnonymousClass3Gc C : this.f52745B) {
            C.m19213C();
        }
        for (AnonymousClass3Gh C2 : this.f52747D) {
            C2.m19217C();
        }
    }
}
