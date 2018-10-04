package X;

import com.facebook.cameracore.assets.model.ARRequestAsset;
import com.facebook.common.dextricks.StartupQEsConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3rV */
public final class AnonymousClass3rV {
    /* renamed from: B */
    public final Map f45419B = new HashMap();
    /* renamed from: C */
    private final AnonymousClass3rX f45420C;
    /* renamed from: D */
    private final AnonymousClass2gk f45421D;

    /* renamed from: A */
    public final X.AnonymousClass2gl m20942A(java.util.List r14, boolean r15, java.lang.String r16, boolean r17, X.AnonymousClass3qz r18, X.AnonymousClass2hE r19) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 12, insn: 0x010b: INVOKE  (r12 X.2hE), (r2 X.2h0), (r0 java.lang.Exception) X.2hE.Fh(X.2h0, java.lang.Exception):void type: INTERFACE, block:B:38:0x010b, method: X.3rV.A(java.util.List, boolean, java.lang.String, boolean, X.3qz, X.2hE):X.2gl
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:168)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:132)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
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
        r13 = this;
        r5 = new X.3rP;
        r10 = r13;
        r5.<init>(r13);
        r2 = 0;
        r12 = r19;	 Catch:{ 2hF -> 0x010a }
        r8 = new java.util.ArrayList;	 Catch:{ 2hF -> 0x010a }
        r8.<init>();	 Catch:{ 2hF -> 0x010a }
        r7 = new X.2h0;	 Catch:{ 2hF -> 0x010a }
        r7.<init>();	 Catch:{ 2hF -> 0x010a }
        r9 = r14.iterator();	 Catch:{ 2hF -> 0x010a }
    L_0x0017:
        r0 = r9.hasNext();	 Catch:{ 2hF -> 0x010a }
        if (r0 == 0) goto L_0x0067;	 Catch:{ 2hF -> 0x010a }
    L_0x001d:
        r6 = r9.next();	 Catch:{ 2hF -> 0x010a }
        r6 = (X.AnonymousClass2hH) r6;	 Catch:{ 2hF -> 0x010a }
        r1 = r13.f45419B;	 Catch:{ 2hF -> 0x010a }
        r0 = r6.f32540B;	 Catch:{ 2hF -> 0x010a }
        r0 = r1.containsKey(r0);	 Catch:{ 2hF -> 0x010a }
        if (r0 == 0) goto L_0x004e;	 Catch:{ 2hF -> 0x010a }
    L_0x002d:
        r1 = r13.f45419B;	 Catch:{ 2hF -> 0x010a }
        r0 = r6.f32540B;	 Catch:{ 2hF -> 0x010a }
        r4 = r1.get(r0);	 Catch:{ 2hF -> 0x010a }
        r4 = (X.AnonymousClass3rY) r4;	 Catch:{ 2hF -> 0x010a }
        r3 = r6.f32541C;	 Catch:{ 2hF -> 0x010a }
        r1 = r6.f32542D;	 Catch:{ 2hF -> 0x010a }
    L_0x003b:
        r0 = X.AnonymousClass3rV.m20938B(r13, r1, r4, r7);	 Catch:{ 2hF -> 0x010a }
        r1 = r1 + -1;	 Catch:{ 2hF -> 0x010a }
        if (r0 != 0) goto L_0x0047;	 Catch:{ 2hF -> 0x010a }
    L_0x0043:
        if (r3 <= 0) goto L_0x0047;	 Catch:{ 2hF -> 0x010a }
    L_0x0045:
        if (r1 >= r3) goto L_0x003b;	 Catch:{ 2hF -> 0x010a }
    L_0x0047:
        if (r0 != 0) goto L_0x004d;	 Catch:{ 2hF -> 0x010a }
    L_0x0049:
        r8.add(r6);	 Catch:{ 2hF -> 0x010a }
        goto L_0x0017;	 Catch:{ 2hF -> 0x010a }
    L_0x004d:
        goto L_0x0017;	 Catch:{ 2hF -> 0x010a }
    L_0x004e:
        r3 = new X.2hF;	 Catch:{ 2hF -> 0x010a }
        r1 = new java.lang.StringBuilder;	 Catch:{ 2hF -> 0x010a }
        r1.<init>();	 Catch:{ 2hF -> 0x010a }
        r0 = "Capability not found, Requested fetching unsupported capability: ";	 Catch:{ 2hF -> 0x010a }
        r1.append(r0);	 Catch:{ 2hF -> 0x010a }
        r0 = r6.f32540B;	 Catch:{ 2hF -> 0x010a }
        r1.append(r0);	 Catch:{ 2hF -> 0x010a }
        r0 = r1.toString();	 Catch:{ 2hF -> 0x010a }
        r3.<init>(r0);	 Catch:{ 2hF -> 0x010a }
        throw r3;	 Catch:{ 2hF -> 0x010a }
    L_0x0067:
        r0 = new X.0IC;	 Catch:{ 2hF -> 0x010a }
        r0.<init>(r8, r7);	 Catch:{ 2hF -> 0x010a }
        r13 = r0.f2727B;
        r13 = (java.util.List) r13;
        r3 = r0.f2728C;
        r3 = (X.AnonymousClass2h0) r3;
        r0 = r13.size();
        r4 = r18;
        if (r0 != 0) goto L_0x0087;
    L_0x007c:
        if (r18 == 0) goto L_0x0083;
    L_0x007e:
        r0 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r4.m20902A(r0);
    L_0x0083:
        r12.Fh(r3, r2);
        return r5;
    L_0x0087:
        r11 = new java.util.concurrent.atomic.AtomicReference;
        r11.<init>();
        r2 = new java.util.concurrent.atomic.AtomicReference;
        r0 = 0;
        r0 = java.lang.Double.valueOf(r0);
        r2.<init>(r0);
        r6 = r10.f45420C;
        r9 = new X.3rR;
        r14 = r15;
        r15 = r16;
        r16 = r17;
        r17 = r3;
        r18 = r2;
        r19 = r4;
        r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        r4 = new java.util.ArrayList;
        r4.<init>();
        r3 = r13.iterator();
    L_0x00b2:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x00d4;
    L_0x00b8:
        r2 = r3.next();
        r2 = (X.AnonymousClass2hH) r2;
        r1 = r6.f45425B;
        r0 = r2.f32540B;
        r0 = r1.containsKey(r0);
        if (r0 == 0) goto L_0x00cc;
    L_0x00c8:
        r4.add(r2);
        goto L_0x00b2;
    L_0x00cc:
        r1 = new java.lang.IllegalArgumentException;
        r0 = "No query executor was registered for the capability";
        r1.<init>(r0);
        throw r1;
    L_0x00d4:
        r7 = new java.util.concurrent.atomic.AtomicInteger;
        r0 = r4.size();
        r7.<init>(r0);
        r4 = r4.iterator();
    L_0x00e1:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0109;
    L_0x00e7:
        r3 = r4.next();
        r3 = (X.AnonymousClass2hH) r3;
        r1 = r6.f45425B;
        r0 = r3.f32540B;
        r2 = r1.get(r0);
        r2 = (X.AnonymousClass2hI) r2;
        r1 = r3.f32542D;
        r0 = new X.3rW;
        r12 = r0;
        r13 = r6;
        r14 = r3;
        r16 = r7;
        r17 = r9;
        r12.<init>(r13, r14, r15, r16, r17);
        r2.aH(r1, r0);
        goto L_0x00e1;
    L_0x0109:
        return r5;
    L_0x010a:
        r0 = move-exception;
        r12.Fh(r2, r0);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3rV.A(java.util.List, boolean, java.lang.String, boolean, X.3qz, X.2hE):X.2gl");
    }

    public AnonymousClass3rV(AnonymousClass2gk anonymousClass2gk, AnonymousClass3rX anonymousClass3rX, AnonymousClass3rY anonymousClass3rY, AnonymousClass3rY anonymousClass3rY2, AnonymousClass3rY anonymousClass3rY3, AnonymousClass3rY anonymousClass3rY4, AnonymousClass3rY anonymousClass3rY5, AnonymousClass3rY anonymousClass3rY6, AnonymousClass3xX anonymousClass3xX) {
        this.f45421D = anonymousClass2gk;
        this.f45420C = anonymousClass3rX;
        if (anonymousClass3rY != null) {
            this.f45419B.put(AnonymousClass2hG.ARVersionedCapabilitiesFacetracker, anonymousClass3rY);
        }
        if (anonymousClass3rY2 != null) {
            this.f45419B.put(AnonymousClass2hG.ARVersionedCapabilitiesSegmentation, anonymousClass3rY2);
        }
        if (anonymousClass3rY3 != null) {
            this.f45419B.put(AnonymousClass2hG.ARVersionedCapabilitiesBodytracker, anonymousClass3rY3);
        }
        if (anonymousClass3rY4 != null) {
            this.f45419B.put(AnonymousClass2hG.ARVersionedCapabilitiesHandtracker, anonymousClass3rY4);
        }
        if (anonymousClass3rY5 != null) {
            this.f45419B.put(AnonymousClass2hG.ARVersionedCapabilitiesTargetRecognition, anonymousClass3rY5);
        }
        if (anonymousClass3rY6 != null) {
            this.f45419B.put(AnonymousClass2hG.ARVersionedCapabilitiesXRay, anonymousClass3rY6);
        }
    }

    /* renamed from: B */
    public static synchronized boolean m20938B(AnonymousClass3rV anonymousClass3rV, int i, AnonymousClass3rY anonymousClass3rY, AnonymousClass2h0 anonymousClass2h0) {
        boolean A;
        synchronized (anonymousClass3rV) {
            try {
                A = anonymousClass3rY.m20946A(i, anonymousClass2h0);
            } catch (Exception e) {
                throw new AnonymousClass2hF(e);
            }
        }
        return A;
    }

    /* renamed from: C */
    public static void m20939C(AnonymousClass3rV anonymousClass3rV, AnonymousClass2hH anonymousClass2hH, List list, AnonymousClass3rY anonymousClass3rY, AnonymousClass3rQ anonymousClass3rQ, AnonymousClass2h0 anonymousClass2h0) {
        for (ARRequestAsset E : list) {
            try {
                if (!AnonymousClass3rV.m20941E(anonymousClass3rV, anonymousClass2hH.f32542D, anonymousClass3rY, E)) {
                    anonymousClass3rQ.m20936A(new AnonymousClass2hF("Models not found in cache even after download"));
                    return;
                }
            } catch (Exception e) {
                anonymousClass3rQ.m20936A(e);
                return;
            }
        }
        try {
            AnonymousClass3rV.m20938B(anonymousClass3rV, anonymousClass2hH.f32542D, anonymousClass3rY, anonymousClass2h0);
            anonymousClass3rQ.m20936A(null);
        } catch (Exception e2) {
            anonymousClass3rQ.m20936A(e2);
        }
    }

    /* renamed from: D */
    public static AnonymousClass2gl m20940D(AnonymousClass3rV anonymousClass3rV, AnonymousClass2hH anonymousClass2hH, int i, boolean z, String str, boolean z2, List list, AnonymousClass2h0 anonymousClass2h0, AtomicReference atomicReference, AnonymousClass3qz anonymousClass3qz, AnonymousClass3rQ anonymousClass3rQ) {
        AnonymousClass3rV anonymousClass3rV2 = anonymousClass3rV;
        AnonymousClass2gl anonymousClass3rS = new AnonymousClass3rS(anonymousClass3rV);
        AnonymousClass2hH anonymousClass2hH2 = anonymousClass2hH;
        AnonymousClass3rY anonymousClass3rY = (AnonymousClass3rY) anonymousClass3rV.f45419B.get(anonymousClass2hH.f32540B);
        AnonymousClass3rQ anonymousClass3rQ2 = anonymousClass3rQ;
        if (anonymousClass3rY == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Requested fetching unsupported capability: ");
            stringBuilder.append(anonymousClass2hH.f32540B);
            anonymousClass3rQ2.m20936A(new AnonymousClass2hF(stringBuilder.toString()));
            return anonymousClass3rS;
        }
        List arrayList = new ArrayList();
        List<ARRequestAsset> list2 = list;
        for (ARRequestAsset aRRequestAsset : list2) {
            try {
                if (!AnonymousClass3rV.m20941E(anonymousClass3rV, anonymousClass2hH.f32542D, anonymousClass3rY, aRRequestAsset)) {
                    arrayList.add(aRRequestAsset);
                }
            } catch (Exception e) {
                anonymousClass3rQ2.m20936A(e);
                return anonymousClass3rS;
            }
        }
        AnonymousClass3qz anonymousClass3qz2 = anonymousClass3qz;
        AnonymousClass2h0 anonymousClass2h02 = anonymousClass2h0;
        AtomicReference atomicReference2 = atomicReference;
        if (arrayList.size() == 0) {
            try {
                AnonymousClass3rV.m20938B(anonymousClass3rV2, anonymousClass2hH.f32542D, anonymousClass3rY, anonymousClass2h02);
                if (anonymousClass3qz != null) {
                    double doubleValue = ((Double) atomicReference2.get()).doubleValue();
                    double d = (double) i;
                    Double.isNaN(d);
                    atomicReference2.set(Double.valueOf(doubleValue + (1.0d / d)));
                    anonymousClass3qz2.m20902A(((Double) atomicReference2.get()).doubleValue());
                }
                anonymousClass3rQ2.m20936A(null);
                return anonymousClass3rS;
            } catch (Exception e2) {
                anonymousClass3rQ2.m20936A(e2);
                return anonymousClass3rS;
            }
        }
        AnonymousClass3rT anonymousClass3rT = new AnonymousClass3rT(anonymousClass3rV2, anonymousClass2hH2, list2, anonymousClass3rY, anonymousClass3rQ2, anonymousClass2h02);
        AtomicReference atomicReference3 = new AtomicReference(Double.valueOf(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED));
        return anonymousClass3rV2.f45421D.m16891A(arrayList, AnonymousClass2gy.m16913B(), anonymousClass3rT, new AnonymousClass3rU(anonymousClass3rV2, anonymousClass3qz2, atomicReference2, atomicReference3, i), z, str, z2);
    }

    /* renamed from: E */
    private static synchronized boolean m20941E(AnonymousClass3rV anonymousClass3rV, int i, AnonymousClass3rY anonymousClass3rY, ARRequestAsset aRRequestAsset) {
        boolean hLA;
        synchronized (anonymousClass3rV) {
            try {
                hLA = anonymousClass3rY.f45433B.hLA(null, aRRequestAsset.f32486E, null, true);
            } catch (Exception e) {
                throw new AnonymousClass2hF(e);
            }
        }
        return hLA;
    }
}
