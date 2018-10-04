package com.facebook.react.modules.storage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

public final class AsyncStorageErrorUtil {
    public static WritableMap getDBError(String str) {
        return getError(str, "Database Error");
    }

    public static WritableMap getError(String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", str2);
        if (str != null) {
            createMap.putString("key", str);
        }
        return createMap;
    }

    public static WritableMap getInvalidKeyError(String str) {
        return getError(str, "Invalid key");
    }

    public static WritableMap getInvalidValueError(String str) {
        return getError(str, "Invalid Value");
    }
}
