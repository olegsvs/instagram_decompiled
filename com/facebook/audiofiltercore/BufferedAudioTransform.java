package com.facebook.audiofiltercore;

public interface BufferedAudioTransform {
    void flush();

    int getAvailableSampleCount();

    boolean isActive();

    void processSamples(short[] sArr, int i);

    int receiveSamples(short[] sArr, int i);
}
