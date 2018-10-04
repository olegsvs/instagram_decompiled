package com.instagram.debug.memorydump;

import X.AnonymousClass0Cq;
import X.AnonymousClass0Dc;
import X.AnonymousClass0FF;
import X.AnonymousClass0GA;
import X.AnonymousClass0Gn;
import X.AnonymousClass0IE;
import X.AnonymousClass0Iw;
import X.AnonymousClass0Ix;
import X.AnonymousClass0LH;
import X.AnonymousClass0Pu;
import X.AnonymousClass0cQ;
import X.AnonymousClass17t;
import X.AnonymousClass1FJ;
import X.AnonymousClass1TB;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public class MemoryDumpUploadJob extends AnonymousClass1FJ {
    public static final String EXTRA_FILE_PATH = "dump_file_path";
    public static final String EXTRA_USER_ID = "user_id";
    private static final Class TAG = MemoryDumpUploadJob.class;
    private final ActivityManager mActivityManager;
    private final Context mContext;
    private final SharedPreferences mSharedPrefMap;

    public boolean onStopJob(int i) {
        return false;
    }

    public MemoryDumpUploadJob(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mActivityManager = (ActivityManager) applicationContext.getSystemService("activity");
        this.mSharedPrefMap = context.getSharedPreferences(MemoryDumpCreator.LEAK_SHARED_PREF_NAME, 0);
    }

    private void clearOutOldDumps(MemoryDumpFileManager memoryDumpFileManager) {
        File[] findDumps = memoryDumpFileManager.findDumps(this.mContext.getCacheDir().getPath());
        if (findDumps != null && findDumps.length > 0) {
            for (File file : findDumps) {
                file.delete();
                removeEntry(this, getCrashId(file.getName()));
            }
        }
    }

    public void doWork(String str, String str2) {
        Throwable e;
        Throwable th;
        MemoryDumpFileManager memoryDumpFileManager = new MemoryDumpFileManager(this.mContext, str);
        clearOutOldDumps(memoryDumpFileManager);
        File file = new File(str2);
        if (file.exists()) {
            File file2 = null;
            try {
                File file3 = new File(AnonymousClass0IE.E("%s.gz", new Object[]{file.getPath()}));
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    memoryDumpFileManager.gzipFile(file, file3);
                    Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
                    MemoryDumpType parseDumpType = MemoryDumpFileManager.parseDumpType(file.getName());
                    final String crashId = getCrashId(file.getName());
                    AnonymousClass17t anonymousClass17t = new AnonymousClass17t();
                    anonymousClass17t.f14856H = "app/hprof";
                    anonymousClass17t.f14850B = AnonymousClass0IE.E("%s|%s", new Object[]{AnonymousClass0Cq.f1767B, AnonymousClass0Cq.f1770E});
                    anonymousClass17t.f14853E = AnonymousClass0Pu.f4247G;
                    AnonymousClass0GA C = anonymousClass17t.B("filetype", "5").B("crash_id", crashId).B("extras", getExtras(crashId, str, parseDumpType)).A("file", file3, "application/octet-stream").D(MemoryDumpUploadResponse__JsonHelper.class).C();
                    C.f2849B = new AnonymousClass0Iw() {
                        public void onFinish() {
                            int I = AnonymousClass0cQ.I(this, 127922012);
                            super.onFinish();
                            MemoryDumpUploadJob.removeEntry(MemoryDumpUploadJob.this, crashId);
                            AnonymousClass0cQ.H(this, 1374482778, I);
                        }
                    };
                    AnonymousClass0Ix.C(C);
                    file.delete();
                    file3.delete();
                } catch (Exception e2) {
                    e = e2;
                    file2 = file3;
                    try {
                        AnonymousClass0Dc.M(TAG, "Error uploading hprof file: ", e);
                        file.delete();
                        if (file2 != null) {
                            file2.delete();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        file3 = file2;
                        file.delete();
                        if (file3 != null) {
                            file3.delete();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    file.delete();
                    if (file3 != null) {
                        file3.delete();
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                AnonymousClass0Dc.M(TAG, "Error uploading hprof file: ", e);
                file.delete();
                if (file2 != null) {
                    file2.delete();
                }
            }
        }
    }

    private String getCrashId(String str) {
        str = MemoryDumpFileManager.FILENAME_PATTERN.matcher(str);
        return str.matches() ? str.group(1) : JsonProperty.USE_DEFAULT_NAME;
    }

    private String getExtras(String str, String str2, MemoryDumpType memoryDumpType) {
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj;
            jSONObject.put("app_version_code", AnonymousClass0FF.B(this.mContext));
            jSONObject.put("brand", Build.BRAND);
            jSONObject.put("memclass", this.mActivityManager.getMemoryClass());
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("android_version", VERSION.RELEASE);
            jSONObject.put("app_version_name", AnonymousClass0FF.C(this.mContext));
            jSONObject.put("app", AnonymousClass0Cq.f1769D);
            jSONObject.put("process_name", "Main Process");
            jSONObject.put("uid", str2);
            if (memoryDumpType == MemoryDumpType.CRASH) {
                obj = "java.lang.OutOfMemoryError";
            } else if (memoryDumpType == MemoryDumpType.LEAK) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("IG_Leak:");
                stringBuilder.append(retrieveMapEntry(str));
                obj = stringBuilder.toString();
            } else if (memoryDumpType == MemoryDumpType.DAILY) {
                obj = "daily";
            } else {
                obj = "unknown";
                AnonymousClass0Gn.H(TAG.getSimpleName(), "unknown dump cause");
            }
            jSONObject.put("dump_cause", obj);
            return jSONObject.toString();
        } catch (JSONException e) {
            return AnonymousClass0IE.E("{ 'error' : '%s' }", new Object[]{e.getMessage()});
        }
    }

    public boolean onStartJob(int i, Bundle bundle, final AnonymousClass1TB anonymousClass1TB) {
        final String string = bundle.getString(EXTRA_USER_ID);
        final String string2 = bundle.getString(EXTRA_FILE_PATH);
        AnonymousClass0LH.E(string);
        AnonymousClass0LH.E(string2);
        AnonymousClass0Ix.D(new AnonymousClass0GA() {
            public String getName() {
                return "MemoryDump";
            }

            public void onStart() {
            }

            public void onFinish() {
                anonymousClass1TB.Kp(false);
            }

            public void run() {
                MemoryDumpUploadJob.this.doWork(string, string2);
            }
        });
        return true;
    }

    public static void removeEntry(MemoryDumpUploadJob memoryDumpUploadJob, String str) {
        memoryDumpUploadJob.mSharedPrefMap.edit().remove(str).apply();
    }

    private String retrieveMapEntry(String str) {
        return this.mSharedPrefMap.getString(str, JsonProperty.USE_DEFAULT_NAME);
    }
}
