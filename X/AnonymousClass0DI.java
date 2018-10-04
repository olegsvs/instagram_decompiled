package X;

/* renamed from: X.0DI */
public final class AnonymousClass0DI implements AnonymousClass0DH {
    /* renamed from: B */
    private static java.lang.String m1194B(java.lang.String r17, long r18) {
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
        r16 = 0;
        r11 = r17;
        if (r17 != 0) goto L_0x0007;
    L_0x0006:
        return r16;
    L_0x0007:
        r4 = 0;
        r9 = new java.io.BufferedReader;	 Catch:{ ParseException -> 0x00e5, IOException -> 0x00d9, NumberFormatException -> 0x00cd }
        r1 = new java.io.FileReader;	 Catch:{ ParseException -> 0x00e5, IOException -> 0x00d9, NumberFormatException -> 0x00cd }
        r0 = "/data/anr/traces.txt";	 Catch:{ ParseException -> 0x00e5, IOException -> 0x00d9, NumberFormatException -> 0x00cd }
        r1.<init>(r0);	 Catch:{ ParseException -> 0x00e5, IOException -> 0x00d9, NumberFormatException -> 0x00cd }
        r9.<init>(r1);	 Catch:{ ParseException -> 0x00e5, IOException -> 0x00d9, NumberFormatException -> 0x00cd }
        r0 = "----- pid (\\d+) at (\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}).* -----";	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r10 = java.util.regex.Pattern.compile(r0);	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r0 = "----- end (\\d+) -----";	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r8 = java.util.regex.Pattern.compile(r0);	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r0 = "Cmd line: (.*)";	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r7 = java.util.regex.Pattern.compile(r0);	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r6 = new java.lang.StringBuffer;	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r6.<init>();	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r15 = 0;	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r5 = -1;	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
    L_0x002d:
        r3 = r9.readLine();	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        if (r3 == 0) goto L_0x005a;	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
    L_0x0033:
        r12 = 1;	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        if (r15 == 0) goto L_0x005e;	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
    L_0x0036:
        r6.append(r3);	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r0 = "\n";	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r6.append(r0);	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r1 = r8.matcher(r3);	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r0 = r1.find();	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        if (r0 == 0) goto L_0x002d;	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
    L_0x0048:
        r0 = r1.group(r12);	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        if (r5 != r0) goto L_0x005a;	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
    L_0x0052:
        r0 = r6.toString();	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r9.close();	 Catch:{ ParseException -> 0x00e5, IOException -> 0x00d9, NumberFormatException -> 0x00cd }
        return r0;	 Catch:{ ParseException -> 0x00e5, IOException -> 0x00d9, NumberFormatException -> 0x00cd }
    L_0x005a:
        r9.close();	 Catch:{ ParseException -> 0x00e5, IOException -> 0x00d9, NumberFormatException -> 0x00cd }
        goto L_0x0006;	 Catch:{ ParseException -> 0x00e5, IOException -> 0x00d9, NumberFormatException -> 0x00cd }
    L_0x005e:
        r1 = r10.matcher(r3);	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r0 = r1.find();	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        if (r0 == 0) goto L_0x002d;	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
    L_0x0068:
        r6.setLength(r4);	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r0 = r1.group(r12);	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r5 = java.lang.Integer.parseInt(r0);	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r0 = 2;	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r2 = r1.group(r0);	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r1 = new java.text.SimpleDateFormat;	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r0 = "yyyy-MM-dd HH:mm:ss";	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r1.<init>(r0);	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r0 = r1.parse(r2);	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r13 = r0.getTime();	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r2 = r9.readLine();	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r1 = r7.matcher(r2);	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r0 = r1.find();	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        if (r0 == 0) goto L_0x002d;	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
    L_0x0095:
        r0 = r1.group(r12);	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r0 = r0.equals(r11);	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        if (r0 == 0) goto L_0x002d;	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
    L_0x009f:
        r0 = r18 - r13;	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r12 = java.lang.Math.abs(r0);	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r0 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1));	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        if (r0 >= 0) goto L_0x002d;	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
    L_0x00ab:
        r6.append(r3);	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r0 = "\n";	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r6.append(r0);	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r6.append(r2);	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r6.append(r0);	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        r15 = 1;	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
        goto L_0x002d;	 Catch:{ Throwable -> 0x00c0, all -> 0x00bc }
    L_0x00bc:
        r1 = move-exception;
        r0 = r16;
        goto L_0x00c3;
    L_0x00c0:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00c2 }
    L_0x00c2:
        r1 = move-exception;
    L_0x00c3:
        if (r0 == 0) goto L_0x00c9;
    L_0x00c5:
        r9.close();	 Catch:{ Throwable -> 0x00cc }
        goto L_0x00cc;	 Catch:{ Throwable -> 0x00cc }
    L_0x00c9:
        r9.close();	 Catch:{ ParseException -> 0x00e5, IOException -> 0x00d9, NumberFormatException -> 0x00cd }
    L_0x00cc:
        throw r1;	 Catch:{ ParseException -> 0x00e5, IOException -> 0x00d9, NumberFormatException -> 0x00cd }
    L_0x00cd:
        r3 = move-exception;
        r2 = X.AnonymousClass0DL.f1858B;
        r1 = "Failed to extract pid from ANR traces.";
        r0 = new java.lang.Object[r4];
        X.AnonymousClass0Dc.m1246I(r2, r3, r1, r0);
        goto L_0x0006;
    L_0x00d9:
        r3 = move-exception;
        r2 = X.AnonymousClass0DL.f1858B;
        r1 = "Failed to read ANR traces.";
        r0 = new java.lang.Object[r4];
        X.AnonymousClass0Dc.m1246I(r2, r3, r1, r0);
        goto L_0x0006;
    L_0x00e5:
        r3 = move-exception;
        r2 = X.AnonymousClass0DL.f1858B;
        r1 = "Failed to parse ANR timestamp.";
        r0 = new java.lang.Object[r4];
        X.AnonymousClass0Dc.m1246I(r2, r3, r1, r0);
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0DI.B(java.lang.String, long):java.lang.String");
    }

    public final boolean zU(X.AnonymousClass0DE r10, X.AnonymousClass1Jc r11, java.lang.String r12) {
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
        r9 = this;
        r0 = X.AnonymousClass0DE.m1122O(r10);
        r6 = 1;
        r4 = 0;
        if (r0 != 0) goto L_0x0014;
    L_0x0008:
        r1 = r10.f1821B;
        r0 = "traces";
        r0 = r1.getDir(r0, r4);
        X.AnonymousClass0DE.m1116I(r0);
        return r6;
    L_0x0014:
        r5 = r11.f17092C;
        r9 = r5.getName();
        r3 = new java.io.FileInputStream;	 Catch:{ RuntimeException -> 0x00c8, IOException -> 0x00b8, 00V -> 0x00ab }
        r3.<init>(r5);	 Catch:{ RuntimeException -> 0x00c8, IOException -> 0x00b8, 00V -> 0x00ab }
        r0 = 0;	 Catch:{ RuntimeException -> 0x00c8, IOException -> 0x00b8, 00V -> 0x00ab }
        r7 = new X.1Jd;	 Catch:{ Throwable -> 0x00a1 }
        r7.<init>();	 Catch:{ Throwable -> 0x00a1 }
        r7.m10724B(r3);	 Catch:{ Throwable -> 0x00a1 }
        r1 = "should_upload_system_anr_traces_gk_cached";	 Catch:{ Throwable -> 0x00a1 }
        r1 = X.AnonymousClass0DL.m1198D(r1);	 Catch:{ Throwable -> 0x00a1 }
        if (r1 == 0) goto L_0x006d;	 Catch:{ Throwable -> 0x00a1 }
    L_0x0030:
        r1 = "anr_with_sigquit_traces";	 Catch:{ Throwable -> 0x00a1 }
        r1 = r7.containsKey(r1);	 Catch:{ Throwable -> 0x00a1 }
        if (r1 != 0) goto L_0x006d;	 Catch:{ Throwable -> 0x00a1 }
    L_0x0038:
        r1 = "PROCESS_NAME";	 Catch:{ Throwable -> 0x00a1 }
        r8 = r7.m10723A(r1);	 Catch:{ Throwable -> 0x00a1 }
        r1 = "TIME_OF_CRASH";	 Catch:{ Throwable -> 0x00a1 }
        r1 = r7.m10723A(r1);	 Catch:{ Throwable -> 0x00a1 }
        r1 = java.lang.Long.parseLong(r1);	 Catch:{ Throwable -> 0x00a1 }
        r1 = X.AnonymousClass0DI.m1194B(r8, r1);	 Catch:{ Throwable -> 0x00a1 }
        if (r1 == 0) goto L_0x0066;	 Catch:{ Throwable -> 0x00a1 }
    L_0x004e:
        r2 = "SIGQUIT";	 Catch:{ Throwable -> 0x00a1 }
        r7.remove(r2);	 Catch:{ Throwable -> 0x00a1 }
        r1 = r1.getBytes();	 Catch:{ Throwable -> 0x00a1 }
        r1 = X.AnonymousClass0DE.m1109B(r1);	 Catch:{ Throwable -> 0x00a1 }
        r7.put(r2, r1);	 Catch:{ Throwable -> 0x00a1 }
        r2 = "anr_system_traces_present";	 Catch:{ Throwable -> 0x00a1 }
        r1 = "true";	 Catch:{ Throwable -> 0x00a1 }
        r7.put(r2, r1);	 Catch:{ Throwable -> 0x00a1 }
        goto L_0x006d;	 Catch:{ Throwable -> 0x00a1 }
    L_0x0066:
        r2 = "anr_system_traces_present";	 Catch:{ Throwable -> 0x00a1 }
        r1 = "false";	 Catch:{ Throwable -> 0x00a1 }
        r7.put(r2, r1);	 Catch:{ Throwable -> 0x00a1 }
    L_0x006d:
        r1 = "UPLOADED_BY_PROCESS";	 Catch:{ Throwable -> 0x00a1 }
        r7.put(r1, r12);	 Catch:{ Throwable -> 0x00a1 }
        r1 = "anr_recovery_delay";	 Catch:{ Throwable -> 0x00a1 }
        r2 = X.AnonymousClass0DE.m1111D(r1);	 Catch:{ Throwable -> 0x00a1 }
        if (r2 == 0) goto L_0x007d;	 Catch:{ Throwable -> 0x00a1 }
    L_0x007a:
        r7.put(r1, r2);	 Catch:{ Throwable -> 0x00a1 }
    L_0x007d:
        r1 = "anr_system_error_msg";	 Catch:{ Throwable -> 0x00a1 }
        r2 = X.AnonymousClass0DE.m1111D(r1);	 Catch:{ Throwable -> 0x00a1 }
        if (r2 == 0) goto L_0x0088;	 Catch:{ Throwable -> 0x00a1 }
    L_0x0085:
        r7.put(r1, r2);	 Catch:{ Throwable -> 0x00a1 }
    L_0x0088:
        r1 = "anr_system_tag";	 Catch:{ Throwable -> 0x00a1 }
        r2 = X.AnonymousClass0DE.m1111D(r1);	 Catch:{ Throwable -> 0x00a1 }
        if (r2 == 0) goto L_0x0093;	 Catch:{ Throwable -> 0x00a1 }
    L_0x0090:
        r7.put(r1, r2);	 Catch:{ Throwable -> 0x00a1 }
    L_0x0093:
        X.AnonymousClass0DE.m1121N(r10, r7);	 Catch:{ Throwable -> 0x00a1 }
        X.AnonymousClass0DE.m1110C(r5);	 Catch:{ Throwable -> 0x00a1 }
        r3.close();	 Catch:{ RuntimeException -> 0x00c8, IOException -> 0x00b8, 00V -> 0x00ab }
        return r6;	 Catch:{ RuntimeException -> 0x00c8, IOException -> 0x00b8, 00V -> 0x00ab }
    L_0x009d:
        r1 = move-exception;
        if (r0 == 0) goto L_0x00a7;
    L_0x00a0:
        goto L_0x00a3;
    L_0x00a1:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x009d }
    L_0x00a3:
        r3.close();	 Catch:{ Throwable -> 0x00aa }
        goto L_0x00aa;	 Catch:{ Throwable -> 0x00aa }
    L_0x00a7:
        r3.close();	 Catch:{ RuntimeException -> 0x00c8, IOException -> 0x00b8, 00V -> 0x00ab }
    L_0x00aa:
        throw r1;	 Catch:{ RuntimeException -> 0x00c8, IOException -> 0x00b8, 00V -> 0x00ab }
    L_0x00ab:
        r3 = move-exception;
        r2 = X.AnonymousClass0DL.f1858B;
        r1 = "Failed to send crash report for %s";
        r0 = new java.lang.Object[r6];
        r0[r4] = r9;
        X.AnonymousClass0Dc.m1246I(r2, r3, r1, r0);
        return r4;
    L_0x00b8:
        r3 = move-exception;
        r2 = X.AnonymousClass0DL.f1858B;
        r1 = "Failed to load crash report for %s";
        r0 = new java.lang.Object[r6];
        r0[r4] = r9;
        X.AnonymousClass0Dc.m1246I(r2, r3, r1, r0);
        X.AnonymousClass0DE.m1110C(r5);
        return r4;
    L_0x00c8:
        r3 = move-exception;
        r2 = X.AnonymousClass0DL.f1858B;
        r1 = "Failed to send crash reports";
        r0 = new java.lang.Object[r4];
        X.AnonymousClass0Dc.m1246I(r2, r3, r1, r0);
        X.AnonymousClass0DE.m1110C(r5);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0DI.zU(X.0DE, X.1Jc, java.lang.String):boolean");
    }
}
