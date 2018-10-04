package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4JP */
public final class AnonymousClass4JP extends AnonymousClass0Rq {
    /* renamed from: B */
    public final List f52660B = new ArrayList();
    /* renamed from: C */
    public boolean f52661C;
    /* renamed from: D */
    public boolean f52662D;
    /* renamed from: E */
    public final List f52663E = new ArrayList();
    /* renamed from: F */
    private final AnonymousClass4J4 f52664F;
    /* renamed from: G */
    private final Context f52665G;
    /* renamed from: H */
    private final List f52666H = new ArrayList();
    /* renamed from: I */
    private boolean f52667I;
    /* renamed from: J */
    private final AnonymousClass1Wc f52668J;
    /* renamed from: K */
    private final AnonymousClass4K8 f52669K;
    /* renamed from: L */
    private final AnonymousClass4JX f52670L;
    /* renamed from: M */
    private final List f52671M = new ArrayList();

    public AnonymousClass4JP(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass5SW anonymousClass5SW, AnonymousClass4K8 anonymousClass4K8) {
        this.f52665G = context;
        this.f52670L = new AnonymousClass4JX(context);
        this.f52664F = new AnonymousClass4J4(context, anonymousClass0Cm, anonymousClass5SW);
        this.f52668J = new AnonymousClass1Wc(context, Integer.valueOf(-1));
        this.f52669K = anonymousClass4K8;
        D(new AnonymousClass0TB[]{this.f52664F, this.f52670L, this.f52668J});
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public static void m23834B(X.AnonymousClass4JP r3) {
        /*
        r3.C();
        r0 = r3.f52669K;
        r0 = r0.cI();
        r0 = r0.ordinal();
        switch(r0) {
            case 1: goto L_0x012f;
            case 2: goto L_0x00fa;
            case 3: goto L_0x0012;
            default: goto L_0x0010;
        };
    L_0x0010:
        goto L_0x015c;
    L_0x0012:
        r0 = r3.f52661C;
        r2 = 0;
        if (r0 == 0) goto L_0x00ab;
    L_0x0017:
        r0 = r3.f52671M;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x003f;
    L_0x001f:
        r0 = r3.f52660B;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x003f;
    L_0x0027:
        r0 = r3.f52666H;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x003f;
    L_0x002f:
        r1 = r3.f52665G;
        r0 = 2131691846; // 0x7f0f0946 float:1.9012775E38 double:1.0531957086E-314;
        r1 = r1.getString(r0);
        r0 = r3.f52670L;
        r3.A(r1, r0);
        goto L_0x015c;
    L_0x003f:
        r0 = r3.f52671M;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x005a;
    L_0x0047:
        r1 = r3.f52665G;
        r0 = 2131692853; // 0x7f0f0d35 float:1.9014818E38 double:1.053196206E-314;
        r1 = r1.getString(r0);
        r0 = r3.f52670L;
        r3.A(r1, r0);
        r0 = r3.f52671M;
        r3.m23835C(r0);
    L_0x005a:
        r0 = r3.f52666H;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0075;
    L_0x0062:
        r1 = r3.f52665G;
        r0 = 2131690877; // 0x7f0f057d float:1.901081E38 double:1.05319523E-314;
        r1 = r1.getString(r0);
        r0 = r3.f52670L;
        r3.A(r1, r0);
        r0 = r3.f52666H;
        r3.m23835C(r0);
    L_0x0075:
        r0 = r3.f52660B;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0092;
    L_0x007d:
        r1 = r3.f52665G;
        r0 = 2131691160; // 0x7f0f0698 float:1.9011384E38 double:1.0531953697E-314;
        r1 = r1.getString(r0);
        r0 = r3.f52670L;
        r3.A(r1, r0);
        r0 = r3.f52660B;
        r3.m23835C(r0);
        goto L_0x015c;
    L_0x0092:
        r0 = r3.f52667I;
        if (r0 == 0) goto L_0x015c;
    L_0x0096:
        r1 = r3.f52665G;
        r0 = 2131691160; // 0x7f0f0698 float:1.9011384E38 double:1.0531953697E-314;
        r1 = r1.getString(r0);
        r0 = r3.f52670L;
        r3.A(r1, r0);
        r0 = r3.f52668J;
        r3.A(r2, r0);
        goto L_0x015c;
    L_0x00ab:
        r0 = r3.f52663E;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x00c6;
    L_0x00b3:
        r1 = r3.f52665G;
        r0 = 2131692301; // 0x7f0f0b0d float:1.9013698E38 double:1.0531959334E-314;
        r1 = r1.getString(r0);
        r0 = r3.f52670L;
        r3.A(r1, r0);
        r0 = r3.f52663E;
        r3.m23835C(r0);
    L_0x00c6:
        r0 = r3.f52660B;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x00e2;
    L_0x00ce:
        r1 = r3.f52665G;
        r0 = 2131693106; // 0x7f0f0e32 float:1.901533E38 double:1.053196331E-314;
        r1 = r1.getString(r0);
        r0 = r3.f52670L;
        r3.A(r1, r0);
        r0 = r3.f52660B;
        r3.m23835C(r0);
        goto L_0x015c;
    L_0x00e2:
        r0 = r3.f52667I;
        if (r0 == 0) goto L_0x015c;
    L_0x00e6:
        r1 = r3.f52665G;
        r0 = 2131693106; // 0x7f0f0e32 float:1.901533E38 double:1.053196331E-314;
        r1 = r1.getString(r0);
        r0 = r3.f52670L;
        r3.A(r1, r0);
        r0 = r3.f52668J;
        r3.A(r2, r0);
        goto L_0x015c;
    L_0x00fa:
        r0 = r3.f52661C;
        if (r0 == 0) goto L_0x011b;
    L_0x00fe:
        r0 = r3.f52671M;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0110;
    L_0x0106:
        r0 = r3.f52666H;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0110;
    L_0x010e:
        goto L_0x002f;
    L_0x0110:
        r0 = r3.f52671M;
        r3.m23835C(r0);
        r0 = r3.f52666H;
        r3.m23835C(r0);
        goto L_0x015c;
    L_0x011b:
        r1 = r3.f52665G;
        r0 = 2131692301; // 0x7f0f0b0d float:1.9013698E38 double:1.0531959334E-314;
        r1 = r1.getString(r0);
        r0 = r3.f52670L;
        r3.A(r1, r0);
        r0 = r3.f52663E;
        r3.m23835C(r0);
        goto L_0x015c;
    L_0x012f:
        r0 = r3.f52661C;
        if (r0 == 0) goto L_0x013d;
    L_0x0133:
        r0 = r3.f52660B;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x013d;
    L_0x013b:
        goto L_0x002f;
    L_0x013d:
        r0 = r3.f52660B;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x015c;
    L_0x0145:
        r0 = r3.f52662D;
        if (r0 == 0) goto L_0x0157;
    L_0x0149:
        r1 = r3.f52665G;
        r0 = 2131693107; // 0x7f0f0e33 float:1.9015333E38 double:1.0531963316E-314;
        r1 = r1.getString(r0);
        r0 = r3.f52670L;
        r3.A(r1, r0);
    L_0x0157:
        r0 = r3.f52660B;
        r3.m23835C(r0);
    L_0x015c:
        r3.E();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.4JP.B(X.4JP):void");
    }

    /* renamed from: C */
    private void m23835C(List list) {
        AnonymousClass4K7 cI = this.f52669K.cI();
        int i = 4;
        if (AnonymousClass4JO.f52659C[cI.ordinal()] == 1) {
            i = 3;
        }
        int i2 = cI == AnonymousClass4K7.STICKER_EMOJI_AND_GIFS ? 44 : Integer.MAX_VALUE;
        int i3 = 0;
        while (i3 < list.size() && i3 <= i2) {
            B(new AnonymousClass4JJ(new AnonymousClass2MJ(list, i3, i), i), null, this.f52664F);
            i3 += i;
        }
    }

    /* renamed from: F */
    public final void m23836F() {
        this.f52661C = false;
        this.f52671M.clear();
        this.f52660B.clear();
        AnonymousClass4JP.m23834B(this);
    }

    /* renamed from: G */
    public final void m23837G(boolean z) {
        if (this.f52667I != z) {
            this.f52667I = z;
            AnonymousClass4JP.m23834B(this);
        }
    }

    /* renamed from: H */
    public final void m23838H(List list) {
        this.f52661C = true;
        this.f52666H.clear();
        this.f52671M.clear();
        for (AnonymousClass27h anonymousClass27h : list) {
            switch (anonymousClass27h.eT().ordinal()) {
                case 0:
                    this.f52671M.add(anonymousClass27h);
                    break;
                case 1:
                    this.f52666H.add(anonymousClass27h);
                    break;
                default:
                    break;
            }
        }
        AnonymousClass4JP.m23834B(this);
    }
}
