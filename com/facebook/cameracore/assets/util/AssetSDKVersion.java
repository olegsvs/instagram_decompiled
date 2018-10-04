package com.facebook.cameracore.assets.util;

import X.AnonymousClass0CF;

public class AssetSDKVersion {
    public static native String getAssetRequiredSDKVersion(String str);

    static {
        AnonymousClass0CF.E("asset-sdk-version-native-android");
    }

    private AssetSDKVersion() {
    }
}
