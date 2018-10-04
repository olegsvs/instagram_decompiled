package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Iterator;
import java.util.List;

public final class ReactPackageHelper {

    /* renamed from: com.facebook.react.ReactPackageHelper$1 */
    public final class C00801 implements Iterable {
        public final /* synthetic */ List val$nativeModules;

        /* renamed from: com.facebook.react.ReactPackageHelper$1$1 */
        public final class C00791 implements Iterator {
            public int position = 0;

            public final boolean hasNext() {
                return this.position < C00801.this.val$nativeModules.size();
            }

            public final ModuleHolder next() {
                List list = C00801.this.val$nativeModules;
                int i = this.position;
                this.position = i + 1;
                return new ModuleHolder((NativeModule) list.get(i));
            }

            public final void remove() {
                throw new UnsupportedOperationException("Cannot remove methods ");
            }
        }

        public C00801(List list) {
            this.val$nativeModules = list;
        }

        public final Iterator iterator() {
            return new C00791();
        }
    }

    public static Iterable getNativeModuleIterator(ReactPackage reactPackage, ReactApplicationContext reactApplicationContext, ReactInstanceManager reactInstanceManager) {
        List createNativeModules;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(reactPackage.getClass().getSimpleName());
        stringBuilder.append(" is not a LazyReactPackage, falling back to old version.");
        stringBuilder.toString();
        if (reactPackage instanceof ReactInstancePackage) {
            createNativeModules = ((ReactInstancePackage) reactPackage).createNativeModules(reactApplicationContext, reactInstanceManager);
        } else {
            createNativeModules = reactPackage.createNativeModules(reactApplicationContext);
        }
        return new C00801(createNativeModules);
    }
}
