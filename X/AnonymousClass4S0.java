package X;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import com.facebook.C0164R;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.4S0 */
public final class AnonymousClass4S0 {
    /* renamed from: B */
    public int f54162B;
    /* renamed from: C */
    public boolean f54163C;
    /* renamed from: D */
    public boolean f54164D;
    /* renamed from: E */
    public final AnonymousClass5Tk f54165E;
    /* renamed from: F */
    public final AnonymousClass0Gv f54166F = new AnonymousClass4Rt(this);
    /* renamed from: G */
    public final OnTouchListener f54167G = new AnonymousClass4Ru(this);
    /* renamed from: H */
    public final OnTouchListener f54168H = new AnonymousClass4Rv(this);
    /* renamed from: I */
    public final AnonymousClass4S4 f54169I;
    /* renamed from: J */
    public final AnonymousClass4S5 f54170J;
    /* renamed from: K */
    public final TouchInterceptorFrameLayout f54171K;
    /* renamed from: L */
    public final RecyclerView f54172L;
    /* renamed from: M */
    public int f54173M;
    /* renamed from: N */
    public final AnonymousClass0Wj f54174N = new AnonymousClass4Ry(this);
    /* renamed from: O */
    public final AnonymousClass0Wj f54175O = new AnonymousClass4Rx(this);
    /* renamed from: P */
    private AnonymousClass4RQ f54176P;
    /* renamed from: Q */
    private final int f54177Q;
    /* renamed from: R */
    private final View f54178R;
    /* renamed from: S */
    private final View f54179S;
    /* renamed from: T */
    private final int f54180T;
    /* renamed from: U */
    private final int f54181U;
    /* renamed from: V */
    private final AnonymousClass0rr f54182V;
    /* renamed from: W */
    private final int f54183W;
    /* renamed from: X */
    private final AnonymousClass4S6 f54184X;
    /* renamed from: Y */
    private final AnonymousClass0Wj f54185Y = new AnonymousClass4Rw(this);
    /* renamed from: Z */
    private boolean f54186Z;

    public AnonymousClass4S0(View view, AnonymousClass5Tk anonymousClass5Tk) {
        Context context = view.getContext();
        Resources resources = context.getResources();
        this.f54171K = (TouchInterceptorFrameLayout) view.findViewById(C0164R.id.scrubber);
        this.f54181U = resources.getDimensionPixelSize(C0164R.dimen.music_editor_scrubber_focus_box_width);
        this.f54180T = resources.getDimensionPixelSize(C0164R.dimen.music_editor_scrubber_focus_box_outer_ring_width) + resources.getDimensionPixelSize(C0164R.dimen.music_editor_scrubber_focus_box_inner_ring_width);
        this.f54177Q = resources.getDimensionPixelSize(C0164R.dimen.music_editor_scrubber_equalizer_bar_width);
        this.f54183W = AnonymousClass0Nm.J(context);
        this.f54165E = anonymousClass5Tk;
        this.f54178R = this.f54171K.findViewById(C0164R.id.scrubber_focus_box_background_view);
        this.f54170J = new AnonymousClass4S5(context);
        this.f54178R.setBackground(this.f54170J);
        this.f54179S = this.f54171K.findViewById(C0164R.id.scrbber_focus_box_ring_view);
        this.f54184X = new AnonymousClass4S6(context);
        this.f54179S.setBackground(this.f54184X);
        RecyclerView recyclerView = (RecyclerView) this.f54171K.findViewById(C0164R.id.scrubber_recycler_view);
        this.f54172L = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
        this.f54182V = new AnonymousClass0rr(context, 0, false);
        this.f54172L.setLayoutManager(this.f54182V);
        this.f54169I = new AnonymousClass4S4();
        this.f54172L.setAdapter(this.f54169I);
    }

    /* renamed from: A */
    public final boolean m24248A() {
        int aA = this.f54182V.aA();
        while (aA <= this.f54182V.cA()) {
            AnonymousClass4RS anonymousClass4RS = (AnonymousClass4RS) this.f54172L.a(aA);
            if (anonymousClass4RS != null && this.f54169I.f54191B.contains(Integer.valueOf(aA))) {
                int i = this.f54183W;
                int i2 = this.f54181U;
                int i3 = this.f54180T;
                View view = anonymousClass4RS.f10370B;
                i = AnonymousClass4S7.m24259D(i, i2);
                Object obj = (view.getLeft() >= i3 + i || view.getRight() <= i) ? null : 1;
                if (obj != null) {
                    return true;
                }
            }
            aA++;
        }
        return false;
    }

    /* renamed from: B */
    public final void m24249B() {
        AnonymousClass0rv anonymousClass0rv = this.f54176P;
        if (anonymousClass0rv != null) {
            this.f54172L.y(anonymousClass0rv);
        }
        Context context = this.f54172L.getContext();
        int D = AnonymousClass4S7.m24259D(this.f54183W, this.f54181U);
        int i = this.f54181U;
        int i2 = this.f54162B;
        int C = AnonymousClass4S7.m24258C(i, i2) - this.f54177Q;
        int i3 = this.f54173M;
        int i4 = this.f54181U;
        int i5 = this.f54162B;
        int i6 = this.f54177Q;
        double d = (double) (i3 % JsonMappingException.MAX_REFS_TO_LIST);
        Double.isNaN(d);
        d /= 1000.0d;
        double C2 = (double) AnonymousClass4S7.m24258C(i4, i5);
        Double.isNaN(C2);
        this.f54176P = new AnonymousClass4RQ(context, D, C, ((int) (d * C2)) - i6);
        this.f54172L.A(this.f54176P);
        this.f54169I.notifyDataSetChanged();
    }

    /* renamed from: B */
    public static void m24244B(AnonymousClass4S0 anonymousClass4S0, boolean z) {
        AnonymousClass5Tk anonymousClass5Tk = anonymousClass4S0.f54165E;
        int E = anonymousClass4S0.m24247E();
        if (!anonymousClass5Tk.f64598B.f64602E.f54118D) {
            anonymousClass5Tk.f64598B.f64602E.f54116B.setProgress(E);
        }
        anonymousClass5Tk.f64598B.f64599B = E;
        AnonymousClass4Rs anonymousClass4Rs = anonymousClass5Tk.f64598B.f64606I;
        anonymousClass4Rs.f54154I.setText(AnonymousClass25C.m14360B(anonymousClass5Tk.f64598B.f64599B));
        TextView textView = anonymousClass4Rs.f54154I;
        E = z ? anonymousClass4Rs.f54153H : anonymousClass4Rs.f54152G;
        if (textView.getCurrentTextColor() != E) {
            textView.setTextColor(E);
        }
        if (!z) {
            anonymousClass5Tk.f64598B.f64606I.m24240B(true);
        } else if (AnonymousClass5Tl.E(anonymousClass5Tk.f64598B)) {
            AnonymousClass4Rs anonymousClass4Rs2 = anonymousClass5Tk.f64598B.f64606I;
            AnonymousClass4Rs.m24237C(anonymousClass4Rs2);
            AnonymousClass4Re anonymousClass4Re = anonymousClass4Rs2.f54147B;
            anonymousClass4Re.f54124D = false;
            anonymousClass4Re.f54123C.removeCallbacks(anonymousClass4Re.f54122B);
            anonymousClass4Re.f54125E = null;
            AnonymousClass14H.H(true, new View[]{anonymousClass4Re.f54123C});
        }
    }

    /* renamed from: C */
    public final void m24250C(int i) {
        AnonymousClass0rr anonymousClass0rr = this.f54182V;
        int i2 = i / JsonMappingException.MAX_REFS_TO_LIST;
        int i3 = this.f54183W;
        int i4 = this.f54181U;
        anonymousClass0rr.mA(i2, AnonymousClass4S7.m24259D(i3, i4) - ((int) ((((float) (i % JsonMappingException.MAX_REFS_TO_LIST)) / 1000.0f) * ((float) AnonymousClass4S7.m24258C(i4, this.f54162B)))));
    }

    /* renamed from: C */
    public static void m24245C(AnonymousClass4S0 anonymousClass4S0, boolean z) {
        AnonymousClass4S0.m24246D(anonymousClass4S0, anonymousClass4S0.f54185Y);
        AnonymousClass4S6 anonymousClass4S6 = anonymousClass4S0.f54184X;
        anonymousClass4S6.f54200B = z;
        AnonymousClass4S6.m24256B(anonymousClass4S6);
        if (z && !anonymousClass4S0.f54186Z) {
            AnonymousClass0HT.f2637C.C();
        }
        anonymousClass4S0.f54186Z = z;
    }

    /* renamed from: D */
    public static void m24246D(AnonymousClass4S0 anonymousClass4S0, AnonymousClass0Wj anonymousClass0Wj) {
        for (int aA = anonymousClass4S0.f54182V.aA(); aA <= anonymousClass4S0.f54182V.cA(); aA++) {
            anonymousClass0Wj.RC((AnonymousClass4RS) anonymousClass4S0.f54172L.a(aA));
        }
    }

    /* renamed from: E */
    private int m24247E() {
        int aA = this.f54182V.aA();
        AnonymousClass4RS anonymousClass4RS = (AnonymousClass4RS) this.f54172L.a(aA);
        if (anonymousClass4RS == null) {
            return 0;
        }
        int i = this.f54183W;
        int i2 = this.f54181U;
        int i3 = this.f54162B;
        return Math.max((int) (((float) (aA * JsonMappingException.MAX_REFS_TO_LIST)) + ((((float) (AnonymousClass4S7.m24259D(i, i2) - anonymousClass4RS.f10370B.getLeft())) / ((float) AnonymousClass4S7.m24258C(i2, i3))) * 1000.0f)), 0);
    }
}
