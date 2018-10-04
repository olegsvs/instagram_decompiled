package X;

/* renamed from: X.6FO */
public final class AnonymousClass6FO implements AnonymousClass64L {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6FM f73413B;
    /* renamed from: C */
    public final /* synthetic */ int f73414C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0MI f73415D;

    public AnonymousClass6FO(AnonymousClass6FM anonymousClass6FM, AnonymousClass0MI anonymousClass0MI, int i) {
        this.f73413B = anonymousClass6FM;
        this.f73415D = anonymousClass0MI;
        this.f73414C = i;
    }

    public final void Cw() {
        AnonymousClass6FM anonymousClass6FM = this.f73413B;
        AnonymousClass0MI anonymousClass0MI = this.f73415D;
        int i = this.f73414C;
        AnonymousClass0EE anonymousClass0EE = anonymousClass6FM.f73403B.f18647D;
        AnonymousClass0Pj anonymousClass0Pj = anonymousClass6FM.f73403B.f18648E;
        AnonymousClass0NN.B("ig_live_suggested_live_click", anonymousClass0EE).F("a_pk", anonymousClass0Pj.f4138J.getId()).F("m_pk", anonymousClass0Pj.f4131C.f4162P).F("suggested_a_pk", anonymousClass0MI.f3385R.getId()).F("suggested_m_pk", AnonymousClass63u.m28851B(anonymousClass0MI)).B("live_position", i).B("suggested_live_count", 3).H("is_post_live", anonymousClass0MI.R()).R();
        AnonymousClass0Qg anonymousClass0Qg = anonymousClass6FM.f73403B.f18646C;
        AnonymousClass5Op.m26413B(anonymousClass0Qg.f4413H.getActivity(), anonymousClass0MI, anonymousClass6FM.f73404C, AnonymousClass0Qf.SUGGESTED_LIVE, anonymousClass0Qg.f4431Z, i, null);
        anonymousClass0Qg.f4411F.f4314K = true;
    }
}
