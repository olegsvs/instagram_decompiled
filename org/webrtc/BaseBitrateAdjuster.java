package org.webrtc;

public class BaseBitrateAdjuster implements BitrateAdjuster {
    public int targetBitrateBps = 0;
    public int targetFps = 0;

    public void reportEncodedFrame(int i) {
    }

    public int getAdjustedBitrateBps() {
        return this.targetBitrateBps;
    }

    public int getCodecConfigFramerate() {
        return this.targetFps;
    }

    public void setTargets(int i, int i2) {
        this.targetBitrateBps = i;
        this.targetFps = i2;
    }
}
