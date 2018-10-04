package X;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.07L */
public class AnonymousClass07L extends Handler {
    /* renamed from: B */
    public volatile boolean f523B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass1DE f524C;

    public AnonymousClass07L(AnonymousClass1DE anonymousClass1DE, Looper looper) {
        this.f524C = anonymousClass1DE;
        super(looper);
    }

    /* renamed from: A */
    public void mo103A() {
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
        r1 = this;
        r0 = 3;
        r0 = r1.obtainMessage(r0);
        r0 = r1.sendMessage(r0);
        if (r0 != 0) goto L_0x000c;
    L_0x000b:
        return;
    L_0x000c:
        monitor-enter(r1);
    L_0x000d:
        r0 = r1.f523B;	 Catch:{ all -> 0x0017 }
        if (r0 != 0) goto L_0x0015;	 Catch:{ all -> 0x0017 }
    L_0x0011:
        r1.wait();	 Catch:{ InterruptedException -> 0x000d }
        goto L_0x000d;	 Catch:{ InterruptedException -> 0x000d }
    L_0x0015:
        monitor-exit(r1);
        return;
    L_0x0017:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.07L.A():void");
    }

    /* renamed from: B */
    public void mo104B() {
        sendMessage(obtainMessage(1));
    }

    /* renamed from: C */
    public void mo105C(Intent intent, int i, int i2) {
        sendMessage(obtainMessage(2, i, i2, intent));
    }

    public final void handleMessage(Message message) {
        if (message != null) {
            switch (message.what) {
                case 1:
                    this.f524C.m10044E();
                    return;
                case 2:
                    this.f524C.mo2236D((Intent) message.obj, message.arg1, message.arg2);
                    return;
                case 3:
                    this.f524C.mo2217B();
                    synchronized (this) {
                        this.f523B = true;
                        notifyAll();
                    }
                    return;
                default:
                    throw new IllegalStateException("Unsupported message");
            }
        }
        throw new IllegalStateException("Message is null");
    }
}
