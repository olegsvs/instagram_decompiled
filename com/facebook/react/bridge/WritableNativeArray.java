package com.facebook.react.bridge;

import X.AnonymousClass0LR;
import com.facebook.jni.HybridData;

public class WritableNativeArray extends ReadableNativeArray implements WritableArray {
    private static native HybridData initHybrid();

    private native void pushNativeArray(WritableNativeArray writableNativeArray);

    private native void pushNativeMap(WritableNativeMap writableNativeMap);

    public native void pushBoolean(boolean z);

    public native void pushDouble(double d);

    public native void pushInt(int i);

    public native void pushNull();

    public native void pushString(String str);

    static {
        ReactBridge.staticInit();
    }

    public WritableNativeArray() {
        super(initHybrid());
    }

    public final void pushArray(WritableArray writableArray) {
        boolean z;
        if (writableArray != null) {
            if (!(writableArray instanceof WritableNativeArray)) {
                z = false;
                AnonymousClass0LR.C(z, "Illegal type provided");
                pushNativeArray((WritableNativeArray) writableArray);
            }
        }
        z = true;
        AnonymousClass0LR.C(z, "Illegal type provided");
        pushNativeArray((WritableNativeArray) writableArray);
    }

    public final void pushMap(WritableMap writableMap) {
        boolean z;
        if (writableMap != null) {
            if (!(writableMap instanceof WritableNativeMap)) {
                z = false;
                AnonymousClass0LR.C(z, "Illegal type provided");
                pushNativeMap((WritableNativeMap) writableMap);
            }
        }
        z = true;
        AnonymousClass0LR.C(z, "Illegal type provided");
        pushNativeMap((WritableNativeMap) writableMap);
    }
}
