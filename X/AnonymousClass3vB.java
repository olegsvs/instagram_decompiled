package X;

import java.nio.ByteBuffer;

/* renamed from: X.3vB */
public class AnonymousClass3vB extends AnonymousClass2v7 {
    /* renamed from: B */
    public final int f46798B;
    /* renamed from: C */
    public final AnonymousClass2v9 f46799C = new AnonymousClass2v9();
    /* renamed from: D */
    public ByteBuffer f46800D;
    /* renamed from: E */
    public long f46801E;

    public AnonymousClass3vB(int i) {
        this.f46798B = i;
    }

    /* renamed from: B */
    private ByteBuffer m21469B(int i) {
        int i2 = this.f46798B;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f46800D;
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
    public final void mo4533B() {
        super.mo4533B();
        ByteBuffer byteBuffer = this.f46800D;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* renamed from: F */
    public final void m21471F(int i) {
        ByteBuffer byteBuffer = this.f46800D;
        if (byteBuffer == null) {
            this.f46800D = m21469B(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f46800D.position();
        i += position;
        if (capacity < i) {
            ByteBuffer B = m21469B(i);
            if (position > 0) {
                this.f46800D.position(0);
                this.f46800D.limit(position);
                B.put(this.f46800D);
            }
            this.f46800D = B;
        }
    }
}
