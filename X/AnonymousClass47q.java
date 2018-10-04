package X;

import java.nio.ByteBuffer;

/* renamed from: X.47q */
public final class AnonymousClass47q {
    /* renamed from: B */
    public int f50568B;
    /* renamed from: C */
    public final ByteBuffer f50569C;
    /* renamed from: D */
    public int f50570D;

    public AnonymousClass47q(ByteBuffer byteBuffer) {
        this.f50569C = byteBuffer;
        byteBuffer.mark();
        m23342B();
    }

    /* renamed from: A */
    public final void m23343A() {
        this.f50570D = 0;
        this.f50568B = 0;
        this.f50569C.reset();
    }

    /* renamed from: B */
    private int m23342B() {
        int i = this.f50570D;
        this.f50570D = (this.f50569C.position() < this.f50569C.limit() ? 1 : null) != null ? this.f50569C.get() & 255 : -1;
        this.f50568B = 0;
        return i;
    }

    /* renamed from: C */
    public final int m23344C() {
        int i = this.f50570D;
        if (i == -1) {
            return -1;
        }
        int i2 = this.f50568B;
        i = (i >> (7 - i2)) & 1;
        i2++;
        this.f50568B = i2;
        if (i2 == 8) {
            m23342B();
        }
        return i;
    }

    /* renamed from: D */
    public final int m23345D() {
        if (this.f50568B > 0) {
            m23342B();
        }
        return m23342B();
    }

    /* renamed from: E */
    public final int m23346E() {
        int i = 0;
        while (m23344C() == 0) {
            i++;
        }
        if (i > 0) {
            return m23347F(i) + ((1 << i) - 1);
        }
        return 0;
    }

    /* renamed from: F */
    public final int m23347F(int i) {
        AnonymousClass1Cy.D(i < 32);
        if (this.f50570D == -1) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 << 1) | m23344C();
        }
        return i2;
    }
}
