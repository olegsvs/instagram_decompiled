package com.facebook.video.heroplayer.service.heroexoplayer2;

import X.AnonymousClass17U;
import X.AnonymousClass1Cy;
import X.AnonymousClass1Gk;
import X.AnonymousClass1Gp;
import X.AnonymousClass1Gy;
import X.AnonymousClass1e7;
import X.AnonymousClass2lf;
import X.AnonymousClass2p3;
import X.AnonymousClass2pO;
import X.AnonymousClass2pP;
import X.AnonymousClass2pS;
import X.AnonymousClass2pd;
import X.AnonymousClass2pv;
import X.AnonymousClass2vw;
import X.AnonymousClass2wW;
import X.AnonymousClass2y0;
import X.AnonymousClass2y7;
import X.AnonymousClass2yO;
import X.AnonymousClass2yP;
import X.AnonymousClass2yi;
import X.AnonymousClass3tS;
import X.AnonymousClass3tU;
import X.AnonymousClass3tW;
import X.AnonymousClass3tX;
import X.AnonymousClass3tY;
import X.AnonymousClass3tZ;
import X.AnonymousClass3ti;
import X.AnonymousClass3ty;
import X.AnonymousClass3uy;
import X.AnonymousClass3uz;
import X.AnonymousClass43v;
import X.AnonymousClass441;
import X.AnonymousClass44G;
import X.AnonymousClass45S;
import X.AnonymousClass45w;
import X.AnonymousClass45z;
import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;
import com.facebook.video.heroplayer.ipc.VideoSource;
import com.facebook.video.heroplayer.service.HeroService;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class HeroExoPlayer2 implements AnonymousClass2pP {
    /* renamed from: B */
    public final List f46077B = new CopyOnWriteArrayList();
    /* renamed from: C */
    private AnonymousClass3tU f46078C;
    /* renamed from: D */
    private AnonymousClass3uy f46079D;
    /* renamed from: E */
    private AnonymousClass2pv f46080E;
    /* renamed from: F */
    private final AnonymousClass3tZ f46081F;
    /* renamed from: G */
    private AnonymousClass2wW f46082G;
    /* renamed from: H */
    private AnonymousClass3uz[] f46083H;
    /* renamed from: I */
    private AnonymousClass2y7 f46084I;

    /* renamed from: B */
    public static int m21178B(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            default:
                return -1;
        }
    }

    public HeroExoPlayer2(AnonymousClass2pd anonymousClass2pd, AnonymousClass1Gy anonymousClass1Gy, AnonymousClass1Gp anonymousClass1Gp, Context context, Handler handler, AtomicReference atomicReference, AnonymousClass2pS anonymousClass2pS, AtomicReference atomicReference2, AnonymousClass2p3 anonymousClass2p3, Map map, VideoPlayRequest videoPlayRequest, AtomicBoolean atomicBoolean, AnonymousClass3ti anonymousClass3ti) {
        AnonymousClass2pS anonymousClass2pS2 = anonymousClass2pS;
        AtomicReference atomicReference3 = atomicReference;
        AnonymousClass1Gy anonymousClass1Gy2 = anonymousClass1Gy;
        AnonymousClass2pd anonymousClass2pd2 = anonymousClass2pd;
        VideoPlayRequest videoPlayRequest2 = videoPlayRequest;
        Map map2 = map;
        Context context2 = context;
        this.f46080E = new AnonymousClass2pv(context2, map2, anonymousClass1Gy2, atomicReference3, anonymousClass2pS2, atomicReference2, anonymousClass2p3, handler, anonymousClass2pd2, anonymousClass3ti, videoPlayRequest2);
        AnonymousClass2pv anonymousClass2pv = this.f46080E;
        AnonymousClass45z anonymousClass45z = new AnonymousClass45z(anonymousClass2pv.f34659E, AnonymousClass2vw.f36040B, anonymousClass1Gy2.vB, anonymousClass2pv.f34662H, anonymousClass2pv.f34661G, null);
        AnonymousClass45w anonymousClass45w = new AnonymousClass45w(anonymousClass2pv.f34659E, AnonymousClass2vw.f36040B, null, true, anonymousClass2pv.f34662H, null);
        AnonymousClass45S anonymousClass45S = new AnonymousClass45S(new AnonymousClass3tW(anonymousClass2pv, anonymousClass2pd2), anonymousClass2pv.f34662H.getLooper(), new AnonymousClass3tX());
        this.f46083H = new AnonymousClass3uz[]{anonymousClass45z, anonymousClass45w, anonymousClass45S};
        this.f46081F = this.f46080E.m17406A(anonymousClass1Gp, videoPlayRequest2, atomicBoolean);
        if (anonymousClass1Gy2.HB) {
            AnonymousClass2pv anonymousClass2pv2 = r0.f46080E;
            AnonymousClass3ti anonymousClass3ti2 = anonymousClass2pv2.f34666L;
            VideoPlayRequest videoPlayRequest3 = anonymousClass2pv2.f34667M;
            Map map3 = anonymousClass2pv2.f34657C;
            Context context3 = anonymousClass2pv2.f34659E;
            AnonymousClass2y7 anonymousClass44G = new AnonymousClass44G(new AnonymousClass3tS(anonymousClass3ti2, videoPlayRequest3, map3, context3, anonymousClass2pv2.f34656B, ((HeroService) context3).f34529R, anonymousClass2pv2.f34664J));
            AnonymousClass2y0 anonymousClass2y0 = new AnonymousClass2y0((DefaultTrackSelector$Parameters) anonymousClass44G.f49422C.get());
            Point P = AnonymousClass2yi.m18095P(context2);
            int i = P.x;
            int i2 = P.y;
            anonymousClass2y0.f36467S = i;
            anonymousClass2y0.f36465Q = i2;
            anonymousClass2y0.f36466R = true;
            anonymousClass44G.m22567D(anonymousClass2y0);
            r0.f46084I = anonymousClass44G;
        } else {
            r0.f46084I = new AnonymousClass44G();
        }
        r0.f46079D = new AnonymousClass43v(r0.f46083H, r0.f46084I, r0.f46081F, AnonymousClass2yP.f36508B);
    }

    public final long MJ() {
        return this.f46079D.MJ();
    }

    public final HandlerThread NN() {
        return this.f46079D.NN();
    }

    public final void SQA(boolean z) {
        this.f46079D.SQA(z);
    }

    public final long TL() {
        return this.f46079D.TL();
    }

    public final void UE() {
        this.f46077B.clear();
        this.f46079D.ZJA();
    }

    public final void URA(int i, int i2) {
        ((AnonymousClass44G) this.f46084I).m22567D(new AnonymousClass2y0((DefaultTrackSelector$Parameters) ((AnonymousClass44G) this.f46084I).f49422C.get()).m17997A(i, i2 == -1));
    }

    public final boolean aP() {
        return this.f46079D.aP();
    }

    public final Looper bP() {
        return this.f46079D.bP();
    }

    public final int dP() {
        return m21178B(this.f46079D.dP());
    }

    public final int eR(int i) {
        return ((DefaultTrackSelector$Parameters) ((AnonymousClass44G) this.f46084I).f49422C.get()).f36443M.get(i) ? -1 : 0;
    }

    public final long fQ() {
        return this.f46079D.fQ();
    }

    public final void hHA(long j, AnonymousClass3ty anonymousClass3ty, AnonymousClass3ty anonymousClass3ty2, AnonymousClass3ty anonymousClass3ty3, VideoPlayRequest videoPlayRequest) {
        AnonymousClass2wW B;
        HeroExoPlayer2 heroExoPlayer2 = this;
        AnonymousClass2pv anonymousClass2pv = this.f46080E;
        VideoPlayRequest videoPlayRequest2 = videoPlayRequest;
        VideoSource videoSource = videoPlayRequest2.f15797M;
        long j2 = j;
        AnonymousClass441 anonymousClass441 = new AnonymousClass441(videoPlayRequest2.f15797M.f14749N, anonymousClass2pv.f34663I.m17404A(j, videoPlayRequest2, AnonymousClass1e7.f20936K), new AnonymousClass3tY(anonymousClass2pv), anonymousClass2pv.f34665K.m17349A(), null, null, null, AnonymousClass1Gk.BC(anonymousClass2pv.f34657C) * AnonymousClass1Gk.CC(anonymousClass2pv.f34657C));
        if (!AnonymousClass2lf.m17114B(videoSource.f14749N, anonymousClass2pv.f34664J)) {
            AnonymousClass1Cy.D(videoSource.f14751P != AnonymousClass17U.DASH_LIVE);
            if (videoPlayRequest2.f15797M.f14744I != null) {
                B = AnonymousClass2pv.m17405B(anonymousClass2pv, j2, videoPlayRequest2);
                if (B != null) {
                    B.gB(anonymousClass2pv.f34662H, anonymousClass2pv.f34661G);
                    heroExoPlayer2.f46082G = B;
                    heroExoPlayer2.f46079D.kHA(heroExoPlayer2.f46082G);
                }
            }
        }
        B = anonymousClass441;
        B.gB(anonymousClass2pv.f34662H, anonymousClass2pv.f34661G);
        heroExoPlayer2.f46082G = B;
        heroExoPlayer2.f46079D.kHA(heroExoPlayer2.f46082G);
    }

    public final void kB(AnonymousClass2pO anonymousClass2pO) {
        if (this.f46077B.isEmpty()) {
            this.f46078C = new AnonymousClass3tU(this);
            this.f46079D.mB(this.f46078C);
        }
        this.f46077B.add(anonymousClass2pO);
    }

    public final long kK() {
        return this.f46079D.kK();
    }

    public final void oSA(AnonymousClass3ty anonymousClass3ty, float f) {
        anonymousClass3ty = this.f46079D.lF(this.f46083H[1]);
        AnonymousClass2yO.m18017F(anonymousClass3ty.f35640G ^ 1);
        anonymousClass3ty.f35645L = 2;
        Float valueOf = Float.valueOf(f);
        AnonymousClass2yO.m18017F(anonymousClass3ty.f35640G ^ 1);
        anonymousClass3ty.f35641H = valueOf;
        anonymousClass3ty.m17715B();
    }

    public final void release() {
        this.f46077B.clear();
        this.f46079D.release();
    }

    public final void sRA(android.view.Surface r4, boolean r5, X.AnonymousClass3ty r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r2 = r3.f46079D;
        r1 = r3.f46083H;
        r0 = 0;
        r0 = r1[r0];
        r2 = r2.lF(r0);
        r1 = 1;
        r0 = r2.f35640G;
        r0 = r0 ^ 1;
        X.AnonymousClass2yO.m18017F(r0);
        r2.f35645L = r1;
        r0 = r2.f35640G;
        r0 = r0 ^ 1;
        X.AnonymousClass2yO.m18017F(r0);
        r2.f35641H = r4;
        r2 = r2.m17715B();
        if (r5 == 0) goto L_0x0051;
    L_0x0024:
        monitor-enter(r2);	 Catch:{ InterruptedException -> 0x004a }
        r0 = r2.f35640G;	 Catch:{ all -> 0x0052 }
        X.AnonymousClass2yO.m18017F(r0);	 Catch:{ all -> 0x0052 }
        r0 = r2.f35636C;	 Catch:{ all -> 0x0052 }
        r0 = r0.getLooper();	 Catch:{ all -> 0x0052 }
        r1 = r0.getThread();	 Catch:{ all -> 0x0052 }
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0052 }
        if (r1 == r0) goto L_0x003c;	 Catch:{ all -> 0x0052 }
    L_0x003a:
        r0 = 1;	 Catch:{ all -> 0x0052 }
        goto L_0x003d;	 Catch:{ all -> 0x0052 }
    L_0x003c:
        r0 = 0;	 Catch:{ all -> 0x0052 }
    L_0x003d:
        X.AnonymousClass2yO.m18017F(r0);	 Catch:{ all -> 0x0052 }
    L_0x0040:
        r0 = r2.f35639F;	 Catch:{ all -> 0x0052 }
        if (r0 != 0) goto L_0x0048;	 Catch:{ all -> 0x0052 }
    L_0x0044:
        r2.wait();	 Catch:{ all -> 0x0052 }
        goto L_0x0040;	 Catch:{ all -> 0x0052 }
    L_0x0048:
        monitor-exit(r2);	 Catch:{ InterruptedException -> 0x004a }
        goto L_0x0051;	 Catch:{ InterruptedException -> 0x004a }
    L_0x004a:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x0051:
        return;
    L_0x0052:
        r0 = move-exception;	 Catch:{ InterruptedException -> 0x004a }
        monitor-exit(r2);	 Catch:{ InterruptedException -> 0x004a }
        throw r0;	 Catch:{ InterruptedException -> 0x004a }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2.sRA(android.view.Surface, boolean, X.3ty):void");
    }

    public final void stop() {
        this.f46079D.stop();
    }

    public final void tMA(int i, int i2) {
        AnonymousClass3tZ anonymousClass3tZ = this.f46081F;
        anonymousClass3tZ.f46089C = (long) (i * JsonMappingException.MAX_REFS_TO_LIST);
        anonymousClass3tZ.f46088B = (long) (i2 * JsonMappingException.MAX_REFS_TO_LIST);
    }

    public final void wC(long j) {
        this.f46079D.wC(j);
    }

    public final void wLA(long j) {
        this.f46079D.wLA(j);
    }

    public final void zQA(long j) {
        this.f46079D.zQA(j);
    }
}
