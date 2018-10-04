package com.facebook.react;

public final class ReactInstanceManager$5 implements Runnable {
    public final /* synthetic */ ReactInstanceManager this$0;
    public final /* synthetic */ ReactInstanceManager$ReactContextInitParams val$initParams;

    /* renamed from: com.facebook.react.ReactInstanceManager$5$1 */
    public final class C00771 implements Runnable {
        public final void run() {
            if (ReactInstanceManager$5.this.this$0.mPendingReactContextInitParams != null) {
                ReactInstanceManager.runCreateReactContextOnNewThread(ReactInstanceManager$5.this.this$0, ReactInstanceManager$5.this.this$0.mPendingReactContextInitParams);
                ReactInstanceManager.access$1102(ReactInstanceManager$5.this.this$0, null);
            }
        }
    }

    public ReactInstanceManager$5(ReactInstanceManager reactInstanceManager, ReactInstanceManager$ReactContextInitParams reactInstanceManager$ReactContextInitParams) {
        this.this$0 = reactInstanceManager;
        this.val$initParams = reactInstanceManager$ReactContextInitParams;
    }

    public final void run() {
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
        r3 = this;
        r0 = com.facebook.react.bridge.ReactMarkerConstants.REACT_CONTEXT_THREAD_END;
        com.facebook.react.bridge.ReactMarker.logMarker(r0);
        r0 = r3.this$0;
        r1 = r0.mHasStartedDestroying;
        monitor-enter(r1);
    L_0x000a:
        r0 = r3.this$0;	 Catch:{ all -> 0x0067 }
        r0 = r0.mHasStartedDestroying;	 Catch:{ all -> 0x0067 }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x0067 }
        if (r0 == 0) goto L_0x001c;	 Catch:{ all -> 0x0067 }
    L_0x0014:
        r0 = r3.this$0;	 Catch:{ InterruptedException -> 0x000a }
        r0 = r0.mHasStartedDestroying;	 Catch:{ InterruptedException -> 0x000a }
        r0.wait();	 Catch:{ InterruptedException -> 0x000a }
        goto L_0x000a;	 Catch:{ InterruptedException -> 0x000a }
    L_0x001c:
        monitor-exit(r1);	 Catch:{ all -> 0x0067 }
        r1 = r3.this$0;
        r0 = 1;
        com.facebook.react.ReactInstanceManager.access$802(r1, r0);
        r0 = -4;
        android.os.Process.setThreadPriority(r0);	 Catch:{ Exception -> 0x005e }
        r0 = com.facebook.react.bridge.ReactMarkerConstants.VM_INIT;	 Catch:{ Exception -> 0x005e }
        com.facebook.react.bridge.ReactMarker.logMarker(r0);	 Catch:{ Exception -> 0x005e }
        r2 = r3.this$0;	 Catch:{ Exception -> 0x005e }
        r0 = r3.val$initParams;	 Catch:{ Exception -> 0x005e }
        r0 = r0.getJsExecutorFactory();	 Catch:{ Exception -> 0x005e }
        r1 = r0.create();	 Catch:{ Exception -> 0x005e }
        r0 = r3.val$initParams;	 Catch:{ Exception -> 0x005e }
        r0 = r0.getJsBundleLoader();	 Catch:{ Exception -> 0x005e }
        r2 = com.facebook.react.ReactInstanceManager.createReactContext(r2, r1, r0);	 Catch:{ Exception -> 0x005e }
        r1 = r3.this$0;	 Catch:{ Exception -> 0x005e }
        r0 = 0;	 Catch:{ Exception -> 0x005e }
        com.facebook.react.ReactInstanceManager.access$1002(r1, r0);	 Catch:{ Exception -> 0x005e }
        r0 = com.facebook.react.bridge.ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START;	 Catch:{ Exception -> 0x005e }
        com.facebook.react.bridge.ReactMarker.logMarker(r0);	 Catch:{ Exception -> 0x005e }
        r1 = new com.facebook.react.ReactInstanceManager$5$1;	 Catch:{ Exception -> 0x005e }
        r1.<init>();	 Catch:{ Exception -> 0x005e }
        r0 = new com.facebook.react.ReactInstanceManager$5$2;	 Catch:{ Exception -> 0x005e }
        r0.<init>(r2);	 Catch:{ Exception -> 0x005e }
        r2.runOnNativeModulesQueueThread(r0);	 Catch:{ Exception -> 0x005e }
        com.facebook.react.bridge.UiThreadUtil.runOnUiThread(r1);	 Catch:{ Exception -> 0x005e }
        goto L_0x0066;	 Catch:{ Exception -> 0x005e }
    L_0x005e:
        r1 = move-exception;
        r0 = r3.this$0;
        r0 = r0.mDevSupportManager;
        r0.handleException(r1);
    L_0x0066:
        return;
    L_0x0067:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0067 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.ReactInstanceManager$5.run():void");
    }
}
