package X;

import android.util.SparseArray;

/* renamed from: X.27i */
public enum AnonymousClass27i {
    STICKER(0),
    EMOJI(1);
    
    /* renamed from: F */
    private static final SparseArray f26335F = null;
    /* renamed from: B */
    private final int f26336B;

    static {
        f26335F = new SparseArray();
        AnonymousClass27i[] values = AnonymousClass27i.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass27i anonymousClass27i = values[i];
            f26335F.put(anonymousClass27i.f26336B, anonymousClass27i);
            i++;
        }
    }

    private AnonymousClass27i(int i) {
        this.f26336B = i;
    }

    /* renamed from: A */
    public final int m14509A() {
        return this.f26336B;
    }

    /* renamed from: B */
    public static AnonymousClass27i m14508B(int i) {
        return (AnonymousClass27i) f26335F.get(i);
    }
}
