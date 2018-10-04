package com.facebook.common.dextricks;

import X.AnonymousClass017;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;

public class DexDiagnostics {
    public static final String APPLICATION_UID = "application_uid";
    public static final String DEX_DIRECTORIES = "dex_directories";
    public static final String DIRECTORY_OWNER_UID = "directory_owner_uid";
    public static final String LOADAVG_FILE = "loadavg_file";
    public static final String LOGCAT_DATA = "logcat_dump";
    public static final String MOUNTS_FILE = "mounts_file";
    public static final int OWNER_UNAVAILABLE = -2;
    public static final String UPTIME_FILE = "uptime_file";
    private final String mDataDirectory;

    public DexDiagnostics(Context context) {
        String dataDirectory;
        try {
            dataDirectory = getDataDirectory(context);
        } catch (Throwable th) {
            Log.w("DexDiagnostics", "unable to find app data directory", th);
            dataDirectory = null;
        }
        this.mDataDirectory = dataDirectory;
    }

    public String dumpAllDexDirectories() {
        if (this.mDataDirectory == null) {
            return "n/a";
        }
        StringBuilder stringBuilder = new StringBuilder();
        dumpFileMetadata(new File(this.mDataDirectory), stringBuilder);
        return stringBuilder.toString();
    }

    private static StringBuilder dumpFileMetadata(File file, StringBuilder stringBuilder) {
        stringBuilder.append(file.getAbsolutePath());
        if (!file.exists()) {
            stringBuilder.append(" (deleted)\n");
        } else if (file.isDirectory()) {
            stringBuilder.append("\n");
            file = file.listFiles();
            if (file != null) {
                for (File dumpFileMetadata : file) {
                    dumpFileMetadata(dumpFileMetadata, stringBuilder);
                }
            }
        } else {
            stringBuilder.append(" s:");
            stringBuilder.append(file.length());
            stringBuilder.append(" m:");
            stringBuilder.append(file.lastModified());
            stringBuilder.append("\n");
        }
        return stringBuilder;
    }

    public String dumpLogcatData() {
        StringBuilder stringBuilder = new StringBuilder();
        if (VERSION.SDK_INT >= 16) {
            try {
                List A = new AnonymousClass017().m69A();
                for (int i = 0; i < A.size(); i++) {
                    if (i != 0) {
                        stringBuilder.append("\n");
                    }
                    stringBuilder.append((String) A.get(i));
                }
            } catch (RuntimeException e) {
                stringBuilder.setLength(0);
                stringBuilder.append("Exception during logcat dump: ");
                stringBuilder.append(e.toString());
            }
        }
        return stringBuilder.toString();
    }

    public static String getDataDirectory(Context context) {
        return context.getApplicationInfo().dataDir;
    }

    public int getDirectoryOwnerUid() {
        String str = this.mDataDirectory;
        if (str == null) {
            return -2;
        }
        try {
            return DalvikInternals.getOwnerUid(str);
        } catch (Throwable th) {
            Log.e("DexDiagnostics", "Unable to read directory owner uid", th);
            return -2;
        }
    }

    public boolean isDirectoryOwnedByMe() {
        int directoryOwnerUid = getDirectoryOwnerUid();
        if (directoryOwnerUid != Process.myUid()) {
            if (directoryOwnerUid != -2) {
                return false;
            }
        }
        return true;
    }

    public String readProcFile(String str, String str2) {
        BufferedReader bufferedReader;
        Throwable th;
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw th;
            }
            try {
                StringBuilder stringBuilder = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        String stringBuilder2 = stringBuilder.toString();
                        fileInputStream.close();
                        bufferedReader.close();
                        return stringBuilder2;
                    } else if (str2 == null || readLine.contains(str2)) {
                        stringBuilder.append(readLine);
                        stringBuilder.append("\t");
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            fileInputStream = null;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw th;
        }
    }
}
