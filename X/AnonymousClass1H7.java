package X;

import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi;
import com.facebook.video.heroplayer.ipc.ServicePlayerState;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;

/* renamed from: X.1H7 */
public final class AnonymousClass1H7 {
    /* renamed from: B */
    public long f16669B;
    /* renamed from: C */
    public boolean f16670C;
    /* renamed from: D */
    public Surface f16671D;
    /* renamed from: E */
    public VideoPlayRequest f16672E;
    /* renamed from: F */
    public long f16673F;
    /* renamed from: G */
    public int f16674G;
    /* renamed from: H */
    public int f16675H;
    /* renamed from: I */
    public HeroPlayerServiceApi f16676I;
    /* renamed from: J */
    public boolean f16677J;
    /* renamed from: K */
    public volatile Surface f16678K;
    /* renamed from: L */
    public int f16679L;
    /* renamed from: M */
    public int f16680M;
    /* renamed from: N */
    public final /* synthetic */ AnonymousClass1H4 f16681N;

    public AnonymousClass1H7(AnonymousClass1H4 anonymousClass1H4) {
        this.f16681N = anonymousClass1H4;
    }

    /* renamed from: B */
    public static void m10597B(AnonymousClass1H7 anonymousClass1H7) {
        long[] jArr = anonymousClass1H7.f16681N.f16655I;
        anonymousClass1H7.f16681N.f16655I[1] = 0;
        jArr[0] = 0;
    }

    /* renamed from: C */
    public static void m10598C(AnonymousClass1H7 anonymousClass1H7) {
        HeroPlayerServiceApi heroPlayerServiceApi = AnonymousClass17X.f14756W.f14765J;
        anonymousClass1H7.f16676I = heroPlayerServiceApi;
        if (heroPlayerServiceApi != null) {
            try {
                anonymousClass1H7.f16681N.f16654H = heroPlayerServiceApi.jWA(anonymousClass1H7.f16681N.f16654H, anonymousClass1H7.f16672E, anonymousClass1H7.f16681N.f16660N);
                AnonymousClass1H7.m10608M(anonymousClass1H7);
                if (anonymousClass1H7.f16678K != null && (!(anonymousClass1H7.f16678K == anonymousClass1H7.f16671D && anonymousClass1H7.f16681N.f16651E.GC) && anonymousClass1H7.f16676I.tRA(anonymousClass1H7.f16681N.f16654H, anonymousClass1H7.f16678K, anonymousClass1H7.f16680M, anonymousClass1H7.f16679L))) {
                    anonymousClass1H7.f16671D = anonymousClass1H7.f16678K;
                }
                VideoPlayRequest videoPlayRequest = anonymousClass1H7.f16672E;
                if (videoPlayRequest != null) {
                    if (anonymousClass1H7.f16669B > 0) {
                        if (videoPlayRequest.f15797M.m9474A()) {
                            anonymousClass1H7.f16676I.ARA(anonymousClass1H7.f16681N.f16654H, anonymousClass1H7.f16673F);
                        } else {
                            long incrementAndGet = AnonymousClass1H4.f16646U.incrementAndGet();
                            if (anonymousClass1H7.f16676I.xLA(anonymousClass1H7.f16681N.f16654H, anonymousClass1H7.f16669B, incrementAndGet)) {
                                anonymousClass1H7.f16681N.f16657K = anonymousClass1H7.f16669B;
                                anonymousClass1H7.f16681N.f16658L = incrementAndGet;
                                anonymousClass1H7.f16681N.f16659M = SystemClock.elapsedRealtime();
                            } else {
                                anonymousClass1H7.f16681N.f16658L = 0;
                            }
                        }
                        anonymousClass1H7.f16669B = 0;
                        anonymousClass1H7.f16673F = 0;
                    } else {
                        if (anonymousClass1H7.f16675H > 0) {
                            long incrementAndGet2 = AnonymousClass1H4.f16646U.incrementAndGet();
                            if (anonymousClass1H7.f16676I.xLA(anonymousClass1H7.f16681N.f16654H, (long) anonymousClass1H7.f16675H, incrementAndGet2)) {
                                anonymousClass1H7.f16681N.f16657K = (long) anonymousClass1H7.f16675H;
                                anonymousClass1H7.f16681N.f16658L = incrementAndGet2;
                                anonymousClass1H7.f16681N.f16659M = SystemClock.elapsedRealtime();
                            } else {
                                anonymousClass1H7.f16681N.f16658L = 0;
                            }
                        }
                        if (anonymousClass1H7.f16674G > 0) {
                            anonymousClass1H7.f16676I.ARA(anonymousClass1H7.f16681N.f16654H, (long) anonymousClass1H7.f16674G);
                        }
                    }
                    anonymousClass1H7.f16676I.pHA(anonymousClass1H7.f16681N.f16654H, anonymousClass1H7.f16672E, anonymousClass1H7.f16677J, anonymousClass1H7.f16681N.f16663Q, anonymousClass1H7.f16681N.f16653G);
                }
                anonymousClass1H7.f16670C = false;
                return;
            } catch (Throwable e) {
                AnonymousClass1H4 anonymousClass1H4 = anonymousClass1H7.f16681N;
                String str = "Error occurs while creating player";
                AnonymousClass1H4.m10584E(anonymousClass1H4, e, str, new Object[0]);
                anonymousClass1H4.f16652F.ot("PLAYERSERVICE_DEAD", str);
                anonymousClass1H7.f16681N.f16654H = 0;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed ensure service player, ");
                stringBuilder.append(e.getMessage());
                throw new RemoteException(stringBuilder.toString());
            }
        }
        throw new RemoteException("Failed ensure service player, service not connected");
    }

    /* renamed from: D */
    public static HeroPlayerServiceApi m10599D(AnonymousClass1H7 anonymousClass1H7) {
        HeroPlayerServiceApi heroPlayerServiceApi = anonymousClass1H7.f16676I;
        if (heroPlayerServiceApi != null) {
            return heroPlayerServiceApi;
        }
        throw new RemoteException("No service api available");
    }

    /* renamed from: E */
    public static void m10600E(AnonymousClass1H7 anonymousClass1H7, String str, String str2) {
        VideoPlayRequest videoPlayRequest = anonymousClass1H7.f16672E;
        if (videoPlayRequest == null || !videoPlayRequest.f15797M.m9474A()) {
            anonymousClass1H7.f16681N.f16652F.ot(str, str2);
            return;
        }
        AnonymousClass1H4.m10583D(anonymousClass1H7.f16681N, "force live video to complete upon 410 dismiss error", new Object[0]);
        if (anonymousClass1H7.f16677J) {
            Pair D = anonymousClass1H7.f16681N.m10592D();
            ServicePlayerState servicePlayerState = (ServicePlayerState) anonymousClass1H7.f16681N.f16661O.get();
            if (servicePlayerState.f16688G) {
                anonymousClass1H7.f16681N.f16652F.aFA(servicePlayerState.m10610A(), ((Long) D.first).longValue(), ((Integer) ((Pair) D.second).first).intValue(), ((Long) ((Pair) D.second).second).longValue(), AnonymousClass1eC.DASH_LIVE);
            } else {
                anonymousClass1H7.f16681N.f16652F.LGA(0, AnonymousClass1eC.DASH_LIVE, 0, false);
                anonymousClass1H7.f16681N.f16652F.aFA(0, ((Long) D.first).longValue(), ((Integer) ((Pair) D.second).first).intValue(), ((Long) ((Pair) D.second).second).longValue(), AnonymousClass1eC.DASH_LIVE);
            }
        }
    }

    /* renamed from: F */
    public static void m10601F(AnonymousClass1H7 anonymousClass1H7, boolean z) {
        anonymousClass1H7.f16681N.f16658L = 0;
        AnonymousClass1H7.m10597B(anonymousClass1H7);
        if (anonymousClass1H7.f16681N.m10593E()) {
            anonymousClass1H7.f16681N.f16654H = 0;
            if (z) {
                ServicePlayerState servicePlayerState = (ServicePlayerState) anonymousClass1H7.f16681N.f16661O.get();
            }
        }
    }

    /* renamed from: G */
    public static void m10602G(AnonymousClass1H7 anonymousClass1H7, VideoPlayRequest videoPlayRequest) {
        AnonymousClass1H4.m10583D(anonymousClass1H7.f16681N, "prepareInternal, playRequest: %s, url: %s", videoPlayRequest.f15797M.f14751P.toString(), videoPlayRequest.f15797M.f14749N);
        if (anonymousClass1H7.f16672E == null || !videoPlayRequest.f15797M.equals(anonymousClass1H7.f16672E.f15797M)) {
            AnonymousClass1H7.m10604I(anonymousClass1H7);
            anonymousClass1H7.f16672E = videoPlayRequest;
            anonymousClass1H7.f16670C = true;
            Object obj = (AnonymousClass17U.m9472B(anonymousClass1H7.f16672E.f15797M.f14751P) || !anonymousClass1H7.f16681N.f16651E.f16590U) ? null : 1;
            if (obj == null) {
                try {
                    AnonymousClass1H7.m10598C(anonymousClass1H7);
                } catch (Throwable e) {
                    AnonymousClass1H4.m10584E(anonymousClass1H7.f16681N, e, "Error occurs while ensureAndRecoverServicePlayer in prepare", new Object[0]);
                }
            }
            return;
        }
        AnonymousClass1H4.m10583D(anonymousClass1H7.f16681N, "prepareInternal, unchanged video source, skip preparing", new Object[0]);
    }

    /* renamed from: H */
    public static void m10603H(AnonymousClass1H7 anonymousClass1H7) {
        if (anonymousClass1H7.f16672E == null && anonymousClass1H7.f16681N.f16651E.EC) {
            AnonymousClass1H4.m10583D(anonymousClass1H7.f16681N, "Skipping reset since play request is null", new Object[0]);
            return;
        }
        try {
            if (!anonymousClass1H7.f16681N.m10593E()) {
                AnonymousClass1H4.m10583D(anonymousClass1H7.f16681N, "Before reset(), service player was evicted. Lazy recover at next play()", new Object[0]);
            } else if (!AnonymousClass1H7.m10599D(anonymousClass1H7).JLA(anonymousClass1H7.f16681N.f16654H)) {
                AnonymousClass1H4.m10583D(anonymousClass1H7.f16681N, "When reset(), service player is noticed to be evicted earlier. Lazy recover at next play()", new Object[0]);
                AnonymousClass1H7.m10601F(anonymousClass1H7, true);
            }
        } catch (Throwable e) {
            AnonymousClass1H4.m10584E(anonymousClass1H7.f16681N, e, "Error occurs while pausing the video", new Object[0]);
        } catch (Throwable th) {
            AnonymousClass1H7.m10604I(anonymousClass1H7);
        }
        AnonymousClass1H7.m10604I(anonymousClass1H7);
    }

    /* renamed from: I */
    public static void m10604I(AnonymousClass1H7 anonymousClass1H7) {
        anonymousClass1H7.f16677J = false;
        anonymousClass1H7.f16675H = 0;
        anonymousClass1H7.f16674G = 0;
        anonymousClass1H7.f16672E = null;
        anonymousClass1H7.f16669B = 0;
        anonymousClass1H7.f16673F = 0;
        anonymousClass1H7.f16681N.f16658L = 0;
        anonymousClass1H7.f16681N.f16653G = false;
        anonymousClass1H7.f16681N.f16661O.set(new ServicePlayerState());
        synchronized (anonymousClass1H7.f16681N.f16662P) {
            anonymousClass1H7.f16681N.f16662P.clear();
            anonymousClass1H7.f16681N.f16649C = -1;
        }
    }

    /* renamed from: J */
    public static long m10605J(AnonymousClass1H7 anonymousClass1H7) {
        try {
            if (anonymousClass1H7.f16681N.m10593E()) {
                return AnonymousClass1H7.m10599D(anonymousClass1H7).VLA(anonymousClass1H7.f16681N.f16654H);
            }
            AnonymousClass1H4.m10583D(anonymousClass1H7.f16681N, "Before retrieveCurrentPosition(), service player was evicted. Skip refreshing service player state", new Object[0]);
            return 0;
        } catch (Throwable e) {
            AnonymousClass1H4.m10584E(anonymousClass1H7.f16681N, e, "Error occurs while refresh service player state", new Object[0]);
            return 0;
        }
    }

    /* renamed from: K */
    public static void m10606K(AnonymousClass1H7 anonymousClass1H7, ServicePlayerState servicePlayerState) {
        synchronized (anonymousClass1H7.f16681N.f16661O) {
            if (((ServicePlayerState) anonymousClass1H7.f16681N.f16661O.get()).f16701T <= servicePlayerState.f16701T) {
                anonymousClass1H7.f16681N.f16661O.set(servicePlayerState);
            }
        }
    }

    /* renamed from: L */
    public static void m10607L(AnonymousClass1H7 anonymousClass1H7, Surface surface, int i, int i2) {
        anonymousClass1H7.f16678K = surface;
        anonymousClass1H7.f16680M = i;
        anonymousClass1H7.f16679L = i2;
        if (surface != null && surface == anonymousClass1H7.f16671D && anonymousClass1H7.f16681N.f16651E.FC) {
            AnonymousClass1H4.m10583D(anonymousClass1H7.f16681N, "surface already sent, skipping send again: %s", surface);
            return;
        }
        try {
            if (!anonymousClass1H7.f16681N.m10593E()) {
                AnonymousClass1H4.m10583D(anonymousClass1H7.f16681N, "Before setSurface(), service player was evicted. Lazy recover at next play()", new Object[0]);
            } else if (AnonymousClass1H7.m10599D(anonymousClass1H7).tRA(anonymousClass1H7.f16681N.f16654H, anonymousClass1H7.f16678K, anonymousClass1H7.f16680M, anonymousClass1H7.f16679L)) {
                anonymousClass1H7.f16671D = anonymousClass1H7.f16678K;
            } else {
                AnonymousClass1H4.m10583D(anonymousClass1H7.f16681N, "When setSurface(), service player is noticed to be evicted earlier. Lazy recover at next play()", new Object[0]);
                AnonymousClass1H7.m10601F(anonymousClass1H7, true);
            }
        } catch (Throwable e) {
            AnonymousClass1H4.m10584E(anonymousClass1H7.f16681N, e, "Error occurs while setting surface", new Object[0]);
        }
    }

    /* renamed from: M */
    public static void m10608M(AnonymousClass1H7 anonymousClass1H7) {
        anonymousClass1H7.f16681N.f16655I[1] = anonymousClass1H7.f16681N.f16655I[0];
        anonymousClass1H7.f16681N.f16655I[0] = anonymousClass1H7.f16681N.f16654H;
    }
}
