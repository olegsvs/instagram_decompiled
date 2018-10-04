package com.facebook.cameracore.mediapipeline.services.persistence.implementation;

import X.AnonymousClass2k1;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.persistence.interfaces.PersistenceServiceDelegateHybrid;
import com.facebook.cameracore.mediapipeline.services.persistence.interfaces.PersistenceServiceDelegateJavaHybrid;
import com.facebook.jni.HybridData;

public class PersistenceServiceConfigurationHybrid extends ServiceConfiguration {
    private final PersistenceServiceDelegateHybrid mSharedScopeDelegate;
    private final PersistenceServiceDelegateHybrid mUserScopeDelegate;

    private static native HybridData initHybrid(PersistenceServiceDelegateHybrid persistenceServiceDelegateHybrid, PersistenceServiceDelegateHybrid persistenceServiceDelegateHybrid2);

    public PersistenceServiceConfigurationHybrid(AnonymousClass2k1 anonymousClass2k1) {
        this(new PersistenceServiceDelegateJavaHybrid(anonymousClass2k1.f33148C), new PersistenceServiceDelegateJavaHybrid(anonymousClass2k1.f33147B));
    }

    private PersistenceServiceConfigurationHybrid(PersistenceServiceDelegateHybrid persistenceServiceDelegateHybrid, PersistenceServiceDelegateHybrid persistenceServiceDelegateHybrid2) {
        super(initHybrid(persistenceServiceDelegateHybrid, persistenceServiceDelegateHybrid2));
        this.mUserScopeDelegate = persistenceServiceDelegateHybrid;
        this.mSharedScopeDelegate = persistenceServiceDelegateHybrid2;
    }
}
