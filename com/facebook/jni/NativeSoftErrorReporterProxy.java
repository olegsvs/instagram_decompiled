package com.facebook.jni;

import X.AnonymousClass01F;
import X.AnonymousClass0GG;
import X.AnonymousClass0K7;
import X.AnonymousClass1Bk;
import X.AnonymousClass1sw;
import X.AnonymousClass1sx;
import X.AnonymousClass1sy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;

public final class NativeSoftErrorReporterProxy {
    private static ExecutorService sErrorReportingExecutorService;
    private static AnonymousClass1sw sErrorReportingGkReader;
    private static WeakReference sFbErrorReporterWeakReference;
    private static final LinkedList sSoftErrorCache = new LinkedList();

    public static native void generateNativeSoftError();

    private static String getSeverityTag(int i) {
        switch (i) {
            case 1:
                return "<level:warning> ";
            case 2:
                return "<level:mustfix> ";
            case 3:
                return "<level:assert> ";
            default:
                return "<level:unknown> ";
        }
    }

    private NativeSoftErrorReporterProxy() {
    }

    private static synchronized void flushSoftErrorCacheAsync() {
        synchronized (NativeSoftErrorReporterProxy.class) {
            if (sFbErrorReporterWeakReference != null) {
                AnonymousClass1Bk anonymousClass1Bk = (AnonymousClass1Bk) sFbErrorReporterWeakReference.get();
                if (!(anonymousClass1Bk == null || sErrorReportingGkReader == null || sSoftErrorCache.isEmpty())) {
                    List arrayList = new ArrayList();
                    Object obj = sSoftErrorCache;
                    synchronized (obj) {
                        arrayList.addAll(obj);
                        obj.clear();
                    }
                    AnonymousClass0GG.m1763B(sErrorReportingExecutorService, new AnonymousClass01F(arrayList, anonymousClass1Bk), 576338814);
                }
            }
        }
    }

    private static String getNativeCategoryString(int i, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[Native] ");
        stringBuilder.append(getSeverityTag(i));
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    private static synchronized void insertSoftErrorIntoCache(String str, String str2, Throwable th, int i) {
        synchronized (NativeSoftErrorReporterProxy.class) {
            LinkedList linkedList = sSoftErrorCache;
            synchronized (linkedList) {
                AnonymousClass1sy anonymousClass1sy = new AnonymousClass1sy();
                anonymousClass1sy.f23753B = str;
                anonymousClass1sy.f23756E = str2;
                anonymousClass1sy.f23754C = th;
                anonymousClass1sy.f23758G = i;
                linkedList.addLast(new AnonymousClass1sx(anonymousClass1sy));
                while (linkedList.size() >= 50) {
                    linkedList.removeFirst();
                }
            }
        }
    }

    public static AnonymousClass0K7 shouldReportNativeSoftErrors() {
        AnonymousClass1sw anonymousClass1sw = sErrorReportingGkReader;
        if (anonymousClass1sw == null) {
            return AnonymousClass0K7.UNSET;
        }
        return anonymousClass1sw.shouldReportNativeSoftErrors();
    }

    public static void softReport(int i, String str, String str2, int i2) {
        softReport(i, str, str2, null, i2);
    }

    public static void softReport(int i, String str, String str2, Throwable th, int i2) {
        insertSoftErrorIntoCache(getNativeCategoryString(i, str), str2, th, i2);
        flushSoftErrorCacheAsync();
    }
}
