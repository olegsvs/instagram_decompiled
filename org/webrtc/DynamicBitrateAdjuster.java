package org.webrtc;

import com.facebook.common.dextricks.StartupQEsConfig;

public class DynamicBitrateAdjuster extends BaseBitrateAdjuster {
    private static final double BITRATE_ADJUSTMENT_MAX_SCALE = 4.0d;
    private static final double BITRATE_ADJUSTMENT_SEC = 3.0d;
    private static final int BITRATE_ADJUSTMENT_STEPS = 20;
    private static final double BITS_PER_BYTE = 8.0d;
    private int bitrateAdjustmentScaleExp = 0;
    private double deviationBytes = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
    private double timeSinceLastAdjustmentMs = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;

    public int getAdjustedBitrateBps() {
        double d = (double) this.targetBitrateBps;
        double bitrateAdjustmentScale = getBitrateAdjustmentScale();
        Double.isNaN(d);
        return (int) (d * bitrateAdjustmentScale);
    }

    private double getBitrateAdjustmentScale() {
        double d = (double) this.bitrateAdjustmentScaleExp;
        Double.isNaN(d);
        return Math.pow(BITRATE_ADJUSTMENT_MAX_SCALE, d / 20.0d);
    }

    public void reportEncodedFrame(int i) {
        if (this.targetFps != 0) {
            double d = (double) this.targetBitrateBps;
            Double.isNaN(d);
            d /= BITS_PER_BYTE;
            double d2 = (double) this.targetFps;
            Double.isNaN(d2);
            d /= d2;
            double d3 = this.deviationBytes;
            d2 = (double) i;
            Double.isNaN(d2);
            this.deviationBytes = d3 + (d2 - d);
            d = this.timeSinceLastAdjustmentMs;
            d2 = (double) this.targetFps;
            Double.isNaN(d2);
            this.timeSinceLastAdjustmentMs = d + (1000.0d / d2);
            d = (double) this.targetBitrateBps;
            Double.isNaN(d);
            d /= BITS_PER_BYTE;
            double d4 = BITRATE_ADJUSTMENT_SEC * d;
            d3 = Math.min(this.deviationBytes, d4);
            this.deviationBytes = d3;
            this.deviationBytes = Math.max(d3, -d4);
            if (this.timeSinceLastAdjustmentMs > 3000.0d) {
                d4 = this.deviationBytes;
                if (d4 > d) {
                    this.bitrateAdjustmentScaleExp -= (int) ((d4 / d) + 0.5d);
                    this.bitrateAdjustmentScaleExp = Math.max(this.bitrateAdjustmentScaleExp, -20);
                    this.deviationBytes = d;
                } else {
                    d3 = -d;
                    if (d4 < d3) {
                        this.bitrateAdjustmentScaleExp += (int) (((-d4) / d) + 0.5d);
                        this.bitrateAdjustmentScaleExp = Math.min(this.bitrateAdjustmentScaleExp, 20);
                        this.deviationBytes = d3;
                    }
                }
                this.timeSinceLastAdjustmentMs = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
            }
        }
    }

    public void setTargets(int i, int i2) {
        if (this.targetBitrateBps > 0 && i < this.targetBitrateBps) {
            double d = this.deviationBytes;
            double d2 = (double) i;
            Double.isNaN(d2);
            d *= d2;
            d2 = (double) this.targetBitrateBps;
            Double.isNaN(d2);
            this.deviationBytes = d / d2;
        }
        super.setTargets(i, i2);
    }
}
