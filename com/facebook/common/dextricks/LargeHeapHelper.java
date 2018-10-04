package com.facebook.common.dextricks;

import android.app.ActivityManager;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.util.Log;

public final class LargeHeapHelper {
    private static final String TAG = "LargeHeapHelper";

    public static void maybeEnableLargeHeap(Application application) {
        Object obj = VERSION.SDK_INT >= 21 ? 1 : null;
        if (obj == null) {
            SharedPreferences sharedPreferences = application.getBaseContext().getSharedPreferences(LargeHeapOverrideFlags.LARGE_HEAP_OVERRIDE_FLAG_STORE, 0);
            if (sharedPreferences.getBoolean(LargeHeapOverrideFlags.LARGE_HEAP_OVERRIDE_ENABLED, false) && ((ActivityManager) application.getSystemService("activity")).getMemoryClass() <= sharedPreferences.getInt(LargeHeapOverrideFlags.LARGE_HEAP_OVERRIDE_MAX_MEMORY_CLASS, 0)) {
                obj = 1;
            }
        }
        if (obj != null) {
            try {
                MemoryEnlargementHack.growMyHeap(application);
            } catch (Throwable th) {
                Log.e(TAG, "Unable to set large heap mode", th);
            }
        }
    }
}
