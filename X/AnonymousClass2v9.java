package X;

import android.media.MediaCodec.CryptoInfo;

/* renamed from: X.2v9 */
public final class AnonymousClass2v9 {
    /* renamed from: B */
    public int f35762B;
    /* renamed from: C */
    public int f35763C;
    /* renamed from: D */
    public final CryptoInfo f35764D;
    /* renamed from: E */
    public byte[] f35765E;
    /* renamed from: F */
    public byte[] f35766F;
    /* renamed from: G */
    public int f35767G;
    /* renamed from: H */
    public int[] f35768H;
    /* renamed from: I */
    public int[] f35769I;
    /* renamed from: J */
    public int f35770J;
    /* renamed from: K */
    public final AnonymousClass2v8 f35771K;

    public AnonymousClass2v9() {
        CryptoInfo cryptoInfo;
        int i = AnonymousClass2yi.f36552F;
        AnonymousClass2v8 anonymousClass2v8 = null;
        if (i >= 16) {
            cryptoInfo = new CryptoInfo();
        } else {
            cryptoInfo = null;
        }
        this.f35764D = cryptoInfo;
        if (i >= 24) {
            anonymousClass2v8 = new AnonymousClass2v8(this.f35764D);
        }
        this.f35771K = anonymousClass2v8;
    }
}
