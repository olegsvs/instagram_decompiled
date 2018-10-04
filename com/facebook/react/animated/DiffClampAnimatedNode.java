package com.facebook.react.animated;

import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

public final class DiffClampAnimatedNode extends ValueAnimatedNode {
    private final int mInputNodeTag;
    private double mLastValue;
    private final double mMax;
    private final double mMin;
    private final NativeAnimatedNodesManager mNativeAnimatedNodesManager;

    public DiffClampAnimatedNode(ReadableMap readableMap, NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        this.mNativeAnimatedNodesManager = nativeAnimatedNodesManager;
        this.mInputNodeTag = readableMap.getInt("input");
        this.mMin = readableMap.getDouble("min");
        this.mMax = readableMap.getDouble("max");
        this.mLastValue = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
        this.mValue = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
    }

    private double getInputNodeValue() {
        AnimatedNode nodeById = this.mNativeAnimatedNodesManager.getNodeById(this.mInputNodeTag);
        if (nodeById != null && (nodeById instanceof ValueAnimatedNode)) {
            return ((ValueAnimatedNode) nodeById).getValue();
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.DiffClamp node");
    }

    public final void update() {
        double inputNodeValue = getInputNodeValue();
        double d = inputNodeValue - this.mLastValue;
        this.mLastValue = inputNodeValue;
        this.mValue = Math.min(Math.max(this.mValue + d, this.mMin), this.mMax);
    }
}
