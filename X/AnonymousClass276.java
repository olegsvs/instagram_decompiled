package X;

import android.content.SharedPreferences;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: X.276 */
public final class AnonymousClass276 implements UncaughtExceptionHandler {
    /* renamed from: E */
    public static final Class f26092E = AnonymousClass276.class;
    /* renamed from: F */
    public static AnonymousClass276 f26093F;
    /* renamed from: B */
    private final long f26094B = AnonymousClass0Gd.E();
    /* renamed from: C */
    private final AnonymousClass278 f26095C;
    /* renamed from: D */
    private UncaughtExceptionHandler f26096D = Thread.getDefaultUncaughtExceptionHandler();

    public AnonymousClass276(SharedPreferences sharedPreferences, AnonymousClass0Gd anonymousClass0Gd) {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        AnonymousClass0Gd anonymousClass0Gd2 = anonymousClass0Gd;
        this.f26095C = new AnonymousClass278(sharedPreferences2, anonymousClass0Gd2, new AnonymousClass27A(), AnonymousClass0CA.C(AnonymousClass0CC.aP), AnonymousClass0CA.C(AnonymousClass0CC.bP));
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        AnonymousClass278 anonymousClass278 = this.f26095C;
        long E = AnonymousClass0Gd.E() - this.f26094B;
        if (E <= anonymousClass278.f26099C) {
            anonymousClass278.f26098B.removeCallbacksAndMessages(null);
            String str = "instacrash_crash_count";
            int i = anonymousClass278.f26102F.getInt(str, 0) + 1;
            if (i >= anonymousClass278.f26101E) {
                new AnonymousClass279(anonymousClass278.f26100D, E, i).start();
                anonymousClass278.m14488A();
            } else {
                anonymousClass278.f26102F.edit().putInt(str, i).apply();
            }
        }
        this.f26096D.uncaughtException(thread, th);
    }
}
