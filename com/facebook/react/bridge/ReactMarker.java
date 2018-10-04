package com.facebook.react.bridge;

import java.util.ArrayList;
import java.util.List;

public class ReactMarker {
    private static final List sListeners = new ArrayList();

    public interface MarkerListener {
        void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i);
    }

    public static void addListener(MarkerListener markerListener) {
        List list = sListeners;
        synchronized (list) {
            if (!list.contains(markerListener)) {
                list.add(markerListener);
            }
        }
    }

    public static void clearMarkerListeners() {
        List list = sListeners;
        synchronized (list) {
            list.clear();
        }
    }

    public static void logMarker(ReactMarkerConstants reactMarkerConstants) {
        logMarker(reactMarkerConstants, null, 0);
    }

    public static void logMarker(ReactMarkerConstants reactMarkerConstants, int i) {
        logMarker(reactMarkerConstants, null, i);
    }

    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str) {
        logMarker(reactMarkerConstants, str, 0);
    }

    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i) {
        List<MarkerListener> list = sListeners;
        synchronized (list) {
            for (MarkerListener logMarker : list) {
                logMarker.logMarker(reactMarkerConstants, str, i);
            }
        }
    }

    public static void logMarker(String str) {
        logMarker(str, null);
    }

    public static void logMarker(String str, int i) {
        logMarker(str, null, i);
    }

    public static void logMarker(String str, String str2) {
        logMarker(str, str2, 0);
    }

    public static void logMarker(String str, String str2, int i) {
        logMarker(ReactMarkerConstants.valueOf(str), str2, i);
    }

    public static void removeListener(MarkerListener markerListener) {
        List list = sListeners;
        synchronized (list) {
            list.remove(markerListener);
        }
    }
}
