package com.facebook.tslog;

import X.AnonymousClass0CF;
import X.AnonymousClass5eu;
import X.AnonymousClass5ev;
import X.AnonymousClass5ew;
import java.util.ArrayList;
import java.util.List;

public class TimeSeriesStreamImpl {
    private final long nativeStream;

    private static native void nativeAdd(long j, int i, int i2);

    private static native void nativeAvg(long j, int i, int i2);

    private static native void nativeAvgMax(long j, int i, int i2, int i3);

    private static native void nativeDispose(long j);

    private static native boolean nativeFlush(long j);

    private static native long nativeInit(long j, String str, String[] strArr, String[] strArr2);

    private static native boolean nativeIsStarted(long j);

    private static native void nativeMax(long j, int i, int i2);

    private static native void nativeSet(long j, int i, int i2);

    private static native void nativeStart(long j);

    private static native void nativeStop(long j);

    static {
        AnonymousClass0CF.E("tslog-jni");
    }

    public TimeSeriesStreamImpl(TimeSeriesLog timeSeriesLog, String str, List list) {
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (AnonymousClass5eu anonymousClass5eu : list) {
            anonymousClass5eu.f67844E = this;
            int i3;
            if (anonymousClass5eu.f67841B == AnonymousClass5ev.AVG) {
                i3 = i2 + 1;
                anonymousClass5eu.f67842C = i2;
                arrayList.add(anonymousClass5eu.f67843D);
                i2 = i3;
            } else {
                i3 = i + 1;
                anonymousClass5eu.f67842C = i;
                arrayList2.add(anonymousClass5eu.f67843D);
                i = i3;
            }
        }
        this.nativeStream = nativeInit(timeSeriesLog.nativeTSLog, str, (String[]) arrayList2.toArray(new String[arrayList2.size()]), (String[]) arrayList.toArray(new String[arrayList.size()]));
        Long.valueOf(this.nativeStream);
    }

    public final void dispose() {
        nativeDispose(this.nativeStream);
    }

    public final boolean log(int i, AnonymousClass5ev anonymousClass5ev, int i2) {
        switch (AnonymousClass5ew.f67851B[anonymousClass5ev.ordinal()]) {
            case 1:
                nativeAdd(this.nativeStream, i, i2);
                return true;
            case 2:
                nativeAvg(this.nativeStream, i, i2);
                return true;
            case 3:
                nativeMax(this.nativeStream, i, i2);
                return true;
            case 4:
                nativeSet(this.nativeStream, i, i2);
                return true;
            default:
                return false;
        }
    }
}
