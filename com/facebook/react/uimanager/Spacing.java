package com.facebook.react.uimanager;

import X.AnonymousClass2q2;
import java.util.Arrays;

public final class Spacing {
    private static final int[] sFlagsMap = new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256};
    private final float mDefaultValue;
    private boolean mHasAliasesSet;
    private final float[] mSpacing;
    private int mValueFlags;

    public Spacing() {
        this(0.0f);
    }

    public Spacing(float f) {
        this.mValueFlags = 0;
        this.mDefaultValue = f;
        this.mSpacing = newFullSpacingArray();
    }

    public Spacing(Spacing spacing) {
        this.mValueFlags = 0;
        this.mDefaultValue = spacing.mDefaultValue;
        float[] fArr = spacing.mSpacing;
        this.mSpacing = Arrays.copyOf(fArr, fArr.length);
        this.mValueFlags = spacing.mValueFlags;
        this.mHasAliasesSet = spacing.mHasAliasesSet;
    }

    public final float get(int i) {
        float f;
        int i2;
        int i3;
        int[] iArr;
        if (i != 4) {
            if (i != 5) {
                f = this.mDefaultValue;
                i2 = this.mValueFlags;
                if (i2 != 0) {
                    if ((i2 & sFlagsMap[i]) == 0) {
                        if (this.mHasAliasesSet) {
                            if (i != 1) {
                                if (i == 3) {
                                    i = 6;
                                    i3 = this.mValueFlags;
                                    iArr = sFlagsMap;
                                    if ((iArr[i] & i3) == 0) {
                                        i = 8;
                                        if ((i3 & iArr[8]) != 0) {
                                        }
                                    }
                                }
                            }
                            i = 7;
                            i3 = this.mValueFlags;
                            iArr = sFlagsMap;
                            if ((iArr[i] & i3) == 0) {
                                i = 8;
                                if ((i3 & iArr[8]) != 0) {
                                }
                            }
                        }
                    }
                    return this.mSpacing[i];
                }
                return f;
            }
        }
        f = 1.0E21f;
        i2 = this.mValueFlags;
        if (i2 != 0) {
            if ((i2 & sFlagsMap[i]) == 0) {
                if (this.mHasAliasesSet) {
                    if (i != 1) {
                        if (i == 3) {
                            i = 6;
                            i3 = this.mValueFlags;
                            iArr = sFlagsMap;
                            if ((iArr[i] & i3) == 0) {
                                i = 8;
                                if ((i3 & iArr[8]) != 0) {
                                }
                            }
                        }
                    }
                    i = 7;
                    i3 = this.mValueFlags;
                    iArr = sFlagsMap;
                    if ((iArr[i] & i3) == 0) {
                        i = 8;
                        if ((i3 & iArr[8]) != 0) {
                        }
                    }
                }
            }
            return this.mSpacing[i];
        }
        return f;
    }

    public final float getRaw(int i) {
        return this.mSpacing[i];
    }

    private static float[] newFullSpacingArray() {
        return new float[]{1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f};
    }

    public final boolean set(int i, float f) {
        boolean z = false;
        if (FloatUtil.floatsEqual(this.mSpacing[i], f)) {
            return false;
        }
        this.mSpacing[i] = f;
        if (AnonymousClass2q2.m17411B(f)) {
            this.mValueFlags = (sFlagsMap[i] ^ -1) & this.mValueFlags;
        } else {
            this.mValueFlags = sFlagsMap[i] | this.mValueFlags;
        }
        int i2 = this.mValueFlags;
        int[] iArr = sFlagsMap;
        if (!((iArr[8] & i2) == 0 && (iArr[7] & i2) == 0 && (i2 & iArr[6]) == 0)) {
            z = true;
        }
        this.mHasAliasesSet = z;
        return true;
    }
}
