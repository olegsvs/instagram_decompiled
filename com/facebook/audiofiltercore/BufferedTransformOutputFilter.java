package com.facebook.audiofiltercore;

import com.facebook.jni.HybridData;

public class BufferedTransformOutputFilter extends NativeAudioOutputFilter {
    private static native HybridData initHybridJava(BufferedAudioTransform bufferedAudioTransform);

    private static native HybridData initHybridNative(long j);
}
