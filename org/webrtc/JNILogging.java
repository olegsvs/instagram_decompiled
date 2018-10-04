package org.webrtc;

import org.webrtc.Logging.Severity;

public class JNILogging {
    private final Loggable loggable;

    public JNILogging(Loggable loggable) {
        this.loggable = loggable;
    }

    public void logToInjectable(String str, Integer num, String str2) {
        this.loggable.onLogMessage(str, Severity.values()[num.intValue()], str2);
    }
}
