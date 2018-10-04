package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1YV */
public final class AnonymousClass1YV extends AnonymousClass0wR {
    /* renamed from: B */
    public final AnonymousClass1gf f20029B;
    /* renamed from: C */
    public final AnonymousClass0Ie f20030C;
    /* renamed from: D */
    public final AnonymousClass0jC f20031D;
    /* renamed from: E */
    public final Set f20032E = new HashSet();
    /* renamed from: F */
    private final AnonymousClass1bW f20033F;

    public AnonymousClass1YV(AnonymousClass0Ie anonymousClass0Ie, AnonymousClass1bW anonymousClass1bW, AnonymousClass1gf anonymousClass1gf, AnonymousClass0jC anonymousClass0jC) {
        this.f20030C = anonymousClass0Ie;
        this.f20033F = anonymousClass1bW;
        this.f20029B = anonymousClass1gf;
        this.f20031D = anonymousClass0jC;
    }

    public final Class WT() {
        return AnonymousClass2MJ.class;
    }

    public final /* bridge */ /* synthetic */ void Xc(Object obj) {
        AnonymousClass2MJ anonymousClass2MJ = (AnonymousClass2MJ) obj;
        for (int i = 0; i < anonymousClass2MJ.C(); i++) {
            Object A = anonymousClass2MJ.A(i);
            if (A instanceof AnonymousClass0P7) {
                AnonymousClass0jC anonymousClass0jC = this.f20031D;
                if (anonymousClass0jC != null) {
                    anonymousClass0jC.m7082E(this.f20030C.getContext(), (AnonymousClass0P7) A);
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ void ac(Object obj, int i) {
        AnonymousClass2MJ anonymousClass2MJ = (AnonymousClass2MJ) obj;
        for (int i2 = 0; i2 < anonymousClass2MJ.C(); i2++) {
            Object A = anonymousClass2MJ.A(i2);
            if (A instanceof AnonymousClass0P7) {
                AnonymousClass0P7 anonymousClass0P7 = (AnonymousClass0P7) A;
                if (this.f20031D != null) {
                    AnonymousClass0Ls y = anonymousClass0P7.m3795y(this.f20030C.getContext());
                    this.f20031D.m7081D(anonymousClass0P7, y.f3292C, y.f3296G, false);
                }
                String id = anonymousClass0P7.getId();
                if (!this.f20032E.contains(id)) {
                    this.f20032E.add(id);
                    this.f20029B.xo(anonymousClass0P7, i, i2);
                }
            }
        }
    }

    public final void rWA(AnonymousClass0wM anonymousClass0wM, int i) {
        AnonymousClass2MJ anonymousClass2MJ = (AnonymousClass2MJ) this.f20033F.getItem(i);
        anonymousClass0wM.tWA(anonymousClass2MJ.B(), anonymousClass2MJ, this.f20033F.LO(anonymousClass2MJ.B()).f19896D);
    }
}
