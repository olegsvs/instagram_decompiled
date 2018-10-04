package X;

import android.app.Notification.Builder;
import android.app.Notification.InboxStyle;
import android.app.NotificationManager;
import android.content.Context;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Queue;

/* renamed from: X.1iq */
public final class AnonymousClass1iq {
    /* renamed from: M */
    private static final String f21845M = AnonymousClass1iq.class.getCanonicalName();
    /* renamed from: B */
    private String f21846B = JsonProperty.USE_DEFAULT_NAME;
    /* renamed from: C */
    private final String f21847C;
    /* renamed from: D */
    private Builder f21848D;
    /* renamed from: E */
    private final Context f21849E;
    /* renamed from: F */
    private final boolean f21850F;
    /* renamed from: G */
    private Queue f21851G;
    /* renamed from: H */
    private final int f21852H;
    /* renamed from: I */
    private final NotificationManager f21853I;
    /* renamed from: J */
    private final String f21854J;
    /* renamed from: K */
    private final String f21855K;
    /* renamed from: L */
    private int f21856L;

    public AnonymousClass1iq(android.content.Context r7, java.lang.String r8, boolean r9, X.AnonymousClass0AH r10) {
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
        r6 = this;
        r6.<init>();
        r0 = "";
        r6.f21846B = r0;
        r2 = 0;
        r6.f21856L = r2;
        r6.f21854J = r8;
        r1 = android.os.Build.VERSION.SDK_INT;
        r5 = 0;
        r0 = 11;
        if (r1 >= r0) goto L_0x0020;
    L_0x0013:
        r6.f21849E = r5;
        r6.f21853I = r5;
        r6.f21847C = r5;
        r6.f21852H = r2;
        r6.f21855K = r5;
        r6.f21850F = r2;
        return;
    L_0x0020:
        r6.f21849E = r7;
        r4 = X.AnonymousClass1Bj.f15443C;
        r3 = r6.f21849E;
        r1 = "notification";
        r0 = android.app.NotificationManager.class;
        r0 = r4.m9877H(r3, r1, r0);
        r0 = (android.app.NotificationManager) r0;
        r6.f21853I = r0;
        r0 = r6.f21849E;	 Catch:{ Throwable -> 0x0042 }
        r1 = r0.getPackageManager();	 Catch:{ Throwable -> 0x0042 }
        r0 = r6.f21849E;	 Catch:{ Throwable -> 0x0042 }
        r0 = r0.getApplicationInfo();	 Catch:{ Throwable -> 0x0042 }
        r5 = r1.getApplicationLabel(r0);	 Catch:{ Throwable -> 0x0042 }
    L_0x0042:
        if (r5 != 0) goto L_0x004b;
    L_0x0044:
        r0 = r6.f21849E;
        r0 = r0.getPackageName();
        goto L_0x004f;
    L_0x004b:
        r0 = r5.toString();
    L_0x004f:
        r6.f21847C = r0;
        r0 = r6.m12709B();
        r6.f21852H = r0;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r0 = "Started on ";
        r3.append(r0);
        r1 = new java.text.SimpleDateFormat;
        r0 = "M/d h:mm:ss a";
        r1.<init>(r0);
        r0 = new java.util.Date;
        r0.<init>();
        r0 = r1.format(r0);
        r3.append(r0);
        r0 = r3.toString();
        r6.f21855K = r0;
        r0 = new java.util.LinkedList;
        r0.<init>();
        r6.f21851G = r0;
        r0 = X.AnonymousClass061.DEBUG;
        r1 = r10.m685A(r0);
        if (r9 != 0) goto L_0x0091;
    L_0x0089:
        r0 = "is_on";
        r0 = r1.m683C(r0, r2);
        if (r0 == 0) goto L_0x0092;
    L_0x0091:
        r2 = 1;
    L_0x0092:
        r6.f21850F = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1iq.<init>(android.content.Context, java.lang.String, boolean, X.0AH):void");
    }

    /* renamed from: A */
    public final void m12711A(java.lang.String r6) {
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
        r5 = this;
        r1 = android.os.Build.VERSION.SDK_INT;
        r0 = 11;
        if (r1 >= r0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r0 = r5.f21850F;
        if (r0 != 0) goto L_0x0015;
    L_0x000b:
        r2 = r5.f21853I;	 Catch:{ RuntimeException -> 0x0014 }
        r1 = f21845M;	 Catch:{ RuntimeException -> 0x0014 }
        r0 = r5.f21852H;	 Catch:{ RuntimeException -> 0x0014 }
        r2.cancel(r1, r0);	 Catch:{ RuntimeException -> 0x0014 }
    L_0x0014:
        return;
    L_0x0015:
        monitor-enter(r5);
        r4 = 0;
        r5.f21856L = r4;	 Catch:{ all -> 0x00b2 }
        r5.f21846B = r6;	 Catch:{ all -> 0x00b2 }
        r0 = "CONNECTED";	 Catch:{ all -> 0x00b2 }
        r0 = r0.equals(r6);	 Catch:{ all -> 0x00b2 }
        r2 = -65536; // 0xffffffffffff0000 float:NaN double:NaN;	 Catch:{ all -> 0x00b2 }
        r3 = 17301608; // 0x1080068 float:2.4979546E-38 double:8.54813E-317;	 Catch:{ all -> 0x00b2 }
        if (r0 == 0) goto L_0x002f;	 Catch:{ all -> 0x00b2 }
    L_0x0028:
        r3 = 17301611; // 0x108006b float:2.4979555E-38 double:8.5481316E-317;	 Catch:{ all -> 0x00b2 }
        r2 = -16711936; // 0xffffffffff00ff00 float:-1.7146522E38 double:NaN;	 Catch:{ all -> 0x00b2 }
        goto L_0x0042;	 Catch:{ all -> 0x00b2 }
    L_0x002f:
        r0 = "CONNECTING";	 Catch:{ all -> 0x00b2 }
        r0 = r0.equals(r6);	 Catch:{ all -> 0x00b2 }
        if (r0 == 0) goto L_0x003d;	 Catch:{ all -> 0x00b2 }
    L_0x0037:
        r3 = 17301607; // 0x1080067 float:2.4979544E-38 double:8.5481296E-317;	 Catch:{ all -> 0x00b2 }
        r2 = -256; // 0xffffffffffffff00 float:NaN double:NaN;	 Catch:{ all -> 0x00b2 }
        goto L_0x0042;	 Catch:{ all -> 0x00b2 }
    L_0x003d:
        r0 = "DISCONNECTED";	 Catch:{ all -> 0x00b2 }
        r0.equals(r6);	 Catch:{ all -> 0x00b2 }
    L_0x0042:
        r1 = new android.app.Notification$Builder;	 Catch:{ all -> 0x00b2 }
        r0 = r5.f21849E;	 Catch:{ all -> 0x00b2 }
        r1.<init>(r0);	 Catch:{ all -> 0x00b2 }
        r3 = r1.setSmallIcon(r3);	 Catch:{ all -> 0x00b2 }
        r1 = r5.f21849E;	 Catch:{ all -> 0x00b2 }
        r0 = new android.content.Intent;	 Catch:{ all -> 0x00b2 }
        r0.<init>();	 Catch:{ all -> 0x00b2 }
        r0 = android.app.PendingIntent.getActivity(r1, r4, r0, r4);	 Catch:{ all -> 0x00b2 }
        r3 = r3.setContentIntent(r0);	 Catch:{ all -> 0x00b2 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b2 }
        r1.<init>();	 Catch:{ all -> 0x00b2 }
        r0 = r5.f21847C;	 Catch:{ all -> 0x00b2 }
        r1.append(r0);	 Catch:{ all -> 0x00b2 }
        r0 = " [";	 Catch:{ all -> 0x00b2 }
        r1.append(r0);	 Catch:{ all -> 0x00b2 }
        r0 = r5.f21854J;	 Catch:{ all -> 0x00b2 }
        r1.append(r0);	 Catch:{ all -> 0x00b2 }
        r0 = "]";	 Catch:{ all -> 0x00b2 }
        r1.append(r0);	 Catch:{ all -> 0x00b2 }
        r0 = r1.toString();	 Catch:{ all -> 0x00b2 }
        r0 = r3.setContentTitle(r0);	 Catch:{ all -> 0x00b2 }
        r1 = r0.setContentText(r6);	 Catch:{ all -> 0x00b2 }
        r0 = 1;	 Catch:{ all -> 0x00b2 }
        r0 = r1.setOngoing(r0);	 Catch:{ all -> 0x00b2 }
        r5.f21848D = r0;	 Catch:{ all -> 0x00b2 }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x00b2 }
        r0 = 21;	 Catch:{ all -> 0x00b2 }
        if (r1 < r0) goto L_0x0093;	 Catch:{ all -> 0x00b2 }
    L_0x008e:
        r0 = r5.f21848D;	 Catch:{ all -> 0x00b2 }
        r0.setColor(r2);	 Catch:{ all -> 0x00b2 }
    L_0x0093:
        r0 = 16;	 Catch:{ all -> 0x00b2 }
        if (r1 < r0) goto L_0x00a0;	 Catch:{ all -> 0x00b2 }
    L_0x0097:
        r1 = r5.f21848D;	 Catch:{ all -> 0x00b2 }
        r0 = r5.m12710C();	 Catch:{ all -> 0x00b2 }
        r1.setStyle(r0);	 Catch:{ all -> 0x00b2 }
    L_0x00a0:
        r3 = r5.f21853I;	 Catch:{ all -> 0x00b2 }
        r2 = f21845M;	 Catch:{ all -> 0x00b2 }
        r1 = r5.f21852H;	 Catch:{ all -> 0x00b2 }
        r0 = r5.f21848D;	 Catch:{ all -> 0x00b2 }
        r0 = r0.getNotification();	 Catch:{ all -> 0x00b2 }
        r3.notify(r2, r1, r0);	 Catch:{ all -> 0x00b2 }
        monitor-exit(r5);	 Catch:{ all -> 0x00b2 }
        goto L_0x0006;	 Catch:{ all -> 0x00b2 }
    L_0x00b2:
        r0 = move-exception;	 Catch:{ all -> 0x00b2 }
        monitor-exit(r5);	 Catch:{ all -> 0x00b2 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1iq.A(java.lang.String):void");
    }

    /* renamed from: B */
    private int m12709B() {
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
        r4 = this;
        r3 = android.os.Process.myPid();	 Catch:{ Throwable -> 0x002d }
        r1 = r4.f21849E;	 Catch:{ Throwable -> 0x002d }
        r0 = "activity";	 Catch:{ Throwable -> 0x002d }
        r0 = r1.getSystemService(r0);	 Catch:{ Throwable -> 0x002d }
        r0 = (android.app.ActivityManager) r0;	 Catch:{ Throwable -> 0x002d }
        r0 = r0.getRunningAppProcesses();	 Catch:{ Throwable -> 0x002d }
        r2 = r0.iterator();	 Catch:{ Throwable -> 0x002d }
    L_0x0016:
        r0 = r2.hasNext();	 Catch:{ Throwable -> 0x002d }
        if (r0 == 0) goto L_0x002d;	 Catch:{ Throwable -> 0x002d }
    L_0x001c:
        r1 = r2.next();	 Catch:{ Throwable -> 0x002d }
        r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1;	 Catch:{ Throwable -> 0x002d }
        r0 = r1.pid;	 Catch:{ Throwable -> 0x002d }
        if (r0 != r3) goto L_0x0016;	 Catch:{ Throwable -> 0x002d }
    L_0x0026:
        r0 = r1.processName;	 Catch:{ Throwable -> 0x002d }
        r0 = r0.hashCode();	 Catch:{ Throwable -> 0x002d }
        return r0;	 Catch:{ Throwable -> 0x002d }
    L_0x002d:
        r0 = 42;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1iq.B():int");
    }

    /* renamed from: B */
    public final void m12712B(java.lang.String r5) {
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
        r4 = this;
        r1 = android.os.Build.VERSION.SDK_INT;
        r0 = 16;
        if (r1 >= r0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r0 = r4.f21850F;
        if (r0 != 0) goto L_0x0015;
    L_0x000b:
        r2 = r4.f21853I;	 Catch:{ RuntimeException -> 0x0014 }
        r1 = f21845M;	 Catch:{ RuntimeException -> 0x0014 }
        r0 = r4.f21852H;	 Catch:{ RuntimeException -> 0x0014 }
        r2.cancel(r1, r0);	 Catch:{ RuntimeException -> 0x0014 }
    L_0x0014:
        return;
    L_0x0015:
        r0 = r4.f21848D;
        if (r0 != 0) goto L_0x001a;
    L_0x0019:
        goto L_0x0006;
    L_0x001a:
        monitor-enter(r4);
        r0 = 24;
        if (r1 < r0) goto L_0x002f;
    L_0x001f:
        r1 = r4.f21848D;	 Catch:{ all -> 0x0097 }
        r0 = r4.f21856L;	 Catch:{ all -> 0x0097 }
        r0 = r0 + 1;	 Catch:{ all -> 0x0097 }
        r4.f21856L = r0;	 Catch:{ all -> 0x0097 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0097 }
        r1.setSubText(r0);	 Catch:{ all -> 0x0097 }
        goto L_0x003e;	 Catch:{ all -> 0x0097 }
    L_0x002f:
        r1 = r4.f21848D;	 Catch:{ all -> 0x0097 }
        r0 = r4.f21856L;	 Catch:{ all -> 0x0097 }
        r0 = r0 + 1;	 Catch:{ all -> 0x0097 }
        r4.f21856L = r0;	 Catch:{ all -> 0x0097 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0097 }
        r1.setContentInfo(r0);	 Catch:{ all -> 0x0097 }
    L_0x003e:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0097 }
        r2.<init>();	 Catch:{ all -> 0x0097 }
        r1 = new java.text.SimpleDateFormat;	 Catch:{ all -> 0x0097 }
        r0 = "h:mm:ss a";	 Catch:{ all -> 0x0097 }
        r1.<init>(r0);	 Catch:{ all -> 0x0097 }
        r0 = new java.util.Date;	 Catch:{ all -> 0x0097 }
        r0.<init>();	 Catch:{ all -> 0x0097 }
        r0 = r1.format(r0);	 Catch:{ all -> 0x0097 }
        r2.append(r0);	 Catch:{ all -> 0x0097 }
        r0 = " ";	 Catch:{ all -> 0x0097 }
        r2.append(r0);	 Catch:{ all -> 0x0097 }
        r2.append(r5);	 Catch:{ all -> 0x0097 }
        r1 = r2.toString();	 Catch:{ all -> 0x0097 }
        r0 = r4.f21851G;	 Catch:{ all -> 0x0097 }
        r0.add(r1);	 Catch:{ all -> 0x0097 }
        r0 = r4.f21851G;	 Catch:{ all -> 0x0097 }
        r1 = r0.size();	 Catch:{ all -> 0x0097 }
        r0 = 4;	 Catch:{ all -> 0x0097 }
        if (r1 <= r0) goto L_0x0075;	 Catch:{ all -> 0x0097 }
    L_0x0070:
        r0 = r4.f21851G;	 Catch:{ all -> 0x0097 }
        r0.poll();	 Catch:{ all -> 0x0097 }
    L_0x0075:
        r1 = r4.f21848D;	 Catch:{ all -> 0x0097 }
        r0 = r4.f21846B;	 Catch:{ all -> 0x0097 }
        r1.setContentText(r0);	 Catch:{ all -> 0x0097 }
        r1 = r4.f21848D;	 Catch:{ all -> 0x0097 }
        r0 = r4.m12710C();	 Catch:{ all -> 0x0097 }
        r1.setStyle(r0);	 Catch:{ all -> 0x0097 }
        r3 = r4.f21853I;	 Catch:{ all -> 0x0097 }
        r2 = f21845M;	 Catch:{ all -> 0x0097 }
        r1 = r4.f21852H;	 Catch:{ all -> 0x0097 }
        r0 = r4.f21848D;	 Catch:{ all -> 0x0097 }
        r0 = r0.getNotification();	 Catch:{ all -> 0x0097 }
        r3.notify(r2, r1, r0);	 Catch:{ all -> 0x0097 }
        monitor-exit(r4);	 Catch:{ all -> 0x0097 }
        goto L_0x0006;	 Catch:{ all -> 0x0097 }
    L_0x0097:
        r0 = move-exception;	 Catch:{ all -> 0x0097 }
        monitor-exit(r4);	 Catch:{ all -> 0x0097 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1iq.B(java.lang.String):void");
    }

    /* renamed from: C */
    private InboxStyle m12710C() {
        InboxStyle inboxStyle = new InboxStyle();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f21847C);
        stringBuilder.append(" [");
        stringBuilder.append(this.f21854J);
        stringBuilder.append("]");
        inboxStyle = inboxStyle.setBigContentTitle(stringBuilder.toString()).setSummaryText(this.f21855K);
        for (CharSequence addLine : this.f21851G) {
            inboxStyle.addLine(addLine);
        }
        return inboxStyle;
    }
}
