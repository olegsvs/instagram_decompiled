package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager$SavedState;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.forker.Process;
import java.util.List;

/* renamed from: X.0rr */
public class AnonymousClass0rr extends AnonymousClass0la implements AnonymousClass1oM, AnonymousClass1oa {
    /* renamed from: B */
    public final AnonymousClass13D f11276B;
    /* renamed from: C */
    public int f11277C;
    /* renamed from: D */
    public AnonymousClass16O f11278D;
    /* renamed from: E */
    public LinearLayoutManager$SavedState f11279E;
    /* renamed from: F */
    public int f11280F;
    /* renamed from: G */
    public int f11281G;
    /* renamed from: H */
    public boolean f11282H;
    /* renamed from: I */
    private int f11283I;
    /* renamed from: J */
    private boolean f11284J;
    /* renamed from: K */
    private final AnonymousClass13E f11285K;
    /* renamed from: L */
    private AnonymousClass16N f11286L;
    /* renamed from: M */
    private boolean f11287M;
    /* renamed from: N */
    private boolean f11288N;
    /* renamed from: O */
    private boolean f11289O;
    /* renamed from: P */
    private boolean f11290P;

    public void jA(AnonymousClass12K anonymousClass12K, AnonymousClass0or anonymousClass0or, AnonymousClass13D anonymousClass13D, int i) {
    }

    public AnonymousClass0rr(Context context) {
        this(context, 1, false);
    }

    public AnonymousClass0rr(Context context, int i, boolean z) {
        this.f11288N = false;
        this.f11282H = false;
        this.f11290P = false;
        this.f11289O = true;
        this.f11280F = -1;
        this.f11281G = Process.WAIT_RESULT_TIMEOUT;
        this.f11279E = null;
        this.f11276B = new AnonymousClass13D(this);
        this.f11285K = new AnonymousClass13E();
        this.f11283I = 2;
        nA(i);
        oA(z);
        this.f9543B = true;
    }

    /* renamed from: A */
    public final void mo1872A(String str) {
        if (this.f11279E == null) {
            super.mo1872A(str);
        }
    }

    public final void AA(Parcelable parcelable) {
        if (parcelable instanceof LinearLayoutManager$SavedState) {
            this.f11279E = (LinearLayoutManager$SavedState) parcelable;
            HA();
        }
    }

    public final Parcelable BA() {
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.f11279E;
        if (linearLayoutManager$SavedState != null) {
            return new LinearLayoutManager$SavedState(linearLayoutManager$SavedState);
        }
        Parcelable linearLayoutManager$SavedState2 = new LinearLayoutManager$SavedState();
        if (m7332T() > 0) {
            XA();
            boolean z = this.f11284J ^ this.f11282H;
            linearLayoutManager$SavedState2.f15614B = z;
            if (z) {
                View X = AnonymousClass0rr.m8005X(this);
                linearLayoutManager$SavedState2.f15615C = this.f11278D.mo2150F() - this.f11278D.mo2145A(X);
                linearLayoutManager$SavedState2.f15616D = AnonymousClass0la.m7307H(X);
            } else {
                View Y = AnonymousClass0rr.m8006Y(this);
                linearLayoutManager$SavedState2.f15616D = AnonymousClass0la.m7307H(Y);
                linearLayoutManager$SavedState2.f15615C = this.f11278D.mo2148D(Y) - this.f11278D.mo2154J();
            }
        } else {
            linearLayoutManager$SavedState2.f15616D = -1;
        }
        return linearLayoutManager$SavedState2;
    }

    /* renamed from: C */
    public final boolean mo1875C() {
        return this.f11277C == 0;
    }

    /* renamed from: D */
    public final boolean mo1876D() {
        return this.f11277C == 1;
    }

    /* renamed from: F */
    public final void mo1877F(int i, int i2, AnonymousClass0or anonymousClass0or, AnonymousClass1oL anonymousClass1oL) {
        if (this.f11277C != 0) {
            i = i2;
        }
        if (m7332T() != 0) {
            if (i != 0) {
                XA();
                m8016i(i > 0 ? 1 : -1, Math.abs(i), true, anonymousClass0or);
                VA(anonymousClass0or, this.f11286L, anonymousClass1oL);
            }
        }
    }

    /* renamed from: G */
    public final void mo1878G(int i, AnonymousClass1oL anonymousClass1oL) {
        boolean z;
        int i2;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.f11279E;
        int i3 = -1;
        if (linearLayoutManager$SavedState == null || !linearLayoutManager$SavedState.m9960A()) {
            m8012e();
            z = this.f11282H;
            i2 = this.f11280F;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = this.f11279E.f15614B;
            i2 = this.f11279E.f15616D;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f11283I && i2 >= 0 && i2 < i; i4++) {
            anonymousClass1oL.vB(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: H */
    public final int mo1879H(AnonymousClass0or anonymousClass0or) {
        return m7998Q(anonymousClass0or);
    }

    /* renamed from: I */
    public final int mo1880I(AnonymousClass0or anonymousClass0or) {
        return m7999R(anonymousClass0or);
    }

    public int IA(int i, AnonymousClass12K anonymousClass12K, AnonymousClass0or anonymousClass0or) {
        if (this.f11277C == 1) {
            return 0;
        }
        return lA(i, anonymousClass12K, anonymousClass0or);
    }

    /* renamed from: J */
    public final int mo1882J(AnonymousClass0or anonymousClass0or) {
        return m8000S(anonymousClass0or);
    }

    public final void JA(int i) {
        this.f11280F = i;
        this.f11281G = Process.WAIT_RESULT_TIMEOUT;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.f11279E;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.f15616D = -1;
        }
        HA();
    }

    /* renamed from: K */
    public final int mo1884K(AnonymousClass0or anonymousClass0or) {
        return m7998Q(anonymousClass0or);
    }

    public int KA(int i, AnonymousClass12K anonymousClass12K, AnonymousClass0or anonymousClass0or) {
        if (this.f11277C == 0) {
            return 0;
        }
        return lA(i, anonymousClass12K, anonymousClass0or);
    }

    /* renamed from: L */
    public int mo1886L(AnonymousClass0or anonymousClass0or) {
        return m7999R(anonymousClass0or);
    }

    /* renamed from: M */
    public final int mo1887M(AnonymousClass0or anonymousClass0or) {
        return m8000S(anonymousClass0or);
    }

    /* renamed from: M */
    public static View m7994M(AnonymousClass0rr anonymousClass0rr, AnonymousClass12K anonymousClass12K, AnonymousClass0or anonymousClass0or) {
        return anonymousClass0rr.fA(anonymousClass12K, anonymousClass0or, 0, anonymousClass0rr.m7332T(), anonymousClass0or.m7741B());
    }

    /* renamed from: N */
    public static View m7995N(AnonymousClass0rr anonymousClass0rr, AnonymousClass12K anonymousClass12K, AnonymousClass0or anonymousClass0or) {
        return anonymousClass0rr.fA(anonymousClass12K, anonymousClass0or, anonymousClass0rr.m7332T() - 1, -1, anonymousClass0or.m7741B());
    }

    /* renamed from: O */
    public final View mo1888O(int i) {
        int T = m7332T();
        if (T == 0) {
            return null;
        }
        int H = i - AnonymousClass0la.m7307H(m7331S(0));
        if (H >= 0 && H < T) {
            View S = m7331S(H);
            if (AnonymousClass0la.m7307H(S) == i) {
                return S;
            }
        }
        return super.mo1888O(i);
    }

    /* renamed from: O */
    public static void m7996O(AnonymousClass0rr anonymousClass0rr, int i, int i2) {
        anonymousClass0rr.f11286L.f14522B = anonymousClass0rr.f11278D.mo2150F() - i2;
        anonymousClass0rr.f11286L.f14526F = anonymousClass0rr.f11282H ? -1 : 1;
        AnonymousClass16N anonymousClass16N = anonymousClass0rr.f11286L;
        anonymousClass16N.f14523C = i;
        anonymousClass16N.f14528H = 1;
        anonymousClass16N.f14529I = i2;
        anonymousClass16N.f14532L = Process.WAIT_RESULT_TIMEOUT;
    }

    /* renamed from: P */
    public AnonymousClass12d mo1889P() {
        return new AnonymousClass12d(-2, -2);
    }

    /* renamed from: P */
    public static void m7997P(AnonymousClass0rr anonymousClass0rr, int i, int i2) {
        anonymousClass0rr.f11286L.f14522B = i2 - anonymousClass0rr.f11278D.mo2154J();
        AnonymousClass16N anonymousClass16N = anonymousClass0rr.f11286L;
        anonymousClass16N.f14523C = i;
        anonymousClass16N.f14526F = anonymousClass0rr.f11282H ? 1 : -1;
        anonymousClass16N = anonymousClass0rr.f11286L;
        anonymousClass16N.f14528H = -1;
        anonymousClass16N.f14529I = i2;
        anonymousClass16N.f14532L = Process.WAIT_RESULT_TIMEOUT;
    }

    /* renamed from: Q */
    private int m7998Q(AnonymousClass0or anonymousClass0or) {
        AnonymousClass0la anonymousClass0la = this;
        if (m7332T() == 0) {
            return 0;
        }
        XA();
        return AnonymousClass1Ii.m10665B(anonymousClass0or, this.f11278D, m8002U(this.f11289O ^ true, true), m8001T(this.f11289O ^ true, true), anonymousClass0la, this.f11289O);
    }

    /* renamed from: R */
    private int m7999R(AnonymousClass0or anonymousClass0or) {
        AnonymousClass0la anonymousClass0la = this;
        if (m7332T() == 0) {
            return 0;
        }
        XA();
        return AnonymousClass1Ii.m10666C(anonymousClass0or, this.f11278D, m8002U(this.f11289O ^ true, true), m8001T(this.f11289O ^ true, true), anonymousClass0la, this.f11289O, this.f11282H);
    }

    public final boolean RA() {
        return (this.f9546E == 1073741824 || this.f9557P == 1073741824 || !m7349k()) ? false : true;
    }

    /* renamed from: S */
    private int m8000S(AnonymousClass0or anonymousClass0or) {
        AnonymousClass0la anonymousClass0la = this;
        if (m7332T() == 0) {
            return 0;
        }
        XA();
        return AnonymousClass1Ii.m10667D(anonymousClass0or, this.f11278D, m8002U(this.f11289O ^ true, true), m8001T(this.f11289O ^ true, true), anonymousClass0la, this.f11289O);
    }

    public void SA(RecyclerView recyclerView, AnonymousClass0or anonymousClass0or, int i) {
        AnonymousClass12r anonymousClass1Aa = new AnonymousClass1Aa(recyclerView.getContext());
        anonymousClass1Aa.f13629F = i;
        TA(anonymousClass1Aa);
    }

    /* renamed from: T */
    private View m8001T(boolean z, boolean z2) {
        if (this.f11282H) {
            return eA(0, m7332T(), z, z2);
        }
        return eA(m7332T() - 1, -1, z, z2);
    }

    /* renamed from: U */
    private View m8002U(boolean z, boolean z2) {
        if (this.f11282H) {
            return eA(m7332T() - 1, -1, z, z2);
        }
        return eA(0, m7332T(), z, z2);
    }

    public boolean UA() {
        return this.f11279E == null && this.f11284J == this.f11290P;
    }

    /* renamed from: V */
    private int m8003V(int i, AnonymousClass12K anonymousClass12K, AnonymousClass0or anonymousClass0or, boolean z) {
        int F = this.f11278D.mo2150F() - i;
        if (F <= 0) {
            return 0;
        }
        int i2 = -lA(-F, anonymousClass12K, anonymousClass0or);
        i += i2;
        if (z) {
            int F2 = this.f11278D.mo2150F() - i;
            if (F2 > 0) {
                this.f11278D.mo2158O(F2);
                return F2 + i2;
            }
        }
        return i2;
    }

    public void VA(AnonymousClass0or anonymousClass0or, AnonymousClass16N anonymousClass16N, AnonymousClass1oL anonymousClass1oL) {
        int i = anonymousClass16N.f14523C;
        if (i >= 0 && i < anonymousClass0or.m7741B()) {
            anonymousClass1oL.vB(i, Math.max(0, anonymousClass16N.f14532L));
        }
    }

    /* renamed from: W */
    private int m8004W(int i, AnonymousClass12K anonymousClass12K, AnonymousClass0or anonymousClass0or, boolean z) {
        int J = i - this.f11278D.mo2154J();
        if (J <= 0) {
            return 0;
        }
        int i2 = -lA(J, anonymousClass12K, anonymousClass0or);
        i += i2;
        if (z) {
            i -= this.f11278D.mo2154J();
            if (i > 0) {
                this.f11278D.mo2158O(-i);
                return i2 - i;
            }
        }
        return i2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int WA(int r5) {
        /*
        r4 = this;
        r0 = 17;
        r3 = -1;
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r5 == r0) goto L_0x0043;
    L_0x0007:
        r0 = 33;
        r1 = 1;
        if (r5 == r0) goto L_0x003b;
    L_0x000c:
        r0 = 66;
        if (r5 == r0) goto L_0x0036;
    L_0x0010:
        r0 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        if (r5 == r0) goto L_0x0030;
    L_0x0014:
        switch(r5) {
            case 1: goto L_0x0024;
            case 2: goto L_0x0018;
            default: goto L_0x0017;
        };
    L_0x0017:
        return r2;
    L_0x0018:
        r0 = r4.f11277C;
        if (r0 != r1) goto L_0x001d;
    L_0x001c:
        return r1;
    L_0x001d:
        r0 = r4.hA();
        if (r0 == 0) goto L_0x001c;
    L_0x0023:
        return r3;
    L_0x0024:
        r0 = r4.f11277C;
        if (r0 != r1) goto L_0x0029;
    L_0x0028:
        goto L_0x0023;
    L_0x0029:
        r0 = r4.hA();
        if (r0 == 0) goto L_0x0023;
    L_0x002f:
        goto L_0x001c;
    L_0x0030:
        r0 = r4.f11277C;
        if (r0 != r1) goto L_0x0017;
    L_0x0034:
        r2 = 1;
        goto L_0x0017;
    L_0x0036:
        r0 = r4.f11277C;
        if (r0 != 0) goto L_0x0017;
    L_0x003a:
        goto L_0x0034;
    L_0x003b:
        r0 = r4.f11277C;
        if (r0 != r1) goto L_0x0040;
    L_0x003f:
        goto L_0x0023;
    L_0x0040:
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        goto L_0x0023;
    L_0x0043:
        r0 = r4.f11277C;
        if (r0 != 0) goto L_0x0040;
    L_0x0047:
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0rr.WA(int):int");
    }

    /* renamed from: X */
    private static View m8005X(AnonymousClass0rr anonymousClass0rr) {
        return anonymousClass0rr.m7331S(anonymousClass0rr.f11282H ? 0 : anonymousClass0rr.m7332T() - 1);
    }

    public final void XA() {
        if (this.f11286L == null) {
            this.f11286L = new AnonymousClass16N();
        }
        if (this.f11278D == null) {
            this.f11278D = AnonymousClass16O.m9395B(this, this.f11277C);
        }
    }

    /* renamed from: Y */
    private static View m8006Y(AnonymousClass0rr anonymousClass0rr) {
        return anonymousClass0rr.m7331S(anonymousClass0rr.f11282H ? anonymousClass0rr.m7332T() - 1 : 0);
    }

    public final int YA(AnonymousClass12K anonymousClass12K, AnonymousClass16N anonymousClass16N, AnonymousClass0or anonymousClass0or, boolean z) {
        int i = anonymousClass16N.f14522B;
        if (anonymousClass16N.f14532L != Process.WAIT_RESULT_TIMEOUT) {
            if (anonymousClass16N.f14522B < 0) {
                anonymousClass16N.f14532L += anonymousClass16N.f14522B;
            }
            m8008a(anonymousClass12K, anonymousClass16N);
        }
        int i2 = anonymousClass16N.f14522B + anonymousClass16N.f14524D;
        AnonymousClass13E anonymousClass13E = this.f11285K;
        while (true) {
            if ((!anonymousClass16N.f14525E && i2 <= 0) || !anonymousClass16N.m9393B(anonymousClass0or)) {
                break;
            }
            anonymousClass13E.f13656B = 0;
            anonymousClass13E.f13657C = false;
            anonymousClass13E.f13659E = false;
            anonymousClass13E.f13658D = false;
            iA(anonymousClass12K, anonymousClass0or, anonymousClass16N, anonymousClass13E);
            if (!anonymousClass13E.f13657C) {
                anonymousClass16N.f14529I += anonymousClass13E.f13656B * anonymousClass16N.f14528H;
                if (!(anonymousClass13E.f13659E && this.f11286L.f14531K == null && anonymousClass0or.f10402F)) {
                    anonymousClass16N.f14522B -= anonymousClass13E.f13656B;
                    i2 -= anonymousClass13E.f13656B;
                }
                if (anonymousClass16N.f14532L != Process.WAIT_RESULT_TIMEOUT) {
                    anonymousClass16N.f14532L += anonymousClass13E.f13656B;
                    if (anonymousClass16N.f14522B < 0) {
                        anonymousClass16N.f14532L += anonymousClass16N.f14522B;
                    }
                    m8008a(anonymousClass12K, anonymousClass16N);
                }
                if (z && anonymousClass13E.f13658D) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - anonymousClass16N.f14522B;
    }

    /* renamed from: Z */
    private void m8007Z(AnonymousClass12K anonymousClass12K, AnonymousClass0or anonymousClass0or, int i, int i2) {
        if (!(!anonymousClass0or.f10406J || m7332T() == 0 || anonymousClass0or.f10402F)) {
            if (UA()) {
                AnonymousClass16N anonymousClass16N;
                List list = anonymousClass12K.f13513G;
                int size = list.size();
                int H = AnonymousClass0la.m7307H(m7331S(0));
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    AnonymousClass0oo anonymousClass0oo = (AnonymousClass0oo) list.get(i5);
                    if (!anonymousClass0oo.m7720L()) {
                        int i6 = 1;
                        if ((anonymousClass0oo.m7714F() < H) != this.f11282H) {
                            i6 = -1;
                        }
                        if (i6 == -1) {
                            i3 += this.f11278D.mo2146B(anonymousClass0oo.f10370B);
                        } else {
                            i4 += this.f11278D.mo2146B(anonymousClass0oo.f10370B);
                        }
                    }
                }
                this.f11286L.f14531K = list;
                if (i3 > 0) {
                    AnonymousClass0rr.m7997P(this, AnonymousClass0la.m7307H(AnonymousClass0rr.m8006Y(this)), i);
                    anonymousClass16N = this.f11286L;
                    anonymousClass16N.f14524D = i3;
                    anonymousClass16N.f14522B = 0;
                    anonymousClass16N.m9392A(null);
                    YA(anonymousClass12K, this.f11286L, anonymousClass0or, false);
                }
                if (i4 > 0) {
                    AnonymousClass0rr.m7996O(this, AnonymousClass0la.m7307H(AnonymousClass0rr.m8005X(this)), i2);
                    anonymousClass16N = this.f11286L;
                    anonymousClass16N.f14524D = i4;
                    anonymousClass16N.f14522B = 0;
                    anonymousClass16N.m9392A(null);
                    YA(anonymousClass12K, this.f11286L, anonymousClass0or, false);
                }
                this.f11286L.f14531K = null;
            }
        }
    }

    public final int ZA() {
        View eA = eA(0, m7332T(), true, false);
        if (eA == null) {
            return -1;
        }
        return AnonymousClass0la.m7307H(eA);
    }

    /* renamed from: a */
    private void m8008a(AnonymousClass12K anonymousClass12K, AnonymousClass16N anonymousClass16N) {
        if (!anonymousClass16N.f14530J) {
            return;
        }
        if (!anonymousClass16N.f14525E) {
            if (anonymousClass16N.f14528H == -1) {
                m8010c(anonymousClass12K, anonymousClass16N.f14532L);
            } else {
                m8011d(anonymousClass12K, anonymousClass16N.f14532L);
            }
        }
    }

    public final int aA() {
        View eA = eA(0, m7332T(), false, true);
        if (eA == null) {
            return -1;
        }
        return AnonymousClass0la.m7307H(eA);
    }

    /* renamed from: b */
    private static void m8009b(AnonymousClass0rr anonymousClass0rr, AnonymousClass12K anonymousClass12K, int i, int i2) {
        if (i != i2) {
            View S;
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    S = anonymousClass0rr.m7331S(i3);
                    anonymousClass0rr.FA(i3);
                    anonymousClass12K.m8878L(S);
                }
                return;
            }
            while (i > i2) {
                S = anonymousClass0rr.m7331S(i);
                anonymousClass0rr.FA(i);
                anonymousClass12K.m8878L(S);
                i--;
            }
        }
    }

    public final int bA() {
        View eA = eA(m7332T() - 1, -1, true, false);
        if (eA == null) {
            return -1;
        }
        return AnonymousClass0la.m7307H(eA);
    }

    /* renamed from: c */
    private void m8010c(AnonymousClass12K anonymousClass12K, int i) {
        int T = m7332T();
        if (i >= 0) {
            int i2;
            int i3;
            int E = this.f11278D.mo2149E() - i;
            View S;
            if (this.f11282H) {
                i2 = 0;
                i3 = 0;
                while (i3 < T) {
                    S = m7331S(i3);
                    if (this.f11278D.mo2148D(S) >= E) {
                        if (this.f11278D.mo2157N(S) >= E) {
                            i3++;
                        }
                    }
                }
            } else {
                i2 = T - 1;
                i3 = i2;
                while (i3 >= 0) {
                    S = m7331S(i3);
                    if (this.f11278D.mo2148D(S) >= E) {
                        if (this.f11278D.mo2157N(S) >= E) {
                            i3--;
                        }
                    }
                }
            }
            AnonymousClass0rr.m8009b(this, anonymousClass12K, i2, i3);
        }
    }

    public final int cA() {
        View eA = eA(m7332T() - 1, -1, false, true);
        if (eA == null) {
            return -1;
        }
        return AnonymousClass0la.m7307H(eA);
    }

    /* renamed from: d */
    private void m8011d(AnonymousClass12K anonymousClass12K, int i) {
        if (i >= 0) {
            int i2;
            int i3;
            int T = m7332T();
            View S;
            if (this.f11282H) {
                i2 = T - 1;
                i3 = i2;
                while (i3 >= 0) {
                    S = m7331S(i3);
                    if (this.f11278D.mo2145A(S) <= i) {
                        if (this.f11278D.mo2156M(S) <= i) {
                            i3--;
                        }
                    }
                }
            } else {
                i2 = 0;
                i3 = 0;
                while (i3 < T) {
                    S = m7331S(i3);
                    if (this.f11278D.mo2145A(S) <= i) {
                        if (this.f11278D.mo2156M(S) <= i) {
                            i3++;
                        }
                    }
                }
            }
            AnonymousClass0rr.m8009b(this, anonymousClass12K, i2, i3);
        }
    }

    public final View dA(int i, int i2) {
        XA();
        Object obj = i2 > i ? 1 : i2 < i ? -1 : null;
        if (obj == null) {
            return m7331S(i);
        }
        int i3;
        int i4;
        View A;
        if (this.f11278D.mo2148D(m7331S(i)) < this.f11278D.mo2154J()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        if (this.f11277C == 0) {
            A = this.f9547F.m9081A(i, i2, i3, i4);
        } else {
            A = this.f9555N.m9081A(i, i2, i3, i4);
        }
        return A;
    }

    /* renamed from: e */
    private void m8012e() {
        if (this.f11277C != 1) {
            if (hA()) {
                this.f11282H = this.f11288N ^ true;
                return;
            }
        }
        this.f11282H = this.f11288N;
    }

    public final View eA(int i, int i2, boolean z, boolean z2) {
        XA();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        if (this.f11277C == 0) {
            return this.f9547F.m9081A(i, i2, i4, i3);
        }
        return this.f9555N.m9081A(i, i2, i4, i3);
    }

    /* renamed from: f */
    private static boolean m8013f(AnonymousClass0rr anonymousClass0rr, AnonymousClass12K anonymousClass12K, AnonymousClass0or anonymousClass0or, AnonymousClass13D anonymousClass13D) {
        boolean z = false;
        if (anonymousClass0rr.m7332T() != 0) {
            View Z = anonymousClass0rr.m7338Z();
            if (Z != null) {
                AnonymousClass12d anonymousClass12d = (AnonymousClass12d) Z.getLayoutParams();
                Object obj = (anonymousClass12d.m8961B() || anonymousClass12d.m8960A() < 0 || anonymousClass12d.m8960A() >= anonymousClass0or.m7741B()) ? null : 1;
                if (obj != null) {
                    anonymousClass13D.m9087C(Z);
                    return true;
                }
            }
            if (anonymousClass0rr.f11284J == anonymousClass0rr.f11290P) {
                if (anonymousClass13D.f13652C) {
                    if (anonymousClass0rr.f11282H) {
                        Z = AnonymousClass0rr.m7994M(anonymousClass0rr, anonymousClass12K, anonymousClass0or);
                    } else {
                        Z = AnonymousClass0rr.m7995N(anonymousClass0rr, anonymousClass12K, anonymousClass0or);
                    }
                } else if (anonymousClass0rr.f11282H) {
                    Z = AnonymousClass0rr.m7995N(anonymousClass0rr, anonymousClass12K, anonymousClass0or);
                } else {
                    Z = AnonymousClass0rr.m7994M(anonymousClass0rr, anonymousClass12K, anonymousClass0or);
                }
                if (Z != null) {
                    anonymousClass13D.m9086B(Z);
                    if (!anonymousClass0or.f10402F && anonymousClass0rr.UA()) {
                        if (anonymousClass0rr.f11278D.mo2148D(Z) >= anonymousClass0rr.f11278D.mo2150F() || anonymousClass0rr.f11278D.mo2145A(Z) < anonymousClass0rr.f11278D.mo2154J()) {
                            z = true;
                        }
                        if (z) {
                            int F;
                            if (anonymousClass13D.f13652C) {
                                F = anonymousClass0rr.f11278D.mo2150F();
                            } else {
                                F = anonymousClass0rr.f11278D.mo2154J();
                            }
                            anonymousClass13D.f13651B = F;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public View fA(AnonymousClass12K anonymousClass12K, AnonymousClass0or anonymousClass0or, int i, int i2, int i3) {
        XA();
        int J = this.f11278D.mo2154J();
        int F = this.f11278D.mo2150F();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View S = m7331S(i);
            int H = AnonymousClass0la.m7307H(S);
            if (H >= 0 && H < i3) {
                if (!((AnonymousClass12d) S.getLayoutParams()).m8961B()) {
                    if (this.f11278D.mo2148D(S) < F) {
                        if (this.f11278D.mo2145A(S) >= J) {
                            return S;
                        }
                    }
                    if (view == null) {
                        view = S;
                    }
                } else if (view2 == null) {
                    view2 = S;
                }
            }
            i += i4;
        }
        if (view == null) {
            view = view2;
        }
        return view;
    }

    /* renamed from: g */
    private static boolean m8014g(AnonymousClass0rr anonymousClass0rr, AnonymousClass0or anonymousClass0or, AnonymousClass13D anonymousClass13D) {
        boolean z = false;
        if (!anonymousClass0or.f10402F) {
            int i = anonymousClass0rr.f11280F;
            if (i != -1) {
                if (i >= 0) {
                    if (i < anonymousClass0or.m7741B()) {
                        anonymousClass13D.f13653D = anonymousClass0rr.f11280F;
                        LinearLayoutManager$SavedState linearLayoutManager$SavedState = anonymousClass0rr.f11279E;
                        boolean z2;
                        if (linearLayoutManager$SavedState != null && linearLayoutManager$SavedState.m9960A()) {
                            z2 = anonymousClass0rr.f11279E.f15614B;
                            anonymousClass13D.f13652C = z2;
                            if (z2) {
                                anonymousClass13D.f13651B = anonymousClass0rr.f11278D.mo2150F() - anonymousClass0rr.f11279E.f15615C;
                            } else {
                                anonymousClass13D.f13651B = anonymousClass0rr.f11278D.mo2154J() + anonymousClass0rr.f11279E.f15615C;
                            }
                        } else if (anonymousClass0rr.f11281G == Process.WAIT_RESULT_TIMEOUT) {
                            View O = anonymousClass0rr.mo1888O(anonymousClass0rr.f11280F);
                            if (O == null) {
                                if (anonymousClass0rr.m7332T() > 0) {
                                    if ((anonymousClass0rr.f11280F < AnonymousClass0la.m7307H(anonymousClass0rr.m7331S(0))) == anonymousClass0rr.f11282H) {
                                        z = true;
                                    }
                                    anonymousClass13D.f13652C = z;
                                }
                                anonymousClass13D.m9085A();
                            } else if (anonymousClass0rr.f11278D.mo2146B(O) > anonymousClass0rr.f11278D.mo2155K()) {
                                anonymousClass13D.m9085A();
                                return true;
                            } else if (anonymousClass0rr.f11278D.mo2148D(O) - anonymousClass0rr.f11278D.mo2154J() < 0) {
                                anonymousClass13D.f13651B = anonymousClass0rr.f11278D.mo2154J();
                                anonymousClass13D.f13652C = false;
                                return true;
                            } else if (anonymousClass0rr.f11278D.mo2150F() - anonymousClass0rr.f11278D.mo2145A(O) < 0) {
                                anonymousClass13D.f13651B = anonymousClass0rr.f11278D.mo2150F();
                                anonymousClass13D.f13652C = true;
                                return true;
                            } else {
                                int A;
                                if (anonymousClass13D.f13652C) {
                                    A = anonymousClass0rr.f11278D.mo2145A(O) + anonymousClass0rr.f11278D.m9407L();
                                } else {
                                    A = anonymousClass0rr.f11278D.mo2148D(O);
                                }
                                anonymousClass13D.f13651B = A;
                            }
                        } else {
                            z2 = anonymousClass0rr.f11282H;
                            anonymousClass13D.f13652C = z2;
                            if (z2) {
                                anonymousClass13D.f13651B = anonymousClass0rr.f11278D.mo2150F() - anonymousClass0rr.f11281G;
                            } else {
                                anonymousClass13D.f13651B = anonymousClass0rr.f11278D.mo2154J() + anonymousClass0rr.f11281G;
                            }
                        }
                        return true;
                    }
                }
                anonymousClass0rr.f11280F = -1;
                anonymousClass0rr.f11281G = Process.WAIT_RESULT_TIMEOUT;
                return false;
            }
        }
        return false;
    }

    public final int gA(AnonymousClass0or anonymousClass0or) {
        return (anonymousClass0or.f10409M != -1 ? 1 : null) != null ? this.f11278D.mo2155K() : 0;
    }

    /* renamed from: h */
    private void m8015h(AnonymousClass12K anonymousClass12K, AnonymousClass0or anonymousClass0or, AnonymousClass13D anonymousClass13D) {
        if (!AnonymousClass0rr.m8014g(this, anonymousClass0or, anonymousClass13D)) {
            if (!AnonymousClass0rr.m8013f(this, anonymousClass12K, anonymousClass0or, anonymousClass13D)) {
                anonymousClass13D.m9085A();
                anonymousClass13D.f13653D = this.f11290P ? anonymousClass0or.m7741B() - 1 : 0;
            }
        }
    }

    public final boolean hA() {
        return m7340b() == 1;
    }

    /* renamed from: i */
    private void m8016i(int i, int i2, boolean z, AnonymousClass0or anonymousClass0or) {
        AnonymousClass16N anonymousClass16N;
        int A;
        this.f11286L.f14525E = kA();
        this.f11286L.f14524D = gA(anonymousClass0or);
        AnonymousClass16N anonymousClass16N2 = this.f11286L;
        anonymousClass16N2.f14528H = i;
        int i3 = -1;
        View X;
        if (i == 1) {
            anonymousClass16N2.f14524D += this.f11278D.mo2151G();
            X = AnonymousClass0rr.m8005X(this);
            anonymousClass16N = this.f11286L;
            if (!this.f11282H) {
                i3 = 1;
            }
            anonymousClass16N.f14526F = i3;
            this.f11286L.f14523C = AnonymousClass0la.m7307H(X) + this.f11286L.f14526F;
            this.f11286L.f14529I = this.f11278D.mo2145A(X);
            A = this.f11278D.mo2145A(X) - this.f11278D.mo2150F();
        } else {
            X = AnonymousClass0rr.m8006Y(this);
            anonymousClass16N2 = this.f11286L;
            anonymousClass16N2.f14524D += this.f11278D.mo2154J();
            anonymousClass16N = this.f11286L;
            if (this.f11282H) {
                i3 = 1;
            }
            anonymousClass16N.f14526F = i3;
            this.f11286L.f14523C = AnonymousClass0la.m7307H(X) + this.f11286L.f14526F;
            this.f11286L.f14529I = this.f11278D.mo2148D(X);
            A = (-this.f11278D.mo2148D(X)) + this.f11278D.mo2154J();
        }
        anonymousClass16N = this.f11286L;
        anonymousClass16N.f14522B = i2;
        if (z) {
            anonymousClass16N.f14522B -= A;
        }
        this.f11286L.f14532L = A;
    }

    public void iA(AnonymousClass12K anonymousClass12K, AnonymousClass0or anonymousClass0or, AnonymousClass16N anonymousClass16N, AnonymousClass13E anonymousClass13E) {
        AnonymousClass16N anonymousClass16N2 = anonymousClass16N;
        View C = anonymousClass16N2.m9394C(anonymousClass12K);
        AnonymousClass13E anonymousClass13E2 = anonymousClass13E;
        if (C == null) {
            anonymousClass13E2.f13657C = true;
            return;
        }
        int C2;
        int i;
        AnonymousClass12d anonymousClass12d = (AnonymousClass12d) C.getLayoutParams();
        if (anonymousClass16N2.f14531K == null) {
            if (this.f11282H == (anonymousClass16N2.f14528H == -1)) {
                AnonymousClass0la.m7301B(this, C, -1, false);
            } else {
                AnonymousClass0la.m7301B(this, C, 0, false);
            }
        } else {
            if (this.f11282H == (anonymousClass16N2.f14528H == -1)) {
                AnonymousClass0la.m7301B(this, C, -1, true);
            } else {
                AnonymousClass0la.m7301B(this, C, 0, true);
            }
        }
        AnonymousClass12d anonymousClass12d2 = (AnonymousClass12d) C.getLayoutParams();
        Rect i2 = this.f9552K.m6986i(C);
        int i3 = 0 + (i2.top + i2.bottom);
        int D = AnonymousClass0la.m7303D(this.f9556O, this.f9557P, (((mo2563f() + mo2564g()) + anonymousClass12d2.leftMargin) + anonymousClass12d2.rightMargin) + (0 + (i2.left + i2.right)), anonymousClass12d2.width, mo1875C());
        int D2 = AnonymousClass0la.m7303D(this.f9545D, this.f9546E, (((m7346h() + m7343e()) + anonymousClass12d2.topMargin) + anonymousClass12d2.bottomMargin) + i3, anonymousClass12d2.height, mo1876D());
        if (QA(C, D, D2, anonymousClass12d2)) {
            C.measure(D, D2);
        }
        anonymousClass13E2.f13656B = this.f11278D.mo2146B(C);
        if (this.f11277C == 1) {
            if (hA()) {
                D2 = this.f9556O - mo2564g();
                C2 = D2 - this.f11278D.mo2147C(C);
            } else {
                C2 = mo2563f();
                D2 = this.f11278D.mo2147C(C) + C2;
            }
            if (anonymousClass16N2.f14528H == -1) {
                i = anonymousClass16N2.f14529I;
                D = anonymousClass16N2.f14529I - anonymousClass13E2.f13656B;
            } else {
                D = anonymousClass16N2.f14529I;
                i = anonymousClass16N2.f14529I + anonymousClass13E2.f13656B;
            }
        } else {
            D = m7346h();
            i = this.f11278D.mo2147C(C) + D;
            if (anonymousClass16N2.f14528H == -1) {
                D2 = anonymousClass16N2.f14529I;
                C2 = anonymousClass16N2.f14529I - anonymousClass13E2.f13656B;
            } else {
                C2 = anonymousClass16N2.f14529I;
                D2 = anonymousClass16N2.f14529I + anonymousClass13E2.f13656B;
            }
        }
        AnonymousClass0la.m7310K(C, C2, D, D2, i);
        if (anonymousClass12d.m8961B() || anonymousClass12d.f13589E.m7723O()) {
            anonymousClass13E2.f13659E = true;
        }
        anonymousClass13E2.f13658D = C.hasFocusable();
    }

    public final boolean kA() {
        return this.f11278D.mo2152H() == 0 && this.f11278D.mo2149E() == 0;
    }

    public final int lA(int i, AnonymousClass12K anonymousClass12K, AnonymousClass0or anonymousClass0or) {
        if (m7332T() != 0) {
            if (i != 0) {
                this.f11286L.f14530J = true;
                XA();
                int i2 = i > 0 ? 1 : -1;
                int abs = Math.abs(i);
                m8016i(i2, abs, true, anonymousClass0or);
                int YA = this.f11286L.f14532L + YA(anonymousClass12K, this.f11286L, anonymousClass0or, false);
                if (YA >= 0) {
                    if (abs > YA) {
                        i = i2 * YA;
                    }
                    this.f11278D.mo2158O(-i);
                    this.f11286L.f14527G = i;
                    return i;
                }
            }
        }
        return 0;
    }

    /* renamed from: m */
    public final void mo1893m(RecyclerView recyclerView, AnonymousClass12K anonymousClass12K) {
        super.mo1893m(recyclerView, anonymousClass12K);
        if (this.f11287M) {
            DA(anonymousClass12K);
            anonymousClass12K.m8868B();
        }
    }

    public final void mA(int i, int i2) {
        this.f11280F = i;
        this.f11281G = i2;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.f11279E;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.f15616D = -1;
        }
        HA();
    }

    /* renamed from: n */
    public View mo1894n(View view, int i, AnonymousClass12K anonymousClass12K, AnonymousClass0or anonymousClass0or) {
        m8012e();
        if (m7332T() != 0) {
            int WA = WA(i);
            if (WA != Process.WAIT_RESULT_TIMEOUT) {
                View dA;
                View Y;
                XA();
                XA();
                m8016i(WA, (int) (((float) this.f11278D.mo2155K()) * 0.33333334f), false, anonymousClass0or);
                AnonymousClass16N anonymousClass16N = this.f11286L;
                anonymousClass16N.f14532L = Process.WAIT_RESULT_TIMEOUT;
                anonymousClass16N.f14530J = false;
                YA(anonymousClass12K, anonymousClass16N, anonymousClass0or, true);
                if (WA == -1) {
                    if (this.f11282H) {
                        dA = dA(m7332T() - 1, -1);
                    } else {
                        dA = dA(0, m7332T());
                    }
                } else if (this.f11282H) {
                    dA = dA(0, m7332T());
                } else {
                    dA = dA(m7332T() - 1, -1);
                }
                if (WA == -1) {
                    Y = AnonymousClass0rr.m8006Y(this);
                } else {
                    Y = AnonymousClass0rr.m8005X(this);
                }
                if (!Y.hasFocusable()) {
                    return dA;
                }
                if (dA != null) {
                    return Y;
                }
            }
        }
        return null;
    }

    public void nA(int i) {
        if (i != 0) {
            if (i != 1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("invalid orientation:");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        mo1872A(null);
        if (i != this.f11277C) {
            this.f11277C = i;
            this.f11278D = null;
            HA();
        }
    }

    public final void oA(boolean z) {
        mo1872A(null);
        if (z != this.f11288N) {
            this.f11288N = z;
            HA();
        }
    }

    /* renamed from: p */
    public final void mo1895p(AccessibilityEvent accessibilityEvent) {
        super.mo1895p(accessibilityEvent);
        if (m7332T() > 0) {
            accessibilityEvent.setFromIndex(aA());
            accessibilityEvent.setToIndex(cA());
        }
    }

    public final void qHA(View view, View view2, int i, int i2) {
        mo1872A("Cannot drop a view during a scroll or layout calculation");
        XA();
        m8012e();
        int H = AnonymousClass0la.m7307H(view);
        int H2 = AnonymousClass0la.m7307H(view2);
        int i3 = H < H2 ? 1 : -1;
        if (this.f11282H) {
            if (i3 == 1) {
                mA(H2, this.f11278D.mo2150F() - (this.f11278D.mo2148D(view2) + this.f11278D.mo2146B(view)));
            } else {
                mA(H2, this.f11278D.mo2150F() - this.f11278D.mo2145A(view2));
            }
        } else if (i3 == -1) {
            mA(H2, this.f11278D.mo2148D(view2));
        } else {
            mA(H2, this.f11278D.mo2145A(view2) - this.f11278D.mo2146B(view));
        }
    }

    /* renamed from: x */
    public void mo1896x(AnonymousClass12K anonymousClass12K, AnonymousClass0or anonymousClass0or) {
        int i = -1;
        if (!(this.f11279E == null && this.f11280F == -1) && anonymousClass0or.m7741B() == 0) {
            DA(anonymousClass12K);
            return;
        }
        int gA;
        int i2;
        int i3;
        View O;
        int T;
        AnonymousClass13D anonymousClass13D;
        AnonymousClass16N anonymousClass16N;
        int i4;
        int V;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.f11279E;
        if (linearLayoutManager$SavedState != null && linearLayoutManager$SavedState.m9960A()) {
            this.f11280F = this.f11279E.f15616D;
        }
        XA();
        this.f11286L.f14530J = false;
        m8012e();
        View Z = m7338Z();
        if (this.f11276B.f13654E && this.f11280F == -1) {
            if (this.f11279E == null) {
                if (Z != null && (this.f11278D.mo2148D(Z) >= this.f11278D.mo2150F() || this.f11278D.mo2145A(Z) <= this.f11278D.mo2154J())) {
                    this.f11276B.m9087C(Z);
                }
                gA = gA(anonymousClass0or);
                if (this.f11286L.f14527G < 0) {
                    i2 = gA;
                    gA = 0;
                } else {
                    i2 = 0;
                }
                gA += this.f11278D.mo2154J();
                i2 += this.f11278D.mo2151G();
                if (anonymousClass0or.f10402F) {
                    i3 = this.f11280F;
                    if (!(i3 == -1 || this.f11281G == Process.WAIT_RESULT_TIMEOUT)) {
                        O = mo1888O(i3);
                        if (O != null) {
                            if (this.f11282H) {
                                i3 = this.f11281G - (this.f11278D.mo2148D(O) - this.f11278D.mo2154J());
                            } else {
                                i3 = (this.f11278D.mo2150F() - this.f11278D.mo2145A(O)) - this.f11281G;
                            }
                            if (i3 <= 0) {
                                gA += i3;
                            } else {
                                i2 -= i3;
                            }
                        }
                    }
                }
                if (this.f11276B.f13652C ? this.f11282H : !this.f11282H) {
                    i = 1;
                }
                jA(anonymousClass12K, anonymousClass0or, this.f11276B, i);
                for (T = m7332T() - 1; T >= 0; T--) {
                    AnonymousClass0la.m7311L(this, anonymousClass12K, T, m7331S(T));
                }
                this.f11286L.f14525E = kA();
                if (this.f11276B.f13652C) {
                    anonymousClass13D = this.f11276B;
                    AnonymousClass0rr.m7996O(this, anonymousClass13D.f13653D, anonymousClass13D.f13651B);
                    anonymousClass16N = this.f11286L;
                    anonymousClass16N.f14524D = i2;
                    YA(anonymousClass12K, anonymousClass16N, anonymousClass0or, false);
                    i3 = this.f11286L.f14529I;
                    i4 = this.f11286L.f14523C;
                    if (this.f11286L.f14522B > 0) {
                        gA += this.f11286L.f14522B;
                    }
                    anonymousClass13D = this.f11276B;
                    AnonymousClass0rr.m7997P(this, anonymousClass13D.f13653D, anonymousClass13D.f13651B);
                    AnonymousClass16N anonymousClass16N2 = this.f11286L;
                    anonymousClass16N2.f14524D = gA;
                    anonymousClass16N2.f14523C += this.f11286L.f14526F;
                    YA(anonymousClass12K, this.f11286L, anonymousClass0or, false);
                    i = this.f11286L.f14529I;
                    if (this.f11286L.f14522B > 0) {
                        T = this.f11286L.f14522B;
                        AnonymousClass0rr.m7996O(this, i4, i3);
                        anonymousClass16N = this.f11286L;
                        anonymousClass16N.f14524D = T;
                        YA(anonymousClass12K, anonymousClass16N, anonymousClass0or, false);
                        i3 = this.f11286L.f14529I;
                    }
                } else {
                    anonymousClass13D = this.f11276B;
                    AnonymousClass0rr.m7997P(this, anonymousClass13D.f13653D, anonymousClass13D.f13651B);
                    anonymousClass16N = this.f11286L;
                    anonymousClass16N.f14524D = gA;
                    YA(anonymousClass12K, anonymousClass16N, anonymousClass0or, false);
                    i = this.f11286L.f14529I;
                    i4 = this.f11286L.f14523C;
                    if (this.f11286L.f14522B > 0) {
                        i2 += this.f11286L.f14522B;
                    }
                    anonymousClass13D = this.f11276B;
                    AnonymousClass0rr.m7996O(this, anonymousClass13D.f13653D, anonymousClass13D.f13651B);
                    AnonymousClass16N anonymousClass16N3 = this.f11286L;
                    anonymousClass16N3.f14524D = i2;
                    anonymousClass16N3.f14523C += this.f11286L.f14526F;
                    YA(anonymousClass12K, this.f11286L, anonymousClass0or, false);
                    i3 = this.f11286L.f14529I;
                    if (this.f11286L.f14522B > 0) {
                        T = this.f11286L.f14522B;
                        AnonymousClass0rr.m7997P(this, i4, i);
                        anonymousClass16N = this.f11286L;
                        anonymousClass16N.f14524D = T;
                        YA(anonymousClass12K, anonymousClass16N, anonymousClass0or, false);
                        i = this.f11286L.f14529I;
                    }
                }
                if (m7332T() > 0) {
                    if ((this.f11282H ^ this.f11290P) == 0) {
                        V = m8003V(i3, anonymousClass12K, anonymousClass0or, true);
                        i += V;
                        i3 += V;
                        V = m8004W(i, anonymousClass12K, anonymousClass0or, false);
                        i += V;
                        i3 += V;
                    } else {
                        V = m8004W(i, anonymousClass12K, anonymousClass0or, true);
                        i += V;
                        i3 += V;
                        V = m8003V(i3, anonymousClass12K, anonymousClass0or, false);
                        i += V;
                        i3 += V;
                    }
                }
                m8007Z(anonymousClass12K, anonymousClass0or, i, i3);
                if (anonymousClass0or.f10402F) {
                    AnonymousClass16O anonymousClass16O = this.f11278D;
                    anonymousClass16O.f14533B = anonymousClass16O.mo2155K();
                } else {
                    this.f11276B.m9088D();
                }
                this.f11284J = this.f11290P;
            }
        }
        this.f11276B.m9088D();
        AnonymousClass13D anonymousClass13D2 = this.f11276B;
        anonymousClass13D2.f13652C = this.f11282H ^ this.f11290P;
        m8015h(anonymousClass12K, anonymousClass0or, anonymousClass13D2);
        this.f11276B.f13654E = true;
        gA = gA(anonymousClass0or);
        if (this.f11286L.f14527G < 0) {
            i2 = 0;
        } else {
            i2 = gA;
            gA = 0;
        }
        gA += this.f11278D.mo2154J();
        i2 += this.f11278D.mo2151G();
        if (anonymousClass0or.f10402F) {
            i3 = this.f11280F;
            O = mo1888O(i3);
            if (O != null) {
                if (this.f11282H) {
                    i3 = this.f11281G - (this.f11278D.mo2148D(O) - this.f11278D.mo2154J());
                } else {
                    i3 = (this.f11278D.mo2150F() - this.f11278D.mo2145A(O)) - this.f11281G;
                }
                if (i3 <= 0) {
                    i2 -= i3;
                } else {
                    gA += i3;
                }
            }
        }
        i = 1;
        jA(anonymousClass12K, anonymousClass0or, this.f11276B, i);
        for (T = m7332T() - 1; T >= 0; T--) {
            AnonymousClass0la.m7311L(this, anonymousClass12K, T, m7331S(T));
        }
        this.f11286L.f14525E = kA();
        if (this.f11276B.f13652C) {
            anonymousClass13D = this.f11276B;
            AnonymousClass0rr.m7996O(this, anonymousClass13D.f13653D, anonymousClass13D.f13651B);
            anonymousClass16N = this.f11286L;
            anonymousClass16N.f14524D = i2;
            YA(anonymousClass12K, anonymousClass16N, anonymousClass0or, false);
            i3 = this.f11286L.f14529I;
            i4 = this.f11286L.f14523C;
            if (this.f11286L.f14522B > 0) {
                gA += this.f11286L.f14522B;
            }
            anonymousClass13D = this.f11276B;
            AnonymousClass0rr.m7997P(this, anonymousClass13D.f13653D, anonymousClass13D.f13651B);
            AnonymousClass16N anonymousClass16N22 = this.f11286L;
            anonymousClass16N22.f14524D = gA;
            anonymousClass16N22.f14523C += this.f11286L.f14526F;
            YA(anonymousClass12K, this.f11286L, anonymousClass0or, false);
            i = this.f11286L.f14529I;
            if (this.f11286L.f14522B > 0) {
                T = this.f11286L.f14522B;
                AnonymousClass0rr.m7996O(this, i4, i3);
                anonymousClass16N = this.f11286L;
                anonymousClass16N.f14524D = T;
                YA(anonymousClass12K, anonymousClass16N, anonymousClass0or, false);
                i3 = this.f11286L.f14529I;
            }
        } else {
            anonymousClass13D = this.f11276B;
            AnonymousClass0rr.m7997P(this, anonymousClass13D.f13653D, anonymousClass13D.f13651B);
            anonymousClass16N = this.f11286L;
            anonymousClass16N.f14524D = gA;
            YA(anonymousClass12K, anonymousClass16N, anonymousClass0or, false);
            i = this.f11286L.f14529I;
            i4 = this.f11286L.f14523C;
            if (this.f11286L.f14522B > 0) {
                i2 += this.f11286L.f14522B;
            }
            anonymousClass13D = this.f11276B;
            AnonymousClass0rr.m7996O(this, anonymousClass13D.f13653D, anonymousClass13D.f13651B);
            AnonymousClass16N anonymousClass16N32 = this.f11286L;
            anonymousClass16N32.f14524D = i2;
            anonymousClass16N32.f14523C += this.f11286L.f14526F;
            YA(anonymousClass12K, this.f11286L, anonymousClass0or, false);
            i3 = this.f11286L.f14529I;
            if (this.f11286L.f14522B > 0) {
                T = this.f11286L.f14522B;
                AnonymousClass0rr.m7997P(this, i4, i);
                anonymousClass16N = this.f11286L;
                anonymousClass16N.f14524D = T;
                YA(anonymousClass12K, anonymousClass16N, anonymousClass0or, false);
                i = this.f11286L.f14529I;
            }
        }
        if (m7332T() > 0) {
            if ((this.f11282H ^ this.f11290P) == 0) {
                V = m8004W(i, anonymousClass12K, anonymousClass0or, true);
                i += V;
                i3 += V;
                V = m8003V(i3, anonymousClass12K, anonymousClass0or, false);
                i += V;
                i3 += V;
            } else {
                V = m8003V(i3, anonymousClass12K, anonymousClass0or, true);
                i += V;
                i3 += V;
                V = m8004W(i, anonymousClass12K, anonymousClass0or, false);
                i += V;
                i3 += V;
            }
        }
        m8007Z(anonymousClass12K, anonymousClass0or, i, i3);
        if (anonymousClass0or.f10402F) {
            this.f11276B.m9088D();
        } else {
            AnonymousClass16O anonymousClass16O2 = this.f11278D;
            anonymousClass16O2.f14533B = anonymousClass16O2.mo2155K();
        }
        this.f11284J = this.f11290P;
    }

    public final PointF xE(int i) {
        if (m7332T() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < AnonymousClass0la.m7307H(m7331S(0))) {
            z = true;
        }
        if (z != this.f11282H) {
            i2 = -1;
        }
        if (this.f11277C == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    /* renamed from: y */
    public void mo1897y(AnonymousClass0or anonymousClass0or) {
        super.mo1897y(anonymousClass0or);
        this.f11279E = null;
        this.f11280F = -1;
        this.f11281G = Process.WAIT_RESULT_TIMEOUT;
        this.f11276B.m9088D();
    }
}
