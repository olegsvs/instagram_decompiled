package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4wt */
public final class AnonymousClass4wt extends AnonymousClass0nJ {
    /* renamed from: J */
    private static long f58721J;
    /* renamed from: B */
    public final AnonymousClass2CW f58722B;
    /* renamed from: C */
    public final AnonymousClass4xO f58723C;
    /* renamed from: D */
    public AnonymousClass5Yb f58724D;
    /* renamed from: E */
    public final AnonymousClass0Cm f58725E;
    /* renamed from: F */
    public final List f58726F = new ArrayList();
    /* renamed from: G */
    public final Map f58727G = new HashMap();
    /* renamed from: H */
    private final Map f58728H = new HashMap();
    /* renamed from: I */
    private AnonymousClass2CU f58729I;

    public AnonymousClass4wt(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass5Yb anonymousClass5Yb, AnonymousClass4xO anonymousClass4xO, AnonymousClass2CW anonymousClass2CW) {
        this.f58725E = anonymousClass0Cm;
        this.f58724D = anonymousClass5Yb;
        this.f58723C = anonymousClass4xO;
        this.f58722B = anonymousClass2CW;
        O(true);
    }

    /* renamed from: B */
    public final int m25462B() {
        return this.f58726F.size();
    }

    /* renamed from: B */
    private static void m25461B(AnonymousClass4wt anonymousClass4wt, AnonymousClass2CU anonymousClass2CU, int i) {
        if (anonymousClass4wt.f58726F.indexOf(anonymousClass2CU) != i) {
            if (anonymousClass4wt.f58727G.containsKey(anonymousClass2CU.A())) {
                if (i > 0) {
                    i--;
                }
                anonymousClass4wt.f58727G.remove(anonymousClass2CU.A());
                anonymousClass4wt.f58726F.remove(anonymousClass2CU);
            }
            anonymousClass4wt.f58726F.add(i, anonymousClass2CU);
            anonymousClass4wt.f58727G.put(anonymousClass2CU.A(), anonymousClass2CU);
        }
    }

    /* renamed from: I */
    public final /* bridge */ /* synthetic */ void m25463I(AnonymousClass0oo anonymousClass0oo, int i) {
        AnonymousClass5YX anonymousClass5YX = (AnonymousClass5YX) anonymousClass0oo;
        AnonymousClass2CU anonymousClass2CU = (AnonymousClass2CU) this.f58726F.get(i);
        int B = B();
        Object obj = 1;
        if (B <= 1) {
            obj = null;
        }
        anonymousClass5YX.f66175C = anonymousClass2CU;
        if (anonymousClass2CU.f27425B.f10013I != null) {
            anonymousClass5YX.f66174B.setText(anonymousClass5YX.f66175C.f27425B.f10013I);
        }
        if (obj != null) {
            AnonymousClass5YX.m27521B(anonymousClass5YX);
        }
    }

    /* renamed from: J */
    public final /* bridge */ /* synthetic */ AnonymousClass0oo m25464J(ViewGroup viewGroup, int i) {
        AnonymousClass0oo anonymousClass5YX = new AnonymousClass5YX(LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.tv_guide_channel, viewGroup, false), this.f58724D, this.f58723C);
        Context context = viewGroup.getContext();
        Drawable anonymousClass2Lj = new AnonymousClass2Lj(context, 0.0f, C0164R.color.transparent, 80);
        Drawable anonymousClass2Lj2 = new AnonymousClass2Lj(context, AnonymousClass0Nm.C(context, 2), C0164R.color.white, 80);
        int[] iArr = new int[0];
        int[] iArr2 = new int[]{16842913};
        Drawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(iArr2, anonymousClass2Lj2);
        stateListDrawable.addState(iArr, anonymousClass2Lj);
        anonymousClass5YX.f10370B.setBackground(stateListDrawable);
        return anonymousClass5YX;
    }

    /* renamed from: P */
    public final int m25465P(AnonymousClass0n8 anonymousClass0n8) {
        for (int i = 0; i < this.f58726F.size(); i++) {
            if (((AnonymousClass2CU) this.f58726F.get(i)).f27425B == anonymousClass0n8) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: Q */
    public final void m25466Q(AnonymousClass0n8 anonymousClass0n8) {
        AnonymousClass2CU B = AnonymousClass2CU.B(this.f58725E, anonymousClass0n8);
        if (!AnonymousClass0LQ.B(this.f58729I, B)) {
            AnonymousClass2CU anonymousClass2CU = this.f58729I;
            if (anonymousClass2CU != null) {
                this.f58727G.remove(anonymousClass2CU.A());
                this.f58726F.remove(anonymousClass2CU);
            }
            this.f58729I = B;
            AnonymousClass4wt.m25461B(this, B, this.f58726F.size());
            notifyDataSetChanged();
        }
    }

    public final long getItemId(int i) {
        String A = ((AnonymousClass2CU) this.f58726F.get(i)).A();
        if (this.f58728H.containsKey(A)) {
            return ((Long) this.f58728H.get(A)).longValue();
        }
        long j = f58721J;
        f58721J = 1 + j;
        this.f58728H.put(A, Long.valueOf(j));
        return j;
    }
}
