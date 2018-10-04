package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2nQ */
public final class AnonymousClass2nQ {
    /* renamed from: B */
    public volatile List f34059B = Collections.unmodifiableList(new ArrayList());

    /* renamed from: A */
    public final synchronized boolean m17194A(Object obj) {
        if (this.f34059B.contains(obj)) {
            return false;
        }
        List arrayList = new ArrayList(this.f34059B.size() + 1);
        arrayList.addAll(this.f34059B);
        arrayList.add(obj);
        this.f34059B = Collections.unmodifiableList(arrayList);
        return true;
    }

    /* renamed from: B */
    public final synchronized void m17195B() {
        this.f34059B = Collections.unmodifiableList(new ArrayList());
    }

    /* renamed from: C */
    public final synchronized boolean m17196C(Object obj) {
        boolean z;
        z = false;
        if (this.f34059B.contains(obj)) {
            int size = this.f34059B.size();
            int i = size - 1;
            List arrayList = new ArrayList(i);
            int indexOf = this.f34059B.indexOf(obj);
            if (indexOf > 0) {
                arrayList.addAll(this.f34059B.subList(0, indexOf));
            }
            z = true;
            if (indexOf < i) {
                arrayList.addAll(this.f34059B.subList(indexOf + 1, size));
            }
            this.f34059B = Collections.unmodifiableList(arrayList);
        }
        return z;
    }
}
