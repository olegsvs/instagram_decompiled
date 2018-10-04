package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.1C1 */
public final class AnonymousClass1C1 implements ServiceConnection {
    /* renamed from: B */
    public final LinkedBlockingQueue f15479B = new LinkedBlockingQueue(1);
    /* renamed from: C */
    public boolean f15480C = false;

    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public final void onServiceConnected(android.content.ComponentName r1, android.os.IBinder r2) {
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
        r0 = this;
        r0 = r0.f15479B;	 Catch:{ InterruptedException -> 0x0005 }
        r0.put(r2);	 Catch:{ InterruptedException -> 0x0005 }
    L_0x0005:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1C1.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }
}
