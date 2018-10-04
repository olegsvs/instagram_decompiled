package X;

import android.content.Context;
import com.facebook.C0164R;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.3PO */
public final class AnonymousClass3PO extends AnonymousClass0Rq implements AnonymousClass0Rs {
    /* renamed from: B */
    public final AnonymousClass3PC f40857B;
    /* renamed from: C */
    public boolean f40858C = false;
    /* renamed from: D */
    public final Set f40859D = new HashSet();
    /* renamed from: E */
    private final AnonymousClass2Lm f40860E;
    /* renamed from: F */
    private final AnonymousClass0Ro f40861F = new AnonymousClass2Lk();
    /* renamed from: G */
    private final String f40862G;
    /* renamed from: H */
    private final AnonymousClass3iw f40863H;
    /* renamed from: I */
    private final AnonymousClass3PV f40864I;
    /* renamed from: J */
    private final AnonymousClass3Pd f40865J;

    public final boolean isEnabled(int i) {
        return false;
    }

    public AnonymousClass3PO(Context context, AnonymousClass0Cm anonymousClass0Cm, boolean z, boolean z2, boolean z3, AnonymousClass3PC anonymousClass3PC, AnonymousClass3Pl anonymousClass3Pl, AnonymousClass3Pb anonymousClass3Pb) {
        Context context2 = context;
        this.f40860E = new AnonymousClass2Lm(context);
        this.f40857B = anonymousClass3PC;
        this.f40865J = new AnonymousClass3Pd(context2, anonymousClass0Cm, anonymousClass3Pl, z, z2, z3);
        this.f40864I = new AnonymousClass3PV(context, anonymousClass3Pb);
        this.f40863H = new AnonymousClass3iw(context);
        this.f40862G = context.getString(C0164R.string.no_users_found);
        D(new AnonymousClass0TB[]{this.f40860E, this.f40865J, this.f40864I, this.f40863H});
    }

    /* renamed from: B */
    public static void m19549B(AnonymousClass3PO anonymousClass3PO) {
        anonymousClass3PO.C();
        if (anonymousClass3PO.f40857B.m19544A() || !anonymousClass3PO.f40858C) {
            List list = anonymousClass3PO.f40857B.f40829B;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                if (obj instanceof AnonymousClass0mW) {
                    anonymousClass3PO.B((AnonymousClass0mW) obj, Integer.valueOf(i), anonymousClass3PO.f40865J);
                } else if (obj instanceof AnonymousClass0mf) {
                    AnonymousClass0mf anonymousClass0mf = (AnonymousClass0mf) obj;
                    if (anonymousClass0mf.f9875E == AnonymousClass0mh.HASHTAG) {
                        anonymousClass3PO.B(anonymousClass0mf, Integer.valueOf(i), anonymousClass3PO.f40864I);
                    } else {
                        r1 = new StringBuilder();
                        r1.append("Unaccepted recommendation type for InterestRecommendation: ");
                        r1.append(anonymousClass0mf.f9875E.A());
                        throw new IllegalArgumentException(r1.toString());
                    }
                } else {
                    r1 = new StringBuilder();
                    r1.append("Unaccepted model type: ");
                    r1.append(obj.getClass().getCanonicalName());
                    throw new IllegalArgumentException(r1.toString());
                }
            }
            AnonymousClass0Ro anonymousClass0Ro = anonymousClass3PO.f40861F;
            if (anonymousClass0Ro != null && anonymousClass0Ro.QV()) {
                anonymousClass3PO.A(anonymousClass3PO.f40861F, anonymousClass3PO.f40860E);
            }
        } else {
            anonymousClass3PO.A(anonymousClass3PO.f40862G, anonymousClass3PO.f40863H);
        }
        anonymousClass3PO.E();
    }

    /* renamed from: F */
    public final void m19550F(List list) {
        this.f40857B.f40829B.clear();
        this.f40859D.clear();
        for (Object next : list) {
            if (next instanceof AnonymousClass0mW) {
                this.f40859D.add(((AnonymousClass0mW) next).f9808G.getId());
            }
        }
        this.f40857B.f40829B.addAll(list);
        this.f40858C = true;
        AnonymousClass3PO.m19549B(this);
    }

    public final boolean LF(String str) {
        return this.f40859D.contains(str);
    }

    public final void notifyDataSetChanged() {
        AnonymousClass3PO.m19549B(this);
    }
}
