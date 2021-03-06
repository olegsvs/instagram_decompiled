package com.facebook.react.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class DebugServerException extends RuntimeException {
    public DebugServerException(String str, Throwable th) {
        super(str, th);
    }

    public static DebugServerException makeGeneric(String str, String str2, Throwable th) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("\n\nTry the following to fix the issue:\n• Ensure that the packager server is running\n• Ensure that your device/emulator is connected to your machine and has USB debugging enabled - run 'adb devices' to see a list of connected devices\n• Ensure Airplane Mode is disabled\n• If you're on a physical device connected to the same machine, run 'adb reverse tcp:8081 tcp:8081' to forward requests from your device\n• If your device is on the same Wi-Fi network, set 'Debug server host & port for device' in 'Dev settings' to your machine's IP address and the port of the local dev server - e.g. 10.0.1.1:8081\n\n");
        stringBuilder.append(str2);
        return new DebugServerException(stringBuilder.toString(), th);
    }

    public static DebugServerException makeGeneric(String str, Throwable th) {
        return makeGeneric(str, JsonProperty.USE_DEFAULT_NAME, th);
    }
}
