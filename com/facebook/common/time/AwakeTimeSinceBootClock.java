package com.facebook.common.time;

import X.AnonymousClass0C9;
import android.os.SystemClock;

public class AwakeTimeSinceBootClock implements AnonymousClass0C9 {
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    public long now() {
        return SystemClock.uptimeMillis();
    }
}
