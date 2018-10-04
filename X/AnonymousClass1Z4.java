package X;

import android.content.Context;

/* renamed from: X.1Z4 */
public final class AnonymousClass1Z4 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ int f20123B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass1ZF f20124C;
    /* renamed from: D */
    public final /* synthetic */ Context f20125D;

    public AnonymousClass1Z4(Context context, int i, AnonymousClass1ZF anonymousClass1ZF) {
        this.f20125D = context;
        this.f20123B = i;
        this.f20124C = anonymousClass1ZF;
    }

    public final void run() {
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
        r14 = this;
        r0 = r14.f20125D;
        r0 = r0.getResources();
        r1 = r0.getDisplayMetrics();
        r0 = r1.widthPixels;
        r6 = r0 / 2;
        r0 = r1.heightPixels;
        r3 = r0 / 2;
        r4 = java.lang.System.currentTimeMillis();
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "question_response_reshare";
        r1.append(r0);
        r1.append(r4);
        r0 = ".jpg";
        r1.append(r0);
        r2 = r1.toString();
        r1 = X.AnonymousClass0G1.m1718F();
        r0 = new java.io.File;
        r0.<init>(r1);
        r0.mkdirs();
        r5 = new java.io.File;
        r5.<init>(r1, r2);
        r0 = android.graphics.Bitmap.Config.ARGB_8888;
        r4 = android.graphics.Bitmap.createBitmap(r6, r3, r0);
        r2 = new android.graphics.Canvas;
        r2.<init>(r4);
        r1 = new android.graphics.Paint;
        r0 = 5;
        r1.<init>(r0);
        r6 = new android.graphics.LinearGradient;
        r10 = (float) r3;
        r0 = r14.f20123B;
        r11 = X.AnonymousClass5BQ.B(r0);
        r13 = android.graphics.Shader.TileMode.CLAMP;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r12 = 0;
        r6.<init>(r7, r8, r9, r10, r11, r12, r13);
        r1.setShader(r6);
        r2.drawPaint(r1);
        r3 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x008d }
        r3.<init>(r5);	 Catch:{ IOException -> 0x008d }
        r0 = 0;	 Catch:{ IOException -> 0x008d }
        r2 = android.graphics.Bitmap.CompressFormat.JPEG;	 Catch:{ Throwable -> 0x0083 }
        r1 = 90;	 Catch:{ Throwable -> 0x0083 }
        r4.compress(r2, r1, r3);	 Catch:{ Throwable -> 0x0083 }
        r1 = new X.5C6;	 Catch:{ Throwable -> 0x0083 }
        r1.<init>(r14, r5, r4);	 Catch:{ Throwable -> 0x0083 }
        X.AnonymousClass0Sy.m4437F(r1);	 Catch:{ Throwable -> 0x0083 }
        r3.close();	 Catch:{ IOException -> 0x008d }
        goto L_0x009b;	 Catch:{ IOException -> 0x008d }
    L_0x007f:
        r1 = move-exception;
        if (r0 == 0) goto L_0x0089;
    L_0x0082:
        goto L_0x0085;
    L_0x0083:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x007f }
    L_0x0085:
        r3.close();	 Catch:{ Throwable -> 0x008c }
        goto L_0x008c;	 Catch:{ Throwable -> 0x008c }
    L_0x0089:
        r3.close();	 Catch:{ IOException -> 0x008d }
    L_0x008c:
        throw r1;	 Catch:{ IOException -> 0x008d }
    L_0x008d:
        r1 = move-exception;
        r0 = "unable to create quesiton reshare background input file";
        X.AnonymousClass0Gn.m1885L(r0, r1);
        r0 = new X.5C7;
        r0.<init>(r14, r1);
        X.AnonymousClass0Sy.m4437F(r0);
    L_0x009b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1Z4.run():void");
    }
}
