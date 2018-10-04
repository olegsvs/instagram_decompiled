package X;

import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

/* renamed from: X.1Ja */
public final class AnonymousClass1Ja extends Thread {
    /* renamed from: B */
    public final AnonymousClass1Jd f17081B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0DE f17082C;
    /* renamed from: D */
    private AnonymousClass0Di f17083D;
    /* renamed from: E */
    private final AnonymousClass1JK f17084E;
    /* renamed from: F */
    private final AnonymousClass0DF[] f17085F;

    public AnonymousClass1Ja(AnonymousClass0DE anonymousClass0DE, AnonymousClass1Jd anonymousClass1Jd, AnonymousClass1JK anonymousClass1JK) {
        this(anonymousClass0DE, anonymousClass1Jd, anonymousClass1JK, null);
    }

    private AnonymousClass1Ja(AnonymousClass0DE anonymousClass0DE, AnonymousClass1Jd anonymousClass1Jd, AnonymousClass1JK anonymousClass1JK, AnonymousClass0DF[] anonymousClass0DFArr) {
        this.f17082C = anonymousClass0DE;
        this.f17083D = null;
        this.f17081B = anonymousClass1Jd;
        this.f17084E = anonymousClass1JK;
        this.f17085F = anonymousClass0DFArr;
    }

    public AnonymousClass1Ja(AnonymousClass0DE anonymousClass0DE, AnonymousClass0DF... anonymousClass0DFArr) {
        this(anonymousClass0DE, null, null, anonymousClass0DFArr);
    }

    /* renamed from: A */
    public final void m10712A() {
        Throwable th;
        AnonymousClass0DE.f1820Y.getAndIncrement();
        WakeLock B;
        try {
            B = m10711B();
            try {
                if (this.f17081B == null) {
                    this.f17082C.m1182W(Integer.MAX_VALUE, this.f17083D, this.f17085F);
                } else {
                    AnonymousClass1Jd anonymousClass1Jd = this.f17081B;
                    Object E = AnonymousClass1Jb.m10716E(this.f17082C.f1821B);
                    if (E == null) {
                        E = "n/a";
                    }
                    anonymousClass1Jd.put("UPLOADED_BY_PROCESS", E);
                    AnonymousClass0DE.m1121N(this.f17082C, anonymousClass1Jd);
                    if (this.f17084E != null) {
                        this.f17084E.f17003C.delete();
                    }
                }
                if (B != null && B.isHeld()) {
                    AnonymousClass1DI.m10053E(B, -1207551984);
                }
            } catch (Throwable th2) {
                th = th2;
                if (B != null && B.isHeld()) {
                    AnonymousClass1DI.m10053E(B, 1870189837);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            B = null;
            AnonymousClass1DI.m10053E(B, 1870189837);
            throw th;
        }
    }

    /* renamed from: B */
    private WakeLock m10711B() {
        if (!new AnonymousClass0DR(this.f17082C.f1821B, AnonymousClass0DL.f1858B).m1215C("android.permission.WAKE_LOCK")) {
            return null;
        }
        WakeLock D = AnonymousClass1DI.m10052D((PowerManager) this.f17082C.f1821B.getSystemService("power"), 1, "ACRA wakelock", -1117710751);
        AnonymousClass1DI.m10054F(D, false, -1165716935);
        AnonymousClass1DI.m10050B(D, -2123982381);
        return D;
    }

    public final void run() {
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
        r3.m10712A();	 Catch:{ Throwable -> 0x0014, all -> 0x000b }
    L_0x0003:
        r1 = r3.f17082C;
        r0 = r3.f17084E;
        X.AnonymousClass0DE.m1120M(r1, r0);
        return;
    L_0x000b:
        r2 = move-exception;
        r1 = r3.f17082C;
        r0 = r3.f17084E;
        X.AnonymousClass0DE.m1120M(r1, r0);
        throw r2;
    L_0x0014:
        goto L_0x0003;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1Ja.run():void");
    }
}
