package X;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;

/* renamed from: X.43u */
public abstract class AnonymousClass43u implements AnonymousClass3uz, AnonymousClass2uZ {
    /* renamed from: B */
    public AnonymousClass2ua f49173B;
    /* renamed from: C */
    public int f49174C;
    /* renamed from: D */
    public boolean f49175D = true;
    /* renamed from: E */
    public AnonymousClass2wp f49176E;
    /* renamed from: F */
    public Format[] f49177F;
    /* renamed from: G */
    public boolean f49178G;
    /* renamed from: H */
    public long f49179H;
    /* renamed from: I */
    private int f49180I;
    /* renamed from: J */
    private final int f49181J;

    /* renamed from: A */
    public void mo5366A() {
    }

    /* renamed from: B */
    public void mo5367B(boolean z) {
    }

    /* renamed from: C */
    public void mo5368C(long j, boolean z) {
    }

    /* renamed from: E */
    public void mo5369E() {
    }

    public AnonymousClass2yX FO() {
        return null;
    }

    /* renamed from: G */
    public void mo5370G() {
    }

    /* renamed from: H */
    public void mo5376H(Format[] formatArr, long j) {
    }

    public int MVA() {
        return 0;
    }

    public final AnonymousClass2uZ cJ() {
        return this;
    }

    public void uU(int i, Object obj) {
    }

    public AnonymousClass43u(int i) {
        this.f49181J = i;
    }

    /* renamed from: B */
    public static boolean m22430B(AnonymousClass2vH anonymousClass2vH, DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        return anonymousClass2vH == null ? null : anonymousClass2vH.canAcquireSession(drmInitData);
    }

    public final int DS() {
        return this.f49180I;
    }

    public final boolean DX() {
        return this.f49178G;
    }

    public final void EH(AnonymousClass2ua anonymousClass2ua, Format[] formatArr, AnonymousClass2wp anonymousClass2wp, long j, boolean z, long j2) {
        AnonymousClass2yO.m18017F(this.f49180I == 0);
        this.f49173B = anonymousClass2ua;
        this.f49180I = 1;
        mo5367B(z);
        EKA(formatArr, anonymousClass2wp, j2);
        mo5368C(j, z);
    }

    public final void EKA(Format[] formatArr, AnonymousClass2wp anonymousClass2wp, long j) {
        AnonymousClass2yO.m18017F(this.f49178G ^ 1);
        this.f49176E = anonymousClass2wp;
        this.f49175D = false;
        this.f49177F = formatArr;
        this.f49179H = j;
        mo5376H(formatArr, j);
    }

    /* renamed from: I */
    public final int m22437I(AnonymousClass2uL anonymousClass2uL, AnonymousClass3vB anonymousClass3vB, boolean z) {
        int hIA = this.f49176E.hIA(anonymousClass2uL, anonymousClass3vB, z);
        int i = -4;
        if (hIA == -4) {
            if (anonymousClass3vB.m17767E()) {
                this.f49175D = true;
                if (!this.f49178G) {
                    i = -3;
                }
                return i;
            }
            anonymousClass3vB.f46801E += this.f49179H;
        } else if (hIA == -5) {
            Format format = anonymousClass2uL.f35584B;
            if (format.f35581e != Long.MAX_VALUE) {
                anonymousClass2uL.f35584B = format.m17680D(format.f35581e + this.f49179H);
            }
        }
        return hIA;
    }

    public final void NLA(long j) {
        this.f49178G = false;
        this.f49175D = false;
        mo5368C(j, false);
    }

    public final AnonymousClass2wp NS() {
        return this.f49176E;
    }

    public final int TT() {
        return this.f49181J;
    }

    public final void UNA() {
        this.f49178G = true;
    }

    public final boolean UV() {
        return this.f49175D;
    }

    public final void WG() {
        boolean z = true;
        if (this.f49180I != 1) {
            z = false;
        }
        AnonymousClass2yO.m18017F(z);
        this.f49180I = 0;
        this.f49176E = null;
        this.f49177F = null;
        this.f49178G = false;
        mo5366A();
    }

    public final void bOA(int i) {
        this.f49174C = i;
    }

    public final void start() {
        boolean z = true;
        if (this.f49180I != 1) {
            z = false;
        }
        AnonymousClass2yO.m18017F(z);
        this.f49180I = 2;
        mo5369E();
    }

    public final void stop() {
        AnonymousClass2yO.m18017F(this.f49180I == 2);
        this.f49180I = 1;
        mo5370G();
    }

    public final void vb() {
        this.f49176E.sb();
    }
}
