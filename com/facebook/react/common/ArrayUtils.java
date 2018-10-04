package com.facebook.react.common;

import java.util.Arrays;

public final class ArrayUtils {
    public static float[] copyArray(float[] fArr) {
        return fArr == null ? null : Arrays.copyOf(fArr, fArr.length);
    }
}
