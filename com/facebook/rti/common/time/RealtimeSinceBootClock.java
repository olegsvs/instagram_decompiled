package com.facebook.rti.common.time;

import android.os.SystemClock;

public class RealtimeSinceBootClock {
    private static final RealtimeSinceBootClock INSTANCE = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    public static RealtimeSinceBootClock get() {
        return INSTANCE;
    }

    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
