package com.instagram.inappbrowser.service;

import X.AnonymousClass0CC;
import X.AnonymousClass0FC;
import X.AnonymousClass0IE;
import X.AnonymousClass0IW;
import X.AnonymousClass0NN;
import X.AnonymousClass0PZ;
import X.AnonymousClass0bN;
import X.AnonymousClass0bP;
import X.AnonymousClass0cQ;
import X.AnonymousClass0hf;
import X.AnonymousClass0vu;
import X.AnonymousClass107;
import X.AnonymousClass2Cz;
import X.AnonymousClass2D0;
import X.AnonymousClass5jX;
import X.AnonymousClass5jY;
import X.AnonymousClass5jZ;
import X.AnonymousClass5ja;
import X.AnonymousClass5jb;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import com.facebook.browser.lite.ipc.BrowserLiteCallback.Stub;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback;
import com.facebook.browser.lite.ipc.PrefetchCacheEntry;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.webrtc.audio.WebRtcAudioRecord;

public class BrowserLiteCallbackService extends Service {
    /* renamed from: B */
    public final AnonymousClass5jZ f68598B = new AnonymousClass5jZ(this);
    /* renamed from: C */
    public String f68599C;
    /* renamed from: D */
    public final AnonymousClass5jb f68600D = new AnonymousClass5jb(this);

    public final class BrowserLiteCallbackImpl extends Stub {
        /* renamed from: B */
        public final /* synthetic */ BrowserLiteCallbackService f68594B;

        private BrowserLiteCallbackImpl(BrowserLiteCallbackService browserLiteCallbackService) {
            this.f68594B = browserLiteCallbackService;
            AnonymousClass0cQ.H(this, -371672025, AnonymousClass0cQ.I(this, 220814266));
        }

        public /* synthetic */ BrowserLiteCallbackImpl(BrowserLiteCallbackService browserLiteCallbackService, AnonymousClass5jY anonymousClass5jY) {
            this(browserLiteCallbackService);
            AnonymousClass0cQ.H(this, 1359642406, AnonymousClass0cQ.I(this, -936980901));
        }

        public final void AD(String str, Map map) {
            AnonymousClass0cQ.H(this, 1017003222, AnonymousClass0cQ.I(this, 1554930286));
        }

        public final void BVA() {
            AnonymousClass0cQ.H(this, 224058838, AnonymousClass0cQ.I(this, 681906674));
        }

        public final void Ct(String str, int i) {
            int I = AnonymousClass0cQ.I(this, 1488185448);
            AnonymousClass0bP B = AnonymousClass5jX.m28368B("browser_page_finished", AnonymousClass2D0.f27522C, this.f68594B.f68598B);
            B.IE = AnonymousClass0IE.B(str);
            B.VC = i;
            B.B().R();
            AnonymousClass2D0.f27521B.f27503B = true;
            AnonymousClass0cQ.H(this, 1107846194, I);
        }

        public final boolean DV(String str, String str2) {
            AnonymousClass0cQ.H(this, -801746046, AnonymousClass0cQ.I(this, -1686733816));
            return false;
        }

        public final void Et(String str, Bundle bundle, int i, long j) {
            int I = AnonymousClass0cQ.I(this, -544469479);
            AnonymousClass0bP B = AnonymousClass5jX.m28368B("browser_page_interactive", AnonymousClass2D0.f27522C, this.f68594B.f68598B);
            B.IE = AnonymousClass0IE.B(str);
            B.VC = i;
            B.B().R();
            AnonymousClass0cQ.H(this, 2094223085, I);
        }

        public final void IZ(String str) {
            AnonymousClass0cQ.H(this, 1108537867, AnonymousClass0cQ.I(this, -897528866));
        }

        public final void Jp(BrowserLiteJSBridgeCall browserLiteJSBridgeCall, BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback) {
            AnonymousClass0cQ.H(this, -452306381, AnonymousClass0cQ.I(this, 1682378903));
        }

        public final void Mt(String str, String str2, Bundle bundle) {
            int I = AnonymousClass0cQ.I(this, 696749261);
            AnonymousClass0bP B = AnonymousClass5jX.m28368B("browser_page_started", AnonymousClass2D0.f27522C, this.f68594B.f68598B);
            B.IE = AnonymousClass0IE.B(str);
            B.KC = AnonymousClass0IE.B(str2);
            B.B().R();
            AnonymousClass2D0.f27521B.A(str2);
            AnonymousClass0cQ.H(this, 1651273422, I);
        }

        public final void PE(Bundle bundle) {
            AnonymousClass0cQ.H(this, -37096398, AnonymousClass0cQ.I(this, 2139039858));
        }

        public final void Tt(String str, boolean z) {
            int I = AnonymousClass0cQ.I(this, -929818373);
            this.f68594B.f68600D.obtainMessage(3, Boolean.valueOf(z)).sendToTarget();
            AnonymousClass2Cz anonymousClass2Cz = AnonymousClass2D0.f27522C;
            anonymousClass2Cz.f27518M = (anonymousClass2Cz.f27518M + SystemClock.elapsedRealtime()) - anonymousClass2Cz.f27515J;
            anonymousClass2Cz.f27515J = SystemClock.elapsedRealtime();
            AnonymousClass0cQ.H(this, 828243820, I);
        }

        public final void UVA() {
            AnonymousClass0cQ.H(this, 539297683, AnonymousClass0cQ.I(this, -1697873440));
        }

        public final void Vm() {
            int I = AnonymousClass0cQ.I(this, 1063276521);
            AnonymousClass5jX.m28368B("browser_first_touch", AnonymousClass2D0.f27522C, this.f68594B.f68598B).B().R();
            AnonymousClass2D0.f27521B.B();
            AnonymousClass0cQ.H(this, -983310826, I);
        }

        public final void Za(String str, long j, long j2, long j3, long j4, long j5, int i, boolean z, boolean z2, boolean z3, Map map, boolean z4, String str2, Map map2) {
            int I = AnonymousClass0cQ.I(this, -533364577);
            AnonymousClass2Cz anonymousClass2Cz = AnonymousClass2D0.f27522C;
            anonymousClass2Cz.f27513H = str;
            anonymousClass2Cz.f27511F = j;
            anonymousClass2Cz.f27512G = j2;
            anonymousClass2Cz.f27508C = j3;
            anonymousClass2Cz.f27510E = j4;
            anonymousClass2Cz.f27509D = j5;
            AnonymousClass0PZ anonymousClass0PZ = this.f68594B.f68598B;
            anonymousClass2Cz = AnonymousClass2D0.f27522C;
            j2 = AnonymousClass0bN.G("browser_first_page_stats", anonymousClass0PZ);
            String str3 = anonymousClass2Cz.f27513H;
            str2 = anonymousClass2Cz.f27511F;
            long j6 = anonymousClass2Cz.f27512G;
            long j7 = anonymousClass2Cz.f27508C;
            long j8 = anonymousClass2Cz.f27510E;
            long j9 = anonymousClass2Cz.f27509D;
            long j10 = anonymousClass2Cz.f27509D;
            long j11 = j10;
            i = j8;
            z2 = j9;
            j4 = j6;
            j5 = j7;
            j3 = str2;
            j2.E(str3, j3, j4, j5, i, z2, AnonymousClass5jX.m28369C(j11, anonymousClass2Cz.f27508C, anonymousClass2Cz.f27514I)).B().R();
            AnonymousClass0cQ.H(this, -1135667992, I);
        }

        public final void Zv(Map map) {
            AnonymousClass0cQ.H(this, 120088671, AnonymousClass0cQ.I(this, 1745688191));
        }

        public final void cc(Bundle bundle) {
            AnonymousClass0cQ.H(this, 1258691220, AnonymousClass0cQ.I(this, 1947487564));
        }

        public final void dKA(long[] jArr) {
            int I = AnonymousClass0cQ.I(this, 579075409);
            for (long KKA : jArr) {
                AnonymousClass0FC.B().KKA(KKA);
            }
            AnonymousClass0cQ.H(this, 993693810, I);
        }

        public final void gZ(String str, Map map) {
            AnonymousClass0cQ.H(this, -181662019, AnonymousClass0cQ.I(this, 1181091863));
        }

        public final void hx(String str, Bundle bundle) {
            int I = AnonymousClass0cQ.I(this, -1972229208);
            this.f68594B.f68600D.obtainMessage(2).sendToTarget();
            AnonymousClass2D0.f27522C.f27515J = SystemClock.elapsedRealtime();
            AnonymousClass0cQ.H(this, 745656846, I);
        }

        public final void kU(String str) {
            AnonymousClass0cQ.H(this, 27819589, AnonymousClass0cQ.I(this, 1191894845));
        }

        public final void lVA(Bundle bundle) {
            AnonymousClass0cQ.H(this, -121653057, AnonymousClass0cQ.I(this, 841277013));
        }

        public final void lz() {
            AnonymousClass0cQ.H(this, -1273892345, AnonymousClass0cQ.I(this, 563091827));
        }

        public final PrefetchCacheEntry nP(String str) {
            AnonymousClass0cQ.H(this, -2143678621, AnonymousClass0cQ.I(this, 652565983));
            return null;
        }

        public final List oP() {
            int I = AnonymousClass0cQ.I(this, -2116518670);
            List arrayList = new ArrayList();
            AnonymousClass0cQ.H(this, 1634670910, I);
            return arrayList;
        }

        public final String pb(String str) {
            AnonymousClass0cQ.H(this, -553905829, AnonymousClass0cQ.I(this, -1873604304));
            return null;
        }

        public final void ph(String str, Bundle bundle) {
            int I = AnonymousClass0cQ.I(this, 298492839);
            this.f68594B.f68599C = AnonymousClass2D0.f27522C.f27520O.f12168D;
            AnonymousClass5jX.m28368B("browser_launch", AnonymousClass2D0.f27522C, this.f68594B.f68598B).B().R();
            AnonymousClass0cQ.H(this, 1943583170, I);
        }

        public final void qa(Bundle bundle) {
            AnonymousClass0cQ.H(this, 1456168285, AnonymousClass0cQ.I(this, -6508412));
        }

        public final int rU(java.lang.String r7) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r6 = this;
            r0 = -1751463733; // 0xffffffff979ac8cb float:-1.0002704E-24 double:NaN;
            r2 = X.AnonymousClass0cQ.I(r6, r0);
            r5 = 0;
            if (r7 != 0) goto L_0x0011;
        L_0x000a:
            r0 = -699488041; // 0xffffffffd64ea8d7 float:-5.6806139E13 double:NaN;
            X.AnonymousClass0cQ.H(r6, r0, r2);
            return r5;
        L_0x0011:
            r1 = android.net.Uri.parse(r7);	 Catch:{ URISyntaxException -> 0x0075 }
            r3 = 1;	 Catch:{ URISyntaxException -> 0x0075 }
            r4 = android.content.Intent.parseUri(r7, r3);	 Catch:{ URISyntaxException -> 0x0075 }
            r0 = r1.getHost();	 Catch:{ URISyntaxException -> 0x0075 }
            if (r0 == 0) goto L_0x006e;	 Catch:{ URISyntaxException -> 0x0075 }
        L_0x0020:
            r0 = r4.getScheme();	 Catch:{ URISyntaxException -> 0x0075 }
            if (r0 == 0) goto L_0x006e;	 Catch:{ URISyntaxException -> 0x0075 }
        L_0x0026:
            r0 = r4.getPackage();	 Catch:{ URISyntaxException -> 0x0075 }
            if (r0 == 0) goto L_0x006e;	 Catch:{ URISyntaxException -> 0x0075 }
        L_0x002c:
            r1 = r1.getHost();	 Catch:{ URISyntaxException -> 0x0075 }
            r0 = "instagram.com";	 Catch:{ URISyntaxException -> 0x0075 }
            r0 = r1.equalsIgnoreCase(r0);	 Catch:{ URISyntaxException -> 0x0075 }
            if (r0 == 0) goto L_0x006e;	 Catch:{ URISyntaxException -> 0x0075 }
        L_0x0038:
            r1 = r4.getScheme();	 Catch:{ URISyntaxException -> 0x0075 }
            r0 = "https";	 Catch:{ URISyntaxException -> 0x0075 }
            r0 = r1.equalsIgnoreCase(r0);	 Catch:{ URISyntaxException -> 0x0075 }
            if (r0 == 0) goto L_0x006e;	 Catch:{ URISyntaxException -> 0x0075 }
        L_0x0044:
            r1 = r4.getPackage();	 Catch:{ URISyntaxException -> 0x0075 }
            r0 = "com.instagram.android";	 Catch:{ URISyntaxException -> 0x0075 }
            r0 = r1.equalsIgnoreCase(r0);	 Catch:{ URISyntaxException -> 0x0075 }
            if (r0 != 0) goto L_0x0051;	 Catch:{ URISyntaxException -> 0x0075 }
        L_0x0050:
            goto L_0x006e;	 Catch:{ URISyntaxException -> 0x0075 }
        L_0x0051:
            r0 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;	 Catch:{ URISyntaxException -> 0x0075 }
            r4.addFlags(r0);	 Catch:{ URISyntaxException -> 0x0075 }
            r0 = "android.intent.category.BROWSABLE";	 Catch:{ URISyntaxException -> 0x0075 }
            r4.addCategory(r0);	 Catch:{ URISyntaxException -> 0x0075 }
            r0 = 0;	 Catch:{ URISyntaxException -> 0x0075 }
            r4.setComponent(r0);	 Catch:{ URISyntaxException -> 0x0075 }
            r4.setSelector(r0);	 Catch:{ URISyntaxException -> 0x0075 }
            r0 = r6.f68594B;	 Catch:{ URISyntaxException -> 0x0075 }
            X.AnonymousClass0IW.B(r4, r0);	 Catch:{ URISyntaxException -> 0x0075 }
            r0 = -796324464; // 0xffffffffd0890d90 float:-1.83949394E10 double:NaN;
            X.AnonymousClass0cQ.H(r6, r0, r2);
            return r3;
        L_0x006e:
            r0 = -1003852109; // 0xffffffffc42a6eb3 float:-681.7297 double:NaN;
            X.AnonymousClass0cQ.H(r6, r0, r2);
            return r5;
        L_0x0075:
            r0 = -1151432773; // 0xffffffffbb5e87bb float:-0.0033955413 double:NaN;
            X.AnonymousClass0cQ.H(r6, r0, r2);
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.service.BrowserLiteCallbackService.BrowserLiteCallbackImpl.rU(java.lang.String):int");
        }

        public final void sa(Map map) {
            AnonymousClass0cQ.H(this, 1270938907, AnonymousClass0cQ.I(this, -1859661392));
        }

        public final boolean tU(String str) {
            int I = AnonymousClass0cQ.I(this, -1799363167);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setFlags(268435456);
            AnonymousClass0IW.D(intent, this.f68594B.getApplicationContext());
            AnonymousClass0cQ.H(this, -2016910954, I);
            return true;
        }

        public final void uEA(Bundle bundle, String str) {
            AnonymousClass0cQ.H(this, 1780130566, AnonymousClass0cQ.I(this, -959712689));
        }

        public final boolean wU(String str, String str2) {
            AnonymousClass0cQ.H(this, -229797358, AnonymousClass0cQ.I(this, 607681780));
            return false;
        }

        public final void wb() {
            AnonymousClass0cQ.H(this, 18388726, AnonymousClass0cQ.I(this, -600027142));
        }

        public final void wn(String str, List list) {
            AnonymousClass0cQ.H(this, 1147059999, AnonymousClass0cQ.I(this, 824087382));
        }

        public final void xEA(Map map, Bundle bundle) {
            int I = AnonymousClass0cQ.I(this, 1090651581);
            if (map.containsKey("action")) {
                String str = (String) map.get("action");
                Object obj = -1;
                switch (str.hashCode()) {
                    case -2002517987:
                        if (str.equals("ig_fullscreen_animation_end")) {
                            obj = 7;
                            break;
                        }
                        break;
                    case -1832756262:
                        if (str.equals("ig_browser_touch_interaction")) {
                            obj = 8;
                            break;
                        }
                        break;
                    case -1401623561:
                        if (str.equals("ACTION_GO_FORWARD")) {
                            obj = 1;
                            break;
                        }
                        break;
                    case -261328092:
                        if (str.equals("ig_fullscreen_animation_start")) {
                            obj = 6;
                            break;
                        }
                        break;
                    case 26614404:
                        if (str.equals("COPY_LINK")) {
                            obj = 3;
                            break;
                        }
                        break;
                    case 219798533:
                        if (str.equals("ig_did_fullscreen_happen")) {
                            obj = 5;
                            break;
                        }
                        break;
                    case 355631317:
                        if (str.equals("ACTION_GO_BACK")) {
                            obj = null;
                            break;
                        }
                        break;
                    case 1205853038:
                        if (str.equals("SHARE_VIA")) {
                            obj = 4;
                            break;
                        }
                        break;
                    case 1398948562:
                        if (str.equals("ACTION_OPEN_WITH")) {
                            obj = 2;
                            break;
                        }
                        break;
                    default:
                        break;
                }
                switch (obj) {
                    case null:
                        AnonymousClass0NN.B("browser_back", this.f68594B.f68598B).R();
                        break;
                    case 1:
                        AnonymousClass0NN.B("browser_forward", this.f68594B.f68598B).R();
                        break;
                    case 2:
                        if (map.containsKey("destination") && (map.get("destination") instanceof String)) {
                            AnonymousClass0NN.B("browser_open_link", this.f68594B.f68598B).F("destination", (String) map.get("destination")).R();
                            break;
                        }
                    case 3:
                    case 4:
                        if (map.containsKey(IgReactNavigatorModule.URL) && (map.get(IgReactNavigatorModule.URL) instanceof String)) {
                            String str2 = (String) map.get(IgReactNavigatorModule.URL);
                            AnonymousClass0bP G;
                            if (!"COPY_LINK".equals(str)) {
                                if ("SHARE_VIA".equals(str)) {
                                    this.f68594B.f68600D.obtainMessage(1, str2).sendToTarget();
                                    G = AnonymousClass0bN.G("browser_share_via", this.f68594B.f68598B);
                                    G.IE = str2;
                                    G.B().R();
                                    break;
                                }
                            }
                            this.f68594B.f68600D.obtainMessage(0, str2).sendToTarget();
                            G = AnonymousClass0bN.G("browser_copy_link", this.f68594B.f68598B);
                            G.IE = str2;
                            G.B().R();
                            break;
                        }
                        break;
                    case 5:
                    case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                        AnonymousClass2D0.f27522C.f27507B = true;
                        break;
                    case 6:
                        AnonymousClass2Cz anonymousClass2Cz = AnonymousClass2D0.f27522C;
                        anonymousClass2Cz.f27517L = (anonymousClass2Cz.f27518M + SystemClock.elapsedRealtime()) - anonymousClass2Cz.f27515J;
                        break;
                    case 8:
                        AnonymousClass2D0.f27522C.f27519N++;
                        break;
                    default:
                        break;
                }
            }
            AnonymousClass0cQ.H(this, -1569880722, I);
        }

        public final void xPA(String str) {
            AnonymousClass0cQ.H(this, -1179273335, AnonymousClass0cQ.I(this, 409635166));
        }

        public final boolean xU(String str) {
            AnonymousClass0cQ.H(this, 891571372, AnonymousClass0cQ.I(this, -1208131281));
            return false;
        }

        public final void yU(String str, String str2) {
            AnonymousClass0cQ.H(this, 661319706, AnonymousClass0cQ.I(this, -764356639));
        }

        public final void yy(String str) {
            AnonymousClass0cQ.H(this, 72863120, AnonymousClass0cQ.I(this, 433296765));
        }

        public final void zk(String str, String str2, Map map) {
            int I = AnonymousClass0cQ.I(this, -34968606);
            AnonymousClass2Cz anonymousClass2Cz = AnonymousClass2D0.f27522C;
            AnonymousClass5ja anonymousClass5ja = new AnonymousClass5ja();
            Map map2 = map;
            anonymousClass5ja.f68596C = map2.get("tap_point") != null ? ((Integer) map2.get("tap_point")).intValue() : 0;
            anonymousClass5ja.f68595B = anonymousClass2Cz.f27516K;
            r13.f68594B.f68600D.obtainMessage(4, anonymousClass5ja).sendToTarget();
            anonymousClass2Cz.f27518M = (anonymousClass2Cz.f27518M + SystemClock.elapsedRealtime()) - anonymousClass2Cz.f27515J;
            anonymousClass2Cz.f27515J = SystemClock.elapsedRealtime();
            AnonymousClass0PZ anonymousClass0PZ = r13.f68594B.f68598B;
            AnonymousClass2Cz anonymousClass2Cz2 = AnonymousClass2D0.f27522C;
            AnonymousClass0bP B = AnonymousClass5jX.m28368B("webview_end", anonymousClass2Cz2, anonymousClass0PZ);
            long j = anonymousClass2Cz2.f27511F > 0 ? anonymousClass2Cz2.f27511F - anonymousClass2Cz2.f27514I : -1;
            B.CE = anonymousClass2Cz2.f27518M;
            B.VE = anonymousClass2Cz2.f27520O.f12171G;
            AnonymousClass0bP E = B.E(anonymousClass2Cz2.f27513H, anonymousClass2Cz2.f27511F, anonymousClass2Cz2.f27512G, anonymousClass2Cz2.f27508C, anonymousClass2Cz2.f27510E, anonymousClass2Cz2.f27509D, AnonymousClass5jX.m28369C(anonymousClass2Cz2.f27509D, anonymousClass2Cz2.f27508C, anonymousClass2Cz2.f27514I));
            E.XB = anonymousClass2Cz2.f27514I;
            E.f6758h = j;
            E.oB = anonymousClass2Cz2.f27519N - 1;
            AnonymousClass0vu anonymousClass0vu = anonymousClass2Cz2.f27520O;
            if (anonymousClass0vu.f12169E == null && anonymousClass0vu.f12167C != null) {
                if (anonymousClass2Cz2.f27520O.f12168D.equals("watch_browse")) {
                    B.MB = Boolean.valueOf(anonymousClass2Cz2.f27507B);
                }
                if (AnonymousClass0hf.REEL_CTA.toString().equals(anonymousClass0vu.f12172H) && ((Boolean) AnonymousClass0CC.KQ.G()).booleanValue()) {
                    B.gC = anonymousClass2Cz2.f27517L;
                    B.MB = Boolean.valueOf(anonymousClass2Cz2.f27507B);
                }
                AnonymousClass0bN.S(B, AnonymousClass107.f13182C.A(anonymousClass0vu.f12167C), anonymousClass0PZ, anonymousClass0vu.f12166B);
            } else {
                B.B().R();
            }
            AnonymousClass0cQ.H(r13, -1985141921, I);
        }
    }

    public final IBinder onBind(Intent intent) {
        return new BrowserLiteCallbackImpl();
    }
}
