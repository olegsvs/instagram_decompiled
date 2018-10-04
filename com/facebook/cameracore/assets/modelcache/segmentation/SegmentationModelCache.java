package com.facebook.cameracore.assets.modelcache.segmentation;

import X.AnonymousClass0CF;
import X.AnonymousClass2hA;
import com.facebook.cameracore.assets.xplatcache.ARDFileCache;
import com.facebook.jni.HybridData;

public class SegmentationModelCache implements AnonymousClass2hA {
    private final HybridData mHybridData;

    private static native HybridData initHybrid(ARDFileCache aRDFileCache);

    public native boolean addModelForVersionIfInCache(int i, String str, String str2);

    public native String getInitNetPath(int i);

    public native String getPredictNetPath(int i);

    public native void trimExceptVersion(int i);

    static {
        AnonymousClass0CF.E("segmentation-model-cache-native-android");
    }

    public SegmentationModelCache(ARDFileCache aRDFileCache) {
        this.mHybridData = initHybrid(aRDFileCache);
    }
}
