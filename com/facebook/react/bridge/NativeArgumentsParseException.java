package com.facebook.react.bridge;

public final class NativeArgumentsParseException extends JSApplicationCausedNativeException {
    public NativeArgumentsParseException(String str) {
        super(str);
    }

    public NativeArgumentsParseException(String str, Throwable th) {
        super(str, th);
    }
}
