package com.facebook.cameracore.mediapipeline.services.networking.implementation;

import X.AnonymousClass2jx;
import X.AnonymousClass3s3;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkClient;
import com.facebook.jni.HybridData;
import com.facebook.native_bridge.NativeDataPromise;

public class NetworkClientImpl extends NetworkClient {
    private final AnonymousClass3s3 mWorker;

    private native HybridData initHybrid();

    public NetworkClientImpl(AnonymousClass3s3 anonymousClass3s3) {
        this.mWorker = anonymousClass3s3;
        this.mHybridData = initHybrid();
    }

    public final void release() {
        this.mHybridData.resetNative();
    }

    public void sendRequest(NativeDataPromise nativeDataPromise, String str, String str2, String str3, String[] strArr, String[] strArr2) {
        try {
            this.mWorker.m21012A(str, str2, str3, strArr, strArr2, new HTTPClientResponseHandler(), new AnonymousClass2jx(this, nativeDataPromise));
        } catch (Exception e) {
            nativeDataPromise.setException(e.toString());
        }
    }
}
