package com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces;

import X.AnonymousClass1QE;
import X.AnonymousClass1ss;
import com.facebook.jni.HybridData;

public abstract class AnalyticsLogger {
    public HybridData mHybridData;

    public abstract String getEffectStartIntentString();

    public abstract String getProductName();

    public abstract void logForBugReport(String str, String str2);

    public abstract void logRawEvent(String str, String str2);

    public abstract void logSessionEvent(boolean z);

    public abstract void release();

    public abstract void setInfo(String str, String str2, String str3, boolean z, AnonymousClass1ss anonymousClass1ss);

    public abstract void setInfo(String str, String str2, String str3, boolean z, String str4, AnonymousClass1ss anonymousClass1ss);

    public abstract void setSessionListener(AnonymousClass1QE anonymousClass1QE);
}
