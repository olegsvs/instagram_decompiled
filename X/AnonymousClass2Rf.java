package X;

import java.nio.ByteBuffer;

/* renamed from: X.2Rf */
public final class AnonymousClass2Rf implements AnonymousClass1vM {
    /* renamed from: B */
    public AnonymousClass2Rd f30487B;
    /* renamed from: C */
    public AnonymousClass2Rd f30488C;
    /* renamed from: D */
    public byte f30489D;

    public final void GW(ByteBuffer byteBuffer, int i) {
        this.f30489D = AnonymousClass1vN.m13746B(byteBuffer, i, 0, (byte) 0);
        Class cls = AnonymousClass2Rd.class;
        this.f30487B = (AnonymousClass2Rd) AnonymousClass1vN.m13758N(byteBuffer, i, 1, cls);
        this.f30488C = (AnonymousClass2Rd) AnonymousClass1vN.m13758N(byteBuffer, i, 2, cls);
    }
}
