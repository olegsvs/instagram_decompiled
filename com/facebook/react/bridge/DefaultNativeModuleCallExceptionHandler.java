package com.facebook.react.bridge;

public final class DefaultNativeModuleCallExceptionHandler implements NativeModuleCallExceptionHandler {
    public final void handleException(Exception exception) {
        if (exception instanceof RuntimeException) {
            throw ((RuntimeException) exception);
        }
        throw new RuntimeException(exception);
    }
}
