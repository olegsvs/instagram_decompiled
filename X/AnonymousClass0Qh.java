package X;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.reels.fragment.ReelViewerFragment;
import com.instagram.ui.widget.segmentedprogressbar.ProgressAnchorContainer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: X.0Qh */
public final class AnonymousClass0Qh implements AnonymousClass0QD {
    /* renamed from: B */
    public boolean f4437B;
    /* renamed from: C */
    public final ReelViewerFragment f4438C;
    /* renamed from: D */
    public AnonymousClass14n f4439D;
    /* renamed from: E */
    public AnonymousClass0Pm f4440E;
    /* renamed from: F */
    public final AnonymousClass0IJ f4441F;
    /* renamed from: G */
    public AnonymousClass67n f4442G;
    /* renamed from: H */
    public final AnonymousClass0Cm f4443H;
    /* renamed from: I */
    private final Handler f4444I;
    /* renamed from: J */
    private final Runnable f4445J = new AnonymousClass1RK(this);
    /* renamed from: K */
    private long f4446K;
    /* renamed from: L */
    private AnonymousClass0QL f4447L;
    /* renamed from: M */
    private long f4448M;
    /* renamed from: N */
    private boolean f4449N;

    public final boolean GTA() {
        return false;
    }

    public final boolean Lc() {
        return false;
    }

    public final boolean OY() {
        return false;
    }

    public final void Rp(int i) {
    }

    public final void St() {
    }

    public final boolean fCA() {
        return false;
    }

    public final void fFA() {
    }

    public final void gFA() {
    }

    public final void gx() {
    }

    public final void po(AnonymousClass0MI anonymousClass0MI) {
    }

    public final void xc(int i, int i2, Intent intent) {
    }

    public AnonymousClass0Qh(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0IJ anonymousClass0IJ, AnonymousClass0QL anonymousClass0QL, ReelViewerFragment reelViewerFragment) {
        this.f4447L = anonymousClass0QL;
        this.f4443H = anonymousClass0Cm;
        this.f4441F = anonymousClass0IJ;
        this.f4444I = new Handler(Looper.getMainLooper());
        this.f4438C = reelViewerFragment;
    }

    /* renamed from: B */
    private void m4049B() {
        if (this.f4437B) {
            this.f4437B = false;
            this.f4449N = false;
            this.f4439D = null;
            this.f4440E = null;
            AnonymousClass67n anonymousClass67n = this.f4442G;
            if (anonymousClass67n != null) {
                if (anonymousClass67n.f72020F) {
                    anonymousClass67n.f72020F = false;
                    anonymousClass67n.f72017C.P();
                    AnonymousClass5Ow anonymousClass5Ow = anonymousClass67n.f72019E;
                    if (anonymousClass5Ow.f63038M) {
                        anonymousClass5Ow.f63038M = false;
                        anonymousClass5Ow.f63027B = null;
                    }
                }
                AnonymousClass67n anonymousClass67n2 = this.f4442G;
                anonymousClass67n2.f72017C.C();
                anonymousClass67n2.f72017C = null;
                AnonymousClass5Os anonymousClass5Os = anonymousClass67n2.f72018D;
                anonymousClass5Os.f63020C.clear();
                anonymousClass5Os.f63021D.clear();
                anonymousClass67n2.f72018D = null;
                anonymousClass67n2.f72019E = null;
                anonymousClass67n2.f72016B.C();
                anonymousClass67n2.f72016B = null;
                this.f4442G = null;
            }
            this.f4444I.removeCallbacksAndMessages(null);
        }
    }

    public final void Di(AnonymousClass14b anonymousClass14b, AnonymousClass0Pj anonymousClass0Pj) {
        AnonymousClass0Pm anonymousClass0Pm = anonymousClass0Pj.f4131C;
        Object obj = (this.f4437B && anonymousClass0Pm != null && AnonymousClass0LQ.m2954B(this.f4440E.f4148B, anonymousClass0Pm.f4148B) && this.f4439D.equals(anonymousClass14b)) ? 1 : null;
        if (obj == null) {
            m4049B();
        }
        if (anonymousClass0Pj.pW()) {
            AnonymousClass0Pm anonymousClass0Pm2 = anonymousClass0Pj.f4131C;
            if (!this.f4437B) {
                this.f4437B = true;
                this.f4439D = (AnonymousClass14n) anonymousClass14b;
                this.f4440E = anonymousClass0Pm2;
            }
        }
    }

    public final void JGA(AnonymousClass0Pj anonymousClass0Pj, AnonymousClass14b anonymousClass14b) {
        if (this.f4437B) {
            AnonymousClass0LH.m2924B(anonymousClass0Pj.f4131C.equals(this.f4440E));
            AnonymousClass0LH.m2924B(anonymousClass14b.equals(this.f4439D));
            if (!this.f4449N) {
                this.f4449N = true;
                if (this.f4442G == null) {
                    this.f4442G = new AnonymousClass67n(this.f4440E.f4174b, this.f4439D.f13993T, this.f4441F, this.f4443H, new AnonymousClass69L(this.f4440E), this.f4438C);
                }
                AnonymousClass67n anonymousClass67n = this.f4442G;
                String str = this.f4440E.f4148B;
                String str2 = this.f4440E.f4159M;
                if (str2 == null) {
                    str2 = JsonProperty.USE_DEFAULT_NAME;
                }
                if (!anonymousClass67n.f72020F) {
                    anonymousClass67n.f72020F = true;
                    anonymousClass67n.f72017C.O(str);
                    AnonymousClass5Ow anonymousClass5Ow = anonymousClass67n.f72019E;
                    if (!anonymousClass5Ow.f63038M) {
                        anonymousClass5Ow.f63038M = true;
                        anonymousClass5Ow.f63027B = str;
                        anonymousClass5Ow.f63031F = str2;
                    }
                }
                AnonymousClass5Or.B(this.f4440E, this.f4443H);
            }
        }
    }

    public final void Kz(int i) {
        if (this.f4437B && this.f4449N) {
            AnonymousClass67n anonymousClass67n = this.f4442G;
            if (anonymousClass67n.f72020F) {
                int i2 = (int) (((long) i) / 1000);
                AnonymousClass67n.C(anonymousClass67n, i2);
                List arrayList = new ArrayList();
                AnonymousClass5Os anonymousClass5Os = anonymousClass67n.f72018D;
                Collection arrayList2 = new ArrayList();
                for (Entry value : anonymousClass5Os.f63020C.headMap(Integer.valueOf(i2)).entrySet()) {
                    arrayList2.add((AnonymousClass5ag) value.getValue());
                }
                arrayList.addAll(arrayList2);
                AnonymousClass5Lr anonymousClass5Lr = anonymousClass67n.f72017C.f71917F;
                anonymousClass5Lr.f62456D.clear();
                anonymousClass5Lr.f62455C.clear();
                for (int i3 = 0; i3 < Math.min(arrayList.size(), AnonymousClass5Lr.f62453M); i3++) {
                    if (anonymousClass5Lr.W((AnonymousClass5NU) arrayList.get(i3))) {
                        anonymousClass5Lr.f62455C.add(arrayList.get(i3));
                    }
                }
                anonymousClass5Lr.X();
                anonymousClass67n.f72017C.f71918G.FA(0);
                anonymousClass67n.f72016B.C();
            }
            this.f4439D.f13986M.setText(AnonymousClass0dw.m6137E((long) i));
            AnonymousClass14H.m9163H(false, this.f4439D.f13986M);
            AnonymousClass0OR.m3627G(this.f4444I, this.f4445J, 252780357);
            AnonymousClass0OR.m3626F(this.f4444I, this.f4445J, 2000, -799881745);
        }
    }

    public final void Lz(int i, int i2) {
        if (this.f4437B && this.f4449N) {
            this.f4439D.m9218B((long) i, (long) i2);
        }
    }

    public final int OR() {
        return this.f4437B ? (int) (((float) this.f4439D.f13989P.getWidth()) * 0.5f) : 0;
    }

    public final void Oz(int i, int i2) {
        if (this.f4437B && this.f4449N) {
            this.f4439D.m9218B((long) i, (long) i2);
            AnonymousClass14n anonymousClass14n = this.f4439D;
            anonymousClass14n.f13990Q.performHapticFeedback(0);
            ProgressAnchorContainer.B(anonymousClass14n.f13989P, false);
        }
    }

    public final void Pz() {
        if (this.f4437B && this.f4449N) {
            ProgressAnchorContainer.B(this.f4439D.f13989P, true);
        }
    }

    public final boolean ZCA() {
        return this.f4437B && this.f4449N && this.f4442G.f72017C.L();
    }

    public final void gi() {
        m4049B();
    }

    public final void jFA() {
        if (this.f4437B && this.f4449N) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.f4446K >= 1000) {
                long DI = this.f4447L.DI();
                if (this.f4448M != DI) {
                    AnonymousClass67n anonymousClass67n = this.f4442G;
                    if (anonymousClass67n.f72020F) {
                        AnonymousClass5Ow anonymousClass5Ow = anonymousClass67n.f72019E;
                        int i = (int) (DI / 1000);
                        AnonymousClass5Ow.B(anonymousClass5Ow.f63032G, anonymousClass5Ow.f63034I, i, anonymousClass5Ow.f63028C, new AnonymousClass5as(anonymousClass5Ow));
                        AnonymousClass5Ow.B(anonymousClass5Ow.f63033H, anonymousClass5Ow.f63035J, i, anonymousClass5Ow.f63036K, new AnonymousClass5at(anonymousClass5Ow));
                        int i2 = (int) (DI / 1000);
                        AnonymousClass5ag anonymousClass5ag = (AnonymousClass5ag) anonymousClass67n.f72018D.f63020C.get(Integer.valueOf(i2));
                        if (anonymousClass5ag != null) {
                            AnonymousClass67B anonymousClass67B = anonymousClass67n.f72017C;
                            anonymousClass67B.f71917F.P(anonymousClass5ag);
                            anonymousClass67B.B();
                        }
                        AnonymousClass5Me anonymousClass5Me = (AnonymousClass5Me) anonymousClass67n.f72018D.f63021D.get(Integer.valueOf(i2));
                        if (anonymousClass5Me != null) {
                            if (anonymousClass5Me.f62647B > 0) {
                                anonymousClass67n.f72016B.A(false);
                            }
                            int i3 = anonymousClass5Me.f62648C;
                            List list = anonymousClass5Me.f62649D;
                            int i4 = i3;
                            List list2 = list;
                            if (list != null && list.size() > 50) {
                                list2 = list2.subList(0, 50);
                            }
                            if (i3 > 0 || !(list2 == null || list2.isEmpty())) {
                                anonymousClass67n.f72016B.B(Math.min(i4, 50), AnonymousClass67n.B(list2), false);
                            }
                        }
                        AnonymousClass67n.C(anonymousClass67n, i2);
                    }
                    this.f4448M = DI;
                }
                this.f4446K = elapsedRealtime;
                this.f4439D.f13986M.setText(AnonymousClass0dw.m6137E(DI));
            }
            this.f4439D.f13977D.setVisibility(8);
        }
    }

    public final boolean xCA() {
        return this.f4437B && this.f4449N && this.f4442G.f72017C.L();
    }
}
