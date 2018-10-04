package com.facebook.react.animated;

import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.react.bridge.ReadableMap;

public class ValueAnimatedNode extends AnimatedNode {
    public double mOffset = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
    public double mValue = Double.NaN;
    private AnimatedNodeValueListener mValueListener;

    public ValueAnimatedNode(ReadableMap readableMap) {
        this.mValue = readableMap.getDouble("value");
        this.mOffset = readableMap.getDouble("offset");
    }

    public final void extractOffset() {
        this.mOffset += this.mValue;
        this.mValue = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
    }

    public final void flattenOffset() {
        this.mValue += this.mOffset;
        this.mOffset = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
    }

    public final double getValue() {
        return this.mOffset + this.mValue;
    }

    public final void onValueUpdate() {
        AnimatedNodeValueListener animatedNodeValueListener = this.mValueListener;
        if (animatedNodeValueListener != null) {
            animatedNodeValueListener.onValueUpdate(getValue());
        }
    }

    public final void setValueListener(AnimatedNodeValueListener animatedNodeValueListener) {
        this.mValueListener = animatedNodeValueListener;
    }
}
