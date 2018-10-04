package com.instagram.process.instagram;

import X.AnonymousClass09c;
import X.AnonymousClass09d;
import X.AnonymousClass0CC;
import X.AnonymousClass0CH;
import X.AnonymousClass0Dv;
import X.AnonymousClass0Dw;
import X.AnonymousClass0Dx;
import X.AnonymousClass0Dy;
import X.AnonymousClass0Dz;
import X.AnonymousClass0E0;
import X.AnonymousClass0E1;
import X.AnonymousClass0E2;
import X.AnonymousClass0E3;
import X.AnonymousClass0E4;
import X.AnonymousClass0E5;
import X.AnonymousClass0E6;
import X.AnonymousClass0E7;
import X.AnonymousClass0E8;
import X.AnonymousClass0E9;
import X.AnonymousClass0EA;
import X.AnonymousClass0EB;
import X.AnonymousClass0EC;
import X.AnonymousClass0ED;
import X.AnonymousClass0EF;
import X.AnonymousClass0EG;
import X.AnonymousClass0EH;
import X.AnonymousClass55Q;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeClientManager.GraphQLSubscriptionsProvider;
import com.instagram.realtimeclient.RealtimeClientManager.RawSkywalkerSubscriptionsProvider;
import com.instagram.service.session.ShouldInitUserSession;
import com.instagram.share.handleractivity.CustomStoryShareHandlerActivity;
import com.instagram.share.handleractivity.StoryShareHandlerActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@ShouldInitUserSession
public class InstagramApplicationForMainProcess extends AnonymousClass0CH {
    private static boolean sInstanceAlreadyCreated;
    public final Context mContext;

    public InstagramApplicationForMainProcess(Context context) {
        ensureOnlyInstance();
        this.mContext = context;
    }

    private static synchronized void ensureOnlyInstance() {
        synchronized (InstagramApplicationForMainProcess.class) {
            if (sInstanceAlreadyCreated) {
                throw new IllegalStateException("Multiple instances of the Application object were created.");
            }
            sInstanceAlreadyCreated = true;
        }
    }

    public Object getAppService(Class cls) {
        if (AnonymousClass0EG.class.equals(cls)) {
            if (AnonymousClass0EG.f1960B == null) {
                AnonymousClass0EG.f1960B = new AnonymousClass0EG();
            }
            return AnonymousClass0EG.f1960B;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown service type ");
        stringBuilder.append(cls);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static GraphQLSubscriptionsProvider getGraphQLSubscriptionsProvider() {
        return new AnonymousClass0Dv();
    }

    private static RawSkywalkerSubscriptionsProvider getRawSkywalkerSubscriptionsProvider() {
        return new AnonymousClass0Dw();
    }

    private static List getRealtimeDelegateProviders() {
        return Collections.singletonList(new AnonymousClass0Dx());
    }

    public static List getRealtimeEventHandlerProviders() {
        List arrayList = new ArrayList();
        arrayList.add(new AnonymousClass0Dy());
        arrayList.add(new AnonymousClass0Dz());
        arrayList.add(new AnonymousClass0E0());
        arrayList.add(new AnonymousClass0E1());
        if (((Boolean) AnonymousClass0E6.m1317C(AnonymousClass0CC.Ia)).booleanValue()) {
            arrayList.add(new AnonymousClass0E2());
            arrayList.add(new AnonymousClass0E3());
        }
        arrayList.add(new AnonymousClass0E4());
        if (((Boolean) AnonymousClass0E6.m1317C(AnonymousClass0CC.f1480p)).booleanValue()) {
            arrayList.add(new AnonymousClass0E5());
        }
        arrayList.add(new AnonymousClass0E7());
        if (((Boolean) AnonymousClass0E6.m1317C(AnonymousClass0CC.NL)).booleanValue() || ((Boolean) AnonymousClass0E6.m1317C(AnonymousClass0CC.BL)).booleanValue()) {
            arrayList.add(new AnonymousClass09c());
        }
        arrayList.add(new AnonymousClass09d());
        return arrayList;
    }

    private void initPushNotifications(Context context) {
        AnonymousClass0E9 anonymousClass0E8 = new AnonymousClass0E8();
        AnonymousClass0EA.m1327G("live_broadcast", anonymousClass0E8);
        AnonymousClass0EA.m1327G("live_broadcast_revoke", anonymousClass0E8);
        AnonymousClass0EA.m1327G(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, new AnonymousClass0EB());
        AnonymousClass55Q.C().A("newstab", new AnonymousClass0EC(context));
        AnonymousClass55Q.C().A("iglive", new AnonymousClass0ED(context));
    }

    private static boolean isAppLauncherShortcutsEnabled() {
        return VERSION.SDK_INT >= 25 && ((Boolean) AnonymousClass0CC.BK.m845G()).booleanValue();
    }

    private void maybeEnableShareToStory() {
        AnonymousClass0EF.m1368S(this.mContext, StoryShareHandlerActivity.class.getCanonicalName(), ((Boolean) AnonymousClass0CC.Ch.m845G()).booleanValue());
        AnonymousClass0EF.m1368S(this.mContext, CustomStoryShareHandlerActivity.class.getCanonicalName(), ((Boolean) AnonymousClass0CC.Bh.m845G()).booleanValue());
    }

    public void onConfigurationChangedCallback(Configuration configuration) {
        AnonymousClass0EH.m1381K(this.mContext.getResources());
    }

    public final void onCreate(java.lang.String r55, long r56, long r58) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r54 = this;
        r1 = r55;
        r29 = r56;
        r8 = r58;
        r0 = r54;
        r2 = r29;
        r4 = r8;
        super.onCreate(r1, r2, r4);
        r0 = com.facebook.common.time.AwakeTimeSinceBootClock.get();
        r6 = r0.now();
        r1 = X.AnonymousClass0EI.m1383B();
        r0 = X.AnonymousClass0EK.ColdStart;
        r1.m1387A(r0);
        r0 = X.AnonymousClass0CC.we;
        r1 = X.AnonymousClass0CA.m829C(r0);
        r0 = -20;
        if (r1 <= r0) goto L_0x002c;
    L_0x0029:
        r16 = 1;
        goto L_0x002e;
    L_0x002c:
        r16 = 0;
    L_0x002e:
        r0 = android.os.Process.myTid();
        r27 = android.os.Process.getThreadPriority(r0);
        if (r16 == 0) goto L_0x003b;
    L_0x0038:
        android.os.Process.setThreadPriority(r1);
    L_0x003b:
        r0 = r54;
        r0 = r0.mContext;
        r1 = r0;
        r20 = new X.0EL;
        r20.<init>();
        r19 = new X.0EN;
        r19.<init>();
        r18 = new X.0EP;
        r18.<init>();
        r26 = getRawSkywalkerSubscriptionsProvider();
        r25 = getGraphQLSubscriptionsProvider();
        r22 = getRealtimeDelegateProviders();
        r21 = new X.0ER;
        r2 = r21;
        r3 = r54;
        r2.<init>(r3);
        r28 = "493186350727442";
        r23 = "1006803734412";
        r17 = new X.0ET;
        r0 = r17;
        r0.<init>();
        r24 = 2131755302; // 0x7f100126 float:1.914148E38 double:1.05322706E-314;
        r0 = X.AnonymousClass0CB.m840J();
        if (r0 == 0) goto L_0x007a;
    L_0x0078:
        r0 = 5;
        goto L_0x007b;
    L_0x007a:
        r0 = 2;
    L_0x007b:
        X.AnonymousClass0Dc.m1248K(r0);
        X.AnonymousClass0EV.f1977B = r1;
        r0 = X.AnonymousClass0CC.cP;
        r0 = X.AnonymousClass0CA.m828B(r0);
        if (r0 == 0) goto L_0x00aa;
    L_0x0088:
        r4 = X.AnonymousClass276.class;
        monitor-enter(r4);
        r0 = X.AnonymousClass276.f26093F;	 Catch:{ all -> 0x0ef8 }
        if (r0 != 0) goto L_0x00a2;	 Catch:{ all -> 0x0ef8 }
    L_0x008f:
        r3 = new X.276;	 Catch:{ all -> 0x0ef8 }
        r2 = android.preference.PreferenceManager.getDefaultSharedPreferences(r1);	 Catch:{ all -> 0x0ef8 }
        r0 = X.AnonymousClass0Gc.f2391B;	 Catch:{ all -> 0x0ef8 }
        r3.<init>(r2, r0);	 Catch:{ all -> 0x0ef8 }
        X.AnonymousClass276.f26093F = r3;	 Catch:{ all -> 0x0ef8 }
        r0 = X.AnonymousClass276.f26093F;	 Catch:{ all -> 0x0ef8 }
        java.lang.Thread.setDefaultUncaughtExceptionHandler(r0);	 Catch:{ all -> 0x0ef8 }
        goto L_0x00a9;	 Catch:{ all -> 0x0ef8 }
    L_0x00a2:
        r2 = X.AnonymousClass276.f26092E;	 Catch:{ all -> 0x0ef8 }
        r0 = "Trying to initialize InstacrashExceptionHandler twice";	 Catch:{ all -> 0x0ef8 }
        X.AnonymousClass0Dc.m1249L(r2, r0);	 Catch:{ all -> 0x0ef8 }
    L_0x00a9:
        monitor-exit(r4);
    L_0x00aa:
        r0 = X.AnonymousClass0CB.m838H();
        X.AnonymousClass0CF.m854C(r1, r0);
        r0 = "gnustl_shared";	 Catch:{ Throwable -> 0x00be }
        X.AnonymousClass0CF.m856E(r0);	 Catch:{ Throwable -> 0x00be }
        com.facebook.breakpad.BreakpadManager.start(r1);	 Catch:{ Throwable -> 0x00be }
        r0 = 1;	 Catch:{ Throwable -> 0x00be }
        com.facebook.breakpad.BreakpadManager.setJvmStreamEnabled(r0);	 Catch:{ Throwable -> 0x00be }
        goto L_0x00c6;	 Catch:{ Throwable -> 0x00be }
    L_0x00be:
        r3 = move-exception;
        r2 = "IgFamilyApplicationInitializer";
        r0 = "Can't load GNU STL lib";
        X.AnonymousClass0Dc.m1244G(r2, r0, r3);
    L_0x00c6:
        r0 = X.AnonymousClass0CC.f1489y;
        r0 = X.AnonymousClass0CA.m828B(r0);
        if (r0 == 0) goto L_0x0109;
    L_0x00ce:
        r0 = com.facebook.analytics.appstatelogger.AppStateLogger.D();
        if (r0 == 0) goto L_0x0109;
    L_0x00d4:
        r0 = com.facebook.breakpad.BreakpadManager.isActive();
        if (r0 == 0) goto L_0x0109;
    L_0x00da:
        r2 = com.facebook.analytics.appstatelogger.AppStateLogger.f23056Q;
        monitor-enter(r2);
        r0 = com.facebook.analytics.appstatelogger.AppStateLogger.f23055P;	 Catch:{ all -> 0x0f03 }
        if (r0 == 0) goto L_0x0efb;	 Catch:{ all -> 0x0f03 }
    L_0x00e1:
        monitor-exit(r2);	 Catch:{ all -> 0x0f03 }
        r3 = com.facebook.analytics.appstatelogger.AppStateLogger.f23055P;
        r0 = r3.f23061F;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r0.getAbsolutePath();
        r2.append(r0);
        r0 = "_native";
        r2.append(r0);
        r2 = r2.toString();
        r0 = r3.f23058C;
        com.facebook.analytics.appstatelogger.AppStateLoggerNative.initializeNativeCrashReporting(r2, r0);
        r2 = r3.f23062G;
        r0 = r2.f23079G;
        if (r0 != 0) goto L_0x0f06;
    L_0x0106:
        r0 = 1;
        r2.f23079G = r0;
    L_0x0109:
        r0 = X.AnonymousClass0CC.f1483s;
        r0 = X.AnonymousClass0CA.m828B(r0);
        if (r0 == 0) goto L_0x012c;
    L_0x0111:
        r2 = X.AnonymousClass0DL.f1859C;
        if (r2 == 0) goto L_0x011e;
    L_0x0115:
        r0 = "anr_gk_cached";
        r0 = X.AnonymousClass0DL.m1198D(r0);
        r2.safeToLoadNativeLibraries(r0);
    L_0x011e:
        com.facebook.acra.util.NativeProcFileReader.safeToLoadNativeLibraries();
        r0 = "acraconfig_disable_fs_sync_syscalls";
        r0 = X.AnonymousClass0Db.m1233C(r1, r0);
        if (r0 == 0) goto L_0x012c;
    L_0x0129:
        com.facebook.acra.util.NoSync.safeToLoadNativeLibraries();
    L_0x012c:
        r0 = X.AnonymousClass0CC.el;
        r0 = X.AnonymousClass0CA.m828B(r0);
        r3 = 0;
        r10 = 1;
        if (r0 != 0) goto L_0x0147;
    L_0x0136:
        r0 = X.AnonymousClass0CC.ET;
        r0 = X.AnonymousClass0CA.m828B(r0);
        if (r0 != 0) goto L_0x0147;
    L_0x013e:
        r0 = X.AnonymousClass0CB.m839I();
        if (r0 == 0) goto L_0x0145;
    L_0x0144:
        goto L_0x0147;
    L_0x0145:
        r0 = 0;
        goto L_0x0148;
    L_0x0147:
        r0 = 1;
    L_0x0148:
        if (r0 == 0) goto L_0x02af;
    L_0x014a:
        r2 = new X.0EW;
        r2.<init>();
        r0 = new X.AnonymousClass0EX[r10];
        r4 = new X.0EY;
        r4.<init>();
        r0[r3] = r4;
        X.AnonymousClass0Ea.m1405B(r1, r2, r0);
        r15 = new android.util.SparseArray;	 Catch:{ Throwable -> 0x029f }
        r11 = 1;	 Catch:{ Throwable -> 0x029f }
        r15.<init>(r11);	 Catch:{ Throwable -> 0x029f }
        r2 = X.AnonymousClass0Ec.f2002C;	 Catch:{ Throwable -> 0x029f }
        r0 = new X.0Ec;	 Catch:{ Throwable -> 0x029f }
        r0.<init>();	 Catch:{ Throwable -> 0x029f }
        r15.put(r2, r0);	 Catch:{ Throwable -> 0x029f }
        r2 = X.AnonymousClass0Ef.f2005C;	 Catch:{ Throwable -> 0x029f }
        r0 = new X.0Ef;	 Catch:{ Throwable -> 0x029f }
        r0.<init>();	 Catch:{ Throwable -> 0x029f }
        r15.put(r2, r0);	 Catch:{ Throwable -> 0x029f }
        r0 = 8;	 Catch:{ Throwable -> 0x029f }
        r14 = new X.AnonymousClass0CJ[r0];	 Catch:{ Throwable -> 0x029f }
        r2 = new X.0CI;	 Catch:{ Throwable -> 0x029f }
        r2.<init>();	 Catch:{ Throwable -> 0x029f }
        r0 = 0;	 Catch:{ Throwable -> 0x029f }
        r14[r0] = r2;	 Catch:{ Throwable -> 0x029f }
        r0 = new com.facebook.profilo.provider.stacktrace.StackFrameThread;	 Catch:{ Throwable -> 0x029f }
        r0.<init>(r1);	 Catch:{ Throwable -> 0x029f }
        r14[r11] = r0;	 Catch:{ Throwable -> 0x029f }
        r2 = new com.facebook.profilo.provider.systemcounters.SystemCounterThread;	 Catch:{ Throwable -> 0x029f }
        r2.<init>();	 Catch:{ Throwable -> 0x029f }
        r0 = 2;	 Catch:{ Throwable -> 0x029f }
        r14[r0] = r2;	 Catch:{ Throwable -> 0x029f }
        r2 = new X.0Eg;	 Catch:{ Throwable -> 0x029f }
        r2.<init>();	 Catch:{ Throwable -> 0x029f }
        r0 = 3;	 Catch:{ Throwable -> 0x029f }
        r14[r0] = r2;	 Catch:{ Throwable -> 0x029f }
        r2 = new com.facebook.profilo.provider.threadmetadata.ThreadMetadataProvider;	 Catch:{ Throwable -> 0x029f }
        r2.<init>();	 Catch:{ Throwable -> 0x029f }
        r0 = 4;	 Catch:{ Throwable -> 0x029f }
        r14[r0] = r2;	 Catch:{ Throwable -> 0x029f }
        r2 = new X.0Eh;	 Catch:{ Throwable -> 0x029f }
        r2.<init>();	 Catch:{ Throwable -> 0x029f }
        r0 = 5;	 Catch:{ Throwable -> 0x029f }
        r14[r0] = r2;	 Catch:{ Throwable -> 0x029f }
        r0 = new X.0Ei;	 Catch:{ Throwable -> 0x029f }
        r0.<init>(r1);	 Catch:{ Throwable -> 0x029f }
        r2 = 6;	 Catch:{ Throwable -> 0x029f }
        r14[r2] = r0;	 Catch:{ Throwable -> 0x029f }
        r2 = X.AnonymousClass0Ej.m1465C();	 Catch:{ Throwable -> 0x029f }
        r0 = 7;	 Catch:{ Throwable -> 0x029f }
        r14[r0] = r2;	 Catch:{ Throwable -> 0x029f }
        r0 = new X.0Ek;	 Catch:{ Throwable -> 0x029f }
        r0.<init>(r1);	 Catch:{ Throwable -> 0x029f }
        X.AnonymousClass0El.f2021D = r0;	 Catch:{ Throwable -> 0x029f }
        r0 = X.AnonymousClass0El.f2021D;	 Catch:{ Throwable -> 0x029f }
        r4 = new X.0Em;	 Catch:{ JSONException -> 0x01c6 }
        r4.<init>(r0);	 Catch:{ JSONException -> 0x01c6 }
        goto L_0x01c7;	 Catch:{ JSONException -> 0x01c6 }
    L_0x01c6:
        r4 = 0;
    L_0x01c7:
        r2 = new X.0Eo;	 Catch:{ Throwable -> 0x029f }
        r2.<init>();	 Catch:{ Throwable -> 0x029f }
        if (r4 == 0) goto L_0x01e2;	 Catch:{ Throwable -> 0x029f }
    L_0x01ce:
        r0 = r4.f2022B;	 Catch:{ Throwable -> 0x029f }
        if (r0 == 0) goto L_0x01e2;	 Catch:{ Throwable -> 0x029f }
    L_0x01d2:
        r0 = r0.hS();	 Catch:{ Throwable -> 0x029f }
        if (r0 == 0) goto L_0x01e2;	 Catch:{ Throwable -> 0x029f }
    L_0x01d8:
        r0 = r4.f2022B;	 Catch:{ Throwable -> 0x029f }
        r0 = r0.PK();	 Catch:{ Throwable -> 0x029f }
        if (r0 == 0) goto L_0x01e2;	 Catch:{ Throwable -> 0x029f }
    L_0x01e0:
        r0 = 1;	 Catch:{ Throwable -> 0x029f }
        goto L_0x01e3;	 Catch:{ Throwable -> 0x029f }
    L_0x01e2:
        r0 = 0;	 Catch:{ Throwable -> 0x029f }
    L_0x01e3:
        if (r0 == 0) goto L_0x01eb;	 Catch:{ Throwable -> 0x029f }
    L_0x01e5:
        r0 = new X.0Es;	 Catch:{ Throwable -> 0x029f }
        r0.<init>(r4, r2);	 Catch:{ Throwable -> 0x029f }
        r2 = r0;	 Catch:{ Throwable -> 0x029f }
    L_0x01eb:
        r5 = "main";	 Catch:{ Throwable -> 0x029f }
        r0 = 1;	 Catch:{ Throwable -> 0x029f }
        if (r2 != 0) goto L_0x01f5;	 Catch:{ Throwable -> 0x029f }
    L_0x01f0:
        r2 = new X.0Eo;	 Catch:{ Throwable -> 0x029f }
        r2.<init>();	 Catch:{ Throwable -> 0x029f }
    L_0x01f5:
        r13 = new X.0Eu;	 Catch:{ Throwable -> 0x029f }
        r13.<init>(r1, r2, r14, r0);	 Catch:{ Throwable -> 0x029f }
        r2 = X.AnonymousClass0Eu.f2028N;	 Catch:{ Throwable -> 0x029f }
        r0 = 0;	 Catch:{ Throwable -> 0x029f }
        r0 = r2.compareAndSet(r0, r13);	 Catch:{ Throwable -> 0x029f }
        if (r0 == 0) goto L_0x0f0e;	 Catch:{ Throwable -> 0x029f }
    L_0x0203:
        monitor-enter(r13);	 Catch:{ Throwable -> 0x029f }
        r0 = r13.f2030C;	 Catch:{ all -> 0x0f19 }
        r0.MNA(r13);	 Catch:{ all -> 0x0f19 }
        r0 = r13.f2030C;	 Catch:{ all -> 0x0f19 }
        r2 = r0.SM();	 Catch:{ all -> 0x0f19 }
        monitor-exit(r13);	 Catch:{ all -> 0x0f19 }
        r0 = X.AnonymousClass0Ey.f2041H;	 Catch:{ Throwable -> 0x029f }
        if (r0 != 0) goto L_0x0f27;	 Catch:{ Throwable -> 0x029f }
    L_0x0214:
        r4 = X.AnonymousClass0Ey.class;	 Catch:{ Throwable -> 0x029f }
        monitor-enter(r4);	 Catch:{ Throwable -> 0x029f }
        r0 = X.AnonymousClass0Ey.f2041H;	 Catch:{ all -> 0x0f24 }
        if (r0 != 0) goto L_0x0f1c;	 Catch:{ all -> 0x0f24 }
    L_0x021b:
        r0 = new X.0Ey;	 Catch:{ all -> 0x0f24 }
        r0.<init>(r15, r2, r13);	 Catch:{ all -> 0x0f24 }
        X.AnonymousClass0Ey.f2041H = r0;	 Catch:{ all -> 0x0f24 }
        monitor-exit(r4);	 Catch:{ all -> 0x0f24 }
        monitor-enter(r13);	 Catch:{ Throwable -> 0x029f }
        r0 = r13.f2031D;	 Catch:{ all -> 0x0f16 }
        r4 = r0.f2051B;	 Catch:{ all -> 0x0f16 }
        r0 = r13.f2033F;	 Catch:{ all -> 0x0f16 }
        if (r0 == 0) goto L_0x022f;	 Catch:{ all -> 0x0f16 }
    L_0x022c:
        r0 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;	 Catch:{ all -> 0x0f16 }
        goto L_0x0231;	 Catch:{ all -> 0x0f16 }
    L_0x022f:
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ all -> 0x0f16 }
    L_0x0231:
        com.facebook.profilo.logger.Logger.initialize(r0, r4, r5, r13, r13);	 Catch:{ all -> 0x0f16 }
        X.AnonymousClass0Eu.m1473D(r13, r2);	 Catch:{ all -> 0x0f16 }
        r2 = r13.f2031D;	 Catch:{ all -> 0x0f16 }
        r0 = java.util.concurrent.TimeUnit.DAYS;	 Catch:{ all -> 0x0f16 }
        r4 = 1;	 Catch:{ all -> 0x0f16 }
        r4 = r0.toSeconds(r4);	 Catch:{ all -> 0x0f16 }
        r14 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ all -> 0x0f16 }
        r4 = r4 * r14;	 Catch:{ all -> 0x0f16 }
        r2.f2054E = r4;	 Catch:{ all -> 0x0f16 }
        r2 = r13.f2031D;	 Catch:{ all -> 0x0f16 }
        r0 = 10;	 Catch:{ all -> 0x0f16 }
        r2.f2053D = r0;	 Catch:{ all -> 0x0f16 }
        r0 = r13.f2034G;	 Catch:{ all -> 0x0f16 }
        r2 = new X.0Bx;	 Catch:{ all -> 0x0f16 }
        r2.<init>();	 Catch:{ all -> 0x0f16 }
        r0 = r0.f2056B;	 Catch:{ all -> 0x0f16 }
        r0.add(r2);	 Catch:{ all -> 0x0f16 }
        monitor-exit(r13);	 Catch:{ all -> 0x0f16 }
        r2 = X.AnonymousClass0Eu.m1471B();	 Catch:{ Throwable -> 0x029f }
        r0 = new X.0F0;	 Catch:{ Throwable -> 0x029f }
        r0.<init>(r1);	 Catch:{ Throwable -> 0x029f }
        r2 = r2.f2034G;	 Catch:{ Throwable -> 0x029f }
        r2 = r2.f2056B;	 Catch:{ Throwable -> 0x029f }
        r2.add(r0);	 Catch:{ Throwable -> 0x029f }
        r4 = X.AnonymousClass0Eu.m1471B();	 Catch:{ Throwable -> 0x029f }
        r2 = new X.0F3;	 Catch:{ Throwable -> 0x029f }
        r0 = X.AnonymousClass0Ea.f1980C;	 Catch:{ Throwable -> 0x029f }
        r2.<init>(r0);	 Catch:{ Throwable -> 0x029f }
        r0 = r4.f2034G;	 Catch:{ Throwable -> 0x029f }
        r0 = r0.f2056B;	 Catch:{ Throwable -> 0x029f }
        r0.add(r2);	 Catch:{ Throwable -> 0x029f }
        r0 = X.AnonymousClass0Ea.f1980C;	 Catch:{ Throwable -> 0x029f }
        r0.updateListenerMarkers();	 Catch:{ Throwable -> 0x029f }
        com.facebook.profilo.logger.api.ProfiloLogger.sHasProfilo = r11;	 Catch:{ Throwable -> 0x029f }
        r4 = X.AnonymousClass0F4.f2058E;	 Catch:{ Throwable -> 0x029f }
        r2 = X.AnonymousClass0F5.class;	 Catch:{ Throwable -> 0x029f }
        r0 = new X.0F7;	 Catch:{ Throwable -> 0x029f }
        r0.<init>(r1);	 Catch:{ Throwable -> 0x029f }
        r4.m1504A(r2, r0);	 Catch:{ Throwable -> 0x029f }
        X.AnonymousClass0El.f2020C = r11;	 Catch:{ Throwable -> 0x029f }
        r11 = X.AnonymousClass0Ey.f2041H;	 Catch:{ Throwable -> 0x029f }
        if (r11 == 0) goto L_0x02ae;	 Catch:{ Throwable -> 0x029f }
    L_0x0294:
        r5 = X.AnonymousClass0Ef.f2005C;	 Catch:{ Throwable -> 0x029f }
        r4 = 0;	 Catch:{ Throwable -> 0x029f }
        r2 = 0;	 Catch:{ Throwable -> 0x029f }
        r0 = 15335435; // 0xea000b float:2.1489522E-38 double:7.5767116E-317;	 Catch:{ Throwable -> 0x029f }
        r11.m1493F(r5, r4, r2, r0);	 Catch:{ Throwable -> 0x029f }
        goto L_0x02ae;	 Catch:{ Throwable -> 0x029f }
    L_0x029f:
        r4 = move-exception;
        r2 = X.AnonymousClass0El.f2019B;
        r0 = "failed to initialize profilo";
        X.AnonymousClass0Gn.m1878E(r2, r0, r4);
        r0 = X.AnonymousClass0El.f2021D;
        if (r0 == 0) goto L_0x02ae;
    L_0x02ab:
        r0.m1468A();
    L_0x02ae:
        goto L_0x02b9;
    L_0x02af:
        r2 = new X.0EW;
        r2.<init>();
        r0 = new X.AnonymousClass0EX[r3];
        X.AnonymousClass0Ea.m1405B(r1, r2, r0);
    L_0x02b9:
        r11 = X.AnonymousClass0F9.m1509C();
        r0 = X.AnonymousClass0FA.f2073D;
        r14 = r29;
        X.AnonymousClass0F9.m1508B(r11, r1, r0, r14);
        r4 = "MULTIDEX_INSTALLED";
        r0 = r11.f2070C;
        if (r0 == 0) goto L_0x02d2;
    L_0x02ca:
        r2 = r11.f2069B;
        r0 = 15335435; // 0xea000b float:2.1489522E-38 double:7.5767116E-317;
        r2.m1454b(r0, r4, r8);
    L_0x02d2:
        r4 = "APP_ONCREATE";
        r0 = r11.f2070C;
        if (r0 == 0) goto L_0x02e0;
    L_0x02d8:
        r2 = r11.f2069B;
        r0 = 15335435; // 0xea000b float:2.1489522E-38 double:7.5767116E-317;
        r2.m1454b(r0, r4, r6);
    L_0x02e0:
        r0 = X.AnonymousClass0CC.gU;
        r0 = X.AnonymousClass0CA.m828B(r0);
        X.AnonymousClass0db.f7470G = r0;
        r0 = X.AnonymousClass0CC.ZC;
        r2 = X.AnonymousClass0CA.m828B(r0);
        r4 = X.AnonymousClass0FC.class;
        monitor-enter(r4);
        r0 = X.AnonymousClass0FC.f2087B;	 Catch:{ all -> 0x0f2f }
        r0 = r0 instanceof X.AnonymousClass0FE;	 Catch:{ all -> 0x0f2f }
        if (r0 == 0) goto L_0x02fd;	 Catch:{ all -> 0x0f2f }
    L_0x02f7:
        r0 = X.AnonymousClass0FC.f2087B;	 Catch:{ all -> 0x0f2f }
        r0 = (X.AnonymousClass0FE) r0;	 Catch:{ all -> 0x0f2f }
        r0.f2088B = r2;	 Catch:{ all -> 0x0f2f }
    L_0x02fd:
        monitor-exit(r4);
        r2 = "124024574287414";
        r0 = X.AnonymousClass0FF.m1524C(r1);
        X.AnonymousClass0FG.m1525B(r1, r2, r0);
        r0 = X.AnonymousClass0FH.f2099C;
        if (r0 != 0) goto L_0x0312;
    L_0x030b:
        r0 = new X.0FH;
        r0.<init>(r1);
        X.AnonymousClass0FH.f2099C = r0;
    L_0x0312:
        com.instagram.bugreporter.BugReporterService.f2102C = r28;
        r2 = new X.0Ch;
        r2.<init>();
        r0 = X.AnonymousClass0Cg.f1704B;
        if (r0 == 0) goto L_0x0328;
    L_0x031d:
        if (r0 != r2) goto L_0x0320;
    L_0x031f:
        goto L_0x0328;
    L_0x0320:
        r1 = new java.lang.IllegalStateException;
        r0 = "UserStore no longer a singleton";
        r1.<init>(r0);
        throw r1;
    L_0x0328:
        X.AnonymousClass0Cg.f1704B = r2;
        r32 = X.AnonymousClass0Cq.f1767B;
        r0 = X.AnonymousClass0Dt.f1941C;
        r33 = r0.m1312A(r1);
        r9 = new X.0FI;
        r30 = "Instagram";
        r0 = X.AnonymousClass0CC.PV;
        r31 = X.AnonymousClass0CA.m828B(r0);
        r29 = r1;
        r28 = r9;
        r28.<init>(r29, r30, r31, r32, r33);
        r2 = X.AnonymousClass0Ce.m949F(r54);
        r28 = X.AnonymousClass0FL.m1561D(r2);
        r0 = r2.xX();
        r8 = 0;
        if (r0 == 0) goto L_0x0357;
    L_0x0352:
        r0 = X.AnonymousClass0FL.m1559B(r2);
        goto L_0x0358;
    L_0x0357:
        r0 = r8;
    L_0x0358:
        r4 = X.AnonymousClass0FJ.f2109C;
        if (r4 != 0) goto L_0x0363;
    L_0x035c:
        r4 = new X.0FK;
        r4.<init>(r1, r9, r0);
        X.AnonymousClass0FJ.f2109C = r4;
    L_0x0363:
        r4 = r2.xX();
        if (r4 == 0) goto L_0x0370;
    L_0x0369:
        r5 = "init_to_user_info_loaded";
        r4 = "AppStartPerformanceTracer";
        X.AnonymousClass0FM.m1565B(r5, r4);
    L_0x0370:
        r4 = "USER_INFO_LOADED";
        X.AnonymousClass0F9.m1510D(r11, r4);
        r14 = X.AnonymousClass0FN.m1575G(r1, r11, r0);
        r5 = "initAnalytics";
        r4 = 1773928804; // 0x69bc0164 float:2.8410578E25 double:8.7643728E-315;
        X.AnonymousClass0CN.m901B(r5, r4);
        r4 = com.instagram.strings.StringBridge.getFailedToLoadStrings();	 Catch:{ all -> 0x0f32 }
        if (r4 != 0) goto L_0x04f5;	 Catch:{ all -> 0x0f32 }
    L_0x0387:
        r33 = X.AnonymousClass0FF.m1524C(r1);	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0FF.m1523B(r1);	 Catch:{ all -> 0x0f32 }
        r7 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0Dt.f1941C;	 Catch:{ all -> 0x0f32 }
        r32 = r4.m1312A(r1);	 Catch:{ all -> 0x0f32 }
        r35 = X.AnonymousClass0Cq.f1767B;	 Catch:{ all -> 0x0f32 }
        r36 = X.AnonymousClass0Cq.f1770E;	 Catch:{ all -> 0x0f32 }
        r38 = X.AnonymousClass0FO.m1591O();	 Catch:{ all -> 0x0f32 }
        r31 = X.AnonymousClass0FP.f2125g;	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0CB.m840J();	 Catch:{ all -> 0x0f32 }
        if (r4 != 0) goto L_0x03cc;	 Catch:{ all -> 0x0f32 }
    L_0x03a9:
        r4 = X.AnonymousClass0FQ.f2157C;	 Catch:{ all -> 0x0f32 }
        if (r4 != 0) goto L_0x03b6;	 Catch:{ all -> 0x0f32 }
    L_0x03ad:
        r5 = new X.0FQ;	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0EV.f1977B;	 Catch:{ all -> 0x0f32 }
        r5.<init>(r4);	 Catch:{ all -> 0x0f32 }
        X.AnonymousClass0FQ.f2157C = r5;	 Catch:{ all -> 0x0f32 }
    L_0x03b6:
        r4 = X.AnonymousClass0FQ.f2157C;	 Catch:{ all -> 0x0f32 }
        r6 = r4.f2158B;	 Catch:{ all -> 0x0f32 }
        r5 = "logging_host";	 Catch:{ all -> 0x0f32 }
        r4 = "";	 Catch:{ all -> 0x0f32 }
        r5 = r6.getString(r5, r4);	 Catch:{ all -> 0x0f32 }
        r4 = r5.isEmpty();	 Catch:{ all -> 0x0f32 }
        if (r4 != 0) goto L_0x03cc;	 Catch:{ all -> 0x0f32 }
    L_0x03c8:
        r31 = X.AnonymousClass0FP.m1610B(r5);	 Catch:{ all -> 0x0f32 }
    L_0x03cc:
        r5 = X.AnonymousClass23Q.B();	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0CC.FC;	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0CA.m828B(r4);	 Catch:{ all -> 0x0f32 }
        r5.f25490B = r4;	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0CC.lJ;	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0CA.m828B(r4);	 Catch:{ all -> 0x0f32 }
        r5.f25491C = r4;	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0CC.Ab;	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0CA.m828B(r4);	 Catch:{ all -> 0x0f32 }
        r5.f25494F = r4;	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0CC.ai;	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0CA.m828B(r4);	 Catch:{ all -> 0x0f32 }
        r5.f25496H = r4;	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0CC.bi;	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0CA.m828B(r4);	 Catch:{ all -> 0x0f32 }
        r5.f25497I = r4;	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0CC.eU;	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0CA.m828B(r4);	 Catch:{ all -> 0x0f32 }
        r5.f25492D = r4;	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0CC.kU;	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0CA.m828B(r4);	 Catch:{ all -> 0x0f32 }
        r5.f25495G = r4;	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0CC.pX;	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0CA.m828B(r4);	 Catch:{ all -> 0x0f32 }
        r5.f25493E = r4;	 Catch:{ all -> 0x0f32 }
        r34 = java.lang.String.valueOf(r7);	 Catch:{ all -> 0x0f32 }
        r37 = r28;	 Catch:{ all -> 0x0f32 }
        r6 = new X.0FP;	 Catch:{ all -> 0x0f32 }
        r13 = X.AnonymousClass0FR.class;	 Catch:{ all -> 0x0f32 }
        monitor-enter(r13);	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0FR.f2159D;	 Catch:{ all -> 0x0f3a }
        if (r4 != 0) goto L_0x042d;	 Catch:{ all -> 0x0f3a }
    L_0x041f:
        r7 = new X.0FR;	 Catch:{ all -> 0x0f3a }
        r5 = new java.util.Random;	 Catch:{ all -> 0x0f3a }
        r5.<init>();	 Catch:{ all -> 0x0f3a }
        r4 = X.AnonymousClass0FS.f2162B;	 Catch:{ all -> 0x0f3a }
        r7.<init>(r5, r4);	 Catch:{ all -> 0x0f3a }
        X.AnonymousClass0FR.f2159D = r7;	 Catch:{ all -> 0x0f3a }
    L_0x042d:
        r39 = X.AnonymousClass0FR.f2159D;	 Catch:{ all -> 0x0f3a }
        monitor-exit(r13);	 Catch:{ all -> 0x0f32 }
        r30 = r1;	 Catch:{ all -> 0x0f32 }
        r29 = r6;	 Catch:{ all -> 0x0f32 }
        r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39);	 Catch:{ all -> 0x0f32 }
        r7 = 0;	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass23Q.B();	 Catch:{ all -> 0x0f32 }
        r4 = r4.f25490B;	 Catch:{ all -> 0x0f32 }
        if (r4 == 0) goto L_0x0454;	 Catch:{ all -> 0x0f32 }
    L_0x0440:
        r4 = android.text.TextUtils.isEmpty(r7);	 Catch:{ all -> 0x0f32 }
        if (r4 == 0) goto L_0x044e;	 Catch:{ all -> 0x0f32 }
    L_0x0446:
        r4 = new X.0FU;	 Catch:{ all -> 0x0f32 }
        r4.<init>(r1);	 Catch:{ all -> 0x0f32 }
    L_0x044b:
        X.AnonymousClass0FU.f2165D = r4;	 Catch:{ all -> 0x0f32 }
        goto L_0x0454;	 Catch:{ all -> 0x0f32 }
    L_0x044e:
        r4 = new X.0FU;	 Catch:{ all -> 0x0f32 }
        r4.<init>(r1, r7);	 Catch:{ all -> 0x0f32 }
        goto L_0x044b;	 Catch:{ all -> 0x0f32 }
    L_0x0454:
        r4 = new X.0FV;	 Catch:{ IOException -> 0x045c, IOException -> 0x045c }
        r4.<init>(r1);	 Catch:{ IOException -> 0x045c, IOException -> 0x045c }
        X.AnonymousClass0FV.f2168E = r4;	 Catch:{ IOException -> 0x045c, IOException -> 0x045c }
        goto L_0x0462;	 Catch:{ IOException -> 0x045c, IOException -> 0x045c }
    L_0x045c:
        r5 = move-exception;	 Catch:{ all -> 0x0f32 }
        r4 = "BatchFileCounter";	 Catch:{ all -> 0x0f32 }
        X.AnonymousClass0Gn.m1880G(r4, r5);	 Catch:{ all -> 0x0f32 }
    L_0x0462:
        r13 = X.AnonymousClass0FC.class;	 Catch:{ all -> 0x0f32 }
        monitor-enter(r13);	 Catch:{ all -> 0x0f32 }
        if (r6 == 0) goto L_0x0f3f;	 Catch:{ all -> 0x0f32 }
    L_0x0467:
        r7 = X.AnonymousClass0FC.f2087B;	 Catch:{ all -> 0x0f3d }
        X.AnonymousClass0FC.f2087B = r6;	 Catch:{ all -> 0x0f3d }
        r4 = r7 instanceof X.AnonymousClass0FE;	 Catch:{ all -> 0x0f3d }
        if (r4 == 0) goto L_0x0496;	 Catch:{ all -> 0x0f3d }
    L_0x046f:
        r5 = r7;	 Catch:{ all -> 0x0f3d }
        r5 = (X.AnonymousClass0FE) r5;	 Catch:{ all -> 0x0f3d }
        r4 = r5.f2088B;	 Catch:{ all -> 0x0f3d }
        if (r4 == 0) goto L_0x0480;	 Catch:{ all -> 0x0f3d }
    L_0x0476:
        r4 = r5.f2089C;	 Catch:{ all -> 0x0f3d }
        monitor-enter(r4);	 Catch:{ all -> 0x0f3d }
        r5.f2090D = r6;	 Catch:{ all -> 0x047d }
        monitor-exit(r4);	 Catch:{ all -> 0x047d }
        goto L_0x0482;	 Catch:{ all -> 0x047d }
    L_0x047d:
        r0 = move-exception;	 Catch:{ all -> 0x047d }
        monitor-exit(r4);	 Catch:{ all -> 0x047d }
    L_0x047f:
        throw r0;	 Catch:{ all -> 0x0f3d }
    L_0x0480:
        r5.f2090D = r6;	 Catch:{ all -> 0x0f3d }
    L_0x0482:
        r7 = (X.AnonymousClass0FE) r7;	 Catch:{ all -> 0x0f3d }
        r4 = r7.f2088B;	 Catch:{ all -> 0x0f3d }
        if (r4 == 0) goto L_0x0493;	 Catch:{ all -> 0x0f3d }
    L_0x0488:
        r4 = r7.f2089C;	 Catch:{ all -> 0x0f3d }
        monitor-enter(r4);	 Catch:{ all -> 0x0f3d }
        r7.m1522A();	 Catch:{ all -> 0x0490 }
        monitor-exit(r4);	 Catch:{ all -> 0x0490 }
        goto L_0x0496;	 Catch:{ all -> 0x0490 }
    L_0x0490:
        r0 = move-exception;	 Catch:{ all -> 0x0490 }
        monitor-exit(r4);	 Catch:{ all -> 0x0490 }
        goto L_0x047f;	 Catch:{ all -> 0x0490 }
    L_0x0493:
        r7.m1522A();	 Catch:{ all -> 0x0f3d }
    L_0x0496:
        monitor-exit(r13);	 Catch:{ all -> 0x0f32 }
        r7 = X.AnonymousClass0FC.m1519B();	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0CB.m840J();	 Catch:{ all -> 0x0f32 }
        if (r4 != 0) goto L_0x04dd;	 Catch:{ all -> 0x0f32 }
    L_0x04a1:
        r13 = new java.util.ArrayList;	 Catch:{ all -> 0x0f32 }
        r13.<init>();	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0FW.m1630B();	 Catch:{ all -> 0x0f32 }
        r13.add(r4);	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0CB.m834D();	 Catch:{ all -> 0x0f32 }
        if (r4 == 0) goto L_0x04bf;	 Catch:{ all -> 0x0f32 }
    L_0x04b3:
        r5 = new X.0FY;	 Catch:{ all -> 0x0f32 }
        r4 = com.facebook.sonar.android.AndroidSonarClient.getInstance(r1);	 Catch:{ all -> 0x0f32 }
        r5.<init>(r4);	 Catch:{ all -> 0x0f32 }
        r13.add(r5);	 Catch:{ all -> 0x0f32 }
    L_0x04bf:
        r4 = X.AnonymousClass0FZ.m1634B();	 Catch:{ all -> 0x0f32 }
        r6 = r4.f2177B;	 Catch:{ all -> 0x0f32 }
        r5 = "show_event_logger";	 Catch:{ all -> 0x0f32 }
        r4 = 0;	 Catch:{ all -> 0x0f32 }
        r4 = r6.getBoolean(r5, r4);	 Catch:{ all -> 0x0f32 }
        if (r4 == 0) goto L_0x04d5;	 Catch:{ all -> 0x0f32 }
    L_0x04ce:
        r4 = com.instagram.debug.devoptions.eventvisualizer.EventVisualizerLogger.getInstance();	 Catch:{ all -> 0x0f32 }
        r13.add(r4);	 Catch:{ all -> 0x0f32 }
    L_0x04d5:
        r4 = new X.0Fa;	 Catch:{ all -> 0x0f32 }
        r4.<init>(r13);	 Catch:{ all -> 0x0f32 }
        r7.zNA(r4);	 Catch:{ all -> 0x0f32 }
    L_0x04dd:
        r4 = X.AnonymousClass0Fb.f2180F;	 Catch:{ all -> 0x0f32 }
        if (r4 != 0) goto L_0x04f0;	 Catch:{ all -> 0x0f32 }
    L_0x04e1:
        r5 = X.AnonymousClass0Fb.class;	 Catch:{ all -> 0x0f32 }
        monitor-enter(r5);	 Catch:{ all -> 0x0f32 }
        r4 = X.AnonymousClass0Fb.f2180F;	 Catch:{ all -> 0x0f49 }
        if (r4 != 0) goto L_0x04ef;	 Catch:{ all -> 0x0f49 }
    L_0x04e8:
        r4 = new X.0Fb;	 Catch:{ all -> 0x0f49 }
        r4.<init>();	 Catch:{ all -> 0x0f49 }
        X.AnonymousClass0Fb.f2180F = r4;	 Catch:{ all -> 0x0f49 }
    L_0x04ef:
        monitor-exit(r5);	 Catch:{ all -> 0x0f32 }
    L_0x04f0:
        r4 = X.AnonymousClass0Fb.f2180F;	 Catch:{ all -> 0x0f32 }
        r7.OPA(r4);	 Catch:{ all -> 0x0f32 }
    L_0x04f5:
        r4 = 865573465; // 0x33979a59 float:7.059561E-8 double:4.27650113E-315;
        X.AnonymousClass0CN.m902C(r4);
        if (r14 == 0) goto L_0x0509;
    L_0x04fd:
        r14.get();	 Catch:{ InterruptedException -> 0x0501, InterruptedException -> 0x0501 }
        goto L_0x0509;	 Catch:{ InterruptedException -> 0x0501, InterruptedException -> 0x0501 }
    L_0x0501:
        r6 = move-exception;
        r5 = "IgFamilyApplicationInitializer";
        r4 = "failed to init qe asynchronously";
        X.AnonymousClass0Gn.m1883J(r5, r4, r6);
    L_0x0509:
        r12 = new X.0Fc;
        r12.<init>();
        r5 = X.AnonymousClass0Ff.m1660B();
        r4 = r5.f2188B;
        r4 = r4.contains(r12);
        if (r4 != 0) goto L_0x051f;
    L_0x051a:
        r4 = r5.f2188B;
        r4.add(r12);
    L_0x051f:
        r4 = X.AnonymousClass0CC.sN;
        r4 = r4.m845G();
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x0543;
    L_0x052d:
        r7 = X.AnonymousClass0Ff.m1660B();
        r5 = new X.0Fg;
        r5.<init>();
        r4 = r7.f2188B;
        r4 = r4.contains(r5);
        if (r4 != 0) goto L_0x0543;
    L_0x053e:
        r4 = r7.f2188B;
        r4.add(r5);
    L_0x0543:
        r4 = X.AnonymousClass0Fh.m1662B();
        r4.m1663A(r12);
        r7 = X.AnonymousClass0Fj.f2192B;
        r5 = new X.0Fm;
        r4 = X.AnonymousClass0CC.ek;
        r4 = r4.m845G();
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        r5.<init>(r1, r4);
        r7.m1666A(r5);
        r5 = X.AnonymousClass0Fh.m1662B();
        r4 = new X.0Fn;
        r4.<init>(r1);
        r5.m1663A(r4);
        r5 = X.AnonymousClass0Fh.m1662B();
        r4 = new X.0Fo;
        r4.<init>(r1);
        r5.m1663A(r4);
        r5 = X.AnonymousClass0Fj.f2192B;
        r4 = X.AnonymousClass0Fh.m1662B();
        r7.m1666A(r4);
        r4 = X.AnonymousClass0Fp.f2209I;
        if (r4 != 0) goto L_0x0f4c;
    L_0x0585:
        r4 = new X.0Fp;
        r4.<init>(r1);
        X.AnonymousClass0Fp.f2209I = r4;
        r4 = X.AnonymousClass0Fp.f2209I;
        r5.m1666A(r4);
        r4 = new X.0Fq;
        r31 = X.AnonymousClass0Fr.m1682B();
        r32 = 604800; // 0x93a80 float:8.47505E-40 double:2.98811E-318;
        r34 = 21600; // 0x5460 float:3.0268E-41 double:1.0672E-319;
        r30 = r1;
        r29 = r4;
        r29.<init>(r30, r31, r32, r34);
        r5.m1666A(r4);
        r4 = new X.0Fs;
        r4.<init>(r1);
        r5.m1666A(r4);
        r4 = new X.0Ft;
        r4.<init>(r1);
        r5.m1666A(r4);
        r4 = X.AnonymousClass0Fu.m1694B();
        r5.m1666A(r4);
        r4 = new X.593;
        r4.<init>();
        r5.m1666A(r4);
        r4 = new X.595;
        r4.<init>();
        r5.m1666A(r4);
        r4 = new X.596;
        r4.<init>();
        r5.m1666A(r4);
        r5 = android.os.Build.VERSION.SDK_INT;
        r4 = 28;
        if (r5 < r4) goto L_0x05f5;
    L_0x05db:
        r4 = X.AnonymousClass0CC.mE;
        r4 = r4.m845G();
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x05f5;
    L_0x05e9:
        r5 = X.AnonymousClass0Fh.m1662B();
        r4 = new X.48P;
        r4.<init>(r1, r2);
        r5.m1663A(r4);
    L_0x05f5:
        r5 = X.AnonymousClass0Fh.m1662B();
        r4 = new X.48Q;
        r4.<init>(r1);
        r5.m1663A(r4);
        r4 = X.AnonymousClass0CC.vc;
        r4 = r4.m845G();
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x0631;
    L_0x060f:
        r7 = X.AnonymousClass0Fx.class;
        monitor-enter(r7);
        r6 = new java.util.concurrent.LinkedBlockingQueue;	 Catch:{ all -> 0x0f54 }
        r4 = 100;	 Catch:{ all -> 0x0f54 }
        r6.<init>(r4);	 Catch:{ all -> 0x0f54 }
        r5 = X.AnonymousClass0Fx.f2275C;	 Catch:{ all -> 0x0f54 }
        r4 = new java.util.concurrent.ThreadPoolExecutor;	 Catch:{ all -> 0x0f54 }
        r30 = 5;	 Catch:{ all -> 0x0f54 }
        r31 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ all -> 0x0f54 }
        r32 = 1;	 Catch:{ all -> 0x0f54 }
        r34 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x0f54 }
        r36 = X.AnonymousClass0Fx.f2282J;	 Catch:{ all -> 0x0f54 }
        r29 = r4;	 Catch:{ all -> 0x0f54 }
        r35 = r6;	 Catch:{ all -> 0x0f54 }
        r29.<init>(r30, r31, r32, r34, r35, r36);	 Catch:{ all -> 0x0f54 }
        r5.f2283B = r4;	 Catch:{ all -> 0x0f54 }
        monitor-exit(r7);
    L_0x0631:
        r4 = X.AnonymousClass0CC.RJ;
        r4 = r4.m845G();
        r4 = (java.lang.Boolean) r4;
        r14 = r4.booleanValue();
        r4 = X.AnonymousClass0CC.EF;
        r4 = r4.m845G();
        r4 = (java.lang.Boolean) r4;
        r6 = r4.booleanValue();
        if (r14 == 0) goto L_0x0651;
    L_0x064b:
        X.AnonymousClass0FN.m1574F(r1);
        X.AnonymousClass0FN.m1570B(r1, r6, r9);
    L_0x0651:
        r5 = X.AnonymousClass0EI.m1383B();
        r4 = X.AnonymousClass0Fj.f2192B;
        r4.m1666A(r5);
        r4 = r24;
        r1.setTheme(r4);
        r4 = X.AnonymousClass0CB.m840J();
        r4 = r4 ^ r10;
        X.AnonymousClass0Fy.f2284I = r4;
        r4 = X.AnonymousClass0G0.f2292C;
        if (r4 != 0) goto L_0x0f57;
    L_0x066a:
        r4 = new X.0G0;
        r5 = r23;
        r4.<init>(r5);
        X.AnonymousClass0G0.f2292C = r4;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r4 = r1.getCacheDir();
        r5.append(r4);
        r4 = "/original_images";
        r5.append(r4);
        r4 = r5.toString();
        X.AnonymousClass0G1.f2295C = r4;
        r5 = r22.iterator();
    L_0x068e:
        r4 = r5.hasNext();
        if (r4 == 0) goto L_0x069e;
    L_0x0694:
        r4 = r5.next();
        r4 = (com.instagram.realtimeclient.RealtimeClientManager.RealtimeDelegateProvider) r4;
        com.instagram.realtimeclient.RealtimeClientManager.addRealtimeDelegateProvider(r4);
        goto L_0x068e;
    L_0x069e:
        r4 = r21.get();
        r4 = (java.util.List) r4;
        r5 = r4.iterator();
    L_0x06a8:
        r4 = r5.hasNext();
        if (r4 == 0) goto L_0x06b8;
    L_0x06ae:
        r4 = r5.next();
        r4 = (com.instagram.realtimeclient.RealtimeEventHandlerProvider) r4;
        com.instagram.realtimeclient.RealtimeClientManager.addOtherRealtimeEventHandlerProvider(r4);
        goto L_0x06a8;
    L_0x06b8:
        com.instagram.realtimeclient.RealtimeClientManager.setRawSkywalkerSubscriptionsProvider(r26);
        com.instagram.realtimeclient.RealtimeClientManager.setGraphQLSubscriptionsProvider(r25);
        r5 = new X.0G3;
        r4 = r24;
        r5.<init>(r1, r4);
        X.AnonymousClass0G5.f2299B = r5;
        r4 = new X.0G6;
        r4.<init>(r1, r2);
        r5 = X.AnonymousClass0G7.class;
        monitor-enter(r5);
        X.AnonymousClass0G7.f2303B = r4;	 Catch:{ all -> 0x0f5f }
        monitor-exit(r5);
        if (r0 == 0) goto L_0x0744;
    L_0x06d4:
        r4 = X.AnonymousClass0CC.PJ;
        r4 = r4.m846H(r0);
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x0744;
    L_0x06e2:
        r7 = X.AnonymousClass0G8.m1750D(r0);
        r4 = r7.f2305C;
        if (r4 != 0) goto L_0x0744;
    L_0x06ea:
        r4 = r7.f2304B;
        if (r4 != 0) goto L_0x0744;
    L_0x06ee:
        r12 = "prepareMainFeedRequest";
        r4 = -785987924; // 0xffffffffd126c6ac float:-4.4768608E10 double:NaN;
        X.AnonymousClass0CN.m901B(r12, r4);
        r4 = X.AnonymousClass0GB.m1754B(r0);	 Catch:{ all -> 0x073c }
        r4.JW();	 Catch:{ all -> 0x073c }
        r33 = r4.QR();	 Catch:{ all -> 0x073c }
        r34 = r4.jT();	 Catch:{ all -> 0x073c }
        r35 = r4.PR();	 Catch:{ all -> 0x073c }
        r36 = r4.aW();	 Catch:{ all -> 0x073c }
        r4 = X.AnonymousClass0GD.m1757C(r1, r0);	 Catch:{ all -> 0x073c }
        r37 = r4.m1759A();	 Catch:{ all -> 0x073c }
        r5 = new java.util.concurrent.FutureTask;	 Catch:{ all -> 0x073c }
        r4 = new X.0GF;	 Catch:{ all -> 0x073c }
        r31 = r1;	 Catch:{ all -> 0x073c }
        r32 = r0;	 Catch:{ all -> 0x073c }
        r29 = r4;	 Catch:{ all -> 0x073c }
        r30 = r7;	 Catch:{ all -> 0x073c }
        r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37);	 Catch:{ all -> 0x073c }
        r5.<init>(r4);	 Catch:{ all -> 0x073c }
        r7.f2305C = r5;	 Catch:{ all -> 0x073c }
        r12 = X.AnonymousClass0Fx.m1698B();	 Catch:{ all -> 0x073c }
        r5 = r7.f2305C;	 Catch:{ all -> 0x073c }
        r4 = -1371119; // 0xffffffffffeb1411 float:NaN double:NaN;	 Catch:{ all -> 0x073c }
        X.AnonymousClass0GG.m1763B(r12, r5, r4);	 Catch:{ all -> 0x073c }
        r4 = -1000009452; // 0xffffffffc4651114 float:-916.26685 double:NaN;
        X.AnonymousClass0CN.m902C(r4);
        goto L_0x0744;
    L_0x073c:
        r1 = move-exception;
        r0 = -1616792527; // 0xffffffff9fa1b431 float:-6.8484254E-20 double:NaN;
        X.AnonymousClass0CN.m902C(r0);
        throw r1;
    L_0x0744:
        r4 = new X.0GI;
        r4.<init>();
        X.AnonymousClass0GK.m1768B(r4);
        r4 = new X.0GL;
        r4.<init>();
        X.AnonymousClass0GK.m1768B(r4);
        r5 = "attachPluginImplementations";	 Catch:{ all -> 0x0f62 }
        r4 = 831696409; // 0x3192ae19 float:4.268952E-9 double:4.109126235E-315;	 Catch:{ all -> 0x0f62 }
        X.AnonymousClass0CN.m901B(r5, r4);	 Catch:{ all -> 0x0f62 }
        X.AnonymousClass0EQ.f1975B = r18;	 Catch:{ all -> 0x0f62 }
        r4 = r1;	 Catch:{ all -> 0x0f62 }
        r4 = (android.app.Application) r4;	 Catch:{ all -> 0x0f62 }
        X.AnonymousClass0GM.setApplication(r4);	 Catch:{ all -> 0x0f62 }
        r4 = new X.0GN;	 Catch:{ all -> 0x0f62 }
        r4.<init>();	 Catch:{ all -> 0x0f62 }
        X.AnonymousClass0GO.f2358B = r4;	 Catch:{ all -> 0x0f62 }
        r4 = new X.0GP;	 Catch:{ all -> 0x0f62 }
        r4.<init>();	 Catch:{ all -> 0x0f62 }
        X.AnonymousClass0GQ.f2360B = r4;	 Catch:{ all -> 0x0f62 }
        r4 = new X.0GR;	 Catch:{ all -> 0x0f62 }
        r4.<init>(r1, r2);	 Catch:{ all -> 0x0f62 }
        X.AnonymousClass0GS.f2363B = r4;	 Catch:{ all -> 0x0f62 }
        r4 = new X.5b8;	 Catch:{ all -> 0x0f62 }
        r4.<init>();	 Catch:{ all -> 0x0f62 }
        X.AnonymousClass5QZ.f63270B = r4;	 Catch:{ all -> 0x0f62 }
        r4 = new X.0GT;	 Catch:{ all -> 0x0f62 }
        r4.<init>();	 Catch:{ all -> 0x0f62 }
        X.AnonymousClass0GU.f2367B = r4;	 Catch:{ all -> 0x0f62 }
        if (r17 == 0) goto L_0x078e;	 Catch:{ all -> 0x0f62 }
    L_0x0789:
        r4 = r17;	 Catch:{ all -> 0x0f62 }
        r4.eC(r1, r2);	 Catch:{ all -> 0x0f62 }
    L_0x078e:
        r4 = -443821568; // 0xffffffffe58bd200 float:-8.2535345E22 double:NaN;
        X.AnonymousClass0CN.m902C(r4);
        if (r0 == 0) goto L_0x07c8;
    L_0x0796:
        r4 = X.AnonymousClass0CC.WJ;
        r4 = r4.m846H(r0);
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x07c8;
    L_0x07a4:
        r5 = X.AnonymousClass0G8.m1750D(r0);
        r4 = r5.f2307E;
        if (r4 != 0) goto L_0x07c8;
    L_0x07ac:
        r4 = r5.f2306D;
        if (r4 != 0) goto L_0x07c8;
    L_0x07b0:
        r7 = new java.util.concurrent.FutureTask;
        r4 = new X.0GH;
        r4.<init>(r5, r0);
        r7.<init>(r4);
        r5.f2307E = r7;
        r7 = X.AnonymousClass0Fx.m1698B();
        r5 = r5.f2307E;
        r4 = -1087122937; // 0xffffffffbf33d207 float:-0.7024235 double:NaN;
        X.AnonymousClass0GG.m1763B(r7, r5, r4);
    L_0x07c8:
        r7 = X.AnonymousClass0GK.class;
        monitor-enter(r7);
        r4 = X.AnonymousClass0GK.f2337P;	 Catch:{ all -> 0x0f6a }
        r5 = r4.iterator();	 Catch:{ all -> 0x0f6a }
    L_0x07d1:
        r4 = r5.hasNext();	 Catch:{ all -> 0x0f6a }
        if (r4 == 0) goto L_0x07e1;	 Catch:{ all -> 0x0f6a }
    L_0x07d7:
        r4 = r5.next();	 Catch:{ all -> 0x0f6a }
        r4 = (X.AnonymousClass0GJ) r4;	 Catch:{ all -> 0x0f6a }
        r4.EJA();	 Catch:{ all -> 0x0f6a }
        goto L_0x07d1;	 Catch:{ all -> 0x0f6a }
    L_0x07e1:
        com.instagram.pendingmedia.store.PendingMediaStoreSerializer.m1814C();	 Catch:{ all -> 0x0f6a }
        r4 = com.instagram.pendingmedia.store.PendingMediaStoreSerializer.m1814C();	 Catch:{ all -> 0x0f6a }
        r4.m1820D(r2);	 Catch:{ all -> 0x0f6a }
        monitor-exit(r7);
        X.AnonymousClass0FN.m1577I(r1, r2);
        r7 = X.AnonymousClass0F4.f2058E;
        r5 = X.AnonymousClass0F5.class;
        r4 = new X.0M5;
        r4.<init>(r1);
        r7.m1504A(r5, r4);
        r7 = X.AnonymousClass0F4.f2058E;
        r4 = new X.0GW;
        r4.<init>();
        r7.m1504A(r5, r4);
        r4 = X.AnonymousClass0CC.vJ;
        r4 = r4.m845G();
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x0828;
    L_0x0813:
        r7 = X.AnonymousClass0GX.class;
        monitor-enter(r7);
        r4 = new X.0GX;	 Catch:{ all -> 0x0f6d }
        r4.<init>(r1);	 Catch:{ all -> 0x0f6d }
        X.AnonymousClass0GX.f2383E = r4;	 Catch:{ all -> 0x0f6d }
        r5 = X.AnonymousClass0Fj.f2192B;	 Catch:{ all -> 0x0f6d }
        r4 = new X.0GY;	 Catch:{ all -> 0x0f6d }
        r4.<init>();	 Catch:{ all -> 0x0f6d }
        r5.m1666A(r4);	 Catch:{ all -> 0x0f6d }
        monitor-exit(r7);
    L_0x0828:
        r4 = new X.0GZ;
        r4.<init>();
        X.AnonymousClass0Ga.f2387B = r4;
        X.AnonymousClass0EM.f1972B = r20;
        X.AnonymousClass0EO.f1974B = r19;
        r4 = r2.xX();
        if (r4 == 0) goto L_0x0882;
    L_0x0839:
        r4 = X.AnonymousClass0FL.m1559B(r2);
        r4 = X.AnonymousClass3KG.B(r4, r1);
        if (r4 == 0) goto L_0x0882;
    L_0x0843:
        r5 = X.AnonymousClass0FL.m1559B(r2);
        r4 = X.AnonymousClass0CC.sc;
        r4 = r4.m846H(r5);
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x0882;
    L_0x0855:
        r4 = new X.1EZ;
        r4.<init>(r1);
        r12 = r4.m10210A();
        r7 = new X.0Xs;
        r4 = 2131299388; // 0x7f090c3c float:1.8216776E38 double:1.0530018086E-314;
        r7.<init>(r4);
        r4 = 1;
        r7.f6215H = r4;
        r4 = 2;
        r7.f6213F = r4;
        r4 = 0;
        r7.f6217J = r4;
        r13 = java.util.concurrent.TimeUnit.HOURS;
        r4 = 12;
        r4 = r13.toMillis(r4);
        r7.f6214G = r4;
        r4 = r7.m5272A();
        if (r12 == 0) goto L_0x0882;
    L_0x087f:
        r12.m5271D(r4);
    L_0x0882:
        r5 = X.AnonymousClass0FO.m1591O();
        r4 = X.AnonymousClass0CO.f1534B;
        r4.m1189d(r5);
        r7 = r5;
        if (r5 == 0) goto L_0x08a9;
    L_0x088e:
        r4 = X.AnonymousClass0DM.m1210D(r1);
        r4 = r5.equals(r4);
        if (r4 != 0) goto L_0x08a9;
    L_0x0898:
        r4 = X.AnonymousClass0DM.m1209C(r1);
        r5 = r4.edit();
        r4 = "USER_ID";
        r4 = r5.putString(r4, r7);
        r4.commit();
    L_0x08a9:
        if (r0 == 0) goto L_0x08ae;
    L_0x08ab:
        X.AnonymousClass0FN.m1576H(r1, r0, r11);
    L_0x08ae:
        if (r6 == 0) goto L_0x08b3;
    L_0x08b0:
        r4 = 1;
        X.AnonymousClass0Gk.f2411C = r4;
    L_0x08b3:
        if (r14 != 0) goto L_0x08bb;
    L_0x08b5:
        X.AnonymousClass0FN.m1574F(r1);
        X.AnonymousClass0FN.m1570B(r1, r6, r9);
    L_0x08bb:
        r5 = X.AnonymousClass0Gl.f2412B;
        r4 = X.AnonymousClass0Fj.f2192B;
        r4.m1666A(r5);
        r4 = r1.getCacheDir();
        if (r4 != 0) goto L_0x08cd;
    L_0x08c8:
        r5 = "failed_to_initialize_cache_dir";
        X.AnonymousClass0Gn.m1876C(r5, r5);
    L_0x08cd:
        r4 = new X.0Go;
        r4.<init>();
        X.AnonymousClass0Gp.f2421B = r4;
        r4 = "images";
        r7 = X.AnonymousClass0Gq.m1903B(r1, r4, r3);
        r6 = 1036831949; // 0x3dcccccd float:0.1 double:5.122630465E-315;
        r4 = 52428800; // 0x3200000 float:4.7019774E-37 double:2.5903269E-316;
        r6 = X.AnonymousClass0Gq.m1904C(r7, r6, r4);
        r12 = X.AnonymousClass0Gr.f2424D;
        r5 = android.os.Build.VERSION.SDK_INT;
        r4 = 24;
        if (r5 < r4) goto L_0x0919;
    L_0x08ec:
        r4 = 25;
        if (r5 > r4) goto L_0x0919;
    L_0x08f0:
        r12 = X.AnonymousClass0Gr.f2426F;
        r4 = X.AnonymousClass0CC.qO;
        r4 = r4.m845G();
        r4 = (java.lang.Integer) r4;
        r4 = r4.intValue();
        switch(r4) {
            case 0: goto L_0x0917;
            case 1: goto L_0x0905;
            case 2: goto L_0x0902;
            default: goto L_0x0901;
        };
    L_0x0901:
        goto L_0x0919;
    L_0x0902:
        r12 = X.AnonymousClass0Gr.f2427G;
        goto L_0x0919;
    L_0x0905:
        r4 = X.AnonymousClass0CC.wN;
        r4 = r4.m845G();
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x0916;
    L_0x0913:
        r12 = X.AnonymousClass0Gr.f2423C;
        goto L_0x0919;
    L_0x0916:
        goto L_0x0919;
    L_0x0917:
        r12 = X.AnonymousClass0Gr.f2424D;
    L_0x0919:
        r4 = X.AnonymousClass0Gr.f2424D;
        if (r12 != r4) goto L_0x092f;
    L_0x091d:
        if (r0 == 0) goto L_0x092f;
    L_0x091f:
        r4 = X.AnonymousClass0CC.tO;
        r4 = r4.m846H(r0);
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x092f;
    L_0x092d:
        r12 = X.AnonymousClass0Gr.f2425E;
    L_0x092f:
        if (r0 == 0) goto L_0x095b;
    L_0x0931:
        r11 = new X.24U;
        r4 = X.AnonymousClass0CC.xN;
        r4 = r4.m846H(r0);
        r4 = (java.lang.Integer) r4;
        r13 = r4.intValue();
        r4 = X.AnonymousClass0CC.yN;
        r4 = r4.m846H(r0);
        r4 = (java.lang.Boolean) r4;
        r9 = r4.booleanValue();
        r4 = X.AnonymousClass0CC.sO;
        r4 = r4.m846H(r0);
        r4 = (java.lang.Double) r4;
        r4 = r4.doubleValue();
        r11.<init>(r13, r9, r4);
        goto L_0x095d;
    L_0x095b:
        r11 = X.AnonymousClass0aS.f6517E;
    L_0x095d:
        com.instagram.common.ui.blur.BlurUtil.loadLibraries();
        r4 = X.AnonymousClass0CC.ci;
        r4 = r4.m845G();
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x0974;
    L_0x096e:
        com.instagram.common.ui.blur.BlurUtil.setUseBoxBlur(r10);
        r4 = 2;
        X.AnonymousClass0Gs.f2429h = r4;
    L_0x0974:
        r4 = X.AnonymousClass0CC.IC;
        r4 = r4.m845G();
        r4 = (java.lang.Integer) r4;
        r4 = r4.intValue();
        X.AnonymousClass0Gt.f2465C = r4;
        X.AnonymousClass0Gt.f2464B = r4;
        r4 = X.AnonymousClass0CC.IP;
        r4 = r4.m845G();
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x0996;
    L_0x0992:
        r4 = 100;
        X.AnonymousClass0Gu.f2469O = r4;
    L_0x0996:
        r4 = X.AnonymousClass0CC.Rh;
        r4 = r4.m845G();
        r4 = (java.lang.Integer) r4;
        r4 = r4.intValue();
        r9 = 10;
        if (r4 == 0) goto L_0x09af;
    L_0x09a6:
        r4 = r4 - r10;
        r4 = -r4;
        r4 = r4 + r9;
        r4 = java.lang.Integer.valueOf(r4);
        X.AnonymousClass0Gw.f2486F = r4;
    L_0x09af:
        if (r0 == 0) goto L_0x0a35;
    L_0x09b1:
        r8 = new java.util.Random;
        r8.<init>();
        r4 = X.AnonymousClass0CC.zO;
        r4 = r4.m846H(r0);
        r4 = (java.lang.Integer) r4;
        r5 = r4.intValue();
        r4 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r5 != r4) goto L_0x09c8;
    L_0x09c6:
        r5 = 1;
        goto L_0x09c9;
    L_0x09c8:
        r5 = 0;
    L_0x09c9:
        r4 = X.AnonymousClass0CC.zO;
        r4 = r4.m846H(r0);
        r4 = (java.lang.Integer) r4;
        r4 = r4.intValue();
        if (r4 != 0) goto L_0x09d9;
    L_0x09d7:
        r13 = 1;
        goto L_0x09da;
    L_0x09d9:
        r13 = 0;
    L_0x09da:
        if (r5 == 0) goto L_0x09fe;
    L_0x09dc:
        r4 = X.AnonymousClass0CC.vb;
        r4 = r4.m846H(r0);
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x09fe;
    L_0x09ea:
        r4 = X.AnonymousClass0CC.wb;
        r4 = r4.m846H(r0);
        r4 = (java.lang.Integer) r4;
        r4 = r4.intValue();
        r4 = r8.nextInt(r4);
        if (r4 >= r10) goto L_0x09fe;
    L_0x09fc:
        r5 = 1;
        goto L_0x09ff;
    L_0x09fe:
        r5 = 0;
    L_0x09ff:
        if (r13 == 0) goto L_0x0a22;
    L_0x0a01:
        r4 = X.AnonymousClass0CC.xb;
        r4 = r4.m846H(r0);
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x0a22;
    L_0x0a0f:
        r4 = X.AnonymousClass0CC.zb;
        r4 = r4.m846H(r0);
        r4 = (java.lang.Integer) r4;
        r4 = r4.intValue();
        r4 = r8.nextInt(r4);
        if (r4 >= r10) goto L_0x0a22;
    L_0x0a21:
        r3 = 1;
    L_0x0a22:
        if (r3 == 0) goto L_0x0a30;
    L_0x0a24:
        r4 = X.AnonymousClass0CC.yb;
        r4 = r4.m846H(r0);
        r4 = (java.lang.Integer) r4;
        r9 = r4.intValue();
    L_0x0a30:
        r8 = new X.0H7;
        r8.<init>(r5, r3, r9);
    L_0x0a35:
        r9 = new X.0Gx;
        r9.<init>();
        r9.f2496G = r1;
        r3 = "images";
        r9.f2493D = r3;
        r3 = X.AnonymousClass0FN.m1571C(r1);
        r9.f2494E = r3;
        r3 = X.AnonymousClass0Gz.f2522C;
        r9.f2511V = r3;
        r9.f2497H = r6;
        r3 = X.AnonymousClass0CC.pO;
        r3 = r3.m845G();
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        r9.f2491B = r3;
        r3 = X.AnonymousClass0CC.rO;
        r3 = r3.m845G();
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
        r9.f2503N = r3;
        r9.f2495F = r12;
        r3 = new X.0H1;
        r3.<init>();
        r9.f2498I = r3;
        r3 = new X.0H2;
        r3.<init>();
        r9.f2510U = r3;
        r3 = X.AnonymousClass0CC.AT;
        r3 = r3.m845G();
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
        r9.f2499J = r3;
        r3 = X.AnonymousClass0CC.f1478n;
        r3 = r3.m845G();
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        r9.f2492C = r3;
        r3 = X.AnonymousClass0CC.EW;
        r3 = r3.m845G();
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        r9.f2505P = r3;
        r3 = X.AnonymousClass0CC.Sb;
        r3 = r3.m845G();
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        r9.f2509T = r3;
        r3 = X.AnonymousClass0CC.zO;
        r3 = r3.m845G();
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
        r9.f2508S = r3;
        r3 = new X.0H3;
        r3.<init>();
        r9.f2502M = r3;
        r3 = X.AnonymousClass0H6.m1945B();
        r9.f2506Q = r3;
        r3 = new X.0H4;
        r3.<init>();
        r9.f2500K = r3;
        r9.f2504O = r11;
        if (r8 == 0) goto L_0x0ad9;
    L_0x0ad6:
        r9.f2507R = r8;
        goto L_0x0add;
    L_0x0ad9:
        r3 = X.AnonymousClass0Gs.f2430i;
        r9.f2507R = r3;
    L_0x0add:
        r13 = r9.f2496G;
        if (r13 == 0) goto L_0x0f70;
    L_0x0ae1:
        r12 = r9.f2493D;
        if (r12 == 0) goto L_0x0f70;
    L_0x0ae5:
        r17 = new X.0Gs;
        r32 = new X.0H8;
        r32.<init>();
        r33 = new X.0H8;
        r33.<init>();
        r3 = r9.f2511V;
        r34 = r3;
        r3 = r9.f2501L;
        r26 = r3;
        r3 = r9.f2497H;
        r5 = r9.f2503N;
        r25 = r5;
        r5 = r9.f2491B;
        r24 = r5;
        r5 = r9.f2495F;
        r23 = r5;
        r5 = r9.f2504O;
        r22 = r5;
        r5 = r9.f2494E;
        r21 = r5;
        r5 = r9.f2498I;
        r20 = r5;
        r29 = r17;
        r5 = r9.f2510U;
        r19 = r5;
        r5 = r9.f2499J;
        r18 = r5;
        r15 = r9.f2492C;
        r14 = r9.f2505P;
        r11 = r9.f2509T;
        r8 = r9.f2502M;
        r7 = r9.f2508S;
        r6 = r9.f2506Q;
        r5 = r9.f2500K;
        r9 = r9.f2507R;
        r30 = r13;
        r31 = r12;
        r35 = r26;
        r36 = r3;
        r38 = r25;
        r39 = r24;
        r40 = r23;
        r41 = r22;
        r42 = r21;
        r43 = r20;
        r44 = r19;
        r45 = r18;
        r46 = r15;
        r47 = r14;
        r48 = r11;
        r49 = r8;
        r50 = r7;
        r51 = r6;
        r52 = r5;
        r53 = r9;
        r29.<init>(r30, r31, r32, r33, r34, r35, r36, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53);
        X.AnonymousClass0Gs.f2431j = r17;
        X.AnonymousClass0FN.m1572D(r0);
        r4 = new X.0HA;
        r3 = r1.getApplicationContext();
        r4.<init>(r3);
        X.AnonymousClass0HA.f2534D = r4;
        r3 = new X.0HG;
        r3.<init>();
        com.instagram.common.ui.widget.imageview.IgImageView.setDecodeIntermediateSupplier(r3);
        r3 = X.AnonymousClass0CB.m840J();
        if (r3 != 0) goto L_0x0b9f;
    L_0x0b76:
        r3 = 1;
        com.instagram.common.ui.widget.imageview.IgImageView.f2540i = r3;
        r3 = X.AnonymousClass0FZ.m1634B();
        r5 = r3.f2177B;
        r4 = "debug_image_overlay_image_res";
        r3 = 0;
        r6 = r5.getBoolean(r4, r3);
        r3 = X.AnonymousClass0FZ.m1634B();
        r5 = r3.f2177B;
        r4 = "debug_image_overlay_scan_num";
        r3 = 0;
        r4 = r5.getBoolean(r4, r3);
        if (r6 != 0) goto L_0x0b97;
    L_0x0b95:
        if (r4 == 0) goto L_0x0b9f;
    L_0x0b97:
        r3 = new X.0HB;
        r3.<init>(r6, r4);
        com.instagram.common.ui.widget.imageview.IgImageView.setDebugOverlayDrawer(r3);
    L_0x0b9f:
        r4 = "fb_needs_reauth";
        r3 = new X.597;
        r3.<init>();
        X.AnonymousClass0HD.m1967B(r4, r3);
        r4 = "twitter_needs_reauth";
        r3 = new X.598;
        r3.<init>();
        X.AnonymousClass0HD.m1967B(r4, r3);
        r4 = "ameba_needs_reauth";
        r3 = new X.599;
        r3.<init>();
        X.AnonymousClass0HD.m1967B(r4, r3);
        r4 = "update_push_token";
        r3 = new X.59A;
        r3.<init>();
        X.AnonymousClass0HD.m1967B(r4, r3);
        r4 = "instagram_device_ids";
        r3 = 0;
        r3 = X.AnonymousClass0NN.m3291B(r4, r3);
        X.AnonymousClass4GD.B(r1, r3);
        r3.m3310R();
        r4 = X.AnonymousClass0Cc.f1696C;
        monitor-enter(r4);
        r3 = 1;
        r4.f1697B = r3;	 Catch:{ all -> 0x0f78 }
        r4.notifyAll();	 Catch:{ all -> 0x0f78 }
        monitor-exit(r4);
        r3 = X.AnonymousClass0CC.ZF;
        r3 = r3.m845G();
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        if (r3 != 0) goto L_0x0bfa;
    L_0x0bec:
        r5 = android.os.Looper.myQueue();
        r4 = new X.0HS;
        r3 = r28;
        r4.<init>(r3, r2);
        r5.addIdleHandler(r4);
    L_0x0bfa:
        if (r0 == 0) goto L_0x0c08;
    L_0x0bfc:
        r4 = android.os.Looper.myQueue();
        r3 = new X.0GV;
        r3.<init>(r1, r0);
        r4.addIdleHandler(r3);
    L_0x0c08:
        r3 = r2.xX();
        if (r3 == 0) goto L_0x0c18;
    L_0x0c0e:
        r3 = X.AnonymousClass0FL.m1559B(r2);
        X.AnonymousClass0HI.m1976C(r1, r3);
        X.AnonymousClass0at.m5493B(r3);
    L_0x0c18:
        r5 = X.AnonymousClass0F4.f2058E;
        r4 = X.AnonymousClass0F5.class;
        r3 = new X.0HK;
        r3.<init>(r1);
        r5.m1504A(r4, r3);
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r3 = X.AnonymousClass0Cq.f1767B;
        r4.append(r3);
        r3 = "|";
        r4.append(r3);
        r3 = X.AnonymousClass0Cq.f1770E;
        r4.append(r3);
        r3 = r4.toString();
        X.AnonymousClass0HL.f2600E = r3;
        r3 = r1.getApplicationContext();
        X.AnonymousClass0HL.f2603H = r3;
        r4 = r3.getPackageName();
        r3 = "com.instagram.android";
        r3 = r3.equals(r4);
        if (r3 != 0) goto L_0x0c7c;
    L_0x0c50:
        r3 = "com.instagram.android.preload";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0c59;
    L_0x0c58:
        goto L_0x0c7c;
    L_0x0c59:
        r3 = "com.whatsapp";
        r3 = r3.equals(r4);
        if (r3 != 0) goto L_0x0c77;
    L_0x0c61:
        r3 = "com.whatsapp.w4b";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0c6a;
    L_0x0c69:
        goto L_0x0c77;
    L_0x0c6a:
        r3 = "com.expresswifi.customer";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0c84;
    L_0x0c72:
        r3 = X.AnonymousClass0HL.f2599D;
        X.AnonymousClass0HL.f2602G = r3;
        goto L_0x0c84;
    L_0x0c77:
        r3 = "https://graph.whatsapp.net/v2.2/maps_configs?fields=base_url,static_base_url,osm_config,url_override_config&pretty=0&access_token=";
        X.AnonymousClass0HL.f2601F = r3;
        goto L_0x0c84;
    L_0x0c7c:
        r3 = "https://graph.instagram.com/maps_configs?fields=base_url,static_base_url,osm_config,url_override_config&pretty=0&access_token=";
        X.AnonymousClass0HL.f2601F = r3;
        r3 = X.AnonymousClass0HL.f2598C;
        X.AnonymousClass0HL.f2602G = r3;
    L_0x0c84:
        r3 = X.AnonymousClass0HL.f2606K;
        if (r3 != 0) goto L_0x0c9d;
    L_0x0c88:
        r3 = new X.0HN;
        r3.<init>();
        X.AnonymousClass0HL.f2606K = r3;
        r6 = X.AnonymousClass0HL.f2603H;
        r5 = X.AnonymousClass0HL.f2606K;
        r4 = new android.content.IntentFilter;
        r3 = "android.intent.action.LOCALE_CHANGED";
        r4.<init>(r3);
        r6.registerReceiver(r5, r4);
    L_0x0c9d:
        r5 = new X.0HO;
        r5.<init>();
        r4 = X.AnonymousClass0HP.class;
        monitor-enter(r4);
        r3 = X.AnonymousClass0HP.f2630R;	 Catch:{ all -> 0x0f7b }
        if (r3 == r5) goto L_0x0cab;	 Catch:{ all -> 0x0f7b }
    L_0x0ca9:
        X.AnonymousClass0HP.f2630R = r5;	 Catch:{ all -> 0x0f7b }
    L_0x0cab:
        monitor-exit(r4);
        r3 = new X.0HQ;
        r3.<init>();
        X.AnonymousClass0HR.f2634B = r3;
        r3 = r1.getResources();
        X.AnonymousClass0EH.m1381K(r3);
        r3 = X.AnonymousClass0CB.m834D();
        if (r3 == 0) goto L_0x0ce4;
    L_0x0cc0:
        r3 = "com.instagram.debug.devoptions.builtin.StethoInitializer";	 Catch:{ Exception -> 0x0cdd }
        r8 = java.lang.Class.forName(r3);	 Catch:{ Exception -> 0x0cdd }
        r5 = "init";	 Catch:{ Exception -> 0x0cdd }
        r7 = 1;	 Catch:{ Exception -> 0x0cdd }
        r4 = new java.lang.Class[r7];	 Catch:{ Exception -> 0x0cdd }
        r3 = android.app.Application.class;	 Catch:{ Exception -> 0x0cdd }
        r6 = 0;	 Catch:{ Exception -> 0x0cdd }
        r4[r6] = r3;	 Catch:{ Exception -> 0x0cdd }
        r5 = r8.getMethod(r5, r4);	 Catch:{ Exception -> 0x0cdd }
        r4 = 0;	 Catch:{ Exception -> 0x0cdd }
        r3 = new java.lang.Object[r7];	 Catch:{ Exception -> 0x0cdd }
        r3[r6] = r1;	 Catch:{ Exception -> 0x0cdd }
        r5.invoke(r4, r3);	 Catch:{ Exception -> 0x0cdd }
        goto L_0x0ce4;	 Catch:{ Exception -> 0x0cdd }
    L_0x0cdd:
        r1 = move-exception;
        r0 = new java.lang.RuntimeException;
        r0.<init>(r1);
        throw r0;
    L_0x0ce4:
        r3 = com.facebook.breakpad.BreakpadManager.isActive();
        if (r3 == 0) goto L_0x0cf4;
    L_0x0cea:
        r4 = X.AnonymousClass0Fj.f2192B;
        r3 = new X.0HH;
        r3.<init>();
        r4.m1666A(r3);
    L_0x0cf4:
        r3 = X.AnonymousClass0HT.f2637C;
        if (r3 != 0) goto L_0x0cff;
    L_0x0cf8:
        r3 = new X.0HT;
        r3.<init>(r1);
        X.AnonymousClass0HT.f2637C = r3;
    L_0x0cff:
        r3 = X.AnonymousClass0CC.xP;
        r3 = r3.m845G();
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        if (r3 == 0) goto L_0x0d10;
    L_0x0d0d:
        com.instagram.common.ui.widget.imageview.IgImageView.setKeepBitmapReference(r10);
    L_0x0d10:
        if (r0 == 0) goto L_0x0d23;
    L_0x0d12:
        r3 = X.AnonymousClass0CC.HC;
        r3 = r3.m846H(r0);
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        if (r3 == 0) goto L_0x0d23;
    L_0x0d20:
        r3 = 1;
        X.AnonymousClass0aa.f6564T = r3;
    L_0x0d23:
        if (r0 == 0) goto L_0x0d7a;
    L_0x0d25:
        r3 = X.AnonymousClass0HU.m2004B(r0);
        if (r3 == 0) goto L_0x0d7a;
    L_0x0d2b:
        r4 = new X.0HU;
        r3 = X.AnonymousClass0HV.m2008D(r0);
        r4.<init>(r1, r0, r3);
        r0 = r4.f2643D;
        r5 = r0.f2646B;
        r3 = "employee_dogfood_lockout_version_seen";
        r0 = -1;
        r3 = r5.getInt(r3, r0);
        r0 = r4.f2641B;
        r5 = X.AnonymousClass0FF.m1523B(r0);
        if (r5 == r3) goto L_0x0d7a;
    L_0x0d47:
        r0 = r4.f2643D;
        r0 = r0.f2646B;
        r3 = r0.edit();
        r0 = "employee_dogfood_lockout_version_seen";
        r0 = r3.putInt(r0, r5);
        r0.apply();
        r0 = r4.f2643D;
        r0 = r0.f2646B;
        r3 = r0.edit();
        r0 = "employee_dogfood_lockout_snooze";
        r0 = r3.remove(r0);
        r0.apply();
        r0 = r4.f2643D;
        r0 = r0.f2646B;
        r3 = r0.edit();
        r0 = "employee_dogfood_lockout_snooze_time";
        r0 = r3.remove(r0);
        r0.apply();
    L_0x0d7a:
        r0 = r2.xX();
        if (r0 == 0) goto L_0x0dbd;
    L_0x0d80:
        r0 = X.AnonymousClass0FL.m1559B(r2);
        r0 = X.AnonymousClass0Co.m1042B(r0);
        if (r0 == 0) goto L_0x0dbd;
    L_0x0d8a:
        r0 = X.AnonymousClass0FZ.m1634B();
        r3 = r0.f2177B;
        r2 = "instacrash_loop_test_crashes_left";
        r0 = 0;
        r6 = r3.getInt(r2, r0);
        if (r6 <= 0) goto L_0x0dbd;
    L_0x0d99:
        r0 = X.AnonymousClass0FZ.m1634B();
        r3 = r0.f2177B;
        r2 = "instacrash_loop_test_crash_time";
        r0 = 5;
        r2 = r3.getInt(r2, r0);
        r5 = new android.os.Handler;
        r5.<init>();
        r4 = new X.0M8;
        r4.<init>(r6);
        r0 = java.util.concurrent.TimeUnit.SECONDS;
        r2 = (long) r2;
        r2 = r0.toMillis(r2);
        r0 = 1862753340; // 0x6f075c3c float:4.189198E28 double:9.20322432E-315;
        X.AnonymousClass0OR.m3626F(r5, r4, r2, r0);
    L_0x0dbd:
        r0 = X.AnonymousClass0CC.iP;
        r2 = r0.m914G();
        r2 = (java.lang.String) r2;
        r0 = android.os.Build.VERSION.RELEASE;
        r0 = X.AnonymousClass0HW.m2066C(r0);
        r4 = X.AnonymousClass0HW.m2065B(r2, r0);
        r3 = X.AnonymousClass0HX.class;	 Catch:{ IOException -> 0x0deb, IOException -> 0x0deb }
        monitor-enter(r3);	 Catch:{ IOException -> 0x0deb, IOException -> 0x0deb }
        X.AnonymousClass0HX.m2069C(r1, r4);	 Catch:{ all -> 0x0f7e }
        r2 = "com.facebook.secure.switchoff";	 Catch:{ all -> 0x0f7e }
        r0 = 0;	 Catch:{ all -> 0x0f7e }
        r0 = r1.getSharedPreferences(r2, r0);	 Catch:{ all -> 0x0f7e }
        r2 = r0.edit();	 Catch:{ all -> 0x0f7e }
        r0 = "last_criteria";	 Catch:{ all -> 0x0f7e }
        r0 = r2.putString(r0, r4);	 Catch:{ all -> 0x0f7e }
        r0.apply();	 Catch:{ all -> 0x0f7e }
        monitor-exit(r3);	 Catch:{ IOException -> 0x0deb, IOException -> 0x0deb }
        goto L_0x0df6;	 Catch:{ IOException -> 0x0deb, IOException -> 0x0deb }
    L_0x0deb:
        r4 = move-exception;
        r3 = "SwitchOffConfiguration";
        r2 = "Error on updating switch-off configuration";
        r0 = 0;
        r0 = new java.lang.Object[r0];
        X.AnonymousClass0Dc.m1246I(r3, r4, r2, r0);
    L_0x0df6:
        X.AnonymousClass0HY.m2071B();
        r0 = X.AnonymousClass0CC.zc;
        r0 = X.AnonymousClass0E6.m1316B(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0e57;
    L_0x0e07:
        r0 = X.AnonymousClass0FH.f2099C;
        r3 = r0.f2100B;
        r2 = "exposed_session_scoping_facebook_account";
        r0 = 0;
        r0 = r3.getBoolean(r2, r0);
        if (r0 == 0) goto L_0x0e57;
    L_0x0e14:
        X.AnonymousClass0Mt.m3239B();
        r0 = X.AnonymousClass0Cd.f1698B;
        r2 = r0.m961E();
        r0 = X.AnonymousClass26g.B(r2);
        if (r0 != 0) goto L_0x0e43;
    L_0x0e23:
        r2 = r2.iterator();
    L_0x0e27:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0e43;
    L_0x0e2d:
        r0 = r2.next();
        r0 = (java.lang.String) r0;
        r0 = X.AnonymousClass0Mt.m3246I(r0);
        r0 = r0.edit();
        r0 = r0.clear();
        r0.apply();
        goto L_0x0e27;
    L_0x0e43:
        X.AnonymousClass0Iq.m2353D();
        r0 = X.AnonymousClass0FH.f2099C;
        r0 = r0.f2100B;
        r2 = r0.edit();
        r0 = "exposed_session_scoping_facebook_account";
        r0 = r2.remove(r0);
        r0.apply();
    L_0x0e57:
        X.AnonymousClass3VV.B(r1);
        r0 = r54;
        r1 = r0.mContext;
        r0.initPushNotifications(r1);
        r0 = isAppLauncherShortcutsEnabled();
        if (r0 == 0) goto L_0x0e75;
    L_0x0e67:
        r2 = android.os.Looper.myQueue();
        r1 = new X.0HZ;
        r0 = r54;
        r1.<init>(r0);
        r2.addIdleHandler(r1);
    L_0x0e75:
        r54.maybeEnableShareToStory();
        if (r16 == 0) goto L_0x0e7d;
    L_0x0e7a:
        android.os.Process.setThreadPriority(r27);
    L_0x0e7d:
        r1 = "enableCustomDrawables";	 Catch:{ all -> 0x0ef0 }
        r0 = 1055339763; // 0x3ee734f3 float:0.45157585 double:5.214071216E-315;	 Catch:{ all -> 0x0ef0 }
        X.AnonymousClass0CN.m901B(r1, r0);	 Catch:{ all -> 0x0ef0 }
        r0 = r54;	 Catch:{ all -> 0x0ef0 }
        r0 = r0.mContext;	 Catch:{ all -> 0x0ef0 }
        r4 = r0.getResources();	 Catch:{ all -> 0x0ef0 }
        r1 = X.AnonymousClass3ch.B();	 Catch:{ Exception -> 0x0ed1 }
        r0 = "sPreloadedDrawables";	 Catch:{ Exception -> 0x0ed1 }
        r2 = r1.getDeclaredField(r0);	 Catch:{ Exception -> 0x0ed1 }
        r0 = 1;	 Catch:{ Exception -> 0x0ed1 }
        r2.setAccessible(r0);	 Catch:{ Exception -> 0x0ed1 }
        r1 = 0;	 Catch:{ Exception -> 0x0ed1 }
        r3 = r2.get(r1);	 Catch:{ Exception -> 0x0ed1 }
        r0 = r3 instanceof android.util.LongSparseArray;	 Catch:{ Exception -> 0x0ed1 }
        if (r0 == 0) goto L_0x0eb3;	 Catch:{ Exception -> 0x0ed1 }
    L_0x0ea4:
        r0 = r3 instanceof X.AnonymousClass3ch;	 Catch:{ Exception -> 0x0ed1 }
        if (r0 != 0) goto L_0x0ed9;	 Catch:{ Exception -> 0x0ed1 }
    L_0x0ea8:
        r0 = new X.3ch;	 Catch:{ Exception -> 0x0ed1 }
        r3 = (android.util.LongSparseArray) r3;	 Catch:{ Exception -> 0x0ed1 }
        r0.<init>(r3, r4);	 Catch:{ Exception -> 0x0ed1 }
        r2.set(r1, r0);	 Catch:{ Exception -> 0x0ed1 }
        goto L_0x0ed9;	 Catch:{ Exception -> 0x0ed1 }
    L_0x0eb3:
        r0 = r3 instanceof android.util.LongSparseArray[];	 Catch:{ Exception -> 0x0ed1 }
        if (r0 == 0) goto L_0x0ed9;	 Catch:{ Exception -> 0x0ed1 }
    L_0x0eb7:
        r3 = (android.util.LongSparseArray[]) r3;	 Catch:{ Exception -> 0x0ed1 }
        r3 = (android.util.LongSparseArray[]) r3;	 Catch:{ Exception -> 0x0ed1 }
        r2 = 0;	 Catch:{ Exception -> 0x0ed1 }
    L_0x0ebc:
        r0 = r3.length;	 Catch:{ Exception -> 0x0ed1 }
        if (r2 >= r0) goto L_0x0ed9;	 Catch:{ Exception -> 0x0ed1 }
    L_0x0ebf:
        r0 = r3[r2];	 Catch:{ Exception -> 0x0ed1 }
        r0 = r0 instanceof X.AnonymousClass3ch;	 Catch:{ Exception -> 0x0ed1 }
        if (r0 != 0) goto L_0x0ece;	 Catch:{ Exception -> 0x0ed1 }
    L_0x0ec5:
        r1 = new X.3ch;	 Catch:{ Exception -> 0x0ed1 }
        r0 = r3[r2];	 Catch:{ Exception -> 0x0ed1 }
        r1.<init>(r0, r4);	 Catch:{ Exception -> 0x0ed1 }
        r3[r2] = r1;	 Catch:{ Exception -> 0x0ed1 }
    L_0x0ece:
        r2 = r2 + 1;	 Catch:{ Exception -> 0x0ed1 }
        goto L_0x0ebc;	 Catch:{ Exception -> 0x0ed1 }
    L_0x0ed1:
        r2 = move-exception;	 Catch:{ all -> 0x0ef0 }
        r1 = "IgCustomDrawablesCache";	 Catch:{ all -> 0x0ef0 }
        r0 = "Could not enable custom drawable support";	 Catch:{ all -> 0x0ef0 }
        X.AnonymousClass0Gn.m1878E(r1, r0, r2);	 Catch:{ all -> 0x0ef0 }
    L_0x0ed9:
        r0 = -738063903; // 0xffffffffd40209e1 float:-2.23404596E12 double:NaN;
        X.AnonymousClass0CN.m902C(r0);
        r1 = "init_to_app_created";
        r0 = "AppStartPerformanceTracer";
        X.AnonymousClass0FM.m1565B(r1, r0);
        r1 = X.AnonymousClass0F9.m1509C();
        r0 = "APP_CREATED";
        X.AnonymousClass0F9.m1510D(r1, r0);
        return;
    L_0x0ef0:
        r1 = move-exception;
        r0 = -610475406; // 0xffffffffdb9ce272 float:-8.8318151E16 double:NaN;
        X.AnonymousClass0CN.m902C(r0);
        throw r1;
    L_0x0ef8:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
    L_0x0efb:
        r1 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0f03 }
        r0 = "Application needs to be registered before native crash reporting";	 Catch:{ all -> 0x0f03 }
        r1.<init>(r0);	 Catch:{ all -> 0x0f03 }
        throw r1;	 Catch:{ all -> 0x0f03 }
    L_0x0f03:
        r0 = move-exception;	 Catch:{ all -> 0x0f03 }
        monitor-exit(r2);	 Catch:{ all -> 0x0f03 }
        throw r0;
    L_0x0f06:
        r1 = new java.lang.IllegalStateException;
        r0 = "Native crash reporting is already initialized";
        r1.<init>(r0);
        throw r1;
    L_0x0f0e:
        r2 = new java.lang.IllegalStateException;	 Catch:{ Throwable -> 0x029f }
        r0 = "Orchestrator already initialized";	 Catch:{ Throwable -> 0x029f }
        r2.<init>(r0);	 Catch:{ Throwable -> 0x029f }
    L_0x0f15:
        throw r2;	 Catch:{ Throwable -> 0x029f }
    L_0x0f16:
        r0 = move-exception;	 Catch:{ all -> 0x0f16 }
        monitor-exit(r13);	 Catch:{ all -> 0x0f16 }
    L_0x0f18:
        throw r0;	 Catch:{ Throwable -> 0x029f }
    L_0x0f19:
        r0 = move-exception;
        monitor-exit(r13);	 Catch:{ all -> 0x0f19 }
        goto L_0x0f18;	 Catch:{ all -> 0x0f19 }
    L_0x0f1c:
        r2 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0f24 }
        r0 = "TraceControl already initialized";	 Catch:{ all -> 0x0f24 }
        r2.<init>(r0);	 Catch:{ all -> 0x0f24 }
        throw r2;	 Catch:{ all -> 0x0f24 }
    L_0x0f24:
        r2 = move-exception;	 Catch:{ all -> 0x0f24 }
        monitor-exit(r4);	 Catch:{ all -> 0x0f24 }
        goto L_0x0f15;	 Catch:{ all -> 0x0f24 }
    L_0x0f27:
        r2 = new java.lang.IllegalStateException;	 Catch:{ Throwable -> 0x029f }
        r0 = "TraceControl already initialized";	 Catch:{ Throwable -> 0x029f }
        r2.<init>(r0);	 Catch:{ Throwable -> 0x029f }
        goto L_0x0f15;	 Catch:{ Throwable -> 0x029f }
    L_0x0f2f:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
    L_0x0f32:
        r1 = move-exception;
        r0 = 1945680591; // 0x73f8bacf float:3.9412798E31 double:9.61293938E-315;
        X.AnonymousClass0CN.m902C(r0);
        throw r1;
    L_0x0f3a:
        r0 = move-exception;	 Catch:{ all -> 0x0f32 }
        monitor-exit(r13);	 Catch:{ all -> 0x0f32 }
    L_0x0f3c:
        throw r0;	 Catch:{ all -> 0x0f32 }
    L_0x0f3d:
        r0 = move-exception;
        goto L_0x0f47;
    L_0x0f3f:
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x0f3d }
        r0 = "Logger cannot be null";	 Catch:{ all -> 0x0f3d }
        r1.<init>(r0);	 Catch:{ all -> 0x0f3d }
        throw r1;	 Catch:{ all -> 0x0f3d }
    L_0x0f47:
        monitor-exit(r13);	 Catch:{ all -> 0x0f32 }
        goto L_0x0f3c;	 Catch:{ all -> 0x0f32 }
    L_0x0f49:
        r0 = move-exception;	 Catch:{ all -> 0x0f32 }
        monitor-exit(r5);	 Catch:{ all -> 0x0f32 }
        goto L_0x0f3c;	 Catch:{ all -> 0x0f32 }
    L_0x0f4c:
        r1 = new java.lang.RuntimeException;
        r0 = "ConnectionChangeReporter instance already created";
        r1.<init>(r0);
        throw r1;
    L_0x0f54:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
    L_0x0f57:
        r1 = new java.lang.RuntimeException;
        r0 = "GCMConstants has already been initialized.";
        r1.<init>(r0);
        throw r1;
    L_0x0f5f:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
    L_0x0f62:
        r1 = move-exception;
        r0 = -1577762314; // 0xffffffffa1f541f6 float:-1.6619305E-18 double:NaN;
        X.AnonymousClass0CN.m902C(r0);
        throw r1;
    L_0x0f6a:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
    L_0x0f6d:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
    L_0x0f70:
        r1 = new java.lang.IllegalArgumentException;
        r0 = "Missing required parameter to build image cache";
        r1.<init>(r0);
        throw r1;
    L_0x0f78:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
    L_0x0f7b:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
    L_0x0f7e:
        r0 = move-exception;	 Catch:{ IOException -> 0x0deb, IOException -> 0x0deb }
        monitor-exit(r3);	 Catch:{ IOException -> 0x0deb, IOException -> 0x0deb }
        throw r0;	 Catch:{ IOException -> 0x0deb, IOException -> 0x0deb }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.process.instagram.InstagramApplicationForMainProcess.onCreate(java.lang.String, long, long):void");
    }
}
