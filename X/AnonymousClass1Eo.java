package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.1Eo */
public class AnonymousClass1Eo {
    static {
        AnonymousClass1Eo anonymousClass1Eo = new AnonymousClass1Eo();
    }

    /* renamed from: G */
    public static final PendingIntent m10241G(Context context, int i, int i2, String str) {
        Intent H = AnonymousClass1Eo.m10242H(context, i, str);
        return H == null ? null : PendingIntent.getActivity(context, i2, H, 268435456);
    }

    /* renamed from: H */
    public static android.content.Intent m10242H(android.content.Context r5, int r6, java.lang.String r7) {
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
        switch(r6) {
            case 1: goto L_0x0019;
            case 2: goto L_0x0019;
            case 3: goto L_0x0005;
            default: goto L_0x0003;
        };
    L_0x0003:
        r0 = 0;
        return r0;
    L_0x0005:
        r2 = "com.google.android.gms";
        r1 = "package";
        r0 = 0;
        r2 = android.net.Uri.fromParts(r1, r2, r0);
        r1 = new android.content.Intent;
        r0 = "android.settings.APPLICATION_DETAILS_SETTINGS";
        r1.<init>(r0);
        r1.setData(r2);
        return r1;
    L_0x0019:
        if (r5 == 0) goto L_0x002e;
    L_0x001b:
        r0 = X.AnonymousClass1Ez.m10272B(r5);
        if (r0 == 0) goto L_0x002e;
    L_0x0021:
        r1 = new android.content.Intent;
        r0 = "com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION";
        r1.<init>(r0);
        r0 = "com.google.android.wearable.app";
        r1.setPackage(r0);
        return r1;
    L_0x002e:
        r4 = "com.google.android.gms";
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r0 = "gcore_";
        r3.append(r0);
        r0 = 11020000; // 0xa826e0 float:1.5442309E-38 double:5.4446034E-317;
        r3.append(r0);
        r0 = "-";
        r3.append(r0);
        r0 = android.text.TextUtils.isEmpty(r7);
        if (r0 != 0) goto L_0x004e;
    L_0x004b:
        r3.append(r7);
    L_0x004e:
        r0 = "-";
        r3.append(r0);
        if (r5 == 0) goto L_0x005c;
    L_0x0055:
        r0 = r5.getPackageName();
        r3.append(r0);
    L_0x005c:
        r0 = "-";
        r3.append(r0);
        if (r5 == 0) goto L_0x007b;
    L_0x0063:
        r0 = X.AnonymousClass1F5.m10288B(r5);	 Catch:{ NameNotFoundException -> 0x007b }
        r2 = r5.getPackageName();	 Catch:{ NameNotFoundException -> 0x007b }
        r1 = 0;	 Catch:{ NameNotFoundException -> 0x007b }
        r0 = r0.f15976B;	 Catch:{ NameNotFoundException -> 0x007b }
        r0 = r0.getPackageManager();	 Catch:{ NameNotFoundException -> 0x007b }
        r0 = r0.getPackageInfo(r2, r1);	 Catch:{ NameNotFoundException -> 0x007b }
        r0 = r0.versionCode;	 Catch:{ NameNotFoundException -> 0x007b }
        r3.append(r0);	 Catch:{ NameNotFoundException -> 0x007b }
    L_0x007b:
        r3 = r3.toString();
        r2 = new android.content.Intent;
        r0 = "android.intent.action.VIEW";
        r2.<init>(r0);
        r0 = "market://details";
        r0 = android.net.Uri.parse(r0);
        r1 = r0.buildUpon();
        r0 = "id";
        r1 = r1.appendQueryParameter(r0, r4);
        r0 = android.text.TextUtils.isEmpty(r3);
        if (r0 != 0) goto L_0x00a1;
    L_0x009c:
        r0 = "pcampaignid";
        r1.appendQueryParameter(r0, r3);
    L_0x00a1:
        r0 = r1.build();
        r2.setData(r0);
        r0 = "com.android.vending";
        r2.setPackage(r0);
        r0 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r2.addFlags(r0);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1Eo.H(android.content.Context, int, java.lang.String):android.content.Intent");
    }

    /* renamed from: A */
    public String m10243A(int i) {
        return ConnectionResult.m10283B(i);
    }

    /* renamed from: B */
    public int m10244B(Context context) {
        int C = AnonymousClass1Eu.m10258C(context);
        return AnonymousClass1Eu.m10262G(context, C) ? 18 : C;
    }

    /* renamed from: C */
    public boolean m10245C(int i) {
        return AnonymousClass1Eu.m10259D(i);
    }
}
