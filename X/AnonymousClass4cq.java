package X;

import java.util.List;

/* renamed from: X.4cq */
public final class AnonymousClass4cq implements AnonymousClass0GA {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4cr f55779B;
    /* renamed from: C */
    private final List f55780C;
    /* renamed from: D */
    private volatile List f55781D;
    /* renamed from: E */
    private final List f55782E;
    /* renamed from: F */
    private final AnonymousClass4gQ f55783F;
    /* renamed from: G */
    private final List f55784G;
    /* renamed from: H */
    private volatile List f55785H;

    public final String getName() {
        return "UpdateThreadRowsTask";
    }

    public final void onStart() {
    }

    public AnonymousClass4cq(AnonymousClass4cr anonymousClass4cr, AnonymousClass4gQ anonymousClass4gQ, List list, List list2, List list3) {
        this.f55779B = anonymousClass4cr;
        this.f55783F = anonymousClass4gQ;
        this.f55780C = list;
        this.f55782E = list2;
        this.f55784G = list3;
    }

    public final void onFinish() {
        AnonymousClass4cr anonymousClass4cr = this.f55779B;
        anonymousClass4cr.f55788D--;
        if (!this.f55779B.f55787C) {
            AnonymousClass5VY anonymousClass5VY = this.f55779B.f55786B;
            AnonymousClass5VY.J(anonymousClass5VY, this.f55783F, this.f55781D, this.f55782E, this.f55785H);
            AnonymousClass0eT.D(AnonymousClass5VY.B(anonymousClass5VY));
            AnonymousClass5VY.F(anonymousClass5VY);
        }
    }

    public final void run() {
        this.f55785H = this.f55779B.f55786B.j(this.f55783F, this.f55784G);
        this.f55781D = this.f55779B.f55786B.j(this.f55783F, this.f55780C);
    }
}
