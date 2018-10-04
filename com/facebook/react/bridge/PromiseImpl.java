package com.facebook.react.bridge;

public final class PromiseImpl implements Promise {
    private Callback mReject;
    private Callback mResolve;

    public PromiseImpl(Callback callback, Callback callback2) {
        this.mResolve = callback;
        this.mReject = callback2;
    }

    public final void reject(String str) {
        reject("EUNSPECIFIED", str, null);
    }

    public final void reject(String str, String str2) {
        reject(str, str2, null);
    }

    public final void reject(String str, String str2, Throwable th) {
        if (this.mReject != null) {
            if (str == null) {
                str = "EUNSPECIFIED";
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("code", str);
            writableNativeMap.putString("message", str2);
            this.mReject.invoke(writableNativeMap);
        }
    }

    public final void reject(String str, Throwable th) {
        reject(str, th.getMessage(), th);
    }

    public final void reject(Throwable th) {
        reject("EUNSPECIFIED", th.getMessage(), th);
    }

    public final void resolve(Object obj) {
        Callback callback = this.mResolve;
        if (callback != null) {
            callback.invoke(obj);
        }
    }
}
