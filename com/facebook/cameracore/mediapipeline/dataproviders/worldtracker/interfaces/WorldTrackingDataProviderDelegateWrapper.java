package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces;

import X.AnonymousClass1sI;
import X.AnonymousClass1sJ;

public class WorldTrackingDataProviderDelegateWrapper {
    private final AnonymousClass1sJ mDelegate;

    public WorldTrackingDataProviderDelegateWrapper(AnonymousClass1sJ anonymousClass1sJ) {
        this.mDelegate = anonymousClass1sJ;
    }

    private static AnonymousClass1sI getConfidenceType(int i) {
        if (i < 0 || i >= AnonymousClass1sI.values().length) {
            return AnonymousClass1sI.NOT_TRACKING;
        }
        return AnonymousClass1sI.values()[i];
    }

    public void onWorldTrackingConfidenceUpdated(int i) {
        AnonymousClass1sJ anonymousClass1sJ = this.mDelegate;
        if (anonymousClass1sJ != null) {
            anonymousClass1sJ.onWorldTrackingConfidenceUpdated(getConfidenceType(i));
        }
    }
}
