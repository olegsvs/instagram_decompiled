package X;

import java.util.LinkedList;
import java.util.List;

/* renamed from: X.4aI */
public final class AnonymousClass4aI implements AnonymousClass0Qc {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4aJ f55481B;

    public AnonymousClass4aI(AnonymousClass4aJ anonymousClass4aJ) {
        this.f55481B = anonymousClass4aJ;
    }

    /* renamed from: A */
    public final boolean m24519A(AnonymousClass3aW anonymousClass3aW) {
        AnonymousClass5Ur anonymousClass5Ur = this.f55481B.f55483C;
        int hN = anonymousClass5Ur.f65094B.f14925N.hN();
        List<AnonymousClass0Vw> linkedList = new LinkedList();
        for (int zL = anonymousClass5Ur.f65094B.f14925N.zL(); zL <= hN; zL++) {
            Object item = anonymousClass5Ur.f65094B.f14913B.getItem(zL);
            if (item instanceof AnonymousClass0Vw) {
                linkedList.add((AnonymousClass0Vw) item);
            }
        }
        for (AnonymousClass0Vw J : linkedList) {
            if (AnonymousClass0X7.E(anonymousClass3aW.f42460C, J.J())) {
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean RB(AnonymousClass0F6 anonymousClass0F6) {
        return m24519A((AnonymousClass3aW) anonymousClass0F6);
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.I(this, -27923999);
        AnonymousClass3aW anonymousClass3aW = (AnonymousClass3aW) anonymousClass0F6;
        int I2 = AnonymousClass0cQ.I(this, -1936690698);
        this.f55481B.f55482B.m14436A(anonymousClass3aW);
        AnonymousClass0cQ.H(this, -1522203408, I2);
        AnonymousClass0cQ.H(this, -1477724094, I);
    }
}
