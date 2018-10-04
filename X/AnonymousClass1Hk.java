package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.1Hk */
public final class AnonymousClass1Hk {
    /* renamed from: B */
    public final String f16799B;
    /* renamed from: C */
    public AnonymousClass0em f16800C = new AnonymousClass0em(AnonymousClass0EV.f1977B, this.f16799B, new AnonymousClass1Hl(this));

    public AnonymousClass1Hk(String str) {
        this.f16799B = str;
    }

    /* renamed from: A */
    public final synchronized List m10628A() {
        List arrayList;
        AnonymousClass0Sy.m4433B();
        AnonymousClass1Hm anonymousClass1Hm = (AnonymousClass1Hm) this.f16800C.m6427A(this.f16799B, false);
        Long.valueOf(System.currentTimeMillis() - System.currentTimeMillis());
        arrayList = new ArrayList();
        if (anonymousClass1Hm != null) {
            arrayList.addAll(Collections.unmodifiableList(anonymousClass1Hm.f16801B));
        }
        return arrayList;
    }

    /* renamed from: B */
    public final synchronized void m10629B(List list) {
        AnonymousClass0Sy.m4433B();
        long currentTimeMillis = System.currentTimeMillis();
        this.f16800C.m6428B(this.f16799B);
        if (list.size() > 20) {
            list = list.subList(0, 20);
        }
        this.f16800C.m6429C(this.f16799B, new AnonymousClass1Hm(new LinkedList(list)));
        Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
    }
}
