package com.facebook.audiofiltercore;

import com.facebook.jni.HybridData;

public class SimpleTransformOutputFilter extends NativeAudioOutputFilter {
    private static native HybridData initHybridJava(SimpleAudioTransform simpleAudioTransform);

    private static native HybridData initHybridNative(long j);

    public SimpleTransformOutputFilter(SimpleAudioTransform simpleAudioTransform) {
        super(initHybrid(simpleAudioTransform));
    }

    private static HybridData initHybrid(SimpleAudioTransform simpleAudioTransform) {
        if (simpleAudioTransform instanceof NativeSimpleAudioTransform) {
            return initHybridNative(((NativeSimpleAudioTransform) simpleAudioTransform).getSimpleAudioTransformNativeReference());
        }
        return initHybridJava(simpleAudioTransform);
    }
}
