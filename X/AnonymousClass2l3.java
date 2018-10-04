package X;

import android.util.SparseArray;

/* renamed from: X.2l3 */
public enum AnonymousClass2l3 {
    MANIFEST_FETECH_END(1),
    MANIFEST_MISALIGNED(2),
    PREFETCH_CACHE_EVICT(4),
    QUALITY_CHANGED(5),
    SPAN_CHANGED(6),
    QUALITY_SUMMARY(7),
    CACHE_ERROR(8),
    PREFETCH_START(10),
    DATABASE_FULL(12),
    MANIFEST_PARSE_ERROR(13),
    SUGGEST_UNBIND(14),
    CACHED(16);
    
    /* renamed from: P */
    private static final SparseArray f33373P = null;
    /* renamed from: B */
    public final int f33374B;

    static {
        f33373P = new SparseArray();
        AnonymousClass2l3[] values = AnonymousClass2l3.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass2l3 anonymousClass2l3 = values[i];
            f33373P.put(anonymousClass2l3.f33374B, anonymousClass2l3);
            i++;
        }
    }

    private AnonymousClass2l3(int i) {
        this.f33374B = i;
    }

    /* renamed from: B */
    public static AnonymousClass2l3 m17070B(int i) {
        if (f33373P.get(i) != null) {
            return (AnonymousClass2l3) f33373P.get(i);
        }
        throw new IllegalArgumentException("Invalid EventType value");
    }
}
