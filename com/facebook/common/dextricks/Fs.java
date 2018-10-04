package com.facebook.common.dextricks;

import android.content.Context;
import android.net.LocalSocket;
import android.os.Process;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.util.zip.ZipFile;

public final class Fs {
    public static boolean isKernelPageCacheFlushIsBroken;
    private static File sDalvikCacheDirectory;

    public static int copyBytes(OutputStream outputStream, InputStream inputStream, int i) {
        return copyBytes(outputStream, inputStream, i, new byte[32768]);
    }

    public static int copyBytes(OutputStream outputStream, InputStream inputStream, int i, byte[] bArr) {
        int i2 = 0;
        while (i2 < i) {
            int slurp = slurp(inputStream, bArr, i - i2);
            if (slurp == -1) {
                break;
            }
            outputStream.write(bArr, 0, slurp);
            i2 += slurp;
        }
        return i2;
    }

    public static int copyBytes(RandomAccessFile randomAccessFile, InputStream inputStream, int i, byte[] bArr) {
        int i2 = 0;
        while (i2 < i) {
            int slurp = slurp(inputStream, bArr, i - i2);
            if (slurp == -1) {
                break;
            }
            randomAccessFile.write(bArr, 0, slurp);
            i2 += slurp;
        }
        return i2;
    }

    public static void deleteRecursive(File file) {
        DalvikInternals.deleteRecursive(file.getAbsolutePath());
    }

    public static void deleteRecursiveNoThrow(File file) {
        if (file != null) {
            try {
                deleteRecursive(file);
            } catch (Throwable e) {
                Mlog.m59w(e, "error deleting %s", file);
            }
        }
    }

    public static File dexOptGenerateCacheFileName(File file, File file2, String str) {
        String absolutePath = file2.getAbsolutePath();
        if (str != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(absolutePath);
            stringBuilder.append("@");
            stringBuilder.append(str);
            absolutePath = stringBuilder.toString();
        }
        return new File(file, absolutePath.substring(1).replace("/", "@"));
    }

    public static long discardFromInputStream(InputStream inputStream, long j) {
        byte[] bArr = new byte[32768];
        long j2 = 0;
        while (j2 < j) {
            int read = inputStream.read(bArr, 0, (int) Math.min((long) bArr.length, j - j2));
            if (read == -1) {
                break;
            }
            j2 += (long) read;
        }
        return j2;
    }

    public static String extensions(String str) {
        int indexOf = str.indexOf(46);
        if (indexOf == -1) {
            return null;
        }
        return str.substring(indexOf);
    }

    public static File findSystemDalvikCache() {
        if (sDalvikCacheDirectory == null) {
            String str;
            String toLowerCase = System.getProperty("os.arch").toLowerCase();
            if (toLowerCase.startsWith("arm")) {
                str = "arm";
            } else {
                if (!toLowerCase.startsWith("x86")) {
                    if (!toLowerCase.startsWith("i") || !toLowerCase.endsWith("86")) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("unknown arch: ");
                        stringBuilder.append(toLowerCase);
                        throw new RuntimeException(stringBuilder.toString());
                    }
                }
                str = "x86";
            }
            String str2 = System.getenv("ANDROID_DATA");
            if (str2 == null) {
                str2 = "/data";
            }
            String format = String.format("%s/dalvik-cache/%s", new Object[]{str2, str});
            if (!new File(format).isDirectory()) {
                format = String.format("%s/dalvik-cache", new Object[]{str2});
            }
            sDalvikCacheDirectory = new File(format);
        }
        return sDalvikCacheDirectory;
    }

    public static void fsyncRecursive(File file, Prio prio) {
        if (!file.getPath().endsWith("_lock")) {
            if (file.isDirectory()) {
                for (File fsyncRecursive : file.listFiles()) {
                    fsyncRecursive(fsyncRecursive, prio);
                }
            }
            if (file.exists()) {
                DalvikInternals.fsyncNamed(file.getAbsolutePath(), prio.ioPriority);
            }
        }
    }

    public static String lastExtension(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return null;
        }
        return str.substring(lastIndexOf);
    }

    public static void link(File file, File file2) {
        DalvikInternals.link(file.getAbsolutePath(), file2.getAbsolutePath(), 0);
    }

    public static void linkAtomic(File file, File file2) {
        DalvikInternals.link(file.getAbsolutePath(), file2.getAbsolutePath(), 2);
    }

    public static File makeDataFile(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir, str);
    }

    public static void mkdirOrThrow(File file) {
        if (!file.mkdirs()) {
            if (!file.isDirectory()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("cannot mkdir: ");
                stringBuilder.append(file);
                throw new IOException(stringBuilder.toString());
            }
        }
    }

    public static RandomAccessFile openDataSyncedFile(File file) {
        file = DalvikInternals.openUnixSyncReadWriteFd(file.getAbsolutePath());
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("/proc/self/task/");
            stringBuilder.append(Process.myTid());
            stringBuilder.append("/fd/");
            stringBuilder.append(file);
            RandomAccessFile randomAccessFile = new RandomAccessFile(stringBuilder.toString(), "rw");
            return randomAccessFile;
        } finally {
            DalvikInternals.closeUnixFd(file);
        }
    }

    public static RandomAccessFile openUnlinkedTemporaryFile(File file) {
        file = File.createTempFile("dextricks", ".tmp", file);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        if (file.delete()) {
            return randomAccessFile;
        }
        randomAccessFile.close();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("could not unlink ");
        stringBuilder.append(file);
        throw new IOException(stringBuilder.toString());
    }

    public static String readProgramOutputFile(RandomAccessFile randomAccessFile) {
        randomAccessFile.seek(0);
        byte[] bArr = new byte[((int) Math.min(randomAccessFile.length(), 131072))];
        randomAccessFile.read(bArr);
        String charBuffer = Charset.forName("UTF-8").newDecoder().onMalformedInput(CodingErrorAction.REPLACE).replaceWith("?").decode(ByteBuffer.wrap(bArr)).toString();
        if (!charBuffer.startsWith("WARNING: linker: ")) {
            return charBuffer;
        }
        int indexOf = charBuffer.indexOf(10);
        if (indexOf == -1) {
            indexOf = charBuffer.length() - 1;
        }
        return charBuffer.substring(indexOf + 1);
    }

    public static void renameOrThrow(File file, File file2) {
        if (!file.renameTo(file2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("rename of ");
            stringBuilder.append(file);
            stringBuilder.append(" to ");
            stringBuilder.append(file2);
            stringBuilder.append(" failed");
            throw new IOException(stringBuilder.toString());
        }
    }

    public static RuntimeException runtimeExFrom(Throwable th) {
        if (th == null) {
            return new RuntimeException("missing exception object");
        }
        if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        }
        return new RuntimeException(th);
    }

    public static void safeClose(LocalSocket localSocket) {
        if (localSocket != null) {
            try {
                localSocket.close();
            } catch (Throwable e) {
                Mlog.m59w(e, "error closing %s", localSocket);
            }
        }
    }

    public static void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable e) {
                Mlog.m59w(e, "error closing %s", closeable);
            }
        }
    }

    public static void safeClose(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (Throwable e) {
                Mlog.m59w(e, "error closing %s", zipFile);
            }
        }
    }

    public static int slurp(InputStream inputStream, byte[] bArr, int i) {
        int min = Math.min(bArr.length, i);
        int i2 = 0;
        int i3 = 0;
        while (i2 < min) {
            i3 = inputStream.read(bArr, i2, min - i2);
            if (i3 < 0) {
                break;
            }
            i2 += i3;
        }
        return (i3 == -1 && i2 == 0) ? -1 : i2;
    }

    public static String stripExtensions(String str) {
        int indexOf = str.indexOf(46);
        return indexOf != -1 ? str.substring(0, indexOf) : str;
    }

    public static String stripLastExtension(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf != -1 ? str.substring(0, lastIndexOf) : str;
    }

    public static void symlink(File file, File file2) {
        DalvikInternals.link(file.getAbsolutePath(), file2.getAbsolutePath(), 1);
    }

    public static void tryDiscardPageCache(int i) {
        if (!isKernelPageCacheFlushIsBroken) {
            try {
                DalvikInternals.fadvise(i, 0, 2147483647L, 4);
            } catch (Throwable e) {
                Mlog.m59w(e, "failed to fadvise", new Object[0]);
                isKernelPageCacheFlushIsBroken = true;
            }
        }
    }
}
