package com.facebook.cameracore.mediapipeline.dataproviders.speed.implementation;

import X.AnonymousClass2iD;
import com.facebook.jni.HybridData;

public class SpeedDataSourceWrapper {
    private final AnonymousClass2iD mDataSource;
    private final HybridData mHybridData;

    private native HybridData initHybrid();

    private native void setSpeedInKph(float f);

    public void destroy() {
        this.mHybridData.resetNative();
    }

    public final void onNewDataAvailable(float f) {
        setSpeedInKph(f);
    }

    public void start() {
        AnonymousClass2iD anonymousClass2iD = this.mDataSource;
        if (!anonymousClass2iD.f32782C) {
            AnonymousClass2iD.m16976B(anonymousClass2iD);
        }
    }
}
