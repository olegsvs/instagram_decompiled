package com.facebook.react.bridge;

import X.AnonymousClass0LR;
import com.facebook.jni.HybridData;

public class WritableNativeMap extends ReadableNativeMap implements WritableMap {
    private static native HybridData initHybrid();

    private native void mergeNativeMap(ReadableNativeMap readableNativeMap);

    private native void putNativeArray(String str, WritableNativeArray writableNativeArray);

    private native void putNativeMap(String str, WritableNativeMap writableNativeMap);

    public native void putBoolean(String str, boolean z);

    public native void putDouble(String str, double d);

    public native void putInt(String str, int i);

    public native void putNull(String str);

    public native void putString(String str, String str2);

    static {
        ReactBridge.staticInit();
    }

    public WritableNativeMap() {
        super(initHybrid());
    }

    public final void putArray(String str, WritableArray writableArray) {
        boolean z;
        if (writableArray != null) {
            if (!(writableArray instanceof WritableNativeArray)) {
                z = false;
                AnonymousClass0LR.C(z, "Illegal type provided");
                putNativeArray(str, (WritableNativeArray) writableArray);
            }
        }
        z = true;
        AnonymousClass0LR.C(z, "Illegal type provided");
        putNativeArray(str, (WritableNativeArray) writableArray);
    }

    public final void putMap(String str, WritableMap writableMap) {
        boolean z;
        if (writableMap != null) {
            if (!(writableMap instanceof WritableNativeMap)) {
                z = false;
                AnonymousClass0LR.C(z, "Illegal type provided");
                putNativeMap(str, (WritableNativeMap) writableMap);
            }
        }
        z = true;
        AnonymousClass0LR.C(z, "Illegal type provided");
        putNativeMap(str, (WritableNativeMap) writableMap);
    }
}
