package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import X.AnonymousClass2kF;
import X.AnonymousClass3s7;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchService;
import com.facebook.jni.HybridData;

public class TouchServiceImpl extends TouchService {
    private final AnonymousClass3s7 mGestureProcessor;

    public interface HitTestCallback {
        void hitTestResult(long j, boolean z);
    }

    private static native HybridData initHybrid();

    public native void enqueueForHitTest(Gesture gesture, HitTestCallback hitTestCallback);

    public native void sendGesture(Gesture gesture);

    public TouchServiceImpl() {
        this(true);
    }

    public TouchServiceImpl(boolean z) {
        super(initHybrid());
        this.mGestureProcessor = z ? new AnonymousClass3s7(this) : null;
    }

    public final AnonymousClass3s7 getGestureProcessor() {
        return this.mGestureProcessor;
    }

    public final void setTouchConfig(AnonymousClass2kF anonymousClass2kF) {
        AnonymousClass3s7 anonymousClass3s7 = this.mGestureProcessor;
        if (anonymousClass3s7 != null) {
            anonymousClass3s7.f45603N = anonymousClass2kF;
            AnonymousClass3s7.m21025I(anonymousClass3s7);
        }
    }
}
