package X;

import android.util.SparseArray;

/* renamed from: X.3f9 */
public enum AnonymousClass3f9 {
    PHOTO(0),
    VIDEO(1),
    OTHER(2);
    
    /* renamed from: G */
    private static final SparseArray f43101G = null;
    /* renamed from: B */
    public final int f43102B;

    static {
        f43101G = new SparseArray();
        AnonymousClass3f9[] values = AnonymousClass3f9.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass3f9 anonymousClass3f9 = values[i];
            f43101G.put(anonymousClass3f9.f43102B, anonymousClass3f9);
            i++;
        }
    }

    private AnonymousClass3f9(int i) {
        this.f43102B = i;
    }

    /* renamed from: A */
    public final int m20344A() {
        return this.f43102B;
    }
}
