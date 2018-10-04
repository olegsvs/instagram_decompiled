package X;

/* renamed from: X.12c */
public final class AnonymousClass12c {
    /* renamed from: B */
    public long f13584B = 0;
    /* renamed from: C */
    public AnonymousClass12c f13585C;

    /* renamed from: A */
    public final void m8953A(int i) {
        if (i >= 64) {
            AnonymousClass12c anonymousClass12c = this.f13585C;
            if (anonymousClass12c != null) {
                anonymousClass12c.m8953A(i - 64);
                return;
            }
            return;
        }
        this.f13584B &= (1 << i) ^ -1;
    }

    /* renamed from: B */
    public final int m8954B(int i) {
        AnonymousClass12c anonymousClass12c = this.f13585C;
        if (anonymousClass12c == null) {
            if (i >= 64) {
                return Long.bitCount(this.f13584B);
            }
        } else if (i >= 64) {
            return anonymousClass12c.m8954B(i - 64) + Long.bitCount(this.f13584B);
        }
        return Long.bitCount(this.f13584B & ((1 << i) - 1));
    }

    /* renamed from: B */
    private void m8952B() {
        if (this.f13585C == null) {
            this.f13585C = new AnonymousClass12c();
        }
    }

    /* renamed from: C */
    public final boolean m8955C(int i) {
        if (i >= 64) {
            m8952B();
            return this.f13585C.m8955C(i - 64);
        }
        return (this.f13584B & (1 << i)) != 0;
    }

    /* renamed from: D */
    public final void m8956D(int i, boolean z) {
        if (i >= 64) {
            m8952B();
            this.f13585C.m8956D(i - 64, z);
            return;
        }
        boolean z2 = (this.f13584B & Long.MIN_VALUE) != 0;
        long j = (1 << i) - 1;
        long j2 = this.f13584B;
        this.f13584B = ((j2 & (j ^ -1)) << 1) | (j2 & j);
        if (z) {
            m8959G(i);
        } else {
            m8953A(i);
        }
        if (z2 || this.f13585C != null) {
            m8952B();
            this.f13585C.m8956D(0, z2);
        }
    }

    /* renamed from: E */
    public final boolean m8957E(int i) {
        if (i >= 64) {
            m8952B();
            return this.f13585C.m8957E(i - 64);
        }
        long j = 1 << i;
        boolean z = (this.f13584B & j) != 0;
        this.f13584B &= j ^ -1;
        j--;
        long j2 = this.f13584B;
        this.f13584B = Long.rotateRight(j2 & (j ^ -1), 1) | (j2 & j);
        AnonymousClass12c anonymousClass12c = this.f13585C;
        if (anonymousClass12c != null) {
            if (anonymousClass12c.m8955C(0)) {
                m8959G(63);
            }
            this.f13585C.m8957E(0);
        }
        return z;
    }

    /* renamed from: F */
    public final void m8958F() {
        this.f13584B = 0;
        AnonymousClass12c anonymousClass12c = this.f13585C;
        if (anonymousClass12c != null) {
            anonymousClass12c.m8958F();
        }
    }

    /* renamed from: G */
    public final void m8959G(int i) {
        if (i >= 64) {
            m8952B();
            this.f13585C.m8959G(i - 64);
            return;
        }
        this.f13584B |= 1 << i;
    }

    public final String toString() {
        if (this.f13585C == null) {
            return Long.toBinaryString(this.f13584B);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f13585C.toString());
        stringBuilder.append("xx");
        stringBuilder.append(Long.toBinaryString(this.f13584B));
        return stringBuilder.toString();
    }
}
