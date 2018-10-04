package com.facebook.react.bridge;

import X.AnonymousClass09A;
import X.AnonymousClass0G4;
import X.AnonymousClass0LR;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.concurrent.atomic.AtomicInteger;

public class ModuleHolder {
    private static final AtomicInteger sInstanceKeyCounter = new AtomicInteger(1);
    private boolean mInitializable;
    private final int mInstanceKey = sInstanceKeyCounter.getAndIncrement();
    private boolean mIsCreating;
    private boolean mIsInitializing;
    private NativeModule mModule;
    private final String mName;
    private AnonymousClass0G4 mProvider;
    private final ReactModuleInfo mReactModuleInfo;

    public ModuleHolder(NativeModule nativeModule) {
        this.mName = nativeModule.getName();
        this.mReactModuleInfo = new ReactModuleInfo(nativeModule.getName(), nativeModule.getClass().getSimpleName(), nativeModule.canOverrideExistingModule(), true, true, CxxModuleWrapper.class.isAssignableFrom(nativeModule.getClass()));
        this.mModule = nativeModule;
        new Object[1][0] = this.mName;
    }

    public ModuleHolder(ReactModuleInfo reactModuleInfo, AnonymousClass0G4 anonymousClass0G4) {
        this.mName = reactModuleInfo.name();
        this.mProvider = anonymousClass0G4;
        this.mReactModuleInfo = reactModuleInfo;
        if (reactModuleInfo.needsEagerInit()) {
            this.mModule = create();
        }
    }

    private NativeModule create() {
        int i = 1;
        SoftAssertions.assertCondition(this.mModule == null, "Creating an already created module.");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, this.mName, this.mInstanceKey);
        AnonymousClass09A.B(8192, "ModuleHolder.createModule").B("name", this.mName).C();
        new Object[1][0] = this.mName;
        try {
            NativeModule nativeModule = (NativeModule) ((AnonymousClass0G4) AnonymousClass0LR.D(this.mProvider)).get();
            this.mProvider = null;
            synchronized (this) {
                this.mModule = nativeModule;
                if (!this.mInitializable || this.mIsInitializing) {
                    i = 0;
                }
            }
            if (i != 0) {
                doInitialize(nativeModule);
            }
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END, this.mInstanceKey);
            AnonymousClass09A.C(8192).C();
            return nativeModule;
        } catch (Throwable th) {
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END, this.mInstanceKey);
            AnonymousClass09A.C(8192).C();
        }
    }

    public final synchronized void destroy() {
        if (this.mModule != null) {
            this.mModule.onCatalystInstanceDestroy();
        }
    }

    private void doInitialize(NativeModule nativeModule) {
        Throwable th;
        AnonymousClass09A.B(8192, "ModuleHolder.initialize").B("name", this.mName).C();
        ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_START, this.mName, this.mInstanceKey);
        try {
            boolean z;
            synchronized (this) {
                try {
                    z = true;
                    if (!this.mInitializable || this.mIsInitializing) {
                        z = false;
                    } else {
                        this.mIsInitializing = true;
                    }
                } catch (Throwable th2) {
                    while (true) {
                        th = th2;
                        break;
                    }
                }
            }
            if (z) {
                nativeModule.initialize();
                synchronized (this) {
                    try {
                        this.mIsInitializing = false;
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
            }
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.mInstanceKey);
            AnonymousClass09A.C(8192).C();
        } catch (Throwable th4) {
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.mInstanceKey);
            AnonymousClass09A.C(8192).C();
        }
    }

    public final boolean getCanOverrideExistingModule() {
        return this.mReactModuleInfo.canOverrideExistingModule();
    }

    public final String getClassName() {
        return this.mReactModuleInfo.className();
    }

    public final boolean getHasConstants() {
        return this.mReactModuleInfo.hasConstants();
    }

    public com.facebook.react.bridge.NativeModule getModule() {
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
        r3 = this;
        monitor-enter(r3);
        r0 = r3.mModule;	 Catch:{ all -> 0x003f }
        if (r0 == 0) goto L_0x0009;	 Catch:{ all -> 0x003f }
    L_0x0005:
        r0 = r3.mModule;	 Catch:{ all -> 0x003f }
        monitor-exit(r3);	 Catch:{ all -> 0x003f }
    L_0x0008:
        return r0;	 Catch:{ all -> 0x003f }
    L_0x0009:
        r2 = r3.mIsCreating;	 Catch:{ all -> 0x003f }
        r0 = 1;	 Catch:{ all -> 0x003f }
        r1 = 0;	 Catch:{ all -> 0x003f }
        if (r2 != 0) goto L_0x0012;	 Catch:{ all -> 0x003f }
    L_0x000f:
        r3.mIsCreating = r0;	 Catch:{ all -> 0x003f }
        goto L_0x0013;	 Catch:{ all -> 0x003f }
    L_0x0012:
        r0 = 0;	 Catch:{ all -> 0x003f }
    L_0x0013:
        monitor-exit(r3);	 Catch:{ all -> 0x003f }
        if (r0 == 0) goto L_0x0025;	 Catch:{ all -> 0x003f }
    L_0x0016:
        r0 = r3.create();
        monitor-enter(r3);
        r3.mIsCreating = r1;	 Catch:{ all -> 0x0022 }
        r3.notifyAll();	 Catch:{ all -> 0x0022 }
        monitor-exit(r3);	 Catch:{ all -> 0x0022 }
        goto L_0x0008;	 Catch:{ all -> 0x0022 }
    L_0x0022:
        r0 = move-exception;	 Catch:{ all -> 0x0022 }
        monitor-exit(r3);	 Catch:{ all -> 0x0022 }
    L_0x0024:
        throw r0;
    L_0x0025:
        monitor-enter(r3);
    L_0x0026:
        r0 = r3.mModule;	 Catch:{ all -> 0x003c }
        if (r0 != 0) goto L_0x0032;	 Catch:{ all -> 0x003c }
    L_0x002a:
        r0 = r3.mIsCreating;	 Catch:{ all -> 0x003c }
        if (r0 == 0) goto L_0x0032;	 Catch:{ all -> 0x003c }
    L_0x002e:
        r3.wait();	 Catch:{ InterruptedException -> 0x0026 }
        goto L_0x0026;	 Catch:{ InterruptedException -> 0x0026 }
    L_0x0032:
        r0 = r3.mModule;	 Catch:{ all -> 0x003c }
        r0 = X.AnonymousClass0LR.D(r0);	 Catch:{ all -> 0x003c }
        r0 = (com.facebook.react.bridge.NativeModule) r0;	 Catch:{ all -> 0x003c }
        monitor-exit(r3);	 Catch:{ all -> 0x003c }
        goto L_0x0008;	 Catch:{ all -> 0x003c }
    L_0x003c:
        r0 = move-exception;	 Catch:{ all -> 0x003c }
        monitor-exit(r3);	 Catch:{ all -> 0x003c }
        goto L_0x0024;	 Catch:{ all -> 0x003c }
    L_0x003f:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x003f }
        goto L_0x0024;	 Catch:{ all -> 0x003f }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.ModuleHolder.getModule():com.facebook.react.bridge.NativeModule");
    }

    public String getName() {
        return this.mName;
    }

    public final synchronized boolean hasInstance() {
        return this.mModule != null;
    }

    public final boolean isCxxModule() {
        return this.mReactModuleInfo.isCxxModule();
    }

    public final void markInitializable() {
        NativeModule nativeModule;
        synchronized (this) {
            boolean z = true;
            this.mInitializable = true;
            boolean z2 = false;
            if (this.mModule != null) {
                if (!this.mIsInitializing) {
                    z2 = true;
                }
                AnonymousClass0LR.B(z2);
                nativeModule = this.mModule;
            } else {
                nativeModule = null;
                z = false;
            }
        }
        if (z) {
            doInitialize(nativeModule);
        }
    }
}
