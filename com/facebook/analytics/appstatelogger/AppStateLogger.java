package com.facebook.analytics.appstatelogger;

import X.AnonymousClass0Dc;
import X.AnonymousClass1C5;
import X.AnonymousClass1GY;
import X.AnonymousClass1om;
import X.AnonymousClass1op;
import X.AnonymousClass1oq;
import X.AnonymousClass1or;
import X.AnonymousClass1ox;
import X.AnonymousClass1oy;
import X.AnonymousClass1p5;
import X.AnonymousClass1p9;
import X.AnonymousClass2Os;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Build.VERSION;
import java.io.File;
import java.util.HashSet;
import java.util.List;

public class AppStateLogger {
    /* renamed from: O */
    public static final String f23054O = "AppStateLogger";
    /* renamed from: P */
    public static AppStateLogger f23055P;
    /* renamed from: Q */
    public static final Object f23056Q = new Object();
    /* renamed from: B */
    public final AppState f23057B;
    /* renamed from: C */
    public final Context f23058C;
    /* renamed from: D */
    public final StringBuilder f23059D;
    /* renamed from: E */
    public final HashSet f23060E;
    /* renamed from: F */
    public final File f23061F;
    /* renamed from: G */
    public final AnonymousClass1p5 f23062G;
    /* renamed from: H */
    private final ActivityManager f23063H;
    /* renamed from: I */
    private final AnonymousClass1op f23064I = new AnonymousClass1op();
    /* renamed from: J */
    private final AnonymousClass1or f23065J;
    /* renamed from: K */
    private final Object f23066K = new Object();
    /* renamed from: L */
    private volatile boolean f23067L;
    /* renamed from: M */
    private final MemoryInfo f23068M = new MemoryInfo();
    /* renamed from: N */
    private boolean f23069N = true;

    static {
        AnonymousClass2Os anonymousClass2Os = new AnonymousClass2Os();
    }

    public AppStateLogger(AnonymousClass1C5 anonymousClass1C5, int i, String str, int i2, boolean z, long j, File file, ActivityManager activityManager, Context context, AnonymousClass1p9 anonymousClass1p9) {
        this.f23058C = context;
        File file2 = file;
        this.f23061F = file2;
        String str2 = anonymousClass1C5.f15488B;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        this.f23059D = new StringBuilder();
        this.f23060E = new HashSet();
        boolean z2 = z;
        this.f23057B = new AppState(str2, i, str, i2, z2, currentTimeMillis, j, null);
        this.f23063H = activityManager;
        if (VERSION.SDK_INT >= 16) {
            AnonymousClass1oy.m13342B(r4.f23063H, r4.f23068M, r4.f23057B);
        }
        r4.f23065J = new AnonymousClass1or(z2);
        AnonymousClass1or anonymousClass1or = r4.f23065J;
        AppState appState = r4.f23057B;
        AnonymousClass1op anonymousClass1op = r4.f23064I;
        AppState appState2 = appState;
        AnonymousClass1op anonymousClass1op2 = anonymousClass1op;
        AnonymousClass1or anonymousClass1or2 = anonymousClass1or;
        File file3 = file2;
        r4.f23062G = new AnonymousClass1p5(file3, anonymousClass1or2, appState2, anonymousClass1op2, r4.f23058C, anonymousClass1p9);
        r4.f23062G.start();
        Runtime.getRuntime().addShutdownHook(new Thread(new AnonymousClass1ox(r4)));
    }

    /* renamed from: B */
    public static AnonymousClass1oq m13343B() {
        synchronized (f23056Q) {
            if (f23055P == null) {
                AnonymousClass0Dc.P(f23054O, "AppStateLogger is not ready yet");
                return null;
            }
            return f23055P.f23062G.f23075C;
        }
    }

    /* renamed from: C */
    public static String m13344C(ActivityManager activityManager, int i) {
        List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == i) {
                    return runningAppProcessInfo.processName.replace(':', '_');
                }
            }
        }
        return "unknown";
    }

    /* renamed from: D */
    public static boolean m13345D() {
        return f23055P != null;
    }

    /* renamed from: E */
    public static void m13346E() {
        Throwable th;
        synchronized (f23056Q) {
            try {
                if (f23055P == null) {
                    AnonymousClass0Dc.P(f23054O, "No application has been registered with AppStateLogger");
                    return;
                }
                AnonymousClass1p5 anonymousClass1p5 = f23055P.f23062G;
                synchronized (anonymousClass1p5) {
                    try {
                        anonymousClass1p5.f23078F = true;
                        AnonymousClass1p5.m13354C(anonymousClass1p5);
                    } catch (Throwable th2) {
                        while (true) {
                            th = th2;
                            break;
                        }
                    }
                }
                AnonymousClass1p5.m13353B(anonymousClass1p5);
                return;
            } catch (Throwable th3) {
                while (true) {
                    th = th3;
                }
            }
        }
        throw th;
    }

    /* renamed from: F */
    public static void m13347F(Integer num, Throwable th) {
        Throwable th2;
        synchronized (f23056Q) {
            try {
                if (f23055P == null) {
                    AnonymousClass0Dc.P(f23054O, "No application has been registered with AppStateLogger");
                    return;
                }
                AnonymousClass1p5 anonymousClass1p5 = f23055P.f23062G;
                synchronized (anonymousClass1p5) {
                    try {
                        anonymousClass1p5.f23080H = num;
                        anonymousClass1p5.f23077E = th;
                        AnonymousClass1p5.m13354C(anonymousClass1p5);
                    } catch (Throwable th3) {
                        while (true) {
                            th2 = th3;
                            break;
                        }
                    }
                }
                AnonymousClass1p5.m13353B(anonymousClass1p5);
                f23055P.f23062G.join();
                return;
            } catch (Integer num2) {
                AnonymousClass0Dc.I(f23054O, num2, "Interrupted joining worker thread", new Object[0]);
                return;
            } catch (Throwable th4) {
                while (true) {
                    th2 = th4;
                }
            }
        }
        throw th2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: G */
    public static void m13348G(java.lang.String r3, boolean r4) {
        /*
        r2 = f23056Q;
        monitor-enter(r2);
        r0 = f23055P;	 Catch:{ all -> 0x0076 }
        if (r0 != 0) goto L_0x0010;
    L_0x0007:
        r1 = f23054O;	 Catch:{ all -> 0x0076 }
        r0 = "AppStateLogger is not ready yet";
        X.AnonymousClass0Dc.P(r1, r0);	 Catch:{ all -> 0x0076 }
        monitor-exit(r2);	 Catch:{ all -> 0x0076 }
        return;
    L_0x0010:
        monitor-exit(r2);	 Catch:{ all -> 0x0076 }
        if (r3 == 0) goto L_0x0062;
    L_0x0013:
        r0 = f23055P;
        r0 = r0.f23057B;
        r0.f23029T = r3;
        if (r4 == 0) goto L_0x006a;
    L_0x001b:
        r4 = f23055P;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = "@";
        r2.append(r0);
        r1 = 44;
        r0 = 95;
        r0 = r3.replace(r1, r0);
        r2.append(r0);
        r1 = r2.toString();
        r3 = r4.f23059D;
        monitor-enter(r3);
        r0 = r4.f23060E;	 Catch:{ all -> 0x0079 }
        r0 = r0.add(r1);	 Catch:{ all -> 0x0079 }
        if (r0 == 0) goto L_0x0060;
    L_0x0041:
        r0 = r4.f23059D;	 Catch:{ all -> 0x0079 }
        r0.append(r1);	 Catch:{ all -> 0x0079 }
        r1 = r4.f23059D;	 Catch:{ all -> 0x0079 }
        r0 = 44;
        r1.append(r0);	 Catch:{ all -> 0x0079 }
        r2 = r4.f23059D;	 Catch:{ all -> 0x0079 }
        r1 = 0;
        r0 = r4.f23059D;	 Catch:{ all -> 0x0079 }
        r0 = r0.length();	 Catch:{ all -> 0x0079 }
        r0 = r0 + -1;
        r1 = r2.substring(r1, r0);	 Catch:{ all -> 0x0079 }
        r0 = r4.f23057B;	 Catch:{ all -> 0x0079 }
        r0.f23022M = r1;	 Catch:{ all -> 0x0079 }
    L_0x0060:
        monitor-exit(r3);	 Catch:{ all -> 0x0079 }
        goto L_0x006a;
    L_0x0062:
        r0 = f23055P;
        r1 = r0.f23057B;
        r0 = "";
        r1.f23029T = r0;
    L_0x006a:
        r0 = f23055P;
        r1 = r0.f23062G;
        r0 = m13351J(r0);
        r1.m13360B(r0);
        return;
    L_0x0076:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0076 }
    L_0x0078:
        throw r0;
    L_0x0079:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0079 }
        goto L_0x0078;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.analytics.appstatelogger.AppStateLogger.G(java.lang.String, boolean):void");
    }

    /* renamed from: H */
    public static void m13349H(AppStateLogger appStateLogger, Activity activity, Integer num) {
        activity.getLocalClassName();
        AnonymousClass1om.m13323C(num);
        AnonymousClass1op anonymousClass1op = appStateLogger.f23064I;
        synchronized (anonymousClass1op) {
            int i = anonymousClass1op.f23010C;
        }
        AnonymousClass1op anonymousClass1op2 = appStateLogger.f23064I;
        synchronized (anonymousClass1op2) {
            if (AnonymousClass1GY.D(num.intValue(), 2)) {
                anonymousClass1op2.f23010C++;
            } else if (AnonymousClass1GY.D(num.intValue(), 3)) {
                anonymousClass1op2.f23010C--;
            }
            anonymousClass1op2.f23009B.put(activity, num);
            int i2 = anonymousClass1op2.f23010C;
        }
        synchronized (appStateLogger.f23066K) {
            boolean z = appStateLogger.f23069N;
        }
        boolean z2 = true;
        if (AnonymousClass1GY.D(num.intValue(), 2)) {
            appStateLogger.f23065J.m13330A(false);
        } else if (AnonymousClass1GY.D(num.intValue(), 3)) {
            appStateLogger.f23065J.m13330A(i2 == 0);
        }
        if (i2 != 0 && (i2 <= 0 || i != 0)) {
            if (!AnonymousClass1GY.D(num.intValue(), 5) || !m13351J(appStateLogger)) {
                z2 = false;
            }
        }
        appStateLogger.f23062G.m13360B(z2);
    }

    /* renamed from: I */
    public static boolean m13350I(Integer num) {
        synchronized (f23056Q) {
            if (f23055P == null) {
                AnonymousClass0Dc.P(f23054O, "AppStateLogger is not ready yet");
                return false;
            }
            f23055P.f23062G.m13359A(num);
            return f23055P.f23064I.m13327A();
        }
    }

    /* renamed from: J */
    private static boolean m13351J(AppStateLogger appStateLogger) {
        ActivityManager activityManager = appStateLogger.f23063H;
        if (activityManager == null) {
            return false;
        }
        activityManager.getMemoryInfo(appStateLogger.f23068M);
        if (appStateLogger.f23068M.lowMemory || appStateLogger.f23068M.availMem < 157286400) {
            return true;
        }
        return false;
    }
}
