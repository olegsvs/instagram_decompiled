package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

public final class ModulusAnimatedNode extends ValueAnimatedNode {
    private final int mInputNode;
    private final double mModulus;
    private final NativeAnimatedNodesManager mNativeAnimatedNodesManager;

    public ModulusAnimatedNode(ReadableMap readableMap, NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        this.mNativeAnimatedNodesManager = nativeAnimatedNodesManager;
        this.mInputNode = readableMap.getInt("input");
        this.mModulus = readableMap.getDouble("modulus");
    }

    public final void update() {
        AnimatedNode nodeById = this.mNativeAnimatedNodesManager.getNodeById(this.mInputNode);
        if (nodeById == null || !(nodeById instanceof ValueAnimatedNode)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.modulus node");
        }
        this.mValue = ((ValueAnimatedNode) nodeById).getValue() % this.mModulus;
    }
}
