package X;

/* renamed from: X.64S */
public final class AnonymousClass64S {
    /* renamed from: B */
    public int f71463B;
    /* renamed from: C */
    public final AnonymousClass64R f71464C;
    /* renamed from: D */
    public float f71465D;
    /* renamed from: E */
    private final int f71466E;
    /* renamed from: F */
    private final int f71467F;

    public AnonymousClass64S(int i, int i2, int i3, AnonymousClass64R anonymousClass64R) {
        this.f71466E = i;
        this.f71467F = i2;
        this.f71463B = i3;
        this.f71464C = anonymousClass64R;
    }

    /* renamed from: A */
    public final float m28870A(float f) {
        f += ((float) this.f71467F) / ((float) this.f71466E);
        return f > 1.0f ? f - 1.0f : f;
    }
}
