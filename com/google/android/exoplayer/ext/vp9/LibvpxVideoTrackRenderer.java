package com.google.android.exoplayer.ext.vp9;

import X.AnonymousClass0OR;
import X.AnonymousClass2q6;
import X.AnonymousClass2qE;
import X.AnonymousClass2qi;
import X.AnonymousClass2qj;
import X.AnonymousClass2qn;
import X.AnonymousClass2sI;
import X.AnonymousClass2sK;
import X.AnonymousClass2sM;
import X.AnonymousClass3tt;
import X.AnonymousClass3uu;
import X.AnonymousClass3uv;
import X.AnonymousClass3uw;
import X.AnonymousClass43c;
import X.AnonymousClass43k;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

public final class LibvpxVideoTrackRenderer extends AnonymousClass43c {
    /* renamed from: B */
    public Bitmap f49794B;
    /* renamed from: C */
    public final AnonymousClass2q6 f49795C;
    /* renamed from: D */
    public VpxDecoder f49796D;
    /* renamed from: E */
    public final Handler f49797E;
    /* renamed from: F */
    public final AnonymousClass3tt f49798F;
    /* renamed from: G */
    public AnonymousClass43k f49799G;
    /* renamed from: H */
    public VpxOutputBuffer f49800H;
    /* renamed from: I */
    public VpxOutputBuffer f49801I;
    /* renamed from: J */
    public int f49802J;
    /* renamed from: K */
    public int f49803K;
    /* renamed from: L */
    public volatile Surface f49804L;
    /* renamed from: M */
    private boolean f49805M;
    /* renamed from: N */
    private boolean f49806N;
    /* renamed from: O */
    private long f49807O;
    /* renamed from: P */
    private int f49808P;
    /* renamed from: Q */
    private AnonymousClass2qi f49809Q;
    /* renamed from: R */
    private final AnonymousClass2qj f49810R;
    /* renamed from: S */
    private boolean f49811S;
    /* renamed from: T */
    private final int f49812T;
    /* renamed from: U */
    private AnonymousClass2sM f49813U;
    /* renamed from: V */
    private int f49814V;
    /* renamed from: W */
    private boolean f49815W;
    /* renamed from: X */
    private boolean f49816X;
    /* renamed from: Y */
    private final boolean f49817Y;
    /* renamed from: Z */
    private boolean f49818Z;

    public LibvpxVideoTrackRenderer(AnonymousClass2qn anonymousClass2qn, boolean z) {
        this(anonymousClass2qn, z, null, null, 0);
    }

    public LibvpxVideoTrackRenderer(AnonymousClass2qn anonymousClass2qn, boolean z, Handler handler, AnonymousClass3tt anonymousClass3tt, int i) {
        super(anonymousClass2qn);
        this.f49795C = new AnonymousClass2q6();
        this.f49817Y = z;
        this.f49797E = handler;
        this.f49798F = anonymousClass3tt;
        this.f49812T = i;
        this.f49803K = -1;
        this.f49802J = -1;
        this.f49810R = new AnonymousClass2qj();
        this.f49814V = -1;
    }

    /* renamed from: B */
    private static void m22818B(com.google.android.exoplayer.ext.vp9.LibvpxVideoTrackRenderer r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r3.f49805M;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r2 = 0;
        r0 = r3.f49804L;	 Catch:{ IllegalArgumentException -> 0x0022, all -> 0x0019 }
        r2 = r0.lockCanvas(r2);	 Catch:{ IllegalArgumentException -> 0x0022, all -> 0x0019 }
        r0 = 1;	 Catch:{ IllegalArgumentException -> 0x0022, all -> 0x0019 }
        r3.f49805M = r0;	 Catch:{ IllegalArgumentException -> 0x0022, all -> 0x0017 }
        if (r2 == 0) goto L_0x0004;	 Catch:{ IllegalArgumentException -> 0x0022, all -> 0x0017 }
    L_0x0011:
        r0 = r3.f49804L;
        r0.unlockCanvasAndPost(r2);
        goto L_0x0004;
    L_0x0017:
        r1 = move-exception;
        goto L_0x001a;
    L_0x0019:
        r1 = move-exception;
    L_0x001a:
        if (r2 == 0) goto L_0x0021;
    L_0x001c:
        r0 = r3.f49804L;
        r0.unlockCanvasAndPost(r2);
    L_0x0021:
        throw r1;
    L_0x0022:
        if (r2 == 0) goto L_0x0004;
    L_0x0024:
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer.ext.vp9.LibvpxVideoTrackRenderer.B(com.google.android.exoplayer.ext.vp9.LibvpxVideoTrackRenderer):void");
    }

    /* renamed from: C */
    private boolean m22819C(long j) {
        if (!this.f49811S) {
            if (this.f49799G == null) {
                AnonymousClass43k anonymousClass43k = (AnonymousClass43k) this.f49796D.m21437A();
                this.f49799G = anonymousClass43k;
                if (anonymousClass43k == null) {
                }
            }
            int V = m22398V(j, this.f49810R, this.f49799G.f46666B);
            if (V != -2) {
                if (V == -4) {
                    this.f49809Q = this.f49810R.f34876C;
                    return true;
                } else if (V == -1) {
                    this.f49799G.m17665C(1);
                    this.f49796D.m21439C(this.f49799G);
                    this.f49799G = null;
                    this.f49811S = true;
                    return false;
                } else {
                    this.f49796D.m21439C(this.f49799G);
                    this.f49799G = null;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: D */
    private static void m22820D(LibvpxVideoTrackRenderer libvpxVideoTrackRenderer) {
        if (libvpxVideoTrackRenderer.f49797E != null && libvpxVideoTrackRenderer.f49798F != null && libvpxVideoTrackRenderer.f49808P > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = libvpxVideoTrackRenderer.f49808P;
            long j = elapsedRealtime - libvpxVideoTrackRenderer.f49807O;
            libvpxVideoTrackRenderer.f49808P = 0;
            libvpxVideoTrackRenderer.f49807O = elapsedRealtime;
            AnonymousClass0OR.D(libvpxVideoTrackRenderer.f49797E, new AnonymousClass2sI(libvpxVideoTrackRenderer, i, j), -1133784986);
        }
    }

    /* renamed from: E */
    private boolean m22821E(long j) {
        if (!this.f49815W) {
            if (this.f49801I == null) {
                VpxOutputBuffer vpxOutputBuffer = this.f49800H;
                if (vpxOutputBuffer != null) {
                    this.f49801I = vpxOutputBuffer;
                    this.f49800H = null;
                } else {
                    this.f49801I = (VpxOutputBuffer) this.f49796D.m21438B();
                }
                if (this.f49801I == null) {
                }
            }
            if (this.f49800H == null) {
                this.f49800H = (VpxOutputBuffer) this.f49796D.m21438B();
            }
            if (this.f49801I.m17663A(1)) {
                this.f49815W = true;
                this.f49801I.release();
                this.f49801I = null;
                return false;
            }
            AnonymousClass3uv anonymousClass3uv = this.f49800H;
            if (anonymousClass3uv == null || anonymousClass3uv.f46667B >= j) {
                if (this.f49804L != null) {
                    m22818B(this);
                    if (!this.f49805M) {
                    }
                }
                if (!this.f49816X) {
                    m22823G(this);
                    this.f49816X = true;
                    return false;
                } else if (this.f46182B == 3 && this.f49801I.f46667B <= j + 30000) {
                    m22823G(this);
                }
            } else {
                AnonymousClass2q6 anonymousClass2q6 = this.f49795C;
                anonymousClass2q6.f34756D++;
                int i = this.f49808P + 1;
                this.f49808P = i;
                if (i == this.f49812T) {
                    m22820D(this);
                }
                this.f49801I.release();
                this.f49801I = null;
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    private boolean m22822F(long j) {
        if (m22398V(j, this.f49810R, null) != -4) {
            return false;
        }
        this.f49809Q = this.f49810R.f34876C;
        return true;
    }

    /* renamed from: G */
    private static void m22823G(com.google.android.exoplayer.ext.vp9.LibvpxVideoTrackRenderer r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = r8.f49795C;
        r0 = r1.f34761I;
        r4 = 1;
        r0 = r0 + r4;
        r1.f34761I = r0;
        r3 = r8.f49801I;
        r2 = r8.f49803K;
        r1 = -1;
        if (r2 == r1) goto L_0x001d;
    L_0x000f:
        r0 = r8.f49802J;
        if (r0 == r1) goto L_0x001d;
    L_0x0013:
        r0 = r3.width;
        if (r2 != r0) goto L_0x001d;
    L_0x0017:
        r1 = r8.f49802J;
        r0 = r3.height;
        if (r1 == r0) goto L_0x0038;
    L_0x001d:
        r0 = r3.width;
        r8.f49803K = r0;
        r0 = r3.height;
        r8.f49802J = r0;
        r2 = r8.f49797E;
        if (r2 == 0) goto L_0x0038;
    L_0x0029:
        r0 = r8.f49798F;
        if (r0 == 0) goto L_0x0038;
    L_0x002d:
        r1 = new X.2sH;
        r1.<init>(r8, r3);
        r0 = -451664105; // 0xffffffffe5142717 float:-4.3726957E22 double:NaN;
        X.AnonymousClass0OR.D(r2, r1, r0);
    L_0x0038:
        r0 = r8.f49801I;
        r0 = r0.mode;
        if (r0 != r4) goto L_0x00cc;
    L_0x003e:
        r0 = r8.f49804L;
        if (r0 == 0) goto L_0x00cc;
    L_0x0042:
        r6 = r8.f49801I;
        r7 = r8.f49817Y;
        r0 = r8.f49794B;
        if (r0 == 0) goto L_0x005c;
    L_0x004a:
        r1 = r0.getWidth();
        r0 = r6.width;
        if (r1 != r0) goto L_0x005c;
    L_0x0052:
        r0 = r8.f49794B;
        r1 = r0.getHeight();
        r0 = r6.height;
        if (r1 == r0) goto L_0x0068;
    L_0x005c:
        r2 = r6.width;
        r1 = r6.height;
        r0 = android.graphics.Bitmap.Config.RGB_565;
        r0 = android.graphics.Bitmap.createBitmap(r2, r1, r0);
        r8.f49794B = r0;
    L_0x0068:
        r1 = r8.f49794B;
        r0 = r6.data;
        r1.copyPixelsFromBuffer(r0);
        r5 = 0;
        r0 = r8.f49804L;	 Catch:{ IllegalArgumentException -> 0x007a, all -> 0x0077 }
        r3 = r0.lockCanvas(r5);	 Catch:{ IllegalArgumentException -> 0x007a, all -> 0x0077 }
        goto L_0x007b;	 Catch:{ IllegalArgumentException -> 0x007a, all -> 0x0077 }
    L_0x0077:
        r1 = move-exception;
        r3 = r5;
        goto L_0x009c;
    L_0x007a:
        r3 = r5;
    L_0x007b:
        if (r3 == 0) goto L_0x00a4;
    L_0x007d:
        if (r7 == 0) goto L_0x0094;
    L_0x007f:
        r0 = r3.getWidth();	 Catch:{ all -> 0x009b }
        r2 = (float) r0;	 Catch:{ all -> 0x009b }
        r0 = r6.width;	 Catch:{ all -> 0x009b }
        r0 = (float) r0;	 Catch:{ all -> 0x009b }
        r2 = r2 / r0;	 Catch:{ all -> 0x009b }
        r0 = r3.getHeight();	 Catch:{ all -> 0x009b }
        r1 = (float) r0;	 Catch:{ all -> 0x009b }
        r0 = r6.height;	 Catch:{ all -> 0x009b }
        r0 = (float) r0;	 Catch:{ all -> 0x009b }
        r1 = r1 / r0;	 Catch:{ all -> 0x009b }
        r3.scale(r2, r1);	 Catch:{ all -> 0x009b }
    L_0x0094:
        r1 = r8.f49794B;	 Catch:{ all -> 0x009b }
        r0 = 0;	 Catch:{ all -> 0x009b }
        r3.drawBitmap(r1, r0, r0, r5);	 Catch:{ all -> 0x009b }
        goto L_0x00a4;	 Catch:{ all -> 0x009b }
    L_0x009b:
        r1 = move-exception;
    L_0x009c:
        if (r3 == 0) goto L_0x00a3;
    L_0x009e:
        r0 = r8.f49804L;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r0.unlockCanvasAndPost(r3);	 Catch:{ IllegalArgumentException -> 0x00a3 }
    L_0x00a3:
        throw r1;
    L_0x00a4:
        if (r3 == 0) goto L_0x00ab;
    L_0x00a6:
        r0 = r8.f49804L;	 Catch:{ IllegalArgumentException -> 0x00ab }
        r0.unlockCanvasAndPost(r3);	 Catch:{ IllegalArgumentException -> 0x00ab }
    L_0x00ab:
        r0 = r8.f49806N;
        if (r0 != 0) goto L_0x00c6;
    L_0x00af:
        r8.f49806N = r4;
        r3 = r8.f49804L;
        r2 = r8.f49797E;
        if (r2 == 0) goto L_0x00c6;
    L_0x00b7:
        r0 = r8.f49798F;
        if (r0 == 0) goto L_0x00c6;
    L_0x00bb:
        r1 = new X.2sJ;
        r1.<init>(r8, r3);
        r0 = 134551501; // 0x80517cd float:4.005121E-34 double:6.6477274E-316;
        X.AnonymousClass0OR.D(r2, r1, r0);
    L_0x00c6:
        r0 = r8.f49801I;
        r0.release();
        goto L_0x00db;
    L_0x00cc:
        r0 = r8.f49801I;
        r0 = r0.mode;
        if (r0 != 0) goto L_0x00c6;
    L_0x00d2:
        r1 = r8.f49813U;
        if (r1 == 0) goto L_0x00c6;
    L_0x00d6:
        r0 = r8.f49801I;
        r1.setOutputBuffer(r0);
    L_0x00db:
        r0 = 0;
        r8.f49801I = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer.ext.vp9.LibvpxVideoTrackRenderer.G(com.google.android.exoplayer.ext.vp9.LibvpxVideoTrackRenderer):void");
    }

    /* renamed from: H */
    private void m22824H(AnonymousClass2sM anonymousClass2sM) {
        if (this.f49813U != anonymousClass2sM) {
            this.f49813U = anonymousClass2sM;
            this.f49804L = null;
            this.f49814V = anonymousClass2sM != null ? 0 : -1;
            VpxDecoder vpxDecoder = this.f49796D;
            if (vpxDecoder != null) {
                vpxDecoder.setOutputMode(this.f49814V);
            }
        }
    }

    /* renamed from: I */
    private void m22825I(Surface surface) {
        if (this.f49804L != surface) {
            this.f49804L = surface;
            this.f49813U = null;
            this.f49814V = surface != null ? 1 : -1;
            VpxDecoder vpxDecoder = this.f49796D;
            if (vpxDecoder != null) {
                vpxDecoder.setOutputMode(this.f49814V);
            }
            this.f49805M = false;
            this.f49806N = false;
        }
    }

    /* renamed from: I */
    public final boolean mo5170I() {
        return this.f49815W;
    }

    /* renamed from: J */
    public final boolean mo5171J() {
        return this.f49809Q != null && ((this.f49818Z || this.f49801I != null) && this.f49816X && this.f49804L != null);
    }

    /* renamed from: L */
    public final void mo5174L() {
        this.f49799G = null;
        this.f49801I = null;
        this.f49809Q = null;
        try {
            if (this.f49796D != null) {
                this.f49796D.release();
                this.f49796D = null;
                AnonymousClass2q6 anonymousClass2q6 = this.f49795C;
                anonymousClass2q6.f34755C++;
            }
            super.mo5174L();
        } catch (Throwable th) {
            super.mo5174L();
        }
    }

    /* renamed from: O */
    public final void mo5361O() {
        this.f49808P = 0;
        this.f49807O = SystemClock.elapsedRealtime();
    }

    /* renamed from: P */
    public final void mo5362P() {
        m22820D(this);
    }

    /* renamed from: S */
    public final void mo5363S(long j, long j2, boolean z) {
        LibvpxVideoTrackRenderer libvpxVideoTrackRenderer = this;
        if (!this.f49815W) {
            this.f49818Z = z;
            if (this.f49809Q != null || m22822F(j)) {
                try {
                    if (this.f49796D == null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        libvpxVideoTrackRenderer.f49796D = new VpxDecoder(16, 16, 786432);
                        libvpxVideoTrackRenderer.f49796D.setOutputMode(libvpxVideoTrackRenderer.f49814V);
                        libvpxVideoTrackRenderer.f49796D.start();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        Handler handler = libvpxVideoTrackRenderer.f49797E;
                        if (!(handler == null || libvpxVideoTrackRenderer.f49798F == null)) {
                            AnonymousClass0OR.D(handler, new AnonymousClass2sK(libvpxVideoTrackRenderer, elapsedRealtime2, elapsedRealtime), -1216718033);
                        }
                        AnonymousClass2q6 anonymousClass2q6 = libvpxVideoTrackRenderer.f49795C;
                        anonymousClass2q6.f34754B++;
                    }
                    while (m22821E(j)) {
                    }
                    while (m22819C(j)) {
                    }
                    synchronized (libvpxVideoTrackRenderer.f49795C) {
                    }
                } catch (Throwable e) {
                    throw new AnonymousClass2qE(e);
                }
            }
        }
    }

    /* renamed from: T */
    public final boolean mo5364T(AnonymousClass2qi anonymousClass2qi) {
        return "video/x-vnd.on2.vp9".equalsIgnoreCase(anonymousClass2qi.f34866O);
    }

    /* renamed from: U */
    public final void mo5365U(long j) {
        this.f49818Z = false;
        this.f49811S = false;
        this.f49815W = false;
        this.f49816X = false;
        if (this.f49796D != null) {
            this.f49799G = null;
            VpxOutputBuffer vpxOutputBuffer = this.f49801I;
            if (vpxOutputBuffer != null) {
                vpxOutputBuffer.release();
                this.f49801I = null;
            }
            vpxOutputBuffer = this.f49800H;
            if (vpxOutputBuffer != null) {
                vpxOutputBuffer.release();
                this.f49800H = null;
            }
            AnonymousClass3uw anonymousClass3uw = this.f49796D;
            synchronized (anonymousClass3uw.f46675I) {
                AnonymousClass3uu[] anonymousClass3uuArr;
                int i;
                anonymousClass3uw.f46674H = true;
                if (anonymousClass3uw.f46672F != null) {
                    anonymousClass3uuArr = anonymousClass3uw.f46669C;
                    i = anonymousClass3uw.f46668B;
                    anonymousClass3uw.f46668B = i + 1;
                    anonymousClass3uuArr[i] = anonymousClass3uw.f46672F;
                    anonymousClass3uw.f46672F = null;
                }
                while (!anonymousClass3uw.f46676J.isEmpty()) {
                    anonymousClass3uuArr = anonymousClass3uw.f46669C;
                    i = anonymousClass3uw.f46668B;
                    anonymousClass3uw.f46668B = i + 1;
                    anonymousClass3uuArr[i] = (AnonymousClass3uu) anonymousClass3uw.f46676J.removeFirst();
                }
                while (!anonymousClass3uw.f46677K.isEmpty()) {
                    AnonymousClass3uv[] anonymousClass3uvArr = anonymousClass3uw.f46671E;
                    i = anonymousClass3uw.f46670D;
                    anonymousClass3uw.f46670D = i + 1;
                    anonymousClass3uvArr[i] = (AnonymousClass3uv) anonymousClass3uw.f46677K.removeFirst();
                }
            }
        }
    }

    public final void uU(int i, Object obj) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m22824H((AnonymousClass2sM) obj);
                    return;
                } else {
                    super.uU(i, obj);
                    return;
                }
            }
        }
        m22825I((Surface) obj);
    }
}
