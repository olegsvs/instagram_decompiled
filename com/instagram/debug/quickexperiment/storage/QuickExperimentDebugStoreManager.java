package com.instagram.debug.quickexperiment.storage;

import X.AnonymousClass0FZ;
import java.io.File;

public class QuickExperimentDebugStoreManager {
    private static QuickExperimentDebugStore sDeviceSpoofStore;
    private static QuickExperimentDebugStore sOverrideStore;
    private static QuickExperimentDebugStore sUserSpoofStore;

    public static synchronized QuickExperimentDebugStore getDeviceSpoofStore(File file) {
        QuickExperimentDebugStore quickExperimentDebugStore;
        synchronized (QuickExperimentDebugStoreManager.class) {
            if (sDeviceSpoofStore == null) {
                sDeviceSpoofStore = QuickExperimentDebugStore.create(new File(file, "qe_device_spoof"));
            }
            quickExperimentDebugStore = sDeviceSpoofStore;
        }
        return quickExperimentDebugStore;
    }

    public static synchronized QuickExperimentDebugStore getOverrideStore(File file) {
        QuickExperimentDebugStore quickExperimentDebugStore;
        synchronized (QuickExperimentDebugStoreManager.class) {
            if (sOverrideStore == null) {
                sOverrideStore = QuickExperimentDebugStore.create(new File(file, "qe_debugs"));
            }
            quickExperimentDebugStore = sOverrideStore;
        }
        return quickExperimentDebugStore;
    }

    public static synchronized QuickExperimentDebugStore getUserSpoofStore(File file) {
        QuickExperimentDebugStore quickExperimentDebugStore;
        synchronized (QuickExperimentDebugStoreManager.class) {
            if (sUserSpoofStore == null) {
                sUserSpoofStore = QuickExperimentDebugStore.create(new File(file, "qe_user_spoof"));
            }
            quickExperimentDebugStore = sUserSpoofStore;
        }
        return quickExperimentDebugStore;
    }

    public static boolean isTrackingExperiments() {
        return AnonymousClass0FZ.m1634B().m1645K();
    }
}
