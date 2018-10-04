package X;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.43C */
public final class AnonymousClass43C implements AnonymousClass3sO {
    /* renamed from: E */
    public static final AnonymousClass43C f48987E = new AnonymousClass43C(new AnonymousClass3ut());
    /* renamed from: B */
    private final AtomicInteger f48988B = new AtomicInteger(100);
    /* renamed from: C */
    private final AtomicLong f48989C = new AtomicLong(-1);
    /* renamed from: D */
    private final AnonymousClass2te f48990D;

    public final void KEA(IOException iOException) {
    }

    public final void LEA() {
    }

    public final void MEA(IOException iOException) {
    }

    public final void OEA(AnonymousClass2tB anonymousClass2tB, AnonymousClass1e6 anonymousClass1e6) {
    }

    public final void PEA() {
    }

    public final void oe(int i) {
    }

    public AnonymousClass43C(AnonymousClass2te anonymousClass2te) {
        this.f48990D = anonymousClass2te;
    }

    /* renamed from: A */
    public final long m22325A(long j, long j2) {
        if (this.f48988B.get() < 100) {
            if (this.f48989C.get() >= 0) {
                if (this.f48989C.get() + 120000 >= this.f48990D.now()) {
                    return (((long) this.f48988B.get()) * Math.min(j, j2)) / 100;
                }
                this.f48989C.set(-1);
                return j;
            }
        }
        return j;
    }

    public final void NEA(java.lang.String r4, java.lang.Object r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = "x-fb-cec-video-limit";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0041;
    L_0x0008:
        r0 = r5 instanceof java.lang.String;
        if (r0 != 0) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r5 = (java.lang.String) r5;
        r0 = "s:";
        r0 = r5.startsWith(r0);
        if (r0 != 0) goto L_0x0018;
    L_0x0017:
        goto L_0x000c;
    L_0x0018:
        r0 = 2;
        r0 = r5.substring(r0);
        r0 = java.lang.Float.valueOf(r0);	 Catch:{ NumberFormatException -> 0x0041 }
        r1 = r0.floatValue();	 Catch:{ NumberFormatException -> 0x0041 }
        r0 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;	 Catch:{ NumberFormatException -> 0x0041 }
        r1 = r1 * r0;	 Catch:{ NumberFormatException -> 0x0041 }
        r1 = (int) r1;	 Catch:{ NumberFormatException -> 0x0041 }
        r0 = r3.f48988B;	 Catch:{ NumberFormatException -> 0x0041 }
        r0 = r0.get();	 Catch:{ NumberFormatException -> 0x0041 }
        if (r1 > r0) goto L_0x0041;	 Catch:{ NumberFormatException -> 0x0041 }
    L_0x0031:
        r0 = r3.f48988B;	 Catch:{ NumberFormatException -> 0x0041 }
        r0.set(r1);	 Catch:{ NumberFormatException -> 0x0041 }
        r2 = r3.f48989C;	 Catch:{ NumberFormatException -> 0x0041 }
        r0 = r3.f48990D;	 Catch:{ NumberFormatException -> 0x0041 }
        r0 = r0.now();	 Catch:{ NumberFormatException -> 0x0041 }
        r2.set(r0);	 Catch:{ NumberFormatException -> 0x0041 }
    L_0x0041:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.43C.NEA(java.lang.String, java.lang.Object):void");
    }
}
