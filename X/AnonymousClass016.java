package X;

import java.util.List;

/* renamed from: X.016 */
public final class AnonymousClass016 {
    /* renamed from: E */
    private static final String f137E = "LogcatProcess";
    /* renamed from: B */
    public List f138B;
    /* renamed from: C */
    public Process f139C;
    /* renamed from: D */
    public volatile AnonymousClass015 f140D = AnonymousClass015.BORN;

    public AnonymousClass016(List list) {
        this.f138B = list;
    }

    /* renamed from: A */
    public final void m68A() {
        synchronized (this) {
            if (this.f140D == AnonymousClass015.RUNNING) {
                this.f140D = AnonymousClass015.KILLED;
            } else {
                throw new IllegalStateException("Cannot stop non-running logcat process");
            }
        }
        this.f139C.destroy();
    }

    public final void finalize() {
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
        r2 = this;
        super.finalize();
        r1 = r2.f140D;	 Catch:{ RuntimeException -> 0x0013 }
        r0 = X.AnonymousClass015.RUNNING;	 Catch:{ RuntimeException -> 0x0013 }
        if (r1 != r0) goto L_0x0013;	 Catch:{ RuntimeException -> 0x0013 }
    L_0x0009:
        r2.m68A();	 Catch:{ RuntimeException -> 0x0013 }
        r1 = f137E;	 Catch:{ RuntimeException -> 0x0013 }
        r0 = "child process still alive when finalize() called";	 Catch:{ RuntimeException -> 0x0013 }
        android.util.Log.e(r1, r0);	 Catch:{ RuntimeException -> 0x0013 }
    L_0x0013:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.016.finalize():void");
    }
}
