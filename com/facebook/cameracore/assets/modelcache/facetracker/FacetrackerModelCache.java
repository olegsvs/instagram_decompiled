package com.facebook.cameracore.assets.modelcache.facetracker;

import X.AnonymousClass0CF;
import X.AnonymousClass2hA;
import com.facebook.cameracore.assets.xplatcache.ARDFileCache;
import com.facebook.jni.HybridData;

public class FacetrackerModelCache implements AnonymousClass2hA {
    private final HybridData mHybridData;

    private static native HybridData initHybrid(ARDFileCache aRDFileCache);

    public native boolean addModelForVersionIfInCache(int i, String str, String str2);

    public native String getFaceAlignPath(int i);

    public native String getFaceContourPath(int i);

    public native String getFaceDetectPath(int i);

    public native String getMeshPath(int i);

    public native void trimExceptVersion(int i);

    static {
        AnonymousClass0CF.E("facetracker-model-cache-native-android");
    }

    public FacetrackerModelCache(ARDFileCache aRDFileCache) {
        this.mHybridData = initHybrid(aRDFileCache);
    }
}
