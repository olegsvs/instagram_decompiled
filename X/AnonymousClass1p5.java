package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.analytics.appstatelogger.AppState;
import java.io.File;
import java.util.Map;

/* renamed from: X.1p5 */
public final class AnonymousClass1p5 extends Thread {
    /* renamed from: f */
    public static final String f23073f = "AppStateLoggerThread";
    /* renamed from: B */
    public final int f23074B;
    /* renamed from: C */
    public final AnonymousClass1oq f23075C = new AnonymousClass1oq(5);
    /* renamed from: D */
    public Integer f23076D = Integer.valueOf(-1);
    /* renamed from: E */
    public Throwable f23077E;
    /* renamed from: F */
    public boolean f23078F;
    /* renamed from: G */
    public boolean f23079G;
    /* renamed from: H */
    public Integer f23080H = Integer.valueOf(-1);
    /* renamed from: I */
    private final long f23081I;
    /* renamed from: J */
    private final AnonymousClass1op f23082J;
    /* renamed from: K */
    private final AppState f23083K;
    /* renamed from: L */
    private final AnonymousClass1or f23084L;
    /* renamed from: M */
    private final File f23085M;
    /* renamed from: N */
    private AnonymousClass2Ot f23086N;
    /* renamed from: O */
    private AnonymousClass1p9 f23087O;
    /* renamed from: P */
    private final Context f23088P;
    /* renamed from: Q */
    private final boolean f23089Q;
    /* renamed from: R */
    private boolean f23090R;
    /* renamed from: S */
    private int f23091S;
    /* renamed from: T */
    private long f23092T;
    /* renamed from: U */
    private final boolean f23093U;
    /* renamed from: V */
    private final boolean f23094V;
    /* renamed from: W */
    private long f23095W;
    /* renamed from: X */
    private long f23096X;
    /* renamed from: Y */
    private long f23097Y;
    /* renamed from: Z */
    private int f23098Z = 0;
    /* renamed from: a */
    private int f23099a = -1;
    /* renamed from: b */
    private Object f23100b;
    /* renamed from: c */
    private final boolean f23101c;
    /* renamed from: d */
    private boolean f23102d;
    /* renamed from: e */
    private final boolean f23103e;

    public AnonymousClass1p5(File file, AnonymousClass1or anonymousClass1or, AppState appState, AnonymousClass1op anonymousClass1op, Context context, AnonymousClass1p9 anonymousClass1p9) {
        boolean z;
        long j;
        super(f23073f);
        this.f23088P = context;
        this.f23087O = anonymousClass1p9;
        this.f23102d = true;
        this.f23090R = true;
        if (!AnonymousClass0Db.C(context, "android_background_app_death_logging")) {
            if (!AnonymousClass0Db.C(context, "android_foreground_app_death_logging")) {
                z = false;
                this.f23089Q = z;
                this.f23080H = Integer.valueOf(0);
                this.f23076D = Integer.valueOf(0);
                this.f23092T = -1;
                this.f23100b = new Object();
                this.f23085M = file;
                AnonymousClass0Db.E(context, "app_state_file_writing_maximim_time_between_writes_forground_ms", 0);
                AnonymousClass0Db.E(context, "app_state_file_writing_maximim_time_between_writes_background_ms", 0);
                this.f23081I = (long) AnonymousClass0Db.E(context, "app_state_file_writing_cold_start_maximum_time_between_writes_ms", 0);
                this.f23097Y = 90000;
                j = this.f23081I;
                this.f23096X = j;
                this.f23095W = j;
                this.f23084L = anonymousClass1or;
                this.f23093U = AnonymousClass0Db.C(context, "app_state_log_anr_recovered_state_enabled");
                this.f23074B = AnonymousClass0Db.E(context, "anr_recovered_override_time", 10000);
                this.f23101c = AnonymousClass0Db.C(context, "app_state_file_writing_non_critical_writes_lower_priority");
                this.f23078F = false;
                this.f23094V = AnonymousClass0Db.C(context, "app_state_log_uncaught_exceptions");
                this.f23083K = appState;
                this.f23082J = anonymousClass1op;
                this.f23103e = AnonymousClass0Db.C(context, "app_state_log_write_free_internal_disk_space");
            }
        }
        z = true;
        this.f23089Q = z;
        this.f23080H = Integer.valueOf(0);
        this.f23076D = Integer.valueOf(0);
        this.f23092T = -1;
        this.f23100b = new Object();
        this.f23085M = file;
        AnonymousClass0Db.E(context, "app_state_file_writing_maximim_time_between_writes_forground_ms", 0);
        AnonymousClass0Db.E(context, "app_state_file_writing_maximim_time_between_writes_background_ms", 0);
        this.f23081I = (long) AnonymousClass0Db.E(context, "app_state_file_writing_cold_start_maximum_time_between_writes_ms", 0);
        this.f23097Y = 90000;
        j = this.f23081I;
        this.f23096X = j;
        this.f23095W = j;
        this.f23084L = anonymousClass1or;
        this.f23093U = AnonymousClass0Db.C(context, "app_state_log_anr_recovered_state_enabled");
        this.f23074B = AnonymousClass0Db.E(context, "anr_recovered_override_time", 10000);
        this.f23101c = AnonymousClass0Db.C(context, "app_state_file_writing_non_critical_writes_lower_priority");
        this.f23078F = false;
        this.f23094V = AnonymousClass0Db.C(context, "app_state_log_uncaught_exceptions");
        this.f23083K = appState;
        this.f23082J = anonymousClass1op;
        this.f23103e = AnonymousClass0Db.C(context, "app_state_log_write_free_internal_disk_space");
    }

    /* renamed from: A */
    public final void m13359A(Integer num) {
        synchronized (this) {
            if (AnonymousClass1GY.D(num.intValue(), this.f23076D.intValue())) {
                return;
            }
            this.f23076D = num;
            if (this.f23093U && !AnonymousClass1GY.D(num.intValue(), 1)) {
                this.f23092T = SystemClock.elapsedRealtime();
                if (this.f23074B > 0) {
                    new AnonymousClass1p4(this).start();
                }
            }
            AnonymousClass1p5.m13354C(this);
            AnonymousClass1p5.m13353B(this);
        }
    }

    /* renamed from: B */
    public static void m13353B(AnonymousClass1p5 anonymousClass1p5) {
        synchronized (anonymousClass1p5.f23100b) {
            anonymousClass1p5.f23090R = true;
            anonymousClass1p5.f23100b.notify();
        }
    }

    /* renamed from: B */
    public final void m13360B(boolean z) {
        synchronized (this) {
            AnonymousClass1p5.m13354C(this);
        }
        if (z) {
            AnonymousClass1p5.m13353B(this);
        }
    }

    /* renamed from: C */
    public static synchronized void m13354C(X.AnonymousClass1p5 r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        monitor-enter(r2);
        r0 = 1;
        r2.f23102d = r0;	 Catch:{ all -> 0x0019 }
        r0 = r2.f23101c;	 Catch:{ all -> 0x0019 }
        if (r0 == 0) goto L_0x0014;	 Catch:{ all -> 0x0019 }
    L_0x0008:
        r1 = r2.f23099a;	 Catch:{ all -> 0x0019 }
        r0 = -1;	 Catch:{ all -> 0x0019 }
        if (r1 == r0) goto L_0x0014;	 Catch:{ all -> 0x0019 }
    L_0x000d:
        r1 = r2.f23099a;	 Catch:{ IllegalArgumentException -> 0x0014, IllegalArgumentException -> 0x0014 }
        r0 = r2.f23098Z;	 Catch:{ IllegalArgumentException -> 0x0014, IllegalArgumentException -> 0x0014 }
        android.os.Process.setThreadPriority(r1, r0);	 Catch:{ IllegalArgumentException -> 0x0014, IllegalArgumentException -> 0x0014 }
    L_0x0014:
        r2.notify();	 Catch:{ all -> 0x0019 }
        monitor-exit(r2);
        return;
    L_0x0019:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1p5.C(X.1p5):void");
    }

    /* renamed from: D */
    public static void m13355D(X.AnonymousClass1p5 r16, X.AnonymousClass1ou r17, com.facebook.analytics.appstatelogger.AppState r18, java.util.Map r19, X.AnonymousClass2Ot r20) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = new java.util.ArrayList;
        r0 = 2;
        r1.<init>(r0);
        r8 = r16;
        r0 = r8.f23079G;
        if (r0 == 0) goto L_0x0014;
    L_0x000c:
        r0 = new X.1p3;
        r0.<init>();
        r1.add(r0);
    L_0x0014:
        r0 = r17.m13339B();
        r1.add(r0);
        r6 = r20;	 Catch:{ IllegalStateException -> 0x0355 }
        r10 = new X.1pD;	 Catch:{ IllegalStateException -> 0x0355 }
        r10.<init>(r1);	 Catch:{ IllegalStateException -> 0x0355 }
        r14 = 0;	 Catch:{ IllegalStateException -> 0x0355 }
        r0 = r8.f23103e;	 Catch:{ Throwable -> 0x034b }
        r7 = r18;	 Catch:{ Throwable -> 0x034b }
        if (r0 == 0) goto L_0x0058;	 Catch:{ Throwable -> 0x034b }
    L_0x0029:
        if (r20 == 0) goto L_0x0033;	 Catch:{ Throwable -> 0x034b }
    L_0x002b:
        r0 = 0;	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ Throwable -> 0x034b }
        r6.onCodePoint$$CLONE(r0);	 Catch:{ Throwable -> 0x034b }
    L_0x0033:
        r0 = android.os.Environment.getDataDirectory();	 Catch:{ Throwable -> 0x034b }
        r4 = new android.os.StatFs;	 Catch:{ Throwable -> 0x034b }
        r0 = r0.getPath();	 Catch:{ Throwable -> 0x034b }
        r4.<init>(r0);	 Catch:{ Throwable -> 0x034b }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Throwable -> 0x034b }
        r0 = 18;	 Catch:{ Throwable -> 0x034b }
        if (r1 < r0) goto L_0x004b;	 Catch:{ Throwable -> 0x034b }
    L_0x0046:
        r0 = X.AnonymousClass1p2.m13352B(r4);	 Catch:{ Throwable -> 0x034b }
        goto L_0x0056;	 Catch:{ Throwable -> 0x034b }
    L_0x004b:
        r0 = r4.getBlockSize();	 Catch:{ Throwable -> 0x034b }
        r2 = (long) r0;	 Catch:{ Throwable -> 0x034b }
        r0 = r4.getAvailableBlocks();	 Catch:{ Throwable -> 0x034b }
        r0 = (long) r0;	 Catch:{ Throwable -> 0x034b }
        r0 = r0 * r2;	 Catch:{ Throwable -> 0x034b }
    L_0x0056:
        r7.f23020K = r0;	 Catch:{ Throwable -> 0x034b }
    L_0x0058:
        if (r20 == 0) goto L_0x0062;	 Catch:{ Throwable -> 0x034b }
    L_0x005a:
        r0 = 1;	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ Throwable -> 0x034b }
        r6.onCodePoint$$CLONE(r0);	 Catch:{ Throwable -> 0x034b }
    L_0x0062:
        r2 = r8.f23084L;	 Catch:{ Throwable -> 0x034b }
        monitor-enter(r2);	 Catch:{ Throwable -> 0x034b }
        r0 = r2.f23039D;	 Catch:{ all -> 0x0366 }
        if (r0 == 0) goto L_0x006c;	 Catch:{ all -> 0x0366 }
    L_0x0069:
        r3 = r2.f23040E;	 Catch:{ all -> 0x0366 }
        goto L_0x0076;	 Catch:{ all -> 0x0366 }
    L_0x006c:
        r3 = r2.f23040E;	 Catch:{ all -> 0x0366 }
        r11 = android.os.SystemClock.uptimeMillis();	 Catch:{ all -> 0x0366 }
        r0 = r2.f23037B;	 Catch:{ all -> 0x0366 }
        r11 = r11 - r0;	 Catch:{ all -> 0x0366 }
        r3 = r3 + r11;	 Catch:{ all -> 0x0366 }
    L_0x0076:
        monitor-exit(r2);	 Catch:{ Throwable -> 0x034b }
        r1 = r8.f23084L;	 Catch:{ Throwable -> 0x034b }
        monitor-enter(r1);	 Catch:{ Throwable -> 0x034b }
        r12 = r1.f23038C;	 Catch:{ all -> 0x0369 }
        monitor-exit(r1);	 Catch:{ Throwable -> 0x034b }
        r2 = r8.f23103e;	 Catch:{ Throwable -> 0x034b }
        r5 = new java.io.OutputStreamWriter;	 Catch:{ Throwable -> 0x034b }
        r0 = "UTF-8";	 Catch:{ Throwable -> 0x034b }
        r5.<init>(r10, r0);	 Catch:{ Throwable -> 0x034b }
        r0 = "{";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r1 = r7.f23031V;	 Catch:{ Throwable -> 0x034b }
        r0 = "\"processName\":\"";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r1);	 Catch:{ Throwable -> 0x034b }
        r0 = "\",";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = "\"process_id\":";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r7.f23030U;	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Integer.toString(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = ",";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r1 = r7.f23015F;	 Catch:{ Throwable -> 0x034b }
        r0 = "\"appVersionName\":\"";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r1);	 Catch:{ Throwable -> 0x034b }
        r0 = "\",";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r1 = r7.f23014E;	 Catch:{ Throwable -> 0x034b }
        r0 = "\"appVersionCode\":";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Integer.toString(r1);	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = ",";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r7.f23011B;	 Catch:{ Throwable -> 0x034b }
        r9 = "\"aslCreationTime\":";	 Catch:{ Throwable -> 0x034b }
        r5.append(r9);	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Long.toString(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = ",";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r17 = android.os.SystemClock.uptimeMillis();	 Catch:{ Throwable -> 0x034b }
        r0 = "\"processWallClockUptimeMs\":";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r7.f23013D;	 Catch:{ Throwable -> 0x034b }
        r15 = r17 - r0;	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Long.toString(r15);	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = ",";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r7.f23025P;	 Catch:{ Throwable -> 0x034b }
        r15 = 0;	 Catch:{ Throwable -> 0x034b }
        r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1));	 Catch:{ Throwable -> 0x034b }
        if (r0 <= 0) goto L_0x0118;	 Catch:{ Throwable -> 0x034b }
    L_0x0103:
        r0 = "\"lastLauncherIntentTimeMs\":";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r7.f23025P;	 Catch:{ Throwable -> 0x034b }
        r17 = r17 - r0;	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Long.toString(r17);	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = ",";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
    L_0x0118:
        r1 = r7.f23032W;	 Catch:{ Throwable -> 0x034b }
        r0 = "\"startedInBackground\":";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Boolean.toString(r1);	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = ",";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = "\"activities\":[";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r19.entrySet();	 Catch:{ Throwable -> 0x034b }
        r11 = r0.iterator();	 Catch:{ Throwable -> 0x034b }
    L_0x0138:
        r0 = r11.hasNext();	 Catch:{ Throwable -> 0x034b }
        if (r0 == 0) goto L_0x017e;	 Catch:{ Throwable -> 0x034b }
    L_0x013e:
        r1 = r11.next();	 Catch:{ Throwable -> 0x034b }
        r1 = (java.util.Map.Entry) r1;	 Catch:{ Throwable -> 0x034b }
        r0 = r1.getKey();	 Catch:{ Throwable -> 0x034b }
        r0 = (android.app.Activity) r0;	 Catch:{ Throwable -> 0x034b }
        r9 = r0.getLocalClassName();	 Catch:{ Throwable -> 0x034b }
        r1 = r1.getValue();	 Catch:{ Throwable -> 0x034b }
        r1 = (java.lang.Integer) r1;	 Catch:{ Throwable -> 0x034b }
        r0 = "{";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = "\"name\":\"";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r9);	 Catch:{ Throwable -> 0x034b }
        r0 = "\",\"state\":\"";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = X.AnonymousClass1om.m13323C(r1);	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = "\"}";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r11.hasNext();	 Catch:{ Throwable -> 0x034b }
        if (r0 == 0) goto L_0x0138;	 Catch:{ Throwable -> 0x034b }
    L_0x0178:
        r0 = ",";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        goto L_0x0138;	 Catch:{ Throwable -> 0x034b }
    L_0x017e:
        r0 = "],";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r7.f23033X;	 Catch:{ Throwable -> 0x034b }
        if (r0 == 0) goto L_0x019e;	 Catch:{ Throwable -> 0x034b }
    L_0x0187:
        r0 = r7.f23033X;	 Catch:{ Throwable -> 0x034b }
        r0 = r0.isEmpty();	 Catch:{ Throwable -> 0x034b }
        if (r0 != 0) goto L_0x019e;	 Catch:{ Throwable -> 0x034b }
    L_0x018f:
        r0 = "\"userId\":\"";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r7.f23033X;	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = "\",";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
    L_0x019e:
        r0 = "\"granularExposures\":\"";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r7.f23022M;	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = "\",";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = "\"navModule\":\"";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r7.f23029T;	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = "\",";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        if (r2 == 0) goto L_0x01d1;	 Catch:{ Throwable -> 0x034b }
    L_0x01be:
        r0 = "\"freeInternalDiskSpace\":";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r7.f23020K;	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Long.toString(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = ",";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
    L_0x01d1:
        r0 = "\"deviceMemory\":";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r7.f23017H;	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Long.toString(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = ",";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = "\"watermarkMin\":";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r7.f23028S;	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Long.toString(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = ",";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = "\"watermarkLow\":";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r7.f23027R;	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Long.toString(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = ",";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = "\"watermarkHigh\":";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r7.f23026Q;	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Long.toString(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r9 = ",";	 Catch:{ Throwable -> 0x034b }
        r5.append(r9);	 Catch:{ Throwable -> 0x034b }
        if (r20 == 0) goto L_0x0227;	 Catch:{ Throwable -> 0x034b }
    L_0x021f:
        r0 = 2;	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ Throwable -> 0x034b }
        r6.onCodePoint$$CLONE(r0);	 Catch:{ Throwable -> 0x034b }
    L_0x0227:
        r2 = new X.1pF;	 Catch:{ Throwable -> 0x034b }
        r2.<init>();	 Catch:{ Throwable -> 0x034b }
        r15 = X.AnonymousClass1pG.f23136B;	 Catch:{ Throwable -> 0x034b }
        r0 = r15.length;	 Catch:{ Throwable -> 0x034b }
        r11 = new long[r0];	 Catch:{ Throwable -> 0x034b }
        r1 = "/proc/self/status";	 Catch:{ Throwable -> 0x034b }
        r0 = X.AnonymousClass0KF.f2991C;	 Catch:{ Throwable -> 0x034b }
        r0.nIA(r1, r15, r11);	 Catch:{ Throwable -> 0x034b }
        r0 = 0;	 Catch:{ Throwable -> 0x034b }
        r0 = r11[r0];	 Catch:{ Throwable -> 0x034b }
        r2.f23133C = r0;	 Catch:{ Throwable -> 0x034b }
        r0 = 1;	 Catch:{ Throwable -> 0x034b }
        r0 = r11[r0];	 Catch:{ Throwable -> 0x034b }
        r2.f23132B = r0;	 Catch:{ Throwable -> 0x034b }
        r0 = 2;	 Catch:{ Throwable -> 0x034b }
        r0 = r11[r0];	 Catch:{ Throwable -> 0x034b }
        r2.f23135E = r0;	 Catch:{ Throwable -> 0x034b }
        r0 = 3;	 Catch:{ Throwable -> 0x034b }
        r0 = r11[r0];	 Catch:{ Throwable -> 0x034b }
        r2.f23134D = r0;	 Catch:{ Throwable -> 0x034b }
        r0 = "\"addressSpacePeakKB\":";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r2.f23133C;	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Long.toString(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r9);	 Catch:{ Throwable -> 0x034b }
        r0 = "\"addressSpaceCurrentKB\":";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r2.f23132B;	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Long.toString(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r9);	 Catch:{ Throwable -> 0x034b }
        r0 = "\"rssPeakKB\":";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r2.f23135E;	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Long.toString(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r9);	 Catch:{ Throwable -> 0x034b }
        r0 = "\"rssCurrentKB\":";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r2.f23134D;	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Long.toString(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r9);	 Catch:{ Throwable -> 0x034b }
        r0 = "\"total_fgtm_ms\":";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Long.toString(r3);	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r9);	 Catch:{ Throwable -> 0x034b }
        r0 = "\"total_fg_count\":";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Long.toString(r12);	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r9);	 Catch:{ Throwable -> 0x034b }
        r0 = r7.f23023N;	 Catch:{ Throwable -> 0x034b }
        if (r0 == 0) goto L_0x02c3;	 Catch:{ Throwable -> 0x034b }
    L_0x02b2:
        r0 = "\"sticky_bit_enabled\":";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r7.f23023N;	 Catch:{ Throwable -> 0x034b }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r9);	 Catch:{ Throwable -> 0x034b }
    L_0x02c3:
        r0 = "\"first_message_code\":";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r7.f23018I;	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Integer.toString(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r9);	 Catch:{ Throwable -> 0x034b }
        r0 = "\"first_message_str\":\"";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r7.f23019J;	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = "\",";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = "\"anr_detector_id\":";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r7.f23012C;	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Integer.toString(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r9);	 Catch:{ Throwable -> 0x034b }
        r0 = "\"device_is_shutting_down\":";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r7.f23016G;	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Boolean.toString(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r9);	 Catch:{ Throwable -> 0x034b }
        r0 = r7.f23024O;	 Catch:{ Throwable -> 0x034b }
        if (r0 == 0) goto L_0x0323;	 Catch:{ Throwable -> 0x034b }
    L_0x0309:
        r0 = "\"last_throwable\":\"";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r7.f23024O;	 Catch:{ Throwable -> 0x034b }
        r0 = r0.getClass();	 Catch:{ Throwable -> 0x034b }
        r0 = r0.getName();	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = "\"";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r9);	 Catch:{ Throwable -> 0x034b }
    L_0x0323:
        r0 = "\"future_num_activities\":";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = r7.f23021L;	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Integer.toString(r0);	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r0 = "}";	 Catch:{ Throwable -> 0x034b }
        r5.append(r0);	 Catch:{ Throwable -> 0x034b }
        r5.flush();	 Catch:{ Throwable -> 0x034b }
        if (r20 == 0) goto L_0x0343;	 Catch:{ Throwable -> 0x034b }
    L_0x033b:
        r0 = 3;	 Catch:{ Throwable -> 0x034b }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ Throwable -> 0x034b }
        r6.onCodePoint$$CLONE(r0);	 Catch:{ Throwable -> 0x034b }
    L_0x0343:
        r10.close();	 Catch:{ IllegalStateException -> 0x0355 }
        goto L_0x035b;	 Catch:{ IllegalStateException -> 0x0355 }
    L_0x0347:
        r0 = move-exception;
        if (r14 == 0) goto L_0x0351;
    L_0x034a:
        goto L_0x034d;
    L_0x034b:
        r14 = move-exception;
        throw r14;	 Catch:{ all -> 0x0347 }
    L_0x034d:
        r10.close();	 Catch:{ Throwable -> 0x0354 }
        goto L_0x0354;	 Catch:{ Throwable -> 0x0354 }
    L_0x0351:
        r10.close();	 Catch:{ IllegalStateException -> 0x0355 }
    L_0x0354:
        throw r0;	 Catch:{ IllegalStateException -> 0x0355 }
    L_0x0355:
        r1 = move-exception;
        r0 = "Generating malformed JSON";
        X.AnonymousClass1p5.m13356E(r8, r0, r1);
    L_0x035b:
        if (r20 == 0) goto L_0x0365;
    L_0x035d:
        r0 = 4;
        r0 = java.lang.Integer.valueOf(r0);
        r6.onCodePoint$$CLONE(r0);
    L_0x0365:
        return;
    L_0x0366:
        r0 = move-exception;	 Catch:{ Throwable -> 0x034b }
        monitor-exit(r2);	 Catch:{ Throwable -> 0x034b }
    L_0x0368:
        throw r0;	 Catch:{ Throwable -> 0x034b }
    L_0x0369:
        r0 = move-exception;	 Catch:{ Throwable -> 0x034b }
        monitor-exit(r1);	 Catch:{ Throwable -> 0x034b }
        goto L_0x0368;	 Catch:{ Throwable -> 0x034b }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1p5.D(X.1p5, X.1ou, com.facebook.analytics.appstatelogger.AppState, java.util.Map, X.2Ot):void");
    }

    /* renamed from: E */
    private static void m13356E(AnonymousClass1p5 anonymousClass1p5, String str, Throwable th) {
        AnonymousClass0Dc.I(f23073f, th, str, new Object[0]);
        anonymousClass1p5.f23075C.m13329A(str, th);
    }

    /* renamed from: F */
    private void m13357F() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r11 = this;
        monitor-enter(r11);
        r0 = android.os.Process.myTid();	 Catch:{ all -> 0x01df }
        r11.f23099a = r0;	 Catch:{ all -> 0x01df }
        r0 = android.os.Process.myTid();	 Catch:{ all -> 0x01df }
        r0 = android.os.Process.getThreadPriority(r0);	 Catch:{ all -> 0x01df }
        r11.f23098Z = r0;	 Catch:{ all -> 0x01df }
        monitor-exit(r11);	 Catch:{ all -> 0x01df }
        r4 = 0;	 Catch:{ all -> 0x01df }
        r0 = r11.f23085M;	 Catch:{ Exception -> 0x01a5 }
        r3 = r0.getParentFile();	 Catch:{ Exception -> 0x01a5 }
        r0 = r3.exists();	 Catch:{ Exception -> 0x01a5 }
        r5 = 1;	 Catch:{ Exception -> 0x01a5 }
        r7 = 0;	 Catch:{ Exception -> 0x01a5 }
        if (r0 != 0) goto L_0x0039;	 Catch:{ Exception -> 0x01a5 }
    L_0x0021:
        r0 = r3.mkdirs();	 Catch:{ Exception -> 0x01a5 }
        if (r0 != 0) goto L_0x0039;	 Catch:{ Exception -> 0x01a5 }
    L_0x0027:
        r2 = "Unable to create app state log directory: %s";	 Catch:{ Exception -> 0x01a5 }
        r1 = new java.lang.Object[r5];	 Catch:{ Exception -> 0x01a5 }
        r0 = r3.getAbsolutePath();	 Catch:{ Exception -> 0x01a5 }
        r1[r7] = r0;	 Catch:{ Exception -> 0x01a5 }
        r0 = java.lang.String.format(r2, r1);	 Catch:{ Exception -> 0x01a5 }
        X.AnonymousClass1p5.m13356E(r11, r0, r4);	 Catch:{ Exception -> 0x01a5 }
    L_0x0038:
        return;	 Catch:{ Exception -> 0x01a5 }
    L_0x0039:
        r3 = new X.1ou;	 Catch:{ Exception -> 0x01a5 }
        r1 = r11.f23085M;	 Catch:{ Exception -> 0x01a5 }
        r0 = r11.f23089Q;	 Catch:{ Exception -> 0x01a5 }
        r3.<init>(r1, r0);	 Catch:{ Exception -> 0x01a5 }
        r0 = java.lang.Integer.valueOf(r5);	 Catch:{ Exception -> 0x019c }
        r3.m13340C(r0);	 Catch:{ Exception -> 0x019c }
        r0 = r11.f23085M;	 Catch:{ Exception -> 0x019c }
        r0.getAbsolutePath();	 Catch:{ Exception -> 0x019c }
        r5 = new X.1pE;	 Catch:{ Throwable -> 0x019a }
        r5.<init>();	 Catch:{ Throwable -> 0x019a }
        r2 = r11.f23083K;	 Catch:{ Throwable -> 0x019a }
        r0 = r5.f23131D;	 Catch:{ Throwable -> 0x019a }
        r2.f23028S = r0;	 Catch:{ Throwable -> 0x019a }
        r0 = r5.f23130C;	 Catch:{ Throwable -> 0x019a }
        r2.f23027R = r0;	 Catch:{ Throwable -> 0x019a }
        r0 = r5.f23129B;	 Catch:{ Throwable -> 0x019a }
        r2.f23026Q = r0;	 Catch:{ Throwable -> 0x019a }
        r0 = android.os.SystemClock.uptimeMillis();	 Catch:{ Throwable -> 0x019a }
    L_0x0065:
        r10 = r11.f23100b;	 Catch:{ Throwable -> 0x019a }
        monitor-enter(r10);	 Catch:{ Throwable -> 0x019a }
    L_0x0068:
        r2 = r11.f23090R;	 Catch:{ all -> 0x0197 }
        r11.f23090R = r7;	 Catch:{ all -> 0x0197 }
        r8 = android.os.SystemClock.uptimeMillis();	 Catch:{ all -> 0x0197 }
        r8 = r8 - r0;	 Catch:{ all -> 0x0197 }
        r5 = r11.f23097Y;	 Catch:{ all -> 0x0197 }
        r5 = r5 - r8;	 Catch:{ all -> 0x0197 }
        r8 = 0;	 Catch:{ all -> 0x0197 }
        if (r2 != 0) goto L_0x0094;	 Catch:{ all -> 0x0197 }
    L_0x0078:
        r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1));	 Catch:{ all -> 0x0197 }
        if (r2 <= 0) goto L_0x0094;	 Catch:{ all -> 0x0197 }
    L_0x007c:
        r2 = r11.f23100b;	 Catch:{ InterruptedException -> 0x0082 }
        r2.wait(r5);	 Catch:{ InterruptedException -> 0x0082 }
        goto L_0x0068;	 Catch:{ InterruptedException -> 0x0082 }
    L_0x0082:
        r1 = move-exception;
        r0 = "Interrupted while sleeping";	 Catch:{ all -> 0x0197 }
        X.AnonymousClass1p5.m13356E(r11, r0, r1);	 Catch:{ all -> 0x0197 }
        monitor-exit(r10);	 Catch:{ all -> 0x0197 }
        r3.m13338A();	 Catch:{ IOException -> 0x008d }
        goto L_0x0038;	 Catch:{ IOException -> 0x008d }
    L_0x008d:
        r1 = move-exception;
        r0 = "Failed to close log file";
        X.AnonymousClass1p5.m13356E(r11, r0, r1);
        goto L_0x0038;
    L_0x0094:
        monitor-exit(r10);	 Catch:{ all -> 0x0197 }
        monitor-enter(r11);	 Catch:{ all -> 0x018e }
    L_0x0096:
        r0 = r11.f23102d;	 Catch:{ all -> 0x0185 }
        if (r0 != 0) goto L_0x00c7;	 Catch:{ all -> 0x0185 }
    L_0x009a:
        r1 = r11.f23082J;	 Catch:{ InterruptedException -> 0x00b3 }
        monitor-enter(r1);	 Catch:{ InterruptedException -> 0x00b3 }
        r0 = r1.f23010C;	 Catch:{ all -> 0x01e2 }
        monitor-exit(r1);	 Catch:{ InterruptedException -> 0x00b3 }
        if (r0 != 0) goto L_0x00a5;	 Catch:{ InterruptedException -> 0x00b3 }
    L_0x00a2:
        r0 = r11.f23095W;	 Catch:{ InterruptedException -> 0x00b3 }
        goto L_0x00a7;	 Catch:{ InterruptedException -> 0x00b3 }
    L_0x00a5:
        r0 = r11.f23096X;	 Catch:{ InterruptedException -> 0x00b3 }
    L_0x00a7:
        r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));	 Catch:{ InterruptedException -> 0x00b3 }
        if (r2 != 0) goto L_0x00af;	 Catch:{ InterruptedException -> 0x00b3 }
    L_0x00ab:
        r11.wait();	 Catch:{ InterruptedException -> 0x00b3 }
        goto L_0x0096;	 Catch:{ InterruptedException -> 0x00b3 }
    L_0x00af:
        r11.wait(r0);	 Catch:{ InterruptedException -> 0x00b3 }
        goto L_0x00c7;	 Catch:{ InterruptedException -> 0x00b3 }
    L_0x00b3:
        r1 = move-exception;
        r0 = "Interrupted while waiting for updated app state";	 Catch:{ all -> 0x0185 }
        X.AnonymousClass1p5.m13356E(r11, r0, r1);	 Catch:{ all -> 0x0185 }
        monitor-exit(r11);	 Catch:{ all -> 0x0185 }
        r3.m13338A();	 Catch:{ IOException -> 0x00bf }
        goto L_0x0038;	 Catch:{ IOException -> 0x00bf }
    L_0x00bf:
        r1 = move-exception;
        r0 = "Failed to close log file";
        X.AnonymousClass1p5.m13356E(r11, r0, r1);
        goto L_0x0038;
    L_0x00c7:
        r0 = r11.f23101c;	 Catch:{ all -> 0x0185 }
        if (r0 == 0) goto L_0x00d7;	 Catch:{ all -> 0x0185 }
    L_0x00cb:
        r0 = r11.f23102d;	 Catch:{ IllegalArgumentException -> 0x00d7, IllegalArgumentException -> 0x00d7 }
        if (r0 == 0) goto L_0x00d2;	 Catch:{ IllegalArgumentException -> 0x00d7, IllegalArgumentException -> 0x00d7 }
    L_0x00cf:
        r0 = r11.f23098Z;	 Catch:{ IllegalArgumentException -> 0x00d7, IllegalArgumentException -> 0x00d7 }
        goto L_0x00d4;	 Catch:{ IllegalArgumentException -> 0x00d7, IllegalArgumentException -> 0x00d7 }
    L_0x00d2:
        r0 = 19;	 Catch:{ IllegalArgumentException -> 0x00d7, IllegalArgumentException -> 0x00d7 }
    L_0x00d4:
        android.os.Process.setThreadPriority(r0);	 Catch:{ IllegalArgumentException -> 0x00d7, IllegalArgumentException -> 0x00d7 }
    L_0x00d7:
        r5 = r11.f23086N;	 Catch:{ all -> 0x0185 }
        if (r5 == 0) goto L_0x00e0;	 Catch:{ all -> 0x0185 }
    L_0x00db:
        r0 = r11.f23102d;	 Catch:{ all -> 0x018c }
        r5.onWriteLoopStarted(r0);	 Catch:{ all -> 0x018c }
    L_0x00e0:
        r6 = new com.facebook.analytics.appstatelogger.AppState;	 Catch:{ all -> 0x018c }
        r0 = r11.f23083K;	 Catch:{ all -> 0x018c }
        r6.<init>(r0);	 Catch:{ all -> 0x018c }
        r1 = r11.f23087O;	 Catch:{ all -> 0x018c }
        r0 = r11.f23088P;	 Catch:{ all -> 0x018c }
        r0 = r1.qT(r0);	 Catch:{ all -> 0x018c }
        r6.f23033X = r0;	 Catch:{ all -> 0x018c }
        r0 = r11.f23078F;	 Catch:{ all -> 0x018c }
        r6.f23016G = r0;	 Catch:{ all -> 0x018c }
        r0 = r11.f23077E;	 Catch:{ all -> 0x018c }
        r6.f23024O = r0;	 Catch:{ all -> 0x018c }
        r0 = r11.f23091S;	 Catch:{ all -> 0x018c }
        r6.f23021L = r0;	 Catch:{ all -> 0x018c }
        r8 = r11.f23082J;	 Catch:{ all -> 0x018c }
        monitor-enter(r8);	 Catch:{ all -> 0x018c }
        r1 = new java.util.WeakHashMap;	 Catch:{ all -> 0x01e5 }
        r0 = r8.f23009B;	 Catch:{ all -> 0x01e5 }
        r1.<init>(r0);	 Catch:{ all -> 0x01e5 }
        r2 = java.util.Collections.unmodifiableMap(r1);	 Catch:{ all -> 0x01e5 }
        monitor-exit(r8);	 Catch:{ all -> 0x018c }
        r11.f23102d = r7;	 Catch:{ all -> 0x018c }
        monitor-exit(r11);	 Catch:{ all -> 0x018c }
        r0 = r11.f23093U;	 Catch:{ IOException -> 0x0143 }
        if (r0 != 0) goto L_0x013e;	 Catch:{ IOException -> 0x0143 }
    L_0x0113:
        r0 = r11.f23076D;	 Catch:{ IOException -> 0x0143 }
        r1 = r0.intValue();	 Catch:{ IOException -> 0x0143 }
        r0 = 1;	 Catch:{ IOException -> 0x0143 }
        r0 = X.AnonymousClass1GY.D(r1, r0);	 Catch:{ IOException -> 0x0143 }
        if (r0 != 0) goto L_0x0134;	 Catch:{ IOException -> 0x0143 }
    L_0x0120:
        r0 = 2;	 Catch:{ IOException -> 0x0143 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ IOException -> 0x0143 }
        r3.m13340C(r0);	 Catch:{ IOException -> 0x0143 }
        X.AnonymousClass1p5.m13355D(r11, r3, r6, r2, r5);	 Catch:{ IOException -> 0x0143 }
        r0 = 3;	 Catch:{ IOException -> 0x0143 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ IOException -> 0x0143 }
        r3.m13340C(r0);	 Catch:{ IOException -> 0x0143 }
        goto L_0x013d;	 Catch:{ IOException -> 0x0143 }
    L_0x0134:
        r0 = 16;	 Catch:{ IOException -> 0x0143 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ IOException -> 0x0143 }
        r3.m13340C(r0);	 Catch:{ IOException -> 0x0143 }
    L_0x013d:
        goto L_0x0141;	 Catch:{ IOException -> 0x0143 }
    L_0x013e:
        X.AnonymousClass1p5.m13358G(r11, r3, r6, r2, r5);	 Catch:{ IOException -> 0x0143 }
    L_0x0141:
        r2 = r4;	 Catch:{ IOException -> 0x0143 }
        goto L_0x0149;	 Catch:{ IOException -> 0x0143 }
    L_0x0143:
        r2 = move-exception;
        r0 = "Error dumping app state to log file";	 Catch:{ all -> 0x0183 }
        X.AnonymousClass1p5.m13356E(r11, r0, r2);	 Catch:{ all -> 0x0183 }
    L_0x0149:
        r0 = r11.f23080H;	 Catch:{ all -> 0x0183 }
        r0 = r0.intValue();	 Catch:{ all -> 0x0183 }
        r0 = X.AnonymousClass1GY.D(r0, r7);	 Catch:{ all -> 0x0183 }
        if (r0 != 0) goto L_0x0178;	 Catch:{ all -> 0x0183 }
    L_0x0155:
        if (r5 == 0) goto L_0x015a;	 Catch:{ all -> 0x0183 }
    L_0x0157:
        r5.onWriteLoopEnded(r2);	 Catch:{ Throwable -> 0x019a }
    L_0x015a:
        r0 = r11.f23080H;	 Catch:{ Throwable -> 0x019a }
        r0 = r0.intValue();	 Catch:{ Throwable -> 0x019a }
        r0 = X.AnonymousClass1GY.D(r0, r7);	 Catch:{ Throwable -> 0x019a }
        if (r0 != 0) goto L_0x016b;	 Catch:{ Throwable -> 0x019a }
    L_0x0166:
        r0 = r11.f23080H;	 Catch:{ Throwable -> 0x019a }
        r3.m13340C(r0);	 Catch:{ Throwable -> 0x019a }
    L_0x016b:
        r3.m13338A();	 Catch:{ IOException -> 0x0170 }
        goto L_0x0038;	 Catch:{ IOException -> 0x0170 }
    L_0x0170:
        r1 = move-exception;
        r0 = "Failed to close log file";
        X.AnonymousClass1p5.m13356E(r11, r0, r1);
        goto L_0x0038;
    L_0x0178:
        r0 = android.os.SystemClock.uptimeMillis();	 Catch:{ all -> 0x0183 }
        if (r5 == 0) goto L_0x0065;	 Catch:{ all -> 0x0183 }
    L_0x017e:
        r5.onWriteLoopEnded(r2);	 Catch:{ Throwable -> 0x019a }
        goto L_0x0065;	 Catch:{ Throwable -> 0x019a }
    L_0x0183:
        r0 = move-exception;
        goto L_0x0191;
    L_0x0185:
        r0 = move-exception;
        r5 = r4;
    L_0x0187:
        monitor-exit(r11);	 Catch:{ all -> 0x018c }
        throw r0;	 Catch:{ all -> 0x0189 }
    L_0x0189:
        r0 = move-exception;
        r2 = r4;
        goto L_0x0191;
    L_0x018c:
        r0 = move-exception;
        goto L_0x0187;
    L_0x018e:
        r0 = move-exception;
        r5 = r4;
        r2 = r4;
    L_0x0191:
        if (r5 == 0) goto L_0x0196;
    L_0x0193:
        r5.onWriteLoopEnded(r2);	 Catch:{ Throwable -> 0x019a }
    L_0x0196:
        throw r0;	 Catch:{ Throwable -> 0x019a }
    L_0x0197:
        r0 = move-exception;
        monitor-exit(r10);	 Catch:{ all -> 0x0197 }
        goto L_0x0196;	 Catch:{ all -> 0x0197 }
    L_0x019a:
        r2 = move-exception;
        goto L_0x01ba;
    L_0x019c:
        r1 = move-exception;
        r4 = r3;
        goto L_0x01a6;
    L_0x019f:
        r2 = move-exception;
        r3 = r4;
        goto L_0x01d2;
    L_0x01a2:
        r2 = move-exception;
        r3 = r4;
        goto L_0x01ba;
    L_0x01a5:
        r1 = move-exception;
    L_0x01a6:
        r0 = "Error opening app state logging file";	 Catch:{ Throwable -> 0x01a2, all -> 0x019f }
        X.AnonymousClass1p5.m13356E(r11, r0, r1);	 Catch:{ Throwable -> 0x01a2, all -> 0x019f }
        if (r4 == 0) goto L_0x0038;	 Catch:{ Throwable -> 0x01a2, all -> 0x019f }
    L_0x01ad:
        r4.m13338A();	 Catch:{ IOException -> 0x01b2 }
        goto L_0x0038;	 Catch:{ IOException -> 0x01b2 }
    L_0x01b2:
        r1 = move-exception;
        r0 = "Failed to close log file";
        X.AnonymousClass1p5.m13356E(r11, r0, r1);
        goto L_0x0038;
    L_0x01ba:
        r0 = r11.f23094V;	 Catch:{ all -> 0x01d1 }
        if (r0 == 0) goto L_0x01d0;	 Catch:{ all -> 0x01d1 }
    L_0x01be:
        if (r3 == 0) goto L_0x01d0;	 Catch:{ all -> 0x01d1 }
    L_0x01c0:
        r0 = 18;	 Catch:{ all -> 0x01d1 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ Exception -> 0x01ca }
        r3.m13340C(r0);	 Catch:{ Exception -> 0x01ca }
        goto L_0x01d0;	 Catch:{ Exception -> 0x01ca }
    L_0x01ca:
        r1 = move-exception;
        r0 = "Error while trying to update status";	 Catch:{ all -> 0x01d1 }
        X.AnonymousClass1p5.m13356E(r11, r0, r1);	 Catch:{ all -> 0x01d1 }
    L_0x01d0:
        throw r2;	 Catch:{ all -> 0x01d1 }
    L_0x01d1:
        r2 = move-exception;
    L_0x01d2:
        if (r3 == 0) goto L_0x01de;
    L_0x01d4:
        r3.m13338A();	 Catch:{ IOException -> 0x01d8 }
        goto L_0x01de;	 Catch:{ IOException -> 0x01d8 }
    L_0x01d8:
        r1 = move-exception;
        r0 = "Failed to close log file";
        X.AnonymousClass1p5.m13356E(r11, r0, r1);
    L_0x01de:
        throw r2;
    L_0x01df:
        r2 = move-exception;
        monitor-exit(r11);	 Catch:{ all -> 0x01df }
        goto L_0x01de;	 Catch:{ all -> 0x01df }
    L_0x01e2:
        r0 = move-exception;	 Catch:{ InterruptedException -> 0x00b3 }
        monitor-exit(r1);	 Catch:{ InterruptedException -> 0x00b3 }
        throw r0;	 Catch:{ InterruptedException -> 0x00b3 }
    L_0x01e5:
        r0 = move-exception;	 Catch:{ all -> 0x018c }
        monitor-exit(r8);	 Catch:{ all -> 0x018c }
        throw r0;	 Catch:{ all -> 0x018c }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1p5.F():void");
    }

    /* renamed from: G */
    private static void m13358G(AnonymousClass1p5 anonymousClass1p5, AnonymousClass1ou anonymousClass1ou, AppState appState, Map map, AnonymousClass2Ot anonymousClass2Ot) {
        anonymousClass1ou.m13340C(Integer.valueOf(2));
        AnonymousClass1p5.m13355D(anonymousClass1p5, anonymousClass1ou, appState, map, anonymousClass2Ot);
        if (!AnonymousClass1GY.D(anonymousClass1p5.f23080H.intValue(), 0)) {
            return;
        }
        if (AnonymousClass1GY.D(anonymousClass1p5.f23076D.intValue(), 1)) {
            anonymousClass1ou.m13340C(Integer.valueOf(16));
            return;
        }
        if (!AnonymousClass1GY.D(anonymousClass1p5.f23076D.intValue(), 2)) {
            if (anonymousClass1p5.f23092T == -1 || SystemClock.elapsedRealtime() - anonymousClass1p5.f23092T >= ((long) anonymousClass1p5.f23074B)) {
                anonymousClass1ou.m13340C(Integer.valueOf(3));
                return;
            }
            synchronized (anonymousClass1p5) {
                anonymousClass1p5.f23076D = Integer.valueOf(2);
            }
        }
        anonymousClass1ou.m13340C(Integer.valueOf(17));
    }

    public final void run() {
        try {
            m13357F();
        } catch (Throwable th) {
            AnonymousClass1p5.m13356E(this, "Unhandled exception in AppStateLoggerThread.run", th);
        }
    }
}
