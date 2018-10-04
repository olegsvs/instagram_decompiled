package X;

import java.util.HashMap;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: X.0AN */
public abstract class AnonymousClass0AN implements AnonymousClass06R {
    /* renamed from: B */
    public final String f1197B;
    /* renamed from: C */
    public final HashMap f1198C = new HashMap();

    public AnonymousClass0AN(String str) {
        this.f1197B = str;
    }

    /* renamed from: A */
    public final synchronized Object m688A(AnonymousClass06Q anonymousClass06Q) {
        try {
            if (!this.f1198C.containsKey(anonymousClass06Q)) {
                this.f1198C.put(anonymousClass06Q, anonymousClass06Q.xT().newInstance());
            }
        } catch (Throwable e) {
            throw new RuntimeException(String.format("Incorrect usage for %s type %s", new Object[]{anonymousClass06Q.aN(), anonymousClass06Q.xT()}), e);
        }
        return this.f1198C.get(anonymousClass06Q);
    }

    /* renamed from: B */
    public final synchronized void m689B(AnonymousClass06Q anonymousClass06Q, Object obj) {
        this.f1198C.put(anonymousClass06Q, obj);
    }

    /* renamed from: C */
    public synchronized JSONObject mo194C(boolean z, boolean z2) {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Entry entry : this.f1198C.entrySet()) {
            jSONObject.putOpt(((AnonymousClass06Q) entry.getKey()).aN(), entry.getValue());
        }
        return jSONObject;
    }

    public final java.lang.String toString() {
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
        r1 = this;
        r0 = 0;
        r0 = r1.mo194C(r0, r0);	 Catch:{ JSONException -> 0x000a }
        r0 = r0.toString();	 Catch:{ JSONException -> 0x000a }
        return r0;	 Catch:{ JSONException -> 0x000a }
    L_0x000a:
        r0 = "";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0AN.toString():java.lang.String");
    }
}
