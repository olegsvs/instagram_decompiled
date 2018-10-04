package X;

import android.util.LruCache;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: X.2kq */
public final class AnonymousClass2kq {
    /* renamed from: B */
    public LruCache f33304B;
    /* renamed from: C */
    public HashMap f33305C = new HashMap();
    /* renamed from: D */
    private int f33306D;
    /* renamed from: E */
    private int f33307E;

    public AnonymousClass2kq(int i, int i2) {
        this.f33307E = i;
        this.f33306D = i2;
        this.f33304B = new AnonymousClass2kn(this, i);
    }

    /* renamed from: A */
    public final synchronized AnonymousClass2t7 m17038A(AnonymousClass2kp anonymousClass2kp) {
        AnonymousClass2t7 anonymousClass2t7;
        anonymousClass2t7 = (AnonymousClass2t7) this.f33304B.get(anonymousClass2kp);
        if (anonymousClass2t7 != null) {
            ((LruCache) this.f33305C.get(anonymousClass2kp.f33303C)).get(anonymousClass2kp);
        }
        return anonymousClass2t7;
    }

    /* renamed from: B */
    public final synchronized void m17039B(AnonymousClass2kp anonymousClass2kp, AnonymousClass2t7 anonymousClass2t7) {
        LruCache lruCache = (LruCache) this.f33305C.get(anonymousClass2kp.f33303C);
        if (lruCache == null) {
            lruCache = new AnonymousClass2ko(this, this.f33306D);
            this.f33305C.put(anonymousClass2kp.f33303C, lruCache);
        }
        lruCache.put(anonymousClass2kp, anonymousClass2t7);
        this.f33304B.put(anonymousClass2kp, anonymousClass2t7);
    }

    /* renamed from: C */
    public final synchronized AnonymousClass2t7 m17040C(AnonymousClass2kp anonymousClass2kp) {
        AnonymousClass2t7 anonymousClass2t7;
        anonymousClass2t7 = (AnonymousClass2t7) this.f33304B.remove(anonymousClass2kp);
        if (anonymousClass2t7 != null) {
            ((LruCache) this.f33305C.get(anonymousClass2kp.f33303C)).remove(anonymousClass2kp);
        }
        return anonymousClass2t7;
    }

    /* renamed from: D */
    public final synchronized void m17041D(int i, int i2) {
        if (i > 0) {
            if (i2 > 0) {
                LruCache anonymousClass2ko;
                Map snapshot;
                if (i2 != this.f33306D) {
                    for (Entry entry : this.f33305C.entrySet()) {
                        anonymousClass2ko = new AnonymousClass2ko(this, i2);
                        snapshot = ((LruCache) entry.getValue()).snapshot();
                        for (AnonymousClass2kp anonymousClass2kp : snapshot.keySet()) {
                            anonymousClass2ko.put(anonymousClass2kp, snapshot.get(anonymousClass2kp));
                        }
                        this.f33305C.put(entry.getKey(), anonymousClass2ko);
                    }
                    this.f33306D = i2;
                }
                if (i != this.f33307E) {
                    anonymousClass2ko = new AnonymousClass2kn(this, i);
                    snapshot = this.f33304B.snapshot();
                    for (AnonymousClass2kp anonymousClass2kp2 : snapshot.keySet()) {
                        anonymousClass2ko.put(anonymousClass2kp2, snapshot.get(anonymousClass2kp2));
                    }
                    this.f33304B = anonymousClass2ko;
                    this.f33307E = i;
                }
            }
        }
    }
}
