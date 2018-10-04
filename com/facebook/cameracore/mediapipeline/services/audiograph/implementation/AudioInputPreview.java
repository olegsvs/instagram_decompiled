package com.facebook.cameracore.mediapipeline.services.audiograph.implementation;

import com.facebook.audiofiltercore.AudioInput;

public class AudioInputPreview implements AudioInput {
    /* renamed from: B */
    private final AudioGraphServiceController f45575B;
    /* renamed from: C */
    private final int f45576C;

    public void close() {
    }

    public AudioInputPreview(AudioGraphServiceController audioGraphServiceController, int i) {
        this.f45575B = audioGraphServiceController;
        this.f45576C = i;
    }

    public int read(short[] sArr, int i) {
        return this.f45575B.readPreviewSamples(sArr, i, this.f45576C);
    }
}
