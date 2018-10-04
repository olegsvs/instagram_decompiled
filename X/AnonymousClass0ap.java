package X;

import android.content.SharedPreferences.Editor;
import com.instagram.common.notifications.push.PushChannelType;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.0ap */
public final class AnonymousClass0ap {
    /* renamed from: B */
    private static AnonymousClass0aq f6606B;

    /* renamed from: B */
    public static synchronized AnonymousClass0aq m5490B() {
        AnonymousClass0aq anonymousClass0aq;
        synchronized (AnonymousClass0ap.class) {
            if (f6606B == null) {
                f6606B = AnonymousClass0ap.m5492D(AnonymousClass0EV.f1977B);
            }
            anonymousClass0aq = f6606B;
        }
        return anonymousClass0aq;
    }

    /* renamed from: C */
    public static void m5491C() {
        Collection<String> arrayList = new ArrayList();
        for (PushChannelType A : PushChannelType.values()) {
            arrayList.add(A.m4154A());
        }
        Editor edit = AnonymousClass0FH.f2099C.f2100B.edit();
        for (String str : arrayList) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("push_reg_date");
            stringBuilder.append(str);
            edit.remove(stringBuilder.toString());
        }
        edit.apply();
    }

    /* renamed from: D */
    private static X.AnonymousClass0aq m5492D(android.content.Context r5) {
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
        r0 = "com.amazon.device.messaging.ADM";	 Catch:{ ClassNotFoundException -> 0x000b }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x000b }
        r0 = new X.1TS;	 Catch:{ ClassNotFoundException -> 0x000b }
        r0.<init>(r5);	 Catch:{ ClassNotFoundException -> 0x000b }
        return r0;	 Catch:{ ClassNotFoundException -> 0x000b }
    L_0x000b:
        r0 = X.AnonymousClass1BY.m9832F();
        if (r0 == 0) goto L_0x0055;
    L_0x0011:
        r0 = X.AnonymousClass0CC.rK;
        r3 = X.AnonymousClass0E6.m1317C(r0);
        r3 = (java.lang.String) r3;
        r2 = 0;
        r4 = new X.1E7;
        r4.<init>(r5);
        r1 = new android.os.Bundle;
        r1.<init>();
        r0 = X.AnonymousClass1E2.BLOCKED_COUNTRIES_HOSTNAME;
        r0.m10145E(r1, r3);
        r3 = new com.facebook.push.fbns.ipc.FbnsAIDLRequest;
        r0 = X.AnonymousClass1EC.f15855K;
        r0 = r0.m10177B();
        r3.<init>(r1, r0);
        r1 = new android.os.Bundle;
        r1.<init>();
        r0 = X.AnonymousClass1E2.BLOCKED_COUNTRIES_ANALYTICS_ENDPOINT;
        r0.m10145E(r1, r2);
        r2 = new com.facebook.push.fbns.ipc.FbnsAIDLRequest;
        r0 = X.AnonymousClass1EC.f15855K;
        r0 = r0.m10177B();
        r2.<init>(r1, r0);
        r0 = 2;
        r1 = new com.facebook.push.fbns.ipc.FbnsAIDLRequest[r0];
        r0 = 0;
        r1[r0] = r3;
        r0 = 1;
        r1[r0] = r2;
        r4.m10171A(r1);
    L_0x0055:
        r1 = new X.1BZ;
        r0 = X.AnonymousClass0Cq.f1767B;
        r1.<init>(r0, r5);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0ap.D(android.content.Context):X.0aq");
    }
}
