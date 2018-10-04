package X;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

/* renamed from: X.12r */
public abstract class AnonymousClass12r {
    /* renamed from: B */
    public AnonymousClass0la f13625B;
    /* renamed from: C */
    public boolean f13626C;
    /* renamed from: D */
    public RecyclerView f13627D;
    /* renamed from: E */
    public boolean f13628E;
    /* renamed from: F */
    public int f13629F = -1;
    /* renamed from: G */
    public View f13630G;
    /* renamed from: H */
    private final AnonymousClass1Ab f13631H = new AnonymousClass1Ab(0, 0);

    /* renamed from: A */
    public abstract void mo2189A(int i, int i2, AnonymousClass0or anonymousClass0or, AnonymousClass1Ab anonymousClass1Ab);

    /* renamed from: B */
    public abstract void mo2190B();

    /* renamed from: C */
    public abstract void mo2191C();

    /* renamed from: D */
    public abstract void mo2192D(View view, AnonymousClass0or anonymousClass0or, AnonymousClass1Ab anonymousClass1Ab);

    /* renamed from: B */
    public static void m9035B(AnonymousClass12r anonymousClass12r, int i, int i2) {
        RecyclerView recyclerView = anonymousClass12r.f13627D;
        if (!anonymousClass12r.f13628E || anonymousClass12r.f13629F == -1 || recyclerView == null) {
            anonymousClass12r.m9040E();
        }
        anonymousClass12r.f13626C = false;
        View view = anonymousClass12r.f13630G;
        if (view != null) {
            if (RecyclerView.m6934K(view) == anonymousClass12r.f13629F) {
                anonymousClass12r.mo2192D(anonymousClass12r.f13630G, recyclerView.f8837i, anonymousClass12r.f13631H);
                anonymousClass12r.f13631H.m9731A(recyclerView);
                anonymousClass12r.m9040E();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                anonymousClass12r.f13630G = null;
            }
        }
        if (anonymousClass12r.f13628E) {
            anonymousClass12r.mo2189A(i, i2, recyclerView.f8837i, anonymousClass12r.f13631H);
            Object obj = anonymousClass12r.f13631H.f15303G >= 0 ? 1 : null;
            anonymousClass12r.f13631H.m9731A(recyclerView);
            if (obj == null) {
                return;
            }
            if (anonymousClass12r.f13628E) {
                anonymousClass12r.f13626C = true;
                recyclerView.f8842n.m8895A();
                return;
            }
            anonymousClass12r.m9040E();
        }
    }

    /* renamed from: E */
    public final void m9040E() {
        if (this.f13628E) {
            mo2191C();
            this.f13627D.f8837i.f10409M = -1;
            this.f13630G = null;
            this.f13629F = -1;
            this.f13626C = false;
            this.f13628E = false;
            AnonymousClass0la anonymousClass0la = this.f13625B;
            if (anonymousClass0la.f9554M == this) {
                anonymousClass0la.f9554M = null;
            }
            this.f13625B = null;
            this.f13627D = null;
        }
    }
}
