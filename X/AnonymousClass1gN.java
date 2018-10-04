package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1gN */
public final class AnonymousClass1gN {
    /* renamed from: B */
    public final AnonymousClass0EE f21354B;
    /* renamed from: C */
    public AnonymousClass4qg f21355C;
    /* renamed from: D */
    public final AnonymousClass1gK f21356D;
    /* renamed from: E */
    public final AnonymousClass0IL f21357E;
    /* renamed from: F */
    public final AnonymousClass0Cm f21358F;
    /* renamed from: G */
    private boolean f21359G;

    public AnonymousClass1gN(AnonymousClass0IL anonymousClass0IL, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE, AnonymousClass1gK anonymousClass1gK) {
        this.f21357E = anonymousClass0IL;
        this.f21358F = anonymousClass0Cm;
        this.f21354B = anonymousClass0EE;
        this.f21356D = anonymousClass1gK;
    }

    /* renamed from: B */
    public static AnonymousClass4qe m12494B(AnonymousClass1gN anonymousClass1gN) {
        AnonymousClass4qg anonymousClass4qg = anonymousClass1gN.f21355C;
        if (anonymousClass4qg == null) {
            return null;
        }
        AnonymousClass0Cm anonymousClass0Cm = anonymousClass1gN.f21358F;
        List<AnonymousClass4qe> list = anonymousClass4qg.f57854B;
        if (list != null) {
            for (AnonymousClass4qe anonymousClass4qe : list) {
                if (anonymousClass0Cm.f1759C.equals(anonymousClass4qe.f57852C)) {
                    break;
                }
            }
        }
        AnonymousClass4qe anonymousClass4qe2 = null;
        if (anonymousClass4qe2 == null || !((Boolean) AnonymousClass0CC.TL.m846H(anonymousClass1gN.f21358F)).booleanValue()) {
            return null;
        }
        return anonymousClass4qe2;
    }

    /* renamed from: C */
    public static void m12495C(X.AnonymousClass1gN r6, java.util.List r7) {
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
        r3 = new java.io.StringWriter;	 Catch:{ IOException -> 0x0098 }
        r3.<init>();	 Catch:{ IOException -> 0x0098 }
        r0 = X.AnonymousClass0Lm.f3274B;	 Catch:{ IOException -> 0x0098 }
        r2 = r0.createGenerator(r3);	 Catch:{ IOException -> 0x0098 }
        r2.writeStartArray();	 Catch:{ IOException -> 0x0098 }
        r5 = r7.iterator();	 Catch:{ IOException -> 0x0098 }
    L_0x0012:
        r0 = r5.hasNext();	 Catch:{ IOException -> 0x0098 }
        if (r0 == 0) goto L_0x0055;	 Catch:{ IOException -> 0x0098 }
    L_0x0018:
        r4 = r5.next();	 Catch:{ IOException -> 0x0098 }
        r4 = (X.AnonymousClass4qd) r4;	 Catch:{ IOException -> 0x0098 }
        r2.writeStartObject();	 Catch:{ IOException -> 0x0098 }
        r0 = r4.f57850E;	 Catch:{ IOException -> 0x0098 }
        if (r0 == 0) goto L_0x002c;	 Catch:{ IOException -> 0x0098 }
    L_0x0025:
        r1 = "surface_name";	 Catch:{ IOException -> 0x0098 }
        r0 = r4.f57850E;	 Catch:{ IOException -> 0x0098 }
        r2.writeStringField(r1, r0);	 Catch:{ IOException -> 0x0098 }
    L_0x002c:
        r0 = r4.f57847B;	 Catch:{ IOException -> 0x0098 }
        if (r0 == 0) goto L_0x003b;	 Catch:{ IOException -> 0x0098 }
    L_0x0030:
        r1 = "action_name";	 Catch:{ IOException -> 0x0098 }
        r0 = r4.f57847B;	 Catch:{ IOException -> 0x0098 }
        r0 = r0.A();	 Catch:{ IOException -> 0x0098 }
        r2.writeStringField(r1, r0);	 Catch:{ IOException -> 0x0098 }
    L_0x003b:
        r1 = "badged";	 Catch:{ IOException -> 0x0098 }
        r0 = r4.f57848C;	 Catch:{ IOException -> 0x0098 }
        r2.writeBooleanField(r1, r0);	 Catch:{ IOException -> 0x0098 }
        r0 = r4.f57849D;	 Catch:{ IOException -> 0x0098 }
        if (r0 == 0) goto L_0x0051;	 Catch:{ IOException -> 0x0098 }
    L_0x0046:
        r1 = "connection_type_shown";	 Catch:{ IOException -> 0x0098 }
        r0 = r4.f57849D;	 Catch:{ IOException -> 0x0098 }
        r0 = r0.A();	 Catch:{ IOException -> 0x0098 }
        r2.writeStringField(r1, r0);	 Catch:{ IOException -> 0x0098 }
    L_0x0051:
        r2.writeEndObject();	 Catch:{ IOException -> 0x0098 }
        goto L_0x0012;	 Catch:{ IOException -> 0x0098 }
    L_0x0055:
        r2.writeEndArray();	 Catch:{ IOException -> 0x0098 }
        r2.close();	 Catch:{ IOException -> 0x0098 }
        r4 = r3.toString();	 Catch:{ IOException -> 0x0098 }
        r0 = r6.f21357E;	 Catch:{ IOException -> 0x0098 }
        r3 = r0.getContext();	 Catch:{ IOException -> 0x0098 }
        r0 = r6.f21357E;	 Catch:{ IOException -> 0x0098 }
        r2 = r0.getLoaderManager();	 Catch:{ IOException -> 0x0098 }
        r0 = r6.f21358F;	 Catch:{ IOException -> 0x0098 }
        r1 = new X.0Pt;	 Catch:{ IOException -> 0x0098 }
        r1.<init>(r0);	 Catch:{ IOException -> 0x0098 }
        r0 = X.AnonymousClass0Pu.f4247G;	 Catch:{ IOException -> 0x0098 }
        r1.f4226J = r0;	 Catch:{ IOException -> 0x0098 }
        r0 = "family_navigation/log_user_action/";	 Catch:{ IOException -> 0x0098 }
        r1.f4229M = r0;	 Catch:{ IOException -> 0x0098 }
        r0 = X.AnonymousClass0Pv.class;	 Catch:{ IOException -> 0x0098 }
        r1 = r1.m3944M(r0);	 Catch:{ IOException -> 0x0098 }
        r0 = "action_data";	 Catch:{ IOException -> 0x0098 }
        r0 = r1.m3935D(r0, r4);	 Catch:{ IOException -> 0x0098 }
        r0 = r0.m3945N();	 Catch:{ IOException -> 0x0098 }
        r1 = r0.m3939H();	 Catch:{ IOException -> 0x0098 }
        r0 = new X.53Q;	 Catch:{ IOException -> 0x0098 }
        r0.<init>(r6);	 Catch:{ IOException -> 0x0098 }
        r1.f2849B = r0;	 Catch:{ IOException -> 0x0098 }
        X.AnonymousClass0Px.m3949B(r3, r2, r1);	 Catch:{ IOException -> 0x0098 }
    L_0x0098:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1gN.C(X.1gN, java.util.List):void");
    }

    /* renamed from: D */
    public static void m12496D(AnonymousClass1gN anonymousClass1gN) {
        AnonymousClass4qe B = AnonymousClass1gN.m12494B(anonymousClass1gN);
        anonymousClass1gN.f21356D.m12492A(B);
        if (B != null && !anonymousClass1gN.f21359G) {
            anonymousClass1gN.f21359G = true;
            List arrayList = new ArrayList(1);
            arrayList.add(new AnonymousClass4qd("Profile_header", AnonymousClass4qc.f57845E, B.f57853D, AnonymousClass4qi.f57857E));
            AnonymousClass1gN.m12495C(anonymousClass1gN, arrayList);
        }
    }
}
