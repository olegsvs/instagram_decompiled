package com.facebook.common.time;

import X.AnonymousClass0C9;
import android.os.SystemClock;

public class RealtimeSinceBootClock implements AnonymousClass0C9 {
    /* renamed from: B */
    private static final RealtimeSinceBootClock f16230B = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    public static RealtimeSinceBootClock get() {
        return f16230B;
    }

    public final long now() {
        return SystemClock.elapsedRealtime();
    }
}
