package X;

import android.content.Context;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.274 */
public final class AnonymousClass274 {
    /* renamed from: E */
    public static final String f26085E = "IgAppStateReporter";
    /* renamed from: B */
    private final AnonymousClass1ow f26086B;
    /* renamed from: C */
    private final AnonymousClass2V9 f26087C;
    /* renamed from: D */
    private final Context f26088D;

    public AnonymousClass274(Context context, AnonymousClass1ow anonymousClass1ow, AnonymousClass2V9 anonymousClass2V9) {
        this.f26088D = context.getApplicationContext();
        this.f26086B = anonymousClass1ow;
        this.f26087C = anonymousClass2V9;
    }

    /* renamed from: A */
    public final void m14487A() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r38 = this;
        X.AnonymousClass0Sy.B();
        r2 = com.facebook.analytics.appstatelogger.AppStateLogger.f23056Q;
        monitor-enter(r2);
        r0 = com.facebook.analytics.appstatelogger.AppStateLogger.f23055P;	 Catch:{ all -> 0x02da }
        if (r0 == 0) goto L_0x02d2;	 Catch:{ all -> 0x02da }
    L_0x000a:
        monitor-exit(r2);	 Catch:{ all -> 0x02da }
        r0 = com.facebook.analytics.appstatelogger.AppStateLogger.f23055P;
        r15 = r0.f23061F;
        r6 = r15.getParentFile();
        r6.getAbsolutePath();
        r1 = new X.273;
        r7 = 0;
        r1.<init>();
        r0 = new X.272;
        r4 = r38;
        r0.<init>(r4, r1);
        r10 = r6.listFiles(r0);
        r0 = 1;
        r5 = 0;
        if (r10 != 0) goto L_0x003b;
    L_0x002b:
        r3 = f26085E;
        r2 = "No app state log files found in app state log directory: %s";
        r1 = new java.lang.Object[r0];
        r0 = r6.getAbsolutePath();
        r1[r5] = r0;
        X.AnonymousClass0Dc.H(r3, r2, r1);
        return;
    L_0x003b:
        r14 = r6.listFiles(r1);
        r5 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r0 = java.lang.System.currentTimeMillis();
        r2 = android.os.SystemClock.elapsedRealtime();
        r0 = r0 - r2;
        r23 = r5.toSeconds(r0);
        r0 = r4.f26088D;
        r5 = X.AnonymousClass1p8.m13361B(r0);
        r3 = r5.f23119B;
        r2 = "frameworkStartTime";
        r0 = 0;
        r25 = r3.getLong(r2, r0);
        r27 = r5.m13363A();
        r13 = r10.length;
        r6 = 0;
        r18 = 0;
    L_0x0066:
        if (r6 >= r13) goto L_0x02ce;
    L_0x0068:
        r5 = r10[r6];
        r0 = r15.equals(r5);
        if (r0 == 0) goto L_0x0075;
    L_0x0070:
        r15.getAbsolutePath();
        goto L_0x02c9;
    L_0x0075:
        r12 = new java.io.RandomAccessFile;	 Catch:{ Exception -> 0x02ab }
        r0 = "rw";	 Catch:{ Exception -> 0x02ab }
        r12.<init>(r5, r0);	 Catch:{ Exception -> 0x02ab }
        r3 = new java.io.FileInputStream;	 Catch:{ Throwable -> 0x029c, all -> 0x0299 }
        r0 = r12.getFD();	 Catch:{ Throwable -> 0x029c, all -> 0x0299 }
        r3.<init>(r0);	 Catch:{ Throwable -> 0x029c, all -> 0x0299 }
        r0 = r12.getChannel();	 Catch:{ Throwable -> 0x0286, all -> 0x0281 }
        r9 = 0;	 Catch:{ Throwable -> 0x0286, all -> 0x0281 }
        r9 = r0.tryLock();	 Catch:{ IOException -> 0x0091 }
        goto L_0x00ac;	 Catch:{ IOException -> 0x0091 }
    L_0x008f:
        r8 = move-exception;
        goto L_0x00a2;
    L_0x0091:
        r2 = move-exception;
        r0 = r2.getCause();	 Catch:{ Exception -> 0x008f }
        if (r0 == 0) goto L_0x00a1;	 Catch:{ Exception -> 0x008f }
    L_0x0098:
        r1 = X.AnonymousClass1pB.m13364B(r0);	 Catch:{ Exception -> 0x008f }
        r0 = 11;	 Catch:{ Exception -> 0x008f }
        if (r1 != r0) goto L_0x00a1;	 Catch:{ Exception -> 0x008f }
    L_0x00a0:
        goto L_0x00ac;	 Catch:{ Exception -> 0x008f }
    L_0x00a1:
        throw r2;	 Catch:{ Exception -> 0x008f }
    L_0x00a2:
        r2 = f26085E;	 Catch:{ Throwable -> 0x0286, all -> 0x0281 }
        r1 = "Error acquiring lock";	 Catch:{ Throwable -> 0x0286, all -> 0x0281 }
        r0 = 0;	 Catch:{ Throwable -> 0x0286, all -> 0x0281 }
        r0 = new java.lang.Object[r0];	 Catch:{ Throwable -> 0x0286, all -> 0x0281 }
        X.AnonymousClass0Dc.I(r2, r8, r1, r0);	 Catch:{ Throwable -> 0x0286, all -> 0x0281 }
    L_0x00ac:
        if (r9 == 0) goto L_0x0271;	 Catch:{ Throwable -> 0x0286, all -> 0x0281 }
    L_0x00ae:
        r5.getAbsolutePath();	 Catch:{ Throwable -> 0x0286, all -> 0x0281 }
        r22 = X.AnonymousClass274.m14482E(r5, r14);	 Catch:{ Throwable -> 0x0286, all -> 0x0281 }
        r0 = "instagram_android_fad";	 Catch:{ Throwable -> 0x0286, all -> 0x0281 }
        r2 = X.AnonymousClass0NN.B(r0, r7);	 Catch:{ Throwable -> 0x0286, all -> 0x0281 }
        r30 = r3;	 Catch:{ Throwable -> 0x0286, all -> 0x0281 }
        r19 = r4;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r20 = r3;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r21 = r5;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r3 = X.AnonymousClass274.m14486I(r19, r20, r21, r22, r23, r25, r27);	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r1 = r3.f23107B;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r0 = "\"Resumed\"";	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r1 = r1.contains(r0);	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        if (r1 == 0) goto L_0x00d9;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
    L_0x00d1:
        r0 = r4.f26087C;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r0 = r0.m16102B();	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        if (r0 != 0) goto L_0x00e3;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
    L_0x00d9:
        if (r1 != 0) goto L_0x015a;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
    L_0x00db:
        r0 = r4.f26087C;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r0 = r0.m16101A();	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        if (r0 == 0) goto L_0x015a;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
    L_0x00e3:
        r8 = r4.f26088D;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r0 = r3.f23107B;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        X.AnonymousClass274.m14479B(r2, r0);	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r1 = "status";	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r0 = r3.f23116K;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r2.F(r1, r0);	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r1 = "checksum";	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r0 = r3.f23108C;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r2.F(r1, r0);	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r1 = "reportId";	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r0 = r3.f23113H;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r2.F(r1, r0);	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r7 = "reportTime";	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r0 = r3.f23114I;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r2.C(r7, r0);	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r7 = "rebootTime";	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r0 = r3.f23112G;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r2.C(r7, r0);	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r7 = "frameworkStartTime";	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r0 = r3.f23110E;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r2.C(r7, r0);	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r7 = "shutdownTime";	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r0 = r3.f23115J;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r2.C(r7, r0);	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r1 = "appDeviceId";	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r0 = X.AnonymousClass0Dt.f1941C;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r0 = r0.A(r8);	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r2.F(r1, r0);	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r9 = r3.f23109D;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r0 = r9.length;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r0 = r0 * 2;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r8 = new char[r0];	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r11 = 0;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r7 = 0;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r1 = 0;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
    L_0x0130:
        r0 = r9.length;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        if (r7 >= r0) goto L_0x014a;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
    L_0x0133:
        r0 = r9[r7];	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r0 = r0 & 255;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r17 = r1 + 1;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r16 = X.AnonymousClass275.f26089B;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r16 = r16[r0];	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r8[r1] = r16;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r1 = r17 + 1;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r16 = X.AnonymousClass275.f26091D;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r0 = r16[r0];	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r8[r17] = r0;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r7 = r7 + 1;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        goto L_0x0130;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
    L_0x014a:
        r0 = new java.lang.String;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r0.<init>(r8, r11, r1);	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r1 = r3.f23108C;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r1 = r0.equals(r1);	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        if (r1 == 0) goto L_0x02dd;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
    L_0x0157:
        r0 = 1;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        goto L_0x01f7;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
    L_0x015a:
        java.lang.Boolean.valueOf(r1);	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r5.getAbsolutePath();	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
    L_0x0160:
        r0 = 0;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        goto L_0x01f7;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
    L_0x0163:
        r1 = move-exception;
        goto L_0x0284;
    L_0x0166:
        r0 = move-exception;
        goto L_0x0289;
    L_0x0169:
        r3 = move-exception;
        r1 = f26085E;	 Catch:{ Throwable -> 0x026f, all -> 0x0163 }
        r0 = "error parsing log";	 Catch:{ Throwable -> 0x026f, all -> 0x0163 }
        X.AnonymousClass0Dc.G(r1, r0, r3);	 Catch:{ Throwable -> 0x026f, all -> 0x0163 }
        r0 = r4.f26087C;	 Catch:{ Throwable -> 0x026f, all -> 0x0163 }
        r1 = X.AnonymousClass0CC.AB;	 Catch:{ Throwable -> 0x026f, all -> 0x0163 }
        r0 = r0.f31007B;	 Catch:{ Throwable -> 0x026f, all -> 0x0163 }
        r0 = r1.H(r0);	 Catch:{ Throwable -> 0x026f, all -> 0x0163 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ Throwable -> 0x026f, all -> 0x0163 }
        r0 = r0.booleanValue();	 Catch:{ Throwable -> 0x026f, all -> 0x0163 }
        if (r0 == 0) goto L_0x0160;	 Catch:{ Throwable -> 0x026f, all -> 0x0163 }
    L_0x0183:
        r0 = "logParseError";	 Catch:{ Throwable -> 0x01f4, all -> 0x01f1 }
        r1 = android.util.Log.getStackTraceString(r3);	 Catch:{ Throwable -> 0x01f4, all -> 0x01f1 }
        r2.F(r0, r1);	 Catch:{ Throwable -> 0x01f4, all -> 0x01f1 }
        r0 = r5.length();	 Catch:{ IOException -> 0x01dd, IOException -> 0x01dd }
        r3 = "errorFileSize";	 Catch:{ IOException -> 0x01dd, IOException -> 0x01dd }
        r2.C(r3, r0);	 Catch:{ IOException -> 0x01dd, IOException -> 0x01dd }
        r7 = "errorFileName";	 Catch:{ IOException -> 0x01dd, IOException -> 0x01dd }
        r3 = r5.getName();	 Catch:{ IOException -> 0x01dd, IOException -> 0x01dd }
        r2.F(r7, r3);	 Catch:{ IOException -> 0x01dd, IOException -> 0x01dd }
        r7 = 1;	 Catch:{ IOException -> 0x01dd, IOException -> 0x01dd }
        r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));	 Catch:{ IOException -> 0x01dd, IOException -> 0x01dd }
        if (r0 < 0) goto L_0x0157;	 Catch:{ IOException -> 0x01dd, IOException -> 0x01dd }
    L_0x01a4:
        r7 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x01dd, IOException -> 0x01dd }
        r7.<init>(r5);	 Catch:{ IOException -> 0x01dd, IOException -> 0x01dd }
        r8 = 0;	 Catch:{ IOException -> 0x01dd, IOException -> 0x01dd }
        r3 = new java.io.DataInputStream;	 Catch:{ Throwable -> 0x01d3 }
        r3.<init>(r7);	 Catch:{ Throwable -> 0x01d3 }
        r1 = X.AnonymousClass1ow.m13341B(r3);	 Catch:{ Throwable -> 0x01c2, all -> 0x01bf }
        r0 = "errorStatus";	 Catch:{ Throwable -> 0x01c2, all -> 0x01bf }
        r2.F(r0, r1);	 Catch:{ Throwable -> 0x01c2, all -> 0x01bf }
        r3.close();	 Catch:{ Throwable -> 0x01d3 }
        r7.close();	 Catch:{ IOException -> 0x01dd, IOException -> 0x01dd }
        goto L_0x0157;	 Catch:{ IOException -> 0x01dd, IOException -> 0x01dd }
    L_0x01bf:
        r0 = move-exception;
        r1 = r8;
        goto L_0x01c5;
    L_0x01c2:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x01c4 }
    L_0x01c4:
        r0 = move-exception;
    L_0x01c5:
        if (r1 == 0) goto L_0x01cb;
    L_0x01c7:
        r3.close();	 Catch:{ Throwable -> 0x01ce }
        goto L_0x01ce;	 Catch:{ Throwable -> 0x01ce }
    L_0x01cb:
        r3.close();	 Catch:{ Throwable -> 0x01d3 }
    L_0x01ce:
        throw r0;	 Catch:{ Throwable -> 0x01d3 }
    L_0x01cf:
        r0 = move-exception;
        if (r8 == 0) goto L_0x01d9;
    L_0x01d2:
        goto L_0x01d5;
    L_0x01d3:
        r8 = move-exception;
        throw r8;	 Catch:{ all -> 0x01cf }
    L_0x01d5:
        r7.close();	 Catch:{ Throwable -> 0x01dc }
        goto L_0x01dc;	 Catch:{ Throwable -> 0x01dc }
    L_0x01d9:
        r7.close();	 Catch:{ IOException -> 0x01dd, IOException -> 0x01dd }
    L_0x01dc:
        throw r0;	 Catch:{ IOException -> 0x01dd, IOException -> 0x01dd }
    L_0x01dd:
        r7 = move-exception;	 Catch:{ Throwable -> 0x01f4, all -> 0x01f1 }
        r3 = f26085E;	 Catch:{ Throwable -> 0x01f4, all -> 0x01f1 }
        r1 = "Failed to extract status from log file path: %s";	 Catch:{ Throwable -> 0x01f4, all -> 0x01f1 }
        r0 = 1;	 Catch:{ Throwable -> 0x01f4, all -> 0x01f1 }
        r0 = new java.lang.Object[r0];	 Catch:{ Throwable -> 0x01f4, all -> 0x01f1 }
        r9 = 0;	 Catch:{ Throwable -> 0x01f4, all -> 0x01f1 }
        r8 = r5.getAbsolutePath();	 Catch:{ Throwable -> 0x01f4, all -> 0x01f1 }
        r0[r9] = r8;	 Catch:{ Throwable -> 0x01f4, all -> 0x01f1 }
        X.AnonymousClass0Dc.I(r3, r7, r1, r0);	 Catch:{ Throwable -> 0x01f4, all -> 0x01f1 }
        goto L_0x0157;	 Catch:{ Throwable -> 0x01f4, all -> 0x01f1 }
    L_0x01f1:
        r1 = move-exception;
        goto L_0x0284;
    L_0x01f4:
        r0 = move-exception;
        goto L_0x0289;
    L_0x01f7:
        if (r0 == 0) goto L_0x01fd;
    L_0x01f9:
        r2.R();	 Catch:{ Throwable -> 0x01f4, all -> 0x01f1 }
        goto L_0x0200;	 Catch:{ Throwable -> 0x01f4, all -> 0x01f1 }
    L_0x01fd:
        r2.U();	 Catch:{ Throwable -> 0x026d, all -> 0x01f1 }
    L_0x0200:
        r0 = r4.f26087C;	 Catch:{ Throwable -> 0x026d, all -> 0x01f1 }
        r1 = X.AnonymousClass0CC.BB;	 Catch:{ Throwable -> 0x026d, all -> 0x01f1 }
        r0 = r0.f31007B;	 Catch:{ Throwable -> 0x026d, all -> 0x01f1 }
        r0 = r1.H(r0);	 Catch:{ Throwable -> 0x026d, all -> 0x01f1 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ Throwable -> 0x026d, all -> 0x01f1 }
        r0 = r0.booleanValue();	 Catch:{ Throwable -> 0x026d, all -> 0x01f1 }
        if (r0 == 0) goto L_0x0264;	 Catch:{ Throwable -> 0x026d, all -> 0x01f1 }
    L_0x0212:
        if (r18 != 0) goto L_0x0264;	 Catch:{ Throwable -> 0x026d, all -> 0x01f1 }
    L_0x0214:
        r0 = 0;	 Catch:{ Throwable -> 0x026d, all -> 0x01f1 }
        r12.seek(r0);	 Catch:{ 1ov -> 0x025c }
        r29 = r4;	 Catch:{ 1ov -> 0x025a }
        r31 = r5;	 Catch:{ 1ov -> 0x025a }
        r32 = r22;	 Catch:{ 1ov -> 0x025a }
        r33 = r23;	 Catch:{ 1ov -> 0x025a }
        r35 = r25;	 Catch:{ 1ov -> 0x025a }
        r37 = r27;	 Catch:{ 1ov -> 0x025a }
        r0 = X.AnonymousClass274.m14486I(r29, r30, r31, r32, r33, r35, r37);	 Catch:{ 1ov -> 0x025a }
        r1 = X.AnonymousClass274.m14484G(r0);	 Catch:{ 1ov -> 0x025a }
        if (r1 == 0) goto L_0x0264;	 Catch:{ 1ov -> 0x025a }
    L_0x022f:
        r2 = r0.f23114I;	 Catch:{ 1ov -> 0x025a }
        r7 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ 1ov -> 0x025a }
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ 1ov -> 0x025a }
        r0 = r7.toSeconds(r0);	 Catch:{ 1ov -> 0x025a }
        r9 = "UnexplainedFAD";	 Catch:{ 1ov -> 0x025a }
        r8 = new java.lang.StringBuilder;	 Catch:{ 1ov -> 0x025a }
        r8.<init>();	 Catch:{ 1ov -> 0x025a }
        r7 = "Recovering from UFAD ";	 Catch:{ 1ov -> 0x025a }
        r8.append(r7);	 Catch:{ 1ov -> 0x025a }
        r0 = r0 - r2;	 Catch:{ 1ov -> 0x025a }
        r8.append(r0);	 Catch:{ 1ov -> 0x025a }
        r0 = " sec after last write";	 Catch:{ 1ov -> 0x025a }
        r8.append(r0);	 Catch:{ 1ov -> 0x025a }
        r0 = r8.toString();	 Catch:{ 1ov -> 0x025a }
        X.AnonymousClass0Gn.C(r9, r0);	 Catch:{ 1ov -> 0x025a }
        r18 = 1;	 Catch:{ 1ov -> 0x025a }
        goto L_0x0264;	 Catch:{ 1ov -> 0x025a }
    L_0x025a:
        r2 = move-exception;
        goto L_0x025d;
    L_0x025c:
        r2 = move-exception;
    L_0x025d:
        r1 = f26085E;	 Catch:{ Throwable -> 0x027f, all -> 0x027d }
        r0 = "Unexpected FAD Parsing crash";	 Catch:{ Throwable -> 0x027f, all -> 0x027d }
        X.AnonymousClass0Dc.G(r1, r0, r2);	 Catch:{ Throwable -> 0x027f, all -> 0x027d }
    L_0x0264:
        X.AnonymousClass274.m14481D(r5);	 Catch:{ Throwable -> 0x027f, all -> 0x027d }
        if (r22 == 0) goto L_0x0276;	 Catch:{ Throwable -> 0x027f, all -> 0x027d }
    L_0x0269:
        X.AnonymousClass274.m14481D(r22);	 Catch:{ Throwable -> 0x027f, all -> 0x027d }
        goto L_0x0276;	 Catch:{ Throwable -> 0x027f, all -> 0x027d }
    L_0x026d:
        r0 = move-exception;
        goto L_0x0289;
    L_0x026f:
        r0 = move-exception;
        goto L_0x0289;
    L_0x0271:
        r30 = r3;
        r5.getAbsolutePath();	 Catch:{ Throwable -> 0x027f, all -> 0x027d }
    L_0x0276:
        r30.close();	 Catch:{ Throwable -> 0x0297, all -> 0x0295 }
        r12.close();	 Catch:{ Exception -> 0x02a9 }
        goto L_0x02c9;	 Catch:{ Exception -> 0x02a9 }
    L_0x027d:
        r1 = move-exception;
        goto L_0x0284;
    L_0x027f:
        r0 = move-exception;
        goto L_0x0289;
    L_0x0281:
        r1 = move-exception;
        r30 = r3;
    L_0x0284:
        r0 = 0;
        goto L_0x028b;
    L_0x0286:
        r0 = move-exception;
        r30 = r3;
    L_0x0289:
        throw r0;	 Catch:{ all -> 0x028a }
    L_0x028a:
        r1 = move-exception;
    L_0x028b:
        if (r0 == 0) goto L_0x0291;
    L_0x028d:
        r30.close();	 Catch:{ Throwable -> 0x0294, all -> 0x0295 }
        goto L_0x0294;	 Catch:{ Throwable -> 0x0294, all -> 0x0295 }
    L_0x0291:
        r30.close();	 Catch:{ Throwable -> 0x0297, all -> 0x0295 }
    L_0x0294:
        throw r1;	 Catch:{ Throwable -> 0x0297, all -> 0x0295 }
    L_0x0295:
        r1 = move-exception;
        goto L_0x029a;
    L_0x0297:
        r0 = move-exception;
        goto L_0x029d;
    L_0x0299:
        r1 = move-exception;
    L_0x029a:
        r0 = 0;
        goto L_0x029f;
    L_0x029c:
        r0 = move-exception;
    L_0x029d:
        throw r0;	 Catch:{ all -> 0x029e }
    L_0x029e:
        r1 = move-exception;
    L_0x029f:
        if (r0 == 0) goto L_0x02a5;
    L_0x02a1:
        r12.close();	 Catch:{ Throwable -> 0x02a8 }
        goto L_0x02a8;	 Catch:{ Throwable -> 0x02a8 }
    L_0x02a5:
        r12.close();	 Catch:{ Exception -> 0x02a9 }
    L_0x02a8:
        throw r1;	 Catch:{ Exception -> 0x02a9 }
    L_0x02a9:
        r3 = move-exception;
        goto L_0x02ac;
    L_0x02ab:
        r3 = move-exception;
    L_0x02ac:
        r2 = f26085E;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Error reporting on app state log file: ";
        r1.append(r0);
        r0 = r5.getAbsolutePath();
        r1.append(r0);
        r0 = r1.toString();
        X.AnonymousClass0Gn.E(r2, r0, r3);
        X.AnonymousClass274.m14481D(r5);
    L_0x02c9:
        r6 = r6 + 1;
        r7 = 0;
        goto L_0x0066;
    L_0x02ce:
        X.AnonymousClass274.m14480C(r14);
        return;
    L_0x02d2:
        r1 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x02da }
        r0 = "No application has been registered with AppStateLogger";	 Catch:{ all -> 0x02da }
        r1.<init>(r0);	 Catch:{ all -> 0x02da }
        throw r1;	 Catch:{ all -> 0x02da }
    L_0x02da:
        r0 = move-exception;	 Catch:{ all -> 0x02da }
        monitor-exit(r2);	 Catch:{ all -> 0x02da }
        throw r0;
    L_0x02dd:
        r7 = new X.1ov;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r3 = new java.lang.StringBuilder;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r3.<init>();	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r1 = "Checksum does not match. Expected '";	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r3.append(r1);	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r3.append(r0);	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r0 = "'";	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r3.append(r0);	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r0 = r3.toString();	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        r7.<init>(r0);	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        throw r7;	 Catch:{ 1ov -> 0x0169, Throwable -> 0x0166, all -> 0x0163 }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.274.A():void");
    }

    /* renamed from: B */
    public static void m14479B(AnonymousClass0NN anonymousClass0NN, String str) {
        if (TextUtils.isEmpty(str)) {
            AnonymousClass0Gn.C(f26085E, "empty json in appStateLogContent");
            return;
        }
        String str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                str2 = (String) keys.next();
                Object opt = jSONObject.opt(str2);
                if (opt != null) {
                    if (opt instanceof Double) {
                        anonymousClass0NN.A(str2, ((Double) opt).doubleValue());
                    } else if (opt instanceof Integer) {
                        anonymousClass0NN.B(str2, ((Integer) opt).intValue());
                    } else if (opt instanceof Float) {
                        anonymousClass0NN.A(str2, (double) ((Float) opt).floatValue());
                    } else if (opt instanceof Long) {
                        anonymousClass0NN.C(str2, ((Long) opt).longValue());
                    } else if (opt instanceof Boolean) {
                        anonymousClass0NN.H(str2, ((Boolean) opt).booleanValue());
                    } else {
                        anonymousClass0NN.F(str2, opt.toString());
                    }
                }
            }
        } catch (Throwable e) {
            str2 = f26085E;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bad json in appstate reporter. json string: ");
            stringBuilder.append(str);
            AnonymousClass0Gn.F(str2, stringBuilder.toString(), e, 1);
        }
    }

    /* renamed from: C */
    private static void m14480C(File[] fileArr) {
        if (fileArr != null) {
            for (File file : fileArr) {
                if (file.exists()) {
                    AnonymousClass0Dc.H(f26085E, "Unpaired native log file: %s", new Object[]{file.getAbsolutePath()});
                    AnonymousClass274.m14481D(file);
                }
            }
        }
    }

    /* renamed from: D */
    private static void m14481D(File file) {
        if (file.delete()) {
            file.getAbsolutePath();
            return;
        }
        AnonymousClass0Dc.H(f26085E, "Failed to delete app state log file path: %s", new Object[]{file.getAbsolutePath()});
    }

    /* renamed from: E */
    private static File m14482E(File file, File[] fileArr) {
        if (fileArr != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(file.getAbsolutePath());
            stringBuilder.append("_native");
            String stringBuilder2 = stringBuilder.toString();
            for (File file2 : fileArr) {
                if (file2.getAbsolutePath().equals(stringBuilder2)) {
                    return file2;
                }
            }
        }
        return null;
    }

    /* renamed from: F */
    private static String m14483F(File file) {
        file = file.getName();
        int lastIndexOf = file.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return file;
        }
        return file.substring(0, lastIndexOf);
    }

    /* renamed from: G */
    private static boolean m14484G(AnonymousClass1p7 anonymousClass1p7) {
        char charAt = anonymousClass1p7.f23116K.charAt(0);
        if (charAt == AnonymousClass1pC.m13368C(Integer.valueOf(3)) || charAt == AnonymousClass1pC.m13368C(Integer.valueOf(1)) || charAt == AnonymousClass1pC.m13368C(Integer.valueOf(2))) {
            return anonymousClass1p7.f23107B.contains("\"Resumed\"");
        }
        return false;
    }

    /* renamed from: H */
    private X.AnonymousClass1p6 m14485H(java.io.File r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r7 = 0;
        r5 = new java.io.RandomAccessFile;	 Catch:{ IOException -> 0x0054, IOException -> 0x0054 }
        r0 = "rw";	 Catch:{ IOException -> 0x0054, IOException -> 0x0054 }
        r5.<init>(r8, r0);	 Catch:{ IOException -> 0x0054, IOException -> 0x0054 }
        r6 = new java.io.FileInputStream;	 Catch:{ Throwable -> 0x0047, all -> 0x0044 }
        r0 = r5.getFD();	 Catch:{ Throwable -> 0x0047, all -> 0x0044 }
        r6.<init>(r0);	 Catch:{ Throwable -> 0x0047, all -> 0x0044 }
        r4 = X.AnonymousClass274.m14483F(r8);	 Catch:{ Throwable -> 0x0037, all -> 0x0034 }
        r2 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ Throwable -> 0x0037, all -> 0x0034 }
        r0 = r8.lastModified();	 Catch:{ Throwable -> 0x0037, all -> 0x0034 }
        r2 = r2.toSeconds(r0);	 Catch:{ Throwable -> 0x0037, all -> 0x0034 }
        r0 = new java.io.DataInputStream;	 Catch:{ Throwable -> 0x0037, all -> 0x0034 }
        r0.<init>(r6);	 Catch:{ Throwable -> 0x0037, all -> 0x0034 }
        r1 = X.AnonymousClass1ow.m13341B(r0);	 Catch:{ Throwable -> 0x0037, all -> 0x0034 }
        r0 = new X.1p6;	 Catch:{ Throwable -> 0x0037, all -> 0x0034 }
        r0.<init>(r1, r4, r2);	 Catch:{ Throwable -> 0x0037, all -> 0x0034 }
        r6.close();	 Catch:{ Throwable -> 0x0047, all -> 0x0044 }
        r5.close();	 Catch:{ IOException -> 0x0054, IOException -> 0x0054 }
        return r0;	 Catch:{ IOException -> 0x0054, IOException -> 0x0054 }
    L_0x0034:
        r0 = move-exception;
        r1 = r7;
        goto L_0x003a;
    L_0x0037:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0039 }
    L_0x0039:
        r0 = move-exception;
    L_0x003a:
        if (r1 == 0) goto L_0x0040;
    L_0x003c:
        r6.close();	 Catch:{ Throwable -> 0x0043, all -> 0x0044 }
        goto L_0x0043;	 Catch:{ Throwable -> 0x0043, all -> 0x0044 }
    L_0x0040:
        r6.close();	 Catch:{ Throwable -> 0x0047, all -> 0x0044 }
    L_0x0043:
        throw r0;	 Catch:{ Throwable -> 0x0047, all -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        r1 = r7;
        goto L_0x004a;
    L_0x0047:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0049 }
    L_0x0049:
        r0 = move-exception;
    L_0x004a:
        if (r1 == 0) goto L_0x0050;
    L_0x004c:
        r5.close();	 Catch:{ Throwable -> 0x0053 }
        goto L_0x0053;	 Catch:{ Throwable -> 0x0053 }
    L_0x0050:
        r5.close();	 Catch:{ IOException -> 0x0054, IOException -> 0x0054 }
    L_0x0053:
        throw r0;	 Catch:{ IOException -> 0x0054, IOException -> 0x0054 }
    L_0x0054:
        r2 = move-exception;
        r1 = f26085E;
        r0 = "Error parsing AppState native log file.";
        X.AnonymousClass0Gn.E(r1, r0, r2);
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.274.H(java.io.File):X.1p6");
    }

    /* renamed from: I */
    private static AnonymousClass1p7 m14486I(AnonymousClass274 anonymousClass274, InputStream inputStream, File file, File file2, long j, long j2, long j3) {
        AnonymousClass274 anonymousClass2742 = anonymousClass274;
        AnonymousClass1ow anonymousClass1ow = anonymousClass2742.f26086B;
        String F = AnonymousClass274.m14483F(file);
        long toSeconds = TimeUnit.MILLISECONDS.toSeconds(file.lastModified());
        InputStream inputStream2 = inputStream;
        DataInputStream dataInputStream = new DataInputStream(inputStream2);
        String B = AnonymousClass1ow.m13341B(dataInputStream);
        try {
            dataInputStream.readFully(anonymousClass1ow.f23050B);
            String str = new String(anonymousClass1ow.f23050B, "US-ASCII");
            try {
                anonymousClass1ow.f23051C.reset();
                Scanner useDelimiter = new Scanner(new DigestInputStream(new AnonymousClass1pA(inputStream2), anonymousClass1ow.f23051C), "US-ASCII").useDelimiter("\\A");
                String next = useDelimiter.hasNext() ? useDelimiter.next() : JsonProperty.USE_DEFAULT_NAME;
                anonymousClass1ow.f23051C.digest(anonymousClass1ow.f23052D, 0, anonymousClass1ow.f23052D.length);
                AnonymousClass1p7 anonymousClass1p7 = new AnonymousClass1p7(B, str, next, F, toSeconds, j, j2, j3, null, anonymousClass1ow.f23052D);
                File file3 = file2;
                if (file2 == null) {
                    return anonymousClass1p7;
                }
                AnonymousClass1p6 H = anonymousClass2742.m14485H(file3);
                if (H == null) {
                    return anonymousClass1p7;
                }
                return new AnonymousClass1p7(H.f23106D, anonymousClass1p7.f23108C, anonymousClass1p7.f23107B, H.f23104B, H.f23105C, anonymousClass1p7.f23112G, anonymousClass1p7.f23110E, anonymousClass1p7.f23115J, anonymousClass1p7.f23111F, anonymousClass1p7.f23109D);
            } catch (Throwable e) {
                throw new AnonymousClass1ov("Error reading log contents", e);
            }
        } catch (Throwable e2) {
            throw new AnonymousClass1ov("Error reading checksum", e2);
        }
    }
}
