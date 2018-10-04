package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.5OV */
public final class AnonymousClass5OV {
    /* renamed from: H */
    private static final long f62956H = TimeUnit.SECONDS.toMillis(9);
    /* renamed from: B */
    public final AnonymousClass5Lr f62957B;
    /* renamed from: C */
    public final AnonymousClass67g f62958C;
    /* renamed from: D */
    public long f62959D;
    /* renamed from: E */
    public final AnonymousClass0Cm f62960E;
    /* renamed from: F */
    private int f62961F;
    /* renamed from: G */
    private AnonymousClass0Ci f62962G;

    public AnonymousClass5OV(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass5Lr anonymousClass5Lr, AnonymousClass67g anonymousClass67g) {
        this.f62960E = anonymousClass0Cm;
        this.f62957B = anonymousClass5Lr;
        this.f62958C = anonymousClass67g;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: A */
    public final void m26404A(android.content.Context r8, int r9, java.util.List r10) {
        /*
        r7 = this;
        r5 = 1;
        r4 = 0;
        if (r9 >= r5) goto L_0x000f;
    L_0x0004:
        r0 = r7.f62957B;
        r0.m26307V();
        r7.f62961F = r4;
        r0 = 0;
        r7.f62962G = r0;
        return;
    L_0x000f:
        r2 = android.os.SystemClock.elapsedRealtime();
        r0 = r7.f62959D;
        r2 = r2 - r0;
        r0 = f62956H;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x003f;
    L_0x001c:
        r0 = r7.f62961F;
        if (r9 < r0) goto L_0x0031;
    L_0x0020:
        if (r9 != r0) goto L_0x002f;
    L_0x0022:
        r1 = r7.f62962G;
        r0 = r10.get(r4);
        r0 = X.AnonymousClass0LQ.B(r1, r0);
        if (r0 == 0) goto L_0x002f;
    L_0x002e:
        goto L_0x0031;
    L_0x002f:
        r6 = 0;
        goto L_0x0032;
    L_0x0031:
        r6 = 1;
    L_0x0032:
        if (r6 != 0) goto L_0x0040;
    L_0x0034:
        r7.f62961F = r9;
        r0 = r10.get(r4);
        r0 = (X.AnonymousClass0Ci) r0;
        r7.f62962G = r0;
        goto L_0x0040;
    L_0x003f:
        r6 = 1;
    L_0x0040:
        if (r9 <= r5) goto L_0x0064;
    L_0x0042:
        r3 = r8.getResources();
        r2 = 2131558435; // 0x7f0d0023 float:1.8742186E38 double:1.053129795E-314;
        r9 = r9 - r5;
        r0 = 2;
        r1 = new java.lang.Object[r0];
        r0 = r10.get(r4);
        r0 = (X.AnonymousClass0Ci) r0;
        r0 = r0.uT();
        r1[r4] = r0;
        r0 = java.lang.Integer.valueOf(r9);
        r1[r5] = r0;
        r3 = r3.getQuantityString(r2, r9, r1);
        goto L_0x0079;
    L_0x0064:
        r2 = 2131691601; // 0x7f0f0851 float:1.9012278E38 double:1.0531955876E-314;
        r1 = new java.lang.Object[r5];
        r0 = r10.get(r4);
        r0 = (X.AnonymousClass0Ci) r0;
        r0 = r0.uT();
        r1[r4] = r0;
        r3 = r8.getString(r2, r1);
    L_0x0079:
        r0 = r7.f62957B;
        r1 = r0.m26302Q();
        r0 = r7.f62957B;
        r0 = r0.f62457E;
        if (r0 == 0) goto L_0x00bd;
    L_0x0085:
        if (r6 != 0) goto L_0x00a0;
    L_0x0087:
        if (r1 < 0) goto L_0x009d;
    L_0x0089:
        r0 = r7.f62958C;
        r0 = r0.f72011B;
        r0 = r0.f71918G;
        r0 = r0.getLayoutManager();
        r0 = (X.AnonymousClass5Lp) r0;
        r0 = r0.bA();
        if (r1 > r0) goto L_0x009d;
    L_0x009b:
        r0 = 1;
        goto L_0x009e;
    L_0x009d:
        r0 = 0;
    L_0x009e:
        if (r0 == 0) goto L_0x00bd;
    L_0x00a0:
        r0 = r7.f62957B;
        r0 = r0.f62457E;
        r0.f67349B = r10;
        r0.f4910d = r3;
        r2 = r7.f62957B;
        r1 = r2.f62456D;
        r0 = r2.f62457E;
        r1 = r1.indexOf(r0);
        r0 = -1;
        if (r1 == r0) goto L_0x00bc;
    L_0x00b5:
        r0 = X.AnonymousClass5Lr.m26297B(r2, r1);
        r2.C(r0);
    L_0x00bc:
        goto L_0x00e3;
    L_0x00bd:
        r0 = android.os.SystemClock.elapsedRealtime();
        r7.f62959D = r0;
        r2 = new X.5cF;
        r0 = r7.f62960E;
        r0 = r0.B();
        r2.<init>(r0, r10, r3);
        r1 = r7.f62957B;
        r0 = r1.f62457E;
        if (r0 == 0) goto L_0x00d7;
    L_0x00d4:
        r1.m26305T(r0);
    L_0x00d7:
        r1.m26301P(r2);
        r1.f62457E = r2;
        r0 = r7.f62958C;
        r0 = r0.f72011B;
        r0.m29070B();
    L_0x00e3:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5OV.A(android.content.Context, int, java.util.List):void");
    }
}
