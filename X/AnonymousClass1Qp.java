package X;

/* renamed from: X.1Qp */
public enum AnonymousClass1Qp {
    SQUARE,
    RECTANGULAR;
    
    /* renamed from: E */
    private static AnonymousClass1Qp[] f18466E;

    static {
        f18466E = AnonymousClass1Qp.values();
    }

    /* renamed from: A */
    public final AnonymousClass1Qp m11373A() {
        return f18466E[(ordinal() + 1) % f18466E.length];
    }
}
