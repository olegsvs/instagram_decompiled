package X;

/* renamed from: X.39V */
public final class AnonymousClass39V {
    /* renamed from: B */
    public static AnonymousClass45n m18773B(AnonymousClass3yE anonymousClass3yE, String str) {
        if (anonymousClass3yE instanceof AnonymousClass396) {
            AnonymousClass396 anonymousClass396 = (AnonymousClass396) anonymousClass3yE;
            if (!AnonymousClass26g.m14458B(anonymousClass396.JI())) {
                AnonymousClass39T anonymousClass39T = new AnonymousClass39T();
                anonymousClass39T.f38412B = anonymousClass396.JI();
                anonymousClass39T.f38414D = ((AnonymousClass397) anonymousClass3yE).sN();
                anonymousClass39T.f38413C = anonymousClass3yE.getId();
                anonymousClass39T.f38416F = str;
                if (anonymousClass3yE.dT() == AnonymousClass399.f38318E) {
                    anonymousClass39T.f38417G = anonymousClass3yE.QS();
                }
                return new AnonymousClass45n(anonymousClass39T);
            }
        }
        return null;
    }

    /* renamed from: C */
    public static AnonymousClass44d m18774C(AnonymousClass2XD anonymousClass2XD) {
        if (!AnonymousClass39K.m18763F(anonymousClass2XD, AnonymousClass2Br.FOOTER)) {
            return null;
        }
        return new AnonymousClass460(new AnonymousClass3yH(((AnonymousClass2XA) anonymousClass2XD.f31155B.f31153C.f31151B.get(anonymousClass2XD.f31155B.f31153C.f31151B.size() - 1)).f31150B));
    }

    /* renamed from: D */
    public static AnonymousClass45n m18775D(AnonymousClass45m anonymousClass45m) {
        AnonymousClass3yC anonymousClass3yC = anonymousClass45m.f50006B;
        for (int i = 0; i < anonymousClass3yC.m21794C(); i++) {
            AnonymousClass3yE B = anonymousClass3yC.m21793B(i);
            if (B instanceof AnonymousClass396) {
                AnonymousClass396 anonymousClass396 = (AnonymousClass396) B;
                if (!AnonymousClass26g.m14458B(anonymousClass396.JI())) {
                    AnonymousClass39T anonymousClass39T = new AnonymousClass39T();
                    anonymousClass39T.f38412B = anonymousClass396.JI();
                    anonymousClass39T.f38413C = anonymousClass45m.getId();
                    anonymousClass39T.f38415E = anonymousClass3yC;
                    anonymousClass39T.f38414D = anonymousClass45m.sN();
                    anonymousClass39T.f38416F = "slideshow";
                    return new AnonymousClass45n(anonymousClass39T);
                }
            }
        }
        return null;
    }
}
