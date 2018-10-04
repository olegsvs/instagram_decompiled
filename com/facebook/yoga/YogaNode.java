package com.facebook.yoga;

import X.AnonymousClass0CF;
import java.util.ArrayList;
import java.util.List;

public class YogaNode implements Cloneable {
    private YogaBaselineFunction mBaselineFunction;
    private float mBorderBottom = 0.0f;
    private float mBorderLeft = 0.0f;
    private float mBorderRight = 0.0f;
    private float mBorderTop = 0.0f;
    private List mChildren;
    private Object mData;
    private boolean mDoesLegacyStretchFlagAffectsLayout = false;
    private int mEdgeSetFlag = 0;
    private boolean mHasNewLayout = true;
    private boolean mHasSetPosition = false;
    private float mHeight = 1.0E21f;
    private int mLayoutDirection = 0;
    private float mLeft = 1.0E21f;
    private float mMarginBottom = 0.0f;
    private float mMarginLeft = 0.0f;
    private float mMarginRight = 0.0f;
    private float mMarginTop = 0.0f;
    private YogaMeasureFunction mMeasureFunction;
    private long mNativePointer;
    private YogaNode mOwner;
    private float mPaddingBottom = 0.0f;
    private float mPaddingLeft = 0.0f;
    private float mPaddingRight = 0.0f;
    private float mPaddingTop = 0.0f;
    private float mTop = 1.0E21f;
    private float mWidth = 1.0E21f;

    private native void jni_YGNodeCalculateLayout(long j, float f, float f2);

    private native void jni_YGNodeClearChildren(long j);

    private native long jni_YGNodeClone(long j, Object obj);

    private native void jni_YGNodeCopyStyle(long j, long j2);

    private static native void jni_YGNodeFree(long j);

    public static native int jni_YGNodeGetInstanceCount();

    private native void jni_YGNodeInsertChild(long j, long j2, int i);

    private native void jni_YGNodeInsertSharedChild(long j, long j2, int i);

    private native boolean jni_YGNodeIsDirty(long j);

    private native void jni_YGNodeMarkDirty(long j);

    private native void jni_YGNodeMarkDirtyAndPropogateToDescendants(long j);

    private native long jni_YGNodeNew();

    private native long jni_YGNodeNewWithConfig(long j);

    private native void jni_YGNodePrint(long j);

    private native void jni_YGNodeRemoveChild(long j, long j2);

    private native void jni_YGNodeReset(long j);

    private native void jni_YGNodeSetHasBaselineFunc(long j, boolean z);

    private native void jni_YGNodeSetHasMeasureFunc(long j, boolean z);

    private native void jni_YGNodeSetOwner(long j, long j2);

    private native int jni_YGNodeStyleGetAlignContent(long j);

    private native int jni_YGNodeStyleGetAlignItems(long j);

    private native int jni_YGNodeStyleGetAlignSelf(long j);

    private native float jni_YGNodeStyleGetAspectRatio(long j);

    private native float jni_YGNodeStyleGetBorder(long j, int i);

    private native int jni_YGNodeStyleGetDirection(long j);

    private native int jni_YGNodeStyleGetDisplay(long j);

    private native Object jni_YGNodeStyleGetFlexBasis(long j);

    private native int jni_YGNodeStyleGetFlexDirection(long j);

    private native float jni_YGNodeStyleGetFlexGrow(long j);

    private native float jni_YGNodeStyleGetFlexShrink(long j);

    private native Object jni_YGNodeStyleGetHeight(long j);

    private native int jni_YGNodeStyleGetJustifyContent(long j);

    private native Object jni_YGNodeStyleGetMargin(long j, int i);

    private native Object jni_YGNodeStyleGetMaxHeight(long j);

    private native Object jni_YGNodeStyleGetMaxWidth(long j);

    private native Object jni_YGNodeStyleGetMinHeight(long j);

    private native Object jni_YGNodeStyleGetMinWidth(long j);

    private native int jni_YGNodeStyleGetOverflow(long j);

    private native Object jni_YGNodeStyleGetPadding(long j, int i);

    private native Object jni_YGNodeStyleGetPosition(long j, int i);

    private native int jni_YGNodeStyleGetPositionType(long j);

    private native Object jni_YGNodeStyleGetWidth(long j);

    private native void jni_YGNodeStyleSetAlignContent(long j, int i);

    private native void jni_YGNodeStyleSetAlignItems(long j, int i);

    private native void jni_YGNodeStyleSetAlignSelf(long j, int i);

    private native void jni_YGNodeStyleSetAspectRatio(long j, float f);

    private native void jni_YGNodeStyleSetBorder(long j, int i, float f);

    private native void jni_YGNodeStyleSetDirection(long j, int i);

    private native void jni_YGNodeStyleSetDisplay(long j, int i);

    private native void jni_YGNodeStyleSetFlex(long j, float f);

    private native void jni_YGNodeStyleSetFlexBasis(long j, float f);

    private native void jni_YGNodeStyleSetFlexBasisAuto(long j);

    private native void jni_YGNodeStyleSetFlexBasisPercent(long j, float f);

    private native void jni_YGNodeStyleSetFlexDirection(long j, int i);

    private native void jni_YGNodeStyleSetFlexGrow(long j, float f);

    private native void jni_YGNodeStyleSetFlexShrink(long j, float f);

    private native void jni_YGNodeStyleSetFlexWrap(long j, int i);

    private native void jni_YGNodeStyleSetHeight(long j, float f);

    private native void jni_YGNodeStyleSetHeightAuto(long j);

    private native void jni_YGNodeStyleSetHeightPercent(long j, float f);

    private native void jni_YGNodeStyleSetJustifyContent(long j, int i);

    private native void jni_YGNodeStyleSetMargin(long j, int i, float f);

    private native void jni_YGNodeStyleSetMarginAuto(long j, int i);

    private native void jni_YGNodeStyleSetMarginPercent(long j, int i, float f);

    private native void jni_YGNodeStyleSetMaxHeight(long j, float f);

    private native void jni_YGNodeStyleSetMaxHeightPercent(long j, float f);

    private native void jni_YGNodeStyleSetMaxWidth(long j, float f);

    private native void jni_YGNodeStyleSetMaxWidthPercent(long j, float f);

    private native void jni_YGNodeStyleSetMinHeight(long j, float f);

    private native void jni_YGNodeStyleSetMinHeightPercent(long j, float f);

    private native void jni_YGNodeStyleSetMinWidth(long j, float f);

    private native void jni_YGNodeStyleSetMinWidthPercent(long j, float f);

    private native void jni_YGNodeStyleSetOverflow(long j, int i);

    private native void jni_YGNodeStyleSetPadding(long j, int i, float f);

    private native void jni_YGNodeStyleSetPaddingPercent(long j, int i, float f);

    private native void jni_YGNodeStyleSetPosition(long j, int i, float f);

    private native void jni_YGNodeStyleSetPositionPercent(long j, int i, float f);

    private native void jni_YGNodeStyleSetPositionType(long j, int i);

    private native void jni_YGNodeStyleSetWidth(long j, float f);

    private native void jni_YGNodeStyleSetWidthAuto(long j);

    private native void jni_YGNodeStyleSetWidthPercent(long j, float f);

    static {
        AnonymousClass0CF.E("yoga");
    }

    public YogaNode() {
        long jni_YGNodeNew = jni_YGNodeNew();
        this.mNativePointer = jni_YGNodeNew;
        if (jni_YGNodeNew == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    public YogaNode(YogaConfig yogaConfig) {
        long jni_YGNodeNewWithConfig = jni_YGNodeNewWithConfig(yogaConfig.mNativePointer);
        this.mNativePointer = jni_YGNodeNewWithConfig;
        if (jni_YGNodeNewWithConfig == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    public final void addChildAt(YogaNode yogaNode, int i) {
        if (yogaNode.mOwner == null) {
            YogaNode yogaNode2 = this;
            if (this.mChildren == null) {
                this.mChildren = new ArrayList(4);
            }
            this.mChildren.add(i, yogaNode);
            yogaNode.mOwner = this;
            jni_YGNodeInsertChild(this.mNativePointer, yogaNode.mNativePointer, i);
            return;
        }
        throw new IllegalStateException("Child already has a parent, it must be removed first.");
    }

    public final float baseline(float f, float f2) {
        return this.mBaselineFunction.baseline(this, f, f2);
    }

    public final void calculateLayout(float f, float f2) {
        jni_YGNodeCalculateLayout(this.mNativePointer, f, f2);
    }

    public final YogaNode clone() {
        try {
            YogaNode yogaNode = (YogaNode) super.clone();
            long jni_YGNodeClone = jni_YGNodeClone(this.mNativePointer, yogaNode);
            if (this.mChildren != null) {
                for (YogaNode yogaNode2 : this.mChildren) {
                    yogaNode2.jni_YGNodeSetOwner(yogaNode2.mNativePointer, 0);
                    yogaNode2.mOwner = null;
                }
            }
            yogaNode.mNativePointer = jni_YGNodeClone;
            yogaNode.mOwner = null;
            yogaNode.mChildren = this.mChildren != null ? (List) ((ArrayList) this.mChildren).clone() : null;
            if (yogaNode.mChildren != null) {
                for (YogaNode yogaNode3 : yogaNode.mChildren) {
                    yogaNode3.mOwner = null;
                }
            }
            return yogaNode;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void dirty() {
        jni_YGNodeMarkDirty(this.mNativePointer);
    }

    public final void finalize() {
        try {
            freeNatives();
        } finally {
            super.finalize();
        }
    }

    public final void freeNatives() {
        long j = this.mNativePointer;
        if (j > 0) {
            this.mNativePointer = 0;
            jni_YGNodeFree(j);
        }
    }

    public final Object getData() {
        return this.mData;
    }

    public final YogaDirection getLayoutDirection() {
        return YogaDirection.m17412B(this.mLayoutDirection);
    }

    public final float getLayoutHeight() {
        return this.mHeight;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float getLayoutPadding(com.facebook.yoga.YogaEdge r3) {
        /*
        r2 = this;
        r0 = r3.ordinal();
        switch(r0) {
            case 0: goto L_0x002f;
            case 1: goto L_0x002c;
            case 2: goto L_0x0029;
            case 3: goto L_0x0026;
            case 4: goto L_0x001d;
            case 5: goto L_0x000f;
            default: goto L_0x0007;
        };
    L_0x0007:
        r1 = new java.lang.IllegalArgumentException;
        r0 = "Cannot get layout paddings of multi-edge shorthands";
        r1.<init>(r0);
        throw r1;
    L_0x000f:
        r1 = r2.getLayoutDirection();
        r0 = com.facebook.yoga.YogaDirection.RTL;
        if (r1 != r0) goto L_0x001a;
    L_0x0017:
        r0 = r2.mPaddingLeft;
        goto L_0x001c;
    L_0x001a:
        r0 = r2.mPaddingRight;
    L_0x001c:
        return r0;
    L_0x001d:
        r1 = r2.getLayoutDirection();
        r0 = com.facebook.yoga.YogaDirection.RTL;
        if (r1 != r0) goto L_0x0017;
    L_0x0025:
        goto L_0x001a;
    L_0x0026:
        r0 = r2.mPaddingBottom;
        return r0;
    L_0x0029:
        r0 = r2.mPaddingRight;
        return r0;
    L_0x002c:
        r0 = r2.mPaddingTop;
        return r0;
    L_0x002f:
        r0 = r2.mPaddingLeft;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.yoga.YogaNode.getLayoutPadding(com.facebook.yoga.YogaEdge):float");
    }

    public final float getLayoutWidth() {
        return this.mWidth;
    }

    public final float getLayoutX() {
        return this.mLeft;
    }

    public final float getLayoutY() {
        return this.mTop;
    }

    public final boolean hasNewLayout() {
        return this.mHasNewLayout;
    }

    public final boolean isDirty() {
        return jni_YGNodeIsDirty(this.mNativePointer);
    }

    public final boolean isMeasureDefined() {
        return this.mMeasureFunction != null;
    }

    public final void markLayoutSeen() {
        this.mHasNewLayout = false;
    }

    public final long measure(float f, int i, float f2, int i2) {
        if (isMeasureDefined()) {
            return this.mMeasureFunction.measure(this, f, YogaMeasureMode.m17419B(i), f2, YogaMeasureMode.m17419B(i2));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    public final YogaNode removeChildAt(int i) {
        List list = this.mChildren;
        if (list != null) {
            YogaNode yogaNode = (YogaNode) list.remove(i);
            yogaNode.mOwner = null;
            jni_YGNodeRemoveChild(this.mNativePointer, yogaNode.mNativePointer);
            return yogaNode;
        }
        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    private final long replaceChild(YogaNode yogaNode, int i) {
        List list = this.mChildren;
        if (list != null) {
            list.remove(i);
            this.mChildren.add(i, yogaNode);
            yogaNode.mOwner = this;
            return yogaNode.mNativePointer;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }

    public final void reset() {
        this.mEdgeSetFlag = 0;
        this.mHasSetPosition = false;
        this.mHasNewLayout = true;
        this.mWidth = 1.0E21f;
        this.mHeight = 1.0E21f;
        this.mTop = 1.0E21f;
        this.mLeft = 1.0E21f;
        this.mMarginLeft = 0.0f;
        this.mMarginTop = 0.0f;
        this.mMarginRight = 0.0f;
        this.mMarginBottom = 0.0f;
        this.mPaddingLeft = 0.0f;
        this.mPaddingTop = 0.0f;
        this.mPaddingRight = 0.0f;
        this.mPaddingBottom = 0.0f;
        this.mBorderLeft = 0.0f;
        this.mBorderTop = 0.0f;
        this.mBorderRight = 0.0f;
        this.mBorderBottom = 0.0f;
        this.mLayoutDirection = 0;
        this.mMeasureFunction = null;
        this.mBaselineFunction = null;
        this.mData = null;
        this.mDoesLegacyStretchFlagAffectsLayout = false;
        jni_YGNodeReset(this.mNativePointer);
    }

    public final void setAlignContent(YogaAlign yogaAlign) {
        jni_YGNodeStyleSetAlignContent(this.mNativePointer, yogaAlign.m17410A());
    }

    public final void setAlignItems(YogaAlign yogaAlign) {
        jni_YGNodeStyleSetAlignItems(this.mNativePointer, yogaAlign.m17410A());
    }

    public final void setAlignSelf(YogaAlign yogaAlign) {
        jni_YGNodeStyleSetAlignSelf(this.mNativePointer, yogaAlign.m17410A());
    }

    public final void setAspectRatio(float f) {
        jni_YGNodeStyleSetAspectRatio(this.mNativePointer, f);
    }

    public final void setBorder(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 4;
        jni_YGNodeStyleSetBorder(this.mNativePointer, yogaEdge.m17416A(), f);
    }

    public final void setData(Object obj) {
        this.mData = obj;
    }

    public final void setDirection(YogaDirection yogaDirection) {
        jni_YGNodeStyleSetDirection(this.mNativePointer, yogaDirection.m17413A());
    }

    public final void setDisplay(YogaDisplay yogaDisplay) {
        jni_YGNodeStyleSetDisplay(this.mNativePointer, yogaDisplay.m17414A());
    }

    public final void setFlex(float f) {
        jni_YGNodeStyleSetFlex(this.mNativePointer, f);
    }

    public final void setFlexBasis(float f) {
        jni_YGNodeStyleSetFlexBasis(this.mNativePointer, f);
    }

    public final void setFlexBasisAuto() {
        jni_YGNodeStyleSetFlexBasisAuto(this.mNativePointer);
    }

    public final void setFlexBasisPercent(float f) {
        jni_YGNodeStyleSetFlexBasisPercent(this.mNativePointer, f);
    }

    public final void setFlexDirection(YogaFlexDirection yogaFlexDirection) {
        jni_YGNodeStyleSetFlexDirection(this.mNativePointer, yogaFlexDirection.m17417A());
    }

    public final void setFlexGrow(float f) {
        jni_YGNodeStyleSetFlexGrow(this.mNativePointer, f);
    }

    public final void setFlexShrink(float f) {
        jni_YGNodeStyleSetFlexShrink(this.mNativePointer, f);
    }

    public final void setHeight(float f) {
        jni_YGNodeStyleSetHeight(this.mNativePointer, f);
    }

    public final void setHeightAuto() {
        jni_YGNodeStyleSetHeightAuto(this.mNativePointer);
    }

    public final void setHeightPercent(float f) {
        jni_YGNodeStyleSetHeightPercent(this.mNativePointer, f);
    }

    public final void setJustifyContent(YogaJustify yogaJustify) {
        jni_YGNodeStyleSetJustifyContent(this.mNativePointer, yogaJustify.m17418A());
    }

    public final void setMargin(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 1;
        jni_YGNodeStyleSetMargin(this.mNativePointer, yogaEdge.m17416A(), f);
    }

    public final void setMarginAuto(YogaEdge yogaEdge) {
        this.mEdgeSetFlag |= 1;
        jni_YGNodeStyleSetMarginAuto(this.mNativePointer, yogaEdge.m17416A());
    }

    public final void setMarginPercent(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 1;
        jni_YGNodeStyleSetMarginPercent(this.mNativePointer, yogaEdge.m17416A(), f);
    }

    public final void setMaxHeight(float f) {
        jni_YGNodeStyleSetMaxHeight(this.mNativePointer, f);
    }

    public final void setMaxHeightPercent(float f) {
        jni_YGNodeStyleSetMaxHeightPercent(this.mNativePointer, f);
    }

    public final void setMaxWidth(float f) {
        jni_YGNodeStyleSetMaxWidth(this.mNativePointer, f);
    }

    public final void setMaxWidthPercent(float f) {
        jni_YGNodeStyleSetMaxWidthPercent(this.mNativePointer, f);
    }

    public final void setMeasureFunction(YogaMeasureFunction yogaMeasureFunction) {
        this.mMeasureFunction = yogaMeasureFunction;
        jni_YGNodeSetHasMeasureFunc(this.mNativePointer, yogaMeasureFunction != null);
    }

    public final void setMinHeight(float f) {
        jni_YGNodeStyleSetMinHeight(this.mNativePointer, f);
    }

    public final void setMinHeightPercent(float f) {
        jni_YGNodeStyleSetMinHeightPercent(this.mNativePointer, f);
    }

    public final void setMinWidth(float f) {
        jni_YGNodeStyleSetMinWidth(this.mNativePointer, f);
    }

    public final void setMinWidthPercent(float f) {
        jni_YGNodeStyleSetMinWidthPercent(this.mNativePointer, f);
    }

    public final void setOverflow(YogaOverflow yogaOverflow) {
        jni_YGNodeStyleSetOverflow(this.mNativePointer, yogaOverflow.m17421A());
    }

    public final void setPadding(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 2;
        jni_YGNodeStyleSetPadding(this.mNativePointer, yogaEdge.m17416A(), f);
    }

    public final void setPaddingPercent(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 2;
        jni_YGNodeStyleSetPaddingPercent(this.mNativePointer, yogaEdge.m17416A(), f);
    }

    public final void setPosition(YogaEdge yogaEdge, float f) {
        this.mHasSetPosition = true;
        jni_YGNodeStyleSetPosition(this.mNativePointer, yogaEdge.m17416A(), f);
    }

    public final void setPositionPercent(YogaEdge yogaEdge, float f) {
        this.mHasSetPosition = true;
        jni_YGNodeStyleSetPositionPercent(this.mNativePointer, yogaEdge.m17416A(), f);
    }

    public final void setPositionType(YogaPositionType yogaPositionType) {
        jni_YGNodeStyleSetPositionType(this.mNativePointer, yogaPositionType.m17422A());
    }

    public final void setWidth(float f) {
        jni_YGNodeStyleSetWidth(this.mNativePointer, f);
    }

    public final void setWidthAuto() {
        jni_YGNodeStyleSetWidthAuto(this.mNativePointer);
    }

    public final void setWidthPercent(float f) {
        jni_YGNodeStyleSetWidthPercent(this.mNativePointer, f);
    }

    public final void setWrap(YogaWrap yogaWrap) {
        jni_YGNodeStyleSetFlexWrap(this.mNativePointer, yogaWrap.m17425A());
    }
}
