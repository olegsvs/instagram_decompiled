package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/* renamed from: X.3bK */
public abstract class AnonymousClass3bK {
    /* renamed from: B */
    public final Set f42597B = new HashSet();
    /* renamed from: C */
    public final HashSet f42598C;
    /* renamed from: D */
    public boolean f42599D;
    /* renamed from: E */
    private final Stack f42600E;
    /* renamed from: F */
    private final int f42601F;
    /* renamed from: G */
    private final int f42602G;
    /* renamed from: H */
    private final AnonymousClass0EE f42603H;
    /* renamed from: I */
    private final Set f42604I;
    /* renamed from: J */
    private final AnonymousClass0Cm f42605J;

    /* renamed from: C */
    public abstract boolean mo4658C();

    public AnonymousClass3bK(AnonymousClass0Cm anonymousClass0Cm, int i, int i2, AnonymousClass0EE anonymousClass0EE) {
        this.f42605J = anonymousClass0Cm;
        this.f42601F = i;
        this.f42602G = i2;
        this.f42604I = new HashSet();
        this.f42598C = new HashSet();
        this.f42600E = new Stack();
        this.f42603H = anonymousClass0EE;
    }

    /* renamed from: A */
    public final void m20152A(AnonymousClass0ou anonymousClass0ou, int i, int i2, AnonymousClass3bJ anonymousClass3bJ) {
        if (i >= 0 && i2 >= i) {
            List arrayList = new ArrayList();
            while (i <= i2) {
                Object YQ = anonymousClass0ou.YQ(i);
                if (YQ instanceof AnonymousClass0MI) {
                    arrayList.add((AnonymousClass0MI) YQ);
                }
                i++;
            }
            m20153B(arrayList, anonymousClass3bJ);
        }
    }

    /* renamed from: B */
    public static void m20149B(AnonymousClass3bK anonymousClass3bK, AnonymousClass3bJ anonymousClass3bJ) {
        Object obj = 1;
        Object obj2 = (!anonymousClass3bK.mo4658C() || anonymousClass3bK.f42604I.isEmpty()) ? null : 1;
        if (anonymousClass3bK.f42604I.size() < anonymousClass3bK.f42601F) {
            obj = null;
        }
        if ((obj2 != null || r3 != null) && !anonymousClass3bK.f42599D) {
            anonymousClass3bK.m20151D(anonymousClass3bJ);
        }
    }

    /* renamed from: B */
    public final void m20153B(List list, AnonymousClass3bJ anonymousClass3bJ) {
        if (!list.isEmpty()) {
            for (AnonymousClass0MI anonymousClass0MI : list) {
                if (!(anonymousClass0MI.M() || anonymousClass0MI.f3377J)) {
                    m20150C(anonymousClass0MI);
                }
            }
            AnonymousClass3bK.m20149B(this, anonymousClass3bJ);
        }
    }

    /* renamed from: C */
    private void m20150C(AnonymousClass0MI anonymousClass0MI) {
        String id = anonymousClass0MI.getId();
        if (!this.f42604I.contains(id)) {
            if (!this.f42598C.contains(id)) {
                this.f42604I.add(id);
                this.f42600E.push(id);
            }
        }
    }

    /* renamed from: D */
    private void m20151D(AnonymousClass3bJ anonymousClass3bJ) {
        if (!this.f42599D) {
            this.f42599D = true;
            this.f42598C.clear();
            List arrayList = new ArrayList();
            while (!this.f42600E.isEmpty() && this.f42598C.size() < this.f42601F) {
                String str = (String) this.f42600E.pop();
                this.f42604I.remove(str);
                this.f42598C.add(str);
                arrayList.add(str);
            }
            AnonymousClass3b8 anonymousClass41K = new AnonymousClass41K(this, anonymousClass3bJ, arrayList);
            this.f42597B.add(anonymousClass41K);
            AnonymousClass0Jd.f2931B.L(this.f42605J).G(arrayList, this.f42602G, anonymousClass41K, this.f42603H.getModuleName());
        }
    }
}
