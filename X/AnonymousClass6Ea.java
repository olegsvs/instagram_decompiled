package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.6Ea */
public enum AnonymousClass6Ea extends AnonymousClass5rB {
    public AnonymousClass6Ea(String str, int i) {
        super(str, i);
    }

    /* renamed from: A */
    public final List mo6474A(AnonymousClass0oj anonymousClass0oj) {
        if (anonymousClass0oj == null) {
            return Collections.emptyList();
        }
        List list;
        synchronized (anonymousClass0oj) {
            list = anonymousClass0oj.f10333G;
        }
        return list;
    }
}
