package com.facebook.common.dextricks;

import android.util.Log;
import com.facebook.common.dextricks.DalvikInternals.ClassInitFailureHook;
import java.util.HashMap;

public final class ClassFailureStapler extends ClassInitFailureHook {
    private static final String TAG = "ClassFailureStapler";
    private final HashMap mSeenFailures = new HashMap();

    public static void install() {
        DalvikInternals.setClassInitFailureHook(new ClassFailureStapler());
    }

    public synchronized void onClassInitFailure(Class cls, Throwable th) {
        if (th instanceof NoClassDefFoundError) {
            Throwable th2 = (Throwable) this.mSeenFailures.get(cls);
            if (th2 != null) {
                th.initCause(th2);
            }
        } else {
            this.mSeenFailures.put(cls, th);
        }
    }

    public static void tryInstall() {
        if (!IsArt.yes) {
            try {
                install();
            } catch (Throwable th) {
                Log.w(TAG, "failed to install class failure stapler; proceeding", th);
            }
        }
    }
}
