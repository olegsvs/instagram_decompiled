package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import java.util.List;

/* renamed from: X.4Yv */
public final class AnonymousClass4Yv extends AnonymousClass0TA {
    /* renamed from: B */
    private final AnonymousClass0EE f55241B;
    /* renamed from: C */
    private final Context f55242C;
    /* renamed from: D */
    private final AnonymousClass4eU f55243D;
    /* renamed from: E */
    private final boolean f55244E;
    /* renamed from: F */
    private final boolean f55245F;
    /* renamed from: G */
    private final boolean f55246G = AnonymousClass0G5.B(this.f55242C, C0164R.attr.directInboxUnseenDotEnabled, true);
    /* renamed from: H */
    private final AnonymousClass0Cm f55247H;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass4Yv(Context context, AnonymousClass0EE anonymousClass0EE, AnonymousClass4eU anonymousClass4eU, AnonymousClass0Cm anonymousClass0Cm, boolean z, boolean z2) {
        this.f55242C = context;
        this.f55241B = anonymousClass0EE;
        this.f55243D = anonymousClass4eU;
        this.f55247H = anonymousClass0Cm;
        this.f55245F = z;
        this.f55244E = z2;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        int I = AnonymousClass0cQ.I(this, 2049955701);
        if (view == null) {
            view = AnonymousClass4eN.m24653C(r9.f55242C, viewGroup);
        }
        AnonymousClass4eW anonymousClass4eW = (AnonymousClass4eW) obj4;
        i = r9.f55242C;
        AnonymousClass0EE anonymousClass0EE = r9.f55241B;
        int i2 = anonymousClass4eW.f56009B;
        AnonymousClass4eV anonymousClass4eV = (AnonymousClass4eV) view.getTag();
        AnonymousClass0Vw anonymousClass0Vw = (AnonymousClass0Vw) obj3;
        AnonymousClass4eU anonymousClass4eU = r9.f55243D;
        AnonymousClass2LY anonymousClass2LY = anonymousClass4eW.f56017J;
        List list = anonymousClass4eW.f56010C;
        boolean z = r9.f55245F;
        boolean z2 = z && ((Boolean) AnonymousClass0CC.ZH.H(r9.f55247H)).booleanValue();
        boolean z3 = anonymousClass4eW.f56015H;
        AnonymousClass4eV anonymousClass4eV2 = anonymousClass4eV;
        AnonymousClass0Vw anonymousClass0Vw2 = anonymousClass0Vw;
        AnonymousClass2LY anonymousClass2LY2 = anonymousClass2LY;
        Context context = i;
        AnonymousClass0EE anonymousClass0EE2 = anonymousClass0EE;
        int i3 = i2;
        AnonymousClass4eN.m24652B(context, anonymousClass0EE2, i3, anonymousClass4eV2, anonymousClass0Vw2, anonymousClass4eU, anonymousClass2LY2, list, z, z2, z3, anonymousClass4eW.f56014G, false, anonymousClass4eW.f56016I, r9.f55246G, ((Boolean) AnonymousClass0CC.LH.H(r9.f55247H)).booleanValue(), ((Boolean) AnonymousClass0CC.MH.H(r9.f55247H)).booleanValue(), r9.f55244E, false, anonymousClass4eW.f56013F, anonymousClass4eW.f56012E, anonymousClass4eW.f56011D, r9.f55247H);
        AnonymousClass0cQ.H(r9, 282692213, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass0Vw anonymousClass0Vw = (AnonymousClass0Vw) obj;
        AnonymousClass4eW anonymousClass4eW = (AnonymousClass4eW) obj2;
        anonymousClass0p9.A(0);
    }
}
