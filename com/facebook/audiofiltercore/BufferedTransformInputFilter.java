package com.facebook.audiofiltercore;

import com.facebook.jni.HybridData;

public class BufferedTransformInputFilter extends NativeAudioInputFilter {
    private static native HybridData initHybridJava(BufferedAudioTransform bufferedAudioTransform);

    private static native HybridData initHybridNative(long j);
}
