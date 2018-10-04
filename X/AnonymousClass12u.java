package X;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.12u */
public final class AnonymousClass12u implements Runnable {
    /* renamed from: F */
    public static final ThreadLocal f13632F = new ThreadLocal();
    /* renamed from: G */
    public static Comparator f13633G = new AnonymousClass1oC();
    /* renamed from: B */
    public long f13634B;
    /* renamed from: C */
    public long f13635C;
    /* renamed from: D */
    public ArrayList f13636D = new ArrayList();
    /* renamed from: E */
    public ArrayList f13637E = new ArrayList();

    /* renamed from: A */
    public final void m9045A(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f13635C == 0) {
            this.f13635C = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        AnonymousClass12O anonymousClass12O = recyclerView.f8829a;
        anonymousClass12O.f13529D = i;
        anonymousClass12O.f13530E = i2;
    }

    /* renamed from: B */
    public static boolean m9042B(RecyclerView recyclerView, int i) {
        int G = recyclerView.f8809G.m8928G();
        for (int i2 = 0; i2 < G; i2++) {
            AnonymousClass0oo L = RecyclerView.m6935L(recyclerView.f8809G.m8927F(i2));
            if (L.f10380L == i && !L.m7718J()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    public static void m9043C(AnonymousClass12u anonymousClass12u, RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.f8811I && recyclerView.f8809G.m8928G() != 0) {
                recyclerView.m7001x();
            }
            anonymousClass12u = recyclerView.f8829a;
            anonymousClass12u.m8897A(recyclerView, true);
            if (anonymousClass12u.f13527B != 0) {
                try {
                    AnonymousClass12m.m8993B("RV Nested Prefetch");
                    AnonymousClass0or anonymousClass0or = recyclerView.f8837i;
                    AnonymousClass0nJ anonymousClass0nJ = recyclerView.f8805C;
                    anonymousClass0or.f10404H = 1;
                    anonymousClass0or.f10403G = anonymousClass0nJ.mo1813B();
                    anonymousClass0or.f10402F = false;
                    anonymousClass0or.f10410N = false;
                    for (int i = 0; i < anonymousClass12u.f13527B * 2; i += 2) {
                        AnonymousClass12u.m9044D(recyclerView, anonymousClass12u.f13528C[i], j);
                    }
                } finally {
                    AnonymousClass12m.m8994C();
                }
            }
        }
    }

    /* renamed from: D */
    public static AnonymousClass0oo m9044D(RecyclerView recyclerView, int i, long j) {
        if (AnonymousClass12u.m9042B(recyclerView, i)) {
            return null;
        }
        AnonymousClass12K anonymousClass12K = recyclerView.f8831c;
        try {
            recyclerView.m6996s();
            AnonymousClass0oo O = anonymousClass12K.m8881O(i, false, j);
            if (O != null) {
                if (!O.m7717I() || O.m7718J()) {
                    anonymousClass12K.m8867A(O, false);
                } else {
                    anonymousClass12K.m8878L(O.f10370B);
                }
            }
            recyclerView.m6998u(false);
            return O;
        } catch (Throwable th) {
            recyclerView.m6998u(false);
        }
    }

    public final void run() {
        try {
            AnonymousClass12m.m8993B("RV Prefetch");
            if (!this.f13636D.isEmpty()) {
                int size = this.f13636D.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) this.f13636D.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    int i2;
                    long toNanos = TimeUnit.MILLISECONDS.toNanos(j) + this.f13634B;
                    int size2 = this.f13636D.size();
                    int i3 = 0;
                    for (i2 = 0; i2 < size2; i2++) {
                        RecyclerView recyclerView2 = (RecyclerView) this.f13636D.get(i2);
                        if (recyclerView2.getWindowVisibility() == 0) {
                            recyclerView2.f8829a.m8897A(recyclerView2, false);
                            i3 += recyclerView2.f8829a.f13527B;
                        }
                    }
                    this.f13637E.ensureCapacity(i3);
                    int i4 = 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        RecyclerView recyclerView3 = (RecyclerView) this.f13636D.get(i5);
                        if (recyclerView3.getWindowVisibility() == 0) {
                            AnonymousClass12O anonymousClass12O = recyclerView3.f8829a;
                            i2 = Math.abs(anonymousClass12O.f13529D) + Math.abs(anonymousClass12O.f13530E);
                            for (i3 = 0; i3 < anonymousClass12O.f13527B * 2; i3 += 2) {
                                AnonymousClass1oD anonymousClass1oD;
                                if (i4 >= this.f13637E.size()) {
                                    anonymousClass1oD = new AnonymousClass1oD();
                                    this.f13637E.add(anonymousClass1oD);
                                } else {
                                    anonymousClass1oD = (AnonymousClass1oD) this.f13637E.get(i4);
                                }
                                int i6 = anonymousClass12O.f13528C[i3 + 1];
                                anonymousClass1oD.f22903C = i6 <= i2;
                                anonymousClass1oD.f22906F = i2;
                                anonymousClass1oD.f22902B = i6;
                                anonymousClass1oD.f22905E = recyclerView3;
                                anonymousClass1oD.f22904D = anonymousClass12O.f13528C[i3];
                                i4++;
                            }
                        }
                    }
                    Collections.sort(this.f13637E, f13633G);
                    for (i2 = 0; i2 < this.f13637E.size(); i2++) {
                        AnonymousClass1oD anonymousClass1oD2 = (AnonymousClass1oD) this.f13637E.get(i2);
                        if (anonymousClass1oD2.f22905E == null) {
                            break;
                        }
                        AnonymousClass0oo D = AnonymousClass12u.m9044D(anonymousClass1oD2.f22905E, anonymousClass1oD2.f22904D, anonymousClass1oD2.f22903C ? Long.MAX_VALUE : toNanos);
                        if (!(D == null || D.f10375G == null || !D.m7717I() || D.m7718J())) {
                            AnonymousClass12u.m9043C(this, (RecyclerView) D.f10375G.get(), toNanos);
                        }
                        anonymousClass1oD2.f22903C = false;
                        anonymousClass1oD2.f22906F = 0;
                        anonymousClass1oD2.f22902B = 0;
                        anonymousClass1oD2.f22905E = null;
                        anonymousClass1oD2.f22904D = 0;
                    }
                }
            }
            this.f13635C = 0;
            AnonymousClass12m.m8994C();
        } catch (Throwable th) {
            this.f13635C = 0;
            AnonymousClass12m.m8994C();
        }
    }
}
