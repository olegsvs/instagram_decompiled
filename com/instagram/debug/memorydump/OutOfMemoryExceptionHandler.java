package com.instagram.debug.memorydump;

import X.AnonymousClass0Dc;
import java.lang.Thread.UncaughtExceptionHandler;

public class OutOfMemoryExceptionHandler implements UncaughtExceptionHandler {
    private static final Class TAG = OutOfMemoryExceptionHandler.class;
    private static OutOfMemoryExceptionHandler sHandler;
    private MemoryDumpCreator mMemoryDumpCreator;
    private UncaughtExceptionHandler mPreviousHandler = Thread.getDefaultUncaughtExceptionHandler();

    public OutOfMemoryExceptionHandler(MemoryDumpCreator memoryDumpCreator) {
        this.mMemoryDumpCreator = memoryDumpCreator;
    }

    public static void init(MemoryDumpCreator memoryDumpCreator) {
        if (sHandler == null) {
            sHandler = new OutOfMemoryExceptionHandler(memoryDumpCreator);
            Thread.setDefaultUncaughtExceptionHandler(sHandler);
            return;
        }
        AnonymousClass0Dc.m1249L(TAG, "Trying to initialize MemoryDumpHandler twice");
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (th instanceof OutOfMemoryError) {
            this.mMemoryDumpCreator.createCrashMemoryDump();
        }
        this.mPreviousHandler.uncaughtException(thread, th);
    }
}
