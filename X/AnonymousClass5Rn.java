package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.5Rn */
public final class AnonymousClass5Rn implements AnonymousClass49J {
    /* renamed from: B */
    public Context f63467B;
    /* renamed from: C */
    public AnonymousClass0P7 f63468C;
    /* renamed from: D */
    public AnonymousClass0Cm f63469D;
    /* renamed from: E */
    private String f63470E;
    /* renamed from: F */
    private String f63471F;
    /* renamed from: G */
    private int f63472G;
    /* renamed from: H */
    private int f63473H;
    /* renamed from: I */
    private AnonymousClass0Qf f63474I;

    public AnonymousClass5Rn(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0P7 anonymousClass0P7, int i, int i2, String str, AnonymousClass0Qf anonymousClass0Qf) {
        this.f63467B = context;
        this.f63469D = anonymousClass0Cm;
        this.f63468C = anonymousClass0P7;
        this.f63471F = anonymousClass0P7.NO();
        this.f63473H = i;
        this.f63472G = i2;
        this.f63470E = str;
        this.f63474I = anonymousClass0Qf;
    }

    /* renamed from: A */
    public final void m26544A(String str, String str2) {
        AnonymousClass0RG D = AnonymousClass0RG.D();
        AnonymousClass0VT anonymousClass0VT = new AnonymousClass0VT();
        anonymousClass0VT.f5735E = str2;
        anonymousClass0VT.f5739I = str;
        anonymousClass0VT.f5732B = new AnonymousClass48y(this);
        D.E(anonymousClass0VT.A());
    }

    public final void Cq(List list, AnonymousClass1gg anonymousClass1gg) {
        AnonymousClass0P7 anonymousClass0P7 = this.f63468C;
        anonymousClass1gg.P();
        for (AnonymousClass0MI anonymousClass0MI : list) {
            if (!anonymousClass0MI.V() || (anonymousClass0MI.f3376I.isEmpty() ^ 1) == 0) {
                AnonymousClass0ov anonymousClass0ov = new AnonymousClass0ov(anonymousClass0MI, anonymousClass1gg.f21393G);
                String id = anonymousClass0MI.getId();
                List list2 = anonymousClass0P7.PB;
                boolean z = list2 != null && list2.contains(id);
                anonymousClass0ov.f10439C = z;
                anonymousClass1gg.f21398L.add(anonymousClass0ov);
                anonymousClass1gg.f21392F.add(anonymousClass0MI.getId());
                anonymousClass1gg.f21397K.put(anonymousClass0MI.getId(), anonymousClass0ov);
            }
        }
        anonymousClass1gg.notifyDataSetChanged();
    }

    public final String RK() {
        return this.f63470E;
    }

    public final AnonymousClass49I TK() {
        return AnonymousClass49I.B((String) AnonymousClass0CC.NP.H(this.f63469D));
    }

    public final void pv(String str, boolean z, AnonymousClass0IJ anonymousClass0IJ) {
        List E;
        Set hashSet = new HashSet();
        Set hashSet2 = new HashSet();
        if (z) {
            hashSet2.add(this.f63471F);
        } else {
            hashSet.add(this.f63471F);
        }
        String str2 = str;
        AnonymousClass0MI D = AnonymousClass0Jd.f2931B.M(this.f63469D).D(str);
        AnonymousClass0IL anonymousClass0IL = anonymousClass0IJ;
        AnonymousClass30n F = AnonymousClass30m.F(anonymousClass0IL.getContext(), D, this.f63471F);
        String str3 = null;
        if (F != null) {
            str3 = F.f36864E;
            E = AnonymousClass30m.E(F);
        } else {
            E = null;
        }
        AnonymousClass0GA E2 = AnonymousClass0hR.E(this.f63469D, str2, AnonymousClass30m.D(this.f63474I), hashSet, hashSet2, null, str3, null, E);
        E2.f2849B = new AnonymousClass490(this, z ^ 1, D, anonymousClass0IL);
        anonymousClass0IL.schedule(E2);
    }

    public final void sh(String str, AnonymousClass0IJ anonymousClass0IJ) {
        RectF F = AnonymousClass2Mh.F(AnonymousClass2Mh.B(new Rect(0, 0, this.f63473H, this.f63472G)), this.f63473H, this.f63472G, 1, 1);
        String str2 = str;
        AnonymousClass0GA C = AnonymousClass0hR.C(this.f63469D, AnonymousClass30m.D(this.f63474I), new HashSet(Collections.singletonList(this.f63471F)), str2, this.f63471F, null, Arrays.asList(new Float[]{Float.valueOf(F.left), Float.valueOf(F.top), Float.valueOf(F.right), Float.valueOf(F.bottom)}), null);
        C.f2849B = new AnonymousClass48z(this, anonymousClass0IJ);
        anonymousClass0IJ.schedule(C);
    }
}
