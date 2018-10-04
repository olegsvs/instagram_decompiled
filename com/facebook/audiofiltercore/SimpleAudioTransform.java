package com.facebook.audiofiltercore;

public interface SimpleAudioTransform {
    boolean isActive();

    void processSamples(short[] sArr, short[] sArr2, int i);
}
