package org.webrtc;

import com.facebook.common.dextricks.DexStore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.EnumSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {
    private static final Logger fallbackLogger = createFallbackLogger();
    private static Loggable loggable;
    private static Severity loggableSeverity;
    private static volatile boolean loggingEnabled;

    /* renamed from: org.webrtc.Logging$1 */
    public /* synthetic */ class C02221 {
        public static final /* synthetic */ int[] $SwitchMap$org$webrtc$Logging$Severity = new int[Severity.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = org.webrtc.Logging.Severity.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$org$webrtc$Logging$Severity = r0;
            r2 = $SwitchMap$org$webrtc$Logging$Severity;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = org.webrtc.Logging.Severity.LS_ERROR;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r2 = $SwitchMap$org$webrtc$Logging$Severity;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = org.webrtc.Logging.Severity.LS_WARNING;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = $SwitchMap$org$webrtc$Logging$Severity;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0 = org.webrtc.Logging.Severity.LS_INFO;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r0 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.Logging.1.<clinit>():void");
        }
    }

    public enum Severity {
        LS_SENSITIVE,
        LS_VERBOSE,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE
    }

    public enum TraceLevel {
        TRACE_NONE(0),
        TRACE_STATEINFO(1),
        TRACE_WARNING(2),
        TRACE_ERROR(4),
        TRACE_CRITICAL(8),
        TRACE_APICALL(16),
        TRACE_DEFAULT(255),
        TRACE_MODULECALL(32),
        TRACE_MEMORY(256),
        TRACE_TIMER(DexStore.LOAD_RESULT_DEX2OAT_QUICKENED),
        TRACE_STREAM(DexStore.LOAD_RESULT_MIXED_MODE),
        TRACE_DEBUG(DexStore.LOAD_RESULT_OATMEAL_QUICKEN_ATTEMPTED),
        TRACE_INFO(DexStore.LOAD_RESULT_DEX2OAT_QUICKEN_ATTEMPTED),
        TRACE_TERSEINFO(DexStore.LOAD_RESULT_MIXED_MODE_ATTEMPTED),
        TRACE_ALL(65535);
        
        public final int level;

        private TraceLevel(int i) {
            this.level = i;
        }
    }

    public static void enableTracing(String str, EnumSet enumSet) {
    }

    private static native void nativeEnableLogThreads();

    private static native void nativeEnableLogTimeStamps();

    private static native void nativeEnableLogToDebugOutput(int i);

    private static native void nativeLog(int i, String str, String str2);

    private static Logger createFallbackLogger() {
        Logger logger = Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(Level.ALL);
        return logger;
    }

    /* renamed from: d */
    public static void m29383d(String str, String str2) {
    }

    public static void deleteInjectedLoggable() {
        loggable = null;
    }

    /* renamed from: e */
    public static void m29384e(String str, String str2) {
    }

    /* renamed from: e */
    public static void m29385e(String str, String str2, Throwable th) {
        th.toString();
        getStackTraceString(th);
    }

    public static void enableLogThreads() {
        nativeEnableLogThreads();
    }

    public static void enableLogTimeStamps() {
        nativeEnableLogTimeStamps();
    }

    public static synchronized void enableLogToDebugOutput(Severity severity) {
        synchronized (Logging.class) {
            if (loggable == null) {
                nativeEnableLogToDebugOutput(severity.ordinal());
                loggingEnabled = true;
            } else {
                throw new IllegalStateException("Logging to native debug output not supported while Loggable is injected. Delete the Loggable before calling this method.");
            }
        }
    }

    private static String getStackTraceString(Throwable th) {
        if (th == null) {
            return JsonProperty.USE_DEFAULT_NAME;
        }
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void injectLoggable(Loggable loggable, Severity severity) {
        if (loggable != null) {
            loggable = loggable;
            loggableSeverity = severity;
        }
    }

    public static void log(Severity severity, String str, String str2) {
        if (loggable != null) {
            if (severity.ordinal() >= loggableSeverity.ordinal()) {
                loggable.onLogMessage(str2, severity, str);
            }
        } else if (loggingEnabled) {
            nativeLog(severity.ordinal(), str, str2);
        } else {
            switch (severity.ordinal()) {
                case 2:
                    severity = Level.INFO;
                    break;
                case 3:
                    severity = Level.WARNING;
                    break;
                case 4:
                    severity = Level.SEVERE;
                    break;
                default:
                    severity = Level.FINE;
                    break;
            }
            Logger logger = fallbackLogger;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(": ");
            stringBuilder.append(str2);
            logger.log(severity, stringBuilder.toString());
        }
    }

    /* renamed from: v */
    public static void m29386v(String str, String str2) {
    }

    /* renamed from: w */
    public static void m29387w(String str, String str2) {
    }

    /* renamed from: w */
    public static void m29388w(String str, String str2, Throwable th) {
        th.toString();
        getStackTraceString(th);
    }
}
