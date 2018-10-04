package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2oK */
public final class AnonymousClass2oK implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ ArrayList f34255B;
    /* renamed from: C */
    public final /* synthetic */ Object f34256C;

    public AnonymousClass2oK(AnonymousClass2oO anonymousClass2oO, ArrayList arrayList, Object obj) {
        this.f34255B = arrayList;
        this.f34256C = obj;
    }

    public final void run() {
        Iterator it = this.f34255B.iterator();
        while (it.hasNext()) {
            ((AnonymousClass3sw) it.next()).mo5129B(this.f34256C);
        }
    }
}
