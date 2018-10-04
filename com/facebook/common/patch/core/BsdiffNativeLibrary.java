package com.facebook.common.patch.core;

import X.AnonymousClass08w;
import java.util.Arrays;

public class BsdiffNativeLibrary extends AnonymousClass08w {
    public static native void patch(String str, String str2, String str3);

    public BsdiffNativeLibrary() {
        super(Arrays.asList(new String[]{"gnustl_shared", "bsdiff", "commonpatchjni"}));
    }
}
