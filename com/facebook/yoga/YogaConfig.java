package com.facebook.yoga;

import X.AnonymousClass0CF;

public class YogaConfig {
    public long mNativePointer;
    private YogaNodeCloneFunction mYogaNodeCloneFunction;

    private native void jni_YGConfigFree(long j);

    private native long jni_YGConfigNew();

    private native void jni_YGConfigSetExperimentalFeatureEnabled(long j, int i, boolean z);

    private native void jni_YGConfigSetHasCloneNodeFunc(long j, boolean z);

    private native void jni_YGConfigSetLogger(long j, Object obj);

    private native void jni_YGConfigSetPointScaleFactor(long j, float f);

    private native void jni_YGConfigSetPrintTreeFlag(long j, boolean z);

    private native void jni_YGConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviour(long j, boolean z);

    private native void jni_YGConfigSetUseLegacyStretchBehaviour(long j, boolean z);

    private native void jni_YGConfigSetUseWebDefaults(long j, boolean z);

    static {
        AnonymousClass0CF.E("yoga");
    }

    public YogaConfig() {
        long jni_YGConfigNew = jni_YGConfigNew();
        this.mNativePointer = jni_YGConfigNew;
        if (jni_YGConfigNew == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    private final YogaNode cloneNode(YogaNode yogaNode, YogaNode yogaNode2, int i) {
        return this.mYogaNodeCloneFunction.cloneNode(yogaNode, yogaNode2, i);
    }

    public final void finalize() {
        try {
            jni_YGConfigFree(this.mNativePointer);
        } finally {
            super.finalize();
        }
    }

    public final void setOnCloneNode(YogaNodeCloneFunction yogaNodeCloneFunction) {
        this.mYogaNodeCloneFunction = yogaNodeCloneFunction;
        jni_YGConfigSetHasCloneNodeFunc(this.mNativePointer, yogaNodeCloneFunction != null);
    }

    public final void setPointScaleFactor(float f) {
        jni_YGConfigSetPointScaleFactor(this.mNativePointer, f);
    }

    public final void setUseLegacyStretchBehaviour(boolean z) {
        jni_YGConfigSetUseLegacyStretchBehaviour(this.mNativePointer, z);
    }
}
