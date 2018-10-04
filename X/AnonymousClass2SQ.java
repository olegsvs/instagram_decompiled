package X;

/* renamed from: X.2SQ */
public final class AnonymousClass2SQ implements AnonymousClass21o {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2SS f30563B;
    /* renamed from: C */
    public final /* synthetic */ int f30564C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass1yN f30565D;

    public AnonymousClass2SQ(AnonymousClass2SS anonymousClass2SS, int i, AnonymousClass1yN anonymousClass1yN) {
        this.f30563B = anonymousClass2SS;
        this.f30564C = i;
        this.f30565D = anonymousClass1yN;
    }

    public final void Hh(AnonymousClass21r anonymousClass21r) {
        int i = 0;
        if (anonymousClass21r.mo3157E()) {
            if (this.f30563B.f30568C != null) {
                this.f30563B.f30568C.mo3349D(this.f30564C, ((Integer) anonymousClass21r.mo3156D()).intValue());
            }
            if (((Integer) anonymousClass21r.mo3156D()).equals(Integer.valueOf(0))) {
                if (this.f30563B.f30568C != null) {
                    this.f30563B.f30568C.mo3346A(this.f30564C, 1, 0);
                }
                this.f30565D.m13950B(Integer.valueOf(1));
                return;
            }
            synchronized (this.f30563B) {
                this.f30563B.f30569D.put(anonymousClass21r.mo3156D(), new AnonymousClass1yX(this.f30564C, this.f30565D));
            }
            return;
        }
        if (this.f30563B.f30568C != null) {
            if (anonymousClass21r.mo3155C() != null && (anonymousClass21r.mo3155C() instanceof AnonymousClass21a)) {
                i = ((AnonymousClass21a) anonymousClass21r.mo3155C()).f25317B;
            }
            this.f30563B.f30568C.mo3346A(this.f30564C, 2, i);
        }
        this.f30565D.m13949A(anonymousClass21r.mo3155C());
    }
}
