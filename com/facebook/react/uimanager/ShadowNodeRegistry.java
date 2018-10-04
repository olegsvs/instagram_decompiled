package com.facebook.react.uimanager;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.react.common.SingleThreadAsserter;

public final class ShadowNodeRegistry {
    private final SparseBooleanArray mRootTags = new SparseBooleanArray();
    private final SparseArray mTagsToCSSNodes = new SparseArray();
    private final SingleThreadAsserter mThreadAsserter = new SingleThreadAsserter();

    public final void addNode(ReactShadowNode reactShadowNode) {
        this.mThreadAsserter.assertNow();
        this.mTagsToCSSNodes.put(reactShadowNode.getReactTag(), reactShadowNode);
    }

    public final void addRootNode(ReactShadowNode reactShadowNode) {
        this.mThreadAsserter.assertNow();
        int reactTag = reactShadowNode.getReactTag();
        this.mTagsToCSSNodes.put(reactTag, reactShadowNode);
        this.mRootTags.put(reactTag, true);
    }

    public final ReactShadowNode getNode(int i) {
        this.mThreadAsserter.assertNow();
        return (ReactShadowNode) this.mTagsToCSSNodes.get(i);
    }

    public final int getRootNodeCount() {
        this.mThreadAsserter.assertNow();
        return this.mRootTags.size();
    }

    public final int getRootTag(int i) {
        this.mThreadAsserter.assertNow();
        return this.mRootTags.keyAt(i);
    }

    public final boolean isRootNode(int i) {
        this.mThreadAsserter.assertNow();
        return this.mRootTags.get(i);
    }

    public final void removeNode(int i) {
        this.mThreadAsserter.assertNow();
        if (this.mRootTags.get(i)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trying to remove root node ");
            stringBuilder.append(i);
            stringBuilder.append(" without using removeRootNode!");
            throw new IllegalViewOperationException(stringBuilder.toString());
        }
        this.mTagsToCSSNodes.remove(i);
    }

    public final void removeRootNode(int i) {
        this.mThreadAsserter.assertNow();
        if (this.mRootTags.get(i)) {
            this.mTagsToCSSNodes.remove(i);
            this.mRootTags.delete(i);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View with tag ");
        stringBuilder.append(i);
        stringBuilder.append(" is not registered as a root view");
        throw new IllegalViewOperationException(stringBuilder.toString());
    }
}
