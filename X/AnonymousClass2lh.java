package X;

import android.content.Context;
import android.os.Handler;

/* renamed from: X.2lh */
public final class AnonymousClass2lh {
    /* renamed from: B */
    public static AnonymousClass43c m17118B(Context context, AnonymousClass1Gy anonymousClass1Gy, AnonymousClass2qn anonymousClass2qn, String str, AnonymousClass2s1 anonymousClass2s1, Handler handler, AnonymousClass43D anonymousClass43D, AnonymousClass2py anonymousClass2py, AnonymousClass3tt anonymousClass3tt, AnonymousClass2qV anonymousClass2qV, boolean z) {
        AnonymousClass1Gy anonymousClass1Gy2 = anonymousClass1Gy;
        AnonymousClass2qn anonymousClass2qn2 = anonymousClass2qn;
        Handler handler2 = handler;
        AnonymousClass3tt anonymousClass3tt2 = anonymousClass3tt;
        if (!"vp9".equals(str) || (!anonymousClass1Gy2.f16621z && (!anonymousClass1Gy2.pB || AnonymousClass2lh.m17119C()))) {
            AnonymousClass1Gl.C("VideoRendererFactory", "Use Mediacodec decoder. Codec: %s", new Object[]{str});
            Context context2 = context;
            AnonymousClass2s1 anonymousClass2s12 = anonymousClass2s1;
            AnonymousClass43D anonymousClass43D2 = anonymousClass43D;
            Handler handler3 = anonymousClass2qV;
            if (anonymousClass43D2 != null) {
                AnonymousClass2py anonymousClass2py2 = anonymousClass2py;
                if (anonymousClass2py != null) {
                    return new AnonymousClass462(context2, anonymousClass2qn2, AnonymousClass2qT.f34819B, 1, anonymousClass1Gy2.vB, anonymousClass2s12, true, handler2, anonymousClass3tt2, new AnonymousClass3sa(anonymousClass43D2, anonymousClass2py2), -1, anonymousClass1Gy2.SC, handler3);
                }
            }
            return new AnonymousClass45t(context2, anonymousClass2qn2, z ? AnonymousClass2qT.f34820C : AnonymousClass2qT.f34819B, 1, anonymousClass1Gy2.vB, anonymousClass2s12, true, handler2, anonymousClass3tt2, -1, anonymousClass1Gy2.SC, handler3);
        }
        AnonymousClass1Gl.C("VideoRendererFactory", "Use VPX decoder. Codec: %s", new Object[]{str});
        try {
            return (AnonymousClass43c) Class.forName("com.google.android.exoplayer.ext.vp9.LibvpxVideoTrackRenderer").getConstructor(new Class[]{AnonymousClass2qn.class, Boolean.TYPE, Handler.class, AnonymousClass3tt.class, Integer.TYPE}).newInstance(new Object[]{anonymousClass2qn2, Boolean.valueOf(true), handler, anonymousClass3tt, Integer.valueOf(-1)});
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: C */
    private static boolean m17119C() {
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
        r2 = 0;
        r0 = "video/x-vnd.on2.vp9";	 Catch:{ 2qc -> 0x0017 }
        r0 = X.AnonymousClass2qe.m17449C(r0, r2);	 Catch:{ 2qc -> 0x0017 }
        if (r0 == 0) goto L_0x0016;	 Catch:{ 2qc -> 0x0017 }
    L_0x0009:
        r1 = r0.first;	 Catch:{ 2qc -> 0x0017 }
        r1 = (java.lang.String) r1;	 Catch:{ 2qc -> 0x0017 }
        r0 = "OMX.google.";	 Catch:{ 2qc -> 0x0017 }
        r0 = r1.startsWith(r0);	 Catch:{ 2qc -> 0x0017 }
        if (r0 != 0) goto L_0x0016;	 Catch:{ 2qc -> 0x0017 }
    L_0x0015:
        r2 = 1;	 Catch:{ 2qc -> 0x0017 }
    L_0x0016:
        return r2;	 Catch:{ 2qc -> 0x0017 }
    L_0x0017:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2lh.C():boolean");
    }
}
