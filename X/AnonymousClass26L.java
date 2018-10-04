package X;

/* renamed from: X.26L */
public enum AnonymousClass26L {
    NONE(0),
    TOP_LEFT(1),
    TOP_RIGHT(2),
    BOTTOM_RIGHT(4),
    BOTTOM_LEFT(8),
    ALL(15);
    
    /* renamed from: B */
    private int f26017B;

    private AnonymousClass26L(int i) {
        this.f26017B = i;
    }

    /* renamed from: A */
    public final int m14431A() {
        return this.f26017B;
    }

    /* renamed from: B */
    public final boolean m14432B(int i) {
        int i2 = this.f26017B;
        return (i & i2) == i2;
    }
}
