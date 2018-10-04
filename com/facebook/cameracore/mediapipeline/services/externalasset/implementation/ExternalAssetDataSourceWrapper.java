package com.facebook.cameracore.mediapipeline.services.externalasset.implementation;

import X.AnonymousClass2jZ;
import X.AnonymousClass3s1;
import X.AnonymousClass3s3;
import com.facebook.jni.HybridData;
import com.facebook.native_bridge.NativeDataPromise;

public class ExternalAssetDataSourceWrapper {
    private final HybridData mHybridData = initHybrid();
    private AnonymousClass3s1 mLocalDataSource;
    private AnonymousClass3s3 mWorker;

    private native HybridData initHybrid();

    private native boolean isDomainWhitelisted(String str);

    public ExternalAssetDataSourceWrapper(AnonymousClass3s1 anonymousClass3s1, AnonymousClass3s3 anonymousClass3s3) {
        this.mLocalDataSource = anonymousClass3s1;
        this.mWorker = anonymousClass3s3;
    }

    public void destroy() {
        this.mHybridData.resetNative();
        this.mLocalDataSource = null;
        this.mWorker = null;
    }

    public void getAsset(NativeDataPromise nativeDataPromise, String str, String str2) {
        AnonymousClass3s1 anonymousClass3s1 = this.mLocalDataSource;
        String str3 = str;
        if (anonymousClass3s1 == null || !anonymousClass3s1.m21010A(nativeDataPromise, str, str2)) {
            if (this.mWorker == null) {
                nativeDataPromise.setException("The java NetworkClient is null");
                return;
            }
            try {
                if (isDomainWhitelisted(str)) {
                    this.mWorker.m21012A(str3, "GET", null, new String[0], new String[0], new ExternalAssetHTTPResponseHandler(nativeDataPromise), new AnonymousClass2jZ(this, nativeDataPromise));
                } else {
                    throw new IllegalArgumentException("The domain is not whitelisted");
                }
            } catch (Exception e) {
                nativeDataPromise.setException(e.toString());
            }
        }
    }

    public String getStreamingURI(String str, String str2) {
        AnonymousClass3s1 anonymousClass3s1 = this.mLocalDataSource;
        if (anonymousClass3s1 == null) {
            return null;
        }
        return anonymousClass3s1.m21011B(str, str2);
    }
}
