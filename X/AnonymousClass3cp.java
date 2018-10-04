package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.3cp */
public final class AnonymousClass3cp extends AnonymousClass0wR {
    /* renamed from: B */
    public final AnonymousClass5yf f42788B;
    /* renamed from: C */
    public final AnonymousClass0Ie f42789C;
    /* renamed from: D */
    public final AnonymousClass0jC f42790D;
    /* renamed from: E */
    public final Set f42791E = new HashSet();
    /* renamed from: F */
    private final AnonymousClass1bW f42792F;

    public AnonymousClass3cp(AnonymousClass0Ie anonymousClass0Ie, AnonymousClass1bW anonymousClass1bW, AnonymousClass5yf anonymousClass5yf, AnonymousClass0jC anonymousClass0jC) {
        this.f42789C = anonymousClass0Ie;
        this.f42792F = anonymousClass1bW;
        this.f42788B = anonymousClass5yf;
        this.f42790D = anonymousClass0jC;
    }

    /* renamed from: A */
    public final void m20209A(X.AnonymousClass2MJ r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r3 = 0;
    L_0x0001:
        r0 = r5.m15208C();
        if (r3 >= r0) goto L_0x0024;
    L_0x0007:
        r1 = r5.m15206A(r3);	 Catch:{ IndexOutOfBoundsException -> 0x0023 }
        r0 = r1 instanceof X.AnonymousClass3dS;
        if (r0 == 0) goto L_0x0020;
    L_0x000f:
        r1 = (X.AnonymousClass3dS) r1;
        r2 = r1.f42896B;
        if (r2 == 0) goto L_0x0020;
    L_0x0015:
        r1 = r4.f42790D;
        r0 = r4.f42789C;
        r0 = r0.getContext();
        r1.E(r0, r2);
    L_0x0020:
        r3 = r3 + 1;
        goto L_0x0001;
    L_0x0023:
        return;
    L_0x0024:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3cp.A(X.2MJ):void");
    }

    public final Class WT() {
        return AnonymousClass2MJ.class;
    }

    public final /* bridge */ /* synthetic */ void Xc(Object obj) {
        m20209A((AnonymousClass2MJ) obj);
    }

    public final /* bridge */ /* synthetic */ void ac(Object obj, int i) {
        AnonymousClass2MJ anonymousClass2MJ = (AnonymousClass2MJ) obj;
        for (int i2 = 0; i2 < anonymousClass2MJ.m15208C(); i2++) {
            Object A = anonymousClass2MJ.m15206A(i2);
            if (A instanceof AnonymousClass3dS) {
                AnonymousClass3dS anonymousClass3dS = (AnonymousClass3dS) A;
                AnonymousClass0P7 anonymousClass0P7 = anonymousClass3dS.f42896B;
                if (anonymousClass0P7 != null) {
                    AnonymousClass0Ls y = anonymousClass0P7.y(this.f42789C.getContext());
                    this.f42790D.D(anonymousClass0P7, y.f3292C, y.f3296G, false);
                }
                String id = anonymousClass3dS.f42896B.getId();
                if (!this.f42791E.contains(id)) {
                    this.f42791E.add(id);
                    this.f42788B.B(anonymousClass3dS, i, i2);
                }
            }
        }
    }

    public final void rWA(AnonymousClass0wM anonymousClass0wM, int i) {
        AnonymousClass2MJ anonymousClass2MJ = (AnonymousClass2MJ) this.f42792F.getItem(i);
        anonymousClass0wM.tWA(anonymousClass2MJ.m15207B(), anonymousClass2MJ, this.f42792F.LO(anonymousClass2MJ.m15207B()).f19896D);
    }
}
