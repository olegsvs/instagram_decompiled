package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;

/* renamed from: X.4n7 */
public final class AnonymousClass4n7 extends AnonymousClass0TA {
    /* renamed from: B */
    public final AnonymousClass1MW f57275B;
    /* renamed from: C */
    public final Context f57276C;
    /* renamed from: D */
    public final AnonymousClass0p8 f57277D = new AnonymousClass0p7();
    /* renamed from: E */
    public final AnonymousClass0EE f57278E;
    /* renamed from: F */
    public final AnonymousClass0Cm f57279F;
    /* renamed from: G */
    public final AnonymousClass1MX f57280G;
    /* renamed from: H */
    public final AnonymousClass4oM f57281H;

    public final boolean KX(int i, Object obj, Object obj2) {
        return true;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass4n7(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass1MW anonymousClass1MW, AnonymousClass1MX anonymousClass1MX, AnonymousClass4oM anonymousClass4oM, AnonymousClass0EE anonymousClass0EE) {
        this.f57276C = context;
        this.f57279F = anonymousClass0Cm;
        this.f57275B = anonymousClass1MW;
        this.f57280G = anonymousClass1MX;
        this.f57281H = anonymousClass4oM;
        this.f57278E = anonymousClass0EE;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        View view2 = view;
        AnonymousClass4n7 anonymousClass4n7 = this;
        int I = AnonymousClass0cQ.I(this, -1757369776);
        if (view == null) {
            view2 = LayoutInflater.from(this.f57276C).inflate(C0164R.layout.video_item_view, viewGroup, false);
            view2.setTag(AnonymousClass4oF.m25113C(view2, false));
        }
        AnonymousClass1e0 anonymousClass1e0 = (AnonymousClass1e0) obj3;
        AnonymousClass1Xu anonymousClass1Xu = (AnonymousClass1Xu) obj4;
        int I2 = AnonymousClass0cQ.I(this, 203369166);
        AnonymousClass4oE anonymousClass4oE = (AnonymousClass4oE) view2.getTag();
        AnonymousClass4nA.m25073B(this.f57279F, anonymousClass4oE, anonymousClass1e0, true, false, this.f57275B, this.f57280G, anonymousClass1Xu.f19896D, 0, 1073741824, anonymousClass1Xu.f19895C ^ 1, this.f57281H.m25120D(anonymousClass1e0.f20830E), this.f57277D, this.f57278E);
        anonymousClass4n7.f57281H.m25122F(anonymousClass1e0.f20830E, anonymousClass4oE);
        AnonymousClass0cQ.H(anonymousClass4n7, -1699398968, I2);
        AnonymousClass0cQ.H(anonymousClass4n7, -463007031, I);
        return view2;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass1e0 anonymousClass1e0 = (AnonymousClass1e0) obj;
        AnonymousClass1Xu anonymousClass1Xu = (AnonymousClass1Xu) obj2;
        anonymousClass0p9.A(0);
    }
}
