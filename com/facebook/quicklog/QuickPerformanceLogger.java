package com.facebook.quicklog;

import java.util.Map;

public interface QuickPerformanceLogger {
    long currentMonotonicTimestamp();

    void markerAnnotate(int i, int i2, String str, int i3);

    void markerAnnotate(int i, int i2, String str, String str2);

    void markerCancel(int i, int i2);

    void markerEnd(int i, int i2, short s);

    void markerEnd(int i, int i2, short s, long j);

    void markerEnd(int i, short s);

    void markerGenerate(int i, short s, int i2);

    void markerGenerateWithAnnotations(int i, short s, int i2, Map map);

    void markerNote(int i, int i2, short s, long j);

    void markerStart(int i, int i2);

    void markerStart(int i, int i2, long j);

    void markerStart(int i, boolean z);

    int sampleRateForMarker(int i);

    void updateListenerMarkers();
}
