package X;

import java.nio.ByteBuffer;

/* renamed from: X.2ql */
public final class AnonymousClass2ql {
    /* renamed from: B */
    public final AnonymousClass2q7 f34877B = new AnonymousClass2q7();
    /* renamed from: C */
    public ByteBuffer f34878C;
    /* renamed from: D */
    public int f34879D;
    /* renamed from: E */
    public int f34880E;
    /* renamed from: F */
    public long f34881F;
    /* renamed from: G */
    private final int f34882G;

    public AnonymousClass2ql(int i) {
        this.f34882G = i;
    }

    /* renamed from: A */
    public final void m17466A() {
        ByteBuffer byteBuffer = this.f34878C;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* renamed from: B */
    private ByteBuffer m17465B(int i) {
        int i2 = this.f34882G;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f34878C;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Buffer too small (");
        stringBuilder.append(capacity);
        stringBuilder.append(" < ");
        stringBuilder.append(i);
        stringBuilder.append(")");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: B */
    public final void m17467B(int i) {
        ByteBuffer byteBuffer = this.f34878C;
        if (byteBuffer == null) {
            this.f34878C = m17465B(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f34878C.position();
        i += position;
        if (capacity < i) {
            ByteBuffer B = m17465B(i);
            if (position > 0) {
                this.f34878C.position(0);
                this.f34878C.limit(position);
                B.put(this.f34878C);
            }
            this.f34878C = B;
        }
    }

    /* renamed from: C */
    public final boolean m17468C() {
        return (this.f34879D & 134217728) != 0;
    }
}
