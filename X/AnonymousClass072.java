package X;

import android.content.BroadcastReceiver;

/* renamed from: X.072 */
public final class AnonymousClass072 extends BroadcastReceiver {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass075 f452B;

    public AnonymousClass072(AnonymousClass075 anonymousClass075) {
        this.f452B = anonymousClass075;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r13, android.content.Intent r14) {
        /*
        r12 = this;
        r0 = 1497928290; // 0x59489262 float:3.52849656E15 double:7.40074908E-315;
        r5 = X.AnonymousClass0cQ.m5854D(r12, r0);
        r1 = r14.getAction();
        r0 = r12.f452B;
        r0 = r0.f464J;
        r0 = X.AnonymousClass05x.m351B(r1, r0);
        if (r0 != 0) goto L_0x001c;
    L_0x0015:
        r0 = -668639138; // 0xffffffffd825605e float:-7.2733325E14 double:NaN;
        X.AnonymousClass0cQ.m5855E(r12, r13, r14, r0, r5);
        return;
    L_0x001c:
        r0 = r12.f452B;
        monitor-enter(r0);
        r14.getAction();	 Catch:{ all -> 0x00ad }
        r1 = r12.f452B;	 Catch:{ all -> 0x00ad }
        r1 = r1.f463I;	 Catch:{ all -> 0x00ad }
        r3 = r1.now();	 Catch:{ all -> 0x00ad }
        r1 = r12.f452B;	 Catch:{ all -> 0x00ad }
        r1 = r1.f467M;	 Catch:{ all -> 0x00ad }
        r3 = r3 - r1;
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r3 = r3 / r1;
        java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x00ad }
        r1 = r12.f452B;	 Catch:{ all -> 0x00ad }
        r1 = r1.f462H;	 Catch:{ all -> 0x00ad }
        r3 = 900000; // 0xdbba0 float:1.261169E-39 double:4.44659E-318;
        r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r1 < 0) goto L_0x0048;
    L_0x0040:
        monitor-exit(r0);	 Catch:{ all -> 0x00ad }
        r0 = -1282971778; // 0xffffffffb387677e float:-6.3052525E-8 double:NaN;
        X.AnonymousClass0cQ.m5855E(r12, r13, r14, r0, r5);
        return;
    L_0x0048:
        r6 = r12.f452B;	 Catch:{ all -> 0x00ad }
        r1 = r12.f452B;	 Catch:{ all -> 0x00ad }
        r1 = r1.f463I;	 Catch:{ all -> 0x00ad }
        r3 = r1.now();	 Catch:{ all -> 0x00ad }
        r1 = r12.f452B;	 Catch:{ all -> 0x00ad }
        r1 = r1.f462H;	 Catch:{ all -> 0x00ad }
        r3 = r3 + r1;
        r6.f467M = r3;	 Catch:{ all -> 0x00ad }
        r1 = r12.f452B;	 Catch:{ all -> 0x00ad }
        r1 = r1.f474T;	 Catch:{ all -> 0x00ad }
        if (r1 == 0) goto L_0x009e;
    L_0x005f:
        r1 = r12.f452B;	 Catch:{ all -> 0x00ad }
        r2 = r1.f460F;	 Catch:{ all -> 0x00ad }
        r1 = 23;
        if (r2 < r1) goto L_0x0082;
    L_0x0067:
        r1 = r12.f452B;	 Catch:{ all -> 0x00ad }
        r1 = r1.f472R;	 Catch:{ all -> 0x00ad }
        if (r1 == 0) goto L_0x0082;
    L_0x006d:
        r1 = r12.f452B;	 Catch:{ all -> 0x00ad }
        r6 = r1.f475U;	 Catch:{ all -> 0x00ad }
        r1 = r12.f452B;	 Catch:{ all -> 0x00ad }
        r7 = r1.f456B;	 Catch:{ all -> 0x00ad }
        r8 = 2;
        r1 = r12.f452B;	 Catch:{ all -> 0x00ad }
        r9 = r1.f467M;	 Catch:{ all -> 0x00ad }
        r1 = r12.f452B;	 Catch:{ all -> 0x00ad }
        r11 = r1.f465K;	 Catch:{ all -> 0x00ad }
        r6.m9872C(r7, r8, r9, r11);	 Catch:{ all -> 0x00ad }
        goto L_0x009e;
    L_0x0082:
        r1 = r12.f452B;	 Catch:{ all -> 0x00ad }
        r2 = r1.f460F;	 Catch:{ all -> 0x00ad }
        r1 = 19;
        if (r2 < r1) goto L_0x009e;
    L_0x008a:
        r1 = r12.f452B;	 Catch:{ all -> 0x00ad }
        r6 = r1.f475U;	 Catch:{ all -> 0x00ad }
        r1 = r12.f452B;	 Catch:{ all -> 0x00ad }
        r7 = r1.f456B;	 Catch:{ all -> 0x00ad }
        r8 = 2;
        r1 = r12.f452B;	 Catch:{ all -> 0x00ad }
        r9 = r1.f467M;	 Catch:{ all -> 0x00ad }
        r1 = r12.f452B;	 Catch:{ all -> 0x00ad }
        r11 = r1.f465K;	 Catch:{ all -> 0x00ad }
        r6.m9870A(r7, r8, r9, r11);	 Catch:{ all -> 0x00ad }
    L_0x009e:
        monitor-exit(r0);	 Catch:{ all -> 0x00ad }
        r0 = r12.f452B;
        r0 = r0.f473S;
        r0.run();
        r0 = 1068786995; // 0x3fb46533 float:1.4093384 double:5.28050937E-315;
        X.AnonymousClass0cQ.m5855E(r12, r13, r14, r0, r5);
        return;
    L_0x00ad:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00ad }
        r0 = 208040442; // 0xc6671fa float:1.7752854E-31 double:1.027856353E-315;
        X.AnonymousClass0cQ.m5855E(r12, r13, r14, r0, r5);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.072.onReceive(android.content.Context, android.content.Intent):void");
    }
}
