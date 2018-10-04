package com.facebook.audiofiltercore;

import com.facebook.jni.HybridData;

public class SimpleTransformInputFilter extends NativeAudioInputFilter {
    private static native HybridData initHybridJava(SimpleAudioTransform simpleAudioTransform);

    private static native HybridData initHybridNative(long j);

    public SimpleTransformInputFilter(SimpleAudioTransform simpleAudioTransform) {
        super(initHybrid(simpleAudioTransform));
    }

    public SimpleTransformInputFilter(SimpleAudioTransform simpleAudioTransform, AudioInput audioInput) {
        this(simpleAudioTransform);
        setInput(audioInput);
    }

    private static HybridData initHybrid(SimpleAudioTransform simpleAudioTransform) {
        if (simpleAudioTransform instanceof NativeSimpleAudioTransform) {
            return initHybridNative(((NativeSimpleAudioTransform) simpleAudioTransform).getSimpleAudioTransformNativeReference());
        }
        return initHybridJava(simpleAudioTransform);
    }
}
