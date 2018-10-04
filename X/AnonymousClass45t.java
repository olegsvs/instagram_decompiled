package X;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* renamed from: X.45t */
public class AnonymousClass45t extends AnonymousClass45K {
    /* renamed from: Y */
    private static volatile Boolean f50141Y;
    /* renamed from: B */
    public int f50142B;
    /* renamed from: C */
    public int f50143C;
    /* renamed from: D */
    public final AnonymousClass3tt f50144D;
    /* renamed from: E */
    public final int f50145E;
    /* renamed from: F */
    private final long f50146F;
    /* renamed from: G */
    private int f50147G = -1;
    /* renamed from: H */
    private float f50148H = -1.0f;
    /* renamed from: I */
    private int f50149I;
    /* renamed from: J */
    private int f50150J = -1;
    /* renamed from: K */
    private long f50151K;
    /* renamed from: L */
    private final boolean f50152L;
    /* renamed from: M */
    private final AnonymousClass2qs f50153M;
    /* renamed from: N */
    private long f50154N = -1;
    /* renamed from: O */
    private int f50155O = -1;
    /* renamed from: P */
    private float f50156P = -1.0f;
    /* renamed from: Q */
    private int f50157Q;
    /* renamed from: R */
    private int f50158R = -1;
    /* renamed from: S */
    private float f50159S = -1.0f;
    /* renamed from: T */
    private int f50160T;
    /* renamed from: U */
    private boolean f50161U;
    /* renamed from: V */
    private boolean f50162V;
    /* renamed from: W */
    private Surface f50163W;
    /* renamed from: X */
    private final int f50164X;

    /* renamed from: a */
    public final boolean mo5449a() {
        return true;
    }

    public AnonymousClass45t(Context context, AnonymousClass2qn anonymousClass2qn, AnonymousClass2qT anonymousClass2qT, int i, long j, AnonymousClass2s1 anonymousClass2s1, boolean z, Handler handler, AnonymousClass3tt anonymousClass3tt, int i2, boolean z2, AnonymousClass2qV anonymousClass2qV) {
        AnonymousClass2qa anonymousClass2qa = anonymousClass3tt;
        super(anonymousClass2qn, anonymousClass2qT, anonymousClass2s1, z, handler, anonymousClass2qa, anonymousClass2qV);
        this.f50153M = new AnonymousClass2qs(context);
        this.f50164X = i;
        this.f50146F = 1000 * j;
        this.f50144D = anonymousClass2qa;
        this.f50145E = i2;
        this.f50152L = z2;
    }

    /* renamed from: B */
    public static boolean m23106B() {
        if (f50141Y == null) {
            boolean z;
            String str = AnonymousClass2u6.f35514B;
            if (!("deb".equals(str) || "flo".equals(str) || "mido".equals(str) || "santoni".equals(str) || "tcl_eu".equals(str) || "SVP-DTV15".equals(str) || "BRAVIA_ATV2".equals(str) || str.startsWith("panell_") || "F3311".equals(str) || "M5c".equals(str) || "QM16XE_U".equals(str) || "A7010a48".equals(str) || "woods_f".equals(AnonymousClass2u6.f35517E) || "watson".equals(AnonymousClass2u6.f35514B))) {
                str = AnonymousClass2u6.f35517E;
                if (!("ALE-L21".equals(str) || "CAM-L21".equals(str))) {
                    if (!"HUAWEI VNS-L21".equals(str)) {
                        z = false;
                        f50141Y = Boolean.valueOf(z);
                    }
                }
            }
            z = true;
            f50141Y = Boolean.valueOf(z);
        }
        return f50141Y.booleanValue();
    }

    /* renamed from: C */
    public static void m23107C(AnonymousClass45t anonymousClass45t) {
        if (!(anonymousClass45t.f49765O == null || anonymousClass45t.f50144D == null)) {
            if (anonymousClass45t.f50143C != 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                AnonymousClass0OR.D(anonymousClass45t.f49765O, new AnonymousClass2qh(anonymousClass45t, anonymousClass45t.f50143C, elapsedRealtime - anonymousClass45t.f50151K), 9678367);
                anonymousClass45t.f50143C = 0;
                anonymousClass45t.f50151K = elapsedRealtime;
            }
        }
    }

    /* renamed from: D */
    private void m23108D() {
        if (!(this.f49765O == null || this.f50144D == null)) {
            if (!this.f50162V) {
                AnonymousClass0OR.D(this.f49765O, new AnonymousClass2qg(this, this.f50163W), 1601947553);
                this.f50162V = true;
            }
        }
    }

    /* renamed from: E */
    private void m23109E() {
        AnonymousClass45K anonymousClass45K = this;
        if (!(this.f49765O == null || this.f50144D == null)) {
            if (this.f50158R != this.f50150J || this.f50155O != this.f50147G || this.f50157Q != this.f50149I || this.f50156P != this.f50148H) {
                int i = this.f50150J;
                int i2 = this.f50147G;
                int i3 = this.f50149I;
                float f = this.f50148H;
                AnonymousClass0OR.D(anonymousClass45K.f49765O, new AnonymousClass2qf(anonymousClass45K, i, i2, i3, f), 621341443);
                anonymousClass45K.f50158R = i;
                anonymousClass45K.f50155O = i2;
                anonymousClass45K.f50157Q = i3;
                anonymousClass45K.f50156P = f;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: F */
    private static void m23110F(android.media.MediaFormat r6, boolean r7) {
        /*
        r0 = "max-input-size";
        r0 = r6.containsKey(r0);
        if (r0 == 0) goto L_0x0009;
    L_0x0008:
        return;
    L_0x0009:
        r0 = "height";
        r2 = r6.getInteger(r0);
        if (r7 == 0) goto L_0x0023;
    L_0x0011:
        r0 = "max-height";
        r0 = r6.containsKey(r0);
        if (r0 == 0) goto L_0x0023;
    L_0x0019:
        r0 = "max-height";
        r0 = r6.getInteger(r0);
        r2 = java.lang.Math.max(r2, r0);
    L_0x0023:
        r0 = "width";
        r5 = r6.getInteger(r0);
        if (r7 == 0) goto L_0x003d;
    L_0x002b:
        r0 = "max-width";
        r0 = r6.containsKey(r0);
        if (r0 == 0) goto L_0x003d;
    L_0x0033:
        r0 = "max-width";
        r0 = r6.getInteger(r0);
        r5 = java.lang.Math.max(r2, r0);
    L_0x003d:
        r0 = "mime";
        r4 = r6.getString(r0);
        r1 = -1;
        r0 = r4.hashCode();
        r3 = 4;
        switch(r0) {
            case -1664118616: goto L_0x007f;
            case -1662541442: goto L_0x0075;
            case 1187890754: goto L_0x006b;
            case 1331836730: goto L_0x0061;
            case 1599127256: goto L_0x0057;
            case 1599127257: goto L_0x004d;
            default: goto L_0x004c;
        };
    L_0x004c:
        goto L_0x0088;
    L_0x004d:
        r0 = "video/x-vnd.on2.vp9";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x0088;
    L_0x0055:
        r1 = 5;
        goto L_0x0088;
    L_0x0057:
        r0 = "video/x-vnd.on2.vp8";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x0088;
    L_0x005f:
        r1 = 3;
        goto L_0x0088;
    L_0x0061:
        r0 = "video/avc";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x0088;
    L_0x0069:
        r1 = 2;
        goto L_0x0088;
    L_0x006b:
        r0 = "video/mp4v-es";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x0088;
    L_0x0073:
        r1 = 1;
        goto L_0x0088;
    L_0x0075:
        r0 = "video/hevc";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x0088;
    L_0x007d:
        r1 = 4;
        goto L_0x0088;
    L_0x007f:
        r0 = "video/3gpp";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x0088;
    L_0x0087:
        r1 = 0;
    L_0x0088:
        switch(r1) {
            case 0: goto L_0x008f;
            case 1: goto L_0x008f;
            case 2: goto L_0x0091;
            case 3: goto L_0x008f;
            case 4: goto L_0x008d;
            case 5: goto L_0x008d;
            default: goto L_0x008b;
        };
    L_0x008b:
        goto L_0x0008;
    L_0x008d:
        r5 = r5 * r2;
        goto L_0x00ab;
    L_0x008f:
        r5 = r5 * r2;
        goto L_0x00aa;
    L_0x0091:
        r1 = "BRAVIA 4K 2015";
        r0 = X.AnonymousClass2u6.f35517E;
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x009d;
    L_0x009b:
        goto L_0x0008;
    L_0x009d:
        r0 = r5 + 15;
        r1 = r0 / 16;
        r0 = r2 + 15;
        r0 = r0 / 16;
        r1 = r1 * r0;
        r0 = r1 * 16;
        r5 = r0 * 16;
    L_0x00aa:
        r3 = 2;
    L_0x00ab:
        r1 = r5 * 3;
        r0 = r3 * 2;
        r1 = r1 / r0;
        r0 = "max-input-size";
        r6.setInteger(r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.45t.F(android.media.MediaFormat, boolean):void");
    }

    /* renamed from: G */
    private static void m23111G(AnonymousClass45t anonymousClass45t) {
        anonymousClass45t.f50154N = anonymousClass45t.f50146F > 0 ? (SystemClock.elapsedRealtime() * 1000) + anonymousClass45t.f50146F : -1;
    }

    /* renamed from: H */
    private void m23112H(Surface surface) {
        AnonymousClass2u3.m17644B("MediaCodecVideoTrackRenderer_setSurface");
        try {
            if (this.f50163W != surface) {
                this.f50163W = surface;
                this.f50162V = false;
                int i = this.f46182B;
                boolean J = mo5171J();
                if (i == 2 || i == 3) {
                    m22813h();
                    m22807b();
                    if (J && surface != null) {
                        AnonymousClass45t.m23111G(this);
                    }
                }
            }
            AnonymousClass2u3.m17645C();
        } catch (Throwable th) {
            AnonymousClass2u3.m17645C();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: I */
    private void m23113I(android.view.Surface r5) {
        /*
        r4 = this;
        r0 = "MediaCodecVideoTrackRenderer_setSurfaceEx";
        X.AnonymousClass2u3.m17644B(r0);
        r0 = r4.f50163W;	 Catch:{ all -> 0x004e }
        if (r0 != r5) goto L_0x000d;
    L_0x0009:
        X.AnonymousClass2u3.m17645C();
        return;
    L_0x000d:
        r4.f50163W = r5;	 Catch:{ all -> 0x004e }
        r0 = 0;
        r4.f50162V = r0;	 Catch:{ all -> 0x004e }
        r1 = r4.f46182B;	 Catch:{ all -> 0x004e }
        r3 = r4.mo5171J();	 Catch:{ all -> 0x004e }
        r0 = 2;
        if (r1 == r0) goto L_0x001e;
    L_0x001b:
        r0 = 3;
        if (r1 != r0) goto L_0x0009;
    L_0x001e:
        r2 = r4.f49752B;	 Catch:{ all -> 0x004e }
        r1 = X.AnonymousClass2u6.f35518F;	 Catch:{ all -> 0x004e }
        r0 = 23;
        if (r1 < r0) goto L_0x0040;
    L_0x0026:
        if (r2 == 0) goto L_0x0040;
    L_0x0028:
        if (r5 == 0) goto L_0x0040;
    L_0x002a:
        r0 = r4.f50152L;	 Catch:{ all -> 0x004e }
        if (r0 == 0) goto L_0x0034;
    L_0x002e:
        r0 = X.AnonymousClass45t.m23106B();	 Catch:{ all -> 0x004e }
        if (r0 != 0) goto L_0x0040;
    L_0x0034:
        r0 = "setOutputSurface";
        X.AnonymousClass2u3.m17644B(r0);	 Catch:{ all -> 0x0053 }
        r2.setOutputSurface(r5);	 Catch:{ all -> 0x0053 }
        X.AnonymousClass2u3.m17645C();	 Catch:{ all -> 0x004e }
        goto L_0x0046;
    L_0x0040:
        r4.m22813h();	 Catch:{ all -> 0x004e }
        r4.m22807b();	 Catch:{ all -> 0x004e }
    L_0x0046:
        if (r3 == 0) goto L_0x0009;
    L_0x0048:
        if (r5 == 0) goto L_0x0009;
    L_0x004a:
        X.AnonymousClass45t.m23111G(r4);	 Catch:{ all -> 0x004e }
        goto L_0x0009;
    L_0x004e:
        r0 = move-exception;
        X.AnonymousClass2u3.m17645C();
        throw r0;
    L_0x0053:
        r0 = move-exception;
        X.AnonymousClass2u3.m17645C();	 Catch:{ all -> 0x004e }
        throw r0;	 Catch:{ all -> 0x004e }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.45t.I(android.view.Surface):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: J */
    public final boolean mo5171J() {
        /*
        r8 = this;
        r0 = super.mo5171J();
        r7 = 1;
        r4 = -1;
        if (r0 == 0) goto L_0x001e;
    L_0x0009:
        r0 = r8.f50161U;
        if (r0 != 0) goto L_0x001b;
    L_0x000d:
        r0 = r8.f49752B;
        if (r0 == 0) goto L_0x0013;
    L_0x0011:
        r0 = 1;
        goto L_0x0014;
    L_0x0013:
        r0 = 0;
    L_0x0014:
        if (r0 == 0) goto L_0x001b;
    L_0x0016:
        r1 = r8.f49771U;
        r0 = 2;
        if (r1 != r0) goto L_0x001e;
    L_0x001b:
        r8.f50154N = r4;
        return r7;
    L_0x001e:
        r0 = r8.f50154N;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        r6 = 0;
        if (r0 != 0) goto L_0x0026;
    L_0x0025:
        return r6;
    L_0x0026:
        r2 = android.os.SystemClock.elapsedRealtime();
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 * r0;
        r0 = r8.f50154N;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x0034;
    L_0x0033:
        return r7;
    L_0x0034:
        r8.f50154N = r4;
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.45t.J():boolean");
    }

    /* renamed from: L */
    public final void mo5174L() {
        this.f50150J = -1;
        this.f50147G = -1;
        this.f50148H = -1.0f;
        this.f50159S = -1.0f;
        this.f50158R = -1;
        this.f50155O = -1;
        this.f50156P = -1.0f;
        AnonymousClass2qs anonymousClass2qs = this.f50153M;
        if (anonymousClass2qs.f34892C) {
            anonymousClass2qs.f34893D.f34887C.sendEmptyMessage(2);
        }
        super.mo5174L();
    }

    /* renamed from: M */
    public final void mo5175M(int i, long j, boolean z) {
        super.mo5175M(i, j, z);
        if (z && this.f50146F > 0) {
            this.f50154N = (SystemClock.elapsedRealtime() * 1000) + this.f50146F;
        }
        AnonymousClass2qs anonymousClass2qs = this.f50153M;
        anonymousClass2qs.f34891B = false;
        if (anonymousClass2qs.f34892C) {
            anonymousClass2qs.f34893D.f34887C.sendEmptyMessage(1);
        }
    }

    /* renamed from: O */
    public final void mo5361O() {
        super.mo5361O();
        this.f50143C = 0;
        this.f50151K = SystemClock.elapsedRealtime();
    }

    /* renamed from: P */
    public final void mo5362P() {
        this.f50154N = -1;
        AnonymousClass45t.m23107C(this);
        super.mo5362P();
    }

    /* renamed from: U */
    public final void mo5365U(long j) {
        super.mo5365U(j);
        this.f50161U = false;
        this.f50142B = 0;
        this.f50154N = -1;
    }

    /* renamed from: W */
    public final boolean mo5453W(MediaCodec mediaCodec, boolean z, AnonymousClass2qi anonymousClass2qi, AnonymousClass2qi anonymousClass2qi2) {
        return anonymousClass2qi2.f34866O.equals(anonymousClass2qi.f34866O) && (z || (anonymousClass2qi.f34872U == anonymousClass2qi2.f34872U && anonymousClass2qi.f34860I == anonymousClass2qi2.f34860I));
    }

    /* renamed from: X */
    public final void mo5446X(MediaCodec mediaCodec, boolean z, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        AnonymousClass45t.m23110F(mediaFormat, z);
        try {
            AnonymousClass2u3.m17644B("configureCodecVideo");
            mediaCodec.configure(mediaFormat, this.f50163W, mediaCrypto, 0);
            try {
                AnonymousClass2u3.m17644B("setCodecVideoScalingMode");
                mediaCodec.setVideoScalingMode(this.f50164X);
            } finally {
                AnonymousClass2u3.m17645C();
            }
        } finally {
            AnonymousClass2u3.m17645C();
        }
    }

    /* renamed from: Z */
    public final boolean mo5448Z(AnonymousClass2qT anonymousClass2qT, AnonymousClass2qi anonymousClass2qi) {
        String str = anonymousClass2qi.f34866O;
        if (!AnonymousClass2ts.m17613F(str)) {
            return false;
        }
        if ("video/x-unknown".equals(str) || anonymousClass2qT.wK(str, false) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo5454c(AnonymousClass2qj anonymousClass2qj) {
        super.mo5454c(anonymousClass2qj);
        this.f50159S = anonymousClass2qj.f34876C.f34867P == -1.0f ? 1.0f : anonymousClass2qj.f34876C.f34867P;
        this.f50160T = anonymousClass2qj.f34876C.f34868Q == -1 ? 0 : anonymousClass2qj.f34876C.f34868Q;
    }

    /* renamed from: d */
    public final void mo5450d(MediaFormat mediaFormat) {
        int integer;
        Object obj = (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) ? 1 : null;
        if (obj != null) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.f50150J = integer;
        if (obj != null) {
            integer = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer = mediaFormat.getInteger("height");
        }
        this.f50147G = integer;
        this.f50148H = this.f50159S;
        if (AnonymousClass2u6.f35518F >= 21) {
            integer = this.f50160T;
            if (integer == 90 || integer == 270) {
                integer = this.f50150J;
                this.f50150J = this.f50147G;
                this.f50147G = integer;
                this.f50148H = 1.0f / this.f50148H;
                return;
            }
            return;
        }
        this.f50149I = this.f50160T;
    }

    /* renamed from: g */
    public final boolean mo5452g(long r16, long r18, android.media.MediaCodec r20, java.nio.ByteBuffer r21, android.media.MediaCodec.BufferInfo r22, int r23, boolean r24) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r15 = this;
        r14 = 1;
        r4 = 0;
        r6 = r20;
        r5 = r23;
        if (r24 == 0) goto L_0x001f;
    L_0x0008:
        r0 = "skipVideoBuffer";
        X.AnonymousClass2u3.m17644B(r0);
        r0 = 0;
        r6.releaseOutputBuffer(r5, r0);
        X.AnonymousClass2u3.m17645C();
        r1 = r15.f49753C;
        r0 = r1.f34762J;
        r0 = r0 + 1;
        r1.f34762J = r0;
        r15.f50142B = r4;
        return r14;
    L_0x001f:
        r0 = r15.f50161U;
        r7 = 21;
        if (r0 != 0) goto L_0x0037;
    L_0x0025:
        r0 = X.AnonymousClass2u6.f35518F;
        if (r0 < r7) goto L_0x0031;
    L_0x0029:
        r0 = java.lang.System.nanoTime();
        r15.m23129k(r6, r5, r0);
        goto L_0x0034;
    L_0x0031:
        r15.m23128j(r6, r5);
    L_0x0034:
        r15.f50142B = r4;
        return r14;
    L_0x0037:
        r1 = r15.f46182B;
        r0 = 3;
        if (r1 == r0) goto L_0x003d;
    L_0x003c:
        return r4;
    L_0x003d:
        r8 = android.os.SystemClock.elapsedRealtime();
        r12 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r8 = r8 * r12;
        r8 = r8 - r18;
        r0 = r22;
        r2 = r0.presentationTimeUs;
        r2 = r2 - r16;
        r2 = r2 - r8;
        r10 = java.lang.System.nanoTime();
        r2 = r2 * r12;
        r2 = r2 + r10;
        r8 = r15.f50153M;
        r0 = r0.presentationTimeUs;
        r0 = r8.m17470A(r0, r2);
        r8 = r0 - r10;
        r8 = r8 / r12;
        r2 = -30000; // 0xffffffffffff8ad0 float:NaN double:NaN;
        r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x009c;
    L_0x0064:
        r0 = "dropVideoBuffer";
        X.AnonymousClass2u3.m17644B(r0);
        r0 = 0;
        r6.releaseOutputBuffer(r5, r0);
        X.AnonymousClass2u3.m17645C();
        r1 = r15.f49753C;
        r0 = r1.f34756D;
        r0 = r0 + 1;
        r1.f34756D = r0;
        r0 = r15.f50143C;
        r0 = r0 + 1;
        r15.f50143C = r0;
        r0 = r15.f50142B;
        r0 = r0 + 1;
        r15.f50142B = r0;
        r2 = r15.f49753C;
        r1 = r15.f50142B;
        r0 = r15.f49753C;
        r0 = r0.f34758F;
        r0 = java.lang.Math.max(r1, r0);
        r2.f34758F = r0;
        r1 = r15.f50143C;
        r0 = r15.f50145E;
        if (r1 != r0) goto L_0x009b;
    L_0x0098:
        X.AnonymousClass45t.m23107C(r15);
    L_0x009b:
        return r14;
    L_0x009c:
        r2 = X.AnonymousClass2u6.f35518F;
        if (r2 < r7) goto L_0x00ad;
    L_0x00a0:
        r2 = 50000; // 0xc350 float:7.0065E-41 double:2.47033E-319;
        r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x003c;
    L_0x00a7:
        r15.m23129k(r6, r5, r0);
        r15.f50142B = r4;
        return r14;
    L_0x00ad:
        r0 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x003c;
    L_0x00b3:
        r0 = 11000; // 0x2af8 float:1.5414E-41 double:5.4347E-320;
        r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x00c8;
    L_0x00b9:
        r0 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r8 = r8 - r0;
        r8 = r8 / r12;	 Catch:{ InterruptedException -> 0x00c1 }
        java.lang.Thread.sleep(r8);	 Catch:{ InterruptedException -> 0x00c1 }
        goto L_0x00c8;	 Catch:{ InterruptedException -> 0x00c1 }
    L_0x00c1:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x00c8:
        r15.m23128j(r6, r5);
        r15.f50142B = r4;
        return r14;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.45t.g(long, long, android.media.MediaCodec, java.nio.ByteBuffer, android.media.MediaCodec$BufferInfo, int, boolean):boolean");
    }

    /* renamed from: i */
    public final boolean mo5455i() {
        if (super.mo5455i()) {
            Surface surface = this.f50163W;
            if (surface != null && surface.isValid()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final void m23128j(MediaCodec mediaCodec, int i) {
        m23109E();
        AnonymousClass2u3.m17644B("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        AnonymousClass2u3.m17645C();
        AnonymousClass2q6 anonymousClass2q6 = this.f49753C;
        anonymousClass2q6.f34761I++;
        this.f50161U = true;
        m23108D();
    }

    /* renamed from: k */
    public final void m23129k(MediaCodec mediaCodec, int i, long j) {
        m23109E();
        AnonymousClass2u3.m17644B("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j);
        AnonymousClass2u3.m17645C();
        AnonymousClass2q6 anonymousClass2q6 = this.f49753C;
        anonymousClass2q6.f34761I++;
        this.f50161U = true;
        m23108D();
    }

    public final void uU(int i, Object obj) {
        if (i == 1) {
            m23112H((Surface) obj);
        } else if (i == 2) {
            m23113I((Surface) obj);
        } else {
            super.uU(i, obj);
        }
    }
}
