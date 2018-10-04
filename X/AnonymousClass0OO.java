package X;

import android.content.Context;
import android.os.PowerManager.WakeLock;

/* renamed from: X.0OO */
public final class AnonymousClass0OO {
    /* renamed from: B */
    public final Context f3891B;
    /* renamed from: C */
    public int f3892C;
    /* renamed from: D */
    public AnonymousClass0OP f3893D;
    /* renamed from: E */
    public Exception f3894E;
    /* renamed from: F */
    public String f3895F = "None";
    /* renamed from: G */
    public WakeLock f3896G;

    public AnonymousClass0OO(Context context) {
        this.f3891B = context;
    }

    /* renamed from: A */
    public final boolean m3620A(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0OA anonymousClass0OA, AnonymousClass2NN anonymousClass2NN) {
        return m3621B(anonymousClass0Cm, anonymousClass0OA, anonymousClass2NN, new AnonymousClass416(this), null, null);
    }

    /* renamed from: B */
    public static synchronized void m3619B(AnonymousClass0OO anonymousClass0OO, AnonymousClass0OP anonymousClass0OP) {
        synchronized (anonymousClass0OO) {
            anonymousClass0OO.f3893D = anonymousClass0OP;
        }
    }

    /* renamed from: B */
    public final boolean m3621B(X.AnonymousClass0Cm r9, X.AnonymousClass0OA r10, X.AnonymousClass2NN r11, X.AnonymousClass3Yw r12, X.AnonymousClass41B r13, X.AnonymousClass41E r14) {
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
        r8 = this;
        r7 = r8.f3891B;
        r0 = r10.BC;
        r2 = 0;
        if (r0 == 0) goto L_0x000d;
    L_0x0007:
        r5 = new X.3Of;
        r5.<init>(r7, r0);
        goto L_0x000e;
    L_0x000d:
        r5 = r2;
    L_0x000e:
        r4 = X.AnonymousClass3qD.B(r7, r10);
        r3 = r10.f3819g;
        r0 = android.text.TextUtils.isEmpty(r3);
        r6 = r11;
        if (r0 != 0) goto L_0x0050;
    L_0x001b:
        r0 = X.AnonymousClass2NN.f29641D;
        if (r11 != r0) goto L_0x0039;
    L_0x001f:
        r0 = r10.m3595o();
        if (r0 == 0) goto L_0x0039;
    L_0x0025:
        r0 = X.AnonymousClass0CC.Mg;
        r0 = r0.m845G();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0039;
    L_0x0033:
        r2 = new com.instagram.filterkit.filter.OverlayObscureFilter;
        r2.<init>(r3);
        goto L_0x0050;
    L_0x0039:
        r1 = new com.instagram.model.filterkit.TextureAsset;
        r0 = "image_overlay";
        r1.<init>(r0, r3);
        r3 = new java.util.ArrayList;
        r3.<init>();
        r3.add(r1);
        r2 = new com.instagram.filterkit.filter.VideoFilter;
        r1 = "ImageOverlay";
        r0 = -3;
        r2.<init>(r7, r0, r1, r3);
    L_0x0050:
        r11 = new X.3q5;
        r11.<init>(r5, r4, r2, r6);
        r7 = new X.1QP;
        r7.<init>(r8, r9, r10, r11, r12, r13, r14);
        r0 = X.AnonymousClass0CC.hM;
        r0 = r0.m845G();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x006b;
    L_0x0068:
        java.lang.System.gc();
    L_0x006b:
        r0 = com.instagram.util.creation.ShaderBridge.isLibrariesLoaded();
        if (r0 != 0) goto L_0x0074;
    L_0x0071:
        com.instagram.util.creation.ShaderBridge.loadLibrariesSync();
    L_0x0074:
        r3 = 0;
        r6 = 0;
        r0 = r7.f18383D;	 Catch:{ RuntimeException -> 0x0185 }
        r0 = r0.f3896G;	 Catch:{ RuntimeException -> 0x0185 }
        if (r0 != 0) goto L_0x0096;	 Catch:{ RuntimeException -> 0x0185 }
    L_0x007c:
        r5 = r7.f18383D;	 Catch:{ RuntimeException -> 0x0185 }
        r0 = r7.f18383D;	 Catch:{ RuntimeException -> 0x0185 }
        r1 = r0.f3891B;	 Catch:{ RuntimeException -> 0x0185 }
        r0 = "power";	 Catch:{ RuntimeException -> 0x0185 }
        r4 = r1.getSystemService(r0);	 Catch:{ RuntimeException -> 0x0185 }
        r4 = (android.os.PowerManager) r4;	 Catch:{ RuntimeException -> 0x0185 }
        r2 = 1;	 Catch:{ RuntimeException -> 0x0185 }
        r1 = "VideoRenderer.WakeLock";	 Catch:{ RuntimeException -> 0x0185 }
        r0 = -1982821069; // 0xffffffff89d08d33 float:-5.020696E-33 double:NaN;	 Catch:{ RuntimeException -> 0x0185 }
        r0 = X.AnonymousClass1DI.m10052D(r4, r2, r1, r0);	 Catch:{ RuntimeException -> 0x0185 }
        r5.f3896G = r0;	 Catch:{ RuntimeException -> 0x0185 }
    L_0x0096:
        r0 = r7.f18383D;	 Catch:{ RuntimeException -> 0x0185 }
        r1 = r0.f3896G;	 Catch:{ RuntimeException -> 0x0185 }
        r0 = 1573254738; // 0x5dc5f652 float:1.78308488E18 double:7.77291118E-315;	 Catch:{ RuntimeException -> 0x0185 }
        X.AnonymousClass1DI.m10050B(r1, r0);	 Catch:{ RuntimeException -> 0x0185 }
        r0 = X.AnonymousClass0MN.m3161E();	 Catch:{ RuntimeException -> 0x0185 }
        if (r0 == 0) goto L_0x0114;	 Catch:{ RuntimeException -> 0x0185 }
    L_0x00a6:
        r0 = "LegacySoftware";	 Catch:{ RuntimeException -> 0x0185 }
        X.AnonymousClass1QP.m11342D(r7, r0);	 Catch:{ RuntimeException -> 0x0185 }
        r4 = new X.455;	 Catch:{ RuntimeException -> 0x0185 }
        r0 = r7.f18383D;	 Catch:{ RuntimeException -> 0x0185 }
        r2 = r0.f3891B;	 Catch:{ RuntimeException -> 0x0185 }
        r1 = r7.f18381B;	 Catch:{ RuntimeException -> 0x0185 }
        r0 = r7.f18382C;	 Catch:{ RuntimeException -> 0x0185 }
        r4.<init>(r2, r1, r0);	 Catch:{ RuntimeException -> 0x0185 }
        r1 = new java.lang.Thread;	 Catch:{ RuntimeException -> 0x0185 }
        r0 = r4.f44808B;	 Catch:{ RuntimeException -> 0x0185 }
        r1.<init>(r0);	 Catch:{ RuntimeException -> 0x0185 }
        r1.start();	 Catch:{ RuntimeException -> 0x0185 }
        r0 = r7.f18383D;	 Catch:{ RuntimeException -> 0x0185 }
        X.AnonymousClass0OO.m3619B(r0, r4);	 Catch:{ RuntimeException -> 0x0185 }
        r1 = r4.f49650J;	 Catch:{ RuntimeException -> 0x0185 }
        monitor-enter(r1);	 Catch:{ RuntimeException -> 0x0185 }
        r0 = r4.f49651K;	 Catch:{ all -> 0x0219 }
        if (r0 != 0) goto L_0x00d3;	 Catch:{ all -> 0x0219 }
    L_0x00ce:
        r0 = r4.f49650J;	 Catch:{ Exception -> 0x00d3 }
        r0.wait();	 Catch:{ Exception -> 0x00d3 }
    L_0x00d3:
        monitor-exit(r1);	 Catch:{ all -> 0x0219 }
        r0 = r4.f49660T;	 Catch:{ RuntimeException -> 0x0185 }
        r0.start();	 Catch:{ RuntimeException -> 0x0185 }
    L_0x00d9:
        r1 = r4.f49642B;	 Catch:{ RuntimeException -> 0x0185 }
        monitor-enter(r1);	 Catch:{ RuntimeException -> 0x0185 }
        r0 = r4.f49642B;	 Catch:{ Exception -> 0x00e5 }
        r0.wait();	 Catch:{ Exception -> 0x00e5 }
        goto L_0x00e5;	 Catch:{ Exception -> 0x00e5 }
    L_0x00e2:
        r0 = move-exception;
        goto L_0x0216;
    L_0x00e5:
        monitor-exit(r1);	 Catch:{ all -> 0x00e2 }
        r0 = r4.f49647G;	 Catch:{ RuntimeException -> 0x0185 }
        if (r0 != 0) goto L_0x0110;	 Catch:{ RuntimeException -> 0x0185 }
    L_0x00ea:
        r0 = r4.tW();	 Catch:{ RuntimeException -> 0x0185 }
        if (r0 == 0) goto L_0x00f1;	 Catch:{ RuntimeException -> 0x0185 }
    L_0x00f0:
        goto L_0x0110;	 Catch:{ RuntimeException -> 0x0185 }
    L_0x00f1:
        r2 = r4.f49655O;	 Catch:{ RuntimeException -> 0x0185 }
        monitor-enter(r2);	 Catch:{ RuntimeException -> 0x0185 }
        r0 = r4.f49656P;	 Catch:{ all -> 0x010d }
        if (r0 == 0) goto L_0x010b;	 Catch:{ all -> 0x010d }
    L_0x00f8:
        r0 = r4.f49652L;	 Catch:{ all -> 0x010d }
        if (r0 == 0) goto L_0x0106;	 Catch:{ all -> 0x010d }
    L_0x00fc:
        r1 = r4.f49660T;	 Catch:{ all -> 0x010d }
        r0 = r4.f49658R;	 Catch:{ all -> 0x010d }
        r0 = r0 + -1500;	 Catch:{ all -> 0x010d }
        r1.seekTo(r0);	 Catch:{ all -> 0x010d }
        goto L_0x010b;	 Catch:{ all -> 0x010d }
    L_0x0106:
        r0 = r4.f49660T;	 Catch:{ all -> 0x010d }
        r0.start();	 Catch:{ all -> 0x010d }
    L_0x010b:
        monitor-exit(r2);	 Catch:{ all -> 0x010d }
        goto L_0x00d9;	 Catch:{ all -> 0x010d }
    L_0x010d:
        r0 = move-exception;	 Catch:{ all -> 0x010d }
        monitor-exit(r2);	 Catch:{ all -> 0x010d }
    L_0x010f:
        throw r0;	 Catch:{ RuntimeException -> 0x0185 }
    L_0x0110:
        r4.yWA();	 Catch:{ RuntimeException -> 0x0185 }
        goto L_0x012a;	 Catch:{ RuntimeException -> 0x0185 }
    L_0x0114:
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x0185 }
        r0 = 18;	 Catch:{ RuntimeException -> 0x0185 }
        if (r1 < r0) goto L_0x011c;	 Catch:{ RuntimeException -> 0x0185 }
    L_0x011a:
        r0 = 1;	 Catch:{ RuntimeException -> 0x0185 }
        goto L_0x011d;	 Catch:{ RuntimeException -> 0x0185 }
    L_0x011c:
        r0 = 0;	 Catch:{ RuntimeException -> 0x0185 }
    L_0x011d:
        if (r0 == 0) goto L_0x0127;	 Catch:{ RuntimeException -> 0x0185 }
    L_0x011f:
        r1 = X.AnonymousClass1QP.m11340B(r7);	 Catch:{ RuntimeException -> 0x0185 }
        r0 = X.AnonymousClass3oy.f44878D;	 Catch:{ RuntimeException -> 0x0185 }
        if (r1 != r0) goto L_0x012a;	 Catch:{ RuntimeException -> 0x0185 }
    L_0x0127:
        X.AnonymousClass1QP.m11341C(r7);	 Catch:{ RuntimeException -> 0x0185 }
    L_0x012a:
        r0 = r7.f18383D;
        r1 = r0.f3896G;
        r0 = -1338223590; // 0xffffffffb03c541a float:-6.8513517E-10 double:NaN;
        X.AnonymousClass1DI.m10053E(r1, r0);
        r1 = r7.f18383D;
        r0 = 0;
        r1.f3892C = r0;
        r0 = r7.f18383D;
        r0 = r0.f3893D;
        if (r0 == 0) goto L_0x0165;
    L_0x013f:
        r0 = r7.f18383D;
        r0 = r0.f3893D;
        r6 = r0.tW();
        r1 = r7.f18383D;
        r0 = r1.f3893D;
        r0 = r0.yK();
        r1.f3892C = r0;
        r0 = r7.f18383D;
        r0 = r0.f3893D;
        r0 = r0.wL();
        if (r0 == 0) goto L_0x0165;
    L_0x015b:
        r1 = r7.f18383D;
        r0 = r1.f3893D;
        r0 = r0.wL();
        r1.f3894E = r0;
    L_0x0165:
        r0 = r7.f18383D;
        r0 = r0.f3894E;
        if (r0 == 0) goto L_0x01d1;
    L_0x016b:
        if (r6 != 0) goto L_0x01d1;
    L_0x016d:
        goto L_0x01c6;
    L_0x016e:
        r4 = move-exception;
        r0 = r7.f18383D;
        r1 = r0.f3896G;
        r0 = 528162365; // 0x1f7b1e3d float:5.317633E-20 double:2.6094688E-315;
        X.AnonymousClass1DI.m10053E(r1, r0);
        r1 = r7.f18383D;
        r0 = 0;
        r1.f3892C = r0;
        r0 = r7.f18383D;
        r0 = r0.f3893D;
        if (r0 == 0) goto L_0x01fd;
    L_0x0184:
        goto L_0x01d7;
    L_0x0185:
        r1 = move-exception;
        r0 = r7.f18383D;	 Catch:{ all -> 0x016e }
        r0.f3894E = r1;	 Catch:{ all -> 0x016e }
        r0 = r7.f18383D;
        r1 = r0.f3896G;
        r0 = -1390408175; // 0xffffffffad200e11 float:-9.09807E-12 double:NaN;
        X.AnonymousClass1DI.m10053E(r1, r0);
        r1 = r7.f18383D;
        r0 = 0;
        r1.f3892C = r0;
        r0 = r7.f18383D;
        r0 = r0.f3893D;
        if (r0 == 0) goto L_0x0165;
    L_0x019f:
        r0 = r7.f18383D;
        r0 = r0.f3893D;
        r6 = r0.tW();
        r1 = r7.f18383D;
        r0 = r1.f3893D;
        r0 = r0.yK();
        r1.f3892C = r0;
        r0 = r7.f18383D;
        r0 = r0.f3893D;
        r0 = r0.wL();
        if (r0 == 0) goto L_0x0165;
    L_0x01bb:
        r1 = r7.f18383D;
        r0 = r1.f3893D;
        r0 = r0.wL();
        r1.f3894E = r0;
        goto L_0x0165;
    L_0x01c6:
        r2 = "FinalVideoRenderer";
        r1 = "Failed to render video";
        r0 = r7.f18383D;
        r0 = r0.f3894E;
        X.AnonymousClass0Gn.m1878E(r2, r1, r0);
    L_0x01d1:
        r0 = r7.f18383D;
        X.AnonymousClass0OO.m3619B(r0, r3);
        return r6;
    L_0x01d7:
        r0 = r7.f18383D;
        r0 = r0.f3893D;
        r6 = r0.tW();
        r1 = r7.f18383D;
        r0 = r1.f3893D;
        r0 = r0.yK();
        r1.f3892C = r0;
        r0 = r7.f18383D;
        r0 = r0.f3893D;
        r0 = r0.wL();
        if (r0 == 0) goto L_0x01fd;
    L_0x01f3:
        r1 = r7.f18383D;
        r0 = r1.f3893D;
        r0 = r0.wL();
        r1.f3894E = r0;
    L_0x01fd:
        r0 = r7.f18383D;
        r0 = r0.f3894E;
        if (r0 == 0) goto L_0x0210;
    L_0x0203:
        if (r6 != 0) goto L_0x0210;
    L_0x0205:
        r0 = r7.f18383D;
        r2 = r0.f3894E;
        r1 = "FinalVideoRenderer";
        r0 = "Failed to render video";
        X.AnonymousClass0Gn.m1878E(r1, r0, r2);
    L_0x0210:
        r0 = r7.f18383D;
        X.AnonymousClass0OO.m3619B(r0, r3);
        throw r4;
    L_0x0216:
        monitor-exit(r1);	 Catch:{ all -> 0x00e2 }
        goto L_0x010f;	 Catch:{ all -> 0x00e2 }
    L_0x0219:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0219 }
        goto L_0x010f;	 Catch:{ all -> 0x0219 }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0OO.B(X.0Cm, X.0OA, X.2NN, X.3Yw, X.41B, X.41E):boolean");
    }
}
