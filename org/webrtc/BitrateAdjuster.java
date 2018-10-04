package org.webrtc;

public interface BitrateAdjuster {
    int getAdjustedBitrateBps();

    int getCodecConfigFramerate();

    void reportEncodedFrame(int i);

    void setTargets(int i, int i2);
}
