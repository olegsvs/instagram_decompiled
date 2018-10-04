package com.facebook.video.heroplayer.service;

import X.AnonymousClass0OR;
import X.AnonymousClass0cQ;
import X.AnonymousClass1Gy;
import X.AnonymousClass1eC;
import X.AnonymousClass1xi;
import X.AnonymousClass2kY;
import X.AnonymousClass2ke;
import X.AnonymousClass2ki;
import X.AnonymousClass2kt;
import X.AnonymousClass2l3;
import X.AnonymousClass2lM;
import X.AnonymousClass2p2;
import X.AnonymousClass2p3;
import X.AnonymousClass2p5;
import X.AnonymousClass2pR;
import X.AnonymousClass2pS;
import X.AnonymousClass2pV;
import X.AnonymousClass2pW;
import X.AnonymousClass2pd;
import X.AnonymousClass2pi;
import X.AnonymousClass2pj;
import X.AnonymousClass2pk;
import X.AnonymousClass2px;
import X.AnonymousClass2qS;
import X.AnonymousClass2rg;
import X.AnonymousClass2td;
import X.AnonymousClass3sL;
import X.AnonymousClass3sS;
import X.AnonymousClass3tD;
import X.AnonymousClass3tL;
import X.AnonymousClass3tO;
import X.AnonymousClass3ti;
import X.AnonymousClass3uD;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.ResultReceiver;
import android.view.Surface;
import com.facebook.breakpad.BreakpadManager;
import com.facebook.exoplayer.ipc.VpsManifestParseErrorEvent;
import com.facebook.video.cache.instrumentation.VideoCacheDatabase;
import com.facebook.video.heroplayer.ipc.DeviceOrientationFrame;
import com.facebook.video.heroplayer.ipc.DynamicPlayerSettings;
import com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi.Stub;
import com.facebook.video.heroplayer.ipc.HeroServicePlayerListener;
import com.facebook.video.heroplayer.ipc.SpatialAudioFocusParams;
import com.facebook.video.heroplayer.ipc.TigonTraceListener;
import com.facebook.video.heroplayer.ipc.TigonTrafficShapingListener;
import com.facebook.video.heroplayer.ipc.VideoLicenseListener;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;
import com.facebook.video.heroplayer.ipc.VideoPrefetchRequest;
import com.facebook.video.heroplayer.ipc.VideoSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class HeroService extends Service {
    /* renamed from: B */
    public volatile boolean f34513B;
    /* renamed from: C */
    public final AnonymousClass3sL f34514C = new AnonymousClass3sL();
    /* renamed from: D */
    public HandlerThread f34515D;
    /* renamed from: E */
    public final boolean f34516E;
    /* renamed from: F */
    public AnonymousClass2p3 f34517F;
    /* renamed from: G */
    public AnonymousClass2kY f34518G;
    /* renamed from: H */
    public final AtomicReference f34519H = new AtomicReference(new DynamicPlayerSettings(-1, 4000, -1, -1, -1, -1, -1, -1, -1, -1, -1, false));
    /* renamed from: I */
    public AnonymousClass2p5 f34520I;
    /* renamed from: J */
    public final Map f34521J = Collections.synchronizedMap(new HashMap());
    /* renamed from: K */
    public final AtomicReference f34522K;
    /* renamed from: L */
    public AnonymousClass2px f34523L;
    /* renamed from: M */
    public AnonymousClass3tO f34524M;
    /* renamed from: N */
    public volatile AnonymousClass1Gy f34525N = AnonymousClass1Gy.cC;
    /* renamed from: O */
    public final AtomicReference f34526O = new AtomicReference(null);
    /* renamed from: P */
    public final AtomicReference f34527P = new AtomicReference(null);
    /* renamed from: Q */
    public volatile AnonymousClass2pi f34528Q;
    /* renamed from: R */
    public AnonymousClass3sS f34529R;
    /* renamed from: S */
    public AnonymousClass2pk f34530S;
    /* renamed from: T */
    public final AnonymousClass3tL f34531T = new AnonymousClass3tL(this.f34526O);
    /* renamed from: U */
    public final AnonymousClass3ti f34532U = new AnonymousClass3ti();
    /* renamed from: V */
    public final AtomicReference f34533V = new AtomicReference();
    /* renamed from: W */
    private Handler f34534W;
    /* renamed from: X */
    private final Object f34535X = new Object();
    /* renamed from: Y */
    private final Stub f34536Y;

    /* renamed from: com.facebook.video.heroplayer.service.HeroService$6 */
    public final class C01206 extends Stub {
        /* renamed from: B */
        public final /* synthetic */ HeroService f34511B;

        public C01206(HeroService heroService) {
            this.f34511B = heroService;
            AnonymousClass0cQ.H(this, 1189194951, AnonymousClass0cQ.I(this, 179376061));
        }

        public final boolean ARA(long j, long j2) {
            int I = AnonymousClass0cQ.I(this, 1244296453);
            try {
                AnonymousClass2pR.m17344D("id [%d]: setRelativePosition %d", Long.valueOf(j), Long.valueOf(j2));
                AnonymousClass2pd A = this.f34511B.f34528Q.m17391A(j);
                if (A == null) {
                    AnonymousClass0cQ.H(this, -1899811869, I);
                    return false;
                }
                AnonymousClass2pd.m17371T(A, "Set relative position to %d", Long.valueOf(j2));
                AnonymousClass2pd.m17367P(A, A.f34571L.obtainMessage(16, Long.valueOf(j2)));
                AnonymousClass0cQ.H(this, -594911008, I);
                return true;
            } catch (RuntimeException e) {
                m17350C(e);
                AnonymousClass0cQ.H(this, 2020743410, I);
                return false;
            }
        }

        public final long AXA(VideoPlayRequest videoPlayRequest, Surface surface, int i, int i2, float f) {
            int I = AnonymousClass0cQ.I(this, 167638170);
            try {
                AnonymousClass2pR.m17344D("warmupPlayerAndReturn, %s", videoPlayRequest.f15797M.f14750O);
                AnonymousClass2td.m17605D(videoPlayRequest.f15797M.f14750O);
                if (this.f34511B.f34528Q.m17392B(videoPlayRequest.f15797M.f14750O)) {
                    AnonymousClass2pR.m17344D("Found a player in pool, skip warmup", new Object[0]);
                    AnonymousClass0cQ.H(this, -1901493182, I);
                    return 0;
                }
                long jWA = jWA(0, videoPlayRequest, new WarmUpPlayerListener());
                AnonymousClass2pd A = this.f34511B.f34528Q.m17391A(jWA);
                if (A != null) {
                    A.m17387I(f);
                    A.m17383E(this.f34511B.f34530S, videoPlayRequest, (DynamicPlayerSettings) this.f34511B.f34519H.get());
                    if (surface != null) {
                        A.m17386H(surface, i, i2);
                    }
                    AnonymousClass0cQ.H(this, 1461945413, I);
                    return jWA;
                }
                AnonymousClass0cQ.H(this, -362475326, I);
                return 0;
            } catch (RuntimeException e) {
                m17350C(e);
                AnonymousClass0cQ.H(this, 1554544632, I);
                return 0;
            }
        }

        /* renamed from: C */
        private void m17350C(RuntimeException runtimeException) {
            int I = AnonymousClass0cQ.I(this, -1657796145);
            Error error = new Error(runtimeException);
            AnonymousClass0cQ.H(this, -778315471, I);
            throw error;
        }

        public final void CC(TigonTraceListener tigonTraceListener) {
            AnonymousClass0cQ.H(this, -471412737, AnonymousClass0cQ.I(this, 2053665034));
        }

        public final void DC(TigonTrafficShapingListener tigonTrafficShapingListener) {
            AnonymousClass0cQ.H(this, -1660316022, AnonymousClass0cQ.I(this, 1988364558));
        }

        public final void DE(String str) {
            int I = AnonymousClass0cQ.I(this, -19431900);
            try {
                HeroService heroService = this.f34511B;
                AnonymousClass2pR.m17344D("cancelPrefetchForOrigin %s", str);
                heroService.f34529R.m21086A(str);
            } catch (RuntimeException e) {
                m17350C(e);
            }
            AnonymousClass0cQ.H(this, 312811304, I);
        }

        public final void EE(String str) {
            int I = AnonymousClass0cQ.I(this, 946504237);
            try {
                HeroService heroService = this.f34511B;
                AnonymousClass2pR.m17344D("cancelPrefetchForVideo %s", str);
                AnonymousClass3sS anonymousClass3sS = heroService.f34529R;
                int B = anonymousClass3sS.f45772G.m17037B(new AnonymousClass2lM(anonymousClass3sS, str));
                AnonymousClass3tD anonymousClass3tD = anonymousClass3sS.f45770E;
                if (anonymousClass3tD != null) {
                    anonymousClass3tD.f46018B.f34531T.m21177B(new AnonymousClass1xi(str, B > 0));
                }
            } catch (RuntimeException e) {
                m17350C(e);
            }
            AnonymousClass0cQ.H(this, 959292815, I);
        }

        public final boolean HHA(long j, boolean z) {
            int I = AnonymousClass0cQ.I(this, 1927050599);
            try {
                AnonymousClass2pR.m17344D("id [%d]: pause, should keep loading: %b", Long.valueOf(j), Boolean.valueOf(z));
                AnonymousClass2pd A = this.f34511B.f34528Q.m17391A(j);
                if (A == null) {
                    AnonymousClass0cQ.H(this, 1492446932, I);
                    return false;
                }
                A.m17381C(z);
                AnonymousClass0cQ.H(this, 595696275, I);
                return true;
            } catch (RuntimeException e) {
                m17350C(e);
                AnonymousClass0cQ.H(this, -438255052, I);
                return false;
            }
        }

        public final void JJA(long j, boolean z) {
            int I = AnonymousClass0cQ.I(this, 1976788167);
            try {
                AnonymousClass2pR.m17344D("id [%d]: release", Long.valueOf(j));
                this.f34511B.f34528Q.m17393C(j, z);
            } catch (RuntimeException e) {
                m17350C(e);
            }
            AnonymousClass0cQ.H(this, -900953253, I);
        }

        public final boolean JLA(long j) {
            int I = AnonymousClass0cQ.I(this, -1652789827);
            try {
                AnonymousClass2pR.m17344D("id [%d]: reset", Long.valueOf(j));
                AnonymousClass2pd A = this.f34511B.f34528Q.m17391A(j);
                if (A == null) {
                    AnonymousClass0cQ.H(this, 1556290782, I);
                    return false;
                }
                AnonymousClass2pd.m17371T(A, "Reset", new Object[0]);
                AnonymousClass2pd.m17367P(A, A.f34571L.obtainMessage(11));
                AnonymousClass2pd.m17369R(A);
                AnonymousClass0cQ.H(this, -2035067759, I);
                return true;
            } catch (RuntimeException e) {
                m17350C(e);
                AnonymousClass0cQ.H(this, 1958973799, I);
                return false;
            }
        }

        public final void KSA(byte[] bArr, int i) {
            AnonymousClass0cQ.H(this, 1278977828, AnonymousClass0cQ.I(this, -1791357113));
        }

        public final void Mc(String str) {
            int I = AnonymousClass0cQ.I(this, 567117041);
            try {
                AnonymousClass2pR.m17344D("network type changed to: %s", str);
                if (this.f34511B.f34518G != null) {
                    this.f34511B.f34518G.f33261B = str.toUpperCase(Locale.US);
                }
            } catch (RuntimeException e) {
                m17350C(e);
            }
            AnonymousClass0cQ.H(this, 765361653, I);
        }

        public final boolean NPA(long j, boolean z) {
            int I = AnonymousClass0cQ.I(this, -115007756);
            try {
                AnonymousClass2pR.m17344D("id [%d]: setLooping %s", Long.valueOf(j), Boolean.valueOf(z));
                AnonymousClass2pd A = this.f34511B.f34528Q.m17391A(j);
                if (A == null) {
                    AnonymousClass0cQ.H(this, 780942116, I);
                    return false;
                }
                A.m17385G(z);
                AnonymousClass0cQ.H(this, 551621688, I);
                return true;
            } catch (RuntimeException e) {
                m17350C(e);
                AnonymousClass0cQ.H(this, -2109094667, I);
                return false;
            }
        }

        public final Map OJ(String str) {
            int I = AnonymousClass0cQ.I(this, -989213498);
            try {
                Map B = AnonymousClass2kt.f33313B.mo3950B(str);
                AnonymousClass0cQ.H(this, -2135907687, I);
                return B;
            } catch (RuntimeException e) {
                m17350C(e);
                AnonymousClass0cQ.H(this, 49928770, I);
                return null;
            }
        }

        public final boolean THA(long j) {
            int I = AnonymousClass0cQ.I(this, 256507467);
            try {
                AnonymousClass2pR.m17344D("id [%d]: play", Long.valueOf(j));
                AnonymousClass2pd A = this.f34511B.f34528Q.m17391A(j);
                if (A == null) {
                    AnonymousClass0cQ.H(this, 1951630931, I);
                    return false;
                }
                A.m17382D();
                AnonymousClass0cQ.H(this, 864997454, I);
                return true;
            } catch (RuntimeException e) {
                m17350C(e);
                AnonymousClass0cQ.H(this, -1454971421, I);
                return false;
            }
        }

        public final boolean UJA(long j, ResultReceiver resultReceiver) {
            int I = AnonymousClass0cQ.I(this, 781280640);
            try {
                AnonymousClass2pR.m17344D("id [%d]: releaseSurface", Long.valueOf(j));
                AnonymousClass2pd A = this.f34511B.f34528Q.m17391A(j);
                if (A == null) {
                    AnonymousClass0cQ.H(this, 1996533004, I);
                    return false;
                }
                AnonymousClass2pd.m17371T(A, "Release surface", new Object[0]);
                AnonymousClass2pd.m17367P(A, A.f34571L.obtainMessage(7, resultReceiver));
                AnonymousClass0cQ.H(this, 146500838, I);
                return true;
            } catch (RuntimeException e) {
                m17350C(e);
                AnonymousClass0cQ.H(this, 1864420502, I);
                return false;
            }
        }

        public final void VE() {
            int I = AnonymousClass0cQ.I(this, -1918784158);
            try {
                AnonymousClass2p3 anonymousClass2p3 = this.f34511B.f34517F;
                if (anonymousClass2p3 != null) {
                    AnonymousClass2p3.m17315B(anonymousClass2p3.f34394D.f34423B, AnonymousClass2p2.GENERAL);
                    AnonymousClass2p3.m17315B(anonymousClass2p3.f34394D.f34423B, AnonymousClass2p2.PREFETCH);
                    AnonymousClass2p3.m17315B(anonymousClass2p3.f34394D.f34423B, AnonymousClass2p2.METADATA);
                    VideoCacheDatabase videoCacheDatabase = anonymousClass2p3.f34402L;
                    if (videoCacheDatabase != null) {
                        videoCacheDatabase.logCacheClearEvent();
                    }
                }
            } catch (RuntimeException e) {
                m17350C(e);
            }
            AnonymousClass0cQ.H(this, -311252449, I);
        }

        public final long VLA(long j) {
            int I = AnonymousClass0cQ.I(this, -326621710);
            try {
                AnonymousClass2pR.m17344D("id [%d]: retrieveCurrentPosition", Long.valueOf(j));
                AnonymousClass2pd A = this.f34511B.f34528Q.m17391A(j);
                if (A == null) {
                    AnonymousClass0cQ.H(this, 1234525433, I);
                    return 0;
                }
                long j2;
                AnonymousClass2pd.m17371T(A, "Retrieve service player current position", new Object[0]);
                if (A.f34569J == null) {
                    j2 = 0;
                } else if (AnonymousClass1eC.DASH_LIVE == A.f34599n) {
                    j2 = A.f34569J.fQ();
                } else {
                    j2 = A.f34569J.kK();
                }
                AnonymousClass0cQ.H(this, 862569555, I);
                return j2;
            } catch (RuntimeException e) {
                m17350C(e);
                AnonymousClass0cQ.H(this, 1349660931, I);
                return 0;
            }
        }

        public final void YSA(VideoLicenseListener videoLicenseListener) {
            int I = AnonymousClass0cQ.I(this, -183943405);
            try {
                this.f34511B.f34533V.set(videoLicenseListener);
            } catch (RuntimeException e) {
                m17350C(e);
            }
            AnonymousClass0cQ.H(this, 503014100, I);
        }

        public final void Zd(boolean z) {
            int I = AnonymousClass0cQ.I(this, 1698022188);
            if (z) {
                try {
                    AnonymousClass2pR.m17344D("onAppStateChanged backgrounded", new Object[0]);
                    AnonymousClass2qS.f34816D.m17444B();
                } catch (RuntimeException e) {
                    m17350C(e);
                }
            }
            if (this.f34511B.f34522K.get() != null && ((Boolean) this.f34511B.f34522K.get()).booleanValue()) {
                if (z) {
                    HeroService heroService = this.f34511B;
                    if (heroService.f34516E) {
                        heroService.stopForeground(true);
                    }
                } else {
                    HeroService.m17351B(this.f34511B);
                }
            }
            AnonymousClass0cQ.H(this, -755237160, I);
        }

        public final void aNA(long j, String str) {
            int I = AnonymousClass0cQ.I(this, 1450918070);
            try {
                AnonymousClass2pR.m17344D("id [%d]: setCustomQuality: %s", Long.valueOf(j), str);
                AnonymousClass2pd A = this.f34511B.f34528Q.m17391A(j);
                if (A != null) {
                    AnonymousClass2rg anonymousClass2rg = A.f34563D;
                    if (anonymousClass2rg != null) {
                        anonymousClass2rg.bNA(str);
                    }
                }
            } catch (RuntimeException e) {
                m17350C(e);
            }
            AnonymousClass0cQ.H(this, 1267951867, I);
        }

        public final void bE(String str, String str2) {
            int I = AnonymousClass0cQ.I(this, 1930653205);
            try {
                this.f34511B.f34523L.aE(str, Uri.parse(str2));
            } catch (RuntimeException e) {
                m17350C(e);
            }
            AnonymousClass0cQ.H(this, -459962271, I);
        }

        public final void bHA(VideoPrefetchRequest videoPrefetchRequest) {
            int I = AnonymousClass0cQ.I(this, -1596977423);
            try {
                HeroService heroService = r0.f34511B;
                r5 = new Object[2];
                VideoPrefetchRequest videoPrefetchRequest2 = videoPrefetchRequest;
                r5[0] = videoPrefetchRequest2.f14725N;
                r5[1] = Integer.valueOf(videoPrefetchRequest2.f14718G);
                AnonymousClass2pR.m17344D("Prefetch %s\n\tBytes: %d", r5);
                VideoSource videoSource = videoPrefetchRequest2.f14725N;
                switch (AnonymousClass2pW.f34512B[videoSource.f14751P.ordinal()]) {
                    case 1:
                        AnonymousClass3tO anonymousClass3tO = heroService.f34524M;
                        AnonymousClass3sS anonymousClass3sS = anonymousClass3tO.f46056H;
                        String str = videoSource.f14745J;
                        AnonymousClass3tL anonymousClass3tL = anonymousClass3tO.f46057I;
                        String str2 = videoSource.f14750O;
                        AnonymousClass3uD anonymousClass3uD = new AnonymousClass3uD(anonymousClass3tO.f46055G.IC, anonymousClass3tO.f46055G.gB, anonymousClass3tO.f46055G.hB);
                        Uri uri = videoSource.f14749N;
                        String str3 = videoSource.f14744I;
                        boolean z = videoPrefetchRequest2.f14725N.f14741F;
                        boolean z2 = videoPrefetchRequest2.f14725N.f14742G;
                        try {
                            boolean z3 = z;
                            AnonymousClass3sS.m21077D(anonymousClass3sS, str, anonymousClass3tL, str2, AnonymousClass2ke.m17028D(anonymousClass3uD, uri, str3), z3, z2, videoPrefetchRequest2.f14718G, anonymousClass3sS.f45768C, -1, -1, false, videoPrefetchRequest2.f14722K, videoPrefetchRequest2.f14719H);
                            break;
                        } catch (Exception e) {
                            if (anonymousClass3tL != null) {
                                anonymousClass3tL.m21176A(AnonymousClass2l3.MANIFEST_PARSE_ERROR, new VpsManifestParseErrorEvent(str3, e));
                                break;
                            }
                        }
                        break;
                    case 2:
                        heroService.f34529R.m21088C(null, null, heroService.f34531T, 0, videoPrefetchRequest2, videoSource.f14750O, null, false, AnonymousClass2ki.HIGH);
                        break;
                    case 3:
                        int i;
                        if (!(videoSource.f14739D || videoSource.f14740E)) {
                            if (!videoPrefetchRequest2.f14717F) {
                                i = ((DynamicPlayerSettings) heroService.f34519H.get()).f15870I;
                                heroService.f34523L.dHA(HeroService.m17352C(heroService), videoPrefetchRequest2, i, ((DynamicPlayerSettings) heroService.f34519H.get()).f15864C, heroService.f34529R);
                                break;
                            }
                        }
                        i = 0;
                        heroService.f34523L.dHA(HeroService.m17352C(heroService), videoPrefetchRequest2, i, ((DynamicPlayerSettings) heroService.f34519H.get()).f15864C, heroService.f34529R);
                    default:
                        throw new IllegalArgumentException("Illegal video type");
                }
            } catch (RuntimeException e2) {
                m17350C(e2);
            }
            AnonymousClass0cQ.H(r0, -121199, I);
        }

        public final void fE() {
            int I = AnonymousClass0cQ.I(this, -558902699);
            try {
                AnonymousClass2pR.m17344D("clearWarmUpPool", new Object[0]);
                this.f34511B.f34528Q.f34617C.evictAll();
            } catch (RuntimeException e) {
                m17350C(e);
            }
            AnonymousClass0cQ.H(this, 740245900, I);
        }

        public final void hNA(long j, DeviceOrientationFrame deviceOrientationFrame) {
            int I = AnonymousClass0cQ.I(this, 1161395804);
            try {
                AnonymousClass2pR.m17344D("id [%d]: setDeviceOrientationFrame", Long.valueOf(j));
                AnonymousClass2pd A = this.f34511B.f34528Q.m17391A(j);
                if (A != null) {
                    AnonymousClass2pd.m17367P(A, A.f34571L.obtainMessage(13, deviceOrientationFrame));
                }
            } catch (RuntimeException e) {
                m17350C(e);
            }
            AnonymousClass0cQ.H(this, -171865838, I);
        }

        public final void iRA(long j, SpatialAudioFocusParams spatialAudioFocusParams) {
            int I = AnonymousClass0cQ.I(this, 158036103);
            try {
                AnonymousClass2pR.m17344D("id [%d]: setSpatialAudioFocus", Long.valueOf(j));
                AnonymousClass2pd A = this.f34511B.f34528Q.m17391A(j);
                if (A != null) {
                    AnonymousClass2pd.m17367P(A, A.f34571L.obtainMessage(14, spatialAudioFocusParams));
                }
            } catch (RuntimeException e) {
                m17350C(e);
            }
            AnonymousClass0cQ.H(this, 604495571, I);
        }

        public final long jWA(long j, VideoPlayRequest videoPlayRequest, HeroServicePlayerListener heroServicePlayerListener) {
            int I = AnonymousClass0cQ.I(this, 266393934);
            if (!(this.f34511B.f34522K.get() == null || !((Boolean) this.f34511B.f34522K.get()).booleanValue() || this.f34511B.f34513B)) {
                HeroService.m17351B(this.f34511B);
            }
            this.f34511B.f34513B = true;
            try {
                long D = this.f34511B.f34528Q.m17394D(j, videoPlayRequest, heroServicePlayerListener, this.f34511B, HeroService.m17352C(this.f34511B), this.f34511B.f34526O, (AnonymousClass2pS) this.f34511B.f34527P.get(), this.f34511B.f34517F, this.f34511B.f34521J);
                AnonymousClass0cQ.H(this, -1585699058, I);
                return D;
            } catch (RuntimeException e) {
                m17350C(e);
                AnonymousClass0cQ.H(this, 1744093827, I);
                return 0;
            }
        }

        public final void lQA(String str) {
            int I = AnonymousClass0cQ.I(this, -825488300);
            try {
                AnonymousClass2pR.m17344D("setProxyAddress", new Object[0]);
                AnonymousClass2pj.m17396B(str, this.f34511B.f34525N, this.f34511B.f34519H);
            } catch (RuntimeException e) {
                m17350C(e);
            }
            AnonymousClass0cQ.H(this, 1743863555, I);
        }

        public final void mNA(DynamicPlayerSettings dynamicPlayerSettings) {
            int I = AnonymousClass0cQ.I(this, -975762465);
            try {
                this.f34511B.f34519H.set(dynamicPlayerSettings);
                AnonymousClass2pi anonymousClass2pi = this.f34511B.f34528Q;
                for (AnonymousClass2pd B : anonymousClass2pi.f34616B.snapshot().values()) {
                    B.m17380B();
                }
                for (AnonymousClass2pd B2 : anonymousClass2pi.f34617C.snapshot().values()) {
                    B2.m17380B();
                }
            } catch (RuntimeException e) {
                m17350C(e);
            }
            AnonymousClass0cQ.H(this, 102220997, I);
        }

        public final boolean oHA(long j, VideoPlayRequest videoPlayRequest) {
            int I = AnonymousClass0cQ.I(this, -1153979128);
            try {
                AnonymousClass2pR.m17344D("id [%d]: prepare, %s", Long.valueOf(j), videoPlayRequest.f15797M);
                AnonymousClass2pd A = this.f34511B.f34528Q.m17391A(j);
                if (A == null) {
                    AnonymousClass0cQ.H(this, 1428392691, I);
                    return false;
                }
                A.m17383E(this.f34511B.f34530S, videoPlayRequest, (DynamicPlayerSettings) this.f34511B.f34519H.get());
                AnonymousClass0cQ.H(this, 1150472105, I);
                return true;
            } catch (RuntimeException e) {
                m17350C(e);
                AnonymousClass0cQ.H(this, -2012641669, I);
                return false;
            }
        }

        public final void ob() {
            int I = AnonymousClass0cQ.I(this, -443314360);
            try {
                AnonymousClass2pR.m17344D("maybeInitCache due to app idle", new Object[0]);
                this.f34511B.f34517F.m17322B();
            } catch (RuntimeException e) {
                m17350C(e);
            }
            AnonymousClass0cQ.H(this, -1913207851, I);
        }

        public final boolean pHA(long j, VideoPlayRequest videoPlayRequest, boolean z, float f, boolean z2) {
            int I = AnonymousClass0cQ.I(this, -539708372);
            try {
                AnonymousClass2pR.m17344D("id [%d]: prepareAndMayPlay, shouldPlay=%b, videoSource=%s", Long.valueOf(j), Boolean.valueOf(z), videoPlayRequest.f15797M);
                AnonymousClass2pd A = this.f34511B.f34528Q.m17391A(j);
                if (A == null) {
                    AnonymousClass0cQ.H(this, -2048300066, I);
                    return false;
                }
                AnonymousClass2pk anonymousClass2pk = this.f34511B.f34530S;
                DynamicPlayerSettings dynamicPlayerSettings = (DynamicPlayerSettings) this.f34511B.f34519H.get();
                A.m17387I(f);
                A.m17383E(anonymousClass2pk, videoPlayRequest, dynamicPlayerSettings);
                A.m17385G(z2);
                if (z) {
                    A.m17382D();
                } else {
                    A.m17381C(false);
                }
                AnonymousClass0cQ.H(this, 838537632, I);
                return true;
            } catch (RuntimeException e) {
                m17350C(e);
                AnonymousClass0cQ.H(this, 321232049, I);
                return false;
            }
        }

        public final boolean pSA(long j, float f) {
            int I = AnonymousClass0cQ.I(this, -1997314862);
            try {
                AnonymousClass2pR.m17344D("id [%d]: setVolume %f", Long.valueOf(j), Float.valueOf(f));
                AnonymousClass2pd A = this.f34511B.f34528Q.m17391A(j);
                if (A == null) {
                    AnonymousClass0cQ.H(this, 808052609, I);
                    return false;
                }
                A.m17387I(f);
                AnonymousClass0cQ.H(this, 1562638278, I);
                return true;
            } catch (RuntimeException e) {
                m17350C(e);
                AnonymousClass0cQ.H(this, -1738601294, I);
                return false;
            }
        }

        public final boolean rW(VideoPrefetchRequest videoPrefetchRequest) {
            int I = AnonymousClass0cQ.I(this, -1812958461);
            try {
                if (this.f34511B.f34517F != null) {
                    boolean G = this.f34511B.f34517F.m17327G(videoPrefetchRequest);
                    AnonymousClass0cQ.H(this, -1068928997, I);
                    return G;
                }
                AnonymousClass0cQ.H(this, -230001130, I);
                return false;
            } catch (RuntimeException e) {
                m17350C(e);
                AnonymousClass0cQ.H(this, 290832664, I);
                return false;
            }
        }

        public final boolean tRA(long j, Surface surface, int i, int i2) {
            int I = AnonymousClass0cQ.I(this, -393536539);
            try {
                AnonymousClass2pR.m17344D("id [%d]: setSurface: %s", Long.valueOf(j), surface);
                AnonymousClass2pd A = this.f34511B.f34528Q.m17391A(j);
                if (A == null) {
                    AnonymousClass0cQ.H(this, 1825296148, I);
                    return false;
                }
                A.m17386H(surface, i, i2);
                AnonymousClass0cQ.H(this, 583882551, I);
                return true;
            } catch (RuntimeException e) {
                m17350C(e);
                AnonymousClass0cQ.H(this, -360995394, I);
                return false;
            }
        }

        public final boolean uRA(long j, int i, int i2) {
            int I = AnonymousClass0cQ.I(this, 1855652660);
            try {
                AnonymousClass2pR.m17344D("id [%d]: setSurfaceSize: %dx%d", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2));
                AnonymousClass2pd A = this.f34511B.f34528Q.m17391A(j);
                if (A == null) {
                    AnonymousClass0cQ.H(this, -1555334777, I);
                    return false;
                }
                AnonymousClass2pd.m17371T(A, "Set surface size: %dx%d", Integer.valueOf(i), Integer.valueOf(i2));
                AnonymousClass2pd.m17367P(A, A.f34571L.obtainMessage(21, i, i2));
                AnonymousClass0cQ.H(this, 1486930072, I);
                return true;
            } catch (RuntimeException e) {
                m17350C(e);
                AnonymousClass0cQ.H(this, -1614924459, I);
                return false;
            }
        }

        public final boolean xLA(long j, long j2, long j3) {
            int I = AnonymousClass0cQ.I(this, -846835192);
            try {
                AnonymousClass2pR.m17344D("id [%d]: seekTo %d", Long.valueOf(j), Long.valueOf(j2));
                AnonymousClass2pd A = this.f34511B.f34528Q.m17391A(j);
                if (A == null) {
                    AnonymousClass0cQ.H(this, -1958236708, I);
                    return false;
                }
                AnonymousClass2pd.m17371T(A, "Seek to %d", Long.valueOf(j2));
                AnonymousClass2pd.m17367P(A, A.f34571L.obtainMessage(4, new long[]{j2, j3}));
                AnonymousClass0cQ.H(this, 1598374246, I);
                return true;
            } catch (RuntimeException e) {
                m17350C(e);
                AnonymousClass0cQ.H(this, 1631066507, I);
                return false;
            }
        }

        public final void zWA(VideoPlayRequest videoPlayRequest, Surface surface, int i, int i2, float f) {
            int I = AnonymousClass0cQ.I(this, 168655871);
            try {
                Object[] objArr = new Object[1];
                VideoPlayRequest videoPlayRequest2 = videoPlayRequest;
                objArr[0] = videoPlayRequest.f15797M;
                AnonymousClass2pR.m17344D("warmUpPlayer, %s", objArr);
                AnonymousClass2td.m17605D(videoPlayRequest.f15797M.f14750O);
                AnonymousClass2pd E = this.f34511B.f34528Q.m17395E(videoPlayRequest.f15797M.f14750O, this.f34511B, HeroService.m17352C(this.f34511B), this.f34511B.f34526O, (AnonymousClass2pS) this.f34511B.f34527P.get(), this.f34511B.f34517F, this.f34511B.f34521J, videoPlayRequest2);
                if (E != null) {
                    AnonymousClass2pR.m17344D("warm up a new player", new Object[0]);
                    E.m17387I(f);
                    E.m17383E(this.f34511B.f34530S, videoPlayRequest, (DynamicPlayerSettings) this.f34511B.f34519H.get());
                    Surface surface2 = surface;
                    if (surface != null) {
                        E.m17386H(surface2, i, i2);
                    }
                }
            } catch (RuntimeException e) {
                m17350C(e);
            }
            AnonymousClass0cQ.H(this, -2068852321, I);
        }
    }

    public HeroService() {
        boolean z = false;
        this.f34513B = false;
        if (VERSION.SDK_INT < 28) {
            z = true;
        }
        this.f34516E = z;
        this.f34522K = new AtomicReference(null);
        this.f34536Y = new C01206(this);
    }

    /* renamed from: B */
    public static void m17351B(HeroService heroService) {
        if (heroService.f34516E) {
            heroService.startForeground(heroService.f34525N.CB, new Notification());
        }
    }

    /* renamed from: C */
    public static Handler m17352C(HeroService heroService) {
        if (heroService.f34534W == null) {
            synchronized (heroService.f34535X) {
                if (heroService.f34534W == null) {
                    if (heroService.f34515D == null) {
                        heroService.f34515D = new HandlerThread("HeroPlayerServiceBackgroundHandlerThread", 10);
                        heroService.f34515D.start();
                    }
                    heroService.f34534W = new Handler(heroService.f34515D.getLooper());
                }
            }
        }
        return heroService.f34534W;
    }

    public final android.os.IBinder onBind(android.content.Intent r32) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r31 = this;
        r0 = "ExperimentationSetting";
        r1 = r32;
        r5 = r1.getSerializableExtra(r0);
        r5 = (java.util.HashMap) r5;
        r0 = "HeroPlayerSetting";
        r4 = r1.getSerializableExtra(r0);
        r4 = (X.AnonymousClass1Gy) r4;
        r0 = X.AnonymousClass1H0.f16623C;	 Catch:{ BadParcelableException -> 0x001b }
        r7 = r1.getParcelableExtra(r0);	 Catch:{ BadParcelableException -> 0x001b }
        r7 = (android.os.ResultReceiver) r7;	 Catch:{ BadParcelableException -> 0x001b }
        goto L_0x0028;	 Catch:{ BadParcelableException -> 0x001b }
    L_0x001b:
        r3 = move-exception;
        r2 = "Failed to get ResultReceiver parcelable: %s";
        r0 = 1;
        r1 = new java.lang.Object[r0];
        r0 = 0;
        r1[r0] = r3;
        X.AnonymousClass2pR.m17346F(r2, r1);
        r7 = 0;
    L_0x0028:
        r0 = r31;
        if (r5 == 0) goto L_0x0031;
    L_0x002c:
        r1 = r0.f34521J;
        r1.putAll(r5);
    L_0x0031:
        r2 = 0;
        if (r4 != 0) goto L_0x003b;
    L_0x0034:
        r3 = "heroPlayerSetting is null. fallback to default HeroPlayerSetting";
        r1 = new java.lang.Object[r2];
        X.AnonymousClass2pR.m17346F(r3, r1);
    L_0x003b:
        if (r4 == 0) goto L_0x003e;
    L_0x003d:
        goto L_0x0040;
    L_0x003e:
        r4 = X.AnonymousClass1Gy.cC;
    L_0x0040:
        r0.f34525N = r4;
        r4 = r0.f34522K;
        r1 = r0.f34525N;
        r1 = r1.DB;
        r3 = java.lang.Boolean.valueOf(r1);
        r1 = 0;
        r4.compareAndSet(r1, r3);
        r3 = r0.f34525N;
        r3 = r3.f16620y;
        X.AnonymousClass2se.f35288B = r3;
        r8 = new X.2pi;
        r6 = r0.f34525N;
        r5 = r0.f34519H;
        r4 = r0.f34527P;
        r3 = r0.f34532U;
        r8.<init>(r6, r5, r4, r3);
        r0.f34528Q = r8;
        r3 = r0.f34525N;
        r3 = r3.f16597b;
        X.AnonymousClass1Gl.f16382C = r3;
        r6 = r0.f34527P;
        r5 = new X.2pS;
        r4 = r0.f34525N;
        r3 = r0.f34532U;
        r5.<init>(r4, r3);
        r6.set(r5);
        r4 = r0.f34526O;
        r3 = new X.2pX;
        r3.<init>(r7);
        r4.set(r3);
        r4 = "Experimentation Settings:";
        r3 = new java.lang.Object[r2];
        X.AnonymousClass2pR.m17344D(r4, r3);
        r3 = r0.f34521J;
        r3 = r3.entrySet();
        r8 = r3.iterator();
    L_0x0094:
        r3 = r8.hasNext();
        r6 = 1;
        if (r3 == 0) goto L_0x00b6;
    L_0x009b:
        r7 = r8.next();
        r7 = (java.util.Map.Entry) r7;
        r5 = "\tkey: %s, value: %s";
        r3 = 2;
        r4 = new java.lang.Object[r3];
        r3 = r7.getKey();
        r4[r2] = r3;
        r3 = r7.getValue();
        r4[r6] = r3;
        X.AnonymousClass2pR.m17344D(r5, r4);
        goto L_0x0094;
    L_0x00b6:
        r4 = new X.2kY;
        r3 = r0.getApplicationContext();
        r4.<init>(r3);
        r0.f34518G = r4;
        r5 = m17352C(r0);
        r4 = new X.2pT;
        r4.<init>(r0);
        r3 = 837386258; // 0x31e98012 float:6.7957524E-9 double:4.137237824E-315;
        X.AnonymousClass0OR.D(r5, r4, r3);
        r3 = r0.f34525N;
        r3 = r3.f16600e;
        if (r3 == 0) goto L_0x00ee;
    L_0x00d6:
        r5 = "LocalSocketProxy is enabled, address: %s";
        r4 = new java.lang.Object[r6];
        r3 = r0.f34525N;
        r3 = r3.PB;
        r4[r2] = r3;
        X.AnonymousClass2pR.m17344D(r5, r4);
        r3 = r0.f34525N;
        r5 = r3.PB;
        r4 = r0.f34525N;
        r3 = r0.f34519H;
        X.AnonymousClass2pj.m17396B(r5, r4, r3);
    L_0x00ee:
        r3 = r0.f34517F;
        if (r3 != 0) goto L_0x027e;
    L_0x00f2:
        r3 = r0.f34525N;
        r3 = r3.f16578I;
        r14 = new X.2p5;
        r4 = r3.f16456C;
        if (r4 != 0) goto L_0x0105;
    L_0x00fc:
        r4 = r0.getFilesDir();
        r13 = r4.toString();
        goto L_0x0107;
    L_0x0105:
        r13 = r3.f16456C;
    L_0x0107:
        r4 = r3.f16464K;
        r32 = r4;
        r4 = r3.f16455B;
        r31 = r4;
        r4 = r3.f16457D;
        r17 = r4;
        r4 = r3.f16462I;
        r16 = r4;
        r15 = r3.f16467N;
        r12 = r3.f16461H;
        r11 = r3.f16463J;
        r10 = r3.f16465L;
        r9 = r3.f16458E;
        r8 = r3.f16468O;
        r7 = r3.f16466M;
        r6 = r3.f16470Q;
        r5 = r3.f16459F;
        r4 = r3.f16460G;
        r3 = r3.f16469P;
        r26 = r7;
        r27 = r6;
        r28 = r5;
        r29 = r4;
        r30 = r3;
        r22 = r11;
        r23 = r10;
        r24 = r9;
        r25 = r8;
        r18 = r17;
        r19 = r16;
        r20 = r15;
        r21 = r12;
        r15 = r13;
        r16 = r32;
        r17 = r31;
        r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30);
        r0.f34520I = r14;
        r4 = new X.2p3;
        r6 = r0.f34520I;
        r7 = r0.f34521J;
        r8 = r0.f34525N;
        r3 = r0.f34527P;
        r9 = r3.get();
        r9 = (X.AnonymousClass2pS) r9;
        r10 = new X.3tC;
        r10.<init>(r0);
        r5 = r0;
        r4.<init>(r5, r6, r7, r8, r9, r10);
        r0.f34517F = r4;
        r4 = new X.3sS;
        r5 = r0.f34519H;
        r6 = r0.f34517F;
        r7 = r0.f34518G;
        r8 = r0.f34521J;
        r9 = r0.f34525N;
        r10 = r0.f34514C;
        r11 = r0.f34532U;
        r3 = r0.f34525N;
        r3 = r3.f16610o;
        if (r3 == 0) goto L_0x0187;
    L_0x0182:
        r1 = new X.3tD;
        r1.<init>(r0);
    L_0x0187:
        r13 = r0;
        r12 = r1;
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13);
        r0.f34529R = r4;
        r3 = new X.3tO;
        r4 = r0.f34526O;
        r5 = r0.f34533V;
        r6 = r0.f34521J;
        r7 = r0.f34525N;
        r8 = r0.f34517F;
        r9 = r0.f34518G;
        r10 = r0.f34529R;
        r11 = r0.f34514C;
        r12 = r0.f34532U;
        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
        r0.f34524M = r3;
        r1 = "com.facebook.video.heroplayer.service.live.impl.HeroDashLiveManagerImpl";	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r4 = java.lang.Class.forName(r1);	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r11 = 8;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r3 = new java.lang.Class[r11];	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r1 = android.content.Context.class;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r13 = 0;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r3[r13] = r1;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r1 = java.util.Map.class;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r12 = 1;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r3[r12] = r1;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r1 = X.AnonymousClass1Gy.class;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r10 = 2;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r3[r10] = r1;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r1 = X.AnonymousClass3sL.class;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r9 = 3;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r3[r9] = r1;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r1 = X.AnonymousClass3ti.class;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r8 = 4;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r3[r8] = r1;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r1 = java.util.concurrent.atomic.AtomicReference.class;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r7 = 5;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r3[r7] = r1;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r6 = 6;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r3[r6] = r1;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r1 = X.AnonymousClass2kY.class;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r5 = 7;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r3[r5] = r1;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r4 = r4.getConstructor(r3);	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r3 = new java.lang.Object[r11];	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r3[r13] = r0;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r1 = r0.f34521J;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r3[r12] = r1;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r1 = r0.f34525N;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r3[r10] = r1;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r1 = r0.f34514C;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r3[r9] = r1;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r1 = r0.f34532U;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r3[r8] = r1;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r1 = r0.f34526O;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r3[r7] = r1;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r1 = r0.f34533V;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r3[r6] = r1;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r1 = r0.f34518G;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r3[r5] = r1;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r1 = r4.newInstance(r3);	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r1 = (X.AnonymousClass2px) r1;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        r0.f34523L = r1;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
        goto L_0x0225;	 Catch:{ NoSuchMethodException -> 0x020f, Exception -> 0x0204 }
    L_0x0204:
        r4 = move-exception;
        r3 = "HeroService instantiate live threw exception";
        r2 = new java.lang.Object[r2];
        r1 = X.AnonymousClass2pR.f34500B;
        X.AnonymousClass1Gl.F(r1, r4, r3, r2);
        goto L_0x0225;
    L_0x020f:
        r1 = new X.3ta;
        r3 = r0.f34521J;
        r4 = r0.f34525N;
        r5 = r0.f34514C;
        r6 = r0.f34532U;
        r7 = r0.f34526O;
        r8 = r0.f34533V;
        r9 = r0.f34518G;
        r2 = r0;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);
        r0.f34523L = r1;
    L_0x0225:
        r9 = new X.2pk;
        r8 = r0.f34526O;
        r7 = r0.f34521J;
        r6 = r0.f34525N;
        r1 = r0.f34527P;
        r5 = r1.get();
        r5 = (X.AnonymousClass2pS) r5;
        r4 = r0.f34517F;
        r16 = m17352C(r0);
        r3 = r0.f34523L;
        r2 = r0.f34524M;
        r1 = r0.f34518G;
        r10 = r0;
        r11 = r8;
        r12 = r7;
        r13 = r6;
        r14 = r5;
        r15 = r4;
        r17 = r3;
        r18 = r2;
        r19 = r1;
        r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        r0.f34530S = r9;
        r1 = r0.f34525N;
        r1 = r1.f16617v;
        if (r1 != 0) goto L_0x0260;
    L_0x0258:
        r1 = r0.f34521J;
        r1 = X.AnonymousClass1Gk.u(r1);
        if (r1 == 0) goto L_0x027e;
    L_0x0260:
        r2 = new android.os.HandlerThread;
        r1 = "HeroWarmupThread";
        r2.<init>(r1);
        r2.start();
        r1 = r2.getLooper();
        r3 = new android.os.Handler;
        r3.<init>(r1);
        r2 = new X.2pU;
        r2.<init>(r0, r1);
        r1 = 834802648; // 0x31c213d8 float:5.648399E-9 double:4.124473094E-315;
        X.AnonymousClass0OR.D(r3, r2, r1);
    L_0x027e:
        r0 = r0.f34536Y;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.heroplayer.service.HeroService.onBind(android.content.Intent):android.os.IBinder");
    }

    public final void onCreate() {
        int J = AnonymousClass0cQ.J(this, -1597937731);
        super.onCreate();
        AnonymousClass2pR.m17344D("HeroService creating", new Object[0]);
        if (BreakpadManager.isActive()) {
            long minidumpFlags = BreakpadManager.getMinidumpFlags();
            if ((minidumpFlags & 8) == 0) {
                BreakpadManager.setMinidumpFlags(minidumpFlags | 8);
            }
        }
        AnonymousClass0cQ.K(this, -992673908, J);
    }

    public final void onDestroy() {
        int J = AnonymousClass0cQ.J(this, 765784710);
        super.onDestroy();
        AnonymousClass2pR.m17344D("HeroService destroy", new Object[0]);
        AnonymousClass0OR.D(m17352C(this), new AnonymousClass2pV(this, this.f34528Q), 964957385);
        if (this.f34525N.LB) {
            Process.killProcess(Process.myPid());
        }
        AnonymousClass0cQ.K(this, -279322306, J);
    }

    public final boolean onUnbind(Intent intent) {
        AnonymousClass2pR.m17344D("HeroService unbind", new Object[0]);
        return super.onUnbind(intent);
    }
}
