package com.facebook.rti.push.service;

import X.AnonymousClass05g;
import X.AnonymousClass061;
import X.AnonymousClass06D;
import X.AnonymousClass06G;
import X.AnonymousClass06I;
import X.AnonymousClass070;
import X.AnonymousClass07P;
import X.AnonymousClass07S;
import X.AnonymousClass08A;
import X.AnonymousClass08Z;
import X.AnonymousClass08a;
import X.AnonymousClass08b;
import X.AnonymousClass08c;
import X.AnonymousClass08d;
import X.AnonymousClass08h;
import X.AnonymousClass08j;
import X.AnonymousClass08k;
import X.AnonymousClass08l;
import X.AnonymousClass08n;
import X.AnonymousClass08o;
import X.AnonymousClass08p;
import X.AnonymousClass08r;
import X.AnonymousClass0AB;
import X.AnonymousClass0AC;
import X.AnonymousClass0AG;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AR;
import X.AnonymousClass0Am;
import X.AnonymousClass0An;
import X.AnonymousClass0As;
import X.AnonymousClass0B2;
import X.AnonymousClass0B8;
import X.AnonymousClass0B9;
import X.AnonymousClass0BA;
import X.AnonymousClass0BB;
import X.AnonymousClass0BC;
import X.AnonymousClass0BD;
import X.AnonymousClass0BG;
import X.AnonymousClass0BH;
import X.AnonymousClass0BI;
import X.AnonymousClass0BJ;
import X.AnonymousClass0BK;
import X.AnonymousClass0BL;
import X.AnonymousClass0BM;
import X.AnonymousClass0BN;
import X.AnonymousClass0BO;
import X.AnonymousClass0Bo;
import X.AnonymousClass0Bs;
import X.AnonymousClass0Dc;
import X.AnonymousClass0cQ;
import X.AnonymousClass1Bc;
import X.AnonymousClass1Bi;
import X.AnonymousClass1Bj;
import X.AnonymousClass1Bl;
import X.AnonymousClass1Bm;
import X.AnonymousClass1Cn;
import X.AnonymousClass1Co;
import X.AnonymousClass1Cp;
import X.AnonymousClass1D6;
import X.AnonymousClass1D8;
import X.AnonymousClass1DD;
import X.AnonymousClass1DF;
import X.AnonymousClass1DG;
import X.AnonymousClass1DH;
import X.AnonymousClass1E1;
import X.AnonymousClass1E2;
import X.AnonymousClass1EC;
import X.AnonymousClass1JN;
import X.AnonymousClass1cH;
import X.AnonymousClass1iQ;
import X.AnonymousClass1iT;
import X.AnonymousClass1ia;
import X.AnonymousClass1ic;
import X.AnonymousClass1ie;
import X.AnonymousClass1ig;
import X.AnonymousClass1ik;
import X.AnonymousClass1il;
import X.AnonymousClass1in;
import X.AnonymousClass1ir;
import X.AnonymousClass1iu;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.push.fbns.ipc.FbnsAIDLRequest;
import com.facebook.push.fbns.ipc.FbnsAIDLResult;
import com.facebook.push.fbns.ipc.IFbnsAIDLService.Stub;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

public class FbnsService extends AnonymousClass1DD {
    /* renamed from: K */
    public static final List f15640K = new AnonymousClass1DF();
    /* renamed from: L */
    public static final List f15641L = new AnonymousClass1DH();
    /* renamed from: M */
    private static FbnsService f15642M;
    /* renamed from: B */
    public AnonymousClass08c f15643B;
    /* renamed from: C */
    public AnonymousClass0BC f15644C;
    /* renamed from: D */
    public AnonymousClass0BD f15645D;
    /* renamed from: E */
    public AnonymousClass08k f15646E;
    /* renamed from: F */
    public AnonymousClass0BL f15647F;
    /* renamed from: G */
    public AnonymousClass08l f15648G;
    /* renamed from: H */
    public AnonymousClass08o f15649H;
    /* renamed from: I */
    public AnonymousClass1Bi f15650I;
    /* renamed from: J */
    private final Stub f15651J = new C00483(this);

    /* renamed from: com.facebook.rti.push.service.FbnsService$3 */
    public final class C00483 extends Stub {
        /* renamed from: B */
        public final /* synthetic */ FbnsService f15674B;
        /* renamed from: C */
        private final Map f15675C;

        public C00483(FbnsService fbnsService) {
            this.f15674B = fbnsService;
            int I = AnonymousClass0cQ.m5859I(this, -1610380407);
            Map hashMap = new HashMap();
            this.f15675C = hashMap;
            AnonymousClass1EC anonymousClass1EC = AnonymousClass1EC.GET_PREF_BASED_CONFIG;
            AnonymousClass08d anonymousClass08d = AnonymousClass0BO.f1367D;
            hashMap.put(anonymousClass1EC, anonymousClass08d);
            this.f15675C.put(AnonymousClass1EC.SET_PREF_BASED_CONFIG, anonymousClass08d);
            Map map = this.f15675C;
            AnonymousClass1EC anonymousClass1EC2 = AnonymousClass1EC.GET_APPS_STATISTICS;
            map.put(anonymousClass1EC2, new AnonymousClass0B8());
            Map map2 = this.f15675C;
            anonymousClass08d = AnonymousClass0BO.f1366C;
            map2.put(anonymousClass1EC2, anonymousClass08d);
            this.f15675C.put(AnonymousClass1EC.GET_ANALYTICS_CONFIG, anonymousClass08d);
            this.f15675C.put(AnonymousClass1EC.SET_ANALYTICS_CONFIG, anonymousClass08d);
            this.f15675C.put(AnonymousClass1EC.GET_FLYTRAP_REPORT, new AnonymousClass0BM());
            AnonymousClass0cQ.m5858H(this, 887030966, I);
        }

        /* renamed from: B */
        private AnonymousClass08d m10049B(FbnsAIDLRequest fbnsAIDLRequest, boolean z) {
            int I = AnonymousClass0cQ.m5859I(this, -1209262015);
            if (fbnsAIDLRequest == null || fbnsAIDLRequest.f15845B < 0) {
                AnonymousClass0Dc.m1243F("FbnsService", "Invalid FbnsAIDLRequest");
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("FbnsService received invalid FbnsAIDLRequest");
                AnonymousClass0cQ.m5858H(this, -81278191, I);
                throw illegalArgumentException;
            }
            AnonymousClass1EC B = AnonymousClass1EC.m10175B(fbnsAIDLRequest.f15845B);
            if (B == AnonymousClass1EC.NOT_EXIST) {
                illegalArgumentException = new IllegalArgumentException("FbnsService operation not found");
                AnonymousClass0cQ.m5858H(this, 1808603397, I);
                throw illegalArgumentException;
            } else if (B.m10176A() == z) {
                AnonymousClass08d anonymousClass08d = (AnonymousClass08d) this.f15675C.get(B);
                if (anonymousClass08d != null) {
                    AnonymousClass0cQ.m5858H(this, -2098459803, I);
                    return anonymousClass08d;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("FbnsService does not implement operation");
                stringBuilder.append(B);
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(stringBuilder.toString());
                AnonymousClass0cQ.m5858H(this, -1264357490, I);
                throw illegalArgumentException2;
            } else {
                AnonymousClass0Dc.m1243F("FbnsService", "FbnsAIDLOperation incorrect return type");
                illegalArgumentException = new IllegalArgumentException("FbnsService operation incorrect return type");
                AnonymousClass0cQ.m5858H(this, 1328292942, I);
                throw illegalArgumentException;
            }
        }

        public final FbnsAIDLResult WIA(FbnsAIDLRequest fbnsAIDLRequest) {
            int I = AnonymousClass0cQ.m5859I(this, -242637195);
            FbnsAIDLResult fbnsAIDLResult = new FbnsAIDLResult(m10049B(fbnsAIDLRequest, true).lG(this.f15674B, fbnsAIDLRequest.m10173A()));
            AnonymousClass0cQ.m5858H(this, -1500551814, I);
            return fbnsAIDLResult;
        }

        public final void tVA(FbnsAIDLRequest fbnsAIDLRequest) {
            int I = AnonymousClass0cQ.m5859I(this, 809272888);
            m10049B(fbnsAIDLRequest, false).nG(this.f15674B, fbnsAIDLRequest.m10173A());
            AnonymousClass0cQ.m5858H(this, -1208654520, I);
        }
    }

    /* renamed from: J */
    public final String mo2221J() {
        return "FBNS_ALWAYS";
    }

    /* renamed from: B */
    public static final Intent m9978B(String str, String str2, String str3) {
        Intent intent = new Intent("com.facebook.rti.fbns.intent.RECEIVE");
        intent.setPackage(str);
        intent.addCategory(str);
        intent.putExtra("receive_type", str2);
        if (str3 != null) {
            intent.putExtra("data", str3);
        }
        return intent;
    }

    /* renamed from: B */
    public final void mo2217B() {
        super.mo2217B();
        if (f15642M == this) {
            f15642M = null;
        }
    }

    /* renamed from: C */
    public static String m9979C(String str) {
        if (AnonymousClass1Co.m9934G(str) != null) {
            return "com.facebook.oxygen.services.fbns.PreloadedFbnsService";
        }
        return FbnsService.class.getName();
    }

    /* renamed from: C */
    public final void mo2218C(java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
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
        r5 = this;
        r0 = "[ FbnsService ]";	 Catch:{ Exception -> 0x00c5 }
        r7.println(r0);	 Catch:{ Exception -> 0x00c5 }
        r4 = new java.util.ArrayList;	 Catch:{ Exception -> 0x00c5 }
        r4.<init>();	 Catch:{ Exception -> 0x00c5 }
        r3 = new java.util.ArrayList;	 Catch:{ Exception -> 0x00c5 }
        r3.<init>();	 Catch:{ Exception -> 0x00c5 }
        r5.m10008b(r4, r3);	 Catch:{ Exception -> 0x00c5 }
        r2 = new java.util.ArrayList;	 Catch:{ Exception -> 0x00c5 }
        r2.<init>();	 Catch:{ Exception -> 0x00c5 }
        r5.m10009c(r2);	 Catch:{ Exception -> 0x00c5 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00c5 }
        r1.<init>();	 Catch:{ Exception -> 0x00c5 }
        r0 = "validCompatibleApps=";	 Catch:{ Exception -> 0x00c5 }
        r1.append(r0);	 Catch:{ Exception -> 0x00c5 }
        r1.append(r4);	 Catch:{ Exception -> 0x00c5 }
        r0 = r1.toString();	 Catch:{ Exception -> 0x00c5 }
        r7.println(r0);	 Catch:{ Exception -> 0x00c5 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00c5 }
        r1.<init>();	 Catch:{ Exception -> 0x00c5 }
        r0 = "enabledCompatibleApps=";	 Catch:{ Exception -> 0x00c5 }
        r1.append(r0);	 Catch:{ Exception -> 0x00c5 }
        r1.append(r3);	 Catch:{ Exception -> 0x00c5 }
        r0 = r1.toString();	 Catch:{ Exception -> 0x00c5 }
        r7.println(r0);	 Catch:{ Exception -> 0x00c5 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00c5 }
        r1.<init>();	 Catch:{ Exception -> 0x00c5 }
        r0 = "registeredApps=";	 Catch:{ Exception -> 0x00c5 }
        r1.append(r0);	 Catch:{ Exception -> 0x00c5 }
        r1.append(r2);	 Catch:{ Exception -> 0x00c5 }
        r0 = r1.toString();	 Catch:{ Exception -> 0x00c5 }
        r7.println(r0);	 Catch:{ Exception -> 0x00c5 }
        r0 = X.AnonymousClass1D6.f15631E;	 Catch:{ Exception -> 0x00c5 }
        r3 = X.AnonymousClass1D6.m9967B(r5, r0);	 Catch:{ Exception -> 0x00c5 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00c5 }
        r1.<init>();	 Catch:{ Exception -> 0x00c5 }
        r0 = "leaderPackage=";	 Catch:{ Exception -> 0x00c5 }
        r1.append(r0);	 Catch:{ Exception -> 0x00c5 }
        r0 = "leader_package";	 Catch:{ Exception -> 0x00c5 }
        r2 = "N/A";	 Catch:{ Exception -> 0x00c5 }
        r0 = r3.getString(r0, r2);	 Catch:{ Exception -> 0x00c5 }
        r1.append(r0);	 Catch:{ Exception -> 0x00c5 }
        r0 = r1.toString();	 Catch:{ Exception -> 0x00c5 }
        r7.println(r0);	 Catch:{ Exception -> 0x00c5 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00c5 }
        r1.<init>();	 Catch:{ Exception -> 0x00c5 }
        r0 = "sharedStatus=";	 Catch:{ Exception -> 0x00c5 }
        r1.append(r0);	 Catch:{ Exception -> 0x00c5 }
        r0 = "shared_status";	 Catch:{ Exception -> 0x00c5 }
        r0 = r3.getString(r0, r2);	 Catch:{ Exception -> 0x00c5 }
        r1.append(r0);	 Catch:{ Exception -> 0x00c5 }
        r0 = r1.toString();	 Catch:{ Exception -> 0x00c5 }
        r7.println(r0);	 Catch:{ Exception -> 0x00c5 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00c5 }
        r2.<init>();	 Catch:{ Exception -> 0x00c5 }
        r0 = "sharingEnabled=";	 Catch:{ Exception -> 0x00c5 }
        r2.append(r0);	 Catch:{ Exception -> 0x00c5 }
        r1 = "sharing_state_enabled";	 Catch:{ Exception -> 0x00c5 }
        r0 = 0;	 Catch:{ Exception -> 0x00c5 }
        r0 = r3.getBoolean(r1, r0);	 Catch:{ Exception -> 0x00c5 }
        r2.append(r0);	 Catch:{ Exception -> 0x00c5 }
        r0 = r2.toString();	 Catch:{ Exception -> 0x00c5 }
        r7.println(r0);	 Catch:{ Exception -> 0x00c5 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00c5 }
        r1.<init>();	 Catch:{ Exception -> 0x00c5 }
        r0 = "notificationCounter=";	 Catch:{ Exception -> 0x00c5 }
        r1.append(r0);	 Catch:{ Exception -> 0x00c5 }
        r0 = r5.f15662L;	 Catch:{ Exception -> 0x00c5 }
        r0 = r0.f21861E;	 Catch:{ Exception -> 0x00c5 }
        r1.append(r0);	 Catch:{ Exception -> 0x00c5 }
        r0 = r1.toString();	 Catch:{ Exception -> 0x00c5 }
        r7.println(r0);	 Catch:{ Exception -> 0x00c5 }
    L_0x00c5:
        super.mo2218C(r6, r7, r8);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.push.service.FbnsService.C(java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    /* renamed from: D */
    public static void m9980D(FbnsService fbnsService, AnonymousClass08Z anonymousClass08Z, AnonymousClass08h anonymousClass08h, String str) {
        AnonymousClass08c anonymousClass08c = fbnsService.f15643B;
        AnonymousClass08h anonymousClass08h2 = anonymousClass08h;
        String str2 = anonymousClass08h2.f982D;
        String str3 = anonymousClass08h2.f984F;
        long j = fbnsService.f15654D;
        boolean A = fbnsService.f15666P.m416A();
        long j2 = fbnsService.f15666P.f402D.get();
        Map D = AnonymousClass05g.m343D("event_type", anonymousClass08Z.name());
        String str4 = str;
        if (!AnonymousClass1Cn.m9924D(str4)) {
            D.put("event_extra_info", str4);
        }
        if (!AnonymousClass1Cn.m9924D(str2)) {
            D.put(TraceFieldType.IsBuffered, str2);
        }
        if (!AnonymousClass1Cn.m9924D(str3)) {
            D.put("dpn", str3);
        }
        long now = anonymousClass08c.f968B.now();
        D.put("s_boot_ms", String.valueOf(now));
        D.put("s_svc_ms", String.valueOf(now - anonymousClass08c.f969C));
        D.put("s_mqtt_ms", String.valueOf(now - j));
        D.put("s_net_ms", String.valueOf(now - anonymousClass08c.f970D.m412E()));
        if (j2 > 0) {
            D.put("is_scr_on", String.valueOf(A));
            D.put("s_scr_ms", String.valueOf(now - j2));
        }
        anonymousClass08c.m528B("fbns_message_event", D);
    }

    /* renamed from: E */
    public static void m9981E(FbnsService fbnsService, AnonymousClass08j anonymousClass08j) {
        if (AnonymousClass1Cn.m9924D(anonymousClass08j.f990C)) {
            AnonymousClass0Dc.m1243F("FbnsService", "service/register/response/empty_package");
        } else {
            fbnsService.f15649H.m548D(anonymousClass08j.f990C);
        }
    }

    /* renamed from: F */
    public static void m9982F(FbnsService fbnsService, AnonymousClass08j anonymousClass08j) {
        if (AnonymousClass1Cn.m9924D(anonymousClass08j.f990C)) {
            AnonymousClass0Dc.m1243F("FbnsService", "service/register/response/invalid");
            fbnsService.f15643B.m530D(AnonymousClass08a.FAILURE_SERVER_RESPOND_WITH_INVALID_PACKAGE_NAME, null);
        } else if (AnonymousClass1Cn.m9924D(anonymousClass08j.f991D)) {
            AnonymousClass0Dc.m1243F("FbnsService", "service/register/response/empty_token");
            fbnsService.f15643B.m530D(AnonymousClass08a.FAILURE_SERVER_RESPOND_WITH_INVALID_TOKEN, null);
        } else {
            if (fbnsService.f15649H.m549E(anonymousClass08j.f990C, anonymousClass08j.f991D)) {
                m9986J(fbnsService, anonymousClass08j.f990C, anonymousClass08j.f991D);
                fbnsService.f15643B.m530D(AnonymousClass08a.RESPONSE_RECEIVED, null);
            } else {
                AnonymousClass0Dc.m1243F("FbnsService", "service/register/response/cache_update_failed");
                fbnsService.f15643B.m530D(AnonymousClass08a.FAILURE_CACHE_UPDATE, anonymousClass08j.f990C);
            }
        }
    }

    /* renamed from: G */
    public final AnonymousClass1in mo2219G() {
        AnonymousClass1DD anonymousClass1DD = f15642M;
        if (anonymousClass1DD != null) {
            anonymousClass1DD.m10021H();
        }
        f15642M = this;
        this.f15644C = new AnonymousClass0BC(getApplicationContext());
        AnonymousClass0BG anonymousClass0BG = new AnonymousClass0BG(this);
        AnonymousClass0BH anonymousClass0BH = new AnonymousClass0BH(this);
        AnonymousClass0BI anonymousClass0BI = new AnonymousClass0BI(this);
        AnonymousClass1Bi anonymousClass1Bi = new AnonymousClass1Bi(this, null);
        AnonymousClass0BL anonymousClass0BL = new AnonymousClass0BL(this, new AnonymousClass08p(this, new AnonymousClass08r(this, anonymousClass1Bi, AnonymousClass0AJ.f1182B)));
        AnonymousClass1iT anonymousClass0BA = new AnonymousClass0BA(this);
        AnonymousClass0As anonymousClass0As = new AnonymousClass0As();
        AnonymousClass1in anonymousClass0B9 = new AnonymousClass0B9();
        SharedPreferences B = AnonymousClass1D6.m9967B(this, AnonymousClass1D6.f15628B);
        int L = m9988L(B);
        int M = m9989M(B);
        Long K = m9987K(B);
        Integer.valueOf(M);
        Integer.valueOf(L);
        boolean z = new Random().nextInt(10000) < M;
        AnonymousClass0BJ anonymousClass0BJ = new AnonymousClass0BJ(r0, B.getBoolean(AnonymousClass1E2.LOG_ANALYTICS_EVENTS.m10142B(), false), B);
        String L2 = m10025L();
        AnonymousClass0BK anonymousClass0BK = new AnonymousClass0BK(r0, anonymousClass0BA);
        String HL = anonymousClass0BL.HL();
        String str = "567310203415052";
        String ZI = anonymousClass0BL.ZI();
        AnonymousClass1E1 B2 = AnonymousClass1E1.m10139B(r0);
        AnonymousClass06G anonymousClass06G = new AnonymousClass06G(r0, B2, ZI);
        AnonymousClass0AC anonymousClass0AC = new AnonymousClass0AC(r0, L2, anonymousClass0BK, anonymousClass0BJ, B, new AnonymousClass0AB(HL), anonymousClass06G.m385A(), B2.f15815C, B2.f15814B, "725056107548211", "0e20c3123a90c76c02c901b7415ff67f", str);
        AnonymousClass1ic K2 = mo2222K();
        AnonymousClass1ia anonymousClass1ia = new AnonymousClass1ia();
        AnonymousClass1iQ anonymousClass1iQ = r0.f15652B;
        AnonymousClass0BN anonymousClass0BN = new AnonymousClass0BN(r0);
        AnonymousClass1ie anonymousClass0B2 = new AnonymousClass0B2();
        Handler handler = new Handler(Looper.getMainLooper());
        AnonymousClass1ig anonymousClass1ig = new AnonymousClass1ig();
        AnonymousClass0BC anonymousClass0BC = r0.f15644C;
        anonymousClass0B9.m766C(anonymousClass0BL, anonymousClass1Bi, new AnonymousClass1il(r0, K2, anonymousClass1ia, anonymousClass1iQ, anonymousClass0BL, anonymousClass0BN, anonymousClass0B2, anonymousClass0BA, null, anonymousClass0BG, handler, anonymousClass1ig, anonymousClass0As, null, anonymousClass0AC, null, anonymousClass0BI, anonymousClass0BH, false, new AnonymousClass0BB(anonymousClass0BA), new AnonymousClass1ik(), null, str, anonymousClass0BI, new AnonymousClass0Bs(r0, r0), false, false, z, false, false, false, null, false, anonymousClass0BC, false, null, false, false, false, 0, false, false, -1, -1, 0, false, -1, K, false, false, false, false));
        return anonymousClass0B9;
    }

    /* renamed from: G */
    public static void m9983G(FbnsService fbnsService, Intent intent) {
        String str = intent.getPackage();
        if (!AnonymousClass1Cn.m9924D(str)) {
            if (str.equals(fbnsService.getPackageName()) || fbnsService.f15650I.m9862D(str)) {
                fbnsService.f15650I.m9863E(intent, str);
                return;
            }
            String B = fbnsService.f15649H.m546B(str);
            if (B != null) {
                m9985I(fbnsService, B, str);
            }
        }
    }

    /* renamed from: H */
    public static void m9984H(com.facebook.rti.push.service.FbnsService r11, java.lang.String r12, java.lang.String r13, X.AnonymousClass1JN r14) {
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
        r0 = r11.f15655E;
        r0 = r0.f21705K;
        if (r0 == 0) goto L_0x0064;
    L_0x0006:
        r0 = r11.f15649H;
        r0 = X.AnonymousClass08o.m542D(r0);
        r9 = r13;
        r0 = X.AnonymousClass08o.m540B(r13, r0);
        r5 = new X.08g;
        r4 = 0;
        if (r0 == 0) goto L_0x0019;
    L_0x0016:
        r7 = r0.f1006F;
        goto L_0x001a;
    L_0x0019:
        r7 = r4;
    L_0x001a:
        if (r0 == 0) goto L_0x001f;
    L_0x001c:
        r8 = r0.f1002B;
        goto L_0x0020;
    L_0x001f:
        r8 = r4;
    L_0x0020:
        r6 = r12;
        r10 = r14;
        r5.<init>(r6, r7, r8, r9, r10);
        r2 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0063 }
        r2.<init>();	 Catch:{ JSONException -> 0x0063 }
        r1 = "nid";	 Catch:{ JSONException -> 0x0063 }
        r0 = r5.f976C;	 Catch:{ JSONException -> 0x0063 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0063 }
        r1 = "t";	 Catch:{ JSONException -> 0x0063 }
        r0 = r5.f979F;	 Catch:{ JSONException -> 0x0063 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0063 }
        r1 = "aid";	 Catch:{ JSONException -> 0x0063 }
        r0 = r5.f975B;	 Catch:{ JSONException -> 0x0063 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0063 }
        r1 = "pn";	 Catch:{ JSONException -> 0x0063 }
        r0 = r5.f977D;	 Catch:{ JSONException -> 0x0063 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0063 }
        r1 = "r";	 Catch:{ JSONException -> 0x0063 }
        r0 = r5.f978E;	 Catch:{ JSONException -> 0x0063 }
        r0 = r0.name();	 Catch:{ JSONException -> 0x0063 }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x0063 }
        r0 = r2.toString();	 Catch:{ JSONException -> 0x0063 }
        r3 = r11.f15655E;	 Catch:{ 1j3 -> 0x0064 }
        r2 = "/fbns_msg_ack";	 Catch:{ 1j3 -> 0x0064 }
        r1 = X.AnonymousClass1Cn.m9927G(r0);	 Catch:{ 1j3 -> 0x0064 }
        r0 = X.AnonymousClass1iz.FIRE_AND_FORGET;	 Catch:{ 1j3 -> 0x0064 }
        r3.m12695K(r2, r1, r0, r4);	 Catch:{ 1j3 -> 0x0064 }
        goto L_0x0064;	 Catch:{ 1j3 -> 0x0064 }
    L_0x0063:
        return;
    L_0x0064:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.push.service.FbnsService.H(com.facebook.rti.push.service.FbnsService, java.lang.String, java.lang.String, X.1JN):void");
    }

    /* renamed from: I */
    public final void mo2220I(Intent intent, AnonymousClass1Bc anonymousClass1Bc) {
        super.mo2220I(intent, anonymousClass1Bc);
        if (m9991O(intent)) {
            String action = intent.getAction();
            if ("com.facebook.rti.fbns.intent.REGISTER".equals(action)) {
                m10037Y(AnonymousClass06I.FBNS_REGISTER, anonymousClass1Bc);
                m10010d(intent);
            } else if ("com.facebook.rti.fbns.intent.REGISTER_RETRY".equals(action)) {
                m10037Y(AnonymousClass06I.FBNS_REGISTER_RETRY, anonymousClass1Bc);
                m10011e(intent.getStringExtra("pkg_name"), intent.getStringExtra("appid"), intent.getComponent().getClassName());
            } else if ("com.facebook.rti.fbns.intent.UNREGISTER".equals(action)) {
                m10037Y(AnonymousClass06I.FBNS_UNREGISTER, anonymousClass1Bc);
                String stringExtra = intent.getStringExtra("pkg_name");
                String B = this.f15649H.m546B(stringExtra);
                AnonymousClass08o anonymousClass08o = this.f15649H;
                AnonymousClass1DG.m10046B(AnonymousClass1Cn.m9924D(stringExtra) ^ true);
                SharedPreferences D = AnonymousClass08o.m542D(anonymousClass08o);
                AnonymousClass08n B2 = AnonymousClass08o.m540B(stringExtra, D);
                if (!(B2 == null || B2.f1003C)) {
                    B2.f1003C = true;
                    AnonymousClass08o.m543E(stringExtra, B2, D);
                }
                m9983G(this, m9978B(stringExtra, "unregistered", null));
                this.f15643B.m530D(AnonymousClass08a.UNREGISTER_CALLED, null);
                if (B != null) {
                    m9985I(this, B, stringExtra);
                }
            } else {
                AnonymousClass0Dc.m1243F("FbnsService", "service/doIntent/unrecognized_action");
                return;
            }
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            m10008b(arrayList, arrayList2);
            List arrayList3 = new ArrayList();
            m10009c(arrayList3);
            AnonymousClass1ir anonymousClass1ir = this.f15662L;
            anonymousClass1ir.f21865I = AnonymousClass1ir.m12714C(arrayList);
            anonymousClass1ir.f21860D = AnonymousClass1ir.m12714C(arrayList2);
            anonymousClass1ir.f21864H = AnonymousClass1ir.m12714C(arrayList3);
        }
    }

    /* renamed from: I */
    public static void m9985I(com.facebook.rti.push.service.FbnsService r7, java.lang.String r8, java.lang.String r9) {
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
        r3 = new X.08m;
        r3.<init>(r8, r9);
        r4 = 0;
        r2 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x003d }
        r2.<init>();	 Catch:{ JSONException -> 0x003d }
        r1 = "tk";	 Catch:{ JSONException -> 0x003d }
        r0 = r3.f1001C;	 Catch:{ JSONException -> 0x003d }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x003d }
        r1 = "pn";	 Catch:{ JSONException -> 0x003d }
        r0 = r3.f1000B;	 Catch:{ JSONException -> 0x003d }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x003d }
        r0 = r2.toString();	 Catch:{ JSONException -> 0x003d }
        r6 = new X.0BF;
        r6.<init>(r7);
        r5 = -1;
        r3 = r7.f15655E;	 Catch:{ 1j3 -> 0x0032 }
        r2 = "/fbns_unreg_req";	 Catch:{ 1j3 -> 0x0032 }
        r1 = X.AnonymousClass1Cn.m9927G(r0);	 Catch:{ 1j3 -> 0x0032 }
        r0 = X.AnonymousClass1iz.ACKNOWLEDGED_DELIVERY;	 Catch:{ 1j3 -> 0x0032 }
        r0 = r3.m12695K(r2, r1, r0, r6);	 Catch:{ 1j3 -> 0x0032 }
        goto L_0x0033;	 Catch:{ 1j3 -> 0x0032 }
    L_0x0032:
        r0 = -1;
    L_0x0033:
        if (r0 != r5) goto L_0x003c;
    L_0x0035:
        r1 = r7.f15643B;
        r0 = X.AnonymousClass08a.UNREGISTER_FAILURE_MQTT_NOT_CONNECTED;
        r1.m530D(r0, r4);
    L_0x003c:
        return;
    L_0x003d:
        r3 = move-exception;
        r2 = "FbnsService";
        r1 = "service/unregister/serialization_exception";
        r0 = 0;
        r0 = new java.lang.Object[r0];
        X.AnonymousClass0Dc.m1246I(r2, r3, r1, r0);
        r1 = r7.f15643B;
        r0 = X.AnonymousClass08a.FAILURE_UNKNOWN_CLIENT_ERROR;
        r1.m530D(r0, r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.push.service.FbnsService.I(com.facebook.rti.push.service.FbnsService, java.lang.String, java.lang.String):void");
    }

    /* renamed from: J */
    private static void m9986J(FbnsService fbnsService, String str, String str2) {
        fbnsService.f15646E.m535A(str);
        m9983G(fbnsService, m9978B(str, "registered", str2));
    }

    /* renamed from: K */
    public final AnonymousClass1ic mo2222K() {
        return AnonymousClass1ic.FBNS;
    }

    /* renamed from: K */
    private static java.lang.Long m9987K(android.content.SharedPreferences r2) {
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
        r0 = X.AnonymousClass1E2.ANALYTIC_FB_UID;	 Catch:{ NumberFormatException -> 0x0014 }
        r1 = r0.m10142B();	 Catch:{ NumberFormatException -> 0x0014 }
        r0 = 0;	 Catch:{ NumberFormatException -> 0x0014 }
        r0 = r2.getString(r1, r0);	 Catch:{ NumberFormatException -> 0x0014 }
        r0 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x0014 }
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ NumberFormatException -> 0x0014 }
        return r0;	 Catch:{ NumberFormatException -> 0x0014 }
    L_0x0014:
        r0 = -1;
        r0 = java.lang.Long.valueOf(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.push.service.FbnsService.K(android.content.SharedPreferences):java.lang.Long");
    }

    /* renamed from: L */
    private int m9988L(SharedPreferences sharedPreferences) {
        int intValue = ((Integer) AnonymousClass1E2.LOGGING_ANALYTICS_EVENTS_SAMPLE_RATE.m10141A(sharedPreferences, Integer.valueOf(-1))).intValue();
        if (intValue >= 0) {
            if (intValue <= 10000) {
                return intValue;
            }
        }
        boolean A = AnonymousClass1E1.m10139B(this).m10140A();
        boolean z = true;
        int i = !A ? 10000 : 1;
        if (new Random().nextInt(10000) >= i) {
            z = false;
        }
        Integer.valueOf(intValue);
        Integer.valueOf(i);
        Boolean.valueOf(z);
        Editor edit = sharedPreferences.edit();
        AnonymousClass1E2.LOGGING_ANALYTICS_EVENTS_SAMPLE_RATE.m10144D(edit, Integer.valueOf(i));
        AnonymousClass1E2.LOG_ANALYTICS_EVENTS.m10144D(edit, Boolean.valueOf(z));
        AnonymousClass1D8.m9968B(edit);
        return i;
    }

    /* renamed from: M */
    private int m9989M(SharedPreferences sharedPreferences) {
        int intValue = ((Integer) AnonymousClass1E2.LOGGING_HEALTH_STATS_SAMPLE_RATE.m10141A(sharedPreferences, Integer.valueOf(-1))).intValue();
        int i = 10000;
        if (intValue >= 0) {
            if (intValue <= 10000) {
                return intValue;
            }
        }
        if (AnonymousClass1E1.m10139B(this).m10140A()) {
            i = 1;
        }
        Integer.valueOf(intValue);
        Integer.valueOf(i);
        Editor edit = sharedPreferences.edit();
        AnonymousClass1E2.LOGGING_HEALTH_STATS_SAMPLE_RATE.m10144D(edit, Integer.valueOf(i));
        AnonymousClass1D8.m9968B(edit);
        return i;
    }

    /* renamed from: M */
    public final void mo2223M() {
        super.mo2223M();
        AnonymousClass1ir anonymousClass1ir = this.f15662L;
        this.f15645D.m12123A();
        anonymousClass1ir.f21863G = "S";
        if (this.f15647F != null) {
            boolean z = AnonymousClass1D6.m9967B(this, AnonymousClass1D6.f15631E).getBoolean("sharing_state_enabled", false);
            AnonymousClass0BL anonymousClass0BL = this.f15647F;
            if (z) {
                AnonymousClass08p anonymousClass08p = anonymousClass0BL.f1361B;
                anonymousClass08p.f1009B.m552A(anonymousClass0BL.f1362C);
            }
            AnonymousClass070 A = anonymousClass0BL.f1361B.m550A();
            if (!A.m427C() && anonymousClass0BL.wVA(A)) {
                anonymousClass0BL.f1363D.mo2227S();
            }
        }
    }

    /* renamed from: N */
    public final void mo2224N() {
        super.mo2224N();
        AnonymousClass0B9 anonymousClass0B9 = (AnonymousClass0B9) this.f15659I;
        AnonymousClass08o anonymousClass08o = anonymousClass0B9.f1341E;
        AnonymousClass08c anonymousClass08c = anonymousClass0B9.f1338B;
        AnonymousClass08k anonymousClass08k = anonymousClass0B9.f1339C;
        AnonymousClass1Bi anonymousClass1Bi = anonymousClass0B9.f1342F;
        AnonymousClass0BL anonymousClass0BL = anonymousClass0B9.f1340D;
        AnonymousClass0BD anonymousClass0BD = new AnonymousClass0BD(this, anonymousClass0B9.f1342F, anonymousClass0B9.f21815D);
        this.f15649H = anonymousClass08o;
        this.f15643B = anonymousClass08c;
        this.f15646E = anonymousClass08k;
        this.f15648G = new AnonymousClass08l();
        this.f15650I = anonymousClass1Bi;
        this.f15647F = anonymousClass0BL;
        this.f15645D = anonymousClass0BD;
    }

    /* renamed from: N */
    private void m9990N(String str) {
        AnonymousClass08h B = AnonymousClass08h.m533B(str);
        m9980D(this, AnonymousClass08Z.NOTIFICATION_RECEIVED, B, B.f983E);
        AnonymousClass0BC anonymousClass0BC = this.f15644C;
        StringBuilder stringBuilder = new StringBuilder("===Received Notif: target = ");
        stringBuilder.append(B.f984F);
        stringBuilder.append("; notifId = ");
        stringBuilder.append(B.f983E);
        anonymousClass0BC.UZ(stringBuilder.toString());
        if (AnonymousClass08l.m537B(this.f15648G, B)) {
            m9984H(this, B.f983E, B.f984F, AnonymousClass1JN.NOTIF_DUPED);
            m9980D(this, AnonymousClass08Z.DUPLICATED_NOTIFICATION, B, B.f983E);
            anonymousClass0BC = this.f15644C;
            stringBuilder = new StringBuilder("Duplicated Notif: notifId = ");
            stringBuilder.append(B.f983E);
            anonymousClass0BC.UZ(stringBuilder.toString());
            return;
        }
        Intent B2 = m9978B(B.f984F, "message", B.f985G);
        if (!AnonymousClass1Cn.m9924D(B.f986H)) {
            B2.putExtra("token", B.f986H);
        }
        if (!AnonymousClass1Cn.m9924D(B.f980B)) {
            B2.putExtra("collapse_key", B.f980B);
        }
        AnonymousClass1JN F = this.f15645D.m776F(B.f983E, B2);
        if (!F.m10690B()) {
            if (F == AnonymousClass1JN.PACKAGE_UNSUPPORTED) {
                if (getBaseContext().getPackageName().equals(B.f984F)) {
                    this.f15650I.m9863E(B2, B.f984F);
                }
                m9984H(this, B.f983E, B.f984F, F);
            }
            String name = F.name();
            m9980D(this, AnonymousClass08Z.DELIVERYHELPER_FAILED, B, name);
            anonymousClass0BC = this.f15644C;
            stringBuilder = new StringBuilder("Error: Delivery helper failed notifId = ");
            stringBuilder.append(B.f983E);
            stringBuilder.append("; reason = ");
            stringBuilder.append(name);
            anonymousClass0BC.UZ(stringBuilder.toString());
        }
        AnonymousClass1ir anonymousClass1ir = this.f15662L;
        String str2 = B.f984F;
        anonymousClass1ir.f21861E.putIfAbsent(str2, new AtomicLong());
        ((AtomicLong) anonymousClass1ir.f21861E.get(str2)).incrementAndGet();
    }

    /* renamed from: O */
    private boolean m9991O(Intent intent) {
        String action = intent.getAction();
        if ("com.facebook.rti.fbns.intent.REGISTER".equals(action) || "com.facebook.rti.fbns.intent.REGISTER_RETRY".equals(action) || "com.facebook.rti.fbns.intent.UNREGISTER".equals(action)) {
            String stringExtra = intent.getStringExtra("pkg_name");
            String B = AnonymousClass1Bi.m9858B(intent);
            if (AnonymousClass1Cn.m9924D(stringExtra)) {
                AnonymousClass0Dc.m1255R("FbnsService", "Empty package name for %s from %s", action, B);
                this.f15643B.m531E(AnonymousClass08a.FAILURE_EMPTY_PACKAGE_NAME, action, B, stringExtra);
                return false;
            }
            if ("com.facebook.rti.fbns.intent.REGISTER_RETRY".equals(action)) {
                stringExtra = getPackageName();
            }
            if (!stringExtra.equals(B)) {
                AnonymousClass0Dc.m1255R("FbnsService", "Package mismatch for %s from %s: packageName %s", action, B, stringExtra);
                this.f15643B.m531E(AnonymousClass08a.FAILURE_PACKAGE_DOES_NOT_MATCH_INTENT, action, B, stringExtra);
                return false;
            }
        }
        return true;
    }

    /* renamed from: P */
    public final boolean mo2225P(Intent intent) {
        if (intent != null) {
            if (!getPackageName().equals(AnonymousClass1Bi.m9858B(intent))) {
                this.f15643B.m527A(intent.toString());
                return false;
            }
        }
        return true;
    }

    /* renamed from: R */
    public final void mo2226R(AnonymousClass1iu anonymousClass1iu) {
        if (AnonymousClass1iu.FAILED_CONNECTION_REFUSED_BAD_USER_NAME_OR_PASSWORD.equals(anonymousClass1iu)) {
            AnonymousClass08o anonymousClass08o = this.f15649H;
            if ((anonymousClass08o.f1007B.m687A() - AnonymousClass08o.m541C(anonymousClass08o).getLong("auto_reg_retry", 0) > 86400000 ? 1 : null) != null) {
                AnonymousClass08o anonymousClass08o2 = this.f15649H;
                AnonymousClass1D8.m9968B(AnonymousClass08o.m541C(anonymousClass08o2).edit().putLong("auto_reg_retry", anonymousClass08o2.f1007B.m687A()));
                List<AnonymousClass08n> A = this.f15649H.m545A();
                this.f15649H.m547C();
                this.f15643B.m530D(AnonymousClass08a.AUTHFAIL_AUTO_REGISTER, String.valueOf(A.size()));
                for (AnonymousClass08n anonymousClass08n : A) {
                    Intent intent = new Intent("com.facebook.rti.fbns.intent.REGISTER");
                    intent.putExtra("pkg_name", anonymousClass08n.f1004D);
                    intent.putExtra("appid", anonymousClass08n.f1002B);
                    intent.setClassName(getPackageName(), getClass().getName());
                    m10010d(intent);
                }
            }
        }
    }

    /* renamed from: S */
    public final void mo2227S() {
        Boolean bool = null;
        Integer num = null;
        List<AnonymousClass08n> A = this.f15649H.m545A();
        this.f15649H.m547C();
        this.f15643B.m530D(AnonymousClass08a.CREDENTIALS_UPDATED, String.valueOf(A.size()));
        AnonymousClass0AG A2 = this.f15659I.f21822K.m685A(AnonymousClass061.RUNTIME_PARAMS);
        if (A2.m681A("CONNECTION_RETRY_FGBG")) {
            bool = Boolean.valueOf(A2.m683C("CONNECTION_RETRY_FGBG", false));
        }
        if (A2.m681A("DELIVERY_RETRY_INTERVAL")) {
            num = Integer.valueOf(A2.f1180B.getInt("DELIVERY_RETRY_INTERVAL", 300));
        }
        m10037Y(AnonymousClass06I.CREDENTIALS_UPDATED, new AnonymousClass1Bc(null, 0, bool, null, num));
        for (AnonymousClass08n anonymousClass08n : A) {
            Intent intent = new Intent("com.facebook.rti.fbns.intent.REGISTER");
            intent.putExtra("pkg_name", anonymousClass08n.f1004D);
            intent.putExtra("appid", anonymousClass08n.f1002B);
            intent.setClassName(getPackageName(), getClass().getName());
            m10010d(intent);
        }
    }

    /* renamed from: T */
    public final void mo2228T(AnonymousClass08A anonymousClass08A) {
        super.mo2228T(anonymousClass08A);
        AnonymousClass1cH anonymousClass1cH = this.f15645D;
        List<AnonymousClass07S> arrayList = new ArrayList();
        List<AnonymousClass07S> arrayList2 = new ArrayList();
        AnonymousClass0An A = anonymousClass1cH.m12123A();
        synchronized (A) {
            arrayList.clear();
            arrayList2.clear();
            Map all = A.f1291D.getAll();
            Editor edit = A.f1291D.edit();
            Object obj = null;
            for (Entry entry : all.entrySet()) {
                AnonymousClass07S B = AnonymousClass0Am.m710B(entry.getValue());
                if (B != null && B.f1287C + 86400000 >= A.f1289B.m687A()) {
                    if (B.f1287C <= A.f1289B.m687A()) {
                        if (B.f1286B + A.f1290C.get() < A.f1289B.m687A()) {
                            Long.valueOf(B.f1287C);
                            Long.valueOf(B.f1286B);
                            B.f1286B = A.f1289B.m687A();
                            arrayList.add(B);
                            edit.putString(B.f542C, B.m711A());
                            obj = 1;
                        }
                    }
                }
                edit.remove((String) entry.getKey());
                if (B != null) {
                    arrayList2.add(B);
                }
                obj = 1;
            }
            if (obj != null) {
                AnonymousClass0An.m712B(A, edit);
            }
        }
        for (AnonymousClass07S anonymousClass07S : arrayList2) {
            if (anonymousClass07S != null) {
                Intent intent = anonymousClass07S.f541B;
                if (intent != null) {
                    anonymousClass1cH.mo137C(anonymousClass07S.f542C, intent.getPackage(), AnonymousClass1JN.DATA_EXPIRED);
                }
            }
        }
        int i = 0;
        for (AnonymousClass07S B2 : arrayList) {
            anonymousClass1cH.mo138D(B2.f542C, B2.f541B);
            if (anonymousClass1cH.mo139E(B2)) {
                i++;
            }
        }
        ((AtomicLong) ((AnonymousClass0Bo) this.f15662L.m12720C(AnonymousClass0Bo.class)).m688A(AnonymousClass0AR.FbnsLiteNotificationDeliveryRetried)).addAndGet((long) i);
    }

    /* renamed from: U */
    public final void mo2229U(String str, byte[] bArr, int i, long j, AnonymousClass06D anonymousClass06D) {
        Throwable e;
        AnonymousClass0BC anonymousClass0BC;
        StringBuilder stringBuilder;
        super.mo2229U(str, bArr, i, j, anonymousClass06D);
        if (bArr == null) {
            AnonymousClass0Dc.m1245H("FbnsService", "receive/publish/empty_payload; topic=%s", str);
            anonymousClass06D.m377A();
            return;
        }
        AnonymousClass1Cn.m9923C(bArr);
        String str2 = null;
        try {
            str2 = AnonymousClass1Cn.m9923C(bArr);
            try {
                if (!"/fbns_msg".equals(str)) {
                    if (!"/fbns_msg_hp".equals(str)) {
                        if ("/fbns_reg_resp".equals(str)) {
                            AnonymousClass08j B = AnonymousClass08j.m534B(str2);
                            if (AnonymousClass1Cn.m9924D(B.f989B)) {
                                m9982F(this, B);
                            } else {
                                m9981E(this, B);
                                this.f15643B.m530D(AnonymousClass08a.FAILURE_SERVER_RESPOND_WITH_ERROR, B.f989B);
                            }
                        } else {
                            AnonymousClass0Dc.m1245H("FbnsService", "receive/publish/wrong_topic; topic=%s", str);
                            this.f15643B.m532F(AnonymousClass08b.UNEXPECTED_TOPIC, str);
                        }
                        anonymousClass06D.m377A();
                    }
                }
                m9990N(str2);
            } catch (JSONException e2) {
                e = e2;
                AnonymousClass0Dc.m1246I("FbnsService", e, "receive/publish/payload_exception; topic=%s", str);
                this.f15643B.m532F(AnonymousClass08b.JSON_PARSE_ERROR, str);
                anonymousClass0BC = this.f15644C;
                stringBuilder = new StringBuilder("Error: invalid payload = ");
                stringBuilder.append(str2);
                anonymousClass0BC.UZ(stringBuilder.toString());
                anonymousClass06D.m377A();
            }
        } catch (JSONException e3) {
            e = e3;
            AnonymousClass0Dc.m1246I("FbnsService", e, "receive/publish/payload_exception; topic=%s", str);
            this.f15643B.m532F(AnonymousClass08b.JSON_PARSE_ERROR, str);
            anonymousClass0BC = this.f15644C;
            stringBuilder = new StringBuilder("Error: invalid payload = ");
            stringBuilder.append(str2);
            anonymousClass0BC.UZ(stringBuilder.toString());
            anonymousClass06D.m377A();
        }
        anonymousClass06D.m377A();
    }

    /* renamed from: V */
    public final void mo2230V() {
        super.mo2230V();
        AnonymousClass1cH anonymousClass1cH = this.f15645D;
        if (anonymousClass1cH.f20615E == null) {
            anonymousClass1cH.f20615E = new AnonymousClass07P(anonymousClass1cH);
            anonymousClass1cH.f20614D.registerReceiver(anonymousClass1cH.f20615E, new IntentFilter("com.facebook.rti.intent.ACTION_NOTIFICATION_ACK"), null, null);
        }
    }

    /* renamed from: W */
    public final void mo2231W(int i) {
        this.f15645D.m12123A().f1290C.set(((long) i) * 1000);
    }

    /* renamed from: a */
    public final void mo2232a() {
        super.mo2232a();
        AnonymousClass1cH anonymousClass1cH = this.f15645D;
        BroadcastReceiver broadcastReceiver = anonymousClass1cH.f20615E;
        if (broadcastReceiver != null) {
            try {
                anonymousClass1cH.f20614D.unregisterReceiver(broadcastReceiver);
            } catch (Throwable e) {
                AnonymousClass0Dc.m1256S("NotificationDeliveryHelper", e, "Failed to unregister broadcast receiver", new Object[0]);
            }
            anonymousClass1cH.f20615E = null;
        }
    }

    /* renamed from: b */
    public final void m10008b(List list, List list2) {
        for (String B : AnonymousClass1Co.f15581B) {
            AnonymousClass1Bl B2 = AnonymousClass1Cp.m9936B(this, B, 64, AnonymousClass1Bj.f15443C);
            if (B2.f15447D == AnonymousClass1Bm.INSTALLED || B2.f15447D == AnonymousClass1Bm.DISABLED || B2.f15447D == AnonymousClass1Bm.TRUSTED) {
                list.add(B2.f15446C);
            }
            if (B2.f15447D == AnonymousClass1Bm.TRUSTED) {
                list2.add(B2.f15446C);
            }
        }
    }

    /* renamed from: c */
    public final synchronized void m10009c(ArrayList arrayList) {
        for (AnonymousClass08n anonymousClass08n : this.f15649H.m545A()) {
            arrayList.add(anonymousClass08n.f1004D);
        }
    }

    /* renamed from: d */
    public final void m10010d(Intent intent) {
        String stringExtra = intent.getStringExtra("pkg_name");
        String stringExtra2 = intent.getStringExtra("appid");
        this.f15646E.m535A(stringExtra);
        if (!this.f15667Q.get()) {
            AnonymousClass0Dc.m1243F("FbnsService", "service/register/not_started");
            this.f15643B.m530D(AnonymousClass08a.FAILURE_SERVICE_NOT_STARTED, null);
        }
        this.f15643B.m530D(AnonymousClass08a.REGISTER, stringExtra);
        String B = this.f15649H.m546B(stringExtra);
        if (AnonymousClass1Cn.m9924D(B)) {
            m10011e(stringExtra, stringExtra2, intent.getComponent().getClassName());
            return;
        }
        m9986J(this, stringExtra, B);
        this.f15643B.m530D(AnonymousClass08a.CACHE_HIT, null);
    }

    /* renamed from: e */
    public final void m10011e(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
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
        r7 = this;
        r0 = X.AnonymousClass1Cn.m9924D(r8);
        if (r0 != 0) goto L_0x007e;
    L_0x0006:
        r0 = X.AnonymousClass1Cn.m9924D(r9);
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        goto L_0x007e;
    L_0x000d:
        r0 = r7.f15646E;
        r0.m536B(r8, r9, r10);
        r3 = r7.f15649H;
        r0 = X.AnonymousClass1Cn.m9924D(r8);
        r0 = r0 ^ 1;
        X.AnonymousClass1DG.m10046B(r0);
        r0 = X.AnonymousClass1Cn.m9924D(r9);
        r0 = r0 ^ 1;
        X.AnonymousClass1DG.m10046B(r0);
        r2 = new X.08n;
        r2.<init>();
        r2.f1004D = r8;
        r2.f1002B = r9;
        r0 = r3.f1007B;
        r0 = r0.m687A();
        r0 = java.lang.Long.valueOf(r0);
        r2.f1005E = r0;
        r0 = X.AnonymousClass08o.m542D(r3);
        X.AnonymousClass08o.m543E(r8, r2, r0);
        r3 = new X.08i;
        r3.<init>(r8, r9);
        r4 = 0;
        r2 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x007f }
        r2.<init>();	 Catch:{ JSONException -> 0x007f }
        r1 = "pkg_name";	 Catch:{ JSONException -> 0x007f }
        r0 = r3.f988C;	 Catch:{ JSONException -> 0x007f }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x007f }
        r1 = "appid";	 Catch:{ JSONException -> 0x007f }
        r0 = r3.f987B;	 Catch:{ JSONException -> 0x007f }
        r2.putOpt(r1, r0);	 Catch:{ JSONException -> 0x007f }
        r0 = r2.toString();	 Catch:{ JSONException -> 0x007f }
        r6 = new X.0BE;
        r6.<init>(r7);
        r5 = -1;
        r3 = r7.f15655E;	 Catch:{ 1j3 -> 0x0074 }
        r2 = "/fbns_reg_req";	 Catch:{ 1j3 -> 0x0074 }
        r1 = X.AnonymousClass1Cn.m9927G(r0);	 Catch:{ 1j3 -> 0x0074 }
        r0 = X.AnonymousClass1iz.ACKNOWLEDGED_DELIVERY;	 Catch:{ 1j3 -> 0x0074 }
        r0 = r3.m12695K(r2, r1, r0, r6);	 Catch:{ 1j3 -> 0x0074 }
        goto L_0x0075;	 Catch:{ 1j3 -> 0x0074 }
    L_0x0074:
        r0 = -1;
    L_0x0075:
        if (r0 != r5) goto L_0x007e;
    L_0x0077:
        r1 = r7.f15643B;
        r0 = X.AnonymousClass08a.FAILURE_MQTT_NOT_CONNECTED;
        r1.m530D(r0, r4);
    L_0x007e:
        return;
    L_0x007f:
        r3 = move-exception;
        r2 = "FbnsService";
        r1 = "service/register/serialize_exception";
        r0 = 0;
        r0 = new java.lang.Object[r0];
        X.AnonymousClass0Dc.m1246I(r2, r3, r1, r0);
        r1 = r7.f15643B;
        r0 = X.AnonymousClass08a.FAILURE_UNKNOWN_CLIENT_ERROR;
        r1.m530D(r0, r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.push.service.FbnsService.e(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final IBinder onBind(Intent intent) {
        intent.toString();
        if (this.f15650I.m9867I(intent)) {
            return this.f15651J;
        }
        AnonymousClass0Dc.m1245H("FbnsService", "onBind invalid signature", intent.toString());
        this.f15643B.m527A(intent.toString());
        return null;
    }

    public final void onCreate() {
        int J = AnonymousClass0cQ.m5860J(this, -1022325934);
        super.onCreate();
        AnonymousClass0cQ.m5861K(this, -1752820605, J);
    }
}
