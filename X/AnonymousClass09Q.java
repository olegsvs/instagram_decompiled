package X;

import com.facebook.forker.Process;
import java.util.ArrayList;
import java.util.BitSet;

/* renamed from: X.09Q */
public final class AnonymousClass09Q {
    /* renamed from: F */
    private static AnonymousClass09Q f1071F;
    /* renamed from: B */
    public final BitSet f1072B;
    /* renamed from: C */
    public final String[] f1073C;
    /* renamed from: D */
    private final ArrayList f1074D;
    /* renamed from: E */
    private final Integer[] f1075E;

    private AnonymousClass09Q() {
        this(2);
    }

    public AnonymousClass09Q(int i) {
        this.f1075E = new Integer[i];
        this.f1072B = new BitSet(i);
        this.f1073C = new String[i];
        this.f1074D = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            this.f1075E[i2] = Integer.valueOf(0);
        }
    }

    /* renamed from: A */
    public final synchronized Integer m603A(int i) {
        int i2 = 1;
        switch (i) {
            case Process.SD_BLACK_HOLE /*-3*/:
                return Integer.valueOf(1);
            case -2:
            case -1:
                return Integer.valueOf(2);
            default:
                if (AnonymousClass09N.m601E(i)) {
                    i2 = this.f1075E[i].intValue();
                }
                return Integer.valueOf(i2);
        }
    }

    /* renamed from: B */
    public static synchronized AnonymousClass09Q m602B() {
        AnonymousClass09Q anonymousClass09Q;
        synchronized (AnonymousClass09Q.class) {
            if (f1071F == null) {
                f1071F = new AnonymousClass09Q();
            }
            anonymousClass09Q = f1071F;
        }
        return anonymousClass09Q;
    }

    /* renamed from: B */
    public final synchronized String m604B(int i) {
        String str;
        str = null;
        switch (i) {
            case Process.SD_BLACK_HOLE /*-3*/:
            case -2:
            case -1:
                break;
            default:
                if (AnonymousClass09N.m601E(i)) {
                    str = this.f1073C[i];
                    break;
                }
                break;
        }
        return str;
    }

    /* renamed from: C */
    public final String m605C(String str) {
        return m604B(AnonymousClass09N.m598B(str));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: D */
    public final synchronized boolean m606D(int r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r1 = 0;
        switch(r3) {
            case -3: goto L_0x000f;
            case -2: goto L_0x000f;
            case -1: goto L_0x000c;
            default: goto L_0x0005;
        };
    L_0x0005:
        r0 = X.AnonymousClass09N.m601E(r3);	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x000f;
    L_0x000b:
        goto L_0x0011;
    L_0x000c:
        r0 = 1;
        monitor-exit(r2);
        return r0;
    L_0x000f:
        monitor-exit(r2);
        return r1;
    L_0x0011:
        r0 = r2.f1072B;	 Catch:{ all -> 0x0018 }
        r1 = r0.get(r3);	 Catch:{ all -> 0x0018 }
        goto L_0x000f;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.09Q.D(int):boolean");
    }

    /* renamed from: E */
    public final boolean m607E(String str) {
        return m606D(AnonymousClass09N.m598B(str));
    }

    /* renamed from: F */
    public final boolean m608F(String str) {
        str = m603A(AnonymousClass09N.m598B(str));
        return AnonymousClass1GY.m10501D(str.intValue(), 3) || AnonymousClass1GY.m10501D(str.intValue(), 0);
    }

    /* renamed from: G */
    public final synchronized void m609G(int i, Integer num) {
        if (AnonymousClass09N.m601E(i)) {
            Integer num2 = this.f1075E[i];
            if (!AnonymousClass1GY.m10501D(num2.intValue(), num.intValue())) {
                this.f1075E[i] = num;
                int size = this.f1074D.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AnonymousClass09P anonymousClass09P = (AnonymousClass09P) this.f1074D.get(i2);
                    AnonymousClass0GG.m1763B(anonymousClass09P.f1070C, new AnonymousClass09O(anonymousClass09P, AnonymousClass09K.m588C(i), num), -460719539);
                }
                if (AnonymousClass0Dc.m1247J(3)) {
                    AnonymousClass09K.m588C(i);
                    AnonymousClass0Bd.m800C(num2);
                    AnonymousClass0Bd.m800C(num);
                }
            }
        }
    }

    /* renamed from: H */
    public final void m610H(String str, Integer num) {
        m609G(AnonymousClass09N.m598B(str), num);
    }
}
