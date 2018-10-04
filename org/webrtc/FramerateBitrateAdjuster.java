package org.webrtc;

public class FramerateBitrateAdjuster extends BaseBitrateAdjuster {
    private static final int INITIAL_FPS = 30;

    public int getCodecConfigFramerate() {
        return INITIAL_FPS;
    }

    public void setTargets(int i, int i2) {
        if (this.targetFps == 0) {
            i2 = INITIAL_FPS;
        }
        super.setTargets(i, i2);
        this.targetBitrateBps = (this.targetBitrateBps * INITIAL_FPS) / this.targetFps;
    }
}
