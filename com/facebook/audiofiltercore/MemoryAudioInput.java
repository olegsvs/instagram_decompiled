package com.facebook.audiofiltercore;

import com.facebook.jni.HybridData;

public class MemoryAudioInput extends NativeRestartableAudioInput {
    private static native HybridData initHybrid(long j);
}
