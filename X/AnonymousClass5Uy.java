package X;

/* renamed from: X.5Uy */
public final class AnonymousClass5Uy implements AnonymousClass4aw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Uz f65122B;

    public AnonymousClass5Uy(AnonymousClass5Uz anonymousClass5Uz) {
        this.f65122B = anonymousClass5Uz;
    }

    public final void Ed() {
        AnonymousClass0EE anonymousClass0EE = this.f65122B;
        AnonymousClass0V1.L(anonymousClass0EE, "list_new_quick_reply_tap", anonymousClass0EE.f65124C.f55542B, anonymousClass0EE.f65124C.f55544D, anonymousClass0EE.f65124C.f55543C).R();
        AnonymousClass5Uz.m27114B(this.f65122B);
    }

    public final void ro(AnonymousClass4gv anonymousClass4gv) {
        AnonymousClass0EE anonymousClass0EE = this.f65122B;
        String A = anonymousClass4gv.A();
        AnonymousClass0NN L = AnonymousClass0V1.L(anonymousClass0EE, "list_item_tap", anonymousClass0EE.f65124C.f55542B, anonymousClass0EE.f65124C.f55544D, anonymousClass0EE.f65124C.f55543C);
        L.F("quick_reply_id", A);
        L.R();
        if (this.f65122B.f65125D != null) {
            this.f65122B.f65125D.f65667B.f56557B.f56607m.setText(anonymousClass4gv.f56331C);
        }
        this.f65122B.getActivity().onBackPressed();
    }
}
