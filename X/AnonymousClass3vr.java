package X;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;

/* renamed from: X.3vr */
public final class AnonymousClass3vr implements AnonymousClass2vL {
    /* renamed from: B */
    public final AnonymousClass2vJ f47042B;
    /* renamed from: C */
    public Format[] f47043C;
    /* renamed from: D */
    public AnonymousClass2vQ f47044D;
    /* renamed from: E */
    private final SparseArray f47045E = new SparseArray();
    /* renamed from: F */
    private boolean f47046F;
    /* renamed from: G */
    private final Format f47047G;
    /* renamed from: H */
    private final int f47048H;
    /* renamed from: I */
    private AnonymousClass2ww f47049I;

    public AnonymousClass3vr(AnonymousClass2vJ anonymousClass2vJ, int i, Format format) {
        this.f47042B = anonymousClass2vJ;
        this.f47048H = i;
        this.f47047G = format;
    }

    /* renamed from: A */
    public final void m21557A(AnonymousClass2ww anonymousClass2ww, long j) {
        this.f47049I = anonymousClass2ww;
        if (this.f47046F) {
            AnonymousClass2vJ anonymousClass2vJ = this.f47042B;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            anonymousClass2vJ.tLA(0, j);
            for (int i = 0; i < this.f47045E.size(); i++) {
                ((AnonymousClass3vq) this.f47045E.valueAt(i)).m21556A(anonymousClass2ww);
            }
            return;
        }
        this.f47042B.BW(this);
        if (j != -9223372036854775807L) {
            this.f47042B.tLA(0, j);
        }
        this.f47046F = true;
    }

    public final void MH() {
        Format[] formatArr = new Format[this.f47045E.size()];
        for (int i = 0; i < this.f47045E.size(); i++) {
            formatArr[i] = ((AnonymousClass3vq) this.f47045E.valueAt(i)).f47037B;
        }
        this.f47043C = formatArr;
    }

    public final AnonymousClass2vT fVA(int i, int i2) {
        AnonymousClass2vT anonymousClass2vT = (AnonymousClass3vq) this.f47045E.get(i);
        if (anonymousClass2vT == null) {
            AnonymousClass2yO.m18017F(this.f47043C == null);
            anonymousClass2vT = new AnonymousClass3vq(i, i2, i2 == this.f47048H ? this.f47047G : null);
            anonymousClass2vT.m21556A(this.f47049I);
            this.f47045E.put(i, anonymousClass2vT);
        }
        return anonymousClass2vT;
    }

    public final void vLA(AnonymousClass2vQ anonymousClass2vQ) {
        this.f47044D = anonymousClass2vQ;
    }
}
