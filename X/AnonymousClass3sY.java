package X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.3sY */
public final class AnonymousClass3sY implements AnonymousClass2qL {
    /* renamed from: B */
    public final AnonymousClass2la f45822B;
    /* renamed from: C */
    public final float f45823C;
    /* renamed from: D */
    public final float f45824D;
    /* renamed from: E */
    public int f45825E;
    /* renamed from: F */
    private final AnonymousClass2t4 f45826F;
    /* renamed from: G */
    private int f45827G;
    /* renamed from: H */
    private final Handler f45828H;
    /* renamed from: I */
    private boolean f45829I;
    /* renamed from: J */
    private final long f45830J;
    /* renamed from: K */
    private final HashMap f45831K = new HashMap();
    /* renamed from: L */
    private final List f45832L = new ArrayList();
    /* renamed from: M */
    private final AnonymousClass3ue f45833M;
    /* renamed from: N */
    private final AnonymousClass2kY f45834N;
    /* renamed from: O */
    private final AnonymousClass1hY f45835O;
    /* renamed from: P */
    private long f45836P;
    /* renamed from: Q */
    private final long f45837Q;
    /* renamed from: R */
    private boolean f45838R;

    public AnonymousClass3sY(AnonymousClass2t4 anonymousClass2t4, Handler handler, AnonymousClass2la anonymousClass2la, float f, float f2, long j, AnonymousClass3ue anonymousClass3ue, AnonymousClass2kY anonymousClass2kY, long j2, AnonymousClass1hY anonymousClass1hY) {
        this.f45826F = anonymousClass2t4;
        this.f45828H = handler;
        this.f45822B = anonymousClass2la;
        this.f45824D = f;
        this.f45823C = f2;
        this.f45837Q = j * 1000;
        this.f45833M = anonymousClass3ue;
        this.f45834N = anonymousClass2kY;
        this.f45830J = j2;
        this.f45835O = anonymousClass1hY;
    }

    /* renamed from: B */
    private int m21101B(long j, long j2, long j3, boolean z) {
        if (j3 == -1) {
            return 0;
        }
        boolean C = AnonymousClass3sY.m21102C(this);
        long A = this.f45835O.A(C, j2, z);
        long D = this.f45835O.D(C, j2, z);
        if (j > A) {
            return 0;
        }
        return j < D ? 2 : 1;
    }

    public final void BJA(Object obj, int i) {
        this.f45832L.add(obj);
        this.f45831K.put(obj, new AnonymousClass2lb(i));
        this.f45825E += i;
    }

    /* renamed from: C */
    private static boolean m21102C(AnonymousClass3sY anonymousClass3sY) {
        AnonymousClass2kY anonymousClass2kY = anonymousClass3sY.f45834N;
        boolean z = false;
        if (anonymousClass2kY != null) {
            if (anonymousClass2kY.m17016B()) {
                if (anonymousClass3sY.f45830J == 0) {
                    return true;
                }
                long j;
                AnonymousClass3ue anonymousClass3ue = anonymousClass3sY.f45833M;
                if (anonymousClass3ue == null) {
                    j = -1;
                } else {
                    j = anonymousClass3ue.sI();
                }
                if (j != -1 && anonymousClass3sY.f45830J > 0 && anonymousClass3sY.f45833M.sI() > anonymousClass3sY.f45830J) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: D */
    private void m21103D(boolean z) {
        Handler handler = this.f45828H;
        if (handler != null && this.f45822B != null) {
            AnonymousClass0OR.D(handler, new AnonymousClass2lZ(this, z), 1613302324);
        }
    }

    /* renamed from: E */
    private void m21104E() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = 1;
            if (i2 >= this.f45832L.size()) {
                break;
            }
            AnonymousClass2lb anonymousClass2lb = (AnonymousClass2lb) this.f45831K.get(this.f45832L.get(i2));
            i3 |= anonymousClass2lb.f33684D;
            if (anonymousClass2lb.f33685E == -1) {
                i6 = 0;
            }
            i4 |= i6;
            i5 = Math.max(i5, anonymousClass2lb.f33683C);
            i2++;
        }
        boolean z = !this.f45832L.isEmpty() && (!(i3 == 0 && i4 == 0) && (i5 == 2 || (i5 == 1 && this.f45829I)));
        this.f45829I = z;
        if (z && !this.f45838R) {
            AnonymousClass2tP.f35438E.m17592A(0);
            this.f45838R = true;
            m21103D(true);
        } else if (!this.f45829I && this.f45838R && i3 == 0) {
            AnonymousClass2tP.f35438E.m17593B(0);
            this.f45838R = false;
            m21103D(false);
        }
        this.f45836P = -1;
        if (this.f45829I) {
            while (i < this.f45832L.size()) {
                long j = ((AnonymousClass2lb) this.f45831K.get(this.f45832L.get(i))).f33685E;
                if (j != -1) {
                    long j2 = this.f45837Q;
                    if (j2 != 0) {
                        j += j2;
                    }
                }
                if (j != -1) {
                    long j3 = this.f45836P;
                    if (j3 == -1 || j < j3) {
                        this.f45836P = j;
                    }
                }
                i++;
            }
        }
    }

    public final AnonymousClass2t4 PI() {
        return this.f45826F;
    }

    public final void iVA() {
        this.f45826F.hVA(this.f45825E);
    }

    public final void nVA(Object obj) {
        this.f45832L.remove(obj);
        this.f45825E -= ((AnonymousClass2lb) this.f45831K.remove(obj)).f33682B;
        m21104E();
    }

    public final boolean xVA(Object obj, long j, long j2, long j3, boolean z, boolean z2) {
        Object obj2;
        int KT;
        float f;
        int i;
        Object obj3;
        long j4 = j3;
        int B = m21101B(j, j2, j4, z2);
        AnonymousClass2lb anonymousClass2lb = (AnonymousClass2lb) this.f45831K.get(obj);
        boolean z3 = z;
        if (anonymousClass2lb.f33683C == B && anonymousClass2lb.f33685E == j3) {
            if (anonymousClass2lb.f33684D == z3) {
                obj2 = null;
                if (obj2 != null) {
                    anonymousClass2lb.f33683C = B;
                    anonymousClass2lb.f33685E = j4;
                    anonymousClass2lb.f33684D = z3;
                }
                KT = r9.f45826F.KT();
                f = ((float) KT) / ((float) r9.f45825E);
                i = f <= r9.f45823C ? 0 : f >= r9.f45824D ? 2 : 1;
                obj3 = r9.f45827G == i ? 1 : null;
                if (obj3 != null) {
                    r9.f45827G = i;
                }
                if (!(obj2 == null && obj3 == null)) {
                    m21104E();
                }
                if (KT < r9.f45825E || j3 == -1 || j3 > r9.f45836P) {
                    return false;
                }
                return true;
            }
        }
        obj2 = 1;
        if (obj2 != null) {
            anonymousClass2lb.f33683C = B;
            anonymousClass2lb.f33685E = j4;
            anonymousClass2lb.f33684D = z3;
        }
        KT = r9.f45826F.KT();
        f = ((float) KT) / ((float) r9.f45825E);
        if (f <= r9.f45823C) {
            if (f >= r9.f45824D) {
            }
        }
        if (r9.f45827G == i) {
        }
        if (obj3 != null) {
            r9.f45827G = i;
        }
        m21104E();
        return KT < r9.f45825E ? false : false;
    }
}
