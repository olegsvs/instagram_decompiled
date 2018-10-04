package com.facebook.profilo.logger.api;

import X.AnonymousClass0CI;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.ClassLoadLogger;
import com.facebook.profilo.logger.Logger;

public final class ProfiloLogger {
    public static volatile boolean sHasProfilo;

    public static int newCallID() {
        return 0;
    }

    public static int classLoadEnd(Class cls) {
        return (sHasProfilo && TraceEvents.isEnabled(AnonymousClass0CI.f1514D)) ? ClassLoadLogger.m76B(AnonymousClass0CI.f1514D, cls, 0) : -1;
    }

    public static int classLoadFailed() {
        return (sHasProfilo && TraceEvents.isEnabled(AnonymousClass0CI.f1514D)) ? ClassLoadLogger.m77C(AnonymousClass0CI.f1514D, 0) : -1;
    }

    public static int classLoadStart() {
        return (sHasProfilo && TraceEvents.isEnabled(AnonymousClass0CI.f1514D)) ? ClassLoadLogger.m78D(AnonymousClass0CI.f1514D, 0) : -1;
    }

    public static int writeLigerMetadata(int i, String str, String str2) {
        return sHasProfilo ? Logger.writeMetadata(AnonymousClass0CI.f1517G, i, str, str2) : -1;
    }

    public static int writeLigerRequestAdded(int i, long j) {
        return sHasProfilo ? Logger.writeEntry(AnonymousClass0CI.f1517G, 5, 0, 0, j) : -1;
    }

    public static int writeLigerRequestFriendlyName(int i, long j, String str) {
        if (!sHasProfilo) {
            return -1;
        }
        return Logger.writeEntryWithString(AnonymousClass0CI.f1517G, 5, 0, i, j, "network_request_name", str);
    }

    public static int writeLigerRequestStart(int i, long j) {
        return sHasProfilo ? Logger.writeEntry(AnonymousClass0CI.f1517G, 10, 0, 0, j) : -1;
    }

    public static int writeLigerResponseEOM(int i, long j) {
        return sHasProfilo ? Logger.writeEntry(AnonymousClass0CI.f1517G, 7, 0, 0, j) : -1;
    }

    public static int writeLigerResponseError(int i, long j) {
        return sHasProfilo ? Logger.writeEntry(AnonymousClass0CI.f1517G, 6, 0, 0, j) : -1;
    }

    public static int writeLigerResponseStart(int i, long j) {
        return sHasProfilo ? Logger.writeEntry(AnonymousClass0CI.f1517G, 8, 0, 0, j) : -1;
    }
}
