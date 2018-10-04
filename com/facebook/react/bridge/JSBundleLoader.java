package com.facebook.react.bridge;

import android.content.Context;
import com.facebook.react.common.DebugServerException;

public abstract class JSBundleLoader {

    /* renamed from: com.facebook.react.bridge.JSBundleLoader$1 */
    public final class C01261 extends JSBundleLoader {
        public final /* synthetic */ String val$assetUrl;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ boolean val$loadSynchronously;

        public C01261(Context context, String str, boolean z) {
            this.val$context = context;
            this.val$assetUrl = str;
            this.val$loadSynchronously = z;
        }

        public final String loadScript(CatalystInstanceImpl catalystInstanceImpl) {
            catalystInstanceImpl.loadScriptFromAssets(this.val$context.getAssets(), this.val$assetUrl, this.val$loadSynchronously);
            return this.val$assetUrl;
        }
    }

    /* renamed from: com.facebook.react.bridge.JSBundleLoader$2 */
    public final class C01272 extends JSBundleLoader {
        public final /* synthetic */ String val$assetUrl;
        public final /* synthetic */ String val$fileName;
        public final /* synthetic */ boolean val$loadSynchronously;

        public C01272(String str, String str2, boolean z) {
            this.val$fileName = str;
            this.val$assetUrl = str2;
            this.val$loadSynchronously = z;
        }

        public final String loadScript(CatalystInstanceImpl catalystInstanceImpl) {
            catalystInstanceImpl.loadScriptFromFile(this.val$fileName, this.val$assetUrl, this.val$loadSynchronously);
            return this.val$fileName;
        }
    }

    /* renamed from: com.facebook.react.bridge.JSBundleLoader$3 */
    public final class C01283 extends JSBundleLoader {
        public final /* synthetic */ String val$cachedFileLocation;
        public final /* synthetic */ String val$sourceURL;

        public C01283(String str, String str2) {
            this.val$cachedFileLocation = str;
            this.val$sourceURL = str2;
        }

        public final String loadScript(CatalystInstanceImpl catalystInstanceImpl) {
            try {
                catalystInstanceImpl.loadScriptFromFile(this.val$cachedFileLocation, this.val$sourceURL, false);
                return this.val$sourceURL;
            } catch (Throwable e) {
                throw DebugServerException.makeGeneric(e.getMessage(), e);
            }
        }
    }

    /* renamed from: com.facebook.react.bridge.JSBundleLoader$4 */
    public final class C01294 extends JSBundleLoader {
        public final /* synthetic */ NativeDeltaClient val$nativeDeltaClient;
        public final /* synthetic */ String val$sourceURL;

        public C01294(String str, NativeDeltaClient nativeDeltaClient) {
            this.val$sourceURL = str;
            this.val$nativeDeltaClient = nativeDeltaClient;
        }

        public final String loadScript(CatalystInstanceImpl catalystInstanceImpl) {
            try {
                catalystInstanceImpl.loadScriptFromDeltaBundle(this.val$sourceURL, this.val$nativeDeltaClient, false);
                return this.val$sourceURL;
            } catch (Throwable e) {
                throw DebugServerException.makeGeneric(e.getMessage(), e);
            }
        }
    }

    public abstract String loadScript(CatalystInstanceImpl catalystInstanceImpl);

    public static JSBundleLoader createAssetLoader(Context context, String str, boolean z) {
        return new C01261(context, str, z);
    }

    public static JSBundleLoader createCachedBundleFromNetworkLoader(String str, String str2) {
        return new C01283(str2, str);
    }

    public static JSBundleLoader createDeltaFromNetworkLoader(String str, NativeDeltaClient nativeDeltaClient) {
        return new C01294(str, nativeDeltaClient);
    }

    public static JSBundleLoader createFileLoader(String str) {
        return createFileLoader(str, str, false);
    }

    public static JSBundleLoader createFileLoader(String str, String str2, boolean z) {
        return new C01272(str, str2, z);
    }
}
