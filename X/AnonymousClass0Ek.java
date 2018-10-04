package X;

import android.content.Context;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Ek */
public final class AnonymousClass0Ek {
    /* renamed from: E */
    private static final long f2015E = TimeUnit.HOURS.toMillis(2);
    /* renamed from: B */
    public final Context f2016B;
    /* renamed from: C */
    public final File f2017C;
    /* renamed from: D */
    public final File f2018D;

    public AnonymousClass0Ek(Context context) {
        this.f2017C = new File(context.getFilesDir(), "profilo_config");
        this.f2018D = new File(context.getFilesDir(), "profilo_config_temp");
        this.f2016B = context.getApplicationContext();
    }

    /* renamed from: A */
    public final boolean m1468A() {
        this.f2018D.delete();
        return this.f2017C.delete();
    }

    /* renamed from: B */
    public final java.lang.String m1469B() {
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
        r4 = this;
        r3 = r4.f2017C;
        r0 = "com.facebook.loom.config.file";
        r2 = X.AnonymousClass0D5.m1098C(r0);
        r0 = android.text.TextUtils.isEmpty(r2);
        if (r0 != 0) goto L_0x0020;
    L_0x000e:
        r1 = new java.io.File;
        r0 = r4.f2016B;
        r0 = r0.getCacheDir();
        r1.<init>(r0, r2);
        r0 = r1.exists();
        if (r0 == 0) goto L_0x0020;
    L_0x001f:
        r3 = r1;
    L_0x0020:
        r0 = r3.exists();
        r1 = 0;
        if (r0 == 0) goto L_0x0032;
    L_0x0027:
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0031 }
        r0.<init>();	 Catch:{ IOException -> 0x0031 }
        r0 = X.AnonymousClass1Ag.m9747K(r3, r0);	 Catch:{ IOException -> 0x0031 }
        return r0;	 Catch:{ IOException -> 0x0031 }
    L_0x0031:
        return r1;
    L_0x0032:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0Ek.B():java.lang.String");
    }

    /* renamed from: B */
    private static boolean m1467B(AnonymousClass0Ek anonymousClass0Ek) {
        if (!anonymousClass0Ek.f2017C.exists()) {
            return true;
        }
        if (AnonymousClass0Gd.m1838C() - AnonymousClass0FH.f2099C.f2100B.getLong("loom_config_last_sync_timestamp", 0) > f2015E) {
            return true;
        }
        return null;
    }

    /* renamed from: C */
    public final void m1470C(AnonymousClass0Cm anonymousClass0Cm) {
        if (AnonymousClass0Ek.m1467B(this)) {
            File file = this.f2018D;
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt((AnonymousClass0Cn) anonymousClass0Cm);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
            anonymousClass0Pt.f4229M = "loom/fetch_config/";
            anonymousClass0Pt.f4228L = new AnonymousClass0RA(AnonymousClass0Pv.class, file);
            AnonymousClass0GA H = anonymousClass0Pt.m3939H();
            H.f2849B = new AnonymousClass1C8(this);
            AnonymousClass0Ix.m2384D(H);
        }
    }
}
