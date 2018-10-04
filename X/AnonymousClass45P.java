package X;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer2.Format;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.45P */
public abstract class AnonymousClass45P extends AnonymousClass43u {
    /* renamed from: o */
    private static final byte[] f49861o;
    /* renamed from: B */
    public MediaCodec f49862B;
    /* renamed from: C */
    public AnonymousClass2vu f49863C;
    /* renamed from: D */
    public AnonymousClass2vB f49864D;
    /* renamed from: E */
    public ByteBuffer[] f49865E;
    /* renamed from: F */
    public ByteBuffer[] f49866F;
    /* renamed from: G */
    public int f49867G;
    /* renamed from: H */
    private final AnonymousClass3vB f49868H;
    /* renamed from: I */
    private int f49869I;
    /* renamed from: J */
    private long f49870J;
    /* renamed from: K */
    private boolean f49871K;
    /* renamed from: L */
    private boolean f49872L;
    /* renamed from: M */
    private boolean f49873M;
    /* renamed from: N */
    private boolean f49874N;
    /* renamed from: O */
    private boolean f49875O;
    /* renamed from: P */
    private boolean f49876P;
    /* renamed from: Q */
    private boolean f49877Q;
    /* renamed from: R */
    private boolean f49878R;
    /* renamed from: S */
    private boolean f49879S;
    /* renamed from: T */
    private int f49880T;
    /* renamed from: U */
    private boolean f49881U;
    /* renamed from: V */
    private int f49882V;
    /* renamed from: W */
    private final List f49883W;
    /* renamed from: X */
    private AnonymousClass2vG f49884X;
    /* renamed from: Y */
    private final AnonymousClass2vH f49885Y;
    /* renamed from: Z */
    private final AnonymousClass3vB f49886Z;
    /* renamed from: a */
    private Format f49887a;
    /* renamed from: b */
    private final AnonymousClass2uL f49888b;
    /* renamed from: c */
    private int f49889c;
    /* renamed from: d */
    private boolean f49890d;
    /* renamed from: e */
    private final AnonymousClass2vw f49891e;
    /* renamed from: f */
    private ByteBuffer f49892f;
    /* renamed from: g */
    private final BufferInfo f49893g;
    /* renamed from: h */
    private boolean f49894h;
    /* renamed from: i */
    private AnonymousClass2vG f49895i;
    /* renamed from: j */
    private final boolean f49896j;
    /* renamed from: k */
    private boolean f49897k;
    /* renamed from: l */
    private boolean f49898l;
    /* renamed from: m */
    private boolean f49899m;
    /* renamed from: n */
    private boolean f49900n;

    /* renamed from: E */
    public void m22880E() {
    }

    /* renamed from: G */
    public void mo5370G() {
    }

    /* renamed from: J */
    public int mo5459J(MediaCodec mediaCodec, AnonymousClass2vu anonymousClass2vu, Format format, Format format2) {
        return 0;
    }

    /* renamed from: K */
    public abstract void mo5460K(AnonymousClass2vu anonymousClass2vu, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto);

    public final int MVA() {
        return 8;
    }

    /* renamed from: O */
    public void mo5462O(String str, long j, long j2) {
    }

    /* renamed from: Q */
    public void mo5464Q(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }

    /* renamed from: R */
    public void mo5472R(long j) {
    }

    /* renamed from: S */
    public void mo5465S(AnonymousClass3vB anonymousClass3vB) {
    }

    /* renamed from: T */
    public abstract boolean mo5466T(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z);

    /* renamed from: V */
    public void mo5467V() {
    }

    /* renamed from: W */
    public boolean mo5474W(AnonymousClass2vu anonymousClass2vu) {
        return true;
    }

    /* renamed from: X */
    public abstract int mo5468X(AnonymousClass2vw anonymousClass2vw, AnonymousClass2vH anonymousClass2vH, Format format);

    static {
        String str = "0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78";
        byte[] bArr = new byte[(str.length() / 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        f49861o = bArr;
    }

    public AnonymousClass45P(int i, AnonymousClass2vw anonymousClass2vw, AnonymousClass2vH anonymousClass2vH, boolean z) {
        super(i);
        AnonymousClass2yO.m18017F(AnonymousClass2yi.f36552F >= 16);
        this.f49891e = (AnonymousClass2vw) AnonymousClass2yO.m18016E(anonymousClass2vw);
        this.f49885Y = anonymousClass2vH;
        this.f49896j = z;
        this.f49868H = new AnonymousClass3vB(0);
        this.f49886Z = new AnonymousClass3vB(0);
        this.f49888b = new AnonymousClass2uL();
        this.f49883W = new ArrayList();
        this.f49893g = new BufferInfo();
        this.f49880T = 0;
        this.f49882V = 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: A */
    public void mo5366A() {
        /*
        r4 = this;
        r2 = 0;
        r4.f49887a = r2;
        r4.mo5473U();	 Catch:{ all -> 0x004a }
        r0 = r4.f49884X;	 Catch:{ all -> 0x002d }
        if (r0 == 0) goto L_0x0011;
    L_0x000a:
        r1 = r4.f49885Y;	 Catch:{ all -> 0x002d }
        r0 = r4.f49884X;	 Catch:{ all -> 0x002d }
        r1.releaseSession(r0);	 Catch:{ all -> 0x002d }
    L_0x0011:
        r0 = r4.f49895i;	 Catch:{ all -> 0x0027 }
        if (r0 == 0) goto L_0x0022;
    L_0x0015:
        r1 = r4.f49895i;	 Catch:{ all -> 0x0027 }
        r0 = r4.f49884X;	 Catch:{ all -> 0x0027 }
        if (r1 == r0) goto L_0x0022;
    L_0x001b:
        r1 = r4.f49885Y;	 Catch:{ all -> 0x0027 }
        r0 = r4.f49895i;	 Catch:{ all -> 0x0027 }
        r1.releaseSession(r0);	 Catch:{ all -> 0x0027 }
    L_0x0022:
        r4.f49884X = r2;
        r4.f49895i = r2;
        return;
    L_0x0027:
        r0 = move-exception;
        r4.f49884X = r2;
        r4.f49895i = r2;
        throw r0;
    L_0x002d:
        r3 = move-exception;
        r0 = r4.f49895i;	 Catch:{ all -> 0x0044 }
        if (r0 == 0) goto L_0x003f;
    L_0x0032:
        r1 = r4.f49895i;	 Catch:{ all -> 0x0044 }
        r0 = r4.f49884X;	 Catch:{ all -> 0x0044 }
        if (r1 == r0) goto L_0x003f;
    L_0x0038:
        r1 = r4.f49885Y;	 Catch:{ all -> 0x0044 }
        r0 = r4.f49895i;	 Catch:{ all -> 0x0044 }
        r1.releaseSession(r0);	 Catch:{ all -> 0x0044 }
    L_0x003f:
        r4.f49884X = r2;
        r4.f49895i = r2;
        throw r3;
    L_0x0044:
        r0 = move-exception;
        r4.f49884X = r2;
        r4.f49895i = r2;
        throw r0;
    L_0x004a:
        r3 = move-exception;
        r0 = r4.f49884X;	 Catch:{ all -> 0x006e }
        if (r0 == 0) goto L_0x0056;
    L_0x004f:
        r1 = r4.f49885Y;	 Catch:{ all -> 0x006e }
        r0 = r4.f49884X;	 Catch:{ all -> 0x006e }
        r1.releaseSession(r0);	 Catch:{ all -> 0x006e }
    L_0x0056:
        r0 = r4.f49895i;	 Catch:{ all -> 0x0068 }
        if (r0 == 0) goto L_0x003f;
    L_0x005a:
        r1 = r4.f49895i;	 Catch:{ all -> 0x0068 }
        r0 = r4.f49884X;	 Catch:{ all -> 0x0068 }
        if (r1 == r0) goto L_0x003f;
    L_0x0060:
        r1 = r4.f49885Y;	 Catch:{ all -> 0x0068 }
        r0 = r4.f49895i;	 Catch:{ all -> 0x0068 }
        r1.releaseSession(r0);	 Catch:{ all -> 0x0068 }
        goto L_0x003f;
    L_0x0068:
        r0 = move-exception;
        r4.f49884X = r2;
        r4.f49895i = r2;
        throw r0;
    L_0x006e:
        r3 = move-exception;
        r0 = r4.f49895i;	 Catch:{ all -> 0x0081 }
        if (r0 == 0) goto L_0x003f;
    L_0x0073:
        r1 = r4.f49895i;	 Catch:{ all -> 0x0081 }
        r0 = r4.f49884X;	 Catch:{ all -> 0x0081 }
        if (r1 == r0) goto L_0x003f;
    L_0x0079:
        r1 = r4.f49885Y;	 Catch:{ all -> 0x0081 }
        r0 = r4.f49895i;	 Catch:{ all -> 0x0081 }
        r1.releaseSession(r0);	 Catch:{ all -> 0x0081 }
        goto L_0x003f;
    L_0x0081:
        r0 = move-exception;
        r4.f49884X = r2;
        r4.f49895i = r2;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.45P.A():void");
    }

    /* renamed from: B */
    public void mo5367B(boolean z) {
        this.f49864D = new AnonymousClass2vB();
    }

    /* renamed from: C */
    private static int m22865C(String str) {
        String str2;
        if (AnonymousClass2yi.f36552F <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            str2 = AnonymousClass2yi.f36551E;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (AnonymousClass2yi.f36552F < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
            str2 = AnonymousClass2yi.f36548B;
            if ("flounder".equals(str2) || "flounder_lte".equals(str2) || "grouper".equals(str2) || "tilapia".equals(str2)) {
                return 1;
            }
        }
        return 0;
    }

    /* renamed from: C */
    public void mo5368C(long j, boolean z) {
        this.f49890d = false;
        this.f49894h = false;
        if (this.f49862B != null) {
            mo5471L();
        }
    }

    /* renamed from: D */
    private boolean m22866D(long r14, long r16) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r13 = this;
        r6 = r13;
        r0 = r13.f49867G;
        if (r0 < 0) goto L_0x0007;
    L_0x0005:
        r0 = 1;
        goto L_0x0008;
    L_0x0007:
        r0 = 0;
    L_0x0008:
        r5 = 1;
        r1 = 0;
        if (r0 != 0) goto L_0x00a8;
    L_0x000c:
        r0 = r13.f49874N;
        if (r0 == 0) goto L_0x002a;
    L_0x0010:
        r0 = r13.f49879S;
        if (r0 == 0) goto L_0x002a;
    L_0x0014:
        r4 = r13.f49862B;	 Catch:{ IllegalStateException -> 0x001f }
        r0 = r13.f49893g;	 Catch:{ IllegalStateException -> 0x001f }
        r2 = 0;	 Catch:{ IllegalStateException -> 0x001f }
        r2 = r4.dequeueOutputBuffer(r0, r2);	 Catch:{ IllegalStateException -> 0x001f }
        goto L_0x0034;	 Catch:{ IllegalStateException -> 0x001f }
    L_0x001f:
        X.AnonymousClass45P.m22871I(r13);
        r0 = r13.f49894h;
        if (r0 == 0) goto L_0x0029;
    L_0x0026:
        r13.mo5473U();
    L_0x0029:
        return r1;
    L_0x002a:
        r4 = r13.f49862B;
        r0 = r13.f49893g;
        r2 = 0;
        r2 = r4.dequeueOutputBuffer(r0, r2);
    L_0x0034:
        if (r2 < 0) goto L_0x007e;
    L_0x0036:
        r0 = r13.f49897k;
        if (r0 == 0) goto L_0x0042;
    L_0x003a:
        r13.f49897k = r1;
        r0 = r13.f49862B;
        r0.releaseOutputBuffer(r2, r1);
        return r5;
    L_0x0042:
        r0 = r13.f49893g;
        r0 = r0.size;
        if (r0 != 0) goto L_0x0054;
    L_0x0048:
        r0 = r13.f49893g;
        r0 = r0.flags;
        r0 = r0 & 4;
        if (r0 == 0) goto L_0x0054;
    L_0x0050:
        X.AnonymousClass45P.m22871I(r13);
        return r1;
    L_0x0054:
        r13.f49867G = r2;
        r2 = X.AnonymousClass45P.m22870H(r13, r2);
        r13.f49892f = r2;
        if (r2 == 0) goto L_0x0073;
    L_0x005e:
        r0 = r13.f49893g;
        r0 = r0.offset;
        r2.position(r0);
        r3 = r13.f49892f;
        r0 = r13.f49893g;
        r2 = r0.offset;
        r0 = r13.f49893g;
        r0 = r0.size;
        r2 = r2 + r0;
        r3.limit(r2);
    L_0x0073:
        r0 = r13.f49893g;
        r2 = r0.presentationTimeUs;
        r0 = X.AnonymousClass45P.m22875M(r13, r2);
        r13.f49898l = r0;
        goto L_0x00a8;
    L_0x007e:
        r0 = -2;
        if (r2 != r0) goto L_0x0085;
    L_0x0081:
        X.AnonymousClass45P.m22872J(r13);
        return r5;
    L_0x0085:
        r0 = -3;
        if (r2 != r0) goto L_0x0097;
    L_0x0088:
        r1 = X.AnonymousClass2yi.f36552F;
        r0 = 21;
        if (r1 >= r0) goto L_0x0096;
    L_0x008e:
        r0 = r13.f49862B;
        r0 = r0.getOutputBuffers();
        r13.f49866F = r0;
    L_0x0096:
        return r5;
    L_0x0097:
        r0 = r13.f49875O;
        if (r0 == 0) goto L_0x0029;
    L_0x009b:
        r0 = r13.f49890d;
        if (r0 != 0) goto L_0x00a4;
    L_0x009f:
        r2 = r13.f49882V;
        r0 = 2;
        if (r2 != r0) goto L_0x0029;
    L_0x00a4:
        X.AnonymousClass45P.m22871I(r13);
        goto L_0x0029;
    L_0x00a8:
        r0 = r13.f49874N;
        r7 = r14;
        r9 = r16;
        if (r0 == 0) goto L_0x00d6;
    L_0x00af:
        r0 = r13.f49879S;
        if (r0 == 0) goto L_0x00d6;
    L_0x00b3:
        r11 = r13.f49862B;	 Catch:{ IllegalStateException -> 0x00ca }
        r12 = r13.f49892f;	 Catch:{ IllegalStateException -> 0x00ca }
        r13 = r13.f49867G;	 Catch:{ IllegalStateException -> 0x00ca }
        r0 = r6.f49893g;	 Catch:{ IllegalStateException -> 0x00ca }
        r14 = r0.flags;	 Catch:{ IllegalStateException -> 0x00ca }
        r0 = r6.f49893g;	 Catch:{ IllegalStateException -> 0x00ca }
        r15 = r0.presentationTimeUs;	 Catch:{ IllegalStateException -> 0x00ca }
        r0 = r6.f49898l;	 Catch:{ IllegalStateException -> 0x00ca }
        r17 = r0;	 Catch:{ IllegalStateException -> 0x00ca }
        r0 = r6.mo5466T(r7, r9, r11, r12, r13, r14, r15, r17);	 Catch:{ IllegalStateException -> 0x00ca }
        goto L_0x00ec;	 Catch:{ IllegalStateException -> 0x00ca }
    L_0x00ca:
        X.AnonymousClass45P.m22871I(r6);
        r0 = r6.f49894h;
        if (r0 == 0) goto L_0x0029;
    L_0x00d1:
        r6.mo5473U();
        goto L_0x0029;
    L_0x00d6:
        r11 = r13.f49862B;
        r12 = r13.f49892f;
        r13 = r13.f49867G;
        r0 = r6.f49893g;
        r14 = r0.flags;
        r0 = r6.f49893g;
        r15 = r0.presentationTimeUs;
        r0 = r6.f49898l;
        r17 = r0;
        r0 = r6.mo5466T(r7, r9, r11, r12, r13, r14, r15, r17);
    L_0x00ec:
        if (r0 == 0) goto L_0x0029;
    L_0x00ee:
        r0 = r6.f49893g;
        r2 = r0.presentationTimeUs;
        r6.mo5472R(r2);
        r0 = r6.f49893g;
        r0 = r0.flags;
        r0 = r0 & 4;
        if (r0 == 0) goto L_0x00ff;
    L_0x00fd:
        r0 = 1;
        goto L_0x0100;
    L_0x00ff:
        r0 = 0;
    L_0x0100:
        X.AnonymousClass45P.m22874L(r6);
        if (r0 != 0) goto L_0x0106;
    L_0x0105:
        goto L_0x0096;
    L_0x0106:
        X.AnonymousClass45P.m22871I(r6);
        goto L_0x0029;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.45P.D(long, long):boolean");
    }

    /* renamed from: E */
    private boolean mo5369E() {
        MediaCodec mediaCodec = this.f49862B;
        if (!(mediaCodec == null || this.f49882V == 2)) {
            if (!this.f49890d) {
                if (this.f49889c < 0) {
                    int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0);
                    this.f49889c = dequeueInputBuffer;
                    if (dequeueInputBuffer >= 0) {
                        this.f49868H.f46800D = AnonymousClass45P.m22869G(this, dequeueInputBuffer);
                        this.f49868H.mo4533B();
                    }
                }
                if (this.f49882V == 1) {
                    if (!this.f49875O) {
                        this.f49879S = true;
                        this.f49862B.queueInputBuffer(this.f49889c, 0, 0, 0, 4);
                        AnonymousClass45P.m22873K(this);
                    }
                    this.f49882V = 2;
                    return false;
                } else if (this.f49871K) {
                    this.f49871K = false;
                    ByteBuffer byteBuffer = this.f49868H.f46800D;
                    byte[] bArr = f49861o;
                    byteBuffer.put(bArr);
                    this.f49862B.queueInputBuffer(this.f49889c, 0, bArr.length, 0, 0);
                    AnonymousClass45P.m22873K(this);
                    this.f49878R = true;
                    return true;
                } else {
                    int i;
                    int i2;
                    if (this.f49900n) {
                        i = -4;
                        i2 = 0;
                    } else {
                        if (this.f49880T == 1) {
                            for (i = 0; i < this.f49887a.f35569S.size(); i++) {
                                this.f49868H.f46800D.put((byte[]) this.f49887a.f35569S.get(i));
                            }
                            this.f49880T = 2;
                        }
                        i2 = this.f49868H.f46800D.position();
                        i = m22437I(this.f49888b, this.f49868H, false);
                    }
                    if (i != -3) {
                        if (i == -5) {
                            if (this.f49880T == 2) {
                                this.f49868H.mo4533B();
                                this.f49880T = 1;
                            }
                            mo5463P(this.f49888b.f35584B);
                            return true;
                        } else if (this.f49868H.m17767E()) {
                            if (this.f49880T == 2) {
                                this.f49868H.mo4533B();
                                this.f49880T = 1;
                            }
                            this.f49890d = true;
                            if (this.f49878R) {
                                try {
                                    if (!this.f49875O) {
                                        this.f49879S = true;
                                        this.f49862B.queueInputBuffer(this.f49889c, 0, 0, 0, 4);
                                        AnonymousClass45P.m22873K(this);
                                    }
                                } catch (Exception e) {
                                    throw AnonymousClass2uC.m17668B(e, this.f49174C);
                                }
                            }
                            AnonymousClass45P.m22871I(this);
                            return false;
                        } else {
                            if (!this.f49899m || this.f49868H.m17765C(1)) {
                                this.f49899m = false;
                                boolean C = this.f49868H.m17765C(1073741824);
                                boolean N = AnonymousClass45P.m22876N(this, C);
                                this.f49900n = N;
                                if (!N) {
                                    if (this.f49872L && !C) {
                                        AnonymousClass2ya.m18035B(this.f49868H.f46800D);
                                        if (this.f49868H.f46800D.position() != 0) {
                                            this.f49872L = false;
                                        }
                                    }
                                    try {
                                        long j = this.f49868H.f46801E;
                                        if (this.f49868H.m17766D()) {
                                            this.f49883W.add(Long.valueOf(j));
                                        }
                                        this.f49868H.f46800D.flip();
                                        mo5465S(this.f49868H);
                                        if (C) {
                                            this.f49862B.queueSecureInputBuffer(this.f49889c, 0, AnonymousClass45P.m22868F(this.f49868H, i2), j, 0);
                                        } else {
                                            this.f49862B.queueInputBuffer(this.f49889c, 0, this.f49868H.f46800D.limit(), j, 0);
                                        }
                                        AnonymousClass45P.m22873K(this);
                                        this.f49878R = true;
                                        this.f49880T = 0;
                                        AnonymousClass2vB anonymousClass2vB = this.f49864D;
                                        anonymousClass2vB.f35776F++;
                                    } catch (Exception e2) {
                                        throw AnonymousClass2uC.m17668B(e2, this.f49174C);
                                    }
                                }
                            } else {
                                this.f49868H.mo4533B();
                                if (this.f49880T == 2) {
                                    this.f49880T = 1;
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: F */
    private static CryptoInfo m22868F(AnonymousClass3vB anonymousClass3vB, int i) {
        anonymousClass3vB = anonymousClass3vB.f46799C.f35764D;
        if (i == 0) {
            return anonymousClass3vB;
        }
        if (anonymousClass3vB.numBytesOfClearData == null) {
            anonymousClass3vB.numBytesOfClearData = new int[1];
        }
        int[] iArr = anonymousClass3vB.numBytesOfClearData;
        iArr[0] = iArr[0] + i;
        return anonymousClass3vB;
    }

    /* renamed from: G */
    private static ByteBuffer m22869G(AnonymousClass45P anonymousClass45P, int i) {
        if (AnonymousClass2yi.f36552F >= 21) {
            return anonymousClass45P.f49862B.getInputBuffer(i);
        }
        return anonymousClass45P.f49865E[i];
    }

    /* renamed from: H */
    private static ByteBuffer m22870H(AnonymousClass45P anonymousClass45P, int i) {
        if (AnonymousClass2yi.f36552F >= 21) {
            return anonymousClass45P.f49862B.getOutputBuffer(i);
        }
        return anonymousClass45P.f49866F[i];
    }

    /* renamed from: I */
    private static void m22871I(AnonymousClass45P anonymousClass45P) {
        if (anonymousClass45P.f49882V == 2) {
            anonymousClass45P.mo5473U();
            anonymousClass45P.m22886N();
            return;
        }
        anonymousClass45P.f49894h = true;
        anonymousClass45P.mo5467V();
    }

    /* renamed from: J */
    private static void m22872J(AnonymousClass45P anonymousClass45P) {
        MediaFormat outputFormat = anonymousClass45P.f49862B.getOutputFormat();
        if (anonymousClass45P.f49869I != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            anonymousClass45P.f49897k = true;
            return;
        }
        if (anonymousClass45P.f49877Q) {
            outputFormat.setInteger("channel-count", 1);
        }
        anonymousClass45P.mo5464Q(anonymousClass45P.f49862B, outputFormat);
    }

    public final int JVA(Format format) {
        try {
            return mo5468X(this.f49891e, this.f49885Y, format);
        } catch (Exception e) {
            throw AnonymousClass2uC.m17668B(e, this.f49174C);
        }
    }

    /* renamed from: K */
    private static void m22873K(AnonymousClass45P anonymousClass45P) {
        anonymousClass45P.f49889c = -1;
        anonymousClass45P.f49868H.f46800D = null;
    }

    /* renamed from: L */
    public void mo5471L() {
        this.f49870J = -9223372036854775807L;
        AnonymousClass45P.m22873K(this);
        AnonymousClass45P.m22874L(this);
        this.f49899m = true;
        this.f49900n = false;
        this.f49898l = false;
        this.f49883W.clear();
        this.f49871K = false;
        this.f49897k = false;
        if (!this.f49876P) {
            if (!this.f49873M || !this.f49879S) {
                if (this.f49882V == 0) {
                    this.f49862B.flush();
                    this.f49878R = false;
                    if (this.f49881U && this.f49887a != null) {
                        this.f49880T = 1;
                        return;
                    }
                }
            }
        }
        mo5473U();
        m22886N();
        if (this.f49881U) {
        }
    }

    /* renamed from: L */
    private static void m22874L(AnonymousClass45P anonymousClass45P) {
        anonymousClass45P.f49867G = -1;
        anonymousClass45P.f49892f = null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean LY() {
        /*
        r4 = this;
        r0 = r4.f49887a;
        if (r0 == 0) goto L_0x0037;
    L_0x0004:
        r0 = r4.f49900n;
        if (r0 != 0) goto L_0x0037;
    L_0x0008:
        r0 = r4.f49175D;
        if (r0 == 0) goto L_0x000f;
    L_0x000c:
        r0 = r4.f49178G;
        goto L_0x0015;
    L_0x000f:
        r0 = r4.f49176E;
        r0 = r0.LY();
    L_0x0015:
        if (r0 != 0) goto L_0x0035;
    L_0x0017:
        r0 = r4.f49867G;
        if (r0 < 0) goto L_0x001d;
    L_0x001b:
        r0 = 1;
        goto L_0x001e;
    L_0x001d:
        r0 = 0;
    L_0x001e:
        if (r0 != 0) goto L_0x0035;
    L_0x0020:
        r2 = r4.f49870J;
        r0 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 == 0) goto L_0x0037;
    L_0x002b:
        r2 = android.os.SystemClock.elapsedRealtime();
        r0 = r4.f49870J;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x0037;
    L_0x0035:
        r0 = 1;
        goto L_0x0038;
    L_0x0037:
        r0 = 0;
    L_0x0038:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.45P.LY():boolean");
    }

    /* renamed from: M */
    public AnonymousClass2vu mo5461M(AnonymousClass2vw anonymousClass2vw, Format format, boolean z) {
        return anonymousClass2vw.xK(format.f35577a, z);
    }

    /* renamed from: M */
    private static boolean m22875M(AnonymousClass45P anonymousClass45P, long j) {
        int size = anonymousClass45P.f49883W.size();
        for (int i = 0; i < size; i++) {
            if (((Long) anonymousClass45P.f49883W.get(i)).longValue() == j) {
                anonymousClass45P.f49883W.remove(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: N */
    public final void m22886N() {
        boolean z;
        AnonymousClass43u anonymousClass43u = this;
        if (this.f49862B == null) {
            Format format = this.f49887a;
            if (format != null) {
                MediaCrypto mediaCrypto;
                StringBuilder stringBuilder;
                String str;
                Format format2;
                int i;
                boolean z2;
                Format format3;
                boolean z3;
                long elapsedRealtime;
                long elapsedRealtime2;
                AnonymousClass2vB anonymousClass2vB;
                this.f49884X = this.f49895i;
                String str2 = format.f35577a;
                AnonymousClass2vG anonymousClass2vG = this.f49884X;
                if (anonymousClass2vG != null) {
                    AnonymousClass3vE anonymousClass3vE = (AnonymousClass3vE) anonymousClass2vG.getMediaCrypto();
                    if (anonymousClass3vE != null) {
                        mediaCrypto = anonymousClass3vE.f46817C;
                        z = !anonymousClass3vE.f46816B && anonymousClass3vE.f46817C.requiresSecureDecoderComponent(str2);
                        if (this.f49863C == null) {
                            try {
                                this.f49863C = mo5461M(this.f49891e, this.f49887a, z);
                                if (this.f49863C == null && z) {
                                    this.f49863C = mo5461M(this.f49891e, this.f49887a, false);
                                    if (this.f49863C != null) {
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append("Drm session requires secure decoder for ");
                                        stringBuilder.append(str2);
                                        stringBuilder.append(", but ");
                                        stringBuilder.append("no secure decoder available. Trying to proceed with ");
                                        stringBuilder.append(this.f49863C.f36036E);
                                        stringBuilder.append(".");
                                        Log.w("MediaCodecRenderer", stringBuilder.toString());
                                    }
                                }
                                if (this.f49863C == null) {
                                    throw AnonymousClass2uC.m17668B(new AnonymousClass2vv(this.f49887a, null, z, -49999), this.f49174C);
                                }
                            } catch (Throwable e) {
                                throw AnonymousClass2uC.m17668B(new AnonymousClass2vv(this.f49887a, e, z, -49998), this.f49174C);
                            }
                        }
                        if (!mo5474W(this.f49863C)) {
                            str = this.f49863C.f36036E;
                            this.f49869I = AnonymousClass45P.m22865C(str);
                            format2 = this.f49887a;
                            i = AnonymousClass2yi.f36552F;
                            z2 = i >= 21 && format2.f35569S.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
                            this.f49872L = z2;
                            if (i >= 18 && !(i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str)))) {
                                if (i == 19 && AnonymousClass2yi.f36551E.startsWith("SM-G800")) {
                                    if (!"OMX.Exynos.avc.dec".equals(str)) {
                                        if ("OMX.Exynos.avc.dec.secure".equals(str)) {
                                        }
                                    }
                                }
                                z2 = false;
                                this.f49876P = z2;
                                i = AnonymousClass2yi.f36552F;
                                z2 = i > 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str));
                                this.f49875O = z2;
                                z2 = (i > 23 && "OMX.google.vorbis.decoder".equals(str)) || (i <= 19 && "hb2000".equals(AnonymousClass2yi.f36548B) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)));
                                this.f49873M = z2;
                                z2 = AnonymousClass2yi.f36552F != 21 && "OMX.google.aac.decoder".equals(str);
                                this.f49874N = z2;
                                format3 = this.f49887a;
                                z3 = true;
                                if (AnonymousClass2yi.f36552F <= 18 || format3.f35554D != 1 || !"OMX.MTK.AUDIO.DECODER.MP3".equals(str)) {
                                    z3 = false;
                                }
                                this.f49877Q = z3;
                                elapsedRealtime = SystemClock.elapsedRealtime();
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("createCodec:");
                                stringBuilder.append(str);
                                AnonymousClass2yf.m18076B(stringBuilder.toString());
                                this.f49862B = MediaCodec.createByCodecName(str);
                                AnonymousClass2yf.m18077C();
                                AnonymousClass2yf.m18076B("configureCodec");
                                mo5460K(this.f49863C, this.f49862B, this.f49887a, mediaCrypto);
                                AnonymousClass2yf.m18077C();
                                AnonymousClass2yf.m18076B("startCodec");
                                this.f49862B.start();
                                AnonymousClass2yf.m18077C();
                                elapsedRealtime2 = SystemClock.elapsedRealtime();
                                mo5462O(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                                if (AnonymousClass2yi.f36552F < 21) {
                                    anonymousClass43u.f49865E = anonymousClass43u.f49862B.getInputBuffers();
                                    anonymousClass43u.f49866F = anonymousClass43u.f49862B.getOutputBuffers();
                                }
                                anonymousClass43u.f49870J = DS() != 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                                AnonymousClass45P.m22873K(anonymousClass43u);
                                AnonymousClass45P.m22874L(anonymousClass43u);
                                anonymousClass43u.f49899m = true;
                                anonymousClass2vB = anonymousClass43u.f49864D;
                                anonymousClass2vB.f35772B++;
                            }
                            z2 = true;
                            this.f49876P = z2;
                            i = AnonymousClass2yi.f36552F;
                            if (i > 17) {
                            }
                            this.f49875O = z2;
                            if (i > 23) {
                            }
                            this.f49873M = z2;
                            if (AnonymousClass2yi.f36552F != 21) {
                            }
                            this.f49874N = z2;
                            format3 = this.f49887a;
                            z3 = true;
                            if (AnonymousClass2yi.f36552F <= 18) {
                            }
                            z3 = false;
                            this.f49877Q = z3;
                            try {
                                elapsedRealtime = SystemClock.elapsedRealtime();
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("createCodec:");
                                stringBuilder.append(str);
                                AnonymousClass2yf.m18076B(stringBuilder.toString());
                                this.f49862B = MediaCodec.createByCodecName(str);
                                AnonymousClass2yf.m18077C();
                                AnonymousClass2yf.m18076B("configureCodec");
                                mo5460K(this.f49863C, this.f49862B, this.f49887a, mediaCrypto);
                                AnonymousClass2yf.m18077C();
                                AnonymousClass2yf.m18076B("startCodec");
                                this.f49862B.start();
                                AnonymousClass2yf.m18077C();
                                elapsedRealtime2 = SystemClock.elapsedRealtime();
                                mo5462O(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                                if (AnonymousClass2yi.f36552F < 21) {
                                    anonymousClass43u.f49865E = anonymousClass43u.f49862B.getInputBuffers();
                                    anonymousClass43u.f49866F = anonymousClass43u.f49862B.getOutputBuffers();
                                }
                                if (DS() != 2) {
                                }
                                anonymousClass43u.f49870J = DS() != 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                                AnonymousClass45P.m22873K(anonymousClass43u);
                                AnonymousClass45P.m22874L(anonymousClass43u);
                                anonymousClass43u.f49899m = true;
                                anonymousClass2vB = anonymousClass43u.f49864D;
                                anonymousClass2vB.f35772B++;
                            } catch (Throwable e2) {
                                throw AnonymousClass2uC.m17668B(new AnonymousClass2vv(anonymousClass43u.f49887a, e2, z, str), anonymousClass43u.f49174C);
                            }
                        }
                    } else if (this.f49884X.getError() != null) {
                    }
                }
                mediaCrypto = null;
                z = false;
                if (this.f49863C == null) {
                    this.f49863C = mo5461M(this.f49891e, this.f49887a, z);
                    this.f49863C = mo5461M(this.f49891e, this.f49887a, false);
                    if (this.f49863C != null) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Drm session requires secure decoder for ");
                        stringBuilder.append(str2);
                        stringBuilder.append(", but ");
                        stringBuilder.append("no secure decoder available. Trying to proceed with ");
                        stringBuilder.append(this.f49863C.f36036E);
                        stringBuilder.append(".");
                        Log.w("MediaCodecRenderer", stringBuilder.toString());
                    }
                    if (this.f49863C == null) {
                        throw AnonymousClass2uC.m17668B(new AnonymousClass2vv(this.f49887a, null, z, -49999), this.f49174C);
                    }
                }
                if (!mo5474W(this.f49863C)) {
                    str = this.f49863C.f36036E;
                    this.f49869I = AnonymousClass45P.m22865C(str);
                    format2 = this.f49887a;
                    i = AnonymousClass2yi.f36552F;
                    if (i >= 21) {
                    }
                    this.f49872L = z2;
                    if ("OMX.Exynos.avc.dec".equals(str)) {
                        if ("OMX.Exynos.avc.dec.secure".equals(str)) {
                        }
                        z2 = false;
                        this.f49876P = z2;
                        i = AnonymousClass2yi.f36552F;
                        if (i > 17) {
                        }
                        this.f49875O = z2;
                        if (i > 23) {
                        }
                        this.f49873M = z2;
                        if (AnonymousClass2yi.f36552F != 21) {
                        }
                        this.f49874N = z2;
                        format3 = this.f49887a;
                        z3 = true;
                        if (AnonymousClass2yi.f36552F <= 18) {
                        }
                        z3 = false;
                        this.f49877Q = z3;
                        elapsedRealtime = SystemClock.elapsedRealtime();
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("createCodec:");
                        stringBuilder.append(str);
                        AnonymousClass2yf.m18076B(stringBuilder.toString());
                        this.f49862B = MediaCodec.createByCodecName(str);
                        AnonymousClass2yf.m18077C();
                        AnonymousClass2yf.m18076B("configureCodec");
                        mo5460K(this.f49863C, this.f49862B, this.f49887a, mediaCrypto);
                        AnonymousClass2yf.m18077C();
                        AnonymousClass2yf.m18076B("startCodec");
                        this.f49862B.start();
                        AnonymousClass2yf.m18077C();
                        elapsedRealtime2 = SystemClock.elapsedRealtime();
                        mo5462O(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                        if (AnonymousClass2yi.f36552F < 21) {
                            anonymousClass43u.f49865E = anonymousClass43u.f49862B.getInputBuffers();
                            anonymousClass43u.f49866F = anonymousClass43u.f49862B.getOutputBuffers();
                        }
                        if (DS() != 2) {
                        }
                        anonymousClass43u.f49870J = DS() != 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                        AnonymousClass45P.m22873K(anonymousClass43u);
                        AnonymousClass45P.m22874L(anonymousClass43u);
                        anonymousClass43u.f49899m = true;
                        anonymousClass2vB = anonymousClass43u.f49864D;
                        anonymousClass2vB.f35772B++;
                    }
                    z2 = true;
                    this.f49876P = z2;
                    i = AnonymousClass2yi.f36552F;
                    if (i > 17) {
                    }
                    this.f49875O = z2;
                    if (i > 23) {
                    }
                    this.f49873M = z2;
                    if (AnonymousClass2yi.f36552F != 21) {
                    }
                    this.f49874N = z2;
                    format3 = this.f49887a;
                    z3 = true;
                    if (AnonymousClass2yi.f36552F <= 18) {
                    }
                    z3 = false;
                    this.f49877Q = z3;
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("createCodec:");
                    stringBuilder.append(str);
                    AnonymousClass2yf.m18076B(stringBuilder.toString());
                    this.f49862B = MediaCodec.createByCodecName(str);
                    AnonymousClass2yf.m18077C();
                    AnonymousClass2yf.m18076B("configureCodec");
                    mo5460K(this.f49863C, this.f49862B, this.f49887a, mediaCrypto);
                    AnonymousClass2yf.m18077C();
                    AnonymousClass2yf.m18076B("startCodec");
                    this.f49862B.start();
                    AnonymousClass2yf.m18077C();
                    elapsedRealtime2 = SystemClock.elapsedRealtime();
                    mo5462O(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    if (AnonymousClass2yi.f36552F < 21) {
                        anonymousClass43u.f49865E = anonymousClass43u.f49862B.getInputBuffers();
                        anonymousClass43u.f49866F = anonymousClass43u.f49862B.getOutputBuffers();
                    }
                    if (DS() != 2) {
                    }
                    anonymousClass43u.f49870J = DS() != 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                    AnonymousClass45P.m22873K(anonymousClass43u);
                    AnonymousClass45P.m22874L(anonymousClass43u);
                    anonymousClass43u.f49899m = true;
                    anonymousClass2vB = anonymousClass43u.f49864D;
                    anonymousClass2vB.f35772B++;
                }
            }
        }
    }

    /* renamed from: N */
    private static boolean m22876N(AnonymousClass45P anonymousClass45P, boolean z) {
        if (anonymousClass45P.f49884X == null) {
            return false;
        }
        if (!z && anonymousClass45P.f49896j) {
            return false;
        }
        int state = anonymousClass45P.f49884X.getState();
        if (state != 1) {
            return state != 4;
        } else {
            throw AnonymousClass2uC.m17668B(anonymousClass45P.f49884X.getError(), anonymousClass45P.f49174C);
        }
    }

    public boolean OX() {
        return this.f49894h;
    }

    /* renamed from: P */
    public void mo5463P(Format format) {
        Format format2 = this.f49887a;
        this.f49887a = format;
        if ((AnonymousClass2yi.m18082C(format.f35558H, format2 == null ? null : format2.f35558H) ^ 1) != 0) {
            if (this.f49887a.f35558H != null) {
                AnonymousClass2vH anonymousClass2vH = this.f49885Y;
                if (anonymousClass2vH != null) {
                    AnonymousClass2vG acquireSession = anonymousClass2vH.acquireSession(Looper.myLooper(), this.f49887a.f35558H);
                    this.f49895i = acquireSession;
                    if (acquireSession == this.f49884X) {
                        this.f49885Y.releaseSession(acquireSession);
                    }
                } else {
                    throw AnonymousClass2uC.m17668B(new IllegalStateException("Media requires a DrmSessionManager"), this.f49174C);
                }
            }
            this.f49895i = null;
        }
        boolean z = false;
        if (this.f49895i == this.f49884X) {
            MediaCodec mediaCodec = this.f49862B;
            if (mediaCodec != null) {
                int J = mo5459J(mediaCodec, this.f49863C, format2, this.f49887a);
                if (J != 3) {
                    switch (J) {
                        case 0:
                            break;
                        case 1:
                            break;
                        default:
                            throw new IllegalStateException();
                    }
                }
                this.f49881U = true;
                this.f49880T = 1;
                J = this.f49869I;
                if (J == 2 || (J == 1 && this.f49887a.f35582f == format2.f35582f && this.f49887a.f35567Q == format2.f35567Q)) {
                    z = true;
                }
                this.f49871K = z;
                z = true;
            }
        }
        if (!z) {
            if (this.f49878R) {
                this.f49882V = 1;
                return;
            }
            mo5473U();
            m22886N();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: U */
    public void mo5473U() {
        /*
        r4 = this;
        r0 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r4.f49870J = r0;
        X.AnonymousClass45P.m22873K(r4);
        X.AnonymousClass45P.m22874L(r4);
        r2 = 0;
        r4.f49900n = r2;
        r4.f49898l = r2;
        r0 = r4.f49883W;
        r0.clear();
        r1 = X.AnonymousClass2yi.f36552F;
        r0 = 21;
        if (r1 >= r0) goto L_0x0022;
    L_0x001d:
        r0 = 0;
        r4.f49865E = r0;
        r4.f49866F = r0;
    L_0x0022:
        r3 = 0;
        r4.f49863C = r3;
        r4.f49881U = r2;
        r4.f49878R = r2;
        r4.f49872L = r2;
        r4.f49876P = r2;
        r4.f49869I = r2;
        r4.f49875O = r2;
        r4.f49873M = r2;
        r4.f49877Q = r2;
        r4.f49871K = r2;
        r4.f49897k = r2;
        r4.f49879S = r2;
        r4.f49880T = r2;
        r4.f49882V = r2;
        r0 = r4.f49862B;
        if (r0 == 0) goto L_0x00b2;
    L_0x0043:
        r1 = r4.f49864D;
        r0 = r1.f35773C;
        r0 = r0 + 1;
        r1.f35773C = r0;
        r0 = r4.f49862B;	 Catch:{ all -> 0x0083 }
        r0.stop();	 Catch:{ all -> 0x0083 }
        r0 = r4.f49862B;	 Catch:{ all -> 0x006b }
        r0.release();	 Catch:{ all -> 0x006b }
        r4.f49862B = r3;
        r1 = r4.f49884X;
        if (r1 == 0) goto L_0x00b2;
    L_0x005b:
        r0 = r4.f49895i;
        if (r0 == r1) goto L_0x00b2;
    L_0x005f:
        r0 = r4.f49885Y;	 Catch:{ all -> 0x0067 }
        r0.releaseSession(r1);	 Catch:{ all -> 0x0067 }
        r4.f49884X = r3;
        goto L_0x00b2;
    L_0x0067:
        r0 = move-exception;
        r4.f49884X = r3;
        throw r0;
    L_0x006b:
        r2 = move-exception;
        r4.f49862B = r3;
        r1 = r4.f49884X;
        if (r1 == 0) goto L_0x0082;
    L_0x0072:
        r0 = r4.f49895i;
        if (r0 == r1) goto L_0x0082;
    L_0x0076:
        r0 = r4.f49885Y;	 Catch:{ all -> 0x007e }
        r0.releaseSession(r1);	 Catch:{ all -> 0x007e }
    L_0x007b:
        r4.f49884X = r3;
        goto L_0x0082;
    L_0x007e:
        r0 = move-exception;
        r4.f49884X = r3;
        throw r0;
    L_0x0082:
        throw r2;
    L_0x0083:
        r2 = move-exception;
        r0 = r4.f49862B;	 Catch:{ all -> 0x009d }
        r0.release();	 Catch:{ all -> 0x009d }
        r4.f49862B = r3;
        r1 = r4.f49884X;
        if (r1 == 0) goto L_0x0082;
    L_0x008f:
        r0 = r4.f49895i;
        if (r0 == r1) goto L_0x0082;
    L_0x0093:
        r0 = r4.f49885Y;	 Catch:{ all -> 0x0099 }
        r0.releaseSession(r1);	 Catch:{ all -> 0x0099 }
        goto L_0x007b;
    L_0x0099:
        r0 = move-exception;
        r4.f49884X = r3;
        throw r0;
    L_0x009d:
        r2 = move-exception;
        r4.f49862B = r3;
        r1 = r4.f49884X;
        if (r1 == 0) goto L_0x0082;
    L_0x00a4:
        r0 = r4.f49895i;
        if (r0 == r1) goto L_0x0082;
    L_0x00a8:
        r0 = r4.f49885Y;	 Catch:{ all -> 0x00ae }
        r0.releaseSession(r1);	 Catch:{ all -> 0x00ae }
        goto L_0x007b;
    L_0x00ae:
        r0 = move-exception;
        r4.f49884X = r3;
        throw r0;
    L_0x00b2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.45P.U():void");
    }

    public final void wJA(long j, long j2) {
        if (this.f49894h) {
            mo5467V();
            return;
        }
        int I;
        if (this.f49887a == null) {
            this.f49886Z.mo4533B();
            I = m22437I(this.f49888b, this.f49886Z, true);
            if (I == -5) {
                mo5463P(this.f49888b.f35584B);
            } else if (I == -4) {
                AnonymousClass2yO.m18017F(this.f49886Z.m17767E());
                this.f49890d = true;
                AnonymousClass45P.m22871I(this);
                return;
            } else {
                return;
            }
        }
        m22886N();
        if (this.f49862B != null) {
            AnonymousClass2yf.m18076B("drainAndFeed");
            while (m22866D(j, j2)) {
            }
            while (mo5369E()) {
            }
            AnonymousClass2yf.m18077C();
        } else {
            AnonymousClass2vB anonymousClass2vB = this.f49864D;
            anonymousClass2vB.f35779I += this.f49176E.LUA(j - this.f49179H);
            this.f49886Z.mo4533B();
            I = m22437I(this.f49888b, this.f49886Z, false);
            if (I == -5) {
                mo5463P(this.f49888b.f35584B);
            } else if (I == -4) {
                AnonymousClass2yO.m18017F(this.f49886Z.m17767E());
                this.f49890d = true;
                AnonymousClass45P.m22871I(this);
            }
        }
        this.f49864D.m17768A();
    }
}
