package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: X.3v9 */
public final class AnonymousClass3v9 implements AnonymousClass2uj {
    /* renamed from: B */
    public float f46774B = 1.0f;
    /* renamed from: C */
    public AnonymousClass2v6 f46775C;
    /* renamed from: D */
    public float f46776D = 1.0f;
    /* renamed from: E */
    private ByteBuffer f46777E;
    /* renamed from: F */
    private int f46778F = -1;
    /* renamed from: G */
    private long f46779G;
    /* renamed from: H */
    private boolean f46780H;
    /* renamed from: I */
    private ByteBuffer f46781I;
    /* renamed from: J */
    private long f46782J;
    /* renamed from: K */
    private int f46783K = -1;
    /* renamed from: L */
    private int f46784L;
    /* renamed from: M */
    private int f46785M = -1;
    /* renamed from: N */
    private ShortBuffer f46786N;

    public final int AP() {
        return 2;
    }

    public AnonymousClass3v9() {
        ByteBuffer byteBuffer = AnonymousClass2uj.f35676B;
        this.f46777E = byteBuffer;
        this.f46786N = byteBuffer.asShortBuffer();
        this.f46781I = AnonymousClass2uj.f35676B;
        this.f46784L = -1;
    }

    /* renamed from: A */
    public final long m21468A(long j) {
        long j2 = this.f46782J;
        long j3 = j;
        if (j2 >= 1024) {
            long a;
            int i = this.f46783K;
            int i2 = this.f46785M;
            if (i == i2) {
                a = AnonymousClass2yi.m18106a(j3, this.f46779G, j2);
            } else {
                a = AnonymousClass2yi.m18106a(j3, this.f46779G * ((long) i), j2 * ((long) i2));
            }
            return a;
        }
        double d = (double) this.f46776D;
        double d2 = (double) j;
        Double.isNaN(d);
        Double.isNaN(d2);
        return (long) (d * d2);
    }

    public final int BP() {
        return this.f46783K;
    }

    public final boolean EF(int i, int i2, int i3) {
        if (i3 == 2) {
            int i4 = this.f46784L;
            if (i4 == -1) {
                i4 = i;
            }
            if (this.f46785M == i && this.f46778F == i2 && this.f46783K == i4) {
                return false;
            }
            this.f46785M = i;
            this.f46778F = i2;
            this.f46783K = i4;
            this.f46775C = null;
            return true;
        }
        throw new AnonymousClass2ui(i, i2, i3);
    }

    public final boolean OX() {
        if (this.f46780H) {
            AnonymousClass2v6 anonymousClass2v6 = this.f46775C;
            if (anonymousClass2v6 == null || anonymousClass2v6.f35750O == 0) {
                return true;
            }
        }
        return false;
    }

    public final void YIA() {
        int i;
        AnonymousClass2yO.m18017F(this.f46775C != null);
        AnonymousClass2v6 anonymousClass2v6 = this.f46775C;
        int i2 = anonymousClass2v6.f35740E;
        float f = anonymousClass2v6.f35758W;
        float f2 = anonymousClass2v6.f35751P;
        int i3 = anonymousClass2v6.f35750O + ((int) ((((((float) i2) / (f / f2)) + ((float) anonymousClass2v6.f35753R)) / (anonymousClass2v6.f35756U * f2)) + 0.5f));
        anonymousClass2v6.f35739D = AnonymousClass2v6.m17755D(anonymousClass2v6, anonymousClass2v6.f35739D, i2, (anonymousClass2v6.f35744I * 2) + i2);
        int i4 = 0;
        while (true) {
            i = anonymousClass2v6.f35744I;
            int i5 = i * 2;
            int i6 = anonymousClass2v6.f35737B;
            if (i4 >= i5 * i6) {
                break;
            }
            anonymousClass2v6.f35739D[(i6 * i2) + i4] = (short) 0;
            i4++;
        }
        anonymousClass2v6.f35740E += i * 2;
        AnonymousClass2v6.m17759H(anonymousClass2v6);
        if (anonymousClass2v6.f35750O > i3) {
            anonymousClass2v6.f35750O = i3;
        }
        anonymousClass2v6.f35740E = 0;
        anonymousClass2v6.f35757V = 0;
        anonymousClass2v6.f35753R = 0;
        this.f46780H = true;
    }

    public final void ZIA(ByteBuffer byteBuffer) {
        AnonymousClass2yO.m18017F(this.f46775C != null);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f46779G += (long) remaining;
            AnonymousClass2v6 anonymousClass2v6 = this.f46775C;
            int remaining2 = asShortBuffer.remaining();
            int i = anonymousClass2v6.f35737B;
            remaining2 /= i;
            int i2 = (i * remaining2) * 2;
            short[] D = AnonymousClass2v6.m17755D(anonymousClass2v6, anonymousClass2v6.f35739D, anonymousClass2v6.f35740E, remaining2);
            anonymousClass2v6.f35739D = D;
            asShortBuffer.get(D, anonymousClass2v6.f35740E * anonymousClass2v6.f35737B, i2 / 2);
            anonymousClass2v6.f35740E += remaining2;
            AnonymousClass2v6.m17759H(anonymousClass2v6);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int i3 = (this.f46775C.f35750O * this.f46778F) * 2;
        if (i3 > 0) {
            if (this.f46777E.capacity() < i3) {
                ByteBuffer order = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                this.f46777E = order;
                this.f46786N = order.asShortBuffer();
            } else {
                this.f46777E.clear();
                this.f46786N.clear();
            }
            AnonymousClass2v6 anonymousClass2v62 = this.f46775C;
            ShortBuffer shortBuffer = this.f46786N;
            remaining2 = Math.min(shortBuffer.remaining() / anonymousClass2v62.f35737B, anonymousClass2v62.f35750O);
            shortBuffer.put(anonymousClass2v62.f35749N, 0, anonymousClass2v62.f35737B * remaining2);
            anonymousClass2v62.f35750O -= remaining2;
            Object obj = anonymousClass2v62.f35749N;
            int i4 = anonymousClass2v62.f35737B;
            System.arraycopy(obj, remaining2 * i4, obj, 0, anonymousClass2v62.f35750O * i4);
            this.f46782J += (long) i3;
            this.f46777E.limit(i3);
            this.f46781I = this.f46777E;
        }
    }

    public final void flush() {
        if (isActive()) {
            AnonymousClass2v6 anonymousClass2v6 = this.f46775C;
            if (anonymousClass2v6 == null) {
                this.f46775C = new AnonymousClass2v6(this.f46785M, this.f46778F, this.f46776D, this.f46774B, this.f46783K);
            } else {
                anonymousClass2v6.f35740E = 0;
                anonymousClass2v6.f35750O = 0;
                anonymousClass2v6.f35753R = 0;
                anonymousClass2v6.f35748M = 0;
                anonymousClass2v6.f35747L = 0;
                anonymousClass2v6.f35757V = 0;
                anonymousClass2v6.f35755T = 0;
                anonymousClass2v6.f35754S = 0;
                anonymousClass2v6.f35745J = 0;
                anonymousClass2v6.f35742G = 0;
            }
        }
        this.f46781I = AnonymousClass2uj.f35676B;
        this.f46779G = 0;
        this.f46782J = 0;
        this.f46780H = false;
    }

    public final boolean isActive() {
        return this.f46785M != -1 && (Math.abs(this.f46776D - 1.0f) >= 0.01f || Math.abs(this.f46774B - 1.0f) >= 0.01f || this.f46783K != this.f46785M);
    }

    public final void reset() {
        this.f46776D = 1.0f;
        this.f46774B = 1.0f;
        this.f46778F = -1;
        this.f46785M = -1;
        this.f46783K = -1;
        ByteBuffer byteBuffer = AnonymousClass2uj.f35676B;
        this.f46777E = byteBuffer;
        this.f46786N = byteBuffer.asShortBuffer();
        this.f46781I = AnonymousClass2uj.f35676B;
        this.f46784L = -1;
        this.f46775C = null;
        this.f46779G = 0;
        this.f46782J = 0;
        this.f46780H = false;
    }

    public final ByteBuffer yO() {
        ByteBuffer byteBuffer = this.f46781I;
        this.f46781I = AnonymousClass2uj.f35676B;
        return byteBuffer;
    }

    public final int zO() {
        return this.f46778F;
    }
}
