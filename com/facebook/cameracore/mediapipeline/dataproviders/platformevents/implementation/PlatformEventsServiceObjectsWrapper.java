package com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation;

import X.AnonymousClass1sC;
import X.AnonymousClass1sD;
import com.facebook.jni.HybridData;
import org.json.JSONObject;

public class PlatformEventsServiceObjectsWrapper {
    private final AnonymousClass1sD mDelegate;
    private final HybridData mHybridData;
    private final AnonymousClass1sC mInput;
    private boolean mIsAlive;

    private native void enqueueEventNative(String str);

    private native HybridData initHybrid();

    public PlatformEventsServiceObjectsWrapper(AnonymousClass1sD anonymousClass1sD, AnonymousClass1sC anonymousClass1sC) {
        this.mDelegate = anonymousClass1sD;
        this.mInput = anonymousClass1sC;
        AnonymousClass1sC anonymousClass1sC2 = this.mInput;
        if (anonymousClass1sC2 != null) {
            anonymousClass1sC2.f23587B = this;
        }
        this.mHybridData = initHybrid();
    }

    public void didReceiveEngineEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            AnonymousClass1sD anonymousClass1sD = this.mDelegate;
            if (anonymousClass1sD != null) {
                anonymousClass1sD.didReceiveEngineEvent(jSONObject);
            }
        } catch (String str2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid json events from engine: ");
            stringBuilder.append(str2.toString());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final void enqueueEvent(JSONObject jSONObject) {
        enqueueEventNative(jSONObject.toString());
    }

    public final boolean isAlive() {
        return this.mIsAlive;
    }

    public void start() {
        this.mIsAlive = true;
        AnonymousClass1sC anonymousClass1sC = this.mInput;
        PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper = anonymousClass1sC.f23587B;
        if (platformEventsServiceObjectsWrapper != null && platformEventsServiceObjectsWrapper.isAlive()) {
            while (!anonymousClass1sC.f23588C.isEmpty()) {
                anonymousClass1sC.f23587B.enqueueEvent((JSONObject) anonymousClass1sC.f23588C.pop());
            }
        }
    }

    public final void stop() {
        this.mIsAlive = false;
        this.mHybridData.resetNative();
    }
}
