package com.facebook.profilo.provider.systemcounters;

import X.AnonymousClass01U;
import X.AnonymousClass01V;
import X.AnonymousClass0CJ;
import android.os.Debug;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.facebook.jni.HybridData;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;

public final class SystemCounterThread extends AnonymousClass0CJ {
    public static final int PROVIDER_HIGH_FREQ_MAIN_THREAD_COUNTERS = ProvidersRegistry.m1051C("high_freq_main_thread_counters");
    public static final int PROVIDER_SYSTEM_COUNTERS = ProvidersRegistry.m1051C("system_counters");
    private boolean mAllThreadsMode;
    private boolean mEnabled;
    private final Runnable mExtraRunnable;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    private int mHighFrequencyTid;
    private HybridData mHybridData;

    private static native HybridData initHybrid();

    public native void logCounters();

    public native void logThreadCounters(int i);

    public native void logTraceAnnotations(int i);

    public SystemCounterThread() {
        this(null);
    }

    public SystemCounterThread(Runnable runnable) {
        super("profilo_systemcounters");
        this.mExtraRunnable = runnable;
    }

    public final synchronized void disable() {
        if (this.mEnabled) {
            AnonymousClass01U.m80B();
            if (this.mAllThreadsMode) {
                logCounters();
            }
            if (this.mHighFrequencyTid > 0) {
                logThreadCounters(this.mHighFrequencyTid);
                logTraceAnnotations(this.mHighFrequencyTid);
            }
        }
        this.mEnabled = false;
        this.mAllThreadsMode = false;
        this.mHighFrequencyTid = 0;
        if (this.mHybridData != null) {
            this.mHybridData.resetNative();
            this.mHybridData = null;
        }
        if (this.mHandlerThread != null) {
            this.mHandlerThread.quit();
            this.mHandlerThread = null;
        }
        this.mHandler = null;
        Debug.stopAllocCounting();
    }

    public final synchronized void enable() {
        this.mHybridData = initHybrid();
        this.mEnabled = true;
        initHandler();
        if (TraceEvents.isEnabled(PROVIDER_SYSTEM_COUNTERS)) {
            this.mAllThreadsMode = true;
            Debug.startAllocCounting();
            this.mHandler.obtainMessage(1, 50, -1).sendToTarget();
        }
        if (TraceEvents.isEnabled(PROVIDER_HIGH_FREQ_MAIN_THREAD_COUNTERS)) {
            int myPid = Process.myPid();
            this.mHighFrequencyTid = myPid;
            this.mHandler.obtainMessage(2, 7, myPid).sendToTarget();
        }
    }

    public final int getSupportedProviders() {
        return PROVIDER_SYSTEM_COUNTERS | PROVIDER_HIGH_FREQ_MAIN_THREAD_COUNTERS;
    }

    public final int getTracingProviders() {
        int i = 0;
        if (!this.mEnabled) {
            return 0;
        }
        if (this.mAllThreadsMode) {
            i = 0 | PROVIDER_SYSTEM_COUNTERS;
        }
        if (this.mHighFrequencyTid > 0) {
            return i | PROVIDER_HIGH_FREQ_MAIN_THREAD_COUNTERS;
        }
        return i;
    }

    private synchronized void initHandler() {
        if (this.mHandler == null) {
            this.mHandlerThread = new HandlerThread("Prflo:Counters");
            this.mHandlerThread.start();
            this.mHandler = new AnonymousClass01V(this, this.mHandlerThread.getLooper());
        }
    }

    public final synchronized void postThreadWork(int i, int i2, int i3) {
        if (shouldRun()) {
            switch (i) {
                case 1:
                    AnonymousClass01U.m80B();
                    logCounters();
                    if (this.mExtraRunnable != null) {
                        this.mExtraRunnable.run();
                        break;
                    }
                    break;
                case 2:
                    logThreadCounters(i3);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown message type");
            }
            this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(i, i2, i3), (long) i2);
        }
    }

    private synchronized boolean shouldRun() {
        return this.mEnabled;
    }
}
