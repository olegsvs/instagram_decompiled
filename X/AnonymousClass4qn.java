package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4qn */
public final class AnonymousClass4qn implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4qr f57864B;

    public AnonymousClass4qn(AnonymousClass4qr anonymousClass4qr) {
        this.f57864B = anonymousClass4qr;
    }

    public final void run() {
        List<Integer> arrayList = new ArrayList();
        for (AnonymousClass4qo anonymousClass4qo : this.f57864B.f57876C.values()) {
            if (AnonymousClass4qr.m25206B(this.f57864B, anonymousClass4qo)) {
                AnonymousClass1gZ anonymousClass1gZ = this.f57864B.f57875B;
                int i = anonymousClass4qo.f57865B;
                List arrayList2 = new ArrayList();
                for (AnonymousClass4qp add : anonymousClass4qo.f57866C.values()) {
                    arrayList2.add(add);
                }
                anonymousClass1gZ.Rr(i, arrayList2);
                arrayList.add(Integer.valueOf(anonymousClass4qo.f57865B));
            }
        }
        for (Integer remove : arrayList) {
            this.f57864B.f57876C.remove(remove);
        }
    }
}
