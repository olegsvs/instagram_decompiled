package com.facebook.react.uimanager;

import X.AnonymousClass09A;
import X.AnonymousClass09H;
import X.AnonymousClass0LR;
import X.AnonymousClass2q2;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaConfig;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaNodeCloneFunction;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaWrap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReactShadowNodeImpl implements ReactShadowNode {
    public static final boolean DEBUG = false;
    public static final String TAG = "ReactShadowNodeImpl";
    private static final YogaConfig sYogaConfig;
    private ArrayList mChildren;
    private final Spacing mDefaultPadding;
    private int mGenerationDebugInformation;
    private long mInstanceHandle;
    private boolean mIsLayoutOnly;
    private boolean mIsSealed;
    private ArrayList mNativeChildren;
    private ReactShadowNodeImpl mNativeParent;
    private ReactStylesDiffMap mNewProps;
    private boolean mNodeUpdated;
    private ReactShadowNode mOriginalReactShadowNode;
    private final float[] mPadding;
    private final boolean[] mPaddingIsPercent;
    private ReactShadowNodeImpl mParent;
    private int mReactTag;
    private int mRootTag;
    private int mScreenHeight;
    private int mScreenWidth;
    private int mScreenX;
    private int mScreenY;
    private boolean mShouldNotifyOnLayout;
    private ThemedReactContext mThemedContext;
    private int mTotalNativeChildren;
    private String mViewClassName;
    public YogaNode mYogaNode;

    /* renamed from: com.facebook.react.uimanager.ReactShadowNodeImpl$1 */
    public final class C01411 implements YogaNodeCloneFunction {
        public final YogaNode cloneNode(YogaNode yogaNode, YogaNode yogaNode2, int i) {
            AnonymousClass09A.B(8192, "FabricReconciler.YogaNodeCloneFunction").C();
            try {
                ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) yogaNode2.getData();
                AnonymousClass0LR.D(reactShadowNodeImpl);
                ReactShadowNodeImpl reactShadowNodeImpl2 = (ReactShadowNodeImpl) yogaNode.getData();
                AnonymousClass0LR.D(reactShadowNodeImpl2);
                if (ReactShadowNodeImpl.DEBUG) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("YogaNode started cloning: oldYogaNode: ");
                    stringBuilder.append(reactShadowNodeImpl2);
                    stringBuilder.append(" - parent: ");
                    stringBuilder.append(reactShadowNodeImpl);
                    stringBuilder.append(" index: ");
                    stringBuilder.append(i);
                    stringBuilder.toString();
                }
                ReactShadowNodeImpl mutableCopy = reactShadowNodeImpl2.mutableCopy(reactShadowNodeImpl2.getInstanceHandle());
                ReactShadowNodeImpl.replaceChild(reactShadowNodeImpl, mutableCopy, i);
                YogaNode yogaNode3 = mutableCopy.mYogaNode;
                return yogaNode3;
            } finally {
                AnonymousClass09H.C(8192, 2075681114);
            }
        }
    }

    public static final void onAfterUpdateTransaction() {
    }

    public boolean isVirtual() {
        return false;
    }

    public boolean isVirtualAnchor() {
        return false;
    }

    public void onBeforeLayout() {
    }

    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
    }

    public void setLocalData(Object obj) {
    }

    static {
        YogaConfig yogaConfig = ReactYogaConfigProvider.get();
        sYogaConfig = yogaConfig;
        yogaConfig.setOnCloneNode(new C01411());
    }

    public ReactShadowNodeImpl() {
        this.mNodeUpdated = true;
        this.mTotalNativeChildren = 0;
        this.mPadding = new float[9];
        this.mPaddingIsPercent = new boolean[9];
        this.mGenerationDebugInformation = 1;
        this.mOriginalReactShadowNode = null;
        this.mIsSealed = false;
        this.mDefaultPadding = new Spacing(0.0f);
        if (isVirtual()) {
            this.mYogaNode = null;
            return;
        }
        YogaNode yogaNode = (YogaNode) YogaNodePool.get().acquire();
        if (yogaNode == null) {
            yogaNode = new YogaNode(sYogaConfig);
        }
        this.mYogaNode = yogaNode;
        yogaNode.setData(this);
        Arrays.fill(this.mPadding, 1.0E21f);
    }

    public ReactShadowNodeImpl(ReactShadowNodeImpl reactShadowNodeImpl) {
        this.mNodeUpdated = true;
        this.mTotalNativeChildren = 0;
        this.mPadding = new float[9];
        this.mPaddingIsPercent = new boolean[9];
        this.mGenerationDebugInformation = 1;
        this.mOriginalReactShadowNode = null;
        this.mIsSealed = false;
        this.mReactTag = reactShadowNodeImpl.mReactTag;
        this.mRootTag = reactShadowNodeImpl.mRootTag;
        this.mViewClassName = reactShadowNodeImpl.mViewClassName;
        this.mThemedContext = reactShadowNodeImpl.mThemedContext;
        this.mShouldNotifyOnLayout = reactShadowNodeImpl.mShouldNotifyOnLayout;
        this.mIsLayoutOnly = reactShadowNodeImpl.mIsLayoutOnly;
        this.mNativeParent = reactShadowNodeImpl.mNativeParent;
        this.mDefaultPadding = new Spacing(reactShadowNodeImpl.mDefaultPadding);
        this.mNodeUpdated = true;
        this.mScreenX = 0;
        this.mScreenY = 0;
        this.mScreenWidth = 0;
        this.mScreenHeight = 0;
        this.mGenerationDebugInformation = reactShadowNodeImpl.mGenerationDebugInformation + 1;
        Object obj = reactShadowNodeImpl.mPadding;
        System.arraycopy(obj, 0, this.mPadding, 0, obj.length);
        obj = reactShadowNodeImpl.mPaddingIsPercent;
        System.arraycopy(obj, 0, this.mPaddingIsPercent, 0, obj.length);
        this.mNewProps = null;
        this.mParent = null;
        this.mOriginalReactShadowNode = reactShadowNodeImpl;
        this.mIsSealed = false;
    }

    public void addChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        assertNotSealed();
        if (this.mChildren == null) {
            this.mChildren = new ArrayList(4);
        }
        this.mChildren.add(i, reactShadowNodeImpl);
        reactShadowNodeImpl.mParent = this;
        if (!(this.mYogaNode == null || isYogaLeafNode())) {
            YogaNode yogaNode = reactShadowNodeImpl.mYogaNode;
            if (yogaNode != null) {
                this.mYogaNode.addChildAt(yogaNode, i);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '");
                stringBuilder.append(reactShadowNodeImpl.toString());
                stringBuilder.append("' to a '");
                stringBuilder.append(toString());
                stringBuilder.append("')");
                throw new RuntimeException(stringBuilder.toString());
            }
        }
        markUpdated();
        int totalNativeChildren = reactShadowNodeImpl.isLayoutOnly() ? reactShadowNodeImpl.getTotalNativeChildren() : 1;
        this.mTotalNativeChildren += totalNativeChildren;
        updateNativeChildrenCountInParent(totalNativeChildren);
    }

    public final void addNativeChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        assertNotSealed();
        AnonymousClass0LR.B(this.mIsLayoutOnly ^ 1);
        AnonymousClass0LR.B(reactShadowNodeImpl.mIsLayoutOnly ^ 1);
        if (this.mNativeChildren == null) {
            this.mNativeChildren = new ArrayList(4);
        }
        this.mNativeChildren.add(i, reactShadowNodeImpl);
        reactShadowNodeImpl.mNativeParent = this;
    }

    private void assertNotSealed() {
        if (this.mIsSealed) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can not modify sealed node ");
            stringBuilder.append(toString());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final void calculateLayout() {
        this.mYogaNode.calculateLayout(1.0E21f, 1.0E21f);
    }

    public ReactShadowNodeImpl copy() {
        return new ReactShadowNodeImpl(this);
    }

    private static ArrayList copyChildren(List list) {
        ArrayList arrayList = list == null ? null : new ArrayList(list);
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ReactShadowNodeImpl) arrayList.get(i)).mParent = null;
            }
        }
        return arrayList;
    }

    public final void dirty() {
        assertNotSealed();
        if (!isVirtual()) {
            this.mYogaNode.dirty();
        }
    }

    public final boolean dispatchUpdates(float f, float f2, UIViewOperationQueue uIViewOperationQueue, NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        UIViewOperationQueue uIViewOperationQueue2 = uIViewOperationQueue;
        if (this.mNodeUpdated) {
            onCollectExtraUpdates(uIViewOperationQueue2);
        }
        boolean z = false;
        if (hasNewLayout()) {
            float layoutX = getLayoutX();
            float layoutY = getLayoutY();
            f += layoutX;
            int round = Math.round(f);
            f2 += layoutY;
            int round2 = Math.round(f2);
            int round3 = Math.round(f + getLayoutWidth());
            int round4 = Math.round(f2 + getLayoutHeight());
            int round5 = Math.round(layoutX);
            int round6 = Math.round(layoutY);
            round3 -= round;
            round4 -= round2;
            if (!(round5 == this.mScreenX && round6 == this.mScreenY && round3 == this.mScreenWidth && round4 == this.mScreenHeight)) {
                z = true;
            }
            this.mScreenX = round5;
            this.mScreenY = round6;
            this.mScreenWidth = round3;
            this.mScreenHeight = round4;
            if (z) {
                NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer2 = nativeViewHierarchyOptimizer;
                if (nativeViewHierarchyOptimizer != null) {
                    nativeViewHierarchyOptimizer2.handleUpdateLayout(this);
                } else {
                    uIViewOperationQueue2.enqueueUpdateLayout(getParent().getReactTag(), getReactTag(), getScreenX(), getScreenY(), getScreenWidth(), getScreenHeight());
                }
            }
        }
        return z;
    }

    public final void dispose() {
        YogaNode yogaNode = this.mYogaNode;
        if (yogaNode != null) {
            yogaNode.reset();
            YogaNodePool.get().release(this.mYogaNode);
        }
    }

    public final ReactShadowNodeImpl getChildAt(int i) {
        ArrayList arrayList = this.mChildren;
        if (arrayList != null) {
            return (ReactShadowNodeImpl) arrayList.get(i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index ");
        stringBuilder.append(i);
        stringBuilder.append(" out of bounds: node has no children");
        throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
    }

    public final int getChildCount() {
        ArrayList arrayList = this.mChildren;
        return arrayList == null ? 0 : arrayList.size();
    }

    public final long getInstanceHandle() {
        return this.mInstanceHandle;
    }

    public final YogaDirection getLayoutDirection() {
        return this.mYogaNode.getLayoutDirection();
    }

    public final float getLayoutHeight() {
        return this.mYogaNode.getLayoutHeight();
    }

    public final float getLayoutWidth() {
        return this.mYogaNode.getLayoutWidth();
    }

    public final float getLayoutX() {
        return this.mYogaNode.getLayoutX();
    }

    public final float getLayoutY() {
        return this.mYogaNode.getLayoutY();
    }

    public final int getNativeChildCount() {
        ArrayList arrayList = this.mNativeChildren;
        return arrayList == null ? 0 : arrayList.size();
    }

    public final int getNativeOffsetForChild(ReactShadowNodeImpl reactShadowNodeImpl) {
        Object obj = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= getChildCount()) {
                break;
            }
            ReactShadowNodeImpl childAt = getChildAt(i);
            if (reactShadowNodeImpl == childAt) {
                break;
            }
            if (childAt.isLayoutOnly()) {
                i3 = childAt.getTotalNativeChildren();
            }
            i2 += i3;
            i++;
        }
        obj = 1;
        if (obj != null) {
            return i2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Child ");
        stringBuilder.append(reactShadowNodeImpl.getReactTag());
        stringBuilder.append(" was not a child of ");
        stringBuilder.append(this.mReactTag);
        throw new RuntimeException(stringBuilder.toString());
    }

    public final ReactShadowNodeImpl getNativeParent() {
        return this.mNativeParent;
    }

    public final float getPadding(int i) {
        return this.mYogaNode.getLayoutPadding(YogaEdge.m17415B(i));
    }

    public final ReactShadowNodeImpl getParent() {
        return this.mParent;
    }

    public final int getReactTag() {
        return this.mReactTag;
    }

    public final int getRootTag() {
        AnonymousClass0LR.B(this.mRootTag != 0);
        return this.mRootTag;
    }

    public final int getScreenHeight() {
        return this.mScreenHeight;
    }

    public final int getScreenWidth() {
        return this.mScreenWidth;
    }

    public final int getScreenX() {
        return this.mScreenX;
    }

    public final int getScreenY() {
        return this.mScreenY;
    }

    public final ThemedReactContext getThemedContext() {
        return (ThemedReactContext) AnonymousClass0LR.D(this.mThemedContext);
    }

    public final int getTotalNativeChildren() {
        return this.mTotalNativeChildren;
    }

    public final String getViewClass() {
        return (String) AnonymousClass0LR.D(this.mViewClassName);
    }

    public final boolean hasNewLayout() {
        YogaNode yogaNode = this.mYogaNode;
        return yogaNode != null && yogaNode.hasNewLayout();
    }

    public final boolean hasUpdates() {
        if (!(this.mNodeUpdated || hasNewLayout())) {
            if (!isDirty()) {
                return false;
            }
        }
        return true;
    }

    public final int indexOf(ReactShadowNodeImpl reactShadowNodeImpl) {
        ArrayList arrayList = this.mChildren;
        return arrayList == null ? -1 : arrayList.indexOf(reactShadowNodeImpl);
    }

    public final int indexOfNativeChild(ReactShadowNodeImpl reactShadowNodeImpl) {
        AnonymousClass0LR.D(this.mNativeChildren);
        return this.mNativeChildren.indexOf(reactShadowNodeImpl);
    }

    public final boolean isDescendantOf(ReactShadowNodeImpl reactShadowNodeImpl) {
        for (this = getParent(); this != null; this = getParent()) {
            if (this == reactShadowNodeImpl) {
                return true;
            }
        }
        return false;
    }

    public final boolean isDirty() {
        YogaNode yogaNode = this.mYogaNode;
        return yogaNode != null && yogaNode.isDirty();
    }

    public final boolean isLayoutOnly() {
        return this.mIsLayoutOnly;
    }

    public final boolean isMeasureDefined() {
        return this.mYogaNode.isMeasureDefined();
    }

    public boolean isYogaLeafNode() {
        return isMeasureDefined();
    }

    public final void markLayoutSeen() {
        assertNotSealed();
        YogaNode yogaNode = this.mYogaNode;
        if (yogaNode != null) {
            yogaNode.markLayoutSeen();
        }
    }

    public final void markUpdateSeen() {
        assertNotSealed();
        this.mNodeUpdated = false;
        if (hasNewLayout()) {
            markLayoutSeen();
        }
    }

    public void markUpdated() {
        if (!this.mNodeUpdated) {
            this.mNodeUpdated = true;
            ReactShadowNodeImpl parent = getParent();
            if (parent != null) {
                parent.markUpdated();
            }
        }
    }

    public ReactShadowNodeImpl mutableCopy(long j) {
        ReactShadowNodeImpl copy = copy();
        AnonymousClass0LR.C(getClass() == copy.getClass(), "Copied shadow node must use the same class");
        copy.mInstanceHandle = j;
        YogaNode yogaNode = this.mYogaNode;
        if (yogaNode != null) {
            yogaNode = yogaNode.clone();
            copy.mYogaNode = yogaNode;
            yogaNode.setData(copy);
        } else {
            copy.mYogaNode = null;
        }
        copy.mTotalNativeChildren = this.mTotalNativeChildren;
        copy.mNativeChildren = copyChildren(this.mNativeChildren);
        copy.mChildren = copyChildren(this.mChildren);
        return copy;
    }

    public final void removeAllNativeChildren() {
        ArrayList arrayList = this.mNativeChildren;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ReactShadowNodeImpl) this.mNativeChildren.get(size)).mNativeParent = null;
            }
            this.mNativeChildren.clear();
        }
    }

    public final void removeAndDisposeAllChildren() {
        if (getChildCount() != 0) {
            int i = 0;
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!(this.mYogaNode == null || isYogaLeafNode())) {
                    this.mYogaNode.removeChildAt(childCount);
                }
                ReactShadowNodeImpl childAt = getChildAt(childCount);
                childAt.mParent = null;
                childAt.dispose();
                i += childAt.isLayoutOnly() ? childAt.getTotalNativeChildren() : 1;
            }
            ((ArrayList) AnonymousClass0LR.D(this.mChildren)).clear();
            markUpdated();
            this.mTotalNativeChildren -= i;
            updateNativeChildrenCountInParent(-i);
        }
    }

    public final ReactShadowNodeImpl removeChildAt(int i) {
        assertNotSealed();
        ArrayList arrayList = this.mChildren;
        if (arrayList != null) {
            ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) arrayList.remove(i);
            reactShadowNodeImpl.mParent = null;
            if (!(this.mYogaNode == null || isYogaLeafNode())) {
                this.mYogaNode.removeChildAt(i);
            }
            markUpdated();
            int totalNativeChildren = reactShadowNodeImpl.isLayoutOnly() ? reactShadowNodeImpl.getTotalNativeChildren() : 1;
            this.mTotalNativeChildren -= totalNativeChildren;
            updateNativeChildrenCountInParent(-totalNativeChildren);
            return reactShadowNodeImpl;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index ");
        stringBuilder.append(i);
        stringBuilder.append(" out of bounds: node has no children");
        throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
    }

    public final ReactShadowNodeImpl removeNativeChildAt(int i) {
        AnonymousClass0LR.D(this.mNativeChildren);
        this = (ReactShadowNodeImpl) this.mNativeChildren.remove(i);
        this.mNativeParent = null;
        return this;
    }

    public static void replaceChild(ReactShadowNodeImpl reactShadowNodeImpl, ReactShadowNodeImpl reactShadowNodeImpl2, int i) {
        reactShadowNodeImpl.mChildren.remove(i);
        reactShadowNodeImpl.mChildren.add(i, reactShadowNodeImpl2);
        reactShadowNodeImpl2.mParent = reactShadowNodeImpl;
    }

    public final void setAlignContent(YogaAlign yogaAlign) {
        assertNotSealed();
        this.mYogaNode.setAlignContent(yogaAlign);
    }

    public final void setAlignItems(YogaAlign yogaAlign) {
        assertNotSealed();
        this.mYogaNode.setAlignItems(yogaAlign);
    }

    public final void setAlignSelf(YogaAlign yogaAlign) {
        assertNotSealed();
        this.mYogaNode.setAlignSelf(yogaAlign);
    }

    public final void setBorder(int i, float f) {
        assertNotSealed();
        this.mYogaNode.setBorder(YogaEdge.m17415B(i), f);
    }

    public final void setDefaultPadding(int i, float f) {
        assertNotSealed();
        this.mDefaultPadding.set(i, f);
        updatePadding();
    }

    public final void setDisplay(YogaDisplay yogaDisplay) {
        assertNotSealed();
        this.mYogaNode.setDisplay(yogaDisplay);
    }

    public void setFlex(float f) {
        assertNotSealed();
        this.mYogaNode.setFlex(f);
    }

    public final void setFlexBasis(float f) {
        assertNotSealed();
        this.mYogaNode.setFlexBasis(f);
    }

    public final void setFlexBasisAuto() {
        assertNotSealed();
        this.mYogaNode.setFlexBasisAuto();
    }

    public final void setFlexBasisPercent(float f) {
        assertNotSealed();
        this.mYogaNode.setFlexBasisPercent(f);
    }

    public final void setFlexDirection(YogaFlexDirection yogaFlexDirection) {
        assertNotSealed();
        this.mYogaNode.setFlexDirection(yogaFlexDirection);
    }

    public void setFlexGrow(float f) {
        assertNotSealed();
        this.mYogaNode.setFlexGrow(f);
    }

    public void setFlexShrink(float f) {
        assertNotSealed();
        this.mYogaNode.setFlexShrink(f);
    }

    public final void setFlexWrap(YogaWrap yogaWrap) {
        assertNotSealed();
        this.mYogaNode.setWrap(yogaWrap);
    }

    public final void setIsLayoutOnly(boolean z) {
        assertNotSealed();
        boolean z2 = true;
        AnonymousClass0LR.C(getParent() == null, "Must remove from no opt parent first");
        AnonymousClass0LR.C(this.mNativeParent == null, "Must remove from native parent first");
        if (getNativeChildCount() != 0) {
            z2 = false;
        }
        AnonymousClass0LR.C(z2, "Must remove all native children first");
        this.mIsLayoutOnly = z;
    }

    public final void setJustifyContent(YogaJustify yogaJustify) {
        assertNotSealed();
        this.mYogaNode.setJustifyContent(yogaJustify);
    }

    public final void setLayoutDirection(YogaDirection yogaDirection) {
        assertNotSealed();
        this.mYogaNode.setDirection(yogaDirection);
    }

    public final void setMargin(int i, float f) {
        assertNotSealed();
        this.mYogaNode.setMargin(YogaEdge.m17415B(i), f);
    }

    public final void setMarginAuto(int i) {
        assertNotSealed();
        this.mYogaNode.setMarginAuto(YogaEdge.m17415B(i));
    }

    public final void setMarginPercent(int i, float f) {
        assertNotSealed();
        this.mYogaNode.setMarginPercent(YogaEdge.m17415B(i), f);
    }

    public final void setMeasureFunction(YogaMeasureFunction yogaMeasureFunction) {
        assertNotSealed();
        this.mYogaNode.setMeasureFunction(yogaMeasureFunction);
    }

    public final void setOverflow(YogaOverflow yogaOverflow) {
        assertNotSealed();
        this.mYogaNode.setOverflow(yogaOverflow);
    }

    public void setPadding(int i, float f) {
        assertNotSealed();
        this.mPadding[i] = f;
        this.mPaddingIsPercent[i] = false;
        updatePadding();
    }

    public final void setPaddingPercent(int i, float f) {
        assertNotSealed();
        this.mPadding[i] = f;
        this.mPaddingIsPercent[i] = AnonymousClass2q2.m17411B(f) ^ 1;
        updatePadding();
    }

    public final void setPosition(int i, float f) {
        assertNotSealed();
        this.mYogaNode.setPosition(YogaEdge.m17415B(i), f);
    }

    public final void setPositionPercent(int i, float f) {
        assertNotSealed();
        this.mYogaNode.setPositionPercent(YogaEdge.m17415B(i), f);
    }

    public final void setPositionType(YogaPositionType yogaPositionType) {
        assertNotSealed();
        this.mYogaNode.setPositionType(yogaPositionType);
    }

    public final void setReactTag(int i) {
        assertNotSealed();
        this.mReactTag = i;
    }

    public final void setRootTag(int i) {
        assertNotSealed();
        this.mRootTag = i;
    }

    public void setShouldNotifyOnLayout(boolean z) {
        assertNotSealed();
        this.mShouldNotifyOnLayout = z;
    }

    public final void setStyleAspectRatio(float f) {
        assertNotSealed();
        this.mYogaNode.setAspectRatio(f);
    }

    public final void setStyleHeight(float f) {
        assertNotSealed();
        this.mYogaNode.setHeight(f);
    }

    public final void setStyleHeightAuto() {
        assertNotSealed();
        this.mYogaNode.setHeightAuto();
    }

    public final void setStyleHeightPercent(float f) {
        assertNotSealed();
        this.mYogaNode.setHeightPercent(f);
    }

    public final void setStyleMaxHeight(float f) {
        assertNotSealed();
        this.mYogaNode.setMaxHeight(f);
    }

    public final void setStyleMaxHeightPercent(float f) {
        assertNotSealed();
        this.mYogaNode.setMaxHeightPercent(f);
    }

    public final void setStyleMaxWidth(float f) {
        assertNotSealed();
        this.mYogaNode.setMaxWidth(f);
    }

    public final void setStyleMaxWidthPercent(float f) {
        assertNotSealed();
        this.mYogaNode.setMaxWidthPercent(f);
    }

    public final void setStyleMinHeight(float f) {
        assertNotSealed();
        this.mYogaNode.setMinHeight(f);
    }

    public final void setStyleMinHeightPercent(float f) {
        assertNotSealed();
        this.mYogaNode.setMinHeightPercent(f);
    }

    public final void setStyleMinWidth(float f) {
        assertNotSealed();
        this.mYogaNode.setMinWidth(f);
    }

    public final void setStyleMinWidthPercent(float f) {
        assertNotSealed();
        this.mYogaNode.setMinWidthPercent(f);
    }

    public final void setStyleWidth(float f) {
        assertNotSealed();
        this.mYogaNode.setWidth(f);
    }

    public final void setStyleWidthAuto() {
        assertNotSealed();
        this.mYogaNode.setWidthAuto();
    }

    public final void setStyleWidthPercent(float f) {
        assertNotSealed();
        this.mYogaNode.setWidthPercent(f);
    }

    public void setThemedContext(ThemedReactContext themedReactContext) {
        this.mThemedContext = themedReactContext;
    }

    public final void setViewClassName(String str) {
        assertNotSealed();
        this.mViewClassName = str;
    }

    public final boolean shouldNotifyOnLayout() {
        return this.mShouldNotifyOnLayout;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(this.mViewClassName);
        stringBuilder.append(" ");
        stringBuilder.append(getReactTag());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private void updateNativeChildrenCountInParent(int i) {
        if (this.mIsLayoutOnly) {
            do {
                this = getParent();
                if (this != null) {
                    this.mTotalNativeChildren += i;
                } else {
                    return;
                }
            } while (isLayoutOnly());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updatePadding() {
        /*
        r4 = this;
        r4.assertNotSealed();
        r3 = 0;
    L_0x0004:
        r2 = 8;
        if (r3 > r2) goto L_0x0090;
    L_0x0008:
        if (r3 == 0) goto L_0x0055;
    L_0x000a:
        r0 = 2;
        if (r3 == r0) goto L_0x0055;
    L_0x000d:
        r0 = 4;
        if (r3 == r0) goto L_0x0055;
    L_0x0010:
        r0 = 5;
        if (r3 != r0) goto L_0x0014;
    L_0x0013:
        goto L_0x0055;
    L_0x0014:
        r0 = 1;
        if (r3 == r0) goto L_0x0035;
    L_0x0017:
        r0 = 3;
        if (r3 != r0) goto L_0x001b;
    L_0x001a:
        goto L_0x0035;
    L_0x001b:
        r0 = r4.mPadding;
        r0 = r0[r3];
        r0 = X.AnonymousClass2q2.m17411B(r0);
        if (r0 == 0) goto L_0x006b;
    L_0x0025:
        r2 = r4.mYogaNode;
        r1 = com.facebook.yoga.YogaEdge.m17415B(r3);
        r0 = r4.mDefaultPadding;
        r0 = r0.getRaw(r3);
        r2.setPadding(r1, r0);
        goto L_0x008c;
    L_0x0035:
        r0 = r4.mPadding;
        r0 = r0[r3];
        r0 = X.AnonymousClass2q2.m17411B(r0);
        if (r0 == 0) goto L_0x006b;
    L_0x003f:
        r1 = r4.mPadding;
        r0 = 7;
        r0 = r1[r0];
        r0 = X.AnonymousClass2q2.m17411B(r0);
        if (r0 == 0) goto L_0x006b;
    L_0x004a:
        r0 = r4.mPadding;
        r0 = r0[r2];
        r0 = X.AnonymousClass2q2.m17411B(r0);
        if (r0 == 0) goto L_0x006b;
    L_0x0054:
        goto L_0x0025;
    L_0x0055:
        r0 = r4.mPadding;
        r0 = r0[r3];
        r0 = X.AnonymousClass2q2.m17411B(r0);
        if (r0 == 0) goto L_0x006b;
    L_0x005f:
        r1 = r4.mPadding;
        r0 = 6;
        r0 = r1[r0];
        r0 = X.AnonymousClass2q2.m17411B(r0);
        if (r0 == 0) goto L_0x006b;
    L_0x006a:
        goto L_0x004a;
    L_0x006b:
        r0 = r4.mPaddingIsPercent;
        r0 = r0[r3];
        if (r0 == 0) goto L_0x007f;
    L_0x0071:
        r2 = r4.mYogaNode;
        r1 = com.facebook.yoga.YogaEdge.m17415B(r3);
        r0 = r4.mPadding;
        r0 = r0[r3];
        r2.setPaddingPercent(r1, r0);
        goto L_0x008c;
    L_0x007f:
        r2 = r4.mYogaNode;
        r1 = com.facebook.yoga.YogaEdge.m17415B(r3);
        r0 = r4.mPadding;
        r0 = r0[r3];
        r2.setPadding(r1, r0);
    L_0x008c:
        r3 = r3 + 1;
        goto L_0x0004;
    L_0x0090:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.ReactShadowNodeImpl.updatePadding():void");
    }

    public final void updateProperties(ReactStylesDiffMap reactStylesDiffMap) {
        ViewManagerPropertyUpdater.updateProps(this, reactStylesDiffMap);
        onAfterUpdateTransaction();
    }
}
