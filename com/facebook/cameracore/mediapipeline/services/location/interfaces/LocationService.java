package com.facebook.cameracore.mediapipeline.services.location.interfaces;

import com.facebook.jni.HybridData;
import com.facebook.native_bridge.NativeDataPromise;

public abstract class LocationService {
    public HybridData mHybridData;

    public abstract void getCurrentCityName(NativeDataPromise nativeDataPromise);

    public abstract LocationData getCurrentLocationData();
}
