package com.facebook.video.common.livestreaming;

import X.AnonymousClass2Pd;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public class LiveStreamingError {
    public final String descripton;
    public final String domain;
    public final int errorCode;
    public final String fullDescription;
    public final LiveStreamingError innerError;
    public final boolean isConnectionLost;
    public final boolean isStreamTerminated;
    public final boolean isTransient;
    public final String reason;
    public final Throwable throwable;

    public LiveStreamingError(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.errorCode = i;
        this.domain = str;
        this.reason = str2;
        this.descripton = str3;
        this.fullDescription = str4;
        this.isTransient = z;
        this.isConnectionLost = z2;
        this.isStreamTerminated = z3;
        this.throwable = null;
        this.innerError = null;
    }

    public LiveStreamingError(String str, Throwable th) {
        this(th, str, false, getStackTraceString(th), getErrorCodeFromThrowable(th));
    }

    public LiveStreamingError(Throwable th, String str, boolean z, String str2, int i) {
        this.throwable = th;
        this.errorCode = i;
        this.domain = str;
        String message = th.getMessage();
        if (message == null) {
            message = JsonProperty.USE_DEFAULT_NAME;
        }
        this.descripton = message;
        this.reason = message;
        this.fullDescription = str2;
        this.isTransient = false;
        this.isConnectionLost = false;
        this.isStreamTerminated = false;
        Throwable cause = th.getCause();
        LiveStreamingError liveStreamingError = null;
        if (cause != null) {
            if (!z) {
                liveStreamingError = new LiveStreamingError(cause, true);
            }
        }
        this.innerError = liveStreamingError;
    }

    private LiveStreamingError(Throwable th, boolean z) {
        this(th, th.getClass().getCanonicalName(), z, getStackTraceString(th), getErrorCodeFromThrowable(th));
    }

    public static int getErrorCodeFromThrowable(Throwable th) {
        if (th instanceof AnonymousClass2Pd) {
            return ((AnonymousClass2Pd) th).f30209B;
        }
        return -1;
    }

    private static String getStackTraceString(Throwable th) {
        if (th == null) {
            return JsonProperty.USE_DEFAULT_NAME;
        }
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public final boolean isConnectivityLost() {
        return this.isConnectionLost;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error:");
        stringBuilder.append(this.errorCode);
        stringBuilder.append(", Domain:");
        stringBuilder.append(this.domain);
        stringBuilder.append(", Reason:");
        stringBuilder.append(this.reason);
        stringBuilder.append(", Description:");
        stringBuilder.append(this.descripton);
        stringBuilder.append(", Full Description:");
        stringBuilder.append(this.fullDescription);
        stringBuilder.append(", isTransient:");
        stringBuilder.append(this.isTransient);
        stringBuilder.append(", isConnectionLost:");
        stringBuilder.append(this.isConnectionLost);
        stringBuilder.append(", isStreamTerminated:");
        stringBuilder.append(this.isStreamTerminated);
        if (this.innerError != null) {
            stringBuilder.append(", Inner Error: [");
            stringBuilder.append(this.innerError.toString());
            stringBuilder.append("]");
        }
        return stringBuilder.toString();
    }
}
