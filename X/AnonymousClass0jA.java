package X;

import android.content.Context;

/* renamed from: X.0jA */
public final class AnonymousClass0jA implements AnonymousClass0jB {
    /* renamed from: B */
    public final AnonymousClass0EE f9048B;
    /* renamed from: C */
    public final Context f9049C;
    /* renamed from: D */
    public final AnonymousClass0Ie f9050D;
    /* renamed from: E */
    public AnonymousClass0jz f9051E;
    /* renamed from: F */
    private final AnonymousClass0Cm f9052F;

    public final void Nm(Object obj, Object obj2) {
    }

    public AnonymousClass0jA(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ie anonymousClass0Ie, AnonymousClass0EE anonymousClass0EE) {
        this.f9049C = context;
        this.f9052F = anonymousClass0Cm;
        this.f9050D = anonymousClass0Ie;
        this.f9048B = anonymousClass0EE;
    }

    /* renamed from: B */
    public static void m7073B(AnonymousClass0jA anonymousClass0jA, AnonymousClass0mt anonymousClass0mt) {
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass0jA.f9050D.getActivity());
        anonymousClass0IZ.f2754D = AnonymousClass0Jj.f2938B.mo659B().m4355D(AnonymousClass0bx.m5660C(anonymousClass0jA.f9052F, anonymousClass0mt.f9928H.getId(), "feed_survey").m5662A());
        anonymousClass0IZ.f2753C = "survey_owner";
        anonymousClass0IZ.m2308B();
    }

    /* renamed from: C */
    public static void m7074C(AnonymousClass0jA anonymousClass0jA, AnonymousClass0mt anonymousClass0mt, AnonymousClass0mu anonymousClass0mu) {
        new AnonymousClass0ms(anonymousClass0mt, anonymousClass0mu).m7570B(anonymousClass0jA.f9050D.getListView(), AnonymousClass0iW.m6908D(anonymousClass0jA.f9050D) ? ((AnonymousClass0Pb) anonymousClass0jA.f9050D).iM() : null, anonymousClass0jA.f9051E);
    }

    public final void Pm(Object obj, Object obj2) {
        AnonymousClass0mu anonymousClass0mu = (AnonymousClass0mu) obj2;
        AnonymousClass0mt anonymousClass0mt = (AnonymousClass0mt) obj;
        anonymousClass0mu.f9931B = AnonymousClass0mv.FINISHED;
        AnonymousClass0EE anonymousClass0EE = this.f9048B;
        AnonymousClass0mw A = anonymousClass0mt.m7571A();
        AnonymousClass0bP G = AnonymousClass0bN.m5543G(AnonymousClass0mx.m7576B("survey_question_response"), (AnonymousClass0PZ) anonymousClass0EE);
        G.EE = anonymousClass0mt.YT();
        G.uC = A.f9942F;
        G.WD = A.m7573B();
        G.fD = anonymousClass0mt.nL().toString();
        AnonymousClass0bN.m5568f(G.m5577B(), AnonymousClass0dd.LOW);
        AnonymousClass0jA.m7074C(this, anonymousClass0mt, anonymousClass0mu);
    }
}
