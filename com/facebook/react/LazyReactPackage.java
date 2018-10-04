package com.facebook.react;

import X.AnonymousClass09A;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class LazyReactPackage implements ReactPackage {

    /* renamed from: com.facebook.react.LazyReactPackage$1 */
    public final class C01251 implements ReactModuleInfoProvider {
        public final Map getReactModuleInfos() {
            return Collections.emptyMap();
        }
    }

    public abstract List getNativeModules(ReactApplicationContext reactApplicationContext);

    public abstract ReactModuleInfoProvider getReactModuleInfoProvider();

    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        List arrayList = new ArrayList();
        for (ModuleSpec moduleSpec : getNativeModules(reactApplicationContext)) {
            AnonymousClass09A.B(8192, "createNativeModule").B("module", moduleSpec.getType()).C();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, moduleSpec.getName());
            try {
                NativeModule nativeModule = (NativeModule) moduleSpec.getProvider().get();
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                AnonymousClass09A.C(8192).C();
                arrayList.add(nativeModule);
            } catch (Throwable th) {
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                AnonymousClass09A.C(8192).C();
                throw th;
            }
        }
        return arrayList;
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> viewManagers = getViewManagers(reactApplicationContext);
        if (viewManagers != null) {
            if (!viewManagers.isEmpty()) {
                reactApplicationContext = new ArrayList();
                for (ModuleSpec provider : viewManagers) {
                    reactApplicationContext.add((ViewManager) provider.getProvider().get());
                }
                return reactApplicationContext;
            }
        }
        return Collections.emptyList();
    }

    public final Iterable getNativeModuleIterator(ReactApplicationContext reactApplicationContext) {
        final Map reactModuleInfos = getReactModuleInfoProvider().getReactModuleInfos();
        final List nativeModules = getNativeModules(reactApplicationContext);
        return new Iterable() {

            /* renamed from: com.facebook.react.LazyReactPackage$2$1 */
            public final class C00751 implements Iterator {
                public int position = 0;

                public final boolean hasNext() {
                    return this.position < nativeModules.size();
                }

                public final ModuleHolder next() {
                    List list = nativeModules;
                    int i = this.position;
                    this.position = i + 1;
                    ModuleSpec moduleSpec = (ModuleSpec) list.get(i);
                    String name = moduleSpec.getName();
                    NativeModule nativeModule = (ReactModuleInfo) reactModuleInfos.get(name);
                    if (nativeModule != null) {
                        return new ModuleHolder(nativeModule, moduleSpec.getProvider());
                    }
                    ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, name);
                    try {
                        nativeModule = (NativeModule) moduleSpec.getProvider().get();
                        return new ModuleHolder(nativeModule);
                    } finally {
                        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                    }
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Cannot remove native modules from the list");
                }
            }

            public final Iterator iterator() {
                return new C00751();
            }
        };
    }

    public static com.facebook.react.module.model.ReactModuleInfoProvider getReactModuleInfoProviderViaReflection(com.facebook.react.LazyReactPackage r4) {
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
        r1 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0082 }
        r1.<init>();	 Catch:{ ClassNotFoundException -> 0x0082 }
        r0 = r4.getClass();	 Catch:{ ClassNotFoundException -> 0x0082 }
        r0 = r0.getCanonicalName();	 Catch:{ ClassNotFoundException -> 0x0082 }
        r1.append(r0);	 Catch:{ ClassNotFoundException -> 0x0082 }
        r0 = "$$ReactModuleInfoProvider";	 Catch:{ ClassNotFoundException -> 0x0082 }
        r1.append(r0);	 Catch:{ ClassNotFoundException -> 0x0082 }
        r0 = r1.toString();	 Catch:{ ClassNotFoundException -> 0x0082 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0082 }
        if (r0 == 0) goto L_0x005e;	 Catch:{ ClassNotFoundException -> 0x0082 }
    L_0x001f:
        r0 = r0.newInstance();	 Catch:{ InstantiationException -> 0x0042, IllegalAccessException -> 0x0026 }
        r0 = (com.facebook.react.module.model.ReactModuleInfoProvider) r0;	 Catch:{ InstantiationException -> 0x0042, IllegalAccessException -> 0x0026 }
        return r0;	 Catch:{ InstantiationException -> 0x0042, IllegalAccessException -> 0x0026 }
    L_0x0026:
        r3 = move-exception;
        r2 = new java.lang.RuntimeException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Unable to instantiate ReactModuleInfoProvider for ";
        r1.append(r0);
        r0 = r4.getClass();
        r1.append(r0);
        r0 = r1.toString();
        r2.<init>(r0, r3);
        throw r2;
    L_0x0042:
        r3 = move-exception;
        r2 = new java.lang.RuntimeException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Unable to instantiate ReactModuleInfoProvider for ";
        r1.append(r0);
        r0 = r4.getClass();
        r1.append(r0);
        r0 = r1.toString();
        r2.<init>(r0, r3);
        throw r2;
    L_0x005e:
        r2 = new java.lang.RuntimeException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "ReactModuleInfoProvider class for ";
        r1.append(r0);
        r0 = r4.getClass();
        r0 = r0.getCanonicalName();
        r1.append(r0);
        r0 = " not found.";
        r1.append(r0);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
    L_0x0082:
        r0 = new com.facebook.react.LazyReactPackage$1;
        r0.<init>();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.LazyReactPackage.getReactModuleInfoProviderViaReflection(com.facebook.react.LazyReactPackage):com.facebook.react.module.model.ReactModuleInfoProvider");
    }

    public static final List getViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
