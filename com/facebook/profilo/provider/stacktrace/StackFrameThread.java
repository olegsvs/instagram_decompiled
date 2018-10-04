package com.facebook.profilo.provider.stacktrace;

import X.AnonymousClass01T;
import X.AnonymousClass0CJ;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;

public final class StackFrameThread extends AnonymousClass0CJ {
    public static final int PROVIDER_NATIVE_STACK_TRACE = ProvidersRegistry.m1051C("native_stack_trace");
    public static final int PROVIDER_STACK_FRAME = ProvidersRegistry.m1051C("stack_trace");
    public static final int PROVIDER_WALL_TIME_STACK_TRACE = ProvidersRegistry.m1051C("wall_time_stack_trace");
    private final Context mContext;
    private volatile boolean mEnabled;
    private Thread mProfilerThread;
    private TraceContext mSavedTraceContext;
    private int mSystemClockTimeIntervalMs = -1;

    private static native int nativeSystemClockTickIntervalMs();

    public StackFrameThread(Context context) {
        super("profilo_stacktrace");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null && (context instanceof Application)) {
            this.mContext = context;
        } else {
            this.mContext = applicationContext;
        }
    }

    public final void disable() {
        if (this.mEnabled) {
            this.mSavedTraceContext = null;
            this.mEnabled = false;
            CPUProfiler.stopProfiling();
            Thread thread = this.mProfilerThread;
            if (thread != null) {
                try {
                    thread.join();
                    this.mProfilerThread = null;
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
            return;
        }
        this.mProfilerThread = null;
    }

    public final void enable() {
        TraceContext traceContext = this.f1522B;
        if (providersToTracers(traceContext.f15515G) != 0) {
            if (this.mProfilerThread != null) {
                Log.e("StackFrameThread", "Duplicate attempt to enable sampling profiler.");
            } else if (enableInternal(traceContext.f15514F, traceContext.f15515G)) {
                this.mSavedTraceContext = traceContext;
                Thread thread = new Thread(new AnonymousClass01T(this), "Prflo:Profiler");
                this.mProfilerThread = thread;
                thread.start();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean enableInternal(int r7, int r8) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.initProfiler();	 Catch:{ all -> 0x0042 }
        r2 = 0;
        if (r0 != 0) goto L_0x000a;
    L_0x0008:
        monitor-exit(r6);
        return r2;
    L_0x000a:
        if (r7 > 0) goto L_0x000e;
    L_0x000c:
        r7 = 11;
    L_0x000e:
        r0 = PROVIDER_WALL_TIME_STACK_TRACE;	 Catch:{ all -> 0x0042 }
        r0 = r0 & r8;
        r5 = -1;
        r4 = 1;
        if (r0 == 0) goto L_0x0017;
    L_0x0015:
        r1 = 1;
        goto L_0x0028;
    L_0x0017:
        r0 = r6.mSystemClockTimeIntervalMs;	 Catch:{ all -> 0x0042 }
        if (r0 != r5) goto L_0x0021;
    L_0x001b:
        r0 = nativeSystemClockTickIntervalMs();	 Catch:{ all -> 0x0042 }
        r6.mSystemClockTimeIntervalMs = r0;	 Catch:{ all -> 0x0042 }
    L_0x0021:
        r0 = r6.mSystemClockTimeIntervalMs;	 Catch:{ all -> 0x0042 }
        r7 = java.lang.Math.max(r7, r0);	 Catch:{ all -> 0x0042 }
        r1 = 0;
    L_0x0028:
        r0 = providersToTracers(r8);	 Catch:{ all -> 0x0042 }
        r0 = com.facebook.profilo.provider.stacktrace.CPUProfiler.startProfiling(r0, r7, r1);	 Catch:{ all -> 0x0042 }
        if (r0 != 0) goto L_0x0033;
    L_0x0032:
        goto L_0x0008;
    L_0x0033:
        r3 = 60;
        r2 = 8126495; // 0x7c001f float:1.1387645E-38 double:4.015022E-317;
        r0 = (long) r7;	 Catch:{ all -> 0x0042 }
        com.facebook.profilo.logger.Logger.writeEntryWithoutMatch(r5, r3, r2, r0);	 Catch:{ all -> 0x0042 }
        r6.mEnabled = r4;	 Catch:{ all -> 0x0042 }
        r0 = r6.mEnabled;	 Catch:{ all -> 0x0042 }
        monitor-exit(r6);
        return r0;
    L_0x0042:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.StackFrameThread.enableInternal(int, int):boolean");
    }

    public final int getSupportedProviders() {
        return (PROVIDER_NATIVE_STACK_TRACE | PROVIDER_STACK_FRAME) | PROVIDER_WALL_TIME_STACK_TRACE;
    }

    public final int getTracingProviders() {
        TraceContext traceContext = this.mSavedTraceContext;
        boolean z = this.mEnabled;
        int i = 0;
        if (z) {
            if (traceContext != null) {
                int i2 = traceContext.f15515G;
                int i3 = PROVIDER_WALL_TIME_STACK_TRACE;
                if ((i2 & i3) == 0) {
                    i3 = PROVIDER_STACK_FRAME;
                    if ((i2 & i3) != 0) {
                    }
                    return (i2 & PROVIDER_NATIVE_STACK_TRACE) | i;
                }
                i = 0 | i3;
                return (i2 & PROVIDER_NATIVE_STACK_TRACE) | i;
            }
        }
        return 0;
    }

    private synchronized boolean initProfiler() {
        try {
        } catch (Throwable e) {
            Log.e("StackFrameThread", e.getMessage(), e);
            return false;
        }
        return CPUProfiler.init(this.mContext);
    }

    private static int providersToTracers(int i) {
        int i2 = ((PROVIDER_STACK_FRAME | PROVIDER_WALL_TIME_STACK_TRACE) & i) != 0 ? 497 : 0;
        return (i & PROVIDER_NATIVE_STACK_TRACE) != 0 ? i2 | 4 : i2;
    }
}
