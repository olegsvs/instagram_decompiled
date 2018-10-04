package X;

import com.facebook.audiofiltercore.AudioInput;
import com.facebook.audiofiltercore.RestartableAudioInput;
import com.facebook.audiofiltercore.SimpleTransformInputFilter;
import com.facebook.audiofiltercore.VolumeLevelAudioTransform;
import com.facebook.common.dextricks.StartupQEsConfig;

/* renamed from: X.42w */
public final class AnonymousClass42w implements RestartableAudioInput {
    /* renamed from: B */
    public VolumeLevelAudioTransform f48931B;
    /* renamed from: C */
    private AudioInput f48932C;
    /* renamed from: D */
    private int f48933D;
    /* renamed from: E */
    private RestartableAudioInput f48934E;
    /* renamed from: F */
    private int f48935F;

    public AnonymousClass42w(java.lang.String r3, boolean r4, float r5, int r6) {
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
        r2 = this;
        r2.<init>();
        r0 = new X.42x;	 Catch:{ FileNotFoundException -> 0x0025 }
        r0.<init>(r3, r6);	 Catch:{ FileNotFoundException -> 0x0025 }
        r2.f48934E = r0;	 Catch:{ FileNotFoundException -> 0x0025 }
        r0 = r2.f48934E;	 Catch:{ FileNotFoundException -> 0x0025 }
        r2.f48932C = r0;	 Catch:{ FileNotFoundException -> 0x0025 }
        if (r4 == 0) goto L_0x0019;	 Catch:{ FileNotFoundException -> 0x0025 }
    L_0x0010:
        r1 = new com.facebook.audiofiltercore.AudioLoop;	 Catch:{ FileNotFoundException -> 0x0025 }
        r0 = r2.f48934E;	 Catch:{ FileNotFoundException -> 0x0025 }
        r1.<init>(r0);	 Catch:{ FileNotFoundException -> 0x0025 }
        r2.f48932C = r1;	 Catch:{ FileNotFoundException -> 0x0025 }
    L_0x0019:
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;	 Catch:{ FileNotFoundException -> 0x0025 }
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));	 Catch:{ FileNotFoundException -> 0x0025 }
        if (r0 >= 0) goto L_0x0022;	 Catch:{ FileNotFoundException -> 0x0025 }
    L_0x001f:
        r2.m22302A(r5);	 Catch:{ FileNotFoundException -> 0x0025 }
    L_0x0022:
        r2.f48935F = r6;
        return;
    L_0x0025:
        r0 = r2.f48934E;
        if (r0 == 0) goto L_0x002c;
    L_0x0029:
        r0.close();
    L_0x002c:
        r1 = new java.io.IOException;
        r0 = "Unable to create AudioSource";
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.42w.<init>(java.lang.String, boolean, float, int):void");
    }

    /* renamed from: A */
    public final void m22302A(float f) {
        VolumeLevelAudioTransform volumeLevelAudioTransform = this.f48931B;
        if (volumeLevelAudioTransform == null) {
            this.f48931B = new VolumeLevelAudioTransform(f);
            this.f48932C = new SimpleTransformInputFilter(this.f48931B, this.f48932C);
            return;
        }
        volumeLevelAudioTransform.setVolumeMultiplier(f);
    }

    public final void close() {
        this.f48932C.close();
    }

    public final double getTimeElapsed() {
        int i = this.f48935F;
        if (i <= 0) {
            return StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
        }
        double d = (double) this.f48933D;
        double d2 = (double) i;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d / d2;
    }

    public final int read(short[] sArr, int i) {
        int read = this.f48932C.read(sArr, i);
        this.f48933D += read;
        return read;
    }

    public final void restart() {
        this.f48934E.restart();
        this.f48933D = 0;
    }
}
