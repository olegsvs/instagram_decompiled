package X;

import android.media.MediaCodec.CryptoInfo;
import com.facebook.forker.Process;
import com.google.android.exoplayer2.Format;
import java.io.EOFException;
import java.nio.ByteBuffer;

/* renamed from: X.3vl */
public final class AnonymousClass3vl implements AnonymousClass2vT {
    /* renamed from: B */
    public final int f47002B;
    /* renamed from: C */
    public final AnonymousClass2yA f47003C;
    /* renamed from: D */
    public AnonymousClass2wn f47004D;
    /* renamed from: E */
    public final AnonymousClass2wm f47005E = new AnonymousClass2wm();
    /* renamed from: F */
    public boolean f47006F;
    /* renamed from: G */
    public AnonymousClass2wn f47007G;
    /* renamed from: H */
    public long f47008H;
    /* renamed from: I */
    public final AnonymousClass2yc f47009I = new AnonymousClass2yc(32);
    /* renamed from: J */
    public long f47010J;
    /* renamed from: K */
    public AnonymousClass2wo f47011K;
    /* renamed from: L */
    public AnonymousClass2wn f47012L;
    /* renamed from: M */
    private Format f47013M;
    /* renamed from: N */
    private final AnonymousClass2wl f47014N = new AnonymousClass2wl();
    /* renamed from: O */
    private Format f47015O;
    /* renamed from: P */
    private boolean f47016P;

    public AnonymousClass3vl(AnonymousClass2yA anonymousClass2yA) {
        this.f47003C = anonymousClass2yA;
        this.f47002B = anonymousClass2yA.yM();
        AnonymousClass2wn anonymousClass2wn = new AnonymousClass2wn(0, this.f47002B);
        this.f47004D = anonymousClass2wn;
        this.f47007G = anonymousClass2wn;
        this.f47012L = anonymousClass2wn;
    }

    /* renamed from: A */
    public final int m21536A(long j, boolean z, boolean z2) {
        return this.f47005E.m17873A(j, z, z2);
    }

    /* renamed from: B */
    public final int m21537B() {
        int i;
        AnonymousClass2wm anonymousClass2wm = this.f47005E;
        synchronized (anonymousClass2wm) {
            i = anonymousClass2wm.f36121E - anonymousClass2wm.f36122F;
            anonymousClass2wm.f36122F = anonymousClass2wm.f36121E;
        }
        return i;
    }

    /* renamed from: B */
    public static void m21529B(AnonymousClass3vl anonymousClass3vl, long j) {
        while (j >= anonymousClass3vl.f47007G.f36137C) {
            anonymousClass3vl.f47007G = anonymousClass3vl.f47007G.f36138D;
        }
    }

    /* renamed from: C */
    public final void m21538C(long j, boolean z, boolean z2) {
        AnonymousClass3vl.m21531D(this, this.f47005E.m17876D(j, z, z2));
    }

    /* renamed from: C */
    public static void m21530C(AnonymousClass3vl anonymousClass3vl, AnonymousClass2wn anonymousClass2wn) {
        if (anonymousClass2wn.f36140F) {
            AnonymousClass2y9[] anonymousClass2y9Arr = new AnonymousClass2y9[(anonymousClass3vl.f47012L.f36140F + (((int) (anonymousClass3vl.f47012L.f36139E - anonymousClass2wn.f36139E)) / anonymousClass3vl.f47002B))];
            for (int i = 0; i < anonymousClass2y9Arr.length; i++) {
                anonymousClass2y9Arr[i] = anonymousClass2wn.f36136B;
                anonymousClass2wn.f36136B = null;
                AnonymousClass2wn anonymousClass2wn2 = anonymousClass2wn.f36138D;
                anonymousClass2wn.f36138D = null;
                anonymousClass2wn = anonymousClass2wn2;
            }
            anonymousClass3vl.f47003C.OJA(anonymousClass2y9Arr);
        }
    }

    /* renamed from: D */
    public final void m21539D() {
        AnonymousClass3vl.m21531D(this, this.f47005E.m17877E());
    }

    /* renamed from: D */
    public static void m21531D(AnonymousClass3vl anonymousClass3vl, long j) {
        if (j != -1) {
            while (j >= anonymousClass3vl.f47004D.f36137C) {
                anonymousClass3vl.f47003C.LJA(anonymousClass3vl.f47004D.f36136B);
                AnonymousClass2wn anonymousClass2wn = anonymousClass3vl.f47004D;
                anonymousClass2wn.f36136B = null;
                AnonymousClass2wn anonymousClass2wn2 = anonymousClass2wn.f36138D;
                anonymousClass2wn.f36138D = null;
                anonymousClass3vl.f47004D = anonymousClass2wn2;
            }
            if (anonymousClass3vl.f47007G.f36139E < anonymousClass3vl.f47004D.f36139E) {
                anonymousClass3vl.f47007G = anonymousClass3vl.f47004D;
            }
        }
    }

    /* renamed from: E */
    public final void m21540E(int i) {
        long G = this.f47005E.m17879G(i);
        this.f47010J = G;
        if (G != 0) {
            if (G != this.f47004D.f36139E) {
                AnonymousClass2wn anonymousClass2wn = this.f47004D;
                while (this.f47010J > anonymousClass2wn.f36137C) {
                    anonymousClass2wn = anonymousClass2wn.f36138D;
                }
                AnonymousClass2wn anonymousClass2wn2 = anonymousClass2wn.f36138D;
                AnonymousClass3vl.m21530C(this, anonymousClass2wn2);
                anonymousClass2wn.f36138D = new AnonymousClass2wn(anonymousClass2wn.f36137C, this.f47002B);
                this.f47012L = this.f47010J == anonymousClass2wn.f36137C ? anonymousClass2wn.f36138D : anonymousClass2wn;
                if (this.f47007G == anonymousClass2wn2) {
                    this.f47007G = anonymousClass2wn.f36138D;
                    return;
                }
                return;
            }
        }
        AnonymousClass3vl.m21530C(this, this.f47004D);
        AnonymousClass2wn anonymousClass2wn3 = new AnonymousClass2wn(this.f47010J, this.f47002B);
        this.f47004D = anonymousClass2wn3;
        this.f47007G = anonymousClass2wn3;
        this.f47012L = anonymousClass2wn3;
    }

    /* renamed from: E */
    public static void m21532E(AnonymousClass3vl anonymousClass3vl, long j, byte[] bArr, int i) {
        AnonymousClass3vl.m21529B(anonymousClass3vl, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (anonymousClass3vl.f47007G.f36137C - j));
            System.arraycopy(anonymousClass3vl.f47007G.f36136B.f36482B, anonymousClass3vl.f47007G.m17884A(j), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == anonymousClass3vl.f47007G.f36137C) {
                anonymousClass3vl.f47007G = anonymousClass3vl.f47007G.f36138D;
            }
        }
    }

    /* renamed from: F */
    public final long m21541F() {
        long j;
        AnonymousClass2wm anonymousClass2wm = this.f47005E;
        synchronized (anonymousClass2wm) {
            j = anonymousClass2wm.f36120D;
        }
        return j;
    }

    /* renamed from: F */
    private static Format m21533F(Format format, long j) {
        if (format == null) {
            return null;
        }
        if (!(j == 0 || format.f35581e == Long.MAX_VALUE)) {
            format = format.m17680D(format.f35581e + j);
        }
        return format;
    }

    /* renamed from: G */
    public final int m21542G() {
        AnonymousClass2wm anonymousClass2wm = this.f47005E;
        return anonymousClass2wm.f36118B + anonymousClass2wm.f36122F;
    }

    /* renamed from: G */
    private void m21534G(int i) {
        long j = this.f47010J + ((long) i);
        this.f47010J = j;
        if (j == this.f47012L.f36137C) {
            this.f47012L = this.f47012L.f36138D;
        }
    }

    /* renamed from: H */
    private int m21535H(int i) {
        if (!this.f47012L.f36140F) {
            AnonymousClass2wn anonymousClass2wn = this.f47012L;
            AnonymousClass2y9 LC = this.f47003C.LC();
            AnonymousClass2wn anonymousClass2wn2 = new AnonymousClass2wn(this.f47012L.f36137C, this.f47002B);
            anonymousClass2wn.f36136B = LC;
            anonymousClass2wn.f36138D = anonymousClass2wn2;
            anonymousClass2wn.f36140F = true;
        }
        return Math.min(i, (int) (this.f47012L.f36137C - this.f47010J));
    }

    /* renamed from: H */
    public final Format m21543H() {
        Format format;
        AnonymousClass2wm anonymousClass2wm = this.f47005E;
        synchronized (anonymousClass2wm) {
            format = anonymousClass2wm.f36126J ? null : anonymousClass2wm.f36125I;
        }
        return format;
    }

    /* renamed from: I */
    public final int m21544I() {
        AnonymousClass2wm anonymousClass2wm = this.f47005E;
        return anonymousClass2wm.f36118B + anonymousClass2wm.f36121E;
    }

    /* renamed from: J */
    public final boolean m21545J() {
        return this.f47005E.m17881I();
    }

    /* renamed from: K */
    public final int m21546K(AnonymousClass2uL anonymousClass2uL, AnonymousClass3vB anonymousClass3vB, boolean z, boolean z2, long j) {
        AnonymousClass3vl anonymousClass3vl = this;
        AnonymousClass2wm anonymousClass2wm = this.f47005E;
        Format format = this.f47013M;
        AnonymousClass2wl anonymousClass2wl = this.f47014N;
        AnonymousClass2uL anonymousClass2uL2 = anonymousClass2uL;
        AnonymousClass2v7 anonymousClass2v7 = anonymousClass3vB;
        switch (anonymousClass2wm.m17882J(anonymousClass2uL2, anonymousClass2v7, z, z2, format, anonymousClass2wl)) {
            case Process.SD_STDOUT /*-5*/:
                anonymousClass3vl.f47013M = anonymousClass2uL2.f35584B;
                return -5;
            case Process.SD_PIPE /*-4*/:
                if (!anonymousClass2v7.m17767E()) {
                    int i;
                    if (anonymousClass2v7.f46801E < j) {
                        anonymousClass2v7.m17763A(Process.WAIT_RESULT_TIMEOUT);
                    }
                    if (anonymousClass2v7.m17765C(1073741824)) {
                        int O;
                        int i2;
                        AnonymousClass2wl anonymousClass2wl2 = anonymousClass3vl.f47014N;
                        long j2 = anonymousClass2wl2.f36116C;
                        anonymousClass3vl.f47009I.m18061Q(1);
                        AnonymousClass3vl.m21532E(anonymousClass3vl, j2, anonymousClass3vl.f47009I.f36537B, 1);
                        j2++;
                        int i3 = 0;
                        byte b = anonymousClass3vl.f47009I.f36537B[0];
                        Object obj = (b & 128) != 0 ? 1 : null;
                        i = b & 127;
                        if (anonymousClass2v7.f46799C.f35765E == null) {
                            anonymousClass2v7.f46799C.f35765E = new byte[16];
                        }
                        AnonymousClass3vl.m21532E(anonymousClass3vl, j2, anonymousClass2v7.f46799C.f35765E, i);
                        j2 += (long) i;
                        if (obj != null) {
                            anonymousClass3vl.f47009I.m18061Q(2);
                            AnonymousClass3vl.m21532E(anonymousClass3vl, j2, anonymousClass3vl.f47009I.f36537B, 2);
                            j2 += 2;
                            O = anonymousClass3vl.f47009I.m18059O();
                        } else {
                            O = 1;
                        }
                        int[] iArr = anonymousClass2v7.f46799C.f35768H;
                        if (iArr == null || iArr.length < O) {
                            iArr = new int[O];
                        }
                        int[] iArr2 = anonymousClass2v7.f46799C.f35769I;
                        if (iArr2 == null || iArr2.length < O) {
                            iArr2 = new int[O];
                        }
                        if (obj != null) {
                            i2 = O * 6;
                            anonymousClass3vl.f47009I.m18061Q(i2);
                            AnonymousClass3vl.m21532E(anonymousClass3vl, j2, anonymousClass3vl.f47009I.f36537B, i2);
                            j2 += (long) i2;
                            anonymousClass3vl.f47009I.m18064T(0);
                            while (i3 < O) {
                                iArr[i3] = anonymousClass3vl.f47009I.m18059O();
                                iArr2[i3] = anonymousClass3vl.f47009I.m18057M();
                                i3++;
                            }
                        } else {
                            iArr[0] = 0;
                            iArr2[0] = anonymousClass2wl2.f36117D - ((int) (j2 - anonymousClass2wl2.f36116C));
                        }
                        AnonymousClass2vS anonymousClass2vS = anonymousClass2wl2.f36115B;
                        AnonymousClass2v9 anonymousClass2v9 = anonymousClass2v7.f46799C;
                        byte[] bArr = anonymousClass2vS.f35803E;
                        byte[] bArr2 = anonymousClass2v7.f46799C.f35765E;
                        int i4 = anonymousClass2vS.f35801C;
                        i2 = anonymousClass2vS.f35802D;
                        int i5 = anonymousClass2vS.f35800B;
                        anonymousClass2v9.f35770J = O;
                        anonymousClass2v9.f35768H = iArr;
                        anonymousClass2v9.f35769I = iArr2;
                        anonymousClass2v9.f35766F = bArr;
                        anonymousClass2v9.f35765E = bArr2;
                        anonymousClass2v9.f35767G = i4;
                        anonymousClass2v9.f35763C = i2;
                        anonymousClass2v9.f35762B = i5;
                        if (AnonymousClass2yi.f36552F >= 16) {
                            CryptoInfo cryptoInfo = anonymousClass2v9.f35764D;
                            cryptoInfo.numSubSamples = anonymousClass2v9.f35770J;
                            cryptoInfo.numBytesOfClearData = anonymousClass2v9.f35768H;
                            cryptoInfo.numBytesOfEncryptedData = anonymousClass2v9.f35769I;
                            cryptoInfo.key = anonymousClass2v9.f35766F;
                            cryptoInfo.iv = anonymousClass2v9.f35765E;
                            cryptoInfo.mode = anonymousClass2v9.f35767G;
                            if (AnonymousClass2yi.f36552F >= 24) {
                                AnonymousClass2v8 anonymousClass2v8 = anonymousClass2v9.f35771K;
                                anonymousClass2v8.f35761C.set(anonymousClass2v9.f35763C, anonymousClass2v9.f35762B);
                                anonymousClass2v8.f35760B.setPattern(anonymousClass2v8.f35761C);
                            }
                        }
                        i = (int) (j2 - anonymousClass2wl2.f36116C);
                        anonymousClass2wl2.f36116C += (long) i;
                        anonymousClass2wl2.f36117D -= i;
                    }
                    anonymousClass2v7.m21471F(anonymousClass3vl.f47014N.f36117D);
                    long j3 = anonymousClass3vl.f47014N.f36116C;
                    ByteBuffer byteBuffer = anonymousClass2v7.f46800D;
                    int i6 = anonymousClass3vl.f47014N.f36117D;
                    AnonymousClass3vl.m21529B(anonymousClass3vl, j3);
                    while (i6 > 0) {
                        i = Math.min(i6, (int) (anonymousClass3vl.f47007G.f36137C - j3));
                        byteBuffer.put(anonymousClass3vl.f47007G.f36136B.f36482B, anonymousClass3vl.f47007G.m17884A(j3), i);
                        i6 -= i;
                        j3 += (long) i;
                        if (j3 == anonymousClass3vl.f47007G.f36137C) {
                            anonymousClass3vl.f47007G = anonymousClass3vl.f47007G.f36138D;
                        }
                    }
                }
                return -4;
            case Process.SD_BLACK_HOLE /*-3*/:
                return -3;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: L */
    public final void m21547L() {
        AnonymousClass2wm anonymousClass2wm = this.f47005E;
        anonymousClass2wm.f36121E = 0;
        anonymousClass2wm.f36118B = 0;
        anonymousClass2wm.f36123G = 0;
        anonymousClass2wm.f36122F = 0;
        anonymousClass2wm.f36127K = true;
        anonymousClass2wm.f36119C = Long.MIN_VALUE;
        anonymousClass2wm.f36120D = Long.MIN_VALUE;
        AnonymousClass3vl.m21530C(this, this.f47004D);
        AnonymousClass2wn anonymousClass2wn = new AnonymousClass2wn(0, this.f47002B);
        this.f47004D = anonymousClass2wn;
        this.f47007G = anonymousClass2wn;
        this.f47012L = anonymousClass2wn;
        this.f47010J = 0;
        this.f47003C.gVA();
    }

    /* renamed from: M */
    public final void m21548M() {
        AnonymousClass2wm anonymousClass2wm = this.f47005E;
        synchronized (anonymousClass2wm) {
            anonymousClass2wm.f36122F = 0;
        }
        this.f47007G = this.f47004D;
    }

    public final int cLA(AnonymousClass2vK anonymousClass2vK, int i, boolean z) {
        int read = anonymousClass2vK.read(this.f47012L.f36136B.f36482B, this.f47012L.m17884A(this.f47010J), m21535H(i));
        if (read != -1) {
            m21534G(read);
            return read;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final void eLA(AnonymousClass2yc anonymousClass2yc, int i) {
        while (i > 0) {
            int H = m21535H(i);
            anonymousClass2yc.m18047C(this.f47012L.f36136B.f36482B, this.f47012L.m17884A(this.f47010J), H);
            i -= H;
            m21534G(H);
        }
    }

    public final void fLA(long j, int i, int i2, int i3, AnonymousClass2vS anonymousClass2vS) {
        if (this.f47006F) {
            qH(this.f47015O);
        }
        int i4 = i;
        if (this.f47016P) {
            if ((i & 1) != 0) {
                if (this.f47005E.m17874B(j)) {
                    this.f47016P = false;
                }
            }
            return;
        }
        long j2 = (this.f47010J - ((long) i2)) - ((long) i3);
        this.f47005E.m17875C(j + this.f47008H, i4, j2, i2, anonymousClass2vS);
    }

    public final void qH(Format format) {
        Format F = AnonymousClass3vl.m21533F(format, this.f47008H);
        boolean H = this.f47005E.m17880H(F);
        this.f47015O = format;
        this.f47006F = false;
        AnonymousClass2wo anonymousClass2wo = this.f47011K;
        if (anonymousClass2wo != null && H) {
            anonymousClass2wo.tEA(F);
        }
    }
}
