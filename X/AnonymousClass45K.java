package X;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.45K */
public abstract class AnonymousClass45K extends AnonymousClass43c {
    /* renamed from: n */
    public static boolean f49751n;
    /* renamed from: B */
    public MediaCodec f49752B;
    /* renamed from: C */
    public final AnonymousClass2q6 f49753C;
    /* renamed from: D */
    public long f49754D;
    /* renamed from: E */
    public boolean f49755E;
    /* renamed from: F */
    public boolean f49756F;
    /* renamed from: G */
    public boolean f49757G;
    /* renamed from: H */
    public boolean f49758H;
    /* renamed from: I */
    public boolean f49759I;
    /* renamed from: J */
    public int f49760J;
    /* renamed from: K */
    public boolean f49761K;
    /* renamed from: L */
    public int f49762L;
    /* renamed from: M */
    public final List f49763M;
    /* renamed from: N */
    public final boolean f49764N;
    /* renamed from: O */
    public final Handler f49765O;
    /* renamed from: P */
    public final AnonymousClass2qa f49766P;
    /* renamed from: Q */
    public AnonymousClass2qi f49767Q;
    /* renamed from: R */
    public final AnonymousClass2qj f49768R;
    /* renamed from: S */
    public int f49769S;
    /* renamed from: T */
    public int f49770T;
    /* renamed from: U */
    public int f49771U;
    /* renamed from: V */
    public boolean f49772V;
    /* renamed from: W */
    public boolean f49773W;
    /* renamed from: X */
    private boolean f49774X;
    /* renamed from: Y */
    private boolean f49775Y;
    /* renamed from: Z */
    private boolean f49776Z;
    /* renamed from: a */
    private AnonymousClass2s0 f49777a;
    /* renamed from: b */
    private final AnonymousClass2s1 f49778b;
    /* renamed from: c */
    private ByteBuffer[] f49779c;
    /* renamed from: d */
    private boolean f49780d;
    /* renamed from: e */
    private String f49781e;
    /* renamed from: f */
    private final AnonymousClass2qV f49782f;
    /* renamed from: g */
    private final AnonymousClass2qT f49783g;
    /* renamed from: h */
    private boolean f49784h;
    /* renamed from: i */
    private final BufferInfo f49785i;
    /* renamed from: j */
    private ByteBuffer[] f49786j;
    /* renamed from: k */
    private boolean f49787k;
    /* renamed from: l */
    private final boolean f49788l;
    /* renamed from: m */
    private final AnonymousClass2ql f49789m;

    /* renamed from: O */
    public void mo5361O() {
    }

    /* renamed from: P */
    public void mo5362P() {
    }

    /* renamed from: W */
    public boolean mo5453W(MediaCodec mediaCodec, boolean z, AnonymousClass2qi anonymousClass2qi, AnonymousClass2qi anonymousClass2qi2) {
        return false;
    }

    /* renamed from: X */
    public abstract void mo5446X(MediaCodec mediaCodec, boolean z, MediaFormat mediaFormat, MediaCrypto mediaCrypto);

    /* renamed from: Z */
    public abstract boolean mo5448Z(AnonymousClass2qT anonymousClass2qT, AnonymousClass2qi anonymousClass2qi);

    /* renamed from: a */
    public abstract boolean mo5449a();

    /* renamed from: d */
    public void mo5450d(MediaFormat mediaFormat) {
    }

    /* renamed from: e */
    public void mo5451e() {
    }

    /* renamed from: f */
    public void mo5477f(long j) {
    }

    /* renamed from: g */
    public abstract boolean mo5452g(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, BufferInfo bufferInfo, int i, boolean z);

    public AnonymousClass45K(AnonymousClass2qn anonymousClass2qn, AnonymousClass2qT anonymousClass2qT, AnonymousClass2s1 anonymousClass2s1, boolean z, Handler handler, AnonymousClass2qa anonymousClass2qa, AnonymousClass2qV anonymousClass2qV) {
        this(new AnonymousClass2qn[]{anonymousClass2qn}, anonymousClass2qT, anonymousClass2s1, z, handler, anonymousClass2qa, anonymousClass2qV);
    }

    public AnonymousClass45K(AnonymousClass2qn[] anonymousClass2qnArr, AnonymousClass2qT anonymousClass2qT, AnonymousClass2s1 anonymousClass2s1, boolean z, Handler handler, AnonymousClass2qa anonymousClass2qa, AnonymousClass2qV anonymousClass2qV) {
        super(anonymousClass2qnArr);
        int i = AnonymousClass2u6.f35518F;
        AnonymousClass2td.m17606E(i >= 16);
        this.f49783g = (AnonymousClass2qT) AnonymousClass2td.m17605D(anonymousClass2qT);
        this.f49778b = anonymousClass2s1;
        this.f49788l = z;
        this.f49765O = handler;
        this.f49766P = anonymousClass2qa;
        boolean z2 = i <= 22 && "foster".equals(AnonymousClass2u6.f35514B) && "NVIDIA".equals(AnonymousClass2u6.f35516D);
        this.f49764N = z2;
        this.f49753C = new AnonymousClass2q6();
        this.f49789m = new AnonymousClass2ql(0);
        this.f49768R = new AnonymousClass2qj();
        this.f49763M = new ArrayList();
        this.f49785i = new BufferInfo();
        this.f49760J = 0;
        this.f49762L = 0;
        this.f49782f = anonymousClass2qV;
    }

    /* renamed from: B */
    private boolean m22786B(long j, long j2) {
        AnonymousClass45K anonymousClass45K = this;
        if (!this.f49787k) {
            if (this.f49770T < 0) {
                this.f49770T = this.f49752B.dequeueOutputBuffer(this.f49785i, 0);
            }
            int i = this.f49770T;
            AnonymousClass2q6 anonymousClass2q6;
            if (i == -2) {
                MediaFormat outputFormat = this.f49752B.getOutputFormat();
                if (this.f49757G) {
                    outputFormat.setInteger("channel-count", 1);
                }
                mo5450d(outputFormat);
                anonymousClass2q6 = this.f49753C;
                anonymousClass2q6.f34760H++;
                return true;
            } else if (i == -3) {
                this.f49786j = this.f49752B.getOutputBuffers();
                anonymousClass2q6 = this.f49753C;
                anonymousClass2q6.f34759G++;
                return true;
            } else if (i < 0) {
                if (this.f49776Z && (this.f49780d || this.f49762L == 2)) {
                    AnonymousClass45K.m22792H(this);
                    return true;
                }
            } else if ((this.f49785i.flags & 4) != 0) {
                AnonymousClass45K.m22792H(this);
                return false;
            } else {
                int D = AnonymousClass45K.m22788D(this, this.f49785i.presentationTimeUs);
                MediaCodec mediaCodec = this.f49752B;
                ByteBuffer[] byteBufferArr = this.f49786j;
                int i2 = this.f49770T;
                if (mo5452g(j, j2, mediaCodec, byteBufferArr[i2], this.f49785i, i2, D != -1)) {
                    mo5477f(anonymousClass45K.f49785i.presentationTimeUs);
                    if (D != -1) {
                        anonymousClass45K.f49763M.remove(D);
                    }
                    anonymousClass45K.f49770T = -1;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    private boolean m22787C(long j, boolean z) {
        AnonymousClass45K anonymousClass45K = this;
        if (!this.f49780d) {
            if (this.f49762L != 2) {
                int dequeueInputBuffer;
                if (this.f49769S < 0) {
                    dequeueInputBuffer = this.f49752B.dequeueInputBuffer(0);
                    this.f49769S = dequeueInputBuffer;
                    if (dequeueInputBuffer >= 0) {
                        AnonymousClass2ql anonymousClass2ql = this.f49789m;
                        anonymousClass2ql.f34878C = this.f49779c[dequeueInputBuffer];
                        anonymousClass2ql.m17466A();
                    }
                }
                if (this.f49762L == 1) {
                    if (!this.f49776Z) {
                        this.f49759I = true;
                        this.f49752B.queueInputBuffer(this.f49769S, 0, 0, 0, 4);
                        this.f49769S = -1;
                    }
                    this.f49762L = 2;
                    return false;
                }
                if (this.f49773W) {
                    dequeueInputBuffer = -3;
                } else {
                    if (this.f49760J == 1) {
                        for (int i = 0; i < this.f49767Q.f34861J.size(); i++) {
                            this.f49789m.f34878C.put((byte[]) this.f49767Q.f34861J.get(i));
                        }
                        this.f49760J = 2;
                    }
                    dequeueInputBuffer = m22398V(j, this.f49768R, this.f49789m);
                    if (z && this.f49771U == 1 && dequeueInputBuffer == -2) {
                        this.f49771U = 2;
                    }
                }
                if (dequeueInputBuffer != -2) {
                    if (dequeueInputBuffer == -4) {
                        if (this.f49760J == 2) {
                            this.f49789m.m17466A();
                            this.f49760J = 1;
                        }
                        mo5454c(this.f49768R);
                        return true;
                    } else if (dequeueInputBuffer == -1) {
                        if (this.f49760J == 2) {
                            this.f49789m.m17466A();
                            this.f49760J = 1;
                        }
                        this.f49780d = true;
                        if (this.f49758H) {
                            try {
                                if (!this.f49776Z) {
                                    this.f49759I = true;
                                    this.f49752B.queueInputBuffer(this.f49769S, 0, 0, 0, 4);
                                    this.f49769S = -1;
                                }
                            } catch (Throwable e) {
                                m22791G(e);
                                throw new AnonymousClass2qE(e);
                            }
                        }
                        AnonymousClass45K.m22792H(this);
                        return false;
                    } else {
                        if (this.f49772V) {
                            int i2 = 1;
                            if ((this.f49789m.f34879D & 1) == 0) {
                                i2 = 0;
                            }
                            if (i2 == 0) {
                                this.f49789m.m17466A();
                                if (this.f49760J == 2) {
                                    this.f49760J = 1;
                                }
                                return true;
                            }
                            this.f49772V = false;
                        }
                        boolean z2 = (this.f49789m.f34879D & 2) != 0;
                        boolean I = m22793I(z2);
                        this.f49773W = I;
                        if (!I) {
                            if (this.f49775Y && !z2) {
                                AnonymousClass2tu.m17614B(this.f49789m.f34878C);
                                if (this.f49789m.f34878C.position() == 0) {
                                    return true;
                                }
                                this.f49775Y = false;
                            }
                            try {
                                int position = this.f49789m.f34878C.position();
                                int i3 = position - anonymousClass45K.f49789m.f34880E;
                                long j2 = anonymousClass45K.f49789m.f34881F;
                                if (anonymousClass45K.f49789m.m17468C()) {
                                    anonymousClass45K.f49763M.add(Long.valueOf(j2));
                                }
                                if (z2) {
                                    anonymousClass45K.f49752B.queueSecureInputBuffer(anonymousClass45K.f49769S, 0, AnonymousClass45K.m22789E(anonymousClass45K.f49789m, i3), j2, 0);
                                } else {
                                    anonymousClass45K.f49752B.queueInputBuffer(anonymousClass45K.f49769S, 0, position, j2, false);
                                }
                                anonymousClass45K.f49769S = -1;
                                anonymousClass45K.f49758H = true;
                                anonymousClass45K.f49760J = 0;
                                AnonymousClass2q6 anonymousClass2q6 = anonymousClass45K.f49753C;
                                anonymousClass2q6.f34757E++;
                                return true;
                            } catch (Throwable e2) {
                                m22791G(e2);
                                throw new AnonymousClass2qE(e2);
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: D */
    private static int m22788D(AnonymousClass45K anonymousClass45K, long j) {
        int size = anonymousClass45K.f49763M.size();
        for (int i = 0; i < size; i++) {
            if (((Long) anonymousClass45K.f49763M.get(i)).longValue() == j) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: E */
    private static CryptoInfo m22789E(AnonymousClass2ql anonymousClass2ql, int i) {
        anonymousClass2ql = anonymousClass2ql.f34877B.f34763B;
        if (i == 0) {
            return anonymousClass2ql;
        }
        if (anonymousClass2ql.numBytesOfClearData == null) {
            anonymousClass2ql.numBytesOfClearData = new int[1];
        }
        int[] iArr = anonymousClass2ql.numBytesOfClearData;
        iArr[0] = iArr[0] + i;
        return anonymousClass2ql;
    }

    /* renamed from: F */
    private void m22790F(AnonymousClass2qZ anonymousClass2qZ) {
        Handler handler = this.f49765O;
        if (!(handler == null || this.f49766P == null)) {
            AnonymousClass0OR.D(handler, new AnonymousClass2qW(this, anonymousClass2qZ), -247379283);
        }
        throw new AnonymousClass2qE((Throwable) anonymousClass2qZ);
    }

    /* renamed from: G */
    private void m22791G(CryptoException cryptoException) {
        Handler handler = this.f49765O;
        if (handler != null && this.f49766P != null) {
            AnonymousClass0OR.D(handler, new AnonymousClass2qX(this, cryptoException), -498354710);
        }
    }

    /* renamed from: H */
    private static void m22792H(AnonymousClass45K anonymousClass45K) {
        if (anonymousClass45K.f49762L == 2) {
            anonymousClass45K.m22813h();
            anonymousClass45K.m22807b();
            return;
        }
        anonymousClass45K.f49787k = true;
        anonymousClass45K.mo5451e();
    }

    /* renamed from: I */
    public boolean mo5170I() {
        return this.f49787k;
    }

    /* renamed from: I */
    private boolean m22793I(boolean z) {
        if (this.f49784h) {
            int DS = this.f49778b.DS();
            if (DS == 0) {
                throw new AnonymousClass2qE(this.f49778b.bL());
            } else if (DS != 4 && (z || !this.f49788l)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: J */
    public boolean mo5171J() {
        /*
        r6 = this;
        r0 = r6.f49767Q;
        if (r0 == 0) goto L_0x0024;
    L_0x0004:
        r0 = r6.f49773W;
        if (r0 != 0) goto L_0x0024;
    L_0x0008:
        r0 = r6.f49771U;
        if (r0 != 0) goto L_0x0022;
    L_0x000c:
        r0 = r6.f49770T;
        if (r0 >= 0) goto L_0x0022;
    L_0x0010:
        r4 = android.os.SystemClock.elapsedRealtime();
        r2 = r6.f49754D;
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 + r0;
        r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x001f;
    L_0x001d:
        r0 = 1;
        goto L_0x0020;
    L_0x001f:
        r0 = 0;
    L_0x0020:
        if (r0 == 0) goto L_0x0024;
    L_0x0022:
        r0 = 1;
        goto L_0x0025;
    L_0x0024:
        r0 = 0;
    L_0x0025:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.45K.J():boolean");
    }

    /* renamed from: L */
    public void mo5174L() {
        this.f49767Q = null;
        this.f49777a = null;
        try {
            m22813h();
            try {
                if (this.f49784h) {
                    this.f49778b.close();
                    this.f49784h = false;
                }
                super.mo5174L();
            } catch (Throwable th) {
                super.mo5174L();
            }
        } catch (Throwable th2) {
            super.mo5174L();
        }
    }

    /* renamed from: S */
    public final void mo5363S(long j, long j2, boolean z) {
        int i;
        if (z) {
            i = this.f49771U;
            if (i == 0) {
                i = 1;
            }
        } else {
            i = 0;
        }
        this.f49771U = i;
        if (this.f49767Q == null && m22398V(j, this.f49768R, null) == -4) {
            mo5454c(this.f49768R);
        }
        m22807b();
        if (this.f49752B != null) {
            AnonymousClass2u3.m17644B("drainAndFeed");
            while (m22786B(j, j2)) {
            }
            if (m22787C(j, true)) {
                while (m22787C(j, false)) {
                }
            }
            AnonymousClass2u3.m17645C();
        }
        synchronized (this.f49753C) {
        }
    }

    /* renamed from: T */
    public final boolean mo5364T(AnonymousClass2qi anonymousClass2qi) {
        return mo5448Z(this.f49783g, anonymousClass2qi);
    }

    /* renamed from: U */
    public void mo5365U(long j) {
        this.f49771U = 0;
        this.f49780d = false;
        this.f49787k = false;
        if (this.f49752B != null) {
            this.f49754D = -1;
            this.f49769S = -1;
            this.f49770T = -1;
            this.f49772V = true;
            this.f49773W = false;
            this.f49763M.clear();
            if (!this.f49756F) {
                if (!this.f49755E || !this.f49759I) {
                    if (this.f49762L == 0) {
                        try {
                            AnonymousClass2u3.m17644B("codec.flush");
                            this.f49752B.flush();
                            this.f49758H = false;
                            if (this.f49761K && this.f49767Q != null) {
                                this.f49760J = 1;
                                return;
                            }
                        } finally {
                            AnonymousClass2u3.m17645C();
                        }
                    }
                }
            }
            m22813h();
            m22807b();
            if (this.f49761K) {
            }
        }
    }

    /* renamed from: Y */
    public AnonymousClass2q8 mo5447Y(AnonymousClass2qT anonymousClass2qT, String str, boolean z) {
        return anonymousClass2qT.wK(str, z);
    }

    /* renamed from: b */
    public final void m22807b() {
        if (mo5455i()) {
            int DS;
            MediaCrypto mediaCrypto;
            boolean GLA;
            AnonymousClass2q8 Y;
            String str;
            AnonymousClass2qi anonymousClass2qi;
            boolean z;
            AnonymousClass2qi anonymousClass2qi2;
            boolean z2;
            long elapsedRealtime;
            MediaCodec mediaCodec;
            boolean z3;
            AnonymousClass2qi anonymousClass2qi3;
            MediaFormat mediaFormat;
            String str2;
            String str3;
            int i;
            StringBuilder stringBuilder;
            long j;
            MediaFormat mediaFormat2;
            long elapsedRealtime2;
            long j2;
            Handler handler;
            AnonymousClass2q6 anonymousClass2q6;
            String str4 = r4.f49767Q.f34866O;
            if (f49751n) {
                AnonymousClass2s0 anonymousClass2s0 = r4.f49777a;
                if (anonymousClass2s0 != null) {
                    AnonymousClass2s1 anonymousClass2s1 = r4.f49778b;
                    if (anonymousClass2s1 != null) {
                        if (!r4.f49784h) {
                            anonymousClass2s1.wGA(anonymousClass2s0);
                            r4.f49784h = true;
                        }
                        DS = r4.f49778b.DS();
                        if (DS == 0) {
                            throw new AnonymousClass2qE(r4.f49778b.bL());
                        } else if (DS == 3 || DS == 4) {
                            mediaCrypto = ((AnonymousClass3uJ) r4.f49778b.IO()).f46408B;
                            GLA = r4.f49778b.GLA(str4);
                            Y = mo5447Y(r4.f49783g, str4, GLA);
                            if (Y == null) {
                                m22790F(new AnonymousClass2qZ(r4.f49767Q, null, GLA, -49999));
                            }
                            str = Y.f34771C;
                            r4.f49774X = Y.f34770B;
                            anonymousClass2qi = r4.f49767Q;
                            DS = AnonymousClass2u6.f35518F;
                            z = DS >= 21 && anonymousClass2qi.f34861J.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
                            r4.f49775Y = z;
                            if (DS >= 18 && !(DS == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str)))) {
                                if (DS == 19 && AnonymousClass2u6.f35517E.startsWith("SM-G800")) {
                                    if (!"OMX.Exynos.avc.dec".equals(str)) {
                                        if ("OMX.Exynos.avc.dec.secure".equals(str)) {
                                        }
                                    }
                                }
                                z = false;
                                r4.f49756F = z;
                                DS = AnonymousClass2u6.f35518F;
                                z = DS > 17 && "OMX.rk.video_decoder.avc".equals(str);
                                r4.f49776Z = z;
                                z = DS > 23 && "OMX.google.vorbis.decoder".equals(str);
                                r4.f49755E = z;
                                anonymousClass2qi2 = r4.f49767Q;
                                z2 = true;
                                if (AnonymousClass2u6.f35518F <= 18 || anonymousClass2qi2.f34855D != 1 || !"OMX.MTK.AUDIO.DECODER.MP3".equals(str)) {
                                    z2 = false;
                                }
                                r4.f49757G = z2;
                                elapsedRealtime = SystemClock.elapsedRealtime();
                                r4.f49752B = AnonymousClass2qS.f34816D.m17443A(mo5449a(), r4.f49782f, str);
                                r4.f49781e = str;
                                mediaCodec = r4.f49752B;
                                z3 = Y.f34770B;
                                anonymousClass2qi3 = r4.f49767Q;
                                if (anonymousClass2qi3.f34859H == null) {
                                    mediaFormat = new MediaFormat();
                                    mediaFormat.setString("mime", anonymousClass2qi3.f34866O);
                                    str2 = "language";
                                    str3 = anonymousClass2qi3.f34862K;
                                    if (str3 != null) {
                                        mediaFormat.setString(str2, str3);
                                    }
                                    AnonymousClass2qi.m17464F(mediaFormat, "max-input-size", anonymousClass2qi3.f34864M);
                                    AnonymousClass2qi.m17464F(mediaFormat, "width", anonymousClass2qi3.f34872U);
                                    AnonymousClass2qi.m17464F(mediaFormat, "height", anonymousClass2qi3.f34860I);
                                    AnonymousClass2qi.m17464F(mediaFormat, "rotation-degrees", anonymousClass2qi3.f34868Q);
                                    AnonymousClass2qi.m17464F(mediaFormat, "max-width", anonymousClass2qi3.f34865N);
                                    AnonymousClass2qi.m17464F(mediaFormat, "max-height", anonymousClass2qi3.f34863L);
                                    AnonymousClass2qi.m17464F(mediaFormat, "channel-count", anonymousClass2qi3.f34855D);
                                    AnonymousClass2qi.m17464F(mediaFormat, "sample-rate", anonymousClass2qi3.f34869R);
                                    AnonymousClass2qi.m17464F(mediaFormat, "encoder-delay", anonymousClass2qi3.f34857F);
                                    AnonymousClass2qi.m17464F(mediaFormat, "encoder-padding", anonymousClass2qi3.f34858G);
                                    if (anonymousClass2qi3.f34873V) {
                                        AnonymousClass2qi.m17464F(mediaFormat, "is-adts", 1);
                                    }
                                    for (i = 0; i < anonymousClass2qi3.f34861J.size(); i++) {
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append("csd-");
                                        stringBuilder.append(i);
                                        mediaFormat.setByteBuffer(stringBuilder.toString(), ByteBuffer.wrap((byte[]) anonymousClass2qi3.f34861J.get(i)));
                                    }
                                    j = anonymousClass2qi3.f34856E;
                                    if (j != -1) {
                                        mediaFormat.setLong("durationUs", j);
                                    }
                                    anonymousClass2qi3.f34859H = mediaFormat;
                                }
                                mediaFormat2 = anonymousClass2qi3.f34859H;
                                if (r4.f49764N) {
                                    mediaFormat2.setInteger("auto-frc", 0);
                                }
                                mo5446X(mediaCodec, z3, mediaFormat2, mediaCrypto);
                                AnonymousClass2u3.m17644B("codec.start()");
                                r4.f49752B.start();
                                AnonymousClass2u3.m17645C();
                                elapsedRealtime2 = SystemClock.elapsedRealtime();
                                j2 = elapsedRealtime2 - elapsedRealtime;
                                handler = r4.f49765O;
                                if (!(handler == null || r4.f49766P == null)) {
                                    AnonymousClass0OR.D(handler, new AnonymousClass2qY(r4, str, elapsedRealtime2, j2), 877716779);
                                }
                                r4.f49779c = r4.f49752B.getInputBuffers();
                                r4.f49786j = r4.f49752B.getOutputBuffers();
                                r4.f49754D = r4.f46182B != 3 ? SystemClock.elapsedRealtime() : -1;
                                r4.f49769S = -1;
                                r4.f49770T = -1;
                                r4.f49772V = true;
                                anonymousClass2q6 = r4.f49753C;
                                anonymousClass2q6.f34754B++;
                            }
                            z = true;
                            r4.f49756F = z;
                            DS = AnonymousClass2u6.f35518F;
                            if (DS > 17) {
                            }
                            r4.f49776Z = z;
                            if (DS > 23) {
                            }
                            r4.f49755E = z;
                            anonymousClass2qi2 = r4.f49767Q;
                            z2 = true;
                            if (AnonymousClass2u6.f35518F <= 18) {
                            }
                            z2 = false;
                            r4.f49757G = z2;
                            elapsedRealtime = SystemClock.elapsedRealtime();
                            r4.f49752B = AnonymousClass2qS.f34816D.m17443A(mo5449a(), r4.f49782f, str);
                            r4.f49781e = str;
                            mediaCodec = r4.f49752B;
                            z3 = Y.f34770B;
                            anonymousClass2qi3 = r4.f49767Q;
                            if (anonymousClass2qi3.f34859H == null) {
                                mediaFormat = new MediaFormat();
                                mediaFormat.setString("mime", anonymousClass2qi3.f34866O);
                                str2 = "language";
                                str3 = anonymousClass2qi3.f34862K;
                                if (str3 != null) {
                                    mediaFormat.setString(str2, str3);
                                }
                                AnonymousClass2qi.m17464F(mediaFormat, "max-input-size", anonymousClass2qi3.f34864M);
                                AnonymousClass2qi.m17464F(mediaFormat, "width", anonymousClass2qi3.f34872U);
                                AnonymousClass2qi.m17464F(mediaFormat, "height", anonymousClass2qi3.f34860I);
                                AnonymousClass2qi.m17464F(mediaFormat, "rotation-degrees", anonymousClass2qi3.f34868Q);
                                AnonymousClass2qi.m17464F(mediaFormat, "max-width", anonymousClass2qi3.f34865N);
                                AnonymousClass2qi.m17464F(mediaFormat, "max-height", anonymousClass2qi3.f34863L);
                                AnonymousClass2qi.m17464F(mediaFormat, "channel-count", anonymousClass2qi3.f34855D);
                                AnonymousClass2qi.m17464F(mediaFormat, "sample-rate", anonymousClass2qi3.f34869R);
                                AnonymousClass2qi.m17464F(mediaFormat, "encoder-delay", anonymousClass2qi3.f34857F);
                                AnonymousClass2qi.m17464F(mediaFormat, "encoder-padding", anonymousClass2qi3.f34858G);
                                if (anonymousClass2qi3.f34873V) {
                                    AnonymousClass2qi.m17464F(mediaFormat, "is-adts", 1);
                                }
                                for (i = 0; i < anonymousClass2qi3.f34861J.size(); i++) {
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("csd-");
                                    stringBuilder.append(i);
                                    mediaFormat.setByteBuffer(stringBuilder.toString(), ByteBuffer.wrap((byte[]) anonymousClass2qi3.f34861J.get(i)));
                                }
                                j = anonymousClass2qi3.f34856E;
                                if (j != -1) {
                                    mediaFormat.setLong("durationUs", j);
                                }
                                anonymousClass2qi3.f34859H = mediaFormat;
                            }
                            mediaFormat2 = anonymousClass2qi3.f34859H;
                            if (r4.f49764N) {
                                mediaFormat2.setInteger("auto-frc", 0);
                            }
                            mo5446X(mediaCodec, z3, mediaFormat2, mediaCrypto);
                            AnonymousClass2u3.m17644B("codec.start()");
                            r4.f49752B.start();
                            AnonymousClass2u3.m17645C();
                            elapsedRealtime2 = SystemClock.elapsedRealtime();
                            j2 = elapsedRealtime2 - elapsedRealtime;
                            handler = r4.f49765O;
                            AnonymousClass0OR.D(handler, new AnonymousClass2qY(r4, str, elapsedRealtime2, j2), 877716779);
                            r4.f49779c = r4.f49752B.getInputBuffers();
                            r4.f49786j = r4.f49752B.getOutputBuffers();
                            if (r4.f46182B != 3) {
                            }
                            r4.f49754D = r4.f46182B != 3 ? SystemClock.elapsedRealtime() : -1;
                            r4.f49769S = -1;
                            r4.f49770T = -1;
                            r4.f49772V = true;
                            anonymousClass2q6 = r4.f49753C;
                            anonymousClass2q6.f34754B++;
                        }
                    }
                    throw new AnonymousClass2qE("Media requires a DrmSessionManager");
                }
            }
            mediaCrypto = null;
            GLA = false;
            try {
                Y = mo5447Y(r4.f49783g, str4, GLA);
            } catch (Throwable e) {
                m22790F(new AnonymousClass2qZ(r4.f49767Q, e, GLA, -49998));
                Y = null;
            }
            if (Y == null) {
                m22790F(new AnonymousClass2qZ(r4.f49767Q, null, GLA, -49999));
            }
            str = Y.f34771C;
            r4.f49774X = Y.f34770B;
            anonymousClass2qi = r4.f49767Q;
            DS = AnonymousClass2u6.f35518F;
            if (DS >= 21) {
            }
            r4.f49775Y = z;
            if ("OMX.Exynos.avc.dec".equals(str)) {
                if ("OMX.Exynos.avc.dec.secure".equals(str)) {
                }
                z = false;
                r4.f49756F = z;
                DS = AnonymousClass2u6.f35518F;
                if (DS > 17) {
                }
                r4.f49776Z = z;
                if (DS > 23) {
                }
                r4.f49755E = z;
                anonymousClass2qi2 = r4.f49767Q;
                z2 = true;
                if (AnonymousClass2u6.f35518F <= 18) {
                }
                z2 = false;
                r4.f49757G = z2;
                elapsedRealtime = SystemClock.elapsedRealtime();
                r4.f49752B = AnonymousClass2qS.f34816D.m17443A(mo5449a(), r4.f49782f, str);
                r4.f49781e = str;
                mediaCodec = r4.f49752B;
                z3 = Y.f34770B;
                anonymousClass2qi3 = r4.f49767Q;
                if (anonymousClass2qi3.f34859H == null) {
                    mediaFormat = new MediaFormat();
                    mediaFormat.setString("mime", anonymousClass2qi3.f34866O);
                    str2 = "language";
                    str3 = anonymousClass2qi3.f34862K;
                    if (str3 != null) {
                        mediaFormat.setString(str2, str3);
                    }
                    AnonymousClass2qi.m17464F(mediaFormat, "max-input-size", anonymousClass2qi3.f34864M);
                    AnonymousClass2qi.m17464F(mediaFormat, "width", anonymousClass2qi3.f34872U);
                    AnonymousClass2qi.m17464F(mediaFormat, "height", anonymousClass2qi3.f34860I);
                    AnonymousClass2qi.m17464F(mediaFormat, "rotation-degrees", anonymousClass2qi3.f34868Q);
                    AnonymousClass2qi.m17464F(mediaFormat, "max-width", anonymousClass2qi3.f34865N);
                    AnonymousClass2qi.m17464F(mediaFormat, "max-height", anonymousClass2qi3.f34863L);
                    AnonymousClass2qi.m17464F(mediaFormat, "channel-count", anonymousClass2qi3.f34855D);
                    AnonymousClass2qi.m17464F(mediaFormat, "sample-rate", anonymousClass2qi3.f34869R);
                    AnonymousClass2qi.m17464F(mediaFormat, "encoder-delay", anonymousClass2qi3.f34857F);
                    AnonymousClass2qi.m17464F(mediaFormat, "encoder-padding", anonymousClass2qi3.f34858G);
                    if (anonymousClass2qi3.f34873V) {
                        AnonymousClass2qi.m17464F(mediaFormat, "is-adts", 1);
                    }
                    for (i = 0; i < anonymousClass2qi3.f34861J.size(); i++) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("csd-");
                        stringBuilder.append(i);
                        mediaFormat.setByteBuffer(stringBuilder.toString(), ByteBuffer.wrap((byte[]) anonymousClass2qi3.f34861J.get(i)));
                    }
                    j = anonymousClass2qi3.f34856E;
                    if (j != -1) {
                        mediaFormat.setLong("durationUs", j);
                    }
                    anonymousClass2qi3.f34859H = mediaFormat;
                }
                mediaFormat2 = anonymousClass2qi3.f34859H;
                if (r4.f49764N) {
                    mediaFormat2.setInteger("auto-frc", 0);
                }
                mo5446X(mediaCodec, z3, mediaFormat2, mediaCrypto);
                AnonymousClass2u3.m17644B("codec.start()");
                r4.f49752B.start();
                AnonymousClass2u3.m17645C();
                elapsedRealtime2 = SystemClock.elapsedRealtime();
                j2 = elapsedRealtime2 - elapsedRealtime;
                handler = r4.f49765O;
                AnonymousClass0OR.D(handler, new AnonymousClass2qY(r4, str, elapsedRealtime2, j2), 877716779);
                r4.f49779c = r4.f49752B.getInputBuffers();
                r4.f49786j = r4.f49752B.getOutputBuffers();
                if (r4.f46182B != 3) {
                }
                r4.f49754D = r4.f46182B != 3 ? SystemClock.elapsedRealtime() : -1;
                r4.f49769S = -1;
                r4.f49770T = -1;
                r4.f49772V = true;
                anonymousClass2q6 = r4.f49753C;
                anonymousClass2q6.f34754B++;
            }
            z = true;
            r4.f49756F = z;
            DS = AnonymousClass2u6.f35518F;
            if (DS > 17) {
            }
            r4.f49776Z = z;
            if (DS > 23) {
            }
            r4.f49755E = z;
            anonymousClass2qi2 = r4.f49767Q;
            z2 = true;
            if (AnonymousClass2u6.f35518F <= 18) {
            }
            z2 = false;
            r4.f49757G = z2;
            try {
                elapsedRealtime = SystemClock.elapsedRealtime();
                r4.f49752B = AnonymousClass2qS.f34816D.m17443A(mo5449a(), r4.f49782f, str);
                r4.f49781e = str;
                mediaCodec = r4.f49752B;
                z3 = Y.f34770B;
                anonymousClass2qi3 = r4.f49767Q;
                if (anonymousClass2qi3.f34859H == null) {
                    mediaFormat = new MediaFormat();
                    mediaFormat.setString("mime", anonymousClass2qi3.f34866O);
                    str2 = "language";
                    str3 = anonymousClass2qi3.f34862K;
                    if (str3 != null) {
                        mediaFormat.setString(str2, str3);
                    }
                    AnonymousClass2qi.m17464F(mediaFormat, "max-input-size", anonymousClass2qi3.f34864M);
                    AnonymousClass2qi.m17464F(mediaFormat, "width", anonymousClass2qi3.f34872U);
                    AnonymousClass2qi.m17464F(mediaFormat, "height", anonymousClass2qi3.f34860I);
                    AnonymousClass2qi.m17464F(mediaFormat, "rotation-degrees", anonymousClass2qi3.f34868Q);
                    AnonymousClass2qi.m17464F(mediaFormat, "max-width", anonymousClass2qi3.f34865N);
                    AnonymousClass2qi.m17464F(mediaFormat, "max-height", anonymousClass2qi3.f34863L);
                    AnonymousClass2qi.m17464F(mediaFormat, "channel-count", anonymousClass2qi3.f34855D);
                    AnonymousClass2qi.m17464F(mediaFormat, "sample-rate", anonymousClass2qi3.f34869R);
                    AnonymousClass2qi.m17464F(mediaFormat, "encoder-delay", anonymousClass2qi3.f34857F);
                    AnonymousClass2qi.m17464F(mediaFormat, "encoder-padding", anonymousClass2qi3.f34858G);
                    if (anonymousClass2qi3.f34873V) {
                        AnonymousClass2qi.m17464F(mediaFormat, "is-adts", 1);
                    }
                    for (i = 0; i < anonymousClass2qi3.f34861J.size(); i++) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("csd-");
                        stringBuilder.append(i);
                        mediaFormat.setByteBuffer(stringBuilder.toString(), ByteBuffer.wrap((byte[]) anonymousClass2qi3.f34861J.get(i)));
                    }
                    j = anonymousClass2qi3.f34856E;
                    if (j != -1) {
                        mediaFormat.setLong("durationUs", j);
                    }
                    anonymousClass2qi3.f34859H = mediaFormat;
                }
                mediaFormat2 = anonymousClass2qi3.f34859H;
                if (r4.f49764N) {
                    mediaFormat2.setInteger("auto-frc", 0);
                }
                mo5446X(mediaCodec, z3, mediaFormat2, mediaCrypto);
                AnonymousClass2u3.m17644B("codec.start()");
                r4.f49752B.start();
                AnonymousClass2u3.m17645C();
                elapsedRealtime2 = SystemClock.elapsedRealtime();
                j2 = elapsedRealtime2 - elapsedRealtime;
                handler = r4.f49765O;
                AnonymousClass0OR.D(handler, new AnonymousClass2qY(r4, str, elapsedRealtime2, j2), 877716779);
                r4.f49779c = r4.f49752B.getInputBuffers();
                r4.f49786j = r4.f49752B.getOutputBuffers();
            } catch (Throwable e2) {
                m22790F(new AnonymousClass2qZ(r4.f49767Q, e2, GLA, str));
            }
            if (r4.f46182B != 3) {
            }
            r4.f49754D = r4.f46182B != 3 ? SystemClock.elapsedRealtime() : -1;
            r4.f49769S = -1;
            r4.f49770T = -1;
            r4.f49772V = true;
            anonymousClass2q6 = r4.f49753C;
            anonymousClass2q6.f34754B++;
        }
    }

    /* renamed from: c */
    public void mo5454c(AnonymousClass2qj anonymousClass2qj) {
        AnonymousClass2qi anonymousClass2qi = this.f49767Q;
        this.f49767Q = anonymousClass2qj.f34876C;
        this.f49777a = anonymousClass2qj.f34875B;
        MediaCodec mediaCodec = this.f49752B;
        if (mediaCodec != null && mo5453W(mediaCodec, this.f49774X, anonymousClass2qi, this.f49767Q)) {
            this.f49761K = true;
            this.f49760J = 1;
        } else if (this.f49758H) {
            this.f49762L = 1;
        } else {
            m22813h();
            m22807b();
        }
    }

    /* renamed from: h */
    public final void m22813h() {
        if (this.f49752B != null) {
            this.f49754D = -1;
            this.f49769S = -1;
            this.f49770T = -1;
            this.f49773W = false;
            this.f49763M.clear();
            this.f49779c = null;
            this.f49786j = null;
            this.f49761K = false;
            this.f49758H = false;
            this.f49774X = false;
            this.f49775Y = false;
            this.f49756F = false;
            this.f49776Z = false;
            this.f49755E = false;
            this.f49757G = false;
            this.f49759I = false;
            this.f49760J = 0;
            this.f49762L = 0;
            AnonymousClass2q6 anonymousClass2q6 = this.f49753C;
            anonymousClass2q6.f34755C++;
            try {
                AnonymousClass2qS.f34816D.m17445C(mo5449a(), this.f49782f, this.f49781e, this.f49752B);
            } finally {
                this.f49752B = null;
                this.f49781e = null;
            }
        }
    }

    /* renamed from: i */
    public boolean mo5455i() {
        return this.f49752B == null && this.f49767Q != null;
    }
}
