package X;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: X.2om */
public final class AnonymousClass2om {
    /* renamed from: B */
    private final PackageManager f34361B;

    public AnonymousClass2om(PackageManager packageManager) {
        this.f34361B = packageManager;
    }

    /* renamed from: A */
    public final X.AnonymousClass2of m17293A() {
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
        r11 = this;
        r2 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        r3 = 0;
        r1 = r11.f34361B;	 Catch:{ NameNotFoundException -> 0x002d }
        r0 = X.AnonymousClass2oU.f34270B;	 Catch:{ NameNotFoundException -> 0x002d }
        r1 = r1.getPackageInfo(r0, r2);	 Catch:{ NameNotFoundException -> 0x002d }
        r6 = X.AnonymousClass2op.m17297B(r1);
        r7 = X.AnonymousClass2om.m17292B(r1);
        r10 = X.AnonymousClass2oT.m17279B(r1);
        r2 = new X.2of;
        r3 = (X.AnonymousClass1Fo) r3;
        r4 = r1.packageName;
        r0 = r1.applicationInfo;
        r5 = r0.enabled;
        r8 = r1.versionCode;
        r9 = r1.versionName;
        r0 = r1.applicationInfo;
        r11 = r0.targetSdkVersion;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11);
        return r2;
    L_0x002d:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2om.A():X.2of");
    }

    /* renamed from: B */
    public static final AnonymousClass2oe m17292B(PackageInfo packageInfo) {
        if (packageInfo.signatures != null) {
            if (packageInfo.signatures.length == 1) {
                Object obj = packageInfo.signatures[0];
                if (AnonymousClass2oU.f34275G.equals(obj)) {
                    return AnonymousClass2oe.APP_MANAGER_OLD_SIGN;
                }
                if (AnonymousClass2oU.f34273E.equals(obj)) {
                    return AnonymousClass2oe.APP_MANAGER_NEW_SIGN;
                }
            }
        }
        return AnonymousClass2oe.APP_MANAGER_UNKNOWN_SIGN;
    }
}
