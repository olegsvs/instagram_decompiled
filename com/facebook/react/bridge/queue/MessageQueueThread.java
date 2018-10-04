package com.facebook.react.bridge.queue;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public interface MessageQueueThread {
    void assertIsOnThread();

    void assertIsOnThread(String str);

    Future callOnQueue(Callable callable);

    boolean isOnThread();

    void quitSynchronous();

    void runOnQueue(Runnable runnable);
}
