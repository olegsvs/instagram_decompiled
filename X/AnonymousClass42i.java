package X;

import android.content.Context;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import java.nio.ByteBuffer;

/* renamed from: X.42i */
public final class AnonymousClass42i extends AnonymousClass3p9 {
    /* renamed from: P */
    public static final Class f48824P = AnonymousClass42i.class;
    /* renamed from: B */
    public AnonymousClass3oq f48825B;
    /* renamed from: C */
    public volatile boolean f48826C;
    /* renamed from: D */
    public final AnonymousClass3ot f48827D;
    /* renamed from: E */
    public final Context f48828E;
    /* renamed from: F */
    public MediaExtractor f48829F;
    /* renamed from: G */
    public boolean f48830G;
    /* renamed from: H */
    public final AnonymousClass2NJ f48831H;
    /* renamed from: I */
    public final AnonymousClass3or f48832I;
    /* renamed from: J */
    public AnonymousClass3oq f48833J;
    /* renamed from: K */
    public AnonymousClass3pD f48834K;
    /* renamed from: L */
    private boolean f48835L;
    /* renamed from: M */
    private final boolean f48836M;
    /* renamed from: N */
    private final AnonymousClass3of f48837N;
    /* renamed from: O */
    private final AnonymousClass3pC f48838O;

    public AnonymousClass42i(Context context, AnonymousClass3of anonymousClass3of, AnonymousClass3or anonymousClass3or, AnonymousClass3ot anonymousClass3ot, AnonymousClass3pC anonymousClass3pC, boolean z, boolean z2, AnonymousClass2NJ anonymousClass2NJ) {
        this.f48828E = context;
        this.f48837N = anonymousClass3of;
        this.f48832I = anonymousClass3or;
        this.f48827D = anonymousClass3ot;
        this.f48838O = anonymousClass3pC;
        this.f48835L = z;
        this.f48836M = z2;
        this.f48831H = anonymousClass2NJ;
    }

    /* renamed from: A */
    public final void mo5087A() {
        this.f48826C = true;
    }

    /* renamed from: B */
    public final synchronized int mo5088B() {
        int i;
        if (this.f48834K == null) {
            i = 0;
        } else {
            AnonymousClass3on anonymousClass3on = this.f48834K.f44924B;
            if (anonymousClass3on == null) {
                i = 0;
            } else {
                i = anonymousClass3on.f44854B;
            }
        }
        return i;
    }

    /* renamed from: B */
    public static void m22261B(AnonymousClass42i anonymousClass42i, AnonymousClass0OA anonymousClass0OA, long j, long j2) {
        long j3 = j2;
        AnonymousClass42i anonymousClass42i2 = anonymousClass42i;
        if (!anonymousClass42i.f48826C) {
            long j4 = j;
            if (anonymousClass42i.f48825B != null && !anonymousClass42i.f48835L) {
                Long.valueOf(j);
                Long.valueOf(j3);
                anonymousClass42i.f48829F.selectTrack(anonymousClass42i.f48825B.f44874D);
                anonymousClass42i.f48829F.seekTo(j, j == 0 ? 2 : 0);
                anonymousClass42i.f48829F.unselectTrack(anonymousClass42i.f48833J.f44874D);
                AnonymousClass42i.m22263D(anonymousClass42i2, anonymousClass42i.f48825B.f44872B, anonymousClass42i.f48829F, j4, j3);
            } else if (anonymousClass0OA.f3799M != null) {
                j3 = j2 - j;
                String str = anonymousClass0OA.f3799M;
                Long.valueOf(0);
                Long.valueOf(j3);
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(str);
                mediaExtractor.selectTrack(0);
                mediaExtractor.seekTo(0, 2);
                AnonymousClass42i.m22263D(anonymousClass42i2, mediaExtractor.getTrackFormat(0), mediaExtractor, 0, j3);
                mediaExtractor.release();
            }
        }
    }

    /* renamed from: C */
    public static MediaFormat m22262C(AnonymousClass42i anonymousClass42i, AnonymousClass0OA anonymousClass0OA) {
        AnonymousClass3oq anonymousClass3oq = anonymousClass42i.f48825B;
        if (anonymousClass3oq != null && !anonymousClass42i.f48835L) {
            return anonymousClass3oq.f44872B;
        }
        if (anonymousClass0OA.f3799M == null) {
            return null;
        }
        String str = anonymousClass0OA.f3799M;
        MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(str);
        MediaFormat trackFormat = mediaExtractor.getTrackFormat(0);
        mediaExtractor.release();
        return trackFormat;
    }

    /* renamed from: C */
    public final boolean mo5089C() {
        return this.f48826C;
    }

    /* renamed from: D */
    public static void m22263D(AnonymousClass42i anonymousClass42i, MediaFormat mediaFormat, MediaExtractor mediaExtractor, long j, long j2) {
        if (!anonymousClass42i.f48830G) {
            anonymousClass42i.f48827D.kMA(mediaFormat);
            anonymousClass42i.f48827D.start();
            anonymousClass42i.f48830G = true;
        }
        AnonymousClass3oi anonymousClass42h = new AnonymousClass42h();
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
        anonymousClass42h.sMA(0, byteBuffer.limit(), 0, 2);
        ByteBuffer TJ = anonymousClass42h.TJ();
        TJ.position(0);
        byteBuffer.position(0);
        TJ.limit(byteBuffer.limit());
        TJ.put(byteBuffer);
        anonymousClass42i.f48827D.DXA(anonymousClass42h.TJ(), anonymousClass42h.KJ());
        while (!anonymousClass42i.f48826C) {
            int readSampleData = mediaExtractor.readSampleData(anonymousClass42h.TJ(), 0);
            long sampleTime = mediaExtractor.getSampleTime();
            if (readSampleData > 0 && sampleTime <= j2) {
                if (sampleTime >= j) {
                    anonymousClass42h.sMA(0, readSampleData, sampleTime - j, mediaExtractor.getSampleFlags());
                    anonymousClass42i.f48827D.DXA(anonymousClass42h.TJ(), anonymousClass42h.KJ());
                }
                mediaExtractor.advance();
            } else {
                return;
            }
        }
    }

    /* renamed from: E */
    public static void m22264E(AnonymousClass42i anonymousClass42i, AnonymousClass0OA anonymousClass0OA, long j, long j2) {
        AnonymousClass3p9 anonymousClass3p9 = anonymousClass42i;
        AnonymousClass0LH.E(anonymousClass3p9.f48834K);
        long j3 = j;
        Long.valueOf(j3);
        Long.valueOf(j2);
        anonymousClass3p9.f48829F.selectTrack(anonymousClass3p9.f48833J.f44874D);
        AnonymousClass3oq anonymousClass3oq = anonymousClass3p9.f48825B;
        if (anonymousClass3oq != null) {
            anonymousClass3p9.f48829F.selectTrack(anonymousClass3oq.f44874D);
        }
        anonymousClass3p9.f48829F.seekTo(j3, j == 0 ? 2 : 0);
        anonymousClass3oq = anonymousClass3p9.f48825B;
        if (anonymousClass3oq != null) {
            anonymousClass3p9.f48829F.unselectTrack(anonymousClass3oq.f44874D);
        }
        long j4 = j2 - j;
        Object obj = null;
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if ((obj == null || !z || obj2 == null) && !anonymousClass3p9.f48826C) {
                AnonymousClass3on anonymousClass3on;
                if (obj == null) {
                    AnonymousClass3pD anonymousClass3pD = anonymousClass3p9.f48834K;
                    AnonymousClass0LH.E(anonymousClass3pD.f44924B);
                    AnonymousClass42R A = anonymousClass3pD.f44924B.m20779A(10000);
                    if (A != null) {
                        int readSampleData = anonymousClass3p9.f48829F.readSampleData(A.TJ(), 0);
                        long sampleTime = anonymousClass3p9.f48829F.getSampleTime();
                        if (readSampleData <= 0 || sampleTime > j2) {
                            A.sMA(0, 0, 0, 4);
                            anonymousClass3p9.f48834K.m20807A(A);
                            obj = 1;
                        } else {
                            A.sMA(0, readSampleData, sampleTime - j, anonymousClass3p9.f48829F.getSampleFlags());
                            anonymousClass3p9.f48834K.m20807A(A);
                            anonymousClass3p9.f48829F.advance();
                        }
                    }
                }
                if (!z) {
                    AnonymousClass3pD anonymousClass3pD2 = anonymousClass3p9.f48834K;
                    AnonymousClass0LH.E(anonymousClass3pD2.f44924B);
                    AnonymousClass42R B = anonymousClass3pD2.f44924B.m20780B(10000);
                    if (B != null && B.m22249A()) {
                        BufferInfo KJ = B.KJ();
                        if (KJ.presentationTimeUs >= 0) {
                            AnonymousClass3on anonymousClass3on2 = anonymousClass3pD2.f44924B;
                            anonymousClass3on2.m20781C(B, anonymousClass3on2.f44859G);
                        } else {
                            anonymousClass3pD2.f44924B.m20781C(B, false);
                        }
                        if ((KJ.flags & 4) != 0) {
                            anonymousClass3pD2.f44928F = true;
                            anonymousClass3on = anonymousClass3pD2.f44925C;
                            AnonymousClass0LH.B(anonymousClass3on.f44857E == AnonymousClass3ok.ENCODER);
                            anonymousClass3on.f44856D.signalEndOfInputStream();
                        } else if (KJ.presentationTimeUs >= 0) {
                            anonymousClass3pD2.f44927E.m20878A();
                            anonymousClass3pD2.f44927E.m20879B(KJ.presentationTimeUs);
                            AnonymousClass3q9 anonymousClass3q9 = anonymousClass3pD2.f44927E;
                            EGLExt.eglPresentationTimeANDROID(anonymousClass3q9.f45150D, anonymousClass3q9.f45151E, KJ.presentationTimeUs * 1000);
                            AnonymousClass3q9 anonymousClass3q92 = anonymousClass3pD2.f44927E;
                            EGL14.eglSwapBuffers(anonymousClass3q92.f45150D, anonymousClass3q92.f45151E);
                        }
                    }
                    z = anonymousClass3p9.f48834K.f44928F;
                }
                if (obj2 == null) {
                    AnonymousClass42R B2 = anonymousClass3p9.f48834K.f44925C.m20780B(10000);
                    while (B2 != null) {
                        if (!B2.m22249A() && B2.f48764C) {
                            AnonymousClass0LH.E(anonymousClass3p9.f48834K);
                            anonymousClass3p9.f48827D.aSA(anonymousClass3p9.f48834K.f44925C.f44858F);
                            MediaFormat C = AnonymousClass42i.m22262C(anonymousClass3p9, anonymousClass0OA);
                            if (C != null) {
                                anonymousClass3p9.f48827D.kMA(C);
                            }
                            anonymousClass3p9.f48827D.start();
                            anonymousClass3p9.f48830G = true;
                        } else if (!B2.m22249A()) {
                            continue;
                        } else if ((B2.KJ().flags & 4) != 0) {
                            obj2 = 1;
                            break;
                        } else {
                            anonymousClass3p9.f48827D.GXA(B2.TJ(), B2.KJ());
                            anonymousClass3p9.m20805E(B2.KJ().presentationTimeUs, j4);
                        }
                        anonymousClass3on = anonymousClass3p9.f48834K.f44925C;
                        anonymousClass3on.m20781C(B2, anonymousClass3on.f44859G);
                        B2 = anonymousClass3p9.f48834K.f44925C.m20780B(500);
                    }
                }
            }
        }
        AnonymousClass3pD anonymousClass3pD3 = anonymousClass3p9.f48834K;
        AnonymousClass3on anonymousClass3on3 = anonymousClass3pD3.f44924B;
        if (anonymousClass3on3 != null) {
            anonymousClass3on3.m20783E();
        }
        anonymousClass3pD3.f44925C.m20783E();
        anonymousClass3pD3.f44927E.m20881D();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: F */
    public final void mo5090F(android.content.Context r23, X.AnonymousClass3pA r24) {
        /*
        r22 = this;
        r7 = r22;
        r10 = r23;
        r6 = r24;
        super.mo5090F(r10, r6);
        r5 = r6.f44907I;
        r4 = 0;
        r16 = 0;
        X.AnonymousClass0Sy.B();	 Catch:{ Throwable -> 0x0259 }
        r0 = r6.f44905G;	 Catch:{ Throwable -> 0x0259 }
        r2 = r0.exists();	 Catch:{ Throwable -> 0x0259 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0259 }
        r1.<init>();	 Catch:{ Throwable -> 0x0259 }
        r0 = "Input file does not exist: ";
        r1.append(r0);	 Catch:{ Throwable -> 0x0259 }
        r0 = r6.f44905G;	 Catch:{ Throwable -> 0x0259 }
        r0 = r0.getPath();	 Catch:{ Throwable -> 0x0259 }
        r1.append(r0);	 Catch:{ Throwable -> 0x0259 }
        r0 = r1.toString();	 Catch:{ Throwable -> 0x0259 }
        X.AnonymousClass0LH.C(r2, r0);	 Catch:{ Throwable -> 0x0259 }
        r0 = r6.f44905G;	 Catch:{ Throwable -> 0x0259 }
        r8 = android.net.Uri.fromFile(r0);	 Catch:{ Throwable -> 0x0259 }
        r0 = r7.f48837N;	 Catch:{ Throwable -> 0x0259 }
        r1 = r0.ZH(r8);	 Catch:{ Throwable -> 0x0259 }
        r0 = new android.media.MediaExtractor;	 Catch:{ Throwable -> 0x0251 }
        r0.<init>();	 Catch:{ Throwable -> 0x0251 }
        r7.f48829F = r0;	 Catch:{ Throwable -> 0x0251 }
        r2 = r7.f48829F;	 Catch:{ Throwable -> 0x0251 }
        r0 = r7.f48828E;	 Catch:{ Throwable -> 0x0251 }
        r3 = 0;
        r2.setDataSource(r0, r8, r3);	 Catch:{ Throwable -> 0x0251 }
        r2 = r7.f48832I;	 Catch:{ Throwable -> 0x0251 }
        r0 = r7.f48829F;	 Catch:{ Throwable -> 0x0251 }
        r0 = r2.m20789B(r0);	 Catch:{ Throwable -> 0x0251 }
        r7.f48833J = r0;	 Catch:{ Throwable -> 0x0251 }
        r0 = r5.f3799M;	 Catch:{ Throwable -> 0x0251 }
        if (r0 != 0) goto L_0x0065;
    L_0x005a:
        r2 = r7.f48832I;	 Catch:{ Throwable -> 0x0251 }
        r0 = r7.f48829F;	 Catch:{ Throwable -> 0x0251 }
        r0 = r2.m20788A(r0);	 Catch:{ Throwable -> 0x0251 }
        r7.f48825B = r0;	 Catch:{ Throwable -> 0x0251 }
        goto L_0x0067;
    L_0x0065:
        r7.f48825B = r3;	 Catch:{ Throwable -> 0x0251 }
    L_0x0067:
        monitor-enter(r7);	 Catch:{ Throwable -> 0x0251 }
        r3 = r7.f48838O;	 Catch:{ all -> 0x024e }
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x024e }
        r0 = 18;
        if (r2 < r0) goto L_0x0072;
    L_0x0070:
        r0 = 1;
        goto L_0x0073;
    L_0x0072:
        r0 = 0;
    L_0x0073:
        X.AnonymousClass0LH.B(r0);	 Catch:{ all -> 0x024e }
        r2 = new X.3pD;	 Catch:{ all -> 0x024e }
        r0 = r3.f44923B;	 Catch:{ all -> 0x024e }
        r2.<init>(r0);	 Catch:{ all -> 0x024e }
        r7.f48834K = r2;	 Catch:{ all -> 0x024e }
        monitor-exit(r7);	 Catch:{ all -> 0x024e }
        r9 = r7.f48834K;	 Catch:{ Throwable -> 0x0251 }
        r0 = r6.f44900B;	 Catch:{ Throwable -> 0x0251 }
        r20 = r0;
        r0 = r6.f44903E;	 Catch:{ Throwable -> 0x0251 }
        r17 = r0;
        r12 = r6.f44909K;	 Catch:{ Throwable -> 0x0251 }
        r14 = r6.f44904F;	 Catch:{ Throwable -> 0x0251 }
        r13 = r6.f44901C;	 Catch:{ Throwable -> 0x0251 }
        r15 = new X.2Ms;	 Catch:{ Throwable -> 0x0251 }
        r15.<init>(r5, r10);	 Catch:{ Throwable -> 0x0251 }
        r3 = r15.f29589B;	 Catch:{ Throwable -> 0x0251 }
        r2 = r3.x;	 Catch:{ Throwable -> 0x0251 }
        r0 = r3.y;	 Catch:{ Throwable -> 0x0251 }
        r5.MA(r2, r0);	 Catch:{ Throwable -> 0x0251 }
        r11 = r3.x;	 Catch:{ Throwable -> 0x0251 }
        r8 = r3.y;	 Catch:{ Throwable -> 0x0251 }
        r3 = new X.3oo;	 Catch:{ Throwable -> 0x0251 }
        r2 = X.AnonymousClass3ol.CODEC_VIDEO_H264;	 Catch:{ Throwable -> 0x0251 }
        r0 = 2130708361; // 0x7f000789 float:1.701803E38 double:1.0527098025E-314;
        r3.<init>(r2, r11, r8, r0);	 Catch:{ Throwable -> 0x0251 }
        r0 = r15.m15258B();	 Catch:{ Throwable -> 0x0251 }
        r3.f44865E = r0;	 Catch:{ Throwable -> 0x0251 }
        r3.f44864D = r14;	 Catch:{ Throwable -> 0x0251 }
        r0 = 30;
        r3.f44866F = r0;	 Catch:{ Throwable -> 0x0251 }
        r3.f44862B = r13;	 Catch:{ Throwable -> 0x0251 }
        r0 = X.AnonymousClass0CC.cj;	 Catch:{ Throwable -> 0x0251 }
        r0 = r0.G();	 Catch:{ Throwable -> 0x0251 }
        r0 = (java.lang.Integer) r0;	 Catch:{ Throwable -> 0x0251 }
        r0 = r0.intValue();	 Catch:{ Throwable -> 0x0251 }
        r3.f44863C = r0;	 Catch:{ Throwable -> 0x0251 }
        r8 = r3.m20784A();	 Catch:{ Throwable -> 0x0251 }
        r11 = r9.f44926D;	 Catch:{ Throwable -> 0x0251 }
        r0 = X.AnonymousClass3ol.CODEC_VIDEO_H264;	 Catch:{ Throwable -> 0x0251 }
        r2 = r2.f44848B;	 Catch:{ Throwable -> 0x0251 }
        r3 = X.AnonymousClass3oj.SURFACE;	 Catch:{ Throwable -> 0x0251 }
        r0 = r0.f44848B;	 Catch:{ Throwable -> 0x0251 }
        r0 = r2.equals(r0);	 Catch:{ Throwable -> 0x0251 }
        if (r0 == 0) goto L_0x02a1;
    L_0x00dc:
        r13 = android.media.MediaCodec.createEncoderByType(r2);	 Catch:{ IOException -> 0x029a }
        r2 = 1;
        if (r3 != r3) goto L_0x00ec;
    L_0x00e3:
        r14 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x02a6 }
        r0 = 18;
        if (r14 < r0) goto L_0x00ea;
    L_0x00e9:
        goto L_0x00ec;
    L_0x00ea:
        r0 = 0;
        goto L_0x00ed;
    L_0x00ec:
        r0 = 1;
    L_0x00ed:
        X.AnonymousClass0LH.B(r0);	 Catch:{ RuntimeException -> 0x02a6 }
        r0 = X.AnonymousClass0CC.ej;	 Catch:{ RuntimeException -> 0x02a6 }
        r0 = r0.G();	 Catch:{ RuntimeException -> 0x02a6 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ RuntimeException -> 0x02a6 }
        r0 = r0.booleanValue();	 Catch:{ RuntimeException -> 0x02a6 }
        if (r0 == 0) goto L_0x0101;
    L_0x00fe:
        X.AnonymousClass3om.m20772F(r11, r13, r8);	 Catch:{ RuntimeException -> 0x02a6 }
    L_0x0101:
        r11 = 0;
        r13.configure(r8, r11, r11, r2);	 Catch:{ RuntimeException -> 0x02a6 }
        if (r3 != r3) goto L_0x010b;
    L_0x0107:
        r11 = r13.createInputSurface();	 Catch:{ RuntimeException -> 0x02a6 }
    L_0x010b:
        r3 = new X.3on;	 Catch:{ RuntimeException -> 0x02a6 }
        r2 = X.AnonymousClass3ok.ENCODER;	 Catch:{ RuntimeException -> 0x02a6 }
        r0 = 0;
        r3.<init>(r2, r13, r11, r0);	 Catch:{ RuntimeException -> 0x02a6 }
        r9.f44925C = r3;	 Catch:{ Throwable -> 0x0251 }
        r0 = r9.f44925C;	 Catch:{ Throwable -> 0x0251 }
        r0.m20782D();	 Catch:{ Throwable -> 0x0251 }
        r11 = new X.3q9;	 Catch:{ Throwable -> 0x0251 }
        r3 = r9.f44925C;	 Catch:{ Throwable -> 0x0251 }
        r2 = r3.f44857E;	 Catch:{ Throwable -> 0x0251 }
        r0 = X.AnonymousClass3ok.ENCODER;	 Catch:{ Throwable -> 0x0251 }
        if (r2 != r0) goto L_0x0126;
    L_0x0124:
        r0 = 1;
        goto L_0x0127;
    L_0x0126:
        r0 = 0;
    L_0x0127:
        X.AnonymousClass0LH.B(r0);	 Catch:{ Throwable -> 0x0251 }
        r0 = r3.f44855C;	 Catch:{ Throwable -> 0x0251 }
        r24 = 0;
        r21 = r17;
        r22 = r12;
        r23 = r0;
        r17 = r11;
        r18 = r10;
        r19 = r5;
        r17.<init>(r18, r19, r20, r21, r22, r23, r24);	 Catch:{ Throwable -> 0x0251 }
        r9.f44927E = r11;	 Catch:{ Throwable -> 0x0251 }
        r0 = r7.f48833J;	 Catch:{ Throwable -> 0x0251 }
        r9 = r0.f44872B;	 Catch:{ Throwable -> 0x0251 }
        r0 = X.AnonymousClass0CC.uj;	 Catch:{ Throwable -> 0x0251 }
        r0 = r0.G();	 Catch:{ Throwable -> 0x0251 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ Throwable -> 0x0251 }
        r0 = r0.booleanValue();	 Catch:{ Throwable -> 0x0251 }
        if (r0 == 0) goto L_0x0160;
    L_0x0151:
        r3 = r7.f48834K;	 Catch:{ Throwable -> 0x0251 }
        r2 = r3.f44926D;	 Catch:{ Throwable -> 0x0251 }
        r0 = r3.f44927E;	 Catch:{ Throwable -> 0x0251 }
        r0 = r0.f45154H;	 Catch:{ Throwable -> 0x0251 }
        r0 = X.AnonymousClass3oz.m20796B(r9, r2, r0);	 Catch:{ Throwable -> 0x0251 }
        r3.f44924B = r0;	 Catch:{ Throwable -> 0x0251 }
        goto L_0x0179;
    L_0x0160:
        r10 = r7.f48834K;	 Catch:{ Throwable -> 0x0251 }
        r3 = r10.f44926D;	 Catch:{ Throwable -> 0x0251 }
        r0 = "mime";
        r2 = r9.getString(r0);	 Catch:{ Throwable -> 0x0251 }
        r0 = r10.f44927E;	 Catch:{ Throwable -> 0x0251 }
        r0 = r0.f45154H;	 Catch:{ Throwable -> 0x0251 }
        r0 = r3.m20777A(r2, r9, r0);	 Catch:{ Throwable -> 0x0251 }
        r10.f44924B = r0;	 Catch:{ Throwable -> 0x0251 }
        r0 = r10.f44924B;	 Catch:{ Throwable -> 0x0251 }
        r0.m20782D();	 Catch:{ Throwable -> 0x0251 }
    L_0x0179:
        r0 = "bitrate";
        r0 = r9.containsKey(r0);	 Catch:{ Throwable -> 0x0251 }
        r3 = -1;
        if (r0 == 0) goto L_0x0189;
    L_0x0182:
        r0 = "bitrate";
        r2 = r9.getInteger(r0);	 Catch:{ Throwable -> 0x0251 }
        goto L_0x018a;
    L_0x0189:
        r2 = -1;
    L_0x018a:
        r0 = "bitrate";
        r0 = r8.containsKey(r0);	 Catch:{ Throwable -> 0x0251 }
        if (r0 == 0) goto L_0x0198;
    L_0x0192:
        r0 = "bitrate";
        r3 = r8.getInteger(r0);	 Catch:{ Throwable -> 0x0251 }
    L_0x0198:
        r0 = new X.1Kk;	 Catch:{ Throwable -> 0x0251 }
        r0.<init>(r2, r3);	 Catch:{ Throwable -> 0x0251 }
        r5.f3803Q = r0;	 Catch:{ Throwable -> 0x0251 }
        r0 = r6.f44906H;	 Catch:{ Throwable -> 0x0251 }
        r2 = r7.f48827D;	 Catch:{ Throwable -> 0x0251 }
        r0 = r0.getPath();	 Catch:{ Throwable -> 0x0251 }
        r2.DF(r0);	 Catch:{ Throwable -> 0x0251 }
        r0 = r6.f44910L;	 Catch:{ Throwable -> 0x0259 }
        r0 = r0 * 1000;
        r2 = (long) r0;	 Catch:{ Throwable -> 0x0259 }
        r0 = r6.f44902D;	 Catch:{ Throwable -> 0x0259 }
        r0 = r0 * 1000;
        r13 = (long) r0;	 Catch:{ Throwable -> 0x0259 }
        r8 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x02b1 }
        r0 = 18;
        if (r8 >= r0) goto L_0x01da;
    L_0x01ba:
        r0 = r7.f48834K;	 Catch:{ all -> 0x02b1 }
        X.AnonymousClass0LH.E(r0);	 Catch:{ all -> 0x02b1 }
        r0 = r7.f48834K;	 Catch:{ all -> 0x02b1 }
        r0 = r0.f44925C;	 Catch:{ all -> 0x02b1 }
        r8 = r0.f44858F;	 Catch:{ all -> 0x02b1 }
        r0 = r7.f48827D;	 Catch:{ all -> 0x02b1 }
        r0.aSA(r8);	 Catch:{ all -> 0x02b1 }
        r8 = X.AnonymousClass42i.m22262C(r7, r5);	 Catch:{ all -> 0x02b1 }
        if (r8 == 0) goto L_0x01d5;
    L_0x01d0:
        r0 = r7.f48827D;	 Catch:{ all -> 0x02b1 }
        r0.kMA(r8);	 Catch:{ all -> 0x02b1 }
    L_0x01d5:
        r0 = r7.f48827D;	 Catch:{ all -> 0x02b1 }
        r0.start();	 Catch:{ all -> 0x02b1 }
    L_0x01da:
        r8 = 0;
        r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r0 >= 0) goto L_0x01e2;
    L_0x01e0:
        r2 = 0;
    L_0x01e2:
        r0 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1));
        if (r0 >= 0) goto L_0x01eb;
    L_0x01e6:
        r13 = r1.f44830B;	 Catch:{ all -> 0x02b1 }
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r13 = r13 * r0;
    L_0x01eb:
        r1 = X.AnonymousClass3p1.f44881B;	 Catch:{ all -> 0x02b1 }
        r0 = r7.f48831H;	 Catch:{ all -> 0x02b1 }
        r0 = r0.f29631C;	 Catch:{ all -> 0x02b1 }
        r0 = r0.ordinal();	 Catch:{ all -> 0x02b1 }
        r0 = r1[r0];	 Catch:{ all -> 0x02b1 }
        switch(r0) {
            case 1: goto L_0x0216;
            case 2: goto L_0x0203;
            case 3: goto L_0x01fc;
            case 4: goto L_0x01fb;
            default: goto L_0x01fa;
        };	 Catch:{ all -> 0x02b1 }
    L_0x01fa:
        goto L_0x021d;
    L_0x01fb:
        goto L_0x021d;
    L_0x01fc:
        r8 = r5;
        r9 = r2;
        r11 = r13;
        X.AnonymousClass42i.m22261B(r7, r8, r9, r11);	 Catch:{ all -> 0x02b1 }
        goto L_0x021d;
    L_0x0203:
        r0 = r7.f48831H;	 Catch:{ all -> 0x02b1 }
        r0 = r0.f29630B;	 Catch:{ all -> 0x02b1 }
        java.lang.Long.valueOf(r0);	 Catch:{ all -> 0x02b1 }
        r0 = r7.f48831H;	 Catch:{ all -> 0x02b1 }
        r0 = r0.f29630B;	 Catch:{ all -> 0x02b1 }
        r11 = r2 + r0;
        r9 = r7;
        r10 = r5;
        X.AnonymousClass42i.m22264E(r9, r10, r11, r13);	 Catch:{ all -> 0x02b1 }
        goto L_0x01fc;
    L_0x0216:
        r8 = r5;
        r9 = r2;
        r11 = r13;
        X.AnonymousClass42i.m22264E(r7, r8, r9, r11);	 Catch:{ all -> 0x02b1 }
        goto L_0x01fc;
    L_0x021d:
        r1 = r7.f48827D;	 Catch:{ Throwable -> 0x0259 }
        r0 = r7.f48826C;	 Catch:{ Throwable -> 0x0259 }
        r1.uUA(r0);	 Catch:{ Throwable -> 0x0259 }
        r0 = r7.f48836M;	 Catch:{ Throwable -> 0x0259 }
        if (r0 == 0) goto L_0x0231;
    L_0x0228:
        r0 = r6.f44906H;	 Catch:{ Throwable -> 0x0259 }
        r0 = r0.getCanonicalPath();	 Catch:{ Throwable -> 0x0259 }
        X.AnonymousClass3ow.m20793E(r5, r0);	 Catch:{ Throwable -> 0x0259 }
    L_0x0231:
        r0 = r6.f44906H;	 Catch:{ Throwable -> 0x0259 }
        r0 = r0.exists();	 Catch:{ Throwable -> 0x0259 }
        if (r0 == 0) goto L_0x0246;
    L_0x0239:
        r7.m20804D();
        r0 = r7.f48829F;
        if (r0 == 0) goto L_0x0245;
    L_0x0240:
        r0.release();
        r7.f48829F = r4;
    L_0x0245:
        return;
    L_0x0246:
        r1 = new X.3p0;	 Catch:{ Throwable -> 0x0259 }
        r0 = "No output file created";
        r1.<init>(r0);	 Catch:{ Throwable -> 0x0259 }
    L_0x024d:
        throw r1;	 Catch:{ Throwable -> 0x0259 }
    L_0x024e:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x024e }
    L_0x0250:
        throw r0;	 Catch:{ Throwable -> 0x0251 }
    L_0x0251:
        r1 = move-exception;
        r16 = 1;
        goto L_0x024d;
    L_0x0255:
        r1 = move-exception;
        if (r16 != 0) goto L_0x0290;
    L_0x0258:
        goto L_0x028d;
    L_0x0259:
        r2 = move-exception;
        r1 = f48824P;	 Catch:{ all -> 0x0255 }
        r0 = "Exception";
        X.AnonymousClass0Dc.M(r1, r0, r2);	 Catch:{ all -> 0x0255 }
        r0 = "VideoResizeOperation_Exception";
        X.AnonymousClass0Gn.G(r0, r2);	 Catch:{ all -> 0x0255 }
        r0 = r2.getMessage();	 Catch:{ all -> 0x0255 }
        if (r0 != 0) goto L_0x0271;
    L_0x026c:
        r0 = "VideoResizeOperation_Null_Exception_Msg";
        X.AnonymousClass0Gn.G(r0, r2);	 Catch:{ all -> 0x0255 }
    L_0x0271:
        r0 = r6.f44906H;	 Catch:{ all -> 0x0255 }
        r0.delete();	 Catch:{ all -> 0x0255 }
        r0 = X.AnonymousClass3p0.class;
        X.AnonymousClass25G.m14363C(r2, r0);	 Catch:{ all -> 0x0255 }
        if (r16 == 0) goto L_0x0285;
    L_0x027d:
        r1 = new X.42g;	 Catch:{ all -> 0x0255 }
        r0 = "Failed to init codecs to resize video";
        r1.<init>(r0, r2);	 Catch:{ all -> 0x0255 }
    L_0x0284:
        throw r1;	 Catch:{ all -> 0x0255 }
    L_0x0285:
        r1 = new X.3p0;	 Catch:{ all -> 0x0255 }
        r0 = "Failed to resize video";
        r1.<init>(r0, r2);	 Catch:{ all -> 0x0255 }
        goto L_0x0284;
    L_0x028d:
        r7.m20804D();
    L_0x0290:
        r0 = r7.f48829F;
        if (r0 == 0) goto L_0x0299;
    L_0x0294:
        r0.release();
        r7.f48829F = r4;
    L_0x0299:
        throw r1;
    L_0x029a:
        r1 = move-exception;
        r0 = new X.42P;	 Catch:{ Throwable -> 0x0251 }
        r0.<init>(r1);	 Catch:{ Throwable -> 0x0251 }
        goto L_0x0250;
    L_0x02a1:
        r0 = X.AnonymousClass42P.m22248B(r2);	 Catch:{ Throwable -> 0x0251 }
        throw r0;	 Catch:{ Throwable -> 0x0251 }
    L_0x02a6:
        r2 = move-exception;
        r1 = r13.getName();	 Catch:{ IOException -> 0x029a }
        r0 = "encoder_init_error";
        X.AnonymousClass0Gn.E(r0, r1, r2);	 Catch:{ IOException -> 0x029a }
        throw r2;	 Catch:{ IOException -> 0x029a }
    L_0x02b1:
        r2 = move-exception;
        r1 = r7.f48827D;	 Catch:{ Throwable -> 0x0259 }
        r0 = r7.f48826C;	 Catch:{ Throwable -> 0x0259 }
        r1.uUA(r0);	 Catch:{ Throwable -> 0x0259 }
        throw r2;	 Catch:{ Throwable -> 0x0259 }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.42i.F(android.content.Context, X.3pA):void");
    }
}
