package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: X.3v1 */
public final class AnonymousClass3v1 implements AnonymousClass2uj {
    /* renamed from: B */
    public int[] f46683B;
    /* renamed from: C */
    private boolean f46684C;
    /* renamed from: D */
    private ByteBuffer f46685D;
    /* renamed from: E */
    private int f46686E = -1;
    /* renamed from: F */
    private boolean f46687F;
    /* renamed from: G */
    private ByteBuffer f46688G;
    /* renamed from: H */
    private int[] f46689H;
    /* renamed from: I */
    private int f46690I = -1;

    public final int AP() {
        return 2;
    }

    public AnonymousClass3v1() {
        ByteBuffer byteBuffer = AnonymousClass2uj.f35676B;
        this.f46685D = byteBuffer;
        this.f46688G = byteBuffer;
    }

    public final int BP() {
        return this.f46690I;
    }

    public final boolean EF(int i, int i2, int i3) {
        boolean equals = Arrays.equals(this.f46683B, this.f46689H) ^ true;
        int[] iArr = this.f46683B;
        this.f46689H = iArr;
        if (iArr == null) {
            this.f46684C = false;
            return equals;
        }
        if (i3 == 2) {
            if (!equals && this.f46690I == i && this.f46686E == i2) {
                return false;
            }
            this.f46690I = i;
            this.f46686E = i2;
            this.f46684C = i2 != this.f46689H.length;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f46689H;
                if (i4 < iArr2.length) {
                    int i5 = iArr2[i4];
                    if (i5 >= i2) {
                        break;
                    }
                    this.f46684C = (i5 != i4 ? 1 : 0) | this.f46684C;
                    i4++;
                } else {
                    return true;
                }
            }
        }
        throw new AnonymousClass2ui(i, i2, i3);
    }

    public final boolean OX() {
        return this.f46687F && this.f46688G == AnonymousClass2uj.f35676B;
    }

    public final void YIA() {
        this.f46687F = true;
    }

    public final void ZIA(ByteBuffer byteBuffer) {
        AnonymousClass2yO.m18017F(this.f46689H != null);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = (((limit - position) / (this.f46686E * 2)) * this.f46689H.length) * 2;
        if (this.f46685D.capacity() < length) {
            this.f46685D = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f46685D.clear();
        }
        while (position < limit) {
            for (int i : this.f46689H) {
                this.f46685D.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f46686E * 2;
        }
        byteBuffer.position(limit);
        this.f46685D.flip();
        this.f46688G = this.f46685D;
    }

    public final void flush() {
        this.f46688G = AnonymousClass2uj.f35676B;
        this.f46687F = false;
    }

    public final boolean isActive() {
        return this.f46684C;
    }

    public final void reset() {
        flush();
        this.f46685D = AnonymousClass2uj.f35676B;
        this.f46686E = -1;
        this.f46690I = -1;
        this.f46689H = null;
        this.f46683B = null;
        this.f46684C = false;
    }

    public final ByteBuffer yO() {
        ByteBuffer byteBuffer = this.f46688G;
        this.f46688G = AnonymousClass2uj.f35676B;
        return byteBuffer;
    }

    public final int zO() {
        int[] iArr = this.f46689H;
        return iArr == null ? this.f46686E : iArr.length;
    }
}
