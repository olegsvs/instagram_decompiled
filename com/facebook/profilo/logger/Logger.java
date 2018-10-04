package com.facebook.profilo.logger;

import X.AnonymousClass01P;
import X.AnonymousClass01Q;
import X.AnonymousClass0CF;
import X.AnonymousClass0Ex;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.writer.NativeTraceWriter;
import com.facebook.profilo.writer.NativeTraceWriterCallbacks;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

public final class Logger {
    private static AtomicReference mWorker;
    private static String sFilePrefix;
    private static volatile boolean sInitialized;
    public static AnonymousClass0Ex sLoggerCallbacks;
    private static NativeTraceWriterCallbacks sNativeTraceWriterCallbacks;
    private static int sRingBufferSize;
    private static File sTraceDirectory;
    private static volatile NativeTraceWriter sTraceWriter;

    private static native int loggerWrite(int i, int i2, int i3, long j);

    private static native int loggerWriteAndWakeupTraceWriter(NativeTraceWriter nativeTraceWriter, long j, int i, int i2, int i3, long j2);

    private static native int loggerWriteForThread(int i, int i2, int i3, int i4, long j);

    private static native int loggerWriteForThreadWithMonotonicTime(int i, int i2, int i3, int i4, long j, long j2);

    private static native int loggerWriteString(int i, int i2, String str);

    private static native int loggerWriteWithMonotonicTime(int i, int i2, int i3, long j, long j2);

    private static native void nativeInitRingBuffer(int i);

    public static void initialize(int i, File file, String str, NativeTraceWriterCallbacks nativeTraceWriterCallbacks, AnonymousClass0Ex anonymousClass0Ex) {
        AnonymousClass0CF.m856E("profilo");
        TraceEvents.sInitialized = true;
        sInitialized = true;
        sTraceDirectory = file;
        sFilePrefix = str;
        sLoggerCallbacks = anonymousClass0Ex;
        sNativeTraceWriterCallbacks = nativeTraceWriterCallbacks;
        sRingBufferSize = i;
        mWorker = new AtomicReference(null);
    }

    public static void postAbortTrace(long j) {
        postFinishTrace(46, j);
    }

    public static void postCloseTrace(long j) {
        postFinishTrace(47, j);
    }

    public static void postCreateBackwardTrace(long j) {
        if (sInitialized) {
            startWorkerThreadIfNecessary();
            loggerWriteAndWakeupTraceWriter(sTraceWriter, j, 49, 0, 0, j);
        }
    }

    public static void postCreateTrace(long j, int i, int i2) {
        if (sInitialized) {
            nativeInitRingBuffer(sRingBufferSize);
            int i3 = i;
            if ((i & 2) == 0) {
                startWorkerThreadIfNecessary();
                loggerWriteAndWakeupTraceWriter(sTraceWriter, j, 48, i2, i3, j);
            }
        }
    }

    private static void postFinishTrace(int i, long j) {
        if (sInitialized) {
            writeEntryWithCursor(-1, i, 0, 0, j, null);
        }
    }

    public static void postPreCloseTrace(long j) {
        postFinishTrace(69, j);
    }

    public static void postTimeoutTrace(long j) {
        postFinishTrace(50, j);
    }

    private static void startWorkerThreadIfNecessary() {
        if (mWorker.get() == null) {
            NativeTraceWriter nativeTraceWriter = new NativeTraceWriter(sTraceDirectory.getAbsolutePath(), sFilePrefix, sNativeTraceWriterCallbacks);
            AnonymousClass01Q anonymousClass01Q = new AnonymousClass01Q(nativeTraceWriter);
            if (mWorker.compareAndSet(null, anonymousClass01Q)) {
                sTraceWriter = nativeTraceWriter;
                anonymousClass01Q.setUncaughtExceptionHandler(new AnonymousClass01P());
                anonymousClass01Q.start();
            }
        }
    }

    public static int writeEntry(int i, int i2, int i3, int i4) {
        if (sInitialized) {
            return writeEntryWithCursor(i, i2, i3, i4, 0, null);
        }
        return -1;
    }

    public static int writeEntry(int i, int i2, int i3, int i4, long j) {
        if (sInitialized) {
            return writeEntryWithCursor(i, i2, i3, i4, j, null);
        }
        return -1;
    }

    public static int writeEntry(int i, int i2, int i3, String str) {
        if (sInitialized) {
            return writeEntryWithCursor(i, i2, 0, i3, 0, str);
        }
        return -1;
    }

    private static int writeEntryWithCursor(int i, int i2, int i3, int i4, long j, String str) {
        if (i != -1 && !TraceEvents.isEnabled(i)) {
            return -1;
        }
        if (str != null) {
            return loggerWriteString(i2, i4, str);
        }
        return loggerWrite(i2, i3, i4, j);
    }

    public static int writeEntryWithString(int i, int i2, int i3, int i4, long j, String str, String str2) {
        if (sInitialized) {
            int i5 = i;
            if (i == -1 || TraceEvents.isEnabled(i)) {
                return writeKeyValueStringWithMatch(i5, writeEntryWithCursor(i5, i2, i3, i4, j, 0), str, str2);
            }
        }
        return -1;
    }

    public static int writeEntryWithStringWithNoMatch(int i, int i2, int i3, int i4, long j, String str, String str2) {
        if (sInitialized) {
            if (i == -1 || TraceEvents.isEnabled(i)) {
                return writeKeyValueStringWithMatch(i, writeEntryWithoutMatchForThread(i, i2, i3, i4, j), str, str2);
            }
        }
        return -1;
    }

    public static int writeEntryWithStringWithNoMatch(int i, int i2, int i3, int i4, long j, String str, String str2, long j2) {
        if (sInitialized) {
            if (i == -1 || TraceEvents.isEnabled(i)) {
                return writeKeyValueStringWithMatch(i, loggerWriteForThreadWithMonotonicTime(i2, i3, i4, 0, j, j2), str, str2);
            }
        }
        return -1;
    }

    public static int writeEntryWithStringWithNoMatch(int i, int i2, int i3, long j, String str, String str2) {
        if (sInitialized) {
            int i4 = i;
            if (i == -1 || TraceEvents.isEnabled(i)) {
                return writeKeyValueStringWithMatch(i4, writeEntryWithCursor(i4, i2, i3, 0, j, 0), str, str2);
            }
        }
        return -1;
    }

    public static int writeEntryWithoutMatch(int i, int i2, int i3) {
        if (sInitialized) {
            return writeEntryWithCursor(i, i2, i3, 0, 0, null);
        }
        return -1;
    }

    public static int writeEntryWithoutMatch(int i, int i2, int i3, long j) {
        if (sInitialized) {
            return writeEntryWithCursor(i, i2, i3, 0, j, null);
        }
        return -1;
    }

    public static int writeEntryWithoutMatchForThread(int i, int i2, int i3, int i4, long j) {
        if (sInitialized) {
            if (i == -1 || TraceEvents.isEnabled(i)) {
                return loggerWriteForThread(i2, i3, i4, 0, j);
            }
        }
        return -1;
    }

    public static int writeEntryWithoutMatchForThread(int i, int i2, int i3, int i4, long j, long j2) {
        if (sInitialized) {
            if (i == -1 || TraceEvents.isEnabled(i)) {
                return loggerWriteForThreadWithMonotonicTime(i2, i3, i4, 0, j, j2);
            }
        }
        return -1;
    }

    public static int writeKeyValueStringWithMatch(int i, int i2, String str, String str2) {
        if (str != null) {
            i2 = writeEntry(i, 64, i2, str);
        }
        return writeEntry(i, 65, i2, str2);
    }

    public static int writeMetadata(int i, int i2, String str, String str2) {
        if (sInitialized) {
            if (i == -1 || TraceEvents.isEnabled(i)) {
                return writeKeyValueStringWithMatch(i, i2, str, str2);
            }
        }
        return -1;
    }
}
