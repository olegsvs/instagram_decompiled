package com.instagram.app;

import X.AnonymousClass0C8;
import X.AnonymousClass0CA;
import X.AnonymousClass0CB;
import X.AnonymousClass0CC;
import X.AnonymousClass0CF;
import X.AnonymousClass0CG;
import X.AnonymousClass0CH;
import X.AnonymousClass0CI;
import X.AnonymousClass0CK;
import X.AnonymousClass0CL;
import X.AnonymousClass0CM;
import X.AnonymousClass0CN;
import X.AnonymousClass0CO;
import X.AnonymousClass5dr;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.facebook.common.dextricks.DexLibLoader;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.profilo.logger.Logger;
import java.io.File;

public class InstagramAppShell extends Application implements AnonymousClass0C8 {
    /* renamed from: B */
    private long f1429B = -1;
    /* renamed from: C */
    private AnonymousClass0CH f1430C;
    /* renamed from: D */
    private long f1431D = -1;

    /* renamed from: B */
    private java.lang.String m827B() {
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
        r5 = this;
        r4 = android.os.Process.myPid();
        r0 = "activity";
        r3 = r5.getSystemService(r0);
        r3 = (android.app.ActivityManager) r3;
        r0 = r3.getRunningAppProcesses();
        r2 = r0.iterator();
    L_0x0014:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0027;
    L_0x001a:
        r1 = r2.next();
        r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1;
        r0 = r1.pid;
        if (r0 != r4) goto L_0x0014;
    L_0x0024:
        r0 = r1.processName;
        return r0;
    L_0x0027:
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r3.getRunningServices(r0);
        r2 = r0.iterator();
    L_0x0031:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0044;
    L_0x0037:
        r1 = r2.next();
        r1 = (android.app.ActivityManager.RunningServiceInfo) r1;
        r0 = r1.pid;
        if (r0 != r4) goto L_0x0031;
    L_0x0041:
        r0 = r1.process;
        return r0;
    L_0x0044:
        r3 = 0;
        r2 = new java.io.FileReader;	 Catch:{ IOException -> 0x0071, all -> 0x006a }
        r0 = "/proc/self/cmdline";	 Catch:{ IOException -> 0x0071, all -> 0x006a }
        r2.<init>(r0);	 Catch:{ IOException -> 0x0071, all -> 0x006a }
        r1 = new java.io.BufferedReader;	 Catch:{ IOException -> 0x0071, all -> 0x006a }
        r0 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ IOException -> 0x0071, all -> 0x006a }
        r1.<init>(r2, r0);	 Catch:{ IOException -> 0x0071, all -> 0x006a }
        r0 = r1.readLine();	 Catch:{ IOException -> 0x0068, all -> 0x0065 }
        if (r0 == 0) goto L_0x0061;	 Catch:{ IOException -> 0x0068, all -> 0x0065 }
    L_0x0059:
        r0 = r0.trim();	 Catch:{ IOException -> 0x0068, all -> 0x0065 }
        r1.close();	 Catch:{ IOException -> 0x0060 }
    L_0x0060:
        return r0;
    L_0x0061:
        r1.close();	 Catch:{ IOException -> 0x0076 }
        goto L_0x0076;	 Catch:{ IOException -> 0x0076 }
    L_0x0065:
        r0 = move-exception;
        r3 = r1;
        goto L_0x006b;
    L_0x0068:
        r3 = r1;
        goto L_0x0071;
    L_0x006a:
        r0 = move-exception;
    L_0x006b:
        if (r3 == 0) goto L_0x0070;
    L_0x006d:
        r3.close();	 Catch:{ IOException -> 0x0070 }
    L_0x0070:
        throw r0;
    L_0x0071:
        if (r3 == 0) goto L_0x0076;
    L_0x0073:
        r3.close();	 Catch:{ IOException -> 0x0076 }
    L_0x0076:
        r1 = new java.lang.IllegalStateException;
        r0 = "Can't find current process's name";
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.app.InstagramAppShell.B():java.lang.String");
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.f1429B = AwakeTimeSinceBootClock.get().now();
        AnonymousClass0CA.f1433C = getSharedPreferences("pre_init_qe", 0);
        if (AnonymousClass0CB.m835E()) {
            AnonymousClass0CB.m837G();
            if (AnonymousClass0CB.m837G()) {
                BroadcastReceiver anonymousClass5dr = new AnonymousClass5dr();
                String packageName = getPackageName();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(packageName);
                stringBuilder.append("._EXOPACKAGE_DIR_UPDATED");
                registerReceiver(anonymousClass5dr, new IntentFilter(stringBuilder.toString()));
                return;
            }
            return;
        }
        if (AnonymousClass0CA.m828B(AnonymousClass0CC.tU)) {
            AnonymousClass0CF.m854C(this, AnonymousClass0CB.m838H());
            DexLibLoader.loadAll(this);
        } else {
            AnonymousClass0CG.m869E(this);
        }
        this.f1431D = AwakeTimeSinceBootClock.get().now();
    }

    public final Object getAppService(Class cls) {
        return this.f1430C.getAppService(cls);
    }

    public final File getCacheDir() {
        AnonymousClass0CH anonymousClass0CH = this.f1430C;
        return anonymousClass0CH != null ? anonymousClass0CH.getCacheDir(super.getCacheDir()) : super.getCacheDir();
    }

    public final File getDir(String str, int i) {
        AnonymousClass0CH anonymousClass0CH = this.f1430C;
        if (anonymousClass0CH != null) {
            str = anonymousClass0CH.getDir(str, i);
        }
        return super.getDir(str, i);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1430C.onConfigurationChangedCallback(configuration);
    }

    public final void onCreate() {
        int writeEntryWithoutMatch = Logger.writeEntryWithoutMatch(AnonymousClass0CI.f1516F, 32, 1026255790);
        super.onCreate();
        Object obj = (AnonymousClass0CB.m840J() && AnonymousClass0CK.m881E()) ? 1 : null;
        if (AnonymousClass0CA.m828B(AnonymousClass0CC.mJ) || obj == null) {
            Context applicationContext = getApplicationContext();
            boolean H = AnonymousClass0CB.m838H();
            if (!AnonymousClass0CL.f1532B) {
                AnonymousClass0CF.m854C(applicationContext, H);
                AnonymousClass0CM.f1533B = 1;
                AnonymousClass0CM.m889F(1, "SystraceInit");
                AnonymousClass0CM.m895L(1);
            }
            AnonymousClass0CL.f1532B = true;
        }
        AnonymousClass0CN.m901B("IgAppShell.onCreate", -1540194984);
        try {
            AnonymousClass0CO.m903B(this, "instagram", obj != null ? "https://www.facebook.com/mobile/instagram_android_crash_logs/" : "https://www.facebook.com/mobile/instagram_android_beta_crash_logs/");
            String B = m827B();
            this.f1430C = (AnonymousClass0CH) Class.forName(getPackageName().equals(B) ? "com.instagram.process.instagram.InstagramApplicationForMainProcess" : "com.instagram.process.secondary.InstagramApplicationForSecondaryProcess").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{this});
            AnonymousClass0CN.m901B("Delegate.onCreate", 877480901);
            this.f1430C.onCreate(B, this.f1429B, this.f1431D);
            AnonymousClass0CN.m902C(-1449655404);
            AnonymousClass0CN.m902C(1341860293);
            Logger.writeEntry(AnonymousClass0CI.f1516F, 33, 1945811009, writeEntryWithoutMatch);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            AnonymousClass0CN.m902C(-475778813);
            Logger.writeEntry(AnonymousClass0CI.f1516F, 33, 781758597, writeEntryWithoutMatch);
        }
    }
}
