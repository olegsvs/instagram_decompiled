package X;

/* renamed from: X.1ch */
public abstract class AnonymousClass1ch implements AnonymousClass1ci {
    /* renamed from: B */
    public final int f20657B;

    public final void dGA(long j) {
    }

    public AnonymousClass1ch(int i) {
        this.f20657B = i;
    }

    public final void uVA(AnonymousClass1cw anonymousClass1cw) {
        int E;
        int i;
        AnonymousClass0pB anonymousClass0pB;
        AnonymousClass0p4 anonymousClass0p4;
        if (this instanceof AnonymousClass1cj) {
            E = anonymousClass1cw.f20674B.m12173E(AnonymousClass1cy.ENTER);
            for (i = 0; i < E; i++) {
                anonymousClass0pB = (AnonymousClass0pB) anonymousClass1cw.f20674B.m12172D(AnonymousClass1cy.ENTER, i);
                if (anonymousClass0pB.m7782A(this.f20657B)) {
                    ((AnonymousClass1cj) this).so(anonymousClass1cw, anonymousClass0pB);
                }
            }
            E = anonymousClass1cw.f20675C.m12173E(AnonymousClass1cy.ENTER);
            for (i = 0; i < E; i++) {
                anonymousClass0p4 = (AnonymousClass0p4) anonymousClass1cw.f20675C.m12172D(AnonymousClass1cy.ENTER, i);
                if (anonymousClass0p4.m7782A(this.f20657B)) {
                    ((AnonymousClass1cj) this).so(anonymousClass1cw, anonymousClass0p4);
                }
            }
        }
        if (this instanceof AnonymousClass1cn) {
            E = anonymousClass1cw.f20674B.m12173E(AnonymousClass1cy.UPDATE);
            for (i = 0; i < E; i++) {
                anonymousClass0pB = (AnonymousClass0pB) anonymousClass1cw.f20674B.m12172D(AnonymousClass1cy.UPDATE, i);
                if (anonymousClass0pB.m7782A(this.f20657B)) {
                    ((AnonymousClass1cn) this).Ep(anonymousClass1cw, anonymousClass0pB);
                }
            }
            E = anonymousClass1cw.f20675C.m12173E(AnonymousClass1cy.UPDATE);
            for (i = 0; i < E; i++) {
                anonymousClass0p4 = (AnonymousClass0p4) anonymousClass1cw.f20675C.m12172D(AnonymousClass1cy.UPDATE, i);
                if (anonymousClass0p4.m7782A(this.f20657B)) {
                    ((AnonymousClass1cn) this).Ep(anonymousClass1cw, anonymousClass0p4);
                }
            }
        }
        if (this instanceof AnonymousClass1cm) {
            E = anonymousClass1cw.f20674B.m12173E(AnonymousClass1cy.EXIT);
            for (i = 0; i < E; i++) {
                anonymousClass0pB = (AnonymousClass0pB) anonymousClass1cw.f20674B.m12172D(AnonymousClass1cy.EXIT, i);
                if (anonymousClass0pB.m7782A(this.f20657B)) {
                    ((AnonymousClass1cm) this).to(anonymousClass1cw, anonymousClass0pB);
                }
            }
            i = anonymousClass1cw.f20675C.m12173E(AnonymousClass1cy.EXIT);
            for (int i2 = 0; i2 < i; i2++) {
                anonymousClass0p4 = (AnonymousClass0p4) anonymousClass1cw.f20675C.m12172D(AnonymousClass1cy.EXIT, i2);
                if (anonymousClass0p4.m7782A(this.f20657B)) {
                    ((AnonymousClass1cm) this).to(anonymousClass1cw, anonymousClass0p4);
                }
            }
        }
    }
}
