package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.6EY */
public enum AnonymousClass6EY extends AnonymousClass5rB {
    public AnonymousClass6EY(String str, int i) {
        super(str, i);
    }

    /* renamed from: A */
    public final List mo6474A(AnonymousClass0oj anonymousClass0oj) {
        if (anonymousClass0oj == null) {
            return Collections.emptyList();
        }
        List list;
        synchronized (anonymousClass0oj) {
            list = anonymousClass0oj.f10328B;
        }
        return list;
    }
}
