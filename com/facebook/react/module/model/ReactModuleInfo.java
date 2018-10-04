package com.facebook.react.module.model;

public final class ReactModuleInfo {
    private final boolean mCanOverrideExistingModule;
    private String mClassName;
    private final boolean mHasConstants;
    private final boolean mIsCxxModule;
    private final String mName;
    private final boolean mNeedsEagerInit;

    public ReactModuleInfo(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.mName = str;
        this.mClassName = str2;
        this.mCanOverrideExistingModule = z;
        this.mNeedsEagerInit = z2;
        this.mHasConstants = z3;
        this.mIsCxxModule = z4;
    }

    public final boolean canOverrideExistingModule() {
        return this.mCanOverrideExistingModule;
    }

    public final String className() {
        return this.mClassName;
    }

    public final boolean hasConstants() {
        return this.mHasConstants;
    }

    public final boolean isCxxModule() {
        return this.mIsCxxModule;
    }

    public final String name() {
        return this.mName;
    }

    public final boolean needsEagerInit() {
        return this.mNeedsEagerInit;
    }
}
