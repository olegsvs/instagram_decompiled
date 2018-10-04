package com.instagram.debug.memorydump;

import X.AnonymousClass0IE;
import android.content.Context;
import android.os.StatFs;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;

public class MemoryDumpFileManager {
    private static final int BUFFER_SIZE_BYTES = 8192;
    private static final String DUMP_GENERIC_PATTERN = "dump_%s_([0-9]*_[^_]*)\\.hprof.*";
    public static final Pattern FILENAME_PATTERN = Pattern.compile("dump_[a-z]*_([0-9]*_[^_]*)\\.hprof.*");
    private static final int FREE_SPACE_MEMORY_MULTIPLIER = 3;
    private static final String HPROF_DIR = "hprof";
    private static final Class TAG = MemoryDumpFileManager.class;
    private final Context mApplicationContext;
    private String mUserId;

    /* renamed from: com.instagram.debug.memorydump.MemoryDumpFileManager$1 */
    public class C00431 implements FilenameFilter {
        public boolean accept(File file, String str) {
            return MemoryDumpFileManager.FILENAME_PATTERN.matcher(str).matches();
        }
    }

    public MemoryDumpFileManager(Context context, String str) {
        this.mApplicationContext = context.getApplicationContext();
        this.mUserId = str;
    }

    public File[] findDumps(String str) {
        File[] listFiles = new File(str).listFiles(new C00431());
        Integer.valueOf(listFiles == null ? 0 : listFiles.length);
        return listFiles;
    }

    public String getHprofDirectory() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getInternalCacheDirectory());
        stringBuilder.append("/");
        stringBuilder.append(HPROF_DIR);
        stringBuilder.append("_");
        stringBuilder.append(this.mUserId);
        return stringBuilder.toString();
    }

    private String getInternalCacheDirectory() {
        return this.mApplicationContext.getCacheDir().getPath();
    }

    public void gzipFile(File file, File file2) {
        InputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            OutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
            GZIPOutputStream gZIPOutputStream;
            try {
                gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    gZIPOutputStream.write(bArr, 0, read);
                }
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                bufferedOutputStream.close();
            } catch (Throwable th) {
                bufferedOutputStream.close();
            }
        } finally {
            bufferedInputStream.close();
        }
    }

    public boolean hasFreeSpace() {
        long maxMemory = Runtime.getRuntime().maxMemory();
        StatFs statFs = new StatFs(getInternalCacheDirectory());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong() > maxMemory * 3;
    }

    public boolean hasFreeSpaceDebugMode() {
        long maxMemory = Runtime.getRuntime().maxMemory();
        StatFs statFs = new StatFs(getInternalCacheDirectory());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong() > maxMemory;
    }

    public static MemoryDumpType parseDumpType(String str) {
        for (MemoryDumpType patternPrefix : MemoryDumpType.values()) {
            if (Pattern.compile(AnonymousClass0IE.m2137E(DUMP_GENERIC_PATTERN, patternPrefix.getPatternPrefix())).matcher(str).matches()) {
                return r7[r4];
            }
        }
        return MemoryDumpType.CRASH;
    }

    public void setUserId(String str) {
        this.mUserId = str;
    }
}
