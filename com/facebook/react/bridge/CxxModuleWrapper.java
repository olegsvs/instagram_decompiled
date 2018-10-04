package com.facebook.react.bridge;

import X.AnonymousClass0CF;
import com.facebook.jni.HybridData;

public class CxxModuleWrapper extends CxxModuleWrapperBase {
    private static native CxxModuleWrapper makeDsoNative(String str, String str2);

    public CxxModuleWrapper(HybridData hybridData) {
        super(hybridData);
    }

    public static CxxModuleWrapper makeDso(String str, String str2) {
        AnonymousClass0CF.E(str);
        return makeDsoNative(AnonymousClass0CF.L(str).getAbsolutePath(), str2);
    }
}
