package X;

import com.facebook.sonar.core.SonarClient;
import com.facebook.sonar.plugins.analyticslogging.AnalyticsLoggingSonarPlugin;
import com.facebook.sonar.plugins.analyticslogging.AnalyticsSonarObject;
import java.util.LinkedList;

/* renamed from: X.0FY */
public final class AnonymousClass0FY implements AnonymousClass0FX {
    /* renamed from: B */
    private final LinkedList f2174B = new LinkedList();
    /* renamed from: C */
    private final SonarClient f2175C;

    public AnonymousClass0FY(SonarClient sonarClient) {
        this.f2175C = sonarClient;
    }

    /* renamed from: A */
    public final AnalyticsLoggingSonarPlugin m1633A() {
        return (AnalyticsLoggingSonarPlugin) this.f2175C.getPlugin("AnalyticsLogging");
    }

    /* renamed from: B */
    public static com.facebook.sonar.plugins.analyticslogging.AnalyticsSonarObject m1632B(X.AnonymousClass0NN r7) {
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
        r1 = new com.facebook.sonar.plugins.analyticslogging.AnalyticsSonarObject$Builder;
        r1.<init>();
        r0 = r7.f3555E;
        r1 = r1.setModule(r0);
        r0 = r7.f3556F;
        r2 = r1.setName(r0);
        r0 = r7.f3557G;
        r2 = r2.setTime(r0);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r7.f3555E;
        r1.append(r0);
        r0 = " ";
        r1.append(r0);
        r0 = r7.f3556F;
        r1.append(r0);
        r0 = r1.toString();
        r6 = r2.setFilter(r0);
        r0 = r7.f3552B;
        r5 = new org.json.JSONObject;
        r5.<init>();
        r4 = new X.23R;
        r4.<init>(r0);
    L_0x003f:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x007a;
    L_0x0045:
        r3 = r4.next();
        r3 = (android.util.Pair) r3;
        r1 = r3.first;	 Catch:{ JSONException -> 0x0055 }
        r1 = (java.lang.String) r1;	 Catch:{ JSONException -> 0x0055 }
        r0 = r3.second;	 Catch:{ JSONException -> 0x0055 }
        r5.put(r1, r0);	 Catch:{ JSONException -> 0x0055 }
        goto L_0x003f;	 Catch:{ JSONException -> 0x0055 }
    L_0x0055:
        r1 = move-exception;
        r0 = "error parsing";
        X.AnonymousClass0Gn.m1880G(r0, r1);
        r2 = r3.first;	 Catch:{ JSONException -> 0x003f }
        r2 = (java.lang.String) r2;	 Catch:{ JSONException -> 0x003f }
        r1 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x003f }
        r1.<init>();	 Catch:{ JSONException -> 0x003f }
        r0 = "json_encoding_error: ";	 Catch:{ JSONException -> 0x003f }
        r1.append(r0);	 Catch:{ JSONException -> 0x003f }
        r0 = r3.second;	 Catch:{ JSONException -> 0x003f }
        r0 = r0.toString();	 Catch:{ JSONException -> 0x003f }
        r1.append(r0);	 Catch:{ JSONException -> 0x003f }
        r0 = r1.toString();	 Catch:{ JSONException -> 0x003f }
        r5.put(r2, r0);	 Catch:{ JSONException -> 0x003f }
        goto L_0x003f;	 Catch:{ JSONException -> 0x003f }
    L_0x007a:
        r0 = r6.setExtras(r5);
        r0 = r0.build();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0FY.B(X.0NN):com.facebook.sonar.plugins.analyticslogging.AnalyticsSonarObject");
    }

    public final void Qi(AnonymousClass0NN anonymousClass0NN) {
        AnalyticsSonarObject B = AnonymousClass0FY.m1632B(anonymousClass0NN);
        synchronized (this.f2174B) {
            if (this.f2175C == null || m1633A() == null || !m1633A().isConnected()) {
                this.f2174B.add(B);
            } else {
                AnalyticsLoggingSonarPlugin A = m1633A();
                while (!this.f2174B.isEmpty()) {
                    A.reportEvent((AnalyticsSonarObject) this.f2174B.pop());
                }
                A.reportEvent(B);
            }
        }
    }
}
