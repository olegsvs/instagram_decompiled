package X;

import com.facebook.analytics.appstatelogger.AppStateLogger;

/* renamed from: X.1p0 */
public final class AnonymousClass1p0 implements AnonymousClass00t {
    /* renamed from: B */
    public static final String f23070B = "AppStateLoggerExceptionHandler";
    /* renamed from: C */
    public static AnonymousClass1p0 f23071C;

    public final void GV(Thread thread, Throwable th) {
        AppStateLogger.m13347F(Integer.valueOf(4), th);
        AnonymousClass0Dc.I(f23070B, th, "Handing uncaught exception", new Object[0]);
    }
}
