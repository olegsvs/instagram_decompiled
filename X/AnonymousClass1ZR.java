package X;

import android.view.ViewGroup;

/* renamed from: X.1ZR */
public final class AnonymousClass1ZR implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass15L f20219B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0ZF f20220C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Pj f20221D;

    public AnonymousClass1ZR(AnonymousClass15L anonymousClass15L, AnonymousClass0Pj anonymousClass0Pj, AnonymousClass0ZF anonymousClass0ZF) {
        this.f20219B = anonymousClass15L;
        this.f20221D = anonymousClass0Pj;
        this.f20220C = anonymousClass0ZF;
    }

    public final void run() {
        AnonymousClass15L anonymousClass15L = this.f20219B;
        AnonymousClass0Pj anonymousClass0Pj = this.f20221D;
        ViewGroup viewGroup = (ViewGroup) anonymousClass15L.f14265C.getParent();
        AnonymousClass1dZ.m12222E(anonymousClass15L.f14265C, this.f20220C, viewGroup.getWidth(), viewGroup.getHeight(), anonymousClass0Pj.m3854D(), true);
    }
}
