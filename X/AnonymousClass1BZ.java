package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkRequest.Builder;
import android.os.Bundle;
import com.facebook.push.fbns.ipc.FbnsAIDLRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.common.notifications.push.PushChannelType;
import com.instagram.push.fbns.FbnsInitBroadcastReceiver;
import java.util.Random;

/* renamed from: X.1BZ */
public final class AnonymousClass1BZ implements AnonymousClass0aq {
    /* renamed from: B */
    public final String f15408B;
    /* renamed from: C */
    public final AnonymousClass0EJ f15409C = new AnonymousClass1Be(this);
    /* renamed from: D */
    public final ConnectivityManager f15410D;
    /* renamed from: E */
    public final Context f15411E;
    /* renamed from: F */
    public final AnonymousClass1Bd f15412F;
    /* renamed from: G */
    public FbnsInitBroadcastReceiver f15413G;
    /* renamed from: H */
    public final AnonymousClass3aY f15414H;
    /* renamed from: I */
    public boolean f15415I;
    /* renamed from: J */
    public boolean f15416J;
    /* renamed from: K */
    public String f15417K;

    public AnonymousClass1BZ(String str, Context context) {
        Boolean bool = null;
        this.f15411E = context;
        this.f15408B = str;
        this.f15414H = new AnonymousClass3aY(context);
        this.f15410D = (ConnectivityManager) this.f15411E.getSystemService("connectivity");
        if (AnonymousClass1BZ.m9834C(this)) {
            bool = Boolean.valueOf(true);
        }
        this.f15412F = new AnonymousClass1Bd(context, new AnonymousClass3aZ(this), 0, new AnonymousClass1Bc(null, 0, null, bool, null));
        this.f15416J = AnonymousClass1BY.m9828B(this.f15411E);
    }

    /* renamed from: B */
    public static PendingIntent m9833B(AnonymousClass1BZ anonymousClass1BZ) {
        Intent intent = new Intent(anonymousClass1BZ.f15411E, FbnsInitBroadcastReceiver.class);
        intent.setAction("android.net.conn.CONNECTIVITY_CHANGE");
        return PendingIntent.getBroadcast(anonymousClass1BZ.f15411E, 0, intent, 134217728);
    }

    /* renamed from: C */
    public static boolean m9834C(AnonymousClass1BZ anonymousClass1BZ) {
        if (AnonymousClass0EF.m1362M(anonymousClass1BZ.f15411E)) {
            return AnonymousClass1BY.m9830D();
        }
        return AnonymousClass0EF.m1358I(anonymousClass1BZ.f15411E) ? AnonymousClass1BY.m9831E() : false;
    }

    /* renamed from: D */
    private void m9835D(boolean r5) {
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
        r4 = this;
        r3 = new android.content.ComponentName;
        r0 = r4.f15411E;
        r1 = com.instagram.push.fbns.FbnsInitBroadcastReceiver.class;
        r3.<init>(r0, r1);
        r0 = r4.f15411E;
        r2 = r0.getPackageManager();
        r1.getCanonicalName();
        java.lang.Boolean.valueOf(r5);
        r1 = 1;
        if (r5 == 0) goto L_0x001a;
    L_0x0018:
        r0 = 1;
        goto L_0x001b;
    L_0x001a:
        r0 = 2;
    L_0x001b:
        r2.setComponentEnabledSetting(r3, r0, r1);
        if (r5 != 0) goto L_0x005e;
    L_0x0020:
        monitor-enter(r4);
        r0 = X.AnonymousClass0CC.sK;	 Catch:{ all -> 0x005f }
        r0 = r0.m845G();	 Catch:{ all -> 0x005f }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x005f }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x005f }
        if (r0 == 0) goto L_0x0036;	 Catch:{ all -> 0x005f }
    L_0x002f:
        r1 = X.AnonymousClass0Fj.f2192B;	 Catch:{ all -> 0x005f }
        r0 = r4.f15409C;	 Catch:{ all -> 0x005f }
        r1.m1669D(r0);	 Catch:{ all -> 0x005f }
    L_0x0036:
        r0 = r4.f15413G;	 Catch:{ all -> 0x005f }
        if (r0 == 0) goto L_0x005d;	 Catch:{ all -> 0x005f }
    L_0x003a:
        r3 = 0;	 Catch:{ all -> 0x005f }
        r1 = r4.f15411E;	 Catch:{ IllegalArgumentException -> 0x0050, all -> 0x004e }
        r0 = r4.f15413G;	 Catch:{ IllegalArgumentException -> 0x0050, all -> 0x004e }
        r1.unregisterReceiver(r0);	 Catch:{ IllegalArgumentException -> 0x0050, all -> 0x004e }
    L_0x0042:
        r4.f15413G = r3;	 Catch:{ all -> 0x005f }
        r1 = r4.f15410D;	 Catch:{ all -> 0x005f }
        r0 = X.AnonymousClass1BZ.m9833B(r4);	 Catch:{ all -> 0x005f }
        r1.unregisterNetworkCallback(r0);	 Catch:{ all -> 0x005f }
        goto L_0x005d;	 Catch:{ all -> 0x005f }
    L_0x004e:
        r2 = move-exception;
        goto L_0x0051;
    L_0x0050:
        goto L_0x0042;
    L_0x0051:
        r4.f15413G = r3;	 Catch:{ all -> 0x005f }
        r1 = r4.f15410D;	 Catch:{ all -> 0x005f }
        r0 = X.AnonymousClass1BZ.m9833B(r4);	 Catch:{ all -> 0x005f }
        r1.unregisterNetworkCallback(r0);	 Catch:{ all -> 0x005f }
        throw r2;	 Catch:{ all -> 0x005f }
    L_0x005d:
        monitor-exit(r4);
    L_0x005e:
        return;
    L_0x005f:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1BZ.D(boolean):void");
    }

    public final void FW(String str, boolean z) {
        this.f15417K = str;
        this.f15415I = z;
        if (this.f15416J) {
            synchronized (this) {
                if (((Boolean) AnonymousClass0CC.sK.m845G()).booleanValue()) {
                    AnonymousClass0Fj.f2192B.m1666A(this.f15409C);
                }
                if (this.f15413G == null && AnonymousClass2kN.B(this.f15411E, 24)) {
                    this.f15413G = new FbnsInitBroadcastReceiver();
                    IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                    if (AnonymousClass2kN.B(this.f15411E, 26)) {
                        intentFilter.addAction("android.intent.action.USER_PRESENT");
                    }
                    this.f15411E.registerReceiver(this.f15413G, intentFilter);
                    this.f15410D.registerNetworkCallback(new Builder().addCapability(12).addCapability(13).build(), AnonymousClass1BZ.m9833B(this));
                }
            }
            m9835D(true);
            if (str != null) {
                Bundle bundle;
                boolean z2;
                Context context = this.f15411E;
                String A = AnonymousClass0Dt.f1941C.m1312A(this.f15411E);
                int i = 30;
                int i2 = 10000;
                if (!z) {
                    if (AnonymousClass1E1.m10139B(context).m10140A()) {
                        i2 = 30;
                        Integer.valueOf(i2);
                        Integer.valueOf(i);
                        bundle = new Bundle();
                        z2 = false;
                        if (i > 10000) {
                            AnonymousClass0Dc.m1255R(AnonymousClass1DC.f15639B, "Wrong analytics sampling rate: %d", Integer.valueOf(i));
                            i = 1;
                        }
                        if (new Random().nextInt(10000) < i) {
                            z2 = true;
                        }
                        AnonymousClass1E2.LOGGING_ANALYTICS_EVENTS_SAMPLE_RATE.m10145E(bundle, Integer.valueOf(i));
                        AnonymousClass1E2.LOG_ANALYTICS_EVENTS.m10145E(bundle, Boolean.valueOf(z2));
                        AnonymousClass1E2.ANALYTIC_FB_UID.m10145E(bundle, JsonProperty.USE_DEFAULT_NAME);
                        AnonymousClass1E2.ANALYTIC_UID.m10145E(bundle, A);
                        AnonymousClass1E2.ANALYTIC_IS_EMPLOYEE.m10145E(bundle, Boolean.valueOf(z));
                        AnonymousClass1E2.ANALYTIC_YEAR_CLASS.m10145E(bundle, Integer.valueOf(-1));
                        AnonymousClass1E2.LOGGING_HEALTH_STATS_SAMPLE_RATE.m10145E(bundle, Integer.valueOf(i2));
                        new AnonymousClass1E7(context).m10171A(new FbnsAIDLRequest(bundle, AnonymousClass1EC.SET_ANALYTICS_CONFIG.m10177B()));
                    }
                }
                i = 10000;
                Integer.valueOf(i2);
                Integer.valueOf(i);
                bundle = new Bundle();
                z2 = false;
                if (i > 10000) {
                    AnonymousClass0Dc.m1255R(AnonymousClass1DC.f15639B, "Wrong analytics sampling rate: %d", Integer.valueOf(i));
                    i = 1;
                }
                if (new Random().nextInt(10000) < i) {
                    z2 = true;
                }
                AnonymousClass1E2.LOGGING_ANALYTICS_EVENTS_SAMPLE_RATE.m10145E(bundle, Integer.valueOf(i));
                AnonymousClass1E2.LOG_ANALYTICS_EVENTS.m10145E(bundle, Boolean.valueOf(z2));
                AnonymousClass1E2.ANALYTIC_FB_UID.m10145E(bundle, JsonProperty.USE_DEFAULT_NAME);
                AnonymousClass1E2.ANALYTIC_UID.m10145E(bundle, A);
                AnonymousClass1E2.ANALYTIC_IS_EMPLOYEE.m10145E(bundle, Boolean.valueOf(z));
                AnonymousClass1E2.ANALYTIC_YEAR_CLASS.m10145E(bundle, Integer.valueOf(-1));
                AnonymousClass1E2.LOGGING_HEALTH_STATS_SAMPLE_RATE.m10145E(bundle, Integer.valueOf(i2));
                new AnonymousClass1E7(context).m10171A(new FbnsAIDLRequest(bundle, AnonymousClass1EC.SET_ANALYTICS_CONFIG.m10177B()));
            }
            if (!AnonymousClass0EF.m1362M(this.f15411E)) {
                if (!AnonymousClass0EF.m1358I(this.f15411E) || !AnonymousClass1BY.m9831E()) {
                    AnonymousClass1Bg anonymousClass1Bg = this.f15412F.f15429D;
                    AnonymousClass1D8.m9968B(AnonymousClass1Bg.m9854C(anonymousClass1Bg).edit().putInt("shared_qe_flag", -1).putBoolean("sharing_state_enabled", false).putBoolean("register_and_stop", false).putInt("cached_qe_flag", anonymousClass1Bg.f15433C).remove("shared_flag").remove("leader_package"));
                    AnonymousClass1Bg.m9853B(anonymousClass1Bg, anonymousClass1Bg.f15433C, "SHARING_IS_DISABLED");
                    return;
                }
            }
            this.f15412F.m9849B();
            return;
        }
        Tq();
    }

    public final PushChannelType IQ() {
        if (this.f15416J) {
            return PushChannelType.FBNS;
        }
        return this.f15414H.IQ();
    }

    public final void Tq() {
        m9835D(false);
        AnonymousClass1Bg anonymousClass1Bg = this.f15412F.f15429D;
        AnonymousClass1Bd anonymousClass1Bd = anonymousClass1Bg.f15434D;
        int i = AnonymousClass1Bd.m9847D(anonymousClass1Bd).getInt("shared_flag", -1);
        if (AnonymousClass1Co.m9932E(anonymousClass1Bd.f15428C) && i == 2) {
            AnonymousClass1DC.m9976G(anonymousClass1Bd.f15428C, AnonymousClass1Bd.m9846C(anonymousClass1Bd, i));
        } else {
            Context context = anonymousClass1Bd.f15428C;
            AnonymousClass1DC.m9976G(context, context.getPackageName());
        }
        anonymousClass1Bg.f15434D.m9848A(true);
        new AnonymousClass0AH(anonymousClass1Bg.f15432B).m685A(AnonymousClass061.TOKEN_STORE).m682B().SE().nE();
        Context context2 = this.f15411E;
        Boolean.valueOf(false);
        Bundle bundle = new Bundle();
        AnonymousClass1E2.ANALYTIC_FB_UID.m10145E(bundle, null);
        AnonymousClass1E2.ANALYTIC_IS_EMPLOYEE.m10145E(bundle, Boolean.valueOf(false));
        AnonymousClass1E7 anonymousClass1E7 = new AnonymousClass1E7(context2);
        FbnsAIDLRequest fbnsAIDLRequest = new FbnsAIDLRequest(bundle, AnonymousClass1EC.SET_ANALYTICS_CONFIG.m10177B());
        anonymousClass1E7.m10171A(fbnsAIDLRequest);
    }

    public final void zIA() {
        boolean B = AnonymousClass1BY.m9828B(this.f15411E);
        if (this.f15416J != B) {
            this.f15416J = B;
            FW(this.f15417K, this.f15415I);
        }
        if (this.f15416J) {
            AnonymousClass1Bd anonymousClass1Bd = this.f15412F;
            String str = this.f15408B;
            SharedPreferences D = AnonymousClass1Bd.m9847D(anonymousClass1Bd);
            int i = D.getInt("shared_flag", -1);
            B = AnonymousClass1Co.m9932E(anonymousClass1Bd.f15428C);
            if (B && anonymousClass1Bd.f15427B.m9850A().booleanValue()) {
                Context context = anonymousClass1Bd.f15428C;
                AnonymousClass1DC.m9973D(context, str, AnonymousClass1Co.m9930C(context));
            } else if (B || i != 2 || AnonymousClass1Co.m9929B(anonymousClass1Bd.f15428C)) {
                AnonymousClass1DC.m9973D(anonymousClass1Bd.f15428C, str, null);
            } else {
                AnonymousClass1D8.m9968B(D.edit().putBoolean("register_and_stop", true));
                AnonymousClass1DC.m9973D(anonymousClass1Bd.f15428C, str, null);
            }
        }
        this.f15414H.zIA();
    }
}
