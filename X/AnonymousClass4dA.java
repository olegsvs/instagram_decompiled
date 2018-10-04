package X;

import java.util.List;

/* renamed from: X.4dA */
public final class AnonymousClass4dA implements AnonymousClass0VB {
    /* renamed from: B */
    public final AnonymousClass0EE f55820B;
    /* renamed from: C */
    public final AnonymousClass3e1 f55821C;
    /* renamed from: D */
    public final AnonymousClass0Cm f55822D;
    /* renamed from: E */
    private final AnonymousClass0Uc f55823E;
    /* renamed from: F */
    private AnonymousClass5Vn f55824F;

    public AnonymousClass4dA(AnonymousClass0EE anonymousClass0EE, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass3e1 anonymousClass3e1, AnonymousClass0Uc anonymousClass0Uc, String str) {
        this.f55820B = anonymousClass0EE;
        this.f55822D = anonymousClass0Cm;
        this.f55823E = anonymousClass0Uc;
        this.f55821C = anonymousClass3e1;
    }

    /* renamed from: A */
    public final void m24610A(AnonymousClass5Vn anonymousClass5Vn) {
        this.f55824F = anonymousClass5Vn;
        if (anonymousClass5Vn == null) {
            this.f55821C.EPA(null);
        } else {
            this.f55821C.EPA(this);
        }
    }

    public final void Pv(AnonymousClass3e1 anonymousClass3e1) {
        AnonymousClass5Vn anonymousClass5Vn = this.f55824F;
        if (anonymousClass5Vn != null) {
            List list;
            AnonymousClass5Vo anonymousClass5Vo;
            String LQ = anonymousClass3e1.LQ();
            boolean uX = anonymousClass3e1.uX();
            boolean UX = anonymousClass3e1.UX();
            AnonymousClass5Vo anonymousClass5Vo2 = anonymousClass5Vn.f65427C;
            if (!uX) {
                if (!UX) {
                    uX = false;
                    AnonymousClass5Vo.B(anonymousClass5Vo2).R(LQ, uX, UX);
                    if (this.f55821C.LQ().isEmpty()) {
                        list = ((AnonymousClass1St) this.f55821C.uQ()).f18851B;
                    } else {
                        list = (List) this.f55823E.C().f2727B;
                    }
                    anonymousClass5Vn = this.f55824F;
                    anonymousClass5Vo = anonymousClass5Vn.f65427C;
                    AnonymousClass5Vo.B(anonymousClass5Vo).Q(list, anonymousClass5Vn.f65426B.f55821C.LQ().isEmpty());
                }
            }
            uX = true;
            AnonymousClass5Vo.B(anonymousClass5Vo2).R(LQ, uX, UX);
            if (this.f55821C.LQ().isEmpty()) {
                list = ((AnonymousClass1St) this.f55821C.uQ()).f18851B;
            } else {
                list = (List) this.f55823E.C().f2727B;
            }
            anonymousClass5Vn = this.f55824F;
            anonymousClass5Vo = anonymousClass5Vn.f65427C;
            AnonymousClass5Vo.B(anonymousClass5Vo).Q(list, anonymousClass5Vn.f65426B.f55821C.LQ().isEmpty());
        }
    }
}
