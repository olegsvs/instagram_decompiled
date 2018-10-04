package X;

import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;

/* renamed from: X.1QX */
public abstract class AnonymousClass1QX {
    /* renamed from: C */
    public static String f18399C = "onboarding_step";
    /* renamed from: D */
    public static String f18400D = "skipped";
    /* renamed from: B */
    public Deque f18401B;

    public AnonymousClass1QX(Collection collection) {
        this.f18401B = new LinkedList(collection);
    }

    /* renamed from: A */
    public final java.lang.String m11349A() {
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
        r3 = this;
        r2 = new org.json.JSONArray;
        r2.<init>();
        r0 = r3.f18401B;
        r1 = r0.iterator();
    L_0x000b:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0021;
    L_0x0011:
        r0 = r1.next();
        r0 = (X.AnonymousClass58o) r0;
        r0 = r0.f60518B;
        r0 = r0.name();
        r2.put(r0);
        goto L_0x000b;
    L_0x0021:
        r1 = new org.json.JSONObject;
        r1.<init>();
        r0 = "OnboardingFlowState";	 Catch:{ JSONException -> 0x0030 }
        r1.put(r0, r2);	 Catch:{ JSONException -> 0x0030 }
        r0 = r1.toString();	 Catch:{ JSONException -> 0x0030 }
        goto L_0x0032;	 Catch:{ JSONException -> 0x0030 }
    L_0x0030:
        r0 = "{\"OnboardingFlowState\" : [\"ERROR\"]}";
    L_0x0032:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1QX.A():java.lang.String");
    }
}
