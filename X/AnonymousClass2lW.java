package X;

/* renamed from: X.2lW */
public final class AnonymousClass2lW implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2lX f33660B;
    /* renamed from: C */
    private final int f33661C;

    public AnonymousClass2lW(AnonymousClass2lX anonymousClass2lX, int i) {
        this.f33660B = anonymousClass2lX;
        this.f33661C = i;
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
        r35 = this;
    L_0x0000:
        r1 = r35;	 Catch:{ InterruptedException -> 0x01d9 }
        r0 = r1.f33660B;	 Catch:{ InterruptedException -> 0x01d9 }
        r0 = r0.mPrefetchQueue;	 Catch:{ InterruptedException -> 0x01d9 }
        r0 = r0.take();	 Catch:{ InterruptedException -> 0x01d9 }
        r0 = (X.AnonymousClass2lV) r0;	 Catch:{ InterruptedException -> 0x01d9 }
        r2 = r0.f33655H;	 Catch:{ InterruptedException -> 0x01d9 }
        r4 = r2.f33643H;	 Catch:{ InterruptedException -> 0x01d9 }
        r2 = r1.f33660B;
        r2 = r2.f33674L;
        if (r2 == 0) goto L_0x0028;
    L_0x0016:
        r2 = r1.f33660B;
        r3 = r2.f33667E;
        r2 = r0.f33658K;
        r2 = r3.m17023B(r2, r4);
        if (r2 == 0) goto L_0x0028;
    L_0x0022:
        r1 = X.AnonymousClass2lU.COMPLETED;
        r0.m17103A(r1);
        goto L_0x0000;
    L_0x0028:
        r3 = r0.f33657J;
        r2 = X.AnonymousClass2lU.PENDING;
        if (r3 == r2) goto L_0x002f;
    L_0x002e:
        goto L_0x0000;
    L_0x002f:
        r9 = 2;
        r6 = 1;
        r2 = 0;
        r3 = new X.43E;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r3.<init>();	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r5 = new X.45E;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r5.<init>();	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r5 = r5.f49739C;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r3.m22328A(r5);	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r5 = r0.f33659L;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r12 = 1;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        if (r5 == 0) goto L_0x008f;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
    L_0x0046:
        r7 = r0.f33651D;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        monitor-enter(r7);	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r5 = r7.f45784E;	 Catch:{ all -> 0x01da }
        monitor-exit(r7);	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r14 = new X.43F;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r15 = r0.f33658K;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r16 = 0;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r13 = r0.f33659L;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r19 = 1;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r11 = r0.f33654G;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r21 = 0;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r7 = r0.f33651D;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r7 = r7.f45783D;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r10 = r7.f49009Q;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r7 = X.AnonymousClass2kt.f33313B;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r23 = r7.mo3951C();	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r24 = 0;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r8 = r0.f33649B;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r7 = r0.f33655H;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r7 = r7.f33642G;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r27 = 0;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r28 = 0;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        if (r5 == 0) goto L_0x007b;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
    L_0x0074:
        r5 = r5.f46372I;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        if (r5 == 0) goto L_0x007b;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
    L_0x0078:
        r29 = 1;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        goto L_0x007d;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
    L_0x007b:
        r29 = 0;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
    L_0x007d:
        r30 = 0;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r22 = r10;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r25 = r8;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r26 = r7;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r18 = r13;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r20 = r11;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r14.<init>(r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30);	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r3.m22328A(r14);	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
    L_0x008f:
        r5 = r0.f33653F;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        if (r5 == 0) goto L_0x009a;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
    L_0x0093:
        r5 = r0.f33653F;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r5 = r5.f33522C;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r3.m22328A(r5);	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
    L_0x009a:
        r8 = new X.3sF;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r11 = r0.f33658K;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r5 = r1.f33660B;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r10 = r5.f33678P;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r5 = r1.f33660B;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r7 = r5.f33667E;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r5 = r0.f33655H;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r5 = r5.f33642G;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        if (r5 == 0) goto L_0x00b1;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
    L_0x00ac:
        r5 = r0.f33655H;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r5 = r5.f33642G;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        goto L_0x00b3;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
    L_0x00b1:
        r5 = X.AnonymousClass1e7.f20937L;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
    L_0x00b3:
        r5 = r5.f20939C;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r17 = r3;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r18 = r5;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r15 = r10;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r16 = r7;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r14 = r11;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r13 = r8;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r13.<init>(r14, r15, r16, r17, r18);	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r7 = new X.2tB;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r3 = r0.f33655H;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r3 = r3.f33643H;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r34 = r3;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r16 = 0;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r18 = 0;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r20 = -1;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r22 = 0;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r23 = 0;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r24 = 0;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r3 = r0.f33655H;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r15 = r3.f33641F;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r3 = r0.f33655H;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r14 = r3.f33640E;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r3 = r0.f33655H;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r3 = r3.f33638C;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r13 = r3.f35065N;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r28 = -1;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r3 = r0.f33655H;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r3 = r3.f33638C;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r3 = r3.f35055D;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r10 = (long) r3;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r31 = 0;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r32 = -1;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r5 = new X.2tA;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r3 = r0.f33658K;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r5.<init>(r3, r12);	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r25 = r15;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r26 = r14;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r27 = r13;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r29 = r10;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r33 = r5;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r15 = r34;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r14 = r7;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r14.<init>(r15, r16, r18, r20, r22, r23, r24, r25, r26, r27, r28, r29, r31, r32, r33);	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r5 = r8.m21035A(r7);	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r3 = X.AnonymousClass2lU.COMPLETED;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r0.m17103A(r3);	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r10 = X.AnonymousClass2lX.f33663R;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r8 = "[thread=%d] Prefetch is done, fetched: %d, url=%s, cacheKey=%s";	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r3 = 4;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r7 = new java.lang.Object[r3];	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r3 = r1.f33661C;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r7[r2] = r3;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r3 = java.lang.Integer.valueOf(r5);	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r7[r6] = r3;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r7[r9] = r4;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r5 = 3;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r3 = r0.f33655H;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r3 = r3.f33637B;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        if (r3 != 0) goto L_0x0131;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
    L_0x012e:
        r3 = "null";	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        goto L_0x0135;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
    L_0x0131:
        r3 = r0.f33655H;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        r3 = r3.f33637B;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
    L_0x0135:
        r7[r5] = r3;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        X.AnonymousClass1Gl.C(r10, r8, r7);	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        goto L_0x0000;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
    L_0x013c:
        r8 = move-exception;
        r3 = r8 instanceof X.AnonymousClass3ui;
        if (r3 == 0) goto L_0x01a3;
    L_0x0141:
        r7 = X.AnonymousClass2lX.f33663R;
        r5 = "Invalid response happens while fetching %s";
        r3 = new java.lang.Object[r6];
        r3[r2] = r4;
        X.AnonymousClass1Gl.F(r7, r8, r5, r3);
        r3 = X.AnonymousClass2lU.FAILED;
        r0.m17103A(r3);
        r8 = (X.AnonymousClass3ui) r8;
        r5 = r8.f46610B;
        r3 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        if (r5 == r3) goto L_0x0171;
    L_0x0159:
        r4 = 410; // 0x19a float:5.75E-43 double:2.026E-321;
        if (r5 == r4) goto L_0x015f;
    L_0x015d:
        goto L_0x0000;
    L_0x015f:
        r1 = r0.f33659L;
        if (r1 == 0) goto L_0x0000;
    L_0x0163:
        r3 = r0.f33659L;
        r1 = new X.1xe;
        r0 = r0.f33658K;
        r1.<init>(r0, r2, r4);
        r3.m21177B(r1);
        goto L_0x0000;
    L_0x0171:
        r1 = r1.f33660B;
        r1 = r1.f33675M;
        if (r1 == 0) goto L_0x0000;
    L_0x0177:
        r4 = r0.f33652E;
        monitor-enter(r4);
        r2 = r0.f33652E;	 Catch:{ all -> 0x01dd }
        r1 = 1;	 Catch:{ all -> 0x01dd }
        r1 = r2.getAndSet(r1);	 Catch:{ all -> 0x01dd }
        if (r1 != 0) goto L_0x01a0;	 Catch:{ all -> 0x01dd }
    L_0x0183:
        r1 = r0.f33650C;	 Catch:{ all -> 0x01dd }
        r3 = r1.iterator();	 Catch:{ all -> 0x01dd }
    L_0x0189:
        r1 = r3.hasNext();	 Catch:{ all -> 0x01dd }
        if (r1 == 0) goto L_0x019b;	 Catch:{ all -> 0x01dd }
    L_0x018f:
        r2 = r3.next();	 Catch:{ all -> 0x01dd }
        r2 = (X.AnonymousClass2lV) r2;	 Catch:{ all -> 0x01dd }
        r1 = X.AnonymousClass2lU.CANCELED;	 Catch:{ all -> 0x01dd }
        r2.m17103A(r1);	 Catch:{ all -> 0x01dd }
        goto L_0x0189;	 Catch:{ all -> 0x01dd }
    L_0x019b:
        r0 = r0.f33651D;	 Catch:{ all -> 0x01dd }
        r0.m21097D();	 Catch:{ all -> 0x01dd }
    L_0x01a0:
        monitor-exit(r4);	 Catch:{ all -> 0x01dd }
        goto L_0x0000;	 Catch:{ all -> 0x01dd }
    L_0x01a3:
        r3 = r0.f33656I;
        r3 = r3 + -1;
        r0.f33656I = r3;
        if (r3 <= 0) goto L_0x01c7;
    L_0x01ab:
        r7 = X.AnonymousClass2lX.f33663R;
        r5 = "Error happens while fetching %s retry remain: %d";
        r3 = new java.lang.Object[r9];
        r3[r2] = r4;
        r2 = r0.f33656I;
        r2 = java.lang.Integer.valueOf(r2);
        r3[r6] = r2;
        X.AnonymousClass1Gl.F(r7, r8, r5, r3);
        r1 = r1.f33660B;
        r1 = r1.mPrefetchQueue;
        r1.add(r0);
        goto L_0x0000;
    L_0x01c7:
        r1 = X.AnonymousClass2lU.FAILED;
        r0.m17103A(r1);
        r3 = X.AnonymousClass2lX.f33663R;
        r1 = "Error happens while fetching %s";
        r0 = new java.lang.Object[r6];
        r0[r2] = r4;
        X.AnonymousClass1Gl.F(r3, r8, r1, r0);
        goto L_0x0000;
    L_0x01d9:
        return;
    L_0x01da:
        r3 = move-exception;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        monitor-exit(r7);	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
        throw r3;	 Catch:{ IOException -> 0x013c, IOException -> 0x013c }
    L_0x01dd:
        r0 = move-exception;	 Catch:{ all -> 0x01dd }
        monitor-exit(r4);	 Catch:{ all -> 0x01dd }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2lW.run():void");
    }
}
