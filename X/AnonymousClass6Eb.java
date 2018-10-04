package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.6Eb */
public enum AnonymousClass6Eb extends AnonymousClass5rB {
    public AnonymousClass6Eb(String str, int i) {
        super(str, i);
    }

    /* renamed from: A */
    public final List mo6474A(AnonymousClass0oj anonymousClass0oj) {
        if (anonymousClass0oj == null) {
            return Collections.emptyList();
        }
        List list;
        synchronized (anonymousClass0oj) {
            list = anonymousClass0oj.f10329C;
        }
        return list;
    }
}
