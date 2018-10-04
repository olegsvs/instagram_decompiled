package com.facebook.react;

import X.AnonymousClass0G4;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public abstract class TurboReactPackage implements ReactPackage {

    public final class ModuleHolderProvider implements AnonymousClass0G4 {
        private final String mName;
        private final ReactApplicationContext mReactContext;

        public ModuleHolderProvider(String str, ReactApplicationContext reactApplicationContext) {
            this.mName = str;
            this.mReactContext = reactApplicationContext;
        }

        public final NativeModule get() {
            return TurboReactPackage.this.getModule(this.mName, this.mReactContext);
        }
    }

    public abstract NativeModule getModule(String str, ReactApplicationContext reactApplicationContext);

    public abstract ReactModuleInfoProvider getReactModuleInfoProvider();

    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        throw new UnsupportedOperationException("In case of TurboModules, createNativeModules is not supported. NativeModuleRegistry should instead use getModuleList or getModule method");
    }

    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
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

    public final Iterable getNativeModuleIterator(final ReactApplicationContext reactApplicationContext) {
        final Iterator it = getReactModuleInfoProvider().getReactModuleInfos().entrySet().iterator();
        return new Iterable() {

            /* renamed from: com.facebook.react.TurboReactPackage$1$1 */
            public final class C00811 implements Iterator {
                public final boolean hasNext() {
                    return it.hasNext();
                }

                public final ModuleHolder next() {
                    Entry entry = (Entry) it.next();
                    return new ModuleHolder((ReactModuleInfo) entry.getValue(), new ModuleHolderProvider((String) entry.getKey(), reactApplicationContext));
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Cannot remove native modules from the list");
                }
            }

            public final Iterator iterator() {
                return new C00811();
            }
        };
    }

    public static final List getViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
