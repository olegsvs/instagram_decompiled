package X;

import android.media.AudioTrack;

/* renamed from: X.2uy */
public final class AnonymousClass2uy {
    /* renamed from: B */
    public final AnonymousClass2ux f35700B;
    /* renamed from: C */
    public int f35701C;
    /* renamed from: D */
    private long f35702D;
    /* renamed from: E */
    private long f35703E;
    /* renamed from: F */
    private long f35704F;
    /* renamed from: G */
    private long f35705G;

    public AnonymousClass2uy(AudioTrack audioTrack) {
        if (AnonymousClass2yi.f36552F >= 19) {
            this.f35700B = new AnonymousClass2ux(audioTrack);
            m17744C();
            return;
        }
        this.f35700B = null;
        AnonymousClass2uy.m17741B(this, 3);
    }

    /* renamed from: A */
    public final long m17742A() {
        AnonymousClass2ux anonymousClass2ux = this.f35700B;
        if (anonymousClass2ux != null) {
            return anonymousClass2ux.f35695B.nanoTime / 1000;
        }
        return -9223372036854775807L;
    }

    /* renamed from: B */
    public static void m17741B(AnonymousClass2uy anonymousClass2uy, int i) {
        anonymousClass2uy.f35701C = i;
        switch (i) {
            case 0:
                anonymousClass2uy.f35704F = 0;
                anonymousClass2uy.f35702D = -1;
                anonymousClass2uy.f35703E = System.nanoTime() / 1000;
                anonymousClass2uy.f35705G = 5000;
                return;
            case 1:
                anonymousClass2uy.f35705G = 5000;
                return;
            case 2:
            case 3:
                anonymousClass2uy.f35705G = 10000000;
                return;
            case 4:
                anonymousClass2uy.f35705G = 500000;
                return;
            default:
                throw new IllegalStateException();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public final boolean m17743B(long r10) {
        /*
        r9 = this;
        r7 = r9.f35700B;
        r4 = 0;
        if (r7 == 0) goto L_0x0089;
    L_0x0005:
        r0 = r9.f35704F;
        r2 = r10 - r0;
        r0 = r9.f35705G;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x0010;
    L_0x000f:
        goto L_0x0089;
    L_0x0010:
        r9.f35704F = r10;
        r1 = r7.f35696C;
        r0 = r7.f35695B;
        r8 = r1.getTimestamp(r0);
        if (r8 == 0) goto L_0x0037;
    L_0x001c:
        r0 = r7.f35695B;
        r3 = r0.framePosition;
        r0 = r7.f35698E;
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x002d;
    L_0x0026:
        r5 = r7.f35699F;
        r0 = 1;
        r5 = r5 + r0;
        r7.f35699F = r5;
    L_0x002d:
        r7.f35698E = r3;
        r1 = r7.f35699F;
        r0 = 32;
        r1 = r1 << r0;
        r3 = r3 + r1;
        r7.f35697D = r3;
    L_0x0037:
        r0 = r9.f35701C;
        switch(r0) {
            case 0: goto L_0x005c;
            case 1: goto L_0x004b;
            case 2: goto L_0x0048;
            case 3: goto L_0x0042;
            case 4: goto L_0x0088;
            default: goto L_0x003c;
        };
    L_0x003c:
        r0 = new java.lang.IllegalStateException;
        r0.<init>();
        throw r0;
    L_0x0042:
        if (r8 == 0) goto L_0x0088;
    L_0x0044:
        r9.m17744C();
        goto L_0x0088;
    L_0x0048:
        if (r8 != 0) goto L_0x0088;
    L_0x004a:
        goto L_0x0044;
    L_0x004b:
        if (r8 == 0) goto L_0x0044;
    L_0x004d:
        r0 = r9.f35700B;
        r2 = r0.f35697D;
        r0 = r9.f35702D;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x0088;
    L_0x0057:
        r0 = 2;
        X.AnonymousClass2uy.m17741B(r9, r0);
        goto L_0x0088;
    L_0x005c:
        if (r8 == 0) goto L_0x007a;
    L_0x005e:
        r0 = r9.f35700B;
        r0 = r0.f35695B;
        r2 = r0.nanoTime;
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 / r0;
        r0 = r9.f35703E;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x0078;
    L_0x006d:
        r0 = r9.f35700B;
        r0 = r0.f35697D;
        r9.f35702D = r0;
        r0 = 1;
        X.AnonymousClass2uy.m17741B(r9, r0);
        goto L_0x0088;
    L_0x0078:
        r8 = 0;
        goto L_0x0088;
    L_0x007a:
        r0 = r9.f35703E;
        r10 = r10 - r0;
        r0 = 500000; // 0x7a120 float:7.00649E-40 double:2.47033E-318;
        r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x0088;
    L_0x0084:
        r0 = 3;
        X.AnonymousClass2uy.m17741B(r9, r0);
    L_0x0088:
        return r8;
    L_0x0089:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2uy.B(long):boolean");
    }

    /* renamed from: C */
    public final void m17744C() {
        if (this.f35700B != null) {
            AnonymousClass2uy.m17741B(this, 0);
        }
    }
}
