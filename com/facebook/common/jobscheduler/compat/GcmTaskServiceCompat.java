package com.facebook.common.jobscheduler.compat;

import X.AnonymousClass0Dc;
import X.AnonymousClass0cQ;
import X.AnonymousClass1En;
import X.AnonymousClass1Eo;
import X.AnonymousClass1FD;
import X.AnonymousClass1FJ;
import X.AnonymousClass1aL;
import X.AnonymousClass1aM;
import X.AnonymousClass1aN;
import X.AnonymousClass1aQ;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.gcm.Task;
import java.util.concurrent.TimeUnit;

public abstract class GcmTaskServiceCompat extends AnonymousClass1FD {
    private static final long ALLOWED_JOB_TIME_MILLIS;
    private static final long RETRY_DELAY_MS;

    public abstract AnonymousClass1FJ getRunJobLogic();

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        RETRY_DELAY_MS = timeUnit.toMillis(5);
        ALLOWED_JOB_TIME_MILLIS = timeUnit.toMillis(2);
    }

    private static void cancelAlarmFallback(Context context, String str, Class cls) {
        PendingIntent service = PendingIntent.getService(context, 0, makeAlarmManagerIntent(context, str, cls), 536870912);
        if (service != null) {
            ((AlarmManager) context.getSystemService("alarm")).cancel(service);
        }
    }

    public static void cancelJob(Context context, String str, Class cls) {
        try {
            AnonymousClass1aL B = AnonymousClass1aL.m11917B(context);
            Parcelable componentName = new ComponentName(B.f20333B, cls);
            AnonymousClass1aL.m11918C(str);
            AnonymousClass1aL.m11919D(B, componentName.getClassName());
            Intent E = AnonymousClass1aL.m11920E(B);
            if (E != null) {
                E.putExtra("scheduler_action", "CANCEL_TASK");
                E.putExtra("tag", str);
                E.putExtra("component", componentName);
                B.f20333B.sendBroadcast(E);
            }
        } catch (IllegalArgumentException e) {
            AnonymousClass1aM.m11922B(context, new ComponentName(context, cls), e);
        }
        cancelAlarmFallback(context, str, cls);
    }

    public static int getJobIdFromTag(String str) {
        return Integer.parseInt(str);
    }

    private static Intent makeAlarmManagerIntent(Context context, String str, Class cls) {
        return new Intent(context, cls).setAction(makeTryScheduleAction(str)).setPackage(context.getPackageName());
    }

    public static String makeTag(int i) {
        return String.valueOf(i);
    }

    private static String makeTryScheduleAction(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat.gms.TRY_SCHEDULE-");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    private static Intent makeTryScheduleIntent(Context context, Task task, int i) {
        try {
            context = makeAlarmManagerIntent(context, task.f16002B, Class.forName(task.f16003C));
            AnonymousClass1aN anonymousClass1aN = new AnonymousClass1aN(task, i);
            Bundle bundle = new Bundle();
            bundle.putString("job_tag", anonymousClass1aN.f20336C);
            bundle.putParcelable("task", anonymousClass1aN.f20337D);
            bundle.putInt("num_failures", anonymousClass1aN.f20335B);
            context.putExtras(bundle);
            return context;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final int onRunTask(X.AnonymousClass1aO r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r10 = this;
        r4 = android.os.SystemClock.uptimeMillis();
        r3 = r11.f20339C;
        r7 = 1;
        r1 = X.AnonymousClass1aI.m11915B(r10, r7);
        r0 = "[0-9]+";
        r0 = r3.matches(r0);
        r9 = 0;
        if (r0 == 0) goto L_0x0019;
    L_0x0014:
        r8 = getJobIdFromTag(r3);
        goto L_0x001a;
    L_0x0019:
        r8 = 0;
    L_0x001a:
        r0 = r10.getClass();
        r0 = r1.m11916A(r8, r0);
        if (r0 != 0) goto L_0x0037;
    L_0x0024:
        r2 = "GcmTaskServiceCompat";
        r1 = "Invalid GCM task id, cancelling: %s";
        r0 = new java.lang.Object[r7];
        r0[r9] = r3;
        X.AnonymousClass0Dc.m1245H(r2, r1, r0);
        r0 = r10.getClass();
        cancelJob(r10, r3, r0);
        return r9;
    L_0x0037:
        r6 = new X.1aP;
        r6.<init>();
        r0 = r11.f20338B;
        if (r0 != 0) goto L_0x0043;
    L_0x0040:
        r1 = android.os.Bundle.EMPTY;
        goto L_0x0045;
    L_0x0043:
        r1 = r11.f20338B;
    L_0x0045:
        r0 = r10.getRunJobLogic();
        r0 = r0.onStartJob(r8, r1, r6);
        if (r0 == 0) goto L_0x0072;
    L_0x004f:
        r0 = android.os.SystemClock.uptimeMillis();
        r0 = r0 - r4;
        r2 = ALLOWED_JOB_TIME_MILLIS;	 Catch:{ TimeoutException -> 0x0069 }
        r2 = r2 - r0;	 Catch:{ TimeoutException -> 0x0069 }
        r4 = android.os.SystemClock.uptimeMillis();	 Catch:{ TimeoutException -> 0x0069 }
        r4 = r4 + r2;	 Catch:{ TimeoutException -> 0x0069 }
    L_0x005c:
        r1 = r6.f20340B;	 Catch:{ InterruptedException -> 0x007d }
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x007d }
        r0 = r1.await(r2, r0);	 Catch:{ InterruptedException -> 0x007d }
        if (r0 == 0) goto L_0x0077;	 Catch:{ InterruptedException -> 0x007d }
    L_0x0066:
        r0 = r6.f20341C;	 Catch:{ InterruptedException -> 0x007d }
        goto L_0x0073;	 Catch:{ InterruptedException -> 0x007d }
    L_0x0069:
        r0 = r10.getRunJobLogic();
        r0 = r0.onStopJob(r8);
        goto L_0x0073;
    L_0x0072:
        r0 = 0;
    L_0x0073:
        if (r0 == 0) goto L_0x0076;
    L_0x0075:
        return r7;
    L_0x0076:
        return r9;
    L_0x0077:
        r0 = new java.util.concurrent.TimeoutException;	 Catch:{ InterruptedException -> 0x007d }
        r0.<init>();	 Catch:{ InterruptedException -> 0x007d }
        throw r0;	 Catch:{ InterruptedException -> 0x007d }
    L_0x007d:
        r0 = android.os.SystemClock.uptimeMillis();	 Catch:{ TimeoutException -> 0x0069 }
        r2 = r4 - r0;	 Catch:{ TimeoutException -> 0x0069 }
        goto L_0x005c;	 Catch:{ TimeoutException -> 0x0069 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat.onRunTask(X.1aO):int");
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int J = AnonymousClass0cQ.m5860J(this, 2000333845);
        if (intent != null) {
            try {
                String action = intent.getAction();
                if (action == null) {
                    AnonymousClass0cQ.m5861K(this, 852979966, J);
                    return 2;
                } else if (action.startsWith("com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat.gms.TRY_SCHEDULE-")) {
                    AnonymousClass1aN anonymousClass1aN = new AnonymousClass1aN(intent.getExtras());
                    scheduleJobWithPossibleJobFallback(this, anonymousClass1aN.f20337D, anonymousClass1aN.f20335B);
                    AnonymousClass0cQ.m5861K(this, 1283764449, J);
                    return 2;
                } else if (action.startsWith("com.google")) {
                    r1 = super.onStartCommand(intent, i, i2);
                    AnonymousClass0cQ.m5861K(this, 609333806, J);
                    return r1;
                } else {
                    r1 = getRunJobLogic().onStartCommand(intent, i, i2, this);
                    AnonymousClass0cQ.m5861K(this, -1133190647, J);
                    return r1;
                }
            } catch (Throwable e) {
                AnonymousClass0Dc.m1244G("GcmTaskServiceCompat", "Unexpected service start parameters", e);
                AnonymousClass0cQ.m5861K(this, -647072025, J);
                return 2;
            }
        }
        AnonymousClass1aQ anonymousClass1aQ = new AnonymousClass1aQ("Received a null intent, did you ever return START_STICKY?");
        AnonymousClass0cQ.m5861K(this, -1344329694, J);
        throw anonymousClass1aQ;
    }

    public static void scheduleJobWithPossibleJobFallback(Context context, Task task) {
        scheduleJobWithPossibleJobFallback(context, task, 0);
    }

    private static void scheduleJobWithPossibleJobFallback(Context context, Task task, int i) {
        AnonymousClass1Eo anonymousClass1Eo = AnonymousClass1En.f15943B;
        int B = anonymousClass1Eo.m10244B(context);
        if (B == 0) {
            try {
                AnonymousClass1aL.m11917B(context).m11921A(task);
            } catch (IllegalArgumentException e) {
                AnonymousClass1aM.m11922B(context, new ComponentName(context, task.f16003C), e);
            }
        } else if (i >= 3) {
            AnonymousClass0Dc.m1259V("GcmTaskServiceCompat", "Job %s was not scheduled because Google Play Services became consistentlyunavailable after initial check: %s", task.f16002B, anonymousClass1Eo.m10243A(B));
        } else {
            anonymousClass1Eo.m10243A(B);
            setAlarmFallback(context, task, i + 1);
        }
    }

    private static void setAlarmFallback(Context context, Task task, int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + RETRY_DELAY_MS;
        ((AlarmManager) context.getSystemService("alarm")).set(2, elapsedRealtime, PendingIntent.getService(context, 0, makeTryScheduleIntent(context, task, i), 134217728));
    }
}
