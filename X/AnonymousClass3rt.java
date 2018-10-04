package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.facebook.cameracore.mediapipeline.services.audioclassic.interfaces.AudioRenderCallback;
import com.facebook.cameracore.mediapipeline.services.audioclassic.interfaces.AudioService;
import com.facebook.cameracore.mediapipeline.services.audiograph.interfaces.AudioPlatformComponentHost;
import com.facebook.common.dextricks.DexStore;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.3rt */
public final class AnonymousClass3rt {
    /* renamed from: k */
    private static final AnonymousClass1rn f45509k = new AnonymousClass2j0();
    /* renamed from: B */
    public final WeakReference f45510B;
    /* renamed from: C */
    public final WeakHashMap f45511C = new WeakHashMap();
    /* renamed from: D */
    public Handler f45512D;
    /* renamed from: E */
    public HandlerThread f45513E;
    /* renamed from: F */
    public final WeakReference f45514F;
    /* renamed from: G */
    public final WeakHashMap f45515G = new WeakHashMap();
    /* renamed from: H */
    public AnonymousClass2ib f45516H;
    /* renamed from: I */
    public AnonymousClass3rp f45517I;
    /* renamed from: J */
    public final AnonymousClass1re f45518J;
    /* renamed from: K */
    public byte[] f45519K;
    /* renamed from: L */
    public final WeakReference f45520L;
    /* renamed from: M */
    public AnonymousClass2f1 f45521M;
    /* renamed from: N */
    public Surface f45522N;
    /* renamed from: O */
    public int f45523O;
    /* renamed from: P */
    public Surface f45524P;
    /* renamed from: Q */
    public AnonymousClass2jE f45525Q;
    /* renamed from: R */
    public Handler f45526R;
    /* renamed from: S */
    public HandlerThread f45527S;
    /* renamed from: T */
    public AnonymousClass2jF f45528T;
    /* renamed from: U */
    public final Handler f45529U;
    /* renamed from: V */
    public AnonymousClass1rT f45530V;
    /* renamed from: W */
    public AnonymousClass2jE f45531W;
    /* renamed from: X */
    public Handler f45532X;
    /* renamed from: Y */
    public HandlerThread f45533Y;
    /* renamed from: Z */
    public AnonymousClass1rc f45534Z;
    /* renamed from: a */
    private final AnonymousClass2iZ f45535a = new AnonymousClass3rs(this);
    /* renamed from: b */
    private final AudioRenderCallback f45536b = new AnonymousClass2j1(this);
    /* renamed from: c */
    private final AnonymousClass1rh f45537c;
    /* renamed from: d */
    private long f45538d;
    /* renamed from: e */
    private int f45539e = 0;
    /* renamed from: f */
    private boolean f45540f;
    /* renamed from: g */
    private final WeakReference f45541g;
    /* renamed from: h */
    private List f45542h;
    /* renamed from: i */
    private boolean f45543i = false;
    /* renamed from: j */
    private int f45544j;

    public AnonymousClass3rt(AnonymousClass3y6 anonymousClass3y6, AnonymousClass2hV anonymousClass2hV, AnonymousClass3y4 anonymousClass3y4, AnonymousClass3y5 anonymousClass3y5, Handler handler, AnonymousClass1re anonymousClass1re, AnonymousClass1rh anonymousClass1rh) {
        boolean z = true;
        AnonymousClass0LH.C(anonymousClass3y6 != null, "Null logger passed in");
        if (anonymousClass2hV == null) {
            z = false;
        }
        AnonymousClass0LH.C(z, "Null output provider passsed in");
        this.f45541g = new WeakReference(anonymousClass3y6);
        this.f45520L = new WeakReference(anonymousClass2hV);
        this.f45529U = handler;
        this.f45528T = AnonymousClass2jF.STOPPED;
        this.f45518J = anonymousClass1re;
        this.f45537c = anonymousClass1rh;
        this.f45514F = new WeakReference(anonymousClass3y4);
        this.f45510B = new WeakReference(anonymousClass3y5);
        this.f45519K = new byte[DexStore.LOAD_RESULT_DEX2OAT_QUICKEN_ATTEMPTED];
        this.f45542h = new LinkedList();
        this.f45540f = false;
    }

    /* renamed from: A */
    public final void m20991A(File file, AnonymousClass1rT anonymousClass1rT) {
        if (AnonymousClass2Ph.f30219B) {
            AnonymousClass3rt.m20981L(this, new AnonymousClass2j3(this, file, anonymousClass1rT));
        }
    }

    /* renamed from: B */
    public static void m20971B(AnonymousClass3rt anonymousClass3rt) {
        AnonymousClass2ib anonymousClass2ib = anonymousClass3rt.f45516H;
        if (anonymousClass2ib != null) {
            anonymousClass2ib.m16989A(f45509k, anonymousClass3rt.f45529U);
            anonymousClass3rt.f45516H = null;
        }
        AnonymousClass3rp anonymousClass3rp = anonymousClass3rt.f45517I;
        if (anonymousClass3rp != null) {
            anonymousClass3rp.m20968D(f45509k, anonymousClass3rt.f45529U);
            anonymousClass3rt.f45517I = null;
        }
        AnonymousClass3rt.m20987R(anonymousClass3rt);
        AnonymousClass3rt.m20988S(anonymousClass3rt);
        anonymousClass3rt.f45540f = false;
        anonymousClass3rt.f45542h.clear();
        anonymousClass3rt.f45528T = AnonymousClass2jF.STOPPED;
    }

    /* renamed from: C */
    public static void m20972C(AnonymousClass3rt anonymousClass3rt) {
        AnonymousClass3rt.m20989T();
        anonymousClass3rt.f45540f = false;
        anonymousClass3rt.f45515G.clear();
        anonymousClass3rt.f45511C.clear();
        if (!anonymousClass3rt.f45542h.isEmpty()) {
            Runnable runnable = (Runnable) anonymousClass3rt.f45542h.remove(0);
            anonymousClass3rt.f45540f = true;
            runnable.run();
        }
    }

    /* renamed from: D */
    public static int m20973D(int i) {
        switch (i) {
            case 1:
            case 2:
                return 2;
            case 3:
                return 1;
            case 4:
                return 4;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Bad audio format ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: E */
    public static void m20974E(AnonymousClass3rt anonymousClass3rt, byte[] bArr, int i) {
        AnonymousClass3rp anonymousClass3rp = anonymousClass3rt.f45517I;
        if (anonymousClass3rp != null) {
            anonymousClass3rp.m20965A(bArr, i, anonymousClass3rt.f45538d);
            long j = (long) anonymousClass3rt.f45523O;
            anonymousClass3rt.f45538d += ((((long) i) / ((long) AnonymousClass3rt.m20973D(anonymousClass3rt.f45544j))) * 1000000) / j;
        }
    }

    /* renamed from: F */
    public static void m20975F(AnonymousClass3rt anonymousClass3rt, int i) {
        AnonymousClass3y6 anonymousClass3y6 = (AnonymousClass3y6) anonymousClass3rt.f45541g.get();
    }

    /* renamed from: G */
    public static void m20976G(AnonymousClass3rt anonymousClass3rt, int i) {
        AnonymousClass3y6 anonymousClass3y6 = (AnonymousClass3y6) anonymousClass3rt.f45541g.get();
    }

    /* renamed from: H */
    public static void m20977H(AnonymousClass3rt anonymousClass3rt, String str, Throwable th, String str2) {
        AnonymousClass3y6 anonymousClass3y6 = (AnonymousClass3y6) anonymousClass3rt.f45541g.get();
    }

    /* renamed from: I */
    public static void m20978I(AnonymousClass3rt anonymousClass3rt, String str, Map map) {
        AnonymousClass3y6 anonymousClass3y6 = (AnonymousClass3y6) anonymousClass3rt.f45541g.get();
    }

    /* renamed from: J */
    public static void m20979J(AnonymousClass3rt anonymousClass3rt, AnonymousClass1rn anonymousClass1rn, Handler handler, boolean z) {
        anonymousClass3rt.f45528T = AnonymousClass2jF.PREPARED;
        AnonymousClass1rq.m13521C(anonymousClass1rn, handler);
        if (z) {
            AnonymousClass3rt.m20972C(anonymousClass3rt);
        }
    }

    /* renamed from: K */
    public static void m20980K(AnonymousClass3rt anonymousClass3rt, AnonymousClass1rY anonymousClass1rY) {
        AnonymousClass3rt.m20975F(anonymousClass3rt, 8);
        AnonymousClass3rt.m20975F(anonymousClass3rt, 12);
        AnonymousClass3rt.m20977H(anonymousClass3rt, "stop_recording_video_failed", anonymousClass1rY, "high");
        AnonymousClass3rt.m20971B(anonymousClass3rt);
        AnonymousClass1rT anonymousClass1rT = anonymousClass3rt.f45530V;
        if (anonymousClass1rT != null) {
            anonymousClass1rT.Hf(anonymousClass1rY);
            anonymousClass3rt.f45530V = null;
        }
    }

    /* renamed from: L */
    public static void m20981L(AnonymousClass3rt anonymousClass3rt, Runnable runnable) {
        AnonymousClass3rt.m20989T();
        if (anonymousClass3rt.f45540f) {
            anonymousClass3rt.f45542h.add(runnable);
            return;
        }
        anonymousClass3rt.f45540f = true;
        runnable.run();
    }

    /* renamed from: M */
    public static void m20982M(AnonymousClass3rt anonymousClass3rt, AnonymousClass2jE anonymousClass2jE, AnonymousClass2id anonymousClass2id, AnonymousClass2jE anonymousClass2jE2, AnonymousClass1rn anonymousClass1rn, boolean z) {
        boolean z2 = false;
        if (anonymousClass3rt.f45528T == AnonymousClass2jF.STOPPED || anonymousClass3rt.f45528T == AnonymousClass2jF.PREPARED) {
            AnonymousClass2jE anonymousClass2jE3 = anonymousClass2jE;
            if (anonymousClass3rt.f45528T == AnonymousClass2jF.PREPARED && anonymousClass2jE.equals(anonymousClass3rt.f45531W)) {
                AnonymousClass3rt.m20979J(anonymousClass3rt, anonymousClass1rn, anonymousClass3rt.f45529U, z);
                return;
            }
            anonymousClass3rt.f45531W = anonymousClass2jE;
            AnonymousClass2jE anonymousClass2jE4 = anonymousClass2jE2;
            anonymousClass3rt.f45525Q = anonymousClass2jE2;
            anonymousClass3rt.f45528T = AnonymousClass2jF.PREPARE_STARTED;
            anonymousClass3rt.f45513E = new HandlerThread("AudioRecordingThread");
            anonymousClass3rt.f45533Y = new HandlerThread("VideoRecordingThread");
            anonymousClass3rt.f45513E.start();
            anonymousClass3rt.f45533Y.start();
            anonymousClass3rt.f45512D = new Handler(anonymousClass3rt.f45513E.getLooper());
            anonymousClass3rt.f45532X = new Handler(anonymousClass3rt.f45533Y.getLooper());
            if (anonymousClass3rt.f45518J.f23491E != null && anonymousClass3rt.f45518J.f23491E.f23506E) {
                HandlerThread handlerThread = new HandlerThread("SegmentedVideoRecordingThread");
                anonymousClass3rt.f45527S = handlerThread;
                handlerThread.start();
                anonymousClass3rt.f45526R = new Handler(anonymousClass3rt.f45527S.getLooper());
            }
            if (anonymousClass2id == null) {
                int i;
                AnonymousClass2ic anonymousClass2ic = new AnonymousClass2ic();
                AnonymousClass1re anonymousClass1re = anonymousClass3rt.f45518J;
                if (anonymousClass1re == null || anonymousClass1re.f23490D == null) {
                    i = 1;
                } else {
                    i = 10;
                }
                anonymousClass2ic.f32896B = i;
                AnonymousClass1rh anonymousClass1rh = anonymousClass3rt.f45537c;
                if (anonymousClass1rh != null && anonymousClass1rh.f23499B) {
                    z2 = true;
                }
                anonymousClass2ic.f32899E = z2;
                if (anonymousClass3rt.f45518J.f23489C.mo3771B()) {
                    anonymousClass2ic.f32903I = 5;
                }
                anonymousClass2id = new AnonymousClass2id(anonymousClass2ic);
            }
            AnonymousClass3rt.m20990U(anonymousClass3rt, 11);
            if (anonymousClass3rt.f45534Z == null) {
                anonymousClass3rt.f45534Z = new AnonymousClass1rc(anonymousClass2jE.f33003G, anonymousClass2jE.f33000D);
            }
            anonymousClass3rt.f45516H = new AnonymousClass2ib(anonymousClass2id, anonymousClass3rt.f45512D, anonymousClass3rt.f45535a);
            if (anonymousClass3rt.f45519K.length < anonymousClass3rt.f45516H.f32886B) {
                anonymousClass3rt.f45519K = new byte[anonymousClass3rt.f45516H.f32886B];
            }
            anonymousClass3rt.f45523O = anonymousClass2id.f32910H;
            anonymousClass3rt.f45544j = anonymousClass2id.f32908F;
            AnonymousClass2iQ anonymousClass2iQ = new AnonymousClass2iQ();
            anonymousClass2iQ.f32856C = anonymousClass3rt.f45516H.f32886B;
            anonymousClass2iQ.f32858E = anonymousClass3rt.f45523O;
            anonymousClass3rt.f45517I = new AnonymousClass3rp(new AnonymousClass2iR(anonymousClass2iQ), anonymousClass2jE3, anonymousClass2jE4, anonymousClass3rt.f45512D, anonymousClass3rt.f45532X, anonymousClass3rt.f45526R, anonymousClass3rt.f45518J.f23491E);
            if (anonymousClass3rt.f45543i) {
                AnonymousClass3rp anonymousClass3rp = anonymousClass3rt.f45517I;
                anonymousClass3rp.f45478L = 2.0d;
                AnonymousClass2is anonymousClass2is = anonymousClass3rp.f45473G;
                if (anonymousClass2is != null) {
                    anonymousClass2is.f32946C = 2.0d;
                }
            }
            anonymousClass3rt.f45517I.f45470D = anonymousClass3rt.f45539e;
            AnonymousClass2in anonymousClass2in = new AnonymousClass2in(2);
            AnonymousClass2ib anonymousClass2ib = anonymousClass3rt.f45516H;
            AnonymousClass1rn anonymousClass2j5 = new AnonymousClass2j5(anonymousClass3rt, anonymousClass2in, anonymousClass1rn, z);
            Handler handler = anonymousClass3rt.f45529U;
            AnonymousClass2ib.m16987D(anonymousClass2ib, handler);
            AnonymousClass0OR.D(anonymousClass2ib.f32892H, new AnonymousClass2iW(anonymousClass2ib, anonymousClass2j5, handler), 1784661085);
            anonymousClass3rt.f45517I.m20966B(new AnonymousClass2j6(anonymousClass3rt, anonymousClass2in, anonymousClass1rn, z), anonymousClass3rt.f45529U);
            return;
        }
        anonymousClass1rn.tk(new IllegalStateException(String.format((Locale) null, "prepareRecordingVideo can't be called in %s state", new Object[]{anonymousClass3rt.f45528T.toString()})));
        AnonymousClass3rt.m20971B(anonymousClass3rt);
    }

    /* renamed from: N */
    public static void m20983N(AnonymousClass3rt anonymousClass3rt, File file, AnonymousClass1rT anonymousClass1rT) {
        if (anonymousClass3rt.f45528T == AnonymousClass2jF.RECORDING) {
            AnonymousClass3rt.m20971B(anonymousClass3rt);
            throw new IllegalStateException("Recording video has already started");
        } else if (anonymousClass3rt.f45528T == AnonymousClass2jF.PREPARED) {
            anonymousClass3rt.f45528T = AnonymousClass2jF.RECORDING_STARTED;
            AnonymousClass3rt.m20990U(anonymousClass3rt, 2);
            AnonymousClass3rt.m20978I(anonymousClass3rt, "start_recording_video_started", null);
            anonymousClass3rt.f45538d = 0;
            anonymousClass3rt.f45530V = anonymousClass1rT;
            synchronized (anonymousClass3rt) {
                Object obj;
                if (anonymousClass3rt.f45528T != AnonymousClass2jF.RECORDING_STARTED) {
                    if (anonymousClass3rt.f45528T != AnonymousClass2jF.RECORDING) {
                        obj = null;
                        if (obj != null) {
                            AnonymousClass3rt.m20986Q(anonymousClass3rt);
                            AnonymousClass3rt.m20985P(anonymousClass3rt);
                        }
                    }
                }
                obj = 1;
                if (obj != null) {
                    AnonymousClass3rt.m20986Q(anonymousClass3rt);
                    AnonymousClass3rt.m20985P(anonymousClass3rt);
                }
            }
            AnonymousClass3rp anonymousClass3rp = anonymousClass3rt.f45517I;
            if (anonymousClass3rp == null) {
                AnonymousClass1rq.m13520B(new AnonymousClass2iu(anonymousClass3rt), anonymousClass3rt.f45529U, new NullPointerException("AvRecorder is null"));
            } else {
                anonymousClass3rp.m20967C(file, new AnonymousClass2iw(anonymousClass3rt), new AnonymousClass2ix(anonymousClass3rt), anonymousClass3rt.f45529U);
            }
        } else {
            AnonymousClass3rt.m20971B(anonymousClass3rt);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("prepare must be called before start. Current state: ");
            stringBuilder.append(anonymousClass3rt.f45528T);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: O */
    public static void m20984O(AnonymousClass3rt anonymousClass3rt) {
        if (anonymousClass3rt.f45528T != AnonymousClass2jF.STOPPED) {
            if (anonymousClass3rt.f45528T != AnonymousClass2jF.STOP_STARTED) {
                if (anonymousClass3rt.f45528T == AnonymousClass2jF.PREPARED) {
                    AnonymousClass3rt.m20971B(anonymousClass3rt);
                    AnonymousClass3rt.m20972C(anonymousClass3rt);
                    return;
                }
                anonymousClass3rt.f45528T = AnonymousClass2jF.STOP_STARTED;
                AnonymousClass3rt.m20990U(anonymousClass3rt, 8);
                AnonymousClass3rt.m20990U(anonymousClass3rt, 12);
                AnonymousClass3rt.m20978I(anonymousClass3rt, "stop_recording_video_started", null);
                AnonymousClass2hV anonymousClass2hV = (AnonymousClass2hV) anonymousClass3rt.f45520L.get();
                if (anonymousClass2hV != null) {
                    anonymousClass2hV.f32567B.f32598N.m15633C(anonymousClass3rt.f45521M);
                }
                anonymousClass3rt.f45522N = null;
                anonymousClass3rt.f45524P = null;
                anonymousClass3rt.f45521M = null;
                if (!(anonymousClass3rt.f45516H == null || anonymousClass3rt.f45517I == null || anonymousClass3rt.f45513E == null)) {
                    if (anonymousClass3rt.f45533Y != null) {
                        AnonymousClass3y4 anonymousClass3y4 = (AnonymousClass3y4) anonymousClass3rt.f45514F.get();
                        if (anonymousClass3y4 != null) {
                            AudioPlatformComponentHost A = anonymousClass3y4.m21774A();
                            if (A != null) {
                                A.stopRecording();
                            }
                        }
                        AnonymousClass3y5 anonymousClass3y5 = (AnonymousClass3y5) anonymousClass3rt.f45510B.get();
                        if (anonymousClass3y5 != null) {
                            AudioService A2 = anonymousClass3y5.m21775A();
                            if (A2 != null) {
                                A2.reset();
                            }
                        }
                        anonymousClass3rt.f45516H.m16989A(new AnonymousClass2iz(anonymousClass3rt), anonymousClass3rt.f45529U);
                        return;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                if (anonymousClass3rt.f45516H == null) {
                    stringBuilder.append("mAudioRecorder ");
                }
                if (anonymousClass3rt.f45517I == null) {
                    stringBuilder.append("mAvRecorder ");
                }
                if (anonymousClass3rt.f45513E == null) {
                    stringBuilder.append("mAudioHandlerThread ");
                }
                if (anonymousClass3rt.f45533Y == null) {
                    stringBuilder.append("mVideoHandlerThread ");
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("RecorderCoordinatorImpl field (");
                stringBuilder2.append(stringBuilder.toString());
                stringBuilder2.append(") unexpectedly null before stopping");
                AnonymousClass3rt.m20980K(anonymousClass3rt, new AnonymousClass1rY(stringBuilder2.toString()));
                return;
            }
        }
        AnonymousClass3rt.m20972C(anonymousClass3rt);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: P */
    public static synchronized boolean m20985P(X.AnonymousClass3rt r4) {
        /*
        monitor-enter(r4);
        r0 = r4.f45510B;	 Catch:{ all -> 0x0047 }
        r0 = r0.get();	 Catch:{ all -> 0x0047 }
        r0 = (X.AnonymousClass3y5) r0;	 Catch:{ all -> 0x0047 }
        r1 = 0;
        if (r0 != 0) goto L_0x000e;
    L_0x000c:
        monitor-exit(r4);
        return r1;
    L_0x000e:
        r3 = r0.m21775A();	 Catch:{ all -> 0x0047 }
        if (r3 != 0) goto L_0x0015;
    L_0x0014:
        goto L_0x000c;
    L_0x0015:
        r0 = r4.f45511C;	 Catch:{ all -> 0x0047 }
        r0 = r0.get(r3);	 Catch:{ all -> 0x0047 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x0047 }
        if (r0 == 0) goto L_0x0025;
    L_0x001f:
        r0 = r0.booleanValue();	 Catch:{ all -> 0x0047 }
        if (r0 != 0) goto L_0x000c;
    L_0x0025:
        r0 = r4.f45516H;	 Catch:{ all -> 0x0047 }
        r2 = r0.f32891G;	 Catch:{ all -> 0x0047 }
        r0 = r4.f45516H;	 Catch:{ all -> 0x0047 }
        r0 = r0.f32887C;	 Catch:{ all -> 0x0047 }
        if (r0 == 0) goto L_0x0034;
    L_0x002f:
        r1 = r0.getAudioSessionId();	 Catch:{ all -> 0x0047 }
        goto L_0x0035;
    L_0x0034:
        r1 = 0;
    L_0x0035:
        r0 = r4.f45536b;	 Catch:{ all -> 0x0047 }
        r3.setRenderCallback(r0);	 Catch:{ all -> 0x0047 }
        r3.startRendering(r1, r2);	 Catch:{ all -> 0x0047 }
        r1 = r4.f45511C;	 Catch:{ all -> 0x0047 }
        r0 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x0047 }
        r1.put(r3, r0);	 Catch:{ all -> 0x0047 }
        r0 = 1;
        monitor-exit(r4);
        return r0;
    L_0x0047:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3rt.P(X.3rt):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: Q */
    public static synchronized boolean m20986Q(X.AnonymousClass3rt r3) {
        /*
        monitor-enter(r3);
        r0 = r3.f45514F;	 Catch:{ all -> 0x003b }
        r0 = r0.get();	 Catch:{ all -> 0x003b }
        r0 = (X.AnonymousClass3y4) r0;	 Catch:{ all -> 0x003b }
        r1 = 0;
        if (r0 != 0) goto L_0x000e;
    L_0x000c:
        monitor-exit(r3);
        return r1;
    L_0x000e:
        r2 = r0.m21774A();	 Catch:{ all -> 0x003b }
        if (r2 != 0) goto L_0x0015;
    L_0x0014:
        goto L_0x000c;
    L_0x0015:
        r0 = r3.f45515G;	 Catch:{ all -> 0x003b }
        r0 = r0.get(r2);	 Catch:{ all -> 0x003b }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x003b }
        if (r0 == 0) goto L_0x0025;
    L_0x001f:
        r0 = r0.booleanValue();	 Catch:{ all -> 0x003b }
        if (r0 != 0) goto L_0x000c;
    L_0x0025:
        r0 = r3.f45516H;	 Catch:{ all -> 0x003b }
        r1 = r0.f32891G;	 Catch:{ all -> 0x003b }
        r0 = r3.f45536b;	 Catch:{ all -> 0x003b }
        r2.setRenderCallback(r0);	 Catch:{ all -> 0x003b }
        r2.startRecording(r1);	 Catch:{ all -> 0x003b }
        r1 = r3.f45515G;	 Catch:{ all -> 0x003b }
        r0 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x003b }
        r1.put(r2, r0);	 Catch:{ all -> 0x003b }
        r0 = 1;
        monitor-exit(r3);
        return r0;
    L_0x003b:
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3rt.Q(X.3rt):boolean");
    }

    /* renamed from: R */
    public static void m20987R(X.AnonymousClass3rt r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r0 = r2.f45513E;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0.quitSafely();
        r1 = 0;
        r0 = r2.f45513E;	 Catch:{ InterruptedException -> 0x0019 }
        r0.join();	 Catch:{ InterruptedException -> 0x0019 }
    L_0x000e:
        r2.f45513E = r1;
        r2.f45512D = r1;
        return;
    L_0x0013:
        r0 = move-exception;
        r2.f45513E = r1;
        r2.f45512D = r1;
        throw r0;
    L_0x0019:
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0013 }
        r0.interrupt();	 Catch:{ all -> 0x0013 }
        goto L_0x000e;	 Catch:{ all -> 0x0013 }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3rt.R(X.3rt):void");
    }

    /* renamed from: S */
    public static void m20988S(X.AnonymousClass3rt r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r0 = r2.f45533Y;
        r1 = 0;
        if (r0 == 0) goto L_0x0020;
    L_0x0005:
        r0.quitSafely();
        r0 = r2.f45533Y;	 Catch:{ InterruptedException -> 0x0018 }
        r0.join();	 Catch:{ InterruptedException -> 0x0018 }
    L_0x000d:
        r2.f45533Y = r1;
        r2.f45532X = r1;
        goto L_0x0020;
    L_0x0012:
        r0 = move-exception;
        r2.f45533Y = r1;
        r2.f45532X = r1;
        throw r0;
    L_0x0018:
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0012 }
        r0.interrupt();	 Catch:{ all -> 0x0012 }
        goto L_0x000d;	 Catch:{ all -> 0x0012 }
    L_0x0020:
        r0 = r2.f45527S;
        if (r0 == 0) goto L_0x003f;
    L_0x0024:
        r0.quitSafely();
        r0 = r2.f45527S;	 Catch:{ InterruptedException -> 0x0037 }
        r0.join();	 Catch:{ InterruptedException -> 0x0037 }
    L_0x002c:
        r2.f45527S = r1;
        r2.f45526R = r1;
        goto L_0x003f;
    L_0x0031:
        r0 = move-exception;
        r2.f45527S = r1;
        r2.f45526R = r1;
        throw r0;
    L_0x0037:
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0031 }
        r0.interrupt();	 Catch:{ all -> 0x0031 }
        goto L_0x002c;	 Catch:{ all -> 0x0031 }
    L_0x003f:
        return;	 Catch:{ all -> 0x0031 }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3rt.S(X.3rt):void");
    }

    /* renamed from: T */
    private static void m20989T() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("RecorderCoordinatorImpl methods must be called on the UI thread");
        }
    }

    /* renamed from: U */
    private static void m20990U(AnonymousClass3rt anonymousClass3rt, int i) {
        AnonymousClass3y6 anonymousClass3y6 = (AnonymousClass3y6) anonymousClass3rt.f45541g.get();
    }
}
