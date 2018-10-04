package com.facebook.analytics2.logger;

import android.content.Context;
import android.os.HandlerThread;

public class DefaultHandlerThreadFactory implements HandlerThreadFactory {
    public DefaultHandlerThreadFactory(Context context) {
    }

    public final HandlerThread ZF(String str, int i) {
        HandlerThread handlerThread = new HandlerThread(str, i);
        handlerThread.start();
        return handlerThread;
    }
}
