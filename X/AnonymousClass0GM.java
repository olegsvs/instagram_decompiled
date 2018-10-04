package X;

import android.app.Activity;
import android.app.Application;
import android.support.v4.app.FragmentActivity;

/* renamed from: X.0GM */
public abstract class AnonymousClass0GM {
    /* renamed from: B */
    private static AnonymousClass0GM f2354B;
    /* renamed from: C */
    private static AnonymousClass3Tf f2355C;

    public abstract boolean getShouldShowSmartLockForLogin();

    public abstract void getSmartLockBroker(FragmentActivity fragmentActivity, AnonymousClass3Td anonymousClass3Td);

    public abstract AnonymousClass1Tl listenForSmsResponse(Activity activity, boolean z);

    public abstract void setShouldShowSmartLockForLogin(boolean z);

    public static synchronized X.AnonymousClass0GM getInstance() {
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
        r3 = X.AnonymousClass0GM.class;
        monitor-enter(r3);
        r0 = f2354B;	 Catch:{ all -> 0x0031 }
        if (r0 != 0) goto L_0x002d;	 Catch:{ all -> 0x0031 }
    L_0x0007:
        r0 = "com.instagram.login.smartlock.impl.SmartLockPluginImpl";	 Catch:{ Throwable -> 0x002a }
        r1 = java.lang.Class.forName(r0);	 Catch:{ Throwable -> 0x002a }
        r2 = 0;	 Catch:{ Throwable -> 0x002a }
        r0 = new java.lang.Class[r2];	 Catch:{ Throwable -> 0x002a }
        r1 = r1.getConstructor(r0);	 Catch:{ Throwable -> 0x002a }
        r0 = new java.lang.Object[r2];	 Catch:{ Throwable -> 0x002a }
        r0 = r1.newInstance(r0);	 Catch:{ Throwable -> 0x002a }
        r0 = (X.AnonymousClass0GM) r0;	 Catch:{ Throwable -> 0x002a }
        f2354B = r0;	 Catch:{ Throwable -> 0x002a }
        r0 = f2355C;	 Catch:{ Throwable -> 0x002a }
        if (r0 == 0) goto L_0x002d;	 Catch:{ Throwable -> 0x002a }
    L_0x0022:
        r1 = f2355C;	 Catch:{ Throwable -> 0x002a }
        r0 = f2354B;	 Catch:{ Throwable -> 0x002a }
        r1.onInstanceCreated(r0);	 Catch:{ Throwable -> 0x002a }
        goto L_0x002d;	 Catch:{ Throwable -> 0x002a }
    L_0x002a:
        r0 = 0;
        monitor-exit(r3);
        return r0;
    L_0x002d:
        r0 = f2354B;	 Catch:{ all -> 0x0031 }
        monitor-exit(r3);
        return r0;
    L_0x0031:
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0GM.getInstance():X.0GM");
    }

    public static AnonymousClass0n3 getInstanceAsync() {
        return new AnonymousClass0n3(new AnonymousClass1PI());
    }

    public static void setApplication(Application application) {
    }
}
