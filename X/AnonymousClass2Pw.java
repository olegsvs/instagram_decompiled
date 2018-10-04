package X;

/* renamed from: X.2Pw */
public final class AnonymousClass2Pw extends AnonymousClass1sN {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2Px f30242B;

    public AnonymousClass2Pw(AnonymousClass2Px anonymousClass2Px) {
        this.f30242B = anonymousClass2Px;
    }

    /* renamed from: A */
    public final void mo2955A(long j) {
        if (this.f30242B.f30248G) {
            this.f30242B.f30244C.m13533B(this.f30242B.f30250I);
            this.f30242B.f30245D = null;
            this.f30242B.f30248G = false;
            return;
        }
        if (this.f30242B.f30245D != null) {
            Object obj;
            Object obj2 = (!this.f30242B.f30243B || this.f30242B.f30246E) ? null : 1;
            if (this.f30242B.f30249H != null) {
                if (this.f30242B.f30247F > j) {
                    obj = null;
                    if (obj2 == null || r0 == null) {
                        this.f30242B.f30244C.m13532A(this.f30242B.f30250I);
                    } else {
                        if (this.f30242B.f30249H != null) {
                            AnonymousClass2Px anonymousClass2Px = this.f30242B;
                            anonymousClass2Px.f30247F = anonymousClass2Px.f30249H.longValue() * ((j / this.f30242B.f30249H.longValue()) + 1);
                        }
                        this.f30242B.f30246E = false;
                        this.f30242B.f30245D.m15634D(this.f30242B, true);
                    }
                }
            }
            obj = 1;
            if (obj2 == null) {
            }
            this.f30242B.f30244C.m13532A(this.f30242B.f30250I);
        }
    }
}
