package com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation;

import X.AnonymousClass0Js;
import X.AnonymousClass1QD;
import X.AnonymousClass1QE;
import X.AnonymousClass1ss;
import X.AnonymousClass1st;
import X.AnonymousClass2jG;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.jni.HybridData;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AnalyticsLoggerImpl extends AnalyticsLogger {
    private static AnonymousClass1st sSampleRates;
    private AnonymousClass1QD mCameraARAnalyticsLogger;
    private final AnonymousClass0Js mCameraARBugReportLogger;
    private AnonymousClass1ss mEffectStartIntentType;

    private native HybridData initHybrid();

    public AnalyticsLoggerImpl(AnonymousClass1QD anonymousClass1QD, AnonymousClass0Js anonymousClass0Js) {
        this.mHybridData = initHybrid();
        this.mCameraARAnalyticsLogger = anonymousClass1QD;
        sSampleRates = new AnonymousClass2jG();
        this.mCameraARBugReportLogger = anonymousClass0Js;
        this.mEffectStartIntentType = AnonymousClass1ss.Unknown;
    }

    public String getEffectStartIntentString() {
        return this.mEffectStartIntentType.toString();
    }

    public String getProductName() {
        return this.mCameraARAnalyticsLogger.A();
    }

    public void logForBugReport(String str, String str2) {
        AnonymousClass0Js anonymousClass0Js = this.mCameraARBugReportLogger;
        if (anonymousClass0Js != null) {
            StringBuilder stringBuilder;
            String stringBuilder2;
            if (anonymousClass0Js.f2947B.containsKey(str)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append((String) anonymousClass0Js.f2947B.get(str));
                stringBuilder.append("\n");
                stringBuilder2 = stringBuilder.toString();
            } else {
                stringBuilder2 = JsonProperty.USE_DEFAULT_NAME;
            }
            StringBuilder stringBuilder3 = new StringBuilder(stringBuilder2);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date(System.currentTimeMillis());
            stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(simpleDateFormat.format(date).toString());
            stringBuilder.append("]: ");
            stringBuilder.append(str2);
            stringBuilder3.append(stringBuilder.toString());
            anonymousClass0Js.f2947B.put(str, stringBuilder3.toString());
        }
    }

    public void logRawEvent(String str, String str2) {
        this.mCameraARAnalyticsLogger.B(str, str2);
    }

    public void logSessionEvent(boolean z) {
        this.mCameraARAnalyticsLogger.C(z);
    }

    public final void release() {
        this.mHybridData.resetNative();
        this.mCameraARAnalyticsLogger = null;
    }

    public static int sampleRateForMarker(int i) {
        AnonymousClass1st anonymousClass1st = sSampleRates;
        if (anonymousClass1st == null) {
            return Integer.MAX_VALUE;
        }
        return anonymousClass1st.mo3698A(i);
    }

    public final void setInfo(String str, String str2, String str3, boolean z, AnonymousClass1ss anonymousClass1ss) {
        this.mEffectStartIntentType = anonymousClass1ss;
        this.mCameraARAnalyticsLogger.D(str, str2, str3, z, null);
    }

    public final void setInfo(String str, String str2, String str3, boolean z, String str4, AnonymousClass1ss anonymousClass1ss) {
        this.mEffectStartIntentType = anonymousClass1ss;
        this.mCameraARAnalyticsLogger.D(str, str2, str3, z, str4);
    }

    public final void setSessionListener(AnonymousClass1QE anonymousClass1QE) {
        this.mCameraARAnalyticsLogger.f18334B = anonymousClass1QE;
    }
}
