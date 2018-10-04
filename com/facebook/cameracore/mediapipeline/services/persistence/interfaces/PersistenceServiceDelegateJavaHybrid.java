package com.facebook.cameracore.mediapipeline.services.persistence.interfaces;

import X.AnonymousClass3s4;
import com.facebook.jni.HybridData;

public class PersistenceServiceDelegateJavaHybrid extends PersistenceServiceDelegateHybrid {
    private final AnonymousClass3s4 mDelegate;

    private native HybridData initHybrid();

    public PersistenceServiceDelegateJavaHybrid(AnonymousClass3s4 anonymousClass3s4) {
        this.mDelegate = anonymousClass3s4;
        this.mHybridData = initHybrid();
    }

    public String get(String str) {
        return this.mDelegate.mo5118A(str);
    }

    public boolean remove(String str) {
        return this.mDelegate.mo5119B(str);
    }

    public boolean set(String str, String str2) {
        return this.mDelegate.mo5120C(str, str2);
    }
}
