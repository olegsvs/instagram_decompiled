package com.instagram.debug.memorydump;

import X.AnonymousClass0CB;
import X.AnonymousClass0CK;
import X.AnonymousClass0Dc;
import X.AnonymousClass0EF;
import X.AnonymousClass0FZ;
import X.AnonymousClass0Gc;
import X.AnonymousClass0Gd;
import X.AnonymousClass0Gn;
import X.AnonymousClass0IE;
import X.AnonymousClass0Xr;
import X.AnonymousClass0Xs;
import X.AnonymousClass1EZ;
import X.AnonymousClass1FG;
import X.AnonymousClass1tJ;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Debug;
import com.facebook.C0164R;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class MemoryDumpCreator {
    private static final String HPROF_ID_KEY = "hprof_id";
    private static final String HPROF_STATUS_KEY = "hprof";
    public static final String LEAK_SHARED_PREF_NAME = "leak_map";
    private static final Class TAG = MemoryDumpCreator.class;
    private static MemoryDumpCreator sInstance;
    private final AnonymousClass0Gd mClock;
    private final Context mContext;
    private final AnonymousClass0Xr mJobScheduler;
    private final MemoryDumpFileManager mMemoryDumpFileManager;
    private final SharedPreferences mSharedPrefMap;
    private String mUserId;

    private MemoryDumpCreator(Context context, String str, AnonymousClass0Gd anonymousClass0Gd, MemoryDumpFileManager memoryDumpFileManager) {
        this.mContext = context;
        this.mUserId = str;
        this.mClock = anonymousClass0Gd;
        this.mMemoryDumpFileManager = memoryDumpFileManager;
        this.mSharedPrefMap = context.getSharedPreferences(LEAK_SHARED_PREF_NAME, 0);
        this.mJobScheduler = new AnonymousClass1EZ(context).m10210A();
        scheduleUploadIfNotScheduled();
    }

    private void addMapEntry(String str, String str2) {
        this.mSharedPrefMap.edit().putString(str, str2).apply();
    }

    public void createBetamapMemoryDump() {
        createMemoryDumpInternal(MemoryDumpType.DAILY.getPatternPrefix(), generateDumpId());
    }

    public void createCrashMemoryDump() {
        createMemoryDumpInternal(MemoryDumpType.CRASH.getPatternPrefix(), generateDumpId());
    }

    public String createLeakMemoryDump(String str) {
        String generateDumpId = generateDumpId();
        addMapEntry(generateDumpId, str);
        return createMemoryDumpInternal(MemoryDumpType.LEAK.getPatternPrefix(), generateDumpId);
    }

    private String createMemoryDumpInternal(String str, String str2) {
        try {
            Object obj = (AnonymousClass0CB.m834D() && AnonymousClass0FZ.m1634B().f2177B.getBoolean("client_leak_analysis", false)) ? 1 : null;
            if (!this.mMemoryDumpFileManager.hasFreeSpace()) {
                if (obj == null || !this.mMemoryDumpFileManager.hasFreeSpaceDebugMode()) {
                    AnonymousClass0Gn.m1876C(HPROF_STATUS_KEY, "Failed - not enough free space");
                    return null;
                }
            }
            if (obj != null || hasNoExistingDump()) {
                String dumpHprof = dumpHprof(this.mMemoryDumpFileManager.getHprofDirectory(), str, str2);
                if (isEligibleForUpload(this.mContext)) {
                    scheduleUpload(dumpHprof);
                }
                return dumpHprof;
            }
        } catch (Throwable th) {
            AnonymousClass0Dc.m1250M(TAG, "Error writing Hprof dump", th);
            AnonymousClass0Gn.m1880G(HPROF_STATUS_KEY, th);
        }
        return null;
    }

    private static String dumpHprof(String str, String str2, String str3) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        AnonymousClass0Gn.mo2104B().mo2103A(HPROF_STATUS_KEY, "Started");
        str = AnonymousClass0IE.m2137E("%s/dump_%s_%s.hprof", str, str2, str3);
        Debug.dumpHprofData(str);
        AnonymousClass0Gn.mo2104B().mo2103A(HPROF_STATUS_KEY, "Success");
        AnonymousClass0Gn.mo2104B().mo2103A(HPROF_ID_KEY, str3);
        return str;
    }

    private String generateDumpId() {
        return AnonymousClass0IE.m2137E("%d_%s", Long.valueOf(AnonymousClass0Gd.m1838C()), UUID.randomUUID());
    }

    public static synchronized MemoryDumpCreator getInstance(Context context, String str) {
        MemoryDumpCreator memoryDumpCreator;
        synchronized (MemoryDumpCreator.class) {
            if (sInstance == null) {
                Context applicationContext = context.getApplicationContext();
                sInstance = new MemoryDumpCreator(applicationContext, str, AnonymousClass0Gc.f2391B, new MemoryDumpFileManager(applicationContext, str));
            }
            memoryDumpCreator = sInstance;
        }
        return memoryDumpCreator;
    }

    private boolean hasNoExistingDump() {
        MemoryDumpFileManager memoryDumpFileManager = this.mMemoryDumpFileManager;
        File[] findDumps = memoryDumpFileManager.findDumps(memoryDumpFileManager.getHprofDirectory());
        if (findDumps != null) {
            if (findDumps.length != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEligibleForHeapDump() {
        if (!(AnonymousClass0CK.m880D() || AnonymousClass0CK.m879C() || AnonymousClass0CB.m836F())) {
            if (!AnonymousClass0CB.m834D()) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEligibleForUpload(Context context) {
        return !AnonymousClass0CB.m834D() && ((AnonymousClass0CK.m880D() || AnonymousClass0CK.m879C() || AnonymousClass0CB.m836F()) && AnonymousClass0EF.m1362M(context));
    }

    public static synchronized void maybeUpdateUserId(String str) {
        synchronized (MemoryDumpCreator.class) {
            if (sInstance != null) {
                sInstance.setUserId(str);
            }
        }
    }

    private void scheduleUpload(String str) {
        AnonymousClass1FG B = AnonymousClass1tJ.B();
        B.mo2276B(MemoryDumpUploadJob.EXTRA_FILE_PATH, str);
        B.mo2276B(MemoryDumpUploadJob.EXTRA_USER_ID, this.mUserId);
        AnonymousClass0Xs anonymousClass0Xs = new AnonymousClass0Xs(C0164R.id.memory_dump_upload_job_service_id);
        anonymousClass0Xs.f6213F = 2;
        anonymousClass0Xs.f6215H = true;
        anonymousClass0Xs.f6212E = TimeUnit.MINUTES.toMillis(5);
        anonymousClass0Xs.f6216I = TimeUnit.HOURS.toMillis(6);
        anonymousClass0Xs.f6209B = B;
        this.mJobScheduler.m5271D(anonymousClass0Xs.m5272A());
    }

    private void scheduleUploadIfNotScheduled() {
        if (isEligibleForUpload(this.mContext) && VERSION.SDK_INT >= 21) {
            Object obj;
            for (JobInfo id : ((JobScheduler) this.mContext.getSystemService("jobscheduler")).getAllPendingJobs()) {
                if (id.getId() == C0164R.id.memory_dump_upload_job_service_id) {
                    obj = 1;
                    break;
                }
            }
            obj = null;
            if (obj == null) {
                MemoryDumpFileManager memoryDumpFileManager = this.mMemoryDumpFileManager;
                File[] findDumps = memoryDumpFileManager.findDumps(memoryDumpFileManager.getHprofDirectory());
                if (findDumps != null && findDumps.length > 0) {
                    scheduleUpload(findDumps[0].getPath());
                }
            }
        }
    }

    public void setUserId(String str) {
        this.mUserId = str;
        this.mMemoryDumpFileManager.setUserId(str);
    }
}
