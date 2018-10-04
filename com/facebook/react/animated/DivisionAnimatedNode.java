package com.facebook.react.animated;

import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

public final class DivisionAnimatedNode extends ValueAnimatedNode {
    private final int[] mInputNodes;
    private final NativeAnimatedNodesManager mNativeAnimatedNodesManager;

    public DivisionAnimatedNode(ReadableMap readableMap, NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        this.mNativeAnimatedNodesManager = nativeAnimatedNodesManager;
        ReadableArray array = readableMap.getArray("input");
        this.mInputNodes = new int[array.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.mInputNodes;
            if (i < iArr.length) {
                iArr[i] = array.getInt(i);
                i++;
            } else {
                return;
            }
        }
    }

    public final void update() {
        int i = 0;
        while (true) {
            int[] iArr = this.mInputNodes;
            if (i < iArr.length) {
                AnimatedNode nodeById = this.mNativeAnimatedNodesManager.getNodeById(iArr[i]);
                if (nodeById != null && (nodeById instanceof ValueAnimatedNode)) {
                    double value = ((ValueAnimatedNode) nodeById).getValue();
                    if (i == 0) {
                        this.mValue = value;
                    } else if (value != StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
                        this.mValue = this.mValue / value;
                    } else {
                        throw new JSApplicationCausedNativeException("Detected a division by zero in Animated.divide node");
                    }
                    i++;
                }
            } else {
                return;
            }
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.divide node");
    }
}
