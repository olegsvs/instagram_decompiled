package X;

import android.content.Context;
import android.util.SparseArray;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5TW */
public final class AnonymousClass5TW implements AnonymousClass4Ye {
    /* renamed from: B */
    public BackgroundGradientColors f64451B;
    /* renamed from: C */
    public boolean f64452C;
    /* renamed from: D */
    public int f64453D;
    /* renamed from: E */
    public final AnonymousClass3zz f64454E;
    /* renamed from: F */
    public final List f64455F = new ArrayList();
    /* renamed from: G */
    public AnonymousClass1Oi f64456G;
    /* renamed from: H */
    public AnonymousClass4Yg f64457H = AnonymousClass4Yg.END_CURRENT;
    /* renamed from: I */
    public int f64458I;
    /* renamed from: J */
    public final Object f64459J = new Object();
    /* renamed from: K */
    public int f64460K;
    /* renamed from: L */
    public final AnonymousClass0Cm f64461L;
    /* renamed from: M */
    private final SparseArray f64462M;

    public final void onStart() {
    }

    public AnonymousClass5TW(Context context, AnonymousClass3zz anonymousClass3zz, List list, SparseArray sparseArray, AnonymousClass0Cm anonymousClass0Cm) {
        this.f64454E = anonymousClass3zz;
        anonymousClass3zz.f48155G = AnonymousClass5TW.m26879C(context);
        this.f64462M = sparseArray;
        this.f64455F.clear();
        this.f64455F.addAll(list);
        this.f64461L = anonymousClass0Cm;
    }

    /* renamed from: B */
    public static int m26878B(AnonymousClass5TW anonymousClass5TW, int i) {
        return ((Integer) anonymousClass5TW.f64462M.get(i, Integer.valueOf(100))).intValue();
    }

    /* renamed from: C */
    public static boolean m26879C(Context context) {
        context = AnonymousClass0tt.B(context);
        return context >= 2008 && context >= 2014;
    }

    public final void Es(AnonymousClass4Yg anonymousClass4Yg, int i) {
        synchronized (this.f64459J) {
            this.f64457H = anonymousClass4Yg;
            this.f64460K = i;
            if (anonymousClass4Yg == AnonymousClass4Yg.LEFT) {
                this.f64458I = (this.f64453D + 1) % this.f64455F.size();
            } else {
                this.f64458I = ((this.f64453D - 1) + this.f64455F.size()) % this.f64455F.size();
            }
        }
        this.f64454E.G();
    }

    public final void ak(AnonymousClass4Yg anonymousClass4Yg) {
        synchronized (this.f64459J) {
            if (anonymousClass4Yg == AnonymousClass4Yg.END_NEXT) {
                int i = this.f64458I;
                AnonymousClass281.B(this.f64461L).tZ(((Integer) this.f64455F.get(i)).intValue(), i);
                this.f64453D = this.f64458I;
            }
            this.f64457H = anonymousClass4Yg;
        }
        this.f64454E.G();
    }

    public final int hK() {
        return ((Integer) this.f64455F.get(this.f64453D)).intValue();
    }
}
