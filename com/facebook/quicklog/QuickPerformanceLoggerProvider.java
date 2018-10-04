package com.facebook.quicklog;

import X.AnonymousClass1wY;

public class QuickPerformanceLoggerProvider {
    private static QuickPerformanceLogger mQuickPerformanceLogger;
    private static AnonymousClass1wY mQuickPerformanceLoggerBuilder;

    public static QuickPerformanceLogger getQPLInstance() {
        QuickPerformanceLogger quickPerformanceLogger = mQuickPerformanceLogger;
        if (quickPerformanceLogger != null) {
            return quickPerformanceLogger;
        }
        AnonymousClass1wY anonymousClass1wY = mQuickPerformanceLoggerBuilder;
        if (anonymousClass1wY == null) {
            return null;
        }
        quickPerformanceLogger = anonymousClass1wY.build();
        mQuickPerformanceLogger = quickPerformanceLogger;
        return quickPerformanceLogger;
    }
}
