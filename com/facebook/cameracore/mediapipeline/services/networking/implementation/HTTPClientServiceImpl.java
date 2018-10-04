package com.facebook.cameracore.mediapipeline.services.networking.implementation;

import com.facebook.cameracore.mediapipeline.services.networking.interfaces.HTTPClientService;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkClient;
import com.facebook.jni.HybridData;
import com.facebook.native_bridge.NativeDataPromise;

public class HTTPClientServiceImpl extends HTTPClientService {
    private final NetworkClient mNetworkClient;

    private native HybridData initHybrid();

    private native boolean isDomainWhitelisted(String str);

    public HTTPClientServiceImpl(NetworkClient networkClient) {
        this.mNetworkClient = networkClient;
        this.mHybridData = initHybrid();
    }

    public void sendRequest(NativeDataPromise nativeDataPromise, String str, String str2, String str3, String[] strArr, String[] strArr2) {
        String str4 = str;
        NativeDataPromise nativeDataPromise2 = nativeDataPromise;
        if (isDomainWhitelisted(str)) {
            this.mNetworkClient.sendRequest(nativeDataPromise2, str4, str2, str3, strArr, strArr2);
        } else {
            nativeDataPromise.setException("The domain is not whitelisted");
        }
    }
}
