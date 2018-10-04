package X;

import com.google.android.exoplayer2.Format;

/* renamed from: X.45y */
public final class AnonymousClass45y extends AnonymousClass45Q {
    /* renamed from: B */
    private volatile int f50199B;
    /* renamed from: C */
    private volatile boolean f50200C;
    /* renamed from: D */
    private volatile boolean f50201D;
    /* renamed from: E */
    private final Format f50202E;
    /* renamed from: F */
    private final int f50203F;

    public AnonymousClass45y(AnonymousClass2yC anonymousClass2yC, AnonymousClass2yE anonymousClass2yE, Format format, int i, Object obj, long j, long j2, long j3, int i2, Format format2) {
        super(anonymousClass2yC, anonymousClass2yE, format, i, obj, j, j2, -9223372036854775807L, j3);
        this.f50203F = i2;
        this.f50202E = format2;
    }

    /* renamed from: A */
    public final long mo5261A() {
        return (long) this.f50199B;
    }

    public final void BE() {
        this.f50200C = true;
    }

    /* renamed from: C */
    public final boolean mo5470C() {
        return this.f50201D;
    }

    public final void LZ() {
        try {
            long uGA = this.f47029B.uGA(this.f47030C.m18008A((long) this.f50199B));
            if (uGA != -1) {
                uGA += (long) this.f50199B;
            }
            AnonymousClass2vK anonymousClass3vG = new AnonymousClass3vG(this.f47029B, (long) this.f50199B, uGA);
            AnonymousClass3vo anonymousClass3vo = this.f49902C;
            anonymousClass3vo.m21554A(0);
            int i = 0;
            AnonymousClass2vT fVA = anonymousClass3vo.fVA(0, this.f50203F);
            fVA.qH(this.f50202E);
            while (i != -1) {
                this.f50199B += i;
                i = fVA.cLA(anonymousClass3vG, Integer.MAX_VALUE, true);
            }
            fVA.fLA(this.f47032E, 1, this.f50199B, 0, null);
            this.f50201D = true;
        } finally {
            AnonymousClass2yi.m18086G(this.f47029B);
        }
    }

    public final boolean sX() {
        return this.f50200C;
    }
}
