package com.instagram.debug.log;

import X.AnonymousClass0CB;
import X.AnonymousClass0F4;
import X.AnonymousClass0F6;
import X.AnonymousClass0FZ;
import android.content.SharedPreferences;
import com.instagram.debug.log.tags.DLogTag;

public class DLog {
    public static final int DEBUG = 3;
    public static final int ERROR = 6;

    /* renamed from: d */
    public static void m8808d(DLogTag dLogTag, String str, Object... objArr) {
        sendLogLine(dLogTag, 3, String.format(str, objArr));
    }

    /* renamed from: e */
    public static void m8809e(DLogTag dLogTag, String str, Object... objArr) {
        sendLogLine(dLogTag, 6, String.format(str, objArr));
    }

    private static void sendLogLine(DLogTag dLogTag, int i, String str) {
        AnonymousClass0FZ B = AnonymousClass0FZ.m1634B();
        if (shouldLogEvent(dLogTag)) {
            AnonymousClass0F6 dLog$NewLogEvent = new DLog$NewLogEvent(dLogTag, i, str);
            if (B.f2177B.getBoolean("debug_bar_overlay_mode", false)) {
                sendLogLineToOverlay(dLog$NewLogEvent);
            } else {
                AnonymousClass0F4.f2058E.m1505B(dLog$NewLogEvent);
            }
        }
    }

    private static void sendLogLineToOverlay(com.instagram.debug.log.DLog$NewLogEvent r8) {
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
        r0 = "com.instagram.debug.devoptions.DebugOverlayController";	 Catch:{ Exception -> 0x003d }
        r7 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x003d }
        r1 = "getInstance";	 Catch:{ Exception -> 0x003d }
        r6 = 0;	 Catch:{ Exception -> 0x003d }
        r0 = new java.lang.Class[r6];	 Catch:{ Exception -> 0x003d }
        r2 = r7.getMethod(r1, r0);	 Catch:{ Exception -> 0x003d }
        r1 = 0;	 Catch:{ Exception -> 0x003d }
        r0 = new java.lang.Object[r6];	 Catch:{ Exception -> 0x003d }
        r5 = r2.invoke(r1, r0);	 Catch:{ Exception -> 0x003d }
        r1 = r8.logLevel;	 Catch:{ Exception -> 0x003d }
        r0 = 3;	 Catch:{ Exception -> 0x003d }
        if (r1 != r0) goto L_0x001e;	 Catch:{ Exception -> 0x003d }
    L_0x001b:
        r2 = "logDebugMessage";	 Catch:{ Exception -> 0x003d }
        goto L_0x0020;	 Catch:{ Exception -> 0x003d }
    L_0x001e:
        r2 = "logErrorMessage";	 Catch:{ Exception -> 0x003d }
    L_0x0020:
        r4 = 2;	 Catch:{ Exception -> 0x003d }
        r1 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x003d }
        r0 = com.instagram.debug.log.tags.DLogTag.class;	 Catch:{ Exception -> 0x003d }
        r1[r6] = r0;	 Catch:{ Exception -> 0x003d }
        r0 = java.lang.String.class;	 Catch:{ Exception -> 0x003d }
        r3 = 1;	 Catch:{ Exception -> 0x003d }
        r1[r3] = r0;	 Catch:{ Exception -> 0x003d }
        r2 = r7.getMethod(r2, r1);	 Catch:{ Exception -> 0x003d }
        r1 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x003d }
        r0 = r8.logTag;	 Catch:{ Exception -> 0x003d }
        r1[r6] = r0;	 Catch:{ Exception -> 0x003d }
        r0 = r8.message;	 Catch:{ Exception -> 0x003d }
        r1[r3] = r0;	 Catch:{ Exception -> 0x003d }
        r2.invoke(r5, r1);	 Catch:{ Exception -> 0x003d }
    L_0x003d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.log.DLog.sendLogLineToOverlay(com.instagram.debug.log.DLog$NewLogEvent):void");
    }

    private static boolean shouldLogEvent(DLogTag dLogTag) {
        AnonymousClass0FZ B = AnonymousClass0FZ.m1634B();
        if (!AnonymousClass0CB.m840J() && B.f2177B.getBoolean("debug_bar", false)) {
            SharedPreferences sharedPreferences = B.f2177B;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("debug_log_tag_");
            stringBuilder.append(dLogTag.name);
            if (sharedPreferences.getBoolean(stringBuilder.toString(), false)) {
                return true;
            }
        }
        return false;
    }
}
