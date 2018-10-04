package X;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.facebook.C0164R;
import java.util.List;
import java.util.Map;

/* renamed from: X.1d0 */
public final class AnonymousClass1d0 implements OnPreDrawListener {
    /* renamed from: B */
    public AnonymousClass0fQ f20687B;
    /* renamed from: C */
    public long f20688C = 0;
    /* renamed from: D */
    public final AnonymousClass1bz f20689D;
    /* renamed from: E */
    public List f20690E;
    /* renamed from: F */
    private AnonymousClass1cg f20691F;

    public AnonymousClass1d0(List list, AnonymousClass0fQ anonymousClass0fQ, AnonymousClass1cg anonymousClass1cg, AnonymousClass1YI anonymousClass1YI) {
        this.f20690E = list;
        this.f20687B = anonymousClass0fQ;
        this.f20691F = anonymousClass1cg;
        this.f20689D = new AnonymousClass1bz(this.f20691F, anonymousClass1YI);
    }

    public final boolean onPreDraw() {
        AnonymousClass1d0 anonymousClass1d0 = this;
        long now = this.f20687B.now();
        if (now - this.f20688C > 100) {
            AnonymousClass1cz anonymousClass1cz;
            AnonymousClass1cy anonymousClass1cy;
            AnonymousClass0pB anonymousClass0pB;
            AnonymousClass0p5 anonymousClass0p5;
            AnonymousClass0p5 anonymousClass0p52;
            this.f20688C = now;
            AnonymousClass1bz anonymousClass1bz = this.f20689D;
            long j = this.f20688C;
            anonymousClass1bz.f20540B.clear();
            AnonymousClass1cw anonymousClass1cw = anonymousClass1bz.f20542D;
            Map map = anonymousClass1bz.f20540B;
            int i = 0;
            int i2 = 0;
            while (true) {
                anonymousClass1cz = anonymousClass1cw.f20674B;
                anonymousClass1cy = AnonymousClass1cy.ENTER;
                if (i2 >= anonymousClass1cz.m12173E(anonymousClass1cy)) {
                    break;
                }
                anonymousClass0pB = (AnonymousClass0pB) anonymousClass1cw.f20674B.m12172D(anonymousClass1cy, i2);
                map.put(anonymousClass0pB.f10475B, anonymousClass0pB);
                i2++;
            }
            while (true) {
                anonymousClass1cz = anonymousClass1cw.f20674B;
                anonymousClass1cy = AnonymousClass1cy.UPDATE;
                if (i >= anonymousClass1cz.m12173E(anonymousClass1cy)) {
                    break;
                }
                anonymousClass0pB = (AnonymousClass0pB) anonymousClass1cw.f20674B.m12172D(anonymousClass1cy, i);
                map.put(anonymousClass0pB.f10475B, anonymousClass0pB);
                i++;
            }
            AnonymousClass1cw anonymousClass1cw2 = anonymousClass1bz.f20542D;
            anonymousClass1cw2.f20674B.m12177I();
            AnonymousClass1cz anonymousClass1cz2 = anonymousClass1cw2.f20674B;
            anonymousClass1cz2.f20682B.clear();
            anonymousClass1cz2.f20684D = 0;
            anonymousClass1cz2.f20685E = 0;
            anonymousClass1cz2.f20683C = 0;
            anonymousClass1cw2.f20675C.m12177I();
            anonymousClass1cz2 = anonymousClass1cw2.f20675C;
            anonymousClass1cz2.f20682B.clear();
            anonymousClass1cz2.f20684D = 0;
            anonymousClass1cz2.f20685E = 0;
            anonymousClass1cz2.f20683C = 0;
            anonymousClass1bz.f20542D.f20677E = j;
            int AM = anonymousClass1bz.f20541C.AM();
            int iN = anonymousClass1bz.f20541C.iN();
            if (AM != -1) {
                while (AM <= iN) {
                    View gH = anonymousClass1bz.f20541C.gH(AM);
                    if (gH != null) {
                        Object tag = gH.getTag(C0164R.id.model_state_action_holder);
                        anonymousClass0p5 = tag != null ? (AnonymousClass0pB) tag : AnonymousClass0pB.f10509E;
                        if (anonymousClass0p5 != AnonymousClass0pB.f10509E) {
                            AnonymousClass1bz.m12029B(anonymousClass1bz, anonymousClass0p5, j);
                            int C = AnonymousClass1bz.m12030C(anonymousClass1bz, anonymousClass0p5, gH);
                            int D = AnonymousClass1bz.m12031D(anonymousClass1bz, anonymousClass0p5, gH);
                            for (AnonymousClass0p5 anonymousClass0p53 : anonymousClass0p53.f10510B.rR(anonymousClass0p53.f10476C, anonymousClass0p53.f10478E)) {
                                AnonymousClass1bz.m12029B(anonymousClass1bz, anonymousClass0p53, j);
                                if (anonymousClass0p53.f10477D) {
                                    AnonymousClass0LH.m2931I(C != -1, "Sibling container must requireVisiblePxCalculation");
                                    anonymousClass1bz.f20542D.f20674B.m12178J(anonymousClass0p53, C);
                                    anonymousClass1bz.f20542D.f20674B.m12179K(anonymousClass0p53, D);
                                }
                            }
                        }
                    }
                    AM++;
                }
            }
            for (AnonymousClass0pB anonymousClass0pB2 : anonymousClass1bz.f20540B.values()) {
                AnonymousClass1cz anonymousClass1cz3 = anonymousClass1bz.f20542D.f20674B;
                anonymousClass1cz3.f20682B.add(anonymousClass0pB2);
                anonymousClass1cz3.f20684D++;
                if (anonymousClass0pB2.f10477D) {
                    anonymousClass1bz.f20542D.f20674B.m12178J(anonymousClass0pB2, 0);
                    anonymousClass1bz.f20542D.f20674B.m12179K(anonymousClass0pB2, 0);
                }
            }
            AnonymousClass1cw anonymousClass1cw3 = anonymousClass1bz.f20542D;
            anonymousClass1cw3.f20676D.clear();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                anonymousClass1cz = anonymousClass1cw3.f20674B;
                anonymousClass1cy = AnonymousClass1cy.UPDATE;
                if (i4 >= anonymousClass1cz.m12173E(anonymousClass1cy)) {
                    break;
                }
                AnonymousClass0pB anonymousClass0pB3 = (AnonymousClass0pB) anonymousClass1cw3.f20674B.m12172D(anonymousClass1cy, i4);
                anonymousClass0p52 = anonymousClass0pB3.f10511C;
                if (anonymousClass0p52 != null) {
                    if (anonymousClass1cw3.f20676D.add(anonymousClass0p52.f10475B)) {
                        anonymousClass1cw3.f20675C.m12170B(anonymousClass0p52);
                        AnonymousClass1cw.m12161B(anonymousClass1cw3, anonymousClass0p52);
                        AnonymousClass1cw.m12162C(anonymousClass1cw3, anonymousClass0p52);
                    }
                    AnonymousClass1cw.m12163D(anonymousClass1cw3, anonymousClass0pB3, anonymousClass0p52);
                    AnonymousClass1cw.m12164E(anonymousClass1cw3, anonymousClass0pB3, anonymousClass0p52);
                }
                i4++;
            }
            i2 = 0;
            while (true) {
                anonymousClass1cz = anonymousClass1cw3.f20674B;
                anonymousClass1cy = AnonymousClass1cy.ENTER;
                if (i2 >= anonymousClass1cz.m12173E(anonymousClass1cy)) {
                    break;
                }
                AnonymousClass0pB anonymousClass0pB4 = (AnonymousClass0pB) anonymousClass1cw3.f20674B.m12172D(anonymousClass1cy, i2);
                anonymousClass0p53 = anonymousClass0pB4.f10511C;
                if (anonymousClass0p53 != null) {
                    if (anonymousClass1cw3.f20676D.add(anonymousClass0p53.f10475B)) {
                        anonymousClass1cw3.f20675C.m12169A(anonymousClass0p53, anonymousClass1cw3.f20677E);
                        AnonymousClass1cw.m12161B(anonymousClass1cw3, anonymousClass0p53);
                        AnonymousClass1cw.m12162C(anonymousClass1cw3, anonymousClass0p53);
                    }
                    AnonymousClass1cw.m12163D(anonymousClass1cw3, anonymousClass0pB4, anonymousClass0p53);
                    AnonymousClass1cw.m12164E(anonymousClass1cw3, anonymousClass0pB4, anonymousClass0p53);
                }
                i2++;
            }
            while (true) {
                anonymousClass1cz = anonymousClass1cw3.f20674B;
                anonymousClass1cy = AnonymousClass1cy.EXIT;
                if (i3 >= anonymousClass1cz.m12173E(anonymousClass1cy)) {
                    break;
                }
                anonymousClass0p52 = ((AnonymousClass0pB) anonymousClass1cw3.f20674B.m12172D(anonymousClass1cy, i3)).f10511C;
                if (anonymousClass0p52 != null && anonymousClass1cw3.f20676D.add(anonymousClass0p52.f10475B)) {
                    anonymousClass1cz2 = anonymousClass1cw3.f20675C;
                    anonymousClass1cz2.f20682B.add(anonymousClass0p52);
                    anonymousClass1cz2.f20684D++;
                    AnonymousClass1cw.m12161B(anonymousClass1cw3, anonymousClass0p52);
                    AnonymousClass1cw.m12162C(anonymousClass1cw3, anonymousClass0p52);
                }
                i3++;
            }
            anonymousClass1cw2 = anonymousClass1bz.f20542D;
            for (AnonymousClass1ci uVA : anonymousClass1d0.f20690E) {
                uVA.uVA(anonymousClass1cw2);
            }
        }
        return true;
    }
}
