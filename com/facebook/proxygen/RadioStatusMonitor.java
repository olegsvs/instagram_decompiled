package com.facebook.proxygen;

import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class RadioStatusMonitor extends NativeHandleImpl {
    private static RadioStatusMonitor mMonitor;
    private final Executor mExecutor;

    private native void close();

    private native void init(Executor executor);

    public native HashMap getAccumulativeRadioCounterData();

    public native HashMap getRadioData();

    private RadioStatusMonitor(Executor executor) {
        this.mExecutor = executor;
        init(executor);
    }

    public static synchronized RadioStatusMonitor createOrGetMonitorInstance(Boolean bool, Executor executor) {
        synchronized (RadioStatusMonitor.class) {
            if (bool.booleanValue()) {
                if (mMonitor == null) {
                    if (executor == null) {
                        executor = Executors.newFixedThreadPool(1);
                    }
                    mMonitor = new RadioStatusMonitor(executor);
                }
                RadioStatusMonitor radioStatusMonitor = mMonitor;
                return radioStatusMonitor;
            }
            return null;
        }
    }

    public void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public static synchronized RadioStatusMonitor getMonitorInstance() {
        RadioStatusMonitor radioStatusMonitor;
        synchronized (RadioStatusMonitor.class) {
            radioStatusMonitor = mMonitor;
        }
        return radioStatusMonitor;
    }
}
