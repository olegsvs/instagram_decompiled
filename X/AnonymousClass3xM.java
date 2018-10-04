package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3xM */
public final class AnonymousClass3xM implements AnonymousClass376 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3xO f47390B;

    public AnonymousClass3xM(AnonymousClass3xO anonymousClass3xO) {
        this.f47390B = anonymousClass3xO;
    }

    public final void Ll(List list, AnonymousClass37n anonymousClass37n, boolean z, int i) {
        AnonymousClass370 anonymousClass370 = this.f47390B;
        AnonymousClass36h anonymousClass36h = anonymousClass37n.f38117E;
        boolean booleanValue = ((Boolean) AnonymousClass0CC.ub.G()).booleanValue();
        boolean z2 = booleanValue;
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        AnonymousClass3xO.m21698B(arrayList2, anonymousClass370.f37967C, anonymousClass36h, z2);
        for (AnonymousClass36h B : list) {
            AnonymousClass3xO.m21698B(arrayList2, anonymousClass370.f37967C, B, booleanValue);
        }
        arrayList.addAll(AnonymousClass37G.m18610C(anonymousClass370.f37967C, arrayList2));
        new AnonymousClass37F().B(new List[]{arrayList});
        AnonymousClass0F4.f2058E.B(new AnonymousClass37y(list, z, true, i));
    }
}
