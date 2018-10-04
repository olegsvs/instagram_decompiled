package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4nE */
public final class AnonymousClass4nE implements AnonymousClass0nn {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4nF f57303B;

    public final void Hr(AnonymousClass0fq anonymousClass0fq) {
    }

    public final void Ir() {
    }

    public AnonymousClass4nE(AnonymousClass4nF anonymousClass4nF) {
        this.f57303B = anonymousClass4nF;
    }

    public final void Gr(AnonymousClass0Q6 anonymousClass0Q6) {
        AnonymousClass0rF.B(this.f57303B.f57304B.f65772B.f57338B, -954290130);
    }

    public final void Jr() {
        AnonymousClass0rF.B(this.f57303B.f57304B.f65772B.f57338B, 742834218);
    }

    public final /* bridge */ /* synthetic */ void Kr(AnonymousClass0Pn anonymousClass0Pn) {
        AnonymousClass4nG anonymousClass4nG = (AnonymousClass4nG) anonymousClass0Pn;
        this.f57303B.f57306D = anonymousClass4nG.f57312D;
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        int i = 0;
        for (AnonymousClass0fH anonymousClass0fH : anonymousClass4nG.f57311C) {
            switch (anonymousClass0fH.f7894J.ordinal()) {
                case 0:
                    arrayList.add(anonymousClass0fH.B());
                    if (!anonymousClass0fH.B().eA()) {
                        break;
                    }
                    arrayList2.add(anonymousClass0fH.B());
                    if (i >= this.f57303B.f57308F) {
                        break;
                    }
                    this.f57303B.f57307E.B(AnonymousClass0nS.FEED, anonymousClass0fH.B(), false);
                    i++;
                    break;
                case 3:
                case 5:
                case 9:
                    AnonymousClass0ly D = anonymousClass0fH.D();
                    arrayList.add(D);
                    if (i < this.f57303B.f57308F && !D.F()) {
                        this.f57303B.f57307E.A(D.f9626D, 0);
                        i++;
                        break;
                    }
                case 32:
                    arrayList.add(anonymousClass0fH.f7897M);
                    break;
                case 33:
                    arrayList.add(anonymousClass0fH.f7901Q);
                    break;
                default:
                    break;
            }
        }
        if (this.f57303B.f57309G) {
            AnonymousClass0jO anonymousClass0jO = this.f57303B.f57307E;
            AnonymousClass0nc anonymousClass1WA = new AnonymousClass1WA(anonymousClass0jO);
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                AnonymousClass0P7 anonymousClass0P7 = (AnonymousClass0P7) arrayList2.get(i2);
                if (anonymousClass0P7.eA()) {
                    AnonymousClass0jO.D(anonymousClass0jO, AnonymousClass0nS.FEED, anonymousClass0P7, 0, false, anonymousClass1WA);
                }
            }
            AnonymousClass0jO.B(anonymousClass0jO);
        }
        AnonymousClass5XB anonymousClass5XB = this.f57303B.f57304B;
        String oO = anonymousClass4nG.oO();
        anonymousClass5XB.f65772B.f57338B.m25086F(arrayList);
        anonymousClass5XB.f65772B.f57343G.A();
        anonymousClass5XB.f65772B.f57340D.sl(arrayList, oO);
    }

    public final void Lr(AnonymousClass0Pn anonymousClass0Pn) {
        AnonymousClass4nG anonymousClass4nG = (AnonymousClass4nG) anonymousClass0Pn;
    }
}
