package com.facebook.common.dextricks;

import X.AnonymousClass0CF;
import android.app.ActivityThread;
import android.os.Build.VERSION;

public class DalvikInternals {
    public static final int ART_HACK_ART_EXECUTE_GOTO_IMPL = 32;
    public static final int ART_HACK_DISABLE_FORK = 2;
    public static final int ART_HACK_DISABLE_VERIFIER = 4;
    public static final int FADV_DONTNEED = 4;
    public static final int FADV_NOREUSE = 5;
    public static final int FADV_NORMAL = 0;
    public static final int FADV_RANDOM = 1;
    public static final int FADV_SEQUENTIAL = 2;
    public static final int FADV_WILLNEED = 3;
    public static final int GFLAG_NON_PERF_CRITICAL = 1;
    public static final int IOPRIO_BACKGROUND = 24576;
    public static final int IOPRIO_CLASS_BE = 2;
    public static final int IOPRIO_CLASS_IDLE = 3;
    public static final int IOPRIO_CLASS_NONE = 0;
    public static final int IOPRIO_CLASS_RT = 1;
    public static final byte IOPRIO_CLASS_SHIFT = (byte) 13;
    public static final int IOPRIO_WHO_PGRP = 2;
    public static final int IOPRIO_WHO_PROCESS = 1;
    public static final int IOPRIO_WHO_USER = 3;
    public static final int LINK_ATOMIC_OVERWRITE = 2;
    public static final int LINK_SYMLINK = 1;

    public abstract class ClassInitFailureHook {
        public abstract void onClassInitFailure(Class cls, Throwable th);
    }

    public class CrashLogParameters {
        private final int mInstacrashIntervalMs;

        public CrashLogParameters(int i) {
            this.mInstacrashIntervalMs = i;
        }

        public int getInstacrashInterval() {
            return this.mInstacrashIntervalMs;
        }
    }

    public class Stat {
        public long device;
        public long inode;
        public int ownerUid;
    }

    public static native synchronized void allocateNativeMemory(int i);

    public static native boolean attemptAllocate(int i, long j, int i2);

    public static native void closeUnixFd(int i);

    public static native void deleteRecursive(String str);

    public static native boolean detectSamsungOatFormat();

    public static native void dexOptCreateEmptyHeader(int i);

    public static native synchronized void ensureNativeMemoryHooksInitialized();

    public static native void fadvise(int i, long j, long j2, int i2);

    public static native void fdatasync(int i, int i2);

    public static native void fixArtMirandaBug();

    public static native synchronized void fixDvmForCrossDexHack();

    public static native synchronized void fixLinearAllocBuffer(int i);

    public static native synchronized void freeAllPreviouslyAllocatedNativeMemory();

    public static native void fsync(int i, int i2);

    public static native void fsyncNamed(String str, int i);

    public static native String getArtImageLocation();

    public static native int getEnabledThreadArtHacks();

    public static native String getOatFormatVersion();

    public static native long getOpenFileInode(int i);

    public static native int getOpenFileLinkCount(int i);

    public static native int getOwnerUid(String str);

    public static native synchronized void ignoreSIGPIPE();

    public static native synchronized int installArtHacks(int i, int i2);

    public static native synchronized void integrateWithCrashLog(String str, String str2, CrashLogParameters crashLogParameters);

    public static native synchronized void integrateWithLibSigChain(int i);

    public static native int ioprio_get(int i, int i2);

    public static native void ioprio_set(int i, int i2, int i3);

    public static native void link(String str, String str2, int i);

    public static native synchronized void mmapFile(String str, int i);

    public static native void noop();

    public static native void nopDvmVerifyClass();

    public static native void onColdStartEnd();

    public static native int openUnixSyncReadWriteFd(String str);

    public static native synchronized void printTopDalvikAllocationCounts();

    public static native byte[] readOdexDepBlock(String str);

    public static native String realpath(String str);

    public static native void replaceOdexDepBlock(int i, byte[] bArr);

    public static native synchronized void resetGlobalFlags(int i);

    public static native synchronized void setClassInitFailureHook(ClassInitFailureHook classInitFailureHook);

    public static native int setEnabledThreadArtHacks(int i);

    public static native synchronized void setGlobalFlags(int i);

    public static native synchronized void setIsArt(boolean z);

    public static native synchronized void startDalvikAllocationTracking();

    public static native synchronized void startNativeAllocationTracking(int i);

    public static native void statNamedFile(String str, Stat stat);

    public static native void statOpenFile(int i, Stat stat);

    public static native synchronized void stopDalvikAllocationTracking();

    public static native synchronized void stopNativeAllocationTracking();

    public static native void touchWarmstartDexCode();

    public static native void touchWarmstartOatCode();

    public static native synchronized void unmapAllPreviousMmaps();

    public static native synchronized void writeNativeAllocationDataToLogcat(int i);

    public static native synchronized void writeNativeAllocationStacktracesToLogcat(int i);

    static {
        ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
        Object application = currentActivityThread != null ? currentActivityThread.getApplication() : null;
        AnonymousClass0CF.m856E("dextricks");
        ignoreSIGPIPE();
        setIsArt(IsArt.yes);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IsArt = ");
        stringBuilder.append(IsArt.yes);
        stringBuilder.append(" context = ");
        stringBuilder.append(application);
        Mlog.m50d(stringBuilder.toString(), new Object[0]);
        if (!IsArt.yes) {
            try {
                nopDvmVerifyClass();
                Mlog.m54i("Hooked nop dmvVerifyClass", new Object[0]);
            } catch (RuntimeException e) {
                Mlog.m58w("Failed to nop dmvVerifyClass", e);
            }
        }
        if (IsArt.yes) {
            int i = VERSION.SDK_INT;
            if (i >= 21) {
                integrateWithLibSigChain(i);
                if (i == 21) {
                    try {
                        fixArtMirandaBug();
                        Mlog.m50d("patched ART 5.0.x miranda bug", new Object[0]);
                    } catch (Throwable e2) {
                        Mlog.m59w(e2, "could not patch ART 5.0.x miranda bug", new Object[0]);
                    }
                }
            }
        }
    }

    public static synchronized void integrateWithCrashLog(String str, String str2) {
        synchronized (DalvikInternals.class) {
            integrateWithCrashLog(str, str2, new CrashLogParameters(0));
        }
    }
}
