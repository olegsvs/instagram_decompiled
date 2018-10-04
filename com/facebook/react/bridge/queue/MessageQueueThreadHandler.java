package com.facebook.react.bridge.queue;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class MessageQueueThreadHandler extends Handler {
    private final QueueThreadExceptionHandler mExceptionHandler;

    public MessageQueueThreadHandler(Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        super(looper);
        this.mExceptionHandler = queueThreadExceptionHandler;
    }

    public final void dispatchMessage(Message message) {
        try {
            super.dispatchMessage(message);
        } catch (Message message2) {
            this.mExceptionHandler.handleException(message2);
        }
    }
}
