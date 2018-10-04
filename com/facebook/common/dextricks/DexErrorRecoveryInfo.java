package com.facebook.common.dextricks;

import java.io.PrintWriter;

public final class DexErrorRecoveryInfo {
    public Throwable fallbackCause;
    public int loadResult;
    public String odexSchemeName;
    public Throwable regenRetryCause;
    public Throwable xdexFailureCause;

    private static void printExOrNull(PrintWriter printWriter, String str, Throwable th) {
        printWriter.format(" %s=", new Object[]{str});
        if (th == null) {
            printWriter.append("null");
            return;
        }
        printWriter.append("[");
        th.printStackTrace(printWriter);
        printWriter.append("]");
    }

    public java.lang.String toString() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r8 = this;
        r3 = new java.io.StringWriter;	 Catch:{ IOException -> 0x0072 }
        r3.<init>();	 Catch:{ IOException -> 0x0072 }
        r7 = 0;	 Catch:{ IOException -> 0x0072 }
        r4 = new java.io.PrintWriter;	 Catch:{ Throwable -> 0x0068 }
        r4.<init>(r3);	 Catch:{ Throwable -> 0x0068 }
        r0 = "<DexErrorRecoveryInfo";	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r4.append(r0);	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r2 = " loadResult=%x";	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r6 = 1;	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r1 = new java.lang.Object[r6];	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r0 = r8.loadResult;	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r5 = 0;	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r1[r5] = r0;	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r4.format(r2, r1);	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r2 = " odexSchemeName=%s";	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r1 = new java.lang.Object[r6];	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r0 = r8.odexSchemeName;	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r1[r5] = r0;	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r4.format(r2, r1);	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r1 = "regenRetryCause";	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r0 = r8.regenRetryCause;	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        printExOrNull(r4, r1, r0);	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r1 = "fallbackCause";	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r0 = r8.fallbackCause;	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        printExOrNull(r4, r1, r0);	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r1 = "xdexFailureCause";	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r0 = r8.xdexFailureCause;	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        printExOrNull(r4, r1, r0);	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r0 = ">";	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r4.append(r0);	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r4.flush();	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r0 = r3.toString();	 Catch:{ Throwable -> 0x0057, all -> 0x0054 }
        r4.close();	 Catch:{ Throwable -> 0x0068 }
        r3.close();	 Catch:{ IOException -> 0x0072 }
        return r0;	 Catch:{ IOException -> 0x0072 }
    L_0x0054:
        r0 = move-exception;
        r1 = r7;
        goto L_0x005a;
    L_0x0057:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0059 }
    L_0x0059:
        r0 = move-exception;
    L_0x005a:
        if (r1 == 0) goto L_0x0060;
    L_0x005c:
        r4.close();	 Catch:{ Throwable -> 0x0063 }
        goto L_0x0063;	 Catch:{ Throwable -> 0x0063 }
    L_0x0060:
        r4.close();	 Catch:{ Throwable -> 0x0068 }
    L_0x0063:
        throw r0;	 Catch:{ Throwable -> 0x0068 }
    L_0x0064:
        r0 = move-exception;
        if (r7 == 0) goto L_0x006e;
    L_0x0067:
        goto L_0x006a;
    L_0x0068:
        r7 = move-exception;
        throw r7;	 Catch:{ all -> 0x0064 }
    L_0x006a:
        r3.close();	 Catch:{ Throwable -> 0x0071 }
        goto L_0x0071;	 Catch:{ Throwable -> 0x0071 }
    L_0x006e:
        r3.close();	 Catch:{ IOException -> 0x0072 }
    L_0x0071:
        throw r0;	 Catch:{ IOException -> 0x0072 }
    L_0x0072:
        r0 = new java.lang.AssertionError;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexErrorRecoveryInfo.toString():java.lang.String");
    }
}
