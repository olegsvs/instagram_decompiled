package com.facebook.common.dextricks.coverage.logger;

import X.AnonymousClass0D5;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ClassCoverageLogger {
    /* renamed from: B */
    public static volatile boolean f100B = "true".equals(AnonymousClass0D5.m1098C("fb.enable_class_coverage"));
    /* renamed from: C */
    public static final Queue f101C = new ConcurrentLinkedQueue();

    static {
        boolean z = f100B;
    }
}
