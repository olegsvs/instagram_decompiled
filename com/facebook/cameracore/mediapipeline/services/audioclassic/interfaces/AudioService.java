package com.facebook.cameracore.mediapipeline.services.audioclassic.interfaces;

import com.facebook.jni.HybridData;

public abstract class AudioService {
    public HybridData mHybridData;

    public abstract boolean onInputDataAvailable(byte[] bArr, int i, int i2);

    public abstract void play(String str, String str2, boolean z, boolean z2, float f, boolean z3);

    public abstract void prepareSound(String str, boolean z);

    public abstract void release();

    public abstract void reset();

    public abstract void setCurrentAssetDirectory(String str);

    public abstract void setRenderCallback(AudioRenderCallback audioRenderCallback);

    public abstract void startRendering(int i, boolean z);

    public abstract void stop(String str);
}
