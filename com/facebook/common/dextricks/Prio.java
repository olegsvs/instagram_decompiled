package com.facebook.common.dextricks;

import android.os.Build.VERSION;
import com.facebook.forker.Process;
import java.io.Closeable;

public final class Prio {
    public final int cpuPriority;
    public final int ioPriority;

    public final class With implements Closeable {
        private final int savedCpuPriority;
        private final int savedIoPriority;

        public With() {
            if (VERSION.SDK_INT >= 26) {
                this.savedIoPriority = Process.WAIT_RESULT_TIMEOUT;
                this.savedCpuPriority = Process.WAIT_RESULT_TIMEOUT;
                return;
            }
            int i;
            int myTid = android.os.Process.myTid();
            if (Prio.this.ioPriority == Process.WAIT_RESULT_TIMEOUT) {
                i = Process.WAIT_RESULT_TIMEOUT;
            } else {
                i = DalvikInternals.ioprio_get(1, 0);
            }
            this.savedIoPriority = i;
            if (Prio.this.cpuPriority == Process.WAIT_RESULT_TIMEOUT) {
                i = Process.WAIT_RESULT_TIMEOUT;
            } else {
                i = android.os.Process.getThreadPriority(myTid);
            }
            this.savedCpuPriority = i;
            try {
                if (Prio.this.cpuPriority != Process.WAIT_RESULT_TIMEOUT) {
                    android.os.Process.setThreadPriority(myTid, Prio.this.cpuPriority);
                }
                if (Prio.this.ioPriority != Process.WAIT_RESULT_TIMEOUT) {
                    DalvikInternals.ioprio_set(1, 0, Prio.this.ioPriority);
                }
            } catch (Throwable th) {
                close();
            }
        }

        public void close() {
            int i = this.savedIoPriority;
            if (i != Process.WAIT_RESULT_TIMEOUT) {
                DalvikInternals.ioprio_set(1, 0, i);
            }
            if (this.savedCpuPriority != Process.WAIT_RESULT_TIMEOUT) {
                android.os.Process.setThreadPriority(android.os.Process.myTid(), this.savedCpuPriority);
            }
        }
    }

    public Prio(int i, int i2) {
        this.ioPriority = i;
        this.cpuPriority = i2;
    }

    public Prio ioOnly() {
        return new Prio(this.ioPriority, Process.WAIT_RESULT_TIMEOUT);
    }

    public boolean isDefault() {
        return this.ioPriority < 0 && this.cpuPriority < 0;
    }

    public static Prio lowest() {
        return new Prio(DalvikInternals.IOPRIO_BACKGROUND, 19);
    }

    public static Prio unchanged() {
        return new Prio(Process.WAIT_RESULT_TIMEOUT, Process.WAIT_RESULT_TIMEOUT);
    }

    public With with() {
        return new With();
    }
}
