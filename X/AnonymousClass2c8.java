package X;

import java.nio.Buffer;
import java.nio.ByteBuffer;

/* renamed from: X.2c8 */
public final class AnonymousClass2c8 extends AnonymousClass2LL {
    /* renamed from: B */
    private final ByteBuffer f31579B;

    public AnonymousClass2c8(AnonymousClass28h anonymousClass28h) {
        this(anonymousClass28h, 4, ByteBuffer.allocateDirect(AnonymousClass2cB.f31589I.length).put(AnonymousClass2cB.f31589I));
    }

    public AnonymousClass2c8(AnonymousClass28h anonymousClass28h, int i, ByteBuffer byteBuffer) {
        super(anonymousClass28h, i);
        this.f31579B = byteBuffer;
    }

    /* renamed from: A */
    public final void mo3392A(AnonymousClass2Vf anonymousClass2Vf, int i, int i2, boolean z, int i3) {
        Buffer asReadOnlyBuffer = this.f31579B.asReadOnlyBuffer();
        asReadOnlyBuffer.position(i3);
        this.f29248B.add(new AnonymousClass2c7(this, anonymousClass2Vf, i, i2, z, asReadOnlyBuffer));
    }
}
