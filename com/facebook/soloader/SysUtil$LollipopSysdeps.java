package com.facebook.soloader;

import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import java.io.FileDescriptor;
import java.io.IOException;

public final class SysUtil$LollipopSysdeps {
    private SysUtil$LollipopSysdeps() {
    }

    public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) {
        try {
            Os.posix_fallocate(fileDescriptor, 0, j);
        } catch (FileDescriptor fileDescriptor2) {
            if (fileDescriptor2.errno != OsConstants.EOPNOTSUPP && fileDescriptor2.errno != OsConstants.ENOSYS) {
                if (fileDescriptor2.errno != OsConstants.EINVAL) {
                    throw new IOException(fileDescriptor2.toString(), fileDescriptor2);
                }
            }
        }
    }

    public static String[] getSupportedAbis() {
        return Build.SUPPORTED_ABIS;
    }
}
