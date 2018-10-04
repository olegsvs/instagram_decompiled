package com.facebook.common.classmarkers;

import android.util.Log;

public final class ClassMarkerLoader {
    private static final String TAG = "ClassMarkerLoader";

    private ClassMarkerLoader() {
    }

    private static void loadClass(String str) {
        try {
            Class.forName(str);
            String.format("Class %s was loaded", new Object[]{str});
        } catch (Throwable e) {
            Log.e(TAG, String.format("Class %s not found", new Object[]{str}), e);
        }
    }

    public static void loadColdStartTTIRunMarker() {
        loadClass("com.facebook.common.classmarkers.IsColdStartTTIRun");
    }

    public static void loadIsBackgroundRestartFinishMarker() {
        loadClass("com.facebook.common.classmarkers.IsBackgroundRestartFinish");
    }

    public static void loadIsColdStartRunMarker() {
        loadClass("com.facebook.common.classmarkers.IsColdStartRun");
    }

    public static void loadIsMessengerStartToInboxFinishMarker() {
        loadClass("com.facebook.common.classmarkers.IsMessengerStartToInboxFinish");
    }

    public static void loadIsMessengerStartupBeginMarker() {
        loadClass("com.facebook.common.classmarkers.IsMessengerStartupBegin");
    }

    public static void loadIsNotColdStartRunMarker() {
        loadClass("com.facebook.common.classmarkers.IsNotColdStartRun");
    }

    public static void loadMessengerStartToThreadFinishMarker() {
        loadClass("com.facebook.common.classmarkers.IsMessengerStartToThreadFinish");
    }

    public static void loadMessengerWarmStartupBeginMarker() {
        loadClass("com.facebook.common.classmarkers.IsMessengerWarmStartBegin");
    }

    public static void loadStoriesColdStartTTIRunMarker() {
        loadClass("com.facebook.common.classmarkers.IsStoriesColdStartTTIRun");
    }
}
