package X;

import android.content.Context;
import com.instagram.debug.quickexperiment.storage.QuickExperimentBisectStore;
import java.util.List;

/* renamed from: X.09h */
public final class AnonymousClass09h {
    /* renamed from: F */
    public static final AnonymousClass0FZ f1104F = AnonymousClass0FZ.m1634B();
    /* renamed from: G */
    public static AnonymousClass09h f1105G;
    /* renamed from: B */
    public String f1106B;
    /* renamed from: C */
    public final QuickExperimentBisectStore f1107C;
    /* renamed from: D */
    private int f1108D;
    /* renamed from: E */
    private int f1109E;

    public AnonymousClass09h(Context context) {
        this.f1107C = QuickExperimentBisectStore.getBisectStore(context.getFilesDir());
    }

    /* renamed from: A */
    public final synchronized String m636A() {
        if (AnonymousClass09h.m632D() && this.f1109E == this.f1108D) {
            return this.f1107C.getExperimentStringByIndex(this.f1109E);
        }
        return "N/A";
    }

    /* renamed from: B */
    public final synchronized int m637B() {
        return this.f1108D;
    }

    /* renamed from: B */
    public static synchronized void m630B() {
        synchronized (AnonymousClass09h.class) {
            if (AnonymousClass09h.m632D()) {
                f1104F.f2177B.edit().remove("qe_user_bisect_id").apply();
                f1105G.f1107C.clear();
                f1105G = null;
            }
        }
    }

    /* renamed from: C */
    public final synchronized int m638C() {
        int i;
        i = this.f1109E;
        return i + ((this.f1108D - i) / 2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: C */
    public static synchronized X.AnonymousClass09h m631C(android.content.Context r6) {
        /*
        r5 = X.AnonymousClass09h.class;
        monitor-enter(r5);
        r0 = X.AnonymousClass09h.m632D();	 Catch:{ all -> 0x0046 }
        if (r0 == 0) goto L_0x000d;
    L_0x0009:
        r0 = f1105G;	 Catch:{ all -> 0x0046 }
    L_0x000b:
        monitor-exit(r5);
        return r0;
    L_0x000d:
        r0 = f1104F;	 Catch:{ all -> 0x0046 }
        r0 = r0.m1642H();	 Catch:{ all -> 0x0046 }
        if (r0 != 0) goto L_0x0018;
    L_0x0015:
        r0 = 0;
        monitor-exit(r5);
        return r0;
    L_0x0018:
        r0 = new X.09h;	 Catch:{ all -> 0x0046 }
        r0.<init>(r6);	 Catch:{ all -> 0x0046 }
        f1105G = r0;	 Catch:{ all -> 0x0046 }
        r3 = f1105G;	 Catch:{ all -> 0x0046 }
        r4 = f1104F;	 Catch:{ all -> 0x0046 }
        r2 = r4.f2177B;	 Catch:{ all -> 0x0046 }
        r1 = "qe_user_bisect_top";
        r0 = -1;
        r0 = r2.getInt(r1, r0);	 Catch:{ all -> 0x0046 }
        r3.f1109E = r0;	 Catch:{ all -> 0x0046 }
        r3 = f1105G;	 Catch:{ all -> 0x0046 }
        r2 = r4.f2177B;	 Catch:{ all -> 0x0046 }
        r1 = "qe_user_bisect_bottom";
        r0 = -1;
        r0 = r2.getInt(r1, r0);	 Catch:{ all -> 0x0046 }
        r3.f1108D = r0;	 Catch:{ all -> 0x0046 }
        r1 = f1105G;	 Catch:{ all -> 0x0046 }
        r0 = r4.m1642H();	 Catch:{ all -> 0x0046 }
        r1.f1106B = r0;	 Catch:{ all -> 0x0046 }
        r0 = f1105G;	 Catch:{ all -> 0x0046 }
        goto L_0x000b;
    L_0x0046:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.09h.C(android.content.Context):X.09h");
    }

    /* renamed from: D */
    public final synchronized Object m639D(String str, String str2, AnonymousClass0CE anonymousClass0CE) {
        if (AnonymousClass09h.m632D()) {
            String str3 = null;
            if (m641F(AnonymousClass09h.m635G(this, str))) {
                str3 = this.f1107C.getParameter(str, str2);
            }
            return anonymousClass0CE.m850B(str3);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("During no bisection, tried to get bisection value of parameter: ");
        stringBuilder.append(anonymousClass0CE.toString());
        AnonymousClass0Dc.m1243F("QuickExperimentBisection", stringBuilder.toString());
        return anonymousClass0CE.f1491B;
    }

    /* renamed from: D */
    public static synchronized boolean m632D() {
        boolean z;
        synchronized (AnonymousClass09h.class) {
            z = f1105G != null;
        }
        return z;
    }

    /* renamed from: E */
    public final synchronized int m640E() {
        return this.f1109E;
    }

    /* renamed from: E */
    public static synchronized AnonymousClass09h m633E(Context context, String str, List list) {
        AnonymousClass09h anonymousClass09h;
        synchronized (AnonymousClass09h.class) {
            f1105G = new AnonymousClass09h(context);
            f1105G.f1107C.clear();
            for (AnonymousClass1D5 anonymousClass1D5 : list) {
                f1105G.f1107C.putParameters(anonymousClass1D5.f15625F, anonymousClass1D5.f15627H);
            }
            f1105G.f1107C.persist();
            f1105G.f1106B = str;
            f1105G.f1109E = 0;
            f1105G.f1108D = list.size() - 1;
            AnonymousClass0FZ anonymousClass0FZ = f1104F;
            anonymousClass0FZ.f2177B.edit().putString("qe_user_bisect_id", f1105G.f1106B).apply();
            anonymousClass0FZ.m1653S(f1105G.f1109E);
            anonymousClass0FZ.m1654T(f1105G.f1108D);
            anonymousClass09h = f1105G;
        }
        return anonymousClass09h;
    }

    /* renamed from: F */
    public final synchronized boolean m641F(Integer num) {
        boolean z;
        z = false;
        if (AnonymousClass09h.m632D()) {
            if (num != null) {
                int C = m638C();
                if (num.intValue() >= this.f1109E && num.intValue() <= C) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: F */
    private static int[] m634F(int i, int i2, int i3) {
        return new int[]{i2 + 1, i3};
    }

    /* renamed from: G */
    private static synchronized Integer m635G(AnonymousClass09h anonymousClass09h, String str) {
        synchronized (anonymousClass09h) {
            if (AnonymousClass09h.m632D()) {
                try {
                    Integer universeIndex = anonymousClass09h.f1107C.getUniverseIndex(str);
                    return universeIndex;
                } catch (Throwable e) {
                    AnonymousClass0Dc.m1244G("QuickExperimentBisection", "Auto-unboxing error", e);
                    return null;
                }
            }
        }
    }

    /* renamed from: G */
    public final synchronized void m642G() {
        if (AnonymousClass09h.m632D() && this.f1109E != this.f1108D) {
            int i = this.f1109E;
            int C = m638C();
            int[] iArr = new int[]{i, C};
            this.f1109E = iArr[0];
            this.f1108D = iArr[1];
            AnonymousClass0FZ anonymousClass0FZ = f1104F;
            anonymousClass0FZ.m1653S(this.f1109E);
            anonymousClass0FZ.m1654T(this.f1108D);
        }
    }

    /* renamed from: H */
    public final synchronized void m643H() {
        if (AnonymousClass09h.m632D() && this.f1109E != this.f1108D) {
            int[] F = AnonymousClass09h.m634F(this.f1109E, m638C(), this.f1108D);
            this.f1109E = F[0];
            this.f1108D = F[1];
            AnonymousClass0FZ anonymousClass0FZ = f1104F;
            anonymousClass0FZ.m1653S(this.f1109E);
            anonymousClass0FZ.m1654T(this.f1108D);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: I */
    public final synchronized boolean m644I() {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = X.AnonymousClass09h.m632D();	 Catch:{ all -> 0x007b }
        r8 = 0;
        if (r0 != 0) goto L_0x0011;
    L_0x0008:
        r1 = "QuickExperimentBisection";
        r0 = "Tried to undo step, but bisect is null";
        X.AnonymousClass0Dc.m1243F(r1, r0);	 Catch:{ all -> 0x007b }
    L_0x000f:
        monitor-exit(r9);
        return r8;
    L_0x0011:
        r0 = r9.f1107C;	 Catch:{ all -> 0x007b }
        r6 = r0.getQeCount();	 Catch:{ all -> 0x007b }
        r7 = 1;
        r6 = r6 - r7;
        r0 = r9.f1107C;	 Catch:{ all -> 0x007b }
        r0 = r0.getQeCount();	 Catch:{ all -> 0x007b }
        r0 = (double) r0;	 Catch:{ all -> 0x007b }
        r2 = java.lang.Math.log(r0);	 Catch:{ all -> 0x007b }
        r0 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r0 = java.lang.Math.log(r0);	 Catch:{ all -> 0x007b }
        r2 = r2 / r0;
        r0 = java.lang.Math.ceil(r2);	 Catch:{ all -> 0x007b }
        r5 = (int) r0;	 Catch:{ all -> 0x007b }
        r0 = r9.f1109E;	 Catch:{ all -> 0x007b }
        if (r0 != 0) goto L_0x0040;
    L_0x0034:
        r0 = r9.f1108D;	 Catch:{ all -> 0x007b }
        if (r6 != r0) goto L_0x0040;
    L_0x0038:
        r1 = "QuickExperimentBisection";
        r0 = "Cannot step up any further";
        X.AnonymousClass0Dc.m1243F(r1, r0);	 Catch:{ all -> 0x007b }
        goto L_0x000f;
    L_0x0040:
        r4 = 0;
        r3 = 0;
    L_0x0042:
        if (r4 >= r5) goto L_0x0073;
    L_0x0044:
        r0 = r6 - r3;
        r0 = r0 / 2;
        r2 = r3 + r0;
        r0 = r9.f1108D;	 Catch:{ all -> 0x007b }
        if (r0 > r2) goto L_0x0058;
    L_0x004e:
        r0 = 2;
        r1 = new int[r0];	 Catch:{ all -> 0x007b }
        r0 = 0;
        r1[r0] = r3;	 Catch:{ all -> 0x007b }
        r0 = 1;
        r1[r0] = r2;	 Catch:{ all -> 0x007b }
        goto L_0x005c;
    L_0x0058:
        r1 = X.AnonymousClass09h.m634F(r3, r2, r6);	 Catch:{ all -> 0x007b }
    L_0x005c:
        r2 = r1[r8];	 Catch:{ all -> 0x007b }
        r1 = r1[r7];	 Catch:{ all -> 0x007b }
        r0 = r9.f1109E;	 Catch:{ all -> 0x007b }
        if (r2 != r0) goto L_0x006e;
    L_0x0064:
        r0 = r9.f1108D;	 Catch:{ all -> 0x007b }
        if (r1 != r0) goto L_0x006e;
    L_0x0068:
        r9.f1109E = r3;	 Catch:{ all -> 0x007b }
        r9.f1108D = r6;	 Catch:{ all -> 0x007b }
        monitor-exit(r9);
        return r7;
    L_0x006e:
        r4 = r4 + 1;
        r6 = r1;
        r3 = r2;
        goto L_0x0042;
    L_0x0073:
        r1 = "QuickExperimentBisection";
        r0 = "Tried to undo step, but couldn't calculate previous step in maximum number of steps";
        X.AnonymousClass0Dc.m1243F(r1, r0);	 Catch:{ all -> 0x007b }
        goto L_0x000f;
    L_0x007b:
        r0 = move-exception;
        monitor-exit(r9);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.09h.I():boolean");
    }
}
