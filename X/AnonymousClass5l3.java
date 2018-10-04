package X;

/* renamed from: X.5l3 */
public final class AnonymousClass5l3 implements AnonymousClass3kQ {
    /* renamed from: B */
    public long f68739B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass1W6 f68740C;

    public final void Bu() {
    }

    public AnonymousClass5l3(AnonymousClass1W6 anonymousClass1W6) {
        this.f68740C = anonymousClass1W6;
    }

    public final void Cu() {
        this.f68739B = System.currentTimeMillis();
        AnonymousClass0EE anonymousClass0EE = this.f68740C.f19437F;
        String kR = this.f68740C.f19439H.kR();
        AnonymousClass0NN.B("visit_explore_tooltip_impression", anonymousClass0EE).F("session_id", kR).B("m_ix", this.f68740C.f19435D).R();
    }

    public final void hf() {
        long currentTimeMillis = System.currentTimeMillis() - this.f68739B;
        AnonymousClass0EE anonymousClass0EE = this.f68740C.f19437F;
        String kR = this.f68740C.f19439H.kR();
        int i = this.f68740C.f19435D;
        double d = (double) currentTimeMillis;
        Double.isNaN(d);
        AnonymousClass0NN.B("visit_explore_tooltip_dismiss", anonymousClass0EE).F("session_id", kR).B("m_ix", i).A("display_duration", d / 1000.0d).R();
        AnonymousClass1W6.B(this.f68740C);
    }
}
