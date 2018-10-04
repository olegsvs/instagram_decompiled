package com.facebook.common.dextricks;

import android.os.Build.VERSION;
import android.util.Log;

public class DalvikReplaceBuffer {
    private static final String LOG_TAG = "DalvikReplaceBuffer";
    private static String failureReason = "";
    private static Result resultValue = Result.NOT_ATTEMPTED;

    public enum Result {
        NOT_ATTEMPTED,
        FAILURE,
        SUCCESS
    }

    public static String getFailureString() {
        if (getResult() == Result.FAILURE) {
            return failureReason;
        }
        throw new IllegalStateException("No failure string is provided when the operation did not fail.");
    }

    public static Result getResult() {
        return resultValue;
    }

    public static void replaceBuffer(DalvikLinearAllocType dalvikLinearAllocType) {
        if (resultValue != Result.NOT_ATTEMPTED) {
            Log.e(LOG_TAG, "Multiple attempts to replace the buffer detected!");
            return;
        }
        try {
            DalvikInternals.fixLinearAllocBuffer(dalvikLinearAllocType.bufferSizeBytes);
            resultValue = Result.SUCCESS;
        } catch (Throwable th) {
            resultValue = Result.FAILURE;
            failureReason = th.getMessage();
            String str = LOG_TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to replace LinearAlloc buffer (at size ");
            stringBuilder.append(dalvikLinearAllocType.bufferSizeBytes);
            stringBuilder.append("). ");
            stringBuilder.append("Continuing with standard buffer.");
            Log.e(str, stringBuilder.toString(), th);
        }
    }

    public static boolean replaceBufferIfNecessary(DalvikLinearAllocType dalvikLinearAllocType) {
        if (VERSION.SDK_INT >= 21) {
            return false;
        }
        replaceBuffer(dalvikLinearAllocType);
        return true;
    }
}
