package com.facebook.proxygen;

import com.facebook.proxygen.utils.Preconditions;

public class HTTPThread implements Runnable {
    private EventBase mEventBase;
    private boolean mEventBaseInitError = false;
    private EvbExceptionHandler mExHandler;

    public synchronized boolean eventBaseInitErrored() {
        return this.mEventBaseInitError;
    }

    public EventBase getEventBase() {
        Preconditions.checkNotNull(this.mEventBase, "EventBase has not been created yet");
        return this.mEventBase;
    }

    public void run() {
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
        r2 = this;
        monitor-enter(r2);
        r0 = new com.facebook.proxygen.EventBase;	 Catch:{ UnsatisfiedLinkError -> 0x000e }
        r0.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x000e }
        r2.mEventBase = r0;	 Catch:{ UnsatisfiedLinkError -> 0x000e }
    L_0x0008:
        r2.notifyAll();	 Catch:{ all -> 0x002b }
        goto L_0x0012;	 Catch:{ all -> 0x002b }
    L_0x000c:
        r0 = move-exception;
        goto L_0x0027;
    L_0x000e:
        r0 = 1;
        r2.mEventBaseInitError = r0;	 Catch:{ all -> 0x000c }
        goto L_0x0008;	 Catch:{ all -> 0x000c }
    L_0x0012:
        monitor-exit(r2);	 Catch:{ all -> 0x002b }
        r0 = r2.mEventBase;	 Catch:{ Throwable -> 0x001d }
        if (r0 == 0) goto L_0x001c;	 Catch:{ Throwable -> 0x001d }
    L_0x0017:
        r0 = r2.mEventBase;	 Catch:{ Throwable -> 0x001d }
        r0.loopForever();	 Catch:{ Throwable -> 0x001d }
    L_0x001c:
        return;	 Catch:{ Throwable -> 0x001d }
    L_0x001d:
        r1 = move-exception;
        r0 = r2.mExHandler;
        if (r0 == 0) goto L_0x0026;
    L_0x0022:
        r0.handle(r1);
        return;
    L_0x0026:
        throw r1;
    L_0x0027:
        r2.notifyAll();	 Catch:{ all -> 0x002b }
        throw r0;	 Catch:{ all -> 0x002b }
    L_0x002b:
        r1 = move-exception;	 Catch:{ all -> 0x002b }
        monitor-exit(r2);	 Catch:{ all -> 0x002b }
        goto L_0x0026;	 Catch:{ all -> 0x002b }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.proxygen.HTTPThread.run():void");
    }

    public HTTPThread setExceptionHandler(EvbExceptionHandler evbExceptionHandler) {
        this.mExHandler = evbExceptionHandler;
        return this;
    }

    public synchronized void waitForInitialization() {
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
        monitor-enter(r1);
    L_0x0001:
        r0 = r1.mEventBase;	 Catch:{ all -> 0x000f }
        if (r0 != 0) goto L_0x000d;	 Catch:{ all -> 0x000f }
    L_0x0005:
        r0 = r1.mEventBaseInitError;	 Catch:{ all -> 0x000f }
        if (r0 != 0) goto L_0x000d;	 Catch:{ all -> 0x000f }
    L_0x0009:
        r1.wait();	 Catch:{ InterruptedException -> 0x0001 }
        goto L_0x0001;	 Catch:{ InterruptedException -> 0x0001 }
    L_0x000d:
        monitor-exit(r1);
        return;
    L_0x000f:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.proxygen.HTTPThread.waitForInitialization():void");
    }
}
