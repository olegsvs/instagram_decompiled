package X;

import android.util.SparseArray;

/* renamed from: X.14N */
public enum AnonymousClass14N {
    NOT_SHARED(0),
    SHARING(1),
    UNSHARING(2),
    SHARED(3);
    
    /* renamed from: H */
    private static final SparseArray f13882H = null;
    /* renamed from: B */
    private final int f13883B;

    static {
        f13882H = new SparseArray();
        AnonymousClass14N[] values = AnonymousClass14N.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass14N anonymousClass14N = values[i];
            f13882H.put(anonymousClass14N.f13883B, anonymousClass14N);
            i++;
        }
    }

    private AnonymousClass14N(int i) {
        this.f13883B = i;
    }

    /* renamed from: A */
    public final int m9180A() {
        return this.f13883B;
    }

    /* renamed from: B */
    public static AnonymousClass14N m9179B(int i) {
        return (AnonymousClass14N) f13882H.get(i, NOT_SHARED);
    }
}
