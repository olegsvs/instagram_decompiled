package com.facebook.react.uimanager;

import X.AnonymousClass0LR;
import android.util.SparseBooleanArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.views.view.ReactViewManager;

public final class NativeViewHierarchyOptimizer {
    private final ShadowNodeRegistry mShadowNodeRegistry;
    private final SparseBooleanArray mTagsWithLayoutVisited = new SparseBooleanArray();
    private final UIViewOperationQueue mUIViewOperationQueue;

    public final class NodeIndexPair {
        public final int index;
        public final ReactShadowNode node;

        public NodeIndexPair(ReactShadowNode reactShadowNode, int i) {
            this.node = reactShadowNode;
            this.index = i;
        }
    }

    public NativeViewHierarchyOptimizer(UIViewOperationQueue uIViewOperationQueue, ShadowNodeRegistry shadowNodeRegistry) {
        this.mUIViewOperationQueue = uIViewOperationQueue;
        this.mShadowNodeRegistry = shadowNodeRegistry;
    }

    private void addGrandchildren(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i) {
        AnonymousClass0LR.B(reactShadowNode.isLayoutOnly() ^ true);
        for (int i2 = 0; i2 < reactShadowNode2.getChildCount(); i2++) {
            ReactShadowNode childAt = reactShadowNode2.getChildAt(i2);
            AnonymousClass0LR.B(childAt.getNativeParent() == null);
            if (childAt.isLayoutOnly()) {
                int nativeChildCount = reactShadowNode.getNativeChildCount();
                addGrandchildren(reactShadowNode, childAt, i);
                i += reactShadowNode.getNativeChildCount() - nativeChildCount;
            } else {
                addNonLayoutNode(reactShadowNode, childAt, i);
                i++;
            }
        }
    }

    private void addNodeToNode(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i) {
        int nativeOffsetForChild = reactShadowNode.getNativeOffsetForChild(reactShadowNode.getChildAt(i));
        if (reactShadowNode.isLayoutOnly()) {
            NodeIndexPair walkUpUntilNonLayoutOnly = walkUpUntilNonLayoutOnly(reactShadowNode, nativeOffsetForChild);
            if (walkUpUntilNonLayoutOnly != null) {
                reactShadowNode = walkUpUntilNonLayoutOnly.node;
                nativeOffsetForChild = walkUpUntilNonLayoutOnly.index;
            } else {
                return;
            }
        }
        if (reactShadowNode2.isLayoutOnly()) {
            addGrandchildren(reactShadowNode, reactShadowNode2, nativeOffsetForChild);
        } else {
            addNonLayoutNode(reactShadowNode, reactShadowNode2, nativeOffsetForChild);
        }
    }

    private void addNonLayoutNode(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i) {
        reactShadowNode.addNativeChildAt(reactShadowNode2, i);
        this.mUIViewOperationQueue.enqueueManageChildren(reactShadowNode.getReactTag(), null, new ViewAtIndex[]{new ViewAtIndex(reactShadowNode2.getReactTag(), i)}, null);
    }

    private void applyLayoutBase(ReactShadowNode reactShadowNode) {
        int reactTag = reactShadowNode.getReactTag();
        if (!this.mTagsWithLayoutVisited.get(reactTag)) {
            this.mTagsWithLayoutVisited.put(reactTag, true);
            ReactShadowNode parent = reactShadowNode.getParent();
            reactTag = reactShadowNode.getScreenX();
            int screenY = reactShadowNode.getScreenY();
            while (parent != null && parent.isLayoutOnly()) {
                reactTag += Math.round(parent.getLayoutX());
                screenY += Math.round(parent.getLayoutY());
                parent = parent.getParent();
            }
            applyLayoutRecursive(reactShadowNode, reactTag, screenY);
        }
    }

    private void applyLayoutRecursive(ReactShadowNode reactShadowNode, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if (reactShadowNode.isLayoutOnly() || reactShadowNode.getNativeParent() == null) {
            for (int i5 = 0; i5 < reactShadowNode.getChildCount(); i5++) {
                ReactShadowNode childAt = reactShadowNode.getChildAt(i5);
                int reactTag = childAt.getReactTag();
                if (!this.mTagsWithLayoutVisited.get(reactTag)) {
                    this.mTagsWithLayoutVisited.put(reactTag, true);
                    applyLayoutRecursive(childAt, childAt.getScreenX() + i, childAt.getScreenY() + i2);
                }
            }
            return;
        }
        this.mUIViewOperationQueue.enqueueUpdateLayout(reactShadowNode.getNativeParent().getReactTag(), reactShadowNode.getReactTag(), i3, i4, reactShadowNode.getScreenWidth(), reactShadowNode.getScreenHeight());
    }

    public final void handleCreateView(ReactShadowNode reactShadowNode, ThemedReactContext themedReactContext, ReactStylesDiffMap reactStylesDiffMap) {
        boolean z = reactShadowNode.getViewClass().equals(ReactViewManager.REACT_CLASS) && isLayoutOnlyAndCollapsable(reactStylesDiffMap);
        reactShadowNode.setIsLayoutOnly(z);
        if (!z) {
            this.mUIViewOperationQueue.enqueueCreateView(themedReactContext, reactShadowNode.getReactTag(), reactShadowNode.getViewClass(), reactStylesDiffMap);
        }
    }

    public final void handleManageChildren(ReactShadowNode reactShadowNode, int[] iArr, int[] iArr2, ViewAtIndex[] viewAtIndexArr, int[] iArr3) {
        for (int i : iArr2) {
            boolean z;
            for (int i2 : iArr3) {
                if (i2 == i) {
                    z = true;
                    break;
                }
            }
            z = false;
            removeNodeFromParent(this.mShadowNodeRegistry.getNode(i), z);
        }
        for (ViewAtIndex viewAtIndex : viewAtIndexArr) {
            addNodeToNode(reactShadowNode, this.mShadowNodeRegistry.getNode(viewAtIndex.mTag), viewAtIndex.mIndex);
        }
    }

    public static void handleRemoveNode(ReactShadowNode reactShadowNode) {
        reactShadowNode.removeAllNativeChildren();
    }

    public final void handleSetChildren(ReactShadowNode reactShadowNode, ReadableArray readableArray) {
        for (int i = 0; i < readableArray.size(); i++) {
            addNodeToNode(reactShadowNode, this.mShadowNodeRegistry.getNode(readableArray.getInt(i)), i);
        }
    }

    public final void handleUpdateLayout(ReactShadowNode reactShadowNode) {
        applyLayoutBase(reactShadowNode);
    }

    public final void handleUpdateView(ReactShadowNode reactShadowNode, String str, ReactStylesDiffMap reactStylesDiffMap) {
        Object obj = (!reactShadowNode.isLayoutOnly() || isLayoutOnlyAndCollapsable(reactStylesDiffMap)) ? null : 1;
        if (obj != null) {
            transitionLayoutOnlyViewToNativeView(reactShadowNode, reactStylesDiffMap);
        } else if (!reactShadowNode.isLayoutOnly()) {
            this.mUIViewOperationQueue.enqueueUpdateProperties(reactShadowNode.getReactTag(), str, reactStylesDiffMap);
        }
    }

    private static boolean isLayoutOnlyAndCollapsable(ReactStylesDiffMap reactStylesDiffMap) {
        if (reactStylesDiffMap != null) {
            if (!reactStylesDiffMap.hasKey("collapsable") || reactStylesDiffMap.getBoolean("collapsable", true)) {
                ReadableMapKeySetIterator keySetIterator = reactStylesDiffMap.mBackingMap.keySetIterator();
                while (keySetIterator.hasNextKey()) {
                    if (!ViewProps.isLayoutOnly(reactStylesDiffMap.mBackingMap, keySetIterator.nextKey())) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void onBatchComplete() {
        this.mTagsWithLayoutVisited.clear();
    }

    private void removeNodeFromParent(ReactShadowNode reactShadowNode, boolean z) {
        ReactShadowNode nativeParent = reactShadowNode.getNativeParent();
        if (nativeParent != null) {
            nativeParent.removeNativeChildAt(nativeParent.indexOfNativeChild(reactShadowNode));
            this.mUIViewOperationQueue.enqueueManageChildren(nativeParent.getReactTag(), new int[]{nativeParent.indexOfNativeChild(reactShadowNode)}, null, z ? new int[]{reactShadowNode.getReactTag()} : null);
            return;
        }
        for (int childCount = reactShadowNode.getChildCount() - 1; childCount >= 0; childCount--) {
            removeNodeFromParent(reactShadowNode.getChildAt(childCount), z);
        }
    }

    private void transitionLayoutOnlyViewToNativeView(ReactShadowNode reactShadowNode, ReactStylesDiffMap reactStylesDiffMap) {
        ReactShadowNode parent = reactShadowNode.getParent();
        int i = 0;
        if (parent == null) {
            reactShadowNode.setIsLayoutOnly(false);
            return;
        }
        int indexOf = parent.indexOf(reactShadowNode);
        parent.removeChildAt(indexOf);
        removeNodeFromParent(reactShadowNode, false);
        reactShadowNode.setIsLayoutOnly(false);
        this.mUIViewOperationQueue.enqueueCreateView(reactShadowNode.getThemedContext(), reactShadowNode.getReactTag(), reactShadowNode.getViewClass(), reactStylesDiffMap);
        parent.addChildAt(reactShadowNode, indexOf);
        addNodeToNode(parent, reactShadowNode, indexOf);
        for (int i2 = 0; i2 < reactShadowNode.getChildCount(); i2++) {
            addNodeToNode(reactShadowNode, reactShadowNode.getChildAt(i2), i2);
        }
        AnonymousClass0LR.B(this.mTagsWithLayoutVisited.size() == 0);
        applyLayoutBase(reactShadowNode);
        while (i < reactShadowNode.getChildCount()) {
            applyLayoutBase(reactShadowNode.getChildAt(i));
            i++;
        }
        this.mTagsWithLayoutVisited.clear();
    }

    private static NodeIndexPair walkUpUntilNonLayoutOnly(ReactShadowNode reactShadowNode, int i) {
        while (reactShadowNode.isLayoutOnly()) {
            ReactShadowNode parent = reactShadowNode.getParent();
            if (parent == null) {
                return null;
            }
            i += parent.getNativeOffsetForChild(reactShadowNode);
            reactShadowNode = parent;
        }
        return new NodeIndexPair(reactShadowNode, i);
    }
}
