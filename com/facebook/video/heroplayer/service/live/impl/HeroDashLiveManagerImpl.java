package com.facebook.video.heroplayer.service.live.impl;

import X.AnonymousClass1Dy;
import X.AnonymousClass1Gk;
import X.AnonymousClass1Gl;
import X.AnonymousClass1Gy;
import X.AnonymousClass1H1;
import X.AnonymousClass2kY;
import X.AnonymousClass2kb;
import X.AnonymousClass2kc;
import X.AnonymousClass2kj;
import X.AnonymousClass2kk;
import X.AnonymousClass2km;
import X.AnonymousClass2ku;
import X.AnonymousClass2l3;
import X.AnonymousClass2lI;
import X.AnonymousClass2lO;
import X.AnonymousClass2lR;
import X.AnonymousClass2lS;
import X.AnonymousClass2ld;
import X.AnonymousClass2le;
import X.AnonymousClass2lf;
import X.AnonymousClass2pQ;
import X.AnonymousClass2pS;
import X.AnonymousClass2pd;
import X.AnonymousClass2pk;
import X.AnonymousClass2px;
import X.AnonymousClass2py;
import X.AnonymousClass2q0;
import X.AnonymousClass2r9;
import X.AnonymousClass2sC;
import X.AnonymousClass2tp;
import X.AnonymousClass3sL;
import X.AnonymousClass3sQ;
import X.AnonymousClass3sS;
import X.AnonymousClass3sU;
import X.AnonymousClass3sW;
import X.AnonymousClass3tB;
import X.AnonymousClass3tF;
import X.AnonymousClass3tG;
import X.AnonymousClass3tL;
import X.AnonymousClass3tb;
import X.AnonymousClass3tc;
import X.AnonymousClass3td;
import X.AnonymousClass3te;
import X.AnonymousClass3ti;
import X.AnonymousClass3uC;
import X.AnonymousClass43D;
import X.AnonymousClass45I;
import X.AnonymousClass45J;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import com.facebook.exoplayer.ipc.VpsManifestParseErrorEvent;
import com.facebook.video.heroplayer.ipc.DynamicPlayerSettings;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;
import com.facebook.video.heroplayer.ipc.VideoPrefetchRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class HeroDashLiveManagerImpl implements AnonymousClass2px {
    /* renamed from: G */
    public static final String f46105G = "HeroDashLiveManagerImpl";
    /* renamed from: B */
    private final AnonymousClass3sL f46106B;
    /* renamed from: C */
    private final AnonymousClass2lO f46107C;
    /* renamed from: D */
    private final AnonymousClass3tB f46108D;
    /* renamed from: E */
    private final AnonymousClass3tL f46109E;
    /* renamed from: F */
    private final AnonymousClass3ti f46110F;

    public HeroDashLiveManagerImpl(Context context, Map map, AnonymousClass1Gy anonymousClass1Gy, AnonymousClass3sL anonymousClass3sL, AnonymousClass3ti anonymousClass3ti, AtomicReference atomicReference, AtomicReference atomicReference2, AnonymousClass2kY anonymousClass2kY) {
        this.f46107C = new AnonymousClass2lO(10, context, map, anonymousClass1Gy.qB, anonymousClass1Gy.f16573D, anonymousClass2kY);
        this.f46106B = anonymousClass3sL;
        this.f46110F = anonymousClass3ti;
        this.f46109E = new AnonymousClass3tL(atomicReference);
        this.f46108D = new AnonymousClass3tB(atomicReference2);
    }

    public final void PD(AnonymousClass2pd anonymousClass2pd, AnonymousClass1Gy anonymousClass1Gy, VideoPlayRequest videoPlayRequest, DynamicPlayerSettings dynamicPlayerSettings, AnonymousClass2pS anonymousClass2pS, AnonymousClass3tF anonymousClass3tF, AnonymousClass2lf anonymousClass2lf, Handler handler, AnonymousClass3tG anonymousClass3tG, AnonymousClass2q0 anonymousClass2q0, AnonymousClass2r9 anonymousClass2r9, boolean z) {
        AnonymousClass2py anonymousClass2py;
        AnonymousClass3uC C;
        Exception e;
        Handler handler2;
        boolean z2;
        DynamicPlayerSettings dynamicPlayerSettings2;
        int i;
        Uri uri;
        String str;
        long j;
        String str2;
        Context context;
        Handler handler3;
        Map map;
        AnonymousClass1Gy anonymousClass1Gy2;
        AnonymousClass3sU A;
        AnonymousClass2kb anonymousClass2kb;
        boolean z3;
        boolean z4;
        AnonymousClass2lS anonymousClass2lS;
        AnonymousClass2lS anonymousClass2lS2;
        AnonymousClass1Dy anonymousClass1Dy;
        StringBuilder stringBuilder;
        AnonymousClass3sU anonymousClass3sU;
        AnonymousClass2tp anonymousClass3sW;
        int i2 = 1;
        Object[] objArr = new Object[1];
        VideoPlayRequest videoPlayRequest2 = videoPlayRequest;
        objArr[0] = videoPlayRequest2.f15797M;
        AnonymousClass1Gl.C(f46105G, "Start build Dash Live renderers: %s", objArr);
        AnonymousClass2pd anonymousClass2pd2 = anonymousClass2pd;
        AnonymousClass45I anonymousClass45I = new AnonymousClass45I(anonymousClass2pd2);
        AnonymousClass43D anonymousClass43D = null;
        AnonymousClass1Gy anonymousClass1Gy3 = anonymousClass1Gy;
        AnonymousClass3te anonymousClass3te = new AnonymousClass3te(anonymousClass1Gy3, anonymousClass2pd2.f34596k);
        AnonymousClass3tF anonymousClass3tF2;
        try {
            boolean w;
            anonymousClass3tF2 = anonymousClass3tF;
            if (!anonymousClass1Gy3.JB || !videoPlayRequest2.f15797M.f14738C) {
                i2 = 0;
            }
            HeroDashLiveManagerImpl heroDashLiveManagerImpl = this;
            if (i2 != 0) {
                anonymousClass2py = new AnonymousClass2py();
                anonymousClass43D = new AnonymousClass45J(heroDashLiveManagerImpl.f46109E, anonymousClass2py);
            } else {
                anonymousClass2py = null;
            }
            AnonymousClass2ld B = AnonymousClass2pk.m17397B(videoPlayRequest2, anonymousClass2pd2.f34579T);
            AnonymousClass2lO anonymousClass2lO = heroDashLiveManagerImpl.f46107C;
            AnonymousClass2lI B2 = AnonymousClass2pQ.m17341B(anonymousClass2pd2, anonymousClass1Gy3, videoPlayRequest2, heroDashLiveManagerImpl.f46109E, z);
            AnonymousClass3td anonymousClass3td = new AnonymousClass3td(anonymousClass3tG);
            AnonymousClass3tL anonymousClass3tL = heroDashLiveManagerImpl.f46109E;
            AnonymousClass2le anonymousClass3tb = new AnonymousClass3tb(heroDashLiveManagerImpl, anonymousClass3tF2);
            AnonymousClass3sL anonymousClass3sL = heroDashLiveManagerImpl.f46106B;
            AnonymousClass3ti anonymousClass3ti = heroDashLiveManagerImpl.f46110F;
            Looper bP = anonymousClass2pd2.f34569J.bP();
            AnonymousClass3tB anonymousClass3tB = heroDashLiveManagerImpl.f46108D;
            AnonymousClass2sC anonymousClass3tc = new AnonymousClass3tc(heroDashLiveManagerImpl, videoPlayRequest2, anonymousClass3tF2);
            AnonymousClass2lf anonymousClass2lf2 = anonymousClass2lf;
            Object obj = (!anonymousClass2lf2.f33712G.f16598c || anonymousClass3tB == null) ? null : 1;
            AnonymousClass1H1 anonymousClass1H1 = null;
            try {
                C = AnonymousClass2lf.m17115C(B, anonymousClass2lf2.f33712G);
                if (anonymousClass43D != null) {
                    try {
                        String str3 = C.f46374K;
                        int i3 = C.f46375L;
                        anonymousClass43D.f48991B = str3;
                        anonymousClass43D.f48992C = i3;
                    } catch (AnonymousClass2kc e2) {
                        e = e2;
                    }
                }
            } catch (AnonymousClass2kc e3) {
                e = e3;
                C = null;
                if (e instanceof AnonymousClass2kc) {
                    anonymousClass3tL.m21176A(AnonymousClass2l3.MANIFEST_PARSE_ERROR, new VpsManifestParseErrorEvent(B.f33697K, e));
                }
                if (obj != null) {
                    handler2 = handler;
                    anonymousClass2lf = C == null ? AnonymousClass2ku.m17048C(bP, B.f33704R, handler2, anonymousClass3tB, anonymousClass3tc) : AnonymousClass2ku.m17049D(bP, C, B.f33704R, handler2, anonymousClass3tB, anonymousClass3tc);
                } else {
                    anonymousClass2lf = null;
                }
                w = AnonymousClass1Gk.w(anonymousClass2lf2.f33708C);
                if (!AnonymousClass1Gk.T(anonymousClass2lf2.f33708C)) {
                    if (B.f33693G) {
                        z2 = false;
                        dynamicPlayerSettings2 = dynamicPlayerSettings;
                        i = dynamicPlayerSettings2.f15870I;
                        if (B.f33692F) {
                            anonymousClass1H1 = anonymousClass2lf2.f33712G.RB;
                            i = 0;
                            z2 = true;
                        }
                        uri = B.f33703Q;
                        str = B.f33704R;
                        j = B.f33699M;
                        str2 = B.f33688B;
                        context = anonymousClass2lf2.f33710E;
                        handler3 = anonymousClass2lf2.f33711F;
                        map = anonymousClass2lf2.f33708C;
                        anonymousClass1Gy2 = anonymousClass2lf2.f33712G;
                        A = anonymousClass2lO.m17097A(B.f33703Q, anonymousClass2lf2.f33711F, B.f33704R, B.f33699M, anonymousClass2lf2.f33708C, anonymousClass2lf2.f33712G, anonymousClass3tL, C, i, B.f33691E, B.f33698L, JsonProperty.USE_DEFAULT_NAME, dynamicPlayerSettings2.f15864C, anonymousClass3te, 0, anonymousClass3sL);
                        anonymousClass2kb = anonymousClass2lO.f33574C;
                        z3 = B.f33691E;
                        if (!w) {
                        }
                        anonymousClass2lS = anonymousClass2lS2;
                        anonymousClass2lS2 = new AnonymousClass2lS(uri, str, j, str2, context, handler3, map, anonymousClass1Gy2, dynamicPlayerSettings2, anonymousClass45I, anonymousClass45I, anonymousClass3td, anonymousClass45I, A, anonymousClass2kb, anonymousClass3tL, z3, anonymousClass3te, null, z4, 0, z2, B.f33702P, B.f33698L, anonymousClass3ti, anonymousClass2r9, anonymousClass1H1, B.f33700N, anonymousClass2lf, anonymousClass43D, anonymousClass2py, B.f33689C ? anonymousClass2lf2.f33715J : anonymousClass2lf2.f33713H, anonymousClass2lf2.f33709D);
                        anonymousClass1Dy = B.f33701O;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Building renderers for dash live with url ");
                        stringBuilder.append(anonymousClass2lS.f33592G);
                        stringBuilder.toString();
                        anonymousClass3sU = anonymousClass2lS.f33591F;
                        anonymousClass3sW = new AnonymousClass3sW(anonymousClass2lS, anonymousClass3tb, B2, anonymousClass1Dy);
                        anonymousClass3sU.f45787H.set(0);
                        if (!AnonymousClass3sU.m21090C(anonymousClass3sU, anonymousClass3sW)) {
                            if (anonymousClass3sU.f45786G != AnonymousClass2lR.PREPARED) {
                                anonymousClass3sW.NAA(anonymousClass3sU.f45784E);
                            } else {
                                anonymousClass3sU.f45782C = anonymousClass3sW;
                                anonymousClass3sU.m21099F(false);
                            }
                        }
                    }
                }
                z2 = true;
                dynamicPlayerSettings2 = dynamicPlayerSettings;
                i = dynamicPlayerSettings2.f15870I;
                if (B.f33692F) {
                    anonymousClass1H1 = anonymousClass2lf2.f33712G.RB;
                    i = 0;
                    z2 = true;
                }
                uri = B.f33703Q;
                str = B.f33704R;
                j = B.f33699M;
                str2 = B.f33688B;
                context = anonymousClass2lf2.f33710E;
                handler3 = anonymousClass2lf2.f33711F;
                map = anonymousClass2lf2.f33708C;
                anonymousClass1Gy2 = anonymousClass2lf2.f33712G;
                A = anonymousClass2lO.m17097A(B.f33703Q, anonymousClass2lf2.f33711F, B.f33704R, B.f33699M, anonymousClass2lf2.f33708C, anonymousClass2lf2.f33712G, anonymousClass3tL, C, i, B.f33691E, B.f33698L, JsonProperty.USE_DEFAULT_NAME, dynamicPlayerSettings2.f15864C, anonymousClass3te, 0, anonymousClass3sL);
                anonymousClass2kb = anonymousClass2lO.f33574C;
                z3 = B.f33691E;
                if (w) {
                }
                if (B.f33689C) {
                }
                anonymousClass2lS = anonymousClass2lS2;
                anonymousClass2lS2 = new AnonymousClass2lS(uri, str, j, str2, context, handler3, map, anonymousClass1Gy2, dynamicPlayerSettings2, anonymousClass45I, anonymousClass45I, anonymousClass3td, anonymousClass45I, A, anonymousClass2kb, anonymousClass3tL, z3, anonymousClass3te, null, z4, 0, z2, B.f33702P, B.f33698L, anonymousClass3ti, anonymousClass2r9, anonymousClass1H1, B.f33700N, anonymousClass2lf, anonymousClass43D, anonymousClass2py, B.f33689C ? anonymousClass2lf2.f33715J : anonymousClass2lf2.f33713H, anonymousClass2lf2.f33709D);
                anonymousClass1Dy = B.f33701O;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Building renderers for dash live with url ");
                stringBuilder.append(anonymousClass2lS.f33592G);
                stringBuilder.toString();
                anonymousClass3sU = anonymousClass2lS.f33591F;
                anonymousClass3sW = new AnonymousClass3sW(anonymousClass2lS, anonymousClass3tb, B2, anonymousClass1Dy);
                anonymousClass3sU.f45787H.set(0);
                if (AnonymousClass3sU.m21090C(anonymousClass3sU, anonymousClass3sW)) {
                    if (anonymousClass3sU.f45786G != AnonymousClass2lR.PREPARED) {
                        anonymousClass3sU.f45782C = anonymousClass3sW;
                        anonymousClass3sU.m21099F(false);
                    } else {
                        anonymousClass3sW.NAA(anonymousClass3sU.f45784E);
                    }
                }
            }
            if (obj != null) {
                handler2 = handler;
                if (C == null) {
                }
            } else {
                anonymousClass2lf = null;
            }
            w = AnonymousClass1Gk.w(anonymousClass2lf2.f33708C);
            if (AnonymousClass1Gk.T(anonymousClass2lf2.f33708C)) {
                if (B.f33693G) {
                    z2 = false;
                    dynamicPlayerSettings2 = dynamicPlayerSettings;
                    i = dynamicPlayerSettings2.f15870I;
                    if (B.f33692F) {
                        anonymousClass1H1 = anonymousClass2lf2.f33712G.RB;
                        i = 0;
                        z2 = true;
                    }
                    uri = B.f33703Q;
                    str = B.f33704R;
                    j = B.f33699M;
                    str2 = B.f33688B;
                    context = anonymousClass2lf2.f33710E;
                    handler3 = anonymousClass2lf2.f33711F;
                    map = anonymousClass2lf2.f33708C;
                    anonymousClass1Gy2 = anonymousClass2lf2.f33712G;
                    A = anonymousClass2lO.m17097A(B.f33703Q, anonymousClass2lf2.f33711F, B.f33704R, B.f33699M, anonymousClass2lf2.f33708C, anonymousClass2lf2.f33712G, anonymousClass3tL, C, i, B.f33691E, B.f33698L, JsonProperty.USE_DEFAULT_NAME, dynamicPlayerSettings2.f15864C, anonymousClass3te, 0, anonymousClass3sL);
                    anonymousClass2kb = anonymousClass2lO.f33574C;
                    z3 = B.f33691E;
                    z4 = w && B.f33690D;
                    if (B.f33689C) {
                    }
                    anonymousClass2lS = anonymousClass2lS2;
                    anonymousClass2lS2 = new AnonymousClass2lS(uri, str, j, str2, context, handler3, map, anonymousClass1Gy2, dynamicPlayerSettings2, anonymousClass45I, anonymousClass45I, anonymousClass3td, anonymousClass45I, A, anonymousClass2kb, anonymousClass3tL, z3, anonymousClass3te, null, z4, 0, z2, B.f33702P, B.f33698L, anonymousClass3ti, anonymousClass2r9, anonymousClass1H1, B.f33700N, anonymousClass2lf, anonymousClass43D, anonymousClass2py, B.f33689C ? anonymousClass2lf2.f33715J : anonymousClass2lf2.f33713H, anonymousClass2lf2.f33709D);
                    anonymousClass1Dy = B.f33701O;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Building renderers for dash live with url ");
                    stringBuilder.append(anonymousClass2lS.f33592G);
                    stringBuilder.toString();
                    anonymousClass3sU = anonymousClass2lS.f33591F;
                    anonymousClass3sW = new AnonymousClass3sW(anonymousClass2lS, anonymousClass3tb, B2, anonymousClass1Dy);
                    anonymousClass3sU.f45787H.set(0);
                    if (AnonymousClass3sU.m21090C(anonymousClass3sU, anonymousClass3sW)) {
                        if (anonymousClass3sU.f45786G != AnonymousClass2lR.PREPARED) {
                            anonymousClass3sW.NAA(anonymousClass3sU.f45784E);
                        } else {
                            anonymousClass3sU.f45782C = anonymousClass3sW;
                            anonymousClass3sU.m21099F(false);
                        }
                    }
                }
            }
            z2 = true;
            dynamicPlayerSettings2 = dynamicPlayerSettings;
            i = dynamicPlayerSettings2.f15870I;
            if (B.f33692F) {
                anonymousClass1H1 = anonymousClass2lf2.f33712G.RB;
                i = 0;
                z2 = true;
            }
            uri = B.f33703Q;
            str = B.f33704R;
            j = B.f33699M;
            str2 = B.f33688B;
            context = anonymousClass2lf2.f33710E;
            handler3 = anonymousClass2lf2.f33711F;
            map = anonymousClass2lf2.f33708C;
            anonymousClass1Gy2 = anonymousClass2lf2.f33712G;
            A = anonymousClass2lO.m17097A(B.f33703Q, anonymousClass2lf2.f33711F, B.f33704R, B.f33699M, anonymousClass2lf2.f33708C, anonymousClass2lf2.f33712G, anonymousClass3tL, C, i, B.f33691E, B.f33698L, JsonProperty.USE_DEFAULT_NAME, dynamicPlayerSettings2.f15864C, anonymousClass3te, 0, anonymousClass3sL);
            anonymousClass2kb = anonymousClass2lO.f33574C;
            z3 = B.f33691E;
            if (w) {
            }
            if (B.f33689C) {
            }
            anonymousClass2lS = anonymousClass2lS2;
            anonymousClass2lS2 = new AnonymousClass2lS(uri, str, j, str2, context, handler3, map, anonymousClass1Gy2, dynamicPlayerSettings2, anonymousClass45I, anonymousClass45I, anonymousClass3td, anonymousClass45I, A, anonymousClass2kb, anonymousClass3tL, z3, anonymousClass3te, null, z4, 0, z2, B.f33702P, B.f33698L, anonymousClass3ti, anonymousClass2r9, anonymousClass1H1, B.f33700N, anonymousClass2lf, anonymousClass43D, anonymousClass2py, B.f33689C ? anonymousClass2lf2.f33715J : anonymousClass2lf2.f33713H, anonymousClass2lf2.f33709D);
            anonymousClass1Dy = B.f33701O;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Building renderers for dash live with url ");
            stringBuilder.append(anonymousClass2lS.f33592G);
            stringBuilder.toString();
            anonymousClass3sU = anonymousClass2lS.f33591F;
            anonymousClass3sW = new AnonymousClass3sW(anonymousClass2lS, anonymousClass3tb, B2, anonymousClass1Dy);
            anonymousClass3sU.f45787H.set(0);
            if (AnonymousClass3sU.m21090C(anonymousClass3sU, anonymousClass3sW)) {
                if (anonymousClass3sU.f45786G != AnonymousClass2lR.PREPARED) {
                    anonymousClass3sU.f45782C = anonymousClass3sW;
                    anonymousClass3sU.m21099F(false);
                } else {
                    anonymousClass3sW.NAA(anonymousClass3sU.f45784E);
                }
            }
        } catch (Exception e4) {
            anonymousClass3tF2.m21172B(e4.getMessage(), e4);
        }
    }

    public final void aE(String str, Uri uri) {
        AnonymousClass2lO anonymousClass2lO = this.f46107C;
        AnonymousClass1Gl.C(AnonymousClass2lO.f33572G, "clearLiveCache: %s", new Object[]{str});
        ((LruCache) anonymousClass2lO.f33573B.get()).remove(AnonymousClass2lO.m17095B(anonymousClass2lO, str, uri));
    }

    public final void dHA(Handler handler, VideoPrefetchRequest videoPrefetchRequest, int i, int i2, AnonymousClass3sS anonymousClass3sS) {
        AnonymousClass3tL anonymousClass3tL = this.f46109E;
        AnonymousClass2lO anonymousClass2lO = this.f46107C;
        AnonymousClass3sS anonymousClass3sS2 = anonymousClass3sS;
        AnonymousClass2km anonymousClass2km = anonymousClass3sS2.f45772G;
        int i3 = i;
        int i4 = i2;
        AnonymousClass2kj anonymousClass3sQ = new AnonymousClass3sQ(anonymousClass2lO, anonymousClass3sS2.f45771F, anonymousClass3sS2.f45769D, handler, i3, i4, anonymousClass3tL, videoPrefetchRequest, anonymousClass3sS2.f45767B);
        AnonymousClass2km.m17032B(anonymousClass2km, new AnonymousClass2kk(anonymousClass3sQ, AnonymousClass1Gk.wB(anonymousClass3sS2.f45771F)), AnonymousClass1Gk.vB(anonymousClass3sS2.f45771F));
    }
}
