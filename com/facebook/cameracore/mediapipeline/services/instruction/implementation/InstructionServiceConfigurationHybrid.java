package com.facebook.cameracore.mediapipeline.services.instruction.implementation;

import X.AnonymousClass2jd;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.instruction.interfaces.InstructionServiceListenerWrapper;
import com.facebook.jni.HybridData;

public class InstructionServiceConfigurationHybrid extends ServiceConfiguration {
    private final AnonymousClass2jd mConfiguration;

    private static native HybridData initHybrid(InstructionServiceListenerWrapper instructionServiceListenerWrapper);

    public InstructionServiceConfigurationHybrid(AnonymousClass2jd anonymousClass2jd) {
        super(initHybrid(anonymousClass2jd.f33074B));
        this.mConfiguration = anonymousClass2jd;
    }
}
