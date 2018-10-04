package com.facebook.react.bridge.queue;

import com.facebook.jni.Countable;

public class NativeRunnableDeprecated extends Countable implements Runnable {
    public native void run();

    private NativeRunnableDeprecated() {
    }
}
