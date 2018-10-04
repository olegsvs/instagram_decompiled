package com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common;

import X.AnonymousClass2jY;
import X.AnonymousClass3s0;
import com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig;
import com.facebook.jni.HybridData;

public class ARExperimentConfigImpl extends ARExperimentConfig {
    private final AnonymousClass3s0 mARExperimentUtil;

    private native HybridData initHybrid();

    public ARExperimentConfigImpl() {
        this.mHybridData = initHybrid();
        this.mARExperimentUtil = null;
    }

    public ARExperimentConfigImpl(AnonymousClass3s0 anonymousClass3s0) {
        this.mHybridData = initHybrid();
        this.mARExperimentUtil = anonymousClass3s0;
    }

    public boolean getBool(int i, boolean z) {
        AnonymousClass3s0 anonymousClass3s0 = this.mARExperimentUtil;
        if (anonymousClass3s0 == null) {
            return z;
        }
        return anonymousClass3s0.m21005A(AnonymousClass2jY.m16997B(i), z);
    }

    public double getDouble(int i, double d) {
        AnonymousClass3s0 anonymousClass3s0 = this.mARExperimentUtil;
        if (anonymousClass3s0 == null) {
            return d;
        }
        return anonymousClass3s0.m21006B(AnonymousClass2jY.m16998C(i), d);
    }

    public long getLong(int i, long j) {
        AnonymousClass3s0 anonymousClass3s0 = this.mARExperimentUtil;
        if (anonymousClass3s0 == null) {
            return j;
        }
        return anonymousClass3s0.m21007C(AnonymousClass2jY.m16999D(i), j);
    }

    public String getString(int i, String str) {
        AnonymousClass3s0 anonymousClass3s0 = this.mARExperimentUtil;
        if (anonymousClass3s0 == null) {
            return str;
        }
        return anonymousClass3s0.m21008D(AnonymousClass2jY.m17000E(i), str);
    }

    public final void release() {
        this.mHybridData.resetNative();
    }
}
