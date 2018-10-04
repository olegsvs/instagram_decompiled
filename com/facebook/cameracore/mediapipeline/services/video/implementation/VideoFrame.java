package com.facebook.cameracore.mediapipeline.services.video.implementation;

public class VideoFrame {
    private long presentationTimestamp;
    private int textureHandler;
    private int textureTarget;
    private float[] transformationMatrix;

    public final void update(int i, int i2, float[] fArr, long j) {
        this.textureHandler = i;
        this.textureTarget = i2;
        this.transformationMatrix = fArr;
        this.presentationTimestamp = j;
    }
}
